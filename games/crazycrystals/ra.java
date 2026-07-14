/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private int[] field_b;
    static fc field_d;
    static String field_a;
    static vc field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (!param0) {
            field_a = null;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        if ((param3 ^ -1) == param2) {
          return 0;
        } else {
          var7 = 0;
          param3 = param3 + param1;
          var8 = param4;
          L0: while (true) {
            L1: {
              var9 = param0[var8];
              if (0 > var9) {
                var7 = ((ra) this).field_b[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              var10 = ((ra) this).field_b[var7];
              if (((ra) this).field_b[var7] >= 0) {
                break L2;
              } else {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param3 > param1) {
                  var7 = 0;
                  break L2;
                } else {
                  return -param4 + var8 + 1;
                }
              }
            }
            L3: {
              if (-1 == (var9 & 64 ^ -1)) {
                var7++;
                break L3;
              } else {
                var7 = ((ra) this).field_b[var7];
                break L3;
              }
            }
            L4: {
              var10 = ((ra) this).field_b[var7];
              if (((ra) this).field_b[var7] >= 0) {
                break L4;
              } else {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param1 < param3) {
                  var7 = 0;
                  break L4;
                } else {
                  return -param4 + var8 + 1;
                }
              }
            }
            L5: {
              if ((32 & var9) == 0) {
                var7++;
                break L5;
              } else {
                var7 = ((ra) this).field_b[var7];
                break L5;
              }
            }
            L6: {
              var10 = ((ra) this).field_b[var7];
              if (((ra) this).field_b[var7] >= 0) {
                break L6;
              } else {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param1 < param3) {
                  var7 = 0;
                  break L6;
                } else {
                  return -param4 + var8 + 1;
                }
              }
            }
            L7: {
              if ((var9 & 16) != 0) {
                var7 = ((ra) this).field_b[var7];
                break L7;
              } else {
                var7++;
                break L7;
              }
            }
            L8: {
              var10 = ((ra) this).field_b[var7];
              if (((ra) this).field_b[var7] >= 0) {
                break L8;
              } else {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param1 < param3) {
                  var7 = 0;
                  break L8;
                } else {
                  return -param4 + var8 + 1;
                }
              }
            }
            L9: {
              if (0 == (8 & var9)) {
                var7++;
                break L9;
              } else {
                var7 = ((ra) this).field_b[var7];
                break L9;
              }
            }
            L10: {
              var10 = ((ra) this).field_b[var7];
              if (((ra) this).field_b[var7] < 0) {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param1 < param3) {
                  var7 = 0;
                  break L10;
                } else {
                  return -param4 + var8 + 1;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (-1 == (var9 & 4)) {
                var7++;
                break L11;
              } else {
                var7 = ((ra) this).field_b[var7];
                break L11;
              }
            }
            L12: {
              var10 = ((ra) this).field_b[var7];
              if (-1 > ((ra) this).field_b[var7]) {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param3 > param1) {
                  var7 = 0;
                  break L12;
                } else {
                  return -param4 + var8 + 1;
                }
              } else {
                break L12;
              }
            }
            L13: {
              if ((var9 & 2) == -1) {
                var7++;
                break L13;
              } else {
                var7 = ((ra) this).field_b[var7];
                break L13;
              }
            }
            L14: {
              var10 = ((ra) this).field_b[var7];
              if (-1 > ((ra) this).field_b[var7]) {
                param1++;
                param5[param1] = (byte)(var10 ^ -1);
                if (param3 > param1) {
                  var7 = 0;
                  break L14;
                } else {
                  return -param4 + var8 + 1;
                }
              } else {
                break L14;
              }
            }
            L15: {
              if ((var9 & 1) != 0) {
                var7 = ((ra) this).field_b[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            var10 = ((ra) this).field_b[var7];
            if (((ra) this).field_b[var7] < 0) {
              param1++;
              param5[param1] = (byte)(var10 ^ -1);
              if (param3 <= param1) {
                return -param4 + var8 + 1;
              } else {
                var7 = 0;
                var8++;
                var8++;
                continue L0;
              }
            } else {
              var8++;
              var8++;
              continue L0;
            }
          }
        }
    }

    private ra() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new fc(16);
        field_a = "Last Bomb";
    }
}
