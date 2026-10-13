/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedFile {
    static long shutdownDeadlineMillis;
    private byte[] writeBuffer;
    private long physicalLength;
    static String field_p;
    static RgbSprite field_a;
    private long length;
    private long position;
    private long readBufferStart;
    private long writeBufferStart;
    static ResourceArchive field_d;
    private long filePosition;
    static String field_q;
    private byte[] readBuffer;
    private int writeBufferLength;
    private BoundedFile file;
    private int readBufferLength;
    static byte[] field_c;

    final void seek(int minimumPosition, long position) throws IOException {
        if (position < (long)minimumPosition) {
          throw new IOException();
        }
        this.position = position;
    }

    final static boolean b(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_7_0 = (null != sq.field_c) || (TooltipSprite.field_p);
        return stackIn_7_0;
    }

    private final void refillReadBuffer(int obfuscationGuard) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard == 200000000) {
          this.readBufferLength = 0;
          if (this.filePosition != this.position) {
            this.file.seek(-58, this.position);
            this.filePosition = this.position;
          }
          this.readBufferStart = this.position;
          while (this.readBufferLength < this.readBuffer.length) {
            var2 = this.readBuffer.length - this.readBufferLength;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.file.read(this.readBufferLength, this.readBuffer, var2, (byte) 123);
            if (var3 == -1) {
              break;
            }
            this.readBufferLength = this.readBufferLength + var3;
            this.filePosition = this.filePosition + (long)var3;
          }
          return;
        }
    }

    final void readFully(int length, int offset, int obfuscationGuard, byte[] data) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        Throwable decompiledCaughtException = null;
        long readStart = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int targetStart = 0;
        int requestedLength = 0;
        int cachedReadCount = 0;
        long overlapStart = 0L;
        long overlapEnd = 0L;
        int overlapLength = 0;
        int clientBranchFlag = 0;
        PowerUpWarning var15 = null;
        int directReadCount;
        int gapEndOffset;
        int refillReadCount;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (data.length < length + offset) {
              throw new ArrayIndexOutOfBoundsException(length + offset - data.length);
            }
            if (this.writeBufferStart != -1L &&
              this.position >= this.writeBufferStart &&
              (long)this.writeBufferLength + this.writeBufferStart >= this.position + (long)length) {
              pm.a(this.writeBuffer, (int)(this.position - this.writeBufferStart), data, offset, length);
              this.position = this.position + (long)length;
              return;
            }
            if (obfuscationGuard <= 116) {
              var15 = (PowerUpWarning) null;
              BufferedFile.drawPowerUpWarning(36, (PlayerBoard) null, (PowerUpWarning) null, -113, -57, 112);
            }
            readStart = this.position;
            targetStart = offset;
            requestedLength = length;
            if (this.position >= this.readBufferStart &&
              this.position < this.readBufferStart + (long)this.readBufferLength) {
              cachedReadCount = (int)((long)this.readBufferLength + (this.readBufferStart - this.position));
              if (cachedReadCount > length) {
                cachedReadCount = length;
              }
              pm.a(this.readBuffer, (int)(this.position - this.readBufferStart), data, offset, cachedReadCount);
              this.position = this.position + (long)cachedReadCount;
              offset = offset + cachedReadCount;
              length = length - cachedReadCount;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.readBuffer.length < length) {
              this.file.seek(-18, this.position);
              this.filePosition = this.position;
              while (length > 0) {
                directReadCount = this.file.read(offset, data, length, (byte) 120);
                if (directReadCount == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.filePosition = this.filePosition + (long)directReadCount;
                length = length - directReadCount;
                this.position = this.position + (long)directReadCount;
                offset = offset + directReadCount;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (length > 0)) {
              this.refillReadBuffer(200000000);
              refillReadCount = length;
              if (refillReadCount > this.readBufferLength) {
                refillReadCount = this.readBufferLength;
              }
              pm.a(this.readBuffer, 0, data, offset, refillReadCount);
              length = length - refillReadCount;
              offset = offset + refillReadCount;
              this.position = this.position + (long)refillReadCount;
            }
            if (this.writeBufferStart != -1L) {
              if (this.writeBufferStart > this.position &&
                length > 0) {
                gapEndOffset = (int)(-this.position + this.writeBufferStart) + offset;
                if (gapEndOffset > length + offset) {
                  gapEndOffset = offset + length;
                }
                while (offset < gapEndOffset) {
                  incrementValue$0 = offset;
                  offset++;
                  data[incrementValue$0] = (byte) 0;
                  length--;
                  this.position = this.position + 1L;
                }
              }
              overlapStart = -1L;
              overlapEnd = -1L;
              if (readStart <= this.writeBufferStart &&
                this.writeBufferStart < readStart + (long)requestedLength) {
                overlapStart = this.writeBufferStart;
              } else {
                if (this.writeBufferStart <= readStart &&
                  readStart < (long)this.writeBufferLength + this.writeBufferStart) {
                  overlapStart = readStart;
                }
              }
              if (((long)this.writeBufferLength + this.writeBufferStart) > readStart &&
                (readStart + (long)requestedLength) >= ((long)this.writeBufferLength + this.writeBufferStart)) {
                overlapEnd = this.writeBufferStart + (long)this.writeBufferLength;
              } else {
                if (this.writeBufferStart < ((long)requestedLength + readStart) &&
                  (long)this.writeBufferLength + this.writeBufferStart >= (long)requestedLength + readStart) {
                  overlapEnd = (long)requestedLength + readStart;
                }
              }
              if (-1L < overlapStart &&
                overlapEnd > overlapStart) {
                overlapLength = (int)(-overlapStart + overlapEnd);
                pm.a(this.writeBuffer, (int)(overlapStart - this.writeBufferStart), data, targetStart + (int)(overlapStart - readStart), overlapLength);
                if (overlapEnd > this.position) {
                  length = (int)((long)length - (overlapEnd - this.position));
                  this.position = overlapEnd;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
          if (length > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("jg.D(").append(length).append(',').append(offset).append(',').append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void flush(int obfuscationGuard) throws IOException {
        long overlapStart;
        long overlapEnd;
        int overlapLength;
        int clientBranchFlag;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        if (this.writeBufferStart != (long)obfuscationGuard) {
          if (this.filePosition != this.writeBufferStart) {
            this.file.seek(-19, this.writeBufferStart);
            this.filePosition = this.writeBufferStart;
          }
          this.file.write(0, (byte) -125, this.writeBuffer, this.writeBufferLength);
          this.filePosition = this.filePosition + (long)this.writeBufferLength;
          if (this.filePosition > this.physicalLength) {
            this.physicalLength = this.filePosition;
          }
          overlapStart = -1L;
          overlapEnd = -1L;
          if (this.writeBufferStart >= this.readBufferStart &&
            this.writeBufferStart < ((long)this.readBufferLength + this.readBufferStart)) {
            overlapStart = this.writeBufferStart;
          } else {
            if (this.writeBufferStart <= this.readBufferStart &&
              this.readBufferStart < (long)this.writeBufferLength + this.writeBufferStart) {
              overlapStart = this.readBufferStart;
            }
          }
          if (this.writeBufferStart + (long)this.writeBufferLength > this.readBufferStart &&
            (long)this.readBufferLength + this.readBufferStart >= this.writeBufferStart + (long)this.writeBufferLength) {
            overlapEnd = this.writeBufferStart + (long)this.writeBufferLength;
          } else {
            if (this.writeBufferStart < (long)this.readBufferLength + this.readBufferStart &&
              this.readBufferStart + (long)this.readBufferLength <= this.writeBufferStart + (long)this.writeBufferLength) {
              overlapEnd = (long)this.readBufferLength + this.readBufferStart;
            }
          }
          if (overlapStart > -1L &&
            overlapEnd > overlapStart) {
            overlapLength = (int)(-overlapStart + overlapEnd);
            pm.a(this.writeBuffer, (int)(-this.writeBufferStart + overlapStart), this.readBuffer, (int)(overlapStart - this.readBufferStart), overlapLength);
          }
          this.writeBufferLength = 0;
          this.writeBufferStart = -1L;
        }
    }

    final void readFully(byte[] data, byte obfuscationGuard) throws IOException {
        try {
          if (obfuscationGuard != -29) {
            this.writeBufferStart = -84L;
          }
          this.readFully(data.length, 0, 127, data);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jg.J(" + (data != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 27 % ((62 - param0) / 62);
        field_q = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_p = null;
    }

    final void write(byte[] data, int offset, int length, int obfuscationGuard) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int bufferedCount = 0;
        long overlapStart = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long overlapEnd = 0L;
        int overlapLength = 0;
        int clientBranchFlag = 0;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (this.length < (this.position + (long)length)) {
              this.length = this.position + (long)length;
            }
            if (this.writeBufferStart != (long)obfuscationGuard && (this.position < this.writeBufferStart ||
              this.position > (long)this.writeBufferLength + this.writeBufferStart)) {
              this.flush(obfuscationGuard ^ 0);
            }
            if (-1L != this.writeBufferStart &&
              ((long)this.writeBuffer.length + this.writeBufferStart) < (this.position + (long)length)) {
              bufferedCount = (int)(-this.position + this.writeBufferStart + (long)this.writeBuffer.length);
              pm.a(data, offset, this.writeBuffer, (int)(this.position - this.writeBufferStart), bufferedCount);
              length = length - bufferedCount;
              this.position = this.position + (long)bufferedCount;
              offset = offset + bufferedCount;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush(obfuscationGuard ^ 0);
            }
            if (length <= this.writeBuffer.length) {
              if (length <= 0) {
                return;
              }
              if (this.writeBufferStart == -1L) {
                this.writeBufferStart = this.position;
              }
              pm.a(data, offset, this.writeBuffer, (int)(this.position - this.writeBufferStart), length);
              this.position = this.position + (long)length;
              if ((long)this.writeBufferLength < this.position - this.writeBufferStart) {
                this.writeBufferLength = (int)(this.position - this.writeBufferStart);
              }
              return;
            }
            if (~this.position != ~this.filePosition) {
              this.file.seek(-98, this.position);
              this.filePosition = this.position;
            }
            this.file.write(offset, (byte) -125, data, length);
            this.filePosition = this.filePosition + (long)length;
            if (this.filePosition > this.physicalLength) {
              this.physicalLength = this.filePosition;
            }
            overlapStart = -1L;
            overlapEnd = -1L;
            if (this.position >= this.readBufferStart &&
              this.readBufferStart + (long)this.readBufferLength > this.position) {
              overlapStart = this.position;
            } else {
              if (this.readBufferStart >= this.position &&
                this.position + (long)length > this.readBufferStart) {
                overlapStart = this.readBufferStart;
              }
            }
            if ((this.position + (long)length) > this.readBufferStart &&
              (this.position + (long)length) <= (this.readBufferStart + (long)this.readBufferLength)) {
              overlapEnd = (long)length + this.position;
            } else {
              if ((this.readBufferStart + (long)this.readBufferLength) > this.position &&
                this.readBufferStart + (long)this.readBufferLength <= this.position + (long)length) {
                overlapEnd = (long)this.readBufferLength + this.readBufferStart;
              }
            }
            if (-1L < overlapStart &&
              overlapStart < overlapEnd) {
              overlapLength = (int)(overlapEnd - overlapStart);
              pm.a(data, (int)(overlapStart + ((long)offset - this.position)), this.readBuffer, (int)(-this.readBufferStart + overlapStart), overlapLength);
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
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("jg.E(");
          if (data == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(offset).append(',').append(length).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void close(boolean obfuscationGuard) throws IOException {
        this.flush(-1);
        if (obfuscationGuard) {
          this.length((byte) -68);
        }
        this.file.close(-100);
    }

    final long length(byte obfuscationGuard) {
        if (obfuscationGuard <= 20) {
          field_d = (ResourceArchive) null;
        }
        return this.length;
    }

    BufferedFile(BoundedFile file, int readBufferSize, int writeBufferSize) throws IOException {
        long dupTemp$0 = 0L;
        this.writeBufferStart = -1L;
        this.readBufferStart = -1L;
        this.writeBufferLength = 0;
        try {
          this.file = file;
          dupTemp$0 = file.length(-122);
          this.physicalLength = dupTemp$0;
          this.length = dupTemp$0;
          this.readBuffer = new byte[readBufferSize];
          this.writeBuffer = new byte[writeBufferSize];
          this.position = 0L;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "jg.<init>(" + (file != null ? "{...}" : "null") + ',' + readBufferSize + ',' + writeBufferSize + ')');
        }
    }

    final static void drawPowerUpWarning(int destinationX, PlayerBoard board, PowerUpWarning warning, int scaleDivisor, int entryTicks, int destinationY) {
        int var6_int = 0;
        int var7 = 0;
        RgbSprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = board.boardWidth / (scaleDivisor << 1) + destinationX;
          var7 = board.field_wb / (scaleDivisor << 1) + board.field_wb / (scaleDivisor << 3) + destinationY;
          var8 = gg.field_p[warning.typeId];
          var9 = 96;
          var10 = 512;
          if (warning.ageTicks < entryTicks) {
            var10 = (warning.ageTicks << 9) / 25;
            var7 = var7 + (-warning.ageTicks + 25 << 2) / scaleDivisor;
            var9Lifetime1 = (warning.ageTicks << 7) / 25;
          } else {
            if (50 <= warning.ageTicks) {
              var9Lifetime1 = (75 - warning.ageTicks << 7) / 25;
              var10 = (75 - warning.ageTicks << 9) / 25;
              var7 = var7 - (warning.ageTicks - 50 << 2) / scaleDivisor;
            } else {
              var9Lifetime1 = 128;
            }
          }
          var11 = (var10 * var8.width >> 7) / scaleDivisor;
          var12 = (var10 * var8.height >> 7) / scaleDivisor;
          var8.b(-(var11 >> 1) + var6_int, var7 - (var12 >> 1), var11, var12, var9Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jg.B(").append(destinationX).append(',');
          if (board == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (warning == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(scaleDivisor).append(',').append(entryTicks).append(',').append(destinationY).append(')').toString());
        }
    }

    static {
        shutdownDeadlineMillis = 0L;
        field_q = "OFF";
        field_p = "Drawn";
    }
}
