/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int[] field_c;
    static String field_e;
    static double field_d;
    static String field_f;
    static int[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_b = (int[]) null;
          field_a = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(jp param0, int param1, int param2, pb param3, int param4, int param5, jp param6) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            fc.a(-72, param3.field_p);
            lb.g(0, 0, param3.field_i, param3.field_q, um.field_u[param5], 928072);
            og.a(-124, 128, 8, param0, 16777215, (-param0.field_x + param3.field_i) / 2, 85 + (param1 + -param0.field_z));
            if (param4 == -8562) {
              og.a(-113, 8, 128, param6, 16777215, (param3.field_i + -param0.field_x) / 2, 480 + param1 + (-param0.field_z - -(60 / param2)));
              sc.b(-90);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("hh.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 == 29605) {
              var3_int = 1;
              L1: while (true) {
                if ((param0 ^ -1) >= -2) {
                  if (1 != param0) {
                    stackIn_15_0 = var3_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_13_0 = param2 * var3_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    if (0 == (param0 & 1)) {
                      break L2;
                    } else {
                      var3_int = var3_int * param2;
                      break L2;
                    }
                  }
                  param2 = param2 * param2;
                  param0 = param0 >> 1;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -85;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "hh.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    static {
        field_e = "+<%0>";
        field_f = "Yes";
        field_c = new int[]{12658477, 3952770, 16494651, 26679, 16711935};
        field_d = Math.atan2(1.0, 0.0);
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = new int[2];
    }
}
