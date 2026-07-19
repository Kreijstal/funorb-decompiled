/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_b;
    private am field_a;
    static boolean field_d;
    static double field_e;
    private am field_c;

    final am a(int param0) {
        am var2 = this.field_a.field_f;
        if (!(var2 != this.field_a)) {
            this.field_c = null;
            return null;
        }
        if (param0 >= -111) {
            return (am) null;
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final int c(int param0) {
        int var4 = Kickabout.field_G;
        int var2 = 0;
        am var3 = this.field_a.field_f;
        if (param0 != -1976587888) {
            field_e = 0.5554742673995899;
        }
        while (this.field_a != var3) {
            var2++;
            var3 = var3.field_f;
        }
        return var2;
    }

    final void a(int param0, am param1) {
        RuntimeException var3 = null;
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
            L1: {
              if (param1.field_e == null) {
                break L1;
              } else {
                param1.f(79);
                break L1;
              }
            }
            L2: {
              param1.field_e = this.field_a.field_e;
              param1.field_f = this.field_a;
              param1.field_e.field_f = param1;
              param1.field_f.field_e = param1;
              if (param0 == 127) {
                break L2;
              } else {
                o.d(-50);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("o.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static eg a(int param0, vn param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        eg var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn var7 = null;
        int var8 = 0;
        vn var9 = null;
        eg stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var7 = new vn(param1, false, false, true, true);
            var9 = var7;
            var3 = 91 / ((param0 - 2) / 60);
            var4_int = 0;
            L1: while (true) {
              if (var9.field_p.length <= var4_int) {
                var8 = 0;
                var4_int = var8;
                L2: while (true) {
                  if (var9.field_l.length <= var8) {
                    var4 = (eg) ((Object) var9.a(127, 131072, 10, 10, 10));
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.field_n.length) {
                        stackOut_10_0 = (eg) (var4);
                        stackIn_11_0 = stackOut_10_0;
                        break L0;
                      } else {
                        var4.field_n[var5] = -1;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    var9.field_l[var8] = (var9.field_l[var8] << 47207681) / 3;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var7.field_p[var4_int] = (short)6;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("o.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final am b(byte param0) {
        int var3 = 118 % ((54 - param0) / 51);
        am var2 = this.field_a.field_f;
        if (var2 == this.field_a) {
            return null;
        }
        var2.f(114);
        return var2;
    }

    public static void d(int param0) {
        field_b = null;
        if (param0 != 1603) {
            field_d = false;
        }
    }

    final am b(int param0) {
        int discarded$0 = 0;
        am var2 = this.field_c;
        if (var2 == this.field_a) {
            this.field_c = null;
            return null;
        }
        if (param0 != 0) {
            discarded$0 = this.c(14);
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final static void a(byte param0) {
        boolean discarded$1 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        nl var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            df.d(true);
            var1_int = 0;
            if (param0 == -127) {
              L1: while (true) {
                if (var1_int >= 3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2 = et.field_d.field_P[1][var1_int - -1];
                  if (tc.a(0, (byte) 86, var2.field_M, var2, nt.field_zb[var1_int] << -1335268624)) {
                    L2: {
                      nt.field_zb[var1_int] = 700 + (-var2.a(true) - -700);
                      if (-701 <= (nt.field_zb[var1_int] ^ -1)) {
                        nt.field_zb[var1_int] = Math.max(520, nt.field_zb[var1_int] - 20);
                        break L2;
                      } else {
                        nt.field_zb[var1_int] = Math.min(880, nt.field_zb[var1_int] + 20);
                        break L2;
                      }
                    }
                    discarded$1 = tc.a(0, (byte) 122, var2.field_M, var2, nt.field_zb[var1_int] << -1976587888);
                    var1_int++;
                    continue L1;
                  } else {
                    var1_int++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "o.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public o() {
        this.field_a = new am();
        this.field_a.field_f = this.field_a;
        this.field_a.field_e = this.field_a;
    }

    static {
        field_b = "Achievements";
    }
}
