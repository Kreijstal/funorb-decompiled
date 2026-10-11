/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static dn field_e;
    String field_i;
    int field_b;
    static int field_j;
    String field_d;
    mf field_h;
    static String field_a;
    static la field_g;
    static int[] field_f;
    String field_c;

    public static void a(byte param0) {
        int var1 = -8 / ((4 - param0) / 38);
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        di.field_d = null;
        mj.field_d = 0;
        int var2 = -17 % ((-17 - param1) / 39);
        pl.field_q.b(-26480, param0);
        gi.a((byte) -123);
    }

    final static void a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        try {
          if (nk.field_n == 97 ||
            nk.field_n == 99) {
            var2_int = di.field_d.field_h;
            var2_int++;
            if (var2_int >= param0.length) {
              var2_int = 0;
            }
            di.field_d.a(false, var2_int);
          }
          if (param1 != 0) {
            field_e = (dn) null;
          }
          if (96 != nk.field_n &&
            98 != nk.field_n) {
            return;
          }
          var2_intLifetime1 = di.field_d.field_h;
          var2_intLifetime1--;
          if (0 > var2_intLifetime1) {
            var2_intLifetime1 = -1 + param0.length;
          }
          di.field_d.a(false, var2_intLifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("qk.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "To server list";
    }
}
