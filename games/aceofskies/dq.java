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
        int var1 = 0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fr stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = (fr) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("dq.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        fr discarded$0 = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 119) {
            String var2 = (String) null;
            discarded$0 = dq.a(-37, 70, (String) null);
        }
    }

    static {
        field_a = null;
        field_c = new int[8192];
    }
}
