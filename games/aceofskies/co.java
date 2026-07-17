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

    public static void a() {
        field_a = null;
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
                if (param1 < ((co) this).field_h[var3] + ((co) this).field_h[var3 - 1] >> 1) {
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 109) {
                break L1;
              } else {
                co.a(23, -77, 74, -119, -5);
                break L1;
              }
            }
            L2: {
              var5_int = param3 + param2;
              var6 = param0 + param1;
              if (param3 > vp.field_b) {
                stackOut_5_0 = param3;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = vp.field_b;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (param0 <= vp.field_f) {
                stackOut_8_0 = vp.field_f;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = param0;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int >= vp.field_k) {
                stackOut_11_0 = vp.field_k;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (var6 < vp.field_d) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = vp.field_d;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (vp.field_b > param3) {
                break L6;
              } else {
                if (vp.field_k <= param3) {
                  break L6;
                } else {
                  var11 = param3 + vp.field_i * var8;
                  var12 = -var8 + var10 + 1 >> 1;
                  L7: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L6;
                    } else {
                      vp.field_j[var11] = 16777215;
                      var11 = var11 + 2 * vp.field_i;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (param0 < vp.field_f) {
                break L8;
              } else {
                if (var6 < vp.field_d) {
                  var11 = vp.field_i * param0 + var7;
                  var12 = -var7 + (var9 + 1) >> 1;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      vp.field_j[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (var5_int < vp.field_b) {
                break L10;
              } else {
                if (vp.field_k <= var5_int) {
                  break L10;
                } else {
                  var11 = ((1 & -param3 + var5_int) + var8) * vp.field_i + var5_int;
                  var12 = -var8 + (var10 + 1) >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      vp.field_j[var11] = 16777215;
                      var11 = var11 + vp.field_i * 2;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (vp.field_f > param0) {
                break L12;
              } else {
                if (vp.field_d > var6) {
                  var11 = var7 + (var6 * vp.field_i - -(-param0 + var6 & 1));
                  var12 = -var7 + 1 - -var9 >> 1;
                  L13: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L12;
                    } else {
                      vp.field_j[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var5, "co.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
