/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg {
    static f field_a;
    private java.util.zip.Inflater field_c;
    static int field_e;
    static mf field_b;
    static int field_d;

    public mg() {
        this(-1, 1000000, 1000000);
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 10) {
            mg.a(109);
            return fb.b(-122);
        }
        return fb.b(-122);
    }

    final static void a(int param0) {
        nf.field_M = mi.c((byte) 105);
        nb.field_a = new f();
        wa.a(true, true, 30);
        if (param0 >= -53) {
            mg.a(true, 123, -100, 21);
        }
    }

    private mg(int param0, int param1, int param2) {
    }

    final void a(byte param0, byte[] param1, ni param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            int var4_int = 0;
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
                  if (param2.field_k[param2.field_i] != 31) {
                    break L1;
                  } else {
                    if (116 != (param2.field_k[param2.field_i + 1] ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_c == null) {
                          this.field_c = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var4_int = 84 % ((-67 - param0) / 59);
                      try {
                        L3: {
                          this.field_c.setInput(param2.field_k, param2.field_i + 10, param2.field_k.length + -param2.field_i - 10 - 8);
                          this.field_c.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_c.reset();
                        throw new RuntimeException("");
                      }
                      this.field_c.reset();
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
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("mg.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != -3) {
            field_b = (mf) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_d = -1;
    }
}
