/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ooa extends wka {
    static String field_h;
    static int[] field_e;
    static int field_g;
    static jea field_f;

    final static String a(byte param0) {
        String var1 = null;
        var1 = "";
        if (param0 >= -46) {
          L0: {
            String discarded$12 = ooa.a((byte) -83);
            if (null != vn.field_b) {
              var1 = vn.field_b.a(39);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              int discarded$13 = 69;
              var1 = ra.r();
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = uw.field_a;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (null != vn.field_b) {
              var1 = vn.field_b.a(39);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              int discarded$14 = 69;
              var1 = ra.r();
              break L4;
            }
          }
          L5: {
            if (var1.length() != 0) {
              break L5;
            } else {
              var1 = uw.field_a;
              break L5;
            }
          }
          return var1;
        }
    }

    public static void d() {
        field_f = null;
        field_h = null;
        field_e = null;
        int var1 = 0;
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 > -42) {
          return true;
        } else {
          L0: {
            if ((param1 & 8192) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          int discarded$2 = 8000;
          return (stackIn_4_0 != 0 | cra.a(param0, -57, param1) | wq.b(param0, param1)) & kb.a(param0, param1, (byte) 17);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Create a free account to start using this feature";
    }
}
