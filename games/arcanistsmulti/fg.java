/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends pg {
    static ll[] field_k;
    static String field_o;
    static String field_i;
    private int[] field_q;
    int field_r;
    byte[] field_l;
    wf[] field_p;
    byte[] field_h;
    short[] field_m;
    static String field_g;
    ba[] field_n;
    byte[] field_j;

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = bk.a(qf.field_d, 1021, ib.field_r);
          if (param1 == ~var2_int) {
            param0 = "<img=0>" + param0;
          }
          if (var2_int == 2) {
            param0 = "<img=1>" + param0;
          }
          stackIn_6_0 = (String) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fg.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 != 23257) {
          field_g = (String) null;
        }
        this.field_q = null;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_g = null;
        field_i = null;
        field_k = null;
        if (!param0) {
          field_o = (String) null;
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -45) {
            var3 = (String) null;
            fg.a((String) null, (byte) -82);
          }
          stackIn_3_0 = ld.field_q.a(param0, "", -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fg.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, gi param1, int[] param2, byte[] param3) {
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
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          var9 = -60 % ((-13 - param0) / 37);
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              0 != param3[var8]) {
              var10 = this.field_q[var8];
              if (var10 != 0) {
                if (var6 != var10) {
                  var6 = var10;
                  var10--;
                  if ((var10 & 1) == 0) {
                    var7 = param1.a(var10 >> 2, param2, -2);
                  } else {
                    var7 = param1.a(param2, var10 >> 2, -2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_p[var8] = (wf) (var7);
                  this.field_q[var8] = 0;
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
          stackIn_24_1 = new StringBuilder().append("fg.A(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    fg(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        ba dupTemp$8 = null;
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
        ba[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        ba var15_ref = null;
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
        ba var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        wk var38 = null;
        byte[] var39 = null;
        ba var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        ba var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        ba var48 = null;
        ba var49 = null;
        ba var50 = null;
        ba var51 = null;
        ba var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        ba var28Lifetime1;
        ba var28Lifetime2;
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
          this.field_j = new byte[128];
          this.field_h = new byte[128];
          this.field_l = new byte[128];
          this.field_p = new wf[128];
          this.field_n = new ba[128];
          this.field_m = new short[128];
          this.field_q = new int[128];
          var38 = new wk(param0);
          for (var3 = 0; var38.field_j[var3 + var38.field_g] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.o(6);
          }
          var3++;
          var38.field_g = var38.field_g + 1;
          var5Lifetime1 = var38.field_g;
          var38.field_g = var38.field_g + var3;
          for (var6 = 0; var38.field_j[var38.field_g + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.o(6);
          }
          var38.field_g = var38.field_g + 1;
          var6++;
          var8Lifetime1 = var38.field_g;
          var38.field_g = var38.field_g + var6;
          for (var9 = 0; var38.field_j[var9 + var38.field_g] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.o(6);
          }
          var9++;
          var38.field_g = var38.field_g + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.e((byte) -124);
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
          var13 = new ba[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new ba();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.e((byte) -106);
            if (var16_int > 0) {
              var15_ref.field_h = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.e((byte) 101);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_l = new byte[var16_intLifetime1 * 2 + 2];
              var40.field_l[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.e((byte) 125);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.e((byte) 96);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; var38.field_j[var38.field_g + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.o(6);
          }
          var38.field_g = var38.field_g + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.e((byte) 79);
            this.field_m[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.e((byte) -100);
            this.field_m[var20Lifetime1] = (short)(this.field_m[var20Lifetime1] + (var19Lifetime2 << 8));
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
              var22 = var38.a(70);
            }
            this.field_m[var23] = (short)(this.field_m[var23] + (dg.a(2, var22 - 1) << 14));
            var20Lifetime2--;
            this.field_q[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (0 != this.field_q[var24]) {
              if (0 == var20Lifetime3) {
                if (var55.length > var21Lifetime1) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_j[incrementValue$6] - 1;
              }
              this.field_l[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_q[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_j[incrementValue$3] << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_j[var25_int] = (byte)var24Lifetime1;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_q[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              var20Lifetime5--;
              this.field_n[var26] = (ba) (var25);
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20Lifetime6) {
              if (var54.length <= var21Lifetime4) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_q[var27] > 0) {
                var26Lifetime1 = 1 + var38.e((byte) -125);
              }
            }
            this.field_h[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_r = var38.e((byte) -111) + 1;
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_h != null) {
              for (var29 = 1; var29 < var45.field_h.length; var29 += 2) {
                var45.field_h[var29] = var38.o(6);
              }
            }
            if (null != var45.field_l) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.field_l.length - 2; var29Lifetime5 += 2) {
                var45.field_l[var29Lifetime5] = var38.o(6);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.o(6);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var58.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.o(6);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_l) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_l.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var19Lifetime3 + (1 + var38.e((byte) -93));
                var48.field_l[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            var28Lifetime1 = var49;
            if (null != var49.field_h) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var49.field_h.length > var29Lifetime2; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + (var19Lifetime4 + var38.e((byte) 101));
                var49.field_h[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.e((byte) -102);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var46.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 + 1 + var38.e((byte) 31);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_h[var29Lifetime3] = (byte)(var28_int * this.field_h[var29Lifetime3] + 32 >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var29Lifetime3Lifetime1 < var46.length; var29Lifetime3Lifetime1 += 2) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = var28_int * (var30 - var27Lifetime6Lifetime1) + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = jg.a(var30 - var27Lifetime6Lifetime1, -271087521, var32);
                this.field_h[var33] = (byte)(32 + this.field_h[var33] * var34 >> 6);
                var32 = var32 + (var31 - var28_int);
              }
              var28_int = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; 128 > var30Lifetime2; var30Lifetime2++) {
              this.field_h[var30Lifetime2] = (byte)(32 + var28_int * this.field_h[var30Lifetime2] >> 6);
            }
          }
          if (var16 != null) {
            var19Lifetime6 = var38.e((byte) 51);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var58.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.e((byte) -87) + (1 + var19Lifetime6);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28_intLifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (255 & this.field_j[var29Lifetime4]) + var28_intLifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_j[var29Lifetime4] = (byte)var30Lifetime1;
            }
            for (var29Lifetime4Lifetime1 = 2; var29Lifetime4Lifetime1 < var58.length; var29Lifetime4Lifetime1 += 2) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) / 2 + var28_intLifetime1 * (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1);
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = jg.a(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, -271087521, var32Lifetime1);
                var35 = (this.field_j[var37] & 255) + var34Lifetime1;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28_intLifetime1);
                this.field_j[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var28_intLifetime1 = var31Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_j[var30Lifetime1Lifetime2]) + var28_intLifetime1;
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
            var13[var27Lifetime8].field_n = var38.e((byte) -102);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime2 = var50;
            if (null != var50.field_h) {
              var28Lifetime2.field_g = var38.e((byte) -106);
            }
            if (null != var28Lifetime2.field_l) {
              var28Lifetime2.field_i = var38.e((byte) -99);
            }
            if (var28Lifetime2.field_n > 0) {
              var28Lifetime2.field_m = var38.e((byte) -90);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_e = var38.e((byte) 119);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (0 < var51.field_e) {
              var51.field_j = var38.e((byte) -87);
            }
          }
          for (var27Lifetime12 = 0; var12 > var27Lifetime12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_j > 0) {
              var52.field_d = var38.e((byte) 94);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("fg.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    static {
        field_o = null;
        field_g = "Only show lobby chat from my friends";
        field_i = "Lets you swim and decreases the damage done by water attacks";
    }
}
