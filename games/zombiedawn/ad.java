/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    private rb field_d;
    static String field_o;
    private int field_p;
    private boolean field_m;
    static vn[] field_f;
    private int field_k;
    private String field_l;
    static vo field_h;
    private int field_j;
    private int field_i;
    static vn[][] field_g;
    static int field_e;
    private int field_n;

    private final oe a(rb param0, boolean param1, String param2, int param3) {
        oe discarded$1 = null;
        oe var5 = null;
        RuntimeException var5_ref = null;
        oe stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            discarded$1 = this.a((rb) null, false, (String) null, -57);
          }
          var5 = new oe(param3 - param0.field_I, param3 + param0.field_x, param2.length());
          this.field_b = new oe[]{var5};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ad.P(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, int param1, rb param2, byte param3, int param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe var6 = null;
        RuntimeException var6_ref = null;
        try {
          if (null == param0) {
            this.field_b = null;
            return;
          }
          if (param2 == this.field_d &&
            this.field_m &&
            2 == this.field_p &&
            null != this.field_l &&
            this.field_l.equals(param0)) {
            return;
          }
          this.field_d = param2;
          this.field_p = 2;
          this.field_m = true;
          this.field_l = param0;
          var6 = this.a(param2, false, param0, param1);
          var6.field_e[0] = param4 - param2.b(param0);
          var6.field_e[param0.length()] = param4;
          ma.a(var6, 0, param0, param2, false);
          if (param3 != 83) {
            this.a((String) null, (byte) 105, 37, (rb) null, 104, 15, -99, 98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_26_0 = var6_ref;
          stackIn_26_1 = new StringBuilder().append("ad.N(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static short[] a(short[] param0, boolean param1, int param2, am param3) {
        Object stackIn_3_0 = null;
        short[] stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var4_int = param3.k(90, param2);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          if (!param1) {
            ad.b(105);
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          var5 = param3.k(67, 4);
          var6 = (short)param3.k(13, 16);
          if (var5 > 0) {
            var7 = 0;
            while (var7 < var4_int) {
              param0[var7] = (short)(param3.k(60, var5) + var6);
              var7++;
              if (var8 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (!(var5 > 0) ||
            var8 != 0)) {
            var7Lifetime1 = 0;
            while (var7Lifetime1 < var4_int) {
              stackIn_29_0 = (short[]) (param0);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_29_0[var7Lifetime1] = (short) var6;
              var7Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_29_0 = (short[]) (param0);
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_33_0 = var4;
          stackIn_33_1 = new StringBuilder().append("ad.H(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = (vn[][]) null;
        field_h = null;
        if (param0 != -1819016370) {
          return;
        }
        try {
          field_o = null;
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ad.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, rb param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        oe var7 = null;
        int var8 = 0;
        try {
          var6_int = -41 % ((-86 - param1) / 36);
          if (param3 == null) {
            this.field_b = null;
            return;
          }
          if (this.field_d == param4 &&
            this.field_m &&
            1 == this.field_p &&
            null != this.field_l &&
            this.field_l.equals(param3)) {
            return;
          }
          this.field_m = true;
          this.field_d = param4;
          this.field_p = 1;
          var7 = this.a(param4, false, param3, param2);
          var8 = param4.b(param3);
          var7.field_e[0] = param0 - (var8 >> 1);
          var7.field_e[param3.length()] = param0 + (var8 >> 1);
          ma.a(var7, 0, param3, param4, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("ad.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(String param0, byte param1, int param2, rb param3, int param4, int param5, int param6, int param7) {
        oe discarded$0 = null;
        oe stackIn_65_0;
        oe stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        oe stackIn_66_0 = null;
        oe stackIn_66_1 = null;
        int stackIn_66_4 = 0;
        oe stackIn_72_0 = null;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        oe var14 = null;
        int var15 = 0;
        int var12Lifetime1;
        var15 = ZombieDawn.field_J;
        try {
          if (param4 == 0) {
            param4 = param3.field_C;
          }
          if (null == param0) {
            this.field_b = null;
            return;
          }
          if (this.field_d == param3 &&
            !this.field_m &&
            ~this.field_p == ~param6 &&
            param5 == this.field_n &&
            param4 == this.field_j &&
            param2 == this.field_i &&
            this.field_k == param7 &&
            this.field_l != null &&
            this.field_l.equals(param0)) {
            return;
          }
          this.field_m = false;
          this.field_j = param4;
          this.field_d = param3;
          this.field_l = param0;
          if (param1 != -106) {
            discarded$0 = this.a((rb) null, false, (String) null, 35);
          }
          this.field_p = param6;
          this.field_k = param7;
          this.field_i = param2;
          this.field_n = param5;
          var9 = new String[1 + param3.b(param0, param7)];
          var10 = Math.max(1, param3.a(param0, new int[]{param7}, var9));
          if (this.field_n == 3 &&
            var10 == 1) {
            this.field_n = 1;
          }
          if (this.field_n != 0) {
            if (this.field_n != 1) {
              if (this.field_n != 2) {
                var12 = (this.field_i - this.field_j * var10) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                var11 = param3.field_I + var12;
                this.field_j = this.field_j + var12;
                if (var15 != 0) {
                  var11 = -param3.field_x + (this.field_i - var10 * this.field_j);
                  var11 = param3.field_I + (-(var10 * this.field_j) + this.field_i >> 1);
                  var11 = param3.field_I;
                }
              } else {
                var11 = -param3.field_x + (this.field_i - var10 * this.field_j);
                if (var15 != 0) {
                  var11 = param3.field_I + (-(var10 * this.field_j) + this.field_i >> 1);
                  var11 = param3.field_I;
                }
              }
            } else {
              var11 = param3.field_I + (-(var10 * this.field_j) + this.field_i >> 1);
              if (var15 != 0) {
                var11 = param3.field_I;
              }
            }
          } else {
            var11 = param3.field_I;
          }
          this.field_b = new oe[var10];
          var12Lifetime1 = 0;
          while (var10 > var12Lifetime1) {
            var13 = var9[var12Lifetime1];
            if (var15 != 0) {
              return;
            }
            stackIn_65_0 = null;
            stackIn_65_1 = null;
            stackIn_65_2 = -param3.field_I + var11;
            stackIn_65_3 = param3.field_x + var11;
            if (null == var13) {
              stackIn_66_0 = null;
              stackIn_66_1 = null;
              stackIn_66_4 = 0;
            } else {
              stackIn_66_0 = null;
              stackIn_66_1 = null;
              stackIn_66_4 = var13.length();
            }
            var14 = new oe(stackIn_65_2, stackIn_65_3, stackIn_66_4);
            var14.field_e[0] = 0;
            if (null != var13) {
              var14.field_e[var13.length()] = param3.b(var13);
              stackIn_72_0 = var14;
              if (3 == param6) {
                stackIn_73_1 = this.a(param3.b(var13), var13, param7, 25);
              } else {
                stackIn_73_1 = 0;
              }
              ma.a(stackIn_72_0, stackIn_73_1, var13, param3, false);
            }
            var11 = var11 + param4;
            this.field_b[var12Lifetime1] = var14;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_79_0 = var9_ref;
          stackIn_79_1 = new StringBuilder().append("ad.O(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(boolean param0, int[] param1, gd param2, byte param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = ZombieDawn.field_J;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          if (param3 != 50) {
            field_g = (vn[][]) null;
          }
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var12 = param1[4] * var22 + (param1[3] * var21 + var23 * param1[5]) >> 14;
          var29 = param6[11] >> 2;
          var13 = param1[4] * var25 + (var24 * param1[3] + param1[5] * var26) >> 14;
          var16 = var25 * param1[7] + (var24 * param1[6] + param1[8] * var26) >> 14;
          var18 = param1[11] * var23 + var22 * param1[10] + param1[9] * var21 >> 14;
          var17 = var28 * param1[7] + (var27 * param1[6] + param1[8] * var29) >> 14;
          var20 = param1[11] * var29 + (param1[9] * var27 + param1[10] * var28) >> 14;
          var14 = var29 * param1[5] + var27 * param1[3] + var28 * param1[4] >> 14;
          var15 = var23 * param1[8] + var22 * param1[7] + param1[6] * var21 >> 14;
          var19 = var25 * param1[10] + param1[9] * var24 + var26 * param1[11] >> 14;
          var21Lifetime1 = -param6[0] + param1[0];
          var22Lifetime1 = -param6[1] + param1[1];
          var23Lifetime1 = param1[2] - param6[2];
          var9 = param6[5] * var23Lifetime1 + (var21Lifetime1 * param6[3] + var22Lifetime1 * param6[4]) >> 16 - f.field_a;
          var10 = var22Lifetime1 * param6[7] + var21Lifetime1 * param6[6] + param6[8] * var23Lifetime1 >> -f.field_a + 16;
          var11 = var22Lifetime1 * param6[10] + param6[9] * var21Lifetime1 + param6[11] * var23Lifetime1 >> 16;
          var21Lifetime2 = en.field_a;
          var22Lifetime2 = en.field_i;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (param2.field_k > var23Lifetime2) {
              var24Lifetime1 = param2.field_G[var23Lifetime2];
              var25Lifetime1 = param2.field_B[var23Lifetime2];
              var26Lifetime1 = param2.field_m[var23Lifetime2];
              var27Lifetime1 = var9 + (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var26Lifetime1 * var18) >> -f.field_a + 16);
              var28Lifetime1 = var10 + (var19 * var26Lifetime1 + var25Lifetime1 * var16 + var24Lifetime1 * var13 >> -f.field_a + 16);
              var29Lifetime1 = var11 + (var26Lifetime1 * var20 + (var24Lifetime1 * var14 + var25Lifetime1 * var17) >> 16);
              stackIn_67_0 = var29Lifetime1;
              stackIn_67_1 = 50;
              if (var30 == 0) {
                if (stackIn_67_0 < stackIn_67_1) {
                  pj.field_s[var23Lifetime2] = -2147483648;
                } else {
                  to.field_a[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  wc.field_Nb[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  pj.field_s[var23Lifetime2] = var29Lifetime1;
                }
                if (param4) {
                  ip.field_r[var23Lifetime2] = var27Lifetime1 >> f.field_a;
                  fm.field_G[var23Lifetime2] = var28Lifetime1 >> f.field_a;
                  g.field_P[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param2.field_e &&
                null != param2.field_j &&
                param2.field_A != null &&
                null != param2.field_N &&
                null != param2.field_i &&
                param2.field_I != null &&
                null != param2.field_D &&
                param2.field_t != null &&
                null != param2.field_z) {
                var23Lifetime2 = 0;
                while (!(param2.field_c <= var23Lifetime2)) {
                  var24Lifetime1 = param2.field_e[var23Lifetime2];
                  var25Lifetime1 = param2.field_j[var23Lifetime2];
                  var26Lifetime1 = param2.field_A[var23Lifetime2];
                  qk.field_Cb[var23Lifetime2] = var9 + (var26Lifetime1 * var18 + (var24Lifetime1 * var12 + var25Lifetime1 * var15) >> 16);
                  kj.field_b[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + (var13 * var24Lifetime1 + var25Lifetime1 * var16) >> 16);
                  po.field_zb[var23Lifetime2] = (var26Lifetime1 * var20 + (var24Lifetime1 * var14 + var17 * var25Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param2.field_N[var23Lifetime2];
                  var25Lifetime1 = param2.field_i[var23Lifetime2];
                  var26Lifetime1 = param2.field_I[var23Lifetime2];
                  rm.field_c[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + (var25Lifetime1 * var15 + var12 * var24Lifetime1) >> 16);
                  lb.field_db[var23Lifetime2] = (var13 * var24Lifetime1 + (var16 * var25Lifetime1 + var26Lifetime1 * var19) >> 16) + var10;
                  ce.field_v[var23Lifetime2] = var11 + (var24Lifetime1 * var14 + var17 * var25Lifetime1 + var26Lifetime1 * var20 >> 16);
                  var24Lifetime1 = param2.field_D[var23Lifetime2];
                  var25Lifetime1 = param2.field_t[var23Lifetime2];
                  var26Lifetime1 = param2.field_z[var23Lifetime2];
                  d.field_d[var23Lifetime2] = (var26Lifetime1 * var18 + var24Lifetime1 * var12 + var25Lifetime1 * var15 >> 16) + var9;
                  f.field_g[var23Lifetime2] = (var19 * var26Lifetime1 + var25Lifetime1 * var16 + var13 * var24Lifetime1 >> 16) + var10;
                  wo.field_zb[var23Lifetime2] = (var24Lifetime1 * var14 - (-(var17 * var25Lifetime1) - var26Lifetime1 * var20) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param0) {
                var9 = param1[3];
                var10 = param1[4];
                var11 = param1[5];
                var12 = param1[6];
                var13 = param1[7];
                var14 = param1[8];
                var15 = param1[9];
                var16 = param1[10];
                var17 = param1[11];
                var18 = 0;
                while (!(param2.field_f <= var18)) {
                  stackIn_67_0 = og.field_y.length;
                  stackIn_67_1 = var18;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_67_0 <= stackIn_67_1) {
                    break;
                  }
                  var19 = param2.field_M[var18];
                  var20 = param2.field_q[var18];
                  var21Lifetime2 = param2.field_y[var18];
                  og.field_y[var18] = var15 * var21Lifetime2 + var19 * var9 + var20 * var12 >> 16;
                  jl.field_s[var18] = var21Lifetime2 * var16 + var13 * var20 + var19 * var10 >> 16;
                  qb.field_c[var18] = var11 * var19 - (-(var14 * var20) - var21Lifetime2 * var17) >> 16;
                  var18++;
                }
              }
              stackIn_67_0 = 0;
              stackIn_67_1 = var7_int;
            }
            break;
          }
          po.a(stackIn_67_0, stackIn_67_1, param5, var8, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("ad.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final void a(int param0, rb param1, String param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        oe var6 = null;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param2) {
            this.field_b = null;
            return;
          }
          if (param1 == this.field_d &&
            this.field_m &&
            this.field_p == 0 &&
            this.field_l != null &&
            this.field_l.equals(param2)) {
            return;
          }
          this.field_l = param2;
          this.field_d = param1;
          this.field_m = true;
          this.field_p = 0;
          var6 = this.a(param1, false, param2, param4);
          var6.field_e[0] = param3;
          var6.field_e[param2.length()] = param1.b(param2) + param3;
          var7 = 91 % ((19 - param0) / 59);
          ma.a(var6, 0, param2, param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_26_0 = runtimeException;
          stackIn_26_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void c(byte param0) {
        try {
          wo.field_xb.j(param0 ^ -636330917);
          wo.field_xb.a(new lb(wo.field_xb), true);
          if (param0 != 122) {
            ad.b(-91);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ad.I(" + param0 + ')');
        }
    }

    public ad() {
    }

    static {
        field_o = "Waiting for extra data";
        field_h = new vo();
        field_g = new vn[2][];
    }
}
