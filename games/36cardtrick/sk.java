/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_a;
    static int[][] field_b;
    static int field_d;
    static int field_e;
    static kc field_c;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0 > 17) {
          var3 = param2 >> 31 & -1 + param1;
          return var3 + ((param2 >>> 31) + param2) % param1;
        }
        field_b = (int[][]) null;
        var3Lifetime1 = param2 >> 31 & -1 + param1;
        return var3Lifetime1 + ((param2 >>> 31) + param2) % param1;
    }

    final static boolean a(byte param0, qk param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 33) {
            stackIn_4_0 = param1.a((byte) 20);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = (int[][]) null;
        field_c = null;
        if (param0 != -12865) {
          field_c = (kc) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static rc a(int param0, byte param1) {
        rc var2 = null;
        if (param1 == 125) {
          var2 = new rc();
          ue.field_b.a(var2, param1 + 27237);
          fl.b(1, param0);
          return var2;
        }
        return (rc) null;
    }

    static {
        field_d = 0;
        field_e = 0;
        field_a = "To server list";
    }
}
