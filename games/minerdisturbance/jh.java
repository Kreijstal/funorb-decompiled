/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jh {
    static String[][] field_d;
    static String[][] field_c;
    String field_f;
    static int field_a;
    int field_e;
    static String field_b;

    public static void a(byte param0) {
        field_d = (String[][]) null;
        if (param0 != 39) {
            field_c = (String[][]) null;
        }
        field_b = null;
        field_c = (String[][]) null;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param0.length();
            var3 = param1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackIn_5_0 = var3;
                break L0;
              } else {
                var3 = (var3 << 1398563877) + -var3 + kj.a(param0.charAt(var4), param1 ^ -8251);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("jh.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 != 51) {
            field_b = (String) null;
        }
        return new java.net.Socket(this.field_f, this.field_e);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    static {
        field_c = new String[][]{new String[]{"Diamonds: Congratulations on your find! 2,500 points for one diamond! Diamonds are often found right at the very bottom of the volcano."}};
        field_d = new String[][]{null, new String[]{"Ice bomb: You've used an ice bomb. This will freeze water and turn it into loose ice. If you freeze loose ice, it becomes perma-frozen and part of the Super Volcano. It also turns living things into ice cubes!"}};
        field_b = "Next";
    }
}
