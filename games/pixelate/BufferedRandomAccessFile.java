/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedRandomAccessFile {
    private long field_g;
    private long physicalLength;
    private long filePosition;
    static ValidationState field_b;
    private byte[] readBuffer;
    private int writeBufferLength;
    private byte[] writeBuffer;
    private long field_f;
    private BoundedRandomAccessFile file;
    private long field_o;
    private long position;
    private int readLength;
    static int field_i;
    static int field_j;
    static String field_d;
    static sb field_m;
    static int field_a;

    final void write(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          try {
            if (this.position + (long)param0 > this.field_o) {
              this.field_o = this.position + (long)param0;
            }
            if (this.field_g != -1L) {
              if (this.field_g <= this.position) {
                if (this.position > (this.field_g + (long)this.writeBufferLength)) {
                  this.flush((byte) 28);
                }
              } else {
                this.flush((byte) 28);
              }
            }
            if (this.field_g != -1L &&
              ((long)param0 + this.position) > (this.field_g + (long)this.writeBuffer.length)) {
              var5_int = (int)((long)this.writeBuffer.length + (this.field_g - this.position));
              ArraySupport.a(param3, param1, this.writeBuffer, (int)(this.position - this.field_g), var5_int);
              param1 = param1 + var5_int;
              param0 = param0 - var5_int;
              this.position = this.position + (long)var5_int;
              this.writeBufferLength = this.writeBuffer.length;
              this.flush((byte) 28);
            }
            if (this.writeBuffer.length >= param0) {
              if (param2 > -67) {
                return;
              }
              if (param0 <= 0) {
                return;
              }
              if (-1L == this.field_g) {
                this.field_g = this.position;
              }
              ArraySupport.a(param3, param1, this.writeBuffer, (int)(this.position - this.field_g), param0);
              this.position = this.position + (long)param0;
              if (-this.field_g + this.position > (long)this.writeBufferLength) {
                this.writeBufferLength = (int)(-this.field_g + this.position);
              }
              return;
            }
            if (~this.filePosition != ~this.position) {
              this.file.seek(false, this.position);
              this.filePosition = this.position;
            }
            this.file.a(param0, param3, param1, -80);
            this.filePosition = this.filePosition + (long)param0;
            if (this.filePosition > this.physicalLength) {
              this.physicalLength = this.filePosition;
            }
            var5_long = -1L;
            if (this.position >= this.field_f &&
              this.position < (long)this.readLength + this.field_f) {
              var5_long = this.position;
            } else {
              if (this.field_f >= this.position &&
                this.field_f < ((long)param0 + this.position)) {
                var5_long = this.field_f;
              }
            }
            var7 = -1L;
            if (this.field_f < (this.position + (long)param0) &&
              ((long)param0 + this.position) <= (this.field_f + (long)this.readLength)) {
              var7 = this.position + (long)param0;
            } else {
              if (((long)this.readLength + this.field_f) > this.position &&
                (this.position + (long)param0) >= (this.field_f + (long)this.readLength)) {
                var7 = (long)this.readLength + this.field_f;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              ArraySupport.a(param3, (int)((long)param1 + var5_long - this.position), this.readBuffer, (int)(var5_long - this.field_f), var9);
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
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("uo.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final void readFully(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
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
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          try {
            if (param0.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
            }
            if (this.field_g != -1L &&
              this.field_g <= this.position &&
              ((long)param2 + this.position) <= ((long)this.writeBufferLength + this.field_g)) {
              ArraySupport.a(this.writeBuffer, (int)(-this.field_g + this.position), param0, param3, param2);
              this.position = this.position + (long)param2;
              return;
            }
            var5_long = this.position;
            var7 = param3;
            var8 = param2;
            if (this.position >= this.field_f &&
              this.position < this.field_f + (long)this.readLength) {
              var9_int = (int)((long)this.readLength - (this.position - this.field_f));
              if (var9_int > param2) {
                var9_int = param2;
              }
              ArraySupport.a(this.readBuffer, (int)(this.position - this.field_f), param0, param3, var9_int);
              param3 = param3 + var9_int;
              this.position = this.position + (long)var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.readBuffer.length < param2) {
              this.file.seek(false, this.position);
              this.filePosition = this.position;
              while (param2 > 0) {
                var9_intLifetime1 = this.file.read(false, param3, param2, param0);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.position = this.position + (long)var9_intLifetime1;
                param3 = param3 + var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
                this.filePosition = this.filePosition + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param2)) {
              this.fillReadBuffer(200000000);
              var9_intLifetime1Lifetime1 = param2;
              if (this.readLength < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.readLength;
              }
              ArraySupport.a(this.readBuffer, 0, param0, param3, var9_intLifetime1Lifetime1);
              param3 = param3 + var9_intLifetime1Lifetime1;
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
            }
            if (param1 != 24) {
              return;
            }
            if (this.field_g != -1L) {
              if (this.position < this.field_g &&
                0 < param2) {
                var9_intLifetime2 = param3 + (int)(this.field_g - this.position);
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param3 + param2;
                }
                while (param3 < var9_intLifetime2) {
                  param2--;
                  incrementValue$0 = param3;
                  param3++;
                  param0[incrementValue$0] = (byte) 0;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              if (this.field_g >= var5_long &&
                this.field_g < ((long)var8 + var5_long)) {
                var9 = this.field_g;
              } else {
                if (this.field_g <= var5_long &&
                  var5_long < (this.field_g + (long)this.writeBufferLength)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.field_g + (long)this.writeBufferLength &&
                ((long)this.writeBufferLength + this.field_g) <= (var5_long + (long)var8)) {
                var11 = (long)this.writeBufferLength + this.field_g;
              } else {
                if (var5_long + (long)var8 > this.field_g &&
                  (long)var8 + var5_long <= this.field_g + (long)this.writeBufferLength) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                ArraySupport.a(this.writeBuffer, (int)(-this.field_g + var9), param0, (int)(-var5_long + var9) + var7, var13);
                if (var11 > this.position) {
                  param2 = (int)((long)param2 - (-this.position + var11));
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
          if (0 >= param2) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var5_ref;
          stackIn_65_1 = new StringBuilder().append("uo.F(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          String var3 = (String) null;
          BufferedRandomAccessFile.a(-117, (String) null);
        }
        this.flush((byte) 28);
        this.file.b(-5317);
    }

    final long length(int param0) {
        if (param0 < 38) {
          this.readBuffer = (byte[]) null;
        }
        return this.field_o;
    }

    public static void b(int param0) {
        field_m = null;
        int var1 = 19 / ((35 - param0) / 50);
        field_d = null;
        field_b = null;
    }

    final static el a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        el stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -58) {
            field_a = 111;
          }
          var2_int = param1.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              stackIn_12_0 = DiskCacheWorker.field_f;
              return stackIn_12_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_9_0 = null;
          return (el) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("uo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = 32 / ((param1 - 60) / 35);
        if (param0 < 0L) {
          throw new IOException();
        }
        this.position = param0;
    }

    private final void flush(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        if (this.field_g != -1L) {
          if (this.field_g != this.filePosition) {
            this.file.seek(false, this.field_g);
            this.filePosition = this.field_g;
          }
          this.file.a(this.writeBufferLength, this.writeBuffer, 0, -120);
          this.filePosition = this.filePosition + (long)this.writeBufferLength;
          if (this.physicalLength < this.filePosition) {
            this.physicalLength = this.filePosition;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_g >= this.field_f &&
            this.field_g < (this.field_f + (long)this.readLength)) {
            var2 = this.field_g;
          } else {
            if (this.field_g <= this.field_f &&
              this.field_f < (long)this.writeBufferLength + this.field_g) {
              var2 = this.field_f;
            }
          }
          if (this.field_f < (long)this.writeBufferLength + this.field_g &&
            (this.field_f + (long)this.readLength) >= (this.field_g + (long)this.writeBufferLength)) {
            var4 = (long)this.writeBufferLength + this.field_g;
          } else {
            if (this.field_g < ((long)this.readLength + this.field_f) &&
              this.field_g + (long)this.writeBufferLength >= this.field_f + (long)this.readLength) {
              var4 = this.field_f + (long)this.readLength;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            ArraySupport.a(this.writeBuffer, (int)(var2 - this.field_g), this.readBuffer, (int)(-this.field_f + var2), var6);
          }
          this.writeBufferLength = 0;
          this.field_g = -1L;
        }
        if (param0 != 28) {
          BufferedRandomAccessFile.b(9);
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.readFully(param0, (byte) 24, param0.length, 0);
          if (param1 != 0) {
            BufferedRandomAccessFile.b(-16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("uo.J(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void fillReadBuffer(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.readLength = 0;
        if (~this.position != ~this.filePosition) {
          this.file.seek(false, this.position);
          this.filePosition = this.position;
        }
        if (param0 != 200000000) {
          BufferedRandomAccessFile.b(1);
        }
        this.field_f = this.position;
        while (this.readLength < this.readBuffer.length) {
          var2 = this.readBuffer.length - this.readLength;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.file.read(false, this.readLength, var2, this.readBuffer);
          if (var3 == -1) {
            break;
          }
          this.readLength = this.readLength + var3;
          this.filePosition = this.filePosition + (long)var3;
        }
    }

    BufferedRandomAccessFile(BoundedRandomAccessFile param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_f = -1L;
        this.writeBufferLength = 0;
        try {
          this.file = param0;
          dupTemp$0 = param0.b((byte) -25);
          this.physicalLength = dupTemp$0;
          this.field_o = dupTemp$0;
          this.writeBuffer = new byte[param2];
          this.readBuffer = new byte[param1];
          this.position = 0L;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(boolean param0) {
        he.field_f = null;
        if (param0) {
          BufferedRandomAccessFile.b(-78);
        }
    }

    static {
        field_b = new ValidationState();
        field_a = 0;
        field_d = "Hide lobby chat";
    }
}
