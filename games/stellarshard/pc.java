/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc {
    private long field_c;
    private long field_l;
    private byte[] field_h;
    private kb field_f;
    private long field_b;
    private int field_d;
    private long field_e;
    private byte[] field_k;
    private long field_a;
    static int field_g;
    private long field_i;
    private int field_j;
    static boolean field_m;

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
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
        var14 = stellarshard.field_B;
        try {
          try {
            if (param0 + param2 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param2 + param0 - param3.length);
            }
            if (this.field_l != -1L &&
              this.field_c >= this.field_l &&
              (long)param0 + this.field_c <= (long)this.field_d + this.field_l) {
              ri.a(this.field_k, (int)(this.field_c - this.field_l), param3, param2, param0);
              this.field_c = this.field_c + (long)param0;
              return;
            }
            var5_long = this.field_c;
            var7 = param2;
            var8 = param0;
            if (this.field_b <= this.field_c &&
              this.field_c < this.field_b + (long)this.field_j) {
              var9_int = (int)(this.field_b - this.field_c + (long)this.field_j);
              if (var9_int > param0) {
                var9_int = param0;
              }
              ri.a(this.field_h, (int)(-this.field_b + this.field_c), param3, param2, var9_int);
              param2 = param2 + var9_int;
              this.field_c = this.field_c + (long)var9_int;
              param0 = param0 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param0 > this.field_h.length) {
              this.field_f.a(this.field_c, param1 + 2298);
              this.field_i = this.field_c;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_f.a(param0, param2, param3, 1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_i = this.field_i + (long)var9_intLifetime1;
                this.field_c = this.field_c + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param0)) {
              this.b(param1 ^ -5);
              var9_intLifetime1Lifetime1 = param0;
              if (this.field_j < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              ri.a(this.field_h, 0, param3, param2, var9_intLifetime1Lifetime1);
              param0 = param0 - var9_intLifetime1Lifetime1;
              this.field_c = this.field_c + (long)var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (param1 != -93) {
              return;
            }
            if (this.field_l != -1L) {
              if (this.field_l > this.field_c &&
                param0 > 0) {
                var9_intLifetime2 = (int)(this.field_l - this.field_c) + param2;
                if (param2 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param0;
                }
                while (var9_intLifetime2 > param2) {
                  param0--;
                  incrementValue$0 = param2;
                  param2++;
                  param3[incrementValue$0] = (byte) 0;
                  this.field_c = this.field_c + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_l >= var5_long &&
                (var5_long + (long)var8) > this.field_l) {
                var9 = this.field_l;
              } else {
                if (var5_long >= this.field_l &&
                  var5_long < this.field_l + (long)this.field_d) {
                  var9 = var5_long;
                }
              }
              if (this.field_l + (long)this.field_d > var5_long &&
                var5_long + (long)var8 >= (long)this.field_d + this.field_l) {
                var11 = (long)this.field_d + this.field_l;
              } else {
                if (this.field_l < (var5_long + (long)var8) &&
                  (long)var8 + var5_long <= (long)this.field_d + this.field_l) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                ri.a(this.field_k, (int)(var9 - this.field_l), param3, (int)(var9 - var5_long) + var7, var13);
                if (this.field_c < var11) {
                  param0 = (int)((long)param0 - (-this.field_c + var11));
                  this.field_c = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_i = -1L;
            throw var5;
          }
          if (param0 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("pc.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(')').toString());
        }
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = stellarshard.field_B;
        if (this.field_l != -1L) {
          if (~this.field_i != ~this.field_l) {
            this.field_f.a(this.field_l, 2205);
            this.field_i = this.field_l;
          }
          this.field_f.a(this.field_k, false, 0, this.field_d);
          this.field_i = this.field_i + (long)this.field_d;
          if (this.field_e < this.field_i) {
            this.field_e = this.field_i;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_b <= this.field_l &&
            this.field_l < ((long)this.field_j + this.field_b)) {
            var2 = this.field_l;
          } else {
            if (this.field_l <= this.field_b &&
              this.field_l + (long)this.field_d > this.field_b) {
              var2 = this.field_b;
            }
          }
          if (this.field_b < this.field_l + (long)this.field_d &&
            (this.field_l + (long)this.field_d) <= (this.field_b + (long)this.field_j)) {
            var4 = this.field_l + (long)this.field_d;
          } else {
            if (this.field_b + (long)this.field_j > this.field_l &&
              ((long)this.field_d + this.field_l) >= (this.field_b + (long)this.field_j)) {
              var4 = this.field_b + (long)this.field_j;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            ri.a(this.field_k, (int)(var2 - this.field_l), this.field_h, (int)(var2 - this.field_b), var6);
          }
          this.field_l = -1L;
          this.field_d = 0;
        }
        if (param0 < 92) {
          field_g = 104;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        }
        if (param1 != 0) {
          return;
        }
        this.field_c = param0;
    }

    final long c(int param0) {
        if (param0 < 54) {
          this.field_k = (byte[]) null;
        }
        return this.field_a;
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = stellarshard.field_B;
        this.field_j = 0;
        if (this.field_c != this.field_i) {
          this.field_f.a(this.field_c, 2205);
          this.field_i = this.field_c;
        }
        this.field_b = this.field_c;
        if (param0 <= 84) {
          this.field_f = (kb) null;
        }
        while (this.field_j < this.field_h.length) {
          var2 = this.field_h.length - this.field_j;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_f.a(var2, this.field_j, this.field_h, 1);
          if (var3 == -1) {
            break;
          }
          this.field_i = this.field_i + (long)var3;
          this.field_j = this.field_j + var3;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(param1.length, (byte) -93, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ub a(int param0, pf param1, pf param2, byte param3, int param4) {
        RuntimeException var5 = null;
        ub stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ub stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -39) {
            stackIn_2_0 = (ub) null;
            return stackIn_2_0;
          }
          if (tl.a(param2, (byte) -5, param0, param4)) {
            stackIn_7_0 = we.a(param1.a(param4, 16, param0), 1);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ub) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pc.E(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != -4506) {
          this.field_f = (kb) null;
        }
        this.a((byte) 101);
        this.field_f.a(param0 ^ 4590);
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
        var10 = stellarshard.field_B;
        try {
          try {
            if (((long)param0 + this.field_c) > this.field_a) {
              this.field_a = this.field_c + (long)param0;
            }
            if (this.field_l != -1L && (this.field_l > this.field_c ||
              this.field_c > ((long)this.field_d + this.field_l))) {
              this.a((byte) 108);
            }
            if (this.field_l != -1L &&
              ((long)this.field_k.length + this.field_l) < ((long)param0 + this.field_c)) {
              var5_int = (int)(-this.field_c + (this.field_l + (long)this.field_k.length));
              ri.a(param3, param1, this.field_k, (int)(-this.field_l + this.field_c), var5_int);
              param1 = param1 + var5_int;
              this.field_c = this.field_c + (long)var5_int;
              param0 = param0 - var5_int;
              this.field_d = this.field_k.length;
              this.a((byte) 108);
            }
            if (param0 <= this.field_k.length) {
              if (~param0 >= param2) {
                return;
              }
              if (this.field_l == -1L) {
                this.field_l = this.field_c;
              }
              ri.a(param3, param1, this.field_k, (int)(this.field_c - this.field_l), param0);
              this.field_c = this.field_c + (long)param0;
              if ((long)this.field_d < (-this.field_l + this.field_c)) {
                this.field_d = (int)(this.field_c - this.field_l);
              }
              return;
            }
            if (this.field_i != this.field_c) {
              this.field_f.a(this.field_c, param2 ^ -2206);
              this.field_i = this.field_c;
            }
            this.field_f.a(param3, false, param1, param0);
            this.field_i = this.field_i + (long)param0;
            if (this.field_e < this.field_i) {
              this.field_e = this.field_i;
            }
            var5_long = -1L;
            if (this.field_c >= this.field_b &&
              ((long)this.field_j + this.field_b) > this.field_c) {
              var5_long = this.field_c;
            } else {
              if (this.field_c <= this.field_b &&
                this.field_b < (this.field_c + (long)param0)) {
                var5_long = this.field_b;
              }
            }
            var7 = -1L;
            if (this.field_b < ((long)param0 + this.field_c) &&
              (long)param0 + this.field_c <= (long)this.field_j + this.field_b) {
              var7 = this.field_c + (long)param0;
            } else {
              if (this.field_b + (long)this.field_j > this.field_c &&
                (long)this.field_j + this.field_b <= (long)param0 + this.field_c) {
                var7 = this.field_b + (long)this.field_j;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              ri.a(param3, (int)(-this.field_c + ((long)param1 + var5_long)), this.field_h, (int)(var5_long - this.field_b), var9);
            }
            this.field_c = this.field_c + (long)param0;
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
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("pc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    pc(kb param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_b = -1L;
        this.field_l = -1L;
        this.field_d = 0;
        try {
          this.field_f = param0;
          dupTemp$0 = param0.b(-106);
          this.field_e = dupTemp$0;
          this.field_a = dupTemp$0;
          this.field_h = new byte[param1];
          this.field_k = new byte[param2];
          this.field_c = 0L;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = 50;
    }
}
