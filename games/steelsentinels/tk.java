/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ia {
    private jf field_o;
    static String field_q;
    static String field_r;
    static String field_s;
    static wk[] field_t;
    static ak field_p;
    static String field_n;

    final String a(int param0, String param1) {
        vd discarded$2 = null;
        tl var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_10_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = this.a((String) null, -43);
                break L1;
              }
            }
            L2: {
              if (!(this.field_o instanceof qn)) {
                break L2;
              } else {
                var3 = ((qn) ((Object) this.field_o)).a(false);
                if (var3 != null) {
                  L3: {
                    if (var3.a((byte) 21) != vf.field_b) {
                      break L3;
                    } else {
                      if (!param1.equals(this.field_o.field_y)) {
                        stackOut_8_0 = hh.field_h;
                        stackIn_9_0 = stackOut_8_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = var3.a(true);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!param1.equals(this.field_o.field_y)) {
              stackOut_14_0 = hh.field_h;
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, wk param6, int param7, int param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9_int = -param3 + (param7 + param6.field_D) - -param8;
              var10 = param6.field_D + param7 + (param8 + param2);
              var11 = (param6.field_F >> -1855884895) + param0 + param6.field_H;
              pb.h(var9_int, 0, var10, var11 + param4);
              param6.a(-1 + param7, param0 - 1, param1);
              param6.a(param7 - 1, 1 + param0, param1);
              pb.a(ti.field_n);
              pb.h(1 + var9_int, 0, 1 + var10, param4 + var11);
              param6.a(param7 - -1, param0 + -1, param1);
              param6.a(param7 + 1, 1 + param0, param1);
              pb.a(ti.field_n);
              if (param5 == -30456) {
                break L1;
              } else {
                tk.f((byte) -117);
                break L1;
              }
            }
            var9_int = param6.field_A + param6.field_D + (param7 + (-param8 + -param2));
            var10 = param6.field_A + param6.field_D + param7 - (param8 - -param3);
            pb.h(var9_int, -param4 + var11, var10, 480);
            param6.a(param7 - 1, param0 + -1, param1);
            param6.a(param7 + -1, 1 + param0, param1);
            pb.a(ti.field_n);
            pb.h(1 + var9_int, var11 - param4, 1 + var10, 480);
            param6.a(1 + param7, -1 + param0, param1);
            param6.a(param7 - -1, param0 - -1, param1);
            pb.a(ti.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9);
            stackOut_4_1 = new StringBuilder().append("tk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param6 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    tk(jf param0, jf param1) {
        super(param0);
        try {
            this.field_o = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(byte param0) {
        aj var1 = null;
        var1 = (aj) ((Object) ff.field_qb.c(-6533));
        if (var1 != null) {
          pb.a(var1.field_q, var1.field_z, var1.field_w);
          if (param0 <= 96) {
            field_t = (wk[]) null;
            pb.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
            var1.field_q = null;
            sl.field_b.a(3, var1);
            return;
          } else {
            pb.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
            var1.field_q = null;
            sl.field_b.a(3, var1);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_r = null;
        field_s = null;
        field_q = null;
        field_n = null;
        if (param0 >= -105) {
            field_n = (String) null;
        }
    }

    final vd a(String param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        vd stackIn_7_0 = null;
        vd stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vd stackOut_6_0 = null;
        vd stackOut_10_0 = null;
        vd stackOut_9_0 = null;
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
              if (param1 == -1) {
                break L1;
              } else {
                tk.e((byte) 84);
                break L1;
              }
            }
            L2: {
              if (!(this.field_o instanceof qn)) {
                break L2;
              } else {
                var3 = ((qn) ((Object) this.field_o)).a(false);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a((byte) 21) != vf.field_b) {
                    stackOut_6_0 = fa.field_d;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (!param0.equals(this.field_o.field_y)) {
                stackOut_10_0 = fa.field_d;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = vf.field_b;
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
            stackOut_12_1 = new StringBuilder().append("tk.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void e(byte param0) {
        if (param0 < 22) {
            field_t = (wk[]) null;
        }
    }

    static {
        field_s = "Firing arc";
        field_q = "Inviting <%0>";
        field_r = "<%0> might change the options - wait and see.";
        field_n = "Create a free Account";
    }
}
