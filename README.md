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
   * All test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.AllTestSuite"`
   
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


###### failed: 31, passed: 72, ignored: 0 of 103 test (69.90%)

|     Test      |   TP    | FP  | FN  | 
|:-------------:|:-------:|:---:|:---:|
|   Aliasing    |   0/0   |  0  |  0  |   
|     Array     |   0/0   |  0  |  0  |   
|     Basic     |   0/0   |  0  |  0  |  
|  Collection   |   0/0   |  0  |  0  | 
| DataStructure |   0/0   |  0  |  0  |  
|    Factory    |   0/0   |  0  |  0  |  
|     Inter     |   0/0   |  0  |  0  |  
|    Session    |   0/0   |  0  |  0  |  
| StrongUpdate  |   0/0   |  0  |  0  |   
|   **TOTAL**   |   0/0   |  0  |  0  |   

- **Violations:** 123/138
- **Precision:** 0.82
- **Recall:** 0.72
- **F-score:** 0.76


#### Detailed information

- **AliasingTest** - failed: 0, passed: 2, ignored: 4 of 6 tests. `(66.67%)`


|      Test      | Expected | Actual | Status | TP  | FP  | FN  | Precision | Recall | F-score | Comments|
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---:|:---------:|:------:|:-------:|:-------:|
|   Aliasing1    |    1     |   1    |   ✅   |  1  |  0  |  0  |-          |   -    |    -    |    -    |
|   Aliasing2    |    0     |   1    |   ❌   |  0  |  1  |  0  |-          |   -    |    -    |    -    |
|   Aliasing3    |    0     |   1    |   ❌   |  0  |  1  |  0  |-          |   -    |    -    |    -    |
|   Aliasing4    |    2     |   1    |   ❌   |  0  |  0  |  1  |-          |   -    |    -    |    -    |
|   Aliasing5    |    1     |   1    |   ✅   |  1  |  0  |  0  |-          |   -    |    -    |    -    |
|   Aliasing6    |    7     |   1    |   ❌   |  0  |  0  |  6  |-          |   -    |    -    |    -    |
|     TOTAL      |    11    |   6    |  2/6   |  2  |  2  |  7  |           |        |         |    -    |

- *Violations :* `6/11`
- *Precision :* `0%` 
- *Recall :* `0%`
- *fScore :* `0%`

- **ArraysTest** - failed: 0, passed: 0, ignored: 0 of 10 test `(0%)`

- **BasicTest** - failed: 0, passed: 0, ignored: 0 of  test `(59.52%)`

- **CollectionTest** - failed: 0, passed: 0, ignored: 0 of 14 test `(100%)`

- **DataStructureTest** - failed: 0, passed: 0, ignored: 0 of 6 test `(100%)`

- **FactoryTest** - failed: 0, passed: 0, ignored: 0 of  3 test `(100%)`

- **InterTest** - failed: 0, passed: 0, ignored: 0 of  14 test `(85.71%)`

- **SessionTest** - failed: 0, passed: 0, ignored: 0 of 3 test `(0%)`

- **StrongUpdateTest** - failed: 0, passed: 0, ignored: 0 of 5 test `(0%)`