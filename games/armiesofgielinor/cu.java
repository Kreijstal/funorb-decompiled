/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu implements gj {
    static wk[] field_d;
    static boolean field_c;
    static wk field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 57 % ((param0 - -17) / 56);
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 != 0) {
          if (param0 == 3) {
            if (param1 < -1) {
              L0: {
                var2 = 1;
                if (-65536 < param1) {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if ((param1 ^ -1) >= -256) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                }
              }
              L2: {
                if (param1 <= 15) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                }
              }
              L3: {
                if (param1 <= 3) {
                  break L3;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L3;
                }
              }
              L4: {
                if (-2 > param1) {
                  param1 = param1 >> 1;
                  var2++;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (65535 > param1) {
                  param1 = param1 >> 16;
                  var2 += 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-256 <= param1) {
                  break L6;
                } else {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L6;
                }
              }
              L7: {
                if (15 >= (param1 ^ -1)) {
                  break L7;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L7;
                }
              }
              L8: {
                if (param1 >= -4) {
                  break L8;
                } else {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L8;
                }
              }
              L9: {
                if (param1 >= -2) {
                  break L9;
                } else {
                  var2++;
                  param1 = param1 >> 1;
                  break L9;
                }
              }
              return var2;
            }
          } else {
            return 114;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_a = true;
    }
}
