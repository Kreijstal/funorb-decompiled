/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq {
    static hd field_c;
    static nm[] field_b;
    static boolean field_a;
    static int field_d;
    static kg[] field_e;

    final static boolean a(byte param0) {
        Object var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 10) {
          if ((vj.field_c ^ -1) <= -11) {
            if (nb.field_f) {
              return false;
            } else {
              L0: {
                if (oh.b(-14954)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var2 = null;
          int discarded$5 = hq.a(-49, -20, (ml) null, 91);
          if ((vj.field_c ^ -1) <= -11) {
            if (nb.field_f) {
              return false;
            } else {
              L1: {
                if (oh.b(-14954)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1, ml param2, int param3) {
        if (param0 != 22531) {
          boolean discarded$2 = hq.a((byte) -59);
          return wr.a(param1, param2, 1 << param3, param3, 1 << param1, 1);
        } else {
          return wr.a(param1, param2, 1 << param3, param3, 1 << param1, 1);
        }
    }

    final static void b(byte param0) {
        if (!(!kd.field_s)) {
            fa.b(-127);
        }
        if (param0 < 108) {
            boolean discarded$0 = hq.a((byte) 11);
            return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 123 / ((param0 - -76) / 50);
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
