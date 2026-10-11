/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends ta {
    private am[] field_t;
    private int[] field_s;
    private int[] field_q;
    static String field_r;
    private am field_u;

    final static boolean a(int param0) {
        int var1 = -8 % ((-70 - param0) / 35);
        return bn.field_i;
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
          field_r = (String) null;
        }
    }

    final int[] a(boolean param0, la param1, int param2, double param3, boolean param4, int param5, si param6, int param7) {
        int var10_int = 0;
        int var19 = 0;
        int[] stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int var15Lifetime1;
        var24 = Torquing.field_u;
        try {
          ue.field_g = param6;
          vf.field_a = param1;
          for (var10_int = 0; this.field_t.length > var10_int; var10_int++) {
            this.field_t[var10_int].a(param7, param5 + 17749, param2);
          }
          pe.a((byte) -122, param3);
          re.a(param2, 0, param7);
          var26 = new int[param7 * param2];
          var10 = var26;
          if (param4) {
            var12 = -1;
            var11 = -1 + param7;
            var13 = -1;
          } else {
            var12 = param7;
            var11 = 0;
            var13 = 1;
          }
          var14 = param5;
          for (var15 = 0; param2 > var15; var15++) {
            if (param0) {
              var14 = var15;
            }
            if (this.field_u.field_p) {
              var19_ref_int__ = this.field_u.a((byte) 111, var15);
              var18 = var19_ref_int__;
              var17 = var19_ref_int__;
              var16 = var19_ref_int__;
            } else {
              var29 = this.field_u.a(-29116, var15);
              var28 = var29;
              var25 = var28;
              var19_ref_int____ = var25;
              var16 = var29[0];
              var18 = var29[2];
              var17 = var29[1];
            }
            for (var19 = var11; var12 != var19; var19 = var19 + var13) {
              var20 = var16[var19] >> 4;
              if (var20 > 255) {
                var20 = 255;
              }
              if (var20 < 0) {
                var20 = 0;
              }
              var21 = var17[var19] >> 4;
              if (var21 > 255) {
                var21 = 255;
              }
              if (var21 < 0) {
                var21 = 0;
              }
              var22 = var18[var19] >> 4;
              if (var22 > 255) {
                var22 = 255;
              }
              if (var22 < 0) {
                var22 = 0;
              }
              var20 = uk.field_b[var20];
              var21 = uk.field_b[var21];
              var22 = uk.field_b[var22];
              var23 = var22 + ((var21 << 8) + (var20 << 16));
              if (var23 != 0) {
                var23 = var23 | -16777216;
              }
              var26[var14++] = var23;
              if (param0) {
                var14 = var14 + (-1 + param7);
              }
            }
          }
          var27 = 0;
          var15Lifetime1 = var27;
          while (this.field_t.length > var27) {
            this.field_t[var27].d((byte) -127);
            var27++;
          }
          stackIn_40_0 = var10;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_43_0 = var10_ref;
          stackIn_43_1 = new StringBuilder().append("wd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        if (!param4) {
          wd.b(23);
        }
        if (param5 == param3) {
          lc.a(param1, param2, -123, param7, param6, param5, param0);
        } else {
          if (kn.field_e > -param5 + param2) {
            wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
          } else {
            if (qg.field_z < param2 + param5) {
              wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
            } else {
              if (j.field_q > -param3 + param7) {
                wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
              } else {
                if (param3 + param7 > qk.field_p) {
                  wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                } else {
                  ai.a(param6, param0, param2, param5, param7, param1, -128, param3);
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, la param1, si param2) {
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var4_intLifetime1;
        var6 = Torquing.field_u;
        try {
          if (po.field_u >= 0) {
            for (var4_int = 0; var4_int < this.field_q.length; var4_int++) {
              if (!param1.a(po.field_u, this.field_q[var4_int], (byte) -123)) {
                return false;
              }
            }
          } else {
            for (var4_int = 0; this.field_q.length > var4_int; var4_int++) {
              if (!param1.a(this.field_q[var4_int], false)) {
                return false;
              }
            }
          }
          for (var4_intLifetime1 = 0; this.field_s.length > var4_intLifetime1; var4_intLifetime1++) {
            if (!param2.a(this.field_s[var4_intLifetime1], 3)) {
              return false;
            }
          }
          var5 = -105 % ((param0 - 2) / 37);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("wd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    wd(fj param0) {
        int[] array$2 = null;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        am var13 = null;
        am var14 = null;
        am var15 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1Lifetime1;
        try {
          var2_int = param0.i((byte) -101);
          var3 = 0;
          var4 = 0;
          this.field_t = new am[var2_int];
          var12 = new int[var2_int][];
          for (var6 = 0; var2_int > var6; var6++) {
            var13 = fn.a(-58, param0);
            var14 = var13;
            if (var14.e((byte) 62) >= 0) {
              var3++;
            }
            if (0 <= var14.f((byte) 23)) {
              var4++;
            }
            var8 = var14.field_m.length;
            array$2 = new int[var8];
            var12[var6] = array$2;
            for (var9 = 0; var8 > var9; var9++) {
              var12[var6][var9] = param0.i((byte) -101);
            }
            this.field_t[var6] = var13;
          }
          this.field_q = new int[var3];
          this.field_s = new int[var4];
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          for (var6Lifetime1 = 0; var6Lifetime1 < var2_int; var6Lifetime1++) {
            var15 = this.field_t[var6Lifetime1];
            var8Lifetime1 = var15.field_m.length;
            for (var9Lifetime1 = 0; var9Lifetime1 < var8Lifetime1; var9Lifetime1++) {
              var15.field_m[var9Lifetime1] = this.field_t[var12[var6Lifetime1][var9Lifetime1]];
            }
            var9Lifetime1Lifetime1 = var15.e((byte) 27);
            var10 = var15.f((byte) 57);
            if (var9Lifetime1Lifetime1 > 0) {
              incrementValue$0 = var3Lifetime1;
              var3Lifetime1++;
              this.field_q[incrementValue$0] = var9Lifetime1Lifetime1;
            }
            if (var10 > 0) {
              incrementValue$1 = var4Lifetime1;
              var4Lifetime1++;
              this.field_s[incrementValue$1] = var10;
            }
            var12[var6Lifetime1] = null;
          }
          this.field_u = this.field_t[param0.i((byte) -101)];
          param0.i((byte) -101);
          param0.i((byte) -101);
          var5 = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("wd.<init>(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_r = "to over <%0> great games";
    }
}
