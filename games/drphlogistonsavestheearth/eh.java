/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static he[] field_b;
    static volatile boolean field_a;

    public static void a(byte param0) {
        int var1 = 77 % ((param0 + 13) / 44);
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 != -875) {
          field_a = true;
          return bb.a((byte) -103);
        }
        return bb.a((byte) -103);
    }

    final static he a(String param0, byte param1, vj param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        he stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -21) {
            var6 = (String) null;
            eh.a((String) null, (byte) 119, (vj) null, (String) null);
          }
          var4_int = param2.a(param0, (byte) -104);
          var5 = param2.a((byte) -109, param3, var4_int);
          stackIn_3_0 = cc.a(var4_int, -9671, param2, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("eh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_a = true;
    }
}
