/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static java.awt.Font field_b;
    long field_a;
    static java.util.zip.CRC32 field_d;
    private wl field_c;

    final static void b(int param0) {
        ll var1 = null;
        ll var2 = null;
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        try {
            var1 = new ll(param0, 140);
            cm.a(var1, param0 + -15032);
            re.a();
            vp.a();
            it.field_c = 0;
            wj.e((byte) -128);
            var2 = var1.d();
            for (var3 = 0; -16 < (var3 ^ -1); var3++) {
                var2.c(-2, -2, 16777215);
                vp.a(4, 4, 0, 0, 540, 140);
            }
            oo.field_W.b();
            var1.d(0, 0);
            sl.c(2765);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "aq.C(" + param0 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_c.a(this.field_a, 3);
        super.finalize();
    }

    public static void a(int param0) {
        if (param0 != 32683) {
            aq.a(-86);
        }
        field_b = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              param3.setLength(param2);
              if (param1 == -2) {
                break L1;
              } else {
                var6 = (StringBuilder) null;
                discarded$2 = aq.a('.', 9, -96, (StringBuilder) null);
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param2) {
                stackOut_5_0 = (StringBuilder) (param3);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                param3.setCharAt(var5, param0);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("aq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    aq(wl param0, long param1, int param2) {
        try {
            this.field_a = param1;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "aq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new java.util.zip.CRC32();
    }
}
