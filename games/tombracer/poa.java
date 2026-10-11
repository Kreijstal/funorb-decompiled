/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class poa extends hga {
    static String field_p;

    public static void c(byte param0) {
        if (param0 != 112) {
          poa.c((byte) -30);
          field_p = null;
          return;
        }
        field_p = null;
    }

    poa(int param0) {
        this(mj.field_J, param0);
    }

    final String d(int param0, ae param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -4) {
            stackIn_4_0 = cka.a('*', param1.field_o.length(), -59);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("poa.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private poa(il param0, int param1) {
        super(param0, param1);
    }

    static {
        field_p = "Baroness";
    }
}
