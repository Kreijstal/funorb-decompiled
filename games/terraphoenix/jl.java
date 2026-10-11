/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends jc {
    static int[] field_A;
    static d field_I;
    int field_J;

    public jl() {
        super(0, 0, 0, 0, (cj) null, (sc) null);
        this.field_J = 256;
    }

    final static void i(byte param0) {
        String var2 = (String) null;
        hl.a((byte) -93, (String) null, oe.field_a);
        if (param0 > -54) {
          jl.i((byte) 51);
        }
    }

    public static void g(byte param0) {
        if (param0 > -127) {
          field_I = (d) null;
        }
        field_I = null;
        field_A = null;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        try {
          if (param0 == null) {
            stackIn_4_0 = km.field_m;
            return stackIn_4_0;
          }
          if (param1 < 110) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          var3_int = param0.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = hm.a((byte) -126, param0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ad.a((byte) 103, var4.charAt(0)) &&
                !ad.a((byte) 107, var4.charAt(var4.length() - 1))) {
                var5 = 0;
                for (var6 = 0; var6 < param0.length(); var6++) {
                  var7 = param0.charAt(var6);
                  if (!ad.a((byte) 91, (char) var7)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_31_0 = fd.field_p;
                    return stackIn_31_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_36_0 = vi.field_t;
                return stackIn_36_0;
              }
              stackIn_22_0 = vi.field_t;
              return stackIn_22_0;
            }
            stackIn_17_0 = km.field_m;
            return stackIn_17_0;
          }
          stackIn_12_0 = km.field_m;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("jl.A(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        se var1 = null;
        RuntimeException var1_ref = null;
        se var5 = null;
        var4 = Terraphoenix.field_V;
        try {
          if (param0 > -33) {
            return;
          }
          for (var2 = 1; var2 < rd.field_t; var2++) {
            for (var3 = rd.field_t - 1; var2 <= var3; var3--) {
              if (tc.a(false, p.field_a[var3].field_a, 320, 240, p.field_a[var3].field_g) > tc.a(false, p.field_a[-1 + var3].field_a, 320, 240, p.field_a[-1 + var3].field_g)) {
                var5 = p.field_a[var3];
                var1 = var5;
                p.field_a[var3] = p.field_a[var3 - 1];
                p.field_a[var3 - 1] = var5;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "jl.H(" + param0 + ')');
        }
    }

    final static void a(ci[] param0, int param1, int param2, int param3, byte param4, int param5) {
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        int var23 = 0;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        var23 = Terraphoenix.field_V;
        try {
          if (param0 == null) {
            return;
          }
          if (param3 > 0 &&
            param1 > 0) {
            if (param0[3] != null) {
              stackIn_10_0 = param0[3].field_q;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (null == param0[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param0[5].field_q;
            }
            var7 = stackIn_13_0;
            if (param0[1] == null) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param0[1].field_u;
            }
            var8 = stackIn_16_0;
            if (null != param0[7]) {
              stackIn_19_0 = param0[7].field_u;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = param3 + param5;
            var11 = param2 + param1;
            var12 = param5 + var6_int;
            var13 = -var7 + var10;
            var14 = param2 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = var6_int * param3 / (var6_int + var7) + param5;
              var16 = var6_int * param3 / (var6_int + var7) + param5;
            }
            var18 = var14;
            var19 = var15;
            l.b(e.field_t);
            if (var18 > var19) {
              var19 = param2 + var8 * param1 / (var9 + var8);
              var18 = param2 + var8 * param1 / (var9 + var8);
            }
            if (param0[0] != null) {
              l.i(param5, param2, var16, var18);
              param0[0].b(param5, param2);
              l.a(e.field_t);
            }
            if (null != param0[2]) {
              l.i(var17, param2, var10, var18);
              param0[2].b(var13, param2);
              l.a(e.field_t);
            }
            if (param0[6] != null) {
              l.i(param5, var19, var16, var11);
              param0[6].b(param5, var15);
              l.a(e.field_t);
            }
            if (param0[8] != null) {
              l.i(var17, var19, var10, var11);
              param0[8].b(var13, var15);
              l.a(e.field_t);
            }
            if (null != param0[1] &&
              param0[1].field_q != 0) {
              l.i(var16, param2, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param0[1].field_q) {
                param0[1].b(var20, param2);
              }
              l.a(e.field_t);
            }
            var20Lifetime1 = 15 / ((param4 + 43) / 56);
            if (null != param0[7] &&
              param0[7].field_q != 0) {
              l.i(var16, var19, var17, var11);
              for (var21 = var12; var21 < var13; var21 = var21 + param0[7].field_q) {
                param0[7].b(var21, var15);
              }
              l.a(e.field_t);
            }
            if (null != param0[3] &&
              param0[3].field_u != 0) {
              l.i(param5, var18, var16, var19);
              for (var21Lifetime1 = var14; var21Lifetime1 < var15; var21Lifetime1 = var21Lifetime1 + param0[3].field_u) {
                param0[3].b(param5, var21Lifetime1);
              }
              l.a(e.field_t);
            }
            if (param0[5] != null &&
              param0[5].field_u != 0) {
              l.i(var17, var18, var10, var19);
              for (var21Lifetime2 = var14; var15 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param0[5].field_u) {
                param0[5].b(var13, var21Lifetime2);
              }
              l.a(e.field_t);
            }
            if (param0[4] != null &&
              param0[4].field_q != 0 &&
              param0[4].field_u != 0) {
              l.i(var16, var18, var17, var19);
              for (var21Lifetime3 = var14; var21Lifetime3 < var15; var21Lifetime3 = var21Lifetime3 + param0[4].field_u) {
                for (var22 = var12; var22 < var13; var22 = var22 + param0[4].field_q) {
                  param0[4].b(var22, var21Lifetime3);
                }
              }
              l.a(e.field_t);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("jl.I(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    jl(gl param0) {
        super(param0.field_w, param0.field_u, param0.field_p, param0.field_n, (cj) null, (sc) null);
        try {
          param0.a(0, (byte) 112, this.field_p, 0, this.field_n);
          this.field_F = param0;
          this.field_J = 256;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          return;
        }
        if (this.field_F == null) {
          return;
        }
        if (0 == this.field_J) {
          return;
        }
        if (this.field_J == 256) {
          this.field_F.a(this.field_w + param0, -124, param2, this.field_u + param3);
          return;
        }
        if (param1 >= -106) {
          jl.g((byte) -79);
        }
        ci var6 = new ci(this.field_F.field_p, this.field_F.field_n);
        il.a(1, var6);
        this.field_F.a(0, -128, param2, 0);
        ij.a(false);
        var6.a(param0 + this.field_w, param3 + this.field_u, this.field_J);
    }

    static {
        field_A = new int[8192];
    }
}
