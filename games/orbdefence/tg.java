/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_d;
    static long field_a;
    static int[] field_b;
    static va field_c;

    final static ti a(String param0, int param1) {
        String var2 = null;
        ti var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ti stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (qb.field_a == null) {
            stackIn_3_0 = null;
            return (ti) (stackIn_3_0);
          }
          if (param1 != 256) {
            field_c = (va) null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ua.a(-21, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (ti) (qb.field_a.a((byte) 109, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_db);
            var4 = ua.a(param1 ^ 346, var7);
            if (var4 == null) {
              var4 = var3.field_db;
            }
            if (var4.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (ti) (qb.field_a.c((byte) -97));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("tg.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        se var2 = null;
        if (param0 < -65) {
          var2 = uk.field_b;
          var2.i(param1, 108);
          var2.a(1, -92);
          var2.a(2, -71);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 == 2) {
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_a = 118L;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_d = "EXCLUSIVE";
        field_b = new int[256];
    }
}
