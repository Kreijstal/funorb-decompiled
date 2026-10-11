/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static int[] field_q;
    private long[] field_c;
    private byte[] field_a;
    static int[] field_b;
    static boolean field_g;
    static String field_n;
    static String field_p;
    static String field_l;
    private int field_d;
    static qr field_j;
    private int field_o;
    private long[] field_f;
    static int field_i;
    private long[] field_e;
    private long[] field_h;
    private long[] field_m;
    private byte[] field_k;

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -((int)param1 & 7) + 8 & 7;
          var7 = this.field_d & 7;
          var9 = param1;
          if (param0 != 36) {
            this.field_o = -5;
          }
          var11 = 31;
          var12 = 0;
          while (0 <= var11) {
            var12 = var12 + ((255 & this.field_k[var11]) + (255 & (int)var9));
            this.field_k[var11] = (byte)var12;
            var9 = var9 >>> 8;
            var12 = var12 >>> 8;
            var11--;
          }
          while (param1 > 8L) {
            var8 = 255 & param2[var5_int] << var6 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], var8 >>> var7);
              this.field_o = this.field_o + 1;
              this.field_d = this.field_d + (8 - var7);
              if (this.field_d == 512) {
                this.a((byte) -55);
                this.field_o = 0;
                this.field_d = 0;
              }
              this.field_a[this.field_o] = (byte)we.a(255, var8 << -var7 + 8);
              param1 = param1 - 8L;
              this.field_d = this.field_d + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], var8Lifetime1 >>> var7);
          }
          if ((long)var7 + param1 < 8L) {
            this.field_d = (int)((long)this.field_d + param1);
          } else {
            param1 = param1 - (long)(-var7 + 8);
            this.field_o = this.field_o + 1;
            this.field_d = this.field_d + (8 - var7);
            if (this.field_d == 512) {
              this.a((byte) -55);
              this.field_o = 0;
              this.field_d = 0;
            }
            this.field_a[this.field_o] = (byte)we.a(var8Lifetime1 << -var7 + 8, 255);
            this.field_d = this.field_d + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("er.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, String param2, int param3, byte param4, boolean param5, int param6, int param7) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 < 97) {
            er.a(-92, 119, -115, 97, 9);
          }
          if (hi.field_o.field_rb != 0 &&
            !bg.field_g) {
            if (ae.field_b) {
              rg.a(true);
            } else {
              sr.field_h = true;
            }
          }
          if (sr.field_h) {
            ca.a(param3, param0, param0, param2, param7, param1, -10, 20, param6);
            fa.field_X.a(param5, -20429);
            if (param5) {
              if (hd.field_m.field_rb != 0) {
                sr.field_h = false;
              }
              if (cb.field_l.field_rb == 0) {
                return;
              }
              qq.c(false);
              sr.field_h = false;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("er.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, sr param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        hc stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_46_4;
        int stackIn_46_5;
        boolean stackIn_47_6;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        hc var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        sr var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var44 = param5;
          if (null != var44.field_p &&
            var44.field_o > 1) {
            var60 = var44.field_p;
            eb.a(0, 0, var60, 12, uo.field_h);
          } else {
            kc.a((byte) -97);
          }
          var54 = new int[param5.field_e];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param5.field_e];
          var61 = fm.field_c;
          var62 = ra.field_f;
          var63 = hk.field_ob;
          for (var13 = 0; param5.field_e > var13; var13++) {
            var14 = var61[var13] * param0 + var62[var13] * param3 + var63[var13] * param7 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_15_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_15_0 = var14 + 128;
              } else {
                stackIn_15_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = var61[var13] * param6 - (-(param1 * var62[var13]) - var63[var13] * param4) >> 8;
            stackIn_17_0 = uc.field_w;
            if (0 > var15) {
              stackIn_18_1 = -var15;
            } else {
              stackIn_18_1 = var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          if (param2) {
            return;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < qj.field_e; var13Lifetime1++) {
            var14Lifetime1 = jl.field_M[var13Lifetime1];
            var15Lifetime1 = param5.field_s[var14Lifetime1];
            var16 = param5.field_i[var14Lifetime1];
            var17 = param5.field_B[var14Lifetime1];
            if (param5.field_M[var14Lifetime1] >= fm.field_c.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param5.field_M[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (param5.field_P[var14Lifetime1] >= fm.field_c.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param5.field_P[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param5.field_n[var14Lifetime1] < fm.field_c.length) {
              stackIn_32_0 = param5.field_n[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (wc.field_a != null &&
              null != param5.field_b &&
              var14Lifetime1 < param5.field_b.length &&
              param5.field_b[var14Lifetime1] != -1 &&
              wc.field_a.length > param5.field_b[var14Lifetime1]) {
              stackIn_39_0 = wc.field_a[param5.field_b[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = ul.field_Cb[var15Lifetime1];
            var23 = he.field_i[var15Lifetime1];
            var24 = ul.field_Cb[var16];
            var25 = he.field_i[var16];
            var26 = ul.field_Cb[var17];
            var27 = he.field_i[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_a;
              }
              var30 = stackIn_44_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = var28 * var31 >>> 8 & 268370175 | var28 * var32 >>> 8 & 989921024;
              var33 = var33 + 65793 * var29;
              stackIn_46_0 = var23;
              stackIn_46_1 = var26;
              stackIn_46_2 = var27;
              stackIn_46_3 = var25;
              stackIn_46_4 = var33 >> 1 & 8355711;
              stackIn_46_5 = var24;
              stackIn_47_6 = !(param2);
              oo.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, stackIn_47_6, var22);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_51_0 = 8355711;
              } else {
                stackIn_51_0 = var21.field_a;
              }
              var34 = stackIn_51_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (-16711905 & var35 * var28) >>> 8 | var28 * var36 >>> 8 & -1845428480;
              var38 = (16711777 & var36 * var29) >>> 8 | var29 * var35 >>> 8 & 1459552511;
              var37 = var37 + 65793 * var31;
              var39 = var30 * var36 >>> 8 & -570360064 | (-16711872 & var30 * var35) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + var33 * 65793;
              bf.a((var38 & 65365) >> 8, var37 & 255, var39 >> 16, var37 >> 8 & 255, var37 >> 16, var26, var22, var39 & 255, var25, 255 & var38, var27, (var39 & 65523) >> 8, var24, var38 >> 16, var23, 256);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_56_0 = var8_ref;
          stackIn_56_1 = new StringBuilder().append("er.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -95) {
          return;
        }
        am.a(param3, 3974311, -58, param2, param1, param4);
    }

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        hg.field_t = mp.field_b.c(oq.field_i[21]);
        int var1 = mp.field_b.c(oq.field_i[22]);
        if (!(var1 <= hg.field_t)) {
          hg.field_t = var1;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_a[this.field_o] = (byte)ee.a((int) this.field_a[this.field_o], 128 >>> we.a(7, this.field_d));
          this.field_o = this.field_o + 1;
          if (this.field_o > 32) {
            while (this.field_o < 64) {
              fieldTemp$0 = this.field_o;
              this.field_o = this.field_o + 1;
              this.field_a[fieldTemp$0] = (byte) 0;
            }
            this.a((byte) -55);
            this.field_o = 0;
          }
          while (this.field_o < 32) {
            fieldTemp$1 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_a[fieldTemp$1] = (byte) 0;
          }
          ps.a(this.field_k, 0, this.field_a, 32, 32);
          this.a((byte) -55);
          var4_int = 0;
          var5 = param0;
          var6 = 59 % ((param1 - 19) / 32);
          while (var4_int < 8) {
            var7 = this.field_c[var4_int];
            param2[var5] = (byte)(int)(var7 >>> 56);
            param2[var5 + 1] = (byte)(int)(var7 >>> 48);
            param2[2 + var5] = (byte)(int)(var7 >>> 40);
            param2[var5 + 3] = (byte)(int)(var7 >>> 32);
            param2[var5 + 4] = (byte)(int)(var7 >>> 24);
            param2[var5 + 5] = (byte)(int)(var7 >>> 16);
            param2[var5 + 6] = (byte)(int)(var7 >>> 8);
            param2[var5 + 7] = (byte)(int)var7;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("er.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static bi a(int param0, byte param1, int param2, fs param3, int param4) {
        bi stackIn_3_0 = null;
        bi stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 + param4 == 0) {
            stackIn_3_0 = new bi(1, 1);
            return stackIn_3_0;
          }
          var5_int = -77 / ((-61 - param1) / 34);
          if (param2 < param4) {
            param4 = param2;
            param0 = 0;
          }
          if (param4 + param0 > param2) {
            param0 = param2 - param4;
          }
          var6 = param4 * (182 - pf.field_a[param3.field_x].field_z) / param2;
          var7 = (-pf.field_a[param3.field_x].field_z + 182) * param0 / param2;
          var8 = new bi(var6 + var7 + pf.field_a[param3.field_x].field_z / 2, 2 + rs.field_Cb.field_J);
          ra.a(-128);
          var8.e();
          if (param4 <= 0) {
            var7 = var7 + pf.field_a[param3.field_x].field_z / 2;
            var9 = ui.a(2105376, param3.field_k, -90, 128);
            for (var10 = 0; var7 > var10; var10++) {
              gf.j(var10, 0, var8.field_w, var9);
            }
          } else {
            var6 = var6 + pf.field_a[param3.field_x].field_z / 2;
            for (var9 = 0; var9 < var6; var9++) {
              gf.j(var9, 0, var8.field_w, ui.a(0, param3.field_k, -81, 128 + var9 * 128 / var6));
            }
            if (param0 > 0) {
              var9 = ui.a(2105376, param3.field_k, -106, 128);
              for (var10 = 0; var10 < var7; var10++) {
                gf.j(var6 + var10, 0, var8.field_w, var9);
              }
            }
          }
          for (var9Lifetime1 = 0; var8.field_z - 1 > var9Lifetime1; var9Lifetime1++) {
            var8.field_B[var9Lifetime1] = ui.a(0, var8.field_B[var9Lifetime1], -124, 128);
            var8.field_B[(var8.field_w - 1) * var8.field_z + var9Lifetime1] = ui.a(0, var8.field_B[var9Lifetime1 + (-1 + var8.field_w) * var8.field_z], -97, 64);
          }
          for (var9Lifetime2 = 0; var8.field_w > var9Lifetime2; var9Lifetime2++) {
            var8.field_B[var8.field_z - 1 + var9Lifetime2 * var8.field_z] = ui.a(0, var8.field_B[var9Lifetime2 * var8.field_z - 1 + var8.field_z], -109, 128);
          }
          var8.field_B[var8.field_w * var8.field_z - 1] = ui.a(0, var8.field_B[var8.field_w * var8.field_z - 1], -92, 190);
          cg.i(0);
          stackIn_29_0 = var8;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("er.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_m[var2] = bg.a(bg.a(bg.a(co.a((long)this.field_a[5 + var3] << 16, 16711680L), bg.a(bg.a(co.a((long)this.field_a[var3 + 3], 255L) << 32, bg.a(bg.a(co.a((long)this.field_a[1 + var3], 255L) << 48, (long)this.field_a[var3] << 56), co.a((long)this.field_a[2 + var3] << 40, 280375465082880L))), co.a(4278190080L, (long)this.field_a[4 + var3] << 24))), co.a((long)this.field_a[6 + var3], 255L) << 8), co.a(255L, (long)this.field_a[7 + var3]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_c[var2Lifetime1];
          arrayValue$1 = this.field_m[var2Lifetime1];
          this.field_e[var2Lifetime1] = dupTemp$0;
          this.field_f[var2Lifetime1] = bg.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; 10 >= var2Lifetime2; var2Lifetime2++) {
          for (var3Lifetime1 = 0; 8 > var3Lifetime1; var3Lifetime1++) {
            this.field_h[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_h[var3Lifetime1] = bg.a(this.field_h[var3Lifetime1], ke.field_l[var4][we.a(255, (int)(this.field_e[we.a(7, -var4 + var3Lifetime1)] >>> var5))]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_e[var3Lifetime1Lifetime1] = this.field_h[var3Lifetime1Lifetime1];
          }
          this.field_e[0] = bg.a(this.field_e[0], ke.field_k[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_h[var3Lifetime1Lifetime2] = this.field_e[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_h[var3Lifetime1Lifetime2] = bg.a(this.field_h[var3Lifetime1Lifetime2], ke.field_l[var7][we.a((int)(this.field_f[we.a(var3Lifetime1Lifetime2 - var7, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var7++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_f[var3Lifetime1Lifetime3] = this.field_h[var3Lifetime1Lifetime3];
          }
        }
        var2Lifetime3 = 0;
        if (param0 != -55) {
          this.field_m = (long[]) null;
        }
        while (var2Lifetime3 < 8) {
          this.field_c[var2Lifetime3] = bg.a(this.field_c[var2Lifetime3], bg.a(this.field_f[var2Lifetime3], this.field_m[var2Lifetime3]));
          var2Lifetime3++;
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_q = null;
        field_j = null;
        field_n = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_p = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_k[var2] = (byte) 0;
        }
        if (param0 != -169953503) {
          field_l = (String) null;
        }
        this.field_a[0] = (byte) 0;
        this.field_o = 0;
        this.field_d = 0;
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          this.field_c[var2Lifetime1] = 0L;
        }
    }

    er() {
        this.field_c = new long[8];
        this.field_h = new long[8];
        this.field_a = new byte[64];
        this.field_o = 0;
        this.field_d = 0;
        this.field_e = new long[8];
        this.field_m = new long[8];
        this.field_f = new long[8];
        this.field_k = new byte[32];
    }

    static {
        field_n = "<%highlight>FLEET PLACEMENT</col> - To place fleets, <%key>click</col> on your Production panel (at the top of the <%highlight>Production window</col>), then <%key>click<col> on a <%glossary>system</col> you control.";
        field_p = "Press 'SPACE' to toggle game statistics";
        field_l = "<%highlight>ENDING TURNS</col> - <%key>Clicking</col> on the Ready button (a <%highlight>tick within a circle</col>) at the top-right of the screen marks your move as complete. Once all players have completed their moves, <%highlight>all orders will be executed</col> and a new turn will begin. Making any adjustments to your orders will clear your ready status, and you will need to press the button again when you are finished.";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
