/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static boolean field_c;
    static int field_b;
    static long field_d;
    static he[] field_a;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        s.field_K = false;
        rk.field_f = false;
        if (param0 >= -58) {
            return;
        }
        vf.a((byte) -117, -1);
        na.field_S = ml.field_a;
        oe.field_Q = ml.field_a;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
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
            var2_int = 100 / ((param1 - -63) / 45);
            var3 = (CharSequence) ((Object) param0);
            stackOut_0_0 = dc.field_J.equals(hh.a(0, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("im.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(byte param0) {
        nf var1 = null;
        nf var3 = null;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        try {
            var1 = new nf(540, 140);
            vm.a(var1, -8409);
            ti.b();
            int var2 = -113 / ((param0 - 32) / 49);
            fn.d();
            tg.field_H = 0;
            of.a(false);
            var3 = var1.c();
            for (var4 = 0; var4 < 15; var4++) {
                var3.d(-2, -2, 16777215);
                fn.a(4, 4, 0, 0, 540, 140);
            }
            bg.field_c.d();
            var1.b(0, 0);
            ib.b(false);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "im.D(" + param0 + ')');
        }
    }

    static {
    }
}
