/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class lm {
    static String field_c;
    static int field_a;
    lf[] field_b;
    static int[] field_d;

    final static vk a(byte[] param0, byte param1) throws IOException {
        vk stackIn_15_0 = null;
        int stackIn_16_1 = 0;
        dd stackIn_28_0;
        dd stackIn_28_1;
        qm stackIn_28_2;
        qm stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        int stackIn_28_9;
        int stackIn_28_10;
        int stackIn_28_11;
        int stackIn_28_12;
        int stackIn_28_13;
        int stackIn_28_14;
        dd stackIn_29_0 = null;
        dd stackIn_29_1 = null;
        boolean stackIn_29_15 = false;
        boolean stackIn_32_16 = false;
        boolean stackIn_35_17 = false;
        boolean stackIn_38_18 = false;
        boolean stackIn_41_19 = false;
        boolean stackIn_44_20 = false;
        hn stackIn_46_0;
        hn stackIn_46_1;
        qm stackIn_46_2;
        int stackIn_46_3;
        float stackIn_46_4;
        float stackIn_46_5;
        int stackIn_46_6;
        int stackIn_46_7;
        int stackIn_46_8;
        int stackIn_46_9;
        int stackIn_46_10;
        Object stackIn_46_11;
        Object stackIn_46_12;
        qm stackIn_46_13;
        hn stackIn_47_0 = null;
        hn stackIn_47_1 = null;
        boolean stackIn_47_14 = false;
        boolean stackIn_50_15 = false;
        boolean stackIn_53_16 = false;
        boolean stackIn_56_17 = false;
        boolean stackIn_59_18 = false;
        boolean stackIn_62_19;
        dd stackIn_65_0;
        dd stackIn_65_1;
        qm stackIn_65_2;
        qm stackIn_65_3;
        int stackIn_65_4;
        int stackIn_65_5;
        int stackIn_65_6;
        int stackIn_65_7;
        int stackIn_65_8;
        int stackIn_65_9;
        int stackIn_65_10;
        int stackIn_65_11;
        int stackIn_65_12;
        int stackIn_65_13;
        int stackIn_65_14;
        dd stackIn_66_0 = null;
        dd stackIn_66_1 = null;
        boolean stackIn_66_15 = false;
        boolean stackIn_69_16 = false;
        boolean stackIn_72_17 = false;
        boolean stackIn_75_18 = false;
        boolean stackIn_78_19 = false;
        boolean stackIn_81_20 = false;
        float stackIn_84_0 = 0.0f;
        float stackIn_95_0 = 0.0f;
        Object stackIn_98_0 = null;
        vk stackIn_129_0 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        th var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ei var18 = null;
        qm var19 = null;
        qm var20 = null;
        qm var22 = null;
        Object var23 = null;
        hn var23_ref = null;
        int var23_int = 0;
        int[] var24 = null;
        float var25 = 0.0f;
        int var26 = 0;
        float var26_float = 0.0f;
        int var27 = 0;
        qm var27_ref_qm = null;
        int var28 = 0;
        hn var28_ref_hn = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var34 = 0.0f;
        float var35 = 0.0f;
        Object var36 = null;
        Object var37_ref = null;
        dd var37_ref_dd = null;
        int var37 = 0;
        Object var38_ref = null;
        int var38 = 0;
        hn var38_ref_hn = null;
        Object var39_ref = null;
        int var39 = 0;
        hn var39_ref_hn = null;
        int var44_int = 0;
        qm var44 = null;
        int var45 = 0;
        float var46 = 0.0f;
        wm var47 = null;
        int var48 = 0;
        int var49 = 0;
        na var50 = null;
        int var51 = 0;
        qm var52 = null;
        int[] var53 = null;
        Object var54 = null;
        vk var57 = null;
        char[] var58 = null;
        dd var59 = null;
        dd var60 = null;
        Object var61 = null;
        hn var61_ref = null;
        ei var62 = null;
        ei var63 = null;
        ei var64 = null;
        ei var65 = null;
        ei var66 = null;
        ei var67 = null;
        ei var68 = null;
        ei var69 = null;
        char[] var72 = null;
        byte[] var75 = null;
        byte[] var76 = null;
        dd var77 = null;
        dd stackIn_29_0Lifetime1;
        dd stackIn_29_0Lifetime2;
        dd stackIn_29_0Lifetime3;
        dd stackIn_29_0Lifetime4;
        dd stackIn_29_0Lifetime5;
        dd stackIn_29_1Lifetime1;
        dd stackIn_29_1Lifetime2;
        dd stackIn_29_1Lifetime3;
        dd stackIn_29_1Lifetime4;
        dd stackIn_29_1Lifetime5;
        hn stackIn_47_0Lifetime1;
        hn stackIn_47_0Lifetime2;
        hn stackIn_47_0Lifetime3;
        hn stackIn_47_0Lifetime4;
        hn stackIn_47_0Lifetime5;
        hn stackIn_47_1Lifetime1;
        hn stackIn_47_1Lifetime2;
        hn stackIn_47_1Lifetime3;
        hn stackIn_47_1Lifetime4;
        hn stackIn_47_1Lifetime5;
        dd stackIn_66_0Lifetime1;
        dd stackIn_66_0Lifetime2;
        dd stackIn_66_0Lifetime3;
        dd stackIn_66_0Lifetime4;
        dd stackIn_66_0Lifetime5;
        dd stackIn_66_1Lifetime1;
        dd stackIn_66_1Lifetime2;
        dd stackIn_66_1Lifetime3;
        dd stackIn_66_1Lifetime4;
        dd stackIn_66_1Lifetime5;
        qm var19Lifetime1;
        qm var20Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var13Lifetime5;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        float var25Lifetime1;
        int var14Lifetime3;
        int var15Lifetime2;
        var54 = null;
        var23 = null;
        var61 = null;
        var37_ref = null;
        var38_ref = null;
        var39_ref = null;
        var51 = HoldTheLine.field_D;
        try {
          ti.c(false);
          var57 = new vk(param0);
          var3 = new th(param0);
          var75 = new byte[ho.field_m.length];
          var3.a(ho.field_m.length, 0, (byte) 113, var75);
          if (!nd.a(ho.field_m, 0, var75)) {
            throw new IOException("Invalid file format!");
          }
          var76 = new byte[rh.field_a.length];
          var3.a(rh.field_a.length, 0, (byte) 75, var76);
          if (nd.a(bi.field_b, 0, var76)) {
            var6 = 0;
          } else {
            if (!nd.a(nc.field_e, 0, var76)) {
              throw new IOException("Invalid file version!");
            }
            var6 = 1;
          }
          var57.field_v = (byte)var3.f((byte) -83);
          var57.field_o = var57.field_v & 7;
          stackIn_15_0 = var57;
          if (var57.field_o == 0) {
            stackIn_16_1 = 0;
          } else {
            if (var57.field_o < 3) {
              stackIn_16_1 = 1;
            } else {
              if (var57.field_o >= 6) {
                stackIn_16_1 = 3;
              } else {
                stackIn_16_1 = 2;
              }
            }
          }
          stackIn_15_0.field_p = stackIn_16_1;
          var7 = var3.f((byte) -44);
          if (param1 < 107) {
            field_d = (int[]) null;
          }
          var8 = var3.f((byte) -109);
          var9 = 0;
          var10 = 0;
          if (var6 != 0) {
            var9 = var3.f((byte) -19);
            var10 = var3.f((byte) -33);
          }
          var11 = var3.f((byte) -26);
          var72 = new char[var7];
          var58 = var72;
          var12 = var58;
          for (var13 = 0; var7 > var13; var13++) {
            var12[var13] = (char)kc.a(var3.f((byte) -102) << 8, var3.f((byte) -95));
          }
          var57.field_b = new String(var72);
          var18 = new ei();
          for (var13Lifetime1 = 0; var13Lifetime1 < var8; var13Lifetime1++) {
            var19 = new qm(var3.k(-48), var3.k(-128));
            var20 = new qm(var3.k(-114), var3.k(71));
            var14 = var3.f(0);
            var15 = var3.f((byte) -19);
            var16 = var3.f(0);
            var17 = var3.f(0);
            stackIn_28_0 = null;
            stackIn_28_1 = null;
            stackIn_28_2 = var19;
            stackIn_28_3 = var20;
            stackIn_28_4 = var14;
            stackIn_28_5 = 0;
            stackIn_28_6 = 0;
            stackIn_28_7 = 0;
            stackIn_28_8 = 0;
            stackIn_28_9 = 0;
            stackIn_28_10 = 0;
            stackIn_28_11 = 0;
            stackIn_28_12 = 0;
            stackIn_28_13 = var16;
            stackIn_28_14 = var17;
            if ((2 & var15) == 0) {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_15 = false;
            } else {
              stackIn_29_0 = null;
              stackIn_29_1 = null;
              stackIn_29_15 = true;
            }
            if ((4 & var15) == 0) {
              stackIn_29_0Lifetime1 = null;
              stackIn_29_1Lifetime1 = null;
              stackIn_32_16 = false;
            } else {
              stackIn_29_0Lifetime1 = null;
              stackIn_29_1Lifetime1 = null;
              stackIn_32_16 = true;
            }
            if ((1 & var15) == 0) {
              stackIn_29_0Lifetime2 = null;
              stackIn_29_1Lifetime2 = null;
              stackIn_35_17 = false;
            } else {
              stackIn_29_0Lifetime2 = null;
              stackIn_29_1Lifetime2 = null;
              stackIn_35_17 = true;
            }
            if (0 == (var15 & 8)) {
              stackIn_29_0Lifetime3 = null;
              stackIn_29_1Lifetime3 = null;
              stackIn_38_18 = false;
            } else {
              stackIn_29_0Lifetime3 = null;
              stackIn_29_1Lifetime3 = null;
              stackIn_38_18 = true;
            }
            if (0 == (16 & var15)) {
              stackIn_29_0Lifetime4 = null;
              stackIn_29_1Lifetime4 = null;
              stackIn_41_19 = false;
            } else {
              stackIn_29_0Lifetime4 = null;
              stackIn_29_1Lifetime4 = null;
              stackIn_41_19 = true;
            }
            if ((32 & var15) == 0) {
              stackIn_29_0Lifetime5 = null;
              stackIn_29_1Lifetime5 = null;
              stackIn_44_20 = false;
            } else {
              stackIn_29_0Lifetime5 = null;
              stackIn_29_1Lifetime5 = null;
              stackIn_44_20 = true;
            }
            var59 = new dd(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, stackIn_28_9, stackIn_28_10, stackIn_28_11, stackIn_28_12, stackIn_28_13, stackIn_28_14, stackIn_29_15, stackIn_32_16, stackIn_35_17, stackIn_38_18, stackIn_41_19, stackIn_44_20, 0.0f, 0.0f, 3.1415927410125732f);
            var18.a(var59, (byte) 6);
            var52 = new qm(var3.k(101), var3.k(-49));
            var22 = var52;
            var23_int = var3.k(-109);
            var53 = new int[]{-var3.f((byte) -62), -var3.f((byte) -125), var3.f((byte) -45), var3.f((byte) -120)};
            var24 = var53;
            var15Lifetime2 = var3.f((byte) -127);
            var25 = (float)var3.h(-14232) / 256.0f;
            var26_float = (float)var3.h(-14232) / 256.0f;
            var14Lifetime3 = var3.f(0);
            var27_ref_qm = new qm(var3.k(-127), var3.k(97));
            stackIn_46_0 = null;
            stackIn_46_1 = null;
            stackIn_46_2 = var52;
            stackIn_46_3 = var23_int;
            stackIn_46_4 = var25;
            stackIn_46_5 = var26_float;
            stackIn_46_6 = var14Lifetime3;
            stackIn_46_7 = var53[1];
            stackIn_46_8 = var53[2];
            stackIn_46_9 = var53[0];
            stackIn_46_10 = var53[3];
            stackIn_46_11 = null;
            stackIn_46_12 = null;
            stackIn_46_13 = var27_ref_qm;
            if ((var15Lifetime2 & 2) == 0) {
              stackIn_47_0 = null;
              stackIn_47_1 = null;
              stackIn_47_14 = false;
            } else {
              stackIn_47_0 = null;
              stackIn_47_1 = null;
              stackIn_47_14 = true;
            }
            if ((var15Lifetime2 & 4) == 0) {
              stackIn_47_0Lifetime1 = null;
              stackIn_47_1Lifetime1 = null;
              stackIn_50_15 = false;
            } else {
              stackIn_47_0Lifetime1 = null;
              stackIn_47_1Lifetime1 = null;
              stackIn_50_15 = true;
            }
            if ((1 & var15Lifetime2) == 0) {
              stackIn_47_0Lifetime2 = null;
              stackIn_47_1Lifetime2 = null;
              stackIn_53_16 = false;
            } else {
              stackIn_47_0Lifetime2 = null;
              stackIn_47_1Lifetime2 = null;
              stackIn_53_16 = true;
            }
            if ((8 & var15Lifetime2) == 0) {
              stackIn_47_0Lifetime3 = null;
              stackIn_47_1Lifetime3 = null;
              stackIn_56_17 = false;
            } else {
              stackIn_47_0Lifetime3 = null;
              stackIn_47_1Lifetime3 = null;
              stackIn_56_17 = true;
            }
            if ((var15Lifetime2 & 16) == 0) {
              stackIn_47_0Lifetime4 = null;
              stackIn_47_1Lifetime4 = null;
              stackIn_59_18 = false;
            } else {
              stackIn_47_0Lifetime4 = null;
              stackIn_47_1Lifetime4 = null;
              stackIn_59_18 = true;
            }
            if ((var15Lifetime2 & 32) == 0) {
              stackIn_47_0Lifetime5 = null;
              stackIn_47_1Lifetime5 = null;
              stackIn_62_19 = false;
            } else {
              stackIn_47_0Lifetime5 = null;
              stackIn_47_1Lifetime5 = null;
              stackIn_62_19 = true;
            }
            var28_ref_hn = new hn(stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, stackIn_46_6, stackIn_46_7, stackIn_46_8, stackIn_46_9, stackIn_46_10, (qm) (stackIn_46_11), (qm) (stackIn_46_12), stackIn_46_13, stackIn_47_14, stackIn_50_15, stackIn_53_16, stackIn_56_17, stackIn_59_18, stackIn_62_19);
            var18.a(var28_ref_hn, (byte) 6);
          }
          var19Lifetime1 = new qm(var3.h(-14232), var3.h(-14232));
          var20Lifetime1 = new qm(var3.h(-14232), var3.h(-14232));
          var14Lifetime1 = var3.f(0);
          var15Lifetime1 = var3.f((byte) -101);
          var16Lifetime1 = var3.f(0);
          var17Lifetime1 = var3.f(0);
          stackIn_65_0 = null;
          stackIn_65_1 = null;
          stackIn_65_2 = var19Lifetime1;
          stackIn_65_3 = var20Lifetime1;
          stackIn_65_4 = var14Lifetime1;
          stackIn_65_5 = 0;
          stackIn_65_6 = 0;
          stackIn_65_7 = 0;
          stackIn_65_8 = 0;
          stackIn_65_9 = 0;
          stackIn_65_10 = 0;
          stackIn_65_11 = 0;
          stackIn_65_12 = 0;
          stackIn_65_13 = var16Lifetime1;
          stackIn_65_14 = var17Lifetime1;
          if ((2 & var15Lifetime1) == 0) {
            stackIn_66_0 = null;
            stackIn_66_1 = null;
            stackIn_66_15 = false;
          } else {
            stackIn_66_0 = null;
            stackIn_66_1 = null;
            stackIn_66_15 = true;
          }
          if ((4 & var15Lifetime1) == 0) {
            stackIn_66_0Lifetime1 = null;
            stackIn_66_1Lifetime1 = null;
            stackIn_69_16 = false;
          } else {
            stackIn_66_0Lifetime1 = null;
            stackIn_66_1Lifetime1 = null;
            stackIn_69_16 = true;
          }
          if ((1 & var15Lifetime1) == 0) {
            stackIn_66_0Lifetime2 = null;
            stackIn_66_1Lifetime2 = null;
            stackIn_72_17 = false;
          } else {
            stackIn_66_0Lifetime2 = null;
            stackIn_66_1Lifetime2 = null;
            stackIn_72_17 = true;
          }
          if ((var15Lifetime1 & 8) == 0) {
            stackIn_66_0Lifetime3 = null;
            stackIn_66_1Lifetime3 = null;
            stackIn_75_18 = false;
          } else {
            stackIn_66_0Lifetime3 = null;
            stackIn_66_1Lifetime3 = null;
            stackIn_75_18 = true;
          }
          if ((var15Lifetime1 & 16) == 0) {
            stackIn_66_0Lifetime4 = null;
            stackIn_66_1Lifetime4 = null;
            stackIn_78_19 = false;
          } else {
            stackIn_66_0Lifetime4 = null;
            stackIn_66_1Lifetime4 = null;
            stackIn_78_19 = true;
          }
          if (0 == (32 & var15Lifetime1)) {
            stackIn_66_0Lifetime5 = null;
            stackIn_66_1Lifetime5 = null;
            stackIn_81_20 = false;
          } else {
            stackIn_66_0Lifetime5 = null;
            stackIn_66_1Lifetime5 = null;
            stackIn_81_20 = true;
          }
          var60 = new dd(stackIn_65_2, stackIn_65_3, stackIn_65_4, stackIn_65_5, stackIn_65_6, stackIn_65_7, stackIn_65_8, stackIn_65_9, stackIn_65_10, stackIn_65_11, stackIn_65_12, stackIn_65_13, stackIn_65_14, stackIn_66_15, stackIn_69_16, stackIn_72_17, stackIn_75_18, stackIn_78_19, stackIn_81_20, 0.0f, 0.0f, 3.1415927410125732f);
          var77 = (dd) (var18.field_b[0]);
          var23_ref = (hn) (var18.field_b[1]);
          var61_ref = (hn) (var18.field_b[var18.field_e - 1]);
          var18.a(var60, (byte) 6);
          var25Lifetime1 = var60.f(50) / (var60.f(50) + var77.f(50));
          var26 = var61_ref.field_N;
          var27 = var23_ref.field_N;
          var28 = var61_ref.field_P;
          var29 = var23_ref.field_P;
          var30 = var61_ref.field_B;
          var31 = var23_ref.field_B;
          var32 = var61_ref.field_L;
          var33 = var23_ref.field_L;
          var34 = (float)(3.141592653589793 * (double)var25Lifetime1);
          if (var23_ref.field_E < var23_ref.field_I) {
            stackIn_84_0 = var23_ref.field_E;
          } else {
            stackIn_84_0 = 3.1415927410125732f + var23_ref.field_E;
          }
          var35 = stackIn_84_0;
          var77.field_G = var34;
          var60.field_z = var61_ref.field_L;
          var13Lifetime2 = 0;
          var60.field_I = var61_ref.field_B;
          var60.field_y = var34;
          var60.field_O = var61_ref.field_N;
          var60.field_K = var61_ref.field_P;
          var36 = null;
          while (true) {
            var37_ref_dd = (dd) (var18.field_b[var13Lifetime2]);
            var37_ref_dd.b(58, var35);
            if (var37_ref_dd.field_P.field_h == var37_ref_dd.field_R.field_h &&
              ~var37_ref_dd.field_R.field_f == ~var37_ref_dd.field_P.field_f) {
              var18.a(true, var13Lifetime2);
            } else {
              var13Lifetime2++;
              var37_ref_dd.field_O = var26;
              var37_ref_dd.field_C = var31;
              var37_ref_dd.field_L = var29;
              var37_ref_dd.field_N = var27;
              var37_ref_dd.field_z = var32;
              var37_ref_dd.field_K = var28;
              var37_ref_dd.field_I = var30;
              var37_ref_dd.field_A = var33;
            }
            if (var36 != null) {
              ((hn) (var36)).field_Q = var37_ref_dd.p(-1);
            }
            if (var13Lifetime2 < var18.field_e) {
              var38_ref_hn = (hn) (var18.field_b[var13Lifetime2]);
              var38_ref_hn.field_F = var37_ref_dd.b((byte) -77);
              var13Lifetime2++;
              if (!(var38_ref_hn.field_E < var38_ref_hn.field_I)) {
                stackIn_95_0 = 3.1415927410125732f + var38_ref_hn.field_I;
              } else {
                stackIn_95_0 = var38_ref_hn.field_I;
              }
              var35 = stackIn_95_0;
              if (-1 + var18.field_e <= var13Lifetime2) {
                stackIn_98_0 = var23_ref;
              } else {
                stackIn_98_0 = var18.field_b[var13Lifetime2 + 1];
              }
              var39_ref_hn = (hn) (stackIn_98_0);
              var26 = var27;
              var28 = var29;
              var27 = var39_ref_hn.field_N;
              var30 = var31;
              var29 = var39_ref_hn.field_P;
              var32 = var33;
              var31 = var39_ref_hn.field_B;
              var33 = var39_ref_hn.field_L;
              var36 = var38_ref_hn;
              continue;
            }
            break;
          }
          var57.field_u = new wd[var18.field_e];
          for (var13Lifetime3 = 0; var13Lifetime3 < var18.field_e; var13Lifetime3++) {
            var57.field_u[var13Lifetime3] = (wd) (var18.field_b[var13Lifetime3]);
          }
          var37 = var57.field_u[-1 + var57.field_u.length].field_k;
          var38 = var57.field_u[0].field_k;
          for (var13Lifetime4 = 0; var13Lifetime4 < var57.field_u.length; var13Lifetime4++) {
            var39 = var57.field_u[(1 + var13Lifetime4) % var57.field_u.length].field_k;
            if (0 == var38) {
              var57.field_u[var13Lifetime4].field_o = (float)(var39 - var37) / var57.field_u[var13Lifetime4].f(50);
            }
            var37 = var38;
            var38 = var39;
          }
          var57.field_e = new ei();
          var64 = new ei();
          var62 = new ei();
          var65 = new ei();
          var63 = new ei();
          lf.a(var62, var63, var64, var57.field_e, var57.field_u, var65, -68);
          var57.field_e = mk.a(var57.field_e, (byte) -127);
          var67 = mk.a(var64, (byte) -127);
          var69 = mk.a(var65, (byte) -127);
          var66 = mk.a(var62, (byte) -127);
          var68 = mk.a(var63, (byte) -127);
          var57.field_c = ao.a(var66, (byte) 21, false, var67);
          var57.field_t = ao.a(var68, (byte) 21, false, var69);
          if (var6 != 0) {
            var44_int = var10 * 8 + var9 * 3;
            var3.a(var44_int, 0, (byte) 84, new byte[var44_int]);
          }
          for (var13Lifetime5 = 0; var13Lifetime5 < var11; var13Lifetime5++) {
            var44 = new qm(var3.h(-14232), var3.h(-14232));
            var45 = var3.f((byte) -27);
            var46 = (float)(3.141592653589793 * (double)var3.f((byte) -55) / 128.0);
            var14Lifetime2 = var3.f(0);
            if ((var45 < 5 ||
              var45 > 8) && (var45 < 62 ||
              var45 > 69)) {
              var47 = new wm(var44, var45, var14Lifetime2, var46, 0.0f, 0.0f);
              if ((32768 & var47.field_J) == 0) {
                var57.field_k.a((byte) -88, var47);
              } else {
                var57.field_m.a((byte) -103, var47);
              }
              if (var45 == 53) {
                var48 = var44.field_h - (int)(Math.sin((double)var46) * 10.0);
                var49 = var44.field_f - (int)(10.0 * Math.cos((double)var46));
                var50 = new na(var48, var49, var14Lifetime2, 60, de.field_Q);
                var57.field_x.a((byte) -78, var50);
              } else {
                if (var45 == 54) {
                  var48 = var44.field_h - (int)(35.0 * Math.sin((double)var46));
                  var49 = var44.field_f - (int)(35.0 * Math.cos((double)var46));
                  var50 = new na(var48, var49, var14Lifetime2, 60, de.field_Q);
                  var57.field_x.a((byte) -99, var50);
                  var48 = var44.field_h + (int)(35.0 * Math.sin((double)var46));
                  var49 = var44.field_f + (int)(35.0 * Math.cos((double)var46));
                  var50 = new na(var48, var49, var14Lifetime2, 60, de.field_Q);
                  var57.field_x.a((byte) -114, var50);
                }
              }
            }
          }
          stackIn_129_0 = var57;
          return stackIn_129_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_132_0 = var2;
          stackIn_132_1 = new StringBuilder().append("lm.I(");
          if (param0 == null) {
            stackIn_133_2 = "null";
          } else {
            stackIn_133_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_132_0), ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        lf var6 = null;
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        if (null == this.field_b ||
          this.field_b.length == 0 ||
          this.field_b[0].field_h > param2) {
          return -1;
        }
        if (param2 > this.field_b[-1 + this.field_b.length].field_k) {
          return -1;
        }
        if (this.field_b.length == 1) {
          return this.field_b[0].a(param0, 1800174305);
        }
        int var4 = 0;
        int var5 = 0;
        if (param1 != 8) {
          this.b(58, -57);
        }
        while (this.field_b.length > var5) {
          var6 = this.field_b[var5];
          if (var6.field_h <= param2 &&
            param2 <= var6.field_k) {
            var7 = var6.a(param0, 1800174305);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (var6.field_c.length - 1);
          var5++;
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        lf var5 = null;
        int var6 = HoldTheLine.field_D;
        lf[] var7 = this.field_b;
        lf[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_c.length > param1) {
            return var5.field_c[param1];
          }
          param1 = param1 - (-1 + var5.field_c.length);
        }
        if (param0 != 16777215) {
          lm.b(-28);
        }
        return 0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        lf var4 = null;
        int var5 = HoldTheLine.field_D;
        if (param1 != -22539) {
          return 80;
        }
        for (var3 = 0; this.field_b.length > var3; var3++) {
          var4 = this.field_b[var3];
          if (var4.field_c.length > param0) {
            return var3;
          }
          param0 = param0 - (var4.field_c.length - 1);
        }
        return this.field_b.length;
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          var2_int = HoldTheLine.field_F.d(param1, 180);
          var3 = 20 + var2_int * 20;
          var4 = 0 != (qj.field_I & 2) ? nc.field_g : -200 + nc.field_g;
          var5 = (1 & qj.field_I) == 0 ? -var3 + rf.field_X : rf.field_X;
          int var6 = -2 % ((param0 - 12) / 60);
          tc.c(var4, var5, 200, var3, 0, 192);
          tc.a(var4, var5, 200, var3, 16777215);
          HoldTheLine.field_F.a(param1, 10 + var4, var5, 180, var3, 0, -1, 1, 1, 20);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "lm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, String param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HoldTheLine.field_D;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          if (param3 >= -37) {
            this.field_b = (lf[]) null;
          }
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (60 != var9) {
              if (62 == var9) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            return 0;
          }
          stackIn_19_0 = (-param0 + param1 << 8) / var5_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("lm.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 > -32) {
          field_a = -50;
        }
        if (this.field_b != null &&
          0 < this.field_b.length) {
          stackIn_6_0 = -this.field_b[0].field_h + this.field_b[this.field_b.length - 1].field_k;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void b(int param0) {
        if (param0 != -11521) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final int a(byte param0) {
        int var5 = 0;
        int var2;
        int var3;
        lf[] var4;
        lf var6;
        int var8;
        int var7;
        var8 = HoldTheLine.field_D;
        var3 = -127 % ((60 - param0) / 36);
        var2 = -1;
        if (null != this.field_b) {
          var4 = this.field_b;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6 != null) {
              var7 = var6.a((byte) -100);
              if (var2 < var7) {
                var2 = var7;
              }
            }
          }
        }
        return var2;
    }

    static {
        field_a = -1;
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
