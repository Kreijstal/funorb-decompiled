/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    final static void a(byte param0) {
        if (0 + -gi.field_i != td.field_u) {
          if (250 - gi.field_i == td.field_u) {
            if (param0 <= 42) {
              return;
            } else {
              td.field_u = td.field_u + 1;
              return;
            }
          } else {
            if (param0 <= 42) {
              return;
            } else {
              td.field_u = td.field_u + 1;
              return;
            }
          }
        } else {
          if (param0 <= 42) {
            return;
          } else {
            td.field_u = td.field_u + 1;
            return;
          }
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (-65536 > (param1 ^ -1)) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (!((param1 ^ -1) >= -256)) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if (15 < param1) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        int var3 = -66 / ((-59 - param0) / 55);
        if (param1 > 3) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if ((param1 ^ -1) < -2) {
            param1 = param1 >>> 1;
            var2 = var2 | 1;
        }
        return var2;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -100) {
          return false;
        } else {
          L0: {
            if (param0 != (param0 & -param0)) {
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

    static {
    }
}
