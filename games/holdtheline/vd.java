/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vd {
    static long field_a;
    static String field_e;
    static String field_d;
    static oa field_b;
    static int[] field_c;

    abstract void a(float param0, int[] param1, int param2, int[] param3, byte param4);

    final static int[] c(int param0) {
        return new int[8];
    }

    final static ch a(gn param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        ch stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 65535) {
              var4 = param0.b(15950, param2);
              var3 = var4;
              if (var4 != null) {
                stackOut_6_0 = new ch(var4);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ch) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vd.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) tf.field_n);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) tf.field_n);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vd.I(" + (param0 != null ? "{...}" : "null") + 44 + -116 + 41);
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return rd.field_e.j(-1231);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 >= -37) {
          String discarded$2 = vd.a(43);
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<img=12>";
        field_d = "Please enter your age in years";
        field_c = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
