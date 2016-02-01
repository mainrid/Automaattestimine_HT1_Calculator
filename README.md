# Automaattestimine_HT1_Calculator

Harjutustund 1. 

Ülesanne 1.

Teha läbi loengus tehtud StringCalculator-i näide. Lahendus on kodulehel üleval
(esimese loengu materjalide juures) aga vaadake seda pigem ainult siis, kui ise 
kuidagi edasi minna ei oska.

Kirjuatada klass StringCalculator kirjutades testid enne koodi. StringCalculator-il
on meetod add(), mis võtab sisse komaga eraldatud numbrite jada ja tagastab 
nende numbrite summa.

Oodatud tulemus (sisend -> väljund):

"" -> 0
"1" -> 1
"1, 2" -> 3
null -> IllegalArgumentException

Ülesanne 2.

Kirjuatada klass RpnCalculator (Rpn - pööratud Poola notatsioon), kirjutades testid enne koodi.

Graafiline näidis: http://www.alcula.com/calculators/rpn/

RpnCalculator-il on meetodid: 
  int getAccumulator() - tagastab akumulaatoris oleva väärtuse
  void setAccumulator(int number) - seab akumulaatori väärtuse
  void enter() - paneb akumulaatori pinusse
  void plus() - eemaldab pinust pealmise elemendi, liidab sellele akumulaatori
    ja paneb tulemuse akumulaatorisse
  void multiply() - eemaldab pinust pealmise elemendi, korrutab sellele 
    akumulaatoriga ja paneb tulemuse akumulaatorisse
  int evaluate(String expression) - võttab sisse avaldise stringi kujul
    ja tagastab selle väärtuse
    
Sisemise andmestruktuurina kasutada java.util.Stack-i.

Vajalikud on vähemalt järgmised testid:

- loo kalkulaator ja vaata et akumulaator on 0
- kontrolli, et on võimalik akumulaatorit seada
- kontrolli, et kalkulaator arvutab õigesti 1 + 2 = 3 (rpn kuju 1 2 +)
- kontrolli, et kalkulaator arvutab õigesti (1 + 2) * 4 = 12 (rpn kuju 1 2 + 4 *)
- kontrolli, et kalkulaator arvutab õigesti (4 + 3) * (2 + 1) = 21 (rpn kuju 4 3 + 2 1 + *)
- kontrolli, et kalkulaator (evaluate meetod) arvutab õigesti  5 1 2 + 4 * + 3 +  -> 20

Näidistest:

    @Test
    public void calculatorSupportsAddition() {
        RpnCalculator c = new RpnCalculator();
        c.setAccumulator(1);
        c.enter();
        c.setAccumulator(2);
        c.plus();
        assertThat(c.getAccumulator(), is(3));
    }

Näide sarnase ülesande lahendamisest: https://vimeo.com/10569751
