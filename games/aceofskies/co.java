/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    int field_d;
    static lh field_k;
    static String field_j;
    int[] field_h;
    int field_f;
    static int field_c;
    static pa[] field_i;
    static long field_e;
    static int field_b;
    static String field_a;
    static String field_g;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -13392) {
            co.a(24, -31, -7, 40, 82);
        }
        field_j = null;
        field_g = null;
        field_i = null;
        field_k = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (((co) this).field_h == null) {
          return 0;
        } else {
          if (((co) this).field_h.length != 0) {
            var3 = 1;
            L0: while (true) {
              if (var3 >= ((co) this).field_h.length) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    ((co) this).field_d = -22;
                    break L1;
                  }
                }
                return -1 + ((co) this).field_h.length;
              } else {
                if (param1 < ((co) this).field_h[var3] + ((co) this).field_h[var3 - 1] >> 2141798689) {
                  return -1 + var3;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((co) this).field_h == null) {
                break L1;
              } else {
                if (0 != ((co) this).field_h.length) {
                  stackOut_6_0 = ((co) this).field_h[-1 + ((co) this).field_h.length];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -8;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          if (param4 > 109) {
            break L0;
          } else {
            co.a(23, -77, 74, -119, -5);
            break L0;
          }
        }
        L1: {
          var5 = param3 + param2;
          var6 = param0 + param1;
          if (param3 > vp.field_b) {
            stackOut_4_0 = param3;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = vp.field_b;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_5_0;
          if (param0 <= vp.field_f) {
            stackOut_7_0 = vp.field_f;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = param0;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var8 = stackIn_8_0;
          if (var5 >= vp.field_k) {
            stackOut_10_0 = vp.field_k;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = var5;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var9 = stackIn_11_0;
          if (var6 < vp.field_d) {
            stackOut_13_0 = var6;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = vp.field_d;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          var10 = stackIn_14_0;
          if (vp.field_b > param3) {
            break L5;
          } else {
            if (vp.field_k <= param3) {
              break L5;
            } else {
              var11 = param3 + vp.field_i * var8;
              var12 = -var8 + var10 + 1 >> -1840296959;
              L6: while (true) {
                var12--;
                if (0 > var12) {
                  break L5;
                } else {
                  vp.field_j[var11] = 16777215;
                  var11 = var11 + 2 * vp.field_i;
                  continue L6;
                }
              }
            }
          }
        }
        L7: {
          if (param0 < vp.field_f) {
            break L7;
          } else {
            if (var6 < vp.field_d) {
              var11 = vp.field_i * param0 + var7;
              var12 = -var7 + (var9 + 1) >> -949223167;
              L8: while (true) {
                var12--;
                if (0 > var12) {
                  break L7;
                } else {
                  vp.field_j[var11] = 16777215;
                  var11 += 2;
                  continue L8;
                }
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (var5 < vp.field_b) {
            break L9;
          } else {
            if (vp.field_k <= var5) {
              break L9;
            } else {
              var11 = ((1 & -param3 + var5) + var8) * vp.field_i + var5;
              var12 = -var8 + (var10 + 1) >> -1343321983;
              L10: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L9;
                } else {
                  vp.field_j[var11] = 16777215;
                  var11 = var11 + vp.field_i * 2;
                  continue L10;
                }
              }
            }
          }
        }
        L11: {
          if (vp.field_f > param0) {
            break L11;
          } else {
            if (vp.field_d > var6) {
              var11 = var7 + (var6 * vp.field_i - -(-param0 + var6 & 1));
              var12 = -var7 + 1 - -var9 >> -594024799;
              L12: while (true) {
                var12--;
                if (0 > var12) {
                  break L11;
                } else {
                  vp.field_j[var11] = 16777215;
                  var11 += 2;
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
        }
    }

    co(int param0, int param1, int param2) {
        ((co) this).field_d = param1;
        ((co) this).field_f = param0;
        ((co) this).field_h = new int[param2 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Waiting for graphics";
        field_k = new lh();
        field_a = "Passwords must be between 5 and 20 characters long";
        field_b = 0;
    }
}
