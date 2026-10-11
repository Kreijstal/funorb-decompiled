/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class au {
    private long field_b;
    private long field_d;
    private RandomAccessFile field_a;
    static int field_c;

    protected final void finalize() throws Throwable {
        if (null != this.field_a) {
          System.out.println("");
          this.a(false);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (this.field_b < this.field_d + (long)param0) {
          this.field_a.seek(this.field_b);
          this.field_a.write(1);
          throw new EOFException();
        }
        this.field_a.write(param2, param3, param0);
        if (param1 != -14394) {
          return;
        }
        try {
          this.field_d = this.field_d + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "au.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(byte param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.read(param2, param3, param1);
          if (var5_int > 0) {
            this.field_d = this.field_d + (long)var5_int;
          }
          if (param0 == -60) {
            stackIn_7_0 = var5_int;
            return stackIn_7_0;
          }
          stackIn_5_0 = -39;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("au.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        if (this.field_a != null) {
          this.field_a.close();
          this.field_a = null;
          return;
        }
        if (param0) {
          return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_a.seek(param1);
        this.field_d = param1;
        if (param0 != -38) {
          field_c = -3;
          return;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
          field_c = 127;
          return this.field_a.length();
        }
        return this.field_a.length();
    }

    au(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_b = param2;
          this.field_d = 0L;
          var5_int = this.field_a.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "au.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = 2;
    }
}
