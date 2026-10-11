/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends ca {
    rc[] field_f;
    byte[] field_k;
    private int[] field_i;
    byte[] field_j;
    int field_l;
    byte[] field_h;
    dl[] field_g;
    short[] field_m;

    final static hf a(bb param0, int param1) {
        hf var2 = null;
        RuntimeException var2_ref = null;
        hf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -129) {
            ik.a((byte) -6, 55);
          }
          var2 = new hf(param0, param0);
          ba.field_b.a(-85, var2);
          vb.field_f.a(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ik.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = OrbDefence.field_D ? 1 : 0;
        if (param4 > -42) {
          return;
        }
        param0--;
        while (param0 >= 0) {
          try {
            var17 = param7;
            var10 = var17;
            var11 = param1;
            var12 = param6;
            var13 = param2;
            var14 = param8;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = var15 + (vi.a(33423360, var12) >> 1) + ((vi.a(33423821, var13) >> 9) + (vi.a(33541693, var14) >> 17));
            param1++;
            param2 = param2 + param3;
            param6 = param6 + param5;
            param8 = param8 + param9;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("ik.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            if (param7 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param8).append(',').append(param9).append(')').toString());
          }
          param0--;
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        ca var2 = null;
        ef var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = 56 % ((15 - param0) / 44);
          var3 = (ef) (sd.field_a.b((byte) -13));
          while (var3 != null) {
            jk.a(param1, var3, false);
            var3 = (ef) (sd.field_a.d(853));
          }
          var2 = e.field_b.b((byte) -101);
          while (var2 != null) {
            lg.a(param1, 78);
            var2 = e.field_b.d(853);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ik.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(ee param0, ee param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            ik.a((byte) -2, 76);
          }
          var4 = (String) null;
          stackIn_3_0 = jk.a(0, 0, param0, (String) null, param1, false, -23739);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ik.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        this.field_i = null;
        if (param0) {
          this.field_g = (dl[]) null;
        }
    }

    final boolean a(int param0, vd param1, int[] param2, byte[] param3) {
        int var9 = 0;
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
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          var8 = 62 / ((14 - param0) / 55);
          var7 = null;
          for (var9 = 0; var9 < 128; var9++) {
            if (param3 == null ||
              param3[var9] != 0) {
              var10 = this.field_i[var9];
              if (0 != var10) {
                if (var10 != var6) {
                  var6 = var10;
                  var10--;
                  if ((1 & var10) != 0) {
                    var7 = param1.a(var10 >> 2, param2, 120);
                  } else {
                    var7 = param1.a(var10 >> 2, (byte) 92, param2);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_g[var9] = (dl) (var7);
                  this.field_i[var9] = 0;
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
          stackIn_24_1 = new StringBuilder().append("ik.A(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    ik(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        rc dupTemp$8 = null;
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
        rc[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        rc var15_ref = null;
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
        mg var38 = null;
        byte[] var39 = null;
        rc var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        rc var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        rc var48 = null;
        rc var49 = null;
        rc var50 = null;
        rc var51 = null;
        rc var52 = null;
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
          this.field_k = new byte[128];
          this.field_i = new int[128];
          this.field_m = new short[128];
          this.field_j = new byte[128];
          this.field_g = new dl[128];
          this.field_h = new byte[128];
          this.field_f = new rc[128];
          var38 = new mg(param0);
          for (var3 = 0; 0 != var38.field_j[var38.field_i + var3]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.d(-20398);
          }
          var3++;
          var38.field_i = var38.field_i + 1;
          var5Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var3;
          for (var6 = 0; 0 != var38.field_j[var6 + var38.field_i]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.d(-20398);
          }
          var6++;
          var38.field_i = var38.field_i + 1;
          var8Lifetime1 = var38.field_i;
          var38.field_i = var38.field_i + var6;
          for (var9 = 0; 0 != var38.field_j[var9 + var38.field_i]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.d(-20398);
          }
          var9++;
          var38.field_i = var38.field_i + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.b((byte) 90);
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
          var13 = new rc[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new rc();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.b((byte) 90);
            if (0 < var16_int) {
              var15_ref.field_l = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.b((byte) 90);
            if (0 < var16_intLifetime1) {
              var15_ref.field_e = new byte[2 + 2 * var16_intLifetime1];
              var40.field_e[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.b((byte) 90);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.b((byte) 90);
          if (var14Lifetime3 <= 0) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_j[var38.field_i + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.d(-20398);
          }
          var38.field_i = var38.field_i + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.b((byte) 90);
            this.field_m[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.b((byte) 90);
            this.field_m[var20Lifetime1] = (short)(this.field_m[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var54.length > var21) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.k(0);
            }
            this.field_m[var23] = (short)(this.field_m[var23] + (vi.a(2, var22 - 1) << 14));
            var20Lifetime2--;
            this.field_i[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_i[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var21Lifetime1 < var55.length) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.field_j[incrementValue$6];
              }
              this.field_h[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_i[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.field_j[incrementValue$3] + 16 << 2;
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_k[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_i[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              var20Lifetime5--;
              this.field_f[var26] = (rc) (var25);
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (0 == var20Lifetime6) {
              if (var21Lifetime4 < var54.length) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (this.field_i[var27] > 0) {
                var26Lifetime1 = var38.b((byte) 90) + 1;
              }
            }
            this.field_j[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_l = 1 + var38.b((byte) 90);
          for (var27Lifetime1 = 0; var12 > var27Lifetime1; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_l != null) {
              for (var29 = 1; var29 < var45.field_l.length; var29 += 2) {
                var45.field_l[var29] = var38.d(-20398);
              }
            }
            if (null != var45.field_e) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.field_e.length - 2; var29Lifetime5 += 2) {
                var45.field_e[var29Lifetime5] = var38.d(-20398);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.d(-20398);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var47.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.d(-20398);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_e != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_e.length; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.b((byte) 90) + 1 + var19Lifetime3;
                var48.field_e[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_l) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_l.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.b((byte) 90);
                var49.field_l[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.b((byte) 90);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var58.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.b((byte) 90) + (1 + var19Lifetime5);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_j[var29Lifetime3] = (byte)(this.field_j[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var58.length > var29Lifetime3Lifetime1) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = var28 * (-var27Lifetime6Lifetime1 + var30) + (var30 - var27Lifetime6Lifetime1) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = dd.a(-1, var32, var30 - var27Lifetime6Lifetime1);
                this.field_j[var33] = (byte)(32 + var34 * this.field_j[var33] >> 6);
                var32 = var32 + (var31 - var28);
              }
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_j[var30Lifetime2] = (byte)(this.field_j[var30Lifetime2] * var28 + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.b((byte) 90);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var47.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.b((byte) 90) + (var19Lifetime6 + 1);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (this.field_k[var29Lifetime4] & 255) + var28Lifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_k[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = dd.a(-1, var32Lifetime1, var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1);
                var35 = var34Lifetime1 + (255 & this.field_k[var37]);
                if (0 > var35) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                this.field_k[var37] = (byte)var35;
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
            }
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (this.field_k[var30Lifetime1Lifetime2] & 255);
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_k[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            var16 = null;
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_c = var38.b((byte) 90);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (null != var50.field_l) {
              var50.field_g = var38.b((byte) 90);
            }
            if (null != var50.field_e) {
              var50.field_f = var38.b((byte) 90);
            }
            if (var50.field_c > 0) {
              var50.field_k = var38.b((byte) 90);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_h = var38.b((byte) 90);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (0 < var51.field_h) {
              var51.field_j = var38.b((byte) 90);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_j > 0) {
              var52.field_b = var38.b((byte) 90);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_206_0 = var2;
          stackIn_206_1 = new StringBuilder().append("ik.<init>(");
          if (param0 == null) {
            stackIn_207_2 = "null";
          } else {
            stackIn_207_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_206_0), ((StringBuilder) (Object) stackIn_206_1).append(stackIn_207_2).append(')').toString());
        }
    }

    static {
    }
}
