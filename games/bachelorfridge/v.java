/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    private long field_c;
    private long field_b;
    private byte[] field_h;
    private long field_l;
    private long field_i;
    private long field_g;
    private qaa field_k;
    private int field_j;
    private int field_f;
    private long field_e;
    static ht field_d;
    private byte[] field_a;

    final static void a(byte param0) {
        if (gm.field_k) {
          dg.g(dg.field_f, dg.field_j, dg.field_h - dg.field_f, -dg.field_j + dg.field_k);
          fo.field_a.a(false, 7802);
        }
        if (param0 != -50) {
          field_d = (ht) null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var10 = BachelorFridge.field_y;
        try {
          try {
            if ((long)param3 + this.field_g > this.field_i) {
              this.field_i = this.field_g + (long)param3;
            }
            if (-1L != this.field_e) {
              if (this.field_e <= this.field_g) {
                if (this.field_g > (long)this.field_j + this.field_e) {
                  this.b((byte) 50);
                }
              } else {
                this.b((byte) 50);
              }
            }
            if (param0 >= -52) {
              this.b(-4);
            }
            if (this.field_e != -1L &&
              (this.field_e + (long)this.field_a.length) < (this.field_g + (long)param3)) {
              var5_int = (int)(-this.field_g + this.field_e + (long)this.field_a.length);
              bl.a(param2, param1, this.field_a, (int)(-this.field_e + this.field_g), var5_int);
              param3 = param3 - var5_int;
              this.field_g = this.field_g + (long)var5_int;
              param1 = param1 + var5_int;
              this.field_j = this.field_a.length;
              this.b((byte) 50);
            }
            if (param3 <= this.field_a.length) {
              if (0 >= param3) {
                return;
              }
              if (this.field_e == -1L) {
                this.field_e = this.field_g;
              }
              bl.a(param2, param1, this.field_a, (int)(this.field_g - this.field_e), param3);
              this.field_g = this.field_g + (long)param3;
              if ((this.field_g - this.field_e) > (long)this.field_j) {
                this.field_j = (int)(this.field_g - this.field_e);
              }
              return;
            }
            if (~this.field_b != ~this.field_g) {
              this.field_k.a(this.field_g, false);
              this.field_b = this.field_g;
            }
            this.field_k.a(param1, param3, param2, (byte) 124);
            this.field_b = this.field_b + (long)param3;
            if (this.field_b > this.field_l) {
              this.field_l = this.field_b;
            }
            var5_long = -1L;
            if (this.field_c <= this.field_g &&
              this.field_g < this.field_c + (long)this.field_f) {
              var5_long = this.field_g;
            } else {
              if (this.field_c >= this.field_g &&
                (long)param3 + this.field_g > this.field_c) {
                var5_long = this.field_c;
              }
            }
            var7 = -1L;
            if ((this.field_g + (long)param3) > this.field_c &&
              this.field_c + (long)this.field_f >= this.field_g + (long)param3) {
              var7 = (long)param3 + this.field_g;
            } else {
              if (this.field_g < (this.field_c + (long)this.field_f) &&
                (long)param3 + this.field_g >= this.field_c + (long)this.field_f) {
                var7 = (long)this.field_f + this.field_c;
              }
            }
            if (-1L < var5_long &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              bl.a(param2, (int)((long)param1 + var5_long - this.field_g), this.field_h, (int)(var5_long - this.field_c), var9);
            }
            this.field_g = this.field_g + (long)param3;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("v.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0) throws IOException {
        long var2;
        long var4;
        int var7;
        int var6;
        var7 = BachelorFridge.field_y;
        if (param0 != 50) {
          return;
        }
        if (this.field_e != -1L) {
          if (this.field_b != this.field_e) {
            this.field_k.a(this.field_e, false);
            this.field_b = this.field_e;
          }
          this.field_k.a(0, this.field_j, this.field_a, (byte) 115);
          this.field_b = this.field_b + (long)this.field_j;
          if (this.field_b > this.field_l) {
            this.field_l = this.field_b;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_c <= this.field_e &&
            this.field_e < (this.field_c + (long)this.field_f)) {
            var2 = this.field_e;
          } else {
            if (this.field_e <= this.field_c &&
              (long)this.field_j + this.field_e > this.field_c) {
              var2 = this.field_c;
            }
          }
          if (((long)this.field_j + this.field_e) > this.field_c &&
            ((long)this.field_j + this.field_e) <= (this.field_c + (long)this.field_f)) {
            var4 = (long)this.field_j + this.field_e;
          } else {
            if (this.field_e < (this.field_c + (long)this.field_f) &&
              (long)this.field_j + this.field_e >= (long)this.field_f + this.field_c) {
              var4 = (long)this.field_f + this.field_c;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            bl.a(this.field_a, (int)(var2 - this.field_e), this.field_h, (int)(var2 - this.field_c), var6);
          }
          this.field_e = -1L;
          this.field_j = 0;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
          int var3_int = -69 / ((80 - param0) / 40);
          this.a(param1.length, 0, -1, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -203) {
          field_d = (ht) null;
        }
        field_d = null;
    }

    final long b(int param0) {
        if (param0 != -1) {
          return 71L;
        }
        return this.field_i;
    }

    private final void c(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 != -1) {
          v.a((byte) -81);
        }
        this.field_f = 0;
        if (this.field_b != this.field_g) {
          this.field_k.a(this.field_g, false);
          this.field_b = this.field_g;
        }
        this.field_c = this.field_g;
        while (this.field_h.length > this.field_f) {
          var2 = this.field_h.length - this.field_f;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_k.a(this.field_h, var2, this.field_f, ~param0);
          if (-1 != var3) {
            this.field_f = this.field_f + var3;
            this.field_b = this.field_b + (long)var3;
            continue;
          }
          break;
        }
    }

    final void d(int param0) throws IOException {
        int var2 = 108 / ((-72 - param0) / 38);
        this.b((byte) 50);
        this.field_k.a(true);
    }

    final void a(long param0, byte param1) throws IOException {
        if (param1 > -84) {
          v.a(-19);
        }
        if (param0 < 0L) {
          throw new IOException();
        }
        this.field_g = param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
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
        lda var15 = null;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = BachelorFridge.field_y;
        try {
          try {
            if (param3.length < param0 + param1) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param0 + param1));
            }
            if (this.field_e != -1L &&
              this.field_e <= this.field_g &&
              (this.field_g + (long)param0) <= (this.field_e + (long)this.field_j)) {
              bl.a(this.field_a, (int)(-this.field_e + this.field_g), param3, param1, param0);
              this.field_g = this.field_g + (long)param0;
              return;
            }
            var5_long = this.field_g;
            if (param2 != -1) {
              var15 = (lda) null;
              v.a(-89, (byte) -81, -71, (lda) null, (lda) null, 78);
            }
            var7 = param1;
            var8 = param0;
            if (this.field_g >= this.field_c &&
              this.field_g < (long)this.field_f + this.field_c) {
              var9_int = (int)(-this.field_g + (this.field_c + (long)this.field_f));
              if (var9_int > param0) {
                var9_int = param0;
              }
              bl.a(this.field_h, (int)(this.field_g - this.field_c), param3, param1, var9_int);
              param0 = param0 - var9_int;
              param1 = param1 + var9_int;
              this.field_g = this.field_g + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_h.length < param0) {
              this.field_k.a(this.field_g, false);
              this.field_b = this.field_g;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_k.a(param3, param0, param1, 0);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_b = this.field_b + (long)var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param0 > 0)) {
              this.c(param2 ^ 0);
              var9_intLifetime1Lifetime1 = param0;
              if (this.field_f < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_f;
              }
              bl.a(this.field_h, 0, param3, param1, var9_intLifetime1Lifetime1);
              this.field_g = this.field_g + (long)var9_intLifetime1Lifetime1;
              param1 = param1 + var9_intLifetime1Lifetime1;
              param0 = param0 - var9_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_e > this.field_g &&
                param0 > 0) {
                var9_intLifetime2 = param1 + (int)(-this.field_g + this.field_e);
                if (param1 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param0 + param1;
                }
                while (param1 < var9_intLifetime2) {
                  incrementValue$0 = param1;
                  param1++;
                  param3[incrementValue$0] = (byte) 0;
                  param0--;
                  this.field_g = this.field_g + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_e &&
                ((long)var8 + var5_long) > this.field_e) {
                var9 = this.field_e;
              } else {
                if (var5_long >= this.field_e &&
                  var5_long < (this.field_e + (long)this.field_j)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (this.field_e + (long)this.field_j > var5_long &&
                (long)var8 + var5_long >= this.field_e + (long)this.field_j) {
                var11 = (long)this.field_j + this.field_e;
              } else {
                if ((long)var8 + var5_long > this.field_e &&
                  (var5_long + (long)var8) <= (this.field_e + (long)this.field_j)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                bl.a(this.field_a, (int)(var9 - this.field_e), param3, (int)(-var5_long + var9) + var7, var13);
                if (this.field_g < var11) {
                  param0 = (int)((long)param0 - (var11 - this.field_g));
                  this.field_g = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
          if (0 >= param0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("v.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, lda param3, lda param4, int param5) {
        try {
          hna.field_k = param2;
          pba.field_r = param5;
          aka.field_x = param3;
          raa.field_J = param0;
          nj.field_j = param4;
          if (param1 <= 19) {
            v.a(-48);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "v.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    v(qaa param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_c = -1L;
        this.field_e = -1L;
        this.field_j = 0;
        try {
          this.field_k = param0;
          dupTemp$0 = param0.a((byte) 24);
          this.field_l = dupTemp$0;
          this.field_i = dupTemp$0;
          this.field_a = new byte[param2];
          this.field_g = 0L;
          this.field_h = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
