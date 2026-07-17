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
        Object var7 = null;
        bm var8 = null;
        var6 = Torquing.field_u;
        var5 = (bm) (Object) gl.field_d.b(0);
        L0: while (true) {
          if (var5 == null) {
            var8 = new bm();
            var5 = var8;
            var8.field_q = 10;
            if (param3 != 44) {
              var7 = null;
              boolean discarded$1 = bn.a((String) null, 73);
              var5.field_o = param2;
              var5.field_s = param0;
              gl.field_d.a((byte) 54, (q) (Object) var5);
              mc.a((byte) 85, param1, var5);
              return var5;
            } else {
              var5.field_o = param2;
              var5.field_s = param0;
              gl.field_d.a((byte) 54, (q) (Object) var5);
              mc.a((byte) 85, param1, var5);
              return var5;
            }
          } else {
            if (param0 != var5.field_s) {
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
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == -17310) {
                break L1;
              } else {
                field_h = -119;
                break L1;
              }
            }
            var3 = (CharSequence) (Object) param0;
            stackOut_2_0 = tj.field_j.equals((Object) (Object) hf.a(var3, 116));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("bn.B(");
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
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_f = new double[8][];
    }
}
