/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static String field_b;
    private String field_a;

    final static boolean a(int param0) {
        if (param0 != -3) {
            field_b = (String) null;
            if (gg.field_b != 2) {
                return false;
            }
            if (pa.field_g < 0) {
                return true;
            }
            return false;
        }
        if (gg.field_b != 2) {
            return false;
        }
        if (pa.field_g < 0) {
            return true;
        }
        return false;
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
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 107) {
            stackIn_4_0 = this.field_a.equals(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 0;
          return stackIn_2_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("od.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -8) {
            od.b((byte) -78);
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        try {
            ea.a((byte) -25, 31536000L, param0, "jagex-last-login-method", this.field_a);
            if (param1 != 0) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                this.a((java.applet.Applet) null, -71);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "od.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          if (param3 != -3) {
            field_b = (String) null;
          }
          var8 = qe.a(param2, -1, param0, param5, param4, param1);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new he();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = (he) (var7);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var6_ref);

          stackIn_9_1 = new StringBuilder().append("od.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            if (null != te.field_c) {
              for (var1_int = 0; var1_int < 7; var1_int++) {
                if (!ag.field_j[var1_int]) {
                  return;
                }
              }
              kf.field_c = null;
              sl.field_l = null;
              uh.field_y.c((byte) 83);
              te.field_c = null;
              break L0;
            }
          }
          if (param0 == -24) {
            return;
          }
          od.b((byte) -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "od.B(" + param0 + ')');
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
