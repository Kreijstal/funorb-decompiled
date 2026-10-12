/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedFile {
    private long readBufferStart;
    private BoundedFile file;
    private long physicalLength;
    private byte[] writeBuffer;
    private long filePosition;
    private long writeBufferStart;
    private int writeBufferLength;
    static String field_a;
    private byte[] readBuffer;
    private long logicalLength;
    static String field_e;
    private long position;
    private int readBufferLength;
    static RgbSprite[] field_k;

    final static int a(long param0, long param1, byte param2) {
        if (param2 != 97) {
          field_a = (String) null;
        }
        return (int)((param0 << 16) / param1);
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 > param3) {
          return true;
        }
        if (!(ve.field_a[param0][param3] >= 0)) {
          return false;
        }
        if (param2) {
          return true;
        }
        if (param4 != -1208926000) {
          field_a = (String) null;
        }
        if (param1 < el.field_f[param0][param3]) {
          return false;
        }
        if (ve.field_a[param0][param3] < 0) {
          return false;
        }
        if (ve.field_a[param0][param3] != (param5 & ve.field_a[param0][param3])) {
          return false;
        }
        return true;
    }

    final long length(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          BufferedFile.a((byte) 77);
        }
        return this.logicalLength;
    }

    final void write(int length, int sourceOffset, byte obfuscationGuard, byte[] source) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if ((long)length + this.position > this.logicalLength) {
              this.logicalLength = (long)length + this.position;
            }
            if (this.writeBufferStart != -1L && (this.position < this.writeBufferStart ||
              (this.writeBufferStart + (long)this.writeBufferLength) < this.position)) {
              this.flush((byte) 111);
            }
            if (this.writeBufferStart != -1L &&
              this.writeBufferStart + (long)this.writeBuffer.length < this.position + (long)length) {
              var5_int = (int)(-this.position + this.writeBufferStart + (long)this.writeBuffer.length);
              vm.a(source, sourceOffset, this.writeBuffer, (int)(-this.writeBufferStart + this.position), var5_int);
              sourceOffset = sourceOffset + var5_int;
              this.position = this.position + (long)var5_int;
              length = length - var5_int;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush((byte) 111);
            }
            if (length <= this.writeBuffer.length) {
              if (0 >= length) {
                if (obfuscationGuard <= 0) {
                  BufferedFile.a((byte) -46);
                }
                return;
              }
              if (this.writeBufferStart == -1L) {
                this.writeBufferStart = this.position;
              }
              vm.a(source, sourceOffset, this.writeBuffer, (int)(-this.writeBufferStart + this.position), length);
              this.position = this.position + (long)length;
              if ((this.position - this.writeBufferStart) > (long)this.writeBufferLength) {
                this.writeBufferLength = (int)(-this.writeBufferStart + this.position);
              }
              return;
            }
            if (this.position != this.filePosition) {
              this.file.seek(this.position, 113);
              this.filePosition = this.position;
            }
            this.file.write(1, sourceOffset, length, source);
            this.filePosition = this.filePosition + (long)length;
            if (this.filePosition > this.physicalLength) {
              this.physicalLength = this.filePosition;
            }
            var5_long = -1L;
            if (this.readBufferStart <= this.position &&
              this.position < this.readBufferStart + (long)this.readBufferLength) {
              var5_long = this.position;
            } else {
              if (this.readBufferStart >= this.position &&
                this.readBufferStart < ((long)length + this.position)) {
                var5_long = this.readBufferStart;
              }
            }
            var7 = -1L;
            if ((this.position + (long)length) > this.readBufferStart &&
              (long)this.readBufferLength + this.readBufferStart >= (long)length + this.position) {
              var7 = (long)length + this.position;
            } else {
              if (this.position < (long)this.readBufferLength + this.readBufferStart &&
                (this.readBufferStart + (long)this.readBufferLength) <= ((long)length + this.position)) {
                var7 = this.readBufferStart + (long)this.readBufferLength;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              vm.a(source, (int)(-this.position + ((long)sourceOffset + var5_long)), this.readBuffer, (int)(var5_long - this.readBufferStart), var9);
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
          stackIn_51_1 = new StringBuilder().append("ue.N(").append(length).append(',').append(sourceOffset).append(',').append(obfuscationGuard).append(',');
          if (source == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static nc a(ResourceArchive param0, int param1, ResourceArchive param2, byte param3, int param4) {
        RuntimeException var5 = null;
        nc stackIn_2_0 = null;
        nc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -10) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          if (!kp.a(false, param1, param0, param4)) {
            return null;
          }
          stackIn_7_0 = lq.a(param2.getFile((byte) 103, param4, param1), 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ue.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 <= 40) {
          field_k = (RgbSprite[]) null;
        }
        field_a = null;
        field_k = null;
        field_e = null;
    }

    final void readArray(int destinationOffset, byte[] destination) throws IOException {
        try {
          this.readFully(destinationOffset, destination, (byte) -103, destination.length);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ue.E(" + destinationOffset + ',' + (destination != null ? "{...}" : "null") + ')');
        }
    }

    final void close(byte obfuscationGuard) throws IOException {
        if (obfuscationGuard != 81) {
          this.writeBufferLength = 28;
        }
        this.flush((byte) 111);
        this.file.close(obfuscationGuard + 702);
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
          BufferedFile.b((byte) 15);
        }
        return CampaignMenuEntry.a(param1, 1, param0, (byte) 58, param3);
    }

    final void readFully(int destinationOffset, byte[] destination, byte obfuscationGuard, int length) throws IOException {
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
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if (destinationOffset + length > destination.length) {
              throw new ArrayIndexOutOfBoundsException(-destination.length + destinationOffset + length);
            }
            if (this.writeBufferStart != -1L &&
              this.writeBufferStart <= this.position &&
              ((long)this.writeBufferLength + this.writeBufferStart) >= ((long)length + this.position)) {
              vm.a(this.writeBuffer, (int)(-this.writeBufferStart + this.position), destination, destinationOffset, length);
              this.position = this.position + (long)length;
              return;
            }
            var5_long = this.position;
            var7 = destinationOffset;
            var8 = length;
            if (this.position >= this.readBufferStart &&
              ((long)this.readBufferLength + this.readBufferStart) > this.position) {
              var9_int = (int)(this.readBufferStart - this.position + (long)this.readBufferLength);
              if (length < var9_int) {
                var9_int = length;
              }
              vm.a(this.readBuffer, (int)(-this.readBufferStart + this.position), destination, destinationOffset, var9_int);
              destinationOffset = destinationOffset + var9_int;
              length = length - var9_int;
              this.position = this.position + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.readBuffer.length < length) {
              this.file.seek(this.position, 112);
              this.filePosition = this.position;
              while (length > 0) {
                var9_intLifetime1 = this.file.read(length, -78, destination, destinationOffset);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.filePosition = this.filePosition + (long)var9_intLifetime1;
                destinationOffset = destinationOffset + var9_intLifetime1;
                this.position = this.position + (long)var9_intLifetime1;
                length = length - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < length)) {
              this.refillReadBuffer((byte) -42);
              var9_intLifetime1Lifetime1 = length;
              if (this.readBufferLength < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.readBufferLength;
              }
              vm.a(this.readBuffer, 0, destination, destinationOffset, var9_intLifetime1Lifetime1);
              length = length - var9_intLifetime1Lifetime1;
              destinationOffset = destinationOffset + var9_intLifetime1Lifetime1;
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
            }
            if (this.writeBufferStart != -1L) {
              if (this.writeBufferStart > this.position &&
                length > 0) {
                var9_intLifetime2 = destinationOffset + (int)(this.writeBufferStart - this.position);
                if (length + destinationOffset < var9_intLifetime2) {
                  var9_intLifetime2 = length + destinationOffset;
                }
                while (destinationOffset < var9_intLifetime2) {
                  incrementValue$0 = destinationOffset;
                  destinationOffset++;
                  destination[incrementValue$0] = (byte) 0;
                  length--;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              if (this.writeBufferStart >= var5_long &&
                (long)var8 + var5_long > this.writeBufferStart) {
                var9 = this.writeBufferStart;
              } else {
                if (this.writeBufferStart <= var5_long &&
                  var5_long < this.writeBufferStart + (long)this.writeBufferLength) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.writeBufferStart + (long)this.writeBufferLength &&
                (this.writeBufferStart + (long)this.writeBufferLength) <= (var5_long + (long)var8)) {
                var11 = (long)this.writeBufferLength + this.writeBufferStart;
              } else {
                if ((long)var8 + var5_long > this.writeBufferStart &&
                  (this.writeBufferStart + (long)this.writeBufferLength) >= ((long)var8 + var5_long)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                vm.a(this.writeBuffer, (int)(-this.writeBufferStart + var9), destination, (int)(-var5_long + var9) + var7, var13);
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
          if (length > 0) {
            throw new EOFException();
          }
          if (obfuscationGuard != -103) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("ue.O(").append(destinationOffset).append(',');
          if (destination == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(obfuscationGuard).append(',').append(length).append(')').toString());
        }
    }

    final void seek(int obfuscationGuard, long position) throws IOException {
        if (obfuscationGuard != -1) {
          return;
        }
        if (0L > position) {
          throw new IOException();
        }
        this.position = position;
    }

    private final void refillReadBuffer(byte obfuscationGuard) throws IOException {
        int var2;
        int var3;
        int var4;
        ResourceArchive var5;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.readBufferLength = 0;
        if (obfuscationGuard != -42) {
          var5 = (ResourceArchive) null;
          BufferedFile.a((ResourceArchive) null, 70, (ResourceArchive) null, (byte) -40, 15);
        }
        if (~this.filePosition != ~this.position) {
          this.file.seek(this.position, 110);
          this.filePosition = this.position;
        }
        this.readBufferStart = this.position;
        while (this.readBuffer.length > this.readBufferLength) {
          var2 = this.readBuffer.length - this.readBufferLength;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.file.read(var2, -118, this.readBuffer, this.readBufferLength);
          if (var3 != -1) {
            this.filePosition = this.filePosition + (long)var3;
            this.readBufferLength = this.readBufferLength + var3;
            continue;
          }
          break;
        }
    }

    final static void a(byte param0) {
        t.field_c = kv.k(5);
        if (param0 < 78) {
          BufferedFile.a(59, -15, 35, -65);
        }
        SphinxActionRequest.field_v = new gk();
        TutorialController.h((byte) 74);
    }

    private final void flush(byte obfuscationGuard) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 111) {
          field_k = (RgbSprite[]) null;
        }
        if (this.writeBufferStart != -1L) {
          if (~this.writeBufferStart != ~this.filePosition) {
            this.file.seek(this.writeBufferStart, 114);
            this.filePosition = this.writeBufferStart;
          }
          this.file.write(1, 0, this.writeBufferLength, this.writeBuffer);
          this.filePosition = this.filePosition + (long)this.writeBufferLength;
          if (this.filePosition > this.physicalLength) {
            this.physicalLength = this.filePosition;
          }
          var2 = -1L;
          if (this.readBufferStart <= this.writeBufferStart &&
            ((long)this.readBufferLength + this.readBufferStart) > this.writeBufferStart) {
            var2 = this.writeBufferStart;
          } else {
            if (this.readBufferStart >= this.writeBufferStart &&
              this.writeBufferStart + (long)this.writeBufferLength > this.readBufferStart) {
              var2 = this.readBufferStart;
            }
          }
          var4 = -1L;
          if (this.readBufferStart < ((long)this.writeBufferLength + this.writeBufferStart) &&
            this.readBufferStart + (long)this.readBufferLength >= (long)this.writeBufferLength + this.writeBufferStart) {
            var4 = (long)this.writeBufferLength + this.writeBufferStart;
          } else {
            if (this.writeBufferStart < ((long)this.readBufferLength + this.readBufferStart) &&
              (this.writeBufferStart + (long)this.writeBufferLength) >= ((long)this.readBufferLength + this.readBufferStart)) {
              var4 = this.readBufferStart + (long)this.readBufferLength;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            vm.a(this.writeBuffer, (int)(-this.writeBufferStart + var2), this.readBuffer, (int)(var2 - this.readBufferStart), var6);
          }
          this.writeBufferStart = -1L;
          this.writeBufferLength = 0;
        }
    }

    BufferedFile(BoundedFile file, int readBufferSize, int writeBufferSize) throws IOException {
        long dupTemp$0 = 0L;
        this.writeBufferStart = -1L;
        this.readBufferStart = -1L;
        this.writeBufferLength = 0;
        try {
          this.file = file;
          dupTemp$0 = file.length(true);
          this.physicalLength = dupTemp$0;
          this.logicalLength = dupTemp$0;
          this.readBuffer = new byte[readBufferSize];
          this.writeBuffer = new byte[writeBufferSize];
          this.position = 0L;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ue.<init>(" + (file != null ? "{...}" : "null") + ',' + readBufferSize + ',' + writeBufferSize + ')');
        }
    }

    static {
        field_e = "The '<%0>' setting needs to be changed.";
    }
}
