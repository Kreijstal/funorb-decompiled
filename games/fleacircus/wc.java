/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wc extends lh {
    sf[] field_m;
    de[] field_j;
    int field_k;
    static String field_p;
    private int[] field_i;
    byte[] field_o;
    byte[] field_r;
    short[] field_l;
    byte[] field_n;
    static int field_q;

    final boolean a(ng param0, byte[] param1, boolean param2, int[] param3) {
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
        int[] var11 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          if (param2) {
            var11 = (int[]) null;
            this.a((ng) null, (byte[]) null, false, (int[]) null);
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param1 == null ||
              param1[var8] != 0) {
              var9 = this.field_i[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param0.a(param3, var9 >> 2, 29037);
                  } else {
                    var7 = param0.a(var9 >> 2, true, param3);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_m[var8] = (sf) (var7);
                  this.field_i[var8] = 0;
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
          stackIn_25_1 = new StringBuilder().append("wc.A(");
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
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -24464) {
          wc.a((byte) 13);
        }
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, ce param4, int param5, String param6, boolean param7, int param8, int param9, int param10, long param11, int param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ae.field_a = new ih(param12);
            ud.field_b = new ih(param9);
            be.field_b = param8;
            if (param0 != 22986) {
              field_q = -30;
            }
            pc.field_j = param13;
            j.field_g = param1;
            bk.field_e = param3;
            af.field_f = param4;
            a.field_d = param6;
            va.field_m = param7;
            bb.field_E = param2;
            ab.field_d = param5;
            c.field_P = param11;
            cj.field_b = param10;
            if (null != af.field_f.field_k) {
              try {
                ge.field_d = new k(af.field_f.field_k, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("wc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    wc(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        de dupTemp$8 = null;
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
        de[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        de var15_ref = null;
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
        ni var38 = null;
        byte[] var39 = null;
        de var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        de var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        de var48 = null;
        de var49 = null;
        de var50 = null;
        de var51 = null;
        de var52 = null;
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
          this.field_n = new byte[128];
          this.field_j = new de[128];
          this.field_l = new short[128];
          this.field_i = new int[128];
          this.field_o = new byte[128];
          this.field_r = new byte[128];
          this.field_m = new sf[128];
          var38 = new ni(param0);
          for (var3 = 0; var38.field_k[var3 + var38.field_i] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.i(-122);
          }
          var38.field_i = var38.field_i + 1;
          var3++;
          var5Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var3;
          for (var6 = 0; var38.field_k[var6 + var38.field_i] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.i(-19);
          }
          var38.field_i = var38.field_i + 1;
          var6++;
          var8Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var6;
          for (var9 = 0; var38.field_k[var9 + var38.field_i] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.i(-38);
          }
          var38.field_i = var38.field_i + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.e(false);
              if (0 != var15_int) {
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
          var13 = new de[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new de();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.e(false);
            if (var16_int > 0) {
              var15_ref.field_p = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.e(false);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_i = new byte[2 * var16_intLifetime1 + 2];
              var40.field_i[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.e(false);
          if (0 >= var14Lifetime2) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.e(false);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_k[var38.field_i + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.i(-45);
          }
          var38.field_i = var38.field_i + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.e(false);
            this.field_l[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.e(false);
            this.field_l[var20Lifetime1] = (short)(this.field_l[var20Lifetime1] + (var19Lifetime2 << 8));
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
              var22 = var38.b(true);
            }
            this.field_l[var23] = (short)(this.field_l[var23] + sc.a(32768, -1 + var22 << 14));
            this.field_i[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; 128 > var24; var24++) {
            if (this.field_i[var24] != 0) {
              if (0 == var20Lifetime3) {
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_k[incrementValue$6];
              }
              var20Lifetime3--;
              this.field_n[var24] = (byte)var23Lifetime1;
            }
          }
          var20Lifetime4 = 0;
          var21Lifetime2 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_i[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_k[incrementValue$3] << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_r[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_i[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var57.length > var21Lifetime3) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_j[var26] = (de) (var25);
              var20Lifetime5--;
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20Lifetime6) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_i[var27] > 0) {
                var26Lifetime1 = var38.e(false) + 1;
              }
            }
            this.field_o[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_k = var38.e(false) + 1;
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_p != null) {
              for (var29 = 1; var45.field_p.length > var29; var29 += 2) {
                var45.field_p[var29] = var38.i(-74);
              }
            }
            if (var45.field_i != null) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.field_i.length - 2; var29Lifetime5 += 2) {
                var45.field_i[var29Lifetime5] = var38.i(-127);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var46.length > var27Lifetime2; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.i(-128);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.i(-51);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (null != var48.field_i) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_i.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.e(false) + var19Lifetime3 + 1;
                var48.field_i[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_p) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_p.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.e(false);
                var49.field_p[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.e(false);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.e(false) + (1 + var19Lifetime5);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_o[var29Lifetime3] = (byte)(this.field_o[var29Lifetime3] * var28 + 32 >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var29Lifetime3Lifetime1 < var46.length; var29Lifetime3Lifetime1 += 2) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (-var27Lifetime6Lifetime1 + var30) * var28 + (var30 - var27Lifetime6Lifetime1) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = re.a(var32, -var27Lifetime6Lifetime1 + var30, false);
                this.field_o[var33] = (byte)(var34 * this.field_o[var33] + 32 >> 6);
                var32 = var32 + (-var28 + var31);
              }
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; 128 > var30Lifetime2; var30Lifetime2++) {
              this.field_o[var30Lifetime2] = (byte)(var28 * this.field_o[var30Lifetime2] + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.e(false);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 - (-1 - var38.e(false));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.field_r[var29Lifetime4]);
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
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2 + (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = re.a(var32Lifetime1, -var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, false);
                var35 = var34Lifetime1 + (this.field_r[var37] & 255);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                this.field_r[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (this.field_r[var30Lifetime1Lifetime2] & 255) + var28Lifetime1;
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_r[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_c = var38.e(false);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_p) {
              var50.field_d = var38.e(false);
            }
            if (null != var50.field_i) {
              var50.field_l = var38.e(false);
            }
            if (0 < var50.field_c) {
              var50.field_e = var38.e(false);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_g = var38.e(false);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_g > 0) {
              var51.field_f = var38.e(false);
            }
          }
          for (var27Lifetime12 = 0; var12 > var27Lifetime12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_f > 0) {
              var52.field_m = var38.e(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("wc.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    final static ke a(byte param0) {
        if (param0 > -6) {
          field_p = (String) null;
        }
        return qg.field_f;
    }

    static {
    }
}
