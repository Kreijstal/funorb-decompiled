/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vh extends uf {
    static String field_n;
    static bg[] field_k;
    static int[][] field_j;
    long field_m;
    vh field_i;
    static String field_l;
    vh field_o;
    static String field_h;

    final static boolean a(int param0, int param1, fa param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var5 = param2.b(param0, -106, param1);
            var4 = var5;
            if (var5 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              b.a(var5, (byte) -110);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref;
            stackOut_6_1 = new StringBuilder().append("vh.VA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + true + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(String param0, byte param1, float param2) {
        try {
            ad.field_e = param0;
            int var3_int = -44 % ((-15 - param1) / 53);
            ed.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "vh.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        if (((vh) this).field_i != null) {
          ((vh) this).field_i.field_o = ((vh) this).field_o;
          ((vh) this).field_o.field_i = ((vh) this).field_i;
          ((vh) this).field_i = null;
          if (param0 != 13) {
            ((vh) this).field_m = 69L;
            ((vh) this).field_o = null;
            return;
          } else {
            ((vh) this).field_o = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_h = null;
    }

    protected vh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Soldier";
        field_h = "    Low Walls";
    }
}
