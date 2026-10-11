/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud {
    private long field_f;
    private byte[] field_k;
    private long field_b;
    private long field_i;
    private byte[] field_l;
    private long field_m;
    private int field_e;
    static String field_q;
    private bg field_g;
    static go[] field_h;
    private int field_c;
    static uf field_o;
    static volatile boolean field_n;
    static String field_j;
    private long field_p;
    private long field_a;
    static int field_d;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (param0 == -1) {
          this.field_e = 0;
          if (~this.field_m != ~this.field_b) {
            this.field_g.a((byte) 102, this.field_m);
            this.field_b = this.field_m;
          }
          this.field_p = this.field_m;
          while (this.field_e < this.field_k.length) {
            var2 = this.field_k.length - this.field_e;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.field_g.b(this.field_e, this.field_k, var2, 11812);
            if (var3 == -1) {
              break;
            }
            this.field_e = this.field_e + var3;
            this.field_b = this.field_b + (long)var3;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param3 != -85) {
            var9 = (int[]) null;
            ud.a(78, -120, -127, (byte) -20, (int[]) null);
          }
          while (true) {
            param0--;
            if (param0 < 0) {
              return;
            }
            var10 = param4;
            var5 = var10;
            var6 = param1;
            var7 = param2;
            var10[var6] = var7 + pk.a(8355711, var10[var6] >> 1);
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ud.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void b(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        if (param0 != -1) {
          this.field_i = -96L;
        }
        if (this.field_a != -1L) {
          if (this.field_a != this.field_b) {
            this.field_g.a((byte) 66, this.field_a);
            this.field_b = this.field_a;
          }
          this.field_g.a(this.field_c, this.field_l, 0, param0 ^ 17173);
          this.field_b = this.field_b + (long)this.field_c;
          if (this.field_i < this.field_b) {
            this.field_i = this.field_b;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_p <= this.field_a &&
            (long)this.field_e + this.field_p > this.field_a) {
            var2 = this.field_a;
          } else {
            if (this.field_p >= this.field_a &&
              this.field_p < this.field_a + (long)this.field_c) {
              var2 = this.field_p;
            }
          }
          if (this.field_a + (long)this.field_c > this.field_p &&
            (long)this.field_e + this.field_p >= this.field_a + (long)this.field_c) {
            var4 = (long)this.field_c + this.field_a;
          } else {
            if (this.field_p + (long)this.field_e > this.field_a &&
              (this.field_p + (long)this.field_e) <= (this.field_a + (long)this.field_c)) {
              var4 = (long)this.field_e + this.field_p;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            bc.a(this.field_l, (int)(-this.field_a + var2), this.field_k, (int)(-this.field_p + var2), var6);
          }
          this.field_c = 0;
          this.field_a = -1L;
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = HoldTheLine.field_D;
        try {
          try {
            if ((long)param1 + this.field_m > this.field_f) {
              this.field_f = (long)param1 + this.field_m;
            }
            if (-1L != this.field_a && (this.field_a > this.field_m ||
              this.field_m > (this.field_a + (long)this.field_c))) {
              this.b(-1);
            }
            if (this.field_a != -1L &&
              (long)param1 + this.field_m > this.field_a + (long)this.field_l.length) {
              var5_int = (int)(this.field_a - (this.field_m - (long)this.field_l.length));
              bc.a(param3, param2, this.field_l, (int)(this.field_m - this.field_a), var5_int);
              param1 = param1 - var5_int;
              this.field_m = this.field_m + (long)var5_int;
              param2 = param2 + var5_int;
              this.field_c = this.field_l.length;
              this.b(-1);
            }
            if (param0 < 124) {
              this.c(110);
            }
            if (this.field_l.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (-1L == this.field_a) {
                this.field_a = this.field_m;
              }
              bc.a(param3, param2, this.field_l, (int)(-this.field_a + this.field_m), param1);
              this.field_m = this.field_m + (long)param1;
              if ((long)this.field_c < this.field_m - this.field_a) {
                this.field_c = (int)(-this.field_a + this.field_m);
              }
              return;
            }
            if (~this.field_m != ~this.field_b) {
              this.field_g.a((byte) 84, this.field_m);
              this.field_b = this.field_m;
            }
            this.field_g.a(param1, param3, param2, -17174);
            this.field_b = this.field_b + (long)param1;
            if (this.field_b > this.field_i) {
              this.field_i = this.field_b;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_p <= this.field_m &&
              (long)this.field_e + this.field_p > this.field_m) {
              var5_long = this.field_m;
            } else {
              if (this.field_p >= this.field_m &&
                (long)param1 + this.field_m > this.field_p) {
                var5_long = this.field_p;
              }
            }
            if ((this.field_m + (long)param1) > this.field_p &&
              this.field_p + (long)this.field_e >= this.field_m + (long)param1) {
              var7 = this.field_m + (long)param1;
            } else {
              if (this.field_m < (this.field_p + (long)this.field_e) &&
                this.field_p + (long)this.field_e <= (long)param1 + this.field_m) {
                var7 = (long)this.field_e + this.field_p;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              bc.a(param3, (int)((long)param2 + (var5_long - this.field_m)), this.field_k, (int)(var5_long - this.field_p), var9);
            }
            this.field_m = this.field_m + (long)param1;
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
          stackIn_52_1 = new StringBuilder().append("ud.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final long c(int param0) {
        if (param0 != -32261) {
          field_n = false;
        }
        return this.field_f;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
          this.a(-1, param1, param0.length, param0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void d(int param0) throws IOException {
        this.b(param0);
        this.field_g.a((byte) 20);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var14 = HoldTheLine.field_D;
        try {
          try {
            if (param1 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
            }
            if (this.field_a != (long)param0 &&
              this.field_a <= this.field_m &&
              ((long)this.field_c + this.field_a) >= ((long)param2 + this.field_m)) {
              bc.a(this.field_l, (int)(-this.field_a + this.field_m), param3, param1, param2);
              this.field_m = this.field_m + (long)param2;
              return;
            }
            var5_long = this.field_m;
            var7 = param1;
            var8 = param2;
            if (this.field_m >= this.field_p &&
              this.field_p + (long)this.field_e > this.field_m) {
              var9_int = (int)((long)this.field_e + (this.field_p - this.field_m));
              if (var9_int > param2) {
                var9_int = param2;
              }
              bc.a(this.field_k, (int)(this.field_m - this.field_p), param3, param1, var9_int);
              this.field_m = this.field_m + (long)var9_int;
              param1 = param1 + var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_k.length < param2) {
              this.field_g.a((byte) 47, this.field_m);
              this.field_b = this.field_m;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_g.b(param1, param3, param2, 11812);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param1 = param1 + var9_intLifetime1;
                this.field_m = this.field_m + (long)var9_intLifetime1;
                this.field_b = this.field_b + (long)var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.a(-1);
              var9_intLifetime1Lifetime1 = param2;
              if (var9_intLifetime1Lifetime1 > this.field_e) {
                var9_intLifetime1Lifetime1 = this.field_e;
              }
              bc.a(this.field_k, 0, param3, param1, var9_intLifetime1Lifetime1);
              param1 = param1 + var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              this.field_m = this.field_m + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_m < this.field_a &&
                0 < param2) {
                var9_intLifetime2 = param1 + (int)(this.field_a - this.field_m);
                if (var9_intLifetime2 > param2 + param1) {
                  var9_intLifetime2 = param2 + param1;
                }
                while (var9_intLifetime2 > param1) {
                  incrementValue$0 = param1;
                  param1++;
                  param3[incrementValue$0] = (byte) 0;
                  param2--;
                  this.field_m = this.field_m + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_a &&
                var5_long + (long)var8 > this.field_a) {
                var9 = this.field_a;
              } else {
                if (this.field_a <= var5_long &&
                  this.field_a + (long)this.field_c > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (((long)this.field_c + this.field_a) > var5_long &&
                ((long)var8 + var5_long) >= (this.field_a + (long)this.field_c)) {
                var11 = this.field_a + (long)this.field_c;
              } else {
                if (this.field_a < (var5_long + (long)var8) &&
                  this.field_a + (long)this.field_c >= var5_long + (long)var8) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                bc.a(this.field_l, (int)(var9 - this.field_a), param3, var7 + (int)(-var5_long + var9), var13);
                if (this.field_m < var11) {
                  param2 = (int)((long)param2 - (-this.field_m + var11));
                  this.field_m = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
          if (param2 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          if (param0 != 25971) {
            this.c(71);
          }
          this.field_m = param1;
          return;
        }
        throw new IOException();
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 != 121) {
          field_j = (String) null;
        }
        field_h = null;
        field_q = null;
        field_j = null;
    }

    ud(bg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_c = 0;
        this.field_p = -1L;
        this.field_a = -1L;
        try {
          this.field_g = param0;
          dupTemp$0 = param0.a(false);
          this.field_i = dupTemp$0;
          this.field_f = dupTemp$0;
          this.field_l = new byte[param2];
          this.field_m = 0L;
          this.field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Visit the Account Management section on the main site to view.";
        field_n = false;
        field_j = "That name is not available";
        field_d = 1;
    }
}
