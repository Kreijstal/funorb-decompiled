/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends vg {
    byte[] field_j;
    byte[] field_l;
    int field_i;
    short[] field_g;
    bq[] field_m;
    static iv field_n;
    u[] field_h;
    private int[] field_k;
    byte[] field_f;

    final void a(boolean param0) {
        this.field_k = null;
        if (param0) {
          tn.a(-65);
        }
    }

    final boolean a(int param0, byte[] param1, nda param2, int[] param3) {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 1;
          if (param0 != -5853) {
            this.field_f = (byte[]) null;
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; 128 > var8; var8++) {
            if (param1 == null ||
              0 != param1[var8]) {
              var9 = this.field_k[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if (0 != (var9 & 1)) {
                    var7 = param2.a((byte) -32, param3, var9 >> 2);
                  } else {
                    var7 = param2.a(var9 >> 2, param3, 0);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_h[var8] = (u) (var7);
                  this.field_k[var8] = 0;
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
          stackIn_25_1 = new StringBuilder().append("tn.C(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 != 94) {
          field_n = (iv) null;
        }
    }

    final static String a(int param0) {
        if (param0 != -10918) {
          tn.a(120);
        }
        if (cga.field_f < 2) {
          return ub.field_b;
        }
        if (nja.field_J != null) {
          if (!nja.field_J.b(-60)) {
            return hra.field_c;
          }
          return voa.field_s;
        }
        if (!tk.field_b.b(-97)) {
          return cv.field_r;
        }
        if (!tk.field_b.c("commonui", param0 ^ 10971)) {
          return q.field_o + " - " + tk.field_b.a("commonui", true) + "%";
        }
        if (!hm.field_n.b(-99)) {
          return hua.field_a;
        }
        if (!hm.field_n.c("commonui", -128)) {
          return vja.field_b + " - " + hm.field_n.a("commonui", true) + "%";
        }
        if (!vc.field_p.b(param0 + 10827)) {
          return wt.field_b;
        }
        if (!vc.field_p.a(0)) {
          return th.field_u + " - " + vc.field_p.a(true) + "%";
        }
        return dt.field_n;
    }

    tn(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        bq dupTemp$8 = null;
        int incrementValue$5 = 0;
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
        bq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        bq var15_ref = null;
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
        bq var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        uia var38 = null;
        byte[] var39 = null;
        bq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        bq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        bq var48 = null;
        bq var49 = null;
        bq var50 = null;
        bq var51 = null;
        bq var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        bq var28Lifetime1;
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
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_l = new byte[128];
          this.field_h = new u[128];
          this.field_j = new byte[128];
          this.field_k = new int[128];
          this.field_f = new byte[128];
          this.field_m = new bq[128];
          this.field_g = new short[128];
          var38 = new uia(param0);
          for (var3 = 0; var38.field_g[var3 + var38.field_h] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.c((byte) 49);
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
            var7[var8] = var38.c((byte) 63);
          }
          var6++;
          var38.field_h = var38.field_h + 1;
          var8Lifetime1 = var38.field_h;
          var38.field_h = var38.field_h + var6;
          for (var9 = 0; 0 != var38.field_g[var9 + var38.field_h]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.c((byte) 124);
          }
          var9++;
          var38.field_h = var38.field_h + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (1 < var9) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.h(255);
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
          var13 = new bq[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new bq();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.h(255);
            if (var16_int > 0) {
              var15_ref.field_m = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.h(255);
            if (0 < var16_intLifetime1) {
              var15_ref.field_g = new byte[2 + 2 * var16_intLifetime1];
              var40.field_g[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.h(255);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.h(255);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; var38.field_g[var17 + var38.field_h] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.c((byte) 86);
          }
          var38.field_h = var38.field_h + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.h(255);
            this.field_g[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.h(255);
            this.field_g[var20Lifetime1] = (short)(this.field_g[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var54.length > var21) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.b((byte) -123);
            }
            this.field_g[var23] = (short)(this.field_g[var23] + (sea.c(-1 + var22, 2) << 14));
            var20Lifetime2--;
            this.field_k[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_k[var24] != 0) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_g[incrementValue$5];
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.field_f[var24] = (byte)var23Lifetime1;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_k[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_g[incrementValue$3] + 16 << 2;
                if (var21Lifetime2 >= var56.length) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              this.field_l[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (0 != this.field_k[var26]) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_m[var26] = (bq) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20Lifetime6) {
              if (var54.length <= var21Lifetime4) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_k[var27] > 0) {
                var26Lifetime1 = var38.h(255) + 1;
              }
            }
            this.field_j[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_i = 1 + var38.h(255);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_m) {
              for (var29 = 1; var29 < var45.field_m.length; var29 += 2) {
                var45.field_m[var29] = var38.c((byte) 124);
              }
            }
            if (null != var45.field_g) {
              for (var29Lifetime5 = 3; -2 + var45.field_g.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_g[var29Lifetime5] = var38.c((byte) 81);
              }
            }
          }
          if (null != var15) {
            for (var27Lifetime2 = 1; var46.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.c((byte) 63);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var58.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.c((byte) 44);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_g) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_g.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.h(255));
                var48.field_g[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_m != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_m.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.h(255) + (1 + var19Lifetime4);
                var49.field_m[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.h(255);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + var19Lifetime5 + var38.h(255);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_j[var29Lifetime3] = (byte)(32 + this.field_j[var29Lifetime3] * var28_int >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + (var30 - var27Lifetime6Lifetime1) * var28_int;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = go.e(-1, var32, -var27Lifetime6Lifetime1 + var30);
                this.field_j[var33] = (byte)(var34 * this.field_j[var33] + 32 >> 6);
                var32 = var32 + (-var28_int + var31);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28_int = var31;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_j[var30Lifetime2] = (byte)(32 + this.field_j[var30Lifetime2] * var28_int >> 6);
            }
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_n = var38.h(255);
            }
          } else {
            var19Lifetime6 = var38.h(255);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var58.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.h(255) + (var19Lifetime6 + 1);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var58[0];
            var28_intLifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = (this.field_l[var29Lifetime4] & 255) + var28_intLifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_l[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var58.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = var28_intLifetime1 * (-var27Lifetime7 + var30Lifetime1Lifetime1) + (-var27Lifetime7 + var30Lifetime1Lifetime1) / 2;
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = go.e(-1, var32Lifetime1, -var27Lifetime7 + var30Lifetime1Lifetime1);
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
              var28_intLifetime1 = var31Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28_intLifetime1 + (this.field_l[var30Lifetime1Lifetime2] & 255);
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (128 < var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_l[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_n = var38.h(255);
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            var28Lifetime1 = var50;
            if (var50.field_m != null) {
              var50.field_i = var38.h(255);
            }
            if (null != var50.field_g) {
              var28Lifetime1.field_f = var38.h(255);
            }
            if (0 < var28Lifetime1.field_n) {
              var28Lifetime1.field_c = var38.h(255);
            }
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var13[var27Lifetime9].field_d = var38.h(255);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_d > 0) {
              var51.field_l = var38.h(255);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_l > 0) {
              var52.field_j = var38.h(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("tn.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
    }
}
