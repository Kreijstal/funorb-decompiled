/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static int[] field_c;
    static fn field_a;
    static String field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(-1 == (7 & param0 ^ -1))) {
            var2 = -(param0 & 7) + 8;
        }
        int var4 = 94 % ((51 - param1) / 33);
        int var3 = var2 + param0;
        return var3;
    }

    final static void a(byte param0) {
        int var1;
        if (param0 == -2) {
          if (224 > gn.field_a) {
            var1 = gn.field_a % 32;
            rt.b(-var1 + (32 + gn.field_a), (byte) -116);
            return;
          } else {
            rt.b(256, (byte) -106);
            return;
          }
        } else {
          field_b = (String) null;
          if (224 > gn.field_a) {
            var1 = gn.field_a % 32;
            rt.b(-var1 + (32 + gn.field_a), (byte) -116);
            return;
          } else {
            rt.b(256, (byte) -106);
            return;
          }
        }
    }

    final static fr a(int param0, int param1, String param2) {
        fr var3 = null;
        RuntimeException var3_ref = null;
        fr stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                dq.a((byte) 54);
                break L1;
              }
            }
            var3 = new fr(false);
            var3.field_a = param0;
            var3.field_f = param2;
            stackIn_3_0 = (fr) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("dq.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 119) {
            String var2 = (String) null;
            dq.a(-37, 70, (String) null);
        }
    }

    static {
        field_a = null;
        field_c = new int[8192];
    }
}
