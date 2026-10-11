/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb implements el {
    static h field_f;
    static boolean field_h;
    static int field_b;
    static db field_g;
    static la field_a;
    static String field_c;
    static uh field_d;
    static int[][] field_e;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_e = (int[][]) null;
        field_a = null;
        if (param0 == 2) {
          field_d = null;
          field_f = null;
          return;
        }
        field_c = (String) null;
        field_d = null;
        field_f = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        t var8 = null;
        try {
          var6_int = param4.field_w + param2;
          var7 = param4.field_k + param1;
          if (param0 < 89) {
            kb.a((byte) -45);
          }
          tk.a(var7, var6_int, param4.field_o, param4.field_p, false);
          var8 = wj.field_h[1];
          if (param4 instanceof lg &&
            ((lg) (param4)).field_A) {
            var8.a((-var8.field_w + param4.field_p >> 1) + 1 + var6_int, (-var8.field_u + param4.field_o >> 1) + var7 + 1, 256);
          }
          if (!param4.g(2)) {
            return;
          }
          he.a(2 + var6_int, param4.field_o - 4, 2 + var7, 2, param4.field_p - 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("kb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int[] a(byte param0) {
        if (param0 > -65) {
          field_a = (la) null;
          return new int[8];
        }
        return new int[8];
    }

    static {
        field_h = true;
        field_f = null;
        field_c = "Loading models";
        field_g = new db(1);
    }
}
