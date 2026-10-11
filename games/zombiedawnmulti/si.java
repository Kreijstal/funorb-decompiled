/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends nc {
    private int[] field_y;
    private int field_x;
    private int field_v;
    private int field_m;
    private int[] field_r;
    private int field_E;
    private int field_n;
    private int[] field_A;
    private int field_p;
    private int field_w;
    static double field_C;
    static String field_D;
    private cb[] field_u;
    private int field_s;
    private String field_l;
    private kb field_z;
    private int field_t;
    private int field_B;
    private int field_q;
    private boolean field_o;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_9_0 = 0;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -118) {
          return 5;
        }
        var4 = this.field_j.length;
        if (var4 == 1) {
          var3 = 1;
        } else {
          if (var4 != 2) {
            var3 = param1;
          } else {
            stackIn_9_0 = (0 == param1) ? 0 : 2;
            var3 = stackIn_9_0;
          }
        }
        var4Lifetime1 = var3;
        if (0 == var4Lifetime1) {
          return 50;
        }
        if (1 == var4Lifetime1) {
          return 240;
        }
        if (var4Lifetime1 != 2) {
          return super.a((byte) -118, param1);
        }
        return 430;
    }

    final void a(int param0, int param1, int param2, int[] param3, kb param4) {
        int var9 = 0;
        boolean stackIn_4_1 = false;
        int[] stackIn_14_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rp var13 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_t = param0;
          this.field_B = param1;
          this.field_x = 50;
          this.field_z = param4;
          we.field_g[42] = u.field_j;
          this.field_q = param2;
          we.field_g[43] = ec.field_a;
          this.field_n = 0;
          stackIn_4_1 = !(fb.field_e.field_M >= 0);
          this.field_o = stackIn_4_1;
          if (fb.field_e.field_M != this.field_q) {
            if (!this.field_o) {
              this.field_l = gf.field_c;
            } else {
              this.field_l = "";
            }
          } else {
            this.field_l = nh.field_h;
          }
          gj.a(6962);
          if (this.field_o) {
            this.field_j = cq.field_c;
          } else {
            if (this.field_z.field_i &&
              this.field_t > 0) {
              stackIn_14_1 = ga.field_s;
            } else {
              stackIn_14_1 = wk.field_L;
            }
            this.field_j = stackIn_14_1;
          }
          this.field_g.a(-9049, true, this.a(-6003, bo.field_d, bd.field_g));
          this.field_g.field_c = this.field_j.length;
          this.field_y = (int[]) ((Object) param3.clone());
          for (var6_int = 0; this.field_y.length > var6_int; var6_int++) {
            stackIn_21_0 = ((1 << var6_int & this.field_z.field_F) == 0) ? 0 : 1;
            var7 = stackIn_21_0;
            if (var7 != 0) {
              this.field_y[var6_int] = 0;
            }
          }
          this.field_w = 1;
          this.field_p = this.field_z.field_H * 20 / 1000;
          this.field_A = new int[this.field_y.length];
          for (var6_intLifetime1 = 0; var6_intLifetime1 < param3.length; var6_intLifetime1++) {
            var7Lifetime1 = this.field_y[var6_intLifetime1];
            if (var7Lifetime1 < this.field_w) {
              stackIn_30_1 = this.field_w;
            } else {
              stackIn_30_1 = var7Lifetime1;
            }
            this.field_w = stackIn_30_1;
            this.field_A[var6_intLifetime1] = var6_intLifetime1;
            for (var8 = -1 + var6_intLifetime1; var8 >= 0; var8--) {
              if (this.field_y[var6_intLifetime1] >= this.field_y[this.field_A[var8]]) {
                this.field_A[var8 + 1] = this.field_A[var8];
                continue;
              }
              break;
            }
            this.field_A[var8 + 1] = var6_intLifetime1;
          }
          this.field_v = 0;
          if (!gf.field_h) {
            var13 = ll.field_k;
            var7Lifetime2 = var13.g((byte) -32);
            for (var8Lifetime1 = 0; var7Lifetime2 > var8Lifetime1; var8Lifetime1++) {
              if (ll.field_k.field_m[var8Lifetime1] != 255) {
                this.e(ll.field_k.field_m[var8Lifetime1], param1 + 4);
                if (255 != ll.field_k.field_g[var8Lifetime1]) {
                  this.e(ll.field_k.field_g[var8Lifetime1], 4);
                }
              }
            }
            for (var8Lifetime1Lifetime1 = 0; var8Lifetime1Lifetime1 < 3; var8Lifetime1Lifetime1++) {
              if (255 != ll.field_k.field_s[var8Lifetime1Lifetime1]) {
                this.e(ll.field_k.field_s[var8Lifetime1Lifetime1], 4);
              }
            }
            if (0 >= this.field_v) {
              return;
            }
            this.field_r = new int[this.field_v];
            var8Lifetime1Lifetime2 = this.field_t;
            for (var9 = 0; var9 < this.field_v; var9++) {
              var10 = var8Lifetime1Lifetime2 / (this.field_v - var9);
              var11 = this.field_u[var9].field_m;
              ll.field_k.a(-126, var10, var11);
              this.field_u[var9].a(0, var10);
              var8Lifetime1Lifetime2 = var8Lifetime1Lifetime2 - var10;
              this.field_r[var9] = var10;
            }
            th.b((byte) -61);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_60_0 = var6;
          stackIn_60_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param4 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    private final String e(int param0) {
        if (param0 >= -85) {
          return (String) null;
        }
        int var2 = this.field_p / 60;
        int var3 = this.field_p % 60;
        return var2 + ":" + (10 > var3 ? "0" : "") + var3;
    }

    final static void a(boolean param0, boolean param1, ul param2, ul param3, ul param4) {
        try {
          tg.field_g = tg.a("", !param0 ? true : false);
          tg.field_g.a(-17853, param0);
          qe.a(param4, -8995, param3, param2);
          dg.i(4);
          id.field_B = mp.field_b;
          ta.field_hb = mp.field_b;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "si.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 23697) {
          return 127;
        }
        return 430;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -64) {
          this.field_v = -63;
        }
        var4 = this.field_j[param2];
        var5 = var4;
        if (var5 == 43) {
          if (this.field_g.c(-85)) {
            if (this.field_o) {
              return;
            }
            stackIn_12_0 = (this.field_B != 0) ? 0 : 1;
            stackIn_15_1 = (this.field_n <= 0) ? 0 : 1;
            if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
              this.b(false, 1);
            } else {
              this.b(false, 0);
            }
          }
        } else {
          if (var5 == 42) {
            if (this.field_g.c(-85)) {
              ma.field_a.b((byte) -35, 61);
            }
          } else {
            super.b(-110, param1, param2);
          }
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 255) {
            field_C = 1.243267543236342;
          }
          var5_int = 0;
          while (true) {
            if (hl.field_e.length <= var5_int) {
              return;
            }
            param4 = hl.field_e[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = ah.field_f[incrementValue$1];
              dupTemp$2 = param2[param0];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              ah.field_f[dupTemp$3] = param0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("si.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    si(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, wk.field_L);
        int var8_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        this.field_B = 0;
        try {
          this.field_u = new cb[13];
          for (var8_int = 0; var8_int < this.field_u.length; var8_int++) {
            this.field_u[var8_int] = new cb();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("si.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        sl stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_34_4 = 0;
        sl stackIn_40_0;
        String stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        int stackIn_41_4;
        int stackIn_45_0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        int stackIn_46_5;
        int stackIn_51_0 = 0;
        ef stackIn_65_0;
        String stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_4;
        int stackIn_87_0 = 0;
        int stackIn_102_0 = 0;
        ef stackIn_116_0;
        String stackIn_116_1;
        int stackIn_116_2;
        int stackIn_116_3;
        int stackIn_117_4 = 0;
        ef stackIn_125_0;
        String stackIn_125_1;
        int stackIn_125_2;
        int stackIn_125_3;
        int stackIn_126_4;
        ef stackIn_144_0;
        String stackIn_144_1;
        int stackIn_144_2;
        int stackIn_144_3;
        int stackIn_145_4;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        int[] var8;
        int var9;
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
        int var22;
        int var23;
        int var24;
        ja var25;
        int var26;
        int var6Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var7Lifetime2;
        int var15Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        int var9Lifetime1Lifetime3;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var14Lifetime1Lifetime3;
        int var13Lifetime1Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1Lifetime2;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        var2 = 378;
        var3 = 0;
        var4 = ah.field_e.field_C + ah.field_e.field_r;
        this.field_E = 255;
        if (this.field_n == 0) {
          stackIn_3_0 = 255;
        } else {
          stackIn_3_0 = this.field_n * 255 / 33;
        }
        var5 = stackIn_3_0;
        if (0 == this.field_B ||
          this.field_n > 0) {
          if (this.field_B == 0) {
            stackIn_9_0 = var5;
          } else {
            stackIn_9_0 = 255 - var5;
          }
          var6 = stackIn_9_0;
          var7 = 94;
          if (null == this.field_l) {
            return;
          }
          qp.field_w.a(dj.field_o, 90, 134, 16777215, 1, var6);
          qp.field_w.a(qm.field_N, 478, 134, 16777215, 1, var6);
          var8_int = 555;
          if (this.field_z.field_i) {
            qp.field_w.a(th.field_d, var8_int, 122, 16777215, 1, var6);
          }
          qp.field_w.a(bo.field_c, var8_int, 134, 16777215, 1, var6);
          var7 = var7 + (-5 + (1 + pb.field_e.a(this.field_l, 0, 90, 640, 240, 65280, var3, var6, 1, 0, 30)) * var4);
          if (205 > var7) {
            var7 = 205;
          }
          var9 = qb.field_h.field_e;
          var10 = 150;
          var11 = 0;
          for (var12 = 0; var12 < this.field_z.field_t; var12++) {
            var13 = this.field_A[var12];
            stackIn_22_0 = (wp.field_h.field_M != var13) ? 0 : 1;
            var14 = stackIn_22_0;
            var15 = var9 * this.field_y[var13] / this.field_w;
            stackIn_25_0 = ((this.field_z.field_F & 1 << var13) == 0) ? 0 : 1;
            var16 = stackIn_25_0;
            stackIn_28_0 = ((op.field_m.field_j & 1 << var13) == 0) ? 0 : 1;
            var17 = stackIn_28_0;
            stackIn_31_0 = (var9 >= var15) ? var15 : var9;
            var15Lifetime2 = stackIn_31_0;
            stackIn_33_0 = ah.field_e;
            stackIn_33_1 = this.field_z.field_b[var13];
            stackIn_33_2 = 280;
            stackIn_33_3 = var10;
            if (var14 == 0) {
              stackIn_34_4 = 6;
            } else {
              stackIn_34_4 = 0;
            }
            ((sl) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_34_4, var3, var6);
            if (var17 != 0) {
              oo.e(33, var10 - 14, qp.field_w.a(ak.field_d) + 14, 15, 7, 16777215);
              oo.b(33, -15 + var10, qp.field_w.a(ak.field_d) + 16, 17, 7, 65793);
              qp.field_w.b(ak.field_d, 40, var10 - 2, 65793, -1, var6);
            }
            if (var16 != 0) {
              qp.field_w.a(io.field_d, 90, var10 + 24, 11184810, 1, var6);
            } else {
              stackIn_40_0 = ah.field_e;
              stackIn_40_1 = Integer.toString(this.field_y[var13]);
              stackIn_40_2 = 90;
              stackIn_40_3 = var10 + 28;
              if (var14 == 0) {
                stackIn_41_4 = 6;
              } else {
                stackIn_41_4 = 0;
              }
              ((sl) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, var3, var6);
            }
            qb.field_h.a(135, 4 + var10, var6);
            oo.h(138, 0, var15Lifetime2 + 138, 480);
            stackIn_45_0 = 140;
            stackIn_45_1 = 9 + var10;
            stackIn_45_2 = qb.field_h.field_e - 10;
            stackIn_45_3 = 16;
            stackIn_45_4 = 7;
            if (var14 != 0) {
              stackIn_46_5 = 16711680;
            } else {
              stackIn_46_5 = 65535;
            }
            oo.b(stackIn_45_0, stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_46_5, var6 / 2);
            oo.h(0, 0, 640, 480);
            var18 = 436;
            for (var19 = 0; var19 < 63; var19++) {
              stackIn_51_0 = (!this.field_z.b((byte) -121, var19, var13)) ? 0 : 1;
              var20 = stackIn_51_0;
              if (var20 != 0) {
                wa.field_b[-18 + var19].c(var18, var10 + 5, var6);
                if (wa.field_b[var19 - 18].b(var18, 5 + var10, bd.field_g, bo.field_d)) {
                  this.field_E = var19;
                }
                var18 += 28;
              }
            }
            var19Lifetime1 = op.field_m.field_o[var13];
            var20Lifetime1 = op.field_m.field_v[var13];
            if (this.field_z.field_i) {
              qp.field_w.a(Integer.toString(var20Lifetime1), var8_int, 15 + var10, 16777215, 1, var6);
              stackIn_65_0 = qp.field_w;
              stackIn_65_1 = eb.a(var20Lifetime1 - var19Lifetime1, true, param0);
              stackIn_65_2 = var8_int - 2;
              stackIn_65_3 = 30 + var10;
              if (var19Lifetime1 < var20Lifetime1) {
                stackIn_66_4 = 65280;
              } else {
                stackIn_66_4 = 16711680;
              }
              ((ef) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_66_4, 1, var6);
            } else {
              qp.field_w.a(Integer.toString(var20Lifetime1), var8_int, var10 + 22, 16777215, 1, var6);
            }
            var21 = op.field_m.field_D[var13][0];
            var22 = op.field_m.field_D[var13][1];
            var23 = 4;
            var24 = wf.field_m / gg.field_b[var23];
            var24 = var24 % gg.field_j[var23];
            var24 = var24 + gg.field_l[var23];
            am.a(var24, var22, var11, 1, var21).c(8, var10 - 11, var6);
            var25 = am.a(var24, var22, -var11 + 1, 1, var21);
            var25.e();
            var11 = -var11 + 1;
            var25.c(575, -11 + var10, var6);
            if (var17 != 0) {
              oo.g(44, 4 + var10, 47, var10 + 1, 16777215);
              oo.g(43, 4 + var10, 46, var10 + 1, 16777215);
              oo.g(45, var10 + 4, 48, var10 + 1, 16777215);
              oo.g(42, var10 + 4, 45, var10 + 1, 65793);
              oo.g(46, var10 + 4, 49, var10 + 1, 65793);
            }
            var7 = var7 + (var4 + 1);
            var10 += 58;
          }
          var7 = var7 + (1 + var4);
          if (!this.field_o) {
            pb.field_e.a(vl.a(wi.field_o, new String[]{this.e(-95)}, 2), 320, 380, 16556032, var3, var6);
          }
          if (this.field_n <= 0) {
            var7Lifetime2 = var2;
          } else {
            var7Lifetime2 = (255 - var6) * 120 / 256 + var6 * var2 / 256;
          }
          if (!this.field_o) {
            if (this.field_z.field_i) {
              pb.field_e.a(vl.a(ig.field_g, new String[]{Integer.toString(this.field_t)}, 2), 320, 365, 16776960, var3, var6);
            } else {
              pb.field_e.a(aa.field_p, 320, 410, 16777096, var3, var6);
            }
          }
          this.f(var6, 96);
        }
        if (this.field_B == 1 ||
          this.field_n > 0) {
          if (this.field_B == 1) {
            stackIn_87_0 = var5;
          } else {
            stackIn_87_0 = 255 - var5;
          }
          var6Lifetime1 = stackIn_87_0;
          rg.field_C.a(-40, 233, var6Lifetime1);
          var7Lifetime1 = 0;
          var8 = new int[]{30, 239, 448};
          for (var9Lifetime1 = 0; 5 > var9Lifetime1; var9Lifetime1++) {
            var10Lifetime1 = ll.field_k.field_m[var9Lifetime1];
            if (255 != var10Lifetime1) {
              var7Lifetime1 = ga.field_v[var9Lifetime1];
            }
          }
          for (var9Lifetime1Lifetime1 = 0; var9Lifetime1Lifetime1 < 3; var9Lifetime1Lifetime1++) {
            var10Lifetime1Lifetime1 = ll.field_k.field_s[var9Lifetime1Lifetime1];
            if (255 != var10Lifetime1Lifetime1) {
              if (var7Lifetime1 <= var8[var9Lifetime1Lifetime1]) {
                stackIn_102_0 = var8[var9Lifetime1Lifetime1];
              } else {
                stackIn_102_0 = var7Lifetime1;
              }
              var7Lifetime1 = stackIn_102_0;
            }
          }
          oo.h(0, 0, var7Lifetime1, 480);
          for (var9Lifetime1Lifetime2 = 0; var9Lifetime1Lifetime2 < 64; var9Lifetime1Lifetime2++) {
            oo.a(-176 + ((var9Lifetime1Lifetime2 / 11 + 25) * wf.field_m + 1000 * var9Lifetime1Lifetime2) % 10560, 3952, 176, var6Lifetime1 * 125 >> 8, wp.field_f);
          }
          oo.c();
          rq.field_l.a(30, 231, var6Lifetime1);
          rq.field_l.a(239, 231, var6Lifetime1);
          rq.field_l.a(448, 231, var6Lifetime1);
          var9Lifetime1Lifetime3 = 0;
          var10Lifetime1Lifetime2 = ll.field_k.g((byte) 125);
          for (var11Lifetime1 = 0; var11Lifetime1 < var10Lifetime1Lifetime2; var11Lifetime1++) {
            var12Lifetime1 = ll.field_k.field_m[var11Lifetime1];
            var13Lifetime1 = ll.field_k.field_g[var11Lifetime1];
            na.field_I.a(-32 + ga.field_v[var11Lifetime1], 126, var6Lifetime1);
            if (255 != var12Lifetime1 &&
              63 > var12Lifetime1) {
              pq.field_o.a(ga.field_v[var11Lifetime1], 166, var6Lifetime1);
              for (var14Lifetime1 = 0; var14Lifetime1 < 8; var14Lifetime1++) {
                oo.a(10 + ga.field_v[var11Lifetime1] << 4, -(((var14Lifetime1 / 5 + 19) * wf.field_m + var14Lifetime1 * 300) % 960) + 3728, 96, 125 * var6Lifetime1 >> 8, wp.field_f);
              }
              w.field_z.a(ga.field_v[var11Lifetime1], 166, var6Lifetime1);
              mg.a(var12Lifetime1, var13Lifetime1, (byte) 46, 106, ll.field_k, var6Lifetime1, -28 + ga.field_v[var11Lifetime1]);
              var14Lifetime1Lifetime2 = ll.field_k.field_t[var12Lifetime1];
              var15Lifetime1 = cr.a(var12Lifetime1, -107);
              incrementValue$1 = var9Lifetime1Lifetime3;
              var9Lifetime1Lifetime3++;
              stackIn_116_0 = qp.field_w;
              stackIn_116_1 = eb.a(this.field_r[incrementValue$1], true, true);
              stackIn_116_2 = ga.field_v[var11Lifetime1] - 50;
              stackIn_116_3 = 123;
              if (var14Lifetime1Lifetime2 < var15Lifetime1) {
                stackIn_117_4 = 16777215;
              } else {
                stackIn_117_4 = 16711680;
              }
              ((ef) (Object) stackIn_116_0).b(stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_117_4, 1, var6Lifetime1);
              if (255 != var13Lifetime1 &&
                var13Lifetime1 < 63) {
                var14Lifetime1Lifetime3 = ll.field_k.field_t[var13Lifetime1];
                var15Lifetime1Lifetime1 = cr.a(var13Lifetime1, -101);
                incrementValue$2 = var9Lifetime1Lifetime3;
                var9Lifetime1Lifetime3++;
                stackIn_125_0 = qp.field_w;
                stackIn_125_1 = eb.a(this.field_r[incrementValue$2], true, true);
                stackIn_125_2 = -73 + ga.field_v[var11Lifetime1];
                stackIn_125_3 = 111;
                if (var14Lifetime1Lifetime3 >= var15Lifetime1Lifetime1) {
                  stackIn_126_4 = 16711680;
                } else {
                  stackIn_126_4 = 16777215;
                }
                ((ef) (Object) stackIn_125_0).b(stackIn_125_1, stackIn_125_2, stackIn_125_3, stackIn_126_4, 1, var6Lifetime1);
              }
            } else {
              tm.field_f.a(ga.field_v[var11Lifetime1], 166, var6Lifetime1);
            }
          }
          for (var11Lifetime1Lifetime1 = 0; var11Lifetime1Lifetime1 < 3; var11Lifetime1Lifetime1++) {
            var12Lifetime1Lifetime1 = ll.field_k.field_s[var11Lifetime1Lifetime1];
            if (var12Lifetime1Lifetime1 != 255) {
              qj.field_m.a(38 + 209 * var11Lifetime1Lifetime1, 244, var6Lifetime1);
              oo.h(0, 0, 640, 366);
              for (var13Lifetime1Lifetime1 = 0; 16 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                oo.a((48 + 209 * var11Lifetime1Lifetime1 << 4) + 8, 4000 + (wf.field_m * (var13Lifetime1Lifetime1 / 5 + 19) + 300 * var13Lifetime1Lifetime1) % 1920, 112, 125 * var6Lifetime1 >> 8, wp.field_f);
              }
              for (var13Lifetime1Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1Lifetime1 < 8; var13Lifetime1Lifetime1Lifetime1++) {
                oo.a(((var13Lifetime1Lifetime1Lifetime1 / 5 + 19) * wf.field_m + var13Lifetime1Lifetime1Lifetime1 * 300) % 720 + 8 + (209 * var11Lifetime1Lifetime1 + 48 << 4), 5744, 112, var6Lifetime1 * 125 >> 8, wp.field_f);
              }
              pm.field_N.a(var11Lifetime1Lifetime1 * 209 + 38, 244, var6Lifetime1);
              oo.c();
              qh.a(var12Lifetime1Lifetime1, -29990, ll.field_k, 280, var11Lifetime1Lifetime1 * 209 + 91, var6Lifetime1);
              var13Lifetime1Lifetime1Lifetime2 = ll.field_k.field_t[var12Lifetime1Lifetime1];
              var14Lifetime1Lifetime1 = cr.a(var12Lifetime1Lifetime1, -95);
              incrementValue$0 = var9Lifetime1Lifetime3;
              var9Lifetime1Lifetime3++;
              stackIn_144_0 = qp.field_w;
              stackIn_144_1 = eb.a(this.field_r[incrementValue$0], true, true);
              stackIn_144_2 = 209 * var11Lifetime1Lifetime1 + 166;
              stackIn_144_3 = 295;
              if (var13Lifetime1Lifetime1Lifetime2 < var14Lifetime1Lifetime1) {
                stackIn_145_4 = 16777215;
              } else {
                stackIn_145_4 = 16711680;
              }
              ((ef) (Object) stackIn_144_0).b(stackIn_144_1, stackIn_144_2, stackIn_144_3, stackIn_145_4, 1, var6Lifetime1);
            } else {
              wk.field_J.a(38 + 209 * var11Lifetime1Lifetime1, 244, var6Lifetime1);
              hn.field_i.a(var11Lifetime1Lifetime1 * 209 + 91, 280, var6Lifetime1);
            }
          }
          ul.field_f.a(93, 231, var6Lifetime1);
          ul.field_f.a(209, 231, var6Lifetime1);
          ul.field_f.a(329, 231, var6Lifetime1);
          ul.field_f.a(573, 231, var6Lifetime1);
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_C = 0.5614934243533339;
        }
        field_D = null;
    }

    private final void f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 <= 2) {
          si.d(true);
        }
        if (this.field_E != 255) {
          if (this.field_m == 0 &&
            10 < b.a(true)) {
            this.field_m = this.field_m + 1;
          }
          if (this.field_m > 0) {
            this.field_m = this.field_m + 2;
            if (this.field_m > 255) {
              this.field_m = 255;
            }
            var7 = gh.field_f[this.field_E];
            var8 = qp.field_w.a(var7);
            var9 = param0 * (this.field_m * 8) >> 8;
            var5 = qp.field_w.field_w;
            if (255 < var9) {
              var9 = 255;
            }
            while (var8 > 300) {
              var5 = var5 + qp.field_w.field_w;
              var8 = var8 / 2;
            }
            var6 = var8 + 16;
            var3 = bd.field_g;
            var5 += 16;
            if (0 > var3) {
              var3 = 0;
            } else {
              if (var3 + var6 > 635) {
                var3 = 640 - var6 - 5;
              }
            }
            var4 = 32 + bo.field_d;
            if (var9 > 250) {
              oo.b(var3 + 2, var4 + 2, var6, var5, 4, 0, var9 / 2);
            }
            oo.b(var3, var4, var6, var5, 4, 10061892, var9);
            qp.field_w.a(var7, var3, var4, var6, var5, 16777215, 0, var9, 1, 1, 0);
          }
        } else {
          this.field_m = 0;
        }
    }

    private final void e(int param0, int param1) {
        this.field_u[this.field_v].a(this.field_v / 4 * 75 + 130, 35 + 640 * (this.field_v % param1) / 5, param0, 70);
        this.field_v = this.field_v + 1;
    }

    private final void b(boolean param0, int param1) {
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_n > 0) {
          this.field_n = 33 - this.field_n;
          this.field_B = this.field_s;
        } else {
          this.field_n = 33;
        }
        if (param0) {
          this.field_l = (String) null;
        }
        this.field_s = param1;
        var3 = this.field_s;
        if (var3 != 1) {
          if (var3 == 0) {
            we.field_g[43] = ec.field_a;
          }
        } else {
          we.field_g[43] = ip.field_c;
        }
    }

    final int d(int param0, int param1) {
        int var4;
        int var5;
        int stackIn_10_0 = 0;
        int var3;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 > -65) {
          return -1;
        }
        var4 = this.field_j.length;
        if (var4 != 1) {
          if (var4 == 2) {
            stackIn_10_0 = (param1 != 0) ? 2 : 0;
            var3 = stackIn_10_0;
          } else {
            var3 = param1;
          }
        } else {
          var3 = 1;
        }
        var4Lifetime1 = var3;
        if (0 == var4Lifetime1) {
          return 210;
        }
        if (var4Lifetime1 == 1) {
          return 400;
        }
        if (var4Lifetime1 != 2) {
          return super.d(-93, param1);
        }
        return 560;
    }

    final void f(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 != (op.field_m.field_j & 1 << fb.field_e.field_M)) {
          we.field_g[42] = ih.field_c;
        } else {
          if (cm.a(op.field_m.field_j, true) > 0) {
            we.field_g[42] = ih.field_c;
          } else {
            we.field_g[42] = u.field_j;
          }
        }
        if (param0 <= 123) {
          this.field_w = -88;
        }
    }

    final void a(int param0) {
        cb[] var2;
        int var3;
        int var5;
        cb[] var6;
        cb[] var7;
        int var8;
        cb var9;
        cb var10;
        boolean decompiledFrameRemainder0 = true;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(0);
        if (this.field_n > param0) {
          this.field_n = this.field_n - 1;
          if (this.field_n <= 0) {
            this.field_B = this.field_s;
            if (this.field_B == 0) {
              var7 = this.field_u;
              var2 = var7;
              var8 = 0;
              var3 = var8;
              while (var7.length > var8) {
                var10 = var7[var8];
                var10.c((byte) 99);
                var8++;
              }
              if (((this.field_g.field_d == 0)) &&
                ((39 == this.field_j[0]))) {
                this.field_g.a(1, ~param0);
              }
              decompiledFrameRemainder0 = false;
            }
          }
        } else {
          if (this.field_B != 1) {
            if (((this.field_g.field_d == 0)) &&
              ((39 == this.field_j[0]))) {
              this.field_g.a(1, ~param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (0 == wf.field_m % 2) {
              var6 = this.field_u;
              var2 = var6;
              for (var3 = 0; var6.length > var3; var3++) {
                var9 = var6[var3];
                var10 = var9;
                var10 = var9;
                var9.d((byte) -102);
              }
              if (((this.field_g.field_d == 0)) &&
                ((39 == this.field_j[0]))) {
                this.field_g.a(1, ~param0);
              }
              decompiledFrameRemainder0 = false;
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_g.field_d == 0 &&
          39 == this.field_j[0])) {
          this.field_g.a(1, ~param0);
        }
        int fieldTemp$0 = this.field_x - 1;
        this.field_x = this.field_x - 1;
        if (fieldTemp$0 <= 0) {
        }
    }

    static {
        field_C = 0.0;
        field_D = "Advertising websites";
    }
}
