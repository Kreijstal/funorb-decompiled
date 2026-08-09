/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static wl field_c;
    static java.awt.Frame field_a;
    static String field_b;

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -53 / ((-39 - param0) / 62);
            stackIn_1_0 = ki.a(10, param1, -123, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("sj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0) {
        if (null == rn.field_b) {
            throw new IllegalStateException("NGR");
        }
        int var1 = 95 / ((param0 - 45) / 47);
        rn.field_b.field_c = true;
        p.b(1, 27102);
    }

    final static void a(int param0, int param1, int param2, vn param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var11 = param3.field_z;
              var10 = var11;
              var9 = var10;
              var4 = var9;
              if (param1 == -1380633400) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var5 >= var11.length) {
                break L0;
              } else {
                var6 = var11[var5];
                if (var6 != 0) {
                  L3: {
                    if ((65535 & var6) == 0) {
                      var7 = var6 >> 810902800;
                      var9[var5] = hi.a(eg.a(var7 * eg.a(param0 >> 1230426576, 255) << -279407384, 16711864), hi.a(eg.a(var7 * eg.a(param0 >> 1222359528, 255), 65280), eg.a(255, param0) * var7 >> -1380633400));
                      break L3;
                    } else {
                      if (-1 == (var6 & 16711935 ^ -1)) {
                        var7 = var6 >> 208697032;
                        var9[var5] = hi.a(hi.a(var7 * eg.a(255, param2) >> -342227608, eg.a(var7 * eg.a(param2 >> 2133219752, 255), 65280)), eg.a(16711709, eg.a(255, param2 >> -756685968) * var7 << 1176060040));
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1222359528) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_c = new wl();
        field_b = "Use this alternative as your account name";
    }
}
