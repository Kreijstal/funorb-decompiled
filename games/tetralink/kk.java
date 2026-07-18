/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ae {
    private vd field_Q;
    static String field_R;
    int field_W;
    static String field_P;
    static int[] field_T;
    static long field_U;
    int field_V;
    static cl[] field_X;
    private int field_S;

    public static void h() {
        field_X = null;
        field_P = null;
        field_T = null;
        field_R = null;
    }

    final int a(int param0) {
        if (param0 != 23329) {
            oh[] discarded$0 = kk.a(113, 9, -96, 50, (byte) -124);
        }
        return ((kk) this).field_S;
    }

    final static oh[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 >= -9) {
            field_R = null;
        }
        return lf.a(1, param2, param0, param3, 1, 1, 3, (byte) -112, param1);
    }

    final int a(int param0, byte param1) {
        L0: {
          if (param1 > 110) {
            break L0;
          } else {
            ((kk) this).field_W = -87;
            break L0;
          }
        }
        L1: {
          if (0 > param0) {
            break L1;
          } else {
            if (param0 >= ((kk) this).field_Q.a(false)) {
              break L1;
            } else {
              return ((kk) this).field_Q.a(param0, (byte) 11);
            }
          }
        }
        return -1;
    }

    final static void g() {
        if (!(!hi.field_a)) {
            ra.e(ra.field_j, ra.field_i, ra.field_l - ra.field_j, -ra.field_i + ra.field_g);
            ck.field_bb.a(false, 256);
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var14 = TetraLink.field_J;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((kk) this).field_W + param6 - param1;
                var9 = -(((kk) this).field_W * 2) + ((kk) this).field_F;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = ((kk) this).field_S * var8_int / var9;
                if (param2 != 1) {
                  if (param2 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= ((kk) this).field_Q.a(false)) {
                        if (var11 >= 0) {
                          ((kk) this).field_Q.a(0, var11);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          var13 = ((kk) this).field_Q.a(var12, (byte) 11) - var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((kk) this).field_Q.a((byte) 91, var8_int);
                  break L3;
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("kk.PA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static int i() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var3 = TetraLink.field_J;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!nj.b((byte) 28)) {
                L2: {
                  hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 121), ai.a(ci.field_B, li.field_o, -28), (byte) 93);
                  if (!hb.field_a.b(83)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (hb.field_a.field_b < 0) {
                      break L3;
                    } else {
                      var2 = j.field_x[hb.field_a.field_b];
                      if (var2 != 2) {
                        break L3;
                      } else {
                        ld.i(-21719);
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                hb.field_a.a(120);
                if (!hb.field_a.b(83)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "kk.A(" + -91 + ')');
        }
        return stackIn_13_0;
    }

    final int e(byte param0) {
        if (param0 > -97) {
            ((kk) this).field_S = 71;
        }
        return ((kk) this).field_Q.a(false);
    }

    private kk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Remove name";
        field_T = new int[8192];
        field_R = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_X = new cl[11];
    }
}
