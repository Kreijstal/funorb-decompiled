/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedRandomAccessFile {
    private long maxLength;
    private long position;
    private RandomAccessFile file;
    static int field_c;

    protected final void finalize() throws Throwable {
        if (null != this.file) {
          System.out.println("");
          this.close(false);
        }
    }

    final void write(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (this.maxLength < this.position + (long)param0) {
          this.file.seek(this.maxLength);
          this.file.write(1);
          throw new EOFException();
        }
        this.file.write(param2, param3, param0);
        if (param1 != -14394) {
          return;
        }
        try {
          this.position = this.position + (long)param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "au.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int read(byte param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.file.read(param2, param3, param1);
          if (var5_int > 0) {
            this.position = this.position + (long)var5_int;
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void close(boolean param0) throws IOException {
        if (this.file != null) {
          this.file.close();
          this.file = null;
          return;
        }
        if (param0) {
          return;
        }
    }

    final void seek(byte param0, long param1) throws IOException {
        this.file.seek(param1);
        this.position = param1;
        if (param0 != -38) {
          field_c = -3;
          return;
        }
    }

    final long length(int param0) throws IOException {
        if (param0 != 1) {
          field_c = 127;
          return this.file.length();
        }
        return this.file.length();
    }

    BoundedRandomAccessFile(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.file = new RandomAccessFile(param0, param1);
          this.maxLength = param2;
          this.position = 0L;
          var5_int = this.file.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "au.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = 2;
    }
}
