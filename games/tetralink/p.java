/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class p {
    static int field_m;
    private long field_k;
    private int field_j;
    private byte[] field_e;
    private byte[] field_l;
    private long field_g;
    static String field_c;
    private sa field_h;
    private long field_a;
    private long field_b;
    private int field_f;
    private long field_i;
    private long field_d;

    final long b(int param0) {
        if (param0 != -200000001) {
          this.field_d = 63L;
        }
        return this.field_i;
    }

    final void a(int param0) throws IOException {
        this.a((byte) 66);
        this.field_h.b(0);
        if (param0 != -1) {
          this.field_f = -5;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = TetraLink.field_J;
        try {
          try {
            if ((long)param3 + this.field_k > this.field_i) {
              this.field_i = this.field_k + (long)param3;
            }
            if (this.field_b != -1L && (this.field_b > this.field_k ||
              this.field_b + (long)this.field_f < this.field_k)) {
              this.a((byte) 66);
            }
            if (param0 != -19735) {
              p.b((byte) -23);
            }
            if (this.field_b != -1L &&
              this.field_b + (long)this.field_e.length < this.field_k + (long)param3) {
              var5_int = (int)((long)this.field_e.length - (-this.field_b + this.field_k));
              rd.a(param1, param2, this.field_e, (int)(-this.field_b + this.field_k), var5_int);
              this.field_k = this.field_k + (long)var5_int;
              param2 = param2 + var5_int;
              param3 = param3 - var5_int;
              this.field_f = this.field_e.length;
              this.a((byte) 66);
            }
            if (this.field_e.length >= param3) {
              if (param3 <= 0) {
                return;
              }
              if (this.field_b == -1L) {
                this.field_b = this.field_k;
              }
              rd.a(param1, param2, this.field_e, (int)(-this.field_b + this.field_k), param3);
              this.field_k = this.field_k + (long)param3;
              if ((-this.field_b + this.field_k) > (long)this.field_f) {
                this.field_f = (int)(this.field_k - this.field_b);
              }
              return;
            }
            if (this.field_k != this.field_g) {
              this.field_h.a(this.field_k, false);
              this.field_g = this.field_k;
            }
            this.field_h.a(param0 + 19649, param2, param1, param3);
            this.field_g = this.field_g + (long)param3;
            if (this.field_g > this.field_a) {
              this.field_a = this.field_g;
            }
            var5_long = -1L;
            if (this.field_d <= this.field_k &&
              (this.field_d + (long)this.field_j) > this.field_k) {
              var5_long = this.field_k;
            } else {
              if (this.field_d >= this.field_k &&
                ((long)param3 + this.field_k) > this.field_d) {
                var5_long = this.field_d;
              }
            }
            var7 = -1L;
            if (this.field_d < (this.field_k + (long)param3) &&
              (long)this.field_j + this.field_d >= (long)param3 + this.field_k) {
              var7 = (long)param3 + this.field_k;
            } else {
              if (this.field_k < (long)this.field_j + this.field_d &&
                (long)param3 + this.field_k >= (long)this.field_j + this.field_d) {
                var7 = (long)this.field_j + this.field_d;
              }
            }
            if (-1L < var5_long &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              rd.a(param1, (int)(var5_long + ((long)param2 - this.field_k)), this.field_l, (int)(-this.field_d + var5_long), var9);
            }
            this.field_k = this.field_k + (long)param3;
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
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("p.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        this.field_j = 0;
        if (~this.field_g != ~this.field_k) {
          this.field_h.a(this.field_k, false);
          this.field_g = this.field_k;
        }
        if (!param0) {
          this.field_i = -73L;
        }
        this.field_d = this.field_k;
        while (this.field_l.length > this.field_j) {
          var2 = this.field_l.length - this.field_j;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_h.a(var2, this.field_j, this.field_l, (byte) 115);
          if (var3 == -1) {
            break;
          }
          this.field_j = this.field_j + var3;
          this.field_g = this.field_g + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -80) {
          field_m = 19;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = la.a(il.a(-23718, param0), true);
          if (var2 == null) {
            var2 = "";
          }
          if (param1 != 43) {
            field_m = 25;
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("p.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = TetraLink.field_J;
        if (param0 != 66) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_b != -1L) {
          if (~this.field_b != ~this.field_g) {
            this.field_h.a(this.field_b, false);
            this.field_g = this.field_b;
          }
          this.field_h.a(-128, 0, this.field_e, this.field_f);
          this.field_g = this.field_g + (long)this.field_f;
          if (this.field_g > this.field_a) {
            this.field_a = this.field_g;
          }
          var2 = -1L;
          if (this.field_b >= this.field_d &&
            this.field_b < (this.field_d + (long)this.field_j)) {
            var2 = this.field_b;
          } else {
            if (this.field_b <= this.field_d &&
              (this.field_b + (long)this.field_f) > this.field_d) {
              var2 = this.field_d;
            }
          }
          var4 = -1L;
          if (((long)this.field_f + this.field_b) > this.field_d &&
            this.field_d + (long)this.field_j >= this.field_b + (long)this.field_f) {
            var4 = (long)this.field_f + this.field_b;
          } else {
            if ((this.field_d + (long)this.field_j) > this.field_b) {
              if (this.field_b + (long)this.field_f < (long)this.field_j + this.field_d) {
                if (-1L < var2 &&
                  var2 < var4) {
                  var6 = (int)(var4 - var2);
                  rd.a(this.field_e, (int)(var2 - this.field_b), this.field_l, (int)(var2 - this.field_d), var6);
                }
                this.field_f = 0;
                this.field_b = -1L;
                decompiledFrameRemainder0 = false;
              }
              else {
                var4 = this.field_d + (long)this.field_j;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (-1L < var2 &&
              var2 < var4) {
              var6Lifetime1 = (int)(var4 - var2);
              rd.a(this.field_e, (int)(var2 - this.field_b), this.field_l, (int)(var2 - this.field_d), var6Lifetime1);
            }
            this.field_f = 0;
            this.field_b = -1L;
          }
        }

    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != 66) {
          return;
        }
        try {
          this.a(param0, param0.length, 0, (byte) 120);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
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
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = TetraLink.field_J;
        try {
          try {
            if (param1 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(param2 + param1 - param0.length);
            }
            if (-1L != this.field_b &&
              this.field_b <= this.field_k &&
              (this.field_b + (long)this.field_f) >= ((long)param1 + this.field_k)) {
              rd.a(this.field_e, (int)(this.field_k - this.field_b), param0, param2, param1);
              this.field_k = this.field_k + (long)param1;
              return;
            }
            var5_long = this.field_k;
            var7 = param2;
            if (param3 <= 31) {
              field_m = -43;
            }
            var8 = param1;
            if (this.field_d <= this.field_k &&
              this.field_k < (long)this.field_j + this.field_d) {
              var9_int = (int)(-this.field_k + (this.field_d + (long)this.field_j));
              if (param1 < var9_int) {
                var9_int = param1;
              }
              rd.a(this.field_l, (int)(this.field_k - this.field_d), param0, param2, var9_int);
              param2 = param2 + var9_int;
              param1 = param1 - var9_int;
              this.field_k = this.field_k + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_l.length) {
              this.field_h.a(this.field_k, false);
              this.field_g = this.field_k;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_h.a(param1, param2, param0, (byte) -121);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param1 = param1 - var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.a(true);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_j) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              rd.a(this.field_l, 0, param0, param2, var9_intLifetime1Lifetime1);
              this.field_k = this.field_k + (long)var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (this.field_b != -1L) {
              if (this.field_k < this.field_b) {
                stackIn_29_0 = ~param1;
                stackIn_29_1 = -1;
                if (stackIn_29_0 < stackIn_29_1) {
                  var9_intLifetime2 = param2 + (int)(this.field_b - this.field_k);
                  if (var9_intLifetime2 > param1 + param2) {
                    var9_intLifetime2 = param1 + param2;
                  }
                  while (var9_intLifetime2 > param2) {
                    incrementValue$0 = param2;
                    param2++;
                    param0[incrementValue$0] = (byte) 0;
                    param1--;
                    this.field_k = this.field_k + 1L;
                  }
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_b &&
                var5_long + (long)var8 > this.field_b) {
                var9 = this.field_b;
              } else {
                if (var5_long >= this.field_b &&
                  (long)this.field_f + this.field_b > var5_long) {
                  var9 = var5_long;
                }
              }
              if (var5_long < ((long)this.field_f + this.field_b) &&
                ((long)var8 + var5_long) >= (this.field_b + (long)this.field_f)) {
                var11 = this.field_b + (long)this.field_f;
              } else {
                if (this.field_b < ((long)var8 + var5_long) &&
                  this.field_b + (long)this.field_f >= var5_long + (long)var8) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                rd.a(this.field_e, (int)(-this.field_b + var9), param0, var7 + (int)(-var5_long + var9), var13);
                if (var11 > this.field_k) {
                  param1 = (int)((long)param1 - (var11 - this.field_k));
                  this.field_k = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
          if (param1 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("p.C(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param0 >= 0L) {
          this.field_k = param0;
          if (param1 != 0) {
            this.field_b = -9L;
          }
          return;
        }
        throw new IOException();
    }

    p(sa param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_b = -1L;
        this.field_f = 0;
        this.field_d = -1L;
        try {
          this.field_h = param0;
          dupTemp$0 = param0.a(-1);
          this.field_a = dupTemp$0;
          this.field_i = dupTemp$0;
          this.field_l = new byte[param1];
          this.field_e = new byte[param2];
          this.field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "The invitation has been withdrawn.";
    }
}
