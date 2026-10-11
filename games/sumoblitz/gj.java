/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class gj {
    private byte[] field_e;
    private long field_k;
    private byte[] field_i;
    private long field_d;
    private long field_b;
    private int field_h;
    private long field_c;
    private sr field_j;
    private long field_g;
    private int field_f;
    private long field_a;

    final static void c(int param0) {
        bw.a(false, ra.c(param0 ^ 2));
        if (param0 != 0) {
          String var2 = (String) null;
          gj.a(42L, (java.applet.Applet) null, false, (String) null, (String) null);
        }
    }

    final static void a(long param0, java.applet.Applet param1, boolean param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (!param2) {
                return;
              }
              var9 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param0 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + fi.a(param0 * 1000L + wq.a(-123), true) + "; Max-Age=" + param0;
              }
              tw.a("document.cookie=\"" + var7Lifetime4 + "\"", -15428, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("gj.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (param0 + param1 > param2.length) {
              throw new ArrayIndexOutOfBoundsException(param1 + (param0 - param2.length));
            }
            if (this.field_g != -1L &&
              this.field_d >= this.field_g &&
              (this.field_d + (long)param0) <= ((long)this.field_h + this.field_g)) {
              la.a(this.field_i, (int)(-this.field_g + this.field_d), param2, param1, param0);
              this.field_d = this.field_d + (long)param0;
              return;
            }
            var5_long = this.field_d;
            var7 = param1;
            var8 = param0;
            if (this.field_d >= this.field_b &&
              this.field_d < this.field_b + (long)this.field_f) {
              var9_int = (int)((long)this.field_f + (-this.field_d + this.field_b));
              if (param0 < var9_int) {
                var9_int = param0;
              }
              la.a(this.field_e, (int)(this.field_d - this.field_b), param2, param1, var9_int);
              param1 = param1 + var9_int;
              this.field_d = this.field_d + (long)var9_int;
              param0 = param0 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param0 > this.field_e.length) {
              this.field_j.a((byte) -100, this.field_d);
              this.field_k = this.field_d;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_j.b(param2, 2, param0, param1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_d = this.field_d + (long)var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param0 > 0)) {
              this.a(-1);
              var9_intLifetime1Lifetime1 = param0;
              if (this.field_f < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_f;
              }
              la.a(this.field_e, 0, param2, param1, var9_intLifetime1Lifetime1);
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
              param1 = param1 + var9_intLifetime1Lifetime1;
              param0 = param0 - var9_intLifetime1Lifetime1;
            }
            if (param3 >= -51) {
              return;
            }
            if (this.field_g != -1L) {
              if (this.field_d < this.field_g &&
                param0 > 0) {
                var9_intLifetime2 = (int)(-this.field_d + this.field_g) + param1;
                if (param0 + param1 < var9_intLifetime2) {
                  var9_intLifetime2 = param0 + param1;
                }
                while (param1 < var9_intLifetime2) {
                  param0--;
                  incrementValue$0 = param1;
                  param1++;
                  param2[incrementValue$0] = (byte) 0;
                  this.field_d = this.field_d + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_g &&
                ((long)var8 + var5_long) > this.field_g) {
                var9 = this.field_g;
              } else {
                if (this.field_g <= var5_long &&
                  var5_long < (long)this.field_h + this.field_g) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (long)this.field_h + this.field_g &&
                (long)var8 + var5_long >= this.field_g + (long)this.field_h) {
                var11 = (long)this.field_h + this.field_g;
              } else {
                if (this.field_g < (var5_long + (long)var8) &&
                  this.field_g + (long)this.field_h >= var5_long + (long)var8) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                la.a(this.field_i, (int)(-this.field_g + var9), param2, (int)(var9 - var5_long) + var7, var13);
                if (var11 > this.field_d) {
                  param0 = (int)((long)param0 - (var11 - this.field_d));
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
          if (param0 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0) throws IOException {
        long var2_long;
        int var2;
        long var4;
        int var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_g != -1L) {
          if (this.field_k != this.field_g) {
            this.field_j.a((byte) -115, this.field_g);
            this.field_k = this.field_g;
          }
          this.field_j.a(this.field_i, 0, this.field_h, 1);
          this.field_k = this.field_k + (long)this.field_h;
          if (this.field_k > this.field_c) {
            this.field_c = this.field_k;
          }
          var2_long = -1L;
          var4 = -1L;
          if (this.field_g >= this.field_b &&
            (this.field_b + (long)this.field_f) > this.field_g) {
            var2_long = this.field_g;
          } else {
            if (this.field_b >= this.field_g &&
              this.field_g + (long)this.field_h > this.field_b) {
              var2_long = this.field_b;
            }
          }
          if (this.field_b < this.field_g + (long)this.field_h &&
            (long)this.field_f + this.field_b >= this.field_g + (long)this.field_h) {
            var4 = this.field_g + (long)this.field_h;
          } else {
            if ((long)this.field_f + this.field_b > this.field_g &&
              (this.field_b + (long)this.field_f) <= ((long)this.field_h + this.field_g)) {
              var4 = (long)this.field_f + this.field_b;
            }
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            var6 = (int)(-var2_long + var4);
            la.a(this.field_i, (int)(-this.field_g + var2_long), this.field_e, (int)(-this.field_b + var2_long), var6);
          }
          this.field_g = -1L;
          this.field_h = 0;
        }
        var2 = -14 / ((67 - param0) / 34);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        int var5_intLifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            if (((long)param1 + this.field_d) > this.field_a) {
              this.field_a = (long)param1 + this.field_d;
            }
            if (this.field_g != -1L && (this.field_g > this.field_d ||
              ((long)this.field_h + this.field_g) < this.field_d)) {
              this.b((byte) 115);
            }
            if (this.field_g != -1L &&
              this.field_g + (long)this.field_i.length < this.field_d + (long)param1) {
              var5_int = (int)(this.field_g - this.field_d + (long)this.field_i.length);
              la.a(param0, param3, this.field_i, (int)(-this.field_g + this.field_d), var5_int);
              this.field_d = this.field_d + (long)var5_int;
              param1 = param1 - var5_int;
              param3 = param3 + var5_int;
              this.field_h = this.field_i.length;
              this.b((byte) 109);
            }
            if (this.field_i.length >= param1) {
              if (0 >= param1) {
                var5_intLifetime1 = -89 % ((20 - param2) / 41);
                return;
              }
              if (this.field_g == -1L) {
                this.field_g = this.field_d;
              }
              la.a(param0, param3, this.field_i, (int)(-this.field_g + this.field_d), param1);
              this.field_d = this.field_d + (long)param1;
              if (this.field_d - this.field_g > (long)this.field_h) {
                this.field_h = (int)(this.field_d - this.field_g);
              }
              return;
            }
            if (~this.field_d != ~this.field_k) {
              this.field_j.a((byte) -99, this.field_d);
              this.field_k = this.field_d;
            }
            this.field_j.a(param0, param3, param1, 1);
            this.field_k = this.field_k + (long)param1;
            if (this.field_k > this.field_c) {
              this.field_c = this.field_k;
            }
            var5_long = -1L;
            if (this.field_b <= this.field_d &&
              ((long)this.field_f + this.field_b) > this.field_d) {
              var5_long = this.field_d;
            } else {
              if (this.field_d <= this.field_b &&
                (long)param1 + this.field_d > this.field_b) {
                var5_long = this.field_b;
              }
            }
            var7 = -1L;
            if (this.field_b < (long)param1 + this.field_d &&
              (this.field_b + (long)this.field_f) >= (this.field_d + (long)param1)) {
              var7 = (long)param1 + this.field_d;
            } else {
              if (this.field_d < ((long)this.field_f + this.field_b) &&
                ((long)this.field_f + this.field_b) <= ((long)param1 + this.field_d)) {
                var7 = (long)this.field_f + this.field_b;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              la.a(param0, (int)(-this.field_d + (var5_long + (long)param3)), this.field_e, (int)(var5_long - this.field_b), var9);
            }
            this.field_d = this.field_d + (long)param1;
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
          stackIn_50_0 = var5_ref;
          stackIn_50_1 = new StringBuilder().append("gj.D(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) throws IOException {
        this.b((byte) -114);
        if (param0 != -1) {
          gj.c(-23);
        }
        this.field_j.b(0);
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
          int var3_int = 47 / ((84 - param1) / 39);
          this.a(param0.length, 0, param0, -127);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          if (param0 != -7564) {
            this.field_g = -40L;
          }
          this.field_d = param1;
          return;
        }
        throw new IOException();
    }

    final long a(byte param0) {
        if (param0 != -60) {
          return 111L;
        }
        return this.field_a;
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        String var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_f = 0;
        if (this.field_k != this.field_d) {
          this.field_j.a((byte) 54, this.field_d);
          this.field_k = this.field_d;
        }
        if (param0 != -1) {
          var5 = (String) null;
          gj.a(20L, (java.applet.Applet) null, true, (String) null, (String) null);
        }
        this.field_b = this.field_d;
        while (this.field_f < this.field_e.length) {
          var2 = this.field_e.length - this.field_f;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_j.b(this.field_e, 2, var2, this.field_f);
          if (var3 != -1) {
            this.field_k = this.field_k + (long)var3;
            this.field_f = this.field_f + var3;
            continue;
          }
          break;
        }
    }

    gj(sr param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_h = 0;
        this.field_b = -1L;
        this.field_g = -1L;
        try {
          this.field_j = param0;
          dupTemp$0 = param0.a(100);
          this.field_c = dupTemp$0;
          this.field_a = dupTemp$0;
          this.field_i = new byte[param2];
          this.field_e = new byte[param1];
          this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -84) {
          gj.a((byte) 37, 116);
        }
        return fi.a(param1, iv.field_b, (byte) -96);
    }

    static {
    }
}
