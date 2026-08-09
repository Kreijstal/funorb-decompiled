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
        tl var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, -43);
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
                        stackIn_9_0 = hh.field_h;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = var3.a(true);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!param1.equals(this.field_o.field_y)) {
              stackIn_15_0 = hh.field_h;
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
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("tk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
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
        int var10 = 0;
        int var11 = 0;
        try {
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
            if (param5 != -30456) {
                tk.f((byte) -117);
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
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "tk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
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
        aj var1;
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
                    stackIn_7_0 = fa.field_d;
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
                stackIn_11_0 = fa.field_d;
                break L3;
              } else {
                stackIn_11_0 = vf.field_b;
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

            stackIn_14_1 = new StringBuilder().append("tk.B(");

            if (param0 == null) {
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
