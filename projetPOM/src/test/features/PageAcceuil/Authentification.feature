
@tag
Feature: Page Authentification Orange Hrm

  @tag1
  Scenario: AUTHENTIFICATION VALIDE PAGE ORANGE HRM
  Given saisir l url de la page orange "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  When saisir le login de la page orange "Admin"
  And saisir le mot de passe de la page orange "admin123"
  And cliquer sur le bouton login dans la page orange
  Then verifier le nom du profil affiche "Paul Collings"
 
