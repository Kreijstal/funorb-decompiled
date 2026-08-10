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
        if (param0 != 2) {
          field_e = 123;
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
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
            if (param1 >= 100) {
              stackIn_4_0 = this.field_f.equals(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sd.B(");

            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        ng.field_c.j(300);
        if (null != af.field_g) {
          ng.field_c.a((byte) -95, (vg) (af.field_g));
          if (param0 != -124) {
            field_e = 33;
            return;
          } else {
            return;
          }
        } else {
          af.field_g = new tf(ng.field_c, mf.field_u);
          ng.field_c.a((byte) -95, (vg) (af.field_g));
          if (param0 == -124) {
            return;
          } else {
            field_e = 33;
            return;
          }
        }
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
