/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends dr {
    static String field_E;

    final static boolean a(int param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (0 != (param0 ^ -1)) {
          if (param1 != -98) {
            L0: {
              field_E = null;
              if ((hf.field_a & 1 << param0) == 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              if ((hf.field_a & 1 << param0) == 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
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
        if (param2 >= -112) {
          field_E = null;
          param4[0].f(param1, param0, param5);
          param4[1].d(param4[1].field_y + param1, param0, -(param4[2].field_y << -559062623) + param3, param4[2].field_v, param5);
          param4[2].f(param3 + (param1 + -param4[2].field_y), param0, param5);
          return;
        } else {
          param4[0].f(param1, param0, param5);
          param4[1].d(param4[1].field_y + param1, param0, -(param4[2].field_y << -559062623) + param3, param4[2].field_v, param5);
          param4[2].f(param3 + (param1 + -param4[2].field_y), param0, param5);
          return;
        }
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            return null;
        }
        return new nd((Object) (Object) vv.a((byte) -62));
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 > -14) {
            field_E = null;
        }
    }

    re(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Spectate";
    }
}
