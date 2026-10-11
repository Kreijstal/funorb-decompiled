/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uo {
    private long field_g;
    private long field_q;
    private long field_p;
    static dj field_b;
    private byte[] field_k;
    private int field_c;
    private byte[] field_l;
    private long field_f;
    private lj field_h;
    private long field_o;
    private long field_n;
    private int field_e;
    static int field_i;
    static int field_j;
    static String field_d;
    static sb field_m;
    static int field_a;

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
            if (this.field_n + (long)param0 > this.field_o) {
              this.field_o = this.field_n + (long)param0;
            }
            if (this.field_g != -1L) {
              if (this.field_g <= this.field_n) {
                if (this.field_n > (this.field_g + (long)this.field_c)) {
                  this.a((byte) 28);
                }
              } else {
                this.a((byte) 28);
              }
            }
            if (this.field_g != -1L &&
              ((long)param0 + this.field_n) > (this.field_g + (long)this.field_l.length)) {
              var5_int = (int)((long)this.field_l.length + (this.field_g - this.field_n));
              qb.a(param3, param1, this.field_l, (int)(this.field_n - this.field_g), var5_int);
              param1 = param1 + var5_int;
              param0 = param0 - var5_int;
              this.field_n = this.field_n + (long)var5_int;
              this.field_c = this.field_l.length;
              this.a((byte) 28);
            }
            if (this.field_l.length >= param0) {
              if (param2 > -67) {
                return;
              }
              if (param0 <= 0) {
                return;
              }
              if (-1L == this.field_g) {
                this.field_g = this.field_n;
              }
              qb.a(param3, param1, this.field_l, (int)(this.field_n - this.field_g), param0);
              this.field_n = this.field_n + (long)param0;
              if (-this.field_g + this.field_n > (long)this.field_c) {
                this.field_c = (int)(-this.field_g + this.field_n);
              }
              return;
            }
            if (~this.field_p != ~this.field_n) {
              this.field_h.a(false, this.field_n);
              this.field_p = this.field_n;
            }
            this.field_h.a(param0, param3, param1, -80);
            this.field_p = this.field_p + (long)param0;
            if (this.field_p > this.field_q) {
              this.field_q = this.field_p;
            }
            var5_long = -1L;
            if (this.field_n >= this.field_f &&
              this.field_n < (long)this.field_e + this.field_f) {
              var5_long = this.field_n;
            } else {
              if (this.field_f >= this.field_n &&
                this.field_f < ((long)param0 + this.field_n)) {
                var5_long = this.field_f;
              }
            }
            var7 = -1L;
            if (this.field_f < (this.field_n + (long)param0) &&
              ((long)param0 + this.field_n) <= (this.field_f + (long)this.field_e)) {
              var7 = this.field_n + (long)param0;
            } else {
              if (((long)this.field_e + this.field_f) > this.field_n &&
                (this.field_n + (long)param0) >= (this.field_f + (long)this.field_e)) {
                var7 = (long)this.field_e + this.field_f;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              qb.a(param3, (int)((long)param1 + var5_long - this.field_n), this.field_k, (int)(var5_long - this.field_f), var9);
            }
            this.field_n = this.field_n + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_p = -1L;
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
          throw aa.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
              this.field_g <= this.field_n &&
              ((long)param2 + this.field_n) <= ((long)this.field_c + this.field_g)) {
              qb.a(this.field_l, (int)(-this.field_g + this.field_n), param0, param3, param2);
              this.field_n = this.field_n + (long)param2;
              return;
            }
            var5_long = this.field_n;
            var7 = param3;
            var8 = param2;
            if (this.field_n >= this.field_f &&
              this.field_n < this.field_f + (long)this.field_e) {
              var9_int = (int)((long)this.field_e - (this.field_n - this.field_f));
              if (var9_int > param2) {
                var9_int = param2;
              }
              qb.a(this.field_k, (int)(this.field_n - this.field_f), param0, param3, var9_int);
              param3 = param3 + var9_int;
              this.field_n = this.field_n + (long)var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_k.length < param2) {
              this.field_h.a(false, this.field_n);
              this.field_p = this.field_n;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_h.a(false, param3, param2, param0);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_n = this.field_n + (long)var9_intLifetime1;
                param3 = param3 + var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
                this.field_p = this.field_p + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param2)) {
              this.c(200000000);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_e < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_e;
              }
              qb.a(this.field_k, 0, param0, param3, var9_intLifetime1Lifetime1);
              param3 = param3 + var9_intLifetime1Lifetime1;
              this.field_n = this.field_n + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
            }
            if (param1 != 24) {
              return;
            }
            if (this.field_g != -1L) {
              if (this.field_n < this.field_g &&
                0 < param2) {
                var9_intLifetime2 = param3 + (int)(this.field_g - this.field_n);
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param3 + param2;
                }
                while (param3 < var9_intLifetime2) {
                  param2--;
                  incrementValue$0 = param3;
                  param3++;
                  param0[incrementValue$0] = (byte) 0;
                  this.field_n = this.field_n + 1L;
                }
              }
              var9 = -1L;
              if (this.field_g >= var5_long &&
                this.field_g < ((long)var8 + var5_long)) {
                var9 = this.field_g;
              } else {
                if (this.field_g <= var5_long &&
                  var5_long < (this.field_g + (long)this.field_c)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.field_g + (long)this.field_c &&
                ((long)this.field_c + this.field_g) <= (var5_long + (long)var8)) {
                var11 = (long)this.field_c + this.field_g;
              } else {
                if (var5_long + (long)var8 > this.field_g &&
                  (long)var8 + var5_long <= this.field_g + (long)this.field_c) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                qb.a(this.field_l, (int)(-this.field_g + var9), param0, (int)(-var5_long + var9) + var7, var13);
                if (var11 > this.field_n) {
                  param2 = (int)((long)param2 - (-this.field_n + var11));
                  this.field_n = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_p = -1L;
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
          throw aa.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          String var3 = (String) null;
          uo.a(-117, (String) null);
        }
        this.a((byte) 28);
        this.field_h.b(-5317);
    }

    final long a(int param0) {
        if (param0 < 38) {
          this.field_k = (byte[]) null;
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
              stackIn_12_0 = gm.field_f;
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
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = 32 / ((param1 - 60) / 35);
        if (param0 < 0L) {
          throw new IOException();
        }
        this.field_n = param0;
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        if (this.field_g != -1L) {
          if (this.field_g != this.field_p) {
            this.field_h.a(false, this.field_g);
            this.field_p = this.field_g;
          }
          this.field_h.a(this.field_c, this.field_l, 0, -120);
          this.field_p = this.field_p + (long)this.field_c;
          if (this.field_q < this.field_p) {
            this.field_q = this.field_p;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_g >= this.field_f &&
            this.field_g < (this.field_f + (long)this.field_e)) {
            var2 = this.field_g;
          } else {
            if (this.field_g <= this.field_f &&
              this.field_f < (long)this.field_c + this.field_g) {
              var2 = this.field_f;
            }
          }
          if (this.field_f < (long)this.field_c + this.field_g &&
            (this.field_f + (long)this.field_e) >= (this.field_g + (long)this.field_c)) {
            var4 = (long)this.field_c + this.field_g;
          } else {
            if (this.field_g < ((long)this.field_e + this.field_f) &&
              this.field_g + (long)this.field_c >= this.field_f + (long)this.field_e) {
              var4 = this.field_f + (long)this.field_e;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            qb.a(this.field_l, (int)(var2 - this.field_g), this.field_k, (int)(-this.field_f + var2), var6);
          }
          this.field_c = 0;
          this.field_g = -1L;
        }
        if (param0 != 28) {
          uo.b(9);
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param0, (byte) 24, param0.length, 0);
          if (param1 != 0) {
            uo.b(-16);
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
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.field_e = 0;
        if (~this.field_n != ~this.field_p) {
          this.field_h.a(false, this.field_n);
          this.field_p = this.field_n;
        }
        if (param0 != 200000000) {
          uo.b(1);
        }
        this.field_f = this.field_n;
        while (this.field_e < this.field_k.length) {
          var2 = this.field_k.length - this.field_e;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_h.a(false, this.field_e, var2, this.field_k);
          if (var3 == -1) {
            break;
          }
          this.field_e = this.field_e + var3;
          this.field_p = this.field_p + (long)var3;
        }
    }

    uo(lj param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_f = -1L;
        this.field_c = 0;
        try {
          this.field_h = param0;
          dupTemp$0 = param0.b((byte) -25);
          this.field_q = dupTemp$0;
          this.field_o = dupTemp$0;
          this.field_l = new byte[param2];
          this.field_k = new byte[param1];
          this.field_n = 0L;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "uo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(boolean param0) {
        he.field_f = null;
        if (param0) {
          uo.b(-78);
        }
    }

    static {
        field_b = new dj();
        field_a = 0;
        field_d = "Hide lobby chat";
    }
}
