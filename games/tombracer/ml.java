/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ml {
    private long field_d;
    static String field_c;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 22) {
            ml.a(80);
          }
          var5_int = this.field_a.read(param1, param3, param2);
          if (var5_int > 0) {
            this.field_d = this.field_d + (long)var5_int;
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ml.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param1 != 0) {
          return;
        }
        try {
          if (this.field_b < ((long)param2 + this.field_d)) {
            this.field_a.seek(this.field_b);
            this.field_a.write(1);
            throw new EOFException();
          }
          this.field_a.write(param3, param0, param2);
          this.field_d = this.field_d + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ml.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_a != null) {
          System.out.println("");
          this.b((byte) -102);
        }
    }

    final void b(byte param0) throws IOException {
        if (this.field_a != null) {
          this.field_a.close();
          this.field_a = null;
          if (param0 > -62) {
            ml.a(-10);
            return;
          }
          return;
        }
        if (param0 <= -62) {
          return;
        }
        ml.a(-10);
    }

    final static int a(int param0) {
        if (param0 < 37) {
          return -3;
        }
        return sja.field_i.length;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -7) {
          ml.a(-107);
        }
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
          this.field_b = 5L;
          return this.field_a.length();
        }
        return this.field_a.length();
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 == 0) {
          this.field_a.seek(param1);
          this.field_d = param1;
          return;
        }
        this.field_b = 46L;
        this.field_a.seek(param1);
        this.field_d = param1;
    }

    ml(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_d = 0L;
          this.field_b = param2;
          var5_int = this.field_a.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Game full";
    }
}
