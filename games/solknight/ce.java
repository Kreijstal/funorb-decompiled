/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    private boolean field_d;
    private String field_e;
    static String field_a;
    static java.awt.Font field_f;
    private boolean field_g;
    static PcmStreamMixer field_c;
    static boolean field_b;

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_d;
    }

    public static void clearStaticReferences(boolean param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (!param0) {
          ce.clearStaticReferences(true);
        }
    }

    final boolean a(int param0) {
        if (param0 != -15004) {
          this.field_e = (String) null;
          return this.field_g;
        }
        return this.field_g;
    }

    final String b(int param0) {
        if (param0 != 28903) {
          return (String) null;
        }
        return this.field_e;
    }

    ce(String param0) {
        this.field_g = false;
        this.field_d = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "ce.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_d = true;
        this.field_g = param0 ? true : false;
        if (param1 != -75) {
          ce.clearStaticReferences(true);
        }
    }

    static {
        field_a = "Unfortunately you are not eligible to create an account.";
        field_b = false;
    }
}
