/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static int[] field_b;
    static j field_c;
    static qk field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param3 <= 0) {
            param3 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (32 <= param3) {
          return;
        } else {
          L1: {
            param5 = param5 - param3;
            param9 = param9 - param3;
            var10 = -param3 + 32;
            if (param9 >= vj.field_h) {
              break L1;
            } else {
              param1 = param1 - (-param9 + vj.field_h);
              param9 = vj.field_h;
              break L1;
            }
          }
          L2: {
            if (vj.field_f <= param5) {
              break L2;
            } else {
              param4 = param4 - (-param5 + vj.field_f);
              param5 = vj.field_f;
              break L2;
            }
          }
          L3: {
            var11 = 124 / ((-52 - param6) / 58);
            if (param9 - -param1 > vj.field_b) {
              param1 = -param9 + vj.field_b;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (vj.field_a < param5 + param4) {
              param4 = -param5 + vj.field_a;
              break L4;
            } else {
              break L4;
            }
          }
          if (param4 > 0) {
            if (param1 <= 0) {
              return;
            } else {
              L5: {
                if (var10 <= param5 % 32) {
                  var12 = -(param5 % 32) + 32;
                  param5 = param5 + var12;
                  param4 = param4 - var12;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var10 > param9 % 32) {
                  break L6;
                } else {
                  var12 = 32 - param9 % 32;
                  param9 = param9 + var12;
                  param1 = param1 - var12;
                  break L6;
                }
              }
              L7: {
                if (var10 <= (param4 + (param5 + -1)) % 32) {
                  param4 = param4 - (1 - -((-1 + param4 + param5) % 32) + -var10);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var10 <= (param1 + param9 + -1) % 32) {
                  param1 = param1 - (-var10 + 1 + (-1 + (param1 + param9)) % 32);
                  break L8;
                } else {
                  break L8;
                }
              }
              ke.a(param1, vj.field_l - param4, param5 % 32, 38, -84, param2, vj.field_l * param9 + param5, param4, vj.field_j, param9 % 32, var10, param7, param3);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
