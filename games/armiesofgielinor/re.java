/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends dr {
    static String field_E;

    final static boolean a(int param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (0 != (param0 ^ -1)) {
          if (param1 != -98) {
            L0: {
              field_E = (String) null;
              if ((hf.field_a & 1 << param0) == 0) {
                stackIn_10_0 = 0;
                break L0;
              } else {
                stackIn_10_0 = 1;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if ((hf.field_a & 1 << param0) == 0) {
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int param5) {
        try {
            if (param2 >= -112) {
                field_E = (String) null;
            }
            param4[0].f(param1, param0, param5);
            param4[1].d(param4[1].field_y + param1, param0, -(param4[2].field_y << -559062623) + param3, param4[2].field_v, param5);
            param4[2].f(param3 + (param1 + -param4[2].field_y), param0, param5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -24872) {
              stackIn_4_0 = new nd(vv.a((byte) -62));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("re.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 > -14) {
            field_E = (String) null;
        }
    }

    re(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_E = "Spectate";
    }
}
