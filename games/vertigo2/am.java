/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private bg[] field_a;
    private int[][] field_u;
    static fe field_o;
    static int field_n;
    static int field_t;
    private cn field_s;
    private ha field_f;
    private float field_p;
    private int field_l;
    static boolean field_b;
    static String field_e;
    private int[][] field_r;
    static String field_m;
    private int[] field_j;
    private int field_i;
    private int field_q;
    private hb[] field_c;
    private int field_d;
    private cq[] field_g;
    private int field_k;
    private String[] field_h;
    private int[][] field_v;

    final void a(bh param0, byte param1, boolean param2, int param3) {
        cq[] stackIn_90_0 = null;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bh var12 = null;
        wo var13 = null;
        ho var14 = null;
        wo var15 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_l == this.field_d) {
            if (param3 >= 0) {
              boolean decompiledFrameRemainder0 = true;
              var13 = param0.field_f[param3];
              var6 = lj.a(var13.field_E, false, 128);
              var7 = lj.a(var13.field_y, false, 128);
              var8 = lj.a(var13.field_k + 120, false, 240);
              var9 = this.field_s.field_q;
              if ((var9 != 0 ||
                param0.a((byte) 108, -1 + var7, var6, var8 - 1) == null) && (var9 != 1 ||
                null == param0.a((byte) 108, var7, var6 - 1, var8 - 1)) && (var9 != 2 ||
                param0.a((byte) 108, 1 + var7, var6, -1 + var8) == null) && (3 != var9 ||
                param0.a((byte) 108, var7, 1 + var6, -1 + var8) == null)) {
                this.field_s.a(1, 125);
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_s.a(0, -125);
              }
              if (param2 &&
                cr.field_eb[il.field_d] &&
                param0.h(param1 ^ -9869) == 1 &&
                !var13.field_G &&
                var13.b(param1 ^ 119) != 4 &&
                !param0.d(-2)) {
                this.field_s.a(2, 40);
              }
              if (var13.field_G &&
                5 != var13.b(-1)) {
                this.field_s.a(var13.c((byte) -127), param1 ^ -66);
              }
              this.field_s.a(-1);
              var10 = var13.b(param1 ^ 119);
              if (var10 != this.field_i &&
                this.field_i == 7) {
                this.field_s.d(param1 ^ -594);
              }
              this.field_i = var13.b(-1);
            }
          } else {
            this.field_p = this.field_p + 0.05000000074505806f;
            if (1.0f <= this.field_p) {
              this.field_d = param3;
              this.field_l = param3;
              this.field_p = 0.0f;
            }
          }
          var5_int = param0.h(param1 ^ -9869);
          if (param1 != -120) {
            var12 = (bh) null;
            this.a(true, 50, (bh) null, (byte) -74);
          }
          boolean decompiledFrameRemainder1 = true;
          var6Lifetime1 = param0.field_n;
          var7Lifetime1 = var5_int;
          if (var7Lifetime1 == 6) {
            if ((param0.field_w == 0 ||
              param0.field_w == 3) &&
              (var6Lifetime1 > 200 &&
              200 >= this.field_q)) {
              gm.a(25, (byte) -55);
            }
            if (this.field_k != var5_int) {
              for (var7Lifetime1 = 0; var7Lifetime1 < this.field_c.length; var7Lifetime1++) {
                this.field_c[var7Lifetime1].d(-23);
              }
            }
            for (var7Lifetime1 = 0; var7Lifetime1 < this.field_c.length; var7Lifetime1++) {
              this.field_c[var7Lifetime1].a(0, (byte) -36);
            }
            if ((param0.field_w == 2)) {
              if (param3 == 0) {
                if (param0.field_E < 50) {
                  this.field_c[0].a(19, (byte) -36);
                } else {
                  if (param0.field_E > 50) {
                    this.field_c[1].a(19, (byte) -36);
                  }
                }
              }
              if ((param3 == 1)) {
                if (param0.field_E > 50) {
                  this.field_c[0].a(19, (byte) -36);
                }
                if (!(param0.field_E >= 50)) {
                  this.field_c[1].a(19, (byte) -36);
                }
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            if (var7Lifetime1 == 0) {
              this.field_c[0].a(0, param1 ^ 25116);
              if (1 < this.field_c.length) {
                this.field_c[1].a(1, -25196);
              }
            } else {
              if ((var7Lifetime1 == 2 ||
                var7Lifetime1 == 7) && var6Lifetime1 >= 75) {
                this.field_c[0].a(25, (byte) -36);
                if (param0.field_w != 0 &&
                  param0.field_w != 3) {
                  this.field_c[1].a(25, (byte) -36);
                }
              }
            }
          }
          this.field_k = var5_int;
          this.field_q = var6Lifetime1;
          for (var7Lifetime2 = 0; var7Lifetime2 < this.field_g.length; var7Lifetime2++) {
            this.field_g[var7Lifetime2].a((byte) 68);
          }
          for (var7Lifetime3 = 0; var7Lifetime3 < 4; var7Lifetime3++) {
            var14 = param0.a((byte) -114);
            if (var14 != null) {
              if (var14.field_h < 0) {
                var14.field_h = (byte) 0;
              }
              stackIn_90_0 = this.field_g;
              if (var14.field_h <= 1) {
                stackIn_91_1 = var14.field_h;
              } else {
                stackIn_91_1 = 0;
              }
              ((cq) (Object) stackIn_90_0[stackIn_91_1]).a(111, var14.field_j, var14.field_b, var14.field_c, var14.field_f, var14.field_g);
              continue;
            }
            break;
          }
          for (var7Lifetime4 = 0; var7Lifetime4 < param0.field_f.length; var7Lifetime4++) {
            var15 = param0.field_f[var7Lifetime4];
            this.field_c[var7Lifetime4].a(var15, (byte) -76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_98_0 = var5;
          stackIn_98_1 = new StringBuilder().append("am.F(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, bh param2) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        bg stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int[] stackIn_82_2 = null;
        boolean stackIn_83_3;
        bg stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_86_2 = null;
        boolean stackIn_87_3;
        bg stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int[] stackIn_99_2 = null;
        boolean stackIn_100_3;
        bg stackIn_106_0 = null;
        boolean stackIn_106_1 = false;
        int[] stackIn_106_2 = null;
        boolean stackIn_107_3;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        wo[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        wo var7_ref_wo = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fe var11_ref_fe = null;
        int var11 = 0;
        int var12_int = 0;
        jg[] var12 = null;
        int var13_int = 0;
        rn[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19_int = 0;
        Object var19 = null;
        int var20 = 0;
        int var21 = 0;
        wo[] var22 = null;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var15Lifetime2;
        int var18Lifetime1;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          var22 = param2.field_f;
          var4 = var22;
          if (0 <= param0) {
            stackIn_7_0 = (param2.c((byte) 104)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var5 = stackIn_7_0;
          if (var5 == 0) {
            hn.a(false, 380, -420, this.field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
          } else {
            if (!param2.d(-2)) {
              if (this.field_s.field_o) {
                this.field_s.field_o = false;
                this.field_s.d(550);
              }
              var7_ref_wo = var22[param0];
              if (this.field_d == this.field_l) {
                this.field_s.a(var7_ref_wo.field_k, var7_ref_wo.field_E, 12257, var7_ref_wo.field_y);
              } else {
                var8 = var7_ref_wo.field_E - var22[this.field_d].field_E;
                var9 = -var22[this.field_d].field_y + var7_ref_wo.field_y;
                var10 = -var22[this.field_d].field_k + var7_ref_wo.field_k;
                this.field_s.a(var22[this.field_d].field_k + (int)((float)var10 * this.field_p), var22[this.field_d].field_E + (int)((float)var8 * this.field_p), 12257, var22[this.field_d].field_y + (int)(this.field_p * (float)var9));
              }
            } else {
              this.field_s.a(param2.field_D, param2.field_A + 1000, param2.field_v, false, param2.field_h, param2.field_K, -1000 + param2.field_z);
              if (!this.field_s.field_o) {
                this.field_s.d(550);
                this.field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
              }
              this.field_s.a(0, 0, 12257, 0);
            }
          }
          for (var6 = 0; var6 < this.field_c.length; var6++) {
            this.field_c[var6].a(false, var22[var6]);
          }
          if (!hn.field_t) {
            ue.field_N.c(0, 0);
          } else {
            qr.field_l.a(this.field_s.field_e, 28580);
          }
          sc.a(true, rg.field_f);
          var6Lifetime1 = this.field_s.field_e[0];
          var7 = this.field_s.field_e[2];
          var8Lifetime1 = this.field_s.field_e[1];
          var9Lifetime1 = param2.h(9979);
          if (var9Lifetime1 != 7) {
            if (var9Lifetime1 != 6) {
              if (var9Lifetime1 != 3) {
                stackIn_35_0 = (var9Lifetime1 == 4) ? 1 : 0;
              } else {
                stackIn_35_0 = 1;
              }
            } else {
              stackIn_35_0 = 1;
            }
          } else {
            stackIn_35_0 = 1;
          }
          var10Lifetime1 = stackIn_35_0;
          if (cn.field_r) {
            var11_ref_fe = sf.field_b;
            var12_int = sf.field_b.field_y << 5;
            var13_int = sf.field_b.field_t << 5;
            var14 = Vertigo2.field_C.field_y << 4;
            var15 = Vertigo2.field_C.field_t << 4;
            var16 = ji.field_p.field_y << 4;
            var17_int = ji.field_p.field_t << 4;
            var18 = jf.field_M.field_y << 4;
            var19_int = jf.field_M.field_t << 4;
            if (this.field_s.field_o ||
              var10Lifetime1 != 0) {
              var16 = var16 / 2;
              var12_int = var12_int / 2;
              var19_int = var19_int / 2;
              var13_int = var13_int / 2;
              var14 = var14 / 2;
              var15 = var15 / 2;
              var18 = var18 / 2;
              var17_int = var17_int / 2;
            }
            gb.a(this.field_r[0][1], jf.field_M, var19_int, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var18, -98);
            for (var20 = 0; 1000 > var20; var20++) {
              gb.a(this.field_u[var20][1], var11_ref_fe, var13_int, this.field_u[var20][0], this.field_s.field_e, this.field_u[var20][2], var12_int, -118);
            }
            gb.a(this.field_v[0][1], Vertigo2.field_C, var15, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var14, -124);
            gb.a(this.field_v[1][1], ji.field_p, var17_int, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var16, -114);
          }
          var11 = 0;
          var12 = param2.c(126);
          for (var13_intLifetime1 = param2.l(-115) - 1; var13_intLifetime1 >= 0; var13_intLifetime1--) {
            if (var12[var13_intLifetime1] != null) {
              this.field_j[var11] = var12[var13_intLifetime1].a(var7, -128, var6Lifetime1, var8Lifetime1);
              incrementValue$2 = var11;
              var11++;
              this.field_a[incrementValue$2] = (bg) ((Object) var12[var13_intLifetime1]);
            }
          }
          var13 = param2.m(9384);
          for (var14Lifetime1 = param2.e((byte) 117) - 1; var14Lifetime1 >= 0; var14Lifetime1--) {
            this.field_j[var11] = var13[var14Lifetime1].a(var7, -113, var6Lifetime1, var8Lifetime1);
            incrementValue$1 = var11;
            var11++;
            this.field_a[incrementValue$1] = (bg) ((Object) var13[var14Lifetime1]);
          }
          if (var10Lifetime1 != 0) {
            this.field_c[0].a(param0, -25196);
          }
          if (var9Lifetime1 != 0) {
            for (var14Lifetime2 = 0; this.field_c.length > var14Lifetime2; var14Lifetime2++) {
              this.field_j[var11] = this.field_c[var14Lifetime2].a(var6Lifetime1, var7, 0, var8Lifetime1);
              incrementValue$0 = var11;
              var11++;
              this.field_a[incrementValue$0] = (bg) ((Object) this.field_c[var14Lifetime2]);
              if (var10Lifetime1 != 0) {
                break;
              }
            }
          }
          this.a(-1 + var11, 3, 0);
          if (param1 < 82) {
            return;
          }
          var14Lifetime3 = param2.field_n;
          if (var9Lifetime1 != 2 &&
            7 != var9Lifetime1) {
            for (var15Lifetime1 = var11 - 1; 0 <= var15Lifetime1; var15Lifetime1--) {
              stackIn_106_0 = this.field_a[var15Lifetime1];
              stackIn_106_1 = false;
              stackIn_106_2 = this.field_s.field_e;
              stackIn_107_3 = (param2.field_w == 2);
              ((bg) (Object) stackIn_106_0).a(stackIn_106_1, stackIn_106_2, stackIn_107_3, this.field_s.field_o);
            }
            return;
          }
          stackIn_69_0 = (50 > var14Lifetime3) ? 0 : 1;
          var15Lifetime2 = stackIn_69_0;
          if (var15Lifetime2 != 0) {
            for (var16 = 0; this.field_c.length > var16; var16++) {
              this.field_c[var16].a(6, (byte) -36);
            }
            this.field_s.field_e[1] = this.field_s.field_e[1] - (20 * var14Lifetime3 - 1000);
            for (var16 = var11 - 1; 0 <= var16; var16--) {
              if (this.field_a[var16] instanceof hb) {
                stackIn_99_0 = this.field_a[var16];
                stackIn_99_1 = -30;
                stackIn_99_2 = this.field_s.field_e;
                stackIn_100_3 = (param2.field_w == 2);
                ((bg) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_99_2, stackIn_100_3, (byte[]) null, this.field_s.field_o);
              }
            }
            return;
          }
          var16 = var14Lifetime3 * 24 / 50;
          var17 = oo.field_c;
          var18Lifetime1 = var16;
          if (12 <= var18Lifetime1) {
            var18Lifetime1 = 11;
          }
          oo.field_c = bm.field_G[var18Lifetime1];
          var19 = null;
          var16 -= 12;
          if (var16 >= 0) {
            if (var16 >= 12) {
              var16 = 11;
            }
            var19 = lf.field_A[var16];
          }
          for (var20 = -1 + var11; 0 <= var20; var20--) {
            if (!(this.field_a[var20] instanceof hb)) {
              stackIn_86_0 = this.field_a[var20];
              stackIn_86_1 = -30;
              stackIn_86_2 = this.field_s.field_e;
              stackIn_87_3 = (2 == param2.field_w);
              ((bg) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2, stackIn_87_3, (byte[]) (var19), this.field_s.field_o);
            } else {
              oo.field_c = var17;
              stackIn_82_0 = this.field_a[var20];
              stackIn_82_1 = -30;
              stackIn_82_2 = this.field_s.field_e;
              stackIn_83_3 = (param2.field_w == 2);
              ((bg) (Object) stackIn_82_0).a(stackIn_82_1, stackIn_82_2, stackIn_83_3, (byte[]) null, this.field_s.field_o);
              oo.field_c = bm.field_G[var18Lifetime1];
            }
          }
          oo.field_c = var17;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_111_0 = var4_ref;
          stackIn_111_1 = new StringBuilder().append("am.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < this.field_c.length; var2++) {
          this.field_c[var2].d(-125);
          this.field_g[var2].a(-96);
        }
        if (param0 < 115) {
          this.field_f = (ha) null;
        }
    }

    final void a(int param0) {
        if (param0 != 15481) {
          this.b((byte) -1);
        }
        if (!this.field_s.a(true)) {
          return;
        }
        this.field_s.field_q = (3 + this.field_s.field_q) % 4;
    }

    final void b(byte param0) {
        if (!this.field_s.a(true)) {
          return;
        }
        this.field_s.field_q = (this.field_s.field_q + 1) % 4;
        if (param0 <= 47) {
          this.field_h = (String[]) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          bh var3 = (bh) null;
          this.a((bh) null, -30, -79);
        }
        return this.field_l != this.field_d ? true : false;
    }

    final void a(bh param0, int param1, int param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wo var11 = null;
        int var5Lifetime1;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_l != this.field_d) {
            this.field_p = this.field_p + 0.05000000074505806f;
            if (this.field_p >= 1.0f) {
              this.field_d = param1;
              this.field_l = param1;
              this.field_p = 0.0f;
            }
          } else {
            if (0 <= param1) {
              boolean decompiledFrameRemainder0 = true;
              var11 = param0.field_f[param1];
              var5 = lj.a(var11.field_E, false, 128);
              var6 = lj.a(var11.field_y, false, 128);
              var7 = lj.a(120 + var11.field_k, false, 240);
              var8 = this.field_s.field_q;
              if ((var8 != 0 ||
                null == param0.a((byte) 108, var6 - 1, var5, -1 + var7)) && (1 != var8 ||
                null == param0.a((byte) 108, var6, -1 + var5, var7 - 1)) && (var8 != 2 ||
                null == param0.a((byte) 108, var6 + 1, var5, -1 + var7)) && (var8 != 3 ||
                param0.a((byte) 108, var6, 1 + var5, -1 + var7) == null)) {
                this.field_s.a(1, 94);
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_s.a(0, 109);
              }
              if (var11.field_G) {
                this.field_s.a(var11.c((byte) -128), -115);
              }
              this.field_s.a(-1);
              var9 = var11.b(-1);
              if (this.field_i != var9 &&
                this.field_i == 7) {
                this.field_s.d(550);
              }
              this.field_i = var11.b(-1);
            }
          }
          var4_int = param0.h(9979);
          if (param2 >= -9) {
            this.field_p = 0.5239396691322327f;
          }
          var5Lifetime1 = var4_int;
          if (6 == var5Lifetime1) {
            if (0 == this.field_c[0].c(false)) {
              this.field_c[0].a(22, (byte) -36);
            }
          } else {
            if (var5Lifetime1 == 0) {
              this.field_c[0].a(0, -25196);
              if (1 < this.field_c.length) {
                this.field_c[1].a(1, -25196);
              }
            }
          }
          this.field_k = var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("am.C(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, bh param4, int param5, int param6, int param7, int param8) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        hb stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        int stackIn_56_0 = 0;
        int stackIn_134_0 = 0;
        bg stackIn_152_0 = null;
        boolean stackIn_152_1 = false;
        int[] stackIn_152_2 = null;
        boolean stackIn_153_3;
        bg stackIn_157_0 = null;
        boolean stackIn_158_1 = false;
        int[] stackIn_160_2 = null;
        boolean stackIn_161_3;
        bg stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        int[] stackIn_172_2 = null;
        boolean stackIn_173_3;
        int stackIn_196_0 = 0;
        bg stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        int[] stackIn_212_2 = null;
        boolean stackIn_213_3;
        bg stackIn_226_0 = null;
        boolean stackIn_227_1 = false;
        int[] stackIn_229_2 = null;
        boolean stackIn_230_3;
        bh stackIn_314_0 = null;
        int stackIn_314_1 = 0;
        boolean stackIn_316_2 = false;
        RuntimeException stackIn_359_0 = null;
        StringBuilder stackIn_359_1 = null;
        String stackIn_360_2 = null;
        RuntimeException decompiledCaughtException = null;
        wo[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wo var14_ref_wo = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        fe var18_ref_fe = null;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        jg[] var20 = null;
        int var21_int = 0;
        rn[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        hi[] var23_ref_hi__ = null;
        int var24 = 0;
        int var25 = 0;
        int[] var25_ref_int__ = null;
        int var26 = 0;
        int[] var26_ref_int__ = null;
        int var27_int = 0;
        String[] var27 = null;
        int var28 = 0;
        Object var28_ref = null;
        int var29 = 0;
        String var29_ref_String = null;
        Object var30_ref = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        wo[] var33 = null;
        Object var34 = null;
        hb var34_ref = null;
        lg var35 = null;
        fc var36 = null;
        Object var37 = null;
        hb var37_ref = null;
        String[] var38 = null;
        String[] var39 = null;
        String var40 = null;
        String[] var41 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var19Lifetime1;
        int var21_intLifetime1;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        int var22Lifetime4;
        int var22Lifetime5;
        int var23Lifetime1;
        int var26Lifetime1;
        int var26Lifetime2;
        int var30Lifetime1;
        int var26Lifetime1Lifetime1;
        var34 = null;
        var37 = null;
        var32 = Vertigo2.field_L ? 1 : 0;
        try {
          var33 = param4.field_f;
          var10 = var33;
          stackIn_4_0 = (param4.field_w != 2) ? 0 : 1;
          var11 = stackIn_4_0;
          if (param8 >= 0) {
            stackIn_10_0 = (param4.c((byte) 104)) ? 1 : 0;
          } else {
            stackIn_10_0 = 0;
          }
          var12 = stackIn_10_0;
          if (var12 != 0) {
            if (param4.d(-2) &&
              0 <= param0) {
              if (!this.field_s.field_o) {
                this.field_s.d(550);
                this.field_s.a(param4.field_D, param4.field_A, param4.field_v, false, param4.field_h, param4.field_K, param4.field_z);
              }
              this.field_s.a(0, 0, 12257, 0);
            } else {
              if (this.field_s.field_o) {
                this.field_s.field_o = false;
                this.field_s.d(550);
              }
              var14_ref_wo = var33[param8];
              if (this.field_d == this.field_l) {
                if (5 != param4.h(9979)) {
                  this.field_s.a(var14_ref_wo.field_k, var14_ref_wo.field_E, 12257, var14_ref_wo.field_y);
                }
              } else {
                var15 = -var10[this.field_d].field_E + var14_ref_wo.field_E;
                var16 = var14_ref_wo.field_y - var10[this.field_d].field_y;
                var17 = -var10[this.field_d].field_k + var14_ref_wo.field_k;
                this.field_s.a((int)((float)var17 * this.field_p) + var10[this.field_d].field_k, (int)(this.field_p * (float)var15) + var10[this.field_d].field_E, 12257, var10[this.field_d].field_y + (int)((float)var16 * this.field_p));
              }
            }
          } else {
            if (param4.field_w != 0 &&
              3 != param4.field_w) {
              hn.a(!param3, 180, -120, this.field_s.field_e, -270, -80, -140, 180, 0, 0, -1);
            } else {
              hn.a(false, param4.field_f[0].field_E, -420, this.field_s.field_e, -270, -64, -140, param4.field_f[0].field_y, 0, 0, -1);
            }
          }
          for (var13 = 0; this.field_c.length > var13; var13++) {
            stackIn_34_0 = this.field_c[var13];
            stackIn_35_1 = !(param3);
            ((hb) (Object) stackIn_34_0).a(stackIn_35_1, var33[var13]);
          }
          if (hn.field_t) {
            qr.field_l.a(this.field_s.field_e, 28580);
          } else {
            ue.field_N.c(0, 0);
          }
          sc.a(param3, rg.field_f);
          var13Lifetime1 = param4.h(9979);
          if (var13Lifetime1 == 4) {
            var14 = 255 * param4.field_n / 200;
            if (var14 > 255) {
              var14 = 255;
            }
            if (0 < var14) {
              jn.a(this.field_s.field_e, 3000, ie.field_Hb, 1300, var14, (ie.field_Hb.field_B << 3) + 2000, 4000, 10, 2000 + (ie.field_Hb.field_x << 3));
            }
          }
          var14Lifetime1 = this.field_s.field_e[0];
          var15Lifetime1 = this.field_s.field_e[2];
          var16Lifetime1 = this.field_s.field_e[1];
          if (var13Lifetime1 != 7) {
            if (var13Lifetime1 != 6) {
              if (3 != var13Lifetime1) {
                stackIn_56_0 = (var13Lifetime1 == 4) ? 1 : 0;
              } else {
                stackIn_56_0 = 1;
              }
            } else {
              stackIn_56_0 = 1;
            }
          } else {
            stackIn_56_0 = 1;
          }
          var17Lifetime1 = stackIn_56_0;
          if (cn.field_r) {
            var18_ref_fe = sf.field_b;
            var19 = sf.field_b.field_y << 3;
            var20_int = sf.field_b.field_t << 3;
            var21_int = Vertigo2.field_C.field_y << 3;
            var22 = Vertigo2.field_C.field_t << 3;
            var23 = ji.field_p.field_y << 3;
            var24 = ji.field_p.field_t << 3;
            var25 = jf.field_M.field_y << 3;
            var26 = jf.field_M.field_t << 3;
            if (var13Lifetime1 != 4) {
              gb.a(this.field_r[0][1], jf.field_M, var26, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var25, -86);
            }
            if (var13Lifetime1 != 4) {
              for (var27_int = 0; var27_int < 1000; var27_int++) {
                gb.a(this.field_u[var27_int][1], var18_ref_fe, var20_int, this.field_u[var27_int][0], this.field_s.field_e, this.field_u[var27_int][2], var19, -95);
              }
            } else {
              if (200 > param4.field_n) {
                var27_int = -(param4.field_n * 255 / 200) + 255;
                for (var28 = 0; var28 < 1000; var28++) {
                  jn.a(this.field_s.field_e, this.field_u[var28][2], var18_ref_fe, this.field_u[var28][1], var27_int, var20_int, this.field_u[var28][0], 10, var19);
                }
              }
            }
            if (var13Lifetime1 != 4) {
              gb.a(this.field_v[0][1], Vertigo2.field_C, var22, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var21_int, -128);
              gb.a(this.field_v[1][1], ji.field_p, var24, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var23, -128);
            }
          }
          if (gi.field_r) {
            bi.a(0, 0, 640, 480);
          }
          var18 = var16Lifetime1 - 240;
          if (param4.h(9979) == 1 &&
            !this.field_s.field_o &&
            var16Lifetime1 + 240 < var33[param8].field_k) {
            var18 = var16Lifetime1;
          }
          var19Lifetime1 = 0;
          var20 = param4.c(108);
          for (var21_intLifetime1 = -1 + param4.l(81); var21_intLifetime1 >= 0; var21_intLifetime1--) {
            if (var20[var21_intLifetime1] != null &&
              var18 < var20[var21_intLifetime1].field_s) {
              this.field_j[var19Lifetime1] = var20[var21_intLifetime1].a(var15Lifetime1, -112, var14Lifetime1, var16Lifetime1);
              incrementValue$4 = var19Lifetime1;
              var19Lifetime1++;
              this.field_a[incrementValue$4] = (bg) ((Object) var20[var21_intLifetime1]);
            }
          }
          var21 = param4.m(9384);
          for (var22Lifetime1 = param4.e((byte) -128) - 1; var22Lifetime1 >= 0; var22Lifetime1--) {
            if (var18 < var21[var22Lifetime1].field_s) {
              this.field_j[var19Lifetime1] = var21[var22Lifetime1].a(var15Lifetime1, -104, var14Lifetime1, var16Lifetime1);
              incrementValue$3 = var19Lifetime1;
              var19Lifetime1++;
              this.field_a[incrementValue$3] = (bg) ((Object) var21[var22Lifetime1]);
            }
          }
          for (var22Lifetime2 = 0; this.field_g.length > var22Lifetime2; var22Lifetime2++) {
            var23_ref_hi__ = this.field_g[var22Lifetime2].b(-34);
            if (var23_ref_hi__ != null) {
              for (var24 = 0; this.field_g[var22Lifetime2].field_k > var24; var24++) {
                this.field_j[var19Lifetime1] = var23_ref_hi__[var24].a((byte) -127, var15Lifetime1, var14Lifetime1, var16Lifetime1);
                incrementValue$2 = var19Lifetime1;
                var19Lifetime1++;
                this.field_a[incrementValue$2] = (bg) ((Object) var23_ref_hi__[var24]);
              }
            }
          }
          if (var17Lifetime1 != 0) {
            this.field_c[0].a(param8, -25196);
            if (this.field_c.length > 1) {
              this.field_c[1].a(1 - param8, -25196);
            }
            if (var13Lifetime1 != 0) {
              for (var22Lifetime3 = 0; var22Lifetime3 < this.field_c.length; var22Lifetime3++) {
                this.field_j[var19Lifetime1] = this.field_c[var22Lifetime3].a(var14Lifetime1, var15Lifetime1, 0, var16Lifetime1);
                incrementValue$0 = var19Lifetime1;
                var19Lifetime1++;
                this.field_a[incrementValue$0] = (bg) ((Object) this.field_c[var22Lifetime3]);
              }
            }
          } else {
            if (var13Lifetime1 != 0) {
              for (var22Lifetime3 = 0; var22Lifetime3 < this.field_c.length; var22Lifetime3++) {
                this.field_j[var19Lifetime1] = this.field_c[var22Lifetime3].a(var14Lifetime1, var15Lifetime1, 0, var16Lifetime1);
                incrementValue$1 = var19Lifetime1;
                var19Lifetime1++;
                this.field_a[incrementValue$1] = (bg) ((Object) this.field_c[var22Lifetime3]);
              }
            }
          }
          this.a(-1 + var19Lifetime1, 3, 0);
          if (!lf.field_C) {
            for (var22Lifetime4 = 0; var22Lifetime4 < this.field_c.length; var22Lifetime4++) {
              this.field_c[var22Lifetime4].b(true);
            }
          } else {
            if (null == dc.field_J ||
              dc.field_J.length != this.field_c.length) {
              dc.field_J = new lg[this.field_c.length];
            }
            if (null == oe.field_ob ||
              this.field_c.length != oe.field_ob.length) {
              oe.field_ob = new int[this.field_c.length][3];
            }
            if (null == va.field_b) {
              va.field_b = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
            }
            for (var22Lifetime4 = 0; this.field_c.length > var22Lifetime4; var22Lifetime4++) {
              this.field_c[var22Lifetime4].b(true);
              dc.field_J[var22Lifetime4] = this.field_c[var22Lifetime4].c((byte) 4);
              oe.field_ob[var22Lifetime4][0] = this.field_c[var22Lifetime4].field_w;
              oe.field_ob[var22Lifetime4][1] = this.field_c[var22Lifetime4].field_z;
              oe.field_ob[var22Lifetime4][2] = this.field_c[var22Lifetime4].field_x;
            }
          }
          var22Lifetime5 = param4.field_n;
          if (this.field_s.c(-1870) != 2) {
            stackIn_134_0 = (this.field_s.b(1) == 2) ? 1 : 0;
          } else {
            stackIn_134_0 = 1;
          }
          var23Lifetime1 = stackIn_134_0;
          if (var13Lifetime1 != 2 &&
            var13Lifetime1 != 7) {
            for (var24 = var19Lifetime1 - 1; 0 <= var24; var24--) {
              if (!(this.field_a[var24] instanceof hb)) {
                var25_ref_int__ = oo.field_c;
                var26Lifetime1 = this.field_a[var24].a(5) - var33[param8].field_k;
                if (var26Lifetime1 > 0 &&
                  !this.field_s.field_o) {
                  if (var26Lifetime1 < 720) {
                    var27_int = var26Lifetime1 / hn.field_v;
                  } else {
                    var27_int = 15;
                  }
                  oo.field_c = Vertigo2.field_J[var27_int];
                }
                if (var23Lifetime1 != 0) {
                  if (this.field_a[var24].a(5) < -16 + var33[param8].field_k) {
                    var27_int = 24;
                    var28_ref = oo.field_c;
                    var29 = var27_int;
                    if (12 <= var29) {
                      var29 = 11;
                    }
                    oo.field_c = bm.field_G[var29];
                    var27_int -= 12;
                    var30_ref = null;
                    if (var27_int >= 0) {
                      if (var27_int >= 12) {
                        var27_int = 11;
                      }
                      var30_ref = lf.field_A[var27_int];
                    }
                    stackIn_172_0 = this.field_a[var24];
                    stackIn_172_1 = -30;
                    stackIn_172_2 = this.field_s.field_e;
                    stackIn_173_3 = (param4.field_w == 2);
                    ((bg) (Object) stackIn_172_0).a(stackIn_172_1, stackIn_172_2, stackIn_173_3, (byte[]) (var30_ref), this.field_s.field_o);
                    oo.field_c = (int[]) (var28_ref);
                  } else {
                    stackIn_157_0 = this.field_a[var24];
                    stackIn_158_1 = !(param3);
                    stackIn_160_2 = this.field_s.field_e;
                    stackIn_161_3 = (param4.field_w == 2);
                    ((bg) (Object) stackIn_157_0).a(stackIn_158_1, stackIn_160_2, stackIn_161_3, this.field_s.field_o);
                  }
                } else {
                  stackIn_152_0 = this.field_a[var24];
                  stackIn_152_1 = false;
                  stackIn_152_2 = this.field_s.field_e;
                  stackIn_153_3 = (param4.field_w == 2);
                  ((bg) (Object) stackIn_152_0).a(stackIn_152_1, stackIn_152_2, stackIn_153_3, this.field_s.field_o);
                }
                oo.field_c = var25_ref_int__;
              } else {
                var34_ref = (hb) (this.field_a[var24]);
                if (var34_ref.b(100) != param8) {
                  var34_ref.a(-30, this.field_s.field_e, var11 != 0, lf.field_A[5], this.field_s.field_o);
                } else {
                  var34_ref.a(false, this.field_s.field_e, var11 != 0, this.field_s.field_o);
                }
              }
              if (lf.field_C &&
                var13Lifetime1 != 0 &&
                this.field_a[var24].field_d != 0) {
                for (var25 = 0; var25 < this.field_c.length; var25++) {
                  if (dc.field_J[var25] != null &&
                    (var25 + 1 & this.field_a[var24].field_d) != 0) {
                    va.field_b[0] = oe.field_ob[var25][0];
                    va.field_b[2] = oe.field_ob[var25][1];
                    va.field_b[1] = this.field_a[var24].a(true);
                    var26Lifetime1Lifetime1 = -(128 * (va.field_b[1] - oe.field_ob[var25][2]) / 960) + 128;
                    if (var26Lifetime1Lifetime1 > 10 &&
                      var26Lifetime1Lifetime1 <= 128) {
                      var35 = new lg(dc.field_J[var25], false, true, true, true);
                      var35.b(var26Lifetime1Lifetime1, 128, var26Lifetime1Lifetime1);
                      var36 = this.field_a[var24].a(var35, oe.field_ob[var25][0], oe.field_ob[var25][1], (byte) -101);
                      if (var36 != null &&
                        var36.field_T < 4096 &&
                        var36.field_w < 4096) {
                        var36.field_K = false;
                        var36.a(this.field_s.field_e, va.field_b);
                      }
                    }
                  }
                }
              }
            }
          } else {
            stackIn_196_0 = (var22Lifetime5 < 50) ? 0 : 1;
            var24 = stackIn_196_0;
            if (var24 != 0) {
              for (var25 = 0; this.field_c.length > var25; var25++) {
                this.field_c[var25].a(6, (byte) -36);
              }
              this.field_s.field_e[1] = this.field_s.field_e[1] - (-1000 + var22Lifetime5 * 20);
              for (var25 = -1 + var19Lifetime1; var25 >= 0; var25--) {
                if (this.field_a[var25] instanceof hb) {
                  stackIn_226_0 = this.field_a[var25];
                  stackIn_227_1 = !(param3);
                  stackIn_229_2 = this.field_s.field_e;
                  stackIn_230_3 = (param4.field_w == 2);
                  ((bg) (Object) stackIn_226_0).a(stackIn_227_1, stackIn_229_2, stackIn_230_3, this.field_s.field_o);
                }
              }
            } else {
              var25 = var22Lifetime5 * 24 / 50;
              var26_ref_int__ = oo.field_c;
              var27_int = var25;
              if (12 <= var27_int) {
                var27_int = 11;
              }
              oo.field_c = bm.field_G[var27_int];
              var28_ref = null;
              var25 -= 12;
              if (0 <= var25) {
                if (var25 >= 12) {
                  var25 = 11;
                }
                var28_ref = lf.field_A[var25];
              }
              for (var29 = var19Lifetime1 - 1; var29 >= 0; var29--) {
                if (this.field_a[var29] instanceof hb) {
                  var37_ref = (hb) (this.field_a[var29]);
                  oo.field_c = var26_ref_int__;
                  if (var37_ref.b(108) != param8) {
                    stackIn_212_0 = this.field_a[var29];
                    stackIn_212_1 = -30;
                    stackIn_212_2 = this.field_s.field_e;
                    stackIn_213_3 = (param4.field_w == 2);
                    ((bg) (Object) stackIn_212_0).a(stackIn_212_1, stackIn_212_2, stackIn_213_3, lf.field_A[8], this.field_s.field_o);
                  } else {
                    var37_ref.a(false, this.field_s.field_e, var11 != 0, this.field_s.field_o);
                  }
                  oo.field_c = bm.field_G[var27_int];
                } else {
                  this.field_a[var29].a(-30, this.field_s.field_e, var11 != 0, (byte[]) (var28_ref), this.field_s.field_o);
                }
              }
              oo.field_c = var26_ref_int__;
            }
          }
          for (var24 = 0; var24 < this.field_g.length; var24++) {
            this.field_g[var24].a(this.field_s.field_e, -926966430);
          }
          var27_int = var13Lifetime1;
          if (var27_int == 0) {
            if (param4.field_w == 0) {
              va.field_s.a(620, -45, 16777215, 30, -1, Vertigo2.a(new String[]{Integer.toString(param7 + 1)}, bl.field_o, -121));
              return;
            }
            if (param4.field_w == 1) {
              var38 = new String[4];
              var27 = var38;
              var27[0] = bq.field_H;
              var27[1] = Vertigo2.a(new String[]{Integer.toString(param2), Integer.toString(param1)}, qh.field_c, -118);
              var27[2] = lh.field_d;
              var27[3] = de.field_c;
              var28 = 1;
              for (var29 = 0; var38.length > var29; var29++) {
                var28 = Math.max(var28, va.field_s.a(1, var38[var29]));
              }
              var28 += 20;
              var29 = -(var28 / 2) + 610;
              qi.a(!param3, var29 - var28 / 2, var28, 5);
              va.field_s.a(var38[0], 16777215, -1, var29, 30, 2);
              qi.a(false, -(var28 / 2) + var29, var28, 55);
              va.field_s.a(var38[1], 16777215, -1, var29, 80, 2);
              if (param0 < 0) {
                return;
              }
              qi.a(false, -(var28 / 2) + var29, var28, 105);
              if (param8 != 0) {
                va.field_s.a(var38[3], 2479095, -1, var29, 130, 2);
                return;
              }
              va.field_s.a(var38[2], 16131600, -1, var29, 130, 2);
              return;
            }
            if (param4.field_w == 2) {
              var39 = new String[4];
              var27 = var39;
              var27[0] = hk.field_r;
              var27[1] = Vertigo2.a(new String[]{Integer.toString(param2), Integer.toString(param1)}, qh.field_c, -126);
              var27[3] = de.field_c;
              var27[2] = lh.field_d;
              var28 = 1;
              for (var29 = 0; var39.length > var29; var29++) {
                var28 = Math.max(var28, va.field_s.a(1, var39[var29]));
              }
              var28 += 20;
              var29 = 610 - var28 / 2;
              qi.a(false, -(var28 / 2) + var29, var28, 5);
              va.field_s.a(var39[0], 16777215, -1, var29, 30, 2);
              qi.a(false, -(var28 / 2) + var29, var28, 55);
              va.field_s.a(var39[1], 16777215, -1, var29, 80, 2);
              if (0 > param0) {
                return;
              }
              qi.a(!param3, var29 - var28 / 2, var28, 105);
              if (param8 == 0) {
                va.field_s.a(lh.field_d, 16131600, -1, var29, 130, 2);
                return;
              }
              va.field_s.a(de.field_c, 2479095, -1, var29, 130, 2);
              return;
            }
          } else {
            if (2 == var27_int) {
              return;
            }
            if (var27_int == 5) {
              var24 = -1;
              var25 = 0;
              if (param4.k(94)) {
                var24 = (param0 == 0) ? 5 : 7;
                var27_int = -(ea.field_d[var24].field_x / 2) + 320;
                var25 = 1;
                ea.field_d[var24].e(var27_int, 70);
              }
              if (!param4.b(-15531)) {
                return;
              }
              var24 = (param0 != 1) ? 8 : 5;
              var27_int = 70;
              if (var25 != 0) {
                var27_int = var27_int + (ea.field_d[7].field_B + 20);
              }
              var28 = -(ea.field_d[var24].field_x / 2) + 320;
              ea.field_d[var24].e(var28, var27_int);
              return;
            }
            if (var27_int == 3) {
              ea.field_d[0].e(320 - ea.field_d[0].field_x / 2, 70);
              va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
              return;
            }
            if (4 == var27_int) {
              ea.field_d[6].e(-(ea.field_d[6].field_x / 2) + 320, -20);
              va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
              return;
            }
            if (var27_int == 6) {
              if (param4.field_w != 2) {
                ea.field_d[1].e(320 - ea.field_d[1].field_x / 2, 70);
              }
              if (0 == param4.field_w) {
                va.field_s.a(md.field_y, 16777215, -1, 320, 420, 2);
                return;
              }
              var27_int = (-var22Lifetime5 + 250) / 50;
              if (var27_int < 0) {
                var27_int = 0;
              }
              va.field_s.a(Vertigo2.a(new String[]{Integer.toString(var27_int)}, lr.field_T, -114), 16777215, -1, 320, 420, 2);
              if (param4.field_w == 2) {
                var28 = param4.field_E;
                if (param0 >= 0) {
                  if (50 >= var28) {
                    if (var28 < 50) {
                      if (0 != param8) {
                        var29_ref_String = Vertigo2.a(new String[]{Integer.toString(-var28 + 100), rq.field_x}, pe.field_L, -13);
                        ea.field_d[2].e(320 - ea.field_d[2].field_x / 2, 70);
                      } else {
                        var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, ad.field_b, -118);
                        ea.field_d[3].e(320 - ea.field_d[3].field_x / 2, 70);
                      }
                    } else {
                      var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, gp.field_q, 90);
                      ea.field_d[4].e(-(ea.field_d[4].field_x / 2) + 320, 70);
                    }
                  } else {
                    if (param8 != 0) {
                      var29_ref_String = Vertigo2.a(new String[]{Integer.toString(-var28 + 100), rq.field_x}, ad.field_b, 47);
                      ea.field_d[3].e(-(ea.field_d[3].field_x / 2) + 320, 70);
                    } else {
                      var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, pe.field_L, -126);
                      ea.field_d[2].e(320 - ea.field_d[2].field_x / 2, 70);
                    }
                  }
                } else {
                  var29_ref_String = Vertigo2.a(new String[]{Integer.toString(var28), rq.field_A}, gp.field_q, -128);
                  if (50 >= var28) {
                    if (var28 < 50) {
                      ea.field_d[10].e(-(ea.field_d[10].field_x / 2) + 320, 70);
                    } else {
                      ea.field_d[4].e(320 - ea.field_d[4].field_x / 2, 70);
                    }
                  } else {
                    ea.field_d[9].e(320 - ea.field_d[9].field_x / 2, 70);
                  }
                }
                va.field_s.a(var29_ref_String, 16777215, -1, 320, 200, 2);
              }
              return;
            }
            if (var27_int == 1) {
              stackIn_314_0 = (bh) (param4);
              stackIn_314_1 = 3;
              stackIn_316_2 = (param4.field_w == 0) || (param4.field_w == 3);
              var26Lifetime2 = ((bh) (Object) stackIn_314_0).c(stackIn_314_1, stackIn_316_2);
              this.field_f.field_d = var26Lifetime2;
              this.field_f.a(200, true, 220, 28, 14);
              if (param4.field_w != 2) {
                if (1 == param4.field_w) {
                  qi.a(!param3, 20, va.field_s.a(1, lp.field_A), 55);
                  va.field_s.a(16777215, (byte) 104, -1, 20, lp.field_A, 80);
                }
              } else {
                var27_int = param4.field_I / 50;
                qi.a(false, 20, va.field_s.a(1, tr.field_e), 10);
                if (var27_int < 0) {
                  var27_int = 0;
                }
                va.field_s.a(16777215, (byte) 52, -1, 20, tr.field_e, 35);
                if (param4.field_I > 0) {
                  var40 = Vertigo2.a(new String[]{gl.a(-121, true, false, param4.field_I)}, mc.field_f, -3);
                  var29 = va.field_s.a(1, var40);
                  qi.a(false, -20 - var29 + 640, var29, 60);
                  var30 = 16777215;
                  if (var27_int < 10) {
                    var31 = (int)(100.0 * (Math.sin((double)param4.field_I / 8.0) + 1.0)) + 55;
                    var30 = var31 + (var31 << 8) + 16711680;
                  }
                  va.field_s.a(var30, (byte) 108, -1, 640 - (var29 + 20), var40, 66 + va.field_s.field_k);
                }
              }
              if (param8 >= 0 &&
                var22Lifetime5 > 25) {
                var33[param8].a(param4.field_w, 3, param5, 0, this.field_s.field_o, param6);
              }
              if (param4.field_w == 0 &&
                param7 == 0) {
                rq.a(190, 210, 282, 20, 64, 150);
                tk.field_c.a(tq.field_c, 40, 292, 200, 160, 16777215, -1, 0, 0, va.field_s.field_c + va.field_s.field_j);
                tk.field_c.a(vl.field_g, 50, 294, 160, 160, 16777215, -1, 2, 0, va.field_s.field_c + va.field_s.field_j);
              }
              if (param4.field_w != 2 &&
                1 != param4.field_w) {
                return;
              }
              var41 = new String[2];
              var27 = var41;
              var27[0] = Vertigo2.a(new String[]{this.field_h[0]}, dk.field_m, -125);
              var27[1] = Vertigo2.a(new String[]{this.field_h[1]}, lk.field_h, -125);
              var28 = 1;
              for (var29 = 0; var29 < var41.length; var29++) {
                if (param0 != var29) {
                  var28 = Math.max(var28, va.field_s.a(1, var41[var29]));
                }
              }
              var29 = 20;
              var30Lifetime1 = 85;
              if (param4.field_w == 1) {
                var30Lifetime1 += 45;
              }
              if (param0 != 0) {
                qi.a(false, var29, var28, 5 + (-30 + var30Lifetime1));
                va.field_s.a(16131600, (byte) 89, -1, var29, var41[0], var30Lifetime1);
                var30Lifetime1 += 50;
              }
              if (param0 != 1) {
                qi.a(false, var29, var28, -30 + var30Lifetime1 + 5);
                va.field_s.a(2479095, (byte) 98, -1, var29, var41[1], var30Lifetime1);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_359_0 = var10_ref;
          stackIn_359_1 = new StringBuilder().append("am.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_360_2 = "null";
          } else {
            stackIn_360_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_359_0), ((StringBuilder) (Object) stackIn_359_1).append(stackIn_360_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 >= -105) {
          return 101;
        }
        return this.field_s.field_q;
    }

    private final void a(int param0, int param1, int param2) {
        int incrementValue$1 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var4;
        int var5;
        bg var6;
        int var7;
        bg var9;
        int var10;
        int var11;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 3) {
          this.field_v = (int[][]) null;
        }
        if (param0 > param2) {
          var4 = (param0 + param2) / 2;
          while (true) {
            if (null == this.field_a[var4]) {
              if (param2 == var4) {
                this.a(param0, 3, var4 + 1);
                return;
              }
              this.field_a[var4] = this.field_a[param2];
              incrementValue$1 = param2;
              param2++;
              this.field_a[incrementValue$1] = null;
              continue;
            }
            break;
          }
          var5 = param2;
          var6 = this.field_a[var4];
          var7 = this.field_j[var4];
          this.field_a[var4] = this.field_a[param0];
          this.field_a[param0] = var6;
          this.field_j[var4] = this.field_j[param0];
          this.field_j[param0] = var7;
          for (var8 = param2; param0 > var8; var8++) {
            if (null == this.field_a[var8]) {
              this.field_a[var8] = this.field_a[var5];
              this.field_j[var8] = this.field_j[var5];
              incrementValue$0 = var5;
              var5++;
              this.field_a[incrementValue$0] = null;
            } else {
              if (var7 > this.field_j[var8]) {
                var9 = this.field_a[var8];
                var10 = this.field_j[var8];
                this.field_a[var8] = this.field_a[var5];
                this.field_j[var8] = this.field_j[var5];
                this.field_a[var5] = var9;
                this.field_j[var5] = var10;
                var5++;
              }
            }
          }
          this.field_a[param0] = this.field_a[var5];
          this.field_j[param0] = this.field_j[var5];
          this.field_a[var5] = var6;
          this.field_j[var5] = var7;
          this.a(var5 - 1, param1 ^ 0, param2);
          this.a(param0, 3, 1 + var5);
        }
    }

    final void a(boolean param0, int param1, bh param2, byte param3) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_38_0 = 0;
        bg stackIn_72_0 = null;
        boolean stackIn_72_1 = false;
        int[] stackIn_72_2 = null;
        boolean stackIn_73_3;
        int stackIn_77_0 = 0;
        bg stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int[] stackIn_91_2 = null;
        boolean stackIn_92_3;
        bg stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int[] stackIn_95_2 = null;
        boolean stackIn_96_3;
        bg stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int[] stackIn_108_2 = null;
        boolean stackIn_109_3;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        wo[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        wo var8_ref_wo = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fe var13_ref_fe = null;
        int var13 = 0;
        int var14_int = 0;
        jg[] var14 = null;
        int var15_int = 0;
        rn[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21_int = 0;
        Object var21 = null;
        int var22 = 0;
        int var23 = 0;
        wo[] var24 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime1;
        int var20Lifetime1;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          var24 = param2.field_f;
          var5 = var24;
          if (0 <= param1) {
            stackIn_7_0 = (param2.c((byte) 104)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var6 = stackIn_7_0;
          if (var6 == 0) {
            hn.a(false, 380, -420, this.field_s.field_e, -390, 0, -140, 180, 0, 0, -1);
          } else {
            if (!param2.d(-2)) {
              if (this.field_s.field_o) {
                this.field_s.field_o = false;
                this.field_s.d(550);
              }
              var8_ref_wo = var24[param1];
              if (this.field_l == this.field_d) {
                this.field_s.a(var8_ref_wo.field_k, var8_ref_wo.field_E, 12257, var8_ref_wo.field_y);
              } else {
                var9 = var8_ref_wo.field_E - var24[this.field_d].field_E;
                var10 = var8_ref_wo.field_y - var24[this.field_d].field_y;
                var11 = -var24[this.field_d].field_k + var8_ref_wo.field_k;
                this.field_s.a((int)((float)var11 * this.field_p) + var24[this.field_d].field_k, (int)(this.field_p * (float)var9) + var24[this.field_d].field_E, 12257, var24[this.field_d].field_y + (int)(this.field_p * (float)var10));
              }
            } else {
              this.field_s.a(param2.field_D, 2000 + param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z - 2000);
              if (!this.field_s.field_o) {
                this.field_s.d(550);
                this.field_s.a(param2.field_D, param2.field_A, param2.field_v, false, param2.field_h, param2.field_K, param2.field_z);
              }
              this.field_s.a(0, 0, 12257, 0);
            }
          }
          for (var7 = 0; var7 < this.field_c.length; var7++) {
            this.field_c[var7].a(false, var24[var7]);
          }
          if (param0) {
            if (!hn.field_t) {
              ue.field_N.c(0, 0);
            } else {
              qr.field_l.a(this.field_s.field_e, 28580);
            }
            sc.a(true, rg.field_f);
          }
          var7Lifetime1 = this.field_s.field_e[0];
          var8 = this.field_s.field_e[2];
          var9Lifetime1 = this.field_s.field_e[1];
          var11Lifetime1 = 31 % ((82 - param3) / 37);
          var10Lifetime1 = param2.h(9979);
          if (var10Lifetime1 != 7) {
            if (var10Lifetime1 != 6) {
              if (var10Lifetime1 != 3) {
                stackIn_38_0 = (4 == var10Lifetime1) ? 1 : 0;
              } else {
                stackIn_38_0 = 1;
              }
            } else {
              stackIn_38_0 = 1;
            }
          } else {
            stackIn_38_0 = 1;
          }
          var12 = stackIn_38_0;
          if (cn.field_r &&
            param0) {
            var13_ref_fe = sf.field_b;
            var14_int = sf.field_b.field_y << 5;
            var15_int = sf.field_b.field_t << 5;
            var16 = Vertigo2.field_C.field_y << 4;
            var17 = Vertigo2.field_C.field_t << 4;
            var18 = ji.field_p.field_y << 4;
            var19_int = ji.field_p.field_t << 4;
            var20 = jf.field_M.field_y << 4;
            var21_int = jf.field_M.field_t << 4;
            if (this.field_s.field_o ||
              var12 != 0) {
              var21_int = var21_int / 2;
              var16 = var16 / 2;
              var18 = var18 / 2;
              var17 = var17 / 2;
              var19_int = var19_int / 2;
              var15_int = var15_int / 2;
              var14_int = var14_int / 2;
              var20 = var20 / 2;
            }
            gb.a(this.field_r[0][1], jf.field_M, var21_int, this.field_r[0][0], this.field_s.field_e, this.field_r[0][2], var20, -123);
            for (var22 = 0; var22 < 1000; var22++) {
              gb.a(this.field_u[var22][1], var13_ref_fe, var15_int, this.field_u[var22][0], this.field_s.field_e, this.field_u[var22][2], var14_int, -105);
            }
            gb.a(this.field_v[0][1], Vertigo2.field_C, var17, this.field_v[0][0], this.field_s.field_e, this.field_v[0][2], var16, -96);
            gb.a(this.field_v[1][1], ji.field_p, var19_int, this.field_v[1][0], this.field_s.field_e, this.field_v[1][2], var18, -89);
          }
          var13 = 0;
          var14 = param2.c(121);
          for (var15_intLifetime1 = -1 + param2.l(102); var15_intLifetime1 >= 0; var15_intLifetime1--) {
            if (var14[var15_intLifetime1] != null) {
              this.field_j[var13] = var14[var15_intLifetime1].a(var8, -116, var7Lifetime1, var9Lifetime1);
              incrementValue$2 = var13;
              var13++;
              this.field_a[incrementValue$2] = (bg) ((Object) var14[var15_intLifetime1]);
            }
          }
          var15 = param2.m(9384);
          for (var16Lifetime1 = -1 + param2.e((byte) 82); 0 <= var16Lifetime1; var16Lifetime1--) {
            this.field_j[var13] = var15[var16Lifetime1].a(var8, -128, var7Lifetime1, var9Lifetime1);
            incrementValue$1 = var13;
            var13++;
            this.field_a[incrementValue$1] = (bg) ((Object) var15[var16Lifetime1]);
          }
          if (var12 != 0) {
            this.field_c[0].a(param1, -25196);
          }
          if (var10Lifetime1 != 0) {
            for (var16Lifetime2 = 0; this.field_c.length > var16Lifetime2; var16Lifetime2++) {
              this.field_j[var13] = this.field_c[var16Lifetime2].a(var7Lifetime1, var8, 0, var9Lifetime1);
              incrementValue$0 = var13;
              var13++;
              this.field_a[incrementValue$0] = (bg) ((Object) this.field_c[var16Lifetime2]);
              if (var12 != 0) {
                break;
              }
            }
          }
          this.a(var13 - 1, 3, 0);
          var16Lifetime3 = param2.field_n;
          if (2 != var10Lifetime1 &&
            7 != var10Lifetime1) {
            for (var17Lifetime1 = -1 + var13; var17Lifetime1 >= 0; var17Lifetime1--) {
              stackIn_72_0 = this.field_a[var17Lifetime1];
              stackIn_72_1 = false;
              stackIn_72_2 = this.field_s.field_e;
              stackIn_73_3 = (2 == param2.field_w);
              ((bg) (Object) stackIn_72_0).a(stackIn_72_1, stackIn_72_2, stackIn_73_3, this.field_s.field_o);
            }
          } else {
            stackIn_77_0 = (50 > var16Lifetime3) ? 0 : 1;
            var17Lifetime1 = stackIn_77_0;
            if (var17Lifetime1 != 0) {
              for (var18 = 0; var18 < this.field_c.length; var18++) {
                this.field_c[var18].a(6, (byte) -36);
              }
              this.field_s.field_e[1] = this.field_s.field_e[1] - (-50 + var16Lifetime3) * 20;
              for (var18 = var13 - 1; var18 >= 0; var18--) {
                if (this.field_a[var18] instanceof hb) {
                  stackIn_108_0 = this.field_a[var18];
                  stackIn_108_1 = -30;
                  stackIn_108_2 = this.field_s.field_e;
                  stackIn_109_3 = (param2.field_w == 2);
                  ((bg) (Object) stackIn_108_0).a(stackIn_108_1, stackIn_108_2, stackIn_109_3, (byte[]) null, this.field_s.field_o);
                }
              }
            } else {
              var18 = var16Lifetime3 * 24 / 50;
              var19 = oo.field_c;
              var20Lifetime1 = var18;
              if (var20Lifetime1 >= 12) {
                var20Lifetime1 = 11;
              }
              oo.field_c = bm.field_G[var20Lifetime1];
              var21 = null;
              var18 -= 12;
              if (0 <= var18) {
                if (var18 >= 12) {
                  var18 = 11;
                }
                var21 = lf.field_A[var18];
              }
              for (var22 = -1 + var13; var22 >= 0; var22--) {
                if (!(this.field_a[var22] instanceof hb)) {
                  stackIn_95_0 = this.field_a[var22];
                  stackIn_95_1 = -30;
                  stackIn_95_2 = this.field_s.field_e;
                  stackIn_96_3 = (param2.field_w == 2);
                  ((bg) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, stackIn_96_3, (byte[]) (var21), this.field_s.field_o);
                } else {
                  oo.field_c = var19;
                  stackIn_91_0 = this.field_a[var22];
                  stackIn_91_1 = -30;
                  stackIn_91_2 = this.field_s.field_e;
                  stackIn_92_3 = (param2.field_w == 2);
                  ((bg) (Object) stackIn_91_0).a(stackIn_91_1, stackIn_91_2, stackIn_92_3, (byte[]) null, this.field_s.field_o);
                  oo.field_c = bm.field_G[var20Lifetime1];
                }
              }
              oo.field_c = var19;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_114_0 = var5_ref;
          stackIn_114_1 = new StringBuilder().append("am.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_114_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 1) {
          return;
        }
        field_e = null;
        field_o = null;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_p = 0.0f;
        if (param0 != -17) {
          this.field_v = (int[][]) null;
        }
        this.field_d = param1;
        this.field_l = param2;
    }

    am(int param0, int param1, String[] param2) {
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        int var4_intLifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        double var6Lifetime1;
        double var6Lifetime2;
        double var6Lifetime3;
        try {
          this.field_s = new cn();
          this.field_c = new hb[param1];
          this.field_h = new String[param1];
          this.field_a = new bg[500];
          this.field_j = new int[500];
          for (var4_int = 0; var4_int < param1; var4_int++) {
            this.field_c[var4_int] = new hb();
            this.field_h[var4_int] = param2[var4_int];
          }
          this.field_u = new int[1000][3];
          for (var4_intLifetime1 = 0; var4_intLifetime1 < 900; var4_intLifetime1++) {
            var5 = 3920 + be.a(1920, (byte) 83);
            var6 = 2.0 * (Math.random() * 3.141592653589793);
            this.field_u[var4_intLifetime1][0] = (int)(320.0 + (double)var5 * Math.cos(var6));
            this.field_u[var4_intLifetime1][2] = (int)(Math.sin(var6) * (double)var5 + 320.0);
            this.field_u[var4_intLifetime1][1] = be.a(14400, (byte) 83) - 1800;
          }
          for (var4_intLifetime2 = 900; 1000 > var4_intLifetime2; var4_intLifetime2++) {
            var5Lifetime1 = be.a(5840, (byte) 83);
            var6Lifetime1 = Math.random() * 3.141592653589793 * 2.0;
            this.field_u[var4_intLifetime2][0] = (int)(320.0 + Math.cos(var6Lifetime1) * (double)var5Lifetime1);
            this.field_u[var4_intLifetime2][2] = (int)(320.0 + (double)var5Lifetime1 * Math.sin(var6Lifetime1));
            this.field_u[var4_intLifetime2][1] = 12600;
          }
          this.field_v = new int[2][3];
          for (var4_intLifetime3 = 0; var4_intLifetime3 < 2; var4_intLifetime3++) {
            var5Lifetime2 = 2560 + be.a(2000, (byte) 83);
            var6Lifetime2 = Math.random() * 3.141592653589793 * 2.0;
            this.field_v[var4_intLifetime3][0] = (int)(Math.cos(var6Lifetime2) * (double)var5Lifetime2 + 320.0);
            this.field_v[var4_intLifetime3][2] = (int)(320.0 + Math.sin(var6Lifetime2) * (double)var5Lifetime2);
            this.field_v[var4_intLifetime3][1] = be.a(7200, (byte) 83) + 1800;
          }
          this.field_r = new int[1][3];
          for (var4_intLifetime4 = 0; var4_intLifetime4 < 1; var4_intLifetime4++) {
            var5Lifetime3 = be.a(1920, (byte) 83) + 3920;
            var6Lifetime3 = 3.141592653589793 * Math.random() * 2.0;
            this.field_r[var4_intLifetime4][0] = (int)(320.0 + Math.cos(var6Lifetime3) * (double)var5Lifetime3);
            this.field_r[var4_intLifetime4][2] = (int)(320.0 + (double)var5Lifetime3 * Math.sin(var6Lifetime3));
            this.field_r[var4_intLifetime4][1] = 1800 + be.a(7200, (byte) 83);
          }
          this.field_g = new cq[param1 + 1];
          for (var4_intLifetime5 = 0; var4_intLifetime5 < this.field_g.length; var4_intLifetime5++) {
            this.field_g[var4_intLifetime5] = new cq();
          }
          this.field_p = 1.100000023841858f;
          this.field_f = new ha(0, 100, 0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "am.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = 96;
        field_e = "Click";
        field_m = "Please try again in a few minutes.";
    }
}
