/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static int[] field_c;
    static int[] field_e;
    static String field_d;
    static String field_g;
    static String field_i;
    static hp field_f;
    static int field_h;
    static boolean field_b;
    static vi field_a;

    public static void b(int param0) {
        field_f = null;
        field_i = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 != 10) {
            ri.a(-3, (byte) 120);
        }
    }

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var3 = (String) null;
                ri.a((String) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ri.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 >= -71) {
            return false;
        }
        return true;
    }

    final static void a(int param0, byte param1) {
        de.field_e = new aa[param0 * 15];
        ee.field_d = param0;
        tm.field_O = new int[3];
        int var2 = 20 / ((param1 - -94) / 32);
        sd.field_L = 0;
    }

    static {
        int var0 = 0;
        field_d = "members-only content";
        field_e = new int[]{1, 2, 5, 10, 2, 5, 10, 3, 2, 2, 5, 2, 3, 10, 2, 5, 5, 5, 2, 2, 2, 2};
        field_c = new int[field_e.length];
        for (var0 = 0; field_c.length > var0; var0++) {
            field_c[var0] = field_e[var0] * 100;
        }
        field_g = "RuneScape clan";
        field_i = "Members' Benefits";
        field_b = false;
        field_h = 64;
    }
}
