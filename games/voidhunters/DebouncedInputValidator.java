/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedInputValidator implements InputValidator {
    static String field_b;
    private long lastChangedMillis;

    public final void markChanged(int param0) {
        this.lastChangedMillis = wt.a(false);
        if (param0 <= 6) {
          this.lastChangedMillis = -33L;
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 < 36) {
          DebouncedInputValidator.clearSharedReferences(-26);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final ValidationState getValidationState(byte param0) {
        if (this.isEmpty((byte) -120)) {
          return SetTorpedoFireForce.emptyInput;
        }
        if (!(350L + this.lastChangedMillis <= wt.a(false))) {
          return SetShieldsDirectionalArcParticleSpeedDownshift.debouncingInput;
        }
        if (param0 == 35) {
          return this.validateCurrentValue(-1);
        }
        field_b = (String) null;
        return this.validateCurrentValue(-1);
    }

    abstract String getCurrentValidationMessage(int param0);

    abstract ValidationState validateCurrentValue(int param0);

    public final String getValidationMessage(byte param0) {
        if (param0 != -79) {
          return (String) null;
        }
        if (this.isEmpty((byte) -115)) {
          return null;
        }
        if (wt.a(false) >= (this.lastChangedMillis + 350L)) {
          return this.getCurrentValidationMessage(16384);
        }
        return null;
    }

    static {
        field_b = "Players";
    }
}
