/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im {
    private long field_a;
    private byte[] field_o;
    private long field_d;
    static fe[] field_c;
    static int field_h;
    private long field_e;
    private bj field_f;
    private long field_k;
    private long field_n;
    private long field_i;
    private int field_l;
    private byte[] field_m;
    private int field_b;
    static boolean field_g;
    static cr field_j;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          try {
            if (this.field_d + (long)param1 > this.field_a) {
              this.field_a = this.field_d + (long)param1;
            }
            if (param0 != 0) {
              return;
            }
            if (this.field_e != -1L && (this.field_e > this.field_d ||
              this.field_d > (long)this.field_l + this.field_e)) {
              this.a((byte) 58);
            }
            if (this.field_e != -1L &&
              (long)param1 + this.field_d > this.field_e + (long)this.field_m.length) {
              var5_int = (int)(-this.field_d - (-this.field_e - (long)this.field_m.length));
              qq.a(param3, param2, this.field_m, (int)(this.field_d - this.field_e), var5_int);
              this.field_d = this.field_d + (long)var5_int;
              param1 = param1 - var5_int;
              param2 = param2 + var5_int;
              this.field_l = this.field_m.length;
              this.a((byte) 100);
            }
            if (this.field_m.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (this.field_e == -1L) {
                this.field_e = this.field_d;
              }
              qq.a(param3, param2, this.field_m, (int)(this.field_d - this.field_e), param1);
              this.field_d = this.field_d + (long)param1;
              if ((long)this.field_l < (this.field_d - this.field_e)) {
                this.field_l = (int)(-this.field_e + this.field_d);
              }
              return;
            }
            if (this.field_n != this.field_d) {
              this.field_f.a(this.field_d, false);
              this.field_n = this.field_d;
            }
            this.field_f.a(param1, param2, param3, false);
            this.field_n = this.field_n + (long)param1;
            if (this.field_i < this.field_n) {
              this.field_i = this.field_n;
            }
            var5_long = -1L;
            if (this.field_k <= this.field_d &&
              ((long)this.field_b + this.field_k) > this.field_d) {
              var5_long = this.field_d;
            } else {
              if (this.field_k >= this.field_d &&
                this.field_k < (this.field_d + (long)param1)) {
                var5_long = this.field_k;
              }
            }
            var7 = -1L;
            if ((this.field_d + (long)param1) > this.field_k &&
              this.field_k + (long)this.field_b >= this.field_d + (long)param1) {
              var7 = (long)param1 + this.field_d;
            } else {
              if ((this.field_k + (long)this.field_b) > this.field_d &&
                this.field_d + (long)param1 >= this.field_k + (long)this.field_b) {
                var7 = (long)this.field_b + this.field_k;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              qq.a(param3, (int)((long)param2 - (-var5_long + this.field_d)), this.field_o, (int)(-this.field_k + var5_long), var9);
            }
            this.field_d = this.field_d + (long)param1;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_n = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_57_0 = var5_ref;
          stackIn_57_1 = new StringBuilder().append("im.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          try {
            if (param3 + param1 > param2.length) {
              throw new ArrayIndexOutOfBoundsException(param1 + (param3 - param2.length));
            }
            if (this.field_e != -1L &&
              this.field_d >= this.field_e &&
              (long)this.field_l + this.field_e >= (long)param3 + this.field_d) {
              qq.a(this.field_m, (int)(-this.field_e + this.field_d), param2, param1, param3);
              this.field_d = this.field_d + (long)param3;
              return;
            }
            var5_long = this.field_d;
            if (param0 >= -82) {
              return;
            }
            var7 = param1;
            var8 = param3;
            if (this.field_k <= this.field_d &&
              this.field_d < this.field_k + (long)this.field_b) {
              var9_int = (int)((long)this.field_b - (this.field_d - this.field_k));
              if (var9_int > param3) {
                var9_int = param3;
              }
              qq.a(this.field_o, (int)(this.field_d - this.field_k), param2, param1, var9_int);
              param1 = param1 + var9_int;
              param3 = param3 - var9_int;
              this.field_d = this.field_d + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_o.length) {
              this.field_f.a(this.field_d, false);
              this.field_n = this.field_d;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_f.a(param3, (byte) -84, param2, param1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_n = this.field_n + (long)var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.d(-122);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_b < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_b;
              }
              qq.a(this.field_o, 0, param2, param1, var9_intLifetime1Lifetime1);
              param1 = param1 + var9_intLifetime1Lifetime1;
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_e > this.field_d &&
                param3 > 0) {
                var9_intLifetime2 = (int)(-this.field_d + this.field_e) + param1;
                if (param1 + param3 < var9_intLifetime2) {
                  var9_intLifetime2 = param1 + param3;
                }
                while (var9_intLifetime2 > param1) {
                  param3--;
                  incrementValue$0 = param1;
                  param1++;
                  param2[incrementValue$0] = (byte) 0;
                  this.field_d = this.field_d + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_e >= var5_long &&
                this.field_e < (var5_long + (long)var8)) {
                var9 = this.field_e;
              } else {
                if (var5_long >= this.field_e &&
                  ((long)this.field_l + this.field_e) > var5_long) {
                  var9 = var5_long;
                }
              }
              if (this.field_e + (long)this.field_l > var5_long &&
                ((long)this.field_l + this.field_e) <= ((long)var8 + var5_long)) {
                var11 = (long)this.field_l + this.field_e;
              } else {
                if ((var5_long + (long)var8) > this.field_e &&
                  ((long)var8 + var5_long) <= (this.field_e + (long)this.field_l)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                qq.a(this.field_m, (int)(var9 - this.field_e), param2, (int)(var9 - var5_long) + var7, var13);
                if (this.field_d < var11) {
                  param3 = (int)((long)param3 - (-this.field_d + var11));
                  this.field_d = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_n = -1L;
            throw var5;
          }
          if (param3 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var5_ref;
          stackIn_65_1 = new StringBuilder().append("im.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param3).append(')').toString());
        }
    }

    final long c(int param0) {
        if (param0 != -1) {
          im.a(90);
        }
        return this.field_a;
    }

    final void b(int param0) throws IOException {
        this.a((byte) 31);
        if (param0 != -22473) {
          this.field_e = -20L;
        }
        this.field_f.a(0);
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        if (param0 != -23669) {
          field_h = 5;
        }
        this.field_d = param1;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(-102, param0, param1, param1.length);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "im.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
          im.e(-33);
        }
        return !hj.field_b ? true : false;
    }

    public static void e(int param0) {
        if (param0 < 7) {
          return;
        }
        field_c = null;
        field_j = null;
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (this.field_e != -1L) {
          if (this.field_n != this.field_e) {
            this.field_f.a(this.field_e, false);
            this.field_n = this.field_e;
          }
          this.field_f.a(this.field_l, 0, this.field_m, false);
          this.field_n = this.field_n + (long)this.field_l;
          if (this.field_n > this.field_i) {
            this.field_i = this.field_n;
          }
          var2 = -1L;
          if (this.field_k <= this.field_e &&
            this.field_e < (long)this.field_b + this.field_k) {
            var2 = this.field_e;
          } else {
            if (this.field_k >= this.field_e &&
              this.field_k < (long)this.field_l + this.field_e) {
              var2 = this.field_k;
            }
          }
          var4 = -1L;
          if (this.field_k < ((long)this.field_l + this.field_e) &&
            this.field_k + (long)this.field_b >= this.field_e + (long)this.field_l) {
            var4 = this.field_e + (long)this.field_l;
          } else {
            if (((long)this.field_b + this.field_k) > this.field_e &&
              (this.field_k + (long)this.field_b) <= (this.field_e + (long)this.field_l)) {
              var4 = (long)this.field_b + this.field_k;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            qq.a(this.field_m, (int)(-this.field_e + var2), this.field_o, (int)(var2 - this.field_k), var6);
          }
          this.field_l = 0;
          this.field_e = -1L;
        }
        if (param0 < 20) {
          this.c(17);
        }
    }

    im(bj param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_k = -1L;
        this.field_l = 0;
        this.field_e = -1L;
        try {
          this.field_f = param0;
          dupTemp$0 = param0.b(0);
          this.field_i = dupTemp$0;
          this.field_a = dupTemp$0;
          this.field_m = new byte[param2];
          this.field_o = new byte[param1];
          this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        this.field_b = 0;
        if (~this.field_n != ~this.field_d) {
          this.field_f.a(this.field_d, false);
          this.field_n = this.field_d;
        }
        this.field_k = this.field_d;
        int var2 = 15 % ((param0 - 69) / 57);
        while (this.field_o.length > this.field_b) {
          var3 = -this.field_b + this.field_o.length;
          if (var3 > 200000000) {
            var3 = 200000000;
          }
          var4 = this.field_f.a(var3, (byte) -90, this.field_o, this.field_b);
          if (var4 == -1) {
            break;
          }
          this.field_b = this.field_b + var4;
          this.field_n = this.field_n + (long)var4;
        }
    }

    static {
        field_h = 480;
    }
}
