/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw implements wwa {
    static int field_b;
    static int[] field_a;
    static dfa field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 113) {
          field_a = (int[]) null;
        }
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        phb var8 = null;
        int var9 = 0;
        try {
          var6_int = param1.field_g + param2;
          var7 = param3 + param1.field_r;
          npa.a(var7, (byte) 115, param1.field_f, param1.field_h, var6_int);
          var8 = ps.field_a[1];
          if (param1 instanceof htb &&
            ((htb) (param1)).field_u) {
            var8.c((-var8.field_m + param1.field_h >> 1) + (1 + var6_int), 1 + (var7 + (-var8.field_n + param1.field_f >> 1)), 256);
          }
          if (param1.e((byte) -120)) {
            aha.a(var7 + 2, param1.field_h - 4, var6_int + 2, -4 + param1.field_f, (byte) -62);
          }
          var9 = -1 / ((-27 - param0) / 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("dw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 10;
        field_c = new dfa();
    }
}
