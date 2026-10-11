/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ew {
    private long field_e;
    static String field_d;
    private byte[] field_k;
    private long field_c;
    private long field_m;
    private ao field_j;
    private long field_l;
    private int field_g;
    private int field_b;
    private byte[] field_h;
    private long field_f;
    private long field_i;
    static int field_a;

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        if (param0 == 4) {
          this.field_m = param1;
          return;
        }
    }

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = lw.field_e;
        synchronized (var1) {
          nl.field_p = ao.field_d;
          lb.field_M = lb.field_M + 1;
          el.field_A = vf.field_G;
          n.field_m = gf.field_b;
          el.field_C = rp.field_A;
          rp.field_A = false;
          wj.field_A = vu.field_Fb;
          sm.field_q = fp.field_w;
          vc.field_y = fd.field_l;
          vu.field_Fb = 0;
        }
        if (param0 != 58) {
          field_d = (String) null;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -11 / ((67 - param0) / 50);
          if (!vg.field_Wb) {
            return false;
          }
          if (ov.field_b == 2 &&
            null != qi.field_o) {
            var3 = (CharSequence) ((Object) param1);
            if (!qi.field_o.equals(mo.a(0, var3))) {
              return false;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ew.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, hu param2, hu param3) {
        try {
          vp.field_k = param1;
          sf.field_F = param3;
          cv.field_f = param2;
          int var4_int = 82 / ((60 - param0) / 61);
          bs.a(on.field_f / 2, 0, on.field_g / 2);
          sb.a(param3.field_L, param3.field_p + param3.field_L, param2.field_L, param2.field_p + param2.field_L, (byte) 5);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ew.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        this.field_b = param0;
        if (~this.field_c != ~this.field_m) {
          this.field_j.a(param0 ^ 15557, this.field_m);
          this.field_c = this.field_m;
        }
        this.field_e = this.field_m;
        while (this.field_h.length > this.field_b) {
          var2 = this.field_h.length - this.field_b;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_j.a(33, var2, this.field_h, this.field_b);
          if (var3 != -1) {
            this.field_c = this.field_c + (long)var3;
            this.field_b = this.field_b + var3;
            continue;
          }
          break;
        }
    }

    public static void d(int param0) {
        if (param0 <= 68) {
          field_d = (String) null;
        }
        field_d = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          if (param0 <= 57) {
            this.field_c = -73L;
          }
          this.a(param1.length, 0, (byte) 115, param1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ew.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) throws IOException {
        this.e(121);
        this.field_j.a(param0 ^ -111);
        if (param0 != 1) {
          String var3 = (String) null;
          ew.a(60, (String) null);
        }
    }

    final long a(int param0) {
        int var2 = 97 % ((-25 - param0) / 45);
        return this.field_f;
    }

    final static void a(boolean param0, sj param1, sj param2, int param3) {
        try {
          el.a(jw.field_Ab, kr.field_b, kn.field_F, uk.field_b, nj.field_d, param0, r.field_c, jf.field_B, ul.field_c, dw.field_e, 5, ip.field_c);
          il.field_d = se.a(param1, -127, "lobby", "chatfilter");
          tf.field_h[2] = pa.field_j;
          tf.field_h[param3] = gr.field_Q;
          tf.field_h[1] = lk.field_n;
          at.a(rq.field_E, param2, (byte) -32);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ew.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1, ml param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_10_3;
        int stackIn_10_4;
        int stackIn_11_5 = 0;
        int stackIn_14_6;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 125) {
            field_a = -16;
          }
          stackIn_4_0 = -128;
          if (param3 != 0) {
            stackIn_5_1 = 1 << -1 + param3;
          } else {
            stackIn_5_1 = 0;
          }
          if (param1 != 0) {
            stackIn_8_2 = 1 << -1 + param1;
          } else {
            stackIn_8_2 = 0;
          }
          stackIn_10_3 = param4;
          stackIn_10_4 = param1;
          if (0 == param5) {
            stackIn_11_5 = 0;
          } else {
            stackIn_11_5 = 1 << param5 - 1;
          }
          if (0 != param4) {
            stackIn_14_6 = 1 << param4 - 1;
          } else {
            stackIn_14_6 = 0;
          }
          stackIn_15_0 = fs.a(stackIn_4_0, stackIn_5_1, stackIn_8_2, stackIn_10_3, stackIn_10_4, stackIn_11_5, stackIn_14_6, param2, param5, param3);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ew.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        var14 = Kickabout.field_G;
        try {
          try {
            if (param3.length < param0 + param1) {
              throw new ArrayIndexOutOfBoundsException(param0 + (param1 - param3.length));
            }
            if (this.field_l != -1L &&
              this.field_m >= this.field_l &&
              (this.field_m + (long)param0) <= (this.field_l + (long)this.field_g)) {
              dv.a(this.field_k, (int)(this.field_m - this.field_l), param3, param1, param0);
              this.field_m = this.field_m + (long)param0;
              return;
            }
            var5_long = this.field_m;
            var7 = param1;
            var8 = param0;
            if (param2 < 89) {
              return;
            }
            if (this.field_m >= this.field_e &&
              this.field_e + (long)this.field_b > this.field_m) {
              var9_int = (int)((long)this.field_b + (this.field_e - this.field_m));
              if (var9_int > param0) {
                var9_int = param0;
              }
              dv.a(this.field_h, (int)(this.field_m - this.field_e), param3, param1, var9_int);
              param0 = param0 - var9_int;
              param1 = param1 + var9_int;
              this.field_m = this.field_m + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_h.length < param0) {
              this.field_j.a(15557, this.field_m);
              this.field_c = this.field_m;
              while (param0 > 0) {
                var9_intLifetime1 = this.field_j.a(33, param0, param3, param1);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_m = this.field_m + (long)var9_intLifetime1;
                this.field_c = this.field_c + (long)var9_intLifetime1;
                param0 = param0 - var9_intLifetime1;
                param1 = param1 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (0 < param0)) {
              this.b(0);
              var9_intLifetime1Lifetime1 = param0;
              if (this.field_b < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_b;
              }
              dv.a(this.field_h, 0, param3, param1, var9_intLifetime1Lifetime1);
              this.field_m = this.field_m + (long)var9_intLifetime1Lifetime1;
              param1 = param1 + var9_intLifetime1Lifetime1;
              param0 = param0 - var9_intLifetime1Lifetime1;
            }
            if (this.field_l != -1L) {
              if (this.field_m < this.field_l &&
                0 < param0) {
                var9_intLifetime2 = (int)(this.field_l - this.field_m) + param1;
                if (var9_intLifetime2 > param0 + param1) {
                  var9_intLifetime2 = param1 + param0;
                }
                while (var9_intLifetime2 > param1) {
                  incrementValue$0 = param1;
                  param1++;
                  param3[incrementValue$0] = (byte) 0;
                  param0--;
                  this.field_m = this.field_m + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_l >= var5_long &&
                (long)var8 + var5_long > this.field_l) {
                var9 = this.field_l;
              } else {
                if (var5_long >= this.field_l &&
                  var5_long < (long)this.field_g + this.field_l) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (this.field_l + (long)this.field_g) &&
                var5_long + (long)var8 >= (long)this.field_g + this.field_l) {
                var11 = this.field_l + (long)this.field_g;
              } else {
                if (this.field_l < ((long)var8 + var5_long) &&
                  var5_long + (long)var8 <= (long)this.field_g + this.field_l) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                dv.a(this.field_k, (int)(-this.field_l + var9), param3, (int)(-var5_long + var9) + var7, var13);
                if (this.field_m < var11) {
                  param0 = (int)((long)param0 - (var11 - this.field_m));
                  this.field_m = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_c = -1L;
            throw var5;
          }
          if (0 < param0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("ew.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          try {
            if (this.field_f < (this.field_m + (long)param2)) {
              this.field_f = (long)param2 + this.field_m;
            }
            if (this.field_l != -1L) {
              if (this.field_m >= this.field_l) {
                if ((this.field_l + (long)this.field_g) < this.field_m) {
                  this.e(102);
                }
              } else {
                this.e(102);
              }
            }
            if (param1 <= 37) {
              return;
            }
            if (this.field_l != -1L &&
              ((long)this.field_k.length + this.field_l) < (this.field_m + (long)param2)) {
              var5_int = (int)((long)this.field_k.length - (-this.field_l + this.field_m));
              dv.a(param3, param0, this.field_k, (int)(this.field_m - this.field_l), var5_int);
              param2 = param2 - var5_int;
              this.field_m = this.field_m + (long)var5_int;
              param0 = param0 + var5_int;
              this.field_g = this.field_k.length;
              this.e(109);
            }
            if (this.field_k.length >= param2) {
              if (param2 <= 0) {
                return;
              }
              if (this.field_l == -1L) {
                this.field_l = this.field_m;
              }
              dv.a(param3, param0, this.field_k, (int)(this.field_m - this.field_l), param2);
              this.field_m = this.field_m + (long)param2;
              if ((long)this.field_g < this.field_m - this.field_l) {
                this.field_g = (int)(-this.field_l + this.field_m);
              }
              return;
            }
            if (~this.field_c != ~this.field_m) {
              this.field_j.a(15557, this.field_m);
              this.field_c = this.field_m;
            }
            this.field_j.a(1, param3, param0, param2);
            this.field_c = this.field_c + (long)param2;
            if (this.field_c > this.field_i) {
              this.field_i = this.field_c;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_e <= this.field_m &&
              (long)this.field_b + this.field_e > this.field_m) {
              var5_long = this.field_m;
            } else {
              if (this.field_e >= this.field_m &&
                this.field_e < (long)param2 + this.field_m) {
                var5_long = this.field_e;
              }
            }
            if (this.field_m + (long)param2 > this.field_e &&
              (this.field_m + (long)param2) <= (this.field_e + (long)this.field_b)) {
              var7 = (long)param2 + this.field_m;
            } else {
              if (this.field_m < this.field_e + (long)this.field_b &&
                this.field_e + (long)this.field_b <= this.field_m + (long)param2) {
                var7 = this.field_e + (long)this.field_b;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(var7 - var5_long);
              dv.a(param3, (int)((long)param0 - (-var5_long + this.field_m)), this.field_h, (int)(-this.field_e + var5_long), var9);
            }
            this.field_m = this.field_m + (long)param2;
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
          stackIn_55_0 = var5_ref;
          stackIn_55_1 = new StringBuilder().append("ew.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    private final void e(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        var7 = Kickabout.field_G;
        if (param0 <= 92) {
          this.field_f = 70L;
        }
        if (-1L != this.field_l) {
          if (this.field_c != this.field_l) {
            this.field_j.a(15557, this.field_l);
            this.field_c = this.field_l;
          }
          this.field_j.a(1, this.field_k, 0, this.field_g);
          this.field_c = this.field_c + (long)this.field_g;
          if (this.field_i < this.field_c) {
            this.field_i = this.field_c;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_l >= this.field_e &&
            this.field_l < (this.field_e + (long)this.field_b)) {
            var2 = this.field_l;
          } else {
            if (this.field_e >= this.field_l &&
              ((long)this.field_g + this.field_l) > this.field_e) {
              var2 = this.field_e;
            }
          }
          if (this.field_l + (long)this.field_g > this.field_e &&
            (long)this.field_b + this.field_e >= this.field_l + (long)this.field_g) {
            var4 = this.field_l + (long)this.field_g;
          } else {
            if (((long)this.field_b + this.field_e) > this.field_l &&
              (this.field_l + (long)this.field_g) >= ((long)this.field_b + this.field_e)) {
              var4 = (long)this.field_b + this.field_e;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            dv.a(this.field_k, (int)(var2 - this.field_l), this.field_h, (int)(-this.field_e + var2), var6);
          }
          this.field_g = 0;
          this.field_l = -1L;
        }
    }

    ew(ao param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_e = -1L;
        this.field_l = -1L;
        this.field_g = 0;
        try {
          this.field_j = param0;
          dupTemp$0 = param0.c(31114);
          this.field_i = dupTemp$0;
          this.field_f = dupTemp$0;
          this.field_k = new byte[param2];
          this.field_h = new byte[param1];
          this.field_m = 0L;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ew.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "The auction system is currently offline.";
    }
}
