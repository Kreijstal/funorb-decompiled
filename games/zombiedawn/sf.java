/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sf {
    private long field_g;
    private long field_h;
    private byte[] field_b;
    private long field_c;
    private int field_a;
    static vo field_n;
    static pf field_j;
    private int field_m;
    private long field_e;
    static int[] field_d;
    private long field_l;
    private byte[] field_i;
    private long field_f;
    private qn field_k;

    public static void c(int param0) {
        field_n = null;
        field_j = null;
        if (param0 != 0) {
          field_j = (pf) null;
        }
        field_d = null;
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 >= 0L) {
          this.field_e = param1;
          if (param0 != 0) {
            this.a(-64);
          }
          return;
        }
        throw new IOException();
    }

    final void b(int param0) throws IOException {
        if (param0 != 463) {
          sf.c(64);
        }
        this.a((byte) -115);
        this.field_k.c(-88);
    }

    final long a(int param0) {
        if (param0 != -1) {
          this.field_l = 45L;
        }
        return this.field_g;
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
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
        var14 = ZombieDawn.field_J;
        try {
          try {
            if (param2 + param0 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param0 + (param2 - param3.length));
            }
            if (this.field_h != -1L &&
              this.field_e >= this.field_h &&
              (this.field_h + (long)this.field_m) >= ((long)param0 + this.field_e)) {
              gp.a(this.field_b, (int)(-this.field_h + this.field_e), param3, param2, param0);
              this.field_e = this.field_e + (long)param0;
              return;
            }
            var5_long = this.field_e;
            var7 = param2;
            if (param1) {
              this.a(105);
            }
            var8 = param0;
            if (this.field_e >= this.field_l &&
              this.field_l + (long)this.field_a > this.field_e) {
              var9_int = (int)((long)this.field_a - (-this.field_l + this.field_e));
              if (var9_int > param0) {
                var9_int = param0;
              }
              gp.a(this.field_i, (int)(-this.field_l + this.field_e), param3, param2, var9_int);
              param2 = param2 + var9_int;
              this.field_e = this.field_e + (long)var9_int;
              param0 = param0 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param0 > this.field_i.length) {
              this.field_k.a((byte) -113, this.field_e);
              this.field_c = this.field_e;
              while (0 < param0) {
                var9_intLifetime1 = this.field_k.a(param2, param3, param0, (byte) -118);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param0 = param0 - var9_intLifetime1;
                this.field_c = this.field_c + (long)var9_intLifetime1;
                this.field_e = this.field_e + (long)var9_intLifetime1;
                param2 = param2 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param0)) {
              this.a(true);
              var9_intLifetime1Lifetime1 = param0;
              if (var9_intLifetime1Lifetime1 > this.field_a) {
                var9_intLifetime1Lifetime1 = this.field_a;
              }
              gp.a(this.field_i, 0, param3, param2, var9_intLifetime1Lifetime1);
              param0 = param0 - var9_intLifetime1Lifetime1;
              this.field_e = this.field_e + (long)var9_intLifetime1Lifetime1;
              param2 = param2 + var9_intLifetime1Lifetime1;
            }
            if (this.field_h != -1L) {
              if (this.field_e < this.field_h &&
                param0 > 0) {
                var9_intLifetime2 = (int)(-this.field_e + this.field_h) + param2;
                if (var9_intLifetime2 > param2 + param0) {
                  var9_intLifetime2 = param0 + param2;
                }
                while (param2 < var9_intLifetime2) {
                  incrementValue$0 = param2;
                  param2++;
                  param3[incrementValue$0] = (byte) 0;
                  param0--;
                  this.field_e = this.field_e + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_h &&
                ((long)var8 + var5_long) > this.field_h) {
                var9 = this.field_h;
              } else {
                if (var5_long >= this.field_h &&
                  (long)this.field_m + this.field_h > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (this.field_h + (long)this.field_m > var5_long &&
                (var5_long + (long)var8) >= ((long)this.field_m + this.field_h)) {
                var11 = this.field_h + (long)this.field_m;
              } else {
                if (this.field_h < var5_long + (long)var8 &&
                  var5_long + (long)var8 <= this.field_h + (long)this.field_m) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                gp.a(this.field_b, (int)(var9 - this.field_h), param3, var7 + (int)(-var5_long + var9), var13);
                if (var11 > this.field_e) {
                  param0 = (int)((long)param0 - (var11 - this.field_e));
                  this.field_e = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_c = -1L;
            throw var5;
          }
          if (param0 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var5_ref;
          stackIn_60_1 = new StringBuilder().append("sf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(param1.length, false, 0, param1);
          int var3_int = 105 / ((-64 - param0) / 58);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = ZombieDawn.field_J;
        try {
          try {
            if ((this.field_e + (long)param3) > this.field_g) {
              this.field_g = this.field_e + (long)param3;
            }
            if (this.field_h != -1L && (this.field_h > this.field_e ||
              this.field_e > this.field_h + (long)this.field_m)) {
              this.a((byte) -115);
            }
            if (this.field_h != -1L &&
              (long)param3 + this.field_e > this.field_h + (long)this.field_b.length) {
              var5_int = (int)(this.field_h - (this.field_e - (long)this.field_b.length));
              gp.a(param1, param2, this.field_b, (int)(-this.field_h + this.field_e), var5_int);
              param2 = param2 + var5_int;
              this.field_e = this.field_e + (long)var5_int;
              param3 = param3 - var5_int;
              this.field_m = this.field_b.length;
              this.a((byte) -115);
            }
            if (param3 <= this.field_b.length) {
              if (0 >= param3) {
                if (param0 < 40) {
                  sf.c(17);
                }
                return;
              }
              if (this.field_h == -1L) {
                this.field_h = this.field_e;
              }
              gp.a(param1, param2, this.field_b, (int)(this.field_e - this.field_h), param3);
              this.field_e = this.field_e + (long)param3;
              if ((-this.field_h + this.field_e) > (long)this.field_m) {
                this.field_m = (int)(this.field_e - this.field_h);
              }
              return;
            }
            if (~this.field_c != ~this.field_e) {
              this.field_k.a((byte) -104, this.field_e);
              this.field_c = this.field_e;
            }
            this.field_k.a(0, param3, param1, param2);
            this.field_c = this.field_c + (long)param3;
            if (this.field_f < this.field_c) {
              this.field_f = this.field_c;
            }
            var5_long = -1L;
            if (this.field_e >= this.field_l &&
              ((long)this.field_a + this.field_l) > this.field_e) {
              var5_long = this.field_e;
            } else {
              if (this.field_e <= this.field_l &&
                ((long)param3 + this.field_e) > this.field_l) {
                var5_long = this.field_l;
              }
            }
            var7 = -1L;
            if (this.field_l < this.field_e + (long)param3 &&
              (long)this.field_a + this.field_l >= this.field_e + (long)param3) {
              var7 = (long)param3 + this.field_e;
            } else {
              if (this.field_e < (long)this.field_a + this.field_l &&
                (long)param3 + this.field_e >= (long)this.field_a + this.field_l) {
                var7 = (long)this.field_a + this.field_l;
              }
            }
            if (-1L < var5_long &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              gp.a(param1, (int)(-this.field_e + (long)param2 + var5_long), this.field_i, (int)(-this.field_l + var5_long), var9);
            }
            this.field_e = this.field_e + (long)param3;
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
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("sf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = ZombieDawn.field_J;
        if (param0 != -115) {
          return;
        }
        if (this.field_h != -1L) {
          if (~this.field_c != ~this.field_h) {
            this.field_k.a((byte) -104, this.field_h);
            this.field_c = this.field_h;
          }
          this.field_k.a(0, this.field_m, this.field_b, 0);
          this.field_c = this.field_c + (long)this.field_m;
          if (this.field_c > this.field_f) {
            this.field_f = this.field_c;
          }
          var2 = -1L;
          if (this.field_h >= this.field_l &&
            this.field_h < ((long)this.field_a + this.field_l)) {
            var2 = this.field_h;
          } else {
            if (this.field_h <= this.field_l &&
              this.field_l < (this.field_h + (long)this.field_m)) {
              var2 = this.field_l;
            }
          }
          var4 = -1L;
          if (this.field_l < (this.field_h + (long)this.field_m) &&
            ((long)this.field_a + this.field_l) >= (this.field_h + (long)this.field_m)) {
            var4 = this.field_h + (long)this.field_m;
          } else {
            if (this.field_h < this.field_l + (long)this.field_a &&
              ((long)this.field_a + this.field_l) <= ((long)this.field_m + this.field_h)) {
              var4 = (long)this.field_a + this.field_l;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            gp.a(this.field_b, (int)(var2 - this.field_h), this.field_i, (int)(-this.field_l + var2), var6);
          }
          this.field_m = 0;
          this.field_h = -1L;
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        this.field_a = 0;
        if (this.field_c != this.field_e) {
          this.field_k.a((byte) -101, this.field_e);
          this.field_c = this.field_e;
        }
        this.field_l = this.field_e;
        while (this.field_i.length > this.field_a) {
          var2 = this.field_i.length - this.field_a;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_k.a(this.field_a, this.field_i, var2, (byte) -103);
          if (var3 == -1) {
            break;
          }
          this.field_a = this.field_a + var3;
          this.field_c = this.field_c + (long)var3;
        }
        if (!param0) {
          this.a(-87);
        }
    }

    sf(qn param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_h = -1L;
        this.field_m = 0;
        this.field_l = -1L;
        try {
          this.field_k = param0;
          dupTemp$0 = param0.b(100);
          this.field_f = dupTemp$0;
          this.field_g = dupTemp$0;
          this.field_i = new byte[param1];
          this.field_b = new byte[param2];
          this.field_e = 0L;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_n = null;
        field_d = new int[]{26, 182, 370, 463};
    }
}
