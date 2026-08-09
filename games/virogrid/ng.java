/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends nk {
    static el field_N;
    static int field_X;
    private String field_W;
    private le field_R;
    static eh field_T;
    private mg field_S;
    static String field_Y;
    static volatile int field_Q;
    static km field_Z;
    static int[] field_O;
    private int field_U;
    static int field_P;

    public static void g(boolean param0) {
        if (param0) {
          field_N = (el) null;
          field_N = null;
          field_T = null;
          field_Z = null;
          field_O = null;
          field_Y = null;
          return;
        } else {
          field_N = null;
          field_T = null;
          field_Z = null;
          field_O = null;
          field_Y = null;
          return;
        }
    }

    ng(le param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, md.a((byte) -108));
        try {
            this.field_R = param0;
            this.field_W = param1;
            this.a(param5, true, param3, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var17 = null;
        gm var31 = null;
        mg var20 = null;
        mg var19 = null;
        mg var21 = null;
        gm var32 = null;
        mg var23 = null;
        mg var24 = null;
        mg var26 = null;
        mg var25 = null;
        mg var29 = null;
        mg var28 = null;
        String var5 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        Object var22 = null;
        Object var27 = null;
        int var13 = Virogrid.field_F ? 1 : 0;
        wl var6 = this.field_R.a(-22243);
        if (var6 == gd.field_r) {
            var17 = eg.field_s;
            if (!var17.equals(this.field_n)) {
                this.field_n = var17;
                this.e(-115);
            }
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.a(param0 + -22280);
            var31 = (gm) ((Object) this.field_w);
            var9 = this.field_l + param1;
            var10 = var31.b(-587719039, (fi) (this), param2) + (var31.a((fi) (this), (byte) -123).a((byte) 20) >> -43842047);
            if (gd.field_r != var6 && te.field_d != var6) {
                if (var6 == ee.field_c) {
                    var20 = bf.field_p[2];
                    var20.e(var9, var10 + -(var20.field_p >> 899381985), 256);
                    return;
                }
                if (bm.field_i == var6) {
                    var19 = bf.field_p[1];
                    var19.e(var9, var10 - (var19.field_p >> 2125725985), 256);
                    return;
                }
                return;
            }
            var21 = bf.field_p[0];
            var11 = var21.field_u << -5697663;
            var12 = var21.field_z << -1759717407;
            if (this.field_S == null) {
                this.field_S = new mg(var11, var12);
                kb.a(this.field_S, 16865);
                var21.a(112, 144, var21.field_u << -1040172092, var21.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                ai.a(true);
                this.field_S.e(var9 + -(var21.field_u >> -1857178367), -var21.field_z + var10, 256);
                return;
            }
            if (this.field_S.field_w < var11) {
                this.field_S = new mg(var11, var12);
                kb.a(this.field_S, 16865);
                var21.a(112, 144, var21.field_u << -1040172092, var21.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                ai.a(true);
                this.field_S.e(var9 + -(var21.field_u >> -1857178367), -var21.field_z + var10, 256);
                return;
            }
            if (var12 <= this.field_S.field_p) {
                kb.a(this.field_S, 16865);
                df.c();
                var21.a(112, 144, var21.field_u << -1040172092, var21.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                ai.a(true);
                this.field_S.e(var9 + -(var21.field_u >> -1857178367), -var21.field_z + var10, 256);
                return;
            }
            this.field_S = new mg(var11, var12);
            kb.a(this.field_S, 16865);
            var21.a(112, 144, var21.field_u << -1040172092, var21.field_z << -1359129436, -this.field_U << -1147490198, 4096);
            ai.a(true);
            this.field_S.e(var9 + -(var21.field_u >> -1857178367), -var21.field_z + var10, 256);
            return;
        }
        if (te.field_d == var6) {
            var5 = eg.field_s;
        } else {
            var5 = this.field_R.b(28433);
            if (var5 == null) {
                var5 = this.field_W;
            }
        }
        if (var5.equals(this.field_n)) {
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.a(param0 + -22280);
            var32 = (gm) ((Object) this.field_w);
            var9 = this.field_l + param1;
            var10 = var32.b(-587719039, (fi) (this), param2) + (var32.a((fi) (this), (byte) -123).a((byte) 20) >> -43842047);
            if (gd.field_r == var6) {
                var23 = bf.field_p[0];
                var11 = var23.field_u << -5697663;
                var12 = var23.field_z << -1759717407;
                if (this.field_S == null) {
                    this.field_S = new mg(var11, var12);
                    kb.a(this.field_S, 16865);
                    var23.a(112, 144, var23.field_u << -1040172092, var23.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var23.field_u >> -1857178367), -var23.field_z + var10, 256);
                    return;
                }
                if (this.field_S.field_w < var11) {
                    this.field_S = new mg(var11, var12);
                    kb.a(this.field_S, 16865);
                    var23.a(112, 144, var23.field_u << -1040172092, var23.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var23.field_u >> -1857178367), -var23.field_z + var10, 256);
                    return;
                }
                if (var12 <= this.field_S.field_p) {
                    kb.a(this.field_S, 16865);
                    df.c();
                    var23.a(112, 144, var23.field_u << -1040172092, var23.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var23.field_u >> -1857178367), -var23.field_z + var10, 256);
                    return;
                }
                this.field_S = new mg(var11, var12);
                kb.a(this.field_S, 16865);
                var23.a(112, 144, var23.field_u << -1040172092, var23.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                ai.a(true);
                this.field_S.e(var9 + -(var23.field_u >> -1857178367), -var23.field_z + var10, 256);
                return;
            }
            if (te.field_d == var6) {
                var24 = bf.field_p[0];
                mg var16 = var24;
                var11 = var24.field_u << -5697663;
                var12 = var24.field_z << -1759717407;
                if (this.field_S == null) {
                    this.field_S = new mg(var11, var12);
                    kb.a(this.field_S, 16865);
                    var24.a(112, 144, var24.field_u << -1040172092, var24.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var24.field_u >> -1857178367), -var24.field_z + var10, 256);
                    return;
                }
                if (this.field_S.field_w < var11) {
                    this.field_S = new mg(var11, var12);
                    kb.a(this.field_S, 16865);
                    var24.a(112, 144, var24.field_u << -1040172092, var24.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var24.field_u >> -1857178367), -var24.field_z + var10, 256);
                    return;
                }
                if (var12 > this.field_S.field_p) {
                    this.field_S = new mg(var11, var12);
                    kb.a(this.field_S, 16865);
                    var24.a(112, 144, var24.field_u << -1040172092, var24.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                    ai.a(true);
                    this.field_S.e(var9 + -(var24.field_u >> -1857178367), -var24.field_z + var10, 256);
                    return;
                }
                kb.a(this.field_S, 16865);
                df.c();
                var24.a(112, 144, var24.field_u << -1040172092, var24.field_z << -1359129436, -this.field_U << -1147490198, 4096);
                ai.a(true);
                this.field_S.e(var9 + -(var24.field_u >> -1857178367), -var24.field_z + var10, 256);
                return;
            }
            if (var6 == ee.field_c) {
                var26 = bf.field_p[2];
                var26.e(var9, var10 + -(var26.field_p >> 899381985), 256);
                return;
            }
            if (bm.field_i != var6) {
                return;
            }
            var25 = bf.field_p[1];
            var25.e(var9, var10 - (var25.field_p >> 2125725985), 256);
            return;
        }
        this.field_n = var5;
        this.e(-115);
        super.a(param0, param1, param2, param3);
        var6 = this.field_R.a(param0 + -22280);
        gm var33 = (gm) ((Object) this.field_w);
        var9 = this.field_l + param1;
        var10 = var33.b(-587719039, (fi) (this), param2) + (var33.a((fi) (this), (byte) -123).a((byte) 20) >> -43842047);
        if (gd.field_r != var6 && te.field_d != var6) {
            if (var6 == ee.field_c) {
                var29 = bf.field_p[2];
                var29.e(var9, var10 + -(var29.field_p >> 899381985), 256);
                return;
            }
            if (bm.field_i == var6) {
                var28 = bf.field_p[1];
                var28.e(var9, var10 - (var28.field_p >> 2125725985), 256);
                return;
            }
            return;
        }
        mg var30 = bf.field_p[0];
        var11 = var30.field_u << -5697663;
        var12 = var30.field_z << -1759717407;
        if (this.field_S == null) {
            this.field_S = new mg(var11, var12);
            kb.a(this.field_S, 16865);
            var30.a(112, 144, var30.field_u << -1040172092, var30.field_z << -1359129436, -this.field_U << -1147490198, 4096);
            ai.a(true);
            this.field_S.e(var9 + -(var30.field_u >> -1857178367), -var30.field_z + var10, 256);
            return;
        }
        if (this.field_S.field_w < var11 || var12 > this.field_S.field_p) {
            this.field_S = new mg(var11, var12);
            kb.a(this.field_S, 16865);
            var30.a(112, 144, var30.field_u << -1040172092, var30.field_z << -1359129436, -this.field_U << -1147490198, 4096);
            ai.a(true);
            this.field_S.e(var9 + -(var30.field_u >> -1857178367), -var30.field_z + var10, 256);
            return;
        }
        kb.a(this.field_S, 16865);
        df.c();
        var30.a(112, 144, var30.field_u << -1040172092, var30.field_z << -1359129436, -this.field_U << -1147490198, 4096);
        ai.a(true);
        this.field_S.e(var9 + -(var30.field_u >> -1857178367), -var30.field_z + var10, 256);
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -8515) {
                break L1;
              } else {
                var4 = (fi) null;
                this.a(-119, 56, (fi) null, -7);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ng.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_U = this.field_U + 1;
              super.a(param0, 114, param2, param3);
              if (param1 >= 113) {
                break L1;
              } else {
                this.a((byte) -92, -86, 85, 41);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ng.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final String d(int param0) {
        if (param0 >= 35) {
            return null;
        }
        this.a((byte) 91, -66, 2, -100);
        return null;
    }

    static {
        field_Y = "Friends";
        field_Q = 0;
        field_O = new int[4];
    }
}
