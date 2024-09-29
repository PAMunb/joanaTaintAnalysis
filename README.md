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

###### failed: 23, passed: 81, ignored: 0 of 104 test (77.88%)

- **AliasingTest** - failed: 2, passed: 4, ignored: 0 of 6 test `(66.67%)`
   - *Fails :*
      - [4] *related to issue(i)*
      - [6] *related to issue(i)*
   - *Violations :* `6/12`
   - *Precision :* `100%` 
   - *Recall :* `36%`
   - *fScore :* `53%`

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
   - *Fails :*
      - [5] *related to issue(ii)*
   - *Violations :* `10/9`
   - *Precision :* `90%` 
   - *Recall :* `100%`
   - *fScore :* `95%`

- **BasicTest** - failed: 13, passed: 30, ignored: 0 of 43 test `(69.77%)`
   - *Fails :*
      - [5]  *related to issue(i)*
      - [11] *related to issue(i)*
      - [12] *related to issue(i)*
      - [16] --it is throwing an error while is analyzed
      - [19] --method java.sql.Connection.prepareStatement is not recognized as a sink
      - [20] --method java.sql.Statement.execute is not recognized as a sink
      - [21] --method java.sql.Statement.executeUpdate is not recognized as a sink
      - [23] *related to issue(i)*
      - [28] *related to issue(i)*
      - [29] *related to issue(i)*
      - [31] *related to issue(i)*
      - [35] *related to issue(iii)*
      - [42] *related to issue(iii)*
   - *Violations :* `50/60`
   - *Precision :* `81%` 
   - *Recall :* `65%`
   - *fScore :* `72%`
  
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
   - *Violations :* `13/15`
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
(i) When there are similar sink statements in a program, the solution recognize just the first one;
(ii) The solution does not handle *Strong Update*;
(iii) As sources/sinks are shared in a common file, the solution will look for all of them and not just the ones for the especific test.
