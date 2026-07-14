/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends mf {
    static dd field_H;
    static tk field_J;
    static int field_S;
    static lb field_M;
    boolean field_W;
    private int field_G;
    private km field_P;
    private int field_K;
    private int field_T;
    static int field_U;
    private km field_N;
    private km field_I;
    static String field_D;
    private int field_F;
    private int field_X;
    static int field_Q;
    int field_L;
    private km[] field_O;
    private int field_V;
    static a field_R;

    final static void a(byte param0, String param1) {
        lf.field_N = param1;
        if (param0 >= -41) {
            field_U = 107;
        }
    }

    private final void e(byte param0) {
        ((rm) this).field_O = new km[]{this.c(-72, ((rm) this).field_K, ((rm) this).field_F), this.c(-43, ((rm) this).field_X, ((rm) this).field_V)};
        int var2 = -46 / ((-5 - param0) / 54);
        ((rm) this).field_P = this.f((byte) 8);
        ((rm) this).field_N = ((rm) this).field_P.b();
        ((rm) this).field_I = new km(((rm) this).field_C >> 1279387489, ((rm) this).field_C);
    }

    rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 850101921, 8355711 & param6 >> 315768929);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.e((byte) 53);
    }

    private final void a(int param0, km param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        var5 = param3 - -((rm) this).field_y;
        cf.b(param0 + ((rm) this).field_C, -((rm) this).field_P.field_w + var5, param0, 80, param3 - -((rm) this).field_P.field_w);
        var6 = param3 - ((rm) this).field_G;
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              fd.a(param2 + 28773);
              if (wb.field_i > param3 + ((rm) this).field_P.field_w) {
                break L1;
              } else {
                tl.a((byte) -67, ((rm) this).field_I);
                param1.b(-((rm) this).field_G, 0);
                param1.b(((rm) this).field_T * 2 - ((rm) this).field_G, 0);
                ((rm) this).field_N.e(0, 0);
                fd.a(28773);
                ((rm) this).field_I.b(param3, param0);
                break L1;
              }
            }
            L2: {
              if (-((rm) this).field_P.field_w + var5 > wb.field_j) {
                break L2;
              } else {
                tl.a((byte) -67, ((rm) this).field_I);
                var7 = ((rm) this).field_G + -((rm) this).field_P.field_w + ((rm) this).field_y;
                L3: while (true) {
                  if (var7 <= ((rm) this).field_T * 2) {
                    param1.b(-var7, 0);
                    param1.b(2 * ((rm) this).field_T - var7, 0);
                    ((rm) this).field_P.e(0, 0);
                    fd.a(28773);
                    ((rm) this).field_I.b(var5 - ((rm) this).field_P.field_w, param0);
                    break L2;
                  } else {
                    var7 = var7 - ((rm) this).field_T * 2;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              if (param2 == 0) {
                break L4;
              } else {
                field_D = null;
                break L4;
              }
            }
            return;
          } else {
            param1.b(var6, param0);
            var6 = var6 + param1.field_w;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (param2 > -80) {
            return;
        }
        int var5 = ((rm) this).field_u + param3;
        int var6 = ((rm) this).field_r + param0;
        this.a(var6, ((rm) this).field_O[0], 0, var5);
        if ((((rm) this).field_L ^ -1) > -65537) {
            cf.b(((rm) this).field_C + var6, ((rm) this).field_y + var5, var6, 80, var5 + (((rm) this).field_y * ((rm) this).field_L >> 1895798064));
            this.a(var6, ((rm) this).field_O[1], 0, var5);
            fd.a(28773);
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_J = null;
        field_H = null;
        field_M = null;
        field_R = null;
        if (param0 != 850101921) {
            Object var2 = null;
            rm.a((byte) 93, (String) null);
        }
    }

    final void a(int param0, int param1, mf param2, int param3) {
        if (param1 >= -6) {
            return;
        }
        if (((rm) this).field_W) {
            ((rm) this).field_G = ((rm) this).field_G + 1;
            if (((rm) this).field_G > 2 * ((rm) this).field_T) {
                ((rm) this).field_G = ((rm) this).field_G - 2 * ((rm) this).field_T;
            }
        }
    }

    private final km f(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Chess.field_G;
        if (param0 != 8) {
            rm.a(-18);
        }
        int var2 = ((rm) this).field_C >> 252023937;
        km var3 = new km(var2, ((rm) this).field_C);
        tl.a((byte) -67, var3);
        for (var4 = 0; var4 < ((rm) this).field_C; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((rm) this).field_C + -var4) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                wb.a(var5, var4, var8 << 529527376 | (var8 | var8 << -54504280));
            }
        }
        fd.a(param0 + 28765);
        return var3;
    }

    final static int a(p param0, String param1, int param2) {
        int var3 = param0.field_l;
        CharSequence var5 = (CharSequence) (Object) param1;
        byte[] var4 = dj.a(var5, 0);
        param0.b((byte) -127, var4.length);
        param0.field_l = param0.field_l + cg.field_c.a(true, var4.length, 0, var4, param0.field_o, param0.field_l);
        if (param2 != 16711422) {
            rm.a(-114);
        }
        return -var3 + param0.field_l;
    }

    private final km c(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Chess.field_G;
        var14 = new km(((rm) this).field_T * 2, ((rm) this).field_C);
        tl.a((byte) -67, var14);
        var5 = ((rm) this).field_C >> 808949633;
        var6 = 0;
        L0: while (true) {
          if (((rm) this).field_C <= var6) {
            L1: {
              if (param0 <= -14) {
                break L1;
              } else {
                field_Q = -78;
                break L1;
              }
            }
            fd.a(28773);
            return var14;
          } else {
            L2: {
              var7 = (((rm) this).field_T * 2 + -1) * (var6 >> -594013343) % (((rm) this).field_T * 2);
              var8 = param2 & 16711935;
              var9 = param2 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 >= 256) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1843008696;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              wb.a(var7, var6, ((rm) this).field_T, var12);
              wb.a(-(((rm) this).field_T * 2) + var7, var6, ((rm) this).field_T, var12);
              var8 = param1 & 16711935;
              var9 = param1 & 65280;
              if (var11 < 256) {
                stackOut_7_0 = (16711680 & var11 * var9 | -16711936 & var11 * var8) >>> -310104312;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            wb.a(var7 - -((rm) this).field_T, var6, ((rm) this).field_T, var12);
            wb.a(var7 + -((rm) this).field_T, var6, ((rm) this).field_T, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        ((rm) this).field_K = param2;
        ((rm) this).field_X = (16711422 & param2) >> -687956511;
        ((rm) this).field_F = param0;
        ((rm) this).field_V = (16711422 & param0) >> 56219521;
        if (param1 != 15016) {
            ((rm) this).b(-91, -5, 76);
        }
        this.e((byte) -73);
    }

    private rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rm) this).field_F = param5;
        ((rm) this).field_V = param7;
        ((rm) this).field_X = param8;
        ((rm) this).field_K = param6;
        ((rm) this).field_T = param4;
        ((rm) this).a(param1, 34, param3, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please enter your age in years";
        field_J = new tk();
    }
}
