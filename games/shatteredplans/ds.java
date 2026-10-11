/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static String field_a;
    static bi field_b;
    static a field_c;
    static String field_e;
    int field_d;

    public static void a(boolean param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_a = null;
    }

    final static bi a(boolean param0, bc param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            ds.a(false);
          }
          var4_int = param1.a(127, param2);
          var5 = param1.a(var4_int, (byte) 106, param3);
          stackIn_3_0 = ch.a(param1, -114, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ds.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
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
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ds(int param0) {
        this.field_d = param0;
    }

    static {
        field_e = "Game options";
        field_a = "Lobby";
    }
}
