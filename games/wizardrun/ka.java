/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends uh {
    static ji field_l;
    static int field_i;
    private String field_k;
    static String field_g;
    static String field_h;
    private String field_j;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mj.a((java.awt.Component) ((Object) param0), (byte) 96);
          ee.a((java.awt.Component) ((Object) param0), 6769);
          if (vc.field_K != null) {
            vc.field_K.a((java.awt.Component) ((Object) param0), param1 ^ -8058);
          }
          if (param1 == 8053) {
            return;
          }
          ka.a(false, -94, false, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ka.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param1 != 2) {
          ka.b(-47);
        }
        if (param3) {
          var4++;
        }
        return oi.field_e[var4];
    }

    public static void b(int param0) {
        if (param0 <= -24) {
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        }
        ka.a(false, 106, false, false);
        field_h = null;
        field_l = null;
        field_g = null;
    }

    final sd a(boolean param0) {
        if (!param0) {
          this.a(true);
          return pc.field_v;
        }
        return pc.field_v;
    }

    final void a(int param0, va param1) {
        try {
          if (param0 != 4) {
            field_h = (String) null;
          }
          param1.b(0, this.field_k);
          param1.a(this.field_j, -66);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ka.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ka(String param0, String param1) {
        try {
          this.field_j = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "To Customer Support";
        field_g = "Press <%0> or SPACE";
    }
}
