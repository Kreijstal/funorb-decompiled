/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String rule20;
    static int field_e;
    static int field_f;
    static Sprite field_d;
    static boolean field_c;
    static vh field_a;
    static boolean field_b;
    private Sprite[] field_h;

    final static void a(byte param0) {
        if (param0 != 41) {
          return;
        }
        qa.a(true, re.field_d, -104, eo.field_Rb);
        PolarBallSkin.field_q = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        nj.a(this.field_h, (byte) -72, param0, param3, param1, param4);
        if (param2 != -6316) {
          nm.a((byte) -25);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          nm.a(true);
          field_a = null;
          rule20 = null;
          field_d = null;
          return;
        }
        field_a = null;
        rule20 = null;
        field_d = null;
    }

    nm(Sprite[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rule20 = "Asking for or providing contact information";
    }
}
