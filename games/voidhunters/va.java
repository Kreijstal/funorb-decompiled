/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends rqa {
    final static phb[] a(int param0, int param1, int param2) {
        if (param0 == -26998) {
          return kga.a(param2, param1, 1, true);
        }
        va.a(25, -128, -53);
        return kga.a(param2, param1, 1, true);
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, String param5) {
        faa var8 = null;
        int var7 = 0;
        try {
          var8 = dpa.field_p;
          faa var6 = var8;
          var8.h(24335, param3);
          var8.field_e = var8.field_e + 1;
          var7 = var8.field_e;
          var8.c(0, param4);
          if (param4 == 2) {
            var8.a(true, param5);
          }
          if (param1 != -25719) {
            va.a(124, -32, -6);
          }
          if (param0 == null) {
            var8.a(param2, true);
          } else {
            mla.a(param0, var8, -113);
          }
          var8.e(-var7 + var8.field_e, -129);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "va.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(45, 62, param0[0].a(50));
          if (param1 > -119) {
            var4 = (String) null;
            va.a((String) null, 24, 98, -9, 52, (String) null);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("va.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    va(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
