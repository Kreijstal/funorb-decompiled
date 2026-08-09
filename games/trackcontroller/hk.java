/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class hk {
    int field_c;
    String field_b;
    static qj[] field_a;
    static int field_d;

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
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = param1;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackIn_5_0 = var3;
                break L0;
              } else {
                var3 = hj.a(param0.charAt(var4), (byte) -124) + (-var3 + (var3 << -972512891));
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

            stackIn_8_1 = new StringBuilder().append("hk.B(");

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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 0) {
          this.field_c = -46;
          return new java.net.Socket(this.field_b, this.field_c);
        } else {
          return new java.net.Socket(this.field_b, this.field_c);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -19) {
            CharSequence var2 = (CharSequence) null;
            hk.a((CharSequence) null, 33);
        }
    }

    abstract java.net.Socket c(int param0) throws IOException;

    static {
    }
}
