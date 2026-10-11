/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String[] field_b;
    static he[] field_d;
    static j field_a;
    static he[] field_c;
    static int field_e;
    private String field_f;

    final void a(java.applet.Applet param0, byte param1) {
        try {
          jk.a(0, this.field_f, 31536000L, param0, "jagex-last-login-method");
          if (param1 != -50) {
            sd.a(88);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "sd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == 2) {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
        field_e = 123;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 100) {
            stackIn_4_0 = this.field_f.equals(param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sd.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        ng.field_c.j(300);
        if (null == af.field_g) {
          af.field_g = new tf(ng.field_c, mf.field_u);
          ng.field_c.a((byte) -95, (vg) (af.field_g));
          if (param0 != -124) {
            field_e = 33;
            return;
          }
          return;
        }
        ng.field_c.a((byte) -95, (vg) (af.field_g));
        if (param0 == -124) {
          return;
        }
        field_e = 33;
    }

    sd(String param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 2;
    }
}
