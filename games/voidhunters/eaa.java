/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eaa extends rqa {
    static ri field_p;
    static String field_o;
    static int field_q;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (byte[]) null;
            eaa.a((byte) -22, false, (byte[]) null, -98, -44, -111);
          }
          stackIn_3_0 = new nc(frb.a(81, 89));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eaa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    eaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, boolean param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        faa var6 = dpa.field_p;
        var6.h(24335, param5);
        if (param0 < 86) {
          return;
        }
        try {
          var6.field_e = var6.field_e + 1;
          var7 = var6.field_e;
          var6.c(0, 4);
          var6.c(0, param4);
          var8 = param3;
          if (param1) {
            var8 += 128;
          }
          var6.c(0, var8);
          var6.a(0, param2, -1, param2.length);
          var6.e(var6.field_e - var7, -129);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eaa.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_p = null;
        int var1 = -70 / ((param0 - 80) / 37);
        field_o = null;
    }

    static {
        field_o = "<%0> has lost connection.";
        field_p = new ri(9, 0, 4, 1);
        field_q = 1;
    }
}
