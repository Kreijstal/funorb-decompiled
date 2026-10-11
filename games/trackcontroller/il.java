/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    private int field_c;
    static th field_e;
    private long field_d;
    private byte[] field_h;
    private long field_g;
    private tc field_m;
    private int field_f;
    private long field_j;
    private byte[] field_a;
    private long field_k;
    private long field_i;
    static qj[] field_l;
    private long field_b;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
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
        var14 = TrackController.field_F ? 1 : 0;
        try {
          try {
            if (param0.length < param1 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
            }
            if (this.field_j != -1L &&
              this.field_b >= this.field_j &&
              (long)this.field_f + this.field_j >= this.field_b + (long)param1) {
              pd.a(this.field_h, (int)(this.field_b - this.field_j), param0, param2, param1);
              this.field_b = this.field_b + (long)param1;
              return;
            }
            var5_long = this.field_b;
            var7 = param2;
            var8 = param1;
            if (this.field_b >= this.field_d &&
              (this.field_d + (long)this.field_c) > this.field_b) {
              var9_int = (int)((long)this.field_c - this.field_b + this.field_d);
              if (param1 < var9_int) {
                var9_int = param1;
              }
              pd.a(this.field_a, (int)(this.field_b - this.field_d), param0, param2, var9_int);
              param1 = param1 - var9_int;
              this.field_b = this.field_b + (long)var9_int;
              param2 = param2 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_a.length) {
              this.field_m.a(true, this.field_b);
              this.field_i = this.field_b;
              while (0 < param1) {
                var9_intLifetime1 = this.field_m.a(param0, (byte) 74, param2, param1);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 + var9_intLifetime1;
                this.field_i = this.field_i + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
                this.field_b = this.field_b + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.b((byte) 66);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_c) {
                var9_intLifetime1Lifetime1 = this.field_c;
              }
              pd.a(this.field_a, 0, param0, param2, var9_intLifetime1Lifetime1);
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.field_b = this.field_b + (long)var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (this.field_j != -1L) {
              if (this.field_b < this.field_j &&
                0 < param1) {
                var9_intLifetime2 = param2 + (int)(this.field_j - this.field_b);
                if (var9_intLifetime2 > param2 + param1) {
                  var9_intLifetime2 = param1 + param2;
                }
                while (var9_intLifetime2 > param2) {
                  param1--;
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  this.field_b = this.field_b + 1L;
                }
              }
              var9 = -1L;
              if (this.field_j >= var5_long &&
                var5_long + (long)var8 > this.field_j) {
                var9 = this.field_j;
              } else {
                if (var5_long >= this.field_j &&
                  (long)this.field_f + this.field_j > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < (this.field_j + (long)this.field_f) &&
                ((long)var8 + var5_long) >= (this.field_j + (long)this.field_f)) {
                var11 = this.field_j + (long)this.field_f;
              } else {
                if (this.field_j < var5_long + (long)var8 &&
                  (var5_long + (long)var8) <= (this.field_j + (long)this.field_f)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                pd.a(this.field_h, (int)(var9 - this.field_j), param0, (int)(var9 - var5_long) + var7, var13);
                if (this.field_b < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_b));
                  this.field_b = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_i = -1L;
            throw var5;
          }
          if (param3 >= param1) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_57_0 = var5_ref;
          stackIn_57_1 = new StringBuilder().append("il.C(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -29) {
            stackIn_4_0 = oe.a(param1, (byte) -70, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("il.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        }
        this.field_b = param0;
        if (!param1) {
          this.field_g = -51L;
        }
    }

    final long a(byte param0) {
        if (param0 >= -72) {
          return 9L;
        }
        return this.field_k;
    }

    final void d(int param0) throws IOException {
        this.a(-120);
        this.field_m.a(-31576);
        if (param0 != 0) {
          il.c(57);
        }
    }

    final static int c(int param0) {
        if (param0 != -14496) {
          il.b(-115);
        }
        return (int)(1000000000L / ba.field_f);
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var7;
        int var6;
        var7 = TrackController.field_F ? 1 : 0;
        if (param0 > -110) {
          return;
        }
        if (-1L != this.field_j) {
          if (~this.field_j != ~this.field_i) {
            this.field_m.a(true, this.field_j);
            this.field_i = this.field_j;
          }
          this.field_m.a(0, this.field_f, 0, this.field_h);
          this.field_i = this.field_i + (long)this.field_f;
          if (this.field_g < this.field_i) {
            this.field_g = this.field_i;
          }
          var2 = -1L;
          if (this.field_d <= this.field_j &&
            this.field_j < this.field_d + (long)this.field_c) {
            var2 = this.field_j;
          } else {
            if (this.field_j <= this.field_d &&
              this.field_d < ((long)this.field_f + this.field_j)) {
              var2 = this.field_d;
            }
          }
          var4 = -1L;
          if (this.field_d < this.field_j + (long)this.field_f &&
            this.field_d + (long)this.field_c >= (long)this.field_f + this.field_j) {
            var4 = (long)this.field_f + this.field_j;
          } else {
            if ((long)this.field_c + this.field_d > this.field_j &&
              this.field_j + (long)this.field_f >= (long)this.field_c + this.field_d) {
              var4 = this.field_d + (long)this.field_c;
            }
          }
          if (-1L < var2 &&
            var4 > var2) {
            var6 = (int)(-var2 + var4);
            pd.a(this.field_h, (int)(-this.field_j + var2), this.field_a, (int)(-this.field_d + var2), var6);
          }
          this.field_f = 0;
          this.field_j = -1L;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != -1) {
          il.b(-44);
        }
    }

    private final void b(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 <= 26) {
          return;
        }
        this.field_c = 0;
        if (~this.field_b != ~this.field_i) {
          this.field_m.a(true, this.field_b);
          this.field_i = this.field_b;
        }
        this.field_d = this.field_b;
        while (this.field_c < this.field_a.length) {
          var2 = this.field_a.length - this.field_c;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_m.a(this.field_a, (byte) 74, this.field_c, var2);
          if (-1 != var3) {
            this.field_i = this.field_i + (long)var3;
            this.field_c = this.field_c + var3;
            continue;
          }
          break;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          try {
            if (this.field_k < this.field_b + (long)param0) {
              this.field_k = this.field_b + (long)param0;
            }
            if (-1L != this.field_j) {
              if (this.field_b >= this.field_j) {
                if (this.field_b > this.field_j + (long)this.field_f) {
                  this.a(-114);
                }
              } else {
                this.a(-114);
              }
            }
            if (this.field_j != -1L &&
              ((long)this.field_h.length + this.field_j) < ((long)param0 + this.field_b)) {
              var5_int = (int)(this.field_j - (this.field_b - (long)this.field_h.length));
              pd.a(param2, param3, this.field_h, (int)(this.field_b - this.field_j), var5_int);
              param0 = param0 - var5_int;
              this.field_b = this.field_b + (long)var5_int;
              param3 = param3 + var5_int;
              this.field_f = this.field_h.length;
              this.a(-113);
            }
            if (this.field_h.length >= param0) {
              if (~param0 >= param1) {
                return;
              }
              if (this.field_j == -1L) {
                this.field_j = this.field_b;
              }
              pd.a(param2, param3, this.field_h, (int)(-this.field_j + this.field_b), param0);
              this.field_b = this.field_b + (long)param0;
              if (-this.field_j + this.field_b > (long)this.field_f) {
                this.field_f = (int)(this.field_b - this.field_j);
              }
              return;
            }
            if (~this.field_i != ~this.field_b) {
              this.field_m.a(true, this.field_b);
              this.field_i = this.field_b;
            }
            this.field_m.a(0, param0, param3, param2);
            this.field_i = this.field_i + (long)param0;
            if (this.field_g < this.field_i) {
              this.field_g = this.field_i;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_b >= this.field_d &&
              this.field_d + (long)this.field_c > this.field_b) {
              var5_long = this.field_b;
            } else {
              if (this.field_d >= this.field_b &&
                this.field_d < (long)param0 + this.field_b) {
                var5_long = this.field_d;
              }
            }
            if (this.field_b + (long)param0 > this.field_d &&
              this.field_b + (long)param0 <= this.field_d + (long)this.field_c) {
              var7 = this.field_b + (long)param0;
            } else {
              if (this.field_b < (this.field_d + (long)this.field_c) &&
                (this.field_d + (long)this.field_c) <= (this.field_b + (long)param0)) {
                var7 = (long)this.field_c + this.field_d;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              pd.a(param2, (int)((long)param3 + var5_long - this.field_b), this.field_a, (int)(var5_long - this.field_d), var9);
            }
            this.field_b = this.field_b + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_i = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_47_0 = var5_ref;
          stackIn_47_1 = new StringBuilder().append("il.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param3).append(')').toString());
        }
    }

    il(tc param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_j = -1L;
        this.field_f = 0;
        try {
          this.field_m = param0;
          dupTemp$0 = param0.a((byte) 121);
          this.field_g = dupTemp$0;
          this.field_k = dupTemp$0;
          this.field_b = 0L;
          this.field_h = new byte[param2];
          this.field_a = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          if (param0 > -113) {
            il.b(46);
          }
          this.a(param1, param1.length, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "il.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
