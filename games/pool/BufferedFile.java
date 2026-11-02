/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedFile {
    private long position;
    private long field_j;
    static String[][] field_p;
    private int field_o;
    private byte[] field_k;
    private long field_d;
    private long field_e;
    private long field_m;
    static int field_n;
    static int field_h;
    static String field_b;
    private long field_g;
    static String pleasetryagain;
    static vh field_a;
    private v file;
    private byte[] field_c;
    private int field_q;

    final void write(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = Pool.field_O;
        try {
          try {
            if (this.field_e < this.position + (long)param0) {
              this.field_e = this.position + (long)param0;
            }
            if (this.field_j != -1L && (this.position < this.field_j ||
              this.position > (this.field_j + (long)this.field_q))) {
              this.flush(false);
            }
            if (-1L != this.field_j &&
              ((long)this.field_k.length + this.field_j) < (this.position + (long)param0)) {
              var5_int = (int)(-this.position - (-this.field_j - (long)this.field_k.length));
              ArrayOperations.copy(param1, param2, this.field_k, (int)(this.position - this.field_j), var5_int);
              param0 = param0 - var5_int;
              this.position = this.position + (long)var5_int;
              param2 = param2 + var5_int;
              this.field_q = this.field_k.length;
              this.flush(false);
            }
            if (this.field_k.length >= param0) {
              if (~param0 >= param3) {
                return;
              }
              if (this.field_j == -1L) {
                this.field_j = this.position;
              }
              ArrayOperations.copy(param1, param2, this.field_k, (int)(-this.field_j + this.position), param0);
              this.position = this.position + (long)param0;
              if ((long)this.field_q < (this.position - this.field_j)) {
                this.field_q = (int)(this.position - this.field_j);
              }
              return;
            }
            if (this.position != this.field_g) {
              this.file.a(-1, this.position);
              this.field_g = this.position;
            }
            this.file.a(param2, 25354, param0, param1);
            this.field_g = this.field_g + (long)param0;
            if (this.field_g > this.field_m) {
              this.field_m = this.field_g;
            }
            var5_long = -1L;
            if (this.field_d <= this.position &&
              ((long)this.field_o + this.field_d) > this.position) {
              var5_long = this.position;
            } else {
              if (this.position <= this.field_d &&
                (this.position + (long)param0) > this.field_d) {
                var5_long = this.field_d;
              }
            }
            var7 = -1L;
            if (this.field_d < (this.position + (long)param0) &&
              ((long)param0 + this.position) <= (this.field_d + (long)this.field_o)) {
              var7 = (long)param0 + this.position;
            } else {
              if (((long)this.field_o + this.field_d) > this.position &&
                this.position + (long)param0 >= this.field_d + (long)this.field_o) {
                var7 = this.field_d + (long)this.field_o;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              ArrayOperations.copy(param1, (int)((long)param2 + (var5_long - this.position)), this.field_c, (int)(-this.field_d + var5_long), var9);
            }
            this.position = this.position + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("ir.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void close(byte param0) throws IOException {
        this.flush(false);
        this.file.c((byte) 101);
        if (param0 <= 34) {
          BufferedFile.a((byte) -96);
        }
    }

    private final void refillReadBuffer(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pool.field_O;
        this.field_o = 0;
        if (param0 != -28) {
          this.length((byte) 81);
        }
        if (this.position != this.field_g) {
          this.file.a(-1, this.position);
          this.field_g = this.position;
        }
        this.field_d = this.position;
        while (this.field_o < this.field_c.length) {
          var2 = -this.field_o + this.field_c.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.file.a(this.field_c, 20859, var2, this.field_o);
          if (var3 == -1) {
            break;
          }
          this.field_o = this.field_o + var3;
          this.field_g = this.field_g + (long)var3;
        }
    }

    final void seek(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        if (param0 != 0) {
          return;
        }
        this.position = param1;
    }

    final static double[][] a(int param0, double[] param1) {
        RuntimeException var2 = null;
        double[][] stackIn_2_0 = null;
        double[][] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -90) {
            stackIn_4_0 = new double[][]{param1, new double[]{576.0 - param1[0], -param1[1] + 288.0, param1[2], -param1[3] + 576.0, 288.0 - param1[4], param1[5]}};
            return stackIn_4_0;
          }
          stackIn_2_0 = (double[][]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ir.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void readFully(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
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
        var14 = Pool.field_O;
        try {
          try {
            if (param1 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
            }
            if (this.field_j != -1L &&
              this.field_j <= this.position &&
              ((long)param1 + this.position) <= ((long)this.field_q + this.field_j)) {
              ArrayOperations.copy(this.field_k, (int)(-this.field_j + this.position), param3, param2, param1);
              this.position = this.position + (long)param1;
              return;
            }
            var5_long = this.position;
            var7 = param2;
            var8 = param1;
            if (this.field_d <= this.position &&
              (this.field_d + (long)this.field_o) > this.position) {
              var9_int = (int)((long)this.field_o - (-this.field_d + this.position));
              if (var9_int > param1) {
                var9_int = param1;
              }
              ArrayOperations.copy(this.field_c, (int)(-this.field_d + this.position), param3, param2, var9_int);
              param2 = param2 + var9_int;
              param1 = param1 - var9_int;
              this.position = this.position + (long)var9_int;
            }
            if (param0 >= -109) {
              this.length((byte) 60);
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_c.length < param1) {
              this.file.a(-1, this.position);
              this.field_g = this.position;
              while (param1 > 0) {
                var9_intLifetime1 = this.file.a(param3, 20859, param1, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.position = this.position + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param1)) {
              this.refillReadBuffer((byte) -28);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_o) {
                var9_intLifetime1Lifetime1 = this.field_o;
              }
              ArrayOperations.copy(this.field_c, 0, param3, param2, var9_intLifetime1Lifetime1);
              param1 = param1 - var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_j) {
              if (this.field_j > this.position &&
                param1 > 0) {
                var9_intLifetime2 = (int)(-this.position + this.field_j) + param2;
                if (var9_intLifetime2 > param1 + param2) {
                  var9_intLifetime2 = param1 + param2;
                }
                while (param2 < var9_intLifetime2) {
                  incrementValue$0 = param2;
                  param2++;
                  param3[incrementValue$0] = (byte) 0;
                  param1--;
                  this.position = this.position + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_j &&
                (long)var8 + var5_long > this.field_j) {
                var9 = this.field_j;
              } else {
                if (var5_long >= this.field_j &&
                  (long)this.field_q + this.field_j > var5_long) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (long)this.field_q + this.field_j &&
                (var5_long + (long)var8) >= (this.field_j + (long)this.field_q)) {
                var11 = this.field_j + (long)this.field_q;
              } else {
                if (var5_long + (long)var8 > this.field_j &&
                  ((long)this.field_q + this.field_j) >= ((long)var8 + var5_long)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                ArrayOperations.copy(this.field_k, (int)(-this.field_j + var9), param3, var7 + (int)(-var5_long + var9), var13);
                if (this.position < var11) {
                  param1 = (int)((long)param1 - (var11 - this.position));
                  this.position = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
          if (param1 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_56_0 = var5_ref;
          stackIn_56_1 = new StringBuilder().append("ir.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        pleasetryagain = null;
        field_a = null;
        int var1 = -55 / ((62 - param0) / 40);
        field_p = (String[][]) null;
        field_b = null;
    }

    final long length(byte param0) {
        if (param0 != 17) {
          double[] var3 = (double[]) null;
          BufferedFile.a(54, (double[]) null);
        }
        return this.field_e;
    }

    final void readFully(int param0, byte[] param1) throws IOException {
        try {
          if (param0 < 65) {
            this.field_e = 36L;
          }
          this.readFully((byte) -126, param1.length, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ir.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void flush(boolean param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Pool.field_O;
        if (this.field_j != -1L) {
          if (~this.field_j != ~this.field_g) {
            this.file.a(-1, this.field_j);
            this.field_g = this.field_j;
          }
          this.file.a(0, 25354, this.field_q, this.field_k);
          this.field_g = this.field_g + (long)this.field_q;
          if (this.field_m < this.field_g) {
            this.field_m = this.field_g;
          }
          var2 = -1L;
          if (this.field_d <= this.field_j &&
            this.field_j < this.field_d + (long)this.field_o) {
            var2 = this.field_j;
          } else {
            if (this.field_j <= this.field_d &&
              this.field_d < ((long)this.field_q + this.field_j)) {
              var2 = this.field_d;
            }
          }
          var4 = -1L;
          if (this.field_d < ((long)this.field_q + this.field_j) &&
            (long)this.field_q + this.field_j <= this.field_d + (long)this.field_o) {
            var4 = (long)this.field_q + this.field_j;
          } else {
            if (((long)this.field_o + this.field_d) > this.field_j &&
              this.field_j + (long)this.field_q >= (long)this.field_o + this.field_d) {
              var4 = this.field_d + (long)this.field_o;
            }
          }
          if (-1L < var2 &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            ArrayOperations.copy(this.field_k, (int)(var2 - this.field_j), this.field_c, (int)(var2 - this.field_d), var6);
          }
          this.field_q = 0;
          this.field_j = -1L;
        }
        if (param0) {
          BufferedFile.a((byte) 126);
        }
    }

    BufferedFile(v param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_j = -1L;
        this.field_d = -1L;
        this.field_q = 0;
        try {
          this.file = param0;
          dupTemp$0 = param0.a(false);
          this.field_m = dupTemp$0;
          this.field_e = dupTemp$0;
          this.position = 0L;
          this.field_c = new byte[param1];
          this.field_k = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ir.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = 20;
        pleasetryagain = "Please try again in a few minutes.";
    }
}
