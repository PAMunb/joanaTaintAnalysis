## Joana Taint Analysis

A small benchmark for testin the Joana capabilities for taint analysis.

### Setup

- In the project's root folder, execute the  script to download the Joana library and configure it as a local maven dependency.

```
./setup.sh
```

- Clone submodule that contents the test suite for `securibench`.

```
git submodule add https://github.com/PAMunb/securibench-micro.git src/test/java/securibench
```

<!-- Update submodule `git submodule update --remote` -->

## TEST

Run an specific test: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.SpecificTest"`

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
   

###### failed: 24, passed: 79, ignored: 0 of 103 test (76.70%)

- **AliasingTest** - failed: 2, passed: 4, ignored: 0 of 6 test `(66.67%)`
   - *Fails :*
      - [4] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [6] *related to issue(i)* <!-- Expecting 7 but found 1 vulnerabilities. -->
   - *Violations :* `6/12`
   - *Precision :* `100%` 
   - *Recall :* `36%`
   - *fScore :* `53%`

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
   - *Fails :*
      - [5] *related to issue(ii)* <!-- Expecting 0 but found 1 vulnerabilities. -->
   - *Violations :* `10/9`
   - *Precision :* `90%` 
   - *Recall :* `100%`
   - *fScore :* `95%`

- **BasicTest** - failed: 14, passed: 28, ignored: 0 of 42 test `(66.67%)`
   - *Fails :*
      - [5]  *related to issue(i)* <!-- Expecting 3 but found 1 vulnerabilities. -->
      - [11] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [12] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [16] --it is throwing an error while is analyzed <!--  -->
      - [19] --method java.sql.Connection.prepareStatement is not recognized as a sink <!-- Expecting 1 but found 0 vulnerabilities. -->
      - [20] --method java.sql.Statement.execute is not recognized as a sink <!-- Expecting 1 but found 0 vulnerabilities. -->
      - [21] --method java.sql.Statement.executeUpdate is not recognized as a sink <!-- Expecting 4 but found 0 vulnerabilities. -->
      - [23] *related to issue(i)* <!-- Expecting 3 but found 2 vulnerabilities. -->
      - [28] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [29] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [31] *related to issue(i)* <!-- Expecting 3 but found 1 vulnerabilities. -->
      - [35] *related to issue(iii)* <!-- Expecting 6 but found 12 vulnerabilities. -->
      - [40] *flaky* <!--  Expecting 1 but found 0 vulnerabilities. -->
      - [42] *related to issue(iii)* <!-- Expecting 1 but found 2 vulnerabilities. -->
   - *Violations :* `52/61`
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
      - [2] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
      - [6] <!-- Expecting 1 but found 0 vulnerabilities. -->
      - [9] *related to issue(i)* <!-- Expecting 2 but found 1 vulnerabilities. -->
   - *Violations :* `13/15`
   - *Precision :* `100%` 
   - *Recall :* `79%`
   - *fScore :* `88%`

- **SessionTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`
   - *Violations :* `3/3`

- **StrongUpdateTest** - failed: 4, passed: 1, ignored: 0 of 5 test `(20%)`
   - *Fails :*
      - [1] *related to issue(ii)* <!-- Expecting 0 but found 1 vulnerabilities. -->
      - [2] *related to issue(ii)* <!-- Expecting 0 but found 1 vulnerabilities. -->
      - [3] *related to issue(ii)* <!-- Expecting 0 but found 1 vulnerabilities. -->
      - [5] *related to issue(ii)* <!-- Expecting 0 but found 1 vulnerabilities. -->
   - *Violations :* `5/1`
   - *Precision :* `20%` 
   - *Recall :* `100%`
   - *fScore :* `33%`

## ISSUES
- (i) When there are similar sink statements in a program, the solution recognize just the first one;
- (ii) The solution does not handle *Strong Update*;
- (iii) As sources/sinks are shared in a common file, the solution will look for all of them and not just the ones for the especific test.
