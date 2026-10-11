/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends o {
    private int[] field_o;
    dl[] field_r;
    int field_n;
    lm[] field_s;
    byte[] field_l;
    short[] field_p;
    byte[] field_k;
    byte[] field_q;
    static aj field_j;
    static String field_m;
    static ci field_t;
    static int field_u;

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            ph.field_j.a(param3, 12105912, var4, param0);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          if (param1 != 98) {
            var5 = (java.awt.Canvas) null;
            kf.a(-46, (byte) 59, (java.awt.Canvas) null, -92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 != -101) {
          kf.a(14);
        }
        field_m = null;
        field_t = null;
    }

    final boolean a(int[] param0, fe param1, byte param2, byte[] param3) {
        int var8 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        var10 = Chess.field_G;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          if (param2 != -73) {
            var11 = (byte[]) null;
            this.a((int[]) null, (fe) null, (byte) -119, (byte[]) null);
          }
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_o[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if (0 == (1 & var9)) {
                    var7 = param1.a(param0, var9 >> 2, param2 + 968449273);
                  } else {
                    var7 = param1.a(var9 >> 2, param0, (byte) -48);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_s[var8] = (lm) (var7);
                  this.field_o[var8] = 0;
                }
              }
            }
          }
          stackIn_23_0 = var5_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("kf.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void e(int param0) {
        this.field_o = null;
        if (param0 <= 45) {
          byte[] var3 = (byte[]) null;
          this.a((int[]) null, (fe) null, (byte) 87, (byte[]) null);
        }
    }

    kf(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        dl dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$4 = 0;
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
        dl[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        dl var15_ref = null;
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
        p var38 = null;
        byte[] var39 = null;
        dl var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dl var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dl var48 = null;
        dl var49 = null;
        dl var50 = null;
        dl var51 = null;
        dl var52 = null;
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
          this.field_r = new dl[128];
          this.field_q = new byte[128];
          this.field_k = new byte[128];
          this.field_o = new int[128];
          this.field_p = new short[128];
          this.field_s = new lm[128];
          this.field_l = new byte[128];
          var38 = new p(param0);
          for (var3 = 0; 0 != var38.field_o[var38.field_l + var3]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.g(0);
          }
          var38.field_l = var38.field_l + 1;
          var3++;
          var5Lifetime1 = var38.field_l;
          var38.field_l = var38.field_l + var3;
          for (var6 = 0; var38.field_o[var38.field_l + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.g(0);
          }
          var38.field_l = var38.field_l + 1;
          var6++;
          var8Lifetime1 = var38.field_l;
          var38.field_l = var38.field_l + var6;
          for (var9 = 0; 0 != var38.field_o[var38.field_l + var9]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.g(0);
          }
          var9++;
          var38.field_l = var38.field_l + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.i(-77);
              if (var15_int != 0) {
                if (var13_int >= var15_int) {
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
          var13 = new dl[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new dl();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.i(-94);
            if (var16_int > 0) {
              var15_ref.field_a = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.i(-111);
            if (0 < var16_intLifetime1) {
              var15_ref.field_k = new byte[2 * var16_intLifetime1 + 2];
              var40.field_k[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.i(-125);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.i(-77);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_o[var17 + var38.field_l] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.g(0);
          }
          var38.field_l = var38.field_l + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.i(-78);
            this.field_p[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.i(-98);
            this.field_p[var20Lifetime1] = (short)(this.field_p[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.c((byte) 58);
            }
            this.field_p[var23] = (short)(this.field_p[var23] + ce.a(32768, -1 + var22 << 14));
            this.field_o[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_o[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_o[incrementValue$6] - 1;
              }
              this.field_l[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_o[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_o[incrementValue$4] + 16 << 2;
              }
              var20Lifetime4--;
              this.field_q[var25_int] = (byte)var24Lifetime1;
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
              this.field_r[var26] = (dl) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_o[var27] > 0) {
                var26Lifetime1 = 1 + var38.i(-128);
              }
            }
            this.field_k[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_n = 1 + var38.i(-86);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_a != null) {
              for (var29 = 1; var29 < var45.field_a.length; var29 += 2) {
                var45.field_a[var29] = var38.g(0);
              }
            }
            if (null != var45.field_k) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.field_k.length - 2; var29Lifetime5 += 2) {
                var45.field_k[var29Lifetime5] = var38.g(0);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.g(0);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.g(0);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (null != var48.field_k) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_k.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.i(-83));
                var48.field_k[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_a) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_a.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.i(-120) + var19Lifetime4 + 1;
                var49.field_a[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.i(-109);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.i(-106) + var19Lifetime5 + 1;
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_k[var29Lifetime3] = (byte)(32 + var28 * this.field_k[var29Lifetime3] >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var46.length > var29Lifetime3Lifetime1; var29Lifetime3Lifetime1 += 2) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + (-var27Lifetime6Lifetime1 + var30) * var28;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = hf.a(var32, 1022407519, var30 - var27Lifetime6Lifetime1);
                this.field_k[var33] = (byte)(32 + this.field_k[var33] * var34 >> 6);
                var32 = var32 + (var31 - var28);
              }
              var27Lifetime6Lifetime1 = var30;
              var28 = var31;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_k[var30Lifetime2] = (byte)(32 + var28 * this.field_k[var30Lifetime2] >> 6);
            }
            var15 = null;
          }
          if (null != var16) {
            var19Lifetime6 = var38.i(-106);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + (var19Lifetime6 + var38.i(-112));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (this.field_q[var29Lifetime4] & 255);
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_q[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = var28Lifetime1 * (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = hf.a(var32Lifetime1, 1022407519, -var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1);
                var35 = (this.field_q[var37] & 255) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_q[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.field_q[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_q[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_b = var38.i(-91);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_a) {
              var50.field_l = var38.i(-123);
            }
            if (var50.field_k != null) {
              var50.field_d = var38.i(-95);
            }
            if (var50.field_b > 0) {
              var50.field_i = var38.i(-101);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_e = var38.i(-112);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (0 < var51.field_e) {
              var51.field_g = var38.i(-108);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_g > 0) {
              var52.field_f = var38.i(-93);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("kf.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    final static boolean d(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        java.awt.Canvas var3 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = lg.field_d;
        synchronized (var1_ref) {
          if (ph.field_h == ta.field_y) {
            return false;
          }
          vg.field_a = ag.field_a[ph.field_h];
          d.field_Ib = hj.field_a[ph.field_h];
          if (param0 != 18954) {
            var3 = (java.awt.Canvas) null;
            kf.a(-30, (byte) -26, (java.awt.Canvas) null, 72);
          }
          ph.field_h = 127 & 1 + ph.field_h;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        if (an.field_c) {
          rc.b(0);
        }
        if (param0 > -70) {
          kf.a(89);
        }
    }

    static {
        field_m = "Find opponent";
    }
}
