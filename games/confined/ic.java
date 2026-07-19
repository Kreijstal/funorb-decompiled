/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_d;
    static nf field_a;
    static int field_b;
    static bi[] field_c;

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 3) {
            field_c = (bi[]) null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (-1 == (param0 ^ -1)) {
          return 0;
        } else {
          if (param0 > 0) {
            L0: {
              var2 = 1;
              if ((param0 ^ -1) >= -65536) {
                break L0;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              }
            }
            L1: {
              if (param0 > 255) {
                param0 = param0 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 15) {
                var2 += 4;
                param0 = param0 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= 3) {
                break L3;
              } else {
                param0 = param0 >> 2;
                var2 += 2;
                break L3;
              }
            }
            L4: {
              if ((param0 ^ -1) >= -2) {
                break L4;
              } else {
                param0 = param0 >> 1;
                var2++;
                break L4;
              }
            }
            return var2;
          } else {
            L5: {
              var2 = 2;
              if (65535 >= (param0 ^ -1)) {
                break L5;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L5;
              }
            }
            L6: {
              if (param0 < -256) {
                var2 += 8;
                param0 = param0 >> 8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param0 ^ -1) > 15) {
                param0 = param0 >> 4;
                var2 += 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((param0 ^ -1) <= 3) {
                break L8;
              } else {
                var2 += 2;
                param0 = param0 >> 2;
                break L8;
              }
            }
            if (param1 == 68) {
              L9: {
                if (-2 <= param0) {
                  break L9;
                } else {
                  param0 = param0 >> 1;
                  var2++;
                  break L9;
                }
              }
              return var2;
            } else {
              L10: {
                ic.a((byte) -31);
                if (-2 <= param0) {
                  break L10;
                } else {
                  param0 = param0 >> 1;
                  var2++;
                  break L10;
                }
              }
              return var2;
            }
          }
        }
    }

    static {
        field_b = 0;
        field_d = "A";
        field_c = new bi[13];
    }
}
