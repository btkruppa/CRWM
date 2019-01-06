package com.rev.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.rev.beans.Credentials;
import com.rev.beans.Disease;
import com.rev.beans.LeaderBoard;
import com.rev.beans.Patients;
import com.rev.beans.Player;
import com.rev.beans.Symptom;
import com.rev.dao.DiseaseDao;
import com.rev.dao.LeaderBoardDao;
import com.rev.dao.PatientsDao;
import com.rev.dao.PlayerDao;
import com.rev.dao.SymptomDao;
import com.rev.daoimpl.DiseaseDaoImpl;
import com.rev.daoimpl.LeaderBoardDaoImpl;
import com.rev.daoimpl.PatientsDaoImpl;
import com.rev.daoimpl.PlayerDaoImpl;
import com.rev.daoimpl.SymptomDaoImpl;
import com.rev.service.AuthenticationService;
public class MedicalRPGTest {
    private static final PlayerDao playerDao = new PlayerDaoImpl();
    private static final SymptomDao symptomDao = new SymptomDaoImpl();
    private static final DiseaseDao diseaseDao = new DiseaseDaoImpl();
    private static final PatientsDao patientsDao = new PatientsDaoImpl();
    private static final LeaderBoardDao leaderboardDao = new LeaderBoardDaoImpl();
    private static final AuthenticationService auth = new AuthenticationService();
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testGetAllPlayers() {
        List<Player> pList = new ArrayList<>();
        pList = playerDao.getallPlayers();
        assertEquals(10240, pList.get(4).getId());
    }
    @Test
    public void testGetAllPlayerByRealId() {
        Player testPlayer = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertTrue(testPlayer.equals(playerDao.getPlayerByID(10250)));
    }
    @Test
    public void testGetAllPlayerByUnknownId() {
        Player testPlayer = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertFalse(testPlayer.equals(playerDao.getPlayerByID(10)));
    }
    @Test
    public void testIsValidUserReal() {
        AuthenticationService auth = new AuthenticationService();
        Credentials cred = new Credentials("hdurrell0@indigo.com","yTXA0LXDON");
        Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertEquals(p,auth.isValidUser(cred));
    }
    @Test
    public void testIsValidUserIncorrectEmail() {
        Credentials cred = new Credentials("h@indigo.com","yTXA0LXDON");
        Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertFalse(p.equals(auth.isValidUser(cred)));
    }
    @Test
    public void testIsValidUserIncorrectPassword() {
        Credentials cred = new Credentials("hdurrell0@indigo.com","y");
        Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertFalse(p.equals(auth.isValidUser(cred)));
    }
    @Test
    public void testIsValidUserNullCredentials() {
        Credentials cred = new Credentials(null,null);
        Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
        assertFalse(p.equals(auth.isValidUser(cred)));
    }
    
    /*public Symptom getSymptombyID(int id);
    public List<Symptom> getallSymptom();
    public void updateSymptom(Symptom symptom);
    public void addSymptom(Symptom symptom);
    public void deleteSymptom(Symptom symptom);*/
    @Test
    public void testgetSymptomByIdRealId() {
        Symptom thisSymptom = new Symptom(1, "Frequent Urination","Patient is urinating very often","yes","no",null);
        assertTrue(thisSymptom.equals(symptomDao.getSymptomByID(1)));
    }
    @Test
    public void testGetAllSymptoms() {
        List<Symptom> sList = new ArrayList<>();
        sList = symptomDao.getAllSymptoms();
        assertEquals(18, sList.get(17).getSymptom_ID());
    }
    @Test
    public void testGetSymptomByIdUnknownId() {
        Symptom testSymptom = new Symptom(1, "Frequent Urination","Patient is urinating very often","yes","no",null);
        assertFalse(testSymptom.equals(symptomDao.getSymptomByID(1000)));
    }
    @Test
    public void testgetDiseaseByIdRealId() {
        Disease thisDisease = new Disease(1, "Diabetes", "A blood disease that restricts the breakdown of glucose");
        assertTrue(thisDisease.equals(diseaseDao.getDiseasebyID(1)));
    }
    @Test
    public void testGetAllDiseases() {
        List<Disease> dList = new ArrayList<>();
        dList = diseaseDao.getAllDiseases();
        Disease testDisease = new Disease(4,"Leukemia", "Cancer of the blood-forming tissue in the body");
        assertTrue(testDisease.equals(dList.get(3)));
    }
    @Test
    public void testGetDiseaseByIdUnknownId() {
        Disease testDisease = new Disease();
        assertTrue(testDisease.equals(diseaseDao.getDiseasebyID(1000)));
    }
//    1   Hannah  Smith   46  1
    @Test
    public void testgetPatientByIdRealId() {
        Patients thisPatient = new Patients(1, "Hannah","Smith",46,1);
        assertTrue(thisPatient.equals(patientsDao.getPatientsByID(1)));
    }
    @Test
    public void testGetAllPatients() {
        List<Patients> pList = new ArrayList<>();
        pList = patientsDao.getAllPatients();
        Patients testPatient = new Patients(3,"Alex",   "Sanchez",82,3);
        assertTrue(testPatient.equals(pList.get(2)));
    }
    @Test
    public void testGetPatientByIdUnknownId() {
        Patients testPatient = new Patients();
        assertTrue(testPatient.equals(patientsDao.getPatientsByID(1000)));
    }
    @Test
    public void testgetLeaderboardByIdRealId() {
        LeaderBoard thisLeaderboard = new LeaderBoard();
        assertTrue(thisLeaderboard.equals(leaderboardDao.getLeaderBoardbyID(5)));
    }
    @Test
    public void testGetAllLeaderBoards() {
        List<LeaderBoard> lList = new ArrayList<>();
        lList = leaderboardDao.getAllLeaderBoards();
        LeaderBoard testLeaderboard = new LeaderBoard();
        assertTrue(testLeaderboard.equals(lList.get(4)));
    }
    @Test
    public void testGetLeaderBoardByIdUnknownId() {
        LeaderBoard testLeaderboard = new LeaderBoard();
        assertTrue(testLeaderboard.equals(leaderboardDao.getLeaderBoardbyID(1000)));
    }
}