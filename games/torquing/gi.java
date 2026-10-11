/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static int[] field_a;
    static String field_b;
    static int field_d;
    static int field_c;

    final static void a(rm param0, byte param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.a(param2);
          if (param1 != 13) {
            field_d = 93;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("gi.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == 78) {
          field_a = null;
          field_b = null;
          return;
        }
        rm var2 = (rm) null;
        gi.a((rm) null, (byte) -88, -91);
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Spikes";
        field_a = new int[8192];
    }
}
