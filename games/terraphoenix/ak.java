/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    static String field_c;
    static String field_g;
    static int field_q;
    private int field_n;
    private long field_h;
    static int field_e;
    private long field_p;
    private long field_o;
    private b field_d;
    private int field_m;
    private byte[] field_a;
    static String field_f;
    private byte[] field_k;
    static String field_j;
    private long field_l;
    private long field_i;
    private long field_b;

    final void b(byte param0) throws IOException {
        this.a(0);
        if (param0 > -5) {
          ak.a(false);
        }
        this.field_d.a(118);
    }

    final static void b(int param0) {
        int var1 = -86 / ((4 - param0) / 52);
        rd.field_k = new jj();
    }

    final long a(byte param0) {
        int var2 = 36 % ((-70 - param0) / 40);
        return this.field_i;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_j = null;
        if (param0) {
          field_c = (String) null;
        }
        field_g = null;
    }

    private final void c(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        this.field_m = 0;
        if (this.field_p != this.field_h) {
          this.field_d.a(this.field_p, (byte) 89);
          this.field_h = this.field_p;
        }
        if (param0 > -86) {
          field_g = (String) null;
        }
        this.field_b = this.field_p;
        while (this.field_m < this.field_a.length) {
          var2 = this.field_a.length - this.field_m;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_d.a(this.field_a, var2, this.field_m, 12955);
          if (var3 == -1) {
            break;
          }
          this.field_m = this.field_m + var3;
          this.field_h = this.field_h + (long)var3;
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (param0) {
          return;
        }
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_p = param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Terraphoenix.field_V;
        if (param5 != 116) {
          return;
        }
        if (param14 > param4) {
          if (param8 > param14) {
            dl.a(true, param1, param0, l.field_i, param14, param6, param9, param12, param3, param11, param8, param13, param4, param10, param15, param2, param7);
          } else {
            if (param4 < param8) {
              dl.a(true, param11, param10, l.field_i, param8, param12, param9, param6, param13, param1, param14, param3, param4, param0, param15, param2, param7);
            } else {
              dl.a(true, param11, param10, l.field_i, param4, param7, param0, param6, param13, param15, param14, param2, param8, param9, param1, param3, param12);
            }
          }
        } else {
          if (param4 >= param8) {
            if (param14 < param8) {
              dl.a(true, param15, param9, l.field_i, param8, param12, param10, param7, param2, param1, param4, param3, param14, param0, param11, param13, param6);
            } else {
              dl.a(true, param15, param9, l.field_i, param14, param6, param0, param7, param2, param11, param4, param13, param8, param10, param1, param3, param12);
            }
          } else {
            dl.a(true, param1, param0, l.field_i, param4, param7, param10, param12, param3, param15, param8, param2, param14, param9, param11, param13, param6);
          }
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Terraphoenix.field_V;
        if (this.field_o != -1L) {
          if (this.field_o != this.field_h) {
            this.field_d.a(this.field_o, (byte) 81);
            this.field_h = this.field_o;
          }
          this.field_d.a(this.field_n, this.field_k, 0, (byte) -73);
          this.field_h = this.field_h + (long)this.field_n;
          if (this.field_h > this.field_l) {
            this.field_l = this.field_h;
          }
          var2 = -1L;
          if (this.field_b <= this.field_o &&
            this.field_o < (long)this.field_m + this.field_b) {
            var2 = this.field_o;
          } else {
            if (this.field_b >= this.field_o &&
              this.field_b < (long)this.field_n + this.field_o) {
              var2 = this.field_b;
            }
          }
          var4 = -1L;
          if (this.field_b < this.field_o + (long)this.field_n &&
            ((long)this.field_n + this.field_o) <= ((long)this.field_m + this.field_b)) {
            var4 = (long)this.field_n + this.field_o;
          } else {
            if (this.field_b + (long)this.field_m > this.field_o &&
              ((long)this.field_n + this.field_o) >= (this.field_b + (long)this.field_m)) {
              var4 = (long)this.field_m + this.field_b;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(-var2 + var4);
            ka.a(this.field_k, (int)(-this.field_o + var2), this.field_a, (int)(-this.field_b + var2), var6);
          }
          this.field_o = -1L;
          this.field_n = 0;
        }
        if (param0 != 0) {
          ak.a(true);
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
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
        var15 = Terraphoenix.field_V;
        try {
          try {
            if (param3 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param3);
            }
            if (this.field_o != -1L &&
              this.field_o <= this.field_p &&
              (this.field_p + (long)param3) <= (this.field_o + (long)this.field_n)) {
              ka.a(this.field_k, (int)(this.field_p - this.field_o), param0, param2, param3);
              this.field_p = this.field_p + (long)param3;
              return;
            }
            var5_long = this.field_p;
            var7 = -21 / ((param1 + 73) / 52);
            var8 = param2;
            var9 = param3;
            if (this.field_b <= this.field_p &&
              this.field_p < ((long)this.field_m + this.field_b)) {
              var10_int = (int)(-this.field_p - (-this.field_b - (long)this.field_m));
              if (param3 < var10_int) {
                var10_int = param3;
              }
              ka.a(this.field_a, (int)(this.field_p - this.field_b), param0, param2, var10_int);
              param3 = param3 - var10_int;
              param2 = param2 + var10_int;
              this.field_p = this.field_p + (long)var10_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_a.length) {
              this.field_d.a(this.field_p, (byte) 93);
              this.field_h = this.field_p;
              while (param3 > 0) {
                var10_intLifetime1 = this.field_d.a(param0, param3, param2, 12955);
                if (-1 == var10_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 + var10_intLifetime1;
                param3 = param3 - var10_intLifetime1;
                this.field_h = this.field_h + (long)var10_intLifetime1;
                this.field_p = this.field_p + (long)var10_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.c((byte) -127);
              var10_intLifetime1Lifetime1 = param3;
              if (var10_intLifetime1Lifetime1 > this.field_m) {
                var10_intLifetime1Lifetime1 = this.field_m;
              }
              ka.a(this.field_a, 0, param0, param2, var10_intLifetime1Lifetime1);
              param3 = param3 - var10_intLifetime1Lifetime1;
              param2 = param2 + var10_intLifetime1Lifetime1;
              this.field_p = this.field_p + (long)var10_intLifetime1Lifetime1;
            }
            if (this.field_o != -1L) {
              if (this.field_p < this.field_o &&
                param3 > 0) {
                var10_intLifetime2 = (int)(-this.field_p + this.field_o) + param2;
                if (param2 + param3 < var10_intLifetime2) {
                  var10_intLifetime2 = param2 + param3;
                }
                while (var10_intLifetime2 > param2) {
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_p = this.field_p + 1L;
                }
              }
              var10 = -1L;
              if (this.field_o >= var5_long &&
                ((long)var9 + var5_long) > this.field_o) {
                var10 = this.field_o;
              } else {
                if (this.field_o <= var5_long &&
                  (this.field_o + (long)this.field_n) > var5_long) {
                  var10 = var5_long;
                }
              }
              var12 = -1L;
              if ((long)this.field_n + this.field_o > var5_long &&
                (this.field_o + (long)this.field_n) <= ((long)var9 + var5_long)) {
                var12 = (long)this.field_n + this.field_o;
              } else {
                if (this.field_o < (long)var9 + var5_long &&
                  ((long)this.field_n + this.field_o) >= (var5_long + (long)var9)) {
                  var12 = (long)var9 + var5_long;
                }
              }
              if (var10 > -1L &&
                var10 < var12) {
                var14 = (int)(-var10 + var12);
                ka.a(this.field_k, (int)(var10 - this.field_o), param0, var8 + (int)(-var5_long + var10), var14);
                if (var12 > this.field_p) {
                  param3 = (int)((long)param3 - (-this.field_p + var12));
                  this.field_p = var12;
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
          stackIn_56_0 = var5_ref;
          stackIn_56_1 = new StringBuilder().append("ak.H(");
          if (param0 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = wa.a((byte) -117, param1);
          if (param2) {
            return true;
          }
          if (param0.indexOf(param1) == -1 &&
            param0.indexOf(var3) == -1) {
            stackIn_15_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_15_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ak.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
          if (param1 != 6605) {
            this.field_n = 83;
          }
          this.a(param0, (byte) -125, 0, param0.length);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ak.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var10 = Terraphoenix.field_V;
        try {
          try {
            if (this.field_i < this.field_p + (long)param1) {
              this.field_i = this.field_p + (long)param1;
            }
            if (this.field_o != -1L && (this.field_p < this.field_o ||
              this.field_o + (long)this.field_n < this.field_p)) {
              this.a(param0 + 1);
            }
            if (this.field_o != (long)param0 &&
              (long)param1 + this.field_p > this.field_o + (long)this.field_k.length) {
              var5_int = (int)((long)this.field_k.length + this.field_o - this.field_p);
              ka.a(param2, param3, this.field_k, (int)(-this.field_o + this.field_p), var5_int);
              param1 = param1 - var5_int;
              this.field_p = this.field_p + (long)var5_int;
              param3 = param3 + var5_int;
              this.field_n = this.field_k.length;
              this.a(0);
            }
            if (param1 <= this.field_k.length) {
              if (param1 <= 0) {
                return;
              }
              if (this.field_o == -1L) {
                this.field_o = this.field_p;
              }
              ka.a(param2, param3, this.field_k, (int)(-this.field_o + this.field_p), param1);
              this.field_p = this.field_p + (long)param1;
              if ((long)this.field_n < this.field_p - this.field_o) {
                this.field_n = (int)(-this.field_o + this.field_p);
              }
              return;
            }
            if (~this.field_h != ~this.field_p) {
              this.field_d.a(this.field_p, (byte) 91);
              this.field_h = this.field_p;
            }
            this.field_d.a(param1, param2, param3, (byte) -107);
            this.field_h = this.field_h + (long)param1;
            if (this.field_h > this.field_l) {
              this.field_l = this.field_h;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_p >= this.field_b &&
              ((long)this.field_m + this.field_b) > this.field_p) {
              var5_long = this.field_p;
            } else {
              if (this.field_p <= this.field_b &&
                (long)param1 + this.field_p > this.field_b) {
                var5_long = this.field_b;
              }
            }
            if (this.field_b < (this.field_p + (long)param1) &&
              this.field_b + (long)this.field_m >= (long)param1 + this.field_p) {
              var7 = (long)param1 + this.field_p;
            } else {
              if ((long)this.field_m + this.field_b > this.field_p &&
                this.field_b + (long)this.field_m <= this.field_p + (long)param1) {
                var7 = (long)this.field_m + this.field_b;
              }
            }
            if (-1L < var5_long &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              ka.a(param2, (int)(-this.field_p + var5_long + (long)param3), this.field_a, (int)(-this.field_b + var5_long), var9);
            }
            this.field_p = this.field_p + (long)param1;
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
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("ak.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(')').toString());
        }
    }

    ak(b param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_n = 0;
        this.field_o = -1L;
        this.field_b = -1L;
        try {
          this.field_d = param0;
          dupTemp$0 = param0.b((byte) 73);
          this.field_l = dupTemp$0;
          this.field_i = dupTemp$0;
          this.field_a = new byte[param1];
          this.field_k = new byte[param2];
          this.field_p = 0L;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Members";
        field_f = "Unable to connect to the data server. Please check any firewall you are using.";
        field_c = "Press the next button";
        field_j = "This password contains repeated characters, and would be easy to guess";
    }
}
