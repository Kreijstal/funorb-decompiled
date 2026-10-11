/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po extends br {
    private int[] field_r;
    jd[] field_s;
    static int field_n;
    static String field_i;
    static pd field_l;
    static cj field_k;
    short[] field_g;
    byte[] field_j;
    static String field_f;
    int field_o;
    static boolean field_p;
    nj[] field_q;
    byte[] field_h;
    byte[] field_m;

    final static void a(byte param0, int param1) {
        int var2 = 30 / ((param0 - 70) / 37);
        w.field_m = w.field_m | 1 << -param1;
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 != -6930) {
          field_p = true;
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_l = null;
        field_k = null;
        int var1 = -128 / ((4 - param0) / 41);
        field_f = null;
    }

    final static void a(int param0) {
        nk.field_n = new String[mo.field_Kb];
        nk.field_n[7] = kg.field_l;
        nk.field_n[5] = jk.field_e;
        nk.field_n[4] = hp.field_h;
        nk.field_n[18] = op.field_o;
        nk.field_n[21] = lj.field_p;
        nk.field_n[6] = ld.field_Lb;
        nk.field_n[16] = mn.field_n;
        nk.field_n[19] = sd.field_E;
        nk.field_n[13] = vn.field_a;
        nk.field_n[20] = rl.field_c;
        if (param0 != 2) {
          po.d(2);
        }
        nk.field_n[17] = tj.field_d;
        nk.field_n[9] = li.field_z;
        nk.field_n[11] = si.field_D;
        nk.field_n[15] = eh.field_f;
    }

    final static int d(int param0) {
        if (param0 != 12949) {
          return -35;
        }
        return hp.a((byte) -122, g.field_a, 16) + 4;
    }

    final static boolean c(int param0) {
        if (param0 != 128) {
          return true;
        }
        return !tg.field_g.d(-86) ? true : false;
    }

    po(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        nj dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_206_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        nj[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        nj var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        k var38 = null;
        byte[] var39 = null;
        nj var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        nj var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        nj var48 = null;
        nj var49 = null;
        nj var50 = null;
        nj var51 = null;
        nj var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var27Lifetime12;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_q = new nj[128];
          this.field_h = new byte[128];
          this.field_s = new jd[128];
          this.field_m = new byte[128];
          this.field_r = new int[128];
          this.field_g = new short[128];
          this.field_j = new byte[128];
          var38 = new k(param0);
          for (var3 = 0; var38.field_m[var3 + var38.field_j] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.d(-249699580);
          }
          var3++;
          var38.field_j = var38.field_j + 1;
          var5Lifetime1 = var38.field_j;
          var38.field_j = var38.field_j + var3;
          for (var6 = 0; var38.field_m[var6 + var38.field_j] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.d(-249699580);
          }
          var38.field_j = var38.field_j + 1;
          var6++;
          var8Lifetime1 = var38.field_j;
          var38.field_j = var38.field_j + var6;
          for (var9 = 0; 0 != var38.field_m[var9 + var38.field_j]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.d(-249699580);
          }
          var38.field_j = var38.field_j + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (1 < var9) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.g(31365);
              if (var15_int != 0) {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new nj[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new nj();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.g(31365);
            if (var16_int > 0) {
              var15_ref.field_l = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.g(31365);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_e = new byte[2 + var16_intLifetime1 * 2];
              var40.field_e[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.g(31365);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.g(31365);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_m[var17 + var38.field_j] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.d(-249699580);
          }
          var38.field_j = var38.field_j + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.g(31365);
            this.field_g[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.g(31365);
            this.field_g[var20Lifetime1] = (short)(this.field_g[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.a(0);
            }
            this.field_g[var23] = (short)(this.field_g[var23] + (tq.b(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.field_r[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_r[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_m[incrementValue$6];
              }
              this.field_m[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_r[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_m[incrementValue$3] << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              this.field_j[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_r[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              var20Lifetime5--;
              this.field_q[var26] = (nj) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20Lifetime6) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_r[var27] > 0) {
                var26Lifetime1 = 1 + var38.g(31365);
              }
            }
            var20Lifetime6--;
            this.field_h[var27] = (byte)var26Lifetime1;
          }
          this.field_o = 1 + var38.g(31365);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_l != null) {
              for (var29 = 1; var45.field_l.length > var29; var29 += 2) {
                var45.field_l[var29] = var38.d(-249699580);
              }
            }
            if (var45.field_e != null) {
              for (var29Lifetime5 = 3; var45.field_e.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_e[var29Lifetime5] = var38.d(-249699580);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var58.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.d(-249699580);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.d(-249699580);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_e != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_e.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + var19Lifetime3 + var38.g(31365);
                var48.field_e[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_l != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_l.length; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + var19Lifetime4 + var38.g(31365);
                var49.field_l[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.g(31365);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.g(31365) + var19Lifetime5 + 1;
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_h[var29Lifetime3] = (byte)(32 + this.field_h[var29Lifetime3] * var28 >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var58.length > var29Lifetime3Lifetime1; var29Lifetime3Lifetime1 += 2) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + var28 * (var30 - var27Lifetime6Lifetime1);
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = cn.a(-var27Lifetime6Lifetime1 + var30, -95, var32);
                var32 = var32 + (-var28 + var31);
                this.field_h[var33] = (byte)(32 + var34 * this.field_h[var33] >> 6);
              }
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_h[var30Lifetime2] = (byte)(this.field_h[var30Lifetime2] * var28 + 32 >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.g(31365);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var47.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + 1 + var38.g(31365);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7Lifetime1 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = (this.field_j[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_j[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var29Lifetime4Lifetime1 < var47.length) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = cn.a(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, -125, var32Lifetime1);
                var35 = (this.field_j[var37] & 255) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                this.field_j[var37] = (byte)var35;
                var37++;
              }
              var28Lifetime1 = var31Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_j[var30Lifetime1Lifetime2]) + var28Lifetime1;
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_j[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_b = var38.g(31365);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_l) {
              var50.field_c = var38.g(31365);
            }
            if (null != var50.field_e) {
              var50.field_m = var38.g(31365);
            }
            if (var50.field_b > 0) {
              var50.field_i = var38.g(31365);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_k = var38.g(31365);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_k > 0) {
              var51.field_g = var38.g(31365);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_g > 0) {
              var52.field_j = var38.g(31365);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("po.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    final boolean a(me param0, int param1, byte[] param2, int[] param3) {
        int var8 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = 1;
          if (param1 < 39) {
            po.c(-70);
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param2 == null ||
              param2[var8] != 0) {
              var9 = this.field_r[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param0.a(var9 >> 2, param3, 115);
                  } else {
                    var7 = param0.a(var9 >> 2, (byte) -64, param3);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_s[var8] = (jd) (var7);
                  this.field_r[var8] = 0;
                }
              }
            }
          }
          stackIn_22_0 = var5_int;
          return stackIn_22_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("po.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_f = "Searching for an opponent";
        field_i = "";
        field_p = false;
    }
}
