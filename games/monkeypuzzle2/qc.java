/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends rj implements ag {
    private int field_Q;
    static int field_N;
    static String[] field_R;
    static le[] field_L;
    private kf field_M;
    static int[] field_P;
    static String field_O;

    final void a(kf param0, boolean param1) {
        try {
            if (!param1) {
                Object var4 = null;
                ((qc) this).a((we) null, 53, 72, (byte) 12);
            }
            ((qc) this).field_M = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "qc.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(me param0, byte param1, int param2) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            if (param1 <= 100) {
                Object var4 = null;
                qc.a((me) null, (byte) 35, -2);
            }
            var3.b(true, param2);
            var3.b(param0.field_k, -49152);
            var3.c(param0.field_m, 71);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "qc.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final String a(byte param0) {
        if (((qc) this).field_g) {
          if (((qc) this).field_m != null) {
            if (param0 != 54) {
              ((qc) this).m(90);
              int discarded$4 = 94;
              oh.a(p.field_a, ei.field_a + ((qc) this).field_l - ((qc) this).field_Q);
              return ((qc) this).field_m;
            } else {
              int discarded$5 = 94;
              oh.a(p.field_a, ei.field_a + ((qc) this).field_l - ((qc) this).field_Q);
              return ((qc) this).field_m;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void q() {
        field_L = null;
        field_O = null;
        field_R = null;
        field_P = null;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
            super.a(param0, param1, param2, (byte) -24);
            if (param3 > -13) {
                Object var6 = null;
                ((qc) this).a((kf) null, false);
            }
            ((qc) this).field_Q = -param2 + (ei.field_a + -((qc) this).field_r);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "qc.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final kf a(int param0) {
        int var2 = -110 % ((-50 - param0) / 55);
        return ((qc) this).field_M;
    }

    final void m(int param0) {
        super.m(param0 ^ param0);
        if (null != ((qc) this).field_M) {
            ((qc) this).field_M.a((byte) -94);
        }
    }

    qc(String param0, of param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_N = 0;
        field_O = "No highscores";
    }
}
