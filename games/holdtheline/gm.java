/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements dh {
    static hj field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 4) {
          gm.a(4);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        hj var8 = null;
        try {
          if (param2 >= -48) {
            gm.a(36);
          }
          var6_int = param3.field_k + param1;
          var7 = param3.field_o + param4;
          tn.a(var6_int, param3.field_x, 152, var7, param3.field_u);
          var8 = ef.field_i[1];
          if (param3 instanceof rm &&
            ((rm) (param3)).field_B) {
            var8.b((-var8.field_o + param3.field_x >> 1) + 1 + var6_int, (-var8.field_v + param3.field_u >> 1) + (var7 + 1), 256);
          }
          if (!param3.c((byte) -20)) {
            return;
          }
          ei.a(param3.field_u - 4, param3.field_x - 4, 2 + var6_int, var7 + 2, (byte) 19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("gm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "(red)";
    }
}
