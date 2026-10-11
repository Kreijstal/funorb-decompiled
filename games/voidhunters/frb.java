/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class frb extends rqa {
    final static eu a(ds param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        eu stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 66 % ((70 - param1) / 39);
          stackIn_1_0 = new eu(param0.a(true), param0.a(true), param0.a(true), param0.a(true), param0.c((byte) -123), param0.e((byte) -90));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("frb.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, int param1) {
        if (param1 <= 73) {
          ds var3 = (ds) null;
          frb.a((ds) null, (byte) -91);
          if (vqa.field_g != null) {
            return Integer.toString(vqa.field_g.field_m.b(1).field_f.field_a[param0]);
          }
          return "Unknown";
        }
        if (vqa.field_g != null) {
          return Integer.toString(vqa.field_g.field_m.b(1).field_f.field_a[param0]);
        }
        return "Unknown";
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        ds var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (ds) null;
            frb.a((ds) null, (byte) -82);
          }
          stackIn_3_0 = new nc(frb.a(100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("frb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    frb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
