/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me {
    static ea[] field_k;
    private byte[] field_o;
    private long field_g;
    private long field_b;
    static int field_j;
    private an field_f;
    private long field_n;
    private byte[] field_a;
    private long field_d;
    static String field_l;
    static int field_h;
    private int field_c;
    private long field_i;
    private long field_e;
    private int field_m;

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        if (param0 < 105) {
          return;
        }
        this.field_g = param1;
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int var4 = 0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (param0 != 8) {
            field_k = (ea[]) null;
          }
          var6 = new int[8];
          var3 = var6;
          for (var4 = 0; 8 > var4; var4++) {
            var6[var4] = c.a(param1[var4], ~param2[var4]);
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("me.I(").append(param0).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final long a(byte param0) {
        if (param0 >= -35) {
          field_k = (ea[]) null;
        }
        return this.field_b;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
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
        var10 = MinerDisturbance.field_ab;
        try {
          try {
            if ((long)param1 + this.field_g > this.field_b) {
              this.field_b = this.field_g + (long)param1;
            }
            if (this.field_e != -1L && (this.field_e > this.field_g ||
              this.field_g > (this.field_e + (long)this.field_c))) {
              this.a(26021);
            }
            if (this.field_e != -1L &&
              this.field_e + (long)this.field_a.length < this.field_g + (long)param1) {
              var5_int = (int)((long)this.field_a.length + (this.field_e - this.field_g));
              ai.a(param0, param2, this.field_a, (int)(this.field_g - this.field_e), var5_int);
              this.field_g = this.field_g + (long)var5_int;
              param1 = param1 - var5_int;
              param2 = param2 + var5_int;
              this.field_c = this.field_a.length;
              this.a(26021);
            }
            if (param1 <= this.field_a.length) {
              if (0 >= param1) {
                if (!param3) {
                  me.a(108, true);
                }
                return;
              }
              if (this.field_e == -1L) {
                this.field_e = this.field_g;
              }
              ai.a(param0, param2, this.field_a, (int)(-this.field_e + this.field_g), param1);
              this.field_g = this.field_g + (long)param1;
              if ((long)this.field_c < this.field_g - this.field_e) {
                this.field_c = (int)(this.field_g - this.field_e);
              }
              return;
            }
            if (this.field_g != this.field_d) {
              this.field_f.a(0, this.field_g);
              this.field_d = this.field_g;
            }
            this.field_f.a(param2, param1, param0, 107);
            this.field_d = this.field_d + (long)param1;
            if (this.field_n < this.field_d) {
              this.field_n = this.field_d;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_g >= this.field_i &&
              (long)this.field_m + this.field_i > this.field_g) {
              var5_long = this.field_g;
            } else {
              if (this.field_i >= this.field_g &&
                this.field_i < (this.field_g + (long)param1)) {
                var5_long = this.field_i;
              }
            }
            if ((this.field_g + (long)param1) > this.field_i &&
              (this.field_g + (long)param1) <= ((long)this.field_m + this.field_i)) {
              var7 = this.field_g + (long)param1;
            } else {
              if ((this.field_i + (long)this.field_m) > this.field_g &&
                this.field_g + (long)param1 >= (long)this.field_m + this.field_i) {
                var7 = this.field_i + (long)this.field_m;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              ai.a(param0, (int)((long)param2 - (-var5_long + this.field_g)), this.field_o, (int)(-this.field_i + var5_long), var9);
            }
            this.field_g = this.field_g + (long)param1;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_d = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("me.H(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 63 % ((50 - param0) / 63);
        field_l = null;
        field_k = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param0, 0, param0.length, -1);
          if (param1 <= 111) {
            me.a(-92, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("me.J(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
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
        var14 = MinerDisturbance.field_ab;
        try {
          try {
            if (param0.length < param2 + param1) {
              throw new ArrayIndexOutOfBoundsException(param2 + param1 - param0.length);
            }
            if (this.field_e != (long)param3 &&
              this.field_e <= this.field_g &&
              (this.field_e + (long)this.field_c) >= ((long)param2 + this.field_g)) {
              ai.a(this.field_a, (int)(-this.field_e + this.field_g), param0, param1, param2);
              this.field_g = this.field_g + (long)param2;
              return;
            }
            var5_long = this.field_g;
            var7 = param1;
            var8 = param2;
            if (this.field_g >= this.field_i &&
              ((long)this.field_m + this.field_i) > this.field_g) {
              var9_int = (int)(this.field_i - this.field_g + (long)this.field_m);
              if (var9_int > param2) {
                var9_int = param2;
              }
              ai.a(this.field_o, (int)(this.field_g - this.field_i), param0, param1, var9_int);
              this.field_g = this.field_g + (long)var9_int;
              param1 = param1 + var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_o.length < param2) {
              this.field_f.a(0, this.field_g);
              this.field_d = this.field_g;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_f.b(32, param2, param0, param1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_d = this.field_d + (long)var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
                this.field_g = this.field_g + (long)var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param2)) {
              this.c(20);
              var9_intLifetime1Lifetime1 = param2;
              if (var9_intLifetime1Lifetime1 > this.field_m) {
                var9_intLifetime1Lifetime1 = this.field_m;
              }
              ai.a(this.field_o, 0, param0, param1, var9_intLifetime1Lifetime1);
              param1 = param1 + var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              this.field_g = this.field_g + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_e > this.field_g) {
                stackIn_29_0 = -1;
                stackIn_29_1 = ~param2;
                if (stackIn_29_0 > stackIn_29_1) {
                  var9_intLifetime2 = param1 + (int)(-this.field_g + this.field_e);
                  if (var9_intLifetime2 > param1 + param2) {
                    var9_intLifetime2 = param1 + param2;
                  }
                  while (param1 < var9_intLifetime2) {
                    incrementValue$0 = param1;
                    param1++;
                    param0[incrementValue$0] = (byte) 0;
                    param2--;
                    this.field_g = this.field_g + 1L;
                  }
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_e >= var5_long &&
                var5_long + (long)var8 > this.field_e) {
                var9 = this.field_e;
              } else {
                if (this.field_e <= var5_long &&
                  var5_long < this.field_e + (long)this.field_c) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (long)this.field_c + this.field_e &&
                (var5_long + (long)var8) >= ((long)this.field_c + this.field_e)) {
                var11 = this.field_e + (long)this.field_c;
              } else {
                if ((long)var8 + var5_long > this.field_e &&
                  ((long)this.field_c + this.field_e) >= ((long)var8 + var5_long)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                ai.a(this.field_a, (int)(-this.field_e + var9), param0, var7 + (int)(-var5_long + var9), var13);
                if (var11 > this.field_g) {
                  param2 = (int)((long)param2 - (var11 - this.field_g));
                  this.field_g = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_d = -1L;
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
          stackIn_61_1 = new StringBuilder().append("me.E(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = MinerDisturbance.field_ab;
        if (this.field_e != -1L) {
          if (~this.field_d != ~this.field_e) {
            this.field_f.a(0, this.field_e);
            this.field_d = this.field_e;
          }
          this.field_f.a(0, this.field_c, this.field_a, param0 - 25931);
          this.field_d = this.field_d + (long)this.field_c;
          if (this.field_n < this.field_d) {
            this.field_n = this.field_d;
          }
          var2 = -1L;
          if (this.field_e >= this.field_i &&
            ((long)this.field_m + this.field_i) > this.field_e) {
            var2 = this.field_e;
          } else {
            if (this.field_e <= this.field_i &&
              ((long)this.field_c + this.field_e) > this.field_i) {
              var2 = this.field_i;
            }
          }
          var4 = -1L;
          if (this.field_i < (long)this.field_c + this.field_e &&
            (long)this.field_c + this.field_e <= this.field_i + (long)this.field_m) {
            var4 = this.field_e + (long)this.field_c;
          } else {
            if (this.field_e < this.field_i + (long)this.field_m &&
              (long)this.field_m + this.field_i <= this.field_e + (long)this.field_c) {
              var4 = (long)this.field_m + this.field_i;
            }
          }
          if (-1L < var2 &&
            var2 < var4) {
            var6 = (int)(-var2 + var4);
            ai.a(this.field_a, (int)(-this.field_e + var2), this.field_o, (int)(-this.field_i + var2), var6);
          }
          this.field_e = -1L;
          this.field_c = 0;
        }
        if (param0 != 26021) {
          this.field_m = 24;
        }
    }

    private final void c(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = MinerDisturbance.field_ab;
        this.field_m = 0;
        if (~this.field_d != ~this.field_g) {
          this.field_f.a(0, this.field_g);
          this.field_d = this.field_g;
        }
        this.field_i = this.field_g;
        var2 = 94 % ((-66 - param0) / 53);
        while (this.field_o.length > this.field_m) {
          var3 = -this.field_m + this.field_o.length;
          if (200000000 < var3) {
            var3 = 200000000;
          }
          var4 = this.field_f.b(6, var3, this.field_o, this.field_m);
          if (var4 != -1) {
            this.field_m = this.field_m + var4;
            this.field_d = this.field_d + (long)var4;
            continue;
          }
          break;
        }
    }

    final void b(int param0) throws IOException {
        this.a(param0 ^ -7618);
        this.field_f.b(-110);
        if (param0 != -30821) {
          me.a(-62, false);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 0) {
          mm.a(false, df.field_b, 2, 1, true, 2);
        }
        if (1 == param0) {
          mm.a(false, hl.field_a, 2, 1, true, 2);
        }
        if (param1) {
          me.a(7, false);
        }
    }

    me(an param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_c = 0;
        this.field_e = -1L;
        this.field_i = -1L;
        try {
          this.field_f = param0;
          dupTemp$0 = param0.a((byte) 122);
          this.field_n = dupTemp$0;
          this.field_b = dupTemp$0;
          this.field_o = new byte[param1];
          this.field_g = 0L;
          this.field_a = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = 0;
        field_l = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_k = new ea[2];
    }
}
