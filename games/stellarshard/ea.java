/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends lk {
    static int field_p;
    static pb field_m;
    static pb field_l;
    private ae field_q;
    static ua field_o;
    static String field_k;
    static String field_n;

    final static void a(int param0, nf param1, byte param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ha var7 = null;
        ha var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var7 = pg.field_fb;
            var8 = var7;
            var8.f(param0, 950);
            var8.field_k = var8.field_k + 1;
            var4 = var8.field_k;
            var8.a(false, 1);
            var8.c(param1.field_u, -123);
            var8.c(param1.field_s, -123);
            var8.c(param1.field_q, -118);
            var8.b(0, param1.field_l);
            var8.b(0, param1.field_p);
            var8.b(0, param1.field_t);
            var8.b(0, param1.field_n);
            var8.a(false, param1.field_m.length);
            var5 = 0;
            L1: while (true) {
              if (param1.field_m.length <= var5) {
                L2: {
                  if (param2 == 80) {
                    break L2;
                  } else {
                    ea.e((byte) 58);
                    break L2;
                  }
                }
                discarded$1 = var8.c(var4, (byte) -3);
                var8.a(-var4 + var8.field_k, (byte) -124);
                break L0;
              } else {
                var7.b(0, param1.field_m[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ea.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static int f(byte param0) {
        int var1 = -76 % ((param0 - 48) / 43);
        return (int)(1000000000L / ph.field_B);
    }

    final String b(byte param0, String param1) {
        w var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_q instanceof je) {
                var3 = ((je) ((Object) this.field_q)).a((byte) 54);
                if (var3 != null) {
                  L2: {
                    if (var3.b(-28036) != lg.field_c) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_q.field_m)) {
                        stackOut_7_0 = lc.field_o;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_9_0 = var3.c(-22773);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3_int = -99 / ((20 - param0) / 40);
            if (!param1.equals(this.field_q.field_m)) {
              stackOut_13_0 = lc.field_o;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("ea.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void g(byte param0) {
        int discarded$0 = 0;
        field_n = null;
        field_o = null;
        field_m = null;
        field_k = null;
        if (param0 != 117) {
            discarded$0 = ea.f((byte) 34);
        }
        field_l = null;
    }

    final static void e(byte param0) {
        int var1_int = 0;
        int var2 = stellarshard.field_B;
        try {
            qb.field_k = qb.field_k - te.field_c;
            te.field_c = 0;
            if (param0 < 79) {
                ea.g((byte) 66);
            }
            for (var1_int = 0; 1000 > var1_int; var1_int++) {
                a.field_h[var1_int] = null;
            }
            for (var1_int = 0; (var1_int ^ -1) > -3001; var1_int++) {
                wk.field_b[var1_int] = null;
            }
            for (var1_int = 0; (var1_int ^ -1) > -1001; var1_int++) {
                hf.field_e[var1_int] = null;
            }
            gh.field_b = 0;
            e.field_e = -1;
            nc.field_H = 0;
            s.field_i = false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ea.B(" + param0 + ')');
        }
    }

    final cg a(byte param0, String param1) {
        w var3 = null;
        RuntimeException var3_ref = null;
        cg stackIn_5_0 = null;
        cg stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_4_0 = null;
        cg stackOut_10_0 = null;
        cg stackOut_9_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!(this.field_q instanceof je)) {
                break L1;
              } else {
                var3 = ((je) ((Object) this.field_q)).a((byte) 30);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(-28036) != lg.field_c) {
                    stackOut_4_0 = qj.field_c;
                    stackIn_5_0 = stackOut_4_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 >= 10) {
                break L2;
              } else {
                ea.g((byte) 85);
                break L2;
              }
            }
            L3: {
              if (param1.equals(this.field_q.field_m)) {
                stackOut_10_0 = lg.field_c;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = qj.field_c;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("ea.A(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    ea(ae param0, ae param1) {
        super(param0);
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new ua(2);
        field_k = "Unpacking models";
        field_n = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
