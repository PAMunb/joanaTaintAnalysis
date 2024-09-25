## Joana Taint Analysis

A small benchmark for testin the Joana capabilities for taint analysis.

### Setup

In the very first moment, execute the `setup.sh` script to download the Joana 
library and configure it as a local maven dependency. 

### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.StrongUpdateTestSuite"`
   
## TEST

###### failed: 44, passed: 60, ignored: 0 of 104 test (57.69%)

- **AliasingTest** - failed: 2, passed: 4, ignored: 0 of 6 test `(66.67%)`
  - [4]
  - [6]

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
  - [5]

- **BasicTest** - failed: 26, passed: 17, ignored: 0 of 43 test `(39.53%)`
  - [5]
  - [11]
  - [12]
  - [13]
  - [14]
  - [16]
  - [19]
  - [20]
  - [21]
  - [22]
  - [23]
  - [24]
  - [25]
  - [26]
  - [28]
  - [29]
  - [31]
  - [32]
  - [33]
  - [34]
  - [35]
  - [36]
  - [39]
  - [40] ?
  - [41]
  - [42]
  
- **CollectionTest** - failed: 7, passed: 7, ignored: 0 of 14 test `(50%)`
  - [3]
  - [4]
  - [5]
  - [7]
  - [12]
  - [13]
  - [14]

- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 test `(100%)`

- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`

- **InterTest** - failed: 4, passed: 10, ignored: 0 of 14 test `(71.43%)`
  - [2]
  - [4]
  - [5]
  - [6]

- **SessionTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`

- **StrongUpdateTest** - failed: 4, passed: 1, ignored: 0 of 5 test `(20%)`
  - [1]
  - [2]
  - [3]
  - [5]
