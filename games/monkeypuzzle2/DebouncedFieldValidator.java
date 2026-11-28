/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    private long field_e;
    static FullscreenNoticeType field_g;
    static ResourceArchive field_a;
    static Sprite field_d;
    static int[] field_c;
    static String field_b;
    static hj field_f;

    public final na getValidationStatus(boolean param0) {
        if (this.hasMissingInput(true)) {
          return uc.field_e;
        }
        if (pf.correctedCurrentTimeMillis(0) < 350L + this.field_e) {
          return ke.field_d;
        }
        if (!param0) {
          return this.evaluateValidationStatus(1);
        }
        return (na) null;
    }

    final static String b(int param0) {
        String var1 = "";
        if (null != j.field_e) {
          var1 = j.field_e.a(32);
        }
        if (0 == var1.length()) {
          var1 = ByteStorage.c(10367);
        }
        if (param0 == var1.length()) {
          var1 = ProxyAuthenticationRequiredException.field_c;
        }
        return var1;
    }

    public static void clearStaticReferences(int param0) {
        field_c = null;
        if (param0 > -113) {
          return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_g = null;
    }

    abstract na evaluateValidationStatus(int param0);

    public final String getValidationMessage(byte param0) {
        int var2 = -15 / ((param0 - 20) / 44);
        if (this.hasMissingInput(true)) {
          return null;
        }
        if (pf.correctedCurrentTimeMillis(0) >= (350L + this.field_e)) {
          return this.evaluateValidationMessage((byte) -58);
        }
        return null;
    }

    public final void recordInputChange(byte param0) {
        this.field_e = pf.correctedCurrentTimeMillis(0);
        if (param0 > -87) {
          DebouncedFieldValidator.clearStaticReferences(-14);
        }
    }

    abstract String evaluateValidationMessage(byte param0);

    static {
        field_g = new FullscreenNoticeType();
        field_b = null;
    }
}
