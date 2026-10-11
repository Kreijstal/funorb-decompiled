/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends kd {
    static long[] field_i;
    int field_j;
    static boolean[] field_h;
    static d[] field_l;
    int field_k;

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (param0 != 69) {
          field_l = (d[]) null;
        }
    }

    final static boolean a(wf param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wf var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.d(true);
          if (param1 != 25444) {
            var4 = (wf) null;
            f.a((wf) null, 110);
          }
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("f.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private f() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_l = new d[255];
        field_i = new long[32];
        for (var0 = 0; var0 < field_l.length; var0++) {
          field_l[var0] = new d();
        }
    }
}
