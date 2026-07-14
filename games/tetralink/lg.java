/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends na {
    int field_bb;
    static String field_I;
    private int field_T;
    private oh field_L;
    private int field_U;
    private oh field_P;
    static boolean field_S;
    private int field_M;
    private int field_W;
    static int field_X;
    static String field_O;
    private int field_N;
    private oh[] field_Q;
    static String field_Z;
    boolean field_K;
    static int[] field_ab;
    private int field_J;
    private oh field_Y;
    static String field_V;

    private final oh a(int param0) {
        int var4 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = TetraLink.field_J;
        int var2 = ((lg) this).field_u >> 1425297281;
        oh var3 = new oh(var2, ((lg) this).field_u);
        sk.a((byte) 117, var3);
        int var5 = -120 % ((2 - param0) / 39);
        for (var4 = 0; var4 < ((lg) this).field_u; var4++) {
            for (var6 = 0; var2 > var6; var6++) {
                var7 = (double)var6 * (double)var6 / (double)((((lg) this).field_u - var4) * var4);
                var9 = 1;
                if (var7 < 1.0) {
                    var7 = Math.sqrt(-var7 + 1.0);
                    var9 = 1.0 > var7 ? (int)(var7 * 255.0) : 255;
                }
                ra.a(var6, var4, var9 << 300252072 | var9 | var9 << 1832273328);
            }
        }
        dh.a(-581);
        return var3;
    }

    public static void d(byte param0) {
        field_ab = null;
        field_O = null;
        field_V = null;
        field_I = null;
        if (param0 >= -99) {
            return;
        }
        field_Z = null;
    }

    private final oh a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        oh var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = TetraLink.field_J;
        var14 = new oh(((lg) this).field_U * 2, ((lg) this).field_u);
        sk.a((byte) 112, var14);
        var5 = ((lg) this).field_u >> 353317665;
        var6 = 0;
        L0: while (true) {
          if (((lg) this).field_u <= var6) {
            if (param1 < -15) {
              dh.a(-581);
              return var14;
            } else {
              return null;
            }
          } else {
            L1: {
              var7 = (var6 >> -351823231) * (2 * ((lg) this).field_U - 1) % (((lg) this).field_U * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = 128 - -(int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (256 > var11) {
                stackOut_4_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> -1643299064;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ra.g(var7, var6, ((lg) this).field_U, var12);
              var8 = param0 & 16711935;
              var9 = 65280 & param0;
              ra.g(-(2 * ((lg) this).field_U) + var7, var6, ((lg) this).field_U, var12);
              if (-257 < (var11 ^ -1)) {
                stackOut_7_0 = (-16711936 & var8 * var11 | 16711680 & var9 * var11) >>> -1423673784;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ra.g(((lg) this).field_U + var7, var6, ((lg) this).field_U, var12);
            ra.g(var7 + -((lg) this).field_U, var6, ((lg) this).field_U, var12);
            var6++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (!param2) {
            ra.a();
        } else {
            ra.d(0, 0, ra.field_f, ra.field_e, 0, 192);
        }
        if (param1 != 1) {
            field_X = 111;
        }
        i.b(param2, param1 + 107);
    }

    lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1409307521 & 8355711, param6 >> -1358817631 & 8355711);
    }

    private final void g(int param0) {
        ((lg) this).field_Q = new oh[]{this.a(((lg) this).field_W, (byte) -55, ((lg) this).field_T), this.a(((lg) this).field_N, (byte) -77, ((lg) this).field_J)};
        ((lg) this).field_L = this.a(param0 + -308991302);
        ((lg) this).field_P = ((lg) this).field_L.a();
        ((lg) this).field_Y = new oh(((lg) this).field_u >> 308991265, ((lg) this).field_u);
        if (param0 != 308991265) {
            oh discarded$0 = this.a(-5);
        }
    }

    final static String a(boolean param0, char param1) {
        if (param0) {
            String discarded$0 = lg.a(false, '￐');
        }
        return String.valueOf(param1);
    }

    private final void a(int param0, oh param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        var5 = ((lg) this).field_F + param0;
        kl.a(-((lg) this).field_L.field_u + var5, param2 + ((lg) this).field_u, param2, (byte) -79, ((lg) this).field_L.field_u + param0);
        var6 = param0 - ((lg) this).field_M;
        var7 = 10 % ((param3 - 44) / 63);
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              dh.a(-581);
              if (param0 + ((lg) this).field_L.field_u >= ra.field_j) {
                sk.a((byte) 118, ((lg) this).field_Y);
                param1.c(-((lg) this).field_M, 0);
                param1.c(2 * ((lg) this).field_U + -((lg) this).field_M, 0);
                ((lg) this).field_P.e(0, 0);
                dh.a(-581);
                ((lg) this).field_Y.c(param0, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ra.field_l >= -((lg) this).field_L.field_u + var5) {
                sk.a((byte) 116, ((lg) this).field_Y);
                var8 = ((lg) this).field_M + -((lg) this).field_L.field_u + ((lg) this).field_F;
                L3: while (true) {
                  if (var8 <= 2 * ((lg) this).field_U) {
                    param1.c(-var8, 0);
                    param1.c(((lg) this).field_U * 2 + -var8, 0);
                    ((lg) this).field_L.e(0, 0);
                    dh.a(-581);
                    ((lg) this).field_Y.c(-((lg) this).field_L.field_u + var5, param2);
                    break L2;
                  } else {
                    var8 = var8 - 2 * ((lg) this).field_U;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            param1.c(var6, param2);
            var6 = var6 + param1.field_u;
            continue L0;
          }
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        if (!param3) {
            return;
        }
        if (((lg) this).field_K) {
            ((lg) this).field_M = ((lg) this).field_M + 1;
            if (((lg) this).field_M > ((lg) this).field_U * 2) {
                ((lg) this).field_M = ((lg) this).field_M - ((lg) this).field_U * 2;
            }
        }
    }

    final void b(int param0, int param1, int param2) {
        ((lg) this).field_N = 8355711 & param2 >> -1369303359;
        ((lg) this).field_T = param1;
        int var4 = 63 / ((66 - param0) / 52);
        ((lg) this).field_W = param2;
        ((lg) this).field_J = 8355711 & param1 >> 967080481;
        this.g(308991265);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != param3) {
            return;
        }
        int var5 = ((lg) this).field_t + param1;
        int var6 = ((lg) this).field_w + param2;
        this.a(var5, ((lg) this).field_Q[0], var6, (byte) 124);
        if (65536 > ((lg) this).field_bb) {
            kl.a(var5 - -((lg) this).field_F, ((lg) this).field_u + var6, var6, (byte) -79, (((lg) this).field_bb * ((lg) this).field_F >> 707456304) + var5);
            this.a(var5, ((lg) this).field_Q[1], var6, (byte) 119);
            dh.a(-581);
        }
    }

    private lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((lg) this).field_W = param6;
        ((lg) this).field_T = param5;
        ((lg) this).field_J = param7;
        ((lg) this).field_N = param8;
        ((lg) this).field_U = param4;
        ((lg) this).a(param3, param1, 86, param0, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -19 % ((param2 - -61) / 51);
        super.a(param0, param1, 90, param3, param4);
        this.g(308991265);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Suggest muting this player";
        field_O = "Accept draw";
        field_Z = "Month";
        field_ab = new int[16384];
        field_V = "Playing";
    }
}
