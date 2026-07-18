/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bn {
    int field_e;
    static int field_h;
    static volatile boolean field_b;
    int field_c;
    int field_j;
    int field_g;
    static boolean field_i;
    int field_a;
    int field_d;
    static double[][] field_f;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static bm a(int param0, int param1, int param2, byte param3, int param4) {
        bm var5 = null;
        int var6 = 0;
        bm var8 = null;
        var6 = Torquing.field_u;
        var5 = (bm) (Object) gl.field_d.b(0);
        L0: while (true) {
          if (var5 == null) {
            var8 = new bm();
            var5 = var8;
            var8.field_q = 10;
            var5.field_o = 1;
            var5.field_s = 11;
            gl.field_d.a((byte) 54, (q) (Object) var5);
            mc.a((byte) 85, 3, var5);
            return var5;
          } else {
            if (var5.field_s != 11) {
              var5 = (bm) (Object) gl.field_d.f(-24059);
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 >= -54) {
            field_b = false;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = tj.field_j.equals((Object) (Object) hf.a(var3, 116));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bn.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -17310 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_f = new double[8][];
    }
}
