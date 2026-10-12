/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_i;
    private ei field_j;
    private long field_n;
    private byte[] field_b;
    private long field_l;
    private long field_m;
    private int field_c;
    static String field_a;
    private byte[] field_f;
    private long field_g;
    static String field_e;
    private long field_h;
    private int field_d;
    static RgbSprite[] field_k;

    final static int a(long param0, long param1, byte param2) {
        if (param2 != 97) {
          field_a = (String) null;
        }
        return (int)((param0 << 16) / param1);
    }

    final static boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        if (0 > param3) {
          return true;
        }
        if (!(ve.field_a[param0][param3] >= 0)) {
          return false;
        }
        if (param2) {
          return true;
        }
        if (param4 != -1208926000) {
          field_a = (String) null;
        }
        if (param1 < el.field_f[param0][param3]) {
          return false;
        }
        if (ve.field_a[param0][param3] < 0) {
          return false;
        }
        if (ve.field_a[param0][param3] != (param5 & ve.field_a[param0][param3])) {
          return false;
        }
        return true;
    }

    final long a(boolean param0) {
        if (!param0) {
          ue.a((byte) 77);
        }
        return this.field_g;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if ((long)param0 + this.field_h > this.field_g) {
              this.field_g = (long)param0 + this.field_h;
            }
            if (this.field_m != -1L && (this.field_h < this.field_m ||
              (this.field_m + (long)this.field_c) < this.field_h)) {
              this.d((byte) 111);
            }
            if (this.field_m != -1L &&
              this.field_m + (long)this.field_b.length < this.field_h + (long)param0) {
              var5_int = (int)(-this.field_h + this.field_m + (long)this.field_b.length);
              vm.a(param3, param1, this.field_b, (int)(-this.field_m + this.field_h), var5_int);
              param1 = param1 + var5_int;
              this.field_h = this.field_h + (long)var5_int;
              param0 = param0 - var5_int;
              this.field_c = this.field_b.length;
              this.d((byte) 111);
            }
            if (param0 <= this.field_b.length) {
              if (0 >= param0) {
                if (param2 <= 0) {
                  ue.a((byte) -46);
                }
                return;
              }
              if (this.field_m == -1L) {
                this.field_m = this.field_h;
              }
              vm.a(param3, param1, this.field_b, (int)(-this.field_m + this.field_h), param0);
              this.field_h = this.field_h + (long)param0;
              if ((this.field_h - this.field_m) > (long)this.field_c) {
                this.field_c = (int)(-this.field_m + this.field_h);
              }
              return;
            }
            if (this.field_h != this.field_l) {
              this.field_j.a(this.field_h, 113);
              this.field_l = this.field_h;
            }
            this.field_j.a(1, param1, param0, param3);
            this.field_l = this.field_l + (long)param0;
            if (this.field_l > this.field_n) {
              this.field_n = this.field_l;
            }
            var5_long = -1L;
            if (this.field_i <= this.field_h &&
              this.field_h < this.field_i + (long)this.field_d) {
              var5_long = this.field_h;
            } else {
              if (this.field_i >= this.field_h &&
                this.field_i < ((long)param0 + this.field_h)) {
                var5_long = this.field_i;
              }
            }
            var7 = -1L;
            if ((this.field_h + (long)param0) > this.field_i &&
              (long)this.field_d + this.field_i >= (long)param0 + this.field_h) {
              var7 = (long)param0 + this.field_h;
            } else {
              if (this.field_h < (long)this.field_d + this.field_i &&
                (this.field_i + (long)this.field_d) <= ((long)param0 + this.field_h)) {
                var7 = this.field_i + (long)this.field_d;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              vm.a(param3, (int)(-this.field_h + ((long)param1 + var5_long)), this.field_f, (int)(var5_long - this.field_i), var9);
            }
            this.field_h = this.field_h + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_51_0 = var5_ref;
          stackIn_51_1 = new StringBuilder().append("ue.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static nc a(kl param0, int param1, kl param2, byte param3, int param4) {
        RuntimeException var5 = null;
        nc stackIn_2_0 = null;
        nc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -10) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          if (!kp.a(false, param1, param0, param4)) {
            return null;
          }
          stackIn_7_0 = lq.a(param2.a((byte) 103, param4, param1), 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ue.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 <= 40) {
          field_k = (RgbSprite[]) null;
        }
        field_a = null;
        field_k = null;
        field_e = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(param0, param1, (byte) -103, param1.length);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ue.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 != 81) {
          this.field_c = 28;
        }
        this.d((byte) 111);
        this.field_j.b(param0 + 702);
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3) {
        if (param2 != 1) {
          ue.b((byte) 15);
        }
        return cq.a(param1, 1, param0, (byte) 58, param3);
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          try {
            if (param0 + param3 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param0 + param3);
            }
            if (this.field_m != -1L &&
              this.field_m <= this.field_h &&
              ((long)this.field_c + this.field_m) >= ((long)param3 + this.field_h)) {
              vm.a(this.field_b, (int)(-this.field_m + this.field_h), param1, param0, param3);
              this.field_h = this.field_h + (long)param3;
              return;
            }
            var5_long = this.field_h;
            var7 = param0;
            var8 = param3;
            if (this.field_h >= this.field_i &&
              ((long)this.field_d + this.field_i) > this.field_h) {
              var9_int = (int)(this.field_i - this.field_h + (long)this.field_d);
              if (param3 < var9_int) {
                var9_int = param3;
              }
              vm.a(this.field_f, (int)(-this.field_i + this.field_h), param1, param0, var9_int);
              param0 = param0 + var9_int;
              param3 = param3 - var9_int;
              this.field_h = this.field_h + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_f.length < param3) {
              this.field_j.a(this.field_h, 112);
              this.field_l = this.field_h;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_j.a(param3, -78, param1, param0);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_l = this.field_l + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
                this.field_h = this.field_h + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param3)) {
              this.e((byte) -42);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_d < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_d;
              }
              vm.a(this.field_f, 0, param1, param0, var9_intLifetime1Lifetime1);
              param3 = param3 - var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
              this.field_h = this.field_h + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_m != -1L) {
              if (this.field_m > this.field_h &&
                param3 > 0) {
                var9_intLifetime2 = param0 + (int)(this.field_m - this.field_h);
                if (param3 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param3 + param0;
                }
                while (param0 < var9_intLifetime2) {
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_h = this.field_h + 1L;
                }
              }
              var9 = -1L;
              if (this.field_m >= var5_long &&
                (long)var8 + var5_long > this.field_m) {
                var9 = this.field_m;
              } else {
                if (this.field_m <= var5_long &&
                  var5_long < this.field_m + (long)this.field_c) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < this.field_m + (long)this.field_c &&
                (this.field_m + (long)this.field_c) <= (var5_long + (long)var8)) {
                var11 = (long)this.field_c + this.field_m;
              } else {
                if ((long)var8 + var5_long > this.field_m &&
                  (this.field_m + (long)this.field_c) >= ((long)var8 + var5_long)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(-var9 + var11);
                vm.a(this.field_b, (int)(-this.field_m + var9), param1, (int)(-var5_long + var9) + var7, var13);
                if (var11 > this.field_h) {
                  param3 = (int)((long)param3 - (var11 - this.field_h));
                  this.field_h = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
          if (param3 > 0) {
            throw new EOFException();
          }
          if (param2 != -103) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("ue.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != -1) {
          return;
        }
        if (0L > param1) {
          throw new IOException();
        }
        this.field_h = param1;
    }

    private final void e(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        kl var5;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_d = 0;
        if (param0 != -42) {
          var5 = (kl) null;
          ue.a((kl) null, 70, (kl) null, (byte) -40, 15);
        }
        if (~this.field_l != ~this.field_h) {
          this.field_j.a(this.field_h, 110);
          this.field_l = this.field_h;
        }
        this.field_i = this.field_h;
        while (this.field_f.length > this.field_d) {
          var2 = this.field_f.length - this.field_d;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_j.a(var2, -118, this.field_f, this.field_d);
          if (var3 != -1) {
            this.field_l = this.field_l + (long)var3;
            this.field_d = this.field_d + var3;
            continue;
          }
          break;
        }
    }

    final static void a(byte param0) {
        t.field_c = kv.k(5);
        if (param0 < 78) {
          ue.a(59, -15, 35, -65);
        }
        SphinxActionRequest.field_v = new gk();
        TutorialController.h((byte) 74);
    }

    private final void d(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 111) {
          field_k = (RgbSprite[]) null;
        }
        if (this.field_m != -1L) {
          if (~this.field_m != ~this.field_l) {
            this.field_j.a(this.field_m, 114);
            this.field_l = this.field_m;
          }
          this.field_j.a(1, 0, this.field_c, this.field_b);
          this.field_l = this.field_l + (long)this.field_c;
          if (this.field_l > this.field_n) {
            this.field_n = this.field_l;
          }
          var2 = -1L;
          if (this.field_i <= this.field_m &&
            ((long)this.field_d + this.field_i) > this.field_m) {
            var2 = this.field_m;
          } else {
            if (this.field_i >= this.field_m &&
              this.field_m + (long)this.field_c > this.field_i) {
              var2 = this.field_i;
            }
          }
          var4 = -1L;
          if (this.field_i < ((long)this.field_c + this.field_m) &&
            this.field_i + (long)this.field_d >= (long)this.field_c + this.field_m) {
            var4 = (long)this.field_c + this.field_m;
          } else {
            if (this.field_m < ((long)this.field_d + this.field_i) &&
              (this.field_m + (long)this.field_c) >= ((long)this.field_d + this.field_i)) {
              var4 = this.field_i + (long)this.field_d;
            }
          }
          if (var2 > -1L &&
            var4 > var2) {
            var6 = (int)(var4 - var2);
            vm.a(this.field_b, (int)(-this.field_m + var2), this.field_f, (int)(var2 - this.field_i), var6);
          }
          this.field_m = -1L;
          this.field_c = 0;
        }
    }

    ue(ei param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_i = -1L;
        this.field_c = 0;
        try {
          this.field_j = param0;
          dupTemp$0 = param0.a(true);
          this.field_n = dupTemp$0;
          this.field_g = dupTemp$0;
          this.field_f = new byte[param1];
          this.field_b = new byte[param2];
          this.field_h = 0L;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "The '<%0>' setting needs to be changed.";
    }
}
