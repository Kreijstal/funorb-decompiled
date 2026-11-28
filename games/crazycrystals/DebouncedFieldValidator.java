/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    static String field_e;
    static BufferedRandomAccessFile[] field_d;
    static int field_c;
    private long field_b;
    static nj field_a;

    public final String getValidationMessage(int param0) {
        if (this.hasMissingInput((byte) -41)) {
          return null;
        }
        if (lo.correctedCurrentTimeMillis((byte) -72) < (350L + this.field_b)) {
          return null;
        }
        if (param0 == -16774) {
          return this.evaluateValidationMessage(false);
        }
        this.recordInputChange((byte) -60);
        return this.evaluateValidationMessage(false);
    }

    public final oi getValidationStatus(byte param0) {
        if (param0 != 45) {
          return (oi) null;
        }
        if (this.hasMissingInput((byte) -41)) {
          return pe.field_p;
        }
        if ((this.field_b + 350L) <= lo.correctedCurrentTimeMillis((byte) 84)) {
          return this.evaluateValidationStatus(51);
        }
        return ta.field_h;
    }

    public final void recordInputChange(byte param0) {
        this.field_b = lo.correctedCurrentTimeMillis((byte) 76);
        if (param0 != 78) {
          field_e = (String) null;
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 350) {
          field_e = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract oi evaluateValidationStatus(int param0);

    abstract String evaluateValidationMessage(boolean param0);

    static {
        field_e = "Two-Player Puzzles";
        field_c = 9;
    }
}
