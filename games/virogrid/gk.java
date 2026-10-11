/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk implements Iterable {
    static hg field_g;
    static byte[][][] field_c;
    int field_a;
    static p field_f;
    l[] field_h;
    static km field_b;
    private l field_d;
    static km field_e;

    public static void a(byte param0) {
        try {
          field_b = null;
          field_c = (byte[][][]) null;
          field_f = null;
          field_g = null;
          field_e = null;
          int var1_int = 118 / ((param0 + 72) / 50);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gk.E(" + param0 + ')');
        }
    }

    final l a(long param0, int param1) {
        l var4 = null;
        int var6 = 0;
        l stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        l stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        l var5 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = this.field_h[(int)((long)(this.field_a - 1) & param0)];
          this.field_d = var4.field_f;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_d == var4))) {
            stackIn_12_0 = $cfr$lcmp(param0, this.field_d.field_d);
            if (var6 == 0) {
              if (stackIn_12_0 == 0) {
                var5 = this.field_d;
                this.field_d = this.field_d.field_f;
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              this.field_d = this.field_d.field_f;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = param1;
          }
          if (stackIn_12_0 != -18348) {
            stackIn_14_0 = (l) null;
            return stackIn_14_0;
          }
          this.field_d = null;
          stackIn_16_0 = null;
          return (l) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4_ref), "gk.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static gh a(byte param0, int param1, boolean param2) {
        um stackIn_7_0;
        int stackIn_7_1;
        boolean stackIn_7_2;
        boolean stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        boolean stackIn_8_6 = false;
        gh stackIn_12_0 = null;
        km stackIn_37_0 = null;
        String stackIn_38_1 = null;
        km stackIn_41_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        p var4 = null;
        Object var5 = null;
        Object var6 = null;
        gh var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dj var17 = null;
        String var18 = null;
        int var19 = 0;
        dj var17Lifetime1;
        String var18Lifetime1;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 >= -6) {
            gk.a(true, (String) null, true);
          }
          stackIn_7_0 = ve.field_q.field_Ib;
          stackIn_7_1 = pg.field_e + 2;
          stackIn_7_2 = param2;
          stackIn_7_3 = false;
          stackIn_7_4 = 2;
          stackIn_7_5 = param1 * (3 * (pg.field_e + 2));
          stackIn_8_6 = (ve.field_q.field_Ib == wf.field_d);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((um) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_8_6) ? 1 : 0;
          var4 = ve.field_q.field_Lb.field_W;
          var5 = null;
          if (oa.field_q == 2) {
            dg.field_E.field_Y = true;
            ee.field_e.field_V = oi.a(new String[]{wl.field_a}, gg.field_J, 2);
            ve.field_q.field_Ib.field_Eb.field_V = null;
            var6 = null;
            var7 = (gh) (var4.a((byte) -41));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7))) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_87_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 == 0) {
                if (stackIn_12_0.field_W == null) {
                  var7.field_Eb = new km(0L, gg.field_F);
                  var7.a(0, var7.field_Eb);
                  var7.field_Gb = new km(0L, jd.field_d);
                  var7.a(0, var7.field_Gb);
                  var7.field_Mb = new km(0L, gg.field_F);
                  var7.a(0, var7.field_Mb);
                  var7.field_Gb.field_lb = 2;
                  var8 = 1;
                  var7.b((byte) 42);
                }
                var7.field_K = ve.field_q.field_Lb.field_K;
                var9 = 0;
                if (var7.field_Pb == null) {
                  var11 = 16737894;
                  var10 = 13369344;
                } else if (var7.field_Pb != wl.field_a) {
                  var10 = 13421568;
                  var11 = 16777062;
                } else {
                  var10 = 52224;
                  var11 = 6750054;
                }
                var12 = 0;
                if (null != var7.field_Jb &&
                  !var7.field_Jb.equals("")) {
                  var7.field_Mb.field_ab = var11;
                  var7.field_Mb.field_qb = qg.field_u;
                  var7.field_Mb.a(0, pg.field_e, qg.field_u.field_u + 3, (byte) -94, var9);
                  var12 = 1;
                }
                var7.field_Gb.field_bb = var11;
                var7.field_Eb.field_bb = var11;
                var7.field_Gb.field_E = var10;
                var7.field_Eb.field_E = var10;
                var7.field_Gb.field_A = var11;
                var7.field_Eb.field_A = var11;
                var7.field_Gb.field_ab = var11;
                var7.field_Eb.field_ab = var11;
                var13 = 0;
                var14 = var7.field_K - 82;
                if (var12 != 0) {
                  var13 = qg.field_u.field_u + 3;
                  var14 = var14 - var13;
                }
                stackIn_37_0 = var7.field_Eb;
                if (var14 <= 0) {
                  stackIn_38_1 = var7.field_Hb;
                } else {
                  stackIn_38_1 = e.a(var7.field_Eb.field_C, var7.field_Hb, var14);
                }
                stackIn_37_0.field_V = stackIn_38_1;
                var7.field_Eb.a(var13, pg.field_e, var14, (byte) -46, var9);
                stackIn_41_0 = var7.field_Gb;
                if (var7.field_Pb == null) {
                  stackIn_42_1 = ln.field_a;
                } else {
                  stackIn_42_1 = var7.field_Pb;
                }
                stackIn_41_0.field_V = stackIn_42_1;
                var7.field_Gb.a(-80 + var7.field_K, pg.field_e, 80, (byte) -54, var9);
                stackIn_46_0 = (var7.field_Eb.field_V.equals(var7.field_Hb)) ? 0 : 1;
                var15 = stackIn_46_0;
                var9 = var9 + pg.field_e;
                if (var3_int == 0) {
                  var7.field_kb = -var7.field_ub + var9;
                }
                if (var8 != 0) {
                  ve.field_q.field_Lb.a(2, var7, (km) (var6), (byte) 113);
                }
                if (var7.field_Mb != null &&
                  var7.field_Mb.field_S) {
                  wc.field_g = var7.field_Jb;
                } else if (var7.field_nb == 0) {
                  if (var7.field_Eb.field_S &&
                    var15 != 0) {
                    wc.field_g = var7.field_Hb;
                  }
                } else {
                  var16 = var7.field_Hb;
                  ai.a(-1, ve.field_q.field_Ib, (int[]) null, (String) null, 0L, var16, -1, var7, 111);
                  if (var7.field_Pb != null &&
                    !dd.a(md.field_e.field_g, false) &&
                    !wg.field_f) {
                    if (!dh.field_n) {
                      var17 = md.field_e;
                      var18 = oi.a(new String[]{var16}, ha.field_d, 2);
                      var17.field_a.a(1, var18, 8);
                    }
                    var17Lifetime1 = md.field_e;
                    var18Lifetime1 = oi.a(new String[]{var16}, og.field_c, 2);
                    var17Lifetime1.field_a.a(1, var18Lifetime1, 18);
                  }
                  var5 = var7;
                }
                var6 = var7;
                var7 = (gh) (var4.a(16213));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_87_0 = ve.field_q.field_Fb;
            }
            if (((km) (stackIn_87_0)).field_nb != 0) {
              he.field_Xb = new fe(ve.field_q.field_Fb.field_Bb, ve.field_q.field_Fb.field_J, ve.field_q.field_Fb.field_K, ve.field_q.field_Fb.field_ub, jd.field_e, s.field_f, ti.field_h, ti.field_h);
              ge.field_d = 0;
            }
            if (ve.field_q.field_Mb.field_nb != 0) {
              he.field_Xb = new fe(ve.field_q.field_Mb.field_Bb, ve.field_q.field_Mb.field_J, ve.field_q.field_Mb.field_K, ve.field_q.field_Mb.field_ub, ec.field_D, s.field_f, ti.field_h, ti.field_h);
              ge.field_d = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            dg.field_E.field_Y = false;
            ee.field_e.field_V = wc.field_b;
            if (oa.field_q != 1) {
              ve.field_q.field_Ib.field_Eb.field_V = ul.field_e;
              if (var19 != 0) {
                ve.field_q.field_Ib.field_Eb.field_V = ce.field_H;
              }
            } else {
              ve.field_q.field_Ib.field_Eb.field_V = ce.field_H;
            }
            ak.a(16377, ve.field_q.field_Lb);
          }
          stackIn_102_0 = var5;
          return (gh) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "gk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(l param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        l var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_a) {
            param0.a(false);
          }
          if (param1 > -83) {
            return;
          }
          var5 = this.field_h[(int)((long)(-1 + this.field_a) & param2)];
          param0.field_f = var5;
          param0.field_a = var5.field_a;
          param0.field_a.field_f = param0;
          param0.field_d = param2;
          param0.field_f.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("gk.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    gk(int param0) {
        l dupTemp$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        l var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_a = param0;
          this.field_h = new l[param0];
          var2_int = 0;
          while (param0 > var2_int) {
            dupTemp$0 = new l();
            this.field_h[var2_int] = dupTemp$0;
            var3 = dupTemp$0;
            var3.field_f = var3;
            var3.field_a = var3;
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "gk.<init>(" + param0 + ')');
        }
    }

    public final Iterator iterator() {
        j stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = new j(this);
          return (Iterator) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "gk.iterator()");
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          p.field_f = param0;
          if (param2) {
            field_c = (byte[][][]) null;
          }
          fe.field_Fb = true;
          hf.field_w = new sh(tm.field_l, on.field_b, param1, kb.field_c, p.field_f);
          tm.field_l.a(0, hf.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = null;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
