/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedFile {
    static ResourceArchive field_i;
    static String field_d;
    private byte[] readBuffer;
    private long position;
    private int writeBufferLength;
    private long filePosition;
    private byte[] writeBuffer;
    private long readBufferOffset;
    private BoundedRandomAccessFile file;
    private long length;
    private long writeBufferOffset;
    private long fileLength;
    private int readBufferLength;

    final void readFully(int param0, byte[] param1) throws IOException {
        try {
          if (param0 >= -80) {
            this.length(6);
          }
          this.readFully(param1, param1.length, 0, -30541);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "gdb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long length(int param0) {
        if (param0 != 0) {
          this.file = (BoundedRandomAccessFile) null;
        }
        return this.length;
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        if (param0 > -41) {
          field_d = (String) null;
        }
        field_d = null;
    }

    private final void fillReadBuffer(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != -200000001) {
          this.length(-38);
        }
        this.readBufferLength = 0;
        if (this.position != this.filePosition) {
          this.file.seek((byte) -38, this.position);
          this.filePosition = this.position;
        }
        this.readBufferOffset = this.position;
        while (this.readBuffer.length > this.readBufferLength) {
          var2 = -this.readBufferLength + this.readBuffer.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.file.read((byte) -60, var2, this.readBuffer, this.readBufferLength);
          if (var3 != -1) {
            this.readBufferLength = this.readBufferLength + var3;
            this.filePosition = this.filePosition + (long)var3;
            continue;
          }
          break;
        }
    }

    final void seek(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          this.position = param1;
          if (param0 != 0) {
            this.position = 43L;
          }
          return;
        }
        throw new IOException();
    }

    final void write(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          try {
            if ((long)param0 + this.position > this.length) {
              this.length = this.position + (long)param0;
            }
            if (param2 > -66) {
              BufferedFile.sleep(34, -32L);
            }
            if (-1L != this.writeBufferOffset) {
              if (this.writeBufferOffset <= this.position) {
                if (this.position > ((long)this.writeBufferLength + this.writeBufferOffset)) {
                  this.flush((byte) -123);
                }
              } else {
                this.flush((byte) -123);
              }
            }
            if (this.writeBufferOffset != -1L &&
              (this.position + (long)param0) > (this.writeBufferOffset + (long)this.writeBuffer.length)) {
              var5_int = (int)((long)this.writeBuffer.length - this.position + this.writeBufferOffset);
              ArrayOperations.copy(param3, param1, this.writeBuffer, (int)(this.position - this.writeBufferOffset), var5_int);
              this.position = this.position + (long)var5_int;
              param0 = param0 - var5_int;
              param1 = param1 + var5_int;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush((byte) -120);
            }
            if (param0 <= this.writeBuffer.length) {
              if (param0 <= 0) {
                return;
              }
              if (-1L == this.writeBufferOffset) {
                this.writeBufferOffset = this.position;
              }
              ArrayOperations.copy(param3, param1, this.writeBuffer, (int)(-this.writeBufferOffset + this.position), param0);
              this.position = this.position + (long)param0;
              if ((long)this.writeBufferLength < (this.position - this.writeBufferOffset)) {
                this.writeBufferLength = (int)(this.position - this.writeBufferOffset);
              }
              return;
            }
            if (this.position != this.filePosition) {
              this.file.seek((byte) -38, this.position);
              this.filePosition = this.position;
            }
            this.file.write(param0, -14394, param3, param1);
            this.filePosition = this.filePosition + (long)param0;
            if (this.fileLength < this.filePosition) {
              this.fileLength = this.filePosition;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.readBufferOffset <= this.position &&
              (long)this.readBufferLength + this.readBufferOffset > this.position) {
              var5_long = this.position;
            } else {
              if (this.position <= this.readBufferOffset &&
                this.readBufferOffset < (this.position + (long)param0)) {
                var5_long = this.readBufferOffset;
              }
            }
            if ((long)param0 + this.position > this.readBufferOffset &&
              this.position + (long)param0 <= this.readBufferOffset + (long)this.readBufferLength) {
              var7 = this.position + (long)param0;
            } else {
              if (this.position < (this.readBufferOffset + (long)this.readBufferLength) &&
                (this.readBufferOffset + (long)this.readBufferLength) <= (this.position + (long)param0)) {
                var7 = (long)this.readBufferLength + this.readBufferOffset;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              ArrayOperations.copy(param3, (int)(var5_long + (long)param1 - this.position), this.readBuffer, (int)(var5_long - this.readBufferOffset), var9);
            }
            this.position = this.position + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("gdb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final void close(boolean param0) throws IOException {
        this.flush((byte) -123);
        if (!param0) {
          BufferedFile.sleep(-67, 17L);
        }
        this.file.close(false);
    }

    private final void flush(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param0 > -51) {
          field_i = (ResourceArchive) null;
        }
        if (-1L != this.writeBufferOffset) {
          if (~this.writeBufferOffset != ~this.filePosition) {
            this.file.seek((byte) -38, this.writeBufferOffset);
            this.filePosition = this.writeBufferOffset;
          }
          this.file.write(this.writeBufferLength, -14394, this.writeBuffer, 0);
          this.filePosition = this.filePosition + (long)this.writeBufferLength;
          if (this.fileLength < this.filePosition) {
            this.fileLength = this.filePosition;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.writeBufferOffset >= this.readBufferOffset &&
            this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset) {
            var2 = this.writeBufferOffset;
          } else {
            if (this.readBufferOffset >= this.writeBufferOffset &&
              this.readBufferOffset < (this.writeBufferOffset + (long)this.writeBufferLength)) {
              var2 = this.readBufferOffset;
            }
          }
          if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset &&
            ((long)this.readBufferLength + this.readBufferOffset) >= ((long)this.writeBufferLength + this.writeBufferOffset)) {
            var4 = this.writeBufferOffset + (long)this.writeBufferLength;
          } else {
            if (this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset &&
              ((long)this.readBufferLength + this.readBufferOffset) <= (this.writeBufferOffset + (long)this.writeBufferLength)) {
              var4 = (long)this.readBufferLength + this.readBufferOffset;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            ArrayOperations.copy(this.writeBuffer, (int)(-this.writeBufferOffset + var2), this.readBuffer, (int)(-this.readBufferOffset + var2), var6);
          }
          this.writeBufferLength = 0;
          this.writeBufferOffset = -1L;
        }
    }

    final static void sleep(int param0, long param1) {
        int var3 = -66 / ((param0 + 8) / 38);
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L == 0L) {
          PlayerLeave.sleepMillis((byte) 90, -1L + param1);
          PlayerLeave.sleepMillis((byte) 90, 1L);
        } else {
          PlayerLeave.sleepMillis((byte) 90, param1);
        }
    }

    final void readFully(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          try {
            if (param0.length < param2 + param1) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param1 + param2);
            }
            if (-1L != this.writeBufferOffset &&
              this.position >= this.writeBufferOffset &&
              ((long)this.writeBufferLength + this.writeBufferOffset) >= (this.position + (long)param1)) {
              ArrayOperations.copy(this.writeBuffer, (int)(this.position - this.writeBufferOffset), param0, param2, param1);
              this.position = this.position + (long)param1;
              return;
            }
            var5_long = this.position;
            var7 = param2;
            var8 = param1;
            if (this.readBufferOffset <= this.position &&
              (long)this.readBufferLength + this.readBufferOffset > this.position) {
              var9_int = (int)((long)this.readBufferLength - this.position + this.readBufferOffset);
              if (var9_int > param1) {
                var9_int = param1;
              }
              ArrayOperations.copy(this.readBuffer, (int)(-this.readBufferOffset + this.position), param0, param2, var9_int);
              param2 = param2 + var9_int;
              param1 = param1 - var9_int;
              this.position = this.position + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.readBuffer.length) {
              this.file.seek((byte) -38, this.position);
              this.filePosition = this.position;
              while (param1 > 0) {
                var9_intLifetime1 = this.file.read((byte) -60, param1, param0, param2);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.filePosition = this.filePosition + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.position = this.position + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.fillReadBuffer(param3 - 199969460);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.readBufferLength) {
                var9_intLifetime1Lifetime1 = this.readBufferLength;
              }
              ArrayOperations.copy(this.readBuffer, 0, param0, param2, var9_intLifetime1Lifetime1);
              param2 = param2 + var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
            }
            if (this.writeBufferOffset != -1L) {
              if (this.writeBufferOffset > this.position &&
                0 < param1) {
                var9_intLifetime2 = (int)(-this.position + this.writeBufferOffset) + param2;
                if (param2 + param1 < var9_intLifetime2) {
                  var9_intLifetime2 = param1 + param2;
                }
                while (param2 < var9_intLifetime2) {
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  param1--;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.writeBufferOffset >= var5_long &&
                this.writeBufferOffset < (long)var8 + var5_long) {
                var9 = this.writeBufferOffset;
              } else {
                if (this.writeBufferOffset <= var5_long &&
                  ((long)this.writeBufferLength + this.writeBufferOffset) > var5_long) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (this.writeBufferOffset + (long)this.writeBufferLength) &&
                (long)this.writeBufferLength + this.writeBufferOffset <= var5_long + (long)var8) {
                var11 = this.writeBufferOffset + (long)this.writeBufferLength;
              } else {
                if (var5_long + (long)var8 > this.writeBufferOffset &&
                  ((long)var8 + var5_long) <= ((long)this.writeBufferLength + this.writeBufferOffset)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                ArrayOperations.copy(this.writeBuffer, (int)(-this.writeBufferOffset + var9), param0, var7 + (int)(var9 - var5_long), var13);
                if (this.position < var11) {
                  param1 = (int)((long)param1 - (var11 - this.position));
                  this.position = var11;
                }
              }
            }
            if (param3 != -30541) {
              this.file = (BoundedRandomAccessFile) null;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
          if (0 < param1) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("gdb.B(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    BufferedFile(BoundedRandomAccessFile param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.writeBufferLength = 0;
        this.readBufferOffset = -1L;
        this.writeBufferOffset = -1L;
        try {
          this.file = param0;
          dupTemp$0 = param0.length(1);
          this.fileLength = dupTemp$0;
          this.length = dupTemp$0;
          this.writeBuffer = new byte[param2];
          this.readBuffer = new byte[param1];
          this.position = 0L;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "gdb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Accept unrated rematch";
    }
}
