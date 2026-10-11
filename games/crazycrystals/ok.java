/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok implements wo {
    static fp field_b;
    private int field_d;
    static String field_i;
    private int field_f;
    static oj field_e;
    private vc field_h;
    static jm field_g;
    static db field_c;
    static wb field_a;

    final static void a(int param0) {
        jm.field_a = null;
        ui.field_c = (byte[][]) null;
        if (param0 != 2188450) {
          return;
        }
        try {
          uo.field_l = null;
          je.field_c = null;
          gh.field_z = null;
          uo.field_k = null;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ok.A(" + param0 + ')');
        }
    }

    final static void a(jg param0, int param1, byte param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int stackIn_36_0Lifetime1;
        int stackIn_36_1Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var20 = CrazyCrystals.field_B;
        try {
          var5_int = 8 / ((-86 - param2) / 33);
          var6 = eq.c((-param1 + param4) * 3, (byte) 100);
          var7 = param1 * 3;
          var8 = var6 - 10;
          go.a(-21587);
          if (0 < param0.field_s &&
            null != param0.field_o) {
            ck.n(48);
          }
          pi.field_o = 0;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_I > var9)))) {
            var10 = param0.field_K[var9];
            var11 = param0.field_g[var9];
            var12 = param0.field_c[var9];
            stackOut_10_0 = param3;
            stackIn_45_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var20 == 0) {
              if (stackIn_11_0) {
                var13 = dn.field_a[var10];
                var14 = qk.field_E[var10];
                var15 = dn.field_a[var11] - var13;
                var16 = dn.field_a[var12] - var13;
                var17 = -var14 + qk.field_E[var11];
                var18 = qk.field_E[var12] - var14;
              }
              if (!stackIn_11_0 ||
                var15 * var18 - var16 * var17 < 0) {
                var13Lifetime1 = cf.field_g[var10];
                if (var13Lifetime1 != -2147483648) {
                  var14Lifetime1 = cf.field_g[var11];
                  if (-2147483648 != var14Lifetime1) {
                    var15 = cf.field_g[var12];
                    if (var15 != -2147483648) {
                      var16 = var15 + (var13Lifetime1 + var14Lifetime1 - var7);
                      if (var8 >= 0) {
                        stackIn_25_0 = var16 >> var8;
                      } else {
                        stackIn_25_0 = var16 << -var8;
                      }
                      var17 = -stackIn_25_0 + (-1 + ga.field_J.length);
                      var18 = ga.field_J[var17];
                      while (true) {
                        if (var18 >> 4 != 0) {
                          var17--;
                          stackIn_36_0 = -1;
                          stackIn_36_1 = ~var17;
                          if (stackIn_36_0 < stackIn_36_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var18 = ga.field_J[var17];
                          continue;
                        }
                        stackIn_36_0Lifetime1 = var17 << 4;
                        stackIn_36_1Lifetime1 = var18;
                        var19 = stackIn_36_0Lifetime1 + stackIn_36_1Lifetime1;
                        gh.field_E[var19] = var9;
                        ga.field_J[var17] = 1 + var18;
                        if (param0.field_s > 0 &&
                          null != param0.field_o) {
                          dupTemp$0 = param0.field_o[var9];
                          to.field_b[dupTemp$0] = to.field_b[dupTemp$0] + 1;
                        }
                        pi.field_o = pi.field_o + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_45_0 = -1;
          }
          if (stackIn_45_0 > ~param0.field_s &&
            null != param0.field_o) {
            var9Lifetime1 = 0;
            var10Lifetime1 = 0;
            while (!(to.field_b.length <= var10Lifetime1)) {
              var11Lifetime1 = to.field_b[var10Lifetime1];
              to.field_b[var10Lifetime1] = var9Lifetime1;
              var9Lifetime1 = var9Lifetime1 + var11Lifetime1;
              var10Lifetime1++;
              if (var20 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("ok.C(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        try {
          field_b = null;
          field_g = null;
          field_c = null;
          field_e = null;
          field_i = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ok.D(" + param0 + ')');
        }
    }

    public ok() {
        try {
          this.field_h = ai.field_h;
          this.field_f = 1;
          this.field_d = 1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ok.<init>()");
        }
    }

    ok(vc param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param2;
          this.field_f = param1;
          this.field_h = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ok.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int stackIn_10_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        try {
          if (param1) {
            return;
          }
          if (!param3.field_m &&
            !param3.e(-123)) {
            stackIn_10_0 = 2188450;
          } else {
            stackIn_10_0 = 3249872;
          }
          var6_int = stackIn_10_0;
          this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_o + "</u>", param2 + param3.field_r, param0 + param3.field_j, param3.field_g, param3.field_f, var6_int, -1, this.field_f, this.field_d, this.field_h.field_u + this.field_h.field_o);
          if (param3.e(-125)) {
            var7 = this.field_h.a(param3.field_o);
            var8 = this.field_h.field_o + this.field_h.field_u;
            var9 = param2 + param3.field_r;
            var10 = param3.field_j + param0;
            if (this.field_f != 2) {
              if (1 == this.field_f) {
                var9 = var9 + (-var7 + param3.field_g >> 1);
                if (var11 != 0) {
                  var9 = var9 + (-var7 + param3.field_g);
                }
              }
            } else {
              var9 = var9 + (-var7 + param3.field_g);
            }
            if (this.field_d != 2) {
              if (this.field_d == 1) {
                var10 = var10 + (-var8 + param3.field_f >> 1);
                if (var11 != 0) {
                  var10 = var10 + (param3.field_f - var8);
                }
              }
            } else {
              var10 = var10 + (param3.field_f - var8);
            }
            ci.a(var9 - 2, var10 + 2, param1, var8, 4 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("ok.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_i = "Create";
        field_b = new fp();
        field_a = new wb();
    }
}
