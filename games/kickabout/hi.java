/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends vv {
    byte[] field_u;
    int field_t;
    static String field_w;
    qh field_v;

    final int a(int param0) {
        if (param0 != 0) {
          return -42;
        }
        if (this.field_p) {
          return 0;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
        if (param0 != -26236) {
          field_w = (String) null;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          bv.a(param0, "", (byte) 15);
          if (!param1) {
            field_w = (String) null;
          }
          bq.a((byte) 108, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] b(int param0) {
        if (this.field_p) {
          throw new RuntimeException();
        }
        if (param0 == 12802) {
          return this.field_u;
        }
        this.field_v = (qh) null;
        return this.field_u;
    }

    hi() {
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (java.applet.Applet) null;
            hi.a((java.applet.Applet) null, false);
          }
          stackIn_5_0 = (null != fm.a(param1, 145));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("hi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_w = "None";
    }
}
