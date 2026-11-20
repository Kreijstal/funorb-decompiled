/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedRandomAccessFile {
    private long logicalLength;
    private byte[] readBuffer;
    private long physicalPosition;
    private long physicalLength;
    private byte[] writeBuffer;
    private long position;
    private int readBufferLength;
    static String field_q;
    private BoundedRandomAccessFile file;
    static RotatedSpriteAsset[] field_h;
    private int writeBufferLength;
    static SpriteAsset field_o;
    static volatile boolean field_n;
    static String field_j;
    private long readBufferStart;
    private long writeBufferStart;
    static int currentBackground;

    private final void refillReadBuffer(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (param0 == -1) {
          this.readBufferLength = 0;
          if (~this.position != ~this.physicalPosition) {
            this.file.seek((byte) 102, this.position);
            this.physicalPosition = this.position;
          }
          this.readBufferStart = this.position;
          while (this.readBufferLength < this.readBuffer.length) {
            var2 = this.readBuffer.length - this.readBufferLength;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.file.read(this.readBufferLength, this.readBuffer, var2, 11812);
            if (var3 == -1) {
              break;
            }
            this.readBufferLength = this.readBufferLength + var3;
            this.physicalPosition = this.physicalPosition + (long)var3;
          }
          return;
        }
    }

    final static void blendHalfIntensitySpan(int param0, int param1, int param2, byte param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param3 != -85) {
            var9 = (int[]) null;
            BufferedRandomAccessFile.blendHalfIntensitySpan(78, -120, -127, (byte) -20, (int[]) null);
          }
          while (true) {
            param0--;
            if (param0 < 0) {
              return;
            }
            var10 = param4;
            var5 = var10;
            var6 = param1;
            var7 = param2;
            var10[var6] = var7 + LoginChoicePanel.andInts(8355711, var10[var6] >> 1);
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ud.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void flush(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        if (param0 != -1) {
          this.physicalLength = -96L;
        }
        if (this.writeBufferStart != -1L) {
          if (this.writeBufferStart != this.physicalPosition) {
            this.file.seek((byte) 66, this.writeBufferStart);
            this.physicalPosition = this.writeBufferStart;
          }
          this.file.write(this.writeBufferLength, this.writeBuffer, 0, param0 ^ 17173);
          this.physicalPosition = this.physicalPosition + (long)this.writeBufferLength;
          if (this.physicalLength < this.physicalPosition) {
            this.physicalLength = this.physicalPosition;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.readBufferStart <= this.writeBufferStart &&
            (long)this.readBufferLength + this.readBufferStart > this.writeBufferStart) {
            var2 = this.writeBufferStart;
          } else {
            if (this.readBufferStart >= this.writeBufferStart &&
              this.readBufferStart < this.writeBufferStart + (long)this.writeBufferLength) {
              var2 = this.readBufferStart;
            }
          }
          if (this.writeBufferStart + (long)this.writeBufferLength > this.readBufferStart &&
            (long)this.readBufferLength + this.readBufferStart >= this.writeBufferStart + (long)this.writeBufferLength) {
            var4 = (long)this.writeBufferLength + this.writeBufferStart;
          } else {
            if (this.readBufferStart + (long)this.readBufferLength > this.writeBufferStart &&
              (this.readBufferStart + (long)this.readBufferLength) <= (this.writeBufferStart + (long)this.writeBufferLength)) {
              var4 = (long)this.readBufferLength + this.readBufferStart;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            ArrayOperations.copyBytes(this.writeBuffer, (int)(-this.writeBufferStart + var2), this.readBuffer, (int)(-this.readBufferStart + var2), var6);
          }
          this.writeBufferLength = 0;
          this.writeBufferStart = -1L;
        }
    }

    final void write(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = HoldTheLine.field_D;
        try {
          try {
            if ((long)param1 + this.position > this.logicalLength) {
              this.logicalLength = (long)param1 + this.position;
            }
            if (-1L != this.writeBufferStart && (this.writeBufferStart > this.position ||
              this.position > (this.writeBufferStart + (long)this.writeBufferLength))) {
              this.flush(-1);
            }
            if (this.writeBufferStart != -1L &&
              (long)param1 + this.position > this.writeBufferStart + (long)this.writeBuffer.length) {
              var5_int = (int)(this.writeBufferStart - (this.position - (long)this.writeBuffer.length));
              ArrayOperations.copyBytes(param3, param2, this.writeBuffer, (int)(this.position - this.writeBufferStart), var5_int);
              param1 = param1 - var5_int;
              this.position = this.position + (long)var5_int;
              param2 = param2 + var5_int;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush(-1);
            }
            if (param0 < 124) {
              this.length(110);
            }
            if (this.writeBuffer.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (-1L == this.writeBufferStart) {
                this.writeBufferStart = this.position;
              }
              ArrayOperations.copyBytes(param3, param2, this.writeBuffer, (int)(-this.writeBufferStart + this.position), param1);
              this.position = this.position + (long)param1;
              if ((long)this.writeBufferLength < this.position - this.writeBufferStart) {
                this.writeBufferLength = (int)(-this.writeBufferStart + this.position);
              }
              return;
            }
            if (~this.position != ~this.physicalPosition) {
              this.file.seek((byte) 84, this.position);
              this.physicalPosition = this.position;
            }
            this.file.write(param1, param3, param2, -17174);
            this.physicalPosition = this.physicalPosition + (long)param1;
            if (this.physicalPosition > this.physicalLength) {
              this.physicalLength = this.physicalPosition;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.readBufferStart <= this.position &&
              (long)this.readBufferLength + this.readBufferStart > this.position) {
              var5_long = this.position;
            } else {
              if (this.readBufferStart >= this.position &&
                (long)param1 + this.position > this.readBufferStart) {
                var5_long = this.readBufferStart;
              }
            }
            if ((this.position + (long)param1) > this.readBufferStart &&
              this.readBufferStart + (long)this.readBufferLength >= this.position + (long)param1) {
              var7 = this.position + (long)param1;
            } else {
              if (this.position < (this.readBufferStart + (long)this.readBufferLength) &&
                this.readBufferStart + (long)this.readBufferLength <= (long)param1 + this.position) {
                var7 = (long)this.readBufferLength + this.readBufferStart;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              ArrayOperations.copyBytes(param3, (int)((long)param2 + (var5_long - this.position)), this.readBuffer, (int)(var5_long - this.readBufferStart), var9);
            }
            this.position = this.position + (long)param1;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.physicalPosition = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("ud.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final long length(int param0) {
        if (param0 != -32261) {
          field_n = false;
        }
        return this.logicalLength;
    }

    final void readFully(byte[] param0, int param1) throws IOException {
        try {
          this.readFully(-1, param1, param0.length, param0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void close(int param0) throws IOException {
        this.flush(param0);
        this.file.close((byte) 20);
    }

    final void readFully(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var14 = HoldTheLine.field_D;
        try {
          try {
            if (param1 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
            }
            if (this.writeBufferStart != (long)param0 &&
              this.writeBufferStart <= this.position &&
              ((long)this.writeBufferLength + this.writeBufferStart) >= ((long)param2 + this.position)) {
              ArrayOperations.copyBytes(this.writeBuffer, (int)(-this.writeBufferStart + this.position), param3, param1, param2);
              this.position = this.position + (long)param2;
              return;
            }
            var5_long = this.position;
            var7 = param1;
            var8 = param2;
            if (this.position >= this.readBufferStart &&
              this.readBufferStart + (long)this.readBufferLength > this.position) {
              var9_int = (int)((long)this.readBufferLength + (this.readBufferStart - this.position));
              if (var9_int > param2) {
                var9_int = param2;
              }
              ArrayOperations.copyBytes(this.readBuffer, (int)(this.position - this.readBufferStart), param3, param1, var9_int);
              this.position = this.position + (long)var9_int;
              param1 = param1 + var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.readBuffer.length < param2) {
              this.file.seek((byte) 47, this.position);
              this.physicalPosition = this.position;
              while (param2 > 0) {
                var9_intLifetime1 = this.file.read(param1, param3, param2, 11812);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param1 = param1 + var9_intLifetime1;
                this.position = this.position + (long)var9_intLifetime1;
                this.physicalPosition = this.physicalPosition + (long)var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.refillReadBuffer(-1);
              var9_intLifetime1Lifetime1 = param2;
              if (var9_intLifetime1Lifetime1 > this.readBufferLength) {
                var9_intLifetime1Lifetime1 = this.readBufferLength;
              }
              ArrayOperations.copyBytes(this.readBuffer, 0, param3, param1, var9_intLifetime1Lifetime1);
              param1 = param1 + var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
            }
            if (this.writeBufferStart != -1L) {
              if (this.position < this.writeBufferStart &&
                0 < param2) {
                var9_intLifetime2 = param1 + (int)(this.writeBufferStart - this.position);
                if (var9_intLifetime2 > param2 + param1) {
                  var9_intLifetime2 = param2 + param1;
                }
                while (var9_intLifetime2 > param1) {
                  incrementValue$0 = param1;
                  param1++;
                  param3[incrementValue$0] = (byte) 0;
                  param2--;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.writeBufferStart &&
                var5_long + (long)var8 > this.writeBufferStart) {
                var9 = this.writeBufferStart;
              } else {
                if (this.writeBufferStart <= var5_long &&
                  this.writeBufferStart + (long)this.writeBufferLength > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (((long)this.writeBufferLength + this.writeBufferStart) > var5_long &&
                ((long)var8 + var5_long) >= (this.writeBufferStart + (long)this.writeBufferLength)) {
                var11 = this.writeBufferStart + (long)this.writeBufferLength;
              } else {
                if (this.writeBufferStart < (var5_long + (long)var8) &&
                  this.writeBufferStart + (long)this.writeBufferLength >= var5_long + (long)var8) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                ArrayOperations.copyBytes(this.writeBuffer, (int)(var9 - this.writeBufferStart), param3, var7 + (int)(-var5_long + var9), var13);
                if (this.position < var11) {
                  param2 = (int)((long)param2 - (-this.position + var11));
                  this.position = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.physicalPosition = -1L;
            throw var5;
          }
          if (param2 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    final void seek(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          if (param0 != 25971) {
            this.length(71);
          }
          this.position = param1;
          return;
        }
        throw new IOException();
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        if (param0 != 121) {
          field_j = (String) null;
        }
        field_h = null;
        field_q = null;
        field_j = null;
    }

    BufferedRandomAccessFile(BoundedRandomAccessFile param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.writeBufferLength = 0;
        this.readBufferStart = -1L;
        this.writeBufferStart = -1L;
        try {
          this.file = param0;
          dupTemp$0 = param0.length(false);
          this.physicalLength = dupTemp$0;
          this.logicalLength = dupTemp$0;
          this.writeBuffer = new byte[param2];
          this.position = 0L;
          this.readBuffer = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Visit the Account Management section on the main site to view.";
        field_n = false;
        field_j = "That name is not available";
        currentBackground = 1;
    }
}
