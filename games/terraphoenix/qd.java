/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends uf {
    static int field_l;
    static String field_j;
    static String[] field_h;
    short[] field_p;
    gm[] field_q;
    byte[] field_m;
    gg[] field_n;
    int field_k;
    byte[] field_r;
    static volatile int field_i;
    private int[] field_o;
    byte[] field_s;

    final void d(byte param0) {
        this.field_o = null;
        if (param0 <= 35) {
          vi var3 = (vi) null;
          qd.a(-83, 2, (vi) null);
        }
    }

    final static void a(int param0, int param1, vi param2) {
        uc var5 = null;
        int var4 = 0;
        try {
          var5 = di.field_l;
          var5.k(-17410, param0);
          var5.field_k = var5.field_k + 1;
          var4 = var5.field_k;
          var5.i(1, -95);
          var5.i(param2.field_l, -110);
          var5.a((byte) -107, param2.field_s);
          var5.e(param2.field_i, param1 ^ -15940);
          var5.e(param2.field_m, 8959);
          var5.e(param2.field_r, 8959);
          var5.e(param2.field_k, param1 ^ -15940);
          if (param1 != -7357) {
            qd.$cfr$intArgs$a$e9dea5688aa5(-69, -70);
          }
          var5.d(var4, 8600);
          var5.j(var5.field_k - var4, -119);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "qd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 < 93) {
          return;
        }
        field_j = null;
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 15) {
          return;
        }
        if (eh.field_g[param1] != null) {
          gb.field_E.a(eh.field_g[param1], 100, ua.field_e * pe.field_f[param1] / 128);
        }
    }

    final boolean a(byte[] param0, int[] param1, int param2, da param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Terraphoenix.field_V;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = param2; var8 < 128; var8++) {
            if (param0 == null ||
              param0[var8] != 0) {
              var9 = this.field_o[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) != 0) {
                    var7 = param3.a((byte) -21, param1, var9 >> 2);
                  } else {
                    var7 = param3.a((byte) -106, var9 >> 2, param1);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_n[var8] = (gg) (var7);
                  this.field_o[var8] = 0;
                }
              }
            }
          }
          stackIn_18_0 = var5_int;
          return stackIn_18_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("qd.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Terraphoenix.field_V;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 - 64);
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + var6 + 27);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          if (param0 > -46) {
            field_l = -83;
          }
          while (var2_long % 37L == 0L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_23_0 = var2_long;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("qd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    qd(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        gm dupTemp$8 = null;
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
        gm[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        gm var15_ref = null;
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
        gm var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        dh var38 = null;
        byte[] var39 = null;
        gm var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        gm var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        gm var48 = null;
        gm var49 = null;
        gm var50 = null;
        gm var51 = null;
        gm var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        gm var28Lifetime1;
        gm var28Lifetime2;
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
          this.field_s = new byte[128];
          this.field_q = new gm[128];
          this.field_p = new short[128];
          this.field_o = new int[128];
          this.field_n = new gg[128];
          this.field_r = new byte[128];
          this.field_m = new byte[128];
          var38 = new dh(param0);
          for (var3 = 0; var38.field_i[var3 + var38.field_k] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.f(2);
          }
          var38.field_k = var38.field_k + 1;
          var3++;
          var5Lifetime1 = var38.field_k;
          var38.field_k = var38.field_k + var3;
          for (var6 = 0; var38.field_i[var38.field_k + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.f(2);
          }
          var38.field_k = var38.field_k + 1;
          var6++;
          var8Lifetime1 = var38.field_k;
          var38.field_k = var38.field_k + var6;
          for (var9 = 0; var38.field_i[var9 + var38.field_k] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.f(2);
          }
          var9++;
          var38.field_k = var38.field_k + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.a(-16384);
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
          var13 = new gm[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new gm();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.a(-16384);
            if (var16_int > 0) {
              var15_ref.field_h = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.a(-16384);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_g = new byte[2 + var16_intLifetime1 * 2];
              var40.field_g[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.a(-16384);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.a(-16384);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_i[var38.field_k + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.f(2);
          }
          var17++;
          var38.field_k = var38.field_k + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.a(-16384);
            this.field_p[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.a(-16384);
            this.field_p[var20Lifetime1] = (short)(this.field_p[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var54.length <= var21) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.i((byte) 13);
            }
            this.field_p[var23] = (short)(this.field_p[var23] + (dg.a(2, var22 - 1) << 14));
            var20Lifetime2--;
            this.field_o[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; 128 > var24; var24++) {
            if (this.field_o[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var55.length > var21Lifetime1) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_i[incrementValue$6] - 1;
              }
              this.field_m[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_o[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
                incrementValue$4 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_i[incrementValue$4] + 16 << 2;
              }
              var20Lifetime4--;
              this.field_r[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_o[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length <= var21Lifetime3) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              this.field_q[var26] = (gm) (var25);
              var20Lifetime5--;
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
                var26Lifetime1 = var38.a(-16384) + 1;
              }
            }
            var20Lifetime6--;
            this.field_s[var27] = (byte)var26Lifetime1;
          }
          this.field_k = 1 + var38.a(-16384);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_h != null) {
              for (var29 = 1; var45.field_h.length > var29; var29 += 2) {
                var45.field_h[var29] = var38.f(2);
              }
            }
            if (null != var45.field_g) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.field_g.length - 2; var29Lifetime5 += 2) {
                var45.field_g[var29Lifetime5] = var38.f(2);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.f(2);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.f(2);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_g) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_g.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var19Lifetime3 + 1 + var38.a(-16384);
                var48.field_g[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            var28Lifetime1 = var49;
            if (null != var49.field_h) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_h.length; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + (var19Lifetime4 + var38.a(-16384));
                var49.field_h[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.a(-16384);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var46.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + var19Lifetime5 + var38.a(-16384);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_s[var29Lifetime3] = (byte)(32 + var28_int * this.field_s[var29Lifetime3] >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = var28_int * (-var27Lifetime6Lifetime1 + var30) + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = pc.a(-64, -var27Lifetime6Lifetime1 + var30, var32);
                var32 = var32 + (-var28_int + var31);
                this.field_s[var33] = (byte)(32 + var34 * this.field_s[var33] >> 6);
              }
              var29Lifetime3Lifetime1 += 2;
              var28_int = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_s[var30Lifetime2] = (byte)(this.field_s[var30Lifetime2] * var28_int + 32 >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.a(-16384);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var47.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.a(-16384) + (1 + var19Lifetime6);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28_intLifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7Lifetime1 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = (255 & this.field_r[var29Lifetime4]) + var28_intLifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_r[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + var28_intLifetime1 * (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1);
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = pc.a(-92, var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1, var32Lifetime1);
                var35 = (255 & this.field_r[var37]) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_r[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28_intLifetime1);
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28_intLifetime1 = var31Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (this.field_r[var30Lifetime1Lifetime2] & 255) + var28_intLifetime1;
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_r[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_i = var38.a(-16384);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime2 = var50;
            if (var50.field_h != null) {
              var50.field_b = var38.a(-16384);
            }
            if (null != var50.field_g) {
              var28Lifetime2.field_k = var38.a(-16384);
            }
            if (var28Lifetime2.field_i > 0) {
              var28Lifetime2.field_e = var38.a(-16384);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_d = var38.a(-16384);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_d > 0) {
              var51.field_m = var38.a(-16384);
            }
          }
          for (var27Lifetime12 = 0; var12 > var27Lifetime12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_m > 0) {
              var52.field_c = var38.a(-16384);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("qd.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
        field_l = 50;
        field_h = new String[]{"Mission selection", "Available missions - Click to select.", "The selected mission's information.", "Start the selected mission.", "Enter the equip screen.", "Enter the research screen.", "From here you can access information about different equipment from the research screen, recruit new members into your squad and provide them with weapons from the equipment screen, and proceed into the next mission. To play a mission click on one of the mission circles to highlight it and then click on the 'select mission' button. Make sure you remember to equip your soldiers before this though!"};
        field_i = 0;
        field_j = "Squiddy Commander";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e9dea5688aa5(int param0, int param1) {
        if (param0 <= 15) {
          return;
        }
        if (eh.field_g[param1] != null) {
          gb.field_E.a(eh.field_g[param1], 100, ua.field_e * pe.field_f[param1] / 128);
        }
    }
}
