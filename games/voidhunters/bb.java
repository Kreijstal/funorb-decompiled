/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends rqa {
    static String field_o;

    final static void a(ds param0, boolean param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        if (!param1) {
          return;
        }
        try {
          wl.field_q = param0.e(1869) << 5;
          var2_int = param0.e((byte) -107);
          wl.field_q = wl.field_q + (var2_int >> 3);
          vga.field_d = (7 & var2_int) << 18;
          vga.field_d = vga.field_d + (param0.e(1869) << 2);
          var2_intLifetime1 = param0.e((byte) -118);
          jv.field_b = var2_intLifetime1 << 15 & 2064384;
          vga.field_d = vga.field_d + (var2_intLifetime1 >> 6);
          jv.field_b = jv.field_b + (param0.e((byte) -98) << 7);
          var2_intLifetime2 = param0.e((byte) -126);
          jv.field_b = jv.field_b + (var2_intLifetime2 >> 1);
          qfb.field_o = 65536 & var2_intLifetime2 << 16;
          qfb.field_o = qfb.field_o + param0.e(1869);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 105) {
          field_o = (String) null;
        }
    }

    bb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            bb.e((byte) -83);
          }
          stackIn_3_0 = new nc(frb.a(209, 82));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Make copy of clicked object";
    }
}
