/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends fi {
    static int field_x;
    private mg[] field_D;
    private int field_K;
    private int field_H;
    boolean field_z;
    private int field_y;
    private mg field_I;
    static km field_E;
    static String field_G;
    private mg field_B;
    private int field_J;
    private int field_F;
    private mg field_A;
    int field_C;
    private int field_L;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 407260353 & 8355711, param6 >> 384825825 & 8355711);
    }

    final static bk a(String param0, int param1, String param2, boolean param3) {
        CharSequence var7 = null;
        if (param1 != 16711935) {
            dg.a((byte) 84);
        }
        long var4 = 0L;
        String var6 = null;
        if ((param0.indexOf('@') ^ -1) != 0) {
            var6 = param0;
        } else {
            var7 = (CharSequence) (Object) param0;
            var4 = jc.a(var7, (byte) -105);
        }
        return pl.a(var4, var6, 127, param2, param3);
    }

    private final mg e(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var2 = ((dg) this).field_m >> 878667105;
        mg var3 = new mg(var2, ((dg) this).field_m);
        kb.a(var3, 16865);
        if (param0 < 63) {
            return null;
        }
        for (var4 = 0; ((dg) this).field_m > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((dg) this).field_m - var4) * var4);
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                df.a(var5, var4, var8 << 388355696 | (var8 | var8 << 761983656));
            }
        }
        ai.a(true);
        return var3;
    }

    private final void a(int param0, mg param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var5 = param2 - -((dg) this).field_g;
        uk.a(param0 + ((dg) this).field_m, 6, param2 - -((dg) this).field_A.field_w, -((dg) this).field_A.field_w + var5, param0);
        var6 = -((dg) this).field_L + param2;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (param3) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            ai.a(stackIn_6_0 != 0);
            if (!param3) {
              L2: {
                if (df.field_i <= ((dg) this).field_A.field_w + param2) {
                  kb.a(((dg) this).field_I, 16865);
                  param1.d(-((dg) this).field_L, 0);
                  param1.d(2 * ((dg) this).field_J - ((dg) this).field_L, 0);
                  ((dg) this).field_B.c(0, 0);
                  ai.a(true);
                  ((dg) this).field_I.d(param2, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-((dg) this).field_A.field_w + var5 <= df.field_k) {
                  kb.a(((dg) this).field_I, 16865);
                  var7 = ((dg) this).field_L + (-((dg) this).field_A.field_w + ((dg) this).field_g);
                  L4: while (true) {
                    if (((dg) this).field_J * 2 >= var7) {
                      param1.d(-var7, 0);
                      param1.d(-var7 + 2 * ((dg) this).field_J, 0);
                      ((dg) this).field_A.c(0, 0);
                      ai.a(true);
                      ((dg) this).field_I.d(-((dg) this).field_A.field_w + var5, param0);
                      break L3;
                    } else {
                      var7 = var7 - ((dg) this).field_J * 2;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            param1.d(var6, param0);
            var6 = var6 + param1.field_w;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        int var5 = ((dg) this).field_l + param1;
        int var6 = param2 - -((dg) this).field_u;
        this.a(var6, ((dg) this).field_D[0], var5, false);
        if (!(((dg) this).field_C >= 65536)) {
            uk.a(var6 + ((dg) this).field_m, 6, (((dg) this).field_C * ((dg) this).field_g >> 49496464) + var5, var5 + ((dg) this).field_g, var6);
            this.a(var6, ((dg) this).field_D[1], var5, false);
            ai.a(true);
        }
        if (param0 != 37) {
            mg discarded$0 = this.c(-103, -91, 31);
        }
    }

    private final void a(int param0) {
        ((dg) this).field_D = new mg[]{this.c(((dg) this).field_F, ((dg) this).field_H, -17), this.c(((dg) this).field_K, ((dg) this).field_y, param0 ^ -46)};
        ((dg) this).field_A = this.e(127);
        ((dg) this).field_B = ((dg) this).field_A.c();
        ((dg) this).field_I = new mg(((dg) this).field_m >> -1249187103, ((dg) this).field_m);
        if (param0 != 10) {
            field_G = null;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(10);
    }

    public static void a(byte param0) {
        field_G = null;
        if (param0 <= 13) {
            return;
        }
        field_E = null;
    }

    private final mg c(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mg var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          if (param2 <= -15) {
            break L0;
          } else {
            mg discarded$1 = this.e(93);
            break L0;
          }
        }
        var14 = new mg(((dg) this).field_J * 2, ((dg) this).field_m);
        kb.a(var14, 16865);
        var5 = ((dg) this).field_m >> 1547430305;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((dg) this).field_m) {
            ai.a(true);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -1159110911) * (-1 + 2 * ((dg) this).field_J) % (2 * ((dg) this).field_J);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 - var5;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
              if ((var11 ^ -1) > -257) {
                stackOut_6_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 1616609768;
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
              df.b(var7, var6, ((dg) this).field_J, var12);
              var8 = param0 & 16711935;
              df.b(var7 + -(2 * ((dg) this).field_J), var6, ((dg) this).field_J, var12);
              var9 = 65280 & param0;
              if (-257 >= (var11 ^ -1)) {
                stackOut_9_0 = var9 | var8;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (var9 * var11 & 16711680 | -16711936 & var8 * var11) >>> 814377800;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            df.b(var7 + ((dg) this).field_J, var6, ((dg) this).field_J, var12);
            df.b(var7 - ((dg) this).field_J, var6, ((dg) this).field_J, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void d(int param0, int param1, int param2) {
        ((dg) this).field_H = param1;
        ((dg) this).field_y = 8355711 & param1 >> -985797695;
        ((dg) this).field_K = (16711422 & param0) >> 286897985;
        if (param2 < 101) {
            ((dg) this).field_L = 41;
        }
        ((dg) this).field_F = param0;
        this.a(10);
    }

    final static void a(byte param0, int param1) {
        fe.field_Lb = jg.field_g[param1];
        if (param0 != -53) {
            field_x = -72;
        }
        aa.field_d = ve.field_r[param1];
        jd.field_b = o.field_b[param1];
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((dg) this).field_K = param8;
        ((dg) this).field_J = param4;
        ((dg) this).field_H = param5;
        ((dg) this).field_y = param7;
        ((dg) this).field_F = param6;
        ((dg) this).a(param3, true, param1, param0, param2);
    }

    final static void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        int var3 = 320;
        int var4 = 240;
        param0 = param0 / 2;
        param2 = param2 / 2;
        int var5 = 2 + (int)((Math.cos((double)((float)id.field_r / 20.0f)) + 1.0) * 8.0);
        if (param1 > -123) {
            field_G = null;
        }
        for (var6 = 0; 9 > var6; var6++) {
            var7 = (-var6 + 9) * var5 >>> -38989341;
            df.a(var3 + (-param2 + -var7), var4 - param0 - var7, param2 - -var7 << 1395215649, var7 + param0 << -1398436383, 10, 1141646, 26);
        }
        df.a(-param2 + var3, -param0 + var4, param2 << 1628823137, param0 << -1688161055, 10, 0, 180);
    }

    final void a(int param0, int param1, fi param2, int param3) {
        if (param1 < 113) {
            return;
        }
        if (((dg) this).field_z) {
            ((dg) this).field_L = ((dg) this).field_L + 1;
            if (!(((dg) this).field_J * 2 >= ((dg) this).field_L)) {
                ((dg) this).field_L = ((dg) this).field_L - ((dg) this).field_J * 2;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Achievements can only be obtained by playing Rated games";
    }
}
