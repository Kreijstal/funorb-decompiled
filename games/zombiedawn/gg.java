/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static int field_b;
    static char[] field_a;

    final static String a(byte[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 56) {
            gg.a((byte) -92);
          }
          stackIn_3_0 = fa.a(param0, param0.length, 0, -73);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        vg.field_a = dj.field_e.field_H.field_A.field_p;
        pm.d((byte) 36);
        if (param0 != 128) {
          byte[] var2 = (byte[]) null;
          gg.a((byte[]) null, (byte) 70);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -85) {
          field_a = (char[]) null;
        }
    }

    static {
        field_b = 20;
        field_a = new char[128];
    }
}
