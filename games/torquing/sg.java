/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private int field_C;
    private int[][] field_u;
    private static int[] field_l;
    private static int[] field_z;
    static int field_f;
    private ti[] field_D;
    private static int[] field_d;
    private static int[] field_t;
    static t[] field_e;
    private int[] field_F;
    int field_y;
    private int[][] field_v;
    private int[][] field_c;
    private static short[][] field_r;
    static int field_s;
    private static short[][] field_B;
    static int field_o;
    private int[] field_p;
    private static int[] field_k;
    private static int[] field_E;
    private static kh field_b;
    private int[] field_m;
    private int field_j;
    private boolean[] field_x;
    private int field_A;
    kh[] field_g;
    private int[][] field_G;
    private static boolean[] field_w;
    private int[] field_i;
    private int[] field_h;
    private static int[] field_n;
    private int[] field_q;
    static t[] field_a;

    final static void c() {
        field_b = new kh();
        field_b.field_k = (pj) (new rm(0, 0, 0).a(0, 0, 1, 0, 0));
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_F[param0] = param1;
        this.field_h[param0] = param2;
        this.field_i[param0] = param3;
    }

    final void a(int param0, ti[] param1) {
        int var4 = 0;
        ti[] var3;
        ti[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ti stackIn_7_2 = null;
        if (param1 == null) {
          this.field_D[param0] = null;
        } else {
          var3 = new ti[param1.length];
          this.field_D = var3;
          for (var4 = 0; var4 < param1.length; var4++) {
            stackIn_6_0 = var3;
            stackIn_6_1 = var4;
            if (param1[var4] != null) {
              stackIn_7_2 = param1[var4].c((byte) 90);
            } else {
              stackIn_7_2 = null;
            }
            stackIn_6_0[stackIn_6_1] = stackIn_7_2;
          }
        }
    }

    private final void c(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        ti stackIn_24_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        boolean stackIn_42_2 = false;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        boolean stackIn_46_2 = false;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        boolean stackIn_49_2 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_59_0 = 0;
        pj var3;
        mp var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14_int;
        ec var14;
        int var15;
        int var16_int;
        ti var16;
        int var17;
        int var15Lifetime1;
        int var16_intLifetime1;
        int var17Lifetime1;
        var3 = this.field_g[param0].field_k;
        var4 = this.field_g[param0].field_q;
        if (var4.field_q != null) {
          stackIn_3_0 = var4.field_q[param1];
        } else {
          stackIn_3_0 = -1;
        }
        var5 = stackIn_3_0;
        stackIn_6_0 = (var3.field_l[param1] == -1) ? 0 : 1;
        var6 = stackIn_6_0;
        if (var3.field_z != null) {
          stackIn_9_0 = var3.field_z[param1];
        } else {
          stackIn_9_0 = -1;
        }
        var7 = stackIn_9_0;
        var8 = var3.field_p[param1];
        var9 = var3.field_u[param1];
        var10 = var3.field_t[param1];
        field_k[0] = this.field_v[param0][var8];
        field_k[1] = this.field_v[param0][var9];
        field_k[2] = this.field_v[param0][var10];
        field_n[0] = this.field_c[param0][var8];
        field_n[1] = this.field_c[param0][var9];
        field_n[2] = this.field_c[param0][var10];
        field_d[0] = this.field_u[param0][var8];
        field_d[1] = this.field_u[param0][var9];
        field_d[2] = this.field_u[param0][var10];
        if (var8 == var9 &&
          var8 == var10) {
          this.c(var7);
          return;
        }
        var11 = var3.field_f[param1];
        var12 = var3.field_s[param1];
        var13 = var3.field_l[param1];
        if (var5 != -1) {
          var14_int = var3.field_h[var5];
          var15 = var3.field_g[var5];
          var16_int = var3.field_i[var5];
          g.field_b[0] = this.field_v[param0][var14_int];
          g.field_b[1] = this.field_v[param0][var15];
          g.field_b[2] = this.field_v[param0][var16_int];
          g.field_c[0] = this.field_c[param0][var14_int];
          g.field_c[1] = this.field_c[param0][var15];
          g.field_c[2] = this.field_c[param0][var16_int];
          g.field_a[0] = this.field_u[param0][var14_int];
          g.field_a[1] = this.field_u[param0][var15];
          g.field_a[2] = this.field_u[param0][var16_int];
        }
        var14 = be.field_c;
        var15Lifetime1 = 0;
        if ((!(field_f > 0) ||
          var7 == -1) && var5 != -1) {
          var16_intLifetime1 = var14.b(var7);
          var11 = be.a(var16_intLifetime1, var11);
          var12 = be.a(var16_intLifetime1, var12);
          var13 = be.a(var16_intLifetime1, var13);
          var5 = -1;
          var15Lifetime1 = 1;
        }
        if (param0 == 0 &&
          this.field_D != null) {
          stackIn_24_0 = this.field_D[param1];
        } else {
          stackIn_24_0 = null;
        }
        boolean decompiledFrameRemainder0 = true;
        var16 = stackIn_24_0;
        if (var16 != null) {
          var17 = var16.a((byte) 91);
          if (var17 != 1 && (var17 != 2 ||
            var5 == -1)) {
            if (var17 != 2) {
              this.field_D[param1] = null;
            } else {
              stackIn_41_0 = var11;
              stackIn_41_1 = 64;
              stackIn_42_2 = (var5 != -1);
              var11 = sg.a(stackIn_41_0, stackIn_41_1, stackIn_42_2);
              if ((var6 != 0)) {
                stackIn_45_0 = var12;
                stackIn_45_1 = 64;
                stackIn_46_2 = (var5 != -1);
                var12 = sg.a(stackIn_45_0, stackIn_45_1, stackIn_46_2);
                stackIn_48_0 = var13;
                stackIn_48_1 = 64;
                stackIn_49_2 = (var5 != -1);
                var13 = sg.a(stackIn_48_0, stackIn_48_1, stackIn_49_2);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var5 == -1 &&
              var6 != 0) {
              var5 = 0;
            } else {
              if (var5 == -1 &&
                var6 == 0) {
                be.field_c = var16.a(var11, -114);
                var11 = 128;
                if (var15Lifetime1 == 0) {
                  g.a(field_k, field_n, field_d, new int[]{415, 415, 3680}, new int[]{415, 3680, 3680});
                  var5 = 0;
                  decompiledFrameRemainder0 = false;
                }
              } else {
                be.field_c = var16.a(122, var7, var14);
              }
              if (decompiledFrameRemainder0) {
                var5 = 0;
              }
            }
          }
        }
        if (var5 != -1) {
          stackIn_57_0 = var5 << 2 | 2;
          stackIn_58_1 = (var6 == 0) ? 1 : 0;
          stackIn_59_0 = stackIn_57_0 | stackIn_58_1;
        } else {
          stackIn_59_0 = (var6 == 0) ? 1 : 0;
        }
        var17Lifetime1 = stackIn_59_0;
        nf.a(var17Lifetime1, var7, field_k, field_n, field_d, var11, var12, var13);
        be.field_c = var14;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        t var5;
        int var5_int;
        int var6;
        int var7;
        t var8;
        t var9;
        t var10;
        int var11;
        int var12;
        int var7Lifetime1;
        var2 = field_d[0];
        if (var2 < 50) {
          return;
        }
        var3 = be.field_g + (field_k[0] << 9) / var2;
        var4 = be.field_b + (field_n[0] << 9) / var2;
        if (param0 != -32768) {
          var5 = field_e[param0];
          var5.d(var3 - (var5.field_w >> 1), var4 - (var5.field_u >> 1));
          return;
        }
        if (ie.field_b == null) {
          return;
        }
        var5_int = ie.field_b.field_P.field_f[3];
        var6 = ie.field_b.field_P.field_f[4];
        var7 = ie.field_b.field_P.field_f[5];
        var11 = field_o >> 1 & 7;
        if (var5_int < 0) {
          var8 = field_a[24 + var11];
          var5_int = -var5_int;
        } else {
          var8 = field_a[0 + var11];
        }
        if (var6 < 0) {
          var9 = field_a[32 + var11];
          var6 = -var6;
        } else {
          var9 = field_a[8 + var11];
        }
        if (var7 < 0) {
          var10 = field_a[40 + var11];
          var7 = -var7;
        } else {
          var10 = field_a[16 + var11];
        }
        var12 = var5_int + var6 + var7;
        var5_int = (var5_int << 8) / var12;
        var6 = (var6 << 8) / var12;
        var7Lifetime1 = 256 - var5_int - var6;
        if (var7Lifetime1 < 0) {
          System.err.println(var5_int + "\t" + var6 + "\t" + var7Lifetime1);
        }
        sg.a(var3 - (var8.field_w >> 1), var4 - (var8.field_u >> 1), var5_int, var8, var6, var9, var7Lifetime1, var10);
        return;
    }

    private final ti b(int param0) {
        pj var2 = this.field_g[0].field_k;
        int var3 = var2.field_p[param0];
        int var4 = var2.field_u[param0];
        int var5 = var2.field_t[param0];
        mp var6 = this.field_g[0].field_q;
        int[] var23 = var6.field_s[0];
        int[] var24 = var6.field_s[1];
        int[] var25 = var6.field_s[2];
        int[] var10 = new int[]{var23[var3], var23[var4], var23[var5]};
        int[] var11 = new int[]{var24[var3], var24[var4], var24[var5]};
        int[] var12 = new int[]{var25[var3], var25[var4], var25[var5]};
        int var13 = var6.field_u[param0];
        return new ti(var10, var11, var12, var13);
    }

    private final static int a(int param0, int param1, boolean param2) {
        if (param2) {
          return pj.a(param1);
        }
        return pj.a(param0, param1);
    }

    final void b(lm param0) {
        int var3 = 0;
        ti[] var2;
        ti var4;
        if (this.field_D == null) {
          return;
        }
        var2 = this.field_D;
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var4.a(param0, 2);
          }
        }
    }

    final void a(int[] param0) {
        int var21 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int var15_int = 0;
        int var16 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        pj var15 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int var14_intLifetime1;
        int var16Lifetime1;
        stackIn_3_0 = !(field_f > 1);
        be.field_m = stackIn_3_0;
        var5 = param0[3];
        var6 = param0[6];
        var7 = param0[9];
        var8 = param0[4];
        var9 = param0[7];
        var10 = param0[10];
        var11 = param0[5];
        var12 = param0[8];
        var13 = param0[11];
        var14_int = -param0[0];
        var15_int = -param0[1];
        var16 = -param0[2];
        var2 = var14_int * var5 + var15_int * var8 + var16 * var11 >> 16;
        var3 = var14_int * var6 + var15_int * var9 + var16 * var12 >> 16;
        var4 = var14_int * var7 + var15_int * var10 + var16 * var13 >> 16;
        this.field_A = 2147483647;
        this.field_j = 2147483647;
        this.field_C = -2147483648;
        for (var14_intLifetime1 = 0; var14_intLifetime1 < this.field_g.length; var14_intLifetime1++) {
          if (!this.field_x[var14_intLifetime1]) {
            var15 = this.field_g[var14_intLifetime1].field_k;
            var16Lifetime1 = var15.field_k;
            if (var16Lifetime1 != 0) {
              var37 = this.field_g[var14_intLifetime1].field_q.field_s;
              var38 = var37[0];
              var39 = var37[1];
              var40 = var37[2];
              for (var21 = 0; var21 < var16Lifetime1; var21++) {
                var22 = this.field_F[var14_intLifetime1] + var38[var21];
                var23 = this.field_h[var14_intLifetime1] + var39[var21];
                var24 = this.field_i[var14_intLifetime1] + var40[var21];
                this.field_A = Math.min(var23, this.field_A);
                this.field_v[var14_intLifetime1][var21] = var2 + (var22 * var5 + var23 * var8 + var24 * var11 >> 16);
                this.field_c[var14_intLifetime1][var21] = var3 + (var22 * var6 + var23 * var9 + var24 * var12 >> 16);
                var24 = var4 + (var22 * var7 + var23 * var10 + var24 * var13 >> 16);
                this.field_u[var14_intLifetime1][var21] = var24;
                this.field_j = Math.min(var24, this.field_j);
                this.field_C = Math.max(var24, this.field_C);
              }
            }
          }
        }
        try {
          this.b();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
        }
    }

    private final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int var13;
        int var16;
        int var17;
        int var18;
        int var19;
        int var17Lifetime1;
        int var17Lifetime2;
        stackIn_3_0 = (!ia.a(-22426, 0)) ? 16711935 : 16744448;
        var13 = stackIn_3_0;
        for (var14 = -param10; var14 < 0; var14++) {
          for (var15 = -param9; var15 < 0; var15++) {
            var16 = param1 * (param2[param7] & 255) + param3 * (param4[param7] & 255) + param5 * (param6[param7] & 255) >> 8;
            param7++;
            if (var16 == 0) {
              param8++;
            } else {
              var17 = (var13 & 16711935) * var16;
              var18 = (var17 & -16711936) + (var13 * var16 - var17 & 16711680) >>> 8;
              var17Lifetime1 = param0[param8];
              var19 = var18 + var17Lifetime1;
              var18 = (var18 & 16711935) + (var17Lifetime1 & 16711935);
              var17Lifetime2 = (var18 & 16777472) + (var19 - var18 & 65536);
              incrementValue$0 = param8;
              param8++;
              param0[incrementValue$0] = var19 - var17Lifetime2 | var17Lifetime2 - (var17Lifetime2 >>> 8);
            }
          }
          param8 = param8 + param11;
          param7 = param7 + param12;
        }
    }

    final void a(int param0, kh param1) {
        mp dupTemp$4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int var3;
        int var4;
        Object var5;
        mp var6;
        mp var7;
        if (param1.field_k == null) {
          stackIn_3_0 = param1.field_l.field_f;
        } else {
          stackIn_3_0 = param1.field_k.field_k;
        }
        var3 = stackIn_3_0;
        if (param1.field_k == null) {
          stackIn_6_0 = param1.field_l.field_g;
        } else {
          stackIn_6_0 = param1.field_k.field_x;
        }
        var4 = stackIn_6_0;
        int[] array$0 = new int[var3];
        this.field_v[param0] = array$0;
        int[] array$1 = new int[var3];
        this.field_c[param0] = array$1;
        int[] array$2 = new int[var3];
        this.field_u[param0] = array$2;
        int[] array$3 = new int[var4];
        this.field_G[param0] = array$3;
        if (this.field_g[param0] == null) {
          var5 = null;
        } else {
          var7 = this.field_g[param0].field_q;
          var7.field_r = var7.field_r - 1;
          var5 = var7.field_t;
        }
        this.field_g[param0] = param1;
        var6 = param1.field_q;
        if (var6 == null) {
          dupTemp$4 = new mp();
          var6 = dupTemp$4;
          param1.field_q = dupTemp$4;
        }
        var6.field_r = var6.field_r + 1;
        if (var5 == null &&
          var6.field_s == null) {
          var5 = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
        }
        if (var5 != null) {
          this.a(param1, (int[]) (var5));
        }
        if (param1.field_l == null &&
          var6.field_t == null) {
          var6.field_t = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
          this.a(param1);
        }
        this.field_x[param0] = false;
        if (param0 != 0) {
          return;
        }
        this.field_D = null;
    }

    final void d(int param0) {
        this.a(param0, field_b);
        this.field_x[param0] = true;
    }

    private final int b(int param0, int param1) {
        pj var3 = this.field_g[param0].field_k;
        int var4 = var3.field_p[param1];
        int var5 = var3.field_u[param1];
        int var6 = var3.field_t[param1];
        int var7 = this.field_u[param0][var4];
        int var8 = this.field_u[param0][var5];
        int var9 = this.field_u[param0][var6];
        return Math.max(Math.max(var7, var8), var9) - this.field_j;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (this.field_g[param0].field_k == null) {
          sg.a(this.field_g[param0], param1, param2, param3, param4, param5);
          return;
        }
    }

    final void a(lm param0) {
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        pj var2;
        mp var3;
        int var10;
        int var11;
        boolean[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int[] var45;
        int[] var46;
        int[] var47;
        int[] var48;
        int[] var49;
        int[] var50;
        int var13Lifetime1;
        var2 = this.field_g[0].field_k;
        var3 = this.field_g[0].field_q;
        var45 = var3.field_s[0];
        var47 = var3.field_s[1];
        var48 = var3.field_s[2];
        var46 = var2.field_p;
        var49 = var2.field_u;
        var50 = var2.field_t;
        var10 = var45.length;
        var11 = var46.length;
        if (this.field_D == null) {
          this.field_D = new ti[var11];
        }
        if (field_w == null ||
          !(field_w.length >= var10)) {
          field_w = new boolean[var10];
        }
        var12 = field_w;
        for (var13 = 0; var13 < var10; var13++) {
          stackIn_10_0 = var12;
          stackIn_10_1 = var13;
          stackIn_11_2 = (param0.a(var45[var13], var47[var13], var48[var13]) == 2);
          stackIn_10_0[stackIn_10_1] = stackIn_11_2;
        }
        var26 = 0;
        var13Lifetime1 = var26;
        while (var26 < var11) {
          boolean decompiledFrameRemainder0 = true;
          if (var2.field_l[var26] != -2) {
            var14 = var46[var26];
            var15 = var49[var26];
            var16 = var50[var26];
            var17 = var45[var14] - var45[var15];
            var18 = var47[var14] - var47[var15];
            var19 = var48[var14] - var48[var15];
            var20 = var45[var16] - var45[var15];
            var21 = var47[var16] - var47[var15];
            var22 = var48[var16] - var48[var15];
            var23 = var19 * var21 - var18 * var22;
            var24 = var17 * var22 - var19 * var20;
            var25 = var18 * var20 - var17 * var21;
            if (var23 * -1 + var24 * -12 + var25 * 12 > 0) {
              if (!param0.a() && (var12[var14] ||
                var12[var15] ||
                var12[var16])) {
                if (this.field_D[var26] == null) {
                  this.field_D[var26] = this.b(var26);
                }
                this.field_D[var26].a(true, param0);
                decompiledFrameRemainder0 = false;
              }
              else {
                if (param0.a(var45[var14], var47[var14], var48[var14], var45[var15], var47[var15], var48[var15], var45[var16], var47[var16], var48[var16], var23, var24, var25)) {
                  if (this.field_D[var26] == null) {
                    this.field_D[var26] = this.b(var26);
                  }
                  this.field_D[var26].a(true, param0);
                }
              }
            }
          }
          var26++;
        }
    }

    final ti[] a(int param0) {
        int var4 = 0;
        ti[] var2 = this.field_D;
        if (var2 == null) {
          return null;
        }
        ti[] var3 = new ti[var2.length];
        for (var4 = 0; var4 < var3.length; var4++) {
          var3[var4] = var2[var4] == null ? null : var2[var4].c((byte) 56);
        }
        return var3;
    }

    private final boolean a(int param0, pj param1, int param2) {
        boolean stackIn_8_0 = false;
        int var4;
        int var5;
        int var6;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var31;
        int[] var32;
        int[] var33;
        if (param1.field_l[param2] == -2) {
          return true;
        }
        var4 = param1.field_p[param2];
        var5 = param1.field_u[param2];
        var6 = param1.field_t[param2];
        if (var4 == var5) {
          stackIn_8_0 = (var4 != var6) && (this.field_u[param0][var4] < 50) && (this.field_u[param0][var6] < 50);
          return stackIn_8_0;
        }
        var32 = this.field_v[param0];
        var33 = this.field_c[param0];
        var31 = this.field_u[param0];
        field_t[0] = -5000;
        field_t[1] = -5000;
        field_t[2] = -5000;
        var10 = var31[var4];
        if (var10 >= 50) {
          field_t[0] = be.field_g + (var32[var4] << 9) / var10;
          field_l[0] = be.field_b + (var33[var4] << 9) / var10;
        }
        var11 = var31[var5];
        if (var11 >= 50) {
          field_t[1] = be.field_g + (var32[var5] << 9) / var11;
          field_l[1] = be.field_b + (var33[var5] << 9) / var11;
        }
        var12 = var31[var6];
        if (var12 >= 50) {
          field_t[2] = be.field_g + (var32[var6] << 9) / var12;
          field_l[2] = be.field_b + (var33[var6] << 9) / var12;
        }
        if (field_t[0] != -5000 &&
          field_t[1] != -5000 &&
          field_t[2] != -5000) {
          if (!((field_t[0] - field_t[1]) * (field_l[2] - field_l[1]) - (field_l[0] - field_l[1]) * (field_t[2] - field_t[1]) > 0)) {
            if (field_s == 12 &&
              param0 == 0) {
              if (this.field_D != null) {
                this.field_D[param2] = null;
              }
              return false;
            }
            return true;
          }
        } else {
          var13 = var32[var4];
          var14 = var32[var5];
          var15 = var32[var6];
          var16 = var33[var4];
          var17 = var33[var5];
          var18 = var33[var6];
          var13 = var13 - var14;
          var15 = var15 - var14;
          var16 = var16 - var17;
          var18 = var18 - var17;
          var10 = var10 - var11;
          var12 = var12 - var11;
          var19 = var16 * var12 - var10 * var18;
          var20 = var10 * var15 - var13 * var12;
          var21 = var13 * var18 - var16 * var15;
          if (var14 * var19 + var17 * var20 + var11 * var21 <= 0) {
            if (field_s == 12 &&
              param0 == 0) {
              if (this.field_D == null) {
                return false;
              }
              this.field_D[param2] = null;
              return false;
            }
            return true;
          }
        }
        if (field_t[0] != -5000 &&
          field_t[1] != -5000 &&
          field_t[2] != -5000 && (field_t[0] < 0 &&
          field_t[1] < 0 &&
          field_t[2] < 0 ||
          field_t[0] > be.field_p &&
          field_t[1] > be.field_p &&
          field_t[2] > be.field_p ||
          field_l[0] < 0 &&
          field_l[1] < 0 &&
          field_l[2] < 0 ||
          !(field_l[0] <= be.field_f) &&
          !(field_l[1] <= be.field_f) &&
          !(field_l[2] <= be.field_f))) {
          return true;
        }
        return false;
    }

    private final static void a(int param0, int param1, int param2, t param3, int param4, t param5, int param6, t param7) {
        int var13 = 0;
        int var8 = 0;
        int var9 = param3.field_t;
        int var10 = param3.field_s;
        int var11 = ph.field_j - var10;
        int var12 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        if (param1 < ph.field_c) {
          var13 = ph.field_c - param1;
          var9 = var9 - var13;
          param1 = ph.field_c;
          var8 = var8 + var13 * var10;
        }
        if (param1 + var9 > ph.field_h) {
          var9 = var9 - (param1 + var9 - ph.field_h);
        }
        if (param0 < ph.field_k) {
          var13Lifetime1 = ph.field_k - param0;
          var10 = var10 - var13Lifetime1;
          param0 = ph.field_k;
          var8 = var8 + var13Lifetime1;
          var12 = var12 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
        }
        if (param0 + var10 > ph.field_a) {
          var13Lifetime2 = param0 + var10 - ph.field_a;
          var10 = var10 - var13Lifetime2;
          var12 = var12 + var13Lifetime2;
          var11 = var11 + var13Lifetime2;
        }
        if (var10 > 0) {
          if (var9 <= 0) {
            return;
          }
          var13Lifetime3 = param0 + param1 * ph.field_j;
          sg.a(ph.field_e, param2, param3.field_y, param4, param5.field_y, param6, param7.field_y, var8, var13Lifetime3, var10, var9, var11, var12);
          return;
        }
    }

    final void a(kh param0, int[] param1) {
        int var6 = 0;
        int var11 = 0;
        mp var3;
        int var4;
        int var5;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int[] var24;
        int[] var25;
        int[] var26;
        int var5Lifetime1;
        if (param0.field_l == null) {
          return;
        }
        var3 = param0.field_q;
        if (var3 == null) {
          return;
        }
        if (var3.field_r <= 0) {
          return;
        }
        for (var4 = 0; var4 < 3; var4++) {
          var5 = -1;
          for (var6 = 0; var6 < 3; var6++) {
            if (param1[3 * var6 + var4 + 3] != 65535) {
              if (param1[3 * var6 + var4 + 3] != 0) {
                var5 -= 6;
              }
            } else {
              var5 = var5 + (var6 + 1);
            }
          }
          if (var5 >= 0) {
            param1[3 * var5 + var4 + 3] = 65536;
          }
        }
        if (var3.field_t != null) {
          var4 = 1;
          for (var5Lifetime1 = 3; var5Lifetime1 < 12; var5Lifetime1++) {
            if (var3.field_t[var5Lifetime1] != param1[var5Lifetime1]) {
              var4 = 0;
            }
          }
          if (var4 != 0) {
            return;
          }
        } else {
          var3.field_t = new int[12];
        }
        for (var4 = 3; var4 < 12; var4++) {
          var3.field_t[var4] = param1[var4];
        }
        var4 = param0.field_l.field_f;
        var24 = param0.field_l.field_M;
        var25 = param0.field_l.field_B;
        var26 = param0.field_l.field_E;
        if (var3.field_s == null) {
          var3.field_s = new int[][]{new int[var4], new int[var4], new int[var4]};
        }
        var8 = var3.field_s[0];
        var9 = var3.field_s[1];
        var10 = var3.field_s[2];
        for (var11 = 0; var11 < var4; var11++) {
          var12 = var24[var11];
          var13 = var25[var11];
          var14 = var26[var11];
          var8[var11] = var12 * param1[3] + var13 * param1[6] + var14 * param1[9] >> 16;
          var9[var11] = var12 * param1[4] + var13 * param1[7] + var14 * param1[10] >> 16;
          var10[var11] = var12 * param1[5] + var13 * param1[8] + var14 * param1[11] >> 16;
        }
        var3.field_v = null;
        return;
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_E = null;
        field_r = (short[][]) null;
        field_z = null;
        field_B = (short[][]) null;
        field_k = null;
        field_n = null;
        field_d = null;
        field_t = null;
        field_l = null;
        field_b = null;
        field_w = null;
    }

    private final void e(int param0) {
        int var2_int = 0;
        int dupTemp$4 = 0;
        short[] arrayValue$5 = null;
        int var6 = 0;
        int dupTemp$2 = 0;
        short[] arrayValue$3 = null;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        pj var2;
        int var3;
        int var4_int;
        int[] var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        int var5Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        for (var2_int = 0; var2_int < 1024; var2_int++) {
          field_E[var2_int] = 0;
        }
        var2 = this.field_g[param0].field_k;
        var3 = var2.field_x;
        var4_int = 0;
        while (var4_int < var3) {
          if (!this.a(param0, var2, var4_int)) {
            var5 = this.b(param0, var4_int);
            dupTemp$4 = field_E[var5 / 768];
            arrayValue$5 = field_r[var5 / 768];
            field_E[var5 / 768] = dupTemp$4 + 1;
            arrayValue$5[dupTemp$4] = (short) var4_int;
          }
          var4_int = (short)(var4_int + 1);
        }
        var12 = this.field_G[param0];
        var11 = var12;
        var4 = var11;
        var5Lifetime1 = 0;
        for (var6 = 0; var6 < 1024; var6++) {
          if (field_E[var6] != 0) {
            for (var7 = 0; var7 < 768; var7++) {
              field_z[var7] = 0;
            }
            for (var7Lifetime1 = 0; var7Lifetime1 < field_E[var6]; var7Lifetime1++) {
              var8 = field_r[var6][var7Lifetime1];
              var9 = this.b(param0, var8);
              dupTemp$2 = field_z[var9 % 768];
              arrayValue$3 = field_B[var9 % 768];
              field_z[var9 % 768] = dupTemp$2 + 1;
              arrayValue$3[dupTemp$2] = (short)var8;
            }
            for (var7Lifetime2 = 0; var7Lifetime2 < 768; var7Lifetime2++) {
              var10 = 0;
              var8Lifetime1 = var10;
              while (var10 < field_z[var7Lifetime2]) {
                incrementValue$1 = var5Lifetime1;
                var5Lifetime1++;
                var4[incrementValue$1] = field_B[var7Lifetime2][var10];
                var10++;
              }
            }
          }
        }
        while (var5Lifetime1 < var12.length) {
          incrementValue$0 = var5Lifetime1;
          var5Lifetime1++;
          var4[incrementValue$0] = -1;
        }
    }

    private final boolean a(int param0, int param1) {
        return this.field_m[param0] > this.field_m[param1];
    }

    private final static int[] a(short[] param0) {
        int var2 = 0;
        int[] var1 = new int[param0.length];
        for (var2 = 0; var2 < var1.length; var2++) {
          var1[var2] = param0[var2] & 65535;
        }
        return var1;
    }

    private final void a(kh param0) {
        mp var2 = null;
        int var3 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        if (param0.field_k != null) {
          if (param0.field_k.field_k == 0) {
            return;
          }
          var2 = param0.field_q;
          if (var2 != null) {
            if (var2.field_r <= 0) {
              return;
            }
            var3 = param0.field_k.field_k;
            var20 = param0.field_k.field_j;
            var21 = param0.field_k.field_y;
            var22 = param0.field_k.field_v;
            if (var2.field_s == null) {
              var2.field_s = new int[][]{new int[var3], new int[var3], new int[var3]};
            }
            var7 = var2.field_s[0];
            var8 = var2.field_s[1];
            var9 = var2.field_s[2];
            for (var10 = 0; var10 < var3; var10++) {
              var7[var10] = var20[var10];
              var8[var10] = var21[var10];
              var9[var10] = var22[var10];
            }
            var2.field_v = null;
            return;
          }
        }
    }

    final static void a(kh param0, int param1, int param2, int param3, int param4, int param5) {
        dd dupTemp$0 = null;
        dd dupTemp$1 = null;
        dd dupTemp$2 = null;
        int stackIn_56_0 = 0;
        rm var6;
        mp var7;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        pj var15;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        dd var34_ref_dd;
        int var34;
        int var35;
        pj var39;
        dd var43;
        dd var44;
        dd var45;
        int[] var56;
        int[] var57;
        int[] var58;
        int[] var59;
        int[] var60;
        int[] var61;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var26Lifetime1Lifetime1;
        int var26Lifetime1Lifetime2;
        int var26Lifetime1Lifetime3;
        int var27Lifetime1Lifetime1;
        dd var34_ref_ddLifetime1;
        dd var34_ref_ddLifetime2;
        var6 = param0.field_l;
        if (var6 == null) {
          return;
        }
        if (var6.field_f == 0) {
          return;
        }
        var7 = param0.field_q;
        if (var7.field_r <= 0) {
          return;
        }
        if (var7.field_v != null) {
          var56 = var7.field_v;
          if (var56[0] == param1 &&
            var56[1] == param2 &&
            var56[2] == param3 &&
            var56[3] == param4 &&
            var56[4] == param5) {
            return;
          }
        } else {
          var7.field_v = new int[5];
        }
        var57 = var7.field_v;
        var57[0] = param1;
        var57[1] = param2;
        var57[2] = param3;
        var57[3] = param4;
        var57[4] = param5;
        var58 = var7.field_t;
        var10 = param3;
        var11 = param4;
        param3 = var58[3] * var10 + var58[4] * var11 + var58[5] * param5 >> 16;
        param4 = var58[6] * var10 + var58[7] * var11 + var58[8] * param5 >> 16;
        param5 = var58[9] * var10 + var58[10] * var11 + var58[11] * param5 >> 16;
        var12 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
        var13 = param2 * var12 >> 8;
        var14 = var6.field_o.length;
        if (param0.field_k != null) {
          var15 = param0.field_k;
        } else {
          var39 = new pj(new pj[]{}, 0);
          var15 = var39;
          var39.field_k = var6.field_f;
          var39.field_x = var6.field_g;
          var39.field_m = var6.field_k;
          var39.field_j = var6.field_M;
          var39.field_y = var6.field_B;
          var39.field_v = var6.field_E;
          var39.field_p = var6.field_o;
          var39.field_u = var6.field_y;
          var39.field_t = var6.field_q;
          if (var6.field_u != null) {
            var39.field_h = sg.a(var6.field_u);
            var39.field_g = sg.a(var6.field_n);
            var39.field_i = sg.a(var6.field_x);
          }
          var39.field_F = var6.field_D;
          var39.field_z = var6.field_A;
          param0.field_k = var39;
        }
        if (var15.field_f == null ||
          !(var15.field_f.length >= var14)) {
          var15.field_f = new int[var14];
          var15.field_s = new int[var14];
          var15.field_l = new int[var14];
        }
        var59 = var6.field_M;
        var60 = var6.field_B;
        var61 = var6.field_E;
        var19 = var6.field_f;
        if (var6.field_l == null) {
          var6.field_l = new dd[var19];
          for (var20 = 0; var20 < var14; var20++) {
            if (var6.field_j == null ||
              var6.field_j[var20] == 0) {
              var21 = var6.field_o[var20];
              var22 = var6.field_y[var20];
              var23 = var6.field_q[var20];
              var24 = var59[var22] - var59[var21];
              var25 = var60[var22] - var60[var21];
              var26 = var61[var22] - var61[var21];
              var27 = var59[var23] - var59[var21];
              var28 = var60[var23] - var60[var21];
              var29 = var61[var23] - var61[var21];
              var30 = var25 * var29 - var28 * var26;
              var31 = var26 * var27 - var29 * var24;
              var32 = var24 * var28 - var27 * var25;
              while (true) {
                if (var30 <= 8192 &&
                  var31 <= 8192 &&
                  var32 <= 8192 &&
                  var30 >= -8192 &&
                  var31 >= -8192 &&
                  var32 >= -8192) {
                  var33 = (int)Math.sqrt((double)(var30 * var30 + var31 * var31 + var32 * var32));
                  if (var33 <= 0) {
                    var33 = 1;
                  }
                  var30 = var30 * 256 / var33;
                  var31 = var31 * 256 / var33;
                  var32 = var32 * 256 / var33;
                  var34_ref_dd = var6.field_l[var21];
                  if (var34_ref_dd == null) {
                    dupTemp$0 = new dd();
                    var6.field_l[var21] = dupTemp$0;
                    var34_ref_dd = dupTemp$0;
                  }
                  var34_ref_dd.field_g = var34_ref_dd.field_g + var30;
                  var34_ref_dd.field_a = var34_ref_dd.field_a + var31;
                  var34_ref_dd.field_h = var34_ref_dd.field_h + var32;
                  var34_ref_dd.field_f = var34_ref_dd.field_f + 1;
                  var34_ref_ddLifetime1 = var6.field_l[var22];
                  if (var34_ref_ddLifetime1 == null) {
                    dupTemp$1 = new dd();
                    var6.field_l[var22] = dupTemp$1;
                    var34_ref_ddLifetime1 = dupTemp$1;
                  }
                  var34_ref_ddLifetime1.field_g = var34_ref_ddLifetime1.field_g + var30;
                  var34_ref_ddLifetime1.field_a = var34_ref_ddLifetime1.field_a + var31;
                  var34_ref_ddLifetime1.field_h = var34_ref_ddLifetime1.field_h + var32;
                  var34_ref_ddLifetime1.field_f = var34_ref_ddLifetime1.field_f + 1;
                  var34_ref_ddLifetime2 = var6.field_l[var23];
                  if (var34_ref_ddLifetime2 == null) {
                    dupTemp$2 = new dd();
                    var6.field_l[var23] = dupTemp$2;
                    var34_ref_ddLifetime2 = dupTemp$2;
                  }
                  var34_ref_ddLifetime2.field_g = var34_ref_ddLifetime2.field_g + var30;
                  var34_ref_ddLifetime2.field_a = var34_ref_ddLifetime2.field_a + var31;
                  var34_ref_ddLifetime2.field_h = var34_ref_ddLifetime2.field_h + var32;
                  var34_ref_ddLifetime2.field_f = var34_ref_ddLifetime2.field_f + 1;
                  break;
                }
                var30 = var30 >> 1;
                var31 = var31 >> 1;
                var32 = var32 >> 1;
              }
            }
          }
        }
        for (var20Lifetime1 = 0; var20Lifetime1 < var14; var20Lifetime1++) {
          var21Lifetime1 = var6.field_o[var20Lifetime1];
          var22Lifetime1 = var6.field_y[var20Lifetime1];
          var23Lifetime1 = var6.field_q[var20Lifetime1];
          if (var6.field_D != null) {
            stackIn_56_0 = (var6.field_D[var20Lifetime1] != -1) ? 1 : 0;
          } else {
            stackIn_56_0 = 0;
          }
          L17: {
            var24Lifetime1 = stackIn_56_0;
            if (var6.field_j != null &&
              var6.field_j[var20Lifetime1] != 0) {
              if (var6.field_j[var20Lifetime1] != 1) {
                var15.field_l[var20Lifetime1] = -2;
                break L17;
              }
              var25Lifetime1 = var59[var22Lifetime1] - var59[var21Lifetime1];
              var26Lifetime1 = var60[var22Lifetime1] - var60[var21Lifetime1];
              var27Lifetime1 = var61[var22Lifetime1] - var61[var21Lifetime1];
              var28Lifetime1 = var59[var23Lifetime1] - var59[var21Lifetime1];
              var29Lifetime1 = var60[var23Lifetime1] - var60[var21Lifetime1];
              var30Lifetime1 = var61[var23Lifetime1] - var61[var21Lifetime1];
              var31Lifetime1 = var26Lifetime1 * var30Lifetime1 - var29Lifetime1 * var27Lifetime1;
              var32Lifetime1 = var27Lifetime1 * var28Lifetime1 - var30Lifetime1 * var25Lifetime1;
              var33Lifetime1 = var25Lifetime1 * var29Lifetime1 - var28Lifetime1 * var26Lifetime1;
              while (true) {
                if (var31Lifetime1 <= 8192 &&
                  var32Lifetime1 <= 8192 &&
                  var33Lifetime1 <= 8192 &&
                  var31Lifetime1 >= -8192 &&
                  var32Lifetime1 >= -8192 &&
                  var33Lifetime1 >= -8192) {
                  var34 = (int)Math.sqrt((double)(var31Lifetime1 * var31Lifetime1 + var32Lifetime1 * var32Lifetime1 + var33Lifetime1 * var33Lifetime1));
                  if (var34 <= 0) {
                    var34 = 1;
                  }
                  var31Lifetime1 = var31Lifetime1 * 256 / var34;
                  var32Lifetime1 = var32Lifetime1 * 256 / var34;
                  var33Lifetime1 = var33Lifetime1 * 256 / var34;
                  var35 = param1 + (param3 * var31Lifetime1 + param4 * var32Lifetime1 + param5 * var33Lifetime1) / (var13 + var13 / 2);
                  var15.field_f[var20Lifetime1] = sg.a((int) var6.field_m[var20Lifetime1], var35, var24Lifetime1 != 0);
                  var15.field_l[var20Lifetime1] = -1;
                  break L17;
                }
                var31Lifetime1 = var31Lifetime1 >> 1;
                var32Lifetime1 = var32Lifetime1 >> 1;
                var33Lifetime1 = var33Lifetime1 >> 1;
              }
            }
            var27Lifetime1Lifetime1 = var6.field_m[var20Lifetime1];
            if (var13 != 0 &&
              var6.field_l[var21Lifetime1].field_f != 0) {
            }
            var43 = var6.field_l[var21Lifetime1];
            var26Lifetime1Lifetime1 = param1 + (param3 * var43.field_g + param4 * var43.field_a + param5 * var43.field_h) / (var13 * var43.field_f);
            var15.field_f[var20Lifetime1] = sg.a(var27Lifetime1Lifetime1, var26Lifetime1Lifetime1, var24Lifetime1 != 0);
            if (var6.field_l[var22Lifetime1].field_f != 0) {
            }
            var44 = var6.field_l[var22Lifetime1];
            var26Lifetime1Lifetime2 = param1 + (param3 * var44.field_g + param4 * var44.field_a + param5 * var44.field_h) / (var13 * var44.field_f);
            var15.field_s[var20Lifetime1] = sg.a(var27Lifetime1Lifetime1, var26Lifetime1Lifetime2, var24Lifetime1 != 0);
            if (var6.field_l[var23Lifetime1].field_f != 0) {
            }
            var45 = var6.field_l[var23Lifetime1];
            var26Lifetime1Lifetime3 = param1 + (param3 * var45.field_g + param4 * var45.field_a + param5 * var45.field_h) / (var13 * var45.field_f);
            var15.field_l[var20Lifetime1] = sg.a(var27Lifetime1Lifetime1, var26Lifetime1Lifetime3, var24Lifetime1 != 0);
          }
        }
        return;
    }

    private final void b() {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_36_0 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        for (var1 = 0; var1 < this.field_g.length; var1++) {
          {
            if (!this.field_x[var1]) {
              this.e(var1);
              this.field_p[var1] = this.field_G[var1].length - 1;
              while (this.field_p[var1] >= 0) {
                if (this.field_G[var1][this.field_p[var1]] != -1) {
                  break;
                }
                this.field_p[var1] = this.field_p[var1] - 1;
              }
            } else {
              this.field_p[var1] = -1;
            }
          }
          stackIn_10_0 = this.field_m;
          stackIn_10_1 = var1;
          if (this.field_p[var1] != -1) {
            stackIn_11_2 = this.b(var1, this.field_G[var1][this.field_p[var1]]);
          } else {
            stackIn_11_2 = -2147483648;
          }
          stackIn_10_0[stackIn_10_1] = stackIn_11_2;
          this.field_q[var1] = var1;
          var2 = var1;
          var3 = (var1 - 1) / 2;
          while (var2 > 0) {
            if (this.a(this.field_q[var2], this.field_q[var3])) {
              var4 = this.field_q[var2];
              this.field_q[var2] = this.field_q[var3];
              this.field_q[var3] = var4;
              var2 = var3;
              var3 = (var3 - 1) / 2;
              continue;
            }
            break;
          }
        }
        while (true) {
          if (this.field_m[this.field_q[0]] == -2147483648) {
            return;
          }
          var1Lifetime1 = this.field_q[0];
          var2Lifetime1 = this.field_G[var1Lifetime1][this.field_p[var1Lifetime1]];
          this.c(var1Lifetime1, var2Lifetime1);
          dupTemp$0 = this.field_p[var1Lifetime1];
          this.field_p[var1Lifetime1] = dupTemp$0 - 1;
          stackIn_22_0 = this.field_m;
          stackIn_22_1 = var1Lifetime1;
          if (dupTemp$0 <= 0) {
            stackIn_23_2 = -2147483648;
          } else {
            dupTemp$1 = this.b(var1Lifetime1, this.field_G[var1Lifetime1][this.field_p[var1Lifetime1]]);
            this.field_m[var1Lifetime1] = dupTemp$1;
            stackIn_23_2 = dupTemp$1;
          }
          stackIn_22_0[stackIn_22_1] = stackIn_23_2;
          var3Lifetime1 = 0;
          while (true) {
            var4Lifetime1 = 2 * var3Lifetime1 + 1;
            var5 = var4Lifetime1 + 1;
            if (var4Lifetime1 >= this.field_q.length) {
              if (var5 >= this.field_q.length) {
                break;
              }
              if (!this.a(this.field_q[var5], var1Lifetime1)) {
                break;
              }
              this.field_q[var3Lifetime1] = this.field_q[var5];
              this.field_q[var5] = var1Lifetime1;
              var3Lifetime1 = var5;
              continue;
            }
            if (this.a(var1Lifetime1, this.field_q[var4Lifetime1])) {
              if (var5 >= this.field_q.length) {
                break;
              }
              if (!this.a(this.field_q[var5], var1Lifetime1)) {
                break;
              }
              this.field_q[var3Lifetime1] = this.field_q[var5];
              this.field_q[var5] = var1Lifetime1;
              var3Lifetime1 = var5;
              continue;
            }
            if (var5 < this.field_q.length &&
              this.a(this.field_q[var5], this.field_q[var4Lifetime1])) {
              stackIn_36_0 = var5;
            } else {
              stackIn_36_0 = var4Lifetime1;
            }
            var6 = stackIn_36_0;
            this.field_q[var3Lifetime1] = this.field_q[var6];
            this.field_q[var6] = var1Lifetime1;
            var3Lifetime1 = var6;
          }
        }
    }

    sg(int param0) {
        this.field_y = param0;
        this.field_g = new kh[param0];
        this.field_F = new int[param0];
        this.field_h = new int[param0];
        this.field_i = new int[param0];
        this.field_v = new int[param0][];
        this.field_c = new int[param0][];
        this.field_u = new int[param0][];
        this.field_G = new int[param0][];
        this.field_x = new boolean[param0];
        this.field_D = null;
        this.field_p = new int[param0];
        this.field_m = new int[param0];
        this.field_q = new int[param0];
    }

    static {
        field_l = new int[3];
        field_f = 1;
        field_r = new short[1024][4096];
        field_E = new int[1024];
        field_B = new short[768][1024];
        field_d = new int[3];
        field_z = new int[768];
        field_k = new int[3];
        field_t = new int[3];
        field_n = new int[3];
    }
}
