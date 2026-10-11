/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ml {
    static ad field_d;
    static long field_f;
    static le field_e;
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        me var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var4 = (me) (af.field_a.a((byte) -117));
          while (var4 != null) {
            qc.a(var4, (byte) 117, param0);
            var4 = (me) (af.field_a.d((byte) 63));
          }
          if (param1 == 1197) {
            return;
          }
          field_d = (ad) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "wi.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 == 256) {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
        wi.a(127, 91);
        field_a = null;
        field_b = null;
        field_d = null;
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        le var8 = null;
        try {
          if (param4 <= 19) {
            wi.a(-113);
          }
          var6_int = param3 + param1.field_r;
          var7 = param1.field_e + param2;
          eb.b(var6_int, 0, param1.field_p, param1.field_l, var7);
          var8 = hk.field_i[1];
          if (param1 instanceof t &&
            ((t) (param1)).field_u) {
            var8.c((-var8.field_m + param1.field_l >> 1) + var6_int + 1, (param1.field_p - var8.field_n >> 1) + (1 + var7), 256);
          }
          if (!param1.b((byte) 64)) {
            return;
          }
          hk.a(2 + var6_int, var7 + 2, 2, param1.field_l - 4, param1.field_p - 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("wi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_a = "OK";
    }
}
