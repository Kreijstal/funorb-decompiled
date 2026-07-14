/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends ka {
    static int field_q;
    static String field_r;
    static qr field_p;

    public static void i(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != 388178881) {
            field_r = null;
        }
    }

    final static int c(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 > -1) {
            param1 = param1 >>> 16;
            var2 += 16;
            break L0;
          } else {
            if (65536 > param1) {
              break L0;
            } else {
              L1: {
                param1 = param1 >>> 16;
                var2 += 16;
                if (-257 > param1) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L1;
                }
              }
              L2: {
                if (16 > param1) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              L3: {
                if (param1 <= -5) {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-2 <= param1) {
                  param1 = param1 >>> 1;
                  var2++;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (param0 >= 1) {
                return param1 + var2;
              } else {
                rj.i(28);
                return param1 + var2;
              }
            }
          }
        }
        L5: {
          if (-257 < (param1 ^ -1)) {
            break L5;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L5;
          }
        }
        L6: {
          if (16 > param1) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        L7: {
          if (param1 <= -5) {
            var2 += 2;
            param1 = param1 >>> 2;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (-2 <= param1) {
            param1 = param1 >>> 1;
            var2++;
            break L8;
          } else {
            break L8;
          }
        }
        if (param0 < 1) {
          rj.i(28);
          return param1 + var2;
        } else {
          return param1 + var2;
        }
    }

    final static void a(int param0, bc param1, bc param2) {
        if (param0 > -25) {
            int discarded$0 = rj.c(122, 49);
        }
    }

    rj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 5);
    }

    final int a(int param0, byte param1) {
        if (param1 >= -25) {
            return -96;
        }
        return param0 >> 388178881;
    }

    final int b(ln param0, int param1) {
        int var3 = 0;
        if (null != param0.field_y) {
          var3 = param0.field_x;
          if (param1 < 41) {
            L0: {
              int discarded$1 = ((rj) this).a(-5, (byte) 83);
              if (param0.field_u) {
                var3 = var3 * 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var3 = var3 + ((rj) this).a(-5, param0);
              if (var3 < 1) {
                var3 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            return var3;
          } else {
            L2: {
              if (param0.field_u) {
                var3 = var3 * 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var3 = var3 + ((rj) this).a(-5, param0);
              if (var3 < 1) {
                var3 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            return var3;
          }
        } else {
          return super.b(param0, 100);
        }
    }

    final int[] b(int param0) {
        int var2 = 24 / ((param0 - -48) / 61);
        return new int[]{16, 18};
    }

    final int d(ln param0, int param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ((rj) this).a(-5, param0);
        if (param1 != 2) {
          L0: {
            int discarded$13 = ((rj) this).a(50, (byte) 72);
            if (-1 == var3) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = var3;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-1 == var3) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = var3;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
    }
}
