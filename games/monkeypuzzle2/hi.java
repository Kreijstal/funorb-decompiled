/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private java.util.zip.Inflater field_d;
    static wh field_a;
    static int field_c;
    static dk field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -32) {
            field_b = (dk) null;
        }
    }

    private hi(int param0, int param1, int param2) {
    }

    final void a(int param0, byte[] param1, gk param2) {
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
                  if ((param2.field_g[param2.field_h] ^ -1) != -32) {
                    break L1;
                  } else {
                    if (param2.field_g[param2.field_h + 1] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (null != this.field_d) {
                          break L2;
                        } else {
                          this.field_d = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          L4: {
                            if (param0 >= 30) {
                              break L4;
                            } else {
                              hi.a(80);
                              break L4;
                            }
                          }
                          this.field_d.setInput(param2.field_g, param2.field_h + 10, -param2.field_h - 10 - 8 + param2.field_g.length);
                          this.field_d.inflate(param1);
                          break L3;
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
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("hi.B(").append(param0).append(',');

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
              throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public hi() {
        this(-1, 1000000, 1000000);
    }

    static {
    }
}
