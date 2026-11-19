/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidationResult {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static int field_h;
    static String field_f;
    static int field_g;
    static MusicTrack field_d;
    static RotatedSpriteAsset field_c;

    final boolean isValid(byte param0) {
        if (param0 != -34) {
          EmailValidationResult.clearSharedReferences(-70);
          return this.field_b;
        }
        return this.field_b;
    }

    final String getText(byte param0) {
        if (param0 != 66) {
          this.complete(true, 65);
          return this.field_a;
        }
        return this.field_a;
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 >= -19) {
          EmailValidationResult.clearSharedReferences(38);
        }
    }

    final boolean isComplete(int param0) {
        if (param0 != 250) {
          field_g = 99;
          return this.field_e;
        }
        return this.field_e;
    }

    EmailValidationResult(String param0) {
        this.field_b = false;
        this.field_e = false;
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void complete(boolean param0, int param1) {
        if (param1 < 74) {
          return;
        }
        this.field_b = param0 ? true : false;
        this.field_e = true;
    }

    static {
        field_f = "Password: ";
        field_h = 250;
    }
}
