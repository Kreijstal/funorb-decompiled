/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc {
    private long field_d;
    private long field_r;
    private long field_p;
    static boolean field_q;
    private eg field_c;
    private int field_k;
    static um field_m;
    private int field_j;
    static String field_l;
    static String field_g;
    static int[] field_n;
    static String field_e;
    private byte[] field_i;
    private long field_a;
    private byte[] field_o;
    static ci field_f;
    private long field_h;
    private long field_b;

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(param1, -19616, param0, param1.length);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Chess.field_G;
        if (param0 != 17357) {
          return;
        }
        if (this.field_h != -1L) {
          if (~this.field_p != ~this.field_h) {
            this.field_c.a(this.field_h, -11526);
            this.field_p = this.field_h;
          }
          this.field_c.a(0, -1036, this.field_o, this.field_k);
          this.field_p = this.field_p + (long)this.field_k;
          if (this.field_p > this.field_b) {
            this.field_b = this.field_p;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_h >= this.field_d &&
            (this.field_d + (long)this.field_j) > this.field_h) {
            var2 = this.field_h;
          } else {
            if (this.field_h <= this.field_d &&
              (long)this.field_k + this.field_h > this.field_d) {
              var2 = this.field_d;
            }
          }
          if (this.field_d < this.field_h + (long)this.field_k &&
            (long)this.field_k + this.field_h <= (long)this.field_j + this.field_d) {
            var4 = (long)this.field_k + this.field_h;
          } else {
            if (this.field_h < ((long)this.field_j + this.field_d) &&
              ((long)this.field_j + this.field_d) <= ((long)this.field_k + this.field_h)) {
              var4 = (long)this.field_j + this.field_d;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(-var2 + var4);
            ne.a(this.field_o, (int)(-this.field_h + var2), this.field_i, (int)(-this.field_d + var2), var6);
          }
          this.field_k = 0;
          this.field_h = -1L;
        }
    }

    final static String d(byte param0) {
        if (!uk.field_e && be.field_f <= ei.field_u &&
          !(ei.field_u >= be.field_f + sj.field_n)) {
          return eg.field_j;
        }
        if (param0 != 60) {
          lc.d((byte) 67);
          return null;
        }
        return null;
    }

    final static void a(int param0) {
        cd.field_x = new w(ki.field_P, dc.field_s, gd.field_b, qn.field_P, kj.field_g, sj.field_k);
        int var1 = -28 % ((param0 - 15) / 59);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = Chess.field_G;
        try {
          try {
            if ((long)param1 + this.field_a > this.field_r) {
              this.field_r = this.field_a + (long)param1;
            }
            if (this.field_h != -1L && (this.field_h > this.field_a ||
              (long)this.field_k + this.field_h < this.field_a)) {
              this.b(17357);
            }
            if ((long)param2 != this.field_h &&
              ((long)param1 + this.field_a) > ((long)this.field_o.length + this.field_h)) {
              var5_int = (int)(this.field_h - (this.field_a - (long)this.field_o.length));
              ne.a(param3, param0, this.field_o, (int)(-this.field_h + this.field_a), var5_int);
              param0 = param0 + var5_int;
              param1 = param1 - var5_int;
              this.field_a = this.field_a + (long)var5_int;
              this.field_k = this.field_o.length;
              this.b(17357);
            }
            if (this.field_o.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (-1L == this.field_h) {
                this.field_h = this.field_a;
              }
              ne.a(param3, param0, this.field_o, (int)(-this.field_h + this.field_a), param1);
              this.field_a = this.field_a + (long)param1;
              if ((long)this.field_k < this.field_a - this.field_h) {
                this.field_k = (int)(-this.field_h + this.field_a);
              }
              return;
            }
            if (~this.field_p != ~this.field_a) {
              this.field_c.a(this.field_a, -11526);
              this.field_p = this.field_a;
            }
            this.field_c.a(param0, -1036, param3, param1);
            this.field_p = this.field_p + (long)param1;
            if (this.field_p > this.field_b) {
              this.field_b = this.field_p;
            }
            var5_long = -1L;
            if (this.field_a >= this.field_d &&
              ((long)this.field_j + this.field_d) > this.field_a) {
              var5_long = this.field_a;
            } else {
              if (this.field_d >= this.field_a &&
                this.field_d < this.field_a + (long)param1) {
                var5_long = this.field_d;
              }
            }
            var7 = -1L;
            if (this.field_d < this.field_a + (long)param1 &&
              ((long)param1 + this.field_a) <= (this.field_d + (long)this.field_j)) {
              var7 = this.field_a + (long)param1;
            } else {
              if (this.field_a < (long)this.field_j + this.field_d &&
                (this.field_a + (long)param1) >= (this.field_d + (long)this.field_j)) {
                var7 = this.field_d + (long)this.field_j;
              }
            }
            if (-1L < var5_long &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              ne.a(param3, (int)(var5_long + (long)param0 - this.field_a), this.field_i, (int)(var5_long - this.field_d), var9);
            }
            this.field_a = this.field_a + (long)param1;
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
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("lc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, boolean param5) {
        ld var6 = null;
        try {
          var6 = new ld(param2, param0, param3, param1, param4);
          if (param5) {
            field_n = (int[]) null;
          }
          ml.a((byte) 29, var6);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lc.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final long c(byte param0) {
        if (param0 != 109) {
          return 91L;
        }
        return this.field_r;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
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
        var14 = Chess.field_G;
        try {
          try {
            if (param0.length < param2 + param3) {
              throw new ArrayIndexOutOfBoundsException(param3 + param2 - param0.length);
            }
            if (-1L != this.field_h &&
              this.field_a >= this.field_h &&
              this.field_a + (long)param3 <= this.field_h + (long)this.field_k) {
              ne.a(this.field_o, (int)(-this.field_h + this.field_a), param0, param2, param3);
              this.field_a = this.field_a + (long)param3;
              return;
            }
            if (param1 != -19616) {
              return;
            }
            var5_long = this.field_a;
            var7 = param2;
            var8 = param3;
            if (this.field_a >= this.field_d &&
              ((long)this.field_j + this.field_d) > this.field_a) {
              var9_int = (int)(this.field_d - this.field_a + (long)this.field_j);
              if (var9_int > param3) {
                var9_int = param3;
              }
              ne.a(this.field_i, (int)(-this.field_d + this.field_a), param0, param2, var9_int);
              param3 = param3 - var9_int;
              param2 = param2 + var9_int;
              this.field_a = this.field_a + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_i.length < param3) {
              this.field_c.a(this.field_a, -11526);
              this.field_p = this.field_a;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_c.a(param2, param0, param3, (byte) 104);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param3 = param3 - var9_intLifetime1;
                this.field_a = this.field_a + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_p = this.field_p + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.c(0);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_j < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              ne.a(this.field_i, 0, param0, param2, var9_intLifetime1Lifetime1);
              this.field_a = this.field_a + (long)var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_h) {
              if (this.field_h > this.field_a &&
                param3 > 0) {
                var9_intLifetime2 = param2 + (int)(-this.field_a + this.field_h);
                if (param2 + param3 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param3;
                }
                while (var9_intLifetime2 > param2) {
                  param3--;
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  this.field_a = this.field_a + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_h &&
                ((long)var8 + var5_long) > this.field_h) {
                var9 = this.field_h;
              } else {
                if (this.field_h <= var5_long &&
                  var5_long < this.field_h + (long)this.field_k) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < (long)this.field_k + this.field_h &&
                this.field_h + (long)this.field_k <= var5_long + (long)var8) {
                var11 = this.field_h + (long)this.field_k;
              } else {
                if (this.field_h < (var5_long + (long)var8) &&
                  (long)var8 + var5_long <= (long)this.field_k + this.field_h) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                ne.a(this.field_o, (int)(var9 - this.field_h), param0, (int)(var9 - var5_long) + var7, var13);
                if (this.field_a < var11) {
                  param3 = (int)((long)param3 - (-this.field_a + var11));
                  this.field_a = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_p = -1L;
            throw var5;
          }
          if (0 < param3) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var5_ref;
          stackIn_60_1 = new StringBuilder().append("lc.L(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        if (param0 != -9) {
          field_q = false;
        }
        field_l = null;
        field_e = null;
        field_m = null;
        field_f = null;
    }

    private final void c(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = Chess.field_G;
        this.field_j = param0;
        if (~this.field_p != ~this.field_a) {
          this.field_c.a(this.field_a, -11526);
          this.field_p = this.field_a;
        }
        this.field_d = this.field_a;
        while (this.field_j < this.field_i.length) {
          var2 = this.field_i.length - this.field_j;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_c.a(this.field_j, this.field_i, var2, (byte) 50);
          if (var3 != -1) {
            this.field_p = this.field_p + (long)var3;
            this.field_j = this.field_j + var3;
            continue;
          }
          break;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -87) {
          field_m = (um) null;
        }
        this.b(param0 ^ -17308);
        this.field_c.a(10992);
    }

    final void a(long param0, int param1) throws IOException {
        if ((long)param1 > param0) {
          throw new IOException();
        }
        this.field_a = param0;
    }

    lc(eg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_k = 0;
        this.field_h = -1L;
        try {
          this.field_c = param0;
          dupTemp$0 = param0.a((byte) -89);
          this.field_b = dupTemp$0;
          this.field_r = dupTemp$0;
          this.field_o = new byte[param2];
          this.field_a = 0L;
          this.field_i = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "RuneScape clan";
        field_n = new int[128];
        field_l = "Public chat is unavailable while setting up a rated game.";
    }
}
