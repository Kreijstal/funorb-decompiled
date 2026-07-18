/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends rg implements ie {
    private wa field_Q;
    static nk field_G;
    static int field_O;
    private int field_P;
    static q field_N;

    public static void p(int param0) {
        if (param0 < 78) {
            vc.p(67);
            field_G = null;
            field_N = null;
            return;
        }
        field_G = null;
        field_N = null;
    }

    final void a(int param0, wa param1) {
        try {
            int var3_int = 32 / ((-1 - param0) / 56);
            ((vc) this).field_Q = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final wa a(byte param0) {
        int var2 = -111 / ((46 - param0) / 34);
        return ((vc) this).field_Q;
    }

    final void e(byte param0) {
        L0: {
          super.e((byte) 117);
          if (((vc) this).field_Q != null) {
            ((vc) this).field_Q.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 43) {
          ((vc) this).field_Q = null;
          return;
        } else {
          return;
        }
    }

    vc(String param0, ma param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean e(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          if (gl.field_y >= 10) {
            if (ge.field_x) {
              return false;
            } else {
              L0: {
                if (i.b(true)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final String f(int param0) {
        if (((vc) this).field_g) {
          if (((vc) this).field_j != null) {
            if (param0 != 4) {
              ((vc) this).field_Q = null;
              sh.a((byte) 123, ((vc) this).field_l + (-((vc) this).field_P + oa.field_j), bk.field_a);
              return ((vc) this).field_j;
            } else {
              sh.a((byte) 123, ((vc) this).field_l + (-((vc) this).field_P + oa.field_j), bk.field_a);
              return ((vc) this).field_j;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((vc) this).field_P = -param3 + (oa.field_j - ((vc) this).field_p);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "vc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new nk(2);
        field_N = new q();
    }
}
