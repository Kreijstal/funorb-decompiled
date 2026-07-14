/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static String[] field_c;
    static String[] field_e;
    static String field_f;
    static vg field_b;
    static io field_a;
    static boolean field_d;
    static String field_g;

    final static eq a(int param0, byte param1) {
        lm stackIn_4_0 = null;
        lm stackIn_8_0 = null;
        lm stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        lm stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param1 > -102) {
          L0: {
            vm.b(-99, (byte) 98);
            if (null != dg.field_f) {
              stackOut_7_0 = dg.field_f.a(-11434, (long)param0);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (lm) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (eq) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != dg.field_f) {
              stackOut_3_0 = dg.field_f.a(-11434, (long)param0);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (lm) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (eq) (Object) stackIn_4_0;
        }
    }

    final static fm a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        if (param1 != 22) {
          eq discarded$2 = vm.a(-98, (byte) 84);
          return el.a(-107, param0, false, param3, param4, param2);
        } else {
          return el.a(-107, param0, false, param3, param4, param2);
        }
    }

    final static void b(int param0, byte param1) {
        if (param1 <= -62) {
          io.field_e = 3 & param0 >> -964132796;
          if (io.field_e >= -3) {
            L0: {
              gh.field_v = (14 & param0) >> 923892994;
              if (-3 > (gh.field_v ^ -1)) {
                gh.field_v = 2;
                break L0;
              } else {
                break L0;
              }
            }
            ib.field_e = param0 & 3;
            if (ib.field_e > 2) {
              ib.field_e = 2;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              io.field_e = 2;
              gh.field_v = (14 & param0) >> 923892994;
              if (-3 < gh.field_v) {
                gh.field_v = 2;
                break L1;
              } else {
                break L1;
              }
            }
            ib.field_e = param0 & 3;
            if (ib.field_e <= 2) {
              return;
            } else {
              ib.field_e = 2;
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 <= 77) {
          vm.a(11);
          field_b = null;
          field_g = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_g = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Try Again";
        field_a = new io("usename");
        field_g = "Cancel";
    }
}
