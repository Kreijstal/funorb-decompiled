/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends d {
    int field_R;
    int field_K;
    int field_W;
    static String field_V;
    static wq field_N;
    static boolean field_L;
    int field_Q;
    static cd field_X;
    static String field_T;
    static mf field_S;
    int field_Z;
    static String field_P;
    static String field_Y;
    static int field_U;
    int field_O;
    static String field_M;

    public static void a(int param0) {
        field_V = null;
        field_M = null;
        field_N = null;
        field_P = null;
        field_S = null;
        if (param0 < 89) {
          int discarded$2 = vh.h(64);
          field_X = null;
          field_T = null;
          field_Y = null;
          return;
        } else {
          field_X = null;
          field_T = null;
          field_Y = null;
          return;
        }
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param1 + (-((vh) this).field_o + -param2) + -((vh) this).field_Z;
          var9 = -param3 - ((vh) this).field_w - ((vh) this).field_R + param5;
          if (var8 * var8 + var9 * var9 < ((vh) this).field_W * ((vh) this).field_W) {
            var10 = Math.atan2((double)var9, (double)var8) - hh.field_d;
            if (0.0 <= var10) {
              L0: {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((vh) this).field_K;
                  break L0;
                }
              }
              ((vh) this).field_O = (int)(var10 * (double)((vh) this).field_K / 6.283185307179586);
              L1: while (true) {
                if (((vh) this).field_K <= ((vh) this).field_O) {
                  ((vh) this).field_O = ((vh) this).field_O - ((vh) this).field_K;
                  continue L1;
                } else {
                  L2: while (true) {
                    if ((((vh) this).field_O ^ -1) <= -1) {
                      return true;
                    } else {
                      ((vh) this).field_O = ((vh) this).field_O + ((vh) this).field_K;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((vh) this).field_K;
              ((vh) this).field_O = (int)(var10 * (double)((vh) this).field_K / 6.283185307179586);
              L3: while (true) {
                if (((vh) this).field_K <= ((vh) this).field_O) {
                  ((vh) this).field_O = ((vh) this).field_O - ((vh) this).field_K;
                  continue L3;
                } else {
                  L4: while (true) {
                    if ((((vh) this).field_O ^ -1) <= -1) {
                      return true;
                    } else {
                      ((vh) this).field_O = ((vh) this).field_O + ((vh) this).field_K;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static int h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var1 = 0;
        L0: while (true) {
          if (!jl.a((byte) 5)) {
            L1: {
              fi.field_r.a(aj.a(param0 + param0, po.field_a, pq.field_k), param0 ^ 27479, aj.a(0, qo.field_O, tb.field_fb));
              if (!fi.field_r.a((byte) 113)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            var2 = 0;
            if (var1 != 0) {
              if ((fi.field_r.field_j ^ -1) <= -1) {
                var2 = hi.field_A[fi.field_r.field_j];
                if (var2 != 2) {
                  return var2;
                } else {
                  ae.b((byte) 99);
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          } else {
            fi.field_r.d(param0 + -1);
            if (fi.field_r.a((byte) 113)) {
              var1 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var4 = 25 % ((param1 - -25) / 49);
        ik.field_g = up.field_v;
        if (-256 == param0) {
            ni.field_Rb = cd.a(true, -14 > vo.field_x ? true : false);
        } else {
            if (-101 < (param0 ^ -1)) {
                ni.field_Rb = i.a(param0, -126, param2);
                return;
            }
            if ((param0 ^ -1) < -106) {
                ni.field_Rb = i.a(param0, -126, param2);
                return;
            }
            ni.field_Rb = lm.a(-2079, param3);
            return;
        }
    }

    private vh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Sticky: any balls that hit the paddle stick to it";
        field_T = "Basic Bricks";
        field_X = new cd(3);
        field_Y = "Report abuse";
        field_P = "Waiting for fonts";
        field_M = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
