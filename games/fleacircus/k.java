/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k {
    private long field_k;
    private byte[] field_f;
    private long field_g;
    private int field_h;
    static int[] field_l;
    static bi[] field_c;
    private long field_n;
    private rl field_m;
    private byte[] field_b;
    private int field_i;
    private long field_j;
    static int field_a;
    private long field_d;
    static String field_e;
    private long field_o;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
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
        var14 = fleas.field_A ? 1 : 0;
        try {
          try {
            if (param0.length < param2 + param1) {
              throw new ArrayIndexOutOfBoundsException(param2 + (param1 - param0.length));
            }
            if (param3 != 6520) {
              this.field_n = -84L;
            }
            if (this.field_j != -1L &&
              this.field_d >= this.field_j &&
              (long)this.field_h + this.field_j >= (long)param2 + this.field_d) {
              dm.a(this.field_b, (int)(-this.field_j + this.field_d), param0, param1, param2);
              this.field_d = this.field_d + (long)param2;
              return;
            }
            var5_long = this.field_d;
            var7 = param1;
            var8 = param2;
            if (this.field_d >= this.field_g &&
              ((long)this.field_i + this.field_g) > this.field_d) {
              var9_int = (int)((long)this.field_i - (-this.field_g + this.field_d));
              if (param2 < var9_int) {
                var9_int = param2;
              }
              dm.a(this.field_f, (int)(-this.field_g + this.field_d), param0, param1, var9_int);
              param2 = param2 - var9_int;
              param1 = param1 + var9_int;
              this.field_d = this.field_d + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param2 > this.field_f.length) {
              this.field_m.a(this.field_d, (byte) -127);
              this.field_k = this.field_d;
              while (0 < param2) {
                var9_intLifetime1 = this.field_m.a(param0, param1, 0, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_k = this.field_k + (long)var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.b(98);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_i < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_i;
              }
              dm.a(this.field_f, 0, param0, param1, var9_intLifetime1Lifetime1);
              param1 = param1 + var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_j) {
              if (this.field_d < this.field_j) {
                stackIn_30_0 = 0;
                stackIn_30_1 = param2;
                if (stackIn_30_0 < stackIn_30_1) {
                  var9_intLifetime2 = (int)(-this.field_d + this.field_j) + param1;
                  if (param2 + param1 < var9_intLifetime2) {
                    var9_intLifetime2 = param1 + param2;
                  }
                  while (var9_intLifetime2 > param1) {
                    incrementValue$0 = param1;
                    param1++;
                    param0[incrementValue$0] = (byte) 0;
                    param2--;
                    this.field_d = this.field_d + 1L;
                  }
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_j >= var5_long &&
                (long)var8 + var5_long > this.field_j) {
                var9 = this.field_j;
              } else {
                if (this.field_j <= var5_long &&
                  var5_long < (this.field_j + (long)this.field_h)) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (this.field_j + (long)this.field_h) &&
                (var5_long + (long)var8) >= (this.field_j + (long)this.field_h)) {
                var11 = (long)this.field_h + this.field_j;
              } else {
                if ((long)var8 + var5_long > this.field_j &&
                  ((long)var8 + var5_long) <= (this.field_j + (long)this.field_h)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                dm.a(this.field_b, (int)(var9 - this.field_j), param0, var7 + (int)(var9 - var5_long), var13);
                if (var11 > this.field_d) {
                  param2 = (int)((long)param2 - (var11 - this.field_d));
                  this.field_d = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
          if (param2 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("k.I(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0 != -40) {
          field_a = 108;
        }
        df.field_b.d(param2, param1);
        if (!param3) {
        } else {
          var4 = 2 * (bf.field_b % df.field_b.field_w);
          if (df.field_b.field_w <= var4) {
            var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
          }
          if (var4 < 10) {
            var4 = 10;
          } else {
            if (!(-40 + df.field_b.field_w >= var4)) {
              var4 = -40 + df.field_b.field_w;
            }
          }
          qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          try {
            var5_int = -66 / ((29 - param3) / 41);
            if (this.field_o < (long)param2 + this.field_d) {
              this.field_o = this.field_d + (long)param2;
            }
            if (this.field_j != -1L && (this.field_d < this.field_j ||
              this.field_d > this.field_j + (long)this.field_h)) {
              this.a((byte) -109);
            }
            if (this.field_j != -1L &&
              this.field_d + (long)param2 > this.field_j + (long)this.field_b.length) {
              var6_int = (int)(-this.field_d - (-this.field_j - (long)this.field_b.length));
              dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), var6_int);
              param0 = param0 + var6_int;
              this.field_d = this.field_d + (long)var6_int;
              param2 = param2 - var6_int;
              this.field_h = this.field_b.length;
              this.a((byte) 41);
            }
            if (this.field_b.length >= param2) {
              if (param2 <= 0) {
                return;
              }
              if (this.field_j == -1L) {
                this.field_j = this.field_d;
              }
              dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), param2);
              this.field_d = this.field_d + (long)param2;
              if ((long)this.field_h < (this.field_d - this.field_j)) {
                this.field_h = (int)(this.field_d - this.field_j);
              }
              return;
            }
            if (this.field_d != this.field_k) {
              this.field_m.a(this.field_d, (byte) -114);
              this.field_k = this.field_d;
            }
            this.field_m.a((byte) 110, param2, param0, param1);
            this.field_k = this.field_k + (long)param2;
            if (this.field_n < this.field_k) {
              this.field_n = this.field_k;
            }
            var6 = -1L;
            var8 = -1L;
            if (this.field_d >= this.field_g &&
              (this.field_g + (long)this.field_i) > this.field_d) {
              var6 = this.field_d;
            } else {
              if (this.field_g >= this.field_d &&
                this.field_g < ((long)param2 + this.field_d)) {
                var6 = this.field_g;
              }
            }
            if (this.field_g < ((long)param2 + this.field_d) &&
              (long)this.field_i + this.field_g >= this.field_d + (long)param2) {
              var8 = (long)param2 + this.field_d;
            } else {
              if (this.field_d < (long)this.field_i + this.field_g &&
                ((long)this.field_i + this.field_g) <= (this.field_d + (long)param2)) {
                var8 = this.field_g + (long)this.field_i;
              }
            }
            if (var6 > -1L &&
              var6 < var8) {
              var10 = (int)(-var6 + var8);
              dm.a(param1, (int)((long)param0 - (-var6 + this.field_d)), this.field_f, (int)(-this.field_g + var6), var10);
            }
            this.field_d = this.field_d + (long)param2;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("k.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != -28354) {
          return;
        }
        if (sg.field_h != null) {
          sg.field_h.h(param0 ^ -28354);
          sg.field_h = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -40) {
          k.c(70);
        }
        field_e = null;
        field_l = null;
        field_c = null;
    }

    private final void a(byte param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        var8 = fleas.field_A ? 1 : 0;
        var2 = 50 / ((param0 + 24) / 54);
        if (-1L != this.field_j) {
          if (~this.field_k != ~this.field_j) {
            this.field_m.a(this.field_j, (byte) -114);
            this.field_k = this.field_j;
          }
          this.field_m.a((byte) 109, this.field_h, 0, this.field_b);
          this.field_k = this.field_k + (long)this.field_h;
          if (this.field_k > this.field_n) {
            this.field_n = this.field_k;
          }
          var3 = -1L;
          var5 = -1L;
          if (this.field_j >= this.field_g &&
            this.field_j < this.field_g + (long)this.field_i) {
            var3 = this.field_j;
          } else {
            if (this.field_j <= this.field_g &&
              ((long)this.field_h + this.field_j) > this.field_g) {
              var3 = this.field_g;
            }
          }
          if (this.field_g < ((long)this.field_h + this.field_j) &&
            ((long)this.field_h + this.field_j) <= (this.field_g + (long)this.field_i)) {
            var5 = (long)this.field_h + this.field_j;
          } else {
            if (((long)this.field_i + this.field_g) > this.field_j &&
              ((long)this.field_h + this.field_j) >= (this.field_g + (long)this.field_i)) {
              var5 = this.field_g + (long)this.field_i;
            }
          }
          if (var3 > -1L &&
            var3 < var5) {
            var7 = (int)(-var3 + var5);
            dm.a(this.field_b, (int)(var3 - this.field_j), this.field_f, (int)(-this.field_g + var3), var7);
          }
          this.field_h = 0;
          this.field_j = -1L;
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 47) {
          k.a(92, 3, 126, true);
        }
        this.field_i = 0;
        if (~this.field_d != ~this.field_k) {
          this.field_m.a(this.field_d, (byte) -121);
          this.field_k = this.field_d;
        }
        this.field_g = this.field_d;
        while (this.field_f.length > this.field_i) {
          var2 = -this.field_i + this.field_f.length;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_m.a(this.field_f, this.field_i, 0, var2);
          if (var3 == -1) {
            break;
          }
          this.field_k = this.field_k + (long)var3;
          this.field_i = this.field_i + var3;
        }
    }

    final static void a(int param0, wk param1) {
        try {
          uc.a((byte) 5, true, param1);
          if (param0 != 0) {
            k.a(-15, -38, 84, true);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "k.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          if (param0 > -103) {
            this.field_b = (byte[]) null;
          }
          this.field_d = param1;
          return;
        }
        throw new IOException();
    }

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param1, 0, param1.length, 6520);
          if (param0 != 631) {
            this.field_b = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("k.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) 74);
        if (param0 != -70) {
          k.a(-30, -73, -71, false);
        }
        this.field_m.b(-1);
    }

    final long c(byte param0) {
        if (param0 >= -46) {
          return 49L;
        }
        return this.field_o;
    }

    k(rl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_h = 0;
        this.field_j = -1L;
        try {
          this.field_m = param0;
          dupTemp$0 = param0.c(2049105808);
          this.field_n = dupTemp$0;
          this.field_o = dupTemp$0;
          this.field_b = new byte[param2];
          this.field_f = new byte[param1];
          this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_a = 16777215;
        field_e = "Please try again in a few minutes.";
    }
}
