/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej {
    private int field_a;
    static int field_m;
    static String field_f;
    private byte[] field_k;
    private int field_b;
    private long field_g;
    private ra field_c;
    private long field_h;
    static String field_j;
    private long field_d;
    private long field_l;
    private long field_n;
    private long field_i;
    private byte[] field_o;
    static int field_e;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          try {
            if (((long)param1 + this.field_d) > this.field_h) {
              this.field_h = this.field_d + (long)param1;
            }
            if (this.field_n != -1L && (this.field_n > this.field_d ||
              this.field_n + (long)this.field_b < this.field_d)) {
              this.e(-117);
            }
            if (this.field_n != -1L &&
              this.field_d + (long)param1 > (long)this.field_o.length + this.field_n) {
              var5_int = (int)((long)this.field_o.length + this.field_n - this.field_d);
              ps.a(param3, param2, this.field_o, (int)(-this.field_n + this.field_d), var5_int);
              this.field_d = this.field_d + (long)var5_int;
              param1 = param1 - var5_int;
              param2 = param2 + var5_int;
              this.field_b = this.field_o.length;
              this.e(-117);
            }
            var5_intLifetime1 = -125 % ((32 - param0) / 43);
            if (this.field_o.length >= param1) {
              if (param1 <= 0) {
                return;
              }
              if (-1L == this.field_n) {
                this.field_n = this.field_d;
              }
              ps.a(param3, param2, this.field_o, (int)(-this.field_n + this.field_d), param1);
              this.field_d = this.field_d + (long)param1;
              if ((long)this.field_b < this.field_d - this.field_n) {
                this.field_b = (int)(-this.field_n + this.field_d);
              }
              return;
            }
            if (this.field_g != this.field_d) {
              this.field_c.a(this.field_d, (byte) 59);
              this.field_g = this.field_d;
            }
            this.field_c.a(param3, param1, (byte) 11, param2);
            this.field_g = this.field_g + (long)param1;
            if (this.field_g > this.field_l) {
              this.field_l = this.field_g;
            }
            var6 = -1L;
            if (this.field_d >= this.field_i &&
              this.field_d < this.field_i + (long)this.field_a) {
              var6 = this.field_d;
              if (var11 != 0 && (this.field_i >= this.field_d &&
                this.field_i < this.field_d + (long)param1)) {
                var6 = this.field_i;
              }
            } else {
              if (this.field_i >= this.field_d &&
                this.field_i < this.field_d + (long)param1) {
                var6 = this.field_i;
              }
            }
            var8 = -1L;
            if (this.field_d + (long)param1 <= this.field_i ||
              (long)this.field_a + this.field_i < this.field_d + (long)param1) {
              if ((!(this.field_i + (long)this.field_a <= this.field_d)) &&
                (!((this.field_d + (long)param1) < ((long)this.field_a + this.field_i)))) {
                var8 = (long)this.field_a + this.field_i;
                if (var11 != 0) {
                  var8 = (long)param1 + this.field_d;
                }
              }
            } else {
              var8 = (long)param1 + this.field_d;
            }
            if (var6 > -1L &&
              var6 < var8) {
              var10 = (int)(var8 - var6);
              ps.a(param3, (int)(var6 + (long)param2 - this.field_d), this.field_k, (int)(var6 - this.field_i), var10);
            }
            this.field_d = this.field_d + (long)param1;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_82_0 = var5_ref;
          stackIn_82_1 = new StringBuilder().append("ej.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        try {
          field_f = null;
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ej.C(" + param0 + ')');
        }
    }

    private final void a(int param0) throws IOException {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_a = 0;
          if (~this.field_d != ~this.field_g) {
            this.field_c.a(this.field_d, (byte) 98);
            this.field_g = this.field_d;
          }
          if (param0 >= -107) {
            return;
          }
          this.field_i = this.field_d;
          while (true) {
            if (this.field_k.length > this.field_a) {
              var2_int = this.field_k.length - this.field_a;
              if (var4 != 0) {
                return;
              }
              if (var2_int > 200000000) {
                var2_int = 200000000;
              }
              var3 = this.field_c.a(var2_int, this.field_a, 0, this.field_k);
              if (var3 != -1) {
                this.field_a = this.field_a + var3;
                this.field_g = this.field_g + (long)var3;
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ej.B(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        hd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (cb.field_h == null) {
            return;
          }
          var1 = (hd) (cb.field_h.d(0));
          if (var1 != null) {
            fieldTemp$0 = var1.field_h + 1;
            var1.field_h = var1.field_h + 1;
            if (fieldTemp$0 == 300) {
              ra.field_e = ra.field_e + (float)var1.field_i.field_w;
              var1.b((byte) -63);
            }
            var1 = (hd) (cb.field_h.a((byte) -71));
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var1))) {
            fieldTemp$1 = var1.field_h + 1;
            var1.field_h = var1.field_h + 1;
            stackIn_20_0 = fieldTemp$1;
            stackIn_20_1 = 75;
            if (var2 == 0) {
              if (stackIn_20_0 > stackIn_20_1) {
                var1.field_h = 75;
              }
              var1 = (hd) (cb.field_h.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = param0;
            stackIn_20_1 = -126;
          }
          if (stackIn_20_0 > stackIn_20_1) {
            field_m = 62;
          }
          if (0.0f < ra.field_e) {
            ra.field_e = ra.field_e * 0.8999999761581421f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "ej.G(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
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
        int var9Lifetime1;
        int var10_intLifetime1;
        int var10_intLifetime2;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          try {
            if (param1.length < param0 + param3) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param3 + param0));
            }
            if (this.field_n != -1L &&
              this.field_d >= this.field_n &&
              ((long)this.field_b + this.field_n) >= (this.field_d + (long)param0)) {
              ps.a(this.field_o, (int)(-this.field_n + this.field_d), param1, param3, param0);
              this.field_d = this.field_d + (long)param0;
              return;
            }
            var5_long = this.field_d;
            var7 = param3;
            var8 = param0;
            if (this.field_i <= this.field_d &&
              (long)this.field_a + this.field_i > this.field_d) {
              var9 = (int)((long)this.field_a + (-this.field_d + this.field_i));
              if (param0 < var9) {
                var9 = param0;
              }
              ps.a(this.field_k, (int)(this.field_d - this.field_i), param1, param3, var9);
              this.field_d = this.field_d + (long)var9;
              param0 = param0 - var9;
              param3 = param3 + var9;
            }
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameRemainder0 = true;
            var9Lifetime1 = 87 % ((param2 - 2) / 39);
            if ((param0 <= this.field_k.length) &&
              (decompiledFrameRemainder0 = !(param0 <= 0))) {
              this.a(-110);
              var10_int = param0;
              if (var10_int > this.field_a) {
                var10_int = this.field_a;
              }
              ps.a(this.field_k, 0, param1, param3, var10_int);
              this.field_d = this.field_d + (long)var10_int;
              param0 = param0 - var10_int;
              param3 = param3 + var10_int;
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_c.a(this.field_d, (byte) 108);
              this.field_g = this.field_d;
              while (param0 > 0) {
                var10_intLifetime2 = this.field_c.a(param0, param3, 0, param1);
                stackIn_91_0 = 0;
                stackIn_91_1 = ~var10_intLifetime2;
                if (var15 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_91_0 == stackIn_91_1 &&
                  var15 == 0) {
                  break;
                }
                param0 = param0 - var10_intLifetime2;
                this.field_g = this.field_g + (long)var10_intLifetime2;
                this.field_d = this.field_d + (long)var10_intLifetime2;
                param3 = param3 + var10_intLifetime2;
                if (var15 == 0) {
                  continue;
                }
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              boolean decompiledFrameCompleted0 = true;
              if (this.field_n != -1L) {
                if (this.field_n > this.field_d &&
                  param0 > 0) {
                  var10_intLifetime1 = (int)(-this.field_d + this.field_n) + param3;
                  if ((param0 + param3) < var10_intLifetime1) {
                    var10_intLifetime1 = param0 + param3;
                  }
                  while (var10_intLifetime1 > param3) {
                    param0--;
                    incrementValue$0 = param3;
                    param3++;
                    param1[incrementValue$0] = (byte) 0;
                    this.field_d = this.field_d + 1L;
                    if (var15 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (var15 == 0) {
                      continue;
                    }
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  var10 = -1L;
                  if (this.field_n >= var5_long &&
                    this.field_n < var5_long + (long)var8) {
                    var10 = this.field_n;
                    if (var15 != 0 && (this.field_n <= var5_long &&
                      ((long)this.field_b + this.field_n) > var5_long)) {
                      var10 = var5_long;
                    }
                  } else {
                    if (this.field_n <= var5_long &&
                      ((long)this.field_b + this.field_n) > var5_long) {
                      var10 = var5_long;
                    }
                  }
                  var12 = -1L;
                  if (((long)this.field_b + this.field_n) <= var5_long ||
                    this.field_n + (long)this.field_b > (long)var8 + var5_long) {
                    if ((!(this.field_n >= ((long)var8 + var5_long))) &&
                      (!((long)var8 + var5_long > this.field_n + (long)this.field_b))) {
                      var12 = var5_long + (long)var8;
                      if (var15 != 0) {
                        var12 = this.field_n + (long)this.field_b;
                      }
                    }
                  } else {
                    var12 = this.field_n + (long)this.field_b;
                  }
                  if (-1L < var10 &&
                    var10 < var12) {
                    var14 = (int)(var12 - var10);
                    ps.a(this.field_o, (int)(var10 - this.field_n), param1, var7 + (int)(var10 - var5_long), var14);
                    if (this.field_d < var12) {
                      param0 = (int)((long)param0 - (var12 - this.field_d));
                      this.field_d = var12;
                    }
                  }
                }
              }
              stackIn_91_0 = ~param0;
              stackIn_91_1 = -1;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_g = -1L;
            throw var5;
          }
          if (stackIn_91_0 >= stackIn_91_1) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_98_0 = var5_ref;
          stackIn_98_1 = new StringBuilder().append("ej.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte[] param0, boolean param1) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return;
          }
          this.a(param0.length, param0, (byte) -83, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ej.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (bj.field_K == null) {
            return;
          }
          hs.a(bj.field_K, (byte) 9);
          bj.field_K.a(fa.field_W, -17115);
          bj.field_K = null;
          if (null != bh.field_p) {
            bh.field_p.c(-119);
          }
          if (param0 != 0) {
            field_j = (String) null;
          }
          tm.field_i.requestFocus();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ej.E(" + param0 + ')');
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -65) {
            this.field_g = -112L;
          }
          stackIn_4_0 = this.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ej.A(" + param0 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 25 % ((param0 - 26) / 38);
          if (param1 < 0L) {
            throw new IOException();
          }
          this.field_d = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "ej.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        try {
          this.e(85);
          int var2_int = 115 % ((param0 - 72) / 44);
          this.field_c.c(10);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ej.I(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        rk var4 = null;
        aq var5_ref_aq = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = sa.field_a;
          if (param0 != -523) {
            return;
          }
          var2 = var1.j(-78);
          var3 = var1.j(-127);
          if (var2 != 0) {
            if (1 == var2) {
              var4_int = var1.d((byte) -122);
              var5_ref_aq = (aq) (dc.field_E.d(0));
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var5_ref_aq != null) {
                  stackIn_21_0 = var5_ref_aq.field_m;
                  stackIn_21_1 = var3;
                  decompiledFrameRemainder0 = (var8 == 0);
                  if ((decompiledFrameRemainder0) && (stackIn_21_0 != stackIn_21_1 ||
                    ~var5_ref_aq.field_l != ~var4_int)) {
                    var5_ref_aq = (aq) (dc.field_E.a((byte) -71));
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (null != var5_ref_aq) {
                    var5_ref_aq.b((byte) -119);
                    if (var8 == 0) {
                      return;
                    }
                    break;
                  }
                  stackIn_21_0 = param0;
                  stackIn_21_1 = 611;
                }
                q.g(stackIn_21_0 ^ stackIn_21_1);
                return;
              }
            }
            jq.a(-29901, (Throwable) null, "LR1: " + w.a(16738));
            q.g(-113);
            if (var8 == 0) {
              return;
            }
          }
          var4 = (rk) (na.field_J.d(0));
          if (var4 == null) {
            q.g(-108);
            return;
          }
          var5 = rr.field_t - var1.field_j;
          var6 = var4.field_i;
          if (var5 > var6.length << 2) {
            var5 = var6.length << 2;
          }
          var7 = 0;
          while (var5 > var7) {
            var6[var7 >> 2] = var6[var7 >> 2] + (var1.j(-106) << (we.a(3, var7) << 8));
            var7++;
            if (var8 != 0) {
              return;
            }
          }
          var4.b((byte) -86);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "ej.M(" + param0 + ')');
        }
    }

    private final void e(int param0) throws IOException {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = -106 / ((-62 - param0) / 53);
          if (this.field_n != -1L) {
            if (~this.field_g != ~this.field_n) {
              this.field_c.a(this.field_n, (byte) 33);
              this.field_g = this.field_n;
            }
            this.field_c.a(this.field_o, this.field_b, (byte) 11, 0);
            this.field_g = this.field_g + (long)this.field_b;
            if (this.field_l < this.field_g) {
              this.field_l = this.field_g;
            }
            var3 = -1L;
            if (this.field_i <= this.field_n &&
              this.field_n < (long)this.field_a + this.field_i) {
              var3 = this.field_n;
              if (var8 != 0 && (this.field_n <= this.field_i &&
                (this.field_n + (long)this.field_b) > this.field_i)) {
                var3 = this.field_i;
              }
            } else {
              if (this.field_n <= this.field_i &&
                (this.field_n + (long)this.field_b) > this.field_i) {
                var3 = this.field_i;
              }
            }
            var5 = -1L;
            boolean decompiledSharedTail0 = (!(this.field_i < (this.field_n + (long)this.field_b)) ||
              !((this.field_i + (long)this.field_a) >= (this.field_n + (long)this.field_b)));
            if (!decompiledSharedTail0) {
              var5 = (long)this.field_b + this.field_n;
              decompiledSharedTail0 = (var8 != 0);
            }
            if ((decompiledSharedTail0) && (((long)this.field_a + this.field_i) > this.field_n &&
              ((long)this.field_b + this.field_n) >= (this.field_i + (long)this.field_a))) {
              var5 = this.field_i + (long)this.field_a;
            }
            if (-1L < var3 &&
              var5 > var3) {
              var7 = (int)(var5 - var3);
              ps.a(this.field_o, (int)(-this.field_n + var3), this.field_k, (int)(var3 - this.field_i), var7);
            }
            this.field_b = 0;
            this.field_n = -1L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ej.D(" + param0 + ')');
        }
    }

    ej(ra param0, int param1, int param2) throws IOException {
        long dupTemp$2 = 0L;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = 0;
        this.field_i = -1L;
        this.field_n = -1L;
        try {
          this.field_c = param0;
          dupTemp$2 = param0.b(3);
          this.field_l = dupTemp$2;
          this.field_h = dupTemp$2;
          this.field_o = new byte[param2];
          this.field_k = new byte[param1];
          this.field_d = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ej.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, sr param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_32_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = rj.c(param0 ^ -85, (param4 - param3) * 3);
          var6 = 3 * param3;
          ah.g((byte) 111);
          var7 = -10 + var5_int;
          if (param2.field_o > 0 &&
            null != param2.field_p) {
            mf.e(param0 ^ -97);
          }
          qj.field_e = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_u)))) {
            var9 = param2.field_s[var8];
            var10 = param2.field_i[var8];
            var11 = param2.field_B[var8];
            stackOut_9_0 = param1;
            stackIn_41_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = ul.field_Cb[var9];
                var13 = he.field_i[var9];
                var14 = -var12 + ul.field_Cb[var10];
                var15 = -var12 + ul.field_Cb[var11];
                var16 = he.field_i[var10] - var13;
                var17 = -var13 + he.field_i[var11];
              }
              if (!stackIn_10_0 ||
                var17 * var14 - var16 * var15 < 0) {
                var12Lifetime1 = no.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = no.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = no.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = var13Lifetime1 + var12Lifetime1 - (-var14 + var6);
                      if (var7 >= 0) {
                        stackIn_21_0 = var15 >> var7;
                      } else {
                        stackIn_21_0 = var15 << -var7;
                      }
                      var16 = -stackIn_21_0 - 1 + gd.field_b.length;
                      var17 = gd.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_32_0 = var16;
                          if (stackIn_32_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = gd.field_b[var16];
                          continue;
                        }
                        stackIn_32_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_32_0Lifetime1;
                        jl.field_M[var18] = var8;
                        gd.field_b[var16] = var17 + 1;
                        if (param2.field_o > 0 &&
                          param2.field_p != null) {
                          dupTemp$0 = param2.field_p[var8];
                          uo.field_h[dupTemp$0] = uo.field_h[dupTemp$0] + 1;
                        }
                        qj.field_e = qj.field_e + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_41_0 = ~param2.field_o;
          }
          if (stackIn_41_0 < -1 &&
            param2.field_p != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(uo.field_h.length <= var9Lifetime1)) {
              var10Lifetime1 = uo.field_h[var9Lifetime1];
              uo.field_h[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param0 != -27) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_58_0 = var5;
          stackIn_58_1 = new StringBuilder().append("ej.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = "Reject <%0> from this game";
        field_j = ".";
        field_e = -1;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c7cf2d00b385(int param0, boolean param1, sr param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_32_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = rj.c(param0 ^ -85, (param4 - param3) * 3);
          var6 = 3 * param3;
          ah.g((byte) 111);
          var7 = -10 + var5_int;
          if (param2.field_o > 0 &&
            null != param2.field_p) {
            mf.e(param0 ^ -97);
          }
          qj.field_e = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_u)))) {
            var9 = param2.field_s[var8];
            var10 = param2.field_i[var8];
            var11 = param2.field_B[var8];
            stackOut_9_0 = param1;
            stackIn_41_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = ul.field_Cb[var9];
                var13 = he.field_i[var9];
                var14 = -var12 + ul.field_Cb[var10];
                var15 = -var12 + ul.field_Cb[var11];
                var16 = he.field_i[var10] - var13;
                var17 = -var13 + he.field_i[var11];
              }
              if (!stackIn_10_0 ||
                var17 * var14 - var16 * var15 < 0) {
                var12Lifetime1 = no.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = no.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = no.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = var13Lifetime1 + var12Lifetime1 - (-var14 + var6);
                      if (var7 >= 0) {
                        stackIn_21_0 = var15 >> var7;
                      } else {
                        stackIn_21_0 = var15 << -var7;
                      }
                      var16 = -stackIn_21_0 - 1 + gd.field_b.length;
                      var17 = gd.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_32_0 = var16;
                          if (stackIn_32_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = gd.field_b[var16];
                          continue;
                        }
                        stackIn_32_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_32_0Lifetime1;
                        jl.field_M[var18] = var8;
                        gd.field_b[var16] = var17 + 1;
                        if (param2.field_o > 0 &&
                          param2.field_p != null) {
                          dupTemp$0 = param2.field_p[var8];
                          uo.field_h[dupTemp$0] = uo.field_h[dupTemp$0] + 1;
                        }
                        qj.field_e = qj.field_e + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_41_0 = ~param2.field_o;
          }
          if (stackIn_41_0 < -1 &&
            param2.field_p != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(uo.field_h.length <= var9Lifetime1)) {
              var10Lifetime1 = uo.field_h[var9Lifetime1];
              uo.field_h[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param0 != -27) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_58_0 = var5;
          stackIn_58_1 = new StringBuilder().append("ej.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }
}
