/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ne {
    of[] field_n;
    static gp field_l;
    static String field_s;
    byte[] field_p;
    private int[] field_q;
    static String field_i;
    va[] field_k;
    int field_j;
    short[] field_r;
    byte[] field_m;
    static String field_t;
    byte[] field_o;

    final static boolean d(int param0) {
        if (param0 != 0) {
          field_l = (gp) null;
        }
        return sl.b(15000);
    }

    final boolean a(byte param0, lc param1, int[] param2, byte[] param3) {
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
        var10 = DungeonAssault.field_K;
        try {
          var5_int = 1;
          if (param0 != 45) {
            return true;
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_q[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param1.a(param2, var9 >> 2, -31164);
                  } else {
                    var7 = param1.a(param2, (byte) -97, var9 >> 2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_k[var8] = (va) (var7);
                  this.field_q[var8] = 0;
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
          stackIn_26_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_q = null;
        if (param0 != -97) {
          kk.a(95);
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_t = null;
        field_s = null;
        if (param0 != 0) {
          field_s = (String) null;
        }
        field_l = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          if (param3 != 48) {
            field_s = (String) null;
          }
          var4_int = param0.length();
          var5 = param1.length();
          var6 = param2.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf(param1, var9_int);
              if (0 > var9_int) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param0.indexOf(param1, var10);
            if (0 > var11) {
              discarded$0 = var9.append(param0.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$1 = var9.append(param0.substring(var10, var11));
            discarded$2 = var9.append(param2);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kk.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final static tj a(nh param0, nh param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param4, param3 + 1000);
          var6 = param1.a(param3, param2, var5_int);
          stackIn_1_0 = ef.a(param3 + 61, var5_int, param1, var6, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("kk.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(nh param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        nh var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param0.b(5, param2, param3);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          tn.a(param1 + 105, var6);
          if (param1 == 1) {
            return true;
          }
          var5 = (nh) null;
          kk.a((nh) null, -46, 0, -57);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("kk.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    kk(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        of dupTemp$8 = null;
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
        of[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        of var15_ref = null;
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
        ec var38 = null;
        byte[] var39 = null;
        of var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        of var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        of var48 = null;
        of var49 = null;
        of var50 = null;
        of var51 = null;
        of var52 = null;
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
          this.field_o = new byte[128];
          this.field_q = new int[128];
          this.field_k = new va[128];
          this.field_n = new of[128];
          this.field_r = new short[128];
          this.field_m = new byte[128];
          this.field_p = new byte[128];
          var38 = new ec(param0);
          for (var3 = 0; var38.field_m[var38.field_o + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.a((byte) 2);
          }
          var3++;
          var38.field_o = var38.field_o + 1;
          var5Lifetime1 = var38.field_o;
          var38.field_o = var38.field_o + var3;
          for (var6 = 0; var38.field_m[var38.field_o + var6] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.a((byte) 2);
          }
          var38.field_o = var38.field_o + 1;
          var6++;
          var8Lifetime1 = var38.field_o;
          var38.field_o = var38.field_o + var6;
          for (var9 = 0; var38.field_m[var38.field_o + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.a((byte) 2);
          }
          var38.field_o = var38.field_o + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.c(true);
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
          var13 = new of[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new of();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.c(true);
            if (var16_int > 0) {
              var15_ref.field_n = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.c(true);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_o = new byte[var16_intLifetime1 * 2 + 2];
              var40.field_o[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.c(true);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.c(true);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_m[var17 + var38.field_o] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.a((byte) 2);
          }
          var17++;
          var38.field_o = var38.field_o + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.c(true);
            this.field_r[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.c(true);
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
              var22 = var38.e(-651413500);
            }
            this.field_r[var23] = (short)(this.field_r[var23] + (nb.a(-1 + var22, 2) << 14));
            this.field_q[var23] = var22;
            var20Lifetime2--;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (0 != this.field_q[var24]) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_m[incrementValue$5] - 1;
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.field_o[var24] = (byte)var23Lifetime1;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_q[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_m[incrementValue$3] + 16 << 2;
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
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_q[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_n[var26] = (of) (var25);
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
              if (0 < this.field_q[var27]) {
                var26Lifetime1 = var38.c(true) + 1;
              }
            }
            var20Lifetime6--;
            this.field_m[var27] = (byte)var26Lifetime1;
          }
          this.field_j = 1 + var38.c(true);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_n != null) {
              for (var29 = 1; var45.field_n.length > var29; var29 += 2) {
                var45.field_n[var29] = var38.a((byte) 2);
              }
            }
            if (var45.field_o != null) {
              for (var29Lifetime5 = 3; -2 + var45.field_o.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_o[var29Lifetime5] = var38.a((byte) 2);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.a((byte) 2);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.a((byte) 2);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_o != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_o.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.c(true) + var19Lifetime3 + 1;
                var48.field_o[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_n != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_n.length; var29Lifetime2 += 2) {
                var19Lifetime4 = 1 + (var19Lifetime4 + var38.c(true));
                var49.field_n[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.c(true);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var58.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.c(true) + (1 + var19Lifetime5);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_m[var29Lifetime3] = (byte)(32 + this.field_m[var29Lifetime3] * var28 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (-var27Lifetime6Lifetime1 + var30) / 2 + var28 * (-var27Lifetime6Lifetime1 + var30);
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = cp.f(105, -var27Lifetime6Lifetime1 + var30, var32);
                var32 = var32 + (var31 - var28);
                this.field_m[var33] = (byte)(var34 * this.field_m[var33] + 32 >> 6);
              }
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            var15 = null;
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_m[var30Lifetime2] = (byte)(32 + this.field_m[var30Lifetime2] * var28 >> 6);
            }
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_c = var38.c(true);
            }
          } else {
            var19Lifetime6 = var38.c(true);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + var19Lifetime6 + var38.c(true);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7; var29Lifetime4++) {
              var30Lifetime1 = (this.field_p[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (128 < var30Lifetime1) {
                var30Lifetime1 = 128;
              }
              this.field_p[var29Lifetime4] = (byte)var30Lifetime1;
            }
            for (var29Lifetime4Lifetime1 = 2; var29Lifetime4Lifetime1 < var47.length; var29Lifetime4Lifetime1 += 2) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7) / 2 + var28Lifetime1 * (-var27Lifetime7 + var30Lifetime1Lifetime1);
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = cp.f(-63, var30Lifetime1Lifetime1 - var27Lifetime7, var32Lifetime1);
                var35 = (255 & this.field_p[var37]) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                this.field_p[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                var37++;
              }
              var28Lifetime1 = var31Lifetime1;
              var27Lifetime7 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (this.field_p[var30Lifetime1Lifetime2] & 255);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_p[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var12 > var27Lifetime7; var27Lifetime7++) {
              var13[var27Lifetime7].field_c = var38.c(true);
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (null != var50.field_n) {
              var50.field_e = var38.c(true);
            }
            if (null != var50.field_o) {
              var50.field_m = var38.c(true);
            }
            if (var50.field_c > 0) {
              var50.field_b = var38.c(true);
            }
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var13[var27Lifetime9].field_i = var38.c(true);
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_i > 0) {
              var51.field_h = var38.c(true);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_h > 0) {
              var52.field_a = var38.c(true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("kk.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
        field_s = "Renown: <col=DB0100><%0></col>";
        field_i = "Pit Demon";
        field_t = "Please try again in a few minutes.";
    }
}
