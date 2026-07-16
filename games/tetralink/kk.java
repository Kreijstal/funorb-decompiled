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

    public static void h(int param0) {
        field_X = null;
        field_P = null;
        if (param0 != 2147483647) {
            field_X = null;
        }
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

    final static void g(int param0) {
        if (param0 != -1) {
            return;
        }
        if (!(!hi.field_a)) {
            ra.e(ra.field_j, ra.field_i, ra.field_l - ra.field_j, -ra.field_i + ra.field_g);
            ck.field_bb.a(false, param0 + 257);
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TetraLink.field_J;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((kk) this).field_W + param6 - param1;
            var9 = -(((kk) this).field_W * 2) + ((kk) this).field_F;
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var8) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = ((kk) this).field_S * var8 / var9;
            if ((param2 ^ -1) != -2) {
              if ((param2 ^ -1) != -3) {
                break L2;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((kk) this).field_Q.a(false)) {
                    if (-1 >= (var11 ^ -1)) {
                      ((kk) this).field_Q.a(0, var11);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = ((kk) this).field_Q.a(var12, (byte) 11) - var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              ((kk) this).field_Q.a((byte) 91, var8);
              break L2;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    final static int i(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        var1 = 0;
        if (param0 <= -47) {
          L0: while (true) {
            if (!nj.b((byte) 28)) {
              L1: {
                hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 121), ai.a(ci.field_B, li.field_o, -28), (byte) 93);
                if (!hb.field_a.b(83)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              L2: {
                var2 = 0;
                if (var1 == 0) {
                  break L2;
                } else {
                  if ((hb.field_a.field_b ^ -1) > -1) {
                    break L2;
                  } else {
                    var2 = j.field_x[hb.field_a.field_b];
                    if (var2 != 2) {
                      break L2;
                    } else {
                      ld.i(-21719);
                      break L2;
                    }
                  }
                }
              }
              return var2;
            } else {
              hb.field_a.a(120);
              if (!hb.field_a.b(83)) {
                continue L0;
              } else {
                var1 = 1;
                continue L0;
              }
            }
          }
        } else {
          return -48;
        }
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
