/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class o {
    private byte[] field_a;
    private long field_k;
    private long field_l;
    private long field_e;
    private long field_h;
    private byte[] field_g;
    private long field_f;
    private int field_b;
    private long field_i;
    static String field_c;
    private int field_j;
    private ue field_d;

    private final void c(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Torquing.field_u;
        if (this.field_e != -1L) {
          if (~this.field_e != ~this.field_h) {
            this.field_d.a(-2, this.field_e);
            this.field_h = this.field_e;
          }
          this.field_d.a(this.field_b, 2, 0, this.field_g);
          this.field_h = this.field_h + (long)this.field_b;
          if (this.field_k < this.field_h) {
            this.field_k = this.field_h;
          }
          var2 = -1L;
          if (this.field_e >= this.field_f &&
            this.field_e < (long)this.field_j + this.field_f) {
            var2 = this.field_e;
          } else {
            if (this.field_e <= this.field_f &&
              this.field_f < this.field_e + (long)this.field_b) {
              var2 = this.field_f;
            }
          }
          var4 = -1L;
          if (this.field_f < ((long)this.field_b + this.field_e) &&
            (this.field_e + (long)this.field_b) <= (this.field_f + (long)this.field_j)) {
            var4 = this.field_e + (long)this.field_b;
          } else {
            if (this.field_f + (long)this.field_j > this.field_e &&
              (this.field_e + (long)this.field_b) >= ((long)this.field_j + this.field_f)) {
              var4 = this.field_f + (long)this.field_j;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            dk.a(this.field_g, (int)(var2 - this.field_e), this.field_a, (int)(-this.field_f + var2), var6);
          }
          this.field_b = 0;
          this.field_e = -1L;
        }
        if (param0 <= 45) {
          o.b(77);
        }
    }

    final long b(boolean param0) {
        if (!param0) {
          return -35L;
        }
        return this.field_l;
    }

    final void a(boolean param0) throws IOException {
        this.c(116);
        this.field_d.a((byte) -118);
        if (param0) {
          this.b(false);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = Torquing.field_u;
        try {
          try {
            if (this.field_i + (long)param1 > this.field_l) {
              this.field_l = (long)param1 + this.field_i;
            }
            if (this.field_e != -1L) {
              if (this.field_i >= this.field_e) {
                if (this.field_e + (long)this.field_b < this.field_i) {
                  this.c(100);
                }
              } else {
                this.c(100);
              }
            }
            if (this.field_e != -1L &&
              (this.field_i + (long)param1) > ((long)this.field_g.length + this.field_e)) {
              var5_int = (int)((long)this.field_g.length - (this.field_i - this.field_e));
              dk.a(param3, param2, this.field_g, (int)(this.field_i - this.field_e), var5_int);
              param1 = param1 - var5_int;
              this.field_i = this.field_i + (long)var5_int;
              param2 = param2 + var5_int;
              this.field_b = this.field_g.length;
              this.c(55);
            }
            if (this.field_g.length < param1) {
              if (this.field_i != this.field_h) {
                this.field_d.a(-2, this.field_i);
                this.field_h = this.field_i;
              }
              this.field_d.a(param1, 2, param2, param3);
              this.field_h = this.field_h + (long)param1;
              if (this.field_h > this.field_k) {
                this.field_k = this.field_h;
              }
              var5_long = -1L;
              if (this.field_i >= this.field_f &&
                (this.field_f + (long)this.field_j) > this.field_i) {
                var5_long = this.field_i;
              } else {
                if (this.field_i <= this.field_f &&
                  (this.field_i + (long)param1) > this.field_f) {
                  var5_long = this.field_f;
                }
              }
              var7 = -1L;
              if (this.field_i + (long)param1 > this.field_f &&
                ((long)param1 + this.field_i) <= ((long)this.field_j + this.field_f)) {
                var7 = (long)param1 + this.field_i;
              } else {
                if (this.field_f + (long)this.field_j > this.field_i &&
                  (long)param1 + this.field_i >= this.field_f + (long)this.field_j) {
                  var7 = (long)this.field_j + this.field_f;
                }
              }
              if (var5_long > -1L &&
                var5_long < var7) {
                var9 = (int)(var7 - var5_long);
                dk.a(param3, (int)((long)param2 + var5_long - this.field_i), this.field_a, (int)(-this.field_f + var5_long), var9);
              }
              this.field_i = this.field_i + (long)param1;
              return;
            }
            if (param1 > 0) {
              if (this.field_e == -1L) {
                this.field_e = this.field_i;
              }
              dk.a(param3, param2, this.field_g, (int)(-this.field_e + this.field_i), param1);
              this.field_i = this.field_i + (long)param1;
              if ((long)this.field_b < (-this.field_e + this.field_i)) {
                this.field_b = (int)(this.field_i - this.field_e);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_h = -1L;
            throw var5;
          }
          if (param0 != -1) {
            this.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_55_0 = var5_ref;
          stackIn_55_1 = new StringBuilder().append("o.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          field_c = (String) null;
        }
        field_c = null;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Torquing.field_u;
        this.field_j = 0;
        if (this.field_i != this.field_h) {
          this.field_d.a(-2, this.field_i);
          this.field_h = this.field_i;
        }
        this.field_f = this.field_i;
        if (param0 >= -54) {
          this.b(true);
        }
        while (this.field_a.length > this.field_j) {
          var2 = -this.field_j + this.field_a.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_d.a(var2, this.field_j, this.field_a, 15389);
          if (var3 == -1) {
            break;
          }
          this.field_h = this.field_h + (long)var3;
          this.field_j = this.field_j + var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime1Lifetime1;
        var15 = Torquing.field_u;
        try {
          try {
            if (param1.length < param2 + param0) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
            }
            if (-1L != this.field_e &&
              this.field_i >= this.field_e &&
              this.field_e + (long)this.field_b >= this.field_i + (long)param2) {
              dk.a(this.field_g, (int)(-this.field_e + this.field_i), param1, param0, param2);
              this.field_i = this.field_i + (long)param2;
              return;
            }
            var8 = 76 / ((param3 - 1) / 44);
            var5_long = this.field_i;
            var7 = param0;
            var9 = param2;
            if (this.field_f <= this.field_i &&
              (long)this.field_j + this.field_f > this.field_i) {
              var10_int = (int)(this.field_f - this.field_i + (long)this.field_j);
              if (var10_int > param2) {
                var10_int = param2;
              }
              dk.a(this.field_a, (int)(-this.field_f + this.field_i), param1, param0, var10_int);
              this.field_i = this.field_i + (long)var10_int;
              param2 = param2 - var10_int;
              param0 = param0 + var10_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_a.length < param2) {
              this.field_d.a(-2, this.field_i);
              this.field_h = this.field_i;
              while (param2 > 0) {
                var10_intLifetime1 = this.field_d.a(param2, param0, param1, 15389);
                if (var10_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param0 = param0 + var10_intLifetime1;
                this.field_i = this.field_i + (long)var10_intLifetime1;
                param2 = param2 - var10_intLifetime1;
                this.field_h = this.field_h + (long)var10_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param2)) {
              this.a(-70);
              var10_intLifetime1Lifetime1 = param2;
              if (var10_intLifetime1Lifetime1 > this.field_j) {
                var10_intLifetime1Lifetime1 = this.field_j;
              }
              dk.a(this.field_a, 0, param1, param0, var10_intLifetime1Lifetime1);
              param2 = param2 - var10_intLifetime1Lifetime1;
              this.field_i = this.field_i + (long)var10_intLifetime1Lifetime1;
              param0 = param0 + var10_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_i < this.field_e &&
                param2 > 0) {
                var10_intLifetime2 = (int)(this.field_e - this.field_i) + param0;
                if (param2 + param0 < var10_intLifetime2) {
                  var10_intLifetime2 = param2 + param0;
                }
                while (var10_intLifetime2 > param0) {
                  param2--;
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  this.field_i = this.field_i + 1L;
                }
              }
              var10 = -1L;
              var12 = -1L;
              if (var5_long <= this.field_e &&
                this.field_e < ((long)var9 + var5_long)) {
                var10 = this.field_e;
              } else {
                if (var5_long >= this.field_e &&
                  var5_long < (this.field_e + (long)this.field_b)) {
                  var10 = var5_long;
                }
              }
              if ((this.field_e + (long)this.field_b) > var5_long &&
                this.field_e + (long)this.field_b <= var5_long + (long)var9) {
                var12 = this.field_e + (long)this.field_b;
              } else {
                if ((long)var9 + var5_long > this.field_e &&
                  (long)this.field_b + this.field_e >= var5_long + (long)var9) {
                  var12 = var5_long + (long)var9;
                }
              }
              if (var10 > -1L &&
                var10 < var12) {
                var14 = (int)(-var10 + var12);
                dk.a(this.field_g, (int)(-this.field_e + var10), param1, var7 + (int)(var10 - var5_long), var14);
                if (this.field_i < var12) {
                  param2 = (int)((long)param2 - (-this.field_i + var12));
                  this.field_i = var12;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_h = -1L;
            throw var5;
          }
          if (param2 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("o.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_i = param1;
        if (param0) {
          o.b(116);
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          if (param0 != -1) {
            field_c = (String) null;
          }
          this.a(0, param1, param1.length, -78);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "o.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    o(ue param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_e = -1L;
        this.field_f = -1L;
        this.field_b = 0;
        try {
          this.field_d = param0;
          dupTemp$0 = param0.b((byte) 94);
          this.field_k = dupTemp$0;
          this.field_l = dupTemp$0;
          this.field_i = 0L;
          this.field_g = new byte[param2];
          this.field_a = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Your email address is used to identify this account";
    }
}
