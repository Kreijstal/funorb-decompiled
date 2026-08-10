/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static int field_g;
    private String field_e;
    static int[] field_c;
    static String field_a;
    static dl field_b;
    static int field_f;
    static boolean field_d;

    final static void a(ca param0, int param1, int param2) {
        try {
            gn.field_Q.b(param2, param0);
            nh.a(param1, (byte) -94, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(param0);
            param1.addKeyListener(uf.field_c);
            param1.addFocusListener(uf.field_c);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-109, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_e.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    mb(String param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 11458) {
            java.awt.Component var2 = (java.awt.Component) null;
            mb.a(false, (java.awt.Component) null);
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
            ab.a(param1, 31536000L, "jagex-last-login-method", param0 + -53, this.field_e);
            if (param0 != 1) {
                this.field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 3, 1, 0, 3, 2, 1, 0, 3, 1, 0, 0, 0, 0, 0, 0};
        field_a = "You cannot play these levels yet.";
    }
}
