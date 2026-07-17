/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;
    static rb field_b;

    final static void a(boolean param0, ll param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        Object var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              vj.field_t[0] = p.field_b.nextInt();
              vj.field_t[1] = p.field_b.nextInt();
              vj.field_t[3] = (int)dh.field_b;
              dh.field_e.field_j = 0;
              if (param3 == -27886) {
                break L1;
              } else {
                var8 = null;
                rk.a((byte) 84, (java.awt.Component) null);
                break L1;
              }
            }
            L2: {
              vj.field_t[2] = (int)(dh.field_b >> 32);
              dh.field_e.h(-115, vj.field_t[0]);
              dh.field_e.h(30, vj.field_t[1]);
              dh.field_e.h(85, vj.field_t[2]);
              dh.field_e.h(80, vj.field_t[3]);
              cc.a(dh.field_e, 10);
              dh.field_e.a(param4, (byte) 105);
              param1.a(false, dh.field_e);
              dp.field_e.field_j = 0;
              if (!param2) {
                dp.field_e.i(16, -122);
                break L2;
              } else {
                dp.field_e.i(18, 110);
                break L2;
              }
            }
            L3: {
              dp.field_e.field_j = dp.field_e.field_j + 2;
              var5_int = dp.field_e.field_j;
              dp.field_e.h(-108, h.field_b);
              dp.field_e.a(lg.field_u, -80);
              var6 = 0;
              if (ih.field_S) {
                var6 = var6 | 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!ni.field_a) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                var6 = var6 | 8;
                break L5;
              }
            }
            L6: {
              if (ia.field_b == null) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              dp.field_e.i(var6, param3 + 27799);
              var7 = ff.a(hc.a(0), (byte) 42);
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              dp.field_e.a(param3 ^ -27758, var7);
              if (ia.field_b == null) {
                break L8;
              } else {
                dp.field_e.a((byte) -88, ia.field_b);
                break L8;
              }
            }
            ab.a(dh.field_e, pm.field_c, (byte) -105, (de) (Object) dp.field_e, pj.field_p);
            dp.field_e.g(57, -var5_int + dp.field_e.field_j);
            vl.a((byte) -46, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("rk.A(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            if (param0 >= -13) {
                Object var3 = null;
                rk.a((byte) -12, (java.awt.Component) null);
            }
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener((java.awt.event.KeyListener) (Object) ea.field_c);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) ea.field_c);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rk.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
