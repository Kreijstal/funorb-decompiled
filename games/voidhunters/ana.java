/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ana extends ksa {
    static int field_f;
    fga field_e;
    int field_d;
    ksa field_g;

    final static byte[] a(File param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 48) {
              stackIn_4_0 = ana.a((byte) -123, (int)param0.length(), param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ana.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void c(byte param0) {
        int var1 = -34 / ((param0 - 16) / 54);
    }

    private final static byte[] a(byte param0, int param1, File param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            byte[] var4 = null;
            byte[] stackIn_3_0 = null;
            Object stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 <= -89) {
                        break L2;
                      } else {
                        ana.c((byte) 117);
                        break L2;
                      }
                    }
                    var4 = new byte[param1];
                    var3 = var4;
                    dib.a(param2, param1, var4, (byte) 119);
                    stackIn_3_0 = (byte[]) (var4);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  stackIn_5_0 = null;
                  return (byte[]) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("ana.B(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ana(fga param0, ksa param1) {
        try {
            this.field_e = param0;
            this.field_d = param0.f();
            this.field_g = param1;
            this.field_e.e(128 + this.field_d * kt.field_l >> -960748184);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ana.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        param2 = param2 << 6;
        param1 = param1 << 6;
        this.field_d = param1;
        this.field_e.c(param0 + param1 * kt.field_l >> 1700467176, param2);
    }

    static {
        field_f = 192;
    }
}
