/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo extends qk {
    static int field_Qb;
    static char[] field_Nb;
    private int field_Rb;
    private boolean field_Sb;
    static vf field_Ob;
    private int field_Pb;
    static vn[][] field_Tb;

    final void l(byte param0) {
        int var2;
        kk var3_ref_kk;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        qh var10;
        var9 = ZombieDawn.field_J;
        if (this.field_F == 23) {
          this.field_F = 0;
        }
        super.l(param0);
        if (this.field_Ab < 0) {
          return;
        }
        if (0 != this.field_F) {
          return;
        }
        if (this.field_Sb) {
          this.field_F = 23;
          if (-1 != this.field_Rb) {
            var10 = dj.field_e.field_H.a(true, this.a(true), this.field_Pb, this.field_Rb, this.f(237239984));
            if (var10 != null) {
              var3_ref_kk = (kk) (var10.b((byte) 26));
              this.field_Pb = var3_ref_kk.field_h;
              this.field_Rb = var3_ref_kk.field_l;
            }
          }
          return;
        }
        if (this.field_Rb != -1) {
          this.e(23, -6904);
          return;
        }
        var2 = this.l(param0 - 178) & 127;
        if (var2 < 60) {
          return;
        }
        var3 = var2 - 60;
        var4 = this.a(true);
        var5 = this.f(237239984);
        var6 = 0;
        var7 = 0;
        var8 = var3;
        if (var8 == 0) {
          var7 = -24;
          do {
            var4 = var4 + var6;
            var5 = var5 + var7;
          } while (this.b(0, var4, var5) < 60);
          this.field_Pb = var5;
          this.field_Rb = var4;
          this.e(23, -6904);
          return;
        }
        if (var8 == 2) {
          var7 = 24;
          do {
            var4 = var4 + var6;
            var5 = var5 + var7;
          } while (this.b(0, var4, var5) < 60);
          this.field_Pb = var5;
          this.field_Rb = var4;
          this.e(23, -6904);
          return;
        }
        if (var8 == 1) {
          var6 = 24;
          do {
            var4 = var4 + var6;
            var5 = var5 + var7;
          } while (this.b(0, var4, var5) < 60);
          this.field_Pb = var5;
          this.field_Rb = var4;
          this.e(23, -6904);
          return;
        }
        if (var8 != 3) {
          do {
            var4 = var4 + var6;
            var5 = var5 + var7;
          } while (this.b(0, var4, var5) < 60);
          this.field_Pb = var5;
          this.field_Rb = var4;
          this.e(23, -6904);
          return;
        }
        var6 = -24;
        do {
          var4 = var4 + var6;
          var5 = var5 + var7;
        } while (this.b(0, var4, var5) < 60);
        this.field_Pb = var5;
        this.field_Rb = var4;
        this.e(23, -6904);
        return;
    }

    final static void x(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -2) {
          return;
        }
        if (null == ng.field_b) {
          return;
        }
        var1 = ng.field_b;
        synchronized (var1) {
          ng.field_b = null;
        }
    }

    public static void o(byte param0) {
        field_Nb = null;
        if (param0 <= -59) {
          field_Tb = (vn[][]) null;
          field_Ob = null;
          return;
        }
        jo.o((byte) -101);
        field_Tb = (vn[][]) null;
        field_Ob = null;
    }

    jo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Rb = -1;
        this.field_Pb = -1;
        this.field_pb = this.field_Eb;
    }

    final void g(int param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = (this.field_F == 23);
        this.field_Sb = stackIn_3_1;
        if (this.field_Sb) {
          this.field_X = this.field_Pb;
          this.field_Y = this.field_Rb;
          this.c(0, this.field_D / 2);
        }
        super.g(106);
        if (this.field_Sb) {
          if (1 == this.field_F) {
            if (this.a(true) != this.field_Rb) {
              this.field_F = 23;
            } else {
              if (this.f(237239984) != this.field_Pb) {
                this.field_F = 23;
              } else {
                this.field_Pb = -1;
                this.field_Rb = -1;
                this.field_Sb = false;
                this.e(0, -6904);
                this.l((byte) 52);
              }
            }
          } else {
            if (0 == this.field_F) {
              if (this.a(true) != this.field_Rb) {
                this.field_F = 23;
              } else {
                if (this.f(237239984) != this.field_Pb) {
                  this.field_F = 23;
                } else {
                  this.field_Pb = -1;
                  this.field_Rb = -1;
                  this.field_Sb = false;
                  this.e(0, -6904);
                  this.l((byte) 52);
                }
              }
            }
          }
        }
        if (param0 > 95) {
          return;
        }
        jo.o((byte) -102);
    }

    final static int w(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          de var2_ref_de = null;
          int var2 = 0;
          if (tf.field_c.field_h >= 4) {
            if (tf.field_c.field_e == -1) {
              return 3;
            }
            if (tf.field_c.field_e == -2) {
              return 4;
            }
            return 1;
          }
          try {
            var1_int = -73 / ((param0 - 36) / 39);
            if (jd.field_a == 0) {
              hi.field_O = lc.field_a.a(2, gd.field_u, bd.field_j);
              jd.field_a = jd.field_a + 1;
            }
            if (jd.field_a == 1) {
              if (hi.field_O.field_f == 2) {
                stackIn_14_0 = k.a(-1, 50);
                return stackIn_14_0;
              }
              if (hi.field_O.field_f == 1) {
                jd.field_a = jd.field_a + 1;
              }
            }
            if (jd.field_a == 2) {
              sb.field_a = new gm((java.net.Socket) (hi.field_O.field_d), lc.field_a);
              var2_ref_de = new de(13);
              uj.a(ha.field_a, uj.field_d, (byte) -114, var2_ref_de, nd.field_a);
              var2_ref_de.i(15, -101);
              var2_ref_de.h(-116, wh.field_b);
              sb.field_a.a(13, true, 0, var2_ref_de.field_h);
              jd.field_a = jd.field_a + 1;
              ul.field_e = 30000L + pd.a(-22826);
            }
            if (jd.field_a == 3) {
              if (sb.field_a.b((byte) -80) <= 0) {
                if (pd.a(-22826) > ul.field_e) {
                  stackIn_30_0 = k.a(-2, 50);
                  return stackIn_30_0;
                }
              } else {
                var2 = sb.field_a.a(false);
                if (var2 != 0) {
                  stackIn_25_0 = k.a(var2, 50);
                  return stackIn_25_0;
                }
                jd.field_a = jd.field_a + 1;
              }
            }
            if (4 != jd.field_a) {
              stackIn_35_0 = -1;
              return stackIn_35_0;
            }
            tf.field_c.a(bo.field_n, sb.field_a, 120);
            sb.field_a = null;
            jd.field_a = 0;
            hi.field_O = null;
            stackIn_33_0 = 0;
            return stackIn_33_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return k.a(-3, 50);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(wk param0, int param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var5Lifetime1;
        int var6Lifetime1;
        var9 = ZombieDawn.field_J;
        try {
          if (param1 != 5060) {
            return;
          }
          var3_int = param0.a(this.a(true), (byte) -107);
          var4 = param0.a(this.f(237239984), 0);
          bi.d(var3_int, var4, this.field_Eb, 65535);
          if (this.field_Rb != -1) {
            bi.e(var3_int, var4, param0.a(this.field_Rb, (byte) -74), param0.a(this.field_Pb, 0), 16711680);
          }
          if (this.field_yb != null) {
            var5_int = param0.a(this.field_yb.a(true), (byte) -59);
            var6 = param0.a(this.field_yb.f(237239984), 0);
            bi.e(var3_int, 10 + var4 - 48, var5_int, -48 + (var6 + 10), 16776960);
            bj.field_q.c(Integer.toString(this.field_yb.field_F), var5_int, -48 + var6, 16777215, 0);
          }
          var5 = Integer.toString(this.field_F);
          var5Lifetime1 = Integer.toString(this.l(-111) & 127);
          var10 = 0;
          var6Lifetime1 = var10;
          while (this.field_ub > var10) {
            var7 = param0.a(this.field_jb[var10], (byte) -62);
            var8 = param0.a(this.field_gb[var10], 0);
            bi.b(-1 + var7, var8 - 1, 3, 3, 0);
            bi.a(var7, var8, 65280);
            var10++;
          }
          bi.g(var3_int, var4, 3, 16776960);
          bj.field_q.c(var5Lifetime1, var3_int, -48 + var4, 16777215, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jo.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Qb = 5;
        field_Nb = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_Tb = new vn[2][];
    }
}
