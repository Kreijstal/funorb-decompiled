/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements ol {
    static long field_d;
    static int field_a;
    static String[] field_b;
    static String field_f;
    static int[] field_e;
    static int field_c;
    static ua field_g;

    public static void a(byte param0) {
        if (param0 >= -122) {
          return;
        }
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        mg var8 = null;
        try {
          var6_int = param1.field_l + param0;
          if (param4 != -23294) {
            ae.a((byte) -21);
          }
          var7 = param3 + param1.field_u;
          bf.a(true, param1.field_g, var6_int, var7, param1.field_m);
          var8 = bf.field_p[1];
          if (param1 instanceof tg &&
            ((tg) (param1)).field_z) {
            var8.e(1 + var6_int + (param1.field_g - var8.field_u >> 1), 1 + var7 + (param1.field_m - var8.field_z >> 1), 256);
          }
          if (!param1.f(true)) {
            return;
          }
          b.a(2 + var7, (byte) 2, var6_int + 2, -4 + param1.field_g, -4 + param1.field_m);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ae.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
