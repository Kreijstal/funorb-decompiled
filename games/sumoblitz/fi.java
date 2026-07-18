/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fi extends nt {
    private boolean field_s;

    fi(int param0, int param1, int param2) {
        super(100, param0, param1, param2);
        ((fi) this).field_s = true;
    }

    final static int a(int param0, Random param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 > 0) {
              if (!rm.a(param0, -105)) {
                var3_int = -2147483648 - (int)(4294967296L % (long)param0);
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var3_int <= var4) {
                    continue L1;
                  } else {
                    stackOut_10_0 = eb.a(param0, 116, var4);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param0 >> 32);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + -96 + ')');
        }
        return stackIn_11_0;
    }

    final void a(ha param0, int param1) {
        int var3_int = 0;
        if (param1 >= -121) {
            return;
        }
        try {
            if (!((fi) this).field_s) {
                var3_int = (int)(4096.0 * ((double)((fi) this).field_p / 100.0));
            } else {
                var3_int = (int)((double)(100 - ((fi) this).field_p) / 100.0 * 4096.0);
            }
            var3_int = var3_int * (-((fi) this).field_p + 100);
            kw.field_a.a((float)(((fi) this).field_k >> 8), (float)(((fi) this).field_o >> 8), var3_int, 0, 1, ((fi) this).field_q, 2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fi.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static String a(long param0) {
        aj.field_y.setTime(new Date(param0));
        int var3 = aj.field_y.get(7);
        int var4 = aj.field_y.get(5);
        int var5 = aj.field_y.get(2);
        int var6 = aj.field_y.get(1);
        int var7 = aj.field_y.get(11);
        int var8 = aj.field_y.get(12);
        int var9 = aj.field_y.get(13);
        return dk.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + bq.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
    }
}
