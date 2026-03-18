package minimized;

/**
 * Test cases for SCIP WriteAccess and ReadAccess SymbolRole emission.
 *
 * Covers:
 * - Read-only field access
 * - Write-only assignment (LHS of =)
 * - Write+Read compound assignment (+=, -=)
 * - Write+Read prefix/postfix increment and decrement
 * - Read in method call argument
 */
public class AccessRoles {
  int field = 0;

  public int readOnly() {
    return field; // read_access
  }

  public void writeOnly(int value) {
    field = value; // write_access only
  }

  public void compoundAssignment(int value) {
    field += value; // write_access read_access (compound)
    field -= value; // write_access read_access (compound)
  }

  public void prefixIncrement() {
    ++field; // write_access read_access
  }

  public void postfixIncrement() {
    field++; // write_access read_access
  }

  public void prefixDecrement() {
    --field; // write_access read_access
  }

  public void postfixDecrement() {
    field--; // write_access read_access
  }

  public int readInExpression() {
    return field + 1; // read_access
  }
}
