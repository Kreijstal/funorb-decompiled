/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends wf {
    private int[] field_o;
    static int field_l;
    byte[] field_p;
    hb[] field_j;
    static j field_i;
    nh[] field_m;
    short[] field_k;
    int field_h;
    byte[] field_g;
    byte[] field_n;

    final void d(int param0) {
        if (param0 <= 56) {
          field_i = (j) null;
        }
        this.field_o = null;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 < 74) {
          field_i = (j) null;
        }
    }

    final boolean a(bl param0, int[] param1, int param2, byte[] param3) {
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param2 != -1) {
            return false;
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_o[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param0.a(param1, var9 >> 2, (byte) 17);
                  } else {
                    var7 = param0.a(param2 + 1673501265, var9 >> 2, param1);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_j[var8] = (hb) (var7);
                  this.field_o[var8] = 0;
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
          stackIn_25_1 = new StringBuilder().append("si.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    si(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        nh dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_208_2 = null;
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
        nh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        nh var15_ref = null;
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
        oa var38 = null;
        byte[] var39 = null;
        nh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        nh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        nh var48 = null;
        nh var49 = null;
        nh var50 = null;
        nh var51 = null;
        nh var52 = null;
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
          this.field_p = new byte[128];
          this.field_o = new int[128];
          this.field_k = new short[128];
          this.field_n = new byte[128];
          this.field_j = new hb[128];
          this.field_g = new byte[128];
          this.field_m = new nh[128];
          var38 = new oa(param0);
          for (var3 = 0; var38.field_g[var3 + var38.field_h] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.b(true);
          }
          var38.field_h = var38.field_h + 1;
          var3++;
          var5Lifetime1 = var38.field_h;
          var38.field_h = var38.field_h + var3;
          for (var6 = 0; var38.field_g[var38.field_h + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.b(true);
          }
          var6++;
          var38.field_h = var38.field_h + 1;
          var8Lifetime1 = var38.field_h;
          var38.field_h = var38.field_h + var6;
          for (var9 = 0; var38.field_g[var38.field_h + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.b(true);
          }
          var38.field_h = var38.field_h + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.d((byte) 72);
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
          var13 = new nh[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new nh();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.d((byte) 63);
            if (0 < var16_int) {
              var15_ref.field_g = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.d((byte) 90);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_c = new byte[2 + var16_intLifetime1 * 2];
              var40.field_c[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.d((byte) 91);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.d((byte) 87);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_g[var17 + var38.field_h] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.b(true);
          }
          var17++;
          var38.field_h = var38.field_h + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.d((byte) 45);
            this.field_k[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.d((byte) 56);
            this.field_k[var20Lifetime1] = (short)(this.field_k[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var54.length <= var21) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.i(17783);
            }
            this.field_k[var23] = (short)(this.field_k[var23] + (vg.c(2, var22 - 1) << 14));
            this.field_o[var23] = var22;
            var20Lifetime2--;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_o[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length > var21Lifetime1) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_g[incrementValue$6] - 1;
              }
              this.field_g[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_o[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_g[incrementValue$3] + 16 << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              this.field_p[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (this.field_o[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_m[var26] = (nh) (var25);
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
              if (this.field_o[var27] > 0) {
                var26Lifetime1 = var38.d((byte) 99) + 1;
              }
            }
            this.field_n[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_h = 1 + var38.d((byte) 22);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_g) {
              for (var29 = 1; var45.field_g.length > var29; var29 += 2) {
                var45.field_g[var29] = var38.b(true);
              }
            }
            if (null != var45.field_c) {
              for (var29Lifetime5 = 3; var45.field_c.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_c[var29Lifetime5] = var38.b(true);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var58.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.b(true);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.b(true);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_c != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_c.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var19Lifetime3 + (1 + var38.d((byte) 86));
                var48.field_c[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_g) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_g.length; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + var19Lifetime4 + var38.d((byte) 71);
                var49.field_g[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.d((byte) 99);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.d((byte) 98) + var19Lifetime5 + 1;
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_n[var29Lifetime3] = (byte)(this.field_n[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var29Lifetime3Lifetime1 < var58.length) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (-var27Lifetime6Lifetime1 + var30) / 2 + var28 * (var30 - var27Lifetime6Lifetime1);
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = dh.b(15, var30 - var27Lifetime6Lifetime1, var32);
                var32 = var32 + (-var28 + var31);
                this.field_n[var33] = (byte)(32 + var34 * this.field_n[var33] >> 6);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_n[var30Lifetime2] = (byte)(this.field_n[var30Lifetime2] * var28 + 32 >> 6);
            }
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_k = var38.d((byte) 90);
            }
          } else {
            var19Lifetime6 = var38.d((byte) 53);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.d((byte) 38) + var19Lifetime6 + 1;
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.field_p[var29Lifetime4]);
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_p[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7) * var28Lifetime1 + (var30Lifetime1Lifetime1 - var27Lifetime7) / 2;
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = dh.b(15, -var27Lifetime7 + var30Lifetime1Lifetime1, var32Lifetime1);
                var35 = var34Lifetime1 + (255 & this.field_p[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                this.field_p[var37] = (byte)var35;
                var37++;
              }
              var28Lifetime1 = var31Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.field_p[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_p[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_k = var38.d((byte) 90);
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (var50.field_g != null) {
              var50.field_f = var38.d((byte) 50);
            }
            if (null != var50.field_c) {
              var50.field_d = var38.d((byte) 125);
            }
            if (var50.field_k > 0) {
              var50.field_b = var38.d((byte) 22);
            }
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var13[var27Lifetime9].field_a = var38.d((byte) 113);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_a > 0) {
              var51.field_e = var38.d((byte) 125);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_e > 0) {
              var52.field_i = var38.d((byte) 92);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_207_0 = var2;
          stackIn_207_1 = new StringBuilder().append("si.<init>(");
          if (param0 == null) {
            stackIn_208_2 = "null";
          } else {
            stackIn_208_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_207_0), ((StringBuilder) (Object) stackIn_207_1).append(stackIn_208_2).append(')').toString());
        }
    }

    static {
        field_i = new j(8, 161, 247);
    }
}
