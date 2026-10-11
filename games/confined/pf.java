/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private byte[] field_e;
    private long field_k;
    private int field_j;
    private long field_m;
    private byte[] field_l;
    private long field_a;
    private long field_d;
    private long field_b;
    private int field_f;
    private fm field_g;
    private long field_c;
    static int[] field_h;
    static String field_i;

    final void c(int param0) throws IOException {
        this.a(0);
        this.field_g.b(0);
        if (param0 >= -77) {
          this.field_a = -48L;
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        try {
          if (param1 != 9) {
            return;
          }
          try {
            if ((this.field_c + (long)param0) > this.field_m) {
              this.field_m = (long)param0 + this.field_c;
            }
            if (this.field_a != -1L) {
              if (this.field_c >= this.field_a) {
                if (this.field_c > this.field_a + (long)this.field_f) {
                  this.a(0);
                }
              } else {
                this.a(0);
              }
            }
            if (this.field_a != -1L &&
              ((long)this.field_l.length + this.field_a) < ((long)param0 + this.field_c)) {
              var5_int = (int)(this.field_a - (this.field_c - (long)this.field_l.length));
              lj.a(param3, param2, this.field_l, (int)(this.field_c - this.field_a), var5_int);
              param0 = param0 - var5_int;
              param2 = param2 + var5_int;
              this.field_c = this.field_c + (long)var5_int;
              this.field_f = this.field_l.length;
              this.a(0);
            }
            if (this.field_l.length >= param0) {
              if (param0 <= 0) {
                return;
              }
              if (-1L == this.field_a) {
                this.field_a = this.field_c;
              }
              lj.a(param3, param2, this.field_l, (int)(this.field_c - this.field_a), param0);
              this.field_c = this.field_c + (long)param0;
              if ((-this.field_a + this.field_c) > (long)this.field_f) {
                this.field_f = (int)(-this.field_a + this.field_c);
              }
              return;
            }
            if (~this.field_c != ~this.field_b) {
              this.field_g.a(-54, this.field_c);
              this.field_b = this.field_c;
            }
            this.field_g.a(-20832, param0, param3, param2);
            this.field_b = this.field_b + (long)param0;
            if (this.field_k < this.field_b) {
              this.field_k = this.field_b;
            }
            var5_long = -1L;
            if (this.field_c >= this.field_d &&
              ((long)this.field_j + this.field_d) > this.field_c) {
              var5_long = this.field_c;
            } else {
              if (this.field_d >= this.field_c &&
                this.field_c + (long)param0 > this.field_d) {
                var5_long = this.field_d;
              }
            }
            var7 = -1L;
            if (((long)param0 + this.field_c) > this.field_d &&
              (this.field_c + (long)param0) <= (this.field_d + (long)this.field_j)) {
              var7 = this.field_c + (long)param0;
            } else {
              if (this.field_c < (long)this.field_j + this.field_d &&
                this.field_c + (long)param0 >= (long)this.field_j + this.field_d) {
                var7 = this.field_d + (long)this.field_j;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              lj.a(param3, (int)((long)param2 + var5_long - this.field_c), this.field_e, (int)(var5_long - this.field_d), var9);
            }
            this.field_c = this.field_c + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_56_0 = var5_ref;
          stackIn_56_1 = new StringBuilder().append("pf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (0L <= param1) {
          if (param0 != 123) {
            CharSequence[] var5 = (CharSequence[]) null;
            pf.a(-121, (CharSequence[]) null);
          }
          this.field_c = param1;
          return;
        }
        throw new IOException();
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        CharSequence[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 11739) {
            var3 = (CharSequence[]) null;
            pf.a(-18, (CharSequence[]) null);
          }
          stackIn_3_0 = fc.a(param1, -2, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final long b(byte param0) {
        if (param0 < 95) {
          CharSequence[] var3 = (CharSequence[]) null;
          pf.a(-91, (CharSequence[]) null);
        }
        return this.field_m;
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
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
        var14 = Confined.field_J ? 1 : 0;
        try {
          if (param2 <= 83) {
            this.field_g = (fm) null;
          }
          try {
            if (param1.length < param0 + param3) {
              throw new ArrayIndexOutOfBoundsException(param0 + (param3 - param1.length));
            }
            if (this.field_a != -1L &&
              this.field_c >= this.field_a &&
              ((long)param3 + this.field_c) <= (this.field_a + (long)this.field_f)) {
              lj.a(this.field_l, (int)(this.field_c - this.field_a), param1, param0, param3);
              this.field_c = this.field_c + (long)param3;
              return;
            }
            var5_long = this.field_c;
            var7 = param0;
            var8 = param3;
            if (this.field_c >= this.field_d &&
              this.field_c < (this.field_d + (long)this.field_j)) {
              var9_int = (int)((long)this.field_j + (this.field_d - this.field_c));
              if (param3 < var9_int) {
                var9_int = param3;
              }
              lj.a(this.field_e, (int)(-this.field_d + this.field_c), param1, param0, var9_int);
              param0 = param0 + var9_int;
              this.field_c = this.field_c + (long)var9_int;
              param3 = param3 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_e.length < param3) {
              this.field_g.a(100, this.field_c);
              this.field_b = this.field_c;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_g.a(false, param1, param0, param3);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param3 = param3 - var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
                this.field_b = this.field_b + (long)var9_intLifetime1;
                this.field_c = this.field_c + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.a((byte) -55);
              var9_intLifetime1Lifetime1 = param3;
              if (var9_intLifetime1Lifetime1 > this.field_j) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              lj.a(this.field_e, 0, param1, param0, var9_intLifetime1Lifetime1);
              this.field_c = this.field_c + (long)var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_c < this.field_a &&
                param3 > 0) {
                var9_intLifetime2 = param0 + (int)(this.field_a - this.field_c);
                if (var9_intLifetime2 > param3 + param0) {
                  var9_intLifetime2 = param0 + param3;
                }
                while (param0 < var9_intLifetime2) {
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  param3--;
                  this.field_c = this.field_c + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_a &&
                this.field_a < (var5_long + (long)var8)) {
                var9 = this.field_a;
              } else {
                if (this.field_a <= var5_long &&
                  (long)this.field_f + this.field_a > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (this.field_a + (long)this.field_f > var5_long &&
                (var5_long + (long)var8) >= (this.field_a + (long)this.field_f)) {
                var11 = (long)this.field_f + this.field_a;
              } else {
                if (this.field_a < (var5_long + (long)var8) &&
                  this.field_a + (long)this.field_f >= (long)var8 + var5_long) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                lj.a(this.field_l, (int)(-this.field_a + var9), param1, var7 + (int)(var9 - var5_long), var13);
                if (var11 > this.field_c) {
                  param3 = (int)((long)param3 - (var11 - this.field_c));
                  this.field_c = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
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
          stackIn_65_1 = new StringBuilder().append("pf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != -4) {
          return;
        }
        try {
          this.a(0, param0, (byte) 123, param0.length);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        this.field_j = 0;
        if (this.field_c != this.field_b) {
          this.field_g.a(-125, this.field_c);
          this.field_b = this.field_c;
        }
        if (param0 >= -31) {
          this.field_e = (byte[]) null;
        }
        this.field_d = this.field_c;
        while (this.field_j < this.field_e.length) {
          var2 = this.field_e.length - this.field_j;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_g.a(false, this.field_e, this.field_j, var2);
          if (var3 == -1) {
            break;
          }
          this.field_j = this.field_j + var3;
          this.field_b = this.field_b + (long)var3;
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Confined.field_J ? 1 : 0;
        if (-1L != this.field_a) {
          if (~this.field_b != ~this.field_a) {
            this.field_g.a(113, this.field_a);
            this.field_b = this.field_a;
          }
          this.field_g.a(-20832, this.field_f, this.field_l, 0);
          this.field_b = this.field_b + (long)this.field_f;
          if (this.field_k < this.field_b) {
            this.field_k = this.field_b;
          }
          var2 = -1L;
          if (this.field_d <= this.field_a &&
            ((long)this.field_j + this.field_d) > this.field_a) {
            var2 = this.field_a;
          } else {
            if (this.field_a <= this.field_d &&
              this.field_d < (this.field_a + (long)this.field_f)) {
              var2 = this.field_d;
            }
          }
          var4 = -1L;
          if (this.field_d < ((long)this.field_f + this.field_a) &&
            (this.field_a + (long)this.field_f) <= (this.field_d + (long)this.field_j)) {
            var4 = this.field_a + (long)this.field_f;
          } else {
            if ((long)this.field_j + this.field_d > this.field_a &&
              ((long)this.field_j + this.field_d) <= (this.field_a + (long)this.field_f)) {
              var4 = (long)this.field_j + this.field_d;
            }
          }
          if (-1L < var2 &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            lj.a(this.field_l, (int)(var2 - this.field_a), this.field_e, (int)(var2 - this.field_d), var6);
          }
          this.field_f = 0;
          this.field_a = -1L;
        }
        if (param0 != 0) {
          this.field_f = -20;
        }
    }

    public static void b(int param0) {
        if (param0 > -42) {
          return;
        }
        field_i = null;
        field_h = null;
    }

    pf(fm param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = -1L;
        this.field_f = 0;
        this.field_d = -1L;
        try {
          this.field_g = param0;
          dupTemp$0 = param0.a((byte) -115);
          this.field_k = dupTemp$0;
          this.field_m = dupTemp$0;
          this.field_l = new byte[param2];
          this.field_c = 0L;
          this.field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = new int[]{0, 0, 640, 0, 640, 376, 0, 376};
        field_i = "Hold <col=FFFFFF>Ctrl</col> to fire!";
    }
}
