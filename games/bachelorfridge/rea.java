/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends bw {
    static sna field_g;
    double field_o;
    double field_m;
    int field_n;
    double field_j;
    double field_l;
    int field_i;
    static String field_f;
    static kv field_k;
    int field_h;

    public static void c(byte param0) {
        field_g = null;
        if (param0 <= -105) {
          field_k = null;
          field_f = null;
          return;
        }
        eaa var2 = (eaa) null;
        rea.a((eaa) null, -84, 24, (byte) -29, -110, -31);
        field_k = null;
        field_f = null;
    }

    final static void a(eaa param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6_int = 0;
        rea var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = BachelorFridge.field_y;
        try {
          var6_int = -35 % ((param3 + 3) / 43);
          var7 = (rea) (param0.b((byte) 90));
          while (var7 != null) {
            var8 = (630 & (int)var7.field_m * 8357 + 326565 * (int)var7.field_j) + (var7.field_n >> 1);
            if (var8 > 256) {
              var8 = 256;
            }
            qna.field_l[var7.field_i].a((int)var7.field_m + param2 - 128, param5 + ((int)var7.field_l - 64 - 16), 4 * var7.field_n);
            var7 = (rea) (param0.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("rea.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    rea(int param0, int param1, int param2, int param3) {
        this.field_l = (double)param2;
        this.field_i = param3;
        this.field_j = (double)param1;
        this.field_m = (double)param0;
        this.field_h = -2;
        this.field_n = 256;
        this.field_o = 0.0;
    }

    static {
        field_f = "Join";
    }
}
