/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static vf field_a;
    static int[] field_c;
    static byte[][] field_b;

    final static long a(int param0) {
        if (param0 > -103) {
          return -13L;
        }
        return sf.a((byte) -23) - sk.field_c;
    }

    final static sl a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        sl var8 = new sl(param2, param6, param3, param0, param7, param1);
        if (param4 == 56) {
          tc.field_v.a((byte) -98, var8);
          fg.a((byte) 5, var8, param5);
          return var8;
        }
        field_a = (vf) null;
        tc.field_v.a((byte) -98, var8);
        fg.a((byte) 5, var8, param5);
        return var8;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = (byte[][]) null;
        field_c = null;
        if (param0 >= -40) {
          qa.a(-65);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 27) {
            stackIn_4_0 = fl.a((byte) 93, param1, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_b = new byte[50][];
    }
}
