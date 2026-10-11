/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends gk implements vn {
    static ia field_Ob;
    static w field_Mb;
    static sm field_Qb;
    private boolean field_Pb;
    private tf field_Nb;
    static String field_Kb;
    private boolean field_Rb;
    static sk field_Jb;
    static int field_Lb;

    final boolean h(byte param0) {
        cd var2 = null;
        if (param0 <= 15) {
          this.field_Nb = (tf) null;
        }
        if (this.field_S &&
          !this.field_Pb) {
          var2 = je.a(13);
          if (var2 != null) {
            this.a(false, var2, false);
          }
        }
        return super.h((byte) 117);
    }

    final static void q(int param0) {
        mg.field_Nb = false;
        int var1 = -22 % ((-14 - param0) / 35);
        vb.field_Z = false;
        hm.a(-1, (byte) -122);
        ka.field_P = uc.field_c;
        sh.field_d = uc.field_c;
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (this.field_Rb) {
          dd.a(false, true, (byte) 66);
          return;
        }
        try {
          in.c((byte) -51);
          this.n(-128);
          if (param0 != 67) {
            field_Jb = (sk) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wj.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, String param5) {
        ck var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          de.a(param4, -5540, param5, param0, param2);
          fe.field_b = param3;
          im.field_f = !param2;
          if (param1 >= -70) {
            var7 = (ck) null;
            wj.a((ck) null, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("wj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(boolean param0, java.awt.Frame param1, fd param2) {
        mh var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (!param0) {
            wj.q(92);
          }
          while (true) {
            var3 = param2.a(75254128, param1);
            while (var3.field_c == 0) {
              ua.a(10L, -128);
            }
            if (var3.field_c != 1) {
              ua.a(100L, -128);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wj.N(").append(param0).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (qc.field_s != null && (param1 < 0 ||
            ph.field_xb == wf.field_u)) {
            if (we.field_b.field_n == 0 &&
              ik.a(4) > 10000L + el.field_J) {
              we.field_b.f(param1, -4);
            }
            if (param0 != 4792) {
              field_Kb = (String) null;
            }
            if (we.field_b.field_n > 0) {
              try {
                qc.field_s.a(0, we.field_b.field_n, 1, we.field_b.field_r);
                el.field_J = ik.a(param0 ^ 4796);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                si.a(100);
              }
              we.field_b.field_n = 0;
            }
            return;
          }
          we.field_b.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    wj(ka param0, tf param1) {
        super(param0, ec.field_p, cm.field_i, false, false);
        try {
          this.field_Nb = param1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, cd param1, boolean param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        dj var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        try {
          this.field_Pb = true;
          if (param1.field_n) {
            var4 = wf.field_k;
          } else {
            if (null != param1.field_d) {
              var4 = of.field_g;
              if (this.field_Nb != null) {
                this.field_Nb.a(25);
              }
            } else {
              var4 = param1.field_f;
              if (param1.field_h == 248) {
                if (!param0) {
                  k.a((byte) -36);
                }
                this.field_Rb = true;
                var4 = ab.field_d;
              }
            }
          }
          var5 = new dj((gk) (this), ec.field_p, var4);
          if (!param1.field_n) {
            if (!this.field_Rb) {
              if (param1.field_h == 5) {
                var5.a(pb.field_e, 11, 14);
                var5.a(ig.field_Tb, 17, 14);
              } else {
                var5.a(bl.field_X, -1, 14);
              }
            } else {
              var5.a(115, fa.field_o, (kg) (this));
            }
            if (param1.field_h == 3) {
              var5.a(ce.field_z, 7, 14);
            } else {
              if (param1.field_h == 6) {
                var5.a(vb.field_Y, 9, 14);
              }
            }
          } else {
            if (param1.field_e) {
              this.c(new md(this), (byte) 79);
              return;
            }
            var5.a(119, fa.field_o, (kg) (this));
          }
          this.c(var5, (byte) 68);
          if (param2) {
            field_Lb = 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("wj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        this.a(param0, un.a(248, ab.field_d, -12), false);
    }

    public static void s(int param0) {
        field_Ob = null;
        field_Qb = null;
        field_Mb = null;
        field_Kb = null;
        if (param0 != 0) {
          fd var2 = (fd) null;
          wj.a(true, (java.awt.Frame) null, (fd) null);
        }
        field_Jb = null;
    }

    final static boolean r(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 17) {
          return true;
        }
        stackIn_6_0 = (li.field_b != null) && (li.field_b.b(0));
        return stackIn_6_0;
    }

    final static hl a(byte param0, int param1, int param2, int param3) {
        boolean stackIn_48_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        hl var8_ref_hl;
        int var9;
        hl var9_ref_hl;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = client.field_A ? 1 : 0;
        var4 = null;
        dn.field_l.field_Ob.field_M.c(115);
        var5 = 0;
        var6 = 0;
        for (var7 = ic.field_c - 1; var7 >= 0; var7--) {
          var8_ref_hl = pd.field_g[var7];
          var9 = 0;
          if (!wc.field_n &&
            var5 < kf.field_M) {
            var10_int = rf.a(0, var8_ref_hl.field_m);
            if (var8_ref_hl.b((byte) 94) >= var10_int && (var8_ref_hl.field_j ||
              !ik.a(var8_ref_hl.field_o, (byte) -118))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (var8_ref_hl.field_f == null ||
              rg.field_c) {
              if (null == var8_ref_hl.field_f) {
                bg.field_b = bg.field_b + 1;
              }
              var10 = mb.a(106, var8_ref_hl);
              var11 = var10 + mm.c(var8_ref_hl.field_h);
              var12 = tc.a(param0 ^ 4651, var8_ref_hl);
              var8_ref_hl.field_f = new w(0L, fj.field_g, var11);
              var6 = var6 + param1;
              var8_ref_hl.field_f.field_J = ff.field_o;
              var8_ref_hl.field_f.field_fb = var12 - ((16711422 & var12) >> 1) + ((fj.field_g.field_fb & 16711422) >> 1);
              var8_ref_hl.field_f.field_G = var12;
              var8_ref_hl.field_f.field_Bb = ((16711423 & fj.field_g.field_Bb) >> 1) - ((16711423 & var12) >> 1) + var12;
            }
            var5++;
          } else {
            var8_ref_hl.field_f = null;
          }
        }
        var7Lifetime1 = 0;
        var8 = 0;
        if (param0 != 55) {
          return (hl) null;
        }
        while (var8 < ic.field_c) {
          var9_ref_hl = pd.field_g[var8];
          if (null != var9_ref_hl.field_f) {
            dn.field_l.field_Ob.a(var9_ref_hl.field_f, -16834);
            var9_ref_hl.field_f.a(var9_ref_hl.field_f.a(true), 0, var7Lifetime1, param1, param3);
            var7Lifetime1 = var7Lifetime1 + param1;
            if (var9_ref_hl.field_f.field_ob != 0) {
              var4 = var9_ref_hl;
            }
          }
          var8++;
        }
        var8Lifetime1 = -var7Lifetime1 + var6 + (dn.field_l.field_Ob.field_F + dn.field_l.field_Ob.field_N);
        dn.field_l.field_Ob.field_N = dn.field_l.field_Ob.field_N - var8Lifetime1;
        dn.field_l.field_Ob.field_Ib = dn.field_l.field_Ob.field_Ib + var8Lifetime1;
        if (rg.field_c) {
          dn.field_l.field_Ob.field_N = var7Lifetime1;
        }
        if (rg.field_c) {
          rg.field_c = false;
          sc.field_m = true;
          dn.field_l.field_Ob.field_Ib = dn.field_l.field_Rb.field_N - dn.field_l.field_Ob.field_N;
          dn.field_l.field_Ob.field_Mb = 0;
        }
        dn.field_l.field_Ob.field_F = var7Lifetime1 - dn.field_l.field_Ob.field_N;
        if (jg.field_i &&
          tf.field_gb != null) {
          sc.field_m = true;
        }
        var9Lifetime1 = -dn.field_l.field_Ob.field_F - (dn.field_l.field_Ob.field_N - dn.field_l.field_Rb.field_N);
        if (sc.field_m) {
          dn.field_l.field_Ob.field_Mb = -dn.field_l.field_Ob.field_Ib + var9Lifetime1;
        }
        dn.field_l.a(2 * param1 * param2, true, true, param1);
        stackIn_48_0 = (var9Lifetime1 == dn.field_l.field_Ob.field_Ib + dn.field_l.field_Ob.field_Mb);
        sc.field_m = stackIn_48_0;
        return (hl) (var4);
    }

    final static void a(ck param0, int param1) {
        try {
          pe.field_d = param0;
          if (param1 != 369179521) {
            field_Lb = -2;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_Kb = "Accept unrated rematch";
        field_Jb = new sk(1);
    }
}
