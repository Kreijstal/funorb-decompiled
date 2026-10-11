/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gpb extends ksa {
    int field_d;
    int[] field_f;
    int field_e;

    abstract void a(int param0, int param1, int param2, java.awt.Canvas param3);

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 114) {
            stackIn_4_0 = kea.a(false, cd.class, param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gpb.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    gpb() {
    }

    static {
    }
}
