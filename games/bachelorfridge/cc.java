/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_a;
    private vr field_c;
    private vr field_f;
    private pha field_g;
    static String[] field_d;
    static sna field_b;
    static ht field_e;

    final jc a(byte param0, int param1) {
        byte[] var4 = null;
        jc var3 = (jc) (this.field_g.a(-100, (long)param1));
        if (var3 != null) {
          return var3;
        }
        int var5 = -115 % ((-69 - param0) / 38);
        if (param1 >= 32768) {
          var4 = this.field_f.b(88, 0, param1 & 32767);
        } else {
          var4 = this.field_c.b(121, 0, param1);
        }
        var3 = new jc();
        if (var4 != null) {
          var3.a(new lu(var4), false);
        }
        if (param1 >= 32768) {
          var3.d((byte) -25);
        }
        this.field_g.a((long)param1, 1, var3);
        return var3;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -122) {
          ht var2 = (ht) null;
          cc.a(-37, (String) null, 61, 62, -69, (ht) null, -47, 27, -18);
        }
        field_e = null;
        field_b = null;
        field_a = null;
    }

    cc(int param0, vr param1, vr param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = new pha(64);
        try {
          this.field_c = param1;
          this.field_f = param2;
          if (null != this.field_c) {
            this.field_c.d(0, 0);
          }
          if (null != this.field_f) {
            this.field_f.d(0, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("cc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ma param4, byte param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ai stackIn_41_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        ai var21 = null;
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
        ma var44 = null;
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
        var40 = BachelorFridge.field_y;
        try {
          var44 = param4;
          if (param5 >= -64) {
            field_d = (String[]) null;
          }
          if (var44.field_d != null &&
            var44.field_n > 1) {
            var60 = var44.field_d;
            dla.a(0, fg.field_a, 72, var60, 0);
          } else {
            ku.d(-372);
          }
          var54 = new int[param4.field_i];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param4.field_i];
          var62 = bv.field_G;
          var63 = fv.field_x;
          var61 = ep.field_l;
          for (var13 = 0; param4.field_i > var13; var13++) {
            var14 = var61[var13] * param1 + (var62[var13] * param0 + param3 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (128 <= var14) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = var14 + 128;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = param7 * var62[var13] - (-(param2 * var63[var13]) - param6 * var61[var13]) >> 8;
            stackIn_20_0 = qk.field_m;
            if (var15 >= 0) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime2 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < lq.field_y; var13Lifetime1++) {
            var14Lifetime1 = ci.field_q[var13Lifetime1];
            var15Lifetime1 = param4.field_C[var14Lifetime1];
            var16 = param4.field_h[var14Lifetime1];
            var17 = param4.field_t[var14Lifetime1];
            if (param4.field_F[var14Lifetime1] < bv.field_G.length) {
              stackIn_27_0 = param4.field_F[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var18 = stackIn_27_0;
            if (bv.field_G.length > param4.field_c[var14Lifetime1]) {
              stackIn_30_0 = param4.field_c[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var19 = stackIn_30_0;
            if (bv.field_G.length > param4.field_e[var14Lifetime1]) {
              stackIn_33_0 = param4.field_e[var14Lifetime1];
            } else {
              stackIn_33_0 = -1;
            }
            var20 = stackIn_33_0;
            if (null != ld.field_o &&
              param4.field_w != null &&
              var14Lifetime1 < param4.field_w.length &&
              param4.field_w[var14Lifetime1] != -1 &&
              param4.field_w[var14Lifetime1] < ld.field_o.length) {
              stackIn_41_0 = ld.field_o[param4.field_w[var14Lifetime1]];
            } else {
              stackIn_41_0 = null;
            }
            var21 = stackIn_41_0;
            var22 = du.field_e[var15Lifetime1];
            var23 = ew.field_s[var15Lifetime1];
            var24 = du.field_e[var16];
            var25 = ew.field_s[var16];
            var26 = du.field_e[var17];
            var27 = ew.field_s[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_46_0 = var21.field_b;
              } else {
                stackIn_46_0 = 8355711;
              }
              var30 = stackIn_46_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = -369164033 & var28 * var31 >>> 8 | (var28 * var32 & 16711854) >>> 8;
              var33 = var33 + 65793 * var29;
              el.a(29322, var24, var25, (16711422 & var33) >> 1, var23, var22, var26, var27);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_50_0 = var21.field_b;
              } else {
                stackIn_50_0 = 8355711;
              }
              var34 = stackIn_50_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (var28 * var36 & 16711814) >>> 8 | -218169089 & var28 * var35 >>> 8;
              var38 = 134152447 & var35 * var29 >>> 8 | -234815744 & var36 * var29 >>> 8;
              var39 = var36 * var30 >>> 8 & 922812160 | (-16711745 & var35 * var30) >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + 65793 * var31;
              var39 = var39 + 65793 * var33;
              ba.a(var26, var23, var39 >> 16, var38 >> 16, var37 >> 16, var38 & 255, (var38 & 65511) >> 8, var25, var37 >> 8 & 255, var39 & 255, var37 & 255, var27, var24, var22, (byte) 50, (65416 & var39) >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("cc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, ht param5, int param6, int param7, int param8) {
        nj.field_f = param4;
        pw.field_A = param1;
        ro.field_j = param0;
        if (param2 != -1456477592) {
          return;
        }
        try {
          ma.field_E = param6;
          mh.field_l = param5;
          bd.field_m = param8;
          uea.field_i = param7;
          gp.field_x = param3;
          aka.field_G = (vm) ((Object) new cl());
          oea.field_q = new ea(param5);
          ga.field_c = new kb(aka.field_G, oea.field_q);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = "Decline invitation to <%0>'s game";
    }
}
