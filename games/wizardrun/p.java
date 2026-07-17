/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends og implements wa {
    static int field_W;
    private int field_X;
    static int field_V;
    private dk field_T;
    static int field_U;

    p(String param0, ce param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2_int = param1.charAt(0);
              var3 = 1;
              if (!param0) {
                break L1;
              } else {
                field_W = 38;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 >= param1.length()) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param1.charAt(var3) != var2_int) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("p.FA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        if (param0 != 10000536) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
            ((p) this).field_X = -param2 + (pg.field_n + -((p) this).field_o);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "p.H(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, dk param1) {
        if (param0 != 0) {
            return;
        }
        try {
            ((p) this).field_T = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "p.CA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void i(byte param0) {
        super.i((byte) -73);
        if (param0 > -59) {
            Object var3 = null;
            ((p) this).a(-16, (dk) null);
        }
        if (!(null == ((p) this).field_T)) {
            ((p) this).field_T.a((byte) -115);
        }
    }

    public final dk a(byte param0) {
        int var2 = -2 % ((62 - param0) / 36);
        return ((p) this).field_T;
    }

    final static void a(byte param0, String param1, boolean param2, float param3) {
        try {
            if (!(ea.field_e != null)) {
                ea.field_e = new hk(u.field_A, bh.field_a);
                u.field_A.b((ub) (Object) ea.field_e, (byte) 126);
            }
            int var4_int = 25 % ((param0 - -75) / 34);
            ea.field_e.a(param1, param3, 2113632, param2);
            ed.d();
            od.a(-117, true);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "p.DA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static uf[] l(byte param0) {
        return new uf[]{hd.field_C, jf.field_e, ra.field_j};
    }

    final String c(boolean param0) {
        if (!((p) this).field_v) {
            return null;
        }
        if (null == ((p) this).field_p) {
            return null;
        }
        if (param0) {
            dk discarded$0 = ((p) this).a((byte) -27);
        }
        og.a(pg.field_n + -((p) this).field_X + ((p) this).field_r, fi.field_B, -91);
        return ((p) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 0;
        field_U = 0;
        field_W = -1;
    }
}
