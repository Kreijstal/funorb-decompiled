/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tr extends ia {
    private bi[] field_Mb;
    private om field_K;
    static String field_zb;
    boolean field_Bb;
    boolean field_Gb;
    private double field_wb;
    private int[] field_tb;
    private om field_ob;
    static String field_Fb;
    private om[][] field_qb;
    private bi[] field_Kb;
    boolean field_Ab;
    private int field_yb;
    private om field_Cb;
    mg field_rb;
    private double field_Nb;
    private int field_Hb;
    private double field_Jb;
    private mg field_Db;
    private int[][] field_Qb;
    static pf field_vb;
    private om field_Ib;
    int[] field_nb;
    static ej[] field_Eb;
    private bi[] field_xb;
    private om field_Ob;
    private int[] field_ub;
    static bi[] field_sb;
    static String field_Pb;
    static String field_pb;
    static int field_Lb;

    private final void c(ln param0, int param1) {
        if (param1 != 2) {
          return;
        }
        try {
          this.b(param0, true);
          this.e(param0, -29952);
          this.b(param0, -29496);
          if (this.field_I < 1024.0f) {
            this.d(param0, 10);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tr.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        ln[] var2;
        int var2_int;
        int var3;
        ln[] var3_ref_ln__;
        int var4;
        int var7;
        fs[] var8;
        ln[] var9;
        ln var10;
        ln var11;
        bh var12;
        ln var13;
        bh var14;
        ln var15;
        bh var16;
        ln[] var17;
        ln var18;
        bh var19;
        ln var20;
        ln[] var21;
        ln var22;
        bh var23;
        ln var24;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        ln[] var2Lifetime1;
        ln[] var2Lifetime2;
        ln[] var2Lifetime3;
        ln[] var3_ref_ln__Lifetime1;
        ln[] var3_ref_ln__Lifetime2;
        ln[] var3_ref_ln__Lifetime3;
        ln var11Lifetime1;
        ln var15Lifetime1;
        ln var15Lifetime2;
        ln var15Lifetime3;
        ln var11Lifetime2;
        ln var15Lifetime1Lifetime1;
        ln var15Lifetime2Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 29201) {
          var8 = (fs[]) null;
          this.a(-13, (fs[]) null);
        }
        if (!(this.field_I > 1024.0f)) {
          var17 = this.field_O.field_e;
          var2 = var17;
          for (var3 = 0; var3 < var17.length; var3++) {
            var18 = var17[var3];
            var22 = var18;
            var24 = var22;
            var22 = var18;
            var19 = this.field_h[var18.field_p];
            if (var19.field_l <= 640 &&
              var19.field_q <= 480 &&
              var19.field_o >= 0 &&
              var19.field_i >= 0) {
              this.b(0, var18);
              this.a(-91, var18);
              if (this.field_I < 330.0f &&
                var18.field_u) {
                this.a(var18, (byte) 101);
              }
            }
          }
          if (1024.0f > this.field_I) {
            var2Lifetime1 = this.field_O.field_e;
            for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
              var20 = var2Lifetime1[var3Lifetime1];
              var24 = var20;
              var24 = var20;
              this.a(false, var20, param0 ^ -29268);
            }
          }
          var21 = this.field_O.field_e;
          var2Lifetime2 = var21;
          for (var3Lifetime2 = 0; var21.length > var3Lifetime2; var3Lifetime2++) {
            var22 = var21[var3Lifetime2];
            var24 = var22;
            var24 = var22;
            var23 = this.field_h[var22.field_p];
            if (var23.field_l <= 640 &&
              480 >= var23.field_q &&
              var23.field_o >= 0 &&
              0 <= var23.field_i) {
              this.c(var22, 2);
              if (this.field_I > 330.0f &&
                var22.field_u) {
                this.a(var22, (byte) 102);
              }
            }
          }
          if (1024.0f > this.field_I) {
            var2Lifetime3 = this.field_O.field_e;
            for (var3Lifetime3 = 0; var2Lifetime3.length > var3Lifetime3; var3Lifetime3++) {
              var24 = var2Lifetime3[var3Lifetime3];
              this.a(true, var24, 127);
            }
          }
          this.h(param0 - 29253);
          this.i(param0 ^ 29261);
        } else {
          var2_int = 0;
          var9 = this.field_O.field_e;
          var3_ref_ln__ = var9;
          for (var4 = 0; var9.length > var4; var4++) {
            var10 = var9[var4];
            var11 = var10;
            var15 = var11;
            var11Lifetime2 = var10;
            if (var10.field_J > var2_int) {
              var2_int = var10.field_J;
            }
          }
          var3_ref_ln__Lifetime1 = this.field_O.field_e;
          for (var4Lifetime1 = 0; var3_ref_ln__Lifetime1.length > var4Lifetime1; var4Lifetime1++) {
            var11Lifetime1 = var3_ref_ln__Lifetime1[var4Lifetime1];
            var15Lifetime1 = var11Lifetime1;
            var18 = var15Lifetime1;
            var22 = var18;
            var15Lifetime1Lifetime1 = var11Lifetime1;
            var12 = this.field_h[var11Lifetime1.field_p];
            if (var12.field_l <= 640 &&
              480 >= var12.field_q &&
              var12.field_o >= 0 &&
              var12.field_i >= 0) {
              this.a(param0 ^ 24563, var11Lifetime1, var2_int);
              if (var11Lifetime1.field_u) {
                this.a(var11Lifetime1, (byte) 99);
              }
            }
          }
          this.h(-90);
          var3_ref_ln__Lifetime2 = this.field_O.field_e;
          for (var4Lifetime2 = 0; var4Lifetime2 < var3_ref_ln__Lifetime2.length; var4Lifetime2++) {
            var13 = var3_ref_ln__Lifetime2[var4Lifetime2];
            var15Lifetime2 = var13;
            var18 = var15Lifetime2;
            var22 = var18;
            var15Lifetime2Lifetime1 = var13;
            var14 = this.field_h[var13.field_p];
            if (var14.field_l <= 640 &&
              var14.field_q <= 480 &&
              var14.field_o >= 0 &&
              0 <= var14.field_i) {
              rs.field_Cb.c(Integer.toString(this.field_eb[var13.field_p]), this.field_i[var13.field_p] - 1, this.field_J[var13.field_p] + 3, 16777215, -1);
            }
          }
          var3_ref_ln__Lifetime3 = this.field_O.field_e;
          for (var4Lifetime3 = 0; var3_ref_ln__Lifetime3.length > var4Lifetime3; var4Lifetime3++) {
            var15Lifetime3 = var3_ref_ln__Lifetime3[var4Lifetime3];
            var18 = var15Lifetime3;
            var22 = var18;
            var24 = var22;
            var18 = var15Lifetime3;
            var16 = this.field_h[var15Lifetime3.field_p];
            if (var16.field_l <= 640 &&
              var16.field_q <= 480 &&
              0 <= var16.field_o &&
              var16.field_i >= 0) {
              this.a(false, var15Lifetime3, -128);
            }
          }
          this.i(92);
        }
    }

    private final mg a(ln param0, int param1, int param2, int param3) {
        int var10_int = 0;
        mg stackIn_10_0 = null;
        Object stackIn_20_0 = null;
        mg stackIn_40_0 = null;
        mg stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        mg var6 = null;
        mg var7_ref_mg = null;
        int var7 = 0;
        boolean[] var8 = null;
        int[] var9 = null;
        ln var10 = null;
        ln var11 = null;
        double var11_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        double var13_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        boolean[] var33 = null;
        int[] var34 = null;
        boolean[] var35 = null;
        mg var6Lifetime1;
        int var5_intLifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        double var20Lifetime1;
        var31 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (1024.0f < this.field_I) {
            var7_ref_mg = (mg) (param0.field_s.c(-127));
            while (var7_ref_mg != null) {
              if (this.field_B == var7_ref_mg.field_G) {
                var6_int = (this.field_J[var7_ref_mg.field_y.field_p] + this.field_J[var7_ref_mg.field_B.field_p]) / 2;
                var5_int = (this.field_i[var7_ref_mg.field_B.field_p] + this.field_i[var7_ref_mg.field_y.field_p]) / 2;
                if ((-var5_int + param1) * (param1 - var5_int) + (-var6_int + param2) * (param2 - var6_int) < 81) {
                  this.field_nb[1] = var6_int;
                  this.field_nb[0] = var5_int;
                  stackIn_10_0 = var7_ref_mg;
                  return stackIn_10_0;
                }
              }
              var7_ref_mg = (mg) (param0.field_s.b(32));
            }
            return null;
          }
          var5_intLifetime1 = 0;
          var6 = (mg) (param0.field_s.c(-127));
          while (var6 != null) {
            if (var6.field_G == this.field_B) {
              var5_intLifetime1++;
            }
            var6 = (mg) (param0.field_s.b(32));
          }
          if (0 == var5_intLifetime1) {
            stackIn_20_0 = null;
            return (mg) (stackIn_20_0);
          }
          if (!(this.field_I < 330.0f)) {
            var7 = 12 * ((-1 + var5_intLifetime1) / 12 + 1);
          } else {
            var7 = 12 * ((-1 + var5_intLifetime1) / 11 + 1);
          }
          var35 = new boolean[var7];
          var33 = var35;
          var8 = var33;
          var34 = new int[var7 * 2];
          var32 = var34;
          var9 = var32;
          for (var10_int = 0; var10_int < var7; var10_int++) {
            var11_double = (double)(var10_int * 2) * 3.141592653589793 / (double)var7;
            if (this.field_I < 330.0f &&
              4.4505895925855405 <= var11_double &&
              var11_double <= 4.97418836818384) {
              var8[var10_int] = true;
              var9[2 * var10_int] = -1;
              var9[1 + 2 * var10_int] = -1;
            }
            var13_double = Math.sin(var11_double);
            var15_double = Math.cos(var11_double);
            var9[var10_int * 2] = (int)(var15_double * (150.0 * this.field_wb)) + this.field_i[param0.field_p];
            var9[var10_int * 2 + 1] = (int)(150.0 * this.field_wb * var13_double) + this.field_J[param0.field_p];
          }
          var6Lifetime1 = (mg) (param0.field_s.c(param3 ^ 126));
          if (param3 != -1) {
            this.field_ub = (int[]) null;
          }
          while (var6Lifetime1 != null) {
            boolean decompiledFrameRemainder0 = true;
            if (var6Lifetime1.field_G == this.field_B) {
              var10 = var6Lifetime1.field_y;
              var11 = var6Lifetime1.field_B;
              var12 = var10.field_p;
              var13 = var11.field_p;
              var14 = this.field_i[var12];
              var15 = this.field_J[var12];
              var16 = this.field_i[var13];
              var17 = this.field_J[var13];
              var20 = Math.sqrt((double)((-var15 + var17) * (-var15 + var17) + (-var14 + var16) * (var16 - var14)));
              var22 = (double)(var16 - var14) / var20;
              var24 = (double)(var17 - var15) / var20;
              var18 = var16 - (int)(var22 * (this.field_Jb * 150.0));
              var19 = -(int)(this.field_Jb * 150.0 * var24) + var17;
              var26 = this.a(var18, var34, var35, var15, var24, (byte) -55, var19, var14, var22);
              var19Lifetime1 = var9[2 * var26 + 1];
              var18Lifetime1 = var9[var26 * 2];
              if ((this.field_I < 700.0f &&
                var7 <= 12) &&
                (decompiledFrameRemainder0 = !(fj.field_p.field_w * fj.field_p.field_w / 4 < (-var18Lifetime1 + param1) * (-var18Lifetime1 + param1) + (-var19Lifetime1 + param2) * (-var19Lifetime1 + param2)))) {
                this.field_nb[0] = var18Lifetime1;
                this.field_nb[1] = var19Lifetime1;
                stackIn_40_0 = var6Lifetime1;
                return stackIn_40_0;
              }
              if (decompiledFrameRemainder0) {
                var27 = var14 + (int)((double)this.field_Hb * var22);
                var28 = var15 + (int)((double)this.field_Hb * var24);
                var29 = (var18Lifetime1 + var27) / 2;
                var30 = (var28 + var19Lifetime1) / 2;
                var20Lifetime1 = Math.sqrt((double)((var28 - var19Lifetime1) * (-var19Lifetime1 + var28) + (var27 - var18Lifetime1) * (-var18Lifetime1 + var27)));
                var29 = (int)((double)var29 + -var24 * var20Lifetime1 / 10.0);
                var30 = (int)((double)var30 + var22 * var20Lifetime1 / 10.0);
                if ((-var30 + param2) * (param2 - var30) + (-var29 + param1) * (-var29 + param1) < 81) {
                  this.field_nb[0] = var29;
                  this.field_nb[1] = var30;
                  stackIn_44_0 = var6Lifetime1;
                  return stackIn_44_0;
                }
              }
            }
            var6Lifetime1 = (mg) (param0.field_s.b(32));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_49_0 = var5;
          stackIn_49_1 = new StringBuilder().append("tr.DA(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_Fb = null;
        field_Eb = null;
        field_zb = null;
        field_pb = null;
        field_Pb = null;
        if (param0 != 0) {
          return;
        }
        field_vb = null;
        field_sb = null;
    }

    private final void i(int param0) {
        int var9_int = 0;
        int var2;
        int var3;
        mg var3_ref_mg;
        int var4;
        int var5;
        int var6;
        int var7;
        boolean[] var7_ref_boolean__;
        double var8;
        int[] var8_ref_int__;
        int var8_int;
        ln var9_ref_ln;
        double var9;
        ln var10;
        double var10_double;
        int var11_int;
        double var11;
        int var12;
        double var12_double;
        int var13_int;
        double var13;
        int var14;
        double var14_double;
        int var15;
        int var16;
        double var17_double;
        int var17;
        double var18_double;
        int var18;
        double var19_double;
        int var19;
        double var21;
        int var23;
        int var24;
        ln var25;
        int[] var26;
        boolean[] var27;
        int[] var28;
        boolean[] var29;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        mg var3_ref_mgLifetime1;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 92) {
          var25 = (ln) null;
          this.b((ln) null, -92);
        }
        if (this.field_rb == null) {
          return;
        }
        if (!(this.field_I > 1024.0f)) {
          var2 = 0;
          var3_ref_mg = (mg) (this.field_rb.field_B.field_s.c(-127));
          while (var3_ref_mg != null) {
            if (this.field_B == var3_ref_mg.field_G) {
              var2++;
            }
            var3_ref_mg = (mg) (this.field_rb.field_B.field_s.b(32));
          }
          if (0 == var2) {
            return;
          }
          if (330.0f > this.field_I) {
            var4 = 12 * ((-1 + var2) / 11) + 12;
          } else {
            var4 = 12 + (-1 + var2) / 12 * 12;
          }
          var5 = 0;
          var6 = 0;
          if (700.0f > this.field_I &&
            var4 <= 12) {
            var5 = this.field_ub[0];
            var6 = this.field_ub[1];
          } else {
            var29 = new boolean[var4];
            var27 = var29;
            var7_ref_boolean__ = var27;
            var28 = new int[2 * var4];
            var26 = var28;
            var8_ref_int__ = var26;
            for (var9_int = 0; var4 > var9_int; var9_int++) {
              var10_double = 3.141592653589793 * (double)(var9_int * 2) / (double)var4;
              if (this.field_I < 330.0f &&
                4.4505895925855405 <= var10_double &&
                4.97418836818384 >= var10_double) {
                var7_ref_boolean__[var9_int] = true;
                var8_ref_int__[var9_int * 2] = -1;
                var8_ref_int__[var9_int * 2 + 1] = -1;
              }
              var12_double = Math.sin(var10_double);
              var14_double = Math.cos(var10_double);
              var8_ref_int__[2 * var9_int] = (int)(150.0 * this.field_wb * var14_double) + this.field_i[this.field_rb.field_B.field_p];
              var8_ref_int__[1 + var9_int * 2] = (int)(150.0 * this.field_wb * var12_double) + this.field_J[this.field_rb.field_B.field_p];
            }
            var3_ref_mgLifetime1 = (mg) (this.field_rb.field_B.field_s.c(-128));
            while (var3_ref_mgLifetime1 != null) {
              if (var3_ref_mgLifetime1.field_G == this.field_B) {
                var9_ref_ln = var3_ref_mgLifetime1.field_y;
                var10 = var3_ref_mgLifetime1.field_B;
                var11_int = var9_ref_ln.field_p;
                var12 = var10.field_p;
                var13_int = this.field_i[var11_int];
                var14 = this.field_J[var11_int];
                var15 = this.field_i[var12];
                var16 = this.field_J[var12];
                var17_double = Math.sqrt((double)((var16 - var14) * (var16 - var14) + (-var13_int + var15) * (var15 - var13_int)));
                var19_double = (double)(var15 - var13_int) / var17_double;
                var5 = var15 - (int)(var19_double * (150.0 * this.field_Jb));
                var21 = (double)(var16 - var14) / var17_double;
                var6 = var16 - (int)(this.field_Jb * 150.0 * var21);
                var23 = this.a(var5, var28, var29, var14, var21, (byte) -52, var6, var13_int, var19_double);
                var5 = var8_ref_int__[var23 * 2];
                var6 = var8_ref_int__[var23 * 2 + 1];
                if (var3_ref_mgLifetime1 == this.field_rb) {
                  break;
                }
              }
              var3_ref_mgLifetime1 = (mg) (this.field_rb.field_B.field_s.b(32));
            }
          }
          var7 = this.field_i[this.field_rb.field_y.field_p];
          var8_int = this.field_J[this.field_rb.field_y.field_p];
          var9 = Math.sqrt((double)((-var8_int + var6) * (var6 - var8_int) + (-var7 + var5) * (-var7 + var5)));
          var11 = (double)(-var7 + var5) / var9;
          var13 = (double)(-var8_int + var6) / var9;
          var15Lifetime1 = (int)(var11 * (double)this.field_Hb) + var7;
          var16Lifetime1 = var8_int + (int)((double)this.field_Hb * var13);
          var17 = 0;
          if (0.0 == var11) {
            var17Lifetime1 = (!(var13 > 0.0)) ? 16384 : 49152;
          } else {
            if (0.0 == var13) {
              var17Lifetime1 = (var11 > 0.0) ? 0 : 32768;
            } else {
              var18_double = (double)(-var8_int + var6);
              if (0.0 > var18_double) {
                var18_double = -var18_double;
              }
              var17Lifetime1 = (int)(32768.0 * Math.asin(var18_double / var9) / 3.141592653589793);
              if (var11 < 0.0) {
                if (!(var13 < 0.0)) {
                  var17Lifetime1 = var17Lifetime1 + 32768;
                } else {
                  var17Lifetime1 = 32768 - var17Lifetime1;
                }
              } else {
                if (var13 > 0.0) {
                  var17Lifetime1 = 65536 - var17Lifetime1;
                }
              }
            }
          }
          if (!(var9 <= 1.0 + (this.field_Jb * 300.0 + 0.5 - this.field_wb * 150.0))) {
            eo.a(false, var16Lifetime1, var6, (byte) 69, 200, var5, var15Lifetime1);
          } else {
            if (0 != var17Lifetime1) {
              if (var17Lifetime1 == 32768) {
                this.field_Cb.i(1 + (var5 - 4), 5 + var16Lifetime1 - this.field_Cb.field_w);
              } else {
                if (var17Lifetime1 < 16384) {
                  this.field_K.f(-this.field_K.field_z + var5 + 4, var6 - 4);
                } else {
                  if (var17Lifetime1 > 16384 &&
                    var17Lifetime1 < 32768) {
                    this.field_Ob.f(-4 + var5, var6 - 4);
                  } else {
                    if (var17Lifetime1 > 32768 &&
                      var17Lifetime1 < 49152) {
                      this.field_K.i(-4 + (var5 + 1), 5 - this.field_K.field_w + var6);
                    } else {
                      if (49152 < var17Lifetime1) {
                        this.field_Ob.i(1 + (4 + (-this.field_Ob.field_z + var5)), 1 + (4 - this.field_Ob.field_w) + var6);
                      }
                    }
                  }
                }
              }
            } else {
              this.field_Cb.f(4 + var5 - this.field_Cb.field_z, -4 + var16Lifetime1);
            }
          }
          if (this.field_I < 700.0f &&
            12 >= var4) {
            gf.b(var5, var6, 30, 16777215);
            gf.c(var5, var6, 30, 16777215, 92);
            ie.a((om) (this.field_B.field_n), fj.field_p.field_z << 3, fj.field_p.field_w << 3, var5 * 16, var6 * 16, 3800 + (var17Lifetime1 - 16384), 4096);
            gf.c(var5, var6, 9, 0, 92);
            rs.field_Cb.c(Integer.toString(this.field_rb.field_z), var5, var6 + 4, 16777215, -1);
            di.field_i[0].f(30 + (var5 - di.field_i[0].field_z / 2), -(di.field_i[0].field_w / 2) + var6);
            di.field_i[1].f(-30 + (var5 - di.field_i[0].field_z / 2), var6 - di.field_i[0].field_w / 2);
            di.field_i[2].f(-(di.field_i[0].field_z / 2) + var5, var6 - (-30 + di.field_i[0].field_w / 2));
          } else {
            var18 = this.field_ub[0];
            var19 = this.field_ub[1];
            var19--;
            gf.b(var18, var19, 30, 16777215);
            gf.c(var18, var19, 30, 16777215, 92);
            ie.a((om) (this.field_B.field_n), fj.field_p.field_z << 3, fj.field_p.field_w << 3, 16 * var18, 16 * var19, var17Lifetime1 - 16384, 4096);
            gf.c(var18, var19, 9, 0, 92);
            rs.field_Cb.c(Integer.toString(this.field_rb.field_z), var18, var19 + 4, 16777215, -1);
            di.field_i[0].f(30 + var18 - di.field_i[0].field_z / 2, -(di.field_i[0].field_w / 2) + var19);
            di.field_i[1].f(-30 + var18 - di.field_i[0].field_z / 2, var19 - di.field_i[0].field_w / 2);
            di.field_i[2].f(-(di.field_i[0].field_z / 2) + var18, 30 + (var19 - di.field_i[0].field_w / 2));
          }
        } else {
          var2 = this.field_ub[0];
          var3 = this.field_ub[1];
          var3--;
          var4 = this.field_i[this.field_rb.field_B.field_p] - this.field_i[this.field_rb.field_y.field_p];
          var5 = this.field_J[this.field_rb.field_B.field_p] - this.field_J[this.field_rb.field_y.field_p];
          var6 = 0;
          if (var4 == 0) {
            var6 = (var5 > 0) ? 49152 : 16384;
          } else {
            if (0 != var5) {
              var7 = var5;
              var8 = Math.sqrt((double)(var4 * var4 + var5 * var5));
              if (0 > var7) {
                var7 = -var7;
              }
              var6 = (int)(Math.asin((double)var7 / var8) * 32768.0 / 3.141592653589793);
              if (var4 >= 0) {
                if (0 < var5) {
                  var6 = 65536 - var6;
                }
              } else {
                if (var5 >= 0) {
                  var6 = var6 + 32768;
                } else {
                  var6 = -var6 + 32768;
                }
              }
            } else {
              var6 = (var4 > 0) ? 0 : 32768;
            }
          }
          gf.b(var2, var3, 30, 16777215);
          gf.c(var2, var3, 30, 16777215, 92);
          ie.a((om) (this.field_B.field_n), fj.field_p.field_z << 3, fj.field_p.field_w << 3, var2 * 16, 16 * var3, var6 - 16384, 4096);
          gf.c(var2, var3, 9, 0, 92);
          rs.field_Cb.c(Integer.toString(this.field_rb.field_z), var2, 4 + var3, 16777215, -1);
          di.field_i[0].f(var2 + (30 - di.field_i[0].field_z / 2), -(di.field_i[0].field_w / 2) + var3);
          di.field_i[1].f(-(di.field_i[0].field_z / 2) + (var2 - 30), var3 - di.field_i[0].field_w / 2);
          di.field_i[2].f(var2 - di.field_i[0].field_z / 2, -(di.field_i[0].field_w / 2) + 30 + var3);
        }
    }

    final void a(pf param0, int param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        so var3 = null;
        RuntimeException var3_ref = null;
        float var4_float = 0.0f;
        int var4 = 0;
        float var5_float = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (this.field_x) {
            var3_float = -this.field_k + this.field_f;
            var4_float = -this.field_E + this.field_lb;
            var5_float = -this.field_I + this.field_H;
            stackIn_8_1 = ((1.0f < Math.abs(var3_float))) || ((Math.abs(var4_float) > 1.0f)) || ((Math.abs(var5_float) > 1.0f));
            this.field_x = stackIn_8_1;
            this.field_I = this.field_I + 0.10000000149011612f * var5_float;
            this.field_E = this.field_E + 0.10000000149011612f * var4_float;
            this.field_k = this.field_k + 0.10000000149011612f * var3_float;
          }
          this.a(false);
          var3 = (so) (this.field_Y.d(0));
          while (var3 != null) {
            fieldTemp$0 = var3.field_u + 1;
            var3.field_u = var3.field_u + 1;
            if (fieldTemp$0 == 130) {
              var3.b((byte) -82);
            }
            var4 = 320;
            var5 = this.field_o.d((byte) 14) / 2;
            var6 = var3.field_h.field_p;
            var7 = this.field_i[var6] - var4;
            var8 = -var5 + this.field_J[var6];
            var9 = (float)Math.sqrt((double)((float)(var7 * var7 + var8 * var8) + this.field_I * this.field_I)) / 300.0f;
            var3.field_i.a((byte) 120, (int)((float)(tf.field_p * pd.field_m.field_a << 6) / (var9 * 96.0f)));
            var3 = (so) (this.field_Y.a((byte) -71));
          }
          this.a(-3, param0);
          this.field_o.h((byte) -26);
          if (param1 <= 43) {
            return;
          }
          qd.field_f = cl.field_n % 64 * 8;
          if (256 < qd.field_f) {
            qd.field_f = -qd.field_f + 512;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("tr.QA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4;
        int var5;
        if (!dp.field_t) {
          return;
        }
        ua.field_f.a(param1, -20429);
        var4 = mr.field_h.f(param2) ? 1 : 0;
        if (je.field_d != 0 &&
          var4 == 0) {
          eo.f(false);
          param1 = false;
        }
        if (param1) {
          mr.field_h.a(param0, param3, (byte) -108);
        }
        if (var4 != 0) {
          ua.field_f.a(param1, -20429);
        }
        var5 = mr.field_h.g(false) + mr.field_h.field_B;
        if (var5 > 640) {
          jj.field_m = jj.field_m + 5;
        } else {
          if (var5 < 635 &&
            jj.field_m > 0) {
            jj.field_m = jj.field_m - 5;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var14_int = 0;
        bi stackIn_6_0 = null;
        bi stackIn_9_0 = null;
        fs stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        fs[] stackIn_25_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int[] stackIn_53_1 = null;
        int stackIn_54_2 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_58_1 = 0;
        vn var4;
        int var5;
        ln var6;
        int var7;
        int var8;
        int var9;
        int var10;
        bi var11;
        fs[] var12;
        int var12_int;
        fs[] var14;
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
        int[] var27;
        int var28;
        fs var29;
        bi var30;
        bi var31;
        int var18Lifetime1;
        int var24Lifetime1;
        bi var11Lifetime1;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = -44 % ((-22 - param0) / 54);
        var4 = (vn) (this.field_m.d(0));
        while (var4 != null) {
          var6 = var4.field_o;
          var7 = var6.field_p;
          var8 = 20;
          if (1024.0f > this.field_I) {
            stackIn_12_0 = this.field_Z[var6.field_p];
            if (stackIn_12_0 == null) {
              stackIn_15_0 = 4210752;
            } else {
              stackIn_15_0 = this.field_Z[var6.field_p].field_g;
            }
            qc.a(stackIn_15_0, 18117, this.field_D[var6.field_p], 160);
            var12 = new fs[var4.field_q.length];
            var27 = new int[var4.field_q.length];
            for (var14_int = 0; var14_int < var12.length; var14_int++) {
              stackIn_19_0 = var27;
              stackIn_19_1 = var14_int;
              if (null != var4.field_q[var14_int]) {
                stackIn_20_2 = var4.field_m[var14_int];
              } else {
                stackIn_20_2 = var4.field_m[-1 + var4.field_m.length];
              }
              stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              var12[var14_int] = var4.field_q[var14_int];
            }
            ak.a(var27, -65, var12);
            var14 = new fs[var12.length];
            var15 = (-1 + var14.length) / 2;
            var14[var15] = var12[0];
            var16 = 1;
            var17 = 1;
            for (var18 = 1; var12.length > var18; var18++) {
              stackIn_25_0 = var14;
              if (var16 == 0) {
                stackIn_26_1 = -var17;
              } else {
                stackIn_26_1 = var17;
              }
              stackIn_25_0[stackIn_26_1 + var15] = var12[var18];
              if (var16 == 0) {
                var17++;
              }
              stackIn_32_0 = (var16 != 0) ? 0 : 1;
              var16 = stackIn_32_0;
            }
            var18Lifetime1 = (int)(this.field_wb * 200.0);
            var19 = (int)(345.0 * this.field_wb);
            if (var19 > 30 * var12.length) {
              var19 = 30 * var12.length;
            }
            var20 = -(var19 / 2) + this.field_i[var6.field_p];
            var21 = 5;
            stackIn_38_0 = (this.field_I < 700.0f) ? 10 : 0;
            var22 = stackIn_38_0;
            gf.a(-2 + var20, -(var18Lifetime1 / 2) + this.field_J[var6.field_p] - 5, 4 + var19, 10 + var18Lifetime1 + var22, var21, 0, 128);
            var19 = var19 / var12.length;
            var23 = (int)((double)this.field_J[var6.field_p] + 0.5 * (double)var18Lifetime1);
            for (var24 = 0; var14.length > var24; var24++) {
              this.a(var14[var24], var23, var19, var18Lifetime1, 121, var20 + var24 * var19, var4);
            }
            if (this.field_I < 700.0f) {
              var28 = 0;
              var24Lifetime1 = var28;
              while (var28 < var14.length) {
                if (null == var14[var28]) {
                  stackIn_47_0 = var4.field_v[-1 + var4.field_v.length];
                } else {
                  stackIn_47_0 = var4.field_v[var14[var28].field_x];
                }
                var25 = stackIn_47_0;
                if (var14[var28] == var4.field_k) {
                  var25 = var25 + var4.field_n;
                }
                if (var14[var28] == var4.field_l) {
                  stackIn_53_0 = ~var25;
                  stackIn_53_1 = var4.field_m;
                  if (null != var14[var28]) {
                    stackIn_54_2 = var14[var28].field_x;
                  } else {
                    stackIn_54_2 = var4.field_v.length - 1;
                  }
                  if (stackIn_53_0 > ~stackIn_53_1[stackIn_54_2]) {
                    stackIn_57_0 = var4.field_v;
                    if (null != var4.field_k) {
                      stackIn_58_1 = var4.field_k.field_x;
                    } else {
                      stackIn_58_1 = var4.field_v.length - 1;
                    }
                    if (stackIn_57_0[stackIn_58_1] > 0) {
                      var25++;
                    }
                  }
                }
                rs.field_Cb.c(Integer.toString(var25), var19 / 2 + var20 + var19 * var28, rs.field_Cb.field_J / 2 + 5 + var23, 16777215, -1);
                var28++;
              }
            }
          } else {
            var10 = -(var8 >> 1) + this.field_J[var7];
            var12_int = this.field_t / 20 % var4.field_q.length;
            var9 = this.field_i[var7] - (var8 >> 1);
            var29 = var4.field_q[var12_int];
            if (var29 != null) {
              stackIn_6_0 = var29.field_e;
            } else {
              stackIn_6_0 = wa.field_b;
            }
            var30 = stackIn_6_0;
            var11 = var30;
            var30.c(-1 + var9, -1 + var10, var8, var8);
            if (var4.field_j != null) {
              stackIn_9_0 = var4.field_j.field_o;
            } else {
              stackIn_9_0 = fm.field_b;
            }
            var31 = stackIn_9_0;
            var11Lifetime1 = var31;
            var31.f(-1 - (var31.field_z >> 1) + (var8 + var9), -(var31.field_w >> 1) + (var8 + var10 - 1));
          }
          var4 = (vn) (this.field_m.a((byte) -71));
        }
    }

    private final void a(ln param0, byte param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 < 91) {
            return;
          }
          var3_int = 0;
          var4 = 0;
          if (1024.0f < this.field_I) {
            var4 = 1;
            var3_int = 1;
          }
          var5 = (cl.field_n + 5 * param0.field_p) % 104;
          if (param0.field_B != 6 &&
            param0.field_B != 7 &&
            param0.field_B != 8) {
            if (4 == param0.field_B) {
              var6 = this.field_Kb[0].field_o;
              qa.field_p[0].b(this.field_i[param0.field_p] - (var6 / 2 + var3_int), -(var6 / 2) + this.field_J[param0.field_p] - var4, var6, var6);
              if (4 < var5) {
                if (var5 > 48) {
                  return;
                }
                this.field_Kb[var5 / 4].c(-var3_int - var6 / 2 + this.field_i[param0.field_p], -var4 + (-(var6 / 2) + this.field_J[param0.field_p]), 128);
              }
              return;
            }
            var6Lifetime2 = this.field_Mb[0].field_o;
            qk.field_y[0].b(-var3_int - var6Lifetime2 / 2 + this.field_i[param0.field_p], -var4 - var6Lifetime2 / 2 + this.field_J[param0.field_p], var6Lifetime2, var6Lifetime2);
            if (var5 > 4) {
              if (var5 > 48) {
                return;
              }
              this.field_Mb[var5 / 4].c(-var3_int - var6Lifetime2 / 2 + this.field_i[param0.field_p], this.field_J[param0.field_p] - var6Lifetime2 / 2 - var4, 128);
            }
            return;
          }
          var6Lifetime1 = this.field_xb[0].field_o;
          ge.field_k[0].b(-var3_int + (this.field_i[param0.field_p] - var6Lifetime1 / 2), -var4 + this.field_J[param0.field_p] - var6Lifetime1 / 2, var6Lifetime1, var6Lifetime1);
          if (4 < var5 &&
            var5 <= 48) {
            this.field_xb[var5 / 4].c(-var3_int - var6Lifetime1 / 2 + this.field_i[param0.field_p], -(var6Lifetime1 / 2) + this.field_J[param0.field_p] - var4, 128);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("tr.JA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, ln param1, int param2) {
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        Object var6 = null;
        mg var6_ref = null;
        int var7 = 0;
        ln var7_ref_ln = null;
        boolean[] var8 = null;
        int var8_int = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10_int = 0;
        ln var10 = null;
        ln var11 = null;
        double var11_double = 0.0;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        double var13_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        int var28 = 0;
        int var29 = 0;
        double var30_double = 0.0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int[] var34 = null;
        boolean[] var35 = null;
        int[] var36 = null;
        boolean[] var37 = null;
        mg var6_refLifetime1;
        mg var6_refLifetime2;
        int var10_intLifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        double var22Lifetime1;
        double var24Lifetime1;
        double var26Lifetime1;
        int var15Lifetime2;
        int var16Lifetime2;
        int var17Lifetime2;
        var6 = null;
        var32 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4_int = -58 % ((22 - param2) / 61);
          if (this.field_I > 1024.0f) {
            var5_ref_int__ = new int[]{-14671840, -12566464, -10461088, -8355712};
            var6_ref = (mg) (param1.field_s.c(-128));
            while (var6_ref != null) {
              var7_ref_ln = var6_ref.field_y;
              var8_int = var7_ref_ln.field_p;
              var9_int = param1.field_p;
              var10_int = this.field_i[var8_int];
              var11_int = this.field_J[var8_int];
              var12 = this.field_i[var9_int];
              var13 = this.field_J[var9_int];
              var14 = (int)Math.sqrt((double)((var12 - var10_int) * (var12 - var10_int) + (-var11_int + var13) * (-var11_int + var13))) + 1;
              for (var15 = cl.field_n / 2 % 10; var14 > var15; var15 += 10) {
                var16 = (1 + 2 * (var15 * (var12 - var10_int))) / (var14 * 2) + var10_int;
                var17 = var11_int + (var15 * 2 * (var13 - var11_int) + 1) / (var14 * 2);
                gf.b(var16 << 4, var17 << 4, 30, 3, var5_ref_int__);
              }
              var15Lifetime2 = (var10_int + var12) / 2;
              var16Lifetime2 = (var11_int + var13) / 2;
              gf.c(var15Lifetime2, var16Lifetime2 - 1, 9, 16777215, 192);
              rs.field_Cb.c(Integer.toString(var6_ref.field_z), var15Lifetime2, 3 + var16Lifetime2, 0, -1);
              if (var6_ref == this.field_rb) {
                var17Lifetime2 = (var10_int + var12) / 2;
                var18 = (var13 + var11_int) / 2;
                this.field_ub[0] = var17Lifetime2;
                this.field_ub[1] = var18;
                if (this.field_rb == this.field_Db) {
                  this.field_tb[0] = var17Lifetime2;
                  this.field_tb[1] = var18;
                }
              }
              var6_ref = (mg) (param1.field_s.b(32));
            }
            return;
          }
          var5 = 0;
          var6_refLifetime1 = (mg) (param1.field_s.c(-127));
          while (var6_refLifetime1 != null) {
            if (this.field_B == var6_refLifetime1.field_G) {
              var5++;
            }
            var6_refLifetime1 = (mg) (param1.field_s.b(32));
          }
          if (0 == var5) {
            return;
          }
          if (!(330.0f > this.field_I)) {
            var7 = (1 + (var5 - 1) / 12) * 12;
          } else {
            var7 = 12 * (1 + (-1 + var5) / 11);
          }
          var37 = new boolean[var7];
          var35 = var37;
          var8 = var35;
          var36 = new int[2 * var7];
          var34 = var36;
          var9 = var34;
          var33 = 0;
          var10_intLifetime1 = var33;
          while (var7 > var33) {
            var11_double = 3.141592653589793 * (double)(var33 * 2) / (double)var7;
            if (330.0f > this.field_I &&
              var11_double >= 4.4505895925855405 &&
              4.97418836818384 >= var11_double) {
              var8[var33] = true;
              var9[2 * var33] = -1;
              var9[1 + var33 * 2] = -1;
            }
            var13_double = Math.sin(var11_double);
            var15_double = Math.cos(var11_double);
            var9[2 * var33] = this.field_i[param1.field_p] + (int)(var15_double * (150.0 * this.field_wb));
            var9[1 + 2 * var33] = this.field_J[param1.field_p] + (int)(150.0 * this.field_wb * var13_double);
            var33++;
          }
          var6_refLifetime2 = (mg) (param1.field_s.c(-128));
          while (var6_refLifetime2 != null) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_B == var6_refLifetime2.field_G) {
              var10 = var6_refLifetime2.field_y;
              var11 = var6_refLifetime2.field_B;
              var12Lifetime1 = var10.field_p;
              var13Lifetime1 = var11.field_p;
              var14Lifetime1 = this.field_i[var12Lifetime1];
              var15Lifetime1 = this.field_J[var12Lifetime1];
              var16Lifetime1 = this.field_i[var13Lifetime1];
              var17Lifetime1 = this.field_J[var13Lifetime1];
              var22 = Math.sqrt((double)((var16Lifetime1 - var14Lifetime1) * (-var14Lifetime1 + var16Lifetime1) + (-var15Lifetime1 + var17Lifetime1) * (var17Lifetime1 - var15Lifetime1)));
              var24 = (double)(-var14Lifetime1 + var16Lifetime1) / var22;
              var20 = -(int)(150.0 * this.field_Jb * var24) + var16Lifetime1;
              var26 = (double)(-var15Lifetime1 + var17Lifetime1) / var22;
              var21 = var17Lifetime1 - (int)(var26 * (150.0 * this.field_Jb));
              var28 = this.a(var20, var36, var37, var15Lifetime1, var26, (byte) -28, var21, var14Lifetime1, var24);
              var20Lifetime1 = var9[2 * var28];
              var21Lifetime1 = var9[2 * var28 + 1];
              var22Lifetime1 = Math.sqrt((double)((var20Lifetime1 - var14Lifetime1) * (-var14Lifetime1 + var20Lifetime1) + (var21Lifetime1 - var15Lifetime1) * (-var15Lifetime1 + var21Lifetime1)));
              var26Lifetime1 = (double)(var21Lifetime1 - var15Lifetime1) / var22Lifetime1;
              var24Lifetime1 = (double)(-var14Lifetime1 + var20Lifetime1) / var22Lifetime1;
              var19 = var15Lifetime1 + (int)((double)this.field_Hb * var26Lifetime1);
              var18Lifetime1 = var14Lifetime1 + (int)((double)this.field_Hb * var24Lifetime1);
              if (var6_refLifetime2 != this.field_rb) {
                var29 = 0;
                if (var24Lifetime1 != 0.0) {
                  if (0.0 != var26Lifetime1) {
                    var30_double = (double)(-var15Lifetime1 + var21Lifetime1);
                    if (0.0 > var30_double) {
                      var30_double = -var30_double;
                    }
                    var29 = (int)(Math.asin(var30_double / var22Lifetime1) * 32768.0 / 3.141592653589793);
                    if (var24Lifetime1 < 0.0) {
                      if (var26Lifetime1 < 0.0) {
                        var29 = -var29 + 32768;
                      } else {
                        var29 = var29 + 32768;
                      }
                    } else {
                      if (0.0 < var26Lifetime1) {
                        var29 = -var29 + 65536;
                      }
                    }
                  } else {
                    var29 = (0.0 < var24Lifetime1) ? 0 : 32768;
                  }
                } else {
                  var29 = (var26Lifetime1 > 0.0) ? 49152 : 16384;
                }
                if (param0) {
                  if (700.0f > this.field_I &&
                    var7 <= 12) {
                    ie.a((om) (this.field_B.field_n), fj.field_p.field_z << 3, fj.field_p.field_w << 3, 16 * var20Lifetime1, var21Lifetime1 * 16, -16384 + (var29 + 3800), 4096);
                    gf.c(var20Lifetime1, var21Lifetime1, 9, 0, 92);
                    rs.field_Cb.c(Integer.toString(var6_refLifetime2.field_z), var20Lifetime1, 4 + var21Lifetime1, 16777215, -1);
                  } else {
                    gf.b(16 * var20Lifetime1, var21Lifetime1 * 16, 60, -1 + r.field_j.length, new int[]{-65536, -65536, 0, -65536, -65536});
                  }
                  if (700.0f < this.field_I) {
                    var30 = (var20Lifetime1 + var18Lifetime1) / 2;
                    var31 = (var21Lifetime1 + var19) / 2;
                    var30 = var30 - (int)(var26Lifetime1 * (var22Lifetime1 / 10.0));
                    var31 = var31 + (int)(var24Lifetime1 * (var22Lifetime1 / 10.0));
                    rs.field_Cb.c(Integer.toString(var6_refLifetime2.field_z));
                    gf.c(var30, -1 + var31, 9, 16777215, 192);
                    rs.field_Cb.c(Integer.toString(var6_refLifetime2.field_z), var30, 3 + var31, 0, -1);
                  }
                } else {
                  if (var22Lifetime1 <= 1.0 + (0.5 + this.field_Jb * 300.0 - 150.0 * this.field_wb)) {
                    if (0 == var29) {
                      this.field_Cb.f(-this.field_Cb.field_z + (var20Lifetime1 + 4), -4 + var19);
                    } else {
                      if (var29 != 32768) {
                        if (var29 < 16384) {
                          this.field_K.f(4 + (var20Lifetime1 - this.field_K.field_z), -4 + var21Lifetime1);
                        } else {
                          if (16384 < var29 &&
                            var29 < 32768) {
                            this.field_Ob.f(-4 + var20Lifetime1, -4 + var21Lifetime1);
                          } else {
                            if (32768 < var29 &&
                              var29 < 49152) {
                              this.field_K.i(1 + var20Lifetime1 - 4, -this.field_K.field_w + var21Lifetime1 + 5);
                            } else {
                              if (var29 > 49152) {
                                this.field_Ob.i(4 + (-this.field_Ob.field_z + (var20Lifetime1 + 1)), 4 + var21Lifetime1 - (this.field_Ob.field_w - 1));
                              }
                            }
                          }
                        }
                      } else {
                        this.field_Cb.i(var20Lifetime1 - 3, 4 + var19 - this.field_Cb.field_w + 1);
                      }
                    }
                  } else {
                    eo.a(false, var19, var21Lifetime1, (byte) 74, 200, var20Lifetime1, var18Lifetime1);
                  }
                }
              } else {
                if (700.0f > this.field_I &&
                  var7 <= 12) {
                  this.field_ub[1] = var21Lifetime1;
                  this.field_ub[0] = var20Lifetime1;
                  if ((this.field_Db == this.field_rb)) {
                    this.field_tb[0] = var20Lifetime1;
                    this.field_tb[1] = var21Lifetime1;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var29 = (var20Lifetime1 + var18Lifetime1) / 2;
                  var22Lifetime1 = Math.sqrt((double)((-var20Lifetime1 + var18Lifetime1) * (-var20Lifetime1 + var18Lifetime1) + (var19 - var21Lifetime1) * (var19 - var21Lifetime1)));
                  var30 = (var21Lifetime1 + var19) / 2;
                  var29 = (int)((double)var29 + var22Lifetime1 * -var26Lifetime1 / 10.0);
                  var30 = (int)((double)var30 + var22Lifetime1 * var24Lifetime1 / 10.0);
                  this.field_ub[0] = var29;
                  this.field_ub[1] = var30;
                  if (this.field_rb == this.field_Db) {
                    this.field_tb[0] = var29;
                    this.field_tb[1] = var30;
                  }
                }
              }
            }
            var6_refLifetime2 = (mg) (param1.field_s.b(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_87_0 = var4;
          stackIn_87_1 = new StringBuilder().append("tr.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, ln param1, int param2) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fs var7 = null;
        try {
          var7 = this.field_Z[param1.field_p];
          var4 = var7;
          if (var4 != null) {
            stackIn_3_0 = var7.field_s;
          } else {
            stackIn_3_0 = 8421504;
          }
          var5 = stackIn_3_0;
          var5 = ui.a(var5, 0, -80, -(this.field_eb[param1.field_p] * 160 / param2) + 160);
          qc.a(var5, 18117, this.field_D[param1.field_p], 160);
          if (this.field_T == -1) {
            this.a(param1, false);
          }
          this.e(param1, -29952);
          if (param1.field_B >= 6) {
            this.a(-86, param1);
            var6 = rs.field_Cb.c(Integer.toString(this.field_eb[param1.field_p])) + 1;
            if (var6 < 10) {
              var6 = 10;
            }
            gf.c(this.field_i[param1.field_p] - 1, -1 + this.field_J[param1.field_p], var6, 0, 128);
          }
          if (param1.field_I.equalsIgnoreCase("sol")) {
            this.a(-71, param1);
          }
          if (param0 != 11746) {
            this.a((byte) -83, -5, -104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("tr.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, fs[] param1) {
        try {
          this.field_ib = param1;
          if (param0 >= -123) {
            ln var4 = (ln) null;
            this.d((ln) null, -124);
          }
          this.field_cb = new int[this.field_ib.length][];
          this.j(0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tr.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(pf param0, boolean param1, boolean param2, boolean param3) {
        bi stackIn_30_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        as var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        Object var37 = null;
        double var37_double = 0.0;
        om var37_ref = null;
        int var39 = 0;
        double var10Lifetime1;
        int var36Lifetime1;
        var37 = null;
        var39 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (200 < this.field_t) {
            return;
          }
          if (!param3) {
            this.a(75, 11, (byte) -71);
          }
          var5 = (as) (param0.d(0));
          while (var5 != null) {
            var6 = this.field_i[var5.field_q.field_p];
            var7 = this.field_J[var5.field_q.field_p];
            var8 = this.field_i[var5.field_s.field_p];
            var9 = this.field_J[var5.field_s.field_p];
            var10 = Math.sqrt((double)((var6 - var8) * (-var8 + var6) + (var7 - var9) * (var7 - var9)));
            var12 = (double)(var6 - var8) / var10;
            var14 = (double)(-var9 + var7) / var10;
            var16 = (int)(var12 * (double)this.field_Hb) + var8;
            var17 = (int)(var14 * (double)this.field_Hb) + var9;
            var18 = -(int)(var12 * (double)this.field_Hb) + var6;
            var19 = var7 - (int)(var14 * (double)this.field_Hb);
            if (param1) {
              var20 = this.field_t * (-var16 + var18) * 16 / 200 + var16 * 16;
              var21 = (-var17 + var19) * (16 * this.field_t) / 200 + 16 * var17;
              var22 = Math.sqrt((double)((var21 - 16 * var17) * (var21 - var17 * 16) + (var20 - 16 * var16) * (-(16 * var16) + var20)));
              var10Lifetime1 = Math.sqrt((double)((-var17 + var19) * (256 * (-var17 + var19)) + (-var16 + var18) * ((var18 - var16) * 256)));
              var24 = var10Lifetime1 / 2.0;
              var26 = 1.0 / var24;
              var28 = var10Lifetime1 / 10.0 - (var22 - var24) * (-var24 + var22) * var26 * 0.2;
              var30 = (double)((-var19 + var17) * 16);
              var32 = (double)((var16 - var18) * 16);
              var30 = var30 / var10Lifetime1;
              var32 = var32 / var10Lifetime1;
              var34 = var20 + (int)(var28 * var30);
              var35 = -(int)(var32 * var28) + var21;
              var36 = 0;
              if (var12 == 0.0) {
                var36Lifetime1 = (0.0 < var14) ? 49152 : 16384;
              } else {
                if (0.0 == var14) {
                  var36Lifetime1 = (0.0 < var12) ? 0 : 32768;
                } else {
                  var37_double = (double)((var19 - var17) * 16);
                  if (var37_double < 0.0) {
                    var37_double = -var37_double;
                  }
                  var36Lifetime1 = (int)(32768.0 * Math.asin(var37_double / var10Lifetime1) / 3.141592653589793);
                  if (!(var12 < 0.0)) {
                    if (0.0 < var14) {
                      var36Lifetime1 = -var36Lifetime1 + 65536;
                    }
                  } else {
                    if (0.0 > var14) {
                      var36Lifetime1 = -var36Lifetime1 + 32768;
                    } else {
                      var36Lifetime1 = var36Lifetime1 + 32768;
                    }
                  }
                }
              }
              var36Lifetime1 = var36Lifetime1 - 16384;
              var36Lifetime1 = -3800 + (var36Lifetime1 + 7600 * this.field_t / 200);
              if (!param2) {
                stackIn_30_0 = var5.field_m.field_n;
              } else {
                stackIn_30_0 = var5.field_m.field_b;
              }
              var37_ref = (om) (stackIn_30_0);
              ie.a(var37_ref, fj.field_p.field_z << 3, fj.field_p.field_w << 3, var34, var35, var36Lifetime1, 4096);
              gf.c(var34 >> 4, var35 >> 4, 9, 0, 92);
              rs.field_Cb.c(Integer.toString(var5.field_x), var34 >> 4, (var35 >> 4) + 4, 16777215, -1);
            } else {
              eo.a(false, var17, var19, (byte) 99, this.field_t, var18, var16);
            }
            var5 = (as) (param0.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_35_0 = var5_ref;
          stackIn_35_1 = new StringBuilder().append("tr.KB(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        ra.a(-120);
        for (var2 = param0; this.field_ib.length > var2; var2++) {
          var3 = this.field_ib[var2].field_k;
          this.field_ib[var2].field_v = (bi) ((Object) new om(cf.field_F.field_o, cf.field_F.field_p));
          this.field_ib[var2].field_v.e();
          cf.field_F.b(0, 0, var3);
          for (var4 = 0; var4 < cf.field_F.field_B.length; var4++) {
            this.field_ib[var2].field_v.field_B[var4] = we.a(-16777216, cf.field_F.field_B[var4]) + we.a(16777215, this.field_ib[var2].field_v.field_B[var4]);
          }
          this.field_ib[var2].field_n = (bi) ((Object) new om(fj.field_p.field_o, fj.field_p.field_p));
          this.field_ib[var2].field_n.e();
          fj.field_p.d(0, 0, var3);
          for (var4Lifetime1 = 0; var4Lifetime1 < fj.field_p.field_B.length; var4Lifetime1++) {
            this.field_ib[var2].field_n.field_B[var4Lifetime1] = we.a(-16777216, fj.field_p.field_B[var4Lifetime1]) + we.a(this.field_ib[var2].field_n.field_B[var4Lifetime1], 16777215);
          }
          this.field_ib[var2].field_b = (bi) ((Object) new om(eq.field_o.field_o, eq.field_o.field_p));
          this.field_ib[var2].field_b.e();
          eq.field_o.d(0, 0, var3);
          for (var4Lifetime2 = 0; eq.field_o.field_B.length > var4Lifetime2; var4Lifetime2++) {
            this.field_ib[var2].field_b.field_B[var4Lifetime2] = we.a(16777215, this.field_ib[var2].field_b.field_B[var4Lifetime2]) + we.a(eq.field_o.field_B[var4Lifetime2], -16777216);
          }
          this.field_ib[var2].field_o = new bi(10, 12);
          this.field_ib[var2].field_o.e();
          wo.field_b.b(1, 1, var3);
          this.field_ib[var2].field_p = new bi(12, 12);
          this.field_ib[var2].field_p.e();
          oo.field_a.b(1, 1, var3);
          this.field_ib[var2].field_r = new bi(12, 12);
          this.field_ib[var2].field_r.e();
          ab.field_e.b(1, 1, var3);
          this.field_ib[var2].field_e = new bi(128, 128);
          this.field_ib[var2].field_e.e();
          go.field_L.d(0, 0, var3);
          for (var4Lifetime3 = 0; var4Lifetime3 < this.field_ib[var2].field_e.field_B.length; var4Lifetime3++) {
            if (this.field_ib[var2].field_e.field_B[var4Lifetime3] != 0) {
              gf.c(var4Lifetime3 % this.field_ib[var2].field_e.field_z, var4Lifetime3 / this.field_ib[var2].field_e.field_z, this.field_ib[var2].field_k, 128);
              this.field_ib[var2].field_e.field_B[var4Lifetime3] = ee.a(this.field_ib[var2].field_e.field_B[var4Lifetime3], -16777216);
            }
          }
          this.field_ib[var2].field_c = new bi(18, 12);
          this.field_ib[var2].field_c.e();
          bd.field_G.b(1, 1, var3);
          this.field_ib[var2].field_d = new bi(16, 10);
          this.field_ib[var2].field_d.e();
          bd.field_G.b(0, 0, var3);
          this.field_ib[var2].field_o.f(16777215);
          this.field_ib[var2].field_p.f(16777215);
          this.field_ib[var2].field_r.f(16777215);
          this.field_ib[var2].field_c.f(16777215);
          this.field_cb[var2] = new int[256];
          for (var4Lifetime4 = 0; var4Lifetime4 < 256; var4Lifetime4++) {
            var5 = var3 & 16711935;
            var6 = 65280 & var3;
            var5 = var5 * var4Lifetime4;
            var6 = var6 * var4Lifetime4;
            var5 = var5 & -16711936;
            var6 = var6 & 16711680;
            this.field_cb[var2][var4Lifetime4] = ee.a(var6, var5) >>> 8;
          }
        }
        cg.i(0);
    }

    private final void a(boolean param0, ln param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        fs var4 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var3_int = param1.field_p;
          var4 = this.field_Z[var3_int];
          if (var4 != null) {
            if (param1 != this.field_p) {
              this.field_ob.b((int)((double)(this.field_i[var3_int] + 1) - 345.0 * this.field_wb / 2.0), (int)(-(this.field_wb * 400.0 / 2.0) + (double)(this.field_J[var3_int] + 1)), var4.field_s);
              if (this.field_X) {
                if (!tl.field_u) {
                  return;
                }
                this.field_Ib.a((int)((double)(this.field_i[var3_int] + 1) - 345.0 * this.field_wb / 2.0), (int)((double)(this.field_J[var3_int] + 1) - 400.0 * this.field_wb / 2.0), qd.field_f);
              }
            } else {
              this.field_Ib.b((int)(-(345.0 * this.field_wb / 2.0) + (double)(this.field_i[var3_int] + 1)), (int)((double)(this.field_J[var3_int] + 1) - this.field_wb * 400.0 / 2.0), var4.field_s);
            }
          } else {
            if (param1 != this.field_p) {
              this.field_ob.f((int)(-(this.field_wb * 345.0 / 2.0) + (double)(1 + this.field_i[var3_int])), (int)(-(this.field_wb * 400.0 / 2.0) + (double)(1 + this.field_J[var3_int])));
            } else {
              this.field_Ib.f((int)(-(this.field_wb * 345.0 / 2.0) + (double)(1 + this.field_i[var3_int])), (int)(-(400.0 * this.field_wb / 2.0) + (double)(1 + this.field_J[var3_int])));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("tr.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void b(int param0, ln param1) {
        try {
          if (~this.field_T == param0) {
            this.a(param1, false);
          }
          this.a(false, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tr.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int[] param1, boolean[] param2, int param3, double param4, byte param5, int param6, int param7, double param8) {
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var14Lifetime1;
        int var15Lifetime1;
        double var16Lifetime1;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var12_int = -1;
          var13 = 2147483647;
          for (var14 = 0; param2.length > var14; var14++) {
            if (!param2[var14]) {
              var15 = (param6 - param1[var14 * 2 + 1]) * (-param1[2 * var14 + 1] + param6) + (param0 - param1[2 * var14]) * (-param1[var14 * 2] + param0);
              var16 = (-((double)param3 * param8) + (double)param7 * param4 + (double)param1[1 + var14 * 2] * param8 - param4 * (double)param1[var14 * 2]) / (param4 * param4 + param8 * param8);
              if (!(var16 < -2.0) && (var15 < var13 ||
                (double)var15 < 1.0 * (double)var13 &&
                var16 < (-(param8 * (double)param3) + param4 * (double)param7 + param8 * (double)param1[2 * var12_int + 1] - (double)param1[2 * var12_int] * param4) / (param4 * param4 + param8 * param8))) {
                var12_int = var14;
                var13 = var15;
              }
            }
          }
          if (param5 > -14) {
            field_Lb = 34;
          }
          if (var12_int == -1) {
            var19 = 0;
            var14Lifetime1 = var19;
            while (param2.length > var19) {
              if (!param2[var19]) {
                var15Lifetime1 = (-param1[2 * var19] + param0) * (-param1[var19 * 2] + param0) + (param6 - param1[var19 * 2 + 1]) * (-param1[var19 * 2 + 1] + param6);
                var16Lifetime1 = -((double)param1[var19 * 2 + 1] * param8) + param4 * (double)param1[var19 * 2];
                if ((double)var13 * 0.35 > (double)var15Lifetime1 ||
                  1.05 * (double)var13 > (double)var15Lifetime1 &&
                  param4 * (double)param1[2 * var12_int] - param8 * (double)param1[1 + 2 * var12_int] > var16Lifetime1) {
                  var12_int = var19;
                  var13 = var15Lifetime1;
                }
              }
              var19++;
            }
          }
          if (-1 == var12_int) {
            throw new RuntimeException("Unable to anchor incoming fleet.");
          }
          param2[var12_int] = true;
          stackIn_37_0 = var12_int;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_40_0 = var12;
          stackIn_40_1 = new StringBuilder().append("tr.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_S &&
          this.field_Db == this.field_S) {
          if (this.field_yb < 15 &&
            this.field_I < 700.0f) {
            fieldTemp$0 = this.field_yb + 1;
            this.field_yb = this.field_yb + 1;
            if (fieldTemp$0 == 15) {
              this.field_ub[0] = this.field_tb[0];
              this.field_ub[1] = this.field_tb[1];
              this.field_rb = this.field_Db;
            }
          }
        } else {
          if (this.field_yb <= 0) {
            this.field_Db = this.field_S;
            this.field_tb[0] = this.field_nb[0];
            this.field_tb[1] = this.field_nb[1];
          } else {
            fieldTemp$1 = this.field_yb - 1;
            this.field_yb = this.field_yb - 1;
            if (0 == fieldTemp$1) {
              this.field_rb = null;
              this.field_ub[1] = -1;
              this.field_Db = this.field_S;
              this.field_ub[0] = -1;
              this.field_tb[0] = this.field_nb[0];
              this.field_tb[1] = this.field_nb[1];
            }
          }
        }
        if (param2 < 104) {
          field_Fb = (String) null;
        }
    }

    private final void b(ln param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        double var5_double = 0.0;
        ik[] var5 = null;
        int var6 = 0;
        int var9 = 0;
        om var10 = null;
        om var11 = null;
        om var12 = null;
        om var13 = null;
        ik[] var14 = null;
        ik[] var15 = null;
        ik[] var16 = null;
        ik[] var17 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ik[] var5Lifetime1;
        ik[] var5Lifetime2;
        ik[] var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0.field_B != 6 &&
            param0.field_B != 7 &&
            param0.field_B != 8) {
            var3_int = param0.field_p;
            if (!param1) {
              this.field_ub = (int[]) null;
            }
            var4 = 24;
            if (!(this.field_I < 330.0f)) {
              if (this.field_I < 1024.0f) {
                gf.c(this.field_i[var3_int], this.field_J[var3_int], 25, 0, 128);
                if (param0.field_G[0] != 0) {
                  var14 = new ik[2 + 2 * param0.field_G[0]];
                  var5 = var14;
                  var5[0] = el.a(0, this.field_J[var3_int] << 4, this.field_i[var3_int] << 4);
                  var5[1] = el.a(0, this.field_J[var3_int] + var4 / 2 << 4, -(int)((double)var4 * rh.field_e) + this.field_i[var3_int] << 4);
                  for (var6 = 0; param0.field_G[0] > var6; var6++) {
                    var5[2 + 2 * var6] = el.a(0, this.field_J[var3_int] + (int)((double)var4 * Math.sin((double)(24 - 12 * var6) * 3.141592653589793 / 180.0)) << 4, this.field_i[var3_int] - (int)((double)var4 * Math.cos((double)(24 - var6 * 12) * 3.141592653589793 / 180.0)) << 4);
                    var5[var6 * 2 + 2 + 1] = el.a(0, this.field_J[var3_int] + (int)((double)var4 * Math.sin(3.141592653589793 * (double)(-(var6 * 12) + 18) / 180.0)) << 4, this.field_i[var3_int] - (int)((double)var4 * Math.cos(3.141592653589793 * (double)(-(12 * var6) + 18) / 180.0)) << 4);
                  }
                  qn.a(var14, gm.field_k[0], param1);
                }
                if (param0.field_G[1] != 0) {
                  var15 = new ik[2 + 2 * param0.field_G[1]];
                  var5Lifetime1 = var15;
                  var5Lifetime1[0] = el.a(0, this.field_J[var3_int] << 4, this.field_i[var3_int] << 4);
                  var5Lifetime1[1] = el.a(0, var4 + this.field_J[var3_int] << 4, this.field_i[var3_int] << 4);
                  for (var6Lifetime1 = 0; var6Lifetime1 < param0.field_G[1]; var6Lifetime1++) {
                    var5Lifetime1[2 + 2 * var6Lifetime1] = el.a(0, this.field_J[var3_int] + (int)(Math.cos((double)(6 + 12 * var6Lifetime1) * 3.141592653589793 / 180.0) * (double)var4) << 4, this.field_i[var3_int] - (int)((double)var4 * Math.sin((double)(6 + var6Lifetime1 * 12) * 3.141592653589793 / 180.0)) << 4);
                    var5Lifetime1[2 + 2 * var6Lifetime1 + 1] = el.a(0, this.field_J[var3_int] + (int)(Math.cos(3.141592653589793 * (double)(var6Lifetime1 * 12 + 12) / 180.0) * (double)var4) << 4, this.field_i[var3_int] - (int)(Math.sin(3.141592653589793 * (double)(12 + 12 * var6Lifetime1) / 180.0) * (double)var4) << 4);
                  }
                  qn.a(var15, gm.field_k[1], true);
                }
                if (param0.field_G[2] != 0) {
                  var16 = new ik[2 + param0.field_G[2] * 2];
                  var5Lifetime2 = var16;
                  var5Lifetime2[0] = el.a(0, this.field_J[var3_int] << 4, this.field_i[var3_int] << 4);
                  var5Lifetime2[1] = el.a(0, this.field_J[var3_int] + var4 << 4, this.field_i[var3_int] << 4);
                  for (var6Lifetime2 = 0; var6Lifetime2 < param0.field_G[2]; var6Lifetime2++) {
                    var5Lifetime2[var6Lifetime2 * 2 + 2] = el.a(0, this.field_J[var3_int] + (int)(Math.cos((double)(6 + 12 * var6Lifetime2) * 3.141592653589793 / 180.0) * (double)var4) << 4, this.field_i[var3_int] + (int)(Math.sin(3.141592653589793 * (double)(6 + var6Lifetime2 * 12) / 180.0) * (double)var4) << 4);
                    var5Lifetime2[2 + var6Lifetime2 * 2 + 1] = el.a(0, this.field_J[var3_int] + (int)((double)var4 * Math.cos((double)(12 + 12 * var6Lifetime2) * 3.141592653589793 / 180.0)) << 4, this.field_i[var3_int] + (int)((double)var4 * Math.sin((double)(12 + 12 * var6Lifetime2) * 3.141592653589793 / 180.0)) << 4);
                  }
                  qn.a(var16, gm.field_k[2], param1);
                }
                if (param0.field_G[3] != 0) {
                  var17 = new ik[2 * param0.field_G[3] + 2];
                  var5Lifetime3 = var17;
                  var5Lifetime3[0] = el.a(0, this.field_J[var3_int] << 4, this.field_i[var3_int] << 4);
                  var5Lifetime3[1] = el.a(0, var4 / 2 + this.field_J[var3_int] << 4, (int)(rh.field_e * (double)var4) + this.field_i[var3_int] << 4);
                  for (var6Lifetime3 = 0; param0.field_G[3] > var6Lifetime3; var6Lifetime3++) {
                    var5Lifetime3[2 + 2 * var6Lifetime3] = el.a(0, this.field_J[var3_int] + (int)((double)var4 * Math.sin(3.141592653589793 * (double)(-(12 * var6Lifetime3) + 24) / 180.0)) << 4, this.field_i[var3_int] + (int)(Math.cos(3.141592653589793 * (double)(24 - 12 * var6Lifetime3) / 180.0) * (double)var4) << 4);
                    var5Lifetime3[2 + var6Lifetime3 * 2 + 1] = el.a(0, this.field_J[var3_int] + (int)(Math.sin((double)(18 - 12 * var6Lifetime3) * 3.141592653589793 / 180.0) * (double)var4) << 4, this.field_i[var3_int] + (int)((double)var4 * Math.cos(3.141592653589793 * (double)(18 - var6Lifetime3 * 12) / 180.0)) << 4);
                  }
                  qn.a(var17, gm.field_k[3], param1);
                }
              }
            } else {
              var5_double = (double)(this.field_g * (float)this.field_Hb / ((float)this.field_n * this.field_I));
              this.field_qb[0][param0.field_G[0]].b(-(int)(var5_double * 35.0) + this.field_i[var3_int] - this.field_Hb, -((int)(var5_double * (double)this.field_qb[0][0].field_w) / 2) + this.field_J[var3_int], (int)(var5_double * (double)this.field_qb[0][0].field_z), (int)((double)this.field_qb[0][0].field_w * var5_double));
              this.field_qb[1][param0.field_G[1]].b(-(int)(rh.field_e * (var5_double * 32.0)) + (-this.field_Hb + this.field_i[var3_int]), (int)(var5_double * 33.0) + this.field_J[var3_int], (int)(var5_double * (double)this.field_qb[1][0].field_z), (int)(var5_double * (double)this.field_qb[1][0].field_w));
              this.field_qb[2][param0.field_G[2]].b(-2 + (this.field_i[var3_int] - this.field_Hb + (int)(rh.field_e * (62.0 * var5_double))), (int)(33.0 * var5_double) + this.field_J[var3_int], (int)(var5_double * (double)this.field_qb[2][0].field_z), (int)(var5_double * (double)this.field_qb[2][0].field_w));
              this.field_qb[3][param0.field_G[3]].b(this.field_Hb + (this.field_i[var3_int] + (int)(var5_double * 4.0)), -((int)(var5_double * (double)this.field_qb[3][0].field_w) / 2) + this.field_J[var3_int], (int)(var5_double * (double)this.field_qb[3][0].field_z), (int)((double)this.field_qb[3][0].field_w * var5_double));
              if (this.field_X &&
                td.field_L) {
                mj.field_Nb[param0.field_G[0]].b(-(int)(var5_double * 35.0) - this.field_Hb + this.field_i[var3_int], -((int)(var5_double * (double)this.field_qb[0][0].field_w) / 2) + this.field_J[var3_int], (int)((double)this.field_qb[0][0].field_z * var5_double), (int)(var5_double * (double)this.field_qb[0][0].field_w), qd.field_f);
                ts.field_L[param0.field_G[1]].b(this.field_i[var3_int] + (-this.field_Hb - (int)(rh.field_e * (32.0 * var5_double))), this.field_J[var3_int] + (int)(33.0 * var5_double), (int)(var5_double * (double)this.field_qb[1][0].field_z), (int)((double)this.field_qb[1][0].field_w * var5_double), qd.field_f);
                var10 = (om) (ts.field_L[param0.field_G[2]]);
                var11 = var10.h();
                var11.a();
                var11.b((int)(rh.field_e * (var5_double * 62.0)) + (this.field_i[var3_int] - this.field_Hb - 2), this.field_J[var3_int] + (int)(var5_double * 33.0), (int)((double)this.field_qb[2][0].field_z * var5_double), (int)(var5_double * (double)this.field_qb[2][0].field_w), qd.field_f);
                var12 = (om) (mj.field_Nb[param0.field_G[3]]);
                var13 = var12.h();
                var13.a();
                var13.b((int)(var5_double * 4.0) + this.field_i[var3_int] + this.field_Hb, -((int)(var5_double * (double)this.field_qb[3][0].field_w) / 2) + this.field_J[var3_int], (int)(var5_double * (double)this.field_qb[3][0].field_z), (int)((double)this.field_qb[3][0].field_w * var5_double), qd.field_f);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("tr.RA(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(ln param0, int param1) {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        qm[] var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8 = new qm[this.field_s.e(0)];
          var3 = var8;
          if (param1 != 10) {
            this.field_yb = 97;
          }
          this.field_s.a((byte) 76, var3);
          for (var6 = 0; var6 < var8.length; var6++) {
            if (var8[var6].field_q == param0 ||
              var8[var6].field_o == 3 &&
              var8[var6].field_r == param0) {
              var4 = this.field_i[param0.field_p];
              var5 = this.field_J[param0.field_p];
              if (this.field_I < 330.0f) {
                var5 = var5 - (7 * this.field_n / 10 + 44);
              }
              if (var8[var6].field_o != 0) {
                if (var8[var6].field_o != 1) {
                  if (var8[var6].field_o == 2) {
                    var5 -= 24;
                    var4 += 3;
                  } else {
                    var4 += 10;
                    var5 -= 20;
                  }
                } else {
                  var4 -= 5;
                  var5 -= 24;
                }
              } else {
                var4 -= 13;
                var5 -= 21;
              }
              co.field_s.d(var4, var5, gm.field_k[var8[var6].field_o]);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("tr.CB(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        ln[] var4;
        int var5;
        int var6;
        ln var6_ref_ln;
        ln var7;
        int var7_int;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ln[] var13;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        ln[] var4Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        var13 = this.field_O.field_e;
        var4 = var13;
        for (var5 = 0; var5 < var13.length; var5++) {
          boolean decompiledFrameRemainder0 = true;
          var6_ref_ln = var13[var5];
          var7_int = var6_ref_ln.field_p;
          if (this.field_P[var7_int]) {
            if (this.field_B == null) {
              decompiledFrameRemainder0 = (null != var6_ref_ln.field_t);
            } else {
              decompiledFrameRemainder0 = (var6_ref_ln.field_t == this.field_B);
            }
            if (decompiledFrameRemainder0) {
              var8 = this.field_t;
              if (var8 > 125) {
                var8 = -this.field_t + 150;
              }
              if (var8 > 0) {
                var9 = this.field_n;
                if (var9 < 16) {
                  var9 = 16;
                }
                if (var8 < 25) {
                  if (125 >= this.field_t) {
                    re.a(var9, 25, this.field_t, 0, 0);
                  } else {
                    re.a(0, 25, -125 + this.field_t, -var9, 0);
                  }
                  var9 = re.a(var9 / 2, 25, var8, var9, 0);
                }
              }
            }
          }
        }
        var4Lifetime1 = this.field_O.field_e;
        var5Lifetime1 = 0;
        var6 = 12 % ((7 - param2) / 59);
        while (var5Lifetime1 < var4Lifetime1.length) {
          boolean decompiledFrameRemainder1 = true;
          var7 = var4Lifetime1[var5Lifetime1];
          var8Lifetime1 = var7.field_p;
          if (this.field_P[var8Lifetime1]) {
            if (this.field_B != null) {
              decompiledFrameRemainder1 = (var7.field_t == this.field_B);
            } else {
              decompiledFrameRemainder1 = (var7.field_t != null);
            }
            if (decompiledFrameRemainder1) {
              var9Lifetime1 = this.field_t;
              if (var9Lifetime1 > 125) {
                var9Lifetime1 = -this.field_t + 150;
              }
              if (var9Lifetime1 > 0) {
                var10 = 0;
                var11 = this.field_n;
                if (var11 < 16) {
                  var11 = 16;
                }
                if (25 > var9Lifetime1) {
                  if (this.field_t > 125) {
                    var10 = re.a(0, 25, this.field_t - 125, -var11, 0);
                  } else {
                    var10 = re.a(var11, 25, this.field_t, 0, 0);
                  }
                  var11 = re.a(var11 / 2, 25, var9Lifetime1, var11, 0);
                }
                co.field_p[4].b(this.field_i[var8Lifetime1] - var11, -var11 + (this.field_J[var8Lifetime1] + var10), 2 * var11, var11 * 2);
              }
            }
          }
          var5Lifetime1++;
        }
        this.a(this.field_hb, false, true, true);
        this.a(this.field_hb, true, true, true);
    }

    private final void a(ln param0, boolean param1) {
        int stackIn_21_0 = 0;
        boolean stackIn_26_0 = false;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        fs var4 = null;
        mg var5_ref_mg = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        db var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param0.field_p;
          var4 = this.field_Z[var3_int];
          if (var4 == null) {
            var5_ref_mg = (mg) (param0.field_s.c(-127));
            while (var5_ref_mg != null) {
              if (var5_ref_mg.field_G != this.field_B) {
                var5_ref_mg = (mg) (param0.field_s.b(32));
                continue;
              }
              break;
            }
            if (var5_ref_mg != null &&
              null != this.field_B) {
              if (this.field_kb[param0.field_p]) {
                if (!this.field_A[param0.field_p]) {
                  gr.a(64, -59, this.field_D[param0.field_p], 16776960);
                } else {
                  gr.a(64, -86, this.field_D[param0.field_p], 65280);
                }
              } else {
                gr.a(96, -101, this.field_D[param0.field_p], 16711680);
              }
            }
            if (this.field_z[var3_int] == 0) {
              return;
            }
          }
          if (var4 != null) {
            stackIn_21_0 = var4.field_g;
          } else {
            stackIn_21_0 = 3158064;
          }
          var5 = stackIn_21_0;
          if (param1) {
            var9 = (db) null;
            tr.a((byte) 73, (db) null);
          }
          stackIn_26_0 = !param1;
          var11 = qp.a(stackIn_26_0, this.field_Qb[param0.field_p]);
          var10 = var11;
          var6 = var10;
          if (var6 != null) {
            if (this.field_z[var3_int] == 1) {
              qc.a(((16711422 & var5) >> 1) + 16384 + ((var5 & 16579836) >> 2), 18117, var11, 192);
            } else {
              if (this.field_z[var3_int] == 2) {
                qc.a((var5 >> 1 & 8355711) + 4210752 + ((var5 & 16579836) >> 2), 18117, var11, 192);
              } else {
                qc.a((9408399 & var5) << 1, 18117, var11, 128);
              }
            }
            if (var4 == this.field_B &&
              this.field_B != null) {
              if (!this.field_kb[param0.field_p]) {
                var7 = 96;
                if (this.field_U[param0.field_p] == 0) {
                  var7 = 192;
                }
                gr.a(var7, -65, var6, 16711680);
              } else {
                if (!this.field_A[param0.field_p]) {
                  var7 = 64;
                  if (this.field_a[param0.field_p] == 0) {
                    var7 = 128;
                  }
                  gr.a(var7, -63, var6, 16776960);
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("tr.WA(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(ln param0, int param1) {
        int var3_int = 0;
        fs var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.field_p;
          var4 = this.field_Z[var3_int];
          if (var4 != null) {
            stackIn_3_0 = var4.field_k;
          } else {
            stackIn_3_0 = 8421504;
          }
          var5 = stackIn_3_0;
          if (param1 != -29496) {
            this.b(88, 27, -65);
          }
          if (!(this.field_I < 330.0f)) {
            if (!(this.field_I < 1024.0f)) {
              return;
            }
            ek.field_z.d(-(ek.field_z.field_z / 2) + this.field_i[param0.field_p], this.field_J[param0.field_p] - ek.field_z.field_w / 2, var5);
            vg.field_t.f(this.field_i[param0.field_p] - vg.field_t.field_z / 2, -3 + this.field_J[param0.field_p] - vg.field_t.field_w / 2);
            rs.field_Cb.c(Integer.toString(this.field_eb[var3_int]), this.field_i[var3_int], this.field_J[var3_int] + 4, 16777215, -1);
            if (param0.field_L > 0 &&
              6 > param0.field_B) {
              gf.b((this.field_i[var3_int] << 4) + em.field_c[0], (this.field_J[var3_int] << 4) + ul.field_Db[0], 50, 7, h.field_s);
              if (param0.field_L == 2) {
                gf.b((this.field_i[var3_int] << 4) + em.field_c[1], ul.field_Db[1] + (this.field_J[var3_int] << 4), 50, 7, h.field_s);
              }
              if (param0.field_L == 3) {
                gf.b(em.field_c[2] + (this.field_i[var3_int] << 4), ul.field_Db[2] + (this.field_J[var3_int] << 4), 50, 7, h.field_s);
                gf.b((this.field_i[var3_int] << 4) + em.field_c[3], (this.field_J[var3_int] << 4) + ul.field_Db[3], 50, 7, h.field_s);
                return;
              }
            }
          } else {
            ek.field_z.d(-(ek.field_z.field_z / 2) + this.field_i[param0.field_p], -(7 * this.field_n / 10) + this.field_J[param0.field_p] - 63, var5);
            if (this.field_X &&
              me.field_j) {
              ek.field_z.a(-(ek.field_z.field_z / 2) + this.field_i[param0.field_p], -(7 * this.field_n / 10) + this.field_J[param0.field_p] - 63, qd.field_f);
            }
            ii.field_y.f(-(ii.field_y.field_z / 2) + this.field_i[param0.field_p], -72 + (-(this.field_n * 7 / 10) + this.field_J[param0.field_p]));
            rs.field_Cb.c(Integer.toString(this.field_eb[var3_int]), this.field_i[var3_int], -41 + this.field_J[var3_int] - 7 * this.field_n / 10, 16777215, -1);
            rs.field_Cb.c(param0.field_I, this.field_i[var3_int], this.field_J[var3_int] - 7 * this.field_n / 10 - 11, 16777215, -1);
            if (param0.field_L > 0 &&
              param0.field_B < 6) {
              gf.b(em.field_c[0] + (this.field_i[var3_int] << 4), (this.field_J[var3_int] - (7 * this.field_n / 10 + 45) << 4) + ul.field_Db[0], 50, 7, h.field_s);
              if (2 == param0.field_L) {
                gf.b(em.field_c[1] + (this.field_i[var3_int] << 4), ul.field_Db[1] + (-45 + this.field_J[var3_int] - this.field_n * 7 / 10 << 4), 50, 7, h.field_s);
              }
              if (param0.field_L != 3) {
                return;
              }
              gf.b(em.field_c[2] + (this.field_i[var3_int] << 4), ul.field_Db[2] + (this.field_J[var3_int] + (-(this.field_n * 7 / 10) - 45) << 4), 50, 7, h.field_s);
              gf.b((this.field_i[var3_int] << 4) + em.field_c[3], ul.field_Db[3] + (this.field_J[var3_int] - 7 * this.field_n / 10 - 45 << 4), 50, 7, h.field_s);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("tr.KA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, pf param1) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        as var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        di var10 = null;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          stackIn_4_0 = (!this.field_o.field_d.f(244874369)) ? 1 : 2;
          var3_int = stackIn_4_0;
          if (param0 >= -100) {
            return;
          }
          for (var4 = this.field_t; this.field_t + var3_int > var4; var4++) {
            var5 = var4 % 20;
            var6 = (as) (param1.d(0));
            while (var6 != null) {
              var7 = (-var6.field_r + var6.field_j << 4) * var4 / 200 + (var6.field_r << 4);
              var8 = (var6.field_n << 4) + (-var6.field_n + var6.field_k << 4) * var4 / 200;
              var9 = var4 * (var6.field_p - var6.field_w) / 200 + var6.field_w;
              var9 = var9 - (200 - var4) * (var4 * var6.field_v) / 40000;
              var6.field_l[var5] = var7;
              var6.field_o[var5] = var8;
              var6.field_u[var5] = var9;
              if (this.field_t == var6.field_z) {
                var10 = new di();
                var10.field_o = var9;
                var10.field_l = var8;
                var10.field_h = var7;
                this.field_V.a((byte) -113, var10);
              }
              var6 = (as) (param1.a((byte) -71));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("tr.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(int param0, pf param1) {
        int fieldTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vn var4 = null;
        int var4_int = 0;
        di var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fs var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln var11 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          stackIn_4_0 = (this.field_o.field_d.f(param0 + 244874372)) ? 2 : 1;
          boolean decompiledFrameRemainder1 = true;
          var3_int = stackIn_4_0;
          if (this.field_T != 0) {
            if (this.field_T == 1) {
              var4 = (vn) (this.field_m.d(0));
              while (var4 != null) {
                while (vc.a((byte) -39, 200 + var4.field_x) >= 200) {
                  this.field_Y.a((byte) -113, new so(var4.field_o));
                }
                boolean decompiledFrameRemainder0 = true;
                if (var4.field_u >= 0) {
                  if (var4.field_u != 0) {
                    L8: while (!(40 > qf.a((byte) 12, 40 + var4.field_u, this.field_l))) {
                      var5 = qf.a((byte) 36, var4.field_u, this.field_l);
                      var6 = 0;
                      while (true) {
                        if (var4.field_q.length <= var6) {
                          continue L8;
                        }
                        var7 = var4.field_q[var6];
                        if (var7 != null) {
                          stackIn_30_0 = var7.field_x;
                        } else {
                          stackIn_30_0 = -1 + var4.field_v.length;
                        }
                        var8 = stackIn_30_0;
                        var9 = var4.field_v[var8];
                        var5 = var5 - var9;
                        if (var5 >= 0) {
                          var6++;
                          continue;
                        }
                        break;
                      }
                      var4.field_v[var8] = var4.field_v[var8] - 1;
                      var4.field_u = var4.field_u - 1;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (vc.a((byte) -39, 10) == 0) {
                      for (var5Lifetime2 = 0; var4.field_q.length > var5Lifetime2; var5Lifetime2++) {
                        var4.field_v[var5Lifetime2] = 0;
                      }
                      var4.field_u = -1;
                    }
                  }
                }
                var4 = (vn) (this.field_m.a((byte) -71));
              }
              if (this.field_t < 200) {
                this.a((byte) -116, this.field_v);
              }
              var5Lifetime1 = 200;
              this.field_t = this.field_t + var3_int;
              if (!(var5Lifetime1 > this.field_t)) {
                this.a(2, param1, false);
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (this.field_T != 2) {
                if (this.field_T == 3) {
                  if (this.field_t < 200) {
                    this.a((byte) -110, this.field_hb);
                  }
                  this.field_t = this.field_t + var3_int;
                  if (this.field_t >= 200) {
                    this.a(-1, param1, false);
                    this.field_o.field_X.d(false);
                    this.field_o.field_X.field_o = da.field_f;
                  }
                }
              } else {
                this.field_t = this.field_t + var3_int;
                if (150 <= this.field_t) {
                  this.a(3, param1, false);
                }
              }
            }
          } else {
            if (this.field_t < 200) {
              this.a((byte) -117, this.field_c);
            }
            if (this.field_W == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = 25 + this.field_W * 125;
            }
            var4_int = stackIn_11_0;
            if (var4_int < 200) {
              var4_int = 200;
            }
            this.field_t = this.field_t + var3_int;
            if (this.field_t >= var4_int) {
              this.a(1, param1, false);
            }
          }
          if (param0 != -3) {
            var11 = (ln) null;
            this.a((ln) null, false);
          }
          var4_ref = (di) (this.field_V.d(0));
          while (var4_ref != null) {
            fieldTemp$0 = var4_ref.field_n + 1;
            var4_ref.field_n = var4_ref.field_n + 1;
            if (fieldTemp$0 == 50) {
              var4_ref.b((byte) -115);
            }
            var4_ref = (di) (this.field_V.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_63_0 = var3;
          stackIn_63_1 = new StringBuilder().append("tr.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    private final void a(fs param0, int param1, int param2, int param3, int param4, int param5, vn param6) {
        int stackIn_3_0 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var21 = null;
        try {
          if (param0 != null) {
            stackIn_3_0 = param0.field_x;
          } else {
            stackIn_3_0 = param6.field_v.length - 1;
          }
          var8_int = stackIn_3_0;
          var9 = param6.field_v[var8_int];
          if (param0 == param6.field_k) {
            var9 = var9 + param6.field_n;
          }
          if (param0 == param6.field_l &&
            var9 < param6.field_m[var8_int]) {
            stackIn_10_0 = param6.field_v;
            if (null == param6.field_k) {
              stackIn_11_1 = this.field_ib.length;
            } else {
              stackIn_11_1 = param6.field_k.field_x;
            }
            if (stackIn_10_0[stackIn_11_1] > 0) {
              var9++;
            }
          }
          var10 = param2 - 2;
          if (var10 > 20) {
            var10 = 20;
          }
          if (param4 <= 104) {
            field_vb = (pf) null;
          }
          var11 = var10 / 2;
          if (var11 > 5) {
            var11 = 5;
          }
          var12 = param3 - var11 * 2;
          var13 = var12 * param6.field_m[var8_int] / param6.field_z;
          if (var13 == 0) {
            var13 = 1;
          }
          var13 = var13 + var11 * 2;
          gf.a(-2 - var10 / 2 + (param2 / 2 + param5), -2 + (param1 - var13), var10 + 4, 4 + var13, 2 + var11, 0);
          if (param0 == null) {
            stackIn_27_0 = 8421504;
          } else {
            stackIn_27_0 = param0.field_k;
          }
          var14 = stackIn_27_0;
          if (param0 == param6.field_j &&
            param6.field_o.field_u) {
            gf.f(-(var10 / 2) + param2 / 2 + param5 - 2, param1 - var13 - 2, 4 + var10, var13 + 4, 2 + var11, gm.field_k[0]);
          } else {
            jq.a(2 + var11, var14, 4 + var10, param1 - var13 - 2, -2 + (param2 / 2 + param5 - var10 / 2), (byte) -126, 4 + var13);
          }
          var15 = var12 * var9 / param6.field_z;
          if (var15 == 0) {
            return;
          }
          var15 = var15 + 2 * var11;
          gf.a(-(var10 / 2) + param5 + param2 / 2, param1 - var15, var10, var15, var11, var14);
          var16 = var15 / 3;
          if (var11 * 2 + 1 > var16) {
            var16 = 1 + var11 * 2;
          }
          gf.b(-(var10 / 2) + (param2 / 2 + param5), -var15 + param1, var10, var16, var11, 0, var14);
          var21 = new int[4];
          gf.a(var21);
          gf.d(param5 - (-(param2 / 2) + var10 / 2), param1 - var13, param2 / 2 + (param5 + var10 / 2), param1);
          ie.a(ii.field_q, param5 + (param2 / 2 - var10 / 2), -var13 + param1);
          gf.b(var21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_39_0 = var8;
          stackIn_39_1 = new StringBuilder().append("tr.AB(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final void a(pf param0, pf param1, boolean param2, int param3, boolean param4, el param5) {
        om var15 = null;
        om var8_ref_om = null;
        int var12 = 0;
        int var13 = 0;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = ShatteredPlansClient.field_F ? 1 : 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        this.field_s = param1;
        this.field_mb = param0;
        ai.a(true);
        if (sm.field_e) {
          if (cl.field_n - this.field_L > 30) {
            if (null == this.field_gb) {
              this.field_gb = new bi(640, 480);
            }
            bs.a(this.field_gb, 78);
          } else {
            if (this.field_gb != null) {
              this.field_gb.c(0, 0);
              return;
            }
          }
        }
        try {
          if (this.field_Nb != this.field_wb) {
            this.field_Nb = this.field_wb;
            ra.a(-122);
            var15 = new om(10, (int)(this.field_wb * 200.0));
            var15.e();
            for (var9 = 0; var9 < 10; var9++) {
              var10 = 16777215 - 218103808 * var9 - 2113929216;
              gf.j(var9, 0, 200, var10);
            }
            var8_ref_om = new om(15, (int)(200.0 * this.field_wb));
            var8_ref_om.e();
            for (var9Lifetime1 = 0; var9Lifetime1 < 15; var9Lifetime1++) {
              var10Lifetime1 = 16777215 + 285212672 * (-var9Lifetime1 + 15);
              gf.j(var9Lifetime1, 0, 200, var10Lifetime1);
            }
            var9Lifetime2 = (int)(0.5 + 345.0 * this.field_wb);
            var10Lifetime2 = (int)(400.0 * this.field_wb + 0.5);
            this.field_ob = new om(var9Lifetime2, var10Lifetime2);
            this.field_ob.e();
            var15.f(0, (int)(this.field_wb * 100.0 + 0.5));
            var15.h(-10 + var9Lifetime2, (int)(100.0 * this.field_wb + 0.5));
            var15.a(15, -5 + var10Lifetime2 - (int)(100.0 * this.field_wb * 0.5 + 0.5), 4096, (int)(this.field_wb * 100.0 * rh.field_e) + 3, 10923);
            var15.a(15, -5 - (int)(0.5 + 0.5 * (this.field_wb * 100.0)) + var10Lifetime2, 4096, -3 + var9Lifetime2 - (int)(100.0 * this.field_wb * rh.field_e), 21845);
            var15.a(15, 4 + (int)(0.5 * (this.field_wb * 100.0)), 4096, -3 + (var9Lifetime2 - (int)(rh.field_e * (100.0 * this.field_wb))), 43691);
            var15.a(15, 4 + (int)(100.0 * this.field_wb * 0.5), 4096, (int)(this.field_wb * 100.0 * rh.field_e) + 3, 54613);
            this.field_Ib = new om(var9Lifetime2, var10Lifetime2);
            this.field_Ib.e();
            var8_ref_om.f(0, (int)(0.5 + this.field_wb * 100.0));
            var8_ref_om.h(var9Lifetime2 - 15, (int)(0.5 + this.field_wb * 100.0));
            var8_ref_om.a(15, -7 - (int)(0.5 * (100.0 * this.field_wb) + 0.5) + var10Lifetime2, 4096, (int)(rh.field_e * (this.field_wb * 100.0)) + 3, 10923);
            var8_ref_om.a(param3 - 12099, var10Lifetime2 - ((int)(0.5 + 0.5 * (this.field_wb * 100.0)) + 7), 4096, -5 - (int)(rh.field_e * (100.0 * this.field_wb)) + var9Lifetime2, 21845);
            var8_ref_om.a(15, (int)(0.5 * (this.field_wb * 100.0)) + 6, 4096, -5 + var9Lifetime2 - (int)(rh.field_e * (this.field_wb * 100.0)), 43691);
            var8_ref_om.a(15, (int)(0.5 * (this.field_wb * 100.0)) + 6, 4096, (int)(rh.field_e * (this.field_wb * 100.0)) + 3, 54613);
            cg.i(0);
            for (var11 = 0; var10Lifetime2 * var9Lifetime2 > var11; var11++) {
              this.field_ob.field_B[var11] = ee.a(16777215, this.field_ob.field_B[var11] << 8);
              this.field_Ib.field_B[var11] = ee.a(16777215, this.field_Ib.field_B[var11] << 8);
            }
            var11Lifetime1 = -this.field_Hb - (int)(150.0 * this.field_wb) + (int)(300.0 * this.field_Jb + 0.5);
            this.field_Cb = new om(var11Lifetime1 + 4, var11Lifetime1 / 10 + 8);
            this.field_K = new om((int)(4.0 + (double)var11Lifetime1 * 0.5), (int)(4.0 + rh.field_e * (double)var11Lifetime1));
            this.field_Ob = new om((int)(4.0 + (double)var11Lifetime1 * 0.5), (int)(4.0 + rh.field_e * (double)var11Lifetime1));
            ra.a(-113);
            this.field_Cb.e();
            eo.a(true, 4, 4, (byte) 115, 200, var11Lifetime1, 0);
            this.field_K.e();
            eo.a(true, this.field_K.field_w - 1, 4, (byte) 77, 200, var11Lifetime1 / 2, 0);
            this.field_Ob.e();
            eo.a(true, this.field_K.field_w - 1, 4, (byte) -35, 200, 4, -1 + this.field_Ob.field_z);
            cg.i(0);
            if (this.field_xb == null) {
              this.field_xb = new bi[13];
              this.field_Mb = new bi[13];
              this.field_Kb = new bi[13];
            }
            ra.a(-125);
            for (var12 = 0; var12 < this.field_xb.length; var12++) {
              var13 = (int)(this.field_Jb * (double)ge.field_k[var12].field_o);
              if (!(var13 >= 20 + vg.field_t.field_w)) {
                var13 = vg.field_t.field_w + 20;
              }
              if (this.field_I > 1024.0f &&
                (double)var13 > 345.0 * this.field_wb * 0.9) {
                var13 = (int)(this.field_wb * 345.0 * 0.9);
              }
              this.field_xb[var12] = new bi(var13, var13);
              this.field_xb[var12].e();
              ge.field_k[var12].b(0, 0, var13, var13);
              var13Lifetime1 = (int)(0.8 * (this.field_Jb * (double)qa.field_p[var12].field_o));
              if (!(var13Lifetime1 >= 20 + vg.field_t.field_w)) {
                var13Lifetime1 = vg.field_t.field_w + 20;
              }
              if (this.field_I > 1024.0f &&
                0.9 * (this.field_wb * 345.0) < (double)var13Lifetime1) {
                var13Lifetime1 = (int)(0.9 * (345.0 * this.field_wb));
              }
              this.field_Kb[var12] = new bi(var13Lifetime1, var13Lifetime1);
              this.field_Kb[var12].e();
              qa.field_p[var12].b(0, 0, var13Lifetime1, var13Lifetime1);
              var13Lifetime2 = (int)(this.field_Jb * (double)qk.field_y[var12].field_o);
              if (!(var13Lifetime2 >= 20 + vg.field_t.field_w)) {
                var13Lifetime2 = vg.field_t.field_w + 20;
              }
              if (1024.0f < this.field_I &&
                this.field_wb * 345.0 * 0.9 < (double)var13Lifetime2) {
                var13Lifetime2 = (int)(this.field_wb * 345.0 * 0.9);
              }
              this.field_Mb[var12] = new bi(var13Lifetime2, var13Lifetime2);
              this.field_Mb[var12].e();
              qk.field_y[var12].b(0, 0, var13Lifetime2, var13Lifetime2);
            }
            cg.i(0);
          }
          this.b(-94);
          if (param3 != 12114) {
            this.field_Bb = true;
          }
          this.f(29201);
          this.d(true);
          if (param2) {
            var7_int = 510 & cl.field_n << 3;
            if (var7_int >= 256) {
              var7_int = -var7_int + 511;
            }
            var8 = 16711680;
            mp.field_b.a("Checksum", 320, 240, var8, -1, var7_int);
            mp.field_b.a("Failure", 320, mp.field_b.field_J + 240, var8, -1, var7_int);
          }
          if (sm.field_e) {
            this.field_L = cl.field_n;
            cg.i(param3 - 12114);
            this.field_gb.c(0, 0);
          }
          this.field_o.l(123);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "tr.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var5 = 0;
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int[] dupTemp$5 = null;
        int[] dupTemp$6 = null;
        int[] dupTemp$7 = null;
        int[] dupTemp$8 = null;
        int[] dupTemp$9 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        super.a(param0);
        this.field_Hb = this.field_n;
        if (!(vg.field_t.field_z / 2 <= this.field_Hb)) {
          this.field_Hb = vg.field_t.field_z / 2;
        }
        this.field_Jb = (double)(this.field_g / this.field_I);
        if (700.0f < this.field_I) {
          this.field_Hb = this.field_n;
        }
        this.field_wb = this.field_Jb * 0.8;
        if (this.field_Qb == null ||
          this.field_Qb.length < this.field_O.field_e.length) {
          this.field_Qb = (int[][]) ((Object) this.field_D.clone());
        }
        float var2 = 10.0f;
        var2 = var2 * (300.0f / this.field_I);
        float var3 = (float)(rh.field_e * (double)var2);
        float var4 = (float)(0.5 * (double)var2);
        for (var5 = 0; var5 < this.field_Qb.length; var5++) {
          dupTemp$0 = this.field_Qb[var5];
          dupTemp$0[1] = (int)((float)dupTemp$0[1] + var2);
          dupTemp$1 = this.field_Qb[var5];
          dupTemp$1[2] = (int)((float)dupTemp$1[2] - var3);
          dupTemp$2 = this.field_Qb[var5];
          dupTemp$2[3] = (int)((float)dupTemp$2[3] + var4);
          dupTemp$3 = this.field_Qb[var5];
          dupTemp$3[4] = (int)((float)dupTemp$3[4] - var3);
          dupTemp$4 = this.field_Qb[var5];
          dupTemp$4[5] = (int)((float)dupTemp$4[5] - var4);
          dupTemp$5 = this.field_Qb[var5];
          dupTemp$5[7] = (int)((float)dupTemp$5[7] - var2);
          dupTemp$6 = this.field_Qb[var5];
          dupTemp$6[8] = (int)((float)dupTemp$6[8] + var3);
          dupTemp$7 = this.field_Qb[var5];
          dupTemp$7[9] = (int)((float)dupTemp$7[9] - var4);
          dupTemp$8 = this.field_Qb[var5];
          dupTemp$8[10] = (int)((float)dupTemp$8[10] + var3);
          dupTemp$9 = this.field_Qb[var5];
          dupTemp$9[11] = (int)((float)dupTemp$9[11] + var4);
        }
    }

    private final mg c(int param0, int param1, byte param2) {
        int var6 = 0;
        mg var4;
        ln[] var5;
        ln var7;
        int var8;
        mg var4Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_Ab = false;
        this.field_Gb = false;
        this.field_Bb = false;
        if (this.field_rb != null) {
          if (di.field_i[0].field_z * di.field_i[0].field_z / 4 > (-this.field_ub[0] - (-30 - param1)) * (param1 - (this.field_ub[0] - 30)) + (param0 - this.field_ub[1]) * (-this.field_ub[1] + param0)) {
            this.field_Gb = true;
            return this.field_rb;
          }
          if (di.field_i[0].field_z * di.field_i[0].field_z / 4 > (param1 - 30 - this.field_ub[0]) * (-30 - this.field_ub[0] + param1) + (param0 - this.field_ub[1]) * (-this.field_ub[1] + param0)) {
            this.field_Ab = true;
            return this.field_rb;
          }
          if ((-30 - this.field_ub[1] + param0) * (-30 - this.field_ub[1] + param0) + (-this.field_ub[0] + param1) * (-this.field_ub[0] + param1) < di.field_i[0].field_z * di.field_i[0].field_z / 4) {
            this.field_Bb = true;
            return this.field_rb;
          }
          if ((-this.field_ub[1] + param0) * (-this.field_ub[1] + param0) + (param1 - this.field_ub[0]) * (-this.field_ub[0] + param1) < 900) {
            return this.field_rb;
          }
        }
        if (param2 < 99) {
          tr.a(43, true, true, 77);
        }
        if (null != this.field_p) {
          var4 = this.a(this.field_p, param1, param0, -1);
          if (var4 != null) {
            return var4;
          }
        }
        var5 = this.field_O.field_e;
        for (var6 = 0; var6 < var5.length; var6++) {
          var7 = var5[var6];
          var4Lifetime1 = this.a(var7, param1, param0, -1);
          if (var4Lifetime1 != null) {
            return var4Lifetime1;
          }
        }
        return null;
    }

    private final void b(int param0, int param1, byte param2) {
        es var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        es var4Lifetime1;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (es) (this.field_ab.d(0));
        while (var4 != null) {
          var5 = -(var4.field_k * 125) + this.field_t;
          if (var5 > 0 &&
            var5 < 150) {
            var6 = var5;
            var7 = var4.field_p.field_p;
            if (var6 > 125) {
              var6 = -var5 + 150;
            }
            var8 = this.field_n;
            if (-1 == var4.field_o) {
              var8 = var8 * (this.field_u + var4.field_h * 3) / this.field_u;
              if (var8 < 12) {
                var8 = 12;
              }
            } else {
              if (var8 < 32) {
                var8 = 32;
              }
            }
            if (25 > var6) {
              if (125 < var5) {
                re.a(0, 25, var5 - 125, -var8, 0);
              } else {
                re.a(var8, 25, var5, 0, 0);
              }
              var8 = re.a(var8 / 2, 25, var6, var8, 0);
            }
            qc.a(0, 18117, this.field_D[var7], 64);
          }
          var4 = (es) (this.field_ab.a((byte) -71));
        }
        var4Lifetime1 = (es) (this.field_ab.d(0));
        if (param2 < 65) {
          return;
        }
        while (var4Lifetime1 != null) {
          var5Lifetime1 = this.field_t - 125 * var4Lifetime1.field_k;
          if (0 < var5Lifetime1 &&
            var5Lifetime1 < 150) {
            var6Lifetime1 = var5Lifetime1;
            if (var6Lifetime1 > 125) {
              var6Lifetime1 = -var5Lifetime1 + 150;
            }
            var7Lifetime1 = var4Lifetime1.field_p.field_p;
            var8Lifetime1 = this.field_n;
            if (-1 == var4Lifetime1.field_o) {
              var8Lifetime1 = var8Lifetime1 * (this.field_u + var4Lifetime1.field_h * 3) / this.field_u;
              if (var8Lifetime1 < 12) {
                var8Lifetime1 = 12;
              }
            } else {
              if (var8Lifetime1 < 32) {
                var8Lifetime1 = 32;
              }
            }
            var9 = 0;
            if (var6Lifetime1 < 25) {
              if (var5Lifetime1 <= 125) {
                var9 = re.a(var8Lifetime1, 25, var5Lifetime1, 0, 0);
              } else {
                var9 = re.a(0, 25, -125 + var5Lifetime1, -var8Lifetime1, 0);
              }
              var8Lifetime1 = re.a(var8Lifetime1 / 2, 25, var6Lifetime1, var8Lifetime1, 0);
            }
            if (var4Lifetime1.field_o != -1) {
              co.field_p[var4Lifetime1.field_o].b(-var8Lifetime1 + this.field_i[var7Lifetime1], this.field_J[var7Lifetime1] + var9 - var8Lifetime1, var8Lifetime1 * 2, var8Lifetime1 * 2);
            } else {
              if (var4Lifetime1.field_i != null) {
                var4Lifetime1.field_i.field_d.a(15, var9 + this.field_J[var7Lifetime1], 4096 * var8Lifetime1 / bd.field_G.field_z, this.field_i[var7Lifetime1], this.field_t % 25 * 200);
              }
            }
          }
          var4Lifetime1 = (es) (this.field_ab.a((byte) -71));
        }
    }

    private final void a(int param0, int param1, int param2) {
        mg discarded$0 = null;
        if (param2 != 150) {
          discarded$0 = this.c(112, 127, (byte) 21);
        }
        this.a(this.field_v, false, true, true);
        this.a(this.field_v, true, true, true);
    }

    private final void d(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        int var3;
        int var4;
        so var5;
        di var6;
        int var6_int;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var3Lifetime1;
        int var4Lifetime1;
        int var7Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          this.b((byte) 104);
        }
        var2 = this.field_o.d((byte) 14) >> 1;
        var5 = (so) (this.field_Y.d(0));
        while (var5 != null) {
          if (6 <= var5.field_u) {
            stackIn_7_0 = -(var5.field_u * 2) + 260;
          } else {
            stackIn_7_0 = 40 * var5.field_u;
          }
          var6_int = stackIn_7_0;
          var7 = var5.field_h.field_p;
          var3 = (var5.field_p * this.field_n >> 10) + (this.field_i[var7] << 4);
          var4 = (var5.field_n * this.field_n >> 10) + (this.field_J[var7] << 4);
          gf.b(var3, var4, this.field_n + 4 << 1, var6_int, vj.field_F);
          var5 = (so) (this.field_Y.a((byte) -71));
        }
        var6 = (di) (this.field_V.d(0));
        while (var6 != null) {
          var3Lifetime1 = var6.field_h - (int)(16.0f * this.field_k);
          var4Lifetime1 = -(int)(16.0f * this.field_E) + var6.field_l;
          if (var6.field_n >= 10) {
            stackIn_13_0 = 320 - 320 * var6.field_n / 50;
          } else {
            stackIn_13_0 = (var6.field_n << 8) * 5 / 50;
          }
          var7Lifetime1 = stackIn_13_0;
          var8 = (int)((float)var3Lifetime1 * (300.0f / ((float)var6.field_o + this.field_I))) + 5120;
          var9 = (int)(300.0f / ((float)var6.field_o + this.field_I) * (float)var4Lifetime1) + (var2 << 4);
          var10 = (int)(32000.0f / (this.field_I + (float)var6.field_o)) + 64;
          if (var10 < 400) {
            gf.b(var8, var9, var10, var7Lifetime1, vj.field_F);
          }
          var6 = (di) (this.field_V.a((byte) -71));
        }
        if (this.field_T == 0) {
          this.a(this.field_c, false, false, true);
          this.a(this.field_c, true, false, true);
          this.b(320, var2, (byte) 101);
        } else {
          if (this.field_T != 1) {
            if (this.field_T == 2) {
              this.b(320, var2, 123);
            } else {
              if (this.field_T == 3) {
                this.a(320, var2, (byte) -93);
              }
            }
          } else {
            this.a(var2, 320, 150);
            this.a((byte) 82, var2, 320);
          }
        }
    }

    final void b(byte param0) {
        int var2 = 83 % ((param0 - 16) / 58);
        this.field_tb[0] = this.field_nb[0];
        this.field_tb[1] = this.field_nb[1];
        this.field_rb = this.field_S;
        this.field_Db = this.field_S;
        this.field_yb = 15;
        this.field_ub[1] = this.field_nb[1];
        this.field_ub[0] = this.field_nb[0];
    }

    private final void h(int param0) {
        int var7 = 0;
        int var10 = 0;
        ln stackIn_18_0 = null;
        ln stackIn_18_1 = null;
        int stackIn_37_0 = 0;
        int var2;
        int var3;
        int var4;
        ln[] var5;
        int var6;
        ln var8;
        ln[] var9;
        ln var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        float var19;
        float var20;
        float var21;
        int var22;
        Object var23;
        cs var23_ref;
        ln var24_ref_ln;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        ln var31;
        ln var32;
        var23 = null;
        var30 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 44100;
        var5 = this.field_O.field_e;
        var6 = -7 / ((param0 - 12) / 62);
        for (var7 = 0; var7 < var5.length; var7++) {
          var31 = var5[var7];
          var8 = var31;
          if (var31.field_D != null) {
            var9 = var31.field_D;
            for (var10 = 0; var9.length > var10; var10++) {
              var32 = var9[var10];
              if (var32.field_p >= var8.field_p) {
                var3 = -var32.field_S + var8.field_S;
                var2 = var8.field_A - var32.field_A;
                if (var2 * var2 + var3 * var3 > var4) {
                  var12 = var8.field_p;
                  var13 = this.field_i[var12];
                  var14 = this.field_J[var12];
                  var15 = var32.field_p;
                  var16 = this.field_i[var15];
                  var17 = this.field_J[var15];
                  var18 = (int)(this.field_Jb * 170.0);
                  var19 = (float)(-var13 + var16);
                  var20 = (float)(var17 - var14);
                  var21 = (float)Math.sqrt((double)(var19 * var19 + var20 * var20));
                  var19 = var19 / var21;
                  var20 = var20 / var21;
                  var22 = 128;
                  if (!this.field_X ||
                    !er.field_g) {
                    stackIn_18_0 = this.field_p;
                    stackIn_18_1 = var8;
                    if (stackIn_18_0 == stackIn_18_1 ||
                      var32 == this.field_p) {
                      var22 = (int)((1.0 + Math.cos(3.141592653589793 * (double)(cl.field_n % 50) / 25.0)) * 64.0) + 127;
                    }
                  } else {
                    var22 = (int)((1.0 + Math.cos(3.141592653589793 * (double)(cl.field_n % 50) / 25.0)) * 64.0) + 127;
                  }
                  var23_ref = (cs) (this.field_mb.d(0));
                  while (true) {
                    if (var23_ref != null && (var23_ref.field_n != var8 ||
                      var23_ref.field_k != var32)) {
                      if (var32 == var23_ref.field_n &&
                        var23_ref.field_k == var8) {
                        var24_ref_ln = var8;
                        var8 = var32;
                        var11 = var24_ref_ln;
                      } else {
                        var23_ref = (cs) (this.field_mb.a((byte) -71));
                        continue;
                      }
                    }
                    if (!((float)(var18 * 2) < var21)) {
                      break;
                    }
                    if (var23_ref != null) {
                      stackIn_37_0 = 65537 * var22 + (var22 >> 1) * 256;
                    } else {
                      stackIn_37_0 = var22 * 65793;
                    }
                    var24 = stackIn_37_0;
                    var25 = var13 + (int)((float)var18 * var19);
                    var26 = var14 + (int)(var20 * (float)var18);
                    var27 = var16 - (int)(var19 * (float)var18);
                    var28 = -(int)((float)var18 * var20) + var17;
                    if (var23_ref != null &&
                      var23_ref.field_m != 3) {
                      var22 = (-1 + var23_ref.field_m) * var22 / 2;
                      var29 = 65537 * var22 + 256 * (var22 >> 1);
                      if (fj.field_t.field_f) {
                        we.a(9, var27 << 4, var26 << 4, var25 << 4, var24, 0, var28 << 4, var29, 80);
                        break;
                      }
                      be.a((byte) 92, 0, var27 << 4, var24, var26 << 4, var29, var25 << 4, var28 << 4, 5);
                      break;
                    }
                    if (fj.field_t.field_f) {
                      kr.a(70, var26 << 4, var27 << 4, var25 << 4, var24, var28 << 4);
                      break;
                    }
                    u.a(var26 << 4, -40, var27 << 4, var25 << 4, var28 << 4, var24);
                    break;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ds.field_c != null) {
          this.field_nb[0] = -1;
          this.field_p = null;
          this.field_S = null;
          this.field_nb[1] = -1;
          return;
        }
        if (1 != param0 &&
          param0 != 7) {
          this.field_S = this.c(param3, param2, (byte) 111);
          if (this.field_S != null) {
            this.field_p = null;
            return;
          }
          this.field_p = this.a(param2, false, param3);
          if (param0 == param1) {
            var5 = null;
            if (this.field_p != null) {
              var5 = (qm) (this.field_s.d(0));
              while (var5 != null) {
                if (((qm) (var5)).field_p == this.field_B) {
                  if (this.field_p == ((qm) (var5)).field_q) {
                    break;
                  }
                  if (this.field_p == ((qm) (var5)).field_r) {
                    break;
                  }
                }
                var5 = (qm) (this.field_s.a((byte) -71));
              }
            }
            if (-1 == this.field_T) {
              if (var5 == null) {
                this.field_o.a(10, 0, ub.field_Bb);
              } else {
                this.field_o.a(10, 0, re.a(vo.field_c, 4371, new String[]{or.field_d[((qm) (var5)).field_o], this.field_p.field_I}));
              }
            }
          }
          return;
        }
        this.field_nb[1] = -1;
        this.field_S = null;
        this.field_nb[0] = -1;
        this.field_p = this.a(param2, false, param3);
    }

    private final void b(int param0, int param1, int param2) {
        ln[] var4;
        int var5;
        int var7;
        fs var8;
        fs var9;
        int var10_int;
        bi var10;
        int var11;
        int var12;
        int var13;
        int var14;
        ln[] var15;
        ln var16;
        ln var17;
        int var5Lifetime1;
        int var7Lifetime1;
        int var11Lifetime1;
        ln[] var4Lifetime1;
        fs var8Lifetime1;
        fs var9Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var15 = this.field_O.field_e;
        var4 = var15;
        if (param2 < 119) {
          field_zb = (String) null;
        }
        for (var5 = 0; var5 < var15.length; var5++) {
          var16 = var15[var5];
          var7 = var16.field_p;
          if (var7 < this.field_Q.length) {
            boolean decompiledFrameRemainder0 = true;
            var8 = this.field_Q[var7];
            var9 = this.field_Z[var7];
            if (var9 != var8) {
              if (this.field_B != null) {
                if ((var9 != this.field_B) &&
                  (decompiledFrameRemainder0 = (this.field_B == var8))) {
                  decompiledFrameRemainder0 = (this.field_B != var16.field_t);
                }
              } else {
                decompiledFrameRemainder0 = (var9 != null);
              }
              if (decompiledFrameRemainder0) {
                var10_int = this.field_t;
                if (var10_int > 125) {
                  var10_int = -this.field_t + 150;
                }
                var11 = this.field_n;
                if (16 > var11) {
                  var11 = 16;
                }
                if (25 > var10_int) {
                  if (this.field_t > 125) {
                    re.a(0, 25, -125 + this.field_t, -var11, 0);
                  } else {
                    re.a(var11, 25, this.field_t, 0, 0);
                  }
                  var11 = re.a(var11 / 2, 25, var10_int, var11, 0);
                }
              }
            }
            continue;
          }
          break;
        }
        var4Lifetime1 = this.field_O.field_e;
        for (var5Lifetime1 = 0; var4Lifetime1.length > var5Lifetime1; var5Lifetime1++) {
          var17 = var4Lifetime1[var5Lifetime1];
          var7Lifetime1 = var17.field_p;
          if (var7Lifetime1 < this.field_Q.length) {
            L10: {
              var8Lifetime1 = this.field_Q[var7Lifetime1];
              var9Lifetime1 = this.field_Z[var7Lifetime1];
              if (var8Lifetime1 != var9Lifetime1) {
                if (null == this.field_B) {
                  if (var9Lifetime1 == null) {
                    break L10;
                  }
                  var10 = co.field_p[5];
                } else {
                  if (var9Lifetime1 == this.field_B) {
                    var10 = co.field_p[5];
                  } else {
                    if (var8Lifetime1 != this.field_B) {
                      break L10;
                    }
                    if (this.field_B == var17.field_t) {
                      break L10;
                    }
                    var10 = co.field_p[4];
                  }
                }
                var11Lifetime1 = this.field_t;
                if (var11Lifetime1 > 125) {
                  var11Lifetime1 = 150 - this.field_t;
                }
                var12 = 0;
                var13 = this.field_n;
                if (var13 < 16) {
                  var13 = 16;
                }
                if (var11Lifetime1 < 25) {
                  if (this.field_t > 125) {
                    var12 = re.a(0, 25, -125 + this.field_t, -var13, 0);
                  } else {
                    var12 = re.a(var13, 25, this.field_t, 0, 0);
                  }
                  var13 = re.a(var13 / 2, 25, var11Lifetime1, var13, 0);
                }
                var10.b(-var13 + this.field_i[var7Lifetime1], this.field_J[var7Lifetime1] + var12 - var13, 2 * var13, 2 * var13);
              }
            }
            continue;
          }
          break;
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        nd[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var4 = 0;
        nd[] var5 = null;
        nd[] var6 = null;
        int var7 = 0;
        nd var8 = null;
        nd var9 = null;
        nd[] var1Lifetime1;
        int var2Lifetime1;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5 = fe.field_y;
          var1 = var5;
          for (var2 = 0; var5.length > var2; var2++) {
            var8 = var5[var2];
            if (var8.field_h != 0) {
              var8.field_a = var8.field_a + var8.field_h;
              if (var8.field_a >= 100) {
                var8.field_h = -var8.field_h;
              }
              if (var8.field_a <= 0) {
                var8.field_a = 0;
                var8.field_h = 0;
              }
            }
            if (var8.field_a == 0 &&
              vc.a((byte) -39, 100) == 0) {
              var8.field_h = 10;
            }
          }
          if (param0 != 119) {
            field_Pb = (String) null;
          }
          var6 = fe.field_H;
          var1Lifetime1 = var6;
          var7 = 0;
          var2Lifetime1 = var7;
          while (var7 < var6.length) {
            var9 = var6[var7];
            if (var9.field_h != 0) {
              var9.field_a = var9.field_a + var9.field_h;
              if (100 <= var9.field_a) {
                var9.field_h = -var9.field_h;
              }
              if (0 >= var9.field_a) {
                var9.field_a = 0;
                var9.field_h = 0;
              }
            }
            if (0 == var9.field_a &&
              0 == vc.a((byte) -39, 100)) {
              var9.field_h = 10;
            }
            var7++;
          }
          if (di.field_m == 0) {
            sg.a(true, false, 0, kl.field_r, tk.field_C);
            sg.a(true, true, 400, rk.field_h, tk.field_C);
          }
          fieldTemp$0 = di.field_m + 1;
          di.field_m = di.field_m + 1;
          if (500 == fieldTemp$0) {
            jc.a(2, (byte) -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "tr.CA(" + param0 + ')');
        }
    }

    private final void e(ln param0, int param1) {
        ln stackIn_22_0 = null;
        ln stackIn_22_1 = null;
        ln stackIn_29_0 = null;
        ln stackIn_29_1 = null;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        qm[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var7Lifetime1Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = (int)(this.field_Jb * 300.0);
          var4 = new qm[this.field_s.e(0)];
          this.field_s.a((byte) -56, var4);
          var5 = new int[var4.length];
          var6 = -1;
          for (var7 = 0; var7 < var4.length; var7++) {
            for (var8 = 0; var7 > var8; var8++) {
              if (var4[var7].field_q == var4[var8].field_q) {
                var5[var7] = var5[var7] + 1;
              }
            }
            if (3 == var4[var7].field_o) {
              var6 = var7;
            }
          }
          if (var6 != -1) {
            for (var7Lifetime1 = 0; var6 > var7Lifetime1; var7Lifetime1++) {
              if (var4[var6].field_r != var4[var7Lifetime1].field_q) {
              }
            }
            for (var7Lifetime1Lifetime1 = 1 + var6; var7Lifetime1Lifetime1 < var4.length; var7Lifetime1Lifetime1++) {
              stackIn_22_0 = var4[var6].field_r;
              stackIn_22_1 = var4[var7Lifetime1Lifetime1].field_q;
              if (stackIn_22_0 == stackIn_22_1) {
                var5[var7Lifetime1Lifetime1] = var5[var7Lifetime1Lifetime1] + 1;
              }
            }
          }
          var7Lifetime2 = var3_int / 6;
          for (var8Lifetime1 = 0; var8Lifetime1 < var4.length; var8Lifetime1++) {
            stackIn_29_0 = (ln) (param0);
            stackIn_29_1 = var4[var8Lifetime1].field_q;
            if (stackIn_29_0 == stackIn_29_1 ||
              var4[var8Lifetime1].field_o == 3 &&
              param0 == var4[var8Lifetime1].field_r) {
              var9 = this.field_n << 5;
              if (100 > var9) {
                var9 = 100;
              }
              if (!(this.field_I < 330.0f)) {
                var10 = (int)(this.field_Jb * 1500.0);
                if (var10 > 700) {
                  var10 = 700;
                }
                if (this.field_I < 1024.0f &&
                  var10 < 450) {
                  var10 = 450;
                } else {
                  if (var10 < 150) {
                    var10 = 150;
                  }
                }
                var11 = 0;
                if (this.field_I > 1024.0f) {
                  var11 = 1;
                }
                stackIn_53_0 = this.field_i[param0.field_p];
                if (var11 != 0) {
                  stackIn_54_1 = 2;
                } else {
                  stackIn_54_1 = 0;
                }
                stackIn_56_0 = stackIn_53_0 - stackIn_54_1 << 4;
                if (var11 != 0) {
                  stackIn_57_1 = 1;
                } else {
                  stackIn_57_1 = 0;
                }
                gf.b(stackIn_56_0, -stackIn_57_1 + this.field_J[param0.field_p] << 4, var10, 255, this.field_bb[var4[var8Lifetime1].field_o]);
              } else {
                gf.b(this.field_i[param0.field_p] << 4, this.field_J[param0.field_p] - this.field_n * 7 / 10 - 44 << 4, 550, 255, this.field_bb[var4[var8Lifetime1].field_o]);
              }
              if (var9 > 2000) {
                var9 = 2000;
              }
            }
          }
          if (var7Lifetime2 < 24) {
            var7Lifetime2 = 24;
          }
          if (param1 != -29952) {
            this.b(109, 84, 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_69_0 = var3;
          stackIn_69_1 = new StringBuilder().append("tr.TA(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(')').toString());
        }
    }

    tr(l param0, fs[] param1, fs param2, boolean param3, boolean param4) {
        int var11 = 0;
        int var12 = 0;
        int var6_int = 0;
        om var7_ref_om = null;
        int var7 = 0;
        om var8_ref_om = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        this.field_tb = new int[]{-1, -1};
        this.field_Nb = -1.0;
        this.field_ub = new int[]{-1, -1};
        this.field_nb = new int[]{-1, -1};
        this.field_yb = 0;
        try {
          this.field_ib = param1;
          this.field_O = param0;
          stackIn_4_1 = (param3);
          this.field_X = stackIn_4_1;
          this.field_B = param2;
          this.field_cb = new int[this.field_ib.length][];
          this.j(0);
          this.field_E = (float)(this.field_O.field_b / 2);
          this.field_g = 200.0f;
          this.field_I = 300.0f;
          this.field_F = (float)(this.field_O.field_k * 300 / 450);
          this.field_k = (float)(this.field_O.field_k / 2);
          for (var6_int = 0; var6_int < 4; var6_int++) {
            this.field_bb[var6_int] = new int[256];
          }
          for (var6_intLifetime1 = 0; 256 > var6_intLifetime1; var6_intLifetime1++) {
            this.field_bb[0][var6_intLifetime1] = ee.a(we.a(254, var6_intLifetime1) << 7, var6_intLifetime1);
            this.field_bb[1][var6_intLifetime1] = var6_intLifetime1 << 8;
            this.field_bb[2][var6_intLifetime1] = ee.a(var6_intLifetime1 << 8, var6_intLifetime1 << 16);
            this.field_bb[3][var6_intLifetime1] = ee.a(var6_intLifetime1 << 16, var6_intLifetime1);
          }
          this.field_z = new int[this.field_O.field_e.length];
          this.field_c = new pf();
          this.field_m = new pf();
          this.field_ab = new pf();
          this.field_v = new pf();
          this.field_hb = new pf();
          this.field_Y = new pf();
          this.field_V = new pf();
          this.field_P = new boolean[this.field_O.field_e.length];
          this.field_qb = new om[4][6];
          for (var6_intLifetime2 = 0; var6_intLifetime2 < 6; var6_intLifetime2++) {
            var7_ref_om = (om) (mj.field_Nb[var6_intLifetime2]);
            var8_ref_om = (om) (ts.field_L[var6_intLifetime2]);
            this.field_qb[0][var6_intLifetime2] = var7_ref_om.h();
            this.field_qb[3][var6_intLifetime2] = var7_ref_om.h();
            this.field_qb[3][var6_intLifetime2].a();
            this.field_qb[1][var6_intLifetime2] = var8_ref_om.h();
            this.field_qb[2][var6_intLifetime2] = var8_ref_om.h();
            this.field_qb[2][var6_intLifetime2].a();
          }
          for (var6_intLifetime3 = 0; var6_intLifetime3 < 4; var6_intLifetime3++) {
            var7 = gm.field_k[var6_intLifetime3];
            var8 = 255 & var7 >> 16;
            var9 = (65280 & var7) >> 8;
            var10 = 255 & var7;
            for (var11 = 0; 6 > var11; var11++) {
              for (var12 = 0; this.field_qb[var6_intLifetime3][var11].field_B.length > var12; var12++) {
                var13 = (16711680 & this.field_qb[var6_intLifetime3][var11].field_B[var12]) >> 16;
                var14 = (65280 & this.field_qb[var6_intLifetime3][var11].field_B[var12]) >> 8;
                var15 = 255 & this.field_qb[var6_intLifetime3][var11].field_B[var12];
                if (var14 == var13 &&
                  var13 == var15) {
                  if (128 < var13) {
                    this.field_qb[var6_intLifetime3][var11].field_B[var12] = we.a(-16777216, this.field_qb[var6_intLifetime3][var11].field_B[var12]) + ((var10 * (256 - var15) - (32640 - 255 * var15) >> 7) + ((-var14 + 256) * var9 - 32640 + var14 * 255 >> 7 << 8) + (255 * (var13 - 128) + var8 * (-var13 + 256) >> 7 << 16));
                  } else {
                    this.field_qb[var6_intLifetime3][var11].field_B[var12] = we.a(-16777216, this.field_qb[var6_intLifetime3][var11].field_B[var12]) + (var10 * var15 >> 7) + (var9 * var14 >> 7 << 8) + (var8 * var13 >> 7 << 16);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("tr.<init>(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static hb a(byte param0, db param1) {
        RuntimeException var2 = null;
        hb stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 26) {
            stackIn_4_0 = new dn(param1);
            return (hb) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (hb) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tr.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_zb = "Player Name: ";
        field_Fb = "Public";
        field_vb = new pf();
        field_pb = "<%0> is already on your friend list.";
        field_Pb = "Just play";
    }
}
