/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements bf {
    static kl field_a;
    static String field_b;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        o var8 = null;
        ub var9 = null;
        try {
          var6_int = param2.field_o + param0;
          var7 = param1 + param2.field_l;
          pe.a(param2.field_n, (byte) -14, var7, param2.field_r, var6_int);
          if (!param3) {
            var9 = (ub) null;
            this.a(0, 116, (ub) null, true, true);
          }
          var8 = te.field_k[1];
          if (param2 instanceof pl &&
            ((pl) (param2)).field_z) {
            var8.a(1 + var6_int + (param2.field_r - var8.field_x >> 1), (param2.field_n - var8.field_s >> 1) + (var7 + 1), 256);
          }
          if (!param2.d((byte) 53)) {
            return;
          }
          nh.a((byte) 69, param2.field_r - 4, var7 + 2, param2.field_n - 4, 2 + var6_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("cc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 38 / ((param0 - 13) / 57);
        field_a = null;
    }

    static {
        field_b = "World:<col=ffff00>1</col> Stage:<col=ffff00>1";
    }
}
