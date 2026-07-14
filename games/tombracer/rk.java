/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends ae {
    private int field_u;
    private int field_C;
    boolean field_D;
    private int field_y;
    private int field_G;
    static String field_F;
    private int field_x;
    private iu field_z;
    int field_B;
    private iu field_E;
    private iu field_A;
    private iu[] field_w;
    private int field_v;

    final void a(boolean param0, int param1, int param2) {
        ((rk) this).field_G = 8355711 & param1 >> 152693825;
        ((rk) this).field_v = (param2 & 16711422) >> 1591472225;
        ((rk) this).field_C = param2;
        ((rk) this).field_x = param1;
        if (!param0) {
            return;
        }
        this.g((byte) 12);
    }

    public static void a(int param0) {
        if (param0 != 30548) {
            rk.a(-86);
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        if (param1 != 2097152) {
            iu discarded$0 = this.a((byte) 6);
        }
        if (((rk) this).field_D) {
            ((rk) this).field_y = ((rk) this).field_y + 1;
            if (!(2 * ((rk) this).field_u >= ((rk) this).field_y)) {
                ((rk) this).field_y = ((rk) this).field_y - 2 * ((rk) this).field_u;
            }
        }
    }

    private final iu a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = ((rk) this).field_p >> -1928290239;
        iu var3 = new iu(var2, ((rk) this).field_p);
        nm.a(var3, (byte) 93);
        if (param0 <= 66) {
            ((rk) this).field_z = null;
        }
        for (var4 = 0; var4 < ((rk) this).field_p; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((rk) this).field_p) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                bea.a(var5, var4, var8 << -447297816 | var8 | var8 << -2079713616);
            }
        }
        pfa.a(1);
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g((byte) 12);
    }

    private final void g(byte param0) {
        ((rk) this).field_w = new iu[]{this.c(-69, ((rk) this).field_C, ((rk) this).field_x), this.c(91, ((rk) this).field_v, ((rk) this).field_G)};
        if (param0 != 12) {
            ((rk) this).field_y = 10;
        }
        ((rk) this).field_A = this.a((byte) 78);
        ((rk) this).field_z = ((rk) this).field_A.d();
        ((rk) this).field_E = new iu(((rk) this).field_p >> 1965933377, ((rk) this).field_p);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        int var5 = param0 + ((rk) this).field_i;
        int var6 = param1 + ((rk) this).field_n;
        this.a(var6, ((rk) this).field_w[param2], var5, 93);
        if ((((rk) this).field_B ^ -1) > -65537) {
            tga.a(-21953, (((rk) this).field_B * ((rk) this).field_m >> 2004813072) + var5, ((rk) this).field_m + var5, var6, var6 - -((rk) this).field_p);
            this.a(var6, ((rk) this).field_w[1], var5, 115);
            pfa.a(param2 + 1);
        }
    }

    rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -1310161311 & 8355711, param6 >> 6140001 & 8355711);
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3, int param4, int param5, int param6) {
        if (!(!wqa.r((byte) -118))) {
            iqa.a(-109, param3, param5, param1);
            if (hka.field_b != null) {
                if (!(!hka.field_b.a(param1, param6, param0, param2 ^ -107, param3))) {
                    wp.a(-1);
                    param1 = false;
                }
            }
            fu.a(-83, param3, param1);
            kma.a(param1, 104, param4);
            param1 = false;
        }
        if (param2 != 107) {
            boolean discarded$0 = rk.a(-24, false, (byte) 37, -109, 107, 111, -35);
        }
        return param1;
    }

    private final iu c(int param0, int param1, int param2) {
        int var4 = 0;
        iu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        var4 = 29 % ((28 - param0) / 61);
        var5 = new iu(2 * ((rk) this).field_u, ((rk) this).field_p);
        nm.a(var5, (byte) 110);
        var6 = ((rk) this).field_p >> 905605601;
        var7 = 0;
        L0: while (true) {
          if (((rk) this).field_p <= var7) {
            pfa.a(1);
            return var5;
          } else {
            L1: {
              var8 = (var7 >> 1525506497) * (((rk) this).field_u * 2 - 1) % (2 * ((rk) this).field_u);
              var9 = 16711935 & param1;
              var10 = 65280 & param1;
              var11 = var7 - var6;
              var12 = (int)(128.0 * (Math.sqrt((double)(var6 * var6 - var11 * var11)) / (double)var6)) + 128;
              if (var12 >= 256) {
                stackOut_4_0 = var9 | var10;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (-16711936 & var9 * var12 | var12 * var10 & 16711680) >>> 1973535016;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var13 = stackIn_5_0;
              bea.c(var8, var7, ((rk) this).field_u, var13);
              bea.c(-(2 * ((rk) this).field_u) + var8, var7, ((rk) this).field_u, var13);
              var9 = 16711935 & param2;
              var10 = 65280 & param2;
              if ((var12 ^ -1) > -257) {
                stackOut_7_0 = (16711680 & var12 * var10 | var12 * var9 & -16711936) >>> 576000424;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var10 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var13 = stackIn_8_0;
            bea.c(((rk) this).field_u + var8, var7, ((rk) this).field_u, var13);
            bea.c(var8 + -((rk) this).field_u, var7, ((rk) this).field_u, var13);
            var7++;
            continue L0;
          }
        }
    }

    private final void a(int param0, iu param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          var5 = param2 - -((rk) this).field_m;
          tga.a(-21953, ((rk) this).field_A.field_m + param2, var5 + -((rk) this).field_A.field_m, param0, ((rk) this).field_p + param0);
          if (param3 > 86) {
            break L0;
          } else {
            ((rk) this).a(true, -45, -128);
            break L0;
          }
        }
        var6 = param2 - ((rk) this).field_y;
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              pfa.a(1);
              if (bea.field_b > ((rk) this).field_A.field_m + param2) {
                break L2;
              } else {
                nm.a(((rk) this).field_E, (byte) 116);
                param1.b(-((rk) this).field_y, 0);
                param1.b(2 * ((rk) this).field_u + -((rk) this).field_y, 0);
                ((rk) this).field_z.a(0, 0);
                pfa.a(1);
                ((rk) this).field_E.b(param2, param0);
                break L2;
              }
            }
            L3: {
              if (bea.field_d >= -((rk) this).field_A.field_m + var5) {
                nm.a(((rk) this).field_E, (byte) 91);
                var7 = ((rk) this).field_y + ((rk) this).field_m + -((rk) this).field_A.field_m;
                L4: while (true) {
                  if (2 * ((rk) this).field_u >= var7) {
                    param1.b(-var7, 0);
                    param1.b(-var7 + ((rk) this).field_u * 2, 0);
                    ((rk) this).field_A.a(0, 0);
                    pfa.a(1);
                    ((rk) this).field_E.b(-((rk) this).field_A.field_m + var5, param0);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((rk) this).field_u;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param1.b(var6, param0);
            var6 = var6 + param1.field_m;
            continue L1;
          }
        }
    }

    final static void b(int param0, boolean param1, int param2, int param3) {
        if (param0 <= 83) {
            return;
        }
        wj.a(param3, di.field_a, wg.field_i, 2, mna.field_d, param2, param1);
    }

    private rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rk) this).field_x = param6;
        ((rk) this).field_u = param4;
        ((rk) this).field_v = param7;
        ((rk) this).field_C = param5;
        ((rk) this).field_G = param8;
        ((rk) this).a((byte) -31, param2, param3, param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "You must be a member to play with the current options.";
    }
}
