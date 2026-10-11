/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gdb {
    static asb field_i;
    static String field_d;
    private byte[] field_h;
    private long field_a;
    private int field_j;
    private long field_c;
    private byte[] field_f;
    private long field_e;
    private au field_m;
    private long field_b;
    private long field_g;
    private long field_k;
    private int field_l;

    final void a(int param0, byte[] param1) throws IOException {
        try {
          if (param0 >= -80) {
            this.b(6);
          }
          this.a(param1, param1.length, 0, -30541);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gdb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long b(int param0) {
        if (param0 != 0) {
          this.field_m = (au) null;
        }
        return this.field_b;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 > -41) {
          field_d = (String) null;
        }
        field_d = null;
    }

    private final void c(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != -200000001) {
          this.b(-38);
        }
        this.field_l = 0;
        if (this.field_a != this.field_c) {
          this.field_m.a((byte) -38, this.field_a);
          this.field_c = this.field_a;
        }
        this.field_e = this.field_a;
        while (this.field_h.length > this.field_l) {
          var2 = -this.field_l + this.field_h.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_m.a((byte) -60, var2, this.field_h, this.field_l);
          if (var3 != -1) {
            this.field_l = this.field_l + var3;
            this.field_c = this.field_c + (long)var3;
            continue;
          }
          break;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          this.field_a = param1;
          if (param0 != 0) {
            this.field_a = 43L;
          }
          return;
        }
        throw new IOException();
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        var10 = VoidHunters.field_G;
        try {
          try {
            if ((long)param0 + this.field_a > this.field_b) {
              this.field_b = this.field_a + (long)param0;
            }
            if (param2 > -66) {
              gdb.b(34, -32L);
            }
            if (-1L != this.field_g) {
              if (this.field_g <= this.field_a) {
                if (this.field_a > ((long)this.field_j + this.field_g)) {
                  this.a((byte) -123);
                }
              } else {
                this.a((byte) -123);
              }
            }
            if (this.field_g != -1L &&
              (this.field_a + (long)param0) > (this.field_g + (long)this.field_f.length)) {
              var5_int = (int)((long)this.field_f.length - this.field_a + this.field_g);
              cua.a(param3, param1, this.field_f, (int)(this.field_a - this.field_g), var5_int);
              this.field_a = this.field_a + (long)var5_int;
              param0 = param0 - var5_int;
              param1 = param1 + var5_int;
              this.field_j = this.field_f.length;
              this.a((byte) -120);
            }
            if (param0 <= this.field_f.length) {
              if (param0 <= 0) {
                return;
              }
              if (-1L == this.field_g) {
                this.field_g = this.field_a;
              }
              cua.a(param3, param1, this.field_f, (int)(-this.field_g + this.field_a), param0);
              this.field_a = this.field_a + (long)param0;
              if ((long)this.field_j < (this.field_a - this.field_g)) {
                this.field_j = (int)(this.field_a - this.field_g);
              }
              return;
            }
            if (this.field_a != this.field_c) {
              this.field_m.a((byte) -38, this.field_a);
              this.field_c = this.field_a;
            }
            this.field_m.a(param0, -14394, param3, param1);
            this.field_c = this.field_c + (long)param0;
            if (this.field_k < this.field_c) {
              this.field_k = this.field_c;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_e <= this.field_a &&
              (long)this.field_l + this.field_e > this.field_a) {
              var5_long = this.field_a;
            } else {
              if (this.field_a <= this.field_e &&
                this.field_e < (this.field_a + (long)param0)) {
                var5_long = this.field_e;
              }
            }
            if ((long)param0 + this.field_a > this.field_e &&
              this.field_a + (long)param0 <= this.field_e + (long)this.field_l) {
              var7 = this.field_a + (long)param0;
            } else {
              if (this.field_a < (this.field_e + (long)this.field_l) &&
                (this.field_e + (long)this.field_l) <= (this.field_a + (long)param0)) {
                var7 = (long)this.field_l + this.field_e;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              cua.a(param3, (int)(var5_long + (long)param1 - this.field_a), this.field_h, (int)(var5_long - this.field_e), var9);
            }
            this.field_a = this.field_a + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_c = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("gdb.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        this.a((byte) -123);
        if (!param0) {
          gdb.b(-67, 17L);
        }
        this.field_m.a(false);
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param0 > -51) {
          field_i = (asb) null;
        }
        if (-1L != this.field_g) {
          if (~this.field_g != ~this.field_c) {
            this.field_m.a((byte) -38, this.field_g);
            this.field_c = this.field_g;
          }
          this.field_m.a(this.field_j, -14394, this.field_f, 0);
          this.field_c = this.field_c + (long)this.field_j;
          if (this.field_k < this.field_c) {
            this.field_k = this.field_c;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_g >= this.field_e &&
            this.field_g < (long)this.field_l + this.field_e) {
            var2 = this.field_g;
          } else {
            if (this.field_e >= this.field_g &&
              this.field_e < (this.field_g + (long)this.field_j)) {
              var2 = this.field_e;
            }
          }
          if (this.field_g + (long)this.field_j > this.field_e &&
            ((long)this.field_l + this.field_e) >= ((long)this.field_j + this.field_g)) {
            var4 = this.field_g + (long)this.field_j;
          } else {
            if (this.field_g < (long)this.field_l + this.field_e &&
              ((long)this.field_l + this.field_e) <= (this.field_g + (long)this.field_j)) {
              var4 = (long)this.field_l + this.field_e;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            cua.a(this.field_f, (int)(-this.field_g + var2), this.field_h, (int)(-this.field_e + var2), var6);
          }
          this.field_j = 0;
          this.field_g = -1L;
        }
    }

    final static void b(int param0, long param1) {
        int var3 = -66 / ((param0 + 8) / 38);
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L == 0L) {
          hg.a((byte) 90, -1L + param1);
          hg.a((byte) 90, 1L);
        } else {
          hg.a((byte) 90, param1);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
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
        var14 = VoidHunters.field_G;
        try {
          try {
            if (param0.length < param2 + param1) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param1 + param2);
            }
            if (-1L != this.field_g &&
              this.field_a >= this.field_g &&
              ((long)this.field_j + this.field_g) >= (this.field_a + (long)param1)) {
              cua.a(this.field_f, (int)(this.field_a - this.field_g), param0, param2, param1);
              this.field_a = this.field_a + (long)param1;
              return;
            }
            var5_long = this.field_a;
            var7 = param2;
            var8 = param1;
            if (this.field_e <= this.field_a &&
              (long)this.field_l + this.field_e > this.field_a) {
              var9_int = (int)((long)this.field_l - this.field_a + this.field_e);
              if (var9_int > param1) {
                var9_int = param1;
              }
              cua.a(this.field_h, (int)(-this.field_e + this.field_a), param0, param2, var9_int);
              param2 = param2 + var9_int;
              param1 = param1 - var9_int;
              this.field_a = this.field_a + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_h.length) {
              this.field_m.a((byte) -38, this.field_a);
              this.field_c = this.field_a;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_m.a((byte) -60, param1, param0, param2);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_c = this.field_c + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
                this.field_a = this.field_a + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.c(param3 - 199969460);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_l) {
                var9_intLifetime1Lifetime1 = this.field_l;
              }
              cua.a(this.field_h, 0, param0, param2, var9_intLifetime1Lifetime1);
              param2 = param2 + var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.field_a = this.field_a + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_g != -1L) {
              if (this.field_g > this.field_a &&
                0 < param1) {
                var9_intLifetime2 = (int)(-this.field_a + this.field_g) + param2;
                if (param2 + param1 < var9_intLifetime2) {
                  var9_intLifetime2 = param1 + param2;
                }
                while (param2 < var9_intLifetime2) {
                  incrementValue$0 = param2;
                  param2++;
                  param0[incrementValue$0] = (byte) 0;
                  param1--;
                  this.field_a = this.field_a + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_g >= var5_long &&
                this.field_g < (long)var8 + var5_long) {
                var9 = this.field_g;
              } else {
                if (this.field_g <= var5_long &&
                  ((long)this.field_j + this.field_g) > var5_long) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (this.field_g + (long)this.field_j) &&
                (long)this.field_j + this.field_g <= var5_long + (long)var8) {
                var11 = this.field_g + (long)this.field_j;
              } else {
                if (var5_long + (long)var8 > this.field_g &&
                  ((long)var8 + var5_long) <= ((long)this.field_j + this.field_g)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                cua.a(this.field_f, (int)(-this.field_g + var9), param0, var7 + (int)(var9 - var5_long), var13);
                if (this.field_a < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_a));
                  this.field_a = var11;
                }
              }
            }
            if (param3 != -30541) {
              this.field_m = (au) null;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_c = -1L;
            throw var5;
          }
          if (0 < param1) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("gdb.B(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    gdb(au param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_j = 0;
        this.field_e = -1L;
        this.field_g = -1L;
        try {
          this.field_m = param0;
          dupTemp$0 = param0.a(1);
          this.field_k = dupTemp$0;
          this.field_b = dupTemp$0;
          this.field_f = new byte[param2];
          this.field_h = new byte[param1];
          this.field_a = 0L;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gdb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Accept unrated rematch";
    }
}
