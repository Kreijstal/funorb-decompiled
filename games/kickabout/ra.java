/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra extends dj {
    private kq[] field_K;
    static sr field_H;
    static int[][][] field_F;
    private up[] field_M;
    private String[] field_E;
    private int field_J;
    private kp[] field_I;
    static int field_N;
    static String field_O;
    static ot field_L;
    static js field_G;

    final static void a(boolean param0, int param1, iw param2, qb param3) {
        int var8 = 0;
        qb stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        qb stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        qb stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        qb stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        qb stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        qb stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        qb var10 = null;
        var9 = Kickabout.field_G;
        try {
          if (param0) {
            param3.field_gc = param2.h((byte) -119);
          }
          param3.field_bc = param2.h((byte) -123);
          param3.field_Wb = param2.h((byte) -126);
          var4_int = param2.h((byte) -109);
          stackIn_5_0 = (qb) (param3);
          stackIn_6_1 = (0 != (128 & var4_int));
          stackIn_5_0.field_yb = stackIn_6_1;
          stackIn_8_0 = (qb) (param3);
          stackIn_9_1 = ((var4_int & 64) != 0);
          stackIn_8_0.field_Cb = stackIn_9_1;
          stackIn_11_0 = (qb) (param3);
          if ((var4_int & 16) != 0) {
            stackIn_12_1 = 2;
          } else {
            stackIn_12_1 = 1;
          }
          stackIn_11_0.field_Mb = stackIn_12_1;
          stackIn_14_0 = (qb) (param3);
          stackIn_15_1 = ((var4_int & 32) != 0);
          stackIn_14_0.field_Ub = stackIn_15_1;
          stackIn_18_0 = (qb) (param3);
          stackIn_19_1 = (param3.field_yb) && (param3.field_bc > param3.field_gc);
          stackIn_18_0.field_Xb = stackIn_19_1;
          stackIn_21_0 = (qb) (param3);
          stackIn_22_1 = ((8 & var4_int) != 0);
          stackIn_21_0.field_ic = stackIn_22_1;
          stackIn_25_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_25_0;
          param2.a(param3.field_Eb, 0, (byte) -6, param3.field_Eb.length);
          stackIn_28_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var6 = stackIn_28_0;
          param3.field_Ob = param2.a((byte) 81);
          param3.field_Fb = nj.a(-128) - (long)param2.k(4);
          if (var5 != 0) {
            param3.field_ac = param2.k(4);
          } else {
            param3.field_ac = -1;
          }
          param3.field_Nb = param2.i((byte) -124);
          if (param1 < 113) {
            var10 = (qb) null;
            ra.a(true, -32, (iw) null, (qb) null);
          }
          var7 = param2.field_n;
          param3.field_ec = param2.a(22);
          if (var6 != 0) {
            param3.field_Kb = new String[param3.field_gc];
            param2.field_n = var7;
            for (var8 = 0; var8 < param3.field_gc; var8++) {
              param3.field_Kb[var8] = param2.a(3);
            }
            return;
          }
          param3.field_Kb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("ra.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, int param2, int param3, int param4) {
        int[] var5;
        int var6;
        int[] var7;
        int[] var8;
        var6 = Kickabout.field_G;
        if (param3 != 0) {
          field_L = (ot) null;
        }
        var7 = new int[]{param0, param4};
        var8 = var7;
        var5 = var8;
        if (param0 + param2 > 638) {
          var5[0] = -param2 + 638;
        } else {
          if (param0 < 2) {
            var7[0] = 2;
          }
        }
        if (param1 + param4 <= 478) {
          if (param4 < 2) {
            var8[1] = 2;
          }
        } else {
          var5[1] = 478 - param1;
        }
        return var5;
    }

    final static void i(byte param0) {
        if (param0 >= -16) {
          ra.a(-54, 93, 33, 14, -70);
        }
        k.field_m = null;
    }

    final void a(int param0, boolean param1) {
        int var21 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_46_0 = 0;
        int[] stackIn_46_1 = null;
        int stackIn_47_2 = 0;
        String[] stackIn_50_0 = null;
        int[] stackIn_50_1 = null;
        int stackIn_51_2 = 0;
        String stackIn_53_0 = null;
        int[] stackIn_55_0 = null;
        int stackIn_56_1 = 0;
        String[] stackIn_59_0 = null;
        int[] stackIn_59_1 = null;
        int stackIn_60_2 = 0;
        String stackIn_62_0 = null;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_69_0;
        int stackIn_69_1;
        int stackIn_69_2;
        int stackIn_69_3;
        int stackIn_70_4;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        String var14_ref_String;
        String var15_ref_String;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        kp var22;
        String var23;
        String var24;
        int var25;
        String var26;
        String var27;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime2Lifetime1;
        int var13Lifetime2Lifetime1;
        int var15Lifetime1Lifetime1;
        var25 = Kickabout.field_G;
        super.a(param0, param1);
        var3 = 40;
        var4 = 126;
        var5 = 265;
        var6 = 270;
        var7 = 20 + var4;
        var8 = 10;
        var9 = -var8 + var5 - var8;
        var10 = 16;
        if (this.field_C == 0) {
          var4 = 200;
          var6 = 230;
          var5 = 380;
          var9 = -var8 + (var5 - var8);
          var10 = 16;
          var11 = -1;
          for (var12 = 0; var12 < 9; var12++) {
            if (this.field_K[var12].field_gb &&
              !this.field_K[var12].field_Eb.c(-2)) {
              var11 = var12;
            }
          }
          gd.a(-1, 178, this.field_j + 45, (byte) -96, var11);
          for (var12Lifetime4 = 0; var12Lifetime4 < 9; var12Lifetime4++) {
            this.field_K[var12Lifetime4].field_s = this.field_j + 45 + var12Lifetime4 % 3 * 52;
            this.field_K[var12Lifetime4].b(0, false);
            this.field_K[var12Lifetime4].h((byte) -123);
          }
          on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
          pb.field_C.a(tr.field_c, this.field_j + 70, 126, 500, 40, 16777215, -1, 0, 1, 16);
          on.a(210 + this.field_j, 178, 390, 225, 10, 65793, 140);
          var12Lifetime5 = 0;
          var13 = this.field_j + 230;
          var14 = var4;
          while (ml.field_s.length > var12Lifetime5) {
            var15_ref_String = ml.field_s[var12Lifetime5];
            var16 = pb.field_C.c(var15_ref_String, var9, var10);
            if (var14 + var16 > var6 + var4) {
              break;
            }
            var14 = var14 + (var10 * pb.field_C.a(var15_ref_String, var13, var14, var9, 999, 16777215, -1, 0, 0, var10) + 20);
            var12Lifetime5++;
          }
        }
        if (this.field_C == 1) {
          on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
          var6 -= 50;
          pb.field_C.a(jb.field_h, this.field_j + 70, 126, 500, 40, 16777215, -1, 0, 1, 16);
          var4 += 50;
          for (var11Lifetime1 = 0; var11Lifetime1 < 2; var11Lifetime1++) {
            stackIn_26_0 = (1 != var11Lifetime1) ? 0 : 1;
            var12Lifetime1 = stackIn_26_0;
            if (var12Lifetime1 != 0) {
              stackIn_29_0 = -var5 + (640 - var3 + var8);
            } else {
              stackIn_29_0 = var8 + var3;
            }
            var13Lifetime1 = stackIn_29_0;
            var13Lifetime1 = var13Lifetime1 + this.field_j;
            on.a(-var8 + var13Lifetime1, var4, var5, var6, 10, 65793, 140);
            var14Lifetime1 = 40 + var7;
            for (var15 = 0; tn.field_g[var11Lifetime1].length > var15; var15++) {
              var26 = tn.field_g[var11Lifetime1][var15];
              var14Lifetime1 = var14Lifetime1 + (15 + pb.field_C.a(var26, var13Lifetime1, var14Lifetime1, var9, 999, 16777215, -1, 0, 0, var10) * var10);
            }
          }
        }
        if (this.field_C == 2) {
          on.a(40 + this.field_j, 120, 560, 50, 10, 65793, 140);
          pb.field_C.a(ll.field_l, this.field_j + 70, 126, 500, 40, 16777215, -1, 0, 1, 16);
          on.a(40 + this.field_j, 178, 275, 225, 10, 65793, 140);
          var4 = 195;
          var11Lifetime2 = 0;
          var6 = 230;
          var12Lifetime2 = this.field_j + 60;
          var13Lifetime2 = var4;
          while (var11Lifetime2 < re.field_b.length) {
            var14_ref_String = re.field_b[var11Lifetime2];
            var15Lifetime1 = pb.field_C.c(var14_ref_String, var9, var10);
            if (var15Lifetime1 + var13Lifetime2 <= var4 + var6) {
              var11Lifetime2++;
              var13Lifetime2 = var13Lifetime2 + (20 + pb.field_C.a(var14_ref_String, var12Lifetime2, var13Lifetime2, var9, 999, 16777215, -1, 0, 0, var10) * var10);
              continue;
            }
            break;
          }
          on.a(this.field_j + 325, 178, 275, 225, 10, 65793, 140);
          pt.a(this.field_j + 595, -22914, this.field_j + 330, 398, 183);
          var14Lifetime2 = 7;
          var15Lifetime1Lifetime1 = 110;
          var16Lifetime1 = 40;
          var17 = (var15Lifetime1Lifetime1 << 1) / 3;
          var18 = var16Lifetime1 + 10;
          var19 = this.field_J + (-(var17 << 1) + this.field_j) + 462;
          var12Lifetime2Lifetime1 = var19;
          var20 = 290 + (-var18 - 25);
          var13Lifetime2Lifetime1 = var20;
          for (var21 = 0; var14Lifetime2 > var21; var21++) {
            if (null != this.field_I &&
              null != this.field_I[var21]) {
              var22 = this.field_I[var21];
              stackIn_46_0 = -1;
              stackIn_46_1 = var22.field_c;
              if (var22.field_d) {
                stackIn_47_2 = 1;
              } else {
                stackIn_47_2 = 0;
              }
              if (stackIn_46_0 == stackIn_46_1[stackIn_47_2]) {
                stackIn_53_0 = "";
              } else {
                stackIn_50_0 = this.field_E;
                stackIn_50_1 = var22.field_c;
                if (!var22.field_d) {
                  stackIn_51_2 = 0;
                } else {
                  stackIn_51_2 = 1;
                }
                stackIn_53_0 = stackIn_50_0[stackIn_50_1[stackIn_51_2]];
              }
              var23 = stackIn_53_0;
              stackIn_55_0 = var22.field_c;
              if (!var22.field_d) {
                stackIn_56_1 = 1;
              } else {
                stackIn_56_1 = 0;
              }
              if (stackIn_55_0[stackIn_56_1] == -1) {
                stackIn_62_0 = "";
              } else {
                stackIn_59_0 = this.field_E;
                stackIn_59_1 = var22.field_c;
                if (!var22.field_d) {
                  stackIn_60_2 = 1;
                } else {
                  stackIn_60_2 = 0;
                }
                stackIn_62_0 = stackIn_59_0[stackIn_59_1[stackIn_60_2]];
              }
              var24 = stackIn_62_0;
              eo.a(var22, var23, var24, -(var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, var13Lifetime2Lifetime1 - (var16Lifetime1 >> 1), var15Lifetime1Lifetime1, var16Lifetime1);
              on.e(-(var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, var13Lifetime2Lifetime1 - (var16Lifetime1 >> 1), (var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, -(var16Lifetime1 >> 1) + var13Lifetime2Lifetime1, 11184810, 128);
              on.e(var12Lifetime2Lifetime1 - (var15Lifetime1Lifetime1 >> 1), (var16Lifetime1 >> 1) + var13Lifetime2Lifetime1, var12Lifetime2Lifetime1 + (var15Lifetime1Lifetime1 >> 1), var13Lifetime2Lifetime1 + (var16Lifetime1 >> 1), 11184810, 128);
              on.e(var12Lifetime2Lifetime1 - (var15Lifetime1Lifetime1 >> 1), -(var16Lifetime1 >> 1) + (var13Lifetime2Lifetime1 + 1), -(var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, -1 + ((var16Lifetime1 >> 1) + var13Lifetime2Lifetime1), 11184810, 128);
              on.e((var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, var13Lifetime2Lifetime1 + (var16Lifetime1 >> 1) - 1, (var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, 1 + (var13Lifetime2Lifetime1 - (var16Lifetime1 >> 1)), 11184810, 128);
              on.e(-(var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1 + 1, var13Lifetime2Lifetime1, -1 + (var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1, var13Lifetime2Lifetime1, 11184810, 128);
              on.e((var15Lifetime1Lifetime1 >> 1) + (var12Lifetime2Lifetime1 - 19), 1 + var13Lifetime2Lifetime1 - (var16Lifetime1 >> 1), (var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1 - 19, -1 + var13Lifetime2Lifetime1 + (var16Lifetime1 >> 1), 11184810, 128);
            }
            if (var21 != -1 + var14Lifetime2) {
              stackIn_66_0 = (var15Lifetime1Lifetime1 >> 1) + var12Lifetime2Lifetime1;
              stackIn_66_1 = var13Lifetime2Lifetime1;
              stackIn_66_2 = -(var15Lifetime1Lifetime1 >> 1) + ((var17 << 1) + var12Lifetime2Lifetime1);
              if (var21 % 2 == 0) {
                stackIn_67_3 = var18 >> 1;
              } else {
                stackIn_67_3 = -(var18 >> 1);
              }
              on.b(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_67_3 + var13Lifetime2Lifetime1, 11184810);
              stackIn_69_0 = var12Lifetime2Lifetime1 + (var15Lifetime1Lifetime1 >> 1);
              stackIn_69_1 = 1 + var13Lifetime2Lifetime1;
              stackIn_69_2 = var12Lifetime2Lifetime1 - (-(var17 << 1) + (var15Lifetime1Lifetime1 >> 1));
              stackIn_69_3 = 1 + var13Lifetime2Lifetime1;
              if (var21 % 2 == 0) {
                stackIn_70_4 = var18 >> 1;
              } else {
                stackIn_70_4 = -(var18 >> 1);
              }
              on.b(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_69_3 + stackIn_70_4, 11184810);
            }
            var13Lifetime2Lifetime1 = var13Lifetime2Lifetime1 + var18;
            if (var21 == var14Lifetime2 - 8 ||
              var21 == var14Lifetime2 - 4 ||
              var21 == -2 + var14Lifetime2) {
              var20 = var20 + (var18 >> 1);
              var19 = var19 + (var17 << 1);
              var13Lifetime2Lifetime1 = var20;
              var12Lifetime2Lifetime1 = var19;
              var18 = var18 << 1;
            }
          }
          ta.e(125);
        }
        if (3 == this.field_C) {
          for (var11Lifetime3 = 0; 2 > var11Lifetime3; var11Lifetime3++) {
            stackIn_86_0 = (var11Lifetime3 != 1) ? 0 : 1;
            var12Lifetime3 = stackIn_86_0;
            if (var12Lifetime3 != 0) {
              stackIn_89_0 = var8 + (-var5 + 640 - var3);
            } else {
              stackIn_89_0 = var8 + var3;
            }
            var13Lifetime3 = stackIn_89_0;
            var13Lifetime3 = var13Lifetime3 + this.field_j;
            var14Lifetime3 = var7 - 5;
            on.a(var13Lifetime3 - var8, var4, var5, var6, 10, 65793, 140);
            for (var15Lifetime2 = 0; va.field_y[var11Lifetime3].length > var15Lifetime2; var15Lifetime2++) {
              var27 = va.field_y[var11Lifetime3][var15Lifetime2];
              var14Lifetime3 = var14Lifetime3 + (pb.field_C.a(var27, var13Lifetime3, var14Lifetime3, var9, 999, 16777215, -1, 0, 0, var10) * var10 + 15);
            }
          }
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_F = (int[][][]) null;
        field_H = null;
        field_G = null;
        field_L = null;
        if (param0 != 128) {
          field_L = (ot) null;
        }
    }

    final void a(byte param0, boolean param1) {
        int var4_int = 0;
        double var4 = 0.0;
        int var6 = Kickabout.field_G;
        super.a((byte) 104, param1);
        int var3 = -118 / ((param0 - 38) / 60);
        if (this.field_C == 0) {
          for (var4_int = 0; 9 > var4_int; var4_int++) {
            this.field_K[var4_int].b(0, param1);
            this.field_K[var4_int].a(31, 11, (byte) 125, 16, this.field_M[var4_int]);
          }
        }
        if (this.field_C == 2) {
          var4 = (double)(nj.a(61) >> 5);
          this.field_J = (int)(Math.sin(var4 * 3.141592653589793 / 256.0) * 140.0);
        }
    }

    final void b(int param0) {
        int var4 = 0;
        up var5 = null;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        Random var7 = new Random();
        int var3Lifetime1;
        for (var3 = 0; var3 < 9; var3++) {
          this.field_M[var3] = new up();
          var4 = 0;
          if (var3 > 2) {
            var4 = 3;
          }
          if (5 < var3) {
            var4 = 1;
          }
          var5 = this.field_M[var3];
          var5.field_r = 0;
          var5.field_n = 50;
          var5.field_g = 50;
          var5.field_q = var4;
          var5.field_o = 50;
          var5.field_l = dq.$cfr$intArgs$a$7f8aad568c81(-110, ce.field_G[var5.field_q].length, var7);
          var5.field_e = dq.$cfr$intArgs$a$7f8aad568c81(-92, td.field_a.length, var7);
          var5.field_j = var5.field_j | dq.$cfr$intArgs$a$7f8aad568c81(-62, 3, var7);
          var5.field_j = var5.field_j | dq.$cfr$intArgs$a$7f8aad568c81(95, 3, var7) << 4;
          var5.field_j = var5.field_j | dq.$cfr$intArgs$a$7f8aad568c81(91, 5, var7) << 8;
          this.field_K[var3] = new kq();
          this.field_K[var3].field_s = 45 + var3 % 3 * 52;
          this.field_K[var3].field_J = var3 / 3 * 75 + 178;
        }
        this.field_E = new String[]{"Mod_Iain", "Mod_Thomas", "Mod_Shade", "Mod_Korpz", "Mod_Zeph", "Mod_Thor", "Mod_Wivlaro", "Mod_Crispy"};
        this.field_I = new kp[7];
        for (var3Lifetime1 = 0; this.field_I.length > var3Lifetime1; var3Lifetime1++) {
          this.field_I[var3Lifetime1] = new kp();
          this.field_I[var3Lifetime1].field_f = 5;
          this.field_I[var3Lifetime1].field_o = 0;
        }
        this.field_I[0].field_c = new int[]{0, 1};
        this.field_I[0].field_j = 2;
        this.field_I[0].field_b = 1;
        this.field_I[2].field_o = 1;
        this.field_I[1].field_b = 0;
        if (param0 != -38) {
          return;
        }
        this.field_I[1].field_c = new int[]{2, 3};
        this.field_I[1].field_j = 3;
        this.field_I[2].field_j = 0;
        this.field_I[2].field_c = new int[]{5, 4};
        this.field_I[2].field_b = 1;
        this.field_I[3].field_b = 0;
        this.field_I[3].field_c = new int[]{6, 7};
        this.field_I[3].field_j = 5;
        this.field_I[4].field_o = 1;
        this.field_I[4].field_j = 2;
        this.field_I[4].field_c = new int[]{2, 0};
        this.field_I[4].field_b = 4;
        this.field_I[5].field_j = 3;
        this.field_I[5].field_c = new int[]{4, 6};
        this.field_I[5].field_b = 1;
        this.field_I[6].field_j = 1;
        this.field_I[6].field_c = new int[]{0, 4};
        this.field_I[6].field_b = 0;
    }

    ra() {
        this.field_K = new kq[9];
        this.field_M = new up[9];
    }

    static {
        field_F = new int[33][33][33];
        field_H = (sr) ((Object) new en());
        field_N = 7;
        field_O = "Play free version";
    }
}
