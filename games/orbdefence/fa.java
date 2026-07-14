/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    int field_d;
    static boolean field_b;
    static boolean field_a;
    static String field_c;

    final static void a(d param0, int param1, int param2) {
        se var3 = null;
        if (param2 < 14) {
          fa.a(false);
          var3 = uk.field_b;
          var3.i(param1, -74);
          var3.a(param0.field_f, -12);
          var3.a(param0.field_i, -99);
          return;
        } else {
          var3 = uk.field_b;
          var3.i(param1, -74);
          var3.a(param0.field_f, -12);
          var3.a(param0.field_i, -99);
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        qc.field_g = kf.field_d;
        if (param0 <= -103) {
          if ((param1 ^ -1) != -256) {
            if (param1 >= 100) {
              if (param1 > 105) {
                tl.field_g = oe.a(param1, param3, -3);
                return;
              } else {
                tl.field_g = hi.a(2, param2);
                return;
              }
            } else {
              tl.field_g = oe.a(param1, param3, -3);
              return;
            }
          } else {
            L0: {
              if (ae.field_a >= 13) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            tl.field_g = fk.a(stackIn_16_0 != 0, (byte) -68);
            return;
          }
        } else {
          field_a = true;
          if ((param1 ^ -1) != -256) {
            if (param1 >= 100) {
              if (param1 > 105) {
                tl.field_g = oe.a(param1, param3, -3);
                return;
              } else {
                tl.field_g = hi.a(2, param2);
                return;
              }
            } else {
              tl.field_g = oe.a(param1, param3, -3);
              return;
            }
          } else {
            L1: {
              if (ae.field_a >= 13) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            tl.field_g = fk.a(stackIn_5_0 != 0, (byte) -68);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading extra data";
    }
}
