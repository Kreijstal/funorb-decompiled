/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td {
    static ai field_o;
    private long field_h;
    static String field_j;
    private long field_d;
    private byte[] field_g;
    private byte[] field_i;
    private long field_l;
    private long field_n;
    private cb field_b;
    static String[] field_f;
    private int field_a;
    private int field_c;
    private long field_k;
    static int field_p;
    private long field_e;
    static int field_m;

    final void a(long param0, int param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        }
        if (param1 != 0) {
          field_f = (String[]) null;
        }
        this.field_l = param0;
    }

    private final void a(byte param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var7Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var2 = -79 / ((52 - param0) / 50);
        if (this.field_d != -1L) {
          if (this.field_h != this.field_d) {
            this.field_b.a(0, this.field_d);
            this.field_h = this.field_d;
          }
          this.field_b.a(0, this.field_i, 494, this.field_c);
          this.field_h = this.field_h + (long)this.field_c;
          if (this.field_h > this.field_k) {
            this.field_k = this.field_h;
          }
          var3 = -1L;
          var5 = -1L;
          if (this.field_d >= this.field_e &&
            this.field_d < ((long)this.field_a + this.field_e)) {
            var3 = this.field_d;
          } else {
            if (this.field_d <= this.field_e &&
              this.field_d + (long)this.field_c > this.field_e) {
              var3 = this.field_e;
            }
          }
          if ((long)this.field_c + this.field_d > this.field_e &&
            (long)this.field_c + this.field_d <= this.field_e + (long)this.field_a) {
            var5 = (long)this.field_c + this.field_d;
          } else {
            if ((this.field_e + (long)this.field_a) > this.field_d) {
              if ((this.field_d + (long)this.field_c) < ((long)this.field_a + this.field_e)) {
                if (var3 > -1L &&
                  var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  ug.a(this.field_i, (int)(var3 - this.field_d), this.field_g, (int)(var3 - this.field_e), var7);
                }
                this.field_d = -1L;
                this.field_c = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                var5 = this.field_e + (long)this.field_a;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (var3 > -1L &&
              var3 < var5) {
              var7Lifetime1 = (int)(-var3 + var5);
              ug.a(this.field_i, (int)(var3 - this.field_d), this.field_g, (int)(var3 - this.field_e), var7Lifetime1);
            }
            this.field_d = -1L;
            this.field_c = 0;
          }
        }

    }

    final static int a(int param0, int param1, boolean param2) {
        if (null == bg.field_c) {
          return -1;
        }
        if (param0 >= nh.field_f &&
          bg.field_c.field_u + nh.field_f > param0 &&
          param1 >= lf.field_Z &&
          param1 < lf.field_Z + bg.field_c.field_v) {
          return 0;
        }
        if (param0 >= qf.field_e &&
          qf.field_e + bg.field_c.field_u > param0 &&
          mf.field_d <= param1 &&
          mf.field_d + bg.field_c.field_v > param1) {
          return 1;
        }
        if (param2) {
          return -1;
        }
        return 95;
    }

    final void a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
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
        try {
          try {
            if ((long)param1 + this.field_l > this.field_n) {
              this.field_n = (long)param1 + this.field_l;
            }
            if (param2) {
              field_j = (String) null;
            }
            if (this.field_d != -1L) {
              if (this.field_l >= this.field_d) {
                if (this.field_l > (this.field_d + (long)this.field_c)) {
                  this.a((byte) -53);
                }
              } else {
                this.a((byte) -53);
              }
            }
            if (this.field_d != -1L &&
              this.field_d + (long)this.field_i.length < (long)param1 + this.field_l) {
              var5_int = (int)((long)this.field_i.length + this.field_d - this.field_l);
              ug.a(param3, param0, this.field_i, (int)(-this.field_d + this.field_l), var5_int);
              this.field_l = this.field_l + (long)var5_int;
              param1 = param1 - var5_int;
              param0 = param0 + var5_int;
              this.field_c = this.field_i.length;
              this.a((byte) 125);
            }
            if (this.field_i.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (this.field_d == -1L) {
                this.field_d = this.field_l;
              }
              ug.a(param3, param0, this.field_i, (int)(this.field_l - this.field_d), param1);
              this.field_l = this.field_l + (long)param1;
              if ((long)this.field_c < -this.field_d + this.field_l) {
                this.field_c = (int)(this.field_l - this.field_d);
              }
              return;
            }
            if (~this.field_l != ~this.field_h) {
              this.field_b.a(0, this.field_l);
              this.field_h = this.field_l;
            }
            this.field_b.a(param0, param3, 494, param1);
            this.field_h = this.field_h + (long)param1;
            if (this.field_k < this.field_h) {
              this.field_k = this.field_h;
            }
            var5_long = -1L;
            if (this.field_e <= this.field_l &&
              this.field_l < (long)this.field_a + this.field_e) {
              var5_long = this.field_l;
            } else {
              if (this.field_l <= this.field_e &&
                ((long)param1 + this.field_l) > this.field_e) {
                var5_long = this.field_e;
              }
            }
            var7 = -1L;
            if (this.field_e < (long)param1 + this.field_l &&
              (this.field_e + (long)this.field_a) >= ((long)param1 + this.field_l)) {
              var7 = (long)param1 + this.field_l;
            } else {
              if ((this.field_e + (long)this.field_a) > this.field_l &&
                ((long)param1 + this.field_l) >= ((long)this.field_a + this.field_e)) {
                var7 = (long)this.field_a + this.field_e;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              ug.a(param3, (int)(-this.field_l + ((long)param0 + var5_long)), this.field_g, (int)(var5_long - this.field_e), var9);
            }
            this.field_l = this.field_l + (long)param1;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_h = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("td.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2;
        int var3;
        this.field_a = 0;
        if (~this.field_h != ~this.field_l) {
          this.field_b.a(0, this.field_l);
          this.field_h = this.field_l;
        }
        this.field_e = this.field_l;
        if (param0) {
          field_m = 126;
        }
        while (this.field_a < this.field_g.length) {
          var2 = this.field_g.length - this.field_a;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_b.a(this.field_g, this.field_a, var2, (byte) -93);
          if (var3 != -1) {
            this.field_a = this.field_a + var3;
            this.field_h = this.field_h + (long)var3;
            continue;
          }
          break;
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != -12539) {
          return;
        }
        field_f = null;
    }

    final static void b(int param0) {
        eh.field_j = oe.c(param0 - 35671);
        ti.field_b = new tc();
        ba.a(true, true, 2);
        if (param0 != 30000) {
          td.a(105, -112, false);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        try {
          try {
            if (param2 + param3 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(param3 + param2 - param1.length);
            }
            if (this.field_d != -1L &&
              this.field_d <= this.field_l &&
              this.field_d + (long)this.field_c >= (long)param3 + this.field_l) {
              ug.a(this.field_i, (int)(this.field_l - this.field_d), param1, param2, param3);
              this.field_l = this.field_l + (long)param3;
              return;
            }
            var5_long = this.field_l;
            var7 = param2;
            var8 = param3;
            if (param0 != 0) {
              field_o = (ai) null;
            }
            if (this.field_l >= this.field_e &&
              this.field_l < ((long)this.field_a + this.field_e)) {
              var9_int = (int)((long)this.field_a - this.field_l + this.field_e);
              if (param3 < var9_int) {
                var9_int = param3;
              }
              ug.a(this.field_g, (int)(this.field_l - this.field_e), param1, param2, var9_int);
              param2 = param2 + var9_int;
              param3 = param3 - var9_int;
              this.field_l = this.field_l + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_g.length < param3) {
              this.field_b.a(0, this.field_l);
              this.field_h = this.field_l;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_b.a(param1, param2, param3, (byte) -109);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_h = this.field_h + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_l = this.field_l + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.a(false);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_a < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_a;
              }
              ug.a(this.field_g, 0, param1, param2, var9_intLifetime1Lifetime1);
              param2 = param2 + var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
              this.field_l = this.field_l + (long)var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_d) {
              if (this.field_d > this.field_l &&
                0 < param3) {
                var9_intLifetime2 = (int)(-this.field_l + this.field_d) + param2;
                if (var9_intLifetime2 > param3 + param2) {
                  var9_intLifetime2 = param2 + param3;
                }
                while (var9_intLifetime2 > param2) {
                  incrementValue$0 = param2;
                  param2++;
                  param1[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_l = this.field_l + 1L;
                }
              }
              var9 = -1L;
              if (this.field_d >= var5_long &&
                (var5_long + (long)var8) > this.field_d) {
                var9 = this.field_d;
              } else {
                if (var5_long >= this.field_d &&
                  this.field_d + (long)this.field_c > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.field_d + (long)this.field_c &&
                (var5_long + (long)var8) >= ((long)this.field_c + this.field_d)) {
                var11 = this.field_d + (long)this.field_c;
              } else {
                if (((long)var8 + var5_long) > this.field_d &&
                  var5_long + (long)var8 <= this.field_d + (long)this.field_c) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                ug.a(this.field_i, (int)(-this.field_d + var9), param1, (int)(var9 - var5_long) + var7, var13);
                if (var11 > this.field_l) {
                  param3 = (int)((long)param3 - (var11 - this.field_l));
                  this.field_l = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_h = -1L;
            throw var5;
          }
          if (param3 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var5_ref;
          stackIn_64_1 = new StringBuilder().append("td.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(0, param0, 0, param0.length);
          if (param1 <= 11) {
            this.field_g = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("td.G(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 < 0 ||
          65536 <= param0) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          param0 = param0 >>> 4;
          var2 += 4;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param1 < 23) {
          field_f = (String[]) null;
        }
        if (1 <= param0) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final long b(boolean param0) {
        if (param0) {
          return -41L;
        }
        return this.field_n;
    }

    final void a(int param0) throws IOException {
        this.a((byte) -56);
        if (param0 < 36) {
          td.a(-31, (byte) 62);
        }
        this.field_b.a(1);
    }

    td(cb param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_c = 0;
        this.field_e = -1L;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.c(-38);
          this.field_k = dupTemp$0;
          this.field_n = dupTemp$0;
          this.field_i = new byte[param2];
          this.field_g = new byte[param1];
          this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_j = "HARD";
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
