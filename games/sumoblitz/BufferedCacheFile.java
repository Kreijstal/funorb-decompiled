/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class BufferedCacheFile {
    private byte[] readBuffer;
    private long filePosition;
    private byte[] writeBuffer;
    private long position;
    private long readStart;
    private int writeLength;
    private long fileLength;
    private LimitedRandomAccessFile file;
    private long writeStart;
    private int readLength;
    private long length;

    final static void c(int param0) {
        bw.a(false, LegacyOpenGlUnlitEffect.c(param0 ^ 2));
        if (param0 != 0) {
          String var2 = (String) null;
          BufferedCacheFile.a(42L, (java.applet.Applet) null, false, (String) null, (String) null);
        }
    }

    final static void a(long param0, java.applet.Applet param1, boolean param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (!param2) {
                return;
              }
              var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param0 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + ExpandingRingEffect.formatCookieDate(param0 * 1000L + wq.a(-123), true) + "; Max-Age=" + param0;
              }
              tw.a("document.cookie=\"" + var7Lifetime4 + "\"", -15428, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("gj.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void readFully(int length, int offset, byte[] destination, int guard) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (length + offset > destination.length) {
              throw new ArrayIndexOutOfBoundsException(offset + (length - destination.length));
            }
            if (this.writeStart != -1L &&
              this.position >= this.writeStart &&
              (this.position + (long)length) <= ((long)this.writeLength + this.writeStart)) {
              la.a(this.writeBuffer, (int)(-this.writeStart + this.position), destination, offset, length);
              this.position = this.position + (long)length;
              return;
            }
            var5_long = this.position;
            var7 = offset;
            var8 = length;
            if (this.position >= this.readStart &&
              this.position < this.readStart + (long)this.readLength) {
              var9_int = (int)((long)this.readLength + (-this.position + this.readStart));
              if (length < var9_int) {
                var9_int = length;
              }
              la.a(this.readBuffer, (int)(this.position - this.readStart), destination, offset, var9_int);
              offset = offset + var9_int;
              this.position = this.position + (long)var9_int;
              length = length - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (length > this.readBuffer.length) {
              this.file.seek((byte) -100, this.position);
              this.filePosition = this.position;
              while (length > 0) {
                var9_intLifetime1 = this.file.read(destination, 2, length, offset);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.position = this.position + (long)var9_intLifetime1;
                this.filePosition = this.filePosition + (long)var9_intLifetime1;
                offset = offset + var9_intLifetime1;
                length = length - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (length > 0)) {
              this.fillReadBuffer(-1);
              var9_intLifetime1Lifetime1 = length;
              if (this.readLength < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.readLength;
              }
              la.a(this.readBuffer, 0, destination, offset, var9_intLifetime1Lifetime1);
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
              offset = offset + var9_intLifetime1Lifetime1;
              length = length - var9_intLifetime1Lifetime1;
            }
            if (guard >= -51) {
              return;
            }
            if (this.writeStart != -1L) {
              if (this.position < this.writeStart &&
                length > 0) {
                var9_intLifetime2 = (int)(-this.position + this.writeStart) + offset;
                if (length + offset < var9_intLifetime2) {
                  var9_intLifetime2 = length + offset;
                }
                while (offset < var9_intLifetime2) {
                  length--;
                  incrementValue$0 = offset;
                  offset++;
                  destination[incrementValue$0] = (byte) 0;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.writeStart &&
                ((long)var8 + var5_long) > this.writeStart) {
                var9 = this.writeStart;
              } else {
                if (this.writeStart <= var5_long &&
                  var5_long < (long)this.writeLength + this.writeStart) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (long)this.writeLength + this.writeStart &&
                (long)var8 + var5_long >= this.writeStart + (long)this.writeLength) {
                var11 = (long)this.writeLength + this.writeStart;
              } else {
                if (this.writeStart < (var5_long + (long)var8) &&
                  this.writeStart + (long)this.writeLength >= var5_long + (long)var8) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                la.a(this.writeBuffer, (int)(-this.writeStart + var9), destination, (int)(var9 - var5_long) + var7, var13);
                if (var11 > this.position) {
                  length = (int)((long)length - (var11 - this.position));
                  this.position = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
          if (length <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("gj.A(").append(length).append(',').append(offset).append(',');
          if (destination == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void flush(byte guard) throws IOException {
        long var2_long;
        int var2;
        long var4;
        int var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (this.writeStart != -1L) {
          if (this.filePosition != this.writeStart) {
            this.file.seek((byte) -115, this.writeStart);
            this.filePosition = this.writeStart;
          }
          this.file.write(this.writeBuffer, 0, this.writeLength, 1);
          this.filePosition = this.filePosition + (long)this.writeLength;
          if (this.filePosition > this.fileLength) {
            this.fileLength = this.filePosition;
          }
          var2_long = -1L;
          var4 = -1L;
          if (this.writeStart >= this.readStart &&
            (this.readStart + (long)this.readLength) > this.writeStart) {
            var2_long = this.writeStart;
          } else {
            if (this.readStart >= this.writeStart &&
              this.writeStart + (long)this.writeLength > this.readStart) {
              var2_long = this.readStart;
            }
          }
          if (this.readStart < this.writeStart + (long)this.writeLength &&
            (long)this.readLength + this.readStart >= this.writeStart + (long)this.writeLength) {
            var4 = this.writeStart + (long)this.writeLength;
          } else {
            if ((long)this.readLength + this.readStart > this.writeStart &&
              (this.readStart + (long)this.readLength) <= ((long)this.writeLength + this.writeStart)) {
              var4 = (long)this.readLength + this.readStart;
            }
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            var6 = (int)(-var2_long + var4);
            la.a(this.writeBuffer, (int)(-this.writeStart + var2_long), this.readBuffer, (int)(-this.readStart + var2_long), var6);
          }
          this.writeStart = -1L;
          this.writeLength = 0;
        }
        var2 = -14 / ((67 - guard) / 34);
    }

    final void write(byte[] source, int length, byte guard, int offset) throws IOException {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (((long)length + this.position) > this.length) {
              this.length = (long)length + this.position;
            }
            if (this.writeStart != -1L && (this.writeStart > this.position ||
              ((long)this.writeLength + this.writeStart) < this.position)) {
              this.flush((byte) 115);
            }
            if (this.writeStart != -1L &&
              this.writeStart + (long)this.writeBuffer.length < this.position + (long)length) {
              var5_int = (int)(this.writeStart - this.position + (long)this.writeBuffer.length);
              la.a(source, offset, this.writeBuffer, (int)(-this.writeStart + this.position), var5_int);
              this.position = this.position + (long)var5_int;
              length = length - var5_int;
              offset = offset + var5_int;
              this.writeLength = this.writeBuffer.length;
              this.flush((byte) 109);
            }
            if (this.writeBuffer.length >= length) {
              if (0 >= length) {
                var5_intLifetime1 = -89 % ((20 - guard) / 41);
                return;
              }
              if (this.writeStart == -1L) {
                this.writeStart = this.position;
              }
              la.a(source, offset, this.writeBuffer, (int)(-this.writeStart + this.position), length);
              this.position = this.position + (long)length;
              if (this.position - this.writeStart > (long)this.writeLength) {
                this.writeLength = (int)(this.position - this.writeStart);
              }
              return;
            }
            if (~this.position != ~this.filePosition) {
              this.file.seek((byte) -99, this.position);
              this.filePosition = this.position;
            }
            this.file.write(source, offset, length, 1);
            this.filePosition = this.filePosition + (long)length;
            if (this.filePosition > this.fileLength) {
              this.fileLength = this.filePosition;
            }
            var5_long = -1L;
            if (this.readStart <= this.position &&
              ((long)this.readLength + this.readStart) > this.position) {
              var5_long = this.position;
            } else {
              if (this.position <= this.readStart &&
                (long)length + this.position > this.readStart) {
                var5_long = this.readStart;
              }
            }
            var7 = -1L;
            if (this.readStart < (long)length + this.position &&
              (this.readStart + (long)this.readLength) >= (this.position + (long)length)) {
              var7 = (long)length + this.position;
            } else {
              if (this.position < ((long)this.readLength + this.readStart) &&
                ((long)this.readLength + this.readStart) <= ((long)length + this.position)) {
                var7 = (long)this.readLength + this.readStart;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              la.a(source, (int)(-this.position + (var5_long + (long)offset)), this.readBuffer, (int)(var5_long - this.readStart), var9);
            }
            this.position = this.position + (long)length;
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
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("gj.D(");
          if (source == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(length).append(',').append(guard).append(',').append(offset).append(')').toString());
        }
    }

    final void close(int guard) throws IOException {
        this.flush((byte) -114);
        if (guard != -1) {
          BufferedCacheFile.c(-23);
        }
        this.file.close(0);
    }

    final void readFully(byte[] destination, byte guard) throws IOException {
        try {
          int var3_int = 47 / ((84 - guard) / 39);
          this.readFully(destination.length, 0, destination, -127);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gj.F(" + (destination != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void seek(int guard, long newPosition) throws IOException {
        if (newPosition >= 0L) {
          if (guard != -7564) {
            this.writeStart = -40L;
          }
          this.position = newPosition;
          return;
        }
        throw new IOException();
    }

    final long length(byte guard) {
        if (guard != -60) {
          return 111L;
        }
        return this.length;
    }

    private final void fillReadBuffer(int guard) throws IOException {
        int var2;
        int var3;
        int var4;
        String var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.readLength = 0;
        if (this.filePosition != this.position) {
          this.file.seek((byte) 54, this.position);
          this.filePosition = this.position;
        }
        if (guard != -1) {
          var5 = (String) null;
          BufferedCacheFile.a(20L, (java.applet.Applet) null, true, (String) null, (String) null);
        }
        this.readStart = this.position;
        while (this.readLength < this.readBuffer.length) {
          var2 = this.readBuffer.length - this.readLength;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.file.read(this.readBuffer, 2, var2, this.readLength);
          if (var3 != -1) {
            this.filePosition = this.filePosition + (long)var3;
            this.readLength = this.readLength + var3;
            continue;
          }
          break;
        }
    }

    BufferedCacheFile(LimitedRandomAccessFile backingFile, int readCapacity, int writeCapacity) throws IOException {
        long dupTemp$0 = 0L;
        this.writeLength = 0;
        this.readStart = -1L;
        this.writeStart = -1L;
        try {
          this.file = backingFile;
          dupTemp$0 = backingFile.length(100);
          this.fileLength = dupTemp$0;
          this.length = dupTemp$0;
          this.writeBuffer = new byte[writeCapacity];
          this.readBuffer = new byte[readCapacity];
          this.position = 0L;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gj.<init>(" + (backingFile != null ? "{...}" : "null") + ',' + readCapacity + ',' + writeCapacity + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -84) {
          BufferedCacheFile.a((byte) 37, 116);
        }
        return ExpandingRingEffect.nextRandomInt(param1, LegacyOpenGlEffectManager.field_b, (byte) -96);
    }

    static {
    }
}
