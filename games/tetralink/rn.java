/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static float field_d;
    static de field_e;
    static String field_a;
    static hl field_c;
    static int field_b;

    final static void a(int param0) {
        int discarded$0 = 0;
        wm.field_p = null;
        gg.field_k = null;
        if (param0 != 1) {
            discarded$0 = rn.a((byte) 67, 3);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 97) {
            rn.a((byte) 104);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (-1 == (param1 ^ -1)) {
          return 0;
        } else {
          if (param1 <= 0) {
            L0: {
              var2 = 2;
              if (param1 < -65536) {
                var2 += 16;
                param1 = param1 >> 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (255 >= (param1 ^ -1)) {
                break L1;
              } else {
                var2 += 8;
                param1 = param1 >> 8;
                break L1;
              }
            }
            if (param0 != -127) {
              L2: {
                rn.a((byte) -124);
                if (param1 >= -16) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                }
              }
              L3: {
                if (3 < (param1 ^ -1)) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (1 < (param1 ^ -1)) {
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
                if (param1 >= -16) {
                  break L5;
                } else {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L5;
                }
              }
              L6: {
                if (3 < (param1 ^ -1)) {
                  var2 += 2;
                  param1 = param1 >> 2;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (1 < (param1 ^ -1)) {
                  param1 = param1 >> 1;
                  var2++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return var2;
            }
          } else {
            L8: {
              var2 = 1;
              if (param1 <= 65535) {
                break L8;
              } else {
                var2 += 16;
                param1 = param1 >> 16;
                break L8;
              }
            }
            L9: {
              if ((param1 ^ -1) < -256) {
                param1 = param1 >> 8;
                var2 += 8;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1 > 15) {
                param1 = param1 >> 4;
                var2 += 4;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param1 > 3) {
                var2 += 2;
                param1 = param1 >> 2;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1 <= 1) {
                break L12;
              } else {
                param1 = param1 >> 1;
                var2++;
                break L12;
              }
            }
            return var2;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        i.a(true, param0);
        ji.b(-1002815199, param0);
        int var2 = 117 / ((param1 - 15) / 57);
    }

    static {
        field_a = "Use this alternative as your account name";
    }
}
