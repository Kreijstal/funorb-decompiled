/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends am {
    pl[] field_o;
    static long field_n;
    static int field_m;
    static char[] field_h;
    byte[] field_l;
    short[] field_r;
    int field_j;
    static String field_p;
    private int[] field_k;
    byte[] field_s;
    jb[] field_q;
    byte[] field_i;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 != -29205) {
            return true;
          }
          while (param0.length() > var2_int) {
            var3 = param0.charAt(var2_int);
            if (!il.a((char) var3, (byte) -90) &&
              !qh.a((char) var3, -49)) {
              return true;
            }
            var2_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("nf.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int[] a(boolean param0) {
        if (param0) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void a(p param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          param0.field_e = param0.field_e - 1;
          param0.field_l.a(1, (byte) 94, param0.field_c);
          if (param1 != 70) {
            field_h = (char[]) null;
          }
          if (param0.field_e <= 0) {
            param0.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nf.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_p = null;
        if (param0 != 118) {
          nf.a(false);
        }
    }

    final boolean a(int[] param0, byte[] param1, rd param2, int param3) {
        int var8 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          if (param3 != -20752) {
            this.field_q = (jb[]) null;
          }
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param1 == null ||
              param1[var8] != 0) {
              var9 = this.field_k[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) == 0) {
                    var7 = param2.a(param0, param3 + 20880, var9 >> 2);
                  } else {
                    var7 = param2.a((byte) -93, param0, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_q[var8] = (jb) (var7);
                  this.field_k[var8] = 0;
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
          stackIn_24_1 = new StringBuilder().append("nf.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    nf(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        pl dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_207_2 = null;
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
        pl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        pl var15_ref = null;
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
        int var28_int = 0;
        pl var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        vi var38 = null;
        byte[] var39 = null;
        pl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        pl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        pl var48 = null;
        pl var49 = null;
        pl var50 = null;
        pl var51 = null;
        pl var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        pl var28Lifetime1;
        pl var28Lifetime2;
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
        int var28_intLifetime1;
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
          this.field_o = new pl[128];
          this.field_r = new short[128];
          this.field_s = new byte[128];
          this.field_l = new byte[128];
          this.field_q = new jb[128];
          this.field_i = new byte[128];
          this.field_k = new int[128];
          var38 = new vi(param0);
          for (var3 = 0; 0 != var38.field_n[var38.field_i + var3]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.j(0);
          }
          var3++;
          var38.field_i = var38.field_i + 1;
          var5Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var3;
          for (var6 = 0; var38.field_n[var38.field_i + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.j(0);
          }
          var38.field_i = var38.field_i + 1;
          var6++;
          var8Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var6;
          for (var9 = 0; var38.field_n[var9 + var38.field_i] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.j(0);
          }
          var9++;
          var38.field_i = var38.field_i + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.l(32270);
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
          var13 = new pl[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new pl();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.l(32270);
            if (var16_int > 0) {
              var15_ref.field_n = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.l(32270);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_m = new byte[2 + 2 * var16_intLifetime1];
              var40.field_m[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.l(32270);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.l(32270);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_n[var17 + var38.field_i] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.j(0);
          }
          var17++;
          var38.field_i = var38.field_i + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.l(32270);
            this.field_r[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.l(32270);
            this.field_r[var20Lifetime1] = (short)(this.field_r[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 < var54.length) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.m(127);
            }
            this.field_r[var23] = (short)(this.field_r[var23] + (ua.a(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.field_k[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_k[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var21Lifetime1 < var55.length) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_n[incrementValue$6] - 1;
              }
              this.field_s[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (this.field_k[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_n[incrementValue$3] << 2;
                if (var56.length <= var21Lifetime2) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              var20Lifetime4--;
              this.field_l[var25_int] = (byte)var24Lifetime1;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (this.field_k[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length > var21Lifetime3) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_o[var26] = (pl) (var25);
              var20Lifetime5--;
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 < var54.length) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (this.field_k[var27] > 0) {
                var26Lifetime1 = 1 + var38.l(32270);
              }
            }
            var20Lifetime6--;
            this.field_i[var27] = (byte)var26Lifetime1;
          }
          this.field_j = var38.l(32270) + 1;
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_n) {
              for (var29 = 1; var45.field_n.length > var29; var29 += 2) {
                var45.field_n[var29] = var38.j(0);
              }
            }
            if (var45.field_m != null) {
              for (var29Lifetime5 = 3; -2 + var45.field_m.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_m[var29Lifetime5] = var38.j(0);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.j(0);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.j(0);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (var48.field_m != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_m.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.l(32270) + var19Lifetime3 + 1;
                var48.field_m[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            var28Lifetime1 = var49;
            if (var49.field_n != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_n.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.l(32270) + var19Lifetime4 + 1;
                var49.field_n[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.l(32270);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var46.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.l(32270) + 1 + var19Lifetime5;
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_i[var29Lifetime3] = (byte)(32 + this.field_i[var29Lifetime3] * var28_int >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + var28_int * (var30 - var27Lifetime6Lifetime1);
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = um.a(var30 - var27Lifetime6Lifetime1, var32, 10179);
                var32 = var32 + (-var28_int + var31);
                this.field_i[var33] = (byte)(var34 * this.field_i[var33] + 32 >> 6);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28_int = var31;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_i[var30Lifetime2] = (byte)(var28_int * this.field_i[var30Lifetime2] + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.l(32270);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 - (-1 - var38.l(32270));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28_intLifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (255 & this.field_l[var29Lifetime4]) + var28_intLifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_l[var29Lifetime4] = (byte)var30Lifetime1;
            }
            for (var29Lifetime4Lifetime1 = 2; var29Lifetime4Lifetime1 < var47.length; var29Lifetime4Lifetime1 += 2) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28_intLifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = um.a(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, var32Lifetime1, 10179);
                var35 = var34Lifetime1 + (255 & this.field_l[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28_intLifetime1);
                this.field_l[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var28_intLifetime1 = var31Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28_intLifetime1 + (255 & this.field_l[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (128 < var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_l[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_b = var38.l(32270);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime2 = var50;
            if (null != var50.field_n) {
              var50.field_o = var38.l(32270);
            }
            if (var50.field_m != null) {
              var28Lifetime2.field_c = var38.l(32270);
            }
            if (var28Lifetime2.field_b > 0) {
              var28Lifetime2.field_h = var38.l(32270);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_e = var38.l(32270);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_e > 0) {
              var51.field_g = var38.l(32270);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_g > 0) {
              var52.field_d = var38.l(32270);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("nf.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
        field_n = 0L;
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_p = "Empty";
    }
}
