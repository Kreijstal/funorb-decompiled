/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh {
    private java.util.zip.Inflater field_g;
    static String field_i;
    static String field_e;
    static nd field_a;
    static int field_b;
    static int[] field_f;
    static String field_h;
    static String field_d;
    static boolean[] field_c;

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_i = null;
        field_d = null;
    }

    final void a(int param0, byte[] param1, vi param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (param2.field_n[param2.field_i] != 31) {
                    break L1;
                  } else {
                    if (-117 == param2.field_n[param2.field_i - -1]) {
                      L2: {
                        if (param0 >= 82) {
                          break L2;
                        } else {
                          fh.a(62);
                          break L2;
                        }
                      }
                      L3: {
                        if (null != ((fh) this).field_g) {
                          break L3;
                        } else {
                          ((fh) this).field_g = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          ((fh) this).field_g.setInput(param2.field_n, 10 + param2.field_i, param2.field_n.length + (-param2.field_i - 18));
                          int discarded$2 = ((fh) this).field_g.inflate(param1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((fh) this).field_g.reset();
                        throw new RuntimeException("");
                      }
                      ((fh) this).field_g.reset();
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
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
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public fh() {
        this(-1, 1000000, 1000000);
    }

    private fh(int param0, int param1, int param2) {
    }

    final static void a(int param0) {
        he.field_y = null;
        vh.field_d = null;
        if (param0 != 1) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading music";
        field_e = "Fullscreen";
        field_a = new nd(12, 0, 1, 0);
        field_f = new int[]{20, 0, 18, 4, 5, 7, 10, 22};
        field_h = "OK";
        field_c = new boolean[2];
        field_d = "Mission ";
    }
}
