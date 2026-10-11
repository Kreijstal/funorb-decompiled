/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends vb {
    private uh field_k;
    private int field_q;
    private tg field_i;
    static int field_v;
    private nm field_y;
    private byte[] field_A;
    static boolean field_p;
    private int field_n;
    private byte[] field_h;
    private uh field_e;
    static ea field_t;
    private g field_w;
    private ch field_j;
    private int field_u;
    static pl field_o;
    private em field_z;
    private boolean field_g;
    private ta field_x;
    private boolean field_m;
    private int field_l;
    private ta field_r;
    private long field_s;
    private boolean field_f;

    final static ed a(int param0, String param1, boolean param2) {
        ed var3 = null;
        RuntimeException var3_ref = null;
        ed stackIn_2_0 = null;
        ed stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ed(false);
          if (!param2) {
            stackIn_2_0 = (ed) null;
            return stackIn_2_0;
          }
          var3.field_h = param1;
          var3.field_e = param0;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ij.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
        em var3 = this.a(124, 0, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.c((byte) -115);
        int var5 = 22 / ((-32 - param0) / 34);
        var3.b(34);
        return var4;
    }

    final g a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = MinerDisturbance.field_ab;
        if (this.field_w != null) {
          return this.field_w;
        }
        if (this.field_z == null) {
          if (this.field_j.d((byte) -111)) {
            return null;
          }
          this.field_z = (em) ((Object) this.field_j.a((byte) 0, -21, true, this.field_u, 255));
        }
        if (this.field_z.field_C) {
          return null;
        }
        if (param0 != 53) {
          return (g) null;
        }
        var8 = this.field_z.c((byte) -115);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_z instanceof vl) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_w = new g(var9, this.field_q, this.field_h);
            if (this.field_n != this.field_w.field_r) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_w = null;
            if (this.field_j.d((byte) -111)) {
              this.field_z = null;
            } else {
              this.field_z = (em) ((Object) this.field_j.a((byte) 0, -21, true, this.field_u, 255));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_w = new g(var8, this.field_q, this.field_h);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_j.d(20);
            this.field_w = null;
            if (!this.field_j.d((byte) -111)) {
              this.field_z = (em) ((Object) this.field_j.a((byte) 0, param0 - 74, true, this.field_u, 255));
            } else {
              this.field_z = null;
            }
            return null;
          }
          if (null != this.field_e) {
            this.field_y.a(this.field_e, false, var8, this.field_u);
          }
        }
        if (this.field_k != null) {
          this.field_A = new byte[this.field_w.field_c];
        }
        this.field_z = null;
        return this.field_w;
    }

    final void c(int param0) {
        em discarded$1 = null;
        em discarded$0 = null;
        em discarded$3 = null;
        em discarded$2 = null;
        int var2_int;
        em var2;
        pi var3;
        int var4;
        int var5;
        pi var6;
        pi var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        pi var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = MinerDisturbance.field_ab;
        if (null != this.field_x) {
          if (this.a((byte) 53) == null) {
            return;
          }
          if (this.field_g) {
            var2_int = 1;
            var3 = this.field_x.b(72);
            while (var3 != null) {
              var4 = (int)var3.field_d;
              if (this.field_A[var4] == 0) {
                discarded$1 = this.a(113, 1, var4);
              }
              if (0 == this.field_A[var4]) {
                var2_int = 0;
              } else {
                var3.b(34);
              }
              var3 = this.field_x.b((byte) 56);
            }
            while (this.field_l < this.field_w.field_d.length) {
              if (this.field_w.field_d[this.field_l] == 0) {
                this.field_l = this.field_l + 1;
                continue;
              }
              if (250 > this.field_y.field_b) {
                if (this.field_A[this.field_l] == 0) {
                  discarded$0 = this.a(param0 + 112, 1, this.field_l);
                }
                if (this.field_A[this.field_l] == 0) {
                  var7 = new pi();
                  var7.field_d = (long)this.field_l;
                  var2_int = 0;
                  this.field_x.a((byte) -114, var7);
                }
                this.field_l = this.field_l + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_l = 0;
              this.field_g = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_x.b(71);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_d;
                if (this.field_A[var4Lifetime1] != 1) {
                  discarded$3 = this.a(param0 + 116, 2, var4Lifetime1);
                }
                if (this.field_A[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.b(34);
                }
                var3Lifetime1 = this.field_x.b((byte) 56);
              }
              while (this.field_l < this.field_w.field_d.length) {
                if (this.field_w.field_d[this.field_l] == 0) {
                  this.field_l = this.field_l + 1;
                  continue;
                }
                if (!this.field_j.c((byte) -46)) {
                  if (1 != this.field_A[this.field_l]) {
                    discarded$2 = this.a(param0 ^ 124, 2, this.field_l);
                  }
                  if (1 != this.field_A[this.field_l]) {
                    var6 = new pi();
                    var6.field_d = (long)this.field_l;
                    var2_intLifetime1 = 0;
                    this.field_x.a((byte) -116, var6);
                  }
                  this.field_l = this.field_l + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = false;
                this.field_l = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_x = null;
            }
          }
        }
        if (this.field_f &&
          sf.a((byte) -111) >= this.field_s) {
          var2 = (em) (this.field_i.a(param0 ^ -16545));
          while (var2 != null) {
            if (!var2.field_C) {
              if (!var2.field_z) {
                var2.field_z = true;
              } else {
                if (!var2.field_v) {
                  throw new RuntimeException();
                }
                var2.b(param0 ^ 34);
              }
            }
            var2 = (em) (this.field_i.a(true));
          }
          this.field_s = sf.a((byte) 101) + 1000L;
        }
        if (param0 != 0) {
          this.c(-80);
        }
    }

    final static void a(boolean param0, sb param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = MinerDisturbance.field_ab;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (null != w.field_W) {
              try {
                w.field_W.a((byte) 120, 0L);
                w.field_W.a(var6, 119);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var6[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param1.a(0, 24, param0, var2);
            } else {
              param1.a(0, 24, param0, var2);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("ij.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        em discarded$0 = null;
        em discarded$1 = null;
        pi var2;
        int var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (null == this.field_x) {
          return;
        }
        if (this.a((byte) 53) == null) {
          return;
        }
        var2 = this.field_r.b(111);
        while (var2 != null) {
          var3 = (int)var2.field_d;
          if (var3 >= 0) {
            if (this.field_w.field_c > var3) {
              if (this.field_w.field_d[var3] == 0) {
                var2.b(34);
              } else {
                if (this.field_A[var3] == 0) {
                  discarded$0 = this.a(103, 1, var3);
                }
                if (-1 == this.field_A[var3]) {
                  discarded$1 = this.a(92, 2, var3);
                }
                if (1 == this.field_A[var3]) {
                  var2.b(34);
                }
              }
            } else {
              var2.b(34);
            }
          } else {
            var2.b(34);
          }
          var2 = this.field_r.b((byte) 56);
        }
        if (param0 < 1) {
          this.field_w = (g) null;
        }
    }

    final void b(int param0) {
        int var2 = -5 / ((33 - param0) / 58);
        if (null == this.field_k) {
          return;
        }
        this.field_m = true;
        if (null == this.field_x) {
          this.field_x = new ta();
        }
    }

    private final em a(int param0, int param1, int param2) {
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        em var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = MinerDisturbance.field_ab;
        if (param0 < 86) {
          this.b(-36);
        }
        var12 = (em) (this.field_i.a((long)param2, -27109));
        var4 = var12;
        if (var12 != null &&
          0 == param1 &&
          !var12.field_v &&
          var12.field_C) {
          var12.b(34);
          var4 = null;
        }
        if (var4 == null) {
          if (0 != param1) {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_k) {
                throw new RuntimeException();
              }
              if (this.field_A[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_j.c((byte) -68)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, -21, false, param2, this.field_u);
            } else {
              if (this.field_k == null) {
                throw new RuntimeException();
              }
              var4 = this.field_y.a(param2, false, this.field_k);
            }
          } else {
            if (null != this.field_k &&
              -1 != this.field_A[param2]) {
              var4 = this.field_y.a((byte) 54, param2, this.field_k);
            } else {
              if (this.field_j.d((byte) -111)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
            }
          }
          this.field_i.a(0, (long)param2, (pi) (var4));
        }
        if (((em) (var4)).field_C) {
          return null;
        }
        var18 = ((em) (var4)).c((byte) -115);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof vl) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              wa.field_b.reset();
              wa.field_b.update(var5, 0, -2 + var18.length);
              var6_int = (int)wa.field_b.getValue();
              if (this.field_w.field_h[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_w.field_l != null &&
                this.field_w.field_l[param2] != null) {
                var27 = this.field_w.field_l[param2];
                var28 = wb.a(var18.length - 2, 0, var18, 18738);
                for (var9 = 0; var9 < 64; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((255 & var5[var18.length - 2]) << 8) + (255 & var5[-1 + var18.length]);
              if (var7 != (this.field_w.field_q[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (1 != this.field_A[param2]) {
                if (this.field_A[param2] == 0) {
                }
                this.field_A[param2] = (byte) 1;
              }
              if (!((em) (var4)).field_v) {
                ((em) (var4)).b(34);
              }
              stackIn_60_0 = var4;
              return (em) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_A[param2] = (byte)-1;
            ((em) (var4)).b(34);
            if (((em) (var4)).field_v) {
              if (this.field_j.d((byte) -111)) {
                return null;
              }
              var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
              this.field_i.a(0, (long)param2, (pi) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            wa.field_b.reset();
            wa.field_b.update(var5, 0, var18.length - 2);
            var6_int = (int)wa.field_b.getValue();
            if (this.field_w.field_h[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_w.field_l &&
              null != this.field_w.field_l[param2]) {
              var30 = this.field_w.field_l[param2];
              var29 = wb.a(var18.length - 2, 0, var18, 18738);
              var11 = 0;
              var9 = var11;
              while (64 > var11) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_j.field_o = 0;
            this.field_j.field_j = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_j.d(20);
          ((em) (var4)).b(34);
          if (!((em) (var4)).field_v) {
            return null;
          }
          if (this.field_j.d((byte) -111)) {
            return null;
          }
          var4 = this.field_j.a((byte) 2, -21, true, param2, this.field_u);
          this.field_i.a(0, (long)param2, (pi) (var4));
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_w.field_q[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_w.field_q[param2];
        if (null != this.field_k) {
          this.field_y.a(this.field_k, false, var18, param2);
          if (this.field_A[param2] != 1) {
            this.field_A[param2] = (byte) 1;
          }
        }
        if (!((em) (var4)).field_v) {
          ((em) (var4)).b(34);
        }
        return (em) (var4);
    }

    public static void a(boolean param0) {
        field_o = null;
        field_t = null;
        if (!param0) {
          field_t = (ea) null;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 < 62) {
          this.c(25);
        }
        em var3 = (em) (this.field_i.a((long)param1, -27109));
        if (var3 == null) {
          return 0;
        }
        return var3.f(100);
    }

    ij(int param0, uh param1, uh param2, ch param3, nm param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_i = new tg(16);
        this.field_l = 0;
        this.field_r = new ta();
        this.field_s = 0L;
        try {
          this.field_u = param0;
          this.field_k = param1;
          if (this.field_k != null) {
            this.field_g = true;
            this.field_x = new ta();
          } else {
            this.field_g = false;
          }
          this.field_j = param3;
          stackIn_7_1 = (param8);
          this.field_f = stackIn_7_1;
          this.field_n = param7;
          this.field_e = param2;
          this.field_y = param4;
          this.field_q = param5;
          this.field_h = param6;
          if (this.field_e != null) {
            this.field_z = (em) ((Object) this.field_y.a((byte) -74, this.field_u, this.field_e));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ij.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_v = 0;
        field_o = null;
    }
}
