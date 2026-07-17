/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lg {
    private byte[] field_w;
    static gk field_x;
    static String field_v;

    final static id a(String param0, int param1) {
        RuntimeException var2 = null;
        id stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 55) {
                break L1;
              } else {
                od.d((byte) 64);
                break L1;
              }
            }
            stackOut_2_0 = new id(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("od.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte param1, uk param2) {
        int var4 = 0;
        dl var5 = q.field_p;
        var5.g(71, param0);
        var5.field_g = var5.field_g + 1;
        try {
            var4 = var5.field_g;
            var5.b(-1336879960, 1);
            var5.b(-1336879960, param2.field_i);
            var5.b(true, param2.field_m);
            var5.a((byte) 71, param2.field_l);
            var5.a((byte) 59, param2.field_h);
            var5.a((byte) 104, param2.field_k);
            var5.a((byte) 24, param2.field_n);
            int discarded$0 = var5.e(var4, 89);
            var5.b(-var4 + var5.field_g, (byte) 117);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "od.N(" + param0 + 44 + -76 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 2 * param0;
        if (param1 != -1) {
          field_v = null;
          var5 = param2 & 255;
          int incrementValue$2 = var4;
          var4++;
          ((od) this).field_w[incrementValue$2] = (byte)(var5 * 3 >> 5);
          ((od) this).field_w[var4] = (byte)(3 * var5 >> 5);
          return;
        } else {
          var5 = param2 & 255;
          int incrementValue$3 = var4;
          var4++;
          ((od) this).field_w[incrementValue$3] = (byte)(var5 * 3 >> 5);
          ((od) this).field_w[var4] = (byte)(3 * var5 >> 5);
          return;
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_x = null;
        if (param0 != -96) {
            Object var2 = null;
            id discarded$0 = od.a((String) null, -124);
        }
    }

    od() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static String a(CharSequence[] param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            int discarded$4 = 0;
            int discarded$5 = 21530;
            stackOut_2_0 = gq.a(param0.length, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("od.O(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 3 + 41);
        }
        return stackIn_3_0;
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        ((od) this).field_w = new byte[param2 * (param1 * param3 * 2)];
        ((od) this).a(true, param3, param1, param2);
        if (param0 != -959081435) {
          return null;
        } else {
          return ((od) this).field_w;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Highscores";
    }
}
