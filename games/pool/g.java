/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ma {
    private int[] field_r;
    short[] field_s;
    kp[] field_t;
    byte[] field_n;
    static char[] field_o;
    static String field_w;
    byte[] field_v;
    jg[] field_u;
    byte[] field_p;
    int field_q;
    static int[] field_l;
    static String field_m;

    public static void a(int param0) {
        field_l = null;
        field_w = null;
        field_o = null;
        field_m = null;
        if (param0 != 5893) {
          field_w = (String) null;
        }
    }

    final boolean a(int param0, byte[] param1, int[] param2, cf param3) {
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
        var10 = Pool.field_O;
        try {
          if (param0 != 23605) {
            this.c(35);
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param1 == null ||
              0 != param1[var8]) {
              var9 = this.field_r[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param3.a(param2, var9 >> 2, -1);
                  } else {
                    var7 = param3.b(param2, 6789, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_u[var8] = (jg) (var7);
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
          stackIn_25_1 = new StringBuilder().append("g.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void c(int param0) {
        this.field_r = null;
        if (param0 != 23478) {
          g.a(-24);
        }
    }

    g(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        kp dupTemp$8 = null;
        int incrementValue$5 = 0;
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
        kp[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        kp var15_ref = null;
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
        ge var38 = null;
        byte[] var39 = null;
        kp var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        kp var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        kp var48 = null;
        kp var49 = null;
        kp var50 = null;
        kp var51 = null;
        kp var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
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
          this.field_v = new byte[128];
          this.field_n = new byte[128];
          this.field_r = new int[128];
          this.field_u = new jg[128];
          this.field_p = new byte[128];
          this.field_s = new short[128];
          this.field_t = new kp[128];
          var38 = new ge(param0);
          for (var3 = 0; var38.field_t[var38.field_v + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.e((byte) 105);
          }
          var38.field_v = var38.field_v + 1;
          var3++;
          var5Lifetime1 = var38.field_v;
          var38.field_v = var38.field_v + var3;
          for (var6 = 0; var38.field_t[var38.field_v + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.e((byte) 105);
          }
          var38.field_v = var38.field_v + 1;
          var6++;
          var8Lifetime1 = var38.field_v;
          var38.field_v = var38.field_v + var6;
          for (var9 = 0; var38.field_t[var38.field_v + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.e((byte) 105);
          }
          var38.field_v = var38.field_v + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.g(-119);
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
          var13 = new kp[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new kp();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.g(-74);
            if (var16_int > 0) {
              var15_ref.field_a = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.g(-119);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_l = new byte[var16_intLifetime1 * 2 + 2];
              var40.field_l[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.g(-104);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.g(-68);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_t[var38.field_v + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.e((byte) 105);
          }
          var17++;
          var38.field_v = var38.field_v + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.g(-82);
            this.field_s[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.g(-89);
            this.field_s[var20Lifetime1] = (short)(this.field_s[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.k(-112);
            }
            this.field_s[var23] = (short)(this.field_s[var23] + (rb.b(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.field_r[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; 128 > var24; var24++) {
            if (this.field_r[var24] != 0) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_t[incrementValue$5] - 1;
                if (var21Lifetime1 < var55.length) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
              }
              this.field_p[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_r[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                if (var56.length <= var21Lifetime2) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_t[incrementValue$4] << 2;
              }
              this.field_v[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (this.field_r[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length > var21Lifetime3) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_t[var26] = (kp) (var25);
              var20Lifetime5--;
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20Lifetime6) {
              if (var54.length > var21Lifetime4) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (this.field_r[var27] > 0) {
                var26Lifetime1 = 1 + var38.g(-82);
              }
            }
            var20Lifetime6--;
            this.field_n[var27] = (byte)var26Lifetime1;
          }
          this.field_q = 1 + var38.g(-89);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_a != null) {
              for (var29 = 1; var29 < var45.field_a.length; var29 += 2) {
                var45.field_a[var29] = var38.e((byte) 105);
              }
            }
            if (var45.field_l != null) {
              for (var29Lifetime5 = 3; -2 + var45.field_l.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_l[var29Lifetime5] = var38.e((byte) 105);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.e((byte) 105);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.e((byte) 105);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_l != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_l.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var19Lifetime3 + 1 + var38.g(-91);
                var48.field_l[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_a) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_a.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.g(-88);
                var49.field_a[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.g(-123);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var46.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 - (-1 - var38.g(-105));
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_n[var29Lifetime3] = (byte)(var28 * this.field_n[var29Lifetime3] + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var29Lifetime3Lifetime1 < var46.length) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + (var30 - var27Lifetime6Lifetime1) * var28;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = dg.a((byte) 44, -var27Lifetime6Lifetime1 + var30, var32);
                var32 = var32 + (var31 - var28);
                this.field_n[var33] = (byte)(32 + this.field_n[var33] * var34 >> 6);
              }
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; 128 > var30Lifetime2; var30Lifetime2++) {
              this.field_n[var30Lifetime2] = (byte)(32 + var28 * this.field_n[var30Lifetime2] >> 6);
            }
            var15 = null;
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_e = var38.g(-89);
            }
          } else {
            var19Lifetime6 = var38.g(-97);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var47.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + (1 + var38.g(-121));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (this.field_v[var29Lifetime4] & 255);
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_v[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7) / 2 + var28Lifetime1 * (-var27Lifetime7 + var30Lifetime1Lifetime1);
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = dg.a((byte) 44, -var27Lifetime7 + var30Lifetime1Lifetime1, var32Lifetime1);
                var35 = (255 & this.field_v[var37]) + var34Lifetime1;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                this.field_v[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_v[var30Lifetime1Lifetime2]) + var28Lifetime1;
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (128 < var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_v[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_e = var38.g(-89);
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (var50.field_a != null) {
              var50.field_j = var38.g(-96);
            }
            if (var50.field_l != null) {
              var50.field_g = var38.g(-98);
            }
            if (var50.field_e > 0) {
              var50.field_k = var38.g(-95);
            }
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var13[var27Lifetime9].field_o = var38.g(-99);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_o > 0) {
              var51.field_b = var38.g(-89);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_b > 0) {
              var52.field_n = var38.g(-106);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_208_0 = var2;
          stackIn_208_1 = new StringBuilder().append("g.<init>(");
          if (param0 == null) {
            stackIn_209_2 = "null";
          } else {
            stackIn_209_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_208_0), ((StringBuilder) (Object) stackIn_208_1).append(stackIn_209_2).append(')').toString());
        }
    }

    static {
        field_w = "That concludes the Eight-ball Tutorial! Press <img=3> to go to the options menu to end the tutorial.";
        field_o = new char[]{(char)91, (char)93, (char)35};
        field_m = "Age:";
    }
}
