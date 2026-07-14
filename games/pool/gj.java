/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ei {
    private int field_J;
    static dd field_T;
    static java.applet.Applet field_W;
    static int field_S;
    static lr field_R;
    private int field_Q;
    private int field_I;
    private int field_M;
    private dd field_H;
    static vh field_K;
    boolean field_N;
    private int field_V;
    private dd[] field_O;
    int field_P;
    private dd field_U;
    static int field_G;
    private dd field_F;
    private int field_L;

    private final dd a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param2 >= 82) {
            break L0;
          } else {
            ((gj) this).a(-24, (byte) -90, 11, -53);
            break L0;
          }
        }
        var13 = new dd(2 * ((gj) this).field_Q, ((gj) this).field_y);
        kj.a(113, var13);
        var5 = ((gj) this).field_y >> -2028675135;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((gj) this).field_y) {
            oc.a(122);
            return var13;
          } else {
            L2: {
              var7 = (2 * ((gj) this).field_Q - 1) * (var6 >> 897207137) % (((gj) this).field_Q * 2);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_6_0 = (var8 * var11 & -16711936 | var11 * var9 & 16711680) >>> 1549569256;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var8 | var9;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              qh.f(var7, var6, ((gj) this).field_Q, var12);
              qh.f(-(((gj) this).field_Q * 2) + var7, var6, ((gj) this).field_Q, var12);
              var9 = param0 & 65280;
              var8 = 16711935 & param0;
              if (256 <= var11) {
                stackOut_9_0 = var8 | var9;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> -450608568;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            qh.f(((gj) this).field_Q + var7, var6, ((gj) this).field_Q, var12);
            qh.f(-((gj) this).field_Q + var7, var6, ((gj) this).field_Q, var12);
            var6++;
            continue L1;
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2 = 0;
        if (!(p.a(param1, (byte) -113, true))) {
            return false;
        }
        for (var2 = 0; param1.length() > var2; var2++) {
            if (!(ul.a(param1.charAt(var2), (byte) 124))) {
                return false;
            }
        }
        if (param0 != -25908) {
            Object var3 = null;
            boolean discarded$0 = gj.a((byte[]) null, 26, -23);
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) 33);
    }

    private final dd a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var2 = ((gj) this).field_y >> 479474529;
        dd var3 = new dd(var2, ((gj) this).field_y);
        kj.a(55, var3);
        for (var4 = 0; var4 < ((gj) this).field_y; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((gj) this).field_y) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(var6 * 255.0) : 255;
                }
                qh.a(var5, var4, var8 | var8 << -1675841944 | var8 << 1969118544);
            }
        }
        if (param0 != 16711422) {
            dd discarded$0 = this.a(24, 48, (byte) -125);
        }
        oc.a(117);
        return var3;
    }

    private final void a(boolean param0, int param1, int param2, dd param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = param1 - -((gj) this).field_l;
        wh.a(param1 - -((gj) this).field_U.field_z, param2, var5 + -((gj) this).field_U.field_z, (byte) 31, param2 + ((gj) this).field_y);
        var6 = -((gj) this).field_J + param1;
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((gj) this).field_U = null;
                break L1;
              }
            }
            L2: {
              oc.a(121);
              if (qh.field_b > param1 - -((gj) this).field_U.field_z) {
                break L2;
              } else {
                kj.a(43, ((gj) this).field_H);
                param3.c(-((gj) this).field_J, 0);
                param3.c(-((gj) this).field_J + 2 * ((gj) this).field_Q, 0);
                ((gj) this).field_F.d(0, 0);
                oc.a(114);
                ((gj) this).field_H.c(param1, param2);
                break L2;
              }
            }
            L3: {
              if (var5 + -((gj) this).field_U.field_z <= qh.field_j) {
                kj.a(86, ((gj) this).field_H);
                var7 = -((gj) this).field_U.field_z + (((gj) this).field_l - -((gj) this).field_J);
                L4: while (true) {
                  if (var7 <= ((gj) this).field_Q * 2) {
                    param3.c(-var7, 0);
                    param3.c(((gj) this).field_Q * 2 - var7, 0);
                    ((gj) this).field_U.d(0, 0);
                    oc.a(121);
                    ((gj) this).field_H.c(var5 - ((gj) this).field_U.field_z, param2);
                    break L3;
                  } else {
                    var7 = var7 - ((gj) this).field_Q * 2;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param3.c(var6, param2);
            var6 = var6 + param3.field_z;
            continue L0;
          }
        }
    }

    gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -3158015, (param6 & 16711422) >> 1694520737);
    }

    public static void a(boolean param0) {
        field_T = null;
        field_W = null;
        if (!param0) {
            field_K = null;
        }
        field_K = null;
        field_R = null;
    }

    final static boolean a(byte[] param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            field_R = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (2 > param1) {
              break L2;
            } else {
              if (nj.a(param1, 125, param0, ml.field_h)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        int var6 = 23 / ((-42 - param1) / 53);
        int var5 = ((gj) this).field_C + param2;
        int var7 = ((gj) this).field_D + param3;
        this.a(false, var5, var7, ((gj) this).field_O[0]);
        if (!(-65537 >= (((gj) this).field_P ^ -1))) {
            wh.a(var5 - -(((gj) this).field_l * ((gj) this).field_P >> -1950173584), var7, ((gj) this).field_l + var5, (byte) -116, var7 - -((gj) this).field_y);
            this.a(false, var5, var7, ((gj) this).field_O[1]);
            oc.a(112);
        }
    }

    private final void f(byte param0) {
        ((gj) this).field_O = new dd[]{this.a(((gj) this).field_M, ((gj) this).field_V, (byte) 108), this.a(((gj) this).field_L, ((gj) this).field_I, (byte) 110)};
        if (param0 <= 8) {
            Object var3 = null;
            boolean discarded$0 = gj.a((byte[]) null, -61, 57);
        }
        ((gj) this).field_U = this.a(16711422);
        ((gj) this).field_F = ((gj) this).field_U.a();
        ((gj) this).field_H = new dd(((gj) this).field_y >> 189332897, ((gj) this).field_y);
    }

    final void a(int param0, int param1, int param2) {
        ((gj) this).field_M = param0;
        ((gj) this).field_V = param2;
        ((gj) this).field_L = (16711422 & param0) >> 95685697;
        if (param1 != 19365) {
            ((gj) this).field_N = false;
        }
        ((gj) this).field_I = 8355711 & param2 >> -978406943;
        this.f((byte) 83);
    }

    final static ij a(boolean param0, int param1, String param2, String param3) {
        qg.a((byte) 48, param1);
        ij var4 = new ij(param1);
        if (!param0) {
            return null;
        }
        var4.a(param2, (byte) 87, param3);
        nd.field_i.b((byte) 92, (ma) (Object) var4);
        return var4;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        if (param1 != 958) {
            ((gj) this).a(-58, 31, -62, true, -86);
        }
        if (((gj) this).field_N) {
            ((gj) this).field_J = ((gj) this).field_J + 1;
            if (!(((gj) this).field_J <= ((gj) this).field_Q * 2)) {
                ((gj) this).field_J = ((gj) this).field_J - 2 * ((gj) this).field_Q;
            }
        }
    }

    private gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((gj) this).field_M = param6;
        ((gj) this).field_L = param8;
        ((gj) this).field_V = param5;
        ((gj) this).field_I = param7;
        ((gj) this).field_Q = param4;
        ((gj) this).a(param2, param0, param3, false, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
    }
}
