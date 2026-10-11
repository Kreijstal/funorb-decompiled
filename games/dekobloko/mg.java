/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends w {
    static boolean field_Nb;
    static ig field_bc;
    private w field_ac;
    private StringBuilder field_Ub;
    private ha field_Qb;
    private w field_Xb;
    static int[][] field_Ob;
    private w[] field_Yb;
    long field_Tb;
    private w field_cc;
    private w field_Sb;
    static boolean field_Zb;
    private w field_Pb;
    private w field_Wb;
    static int field_Vb;
    private int field_Rb;

    public static void f(int param0) {
        field_Ob = (int[][]) null;
        if (param0 != 256) {
          return;
        }
        field_bc = null;
    }

    final static ck a(int param0, int param1, String param2, lm param3, int param4, int param5, byte param6) {
        int var23 = 0;
        int var26 = 0;
        ck stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var14 = null;
        int[] var15 = null;
        ck var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int var25 = 0;
        int var27 = 0;
        int[] var31 = null;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var27 = client.field_A ? 1 : 0;
        try {
          var7_int = param3.a(param2) - 1;
          while (param4 * (2 + var7_int) >= 620) {
            param4--;
          }
          var8 = param3.field_K + param3.field_R;
          var9 = param4;
          var10 = var9 / 4;
          var31 = hk.field_l;
          var12 = hk.field_j;
          var13 = hk.field_i;
          var14 = new ck(var7_int, var8);
          var14.a();
          param3.a(param2, 0, param3.field_R, 16777215, -1);
          if (0 == param5) {
            param5 = 65793;
          }
          hk.a(var31, var12, var13);
          var15 = var14.field_D;
          var16 = new ck((2 + var7_int) * var9, var9 * (2 + var8));
          var16.a();
          for (var17 = 0; var8 > var17; var17++) {
            for (var18 = 0; var7_int > var18; var18++) {
              if (var15[var17 * var7_int + var18] != 0) {
                var19 = var9 * (var18 + 1);
                var20 = (var17 + 1) * var9;
                hk.e(var19, var20, var9 - var10, param5 | -16777216);
                hk.e(-1 + var9 + var19, var20, var9 - var10, param5 | -16777216);
                hk.e(var19, var20 + var9 - 1, -var10 + var9, param5 | -16777216);
                hk.e(var19 + (var9 - 1), var9 + var20 - 1, -var10 + var9, param5 | -16777216);
              }
            }
          }
          hk.a(var31, var12, var13);
          for (var17Lifetime1 = 0; var17Lifetime1 < var8; var17Lifetime1++) {
            for (var18Lifetime1 = 0; var7_int > var18Lifetime1; var18Lifetime1++) {
              if (0 != var15[var18Lifetime1 + var17Lifetime1 * var7_int]) {
                var19Lifetime1 = var9 + var18Lifetime1 * var9;
                var20Lifetime1 = var19Lifetime1 + var9;
                var21 = var9 * var17Lifetime1 + var9;
                var22 = var9 + var21;
                for (var23 = var21; var23 < var22; var23++) {
                  var24 = 256 * (var23 - var9) / (var9 * var8);
                  var25 = fl.a(param1, var24, 256, param0, 124);
                  for (var26 = var19Lifetime1; var20Lifetime1 > var26; var26++) {
                    var16.field_D[var26 + var16.field_I * var23] = de.b(-16777216, var25);
                  }
                }
              }
            }
          }
          if (param6 < 84) {
            mg.f(17);
          }
          stackIn_33_0 = var16;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_36_0 = var7;
          stackIn_36_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        if (this.field_Rb != -2) {
          return false;
        }
        if (wh.field_c == 13) {
          this.field_Rb = -1;
          return true;
        }
        return true;
    }

    final static void a(int param0, ck param1, ck param2) {
        int var6 = 0;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = client.field_A ? 1 : 0;
        try {
          var8 = param2.field_D;
          var3 = var8;
          var4 = param1.field_D;
          var5 = var8.length;
          for (var6 = param0; var6 < var5; var6++) {
            if (0 == var4[var6]) {
              var8[var6] = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("mg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(w param0, int param1, int param2, w param3, int param4, String param5) {
        w var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new w(0L, param0, 0, param1, param2, param4, param5);
          param3.a(var7, -16834);
          param1 += 32;
          stackIn_1_0 = param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("mg.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(boolean param0, w param1, w param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3 += 8;
          if (!param0) {
            field_Ob = (int[][]) null;
          }
          var6_int = param1.field_J.b(param1.field_Y, param4 - param1.field_ub * 2, param1.field_Db);
          param1.a(param4, 0, param3, var6_int, 0);
          param2.a(param1, -16834);
          param3 = param3 + (var6_int - 0);
          stackIn_3_0 = param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("mg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int c(int param0, boolean param1) {
        int var3 = 0;
        ha stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        w stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (param0 != 497) {
          return -95;
        }
        if (null != this.field_Wb) {
          this.field_Wb.field_Y = this.field_Ub.toString();
          this.field_Wb.field_vb = (this.field_mb - this.field_Wb.field_J.a(this.field_Wb.field_Y)) / 2;
          this.field_Wb.field_mb = this.field_mb - this.field_Wb.field_vb;
          if (null != this.field_Qb &&
            0 != this.field_Qb.field_ob) {
            stackIn_7_0 = this.field_Qb;
            stackIn_8_1 = !(this.field_Qb.field_ab);
            stackIn_7_0.field_ab = stackIn_8_1;
          }
          for (var3 = 0; qb.field_u > var3; var3++) {
            if (this.field_Yb[var3] != null) {
              stackIn_16_0 = this.field_Yb[var3];
              stackIn_17_1 = !(this.field_Ub.length() <= 0);
              stackIn_16_0.field_Hb = stackIn_17_1;
              if (this.field_Yb[var3].field_Hb &&
                0 != this.field_Yb[var3].field_ob) {
                return var3;
              }
            }
          }
        }
        if (this.field_ac.field_ob != 0) {
          return -1;
        }
        if (param1 &&
          0 != ig.field_Yb &&
          0 == this.field_ob) {
          return -1;
        }
        return this.field_Rb;
    }

    final boolean e(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 5658) {
          mg.f(-70);
        }
        stackIn_6_0 = (null != this.field_Qb) && (this.field_Qb.field_ab);
        return stackIn_6_0;
    }

    final String g(byte param0) {
        if (param0 != -96) {
          field_Nb = true;
        }
        return this.field_Ub.toString();
    }

    final static void b(int param0, boolean param1) {
        je.field_f = param1 ? new ak(ue.field_c, cl.field_n) : new ak(eg.field_b, in.field_o);
        ee.field_i = new w(0L, (w) null);
        ee.field_i.a(je.field_f.field_h, -16834);
        ee.field_i.a(ma.field_G, -16834);
        mn.field_e = new w((long)param0, ui.field_x);
        cl.field_C = new w(0L, (w) null);
        mn.field_e.a(ie.field_a, -16834);
        mn.field_e.a(cl.field_C, -16834);
        cl.field_C.a(gg.field_y, -16834);
        cl.field_C.a(qc.field_q, -16834);
        vb.a(param1, -2);
    }

    mg(int param0, int param1, int param2, int param3, int param4, w param5, w param6, w param7, w param8, ha param9, w param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        int var15_int = 0;
        w[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        w[] var28 = null;
        Object stackIn_8_0;
        ha stackIn_8_1;
        ha stackIn_8_2;
        long stackIn_8_3;
        ha stackIn_8_4;
        Object stackIn_9_0;
        ha stackIn_9_1;
        ha stackIn_9_2;
        String stackIn_9_5;
        w stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        Object stackIn_8_0Lifetime1;
        ha stackIn_8_1Lifetime1;
        ha stackIn_8_2Lifetime1;
        Object stackIn_9_0Lifetime1;
        ha stackIn_9_1Lifetime1;
        ha stackIn_9_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_Rb = -2;
        try {
          this.field_Tb = param12;
          this.field_cc = new w(0L, param6, ue.field_a.toUpperCase());
          this.field_cc.field_X = 1;
          this.a(this.field_cc, -16834);
          this.field_ac = new w(0L, param7);
          this.field_cc.a(this.field_ac, -16834);
          this.field_Pb = new w(0L, (w) null);
          this.a(this.field_Pb, -16834);
          if (param11 != null) {
            this.field_Xb = new w(0L, param8, ph.field_Hb);
            this.field_Xb.field_X = 1;
            this.field_Xb.field_G = 11184810;
            this.field_Pb.a(this.field_Xb, -16834);
            this.field_Sb = new w(0L, param8, pc.field_c);
            this.field_Sb.field_X = 1;
            this.field_Sb.field_G = 11184810;
            this.field_Pb.a(this.field_Sb, -16834);
            this.field_Wb = new w(0L, param8);
            this.field_Wb.field_G = 16764006;
            this.field_Pb.a(this.field_Wb, -16834);
            this.field_Wb.field_T = "|";
            if (!(d.field_b < 5) ||
              !(te.field_p < 2)) {
              L3: {
                stackIn_8_0 = this;
                stackIn_8_1 = null;
                stackIn_8_2 = null;
                stackIn_8_3 = 0L;
                stackIn_8_4 = (ha) (param9);
                if (d.field_b < 7) {
                  stackIn_8_0Lifetime1 = this;
                  stackIn_8_1Lifetime1 = null;
                  stackIn_8_2Lifetime1 = null;
                  if (te.field_p < 2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = rk.field_bb;
                    break L3;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = si.field_j;
              }
              this.field_Qb = new ha(stackIn_8_3, stackIn_8_4, stackIn_9_5);
              this.field_Pb.a(this.field_Qb, -16834);
            }
            var28 = new w[3];
            var15 = var28;
            var28[0] = new w(0L, (w) null);
            this.field_Pb.a(var28[0], -16834);
            var28[1] = new w(0L, (w) null);
            this.field_Pb.a(var28[1], -16834);
            var28[2] = new w(0L, (w) null);
            this.field_Pb.a(var28[2], -16834);
            this.field_Yb = new w[qb.field_u];
            for (var16 = 0; var16 < qb.field_u; var16++) {
              if (pn.field_bb[var16] != null) {
                this.field_Yb[var16] = new w(0L, param10, pn.field_bb[var16]);
                this.field_Yb[var16].field_X = 0;
                stackIn_15_0 = this.field_Yb[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.field_Hb = stackIn_16_1;
                this.field_Pb.a(this.field_Yb[var16], -16834);
              }
            }
            this.field_Ub = new StringBuilder(12);
            if (param11 != null) {
              discarded$1 = this.field_Ub.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_J.a(cf.field_g);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_J.a(ul.field_a);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_J.a(k.field_d);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < qb.field_u; var17Lifetime4++) {
              if (this.field_Yb[var17Lifetime4] != null) {
                var18 = this.field_Yb[var17Lifetime4].a(true);
                if (var18 > var16Lifetime2) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(param6, var18Lifetime3, var16Lifetime2, var28[0], 24, cf.field_g);
            var18Lifetime3 = this.a(true, this.field_Yb[6], var28[0], var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(true, this.field_Yb[9], var28[0], var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(true, this.field_Yb[5], var28[0], var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(true, this.field_Yb[7], var28[0], var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(true, this.field_Yb[15], var28[0], var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(true, this.field_Yb[4], var28[0], var18Lifetime3, var16Lifetime2);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(param6, var18Lifetime4, var16Lifetime2, var28[1], 24, ul.field_a);
            var18Lifetime4 = this.a(true, this.field_Yb[16], var28[1], var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(true, this.field_Yb[17], var28[1], var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(true, this.field_Yb[18], var28[1], var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(true, this.field_Yb[19], var28[1], var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(true, this.field_Yb[20], var28[1], var18Lifetime4, var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(param6, var18Lifetime5, var16Lifetime2, var28[2], 24, k.field_d);
            var18Lifetime5 = this.a(true, this.field_Yb[13], var28[2], var18Lifetime5, var16Lifetime2);
            var18Lifetime5 = this.a(true, this.field_Yb[21], var28[2], var18Lifetime5, var16Lifetime2);
            var18Lifetime5 = this.a(true, this.field_Yb[11], var28[2], var18Lifetime5, var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.field_cc.a(true);
            if (var20 > var19) {
              var19 = var20;
            }
            if (this.field_Qb != null) {
              var20Lifetime2 = this.field_Qb.c(4, -4168);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_cc.a(13 - (-var19 - 13), 0, 0, 24, 0);
            this.field_ac.a(15, 0, 5, 15, -20 + this.field_cc.field_mb);
            var21 = 10;
            this.field_Xb.a(var19, 0, var21, kf.field_O * 2, 13);
            var21 = var21 + 2 * kf.field_O;
            this.field_Sb.a(var19, 0, var21, kf.field_O * 2, 13);
            var21 = var21 + (2 * kf.field_O + 10);
            this.field_Wb.a(0, 0, var21, kf.field_O, 0);
            var21 = var21 + (kf.field_O + 10);
            if (null != this.field_Qb) {
              var20Lifetime3 = this.field_Qb.c(4, -4168);
              this.field_Qb.a(var20Lifetime3, 8, var21, (var19 - var20Lifetime3) / 2 + 13, 4, kf.field_O);
              var21 = var21 + (10 + kf.field_O);
            }
            var28[0].a(var16Lifetime2, 0, var21, var17Lifetime5, 13);
            var28[1].a(var16Lifetime2, 0, var21, var17Lifetime5, 13 + (var16Lifetime2 + 13));
            var28[2].a(var16Lifetime2, 0, var21, var17Lifetime5, 2 * var16Lifetime2 + 13 + 26);
            var22 = var21;
            this.field_Pb.a(13 + var19 + 13, 0, 24, 10 + var17Lifetime5 + var22, 0);
            this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
            var23 = 13 + var19 + 13;
            var24 = 10 + (var22 + (24 + var17Lifetime5));
            var25 = vh.a(param2, -18265, var23, param0);
            var26 = o.a(param3, 0, var24, param1);
            this.a(var23, 0, var26, var24, var25);
            return;
          }
          this.field_Xb = new w(0L, param8, hc.field_f);
          this.field_Xb.field_G = 11184810;
          this.field_Xb.field_X = 1;
          this.field_Pb.a(this.field_Xb, -16834);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Xb.field_J.a(this.field_Xb.field_Y, var15_int);
          this.field_Xb.a(var15_int, 0, var16Lifetime1, kf.field_O * var17Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + kf.field_O * var17Lifetime1;
          this.field_Pb.a(var15_int + 13 + 13, 0, 24, 10 + var16Lifetime1, 0);
          this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
          var18Lifetime1 = 26 + var15_int;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = vh.a(param2, -18265, var18Lifetime1, param0);
          var21Lifetime1 = o.a(param3, 0, var19Lifetime1, param1);
          this.a(var18Lifetime1, 0, var21Lifetime1, var19Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    static {
        field_Nb = false;
    }
}
