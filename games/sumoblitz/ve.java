/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve extends ms {
    private boolean field_n;
    static String field_l;
    fr field_m;
    static ri field_k;

    final boolean a(int param0) {
        if (param0 < 106) {
            ((ve) this).field_m = null;
            return ((ve) this).field_n;
        }
        return ((ve) this).field_n;
    }

    final static wg a(byte param0, on param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != null) {
          var4 = jaggl.OpenGL.glGenProgramARB();
          var5 = 50 / ((param0 - -9) / 58);
          jaggl.OpenGL.glBindProgramARB(param3, var4);
          jaggl.OpenGL.glProgramRawARB(param3, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, jg.field_e, 0);
          if (0 != (jg.field_e[0] ^ -1)) {
            jaggl.OpenGL.glBindProgramARB(param3, 0);
            return null;
          } else {
            jaggl.OpenGL.glBindProgramARB(param3, 0);
            return new wg(param1, param3, var4);
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = 106 / ((param0 - 71) / 40);
        field_l = null;
    }

    abstract void c(int param0);

    final static ki a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 != 11880) {
          ki discarded$2 = ve.a(87, true, -113, -52, false);
          return ng.a(param3, param0 ^ -11778, param1, param2, param4, false);
        } else {
          return ng.a(param3, param0 ^ -11778, param1, param2, param4, false);
        }
    }

    ve(fr param0) {
        ((ve) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Waiting for music";
    }
}
