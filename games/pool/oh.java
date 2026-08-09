/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oh {
    static int[] field_d;
    static String field_f;
    static long field_e;
    static String field_g;
    static boolean field_h;
    private java.util.zip.Inflater field_b;
    static ai field_c;
    static String field_a;

    final static qr a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        qr stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -79 % ((51 - param0) / 49);
            stackIn_1_0 = new qr(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("oh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte[] param0, boolean param1, ge param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    oh.a((byte) 4);
                    break L1;
                  }
                }
                L2: {
                  if (-32 != (param2.field_t[param2.field_v] ^ -1)) {
                    break L2;
                  } else {
                    if (116 != (param2.field_t[param2.field_v + 1] ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (null != this.field_b) {
                          break L3;
                        } else {
                          this.field_b = new java.util.zip.Inflater(true);
                          break L3;
                        }
                      }
                      try {
                        L4: {
                          this.field_b.setInput(param2.field_t, 10 + param2.field_v, -10 + (-param2.field_v + -8 + param2.field_t.length));
                          this.field_b.inflate(param0);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_b.reset();
                        throw new RuntimeException("");
                      }
                      this.field_b.reset();
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
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("oh.B(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public oh() {
        this(-1, 1000000, 1000000);
    }

    private oh(int param0, int param1, int param2) {
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -82) {
            return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
        field_g = null;
    }

    static {
        field_d = new int[12];
        field_g = "Names cannot contain consecutive spaces";
        field_e = 20000000L;
        field_h = false;
        field_f = "<%0> lost 2 lives!";
        field_a = "Report abuse";
    }
}
