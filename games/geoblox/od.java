/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static String field_b;
    private String field_a;

    final static boolean a(int param0) {
        if (param0 == -3) {
          if (-3 == (gg.field_b ^ -1)) {
            if ((pa.field_g ^ -1) <= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (String) null;
          if (-3 == (gg.field_b ^ -1)) {
            if ((pa.field_g ^ -1) <= -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 107) {
              stackIn_4_0 = this.field_a.equals(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("od.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -8) {
            od.b((byte) -78);
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        RuntimeException runtimeException = null;
        java.applet.Applet var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ea.a((byte) -25, 31536000L, param0, "jagex-last-login-method", this.field_a);
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (java.applet.Applet) null;
                this.a((java.applet.Applet) null, -71);
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

            stackIn_5_1 = new StringBuilder().append("od.F(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static he a(int param0, int param1, int param2, int param3, d param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        he var7 = null;
        java.awt.Frame var8 = null;
        he stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -3) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var8 = qe.a(param2, -1, param0, param5, param4, param1);
            var6 = var8;
            if (var8 != null) {
              var7 = new he();
              var7.field_b = var8;
              var7.field_b.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param5, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (he) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("od.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (null == te.field_c) {
                break L1;
              } else {
                var1_int = 0;
                L2: while (true) {
                  if (-8 >= (var1_int ^ -1)) {
                    kf.field_c = null;
                    sl.field_l = null;
                    uh.field_y.c((byte) 83);
                    te.field_c = null;
                    break L1;
                  } else {
                    if (!ag.field_j[var1_int]) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var1_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            if (param0 == -24) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              od.b((byte) -35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "od.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    od(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Geoblox";
    }
}
