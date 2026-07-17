/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk {
    static volatile int field_b;
    static String field_c;
    static int field_e;
    private java.util.zip.Inflater field_d;
    static int[][] field_f;
    static sh field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 11) {
            return;
        }
        field_f = null;
        field_c = null;
    }

    final void a(int param0, byte[] param1, wf param2) {
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
                  if (param0 == 8) {
                    break L1;
                  } else {
                    gk.a(-58);
                    break L1;
                  }
                }
                L2: {
                  if (param2.field_j[param2.field_h] != 31) {
                    break L2;
                  } else {
                    if (-117 != param2.field_j[param2.field_h - -1]) {
                      break L2;
                    } else {
                      L3: {
                        if (((gk) this).field_d != null) {
                          break L3;
                        } else {
                          ((gk) this).field_d = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          ((gk) this).field_d.setInput(param2.field_j, param2.field_h + 10, param2.field_j.length + -param2.field_h - 18);
                          int discarded$2 = ((gk) this).field_d.inflate(param1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((gk) this).field_d.reset();
                        throw new RuntimeException("");
                      }
                      ((gk) this).field_d.reset();
                      break L0;
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
                stackOut_13_1 = new StringBuilder().append("gk.B(").append(param0).append(44);
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
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
              throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = -1 + param1 & param0 >> 31;
        return ((param0 >>> 31) + param0) % param1 + var3;
    }

    public gk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0) {
        mg.field_x = null;
        rg.field_c = null;
        ci.field_b = null;
        be.field_f = null;
        bd.field_m = null;
        if (param0 != 12428) {
          gk.b(-80);
          pb.field_h = null;
          return;
        } else {
          pb.field_h = null;
          return;
        }
    }

    private gk(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 64;
        field_b = 0;
        field_f = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
    }
}
