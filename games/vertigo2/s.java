/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends li {
    boolean field_s;
    int field_q;
    long[][] field_w;
    static int field_y;
    String[][] field_x;
    static int field_u;
    static String field_r;
    int field_p;
    int[][] field_n;
    int field_o;
    static nj field_t;
    static String field_v;

    public static void a(byte param0) {
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != -118) {
          field_r = (String) null;
        }
    }

    final static void a(byte param0, er[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != null &&
            param3 > 0) {
            if (param0 != 49) {
              field_r = (String) null;
            }
            var6_int = param1[0].field_x;
            var7 = param1[2].field_x;
            var8 = param1[1].field_x;
            param1[0].a(param4, param2, param5);
            param1[2].a(param4 + (param3 - var7), param2, param5);
            bi.a(ak.field_d);
            bi.c(var6_int + param4, param2, param3 + (param4 - var7), param1[1].field_B + param2);
            var9 = var6_int + param4;
            var10 = param4 + (param3 - var7);
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param1[1].a(param4, param2, param5);
            }
            bi.b(ak.field_d);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("s.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    s() {
    }

    static {
        field_y = 48;
        field_r = "Passwords can only contain letters and numbers";
        field_v = "Change display name";
    }
}
