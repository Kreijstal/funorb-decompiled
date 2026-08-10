/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static int field_a;

    final static void a(fe param0, java.awt.Frame param1, int param2) {
        ib var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        java.awt.Frame var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param1, 100);
              L2: while (true) {
                if (var3.field_c != 0) {
                  if (1 != var3.field_c) {
                    pg.a(100L, -116);
                    continue L1;
                  } else {
                    L3: {
                      param1.setVisible(false);
                      if (param2 == 100) {
                        break L3;
                      } else {
                        var5 = (java.awt.Frame) null;
                        ra.a((fe) null, (java.awt.Frame) null, 29);
                        break L3;
                      }
                    }
                    param1.dispose();
                    break L0;
                  }
                } else {
                  pg.a(10L, param2 + -225);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ra.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final static String a(byte param0) {
        if (!lk.field_c && da.field_y >= bk.field_d && da.field_y < ek.field_g + bk.field_d) {
            return tj.field_v;
        }
        if (param0 >= 26) {
            return null;
        }
        field_a = -66;
        return null;
    }

    final static void a(int param0) {
        ti var1 = null;
        ti var2 = null;
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        try {
            var1 = new ti(540, 140);
            oj.a(var1, 256);
            ka.c();
            sb.c();
            si.field_l = 0;
            f.a((byte) 16);
            var2 = var1.a();
            for (var3 = 0; var3 < 15; var3++) {
                var2.d(-2, -2, 16777215);
                sb.a(4, 4, 0, 0, 540, 140);
            }
            ac.field_m.e();
            var1.d(param0, 0);
            fi.c(true);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ra.B(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
