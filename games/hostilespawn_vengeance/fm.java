/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bd field_b;
    static bd[] field_a;
    static int[] field_c;

    final static void a(p param0, boolean param1, int param2, int[] param3) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param1) {
          L0: {
            field_a = null;
            if (param2 == -18) {
              stackOut_13_0 = 3;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_12_0 = 6;
              stackIn_14_0 = stackOut_12_0;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_14_0;
            if (-3 != param3[param0.field_j.b(-4)]) {
              param0.field_l.a(var4, (byte) 94, param0.field_c);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            param0.a(8573);
            param0.field_e = param0.field_e + 1;
            if ((param0.field_e ^ -1) < -33) {
              param0.field_i = -1;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (param2 == -18) {
              stackOut_3_0 = 3;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 6;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            var4 = stackIn_4_0;
            if (-3 != param3[param0.field_j.b(-4)]) {
              param0.field_l.a(var4, (byte) 94, param0.field_c);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            param0.a(8573);
            param0.field_e = param0.field_e + 1;
            if ((param0.field_e ^ -1) < -33) {
              param0.field_i = -1;
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -22) {
          var2 = null;
          fm.a((p) null, true, -4, (int[]) null);
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
