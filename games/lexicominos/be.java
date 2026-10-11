/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    private long field_m;
    private long field_g;
    static String field_i;
    private int field_a;
    private ea field_n;
    private long field_h;
    private byte[] field_j;
    static db[] field_b;
    private int field_c;
    static sc field_q;
    private long field_o;
    private long field_e;
    private byte[] field_p;
    static db field_d;
    private long field_k;
    static int field_l;
    static byte[][] field_f;

    private final void b(int param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        var8 = Lexicominos.field_L ? 1 : 0;
        var2 = -124 % ((param0 + 13) / 50);
        if (this.field_g != -1L) {
          if (~this.field_e != ~this.field_g) {
            this.field_n.a((byte) -55, this.field_g);
            this.field_e = this.field_g;
          }
          this.field_n.a(1, 0, this.field_p, this.field_a);
          this.field_e = this.field_e + (long)this.field_a;
          if (this.field_e > this.field_m) {
            this.field_m = this.field_e;
          }
          var3 = -1L;
          if (this.field_k <= this.field_g &&
            this.field_g < this.field_k + (long)this.field_c) {
            var3 = this.field_g;
          } else {
            if (this.field_k >= this.field_g &&
              this.field_k < (this.field_g + (long)this.field_a)) {
              var3 = this.field_k;
            }
          }
          var5 = -1L;
          if ((this.field_g + (long)this.field_a) > this.field_k &&
            (this.field_k + (long)this.field_c) >= ((long)this.field_a + this.field_g)) {
            var5 = (long)this.field_a + this.field_g;
          } else {
            if (this.field_g < (long)this.field_c + this.field_k &&
              ((long)this.field_c + this.field_k) <= (this.field_g + (long)this.field_a)) {
              var5 = (long)this.field_c + this.field_k;
            }
          }
          if (-1L < var3 &&
            var3 < var5) {
            var7 = (int)(-var3 + var5);
            o.a(this.field_p, (int)(var3 - this.field_g), this.field_j, (int)(-this.field_k + var3), var7);
          }
          this.field_a = 0;
          this.field_g = -1L;
        }
    }

    public static void b(byte param0) {
        int var1 = 3 % ((-62 - param0) / 41);
        field_i = null;
        field_b = null;
        field_q = null;
        field_f = (byte[][]) null;
        field_d = null;
    }

    final void c(int param0) throws IOException {
        this.b(126);
        this.field_n.a(true);
        if (param0 != 0) {
          this.a((byte) -30);
        }
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        this.field_c = 0;
        if (~this.field_h != ~this.field_e) {
          this.field_n.a((byte) -55, this.field_h);
          this.field_e = this.field_h;
        }
        this.field_k = this.field_h;
        while (this.field_c < this.field_j.length) {
          var2 = -this.field_c + this.field_j.length;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_n.a(var2, this.field_c, (byte) 116, this.field_j);
          if (-1 != var3) {
            this.field_e = this.field_e + (long)var3;
            this.field_c = this.field_c + var3;
            continue;
          }
          break;
        }
        if (param0 != -29960) {
          this.a((byte) -112);
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        if (param0 != 40) {
          return;
        }
        this.field_h = param1;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
          this.a(param1, param0, param0.length, -1);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "be.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -122) {
          be.b((byte) 125);
        }
        return this.field_o;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          try {
            if (param1.length < param0 + param2) {
              throw new ArrayIndexOutOfBoundsException(param2 + param0 - param1.length);
            }
            if (-1L != this.field_g &&
              this.field_h >= this.field_g &&
              this.field_h + (long)param2 <= (long)this.field_a + this.field_g) {
              o.a(this.field_p, (int)(-this.field_g + this.field_h), param1, param0, param2);
              this.field_h = this.field_h + (long)param2;
              return;
            }
            var5_long = this.field_h;
            var7 = param0;
            var8 = param2;
            if (this.field_k <= this.field_h &&
              this.field_h < ((long)this.field_c + this.field_k)) {
              var9_int = (int)((long)this.field_c + this.field_k - this.field_h);
              if (var9_int > param2) {
                var9_int = param2;
              }
              o.a(this.field_j, (int)(-this.field_k + this.field_h), param1, param0, var9_int);
              param2 = param2 - var9_int;
              this.field_h = this.field_h + (long)var9_int;
              param0 = param0 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_j.length < param2) {
              this.field_n.a((byte) -55, this.field_h);
              this.field_e = this.field_h;
              while (0 < param2) {
                var9_intLifetime1 = this.field_n.a(param2, param0, (byte) -121, param1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 - var9_intLifetime1;
                this.field_e = this.field_e + (long)var9_intLifetime1;
                this.field_h = this.field_h + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.a(-29960);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_c < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_c;
              }
              o.a(this.field_j, 0, param1, param0, var9_intLifetime1Lifetime1);
              param0 = param0 + var9_intLifetime1Lifetime1;
              this.field_h = this.field_h + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
            }
            if (this.field_g != (long)param3) {
              if (this.field_h < this.field_g &&
                0 < param2) {
                var9_intLifetime2 = param0 + (int)(-this.field_h + this.field_g);
                if (param2 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param0;
                }
                while (var9_intLifetime2 > param0) {
                  param2--;
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  this.field_h = this.field_h + 1L;
                }
              }
              var9 = -1L;
              if (this.field_g >= var5_long &&
                this.field_g < var5_long + (long)var8) {
                var9 = this.field_g;
              } else {
                if (var5_long >= this.field_g &&
                  var5_long < (this.field_g + (long)this.field_a)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < ((long)this.field_a + this.field_g) &&
                this.field_g + (long)this.field_a <= (long)var8 + var5_long) {
                var11 = this.field_g + (long)this.field_a;
              } else {
                if ((var5_long + (long)var8) > this.field_g &&
                  this.field_g + (long)this.field_a >= (long)var8 + var5_long) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                o.a(this.field_p, (int)(-this.field_g + var9), param1, (int)(var9 - var5_long) + var7, var13);
                if (this.field_h < var11) {
                  param2 = (int)((long)param2 - (-this.field_h + var11));
                  this.field_h = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
          if (param2 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("be.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          try {
            if (this.field_o < (this.field_h + (long)param2)) {
              this.field_o = (long)param2 + this.field_h;
            }
            if (param3 != -31593) {
              be.b((byte) -7);
            }
            if (this.field_g != -1L) {
              if (this.field_g <= this.field_h) {
                if ((this.field_g + (long)this.field_a) < this.field_h) {
                  this.b(65);
                }
              } else {
                this.b(65);
              }
            }
            if (this.field_g != -1L &&
              ((long)param2 + this.field_h) > ((long)this.field_p.length + this.field_g)) {
              var5_int = (int)((long)this.field_p.length + (this.field_g - this.field_h));
              o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), var5_int);
              param0 = param0 + var5_int;
              this.field_h = this.field_h + (long)var5_int;
              param2 = param2 - var5_int;
              this.field_a = this.field_p.length;
              this.b(93);
            }
            if (this.field_p.length >= param2) {
              if (param2 <= 0) {
                return;
              }
              if (this.field_g == -1L) {
                this.field_g = this.field_h;
              }
              o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), param2);
              this.field_h = this.field_h + (long)param2;
              if ((-this.field_g + this.field_h) > (long)this.field_a) {
                this.field_a = (int)(-this.field_g + this.field_h);
              }
              return;
            }
            if (~this.field_h != ~this.field_e) {
              this.field_n.a((byte) -55, this.field_h);
              this.field_e = this.field_h;
            }
            this.field_n.a(1, param0, param1, param2);
            this.field_e = this.field_e + (long)param2;
            if (this.field_m < this.field_e) {
              this.field_m = this.field_e;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_k <= this.field_h &&
              this.field_h < (this.field_k + (long)this.field_c)) {
              var5_long = this.field_h;
            } else {
              if (this.field_k >= this.field_h &&
                this.field_h + (long)param2 > this.field_k) {
                var5_long = this.field_k;
              }
            }
            if ((this.field_h + (long)param2) > this.field_k &&
              (this.field_k + (long)this.field_c) >= (this.field_h + (long)param2)) {
              var7 = (long)param2 + this.field_h;
            } else {
              if ((this.field_k + (long)this.field_c) > this.field_h &&
                (long)this.field_c + this.field_k <= (long)param2 + this.field_h) {
                var7 = (long)this.field_c + this.field_k;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              o.a(param1, (int)(-this.field_h + ((long)param0 + var5_long)), this.field_j, (int)(var5_long - this.field_k), var9);
            }
            this.field_h = this.field_h + (long)param2;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("be.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    be(ea param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = 0;
        this.field_g = -1L;
        this.field_k = -1L;
        try {
          this.field_n = param0;
          dupTemp$0 = param0.a(-45);
          this.field_m = dupTemp$0;
          this.field_o = dupTemp$0;
          this.field_h = 0L;
          this.field_j = new byte[param1];
          this.field_p = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Log in";
        field_q = new sc();
        field_d = new db(540, 140);
    }
}
