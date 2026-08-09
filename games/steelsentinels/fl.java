/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_a;
    static gh field_b;
    static int field_d;
    static gh field_c;
    static gh field_e;

    final static void a(int param0, mb param1, byte param2, int param3, int param4, int param5) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mb var13 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_int = sb.field_bb.field_c * param5;
              if (param2 < -90) {
                break L1;
              } else {
                var13 = (mb) null;
                fl.a(48, (mb) null, (byte) -79, 76, -55, -81);
                break L1;
              }
            }
            var7 = param5;
            L2: while (true) {
              if (var7 >= param5 + param3) {
                break L0;
              } else {
                var8 = param4;
                L3: while (true) {
                  if (var8 >= param4 + param0) {
                    var6_int = var6_int + sb.field_bb.field_c;
                    var7++;
                    continue L2;
                  } else {
                    L4: {
                      var9 = sb.field_bb.field_a[var6_int + var8];
                      if (var9 >> 437846504 == (65535 & var9)) {
                        var10 = param1.d((byte) 25);
                        var11 = 255 & var9;
                        if (var11 <= 64) {
                          break L4;
                        } else {
                          sb.field_bb.field_a[var8 - -var6_int] = ec.a(16711935, var11 * ec.a(16711935, var10) >> -1679136504) + ec.a(65280, var11 * ec.a(var10, 65280) >> 1048627944);
                          break L4;
                        }
                      } else {
                        var10 = 255 & var9;
                        var10 = var10 / 2;
                        if (-33 <= (var10 ^ -1)) {
                          break L4;
                        } else {
                          sb.field_bb.field_a[var8 + var6_int] = param1.field_ic * var10;
                          break L4;
                        }
                      }
                    }
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("fl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 < 75) {
            return;
        }
        gf.field_a.a(200, param1);
    }

    final static pc a(byte param0, sk param1, int param2) {
        RuntimeException var3 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 27) {
                break L1;
              } else {
                fl.a((byte) -76, true);
                break L1;
              }
            }
            stackIn_3_0 = on.a(em.a(param1, 100, param2), -48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 60) {
            field_e = (gh) null;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = -1;
    }
}
