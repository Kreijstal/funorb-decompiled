/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends li {
    byte[] field_p;
    byte[] field_B;
    static int field_z;
    byte[] field_q;
    private int[] field_u;
    static int[] field_s;
    ae[] field_r;
    short[] field_n;
    static int[] field_x;
    gl[] field_v;
    static int[] field_o;
    int field_w;
    static String[] field_A;
    static String[] field_y;
    static int field_t;

    final static void a(byte param0) {
        if (param0 != -41) {
          field_A = (String[]) null;
        }
        rc.field_d = null;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != -94) {
          al.a((byte) 42);
        }
        return 0 <= param0 ? true : false;
    }

    final boolean a(int param0, byte[] param1, id param2, int[] param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var10 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var9 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = param0; var8 < 128; var8++) {
            if (param1 == null ||
              param1[var8] != 0) {
              var9 = this.field_u[var8];
              if (0 != var9) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if (0 != (var9 & 1)) {
                    var7 = param2.a(param3, 64, var9 >> 2);
                  } else {
                    var7 = param2.a(false, param3, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_r[var8] = (ae) (var7);
                  this.field_u[var8] = 0;
                }
              }
            }
          }
          stackIn_21_0 = var5_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("al.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_y = null;
        field_A = null;
        if (param0 != -1216) {
          al.a(-62, (byte) -35);
        }
        field_s = null;
        field_x = null;
        field_o = null;
    }

    al(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        gl dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$4 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_209_2 = null;
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
        gl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        gl var15_ref = null;
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
        ed var38 = null;
        byte[] var39 = null;
        gl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gl var48 = null;
        gl var49 = null;
        gl var50 = null;
        gl var51 = null;
        gl var52 = null;
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
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_u = new int[128];
          this.field_q = new byte[128];
          this.field_p = new byte[128];
          this.field_r = new ae[128];
          this.field_B = new byte[128];
          this.field_n = new short[128];
          this.field_v = new gl[128];
          var38 = new ed(param0);
          for (var3 = 0; var38.field_p[var38.field_u + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.g(101);
          }
          var38.field_u = var38.field_u + 1;
          var3++;
          var5Lifetime1 = var38.field_u;
          var38.field_u = var38.field_u + var3;
          for (var6 = 0; var38.field_p[var38.field_u + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.g(89);
          }
          var6++;
          var38.field_u = var38.field_u + 1;
          var8Lifetime1 = var38.field_u;
          var38.field_u = var38.field_u + var6;
          for (var9 = 0; var38.field_p[var38.field_u + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.g(125);
          }
          var38.field_u = var38.field_u + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (1 < var9) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.h(-11);
              if (var15_int == 0) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new gl[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new gl();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.h(-11);
            if (var16_int > 0) {
              var15_ref.field_e = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.h(-11);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_g = new byte[2 + var16_intLifetime1 * 2];
              var40.field_g[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.h(-11);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.h(-11);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_p[var17 + var38.field_u] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.g(87);
          }
          var38.field_u = var38.field_u + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.h(-11);
            this.field_n[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.h(-11);
            this.field_n[var20Lifetime1] = (short)(this.field_n[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 < var54.length) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.a(false);
            }
            this.field_n[var23] = (short)(this.field_n[var23] + (b.a(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.field_u[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_u[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_p[incrementValue$6];
              }
              this.field_q[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_u[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_p[incrementValue$4] + 16 << 2;
              }
              this.field_B[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_u[var26] != 0) {
              if (0 == var20Lifetime5) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length > var21Lifetime3) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_v[var26] = (gl) (var25);
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var54.length <= var21Lifetime4) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_u[var27] > 0) {
                var26Lifetime1 = var38.h(-11) + 1;
              }
            }
            this.field_p[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_w = var38.h(-11) + 1;
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_e != null) {
              for (var29 = 1; var45.field_e.length > var29; var29 += 2) {
                var45.field_e[var29] = var38.g(88);
              }
            }
            if (var45.field_g != null) {
              for (var29Lifetime5 = 3; var29Lifetime5 < -2 + var45.field_g.length; var29Lifetime5 += 2) {
                var45.field_g[var29Lifetime5] = var38.g(98);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var58.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.g(108);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.g(114);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_g != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_g.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.h(-11) + 1 + var19Lifetime3;
                var48.field_g[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_e != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_e.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.h(-11);
                var49.field_e[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.h(-11);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var58.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + (var19Lifetime5 + var38.h(-11));
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_p[var29Lifetime3] = (byte)(this.field_p[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = var28 * (-var27Lifetime6Lifetime1 + var30) + (var30 - var27Lifetime6Lifetime1) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = lj.a(var32, false, -var27Lifetime6Lifetime1 + var30);
                this.field_p[var33] = (byte)(32 + this.field_p[var33] * var34 >> 6);
                var32 = var32 + (-var28 + var31);
              }
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_p[var30Lifetime2] = (byte)(var28 * this.field_p[var30Lifetime2] + 32 >> 6);
            }
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_n = var38.h(-11);
            }
          } else {
            var19Lifetime6 = var38.h(-11);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + (1 + var38.h(-11));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = (this.field_B[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_B[var29Lifetime4] = (byte)var30Lifetime1;
            }
            for (var29Lifetime4Lifetime1 = 2; var29Lifetime4Lifetime1 < var47.length; var29Lifetime4Lifetime1 += 2) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7) / 2 + var28Lifetime1 * (-var27Lifetime7 + var30Lifetime1Lifetime1);
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = lj.a(var32Lifetime1, false, var30Lifetime1Lifetime1 - var27Lifetime7);
                var35 = (255 & this.field_B[var37]) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                this.field_B[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7 = var30Lifetime1Lifetime1;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (this.field_B[var30Lifetime1Lifetime2] & 255);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (128 < var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_B[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_n = var38.h(-11);
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (null != var50.field_e) {
              var50.field_h = var38.h(-11);
            }
            if (null != var50.field_g) {
              var50.field_j = var38.h(-11);
            }
            if (var50.field_n > 0) {
              var50.field_f = var38.h(-11);
            }
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var13[var27Lifetime9].field_b = var38.h(-11);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_b > 0) {
              var51.field_c = var38.h(-11);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (0 < var52.field_c) {
              var52.field_d = var38.h(-11);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_208_0 = var2;
          stackIn_208_1 = new StringBuilder().append("al.<init>(");
          if (param0 == null) {
            stackIn_209_2 = "null";
          } else {
            stackIn_209_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_208_0), ((StringBuilder) (Object) stackIn_208_1).append(stackIn_209_2).append(')').toString());
        }
    }

    static {
        int var0 = Math.max(2, 3);
        field_A = new String[12 * var0];
        field_x = new int[12 * var0];
        field_o = new int[12 * var0];
    }
}
