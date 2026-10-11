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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 48) {
            stackIn_4_0 = ana.a((byte) -123, (int)param0.length(), param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ana.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 > -89) {
                ana.c((byte) 117);
              }
              var4 = new byte[param1];
              var3 = var4;
              dib.a(param2, param1, var4, (byte) 119);
              stackIn_3_0 = var4;
              return stackIn_3_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (IOException) (Object) decompiledCaughtException;
              stackIn_5_0 = null;
              return (byte[]) (stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ana.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
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
          this.field_e.e(128 + this.field_d * kt.field_l >> 8);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ana.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        param2 = param2 << 6;
        param1 = param1 << 6;
        this.field_d = param1;
        this.field_e.c(param0 + param1 * kt.field_l >> 8, param2);
    }

    static {
        field_f = 192;
    }
}
