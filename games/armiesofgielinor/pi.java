/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fw {
    private fh field_Q;
    int field_R;
    private int field_L;
    int field_S;
    static int[][] field_M;
    static String field_P;
    static je field_N;
    static wk field_T;
    static String field_O;

    final int a(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
          if (param0 < ((pi) this).field_Q.a(-102)) {
            if (param1 != -47) {
              return -9;
            } else {
              return ((pi) this).field_Q.d(param0, 652110180);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 != -39) {
            return -55;
        }
        return ((pi) this).field_Q.a(param0 ^ 85);
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 > 103) {
          if (this.a(param0, param1, param2, 122, param4, param5, param6)) {
            L0: {
              var8 = -param1 + (param0 + -((pi) this).field_R);
              var9 = -(((pi) this).field_R * 2) + ((pi) this).field_l;
              if (var8 > var9) {
                var8 = var9;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = ((pi) this).field_L * var8 / var9;
            if (-2 != param6) {
              if (-3 == param6) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L2: while (true) {
                  if (((pi) this).field_Q.a(-125) <= var12) {
                    if (0 <= var11) {
                      ((pi) this).field_Q.b(var11, -66);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    var13 = ((pi) this).field_Q.d(var12, 652110180) - var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L2;
                    } else {
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((pi) this).field_Q.e(26884, var8);
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_N = null;
          if (this.a(param0, param1, param2, 122, param4, param5, param6)) {
            L3: {
              var8 = -param1 + (param0 + -((pi) this).field_R);
              var9 = -(((pi) this).field_R * 2) + ((pi) this).field_l;
              if (var8 > var9) {
                var8 = var9;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var8 < 0) {
                var8 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            var8 = ((pi) this).field_L * var8 / var9;
            if (-2 != param6) {
              if (-3 == param6) {
                L5: {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  if (((pi) this).field_Q.a(-125) <= var12) {
                    break L5;
                  } else {
                    L6: {
                      var13 = ((pi) this).field_Q.d(var12, 652110180) - var8;
                      var13 = var13 * var13;
                      if (var13 >= var10) {
                        var12++;
                        break L6;
                      } else {
                        var10 = var13;
                        var11 = var12;
                        break L6;
                      }
                    }
                    var12++;
                    var12++;
                    var12++;
                    break L5;
                  }
                }
                if (0 <= var11) {
                  ((pi) this).field_Q.b(var11, -66);
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((pi) this).field_Q.e(26884, var8);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final int a(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((pi) this).a(104, -75, 118, -4, (kb) null, 10, 30);
          return ((pi) this).field_L;
        } else {
          return ((pi) this).field_L;
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_P = null;
        field_M = null;
        if (param0 != -63) {
            return;
        }
        field_N = null;
        field_T = null;
    }

    private pi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Most units";
        field_M = new int[][]{null, null, null, new int[4], null, new int[5]};
        field_O = "Just play";
    }
}
