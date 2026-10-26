/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static int[] field_c;
    static fn field_a;
    static String loadingMessage;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param0) != 0) {
          var2 = -(param0 & 7) + 8;
        }
        int var4 = 94 % ((51 - param1) / 33);
        int var3 = var2 + param0;
        return var3;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 != -2) {
          loadingMessage = (String) null;
          if (224 <= gn.field_a) {
            rt.b(256, (byte) -106);
            return;
          }
          var1 = gn.field_a % 32;
          rt.b(-var1 + (32 + gn.field_a), (byte) -116);
          return;
        }
        if (224 <= gn.field_a) {
          rt.b(256, (byte) -106);
          return;
        }
        var1Lifetime1 = gn.field_a % 32;
        rt.b(-var1Lifetime1 + (32 + gn.field_a), (byte) -116);
    }

    final static fr a(int param0, int param1, String param2) {
        fr var3 = null;
        RuntimeException var3_ref = null;
        fr stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32) {
            dq.a((byte) 54);
          }
          var3 = new fr(false);
          var3.field_a = param0;
          var3.field_f = param2;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("dq.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        loadingMessage = null;
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
