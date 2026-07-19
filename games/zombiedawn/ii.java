/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterable {
    static int field_d;
    static rb field_a;
    nb field_c;
    static String[] field_b;

    public final Iterator iterator() {
        return (Iterator) ((Object) new ag((ii) (this)));
    }

    public static void a(byte param0) {
        if (param0 >= -102) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == 8099) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            stackOut_2_0 = ij.a(param1, param2, (byte) 108, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ii.D(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final nb a(int param0) {
        nb var2 = null;
        var2 = this.field_c.field_i;
        if (param0 >= 46) {
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.c((byte) -34);
            return var2;
          }
        } else {
          field_d = 104;
          if (var2 == this.field_c) {
            return null;
          } else {
            var2.c((byte) -34);
            return var2;
          }
        }
    }

    final void a(int param0, nb param1) {
        int discarded$0 = 0;
        try {
            if (!(param1.field_h == null)) {
                param1.c((byte) -12);
            }
            param1.field_i = this.field_c;
            param1.field_h = this.field_c.field_h;
            param1.field_h.field_i = param1;
            if (param0 != 0) {
                byte[] var4 = (byte[]) null;
                discarded$0 = ii.a(-82, 33, (byte[]) null);
            }
            param1.field_i.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
