/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private byte[] field_e;
    static String field_g;
    private kb field_b;
    private long field_d;
    private int field_a;
    private long field_h;
    private int field_f;
    private long field_i;
    private byte[] field_j;
    static String field_l;
    private long field_k;
    private long field_m;
    private long field_c;

    private final void a(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_a = 0;
        if (~this.field_i != ~this.field_d) {
          this.field_b.a((byte) -123, this.field_d);
          this.field_i = this.field_d;
        }
        if (param0 != 0) {
          return;
        }
        this.field_k = this.field_d;
        while (this.field_e.length > this.field_a) {
          var2 = -this.field_a + this.field_e.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_b.a(this.field_e, false, var2, this.field_a);
          if (-1 != var3) {
            this.field_i = this.field_i + (long)var3;
            this.field_a = this.field_a + var3;
            continue;
          }
          break;
        }
    }

    final static eg a(int param0, byte param1) {
        if (param1 < 5) {
          return (eg) null;
        }
        return me.a(param0, true, 2097152, false, 1, false);
    }

    final void c(byte param0) throws IOException {
        if (param0 >= -30) {
          this.field_f = -28;
        }
        this.a(-1);
        this.field_b.c(105);
    }

    final long b(byte param0) {
        if (param0 != -30) {
          sd.a(87, (byte) 121);
        }
        return this.field_h;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) throws IOException {
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
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          try {
            if (this.field_h < ((long)param3 + this.field_d)) {
              this.field_h = this.field_d + (long)param3;
            }
            if (this.field_c != -1L && (this.field_c > this.field_d ||
              this.field_d > (this.field_c + (long)this.field_f))) {
              this.a(param0 + 52);
            }
            if (param0 != -53) {
              this.field_f = -91;
            }
            if (this.field_c != -1L &&
              (this.field_c + (long)this.field_j.length) < (this.field_d + (long)param3)) {
              var5_int = (int)(-this.field_d + this.field_c + (long)this.field_j.length);
              sf.a(param2, param1, this.field_j, (int)(-this.field_c + this.field_d), var5_int);
              param3 = param3 - var5_int;
              param1 = param1 + var5_int;
              this.field_d = this.field_d + (long)var5_int;
              this.field_f = this.field_j.length;
              this.a(-1);
            }
            if (this.field_j.length >= param3) {
              if (param3 <= 0) {
                return;
              }
              if (-1L == this.field_c) {
                this.field_c = this.field_d;
              }
              sf.a(param2, param1, this.field_j, (int)(-this.field_c + this.field_d), param3);
              this.field_d = this.field_d + (long)param3;
              if ((this.field_d - this.field_c) > (long)this.field_f) {
                this.field_f = (int)(this.field_d - this.field_c);
              }
              return;
            }
            if (this.field_d != this.field_i) {
              this.field_b.a((byte) -123, this.field_d);
              this.field_i = this.field_d;
            }
            this.field_b.a(param0 + 54, param1, param3, param2);
            this.field_i = this.field_i + (long)param3;
            if (this.field_i > this.field_m) {
              this.field_m = this.field_i;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_d >= this.field_k &&
              this.field_d < (long)this.field_a + this.field_k) {
              var5_long = this.field_d;
            } else {
              if (this.field_k >= this.field_d &&
                (long)param3 + this.field_d > this.field_k) {
                var5_long = this.field_k;
              }
            }
            if ((long)param3 + this.field_d > this.field_k &&
              ((long)this.field_a + this.field_k) >= (this.field_d + (long)param3)) {
              var7 = this.field_d + (long)param3;
            } else {
              if (this.field_d < (this.field_k + (long)this.field_a) &&
                (long)this.field_a + this.field_k <= (long)param3 + this.field_d) {
                var7 = (long)this.field_a + this.field_k;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              sf.a(param2, (int)((long)param1 + (var5_long - this.field_d)), this.field_e, (int)(var5_long - this.field_k), var9);
            }
            this.field_d = this.field_d + (long)param3;
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
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("sd.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if ((long)param0 != this.field_c) {
          if (this.field_i != this.field_c) {
            this.field_b.a((byte) -123, this.field_c);
            this.field_i = this.field_c;
          }
          this.field_b.a(1, 0, this.field_f, this.field_j);
          this.field_i = this.field_i + (long)this.field_f;
          if (this.field_m < this.field_i) {
            this.field_m = this.field_i;
          }
          var2 = -1L;
          if (this.field_k <= this.field_c &&
            this.field_k + (long)this.field_a > this.field_c) {
            var2 = this.field_c;
          } else {
            if (this.field_k >= this.field_c &&
              this.field_k < this.field_c + (long)this.field_f) {
              var2 = this.field_k;
            }
          }
          var4 = -1L;
          if (this.field_k < (long)this.field_f + this.field_c &&
            this.field_k + (long)this.field_a >= (long)this.field_f + this.field_c) {
            var4 = (long)this.field_f + this.field_c;
          } else {
            if (this.field_c < (long)this.field_a + this.field_k &&
              (long)this.field_a + this.field_k <= this.field_c + (long)this.field_f) {
              var4 = this.field_k + (long)this.field_a;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(-var2 + var4);
            sf.a(this.field_j, (int)(-this.field_c + var2), this.field_e, (int)(-this.field_k + var2), var6);
          }
          this.field_f = 0;
          this.field_c = -1L;
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(param1.length, param1, (byte) -39, 0);
          if (param0 != -13848) {
            this.field_c = 25L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("sd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          try {
            if (param3 + param0 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
            }
            if (-1L != this.field_c &&
              this.field_c <= this.field_d &&
              (this.field_d + (long)param0) <= ((long)this.field_f + this.field_c)) {
              sf.a(this.field_j, (int)(this.field_d - this.field_c), param1, param3, param0);
              this.field_d = this.field_d + (long)param0;
              return;
            }
            var5_long = this.field_d;
            if (param2 != -39) {
              var15 = (String) null;
              sd.a(10, (String) null, -35, 66, 53, (String) null);
            }
            var7 = param3;
            var8 = param0;
            if (this.field_d >= this.field_k &&
              this.field_d < ((long)this.field_a + this.field_k)) {
              var9_int = (int)((long)this.field_a - (-this.field_k + this.field_d));
              if (var9_int > param0) {
                var9_int = param0;
              }
              sf.a(this.field_e, (int)(this.field_d - this.field_k), param1, param3, var9_int);
              this.field_d = this.field_d + (long)var9_int;
              param3 = param3 + var9_int;
              param0 = param0 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param0 > this.field_e.length) {
              this.field_b.a((byte) -123, this.field_d);
              this.field_i = this.field_d;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_b.a(param1, false, param0, param3);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param3 = param3 + var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
                this.field_i = this.field_i + (long)var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param0 > 0)) {
              this.a((byte) 0);
              var9_intLifetime1Lifetime1 = param0;
              if (this.field_a < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_a;
              }
              sf.a(this.field_e, 0, param1, param3, var9_intLifetime1Lifetime1);
              param0 = param0 - var9_intLifetime1Lifetime1;
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
              param3 = param3 + var9_intLifetime1Lifetime1;
            }
            if (this.field_c != -1L) {
              if (this.field_d < this.field_c &&
                0 < param0) {
                var9_intLifetime2 = param3 + (int)(-this.field_d + this.field_c);
                if (param3 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param0 + param3;
                }
                while (var9_intLifetime2 > param3) {
                  param0--;
                  incrementValue$0 = param3;
                  param3++;
                  param1[incrementValue$0] = (byte) 0;
                  this.field_d = this.field_d + 1L;
                }
              }
              var9 = -1L;
              if (this.field_c >= var5_long &&
                this.field_c < var5_long + (long)var8) {
                var9 = this.field_c;
              } else {
                if (this.field_c <= var5_long &&
                  (this.field_c + (long)this.field_f) > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.field_c + (long)this.field_f &&
                ((long)var8 + var5_long) >= (this.field_c + (long)this.field_f)) {
                var11 = (long)this.field_f + this.field_c;
              } else {
                if ((var5_long + (long)var8) > this.field_c &&
                  (long)this.field_f + this.field_c >= var5_long + (long)var8) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                sf.a(this.field_j, (int)(var9 - this.field_c), param1, var7 + (int)(-var5_long + var9), var13);
                if (var11 > this.field_d) {
                  param0 = (int)((long)param0 - (var11 - this.field_d));
                  this.field_d = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_i = -1L;
            throw var5;
          }
          if (0 >= param0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("sd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 >= -85) {
          String var5 = (String) null;
          sd.a(-98, (String) null, 53, 5, -83, (String) null);
        }
        if (0L <= param0) {
          this.field_d = param0;
          return;
        }
        throw new IOException();
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, String param5) {
        ab var9 = null;
        int var7 = 0;
        try {
          var9 = he.field_e;
          var9.b((byte) -58, param3);
          var9.field_g = var9.field_g + 1;
          if (param2 <= 60) {
            String var8 = (String) null;
            sd.a(-27, (String) null, 28, 54, -6, (String) null);
          }
          var7 = var9.field_g;
          var9.f(param4, (byte) -71);
          if (param4 == 2) {
            var9.a(param5, 23333);
          }
          if (param1 == null) {
            var9.c(param0, (byte) -119);
          } else {
            jh.a(var9, (byte) 127, param1);
          }
          var9.b(-var7 + var9.field_g, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != -1) {
          return;
        }
        field_l = null;
    }

    sd(kb param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_k = -1L;
        this.field_c = -1L;
        this.field_f = 0;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.a(-2775);
          this.field_m = dupTemp$0;
          this.field_h = dupTemp$0;
          this.field_e = new byte[param1];
          this.field_j = new byte[param2];
          this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Sound: ";
        field_l = "You cannot add yourself!";
    }
}
