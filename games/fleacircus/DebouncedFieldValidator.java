/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    static String field_a;
    static fh field_b;
    static int field_f;
    static int field_g;
    static boolean[] field_i;
    static MidiPcmStream field_h;
    private long field_c;
    static PlatformTask field_e;
    static String field_d;

    public final wd getValidationStatus(boolean param0) {
        if (param0) {
          field_h = (MidiPcmStream) null;
          if (this.hasMissingInput(true)) {
            return uk.field_b;
          }
          if (!((350L + this.field_c) <= lj.correctedCurrentTimeMillis((byte) -31))) {
            return ea.field_b;
          }
          return this.evaluateValidationStatus((byte) -8);
        }
        if (this.hasMissingInput(true)) {
          return uk.field_b;
        }
        if (!((350L + this.field_c) <= lj.correctedCurrentTimeMillis((byte) -31))) {
          return ea.field_b;
        }
        return this.evaluateValidationStatus((byte) -8);
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
        field_i = null;
        if (param0 < 123) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    abstract wd evaluateValidationStatus(byte param0);

    public final String getValidationMessage(int param0) {
        if (this.hasMissingInput(true)) {
          return null;
        }
        int var2 = 93 % ((param0 - 54) / 33);
        if (this.field_c + 350L <= lj.correctedCurrentTimeMillis((byte) -23)) {
          return this.evaluateValidationMessage((byte) 95);
        }
        return null;
    }

    public final void recordInputChange(int param0) {
        this.field_c = lj.correctedCurrentTimeMillis((byte) -116);
        if (param0 != -1283) {
          field_f = 78;
        }
    }

    abstract String evaluateValidationMessage(byte param0);

    static {
        field_a = "Player";
        field_g = 200;
        field_f = -1;
        field_b = new fh(13, 0, 1, 0);
        field_d = "<%0>Blue Switches:<%1> Removes yellow barrier tiles from the level.";
    }
}
