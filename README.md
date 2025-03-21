## Joana Taint Analysis

A small benchmark for testin the Joana capabilities for taint analysis.

### Setup

In the very first moment, execute the `./setup.sh` script to download the Joana 
library and configure it as a local maven dependency. 

## TEST

Run an specific test: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.SpecificTest"`

### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.StrongUpdateTestSuite"`
   
<!-- ### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.StrongUpdateTestSuite"` -->


###### failed: 27, passed: 76, ignored: 0 of 103 test (73.78%)

|     Test      |   TP    | FP  | 
|:-------------:|:-------:|:---:|
|   Aliasing    |  6/12   |  0  |   
|     Array     |   9/9   |  4  |   
|     Basic     |  58/60  |  1  |  
|  Collection   |  14/14  |  0  | 
| DataStructure |   5/5   |  1  |  
|    Factory    |   3/3   |  1  |  
|     Inter     |  14/16  |  0  |  
|    Session    |   3/3   |  0  |  
| StrongUpdate  |   0/0   |  2  |   
|   **TOTAL**   | 117/121 |  9  |   

- **Precision:** 0.93
- **Recall:** 0.97
- **F-score:** 0.95

#### Detailed information

<!-- - **AliasingTest** - failed: 2, passed: 4, ignored: 0 of 6 test 
   - *Fails :*
      - [4] 
      - [6] *related to issue(i)*
   - *Violations :* `6/12`
   - *Precision :* `100%` 
   - *Recall :* `36%`
   - *fScore :* `53%` -->

<!-- TO-DO: The amount of expected differs a bit from the computation in JSVFA project -->
- **AliasingTest** - failed: 0, passed: 4, ignored: 2 of 6 tests. `(66.67%)`


|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score | Comments|
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|:-------:|
|   Aliasing1    |    1     |   1    |   ✅   |  1  |  0  |     -     |   -    |    -    |    -    |
|   Aliasing2    |    0     |   0    |   ✅   |  0  |  0  |     -     |   -    |    -    |    -    |
|   Aliasing3    |    0     |   0    |   ✅   |  0  |  0  |     -     |   -    |    -    |    -    |
|   Aliasing4    |    2     |   1    |   ❌   |  1  |  0  |     -     |   -    |    -    |    *related to issue(i)*    |
|   Aliasing5    |    1     |   1    |   ✅   |  1  |  0  |     -     |   -    |    -    |    -    |
|   Aliasing6    |    7     |   1    |   ❌   |  1  |  0  |     -     |   -    |    -    |    *related to issue(i)*    |
|     TOTAL      |    11    |   4    |  4/6   |  4  |  0  |           |        |         |         |

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
   - *Fails :*
      - [5] *related to issue(ii)*
   - *Violations :* `10/9`
   - *Precision :* `90%` 
   - *Recall :* `100%`
   - *fScore :* `95%`

- **BasicTest** - failed: 17, passed: 25, ignored: 0 of 42 test `(59.52%)`
   - *Fails :*
      - [5]  *related to issue(i)*
      - [11] *related to issue(i)*
      - [12] *related to issue(i)*
      - [13] Expecting 1 but found 0 vulnerabilities.
      - [14] Expecting 1 but found 0 vulnerabilities.
      <!-- - [16] --it is throwing an error while is analyzed -->
      - [19] --method java.sql.Connection.prepareStatement is not recognized as a sink
      - [20] --method java.sql.Statement.execute is not recognized as a sink
      - [21] --method java.sql.Statement.executeUpdate is not recognized as a sink
      - [23] *related to issue(i)*
      - [28] *related to issue(i)*
      - [29] *related to issue(i)*
      - [31] *related to issue(i)*
      - [33] Expecting 1 but found 0 vulnerabilities.
      - [35] *related to issue(iii)*
      - [40] *flaky*
      - [42] *related to issue(iii)*
   - *Violations :* `45/61`
   - *Precision :* `81%` 
   - *Recall :* `54%`
   - *fScore :* `65%`
  
- **CollectionTest** - failed: 0, passed: 14, ignored: 0 of 14 test `(100%)`
   - *Violations :* `15/15`

- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 test `(100%)`
   - *Violations :* `6/6`

- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`
   - *Violations :* `3/3`

- **InterTest** - failed: 3, passed: 11, ignored: 0 of 14 test `(85.71%)`
   - *Fails :*
      - [2] *related to issue(i)*
      - [6]
      - [9] *related to issue(i)*
   - *Violations :* `13/16`
   - *Precision :* `100%` 
   - *Recall :* `79%`
   - *fScore :* `88%`

- **SessionTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`
   - *Violations :* `3/3`

- **StrongUpdateTest** - failed: 4, passed: 1, ignored: 0 of 5 test `(20%)`
   - *Fails :*
      - [1] *related to issue(ii)*
      - [2] *related to issue(ii)*
      - [3] *related to issue(ii)*
      - [5] *related to issue(ii)*
   - *Violations :* `5/1`
   - *Precision :* `20%` 
   - *Recall :* `100%`
   - *fScore :* `33%`

## ISSUES
- (i) When there are similar sink statements in a program, the solution recognize just the first one;
- (ii) The solution does not handle *Strong Update*;
- (iii) As sources/sinks are shared in a common file, the solution will look for all of them and not just the ones for the especific test.


java.lang.IllegalStateException: 
could not resolve 
< Application, Lsecuribench/v2/micro/aliasing/Aliasing3, 
doGet(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)V 
>
