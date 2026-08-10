/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private long field_a;
    private int field_b;

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
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
        if (param1 != -5825) {
          this.b(-43, -86);
          return 15 & (int)(this.field_a >> rl.field_e * param0);
        } else {
          return 15 & (int)(this.field_a >> rl.field_e * param0);
        }
    }

    private final void a(rl param0, int param1) {
        int fieldTemp$0 = 0;
        int discarded$1 = 0;
        try {
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_a = this.field_a | (long)(param0.field_f << rl.field_e * fieldTemp$0);
            if (param1 != 15258) {
                discarded$1 = this.a(45, 78);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0, int param1) {
        int var3 = 0;
        ga var4 = null;
        uc var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int var17;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("pl.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
