/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends pk {
    static String field_N;
    private int field_H;
    private wb field_M;
    boolean field_J;
    private wb[] field_z;
    private int field_K;
    int field_I;
    static float[] field_y;
    private int field_x;
    private int field_A;
    private wb field_G;
    private int field_B;
    private int field_D;
    private wb field_E;
    static ri[] field_F;

    public static void a(int param0) {
        field_y = null;
        field_N = null;
        if (param0 != -1346554936) {
            pq.a(-63);
        }
        field_F = null;
    }

    private final void g(int param0) {
        ((pq) this).field_z = new wb[]{this.a(((pq) this).field_K, (byte) -110, ((pq) this).field_x), this.a(((pq) this).field_D, (byte) -5, ((pq) this).field_B)};
        ((pq) this).field_M = this.f(-53);
        if (param0 != 880072001) {
            ((pq) this).field_K = -125;
        }
        ((pq) this).field_G = ((pq) this).field_M.a();
        ((pq) this).field_E = new wb(((pq) this).field_p >> 880072001, ((pq) this).field_p);
    }

    final void b(int param0, int param1, int param2) {
        ((pq) this).field_K = param1;
        ((pq) this).field_B = 8355711 & param0 >> 2057004641;
        ((pq) this).field_D = (param1 & 16711422) >> 1975341985;
        if (param2 <= 16) {
            return;
        }
        ((pq) this).field_x = param0;
        this.g(880072001);
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5 = 94 / ((param1 - -25) / 45);
        if (((pq) this).field_J) {
            ((pq) this).field_A = ((pq) this).field_A + 1;
            if (!(((pq) this).field_A <= ((pq) this).field_H * 2)) {
                ((pq) this).field_A = ((pq) this).field_A - ((pq) this).field_H * 2;
            }
        }
    }

    private final wb f(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        int var2 = ((pq) this).field_p >> 2128594561;
        wb var3 = new wb(var2, ((pq) this).field_p);
        jq.a(7161, var3);
        if (param0 > -23) {
            ((pq) this).field_M = null;
        }
        for (var4 = 0; ((pq) this).field_p > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((pq) this).field_p) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                lk.a(var5, var4, var8 << -1559720624 | (var8 | var8 << 323845448));
            }
        }
        su.a((byte) -94);
        return var3;
    }

    private final wb a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        var14 = new wb(2 * ((pq) this).field_H, ((pq) this).field_p);
        jq.a(7161, var14);
        var5 = ((pq) this).field_p >> 1197786337;
        var6 = 0;
        L0: while (true) {
          if (((pq) this).field_p <= var6) {
            var6 = 21 % ((param1 - -50) / 32);
            su.a((byte) 44);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 801054401) * (-1 + ((pq) this).field_H * 2) % (2 * ((pq) this).field_H);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = var6 + -var5;
              var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
              if (var11 >= 256) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> -1346554936;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              lk.f(var7, var6, ((pq) this).field_H, var12);
              var9 = param0 & 65280;
              var8 = 16711935 & param0;
              lk.f(-(2 * ((pq) this).field_H) + var7, var6, ((pq) this).field_H, var12);
              if (256 <= var11) {
                stackOut_7_0 = var8 | var9;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var11 * var9 | var8 * var11 & -16711936) >>> 1547071592;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            lk.f(((pq) this).field_H + var7, var6, ((pq) this).field_H, var12);
            lk.f(-((pq) this).field_H + var7, var6, ((pq) this).field_H, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(wb param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var5 = param3 - -((pq) this).field_q;
        kw.a(((pq) this).field_p + param1, param1, 1, param3 + ((pq) this).field_M.field_x, -((pq) this).field_M.field_x + var5);
        var6 = param3 - ((pq) this).field_A;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (param2 == 256) {
                break L1;
              } else {
                ((pq) this).field_J = true;
                break L1;
              }
            }
            L2: {
              su.a((byte) -51);
              if (param3 + ((pq) this).field_M.field_x >= lk.field_k) {
                jq.a(param2 + 6905, ((pq) this).field_E);
                param0.a(-((pq) this).field_A, 0);
                param0.a(((pq) this).field_H * 2 + -((pq) this).field_A, 0);
                ((pq) this).field_G.d(0, 0);
                su.a((byte) -105);
                ((pq) this).field_E.a(param3, param1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (lk.field_j >= -((pq) this).field_M.field_x + var5) {
                jq.a(7161, ((pq) this).field_E);
                var7 = ((pq) this).field_A + ((pq) this).field_q - ((pq) this).field_M.field_x;
                L4: while (true) {
                  if (((pq) this).field_H * 2 >= var7) {
                    param0.a(-var7, 0);
                    param0.a(2 * ((pq) this).field_H + -var7, 0);
                    ((pq) this).field_M.d(0, 0);
                    su.a((byte) 106);
                    ((pq) this).field_E.a(var5 - ((pq) this).field_M.field_x, param1);
                    break L3;
                  } else {
                    var7 = var7 - ((pq) this).field_H * 2;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param0.a(var6, param1);
            var6 = var6 + param0.field_x;
            continue L0;
          }
        }
    }

    pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -1445149599, (16711422 & param6) >> 409329089);
    }

    final static int a(int param0, int param1) {
        if (param0 != 1) {
            return -1;
        }
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-57, param1, param2, param3, param4);
        this.g(880072001);
        int var6 = 85 % ((28 - param0) / 63);
    }

    private pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((pq) this).field_B = param7;
        ((pq) this).field_D = param8;
        ((pq) this).field_K = param6;
        ((pq) this).field_x = param5;
        ((pq) this).field_H = param4;
        ((pq) this).a(-79, param0, param1, param3, param2);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param3 != 0) {
            return;
        }
        int var5 = param0 + ((pq) this).field_r;
        if (param2 >= -35) {
            ((pq) this).field_z = null;
        }
        int var6 = ((pq) this).field_v + param1;
        this.a(((pq) this).field_z[0], var6, 256, var5);
        if (((pq) this).field_I < 65536) {
            kw.a(var6 - -((pq) this).field_p, var6, 1, var5 - -(((pq) this).field_I * ((pq) this).field_q >> 2035440112), ((pq) this).field_q + var5);
            this.a(((pq) this).field_z[1], var6, 256, var5);
            su.a((byte) -110);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Confirm Email:";
        field_y = new float[16];
    }
}
