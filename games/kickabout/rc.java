/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc {
    static int field_d;
    static String field_b;
    private java.util.zip.Inflater field_a;
    static int field_f;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 <= 112) {
            field_e = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public rc() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, iw param1, byte[] param2) {
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
                  if (-32 != (param1.field_f[param1.field_n] ^ -1)) {
                    break L1;
                  } else {
                    if (116 != (param1.field_f[param1.field_n + 1] ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_a) {
                          break L2;
                        } else {
                          this.field_a = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            this.field_a.setInput(param1.field_f, 10 + param1.field_n, param1.field_f.length + (-10 + (-param1.field_n + -8)));
                            if (param0 == -4019) {
                              break L4;
                            } else {
                              rc.a(51);
                              break L4;
                            }
                          }
                          this.field_a.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_a.reset();
                        throw new RuntimeException("");
                      }
                      this.field_a.reset();
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

                stackIn_15_1 = new StringBuilder().append("rc.B(").append(param0).append(',');

                if (param1 == null) {
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


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

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
              throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rc(int param0, int param1, int param2) {
    }

    static {
        field_d = 0;
        field_c = "<%0> cannot join; the game is full.";
        field_b = "Allow spectators?";
        field_e = "You have declined the invitation.";
    }
}
