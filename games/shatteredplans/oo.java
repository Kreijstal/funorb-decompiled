/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    static qr field_c;
    static bi field_a;
    static String field_f;
    static int field_e;
    static int[] field_b;
    static String field_d;

    final static void a(byte param0) {
        if (param0 > -49) {
          boolean discarded$2 = oo.a(-77, 49, 26, true, 104);
          ig.a(7655);
          qj.a((byte) -127, 4);
          return;
        } else {
          ig.a(7655);
          qj.a((byte) -127, 4);
          return;
        }
    }

    final static void a(String param0, byte param1) {
        fr.field_H = param0;
        int var2 = 81 % ((param1 - 0) / 43);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 >= param3) {
          if (param0 >= param2) {
            if (param3 < param2) {
              fp.a(param7, param1, -116, param5, param4, param2, gf.field_h, param3, param0);
              if (!param6) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              fp.a(param7, param5, -92, param1, param4, param3, gf.field_h, param2, param0);
              if (!param6) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          } else {
            fp.a(param1, param7, -99, param5, param4, param0, gf.field_h, param3, param2);
            if (!param6) {
              field_c = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 >= param2) {
            if (param0 >= param2) {
              fp.a(param5, param7, -98, param1, param4, param0, gf.field_h, param2, param3);
              if (param6) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              fp.a(param5, param1, -101, param7, param4, param2, gf.field_h, param0, param3);
              if (param6) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          } else {
            fp.a(param1, param5, -113, param7, param4, param3, gf.field_h, param0, param2);
            if (!param6) {
              field_c = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var5 = param0 * param0 - -(param1 * param1);
        if (!param3) {
          return true;
        } else {
          L0: {
            var6 = param2 * param2 - -(param4 * param4);
            if (var6 <= var5) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_a = null;
        if (param0 != 4) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Percentage of fleets moved each turn (average for game).";
        field_f = "these resources.";
    }
}
