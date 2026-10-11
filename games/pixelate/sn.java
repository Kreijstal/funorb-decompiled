/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends fa {
    private int[] field_r;
    byte[] field_o;
    byte[] field_p;
    static volatile boolean field_s;
    int field_v;
    short[] field_u;
    static String field_q;
    sp[] field_n;
    byte[] field_t;
    static tf field_m;
    static String field_k;
    un[] field_l;

    final static String b(byte param0) {
        if (param0 != 11) {
          field_q = (String) null;
        }
        return oo.field_a;
    }

    final static void e(int param0) {
        int var2 = 0;
        int var1 = -63 / ((60 - param0) / 39);
        if (ia.field_h > 32) {
          var2 = ia.field_h % 32;
          if (var2 == 0) {
            var2 = 32;
          }
          nk.a((byte) 93, -var2 + ia.field_h);
        } else {
          nk.a((byte) 93, 0);
        }
    }

    final static void a(jn param0, int param1) {
        ae stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        ae stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        wg var22 = null;
        wg var23 = null;
        wg var24 = null;
        var21 = Pixelate.field_H ? 1 : 0;
        try {
          var22 = uj.a(param0.field_o, param0.field_l, 0);
          var3 = 4;
          var4 = 14;
          if (param0.field_n != 0) {
            if (param0.field_n == 1) {
              stackIn_12_0 = new ae(0, var3 << var4, 0);
            } else {
              if (2 == param0.field_n) {
                stackIn_12_0 = new ae(0, 0, var3 << var4);
              } else {
                if (3 == param0.field_n) {
                  stackIn_12_0 = new ae(-var3 << var4, 0, 0);
                } else {
                  if (param0.field_n != 4) {
                    stackIn_12_0 = new ae(0, 0, -var3 << var4);
                  } else {
                    stackIn_12_0 = new ae(0, -var3 << var4, 0);
                  }
                }
              }
            }
          } else {
            stackIn_12_0 = new ae(var3 << var4, 0, 0);
          }
          var5 = stackIn_12_0;
          stackIn_15_0 = (0 >= var22.a(var5, (byte) 106).field_i) ? 0 : 1;
          var6 = stackIn_15_0;
          var7 = 2048 * param0.field_x / param0.field_w;
          if (param1 != 1183261192) {
            field_s = false;
          }
          stackIn_19_0 = var5;
          if (param0.field_k) {
            stackIn_20_1 = var7;
          } else {
            stackIn_20_1 = -var7;
          }
          var23 = uj.a(stackIn_19_0, stackIn_20_1, param1 - 1183261192);
          var24 = var22.a(param1 - 1183261184, var23);
          var9 = 0;
          var10 = 2;
          var11 = 0;
          var12 = 2;
          var13 = 0;
          var14 = 2;
          var15 = 0;
          var16 = 2;
          var17 = 0;
          var18 = 2;
          var19 = 0;
          var20 = 2;
          if (0 == param0.field_n) {
            var11 = 1;
            var10 = 1;
          } else {
            if (param0.field_n == 1) {
              var14 = 1;
              var15 = 1;
            } else {
              if (param0.field_n != 2) {
                if (param0.field_n != 3) {
                  if (param0.field_n != 4) {
                    if (5 == param0.field_n) {
                      var20 = 1;
                      var17 = 1;
                    }
                  } else {
                    var16 = 1;
                    var13 = 1;
                  }
                } else {
                  var9 = 1;
                  var12 = 1;
                }
              } else {
                var19 = 1;
                var18 = 1;
              }
            }
          }
          if (var6 == 0) {
            um.a(var9, var17, var24, var18, var14, (byte) -101, param0.field_u >> 8, var13, var10, param0.field_r >> 8, param0.field_t);
            um.a(var11, var19, var22, var20, var16, (byte) -110, param0.field_u >> 8, var15, var12, param0.field_r >> 8, param0.field_t);
          } else {
            um.a(var11, var19, var22, var20, var16, (byte) -114, param0.field_u >> 8, var15, var12, param0.field_r >> 8, param0.field_t);
            um.a(var9, var17, var24, var18, var14, (byte) -100, param0.field_u >> 8, var13, var10, param0.field_r >> 8, param0.field_t);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("sn.F(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            sn.b((byte) 30);
          }
          stackIn_3_0 = ne.a(param1 ^ 98, false, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sn.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 0) {
          return;
        }
        field_q = null;
    }

    final void a(boolean param0) {
        if (param0) {
          sn.b((byte) -17);
        }
        this.field_r = null;
    }

    final static void a(byte param0) {
        ln.a(param0 + 165);
        if (null != ec.field_u) {
          pf.a(ec.field_u, 0);
        }
        if (param0 != -91) {
          return;
        }
        vi.a((byte) -109);
        db.a((byte) -94);
        ep.c(-26721);
        if (se.b(true)) {
          aa.field_f.g(1, 15514);
          vg.b(0, param0 + 10091);
        }
        na.a(true);
    }

    sn(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        un dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_205_2 = null;
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
        un[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        un var15_ref = null;
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
        un var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        we var38 = null;
        byte[] var39 = null;
        un var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        un var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        un var48 = null;
        un var49 = null;
        un var50 = null;
        un var51 = null;
        un var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        un var28Lifetime1;
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
          this.field_r = new int[128];
          this.field_o = new byte[128];
          this.field_l = new un[128];
          this.field_u = new short[128];
          this.field_t = new byte[128];
          this.field_n = new sp[128];
          this.field_p = new byte[128];
          var38 = new we(param0);
          for (var3 = 0; 0 != var38.field_k[var3 + var38.field_m]; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.a(0);
          }
          var3++;
          var38.field_m = var38.field_m + 1;
          var5Lifetime1 = var38.field_m;
          var38.field_m = var38.field_m + var3;
          for (var6 = 0; var38.field_k[var6 + var38.field_m] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.a(0);
          }
          var6++;
          var38.field_m = var38.field_m + 1;
          var8Lifetime1 = var38.field_m;
          var38.field_m = var38.field_m + var6;
          for (var9 = 0; 0 != var38.field_k[var38.field_m + var9]; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.a(0);
          }
          var38.field_m = var38.field_m + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.f(255);
              if (var15_int == 0) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new un[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new un();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.f(255);
            if (0 < var16_int) {
              var15_ref.field_b = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.f(255);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_h = new byte[2 + var16_intLifetime1 * 2];
              var40.field_h[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.f(255);
          if (0 >= var14Lifetime2) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.f(255);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; var38.field_k[var38.field_m + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.a(0);
          }
          var38.field_m = var38.field_m + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.f(255);
            this.field_u[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.f(255);
            this.field_u[var20Lifetime1] = (short)(this.field_u[var20Lifetime1] + (var19Lifetime2 << 8));
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
              var22 = var38.j(127);
            }
            this.field_u[var23] = (short)(this.field_u[var23] + cm.a(var22 - 1 << 14, 32768));
            var20Lifetime2--;
            this.field_r[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_r[var24] != 0) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_k[incrementValue$5] - 1;
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
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
            if (0 != this.field_r[var25_int]) {
              if (0 == var20Lifetime4) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_k[incrementValue$3] << 2;
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_o[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_r[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_l[var26] = (un) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 < var54.length) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (this.field_r[var27] > 0) {
                var26Lifetime1 = 1 + var38.f(255);
              }
            }
            this.field_t[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_v = 1 + var38.f(255);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_b != null) {
              for (var29 = 1; var29 < var45.field_b.length; var29 += 2) {
                var45.field_b[var29] = var38.a(0);
              }
            }
            if (var45.field_h != null) {
              for (var29Lifetime5 = 3; -2 + var45.field_h.length > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_h[var29Lifetime5] = var38.a(0);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.a(0);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var58.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.a(0);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            var28 = var48;
            if (null != var48.field_h) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_h.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.f(255) + var19Lifetime3 + 1;
                var48.field_h[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_b != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_b.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.f(255) + var19Lifetime4 + 1;
                var49.field_b[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.f(255);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 + 1 + var38.f(255);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28_int = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.field_t[var29Lifetime3] = (byte)(var28_int * this.field_t[var29Lifetime3] + 32 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var46.length > var29Lifetime3Lifetime1) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + (-var27Lifetime6Lifetime1 + var30) * var28_int;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = cm.a(var30 - var27Lifetime6Lifetime1, (byte) 120, var32);
                this.field_t[var33] = (byte)(this.field_t[var33] * var34 + 32 >> 6);
                var32 = var32 + (var31 - var28_int);
              }
              var29Lifetime3Lifetime1 += 2;
              var27Lifetime6Lifetime1 = var30;
              var28_int = var31;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_t[var30Lifetime2] = (byte)(this.field_t[var30Lifetime2] * var28_int + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.f(255);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var27Lifetime7 < var58.length; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.f(255) + (var19Lifetime6 + 1);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28_intLifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (this.field_o[var29Lifetime4] & 255) + var28_intLifetime1;
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_o[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var58.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) / 2 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) * var28_intLifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = cm.a(var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1, (byte) 124, var32Lifetime1);
                var35 = var34Lifetime1 + (this.field_o[var37] & 255);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                var32Lifetime1 = var32Lifetime1 + (-var28_intLifetime1 + var31Lifetime1);
                this.field_o[var37] = (byte)var35;
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var28_intLifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_o[var30Lifetime1Lifetime2]) + var28_intLifetime1;
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_o[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].field_e = var38.f(255);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime1 = var50;
            if (null != var50.field_b) {
              var28Lifetime1.field_f = var38.f(255);
            }
            if (var28Lifetime1.field_h != null) {
              var28Lifetime1.field_d = var38.f(255);
            }
            if (var28Lifetime1.field_e > 0) {
              var28Lifetime1.field_i = var38.f(255);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].field_g = var38.f(255);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.field_g > 0) {
              var51.field_a = var38.f(255);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.field_a > 0) {
              var52.field_m = var38.f(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_204_0 = var2;
          stackIn_204_1 = new StringBuilder().append("sn.<init>(");
          if (param0 == null) {
            stackIn_205_2 = "null";
          } else {
            stackIn_205_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_204_0), ((StringBuilder) (Object) stackIn_204_1).append(stackIn_205_2).append(')').toString());
        }
    }

    final boolean a(po param0, int[] param1, byte param2, byte[] param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_r[var8];
              if (var9 != 0) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) != 0) {
                    var7 = param0.a((byte) -46, param1, var9 >> 2);
                  } else {
                    var7 = param0.a(var9 >> 2, param1, (byte) 106);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_n[var8] = (sp) (var7);
                  this.field_r[var8] = 0;
                }
              }
            }
          }
          if (param2 >= -49) {
            this.field_v = 113;
          }
          stackIn_21_0 = var5_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("sn.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    static {
        field_s = true;
        field_q = "Accept";
        field_k = "Username: ";
    }
}
