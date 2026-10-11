/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa {
    private byte[] field_a;
    private byte[] field_b;
    static int[] field_i;
    private gl field_m;
    private long field_n;
    private int field_e;
    private long field_c;
    private long field_g;
    static String field_h;
    private long field_d;
    private long field_k;
    private long field_l;
    private int field_f;
    static boolean field_j;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = CrazyCrystals.field_B;
        try {
          try {
            if (param1.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param3 + param2);
            }
            if (this.field_n != -1L &&
              this.field_g >= this.field_n &&
              (long)this.field_e + this.field_n >= this.field_g + (long)param3) {
              eg.a(this.field_a, (int)(-this.field_n + this.field_g), param1, param2, param3);
              this.field_g = this.field_g + (long)param3;
              return;
            }
            var5_long = this.field_g;
            var7 = param2;
            var8 = param3;
            if (this.field_g >= this.field_k &&
              this.field_g < (this.field_k + (long)this.field_f)) {
              var9_int = (int)((long)this.field_f + this.field_k - this.field_g);
              if (param3 < var9_int) {
                var9_int = param3;
              }
              eg.a(this.field_b, (int)(-this.field_k + this.field_g), param1, param2, var9_int);
              param2 = param2 + var9_int;
              this.field_g = this.field_g + (long)var9_int;
              param3 = param3 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_b.length < param3) {
              this.field_m.a(this.field_g, param0 - 224);
              this.field_l = this.field_g;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_m.a(param1, param2, param3, (byte) -68);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param3 = param3 - var9_intLifetime1;
                this.field_l = this.field_l + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.c(-1);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_f < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_f;
              }
              eg.a(this.field_b, 0, param1, param2, var9_intLifetime1Lifetime1);
              this.field_g = this.field_g + (long)var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_n) {
              if (this.field_g < this.field_n &&
                param3 > 0) {
                var9_intLifetime2 = (int)(this.field_n - this.field_g) + param2;
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param3;
                }
                while (var9_intLifetime2 > param2) {
                  incrementValue$0 = param2;
                  param2++;
                  param1[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_g = this.field_g + 1L;
                }
              }
              var9 = -1L;
              if (this.field_n >= var5_long &&
                this.field_n < (long)var8 + var5_long) {
                var9 = this.field_n;
              } else {
                if (this.field_n <= var5_long &&
                  var5_long < this.field_n + (long)this.field_e) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < ((long)this.field_e + this.field_n) &&
                ((long)this.field_e + this.field_n) <= (var5_long + (long)var8)) {
                var11 = this.field_n + (long)this.field_e;
              } else {
                if (this.field_n < var5_long + (long)var8 &&
                  (long)this.field_e + this.field_n >= var5_long + (long)var8) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                eg.a(this.field_a, (int)(-this.field_n + var9), param1, var7 + (int)(var9 - var5_long), var13);
                if (this.field_g < var11) {
                  param3 = (int)((long)param3 - (var11 - this.field_g));
                  this.field_g = var11;
                }
              }
            }
            if (param0 != 106) {
              this.b(20);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
          if (param3 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("qa.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0) throws IOException {
        long var2;
        int var7;
        long var4;
        int var6;
        var7 = CrazyCrystals.field_B;
        if (param0 <= 80) {
          return;
        }
        if (this.field_n != -1L) {
          if (this.field_l != this.field_n) {
            this.field_m.a(this.field_n, -88);
            this.field_l = this.field_n;
          }
          this.field_m.a(120, 0, this.field_e, this.field_a);
          this.field_l = this.field_l + (long)this.field_e;
          if (this.field_l > this.field_c) {
            this.field_c = this.field_l;
          }
          var2 = -1L;
          if (this.field_k <= this.field_n &&
            this.field_n < this.field_k + (long)this.field_f) {
            var2 = this.field_n;
          } else {
            if (this.field_k >= this.field_n &&
              this.field_k < (this.field_n + (long)this.field_e)) {
              var2 = this.field_k;
            }
          }
          var4 = -1L;
          if (this.field_n + (long)this.field_e > this.field_k &&
            this.field_k + (long)this.field_f >= this.field_n + (long)this.field_e) {
            var4 = this.field_n + (long)this.field_e;
          } else {
            if (this.field_k + (long)this.field_f > this.field_n &&
              this.field_k + (long)this.field_f <= this.field_n + (long)this.field_e) {
              var4 = this.field_k + (long)this.field_f;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            eg.a(this.field_a, (int)(var2 - this.field_n), this.field_b, (int)(var2 - this.field_k), var6);
          }
          this.field_n = -1L;
          this.field_e = 0;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 > -69) {
          return;
        }
        try {
          this.a((byte) 106, param0, 0, param0.length);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (0L > param0) {
          throw new IOException();
        }
        if (param1 != -1) {
          return;
        }
        this.field_g = param0;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        this.field_f = 0;
        if (this.field_g != this.field_l) {
          this.field_m.a(this.field_g, param0 - 89);
          this.field_l = this.field_g;
        }
        if (param0 == -1) {
          this.field_k = this.field_g;
          while (this.field_f < this.field_b.length) {
            var2 = -this.field_f + this.field_b.length;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.field_m.a(this.field_b, this.field_f, var2, (byte) -63);
            if (var3 == -1) {
              break;
            }
            this.field_f = this.field_f + var3;
            this.field_l = this.field_l + (long)var3;
          }
          return;
        }
    }

    final void d(int param0) throws IOException {
        if (param0 != -200000001) {
          return;
        }
        this.a((byte) 88);
        this.field_m.d(91);
    }

    final long b(int param0) {
        if (param0 != 0) {
          this.field_d = 73L;
        }
        return this.field_d;
    }

    final static dp a(byte param0, int param1) {
        dp var2 = new dp();
        if (param0 != 121) {
          field_h = (String) null;
        }
        pm.field_c.b(0, var2);
        eq.b(param0 ^ 123, param1);
        return var2;
    }

    qa(gl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_n = -1L;
        this.field_e = 0;
        this.field_k = -1L;
        try {
          this.field_m = param0;
          dupTemp$0 = param0.a(48);
          this.field_c = dupTemp$0;
          this.field_d = dupTemp$0;
          this.field_a = new byte[param2];
          this.field_b = new byte[param1];
          this.field_g = 0L;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        var11 = CrazyCrystals.field_B;
        try {
          try {
            if ((this.field_g + (long)param3) > this.field_d) {
              this.field_d = this.field_g + (long)param3;
            }
            if (this.field_n != -1L && (this.field_n > this.field_g ||
              this.field_g > (long)this.field_e + this.field_n)) {
              this.a((byte) 103);
            }
            if (this.field_n != -1L &&
              (this.field_g + (long)param3) > (this.field_n + (long)this.field_a.length)) {
              var5_int = (int)(-this.field_g + this.field_n + (long)this.field_a.length);
              eg.a(param1, param2, this.field_a, (int)(this.field_g - this.field_n), var5_int);
              this.field_g = this.field_g + (long)var5_int;
              param3 = param3 - var5_int;
              param2 = param2 + var5_int;
              this.field_e = this.field_a.length;
              this.a((byte) 95);
            }
            var5_intLifetime1 = 7 / ((82 - param0) / 36);
            if (param3 <= this.field_a.length) {
              if (0 >= param3) {
                return;
              }
              if (this.field_n == -1L) {
                this.field_n = this.field_g;
              }
              eg.a(param1, param2, this.field_a, (int)(-this.field_n + this.field_g), param3);
              this.field_g = this.field_g + (long)param3;
              if ((long)this.field_e < (-this.field_n + this.field_g)) {
                this.field_e = (int)(-this.field_n + this.field_g);
              }
              return;
            }
            if (~this.field_l != ~this.field_g) {
              this.field_m.a(this.field_g, -99);
              this.field_l = this.field_g;
            }
            this.field_m.a(120, param2, param3, param1);
            this.field_l = this.field_l + (long)param3;
            if (this.field_l > this.field_c) {
              this.field_c = this.field_l;
            }
            var6 = -1L;
            var8 = -1L;
            if (this.field_g >= this.field_k &&
              ((long)this.field_f + this.field_k) > this.field_g) {
              var6 = this.field_g;
            } else {
              if (this.field_k >= this.field_g &&
                this.field_k < (long)param3 + this.field_g) {
                var6 = this.field_k;
              }
            }
            if ((this.field_g + (long)param3) > this.field_k &&
              this.field_g + (long)param3 <= (long)this.field_f + this.field_k) {
              var8 = (long)param3 + this.field_g;
            } else {
              if (this.field_k + (long)this.field_f > this.field_g &&
                this.field_k + (long)this.field_f <= (long)param3 + this.field_g) {
                var8 = this.field_k + (long)this.field_f;
              }
            }
            if (var6 > -1L &&
              var8 > var6) {
              var10 = (int)(var8 - var6);
              eg.a(param1, (int)(-this.field_g + ((long)param2 + var6)), this.field_b, (int)(-this.field_k + var6), var10);
            }
            this.field_g = this.field_g + (long)param3;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("qa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != -6142) {
          qa.a((byte) -3, -85);
        }
    }

    static {
        field_i = new int[8192];
        field_h = "You can make him move using the keys indicated above.";
    }
}
