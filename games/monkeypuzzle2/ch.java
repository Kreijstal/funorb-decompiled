/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    private pl field_b;
    private long field_n;
    private long field_h;
    private int field_m;
    private long field_a;
    private int field_l;
    private long field_e;
    private long field_g;
    private byte[] field_k;
    private long field_f;
    static java.awt.Color field_i;
    private byte[] field_c;
    static ad field_j;
    static lk field_d;

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param1, param1.length, 0, (byte) 117);
          if (param0 != 3805) {
            this.field_k = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("ch.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          em.field_B = 480;
          fg.field_b = 0;
          while (mb.field_e.b(127) > 0) {
            mb.field_e.d(4011);
          }
          if (param0 > -106) {
            field_j = (ad) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ch.K(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          try {
            if (this.field_h + (long)param3 > this.field_n) {
              this.field_n = (long)param3 + this.field_h;
            }
            if (this.field_a != -1L) {
              if (this.field_h >= this.field_a) {
                if ((long)this.field_l + this.field_a < this.field_h) {
                  this.b((byte) -109);
                }
              } else {
                this.b((byte) -109);
              }
            }
            if (this.field_a != -1L &&
              this.field_a + (long)this.field_c.length < (long)param3 + this.field_h) {
              var5_int = (int)(-this.field_h - (-this.field_a - (long)this.field_c.length));
              gl.a(param0, param1, this.field_c, (int)(this.field_h - this.field_a), var5_int);
              this.field_h = this.field_h + (long)var5_int;
              param1 = param1 + var5_int;
              param3 = param3 - var5_int;
              this.field_l = this.field_c.length;
              this.b((byte) -109);
            }
            if (this.field_c.length >= param3) {
              if (param2 < 31) {
                return;
              }
              if (param3 <= 0) {
                return;
              }
              if (this.field_a == -1L) {
                this.field_a = this.field_h;
              }
              gl.a(param0, param1, this.field_c, (int)(this.field_h - this.field_a), param3);
              this.field_h = this.field_h + (long)param3;
              if ((long)this.field_l < -this.field_a + this.field_h) {
                this.field_l = (int)(this.field_h - this.field_a);
              }
              return;
            }
            if (~this.field_h != ~this.field_g) {
              this.field_b.a(0, this.field_h);
              this.field_g = this.field_h;
            }
            this.field_b.a(param1, (byte) 68, param0, param3);
            this.field_g = this.field_g + (long)param3;
            if (this.field_f < this.field_g) {
              this.field_f = this.field_g;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_h >= this.field_e &&
              this.field_h < (this.field_e + (long)this.field_m)) {
              var5_long = this.field_h;
            } else {
              if (this.field_h <= this.field_e &&
                ((long)param3 + this.field_h) > this.field_e) {
                var5_long = this.field_e;
              }
            }
            if ((this.field_h + (long)param3) > this.field_e &&
              (this.field_h + (long)param3) <= ((long)this.field_m + this.field_e)) {
              var7 = this.field_h + (long)param3;
            } else {
              if ((long)this.field_m + this.field_e > this.field_h &&
                (this.field_e + (long)this.field_m) <= (this.field_h + (long)param3)) {
                var7 = (long)this.field_m + this.field_e;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              gl.a(param0, (int)(-this.field_h + (var5_long + (long)param1)), this.field_k, (int)(-this.field_e + var5_long), var9);
            }
            this.field_h = this.field_h + (long)param3;
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
          stackIn_55_0 = var5_ref;
          stackIn_55_1 = new StringBuilder().append("ch.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -9 % ((param0 - 10) / 63);
        field_d = null;
        field_j = null;
    }

    final long c(byte param0) {
        if (param0 > -66) {
          return -86L;
        }
        return this.field_n;
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 <= 18) {
            return;
          }
          try {
            if (param0.length < param1 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + (param2 + param1));
            }
            if (this.field_a != -1L &&
              this.field_h >= this.field_a &&
              (this.field_h + (long)param1) <= ((long)this.field_l + this.field_a)) {
              gl.a(this.field_c, (int)(-this.field_a + this.field_h), param0, param2, param1);
              this.field_h = this.field_h + (long)param1;
              return;
            }
            var5_long = this.field_h;
            var7 = param2;
            var8 = param1;
            if (this.field_h >= this.field_e &&
              ((long)this.field_m + this.field_e) > this.field_h) {
              var9_int = (int)((long)this.field_m - this.field_h + this.field_e);
              if (param1 < var9_int) {
                var9_int = param1;
              }
              gl.a(this.field_k, (int)(this.field_h - this.field_e), param0, param2, var9_int);
              param1 = param1 - var9_int;
              param2 = param2 + var9_int;
              this.field_h = this.field_h + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_k.length) {
              this.field_b.a(0, this.field_h);
              this.field_g = this.field_h;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_b.a(param2, param0, (byte) -128, param1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 + var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
                this.field_h = this.field_h + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.a(-119);
              var9_intLifetime1Lifetime1 = param1;
              if (this.field_m < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_m;
              }
              gl.a(this.field_k, 0, param0, param2, var9_intLifetime1Lifetime1);
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.field_h = this.field_h + (long)var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_h < this.field_a &&
                param1 > 0) {
                var9_intLifetime2 = (int)(-this.field_h + this.field_a) + param2;
                if (var9_intLifetime2 > param2 + param1) {
                  var9_intLifetime2 = param1 + param2;
                }
                while (param2 < var9_intLifetime2) {
                  param1--;
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  this.field_h = this.field_h + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_a >= var5_long &&
                this.field_a < (var5_long + (long)var8)) {
                var9 = this.field_a;
              } else {
                if (this.field_a <= var5_long &&
                  (this.field_a + (long)this.field_l) > var5_long) {
                  var9 = var5_long;
                }
              }
              if ((this.field_a + (long)this.field_l) > var5_long &&
                ((long)var8 + var5_long) >= ((long)this.field_l + this.field_a)) {
                var11 = this.field_a + (long)this.field_l;
              } else {
                if ((var5_long + (long)var8) > this.field_a &&
                  this.field_a + (long)this.field_l >= var5_long + (long)var8) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                gl.a(this.field_c, (int)(var9 - this.field_a), param0, var7 + (int)(-var5_long + var9), var13);
                if (this.field_h < var11) {
                  param1 = (int)((long)param1 - (-this.field_h + var11));
                  this.field_h = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
          if (0 < param1) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("ch.H(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_m = 0;
        if (param0 <= -111) {
          if (this.field_h != this.field_g) {
            this.field_b.a(0, this.field_h);
            this.field_g = this.field_h;
          }
          this.field_e = this.field_h;
          while (this.field_k.length > this.field_m) {
            var2 = this.field_k.length - this.field_m;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.field_b.a(this.field_m, this.field_k, (byte) -126, var2);
            if (var3 == -1) {
              break;
            }
            this.field_m = this.field_m + var3;
            this.field_g = this.field_g + (long)var3;
          }
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        String var8;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -109) {
          var8 = (String) null;
          ch.a((String) null, 104);
        }
        if (this.field_a != -1L) {
          if (this.field_g != this.field_a) {
            this.field_b.a(0, this.field_a);
            this.field_g = this.field_a;
          }
          this.field_b.a(0, (byte) 68, this.field_c, this.field_l);
          this.field_g = this.field_g + (long)this.field_l;
          if (this.field_f < this.field_g) {
            this.field_f = this.field_g;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_a >= this.field_e &&
            (this.field_e + (long)this.field_m) > this.field_a) {
            var2 = this.field_a;
          } else {
            if (this.field_e >= this.field_a &&
              this.field_e < (long)this.field_l + this.field_a) {
              var2 = this.field_e;
            }
          }
          if ((this.field_a + (long)this.field_l) > this.field_e &&
            (this.field_e + (long)this.field_m) >= (this.field_a + (long)this.field_l)) {
            var4 = (long)this.field_l + this.field_a;
          } else {
            if (this.field_a < ((long)this.field_m + this.field_e) &&
              (this.field_e + (long)this.field_m) <= ((long)this.field_l + this.field_a)) {
              var4 = this.field_e + (long)this.field_m;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            gl.a(this.field_c, (int)(var2 - this.field_a), this.field_k, (int)(-this.field_e + var2), var6);
          }
          this.field_a = -1L;
          this.field_l = 0;
        }
    }

    ch(pl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_e = -1L;
        this.field_l = 0;
        this.field_a = -1L;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.c((byte) 124);
          this.field_f = dupTemp$0;
          this.field_n = dupTemp$0;
          this.field_h = 0L;
          this.field_k = new byte[param1];
          this.field_c = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_h = param1;
        if (param0 < 82) {
          ch.b(-87);
        }
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        rb stackIn_10_0 = null;
        rb stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null == pj.field_a) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (rb) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = pl.a((byte) 109, var6);
          if (param1 != -1) {
            stackIn_10_0 = (rb) null;
            return stackIn_10_0;
          }
          if (var2 == null) {
            return null;
          }
          var3 = (rb) (pj.field_a.a((long)var2.hashCode(), false));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_db);
            var4 = pl.a((byte) 126, var7);
            if (var4.equals(var2)) {
              stackIn_20_0 = var3;
              return stackIn_20_0;
            }
            var3 = (rb) (pj.field_a.b(-34));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("ch.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          return;
        }
        this.b((byte) -109);
        this.field_b.a(19808);
    }

    static {
        field_i = new java.awt.Color(10040319);
    }
}
