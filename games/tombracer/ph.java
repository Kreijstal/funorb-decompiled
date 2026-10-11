/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph {
    private long field_d;
    private int field_a;
    private ml field_b;
    static float[] field_c;
    static String field_k;
    private long field_i;
    private int field_f;
    private byte[] field_e;
    static float[] field_n;
    private byte[] field_h;
    private long field_m;
    private long field_g;
    private long field_j;
    private long field_l;

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 != -16) {
          this.b(false);
        }
        if (this.field_l != -1L) {
          if (this.field_j != this.field_l) {
            this.field_b.a(param0 ^ -16, this.field_l);
            this.field_j = this.field_l;
          }
          this.field_b.a(0, 0, this.field_f, this.field_e);
          this.field_j = this.field_j + (long)this.field_f;
          if (this.field_j > this.field_i) {
            this.field_i = this.field_j;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_l >= this.field_m &&
            (this.field_m + (long)this.field_a) > this.field_l) {
            var2 = this.field_l;
          } else {
            if (this.field_l <= this.field_m &&
              ((long)this.field_f + this.field_l) > this.field_m) {
              var2 = this.field_m;
            }
          }
          if ((this.field_l + (long)this.field_f) > this.field_m &&
            this.field_l + (long)this.field_f <= this.field_m + (long)this.field_a) {
            var4 = (long)this.field_f + this.field_l;
          } else {
            if ((long)this.field_a + this.field_m > this.field_l &&
              ((long)this.field_a + this.field_m) <= ((long)this.field_f + this.field_l)) {
              var4 = this.field_m + (long)this.field_a;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            lua.a(this.field_e, (int)(-this.field_l + var2), this.field_h, (int)(-this.field_m + var2), var6);
          }
          this.field_f = 0;
          this.field_l = -1L;
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) -16);
        this.field_b.b((byte) -127);
        if (param0 >= -14) {
          ph.a(false);
        }
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_a = 0;
        if (this.field_g != this.field_j) {
          this.field_b.a(0, this.field_g);
          this.field_j = this.field_g;
        }
        this.field_m = this.field_g;
        while (this.field_a < this.field_h.length) {
          var2 = this.field_h.length - this.field_a;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_b.a((byte) 69, this.field_h, var2, this.field_a);
          if (-1 != var3) {
            this.field_j = this.field_j + (long)var3;
            this.field_a = this.field_a + var3;
            continue;
          }
          break;
        }
        if (param0 != -1) {
          ph.a(false);
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
          this.a(param0, param0.length, param1, (byte) -112);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ph.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long b(boolean param0) {
        if (!param0) {
          return -88L;
        }
        return this.field_d;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_k = null;
        field_c = null;
        if (!param0) {
          ph.a(false);
        }
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          try {
            if (this.field_g + (long)param3 > this.field_d) {
              this.field_d = (long)param3 + this.field_g;
            }
            if (-1L != this.field_l) {
              if (this.field_g >= this.field_l) {
                if (((long)this.field_f + this.field_l) < this.field_g) {
                  this.a((byte) -16);
                }
              } else {
                this.a((byte) -16);
              }
            }
            if (this.field_l != -1L &&
              (this.field_l + (long)this.field_e.length) < ((long)param3 + this.field_g)) {
              var5_int = (int)((long)this.field_e.length - (-this.field_l + this.field_g));
              lua.a(param0, param1, this.field_e, (int)(this.field_g - this.field_l), var5_int);
              this.field_g = this.field_g + (long)var5_int;
              param1 = param1 + var5_int;
              param3 = param3 - var5_int;
              this.field_f = this.field_e.length;
              this.a((byte) -16);
            }
            if (this.field_e.length >= param3) {
              if (param3 <= 0) {
                if (param2 != -17) {
                  this.field_b = (ml) null;
                }
                return;
              }
              if (this.field_l == -1L) {
                this.field_l = this.field_g;
              }
              lua.a(param0, param1, this.field_e, (int)(-this.field_l + this.field_g), param3);
              this.field_g = this.field_g + (long)param3;
              if ((-this.field_l + this.field_g) > (long)this.field_f) {
                this.field_f = (int)(this.field_g - this.field_l);
              }
              return;
            }
            if (this.field_g != this.field_j) {
              this.field_b.a(0, this.field_g);
              this.field_j = this.field_g;
            }
            this.field_b.a(param1, 0, param3, param0);
            this.field_j = this.field_j + (long)param3;
            if (this.field_i < this.field_j) {
              this.field_i = this.field_j;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_g >= this.field_m &&
              (this.field_m + (long)this.field_a) > this.field_g) {
              var5_long = this.field_g;
            } else {
              if (this.field_m >= this.field_g &&
                this.field_m < (this.field_g + (long)param3)) {
                var5_long = this.field_m;
              }
            }
            if (this.field_m < ((long)param3 + this.field_g) &&
              (this.field_m + (long)this.field_a) >= ((long)param3 + this.field_g)) {
              var7 = this.field_g + (long)param3;
            } else {
              if (((long)this.field_a + this.field_m) > this.field_g &&
                ((long)param3 + this.field_g) >= ((long)this.field_a + this.field_m)) {
                var7 = this.field_m + (long)this.field_a;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              lua.a(param0, (int)((long)param1 + (var5_long - this.field_g)), this.field_h, (int)(-this.field_m + var5_long), var9);
            }
            this.field_g = this.field_g + (long)param3;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_j = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("ph.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
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
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          try {
            if (param1 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(param1 + param2 - param0.length);
            }
            if (this.field_l != -1L &&
              this.field_g >= this.field_l &&
              (this.field_l + (long)this.field_f) >= ((long)param1 + this.field_g)) {
              lua.a(this.field_e, (int)(-this.field_l + this.field_g), param0, param2, param1);
              this.field_g = this.field_g + (long)param1;
              return;
            }
            if (param3 > -22) {
              this.b(true);
            }
            var5_long = this.field_g;
            var7 = param2;
            var8 = param1;
            if (this.field_m <= this.field_g &&
              this.field_g < this.field_m + (long)this.field_a) {
              var9_int = (int)(-this.field_g + this.field_m + (long)this.field_a);
              if (var9_int > param1) {
                var9_int = param1;
              }
              lua.a(this.field_h, (int)(-this.field_m + this.field_g), param0, param2, var9_int);
              this.field_g = this.field_g + (long)var9_int;
              param2 = param2 + var9_int;
              param1 = param1 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_h.length < param1) {
              this.field_b.a(0, this.field_g);
              this.field_j = this.field_g;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_b.a((byte) 80, param0, param1, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 + var9_intLifetime1;
                this.field_j = this.field_j + (long)var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.a(-1);
              var9_intLifetime1Lifetime1 = param1;
              if (this.field_a < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_a;
              }
              lua.a(this.field_h, 0, param0, param2, var9_intLifetime1Lifetime1);
              param2 = param2 + var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.field_g = this.field_g + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_l != -1L) {
              if (this.field_g < this.field_l &&
                param1 > 0) {
                var9_intLifetime2 = param2 + (int)(this.field_l - this.field_g);
                if (param1 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param1;
                }
                while (var9_intLifetime2 > param2) {
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  param1--;
                  this.field_g = this.field_g + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_l &&
                this.field_l < (var5_long + (long)var8)) {
                var9 = this.field_l;
              } else {
                if (var5_long >= this.field_l &&
                  var5_long < ((long)this.field_f + this.field_l)) {
                  var9 = var5_long;
                }
              }
              if (var5_long < this.field_l + (long)this.field_f &&
                ((long)var8 + var5_long) >= ((long)this.field_f + this.field_l)) {
                var11 = (long)this.field_f + this.field_l;
              } else {
                if (var5_long + (long)var8 > this.field_l &&
                  ((long)this.field_f + this.field_l) >= (var5_long + (long)var8)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                lua.a(this.field_e, (int)(-this.field_l + var9), param0, var7 + (int)(-var5_long + var9), var13);
                if (this.field_g < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_g));
                  this.field_g = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_j = -1L;
            throw var5;
          }
          if (0 < param1) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var5_ref;
          stackIn_64_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ph(ml param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_l = -1L;
        this.field_f = 0;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.a(false);
          this.field_i = dupTemp$0;
          this.field_d = dupTemp$0;
          this.field_g = 0L;
          this.field_e = new byte[param2];
          this.field_h = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_g = param1;
        int var4 = -100 % ((param0 + 58) / 50);
    }

    static {
        int var2 = 0;
        field_c = new float[16384];
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_n[var2] = (float)Math.sin(var0 * (double)var2);
          field_c[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}
