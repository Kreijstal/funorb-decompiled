/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static sb field_c;
    static ea field_d;
    static int field_b;
    static String field_a;

    final static ed a(byte param0, String param1) {
        if (param0 == -75) {
          if (bd.field_h != ci.field_e) {
            if (bd.field_h == kd.field_p) {
              if (!param1.equals((Object) (Object) ic.field_m)) {
                ic.field_m = param1;
                sd.field_d = null;
                bd.field_h = ci.field_e;
                return null;
              } else {
                bd.field_h = mc.field_t;
                return sd.field_d;
              }
            } else {
              ic.field_m = param1;
              sd.field_d = null;
              bd.field_h = ci.field_e;
              return null;
            }
          } else {
            return null;
          }
        } else {
          rf.a((byte) -48);
          if (bd.field_h != ci.field_e) {
            if (bd.field_h == kd.field_p) {
              if (!param1.equals((Object) (Object) ic.field_m)) {
                ic.field_m = param1;
                sd.field_d = null;
                bd.field_h = ci.field_e;
                return null;
              } else {
                bd.field_h = mc.field_t;
                return sd.field_d;
              }
            } else {
              ic.field_m = param1;
              sd.field_d = null;
              bd.field_h = ci.field_e;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 13) {
          L0: {
            if (rj.field_f == 13) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (ul.field_b <= 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != -56) {
            rf.a((byte) -36);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sb(256);
        field_a = "Logging in...";
    }
}
