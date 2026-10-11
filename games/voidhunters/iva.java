/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iva extends rqa {
    static int field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_p = -95;
          }
          stackIn_3_0 = new nc(frb.a(135, 116));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iva.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(byte param0, int param1, sg param2) {
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param2.q((byte) 87);
          if (param0 > -3) {
            field_o = 21;
          }
          var4 = VoidHunters.b(var3_int, -1);
          var5 = param1;
          if (var5 != 0 &&
            var5 != 4) {
            if (1 != var5 &&
              var5 != 5) {
              if (var5 != 2 &&
                var5 != 6) {
                if (var5 == 3) {
                  stackIn_18_0 = cma.a(var4, dob.field_o, cib.field_a, (byte) -126);
                  return stackIn_18_0;
                }
                stackIn_20_0 = cma.a(var4, dob.field_o, gu.field_o, (byte) -74);
                return stackIn_20_0;
              }
              stackIn_16_0 = cma.a(var4, dob.field_o, kg.field_t, (byte) -91);
              return stackIn_16_0;
            }
            stackIn_14_0 = cma.a(var4, dob.field_o, iua.field_o, (byte) -96);
            return stackIn_14_0;
          }
          stackIn_12_0 = cma.a(var4, dob.field_o, cib.field_a, (byte) -64);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("iva.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -6940) {
            var3 = (String) null;
            iva.a(-26, (String) null);
          }
          if (!nia.field_o) {
            return;
          }
          System.out.println(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("iva.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    iva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 115;
    }
}
