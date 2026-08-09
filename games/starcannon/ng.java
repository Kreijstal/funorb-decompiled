/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends fe implements ub {
    private int field_K;
    private he field_L;

    public final he a(boolean param0) {
        if (param0) {
            return (he) null;
        }
        return this.field_L;
    }

    ng(String param0, qg param1, int param2) {
        super(param0, param1, param2);
    }

    final static void h(byte param0) {
        int var1 = -66 / ((param0 - 23) / 56);
        String var2 = (String) null;
        kg.a((String) null, wj.field_c, (byte) 92);
    }

    final String d(int param0) {
        if (!this.field_h) {
            return null;
        }
        if (this.field_p == null) {
            return null;
        }
        vc.a(la.field_c, pe.field_d + -this.field_K + this.field_i, 1);
        if (param0 != 12606) {
            return (String) null;
        }
        return this.field_p;
    }

    final static void k(int param0) {
        if (param0 <= 65) {
            ng.k(69);
        }
    }

    final void f(boolean param0) {
        super.f(param0);
        if (!(null == this.field_L)) {
            this.field_L.a((byte) 58);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        if (param0 < 27) {
            return;
        }
        try {
            super.a(90, param1, param2, param3);
            this.field_K = -param1 + pe.field_d + -this.field_s;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ng.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            var1_int = jf.field_a[0];
            var2 = param0;
            L1: while (true) {
              if (var2 >= jf.field_a.length) {
                break L0;
              } else {
                var3 = jf.field_a[var2];
                ug.a(ih.field_d, var2 << -95107932, ih.field_d, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ng.P(" + param0 + ')');
        }
    }

    final void a(he param0, int param1) {
        RuntimeException runtimeException = null;
        he var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_L = param0;
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (he) null;
                this.a((he) null, 118);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ng.S(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static sk a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        sk var5 = null;
        sk stackIn_4_0 = null;
        sk stackIn_7_0 = null;
        sk stackIn_10_0 = null;
        sk stackIn_14_0 = null;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  if (param0 >= 94) {
                    var2_int = param1.indexOf('@');
                    if (var2_int != -1) {
                      var3 = param1.substring(0, var2_int);
                      var4 = param1.substring(var2_int - -1);
                      var5 = vk.a((byte) 63, var3);
                      if (var5 != null) {
                        stackIn_14_0 = (sk) (var5);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return b.a(var4, 112);
                      }
                    } else {
                      stackIn_10_0 = qb.field_b;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = (sk) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = tg.field_x;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("ng.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    static {
    }
}
