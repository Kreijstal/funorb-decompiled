/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static va field_b;
    static int[] field_c;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 24009) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static oe a(boolean param0, float param1, oe param2) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oe stackIn_2_0 = null;
        oe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new oe(param2.field_e * param1, param2.field_b, param2.field_c);
            gk.field_d[0] = (float)param2.field_k.field_h;
            gk.field_d[1] = (float)param2.field_l.field_h;
            gk.field_d[2] = (float)param2.field_m.field_h;
            var4 = (int)lk.a(gk.field_d, 0, 1, -1, param1);
            var5 = (int)lk.a(gk.field_d, 0, 2, -1, param1);
            gk.field_d[0] = (float)param2.field_k.field_f;
            gk.field_d[1] = (float)param2.field_l.field_f;
            gk.field_d[2] = (float)param2.field_m.field_f;
            if (!param0) {
              var6 = (int)lk.a(gk.field_d, 0, 1, -1, param1);
              var7 = (int)lk.a(gk.field_d, 0, 2, -1, param1);
              var3.field_k = new qm(param2.field_k);
              var3.field_l = new qm(var4, var6);
              var3.field_m = new qm(var5, var7);
              stackIn_4_0 = (oe) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (oe) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("ua.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(byte param0, char param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        oe var12 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 >= 17) {
                break L3;
              } else {
                var12 = (oe) null;
                ua.a(false, -0.35584643483161926f, (oe) null);
                break L3;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf((int) param1, var9);
              if (var10 >= 0) {
                discarded$0 = var8.append(param2.substring(var9, var10));
                discarded$1 = var8.append(param3);
                var9 = 1 + var10;
                continue L4;
              } else {
                discarded$2 = var8.append(param2.substring(var9));
                stackIn_14_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
    }
}
