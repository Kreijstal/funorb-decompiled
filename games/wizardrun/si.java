/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class si {
    private long field_m;
    static String field_b;
    private long field_p;
    private byte[] field_k;
    private byte[] field_a;
    static int field_h;
    private long field_n;
    static String field_g;
    static int field_f;
    private long field_d;
    static hi field_q;
    private int field_l;
    static je[] field_j;
    private int field_i;
    private long field_c;
    private ri field_o;
    private long field_e;

    final void a(byte[] param0, int param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(0, param0, param0.length, (byte) 47);
          if (param1 != 9350) {
            field_j = (je[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("si.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(long param0, byte param1) throws IOException {
        int var4 = -121 / ((param1 + 9) / 48);
        if (0L > param0) {
          throw new IOException();
        }
        this.field_e = param0;
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 != -92) {
          si.a(-38, 97);
        }
        field_q = null;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        try {
          try {
            if (param0 != 18729) {
              return;
            }
            if (((long)param2 + this.field_e) > this.field_n) {
              this.field_n = (long)param2 + this.field_e;
            }
            if (this.field_m != -1L && (this.field_e < this.field_m ||
              (this.field_m + (long)this.field_i) < this.field_e)) {
              this.b(param0 - 24430);
            }
            if (this.field_m != -1L &&
              (long)this.field_k.length + this.field_m < (long)param2 + this.field_e) {
              var5_int = (int)(-this.field_e + (this.field_m + (long)this.field_k.length));
              g.a(param1, param3, this.field_k, (int)(this.field_e - this.field_m), var5_int);
              param2 = param2 - var5_int;
              this.field_e = this.field_e + (long)var5_int;
              param3 = param3 + var5_int;
              this.field_i = this.field_k.length;
              this.b(param0 ^ -24430);
            }
            if (this.field_k.length >= param2) {
              if (0 >= param2) {
                return;
              }
              if (this.field_m == -1L) {
                this.field_m = this.field_e;
              }
              g.a(param1, param3, this.field_k, (int)(this.field_e - this.field_m), param2);
              this.field_e = this.field_e + (long)param2;
              if (this.field_e - this.field_m > (long)this.field_i) {
                this.field_i = (int)(-this.field_m + this.field_e);
              }
              return;
            }
            if (this.field_p != this.field_e) {
              this.field_o.a(this.field_e, (byte) -24);
              this.field_p = this.field_e;
            }
            this.field_o.a(param2, param1, true, param3);
            this.field_p = this.field_p + (long)param2;
            if (this.field_d < this.field_p) {
              this.field_d = this.field_p;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_e >= this.field_c &&
              (this.field_c + (long)this.field_l) > this.field_e) {
              var5_long = this.field_e;
            } else {
              if (this.field_e <= this.field_c &&
                this.field_c < this.field_e + (long)param2) {
                var5_long = this.field_c;
              }
            }
            if ((this.field_e + (long)param2) > this.field_c &&
              ((long)param2 + this.field_e) <= (this.field_c + (long)this.field_l)) {
              var7 = (long)param2 + this.field_e;
            } else {
              if (((long)this.field_l + this.field_c) > this.field_e &&
                (this.field_c + (long)this.field_l) <= ((long)param2 + this.field_e)) {
                var7 = (long)this.field_l + this.field_c;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              g.a(param1, (int)(var5_long + (long)param3 - this.field_e), this.field_a, (int)(var5_long - this.field_c), var9);
            }
            this.field_e = this.field_e + (long)param2;
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
          stackIn_54_0 = var5_ref;
          stackIn_54_1 = new StringBuilder().append("si.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = wizardrun.field_H;
        if (param0 != -5701) {
          si.a(-93, 38);
        }
        if (this.field_m != -1L) {
          if (~this.field_p != ~this.field_m) {
            this.field_o.a(this.field_m, (byte) -24);
            this.field_p = this.field_m;
          }
          this.field_o.a(this.field_i, this.field_k, true, 0);
          this.field_p = this.field_p + (long)this.field_i;
          if (this.field_d < this.field_p) {
            this.field_d = this.field_p;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_c <= this.field_m &&
            this.field_m < (this.field_c + (long)this.field_l)) {
            var2 = this.field_m;
          } else {
            if (this.field_m <= this.field_c &&
              (this.field_m + (long)this.field_i) > this.field_c) {
              var2 = this.field_c;
            }
          }
          if ((this.field_m + (long)this.field_i) > this.field_c &&
            (long)this.field_i + this.field_m <= (long)this.field_l + this.field_c) {
            var4 = (long)this.field_i + this.field_m;
          } else {
            if (this.field_m < ((long)this.field_l + this.field_c) &&
              (long)this.field_l + this.field_c <= (long)this.field_i + this.field_m) {
              var4 = this.field_c + (long)this.field_l;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            g.a(this.field_k, (int)(var2 - this.field_m), this.field_a, (int)(-this.field_c + var2), var6);
          }
          this.field_i = 0;
          this.field_m = -1L;
        }
    }

    final long b(byte param0) {
        if (param0 != 79) {
          field_h = -71;
        }
        return this.field_n;
    }

    private final void c(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 >= -85) {
          return;
        }
        this.field_l = 0;
        if (this.field_p != this.field_e) {
          this.field_o.a(this.field_e, (byte) -24);
          this.field_p = this.field_e;
        }
        this.field_c = this.field_e;
        while (this.field_a.length > this.field_l) {
          var2 = -this.field_l + this.field_a.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_o.a(this.field_a, 4836, this.field_l, var2);
          if (var3 != -1) {
            this.field_p = this.field_p + (long)var3;
            this.field_l = this.field_l + var3;
            continue;
          }
          break;
        }
    }

    final static kl a(int param0, int param1) {
        int var2 = -72 / ((-23 - param0) / 63);
        return sc.a(param1, 12000, 1, false, false, true);
    }

    final void a(int param0) throws IOException {
        this.b(param0 ^ 5700);
        this.field_o.a(param0);
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
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
        var14 = wizardrun.field_H;
        try {
          try {
            if (param2 + param0 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param0));
            }
            if (this.field_m != -1L &&
              this.field_m <= this.field_e &&
              (this.field_m + (long)this.field_i) >= (this.field_e + (long)param2)) {
              g.a(this.field_k, (int)(this.field_e - this.field_m), param1, param0, param2);
              this.field_e = this.field_e + (long)param2;
              return;
            }
            var5_long = this.field_e;
            var7 = param0;
            var8 = param2;
            if (this.field_e >= this.field_c &&
              this.field_e < (long)this.field_l + this.field_c) {
              var9_int = (int)(-this.field_e + this.field_c + (long)this.field_l);
              if (var9_int > param2) {
                var9_int = param2;
              }
              g.a(this.field_a, (int)(-this.field_c + this.field_e), param1, param0, var9_int);
              this.field_e = this.field_e + (long)var9_int;
              param2 = param2 - var9_int;
              param0 = param0 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_a.length < param2) {
              this.field_o.a(this.field_e, (byte) -24);
              this.field_p = this.field_e;
              while (0 < param2) {
                var9_intLifetime1 = this.field_o.a(param1, param3 ^ 4811, param0, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_e = this.field_e + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
                this.field_p = this.field_p + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.c((byte) -121);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_l < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_l;
              }
              g.a(this.field_a, 0, param1, param0, var9_intLifetime1Lifetime1);
              param0 = param0 + var9_intLifetime1Lifetime1;
              this.field_e = this.field_e + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
            }
            if (param3 != 47) {
              si.a((byte) -46);
            }
            if (this.field_m != -1L) {
              if (this.field_m > this.field_e &&
                param2 > 0) {
                var9_intLifetime2 = param0 + (int)(-this.field_e + this.field_m);
                if (var9_intLifetime2 > param0 + param2) {
                  var9_intLifetime2 = param0 + param2;
                }
                while (param0 < var9_intLifetime2) {
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  param2--;
                  this.field_e = this.field_e + 1L;
                }
              }
              var9 = -1L;
              if (this.field_m >= var5_long &&
                var5_long + (long)var8 > this.field_m) {
                var9 = this.field_m;
              } else {
                if (this.field_m <= var5_long &&
                  var5_long < (this.field_m + (long)this.field_i)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if ((long)this.field_i + this.field_m > var5_long &&
                ((long)var8 + var5_long) >= ((long)this.field_i + this.field_m)) {
                var11 = this.field_m + (long)this.field_i;
              } else {
                if (((long)var8 + var5_long) > this.field_m &&
                  (long)this.field_i + this.field_m >= (long)var8 + var5_long) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                g.a(this.field_k, (int)(var9 - this.field_m), param1, (int)(-var5_long + var9) + var7, var13);
                if (this.field_e < var11) {
                  param2 = (int)((long)param2 - (-this.field_e + var11));
                  this.field_e = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_p = -1L;
            throw var5;
          }
          if (param2 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var5_ref;
          stackIn_65_1 = new StringBuilder().append("si.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    si(ri param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_i = 0;
        this.field_c = -1L;
        try {
          this.field_o = param0;
          dupTemp$0 = param0.b(0);
          this.field_d = dupTemp$0;
          this.field_n = dupTemp$0;
          this.field_a = new byte[param1];
          this.field_e = 0L;
          this.field_k = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "si.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = 0;
        field_g = "Level not yet reached";
        field_b = "From only <%0>/month";
        field_j = new je[31];
    }
}
