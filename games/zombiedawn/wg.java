/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends le {
    static String field_o;
    static String field_l;
    int field_q;
    int field_i;
    int field_r;
    static int field_p;
    int field_h;
    int field_m;
    static int field_n;
    static byte[][][] field_j;
    int field_k;

    public static void a(int param0) {
        int var1 = 74 % ((-19 - param0) / 33);
        field_l = null;
        field_o = null;
        field_j = (byte[][][]) null;
    }

    final static v a(int param0, dj param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -28490) {
            wg.a(-121);
          }
          if (ph.a(param3, 31043, param0, param1)) {
            return fe.b(true);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param0;
        this.field_h = param5;
        this.field_k = param3;
        this.field_m = param4;
        this.field_r = param1;
        this.field_q = param2;
    }

    static {
        field_o = "End of Free Game";
        field_l = "Sound: ";
    }
}
