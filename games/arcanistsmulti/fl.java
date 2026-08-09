/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String[] field_b;

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              hb.field_Gb = pa.field_g;
              if (param0 == 20657) {
                break L1;
              } else {
                var6 = (String[]) null;
                fl.a(49, (String) null, (String[]) null, 7);
                break L1;
              }
            }
            if (param3 != 255) {
              L2: {
                if (100 > param3) {
                  break L2;
                } else {
                  if ((param3 ^ -1) >= -106) {
                    var8 = param2;
                    ao.a(var8, param0 ^ -20688);
                    fh.field_i = ho.a((byte) 120, param2);
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              fh.field_i = ab.a(param0 + -20657, param3, param1);
              return;
            } else {
              L3: {
                stackIn_6_0 = param0 ^ 12212;

                if (13 <= qm.field_u) {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 0;
                  break L3;
                } else {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 1;
                  break L3;
                }
              }
              fh.field_i = oj.a(stackIn_7_0, stackIn_7_1 != 0);
              var7 = (String[]) null;
              ao.a((String[]) null, -127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("fl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          fl.a(false);
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, eg param1) {
        qb var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            if (param0 != -2389) {
                field_a = true;
            }
            var2 = new qb(param1.a("", "final_frame.jpg", -1), (java.awt.Component) ((Object) on.field_c));
            var3 = var2.field_q;
            var4 = var2.field_y;
            ec.a(65280);
            mi.field_E = new qb(var3, 3 * var4 / 4);
            mi.field_E.a();
            var2.h(0, 0);
            gm.field_l = new qb(var3, -mi.field_E.field_y + var4);
            gm.field_l.a();
            var2.h(0, -mi.field_E.field_y);
            gm.field_l.field_o = mi.field_E.field_y;
            oo.c(-15405);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_c = "Reading Book of Overlight";
    }
}
