/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psb {
    static int field_a;
    static ufb field_b;

    final static ge a(String param0, int param1) {
        RuntimeException var2 = null;
        ge stackIn_2_0 = null;
        ge stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (ge) null;
            return stackIn_2_0;
          }
          if (wba.field_p.a(4) &&
            !param0.equals(wba.field_p.b(4))) {
            wba.field_p = gi.a(param0, (byte) 110);
          }
          stackIn_8_0 = wba.field_p;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("psb.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (String) null;
            psb.a((String) null, 28);
          }
          stackIn_3_0 = k.a((byte) -69, param1, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("psb.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          String var2 = (String) null;
          psb.a((String) null, -33);
        }
    }

    static {
    }
}
