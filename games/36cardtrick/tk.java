/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk {
    static int field_c;
    private wk field_n;
    private long field_g;
    private int field_m;
    private long field_f;
    private long field_p;
    private long field_k;
    private long field_i;
    private byte[] field_h;
    private byte[] field_e;
    static int field_a;
    static java.applet.Applet field_o;
    private int field_d;
    private long field_j;
    static ml field_b;
    static String field_l;
    static boolean field_q;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = Main.field_T;
        try {
          try {
            if (param1.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param2));
            }
            if (param0 != -118) {
              return;
            }
            if (this.field_g != -1L &&
              this.field_i >= this.field_g &&
              (long)this.field_d + this.field_g >= this.field_i + (long)param3) {
              og.a(this.field_h, (int)(-this.field_g + this.field_i), param1, param2, param3);
              this.field_i = this.field_i + (long)param3;
              return;
            }
            var5_long = this.field_i;
            var7 = param2;
            var8 = param3;
            if (this.field_i >= this.field_p &&
              this.field_i < (this.field_p + (long)this.field_m)) {
              var9_int = (int)(this.field_p - (this.field_i - (long)this.field_m));
              if (var9_int > param3) {
                var9_int = param3;
              }
              og.a(this.field_e, (int)(this.field_i - this.field_p), param1, param2, var9_int);
              param3 = param3 - var9_int;
              param2 = param2 + var9_int;
              this.field_i = this.field_i + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_e.length) {
              this.field_n.a(this.field_i, false);
              this.field_f = this.field_i;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_n.a(param3, param1, param2, param0 + 117);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_f = this.field_f + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_i = this.field_i + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.b(param0 + 118);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_m < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_m;
              }
              og.a(this.field_e, 0, param1, param2, var9_intLifetime1Lifetime1);
              this.field_i = this.field_i + (long)var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
            }
            if (this.field_g != -1L) {
              if (this.field_i < this.field_g &&
                param3 > 0) {
                var9_intLifetime2 = (int)(-this.field_i + this.field_g) + param2;
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param3 + param2;
                }
                while (var9_intLifetime2 > param2) {
                  incrementValue$0 = param2;
                  param2++;
                  param1[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_i = this.field_i + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_g &&
                (long)var8 + var5_long > this.field_g) {
                var9 = this.field_g;
              } else {
                if (var5_long >= this.field_g &&
                  var5_long < (long)this.field_d + this.field_g) {
                  var9 = var5_long;
                }
              }
              if (var5_long < this.field_g + (long)this.field_d &&
                (long)var8 + var5_long >= (long)this.field_d + this.field_g) {
                var11 = this.field_g + (long)this.field_d;
              } else {
                if ((var5_long + (long)var8) > this.field_g &&
                  (this.field_g + (long)this.field_d) >= (var5_long + (long)var8)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                og.a(this.field_h, (int)(var9 - this.field_g), param1, (int)(var9 - var5_long) + var7, var13);
                if (this.field_i < var11) {
                  param3 = (int)((long)param3 - (-this.field_i + var11));
                  this.field_i = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_f = -1L;
            throw var5;
          }
          if (param3 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var5_ref;
          stackIn_65_1 = new StringBuilder().append("tk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          try {
            if (this.field_j < (this.field_i + (long)param2)) {
              this.field_j = (long)param2 + this.field_i;
            }
            if (this.field_g != -1L && (this.field_g > this.field_i ||
              this.field_i > ((long)this.field_d + this.field_g))) {
              this.c(param3 + 102);
            }
            if ((long)param3 != this.field_g &&
              (long)this.field_h.length + this.field_g < (long)param2 + this.field_i) {
              var5_int = (int)((long)this.field_h.length - this.field_i + this.field_g);
              og.a(param0, param1, this.field_h, (int)(-this.field_g + this.field_i), var5_int);
              param2 = param2 - var5_int;
              param1 = param1 + var5_int;
              this.field_i = this.field_i + (long)var5_int;
              this.field_d = this.field_h.length;
              this.c(-122);
            }
            if (this.field_h.length >= param2) {
              if (0 >= param2) {
                return;
              }
              if (this.field_g == -1L) {
                this.field_g = this.field_i;
              }
              og.a(param0, param1, this.field_h, (int)(this.field_i - this.field_g), param2);
              this.field_i = this.field_i + (long)param2;
              if ((long)this.field_d < (this.field_i - this.field_g)) {
                this.field_d = (int)(this.field_i - this.field_g);
              }
              return;
            }
            if (~this.field_i != ~this.field_f) {
              this.field_n.a(this.field_i, false);
              this.field_f = this.field_i;
            }
            this.field_n.b(param1, param0, 0, param2);
            this.field_f = this.field_f + (long)param2;
            if (this.field_f > this.field_k) {
              this.field_k = this.field_f;
            }
            var5_long = -1L;
            if (this.field_i >= this.field_p &&
              this.field_p + (long)this.field_m > this.field_i) {
              var5_long = this.field_i;
            } else {
              if (this.field_i <= this.field_p &&
                this.field_i + (long)param2 > this.field_p) {
                var5_long = this.field_p;
              }
            }
            var7 = -1L;
            if (((long)param2 + this.field_i) > this.field_p &&
              ((long)this.field_m + this.field_p) >= (this.field_i + (long)param2)) {
              var7 = (long)param2 + this.field_i;
            } else {
              if (this.field_i < (this.field_p + (long)this.field_m) &&
                this.field_i + (long)param2 >= (long)this.field_m + this.field_p) {
                var7 = (long)this.field_m + this.field_p;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              og.a(param0, (int)((long)param1 + (var5_long - this.field_i)), this.field_e, (int)(var5_long - this.field_p), var9);
            }
            this.field_i = this.field_i + (long)param2;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_f = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("tk.H(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final long b(byte param0) {
        if (param0 != -95) {
          return 121L;
        }
        return this.field_j;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a((byte) -118, param1, param0, param1.length);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) throws IOException {
        long var2_long;
        int var2;
        long var4;
        int var6;
        int var7;
        var7 = Main.field_T;
        if (-1L != this.field_g) {
          if (this.field_f != this.field_g) {
            this.field_n.a(this.field_g, false);
            this.field_f = this.field_g;
          }
          this.field_n.b(0, this.field_h, 0, this.field_d);
          this.field_f = this.field_f + (long)this.field_d;
          if (this.field_k < this.field_f) {
            this.field_k = this.field_f;
          }
          var2_long = -1L;
          var4 = -1L;
          if (this.field_p <= this.field_g &&
            this.field_g < (this.field_p + (long)this.field_m)) {
            var2_long = this.field_g;
          } else {
            if (this.field_g <= this.field_p &&
              this.field_p < (this.field_g + (long)this.field_d)) {
              var2_long = this.field_p;
            }
          }
          if ((this.field_g + (long)this.field_d) > this.field_p &&
            ((long)this.field_m + this.field_p) >= ((long)this.field_d + this.field_g)) {
            var4 = (long)this.field_d + this.field_g;
          } else {
            if (this.field_g < (long)this.field_m + this.field_p &&
              this.field_g + (long)this.field_d >= this.field_p + (long)this.field_m) {
              var4 = this.field_p + (long)this.field_m;
            }
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            var6 = (int)(var4 - var2_long);
            og.a(this.field_h, (int)(var2_long - this.field_g), this.field_e, (int)(-this.field_p + var2_long), var6);
          }
          this.field_g = -1L;
          this.field_d = 0;
        }
        var2 = -69 / ((param0 - 38) / 54);
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (param1 != -1) {
          return;
        }
        try {
          oc.a((java.awt.Component) ((Object) param0), (byte) 6);
          qa.a((java.awt.Component) ((Object) param0), (byte) 119);
          if (Main.field_V != null) {
            Main.field_V.a(0, (java.awt.Component) ((Object) param0));
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_b = null;
        if (param0 != -1) {
          field_q = false;
        }
    }

    tk(wk param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_p = -1L;
        this.field_d = 0;
        try {
          this.field_n = param0;
          dupTemp$0 = param0.a(11311);
          this.field_k = dupTemp$0;
          this.field_j = dupTemp$0;
          this.field_i = 0L;
          this.field_h = new byte[param2];
          this.field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        this.c(-44);
        if (param0 > -25) {
          field_c = -80;
        }
        this.field_n.a((byte) 15);
    }

    private final void b(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = Main.field_T;
        this.field_m = param0;
        if (~this.field_f != ~this.field_i) {
          this.field_n.a(this.field_i, false);
          this.field_f = this.field_i;
        }
        this.field_p = this.field_i;
        while (this.field_m < this.field_e.length) {
          var2 = this.field_e.length - this.field_m;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_n.a(var2, this.field_e, this.field_m, -1);
          if (-1 != var3) {
            this.field_m = this.field_m + var3;
            this.field_f = this.field_f + (long)var3;
            continue;
          }
          break;
        }
    }

    final void a(long param0, int param1) throws IOException {
        int var4 = -66 / ((-27 - param1) / 35);
        if (param0 < 0L) {
          throw new IOException();
        }
        this.field_i = param0;
    }

    static {
        field_c = 1;
        field_a = 1;
        field_b = new ml();
        field_q = false;
        field_l = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
