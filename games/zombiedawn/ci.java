/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci {
    static int[] field_b;
    static int field_d;
    private java.util.zip.Inflater field_e;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        if (param0 == 256) {
          ep.field_l.a(true);
          if (tf.field_c.c(param0 + -277)) {
            return 0;
          } else {
            return jo.w(79);
          }
        } else {
          return 54;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = (int[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    private ci(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, de param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1.field_h[param1.field_j] != 31) {
                    break L1;
                  } else {
                    if (param1.field_h[1 + param1.field_j] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_e) {
                          break L2;
                        } else {
                          this.field_e = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_e.setInput(param1.field_h, param1.field_j - -10, param1.field_h.length + param2 + -param1.field_j + -10);
                          this.field_e.inflate(param0);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_e.reset();
                        throw new RuntimeException("");
                      }
                      this.field_e.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (runtimeException);

                stackIn_13_1 = new StringBuilder().append("ci.B(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ci() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_d = 0;
            field_b = new int[256];
            field_a = "Passwords must be between 5 and 20 characters long";
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (8 <= var2) {
                    field_b[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (1 & var0 ^ -1)) {
                      var0 = var0 >>> 1464523905 ^ -306674912;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
