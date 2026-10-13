/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jg {
    static long field_k;
    private byte[] field_e;
    private long field_h;
    static String field_p;
    static RgbSprite field_a;
    private long field_m;
    private long field_l;
    private long field_i;
    private long field_o;
    static mf field_d;
    private long field_j;
    static String field_q;
    private byte[] field_g;
    private int field_b;
    private rn field_n;
    private int field_f;
    static byte[] field_c;

    final void a(int param0, long param1) throws IOException {
        if (param1 < (long)param0) {
          throw new IOException();
        }
        this.field_l = param1;
    }

    final static boolean b(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return true;
        }
        stackIn_7_0 = (null != sq.field_c) || (TooltipSprite.field_p);
        return stackIn_7_0;
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 200000000) {
          this.field_f = 0;
          if (this.field_j != this.field_l) {
            this.field_n.a(-58, this.field_l);
            this.field_j = this.field_l;
          }
          this.field_i = this.field_l;
          while (this.field_f < this.field_g.length) {
            var2 = this.field_g.length - this.field_f;
            if (var2 > 200000000) {
              var2 = 200000000;
            }
            var3 = this.field_n.a(this.field_f, this.field_g, var2, (byte) 123);
            if (var3 == -1) {
              break;
            }
            this.field_f = this.field_f + var3;
            this.field_j = this.field_j + (long)var3;
          }
          return;
        }
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
        lj var15 = null;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (param3.length < param0 + param1) {
              throw new ArrayIndexOutOfBoundsException(param0 + param1 - param3.length);
            }
            if (this.field_o != -1L &&
              this.field_l >= this.field_o &&
              (long)this.field_b + this.field_o >= this.field_l + (long)param0) {
              pm.a(this.field_e, (int)(this.field_l - this.field_o), param3, param1, param0);
              this.field_l = this.field_l + (long)param0;
              return;
            }
            if (param2 <= 116) {
              var15 = (lj) null;
              jg.a(36, (PlayerBoard) null, (lj) null, -113, -57, 112);
            }
            var5_long = this.field_l;
            var7 = param1;
            var8 = param0;
            if (this.field_l >= this.field_i &&
              this.field_l < this.field_i + (long)this.field_f) {
              var9_int = (int)((long)this.field_f + (this.field_i - this.field_l));
              if (var9_int > param0) {
                var9_int = param0;
              }
              pm.a(this.field_g, (int)(this.field_l - this.field_i), param3, param1, var9_int);
              this.field_l = this.field_l + (long)var9_int;
              param1 = param1 + var9_int;
              param0 = param0 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_g.length < param0) {
              this.field_n.a(-18, this.field_l);
              this.field_j = this.field_l;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_n.a(param1, param3, param0, (byte) 120);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_j = this.field_j + (long)var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
                this.field_l = this.field_l + (long)var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param0 > 0)) {
              this.b(200000000);
              var9_intLifetime1Lifetime1 = param0;
              if (var9_intLifetime1Lifetime1 > this.field_f) {
                var9_intLifetime1Lifetime1 = this.field_f;
              }
              pm.a(this.field_g, 0, param3, param1, var9_intLifetime1Lifetime1);
              param0 = param0 - var9_intLifetime1Lifetime1;
              param1 = param1 + var9_intLifetime1Lifetime1;
              this.field_l = this.field_l + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_o != -1L) {
              if (this.field_o > this.field_l &&
                param0 > 0) {
                var9_intLifetime2 = (int)(-this.field_l + this.field_o) + param1;
                if (var9_intLifetime2 > param0 + param1) {
                  var9_intLifetime2 = param1 + param0;
                }
                while (param1 < var9_intLifetime2) {
                  incrementValue$0 = param1;
                  param1++;
                  param3[incrementValue$0] = (byte) 0;
                  param0--;
                  this.field_l = this.field_l + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_o &&
                this.field_o < var5_long + (long)var8) {
                var9 = this.field_o;
              } else {
                if (this.field_o <= var5_long &&
                  var5_long < (long)this.field_b + this.field_o) {
                  var9 = var5_long;
                }
              }
              if (((long)this.field_b + this.field_o) > var5_long &&
                (var5_long + (long)var8) >= ((long)this.field_b + this.field_o)) {
                var11 = this.field_o + (long)this.field_b;
              } else {
                if (this.field_o < ((long)var8 + var5_long) &&
                  (long)this.field_b + this.field_o >= (long)var8 + var5_long) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                pm.a(this.field_e, (int)(var9 - this.field_o), param3, var7 + (int)(var9 - var5_long), var13);
                if (var11 > this.field_l) {
                  param0 = (int)((long)param0 - (var11 - this.field_l));
                  this.field_l = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_j = -1L;
            throw var5;
          }
          if (param0 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final void c(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (this.field_o != (long)param0) {
          if (this.field_j != this.field_o) {
            this.field_n.a(-19, this.field_o);
            this.field_j = this.field_o;
          }
          this.field_n.a(0, (byte) -125, this.field_e, this.field_b);
          this.field_j = this.field_j + (long)this.field_b;
          if (this.field_j > this.field_h) {
            this.field_h = this.field_j;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_o >= this.field_i &&
            this.field_o < ((long)this.field_f + this.field_i)) {
            var2 = this.field_o;
          } else {
            if (this.field_o <= this.field_i &&
              this.field_i < (long)this.field_b + this.field_o) {
              var2 = this.field_i;
            }
          }
          if (this.field_o + (long)this.field_b > this.field_i &&
            (long)this.field_f + this.field_i >= this.field_o + (long)this.field_b) {
            var4 = this.field_o + (long)this.field_b;
          } else {
            if (this.field_o < (long)this.field_f + this.field_i &&
              this.field_i + (long)this.field_f <= this.field_o + (long)this.field_b) {
              var4 = (long)this.field_f + this.field_i;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(-var2 + var4);
            pm.a(this.field_e, (int)(-this.field_o + var2), this.field_g, (int)(var2 - this.field_i), var6);
          }
          this.field_b = 0;
          this.field_o = -1L;
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
          if (param1 != -29) {
            this.field_o = -84L;
          }
          this.a(param0.length, 0, 127, param0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "jg.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 27 % ((62 - param0) / 62);
        field_q = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_p = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (this.field_m < (this.field_l + (long)param2)) {
              this.field_m = this.field_l + (long)param2;
            }
            if (this.field_o != (long)param3 && (this.field_l < this.field_o ||
              this.field_l > (long)this.field_b + this.field_o)) {
              this.c(param3 ^ 0);
            }
            if (-1L != this.field_o &&
              ((long)this.field_e.length + this.field_o) < (this.field_l + (long)param2)) {
              var5_int = (int)(-this.field_l + this.field_o + (long)this.field_e.length);
              pm.a(param0, param1, this.field_e, (int)(this.field_l - this.field_o), var5_int);
              param2 = param2 - var5_int;
              this.field_l = this.field_l + (long)var5_int;
              param1 = param1 + var5_int;
              this.field_b = this.field_e.length;
              this.c(param3 ^ 0);
            }
            if (param2 <= this.field_e.length) {
              if (param2 <= 0) {
                return;
              }
              if (this.field_o == -1L) {
                this.field_o = this.field_l;
              }
              pm.a(param0, param1, this.field_e, (int)(this.field_l - this.field_o), param2);
              this.field_l = this.field_l + (long)param2;
              if ((long)this.field_b < this.field_l - this.field_o) {
                this.field_b = (int)(this.field_l - this.field_o);
              }
              return;
            }
            if (~this.field_l != ~this.field_j) {
              this.field_n.a(-98, this.field_l);
              this.field_j = this.field_l;
            }
            this.field_n.a(param1, (byte) -125, param0, param2);
            this.field_j = this.field_j + (long)param2;
            if (this.field_j > this.field_h) {
              this.field_h = this.field_j;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_l >= this.field_i &&
              this.field_i + (long)this.field_f > this.field_l) {
              var5_long = this.field_l;
            } else {
              if (this.field_i >= this.field_l &&
                this.field_l + (long)param2 > this.field_i) {
                var5_long = this.field_i;
              }
            }
            if ((this.field_l + (long)param2) > this.field_i &&
              (this.field_l + (long)param2) <= (this.field_i + (long)this.field_f)) {
              var7 = (long)param2 + this.field_l;
            } else {
              if ((this.field_i + (long)this.field_f) > this.field_l &&
                this.field_i + (long)this.field_f <= this.field_l + (long)param2) {
                var7 = (long)this.field_f + this.field_i;
              }
            }
            if (-1L < var5_long &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              pm.a(param0, (int)(var5_long + ((long)param1 - this.field_l)), this.field_g, (int)(-this.field_i + var5_long), var9);
            }
            this.field_l = this.field_l + (long)param2;
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
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("jg.E(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        this.c(-1);
        if (param0) {
          this.a((byte) -68);
        }
        this.field_n.c(-100);
    }

    final long a(byte param0) {
        if (param0 <= 20) {
          field_d = (mf) null;
        }
        return this.field_m;
    }

    jg(rn param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_o = -1L;
        this.field_i = -1L;
        this.field_b = 0;
        try {
          this.field_n = param0;
          dupTemp$0 = param0.d(-122);
          this.field_h = dupTemp$0;
          this.field_m = dupTemp$0;
          this.field_g = new byte[param1];
          this.field_e = new byte[param2];
          this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, PlayerBoard param1, lj param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        RgbSprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var11 = 0;
        int var12 = 0;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = param1.boardWidth / (param3 << 1) + param0;
          var7 = param1.field_wb / (param3 << 1) + param1.field_wb / (param3 << 3) + param5;
          var8 = gg.field_p[param2.field_o];
          var9 = 96;
          var10 = 512;
          if (param2.field_m < param4) {
            var10 = (param2.field_m << 9) / 25;
            var7 = var7 + (-param2.field_m + 25 << 2) / param3;
            var9Lifetime1 = (param2.field_m << 7) / 25;
          } else {
            if (50 <= param2.field_m) {
              var9Lifetime1 = (75 - param2.field_m << 7) / 25;
              var10 = (75 - param2.field_m << 9) / 25;
              var7 = var7 - (param2.field_m - 50 << 2) / param3;
            } else {
              var9Lifetime1 = 128;
            }
          }
          var11 = (var10 * var8.width >> 7) / param3;
          var12 = (var10 * var8.height >> 7) / param3;
          var8.b(-(var11 >> 1) + var6_int, var7 - (var12 >> 1), var11, var12, var9Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_k = 0L;
        field_q = "OFF";
        field_p = "Drawn";
    }
}
