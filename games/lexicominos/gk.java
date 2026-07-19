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
        field_f = (int[][]) null;
        field_c = null;
    }

    final void a(int param0, byte[] param1, wf param2) {
        try {
            int discarded$2 = 0;
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
                  if ((param2.field_j[param2.field_h] ^ -1) != -32) {
                    break L2;
                  } else {
                    if (-117 != param2.field_j[param2.field_h - -1]) {
                      break L2;
                    } else {
                      L3: {
                        if (this.field_d != null) {
                          break L3;
                        } else {
                          this.field_d = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          this.field_d.setInput(param2.field_j, param2.field_h + 10, param2.field_j.length + -param2.field_h + -10 + -8);
                          discarded$2 = this.field_d.inflate(param1);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_d.reset();
                        throw new RuntimeException("");
                      }
                      this.field_d.reset();
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
                stackOut_13_0 = (RuntimeException) (runtimeException);
                stackOut_13_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 0;
        if (param2 != 71) {
          field_c = (String) null;
          var3 = -1 + param1 & param0 >> 887128191;
          return ((param0 >>> 1852482975) + param0) % param1 + var3;
        } else {
          var3 = -1 + param1 & param0 >> 887128191;
          return ((param0 >>> 1852482975) + param0) % param1 + var3;
        }
    }

    public gk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0) {
        mg.field_x = null;
        rg.field_c = null;
        ci.field_b = null;
        be.field_f = (byte[][]) null;
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
        field_e = 64;
        field_b = 0;
        field_f = new int[][]{new int[]{17, 12, 8, 6, 6, 8, 10, 12, 11, 10}, new int[]{17, 12, 8, 6, 6, 8, 10, 13, 11, 10}, new int[]{18, 13, 8, 6, 6, 9, 10, 13, 12, 11}, new int[]{18, 13, 9, 7, 7, 10, 11, 14, 13, 11}, new int[]{19, 14, 10, 8, 8, 11, 12, 15, 14, 12}, new int[]{20, 16, 11, 9, 9, 12, 13, 16, 15, 14}, new int[]{22, 17, 13, 11, 11, 13, 15, 17, 16, 15}, new int[]{23, 19, 15, 13, 13, 15, 17, 19, 18, 17}, new int[]{25, 21, 17, 15, 15, 17, 18, 21, 20, 19}, new int[]{27, 22, 19, 17, 17, 19, 20, 23, 22, 21}, new int[]{29, 24, 21, 19, 19, 21, 22, 25, 24, 23}, new int[]{31, 27, 23, 21, 21, 23, 24, 27, 26, 25}, new int[]{33, 29, 25, 23, 23, 25, 27, 29, 28, 27}, new int[]{35, 31, 27, 25, 25, 27, 29, 31, 30, 29}, new int[]{37, 33, 29, 27, 27, 29, 31, 33, 32, 31}, new int[]{38, 34, 31, 29, 29, 31, 33, 35, 34, 33}, new int[]{40, 36, 33, 31, 31, 33, 34, 36, 36, 35}, new int[]{42, 38, 34, 33, 33, 35, 36, 38, 37, 36}, new int[]{43, 39, 36, 34, 34, 36, 38, 40, 39, 38}, new int[]{45, 41, 37, 36, 36, 38, 39, 41, 40, 39}, new int[]{46, 42, 39, 37, 37, 39, 40, 42, 41, 40}, new int[]{47, 43, 40, 38, 38, 40, 41, 43, 42, 41}, new int[]{47, 44, 40, 39, 39, 41, 42, 44, 43, 42}, new int[]{48, 44, 41, 39, 39, 41, 42, 44, 44, 43}, new int[]{48, 45, 41, 40, 40, 42, 43, 45, 44, 43}, new int[]{48, 45, 41, 40, 40, 42, 43, 45, 44, 43}, new int[]{48, 45, 41, 40, 40, 42, 43, 45, 44, 43}, new int[]{48, 44, 41, 39, 39, 41, 42, 44, 44, 43}, new int[]{47, 44, 40, 39, 39, 41, 42, 44, 43, 42}, new int[]{47, 43, 40, 38, 38, 40, 41, 43, 42, 41}, new int[]{46, 42, 39, 37, 37, 39, 40, 42, 41, 40}, new int[]{45, 41, 37, 36, 36, 38, 39, 41, 40, 39}, new int[]{43, 39, 36, 34, 34, 36, 38, 40, 39, 38}, new int[]{42, 38, 34, 33, 33, 35, 36, 38, 37, 36}, new int[]{40, 36, 33, 31, 31, 33, 34, 36, 36, 35}, new int[]{38, 34, 31, 29, 29, 31, 33, 35, 34, 33}, new int[]{37, 33, 29, 27, 27, 29, 31, 33, 32, 31}, new int[]{35, 31, 27, 25, 25, 27, 29, 31, 30, 29}, new int[]{33, 29, 25, 23, 23, 25, 27, 29, 28, 27}, new int[]{31, 27, 23, 21, 21, 23, 24, 27, 26, 25}, new int[]{29, 24, 21, 19, 19, 21, 22, 25, 24, 23}};
    }
}
