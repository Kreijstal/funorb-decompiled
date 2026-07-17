/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends go implements ki {
    static String field_T;
    static String field_J;
    static String field_Y;
    static qb field_W;
    static String field_S;
    static int[][] field_Z;
    private gk field_V;
    private int field_U;
    static qr field_X;

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((fa) this).field_U = pd.field_k - (((fa) this).field_m + param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fa.PA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    fa(String param0, ko param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (((fa) this).field_k) {
          if (((fa) this).field_v != null) {
            L0: {
              stackOut_4_0 = bb.field_b;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param0) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            ur.a(stackIn_7_0, stackIn_7_1 != 0, ((fa) this).field_x - ((fa) this).field_U + pd.field_k);
            if (!param0) {
              return null;
            } else {
              return ((fa) this).field_v;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void i(int param0) {
        super.i(param0);
        if (((fa) this).field_V != null) {
            ((fa) this).field_V.b(-72);
        }
    }

    final void a(gk param0, int param1) {
        try {
            if (param1 != 8945) {
                field_T = null;
            }
            ((fa) this).field_V = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fa.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final gk a(byte param0) {
        if (param0 <= 58) {
            gk discarded$0 = ((fa) this).a((byte) -52);
            return ((fa) this).field_V;
        }
        return ((fa) this).field_V;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          fl.field_f = param0;
          if (pg.field_J == ed.field_f) {
            break L0;
          } else {
            var2 = ed.field_f * ed.field_f;
            var3 = -(pg.field_J * pg.field_J) + var2;
            param0 = param0 + (-param0 + pc.field_m) * var3 / var2;
            break L0;
          }
        }
        tg.field_c.a(640, 120, (byte) 66, param0, tm.field_h);
        if (param1 > -35) {
          fa.a(-2, (byte) -122);
          qc.a(pc.field_m + -24, 0, tg.field_a, 3, 640, 5, qo.field_b);
          return;
        } else {
          qc.a(pc.field_m + -24, 0, tg.field_a, 3, 640, 5, qo.field_b);
          return;
        }
    }

    public static void l() {
        field_T = null;
        field_W = null;
        field_Y = null;
        field_X = null;
        field_Z = null;
        field_S = null;
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = "<%0> has entered another game.";
        field_T = "Average rating";
        field_S = "<%0> points, 1 point per turn.";
        field_J = "Waiting for graphics";
    }
}
