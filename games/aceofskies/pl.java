/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private long field_a;
    private int field_b;

    final static void a(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5 = gi.field_i;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "pl.C(" + param0 + ')');
        }
    }

    final rl b(int param0, int param1) {
        int var3 = -83 % ((param1 - -62) / 63);
        return rl.a(this.a(param0, -5825), (byte) -101);
    }

    private final int a(int param0, int param1) {
        rl discarded$2 = null;
        if (param1 != -5825) {
          discarded$2 = this.b(-43, -86);
          return 15 & (int)(this.field_a >> rl.field_e * param0);
        } else {
          return 15 & (int)(this.field_a >> rl.field_e * param0);
        }
    }

    private final void a(rl param0, int param1) {
        int fieldTemp$4 = 0;
        int discarded$5 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              fieldTemp$4 = this.field_b;
              this.field_b = this.field_b + 1;
              this.field_a = this.field_a | (long)(param0.field_f << rl.field_e * fieldTemp$4);
              if (param1 == 15258) {
                break L1;
              } else {
                discarded$5 = this.a(45, 78);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("pl.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ga var4 = null;
        uc var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4 = (ga) ((Object) tq.field_d.d(268435455));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 0) {
                  var5 = (uc) ((Object) nh.field_g.d(268435455));
                  L2: while (true) {
                    if (var5 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      ag.a(param0, 5, var5);
                      var5 = (uc) ((Object) nh.field_g.b((byte) 103));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                ac.a(0, param0, var4);
                var4 = (ga) ((Object) tq.field_d.b((byte) 103));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pl.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pl(rl param0) {
        try {
            this.field_b = 1;
            this.field_a = (long)param0.field_f;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15) {
        int var17 = 0;
        var17 = AceOfSkies.field_G ? 1 : 0;
        if (param1 >= param8) {
          if (param4 <= param1) {
            if (param8 >= param4) {
              md.a(param1, param0, param12, param13, param14, vp.field_j, param11, param9, param3, param5, param2, param6, param7, param10, param8, param4, (byte) -46);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            } else {
              md.a(param1, param0, param6, param7, param3, vp.field_j, param9, param11, param14, param5, param2, param12, param13, param10, param4, param8, (byte) -24);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            }
          } else {
            md.a(param4, param9, param6, param10, param3, vp.field_j, param0, param11, param2, param12, param14, param5, param13, param7, param1, param8, (byte) -120);
            if (param15) {
              pl.c(70, -13);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param4 > param8) {
            md.a(param4, param9, param5, param13, param2, vp.field_j, param11, param0, param3, param12, param14, param6, param10, param7, param8, param1, (byte) -70);
            if (!param15) {
              return;
            } else {
              pl.c(70, -13);
              return;
            }
          } else {
            if (param1 < param4) {
              md.a(param8, param11, param5, param7, param2, vp.field_j, param9, param0, param14, param6, param3, param12, param10, param13, param4, param1, (byte) -65);
              if (!param15) {
                return;
              } else {
                pl.c(70, -13);
                return;
              }
            } else {
              md.a(param8, param11, param12, param10, param14, vp.field_j, param0, param9, param2, param6, param3, param5, param7, param13, param1, param4, (byte) -102);
              if (param15) {
                pl.c(70, -13);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    pl(rl[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param0.length <= var2_int) {
                break L0;
              } else {
                this.a(param0[var2_int], 15258);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("pl.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 90) {
            this.field_a = 34L;
            return this.field_b;
        }
        return this.field_b;
    }

    final static String b(int param0) {
        int var1 = 123 % ((param0 - -43) / 56);
        return nm.field_c.h(-17883);
    }

    static {
    }
}
