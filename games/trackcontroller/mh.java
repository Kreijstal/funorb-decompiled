/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends fc {
    static String[] field_k;
    short[] field_q;
    byte[] field_l;
    private int[] field_n;
    int field_m;
    byte[] field_r;
    uh[] field_p;
    static boolean field_i;
    byte[] field_j;
    ik[] field_o;

    final void f(int param0) {
        if (param0 != 21645) {
          this.f(21);
        }
        this.field_n = null;
    }

    final boolean a(byte[] param0, int[] param1, byte param2, jc param3) {
        int var8 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          if (param2 > -29) {
            return false;
          }
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param0 == null ||
              0 != param0[var8]) {
              var9 = this.field_n[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) == 0) {
                    var7 = param3.a(param1, false, var9 >> 2);
                  } else {
                    var7 = param3.a(param1, -2059411540, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_o[var8] = (ik) (var7);
                  this.field_n[var8] = 0;
                }
              }
            }
          }
          stackIn_24_0 = var5_int;
          return stackIn_24_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("mh.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static boolean e(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = cj.field_o;
        synchronized (var1_ref) {
          if (lj.field_d == fc.field_d) {
            return false;
          }
          kg.field_d = mc.field_K[lj.field_d];
          md.field_d = tk.field_o[lj.field_d];
          lj.field_d = 1 + lj.field_d & param0;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    public static void d(int param0) {
        if (param0 != -24011) {
          field_i = false;
        }
        field_k = null;
    }

    mh(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        uh dupTemp$8 = null;
        int incrementValue$5 = 0;
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
        uh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        uh var15_ref = null;
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
        uh var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        be var38 = null;
        byte[] var39 = null;
        uh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        uh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        uh var48 = null;
        uh var49 = null;
        uh var50 = null;
        uh var51 = null;
        uh var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        uh var28Lifetime1;
        uh var28Lifetime2;
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
          this.field_r = new byte[128];
          this.field_j = new byte[128];
          this.field_l = new byte[128];
          this.field_q = new short[128];
          this.field_n = new int[128];
          this.field_p = new uh[128];
          this.field_o = new ik[128];
          var38 = new be(param0);
          for (var3 = 0; var38.field_j[var3 + var38.field_k] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.f(-126);
          }
          var3++;
          var38.field_k = var38.field_k + 1;
          var5Lifetime1 = var38.field_k;
          var38.field_k = var38.field_k + var3;
          for (var6 = 0; var38.field_j[var6 + var38.field_k] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.f(-128);
          }
          var38.field_k = var38.field_k + 1;
          var6++;
          var8Lifetime1 = var38.field_k;
          var38.field_k = var38.field_k + var6;
          for (var9 = 0; var38.field_j[var38.field_k + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.f(-128);
          }
          var38.field_k = var38.field_k + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.h(16383);
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
          var13 = new uh[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new uh();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.h(16383);
            if (var16_int > 0) {
              var15_ref.field_c = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.h(16383);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_i = new byte[2 + 2 * var16_intLifetime1];
              var40.field_i[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.h(16383);
          if (0 >= var14Lifetime2) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.h(16383);
          if (0 < var14Lifetime3) {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; var38.field_j[var38.field_k + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.f(-128);
          }
          var38.field_k = var38.field_k + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.h(16383);
            this.field_q[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.h(16383);
            this.field_q[var20Lifetime1] = (short)(this.field_q[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var21 < var54.length) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.m(127);
            }
            this.field_q[var23] = (short)(this.field_q[var23] + tc.a(-1 + var22 << 14, 32768));
            this.field_n[var23] = var22;
            var20Lifetime2--;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_n[var24] != 0) {
              if (0 == var20Lifetime3) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_j[incrementValue$5] - 1;
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.field_l[var24] = (byte)var23Lifetime1;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (0 != this.field_n[var25_int]) {
              if (0 == var20Lifetime4) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_j[incrementValue$3] + 16 << 2;
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              this.field_r[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_n[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              var20Lifetime5--;
              this.field_p[var26] = (uh) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 < var54.length) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (this.field_n[var27] > 0) {
                var26Lifetime1 = 1 + var38.h(16383);
              }
            }
            var20Lifetime6--;
            this.field_j[var27] = (byte)var26Lifetime1;
          }
          this.field_m = var38.h(16383) + 1;
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_c != null) {
              for (var29 = 1; var29 < var45.field_c.length; var29 += 2) {
                var45.field_c[var29] = var38.f(-126);
              }
            }
            if (null != var45.field_i) {
              for (var29Lifetime5 = 3; var45.field_i.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_i[var29Lifetime5] = var38.f(-128);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var46.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.f(-128);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var58.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.f(-127);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_i) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_i.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var19Lifetime3 + 1 + var38.h(16383);
                var48.field_i[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            var28Lifetime1 = var49;
            if (null != var49.field_c) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_c.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.h(16383) + (1 + var19Lifetime4);
                var49.field_c[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.h(16383);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 + 1 + var38.h(16383);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_j[var29Lifetime3] = (byte)(this.field_j[var29Lifetime3] * var28_int + 32 >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var46.length > var29Lifetime3Lifetime1; var29Lifetime3Lifetime1 += 2) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (var30 - var27Lifetime6Lifetime1) * var28_int + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = mf.a(-var27Lifetime6Lifetime1 + var30, 14, var32);
                var32 = var32 + (-var28_int + var31);
                this.field_j[var33] = (byte)(this.field_j[var33] * var34 + 32 >> 6);
              }
              var28_int = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; 128 > var30Lifetime2; var30Lifetime2++) {
              this.field_j[var30Lifetime2] = (byte)(this.field_j[var30Lifetime2] * var28_int + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_j = var38.h(16383);
            }
          } else {
            var19Lifetime6 = var38.h(16383);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var58.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.h(16383) + var19Lifetime6 + 1;
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var58[0];
            var28_intLifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7; var29Lifetime4++) {
              var30Lifetime1 = var28_intLifetime1 + (this.field_r[var29Lifetime4] & 255);
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_r[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var58.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = var28_intLifetime1 * (var30Lifetime1Lifetime1 - var27Lifetime7) + (var30Lifetime1Lifetime1 - var27Lifetime7) / 2;
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = mf.a(-var27Lifetime7 + var30Lifetime1Lifetime1, 14, var32Lifetime1);
                var35 = var34Lifetime1 + (255 & this.field_r[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_r[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28_intLifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7 = var30Lifetime1Lifetime1;
              var28_intLifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_r[var30Lifetime1Lifetime2]) + var28_intLifetime1;
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_r[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_j = var38.h(16383);
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            var28Lifetime2 = var50;
            if (var50.field_c != null) {
              var50.field_f = var38.h(16383);
            }
            if (null != var50.field_i) {
              var28Lifetime2.field_g = var38.h(16383);
            }
            if (var28Lifetime2.field_j > 0) {
              var28Lifetime2.field_k = var38.h(16383);
            }
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var13[var27Lifetime9].field_a = var38.h(16383);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (0 < var51.field_a) {
              var51.field_h = var38.h(16383);
            }
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_h > 0) {
              var52.field_l = var38.h(16383);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_207_0 = var2;
          stackIn_207_1 = new StringBuilder().append("mh.<init>(");
          if (param0 == null) {
            stackIn_208_2 = "null";
          } else {
            stackIn_208_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_207_0), ((StringBuilder) (Object) stackIn_207_1).append(stackIn_208_2).append(')').toString());
        }
    }

    static {
        field_k = new String[]{"All scores", "My scores", "Best each"};
        field_i = false;
    }
}
