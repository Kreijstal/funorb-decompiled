/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uaa extends rqa {
    static int field_o;
    static String field_p;

    uaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -17) {
            field_o = 19;
          }
          stackIn_5_0 = (null != di.a(param0, 0));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("uaa.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.c(0, 1);
        int var3 = 124 % ((-14 - param0) / 59);
        var2.c(0, 2);
    }

    final static int a(int param0, int param1) {
        int var2 = 74 / ((param1 + 14) / 42);
        if (param0 < 4) {
          return 2;
        }
        if (param0 != 12) {
          return 1;
        }
        return 1;
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 2) {
          field_o = 114;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_p = (String) null;
          }
          stackIn_3_0 = new nc(frb.a(180, 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uaa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = 10;
        field_p = "Invalid password.";
    }
}
