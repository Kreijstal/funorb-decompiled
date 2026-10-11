/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_c;
    static dd field_b;
    static rh field_e;
    static int[] field_d;
    private String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        if (param0 != 27415) {
          return true;
        }
        return vg.field_z > 250 ? true : false;
    }

    final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -38) {
            field_e = (rh) null;
          }
          stackIn_3_0 = this.field_a.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 == -251) {
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_d = (int[]) null;
        field_b = null;
        field_e = null;
        field_c = null;
    }

    wh(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        tf.d(true);
        if (param0 >= -71) {
          wh.a(-58);
        }
    }

    final void a(boolean param0, java.applet.Applet param1) {
        if (!param0) {
          return;
        }
        try {
          uk.a(this.field_a, 31536000L, 0, param1, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "wh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "<%0>Trapdoor:<%1> Fleas always fall through these.";
        field_d = new int[40];
    }
}
