/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfb extends rqa {
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
            field_o = 25;
          }
          stackIn_3_0 = new nc(frb.a(107, 109));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qfb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        faa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          if (param0 != 8) {
            field_o = 71;
          }
          var1 = dpa.field_p;
          while (apb.a(57)) {
            var1.h(param0 + 24327, 8);
            fieldTemp$0 = var1.field_e + 1;
            var1.field_e = var1.field_e + 1;
            var2 = fieldTemp$0;
            ida.a(var1, (byte) 127);
            dpa.field_p.e(var1.field_e - var2, -129);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "qfb.B(" + param0 + ')');
        }
    }

    qfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
