/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    private int[] field_c;
    static String field_a;
    static int[] field_b;

    final static hh a(byte param0, ci param1, int param2, ci param3, int param4) {
        if (param0 == -66) {
          if (!rl.a(param4, 0, param2, param1)) {
            return null;
          } else {
            return ak.a(param3.a((byte) -93, param4, param2), 21725);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (param3 >= 92) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) <= -1) {
              var9 = param1;
              var5 = var9;
              var6 = param2;
              var7 = param4;
              var9[var6] = (vg.c(var9[var6], 16711422) >> 921440353) + var7;
              param2++;
              param0--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_b = null;
          param0--;
          L1: while (true) {
            if ((param0 ^ -1) <= -1) {
              var9 = param1;
              var5 = var9;
              var6 = param2;
              var7 = param4;
              var9[var6] = (vg.c(var9[var6], 16711422) >> 921440353) + var7;
              param2++;
              param0--;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 0) {
          param0 = param0 + param2;
          var7 = param4;
          var8 = param5;
          L0: while (true) {
            L1: {
              var9 = param3[var8];
              if (-1 < (var9 ^ -1)) {
                var7 = ((pe) this).field_c[var7];
                break L1;
              } else {
                var7++;
                break L1;
              }
            }
            L2: {
              var10 = ((pe) this).field_c[var7];
              if (0 <= ((pe) this).field_c[var7]) {
                break L2;
              } else {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param0 > param2) {
                  var7 = 0;
                  break L2;
                } else {
                  return -param5 + var8 - -1;
                }
              }
            }
            L3: {
              if ((var9 & 64) != 0) {
                var7 = ((pe) this).field_c[var7];
                break L3;
              } else {
                var7++;
                break L3;
              }
            }
            L4: {
              var10 = ((pe) this).field_c[var7];
              if (-1 < (((pe) this).field_c[var7] ^ -1)) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param2 < param0) {
                  var7 = 0;
                  break L4;
                } else {
                  return -param5 + var8 - -1;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if ((var9 & 32) == 0) {
                var7++;
                break L5;
              } else {
                var7 = ((pe) this).field_c[var7];
                break L5;
              }
            }
            L6: {
              var10 = ((pe) this).field_c[var7];
              if (-1 < (((pe) this).field_c[var7] ^ -1)) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param0 > param2) {
                  var7 = 0;
                  break L6;
                } else {
                  return -param5 + var8 - -1;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if ((var9 & 16) == 0) {
                var7++;
                break L7;
              } else {
                var7 = ((pe) this).field_c[var7];
                break L7;
              }
            }
            L8: {
              var10 = ((pe) this).field_c[var7];
              if (((pe) this).field_c[var7] < 0) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param2 < param0) {
                  var7 = 0;
                  break L8;
                } else {
                  return -param5 + var8 - -1;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (0 == (8 & var9)) {
                var7++;
                break L9;
              } else {
                var7 = ((pe) this).field_c[var7];
                break L9;
              }
            }
            L10: {
              var10 = ((pe) this).field_c[var7];
              if (((pe) this).field_c[var7] < 0) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param2 < param0) {
                  var7 = 0;
                  break L10;
                } else {
                  return -param5 + var8 - -1;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if ((4 & var9) != 0) {
                var7 = ((pe) this).field_c[var7];
                break L11;
              } else {
                var7++;
                break L11;
              }
            }
            L12: {
              var10 = ((pe) this).field_c[var7];
              if (-1 >= (((pe) this).field_c[var7] ^ -1)) {
                break L12;
              } else {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param2 < param0) {
                  var7 = 0;
                  break L12;
                } else {
                  return -param5 + var8 - -1;
                }
              }
            }
            L13: {
              if (0 != (var9 & 2)) {
                var7 = ((pe) this).field_c[var7];
                break L13;
              } else {
                var7++;
                break L13;
              }
            }
            L14: {
              var10 = ((pe) this).field_c[var7];
              if (((pe) this).field_c[var7] < 0) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param0 > param2) {
                  var7 = 0;
                  break L14;
                } else {
                  return -param5 + var8 - -1;
                }
              } else {
                break L14;
              }
            }
            L15: {
              if ((var9 & 1) != -1) {
                var7 = ((pe) this).field_c[var7];
                break L15;
              } else {
                var7++;
                break L15;
              }
            }
            L16: {
              var10 = ((pe) this).field_c[var7];
              if (-1 > ((pe) this).field_c[var7]) {
                param2++;
                param1[param2] = (byte)(var10 ^ -1);
                if (param2 >= param0) {
                  return -param5 + var8 - -1;
                } else {
                  var7 = 0;
                  break L16;
                }
              } else {
                break L16;
              }
            }
            var8++;
            continue L0;
          }
        } else {
          return 0;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        if (param0 > param1) {
          L0: {
            if (param1 >= 2048) {
              stackOut_7_0 = nj.field_r[-param1 + 4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = nj.field_r[param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param1 ^ -1)) {
              stackOut_3_0 = -nj.field_r[param1 - 4096];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -nj.field_r[-param1 + 8192];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -82 % ((49 - param0) / 47);
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Try again";
    }
}
