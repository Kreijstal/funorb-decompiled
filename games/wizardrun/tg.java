/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tg implements Serializable {
    int[] field_j;
    boolean[] field_d;
    int[] field_f;
    static pj field_h;
    static oi field_c;
    int[] field_a;
    static long field_g;
    static long field_e;
    static int field_i;
    static String field_b;

    final static ae a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ae var5 = null;
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        ae stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_11_0 = null;
        ae stackOut_9_0 = null;
        ae stackOut_6_0 = null;
        ae stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = fc.a(var3, param0);
                    if (var5 == null) {
                      stackOut_11_0 = dh.a(-27602, var4);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (ae) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = ok.field_f;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
            }
            stackOut_3_0 = ga.field_c;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("tg.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(long param0, boolean param1) {
        if (param0 <= 0L) {
          return;
        } else {
          if (param0 % 10L != 0L) {
            pg.a(param0, 2);
            tg.a(true);
            return;
          } else {
            pg.a(-1L + param0, 2);
            pg.a(1L, 2);
            tg.a(true);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_h = null;
    }

    tg() {
        ((tg) this).field_j = new int[300];
        ((tg) this).field_d = new boolean[300];
        ((tg) this).field_f = new int[300];
        ((tg) this).field_a = new int[300];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new oi();
        field_i = 0;
    }
}
