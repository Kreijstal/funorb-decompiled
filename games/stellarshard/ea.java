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
        ha var7 = null;
        ha var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = stellarshard.field_B;
        try {
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
            for (var5 = 0; param1.field_m.length > var5; var5++) {
                var7.b(0, param1.field_m[var5]);
            }
            if (param2 != 80) {
                ea.e((byte) 58);
            }
            var8.c(var4, (byte) -3);
            var8.a(-var4 + var8.field_k, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                        stackIn_8_0 = lc.field_o;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_10_0 = var3.c(-22773);
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
              stackIn_14_0 = lc.field_o;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ea.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
        field_n = null;
        field_o = null;
        field_m = null;
        field_k = null;
        if (param0 != 117) {
            ea.f((byte) 34);
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_5_0 = qj.field_c;
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
                stackIn_11_0 = lg.field_c;
                break L3;
              } else {
                stackIn_11_0 = qj.field_c;
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
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ea.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
