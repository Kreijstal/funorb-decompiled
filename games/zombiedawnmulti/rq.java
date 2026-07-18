/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class rq extends br {
    private int field_h;
    static String field_n;
    private int field_t;
    private int field_f;
    private int field_o;
    static String field_g;
    private int field_w;
    private int field_k;
    private int field_s;
    static ja field_v;
    static int[] field_u;
    private int field_i;
    private int field_m;
    static String field_q;
    static String field_r;
    private int field_j;
    static ri field_l;
    private int field_p;

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 > 2) {
          L0: {
            L1: {
              if (30 <= Math.abs(-((rq) this).field_k + param2)) {
                break L1;
              } else {
                if (Math.abs(param0 + -((rq) this).field_f) >= 30) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void b() {
        field_q = null;
        field_g = null;
        field_u = null;
        field_r = null;
        field_n = null;
        field_v = null;
        field_l = null;
    }

    private final int d() {
        return -9 + hp.a((byte) 112, g.field_a, 18);
    }

    final void a(byte param0) {
        int fieldTemp$0 = ((rq) this).field_h;
        ((rq) this).field_h = ((rq) this).field_h + 1;
        if (fieldTemp$0 > 1) {
            ((rq) this).field_h = 0;
        } else {
            return;
        }
        if (!(((rq) this).field_w <= 0)) {
            ((rq) this).field_w = ((rq) this).field_w - 1;
            return;
        }
        if (!(((rq) this).field_t >= ((rq) this).field_o)) {
            ((rq) this).field_t = ((rq) this).field_t + 1;
        }
        if (param0 <= 84) {
            field_r = null;
        }
        int fieldTemp$1 = ((rq) this).field_p + 1;
        ((rq) this).field_p = ((rq) this).field_p + 1;
        if (fieldTemp$1 >= 8) {
            int discarded$2 = 12;
            this.c();
        }
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((rq) this).field_w <= 0) {
              L1: {
                pk.field_c.c(-30 + param0.c(((rq) this).field_k, -20126), param0.d(((rq) this).field_f, 121) + -30, ((rq) this).field_t);
                if (param1 < -24) {
                  break L1;
                } else {
                  ((rq) this).a((byte) 103);
                  break L1;
                }
              }
              L2: {
                if (((rq) this).field_p >= 0) {
                  var3_int = param0.c(((rq) this).field_j, -20126);
                  var4 = param0.d(((rq) this).field_i, 108);
                  wi.field_g[((rq) this).field_p].c(-11 + var3_int, -((rq) this).field_p + -((rq) this).field_p + -((rq) this).field_p + var4 - (((rq) this).field_p + 11), 8 + -((rq) this).field_p << 3);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rq.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5_int = 0;
        String var5 = null;
        nm stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        nm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        nm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        String stackIn_29_0 = null;
        nm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        nm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        nm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        if (!qj.field_p) {
          return;
        } else {
          if (null != wd.field_G) {
            L0: {
              var1 = wn.a(-125, wf.field_m << 7) * 4 >> 16;
              stackOut_5_0 = fb.field_e.field_k;
              stackOut_5_1 = 9 + wd.field_G.g(119);
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (wd.field_G instanceof h) {
                stackOut_7_0 = (nm) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 30;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L0;
              } else {
                stackOut_6_0 = (nm) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L0;
              }
            }
            L1: {
              var2 = (int)((float)((nm) (Object) stackIn_8_0).c(stackIn_8_1 - -stackIn_8_2, -20126) / fb.field_e.field_k.field_d);
              var3 = (int)((float)fb.field_e.field_k.d(-72 + (wd.field_G.h(-71) - -6), 112) / fb.field_e.field_k.field_d);
              var4_int = 2 + (var2 - -var1);
              var5_int = -var1 + var3 + -2;
              if (0 == var1) {
                ul.field_e = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var1 != -4) {
                ig.field_b.e(var4_int, var5_int, 128, 61264);
                break L2;
              } else {
                if (!ul.field_e) {
                  ig.field_b.e(var4_int, var5_int, 128, 61264);
                  break L2;
                } else {
                  ul.field_e = false;
                  uj discarded$3 = nm.b(-128, 47);
                  ig.field_b.e(var4_int, var5_int, 128, 61264);
                  break L2;
                }
              }
            }
            L3: {
              if (se.field_E <= 0) {
                break L3;
              } else {
                L4: {
                  var1 = (400 + -se.field_E >> 1) + 10;
                  var2 = 20 + se.field_E - -20;
                  g.c();
                  var3 = 45;
                  oo.h(var1, var3, var2 + var1, var3 + hj.field_g);
                  oo.f(var1, var3, var2, hj.field_g, 2560, 160);
                  g.a(o.field_h, 10, var3, 192);
                  sj.field_j.g(10, var3);
                  sj.field_j.a(10, -5 + (hj.field_g + var3));
                  lm.field_fb.g(var1, var3);
                  lm.field_fb.b(-5 + (var2 + var1), var3);
                  rp.field_r[0].g(var1, var3);
                  rp.field_r[1].g(var2 + (var1 + -5), var3);
                  rp.field_r[2].g(var1, var3 - -hj.field_g + -5);
                  rp.field_r[3].g(-5 + var1 + var2, var3 + hj.field_g + -5);
                  var4 = ei.field_g[ma.field_d][ml.field_Jb];
                  if (ma.field_d != 21) {
                    break L4;
                  } else {
                    if (1 != ll.field_k.b((byte) -1)) {
                      break L4;
                    } else {
                      if (ml.field_Jb >= ci.field_c.length) {
                        break L4;
                      } else {
                        if (null == ci.field_c[ml.field_Jb]) {
                          break L4;
                        } else {
                          var4 = ci.field_c[ml.field_Jb];
                          break L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  int discarded$4 = pb.field_e.a(var4, 30, -10 + (var3 + 20), 400, -4 + hj.field_g + -20, 16777215, 0, 0, 0, 0);
                  if (!pp.field_n) {
                    L6: {
                      if (dg.field_J) {
                        stackOut_28_0 = gf.field_b;
                        stackIn_29_0 = stackOut_28_0;
                        break L6;
                      } else {
                        stackOut_27_0 = ob.field_A;
                        stackIn_29_0 = stackOut_27_0;
                        break L6;
                      }
                    }
                    var5 = stackIn_29_0;
                    pb.field_e.a(var5, 430, hj.field_g + var3 - 14, 10066329, 0);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                g.b();
                break L3;
              }
            }
            L7: {
              if (21 != ai.field_b) {
                break L7;
              } else {
                if (hg.field_rb != 9) {
                  break L7;
                } else {
                  L8: {
                    var1 = 4 * wn.a(-125, wf.field_m << 7) >> 16;
                    var2 = var1 + 222;
                    var3 = 428 + -var1;
                    if (var1 == 0) {
                      ul.field_e = true;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var1 != -4) {
                      break L9;
                    } else {
                      if (!ul.field_e) {
                        break L9;
                      } else {
                        ul.field_e = false;
                        uj discarded$5 = nm.b(-127, 47);
                        break L9;
                      }
                    }
                  }
                  ig.field_b.e(var2, var3, 128, 61264);
                  break L7;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final static void a(ja[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            g.c();
            el.field_H = param0;
            ve.field_b = new ja(55, 130);
            ve.field_b.a();
            el.field_H[2].f(5, -5, 16777215);
            el.field_H[3].f(5, -5, 16777215);
            oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
            el.field_H[2].f(5, -5, 0);
            el.field_H[3].f(5, -5, 0);
            oj.field_M = new ja[39];
            fe.field_W = new ja[oj.field_M.length];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= oj.field_M.length) {
                dl.field_c = da.a(9, np.field_l);
                fe.field_U = da.a(-92, mj.field_Sb);
                mi.field_Mb = da.a(104, mq.field_o);
                up.field_f = da.a(4, wm.field_U);
                la.field_j = da.a(70, vc.field_a);
                bq.field_a = da.a(-113, ej.field_k);
                wp.field_e = da.a(100, bg.field_p);
                bf.field_f = g.b(dl.field_c);
                ap.field_t = g.b(fe.field_U);
                ii.field_c = g.b(bq.field_a);
                aq.field_u = g.b(mi.field_Mb);
                kj.field_o = g.b(la.field_j);
                oq.field_t = g.b(up.field_f);
                vl.field_k = g.b(wp.field_e);
                g.b();
                break L0;
              } else {
                oj.field_M[var2_int] = new ja(200, 25);
                oj.field_M[var2_int].a();
                var3 = lh.a((byte) -12, var2_int);
                pb.field_e.b(var3, 100, 17, 16777215, -1);
                fe.field_W[var2_int] = g.b(oj.field_M[var2_int]);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("rq.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 16777215 + ')');
        }
    }

    private final void c() {
        int discarded$0 = -30019;
        ((rq) this).field_j = 12 + (((rq) this).field_s * 24 - -this.d());
        int discarded$1 = -30019;
        ((rq) this).field_i = ((rq) this).field_m * 24 + 12 + this.d();
        ((rq) this).field_p = -hp.a((byte) 39, g.field_a, 50);
    }

    rq(int param0, int param1, int param2) {
        ((rq) this).field_s = param0;
        ((rq) this).field_m = param1;
        int discarded$0 = 12;
        this.c();
        ((rq) this).field_o = 25 + hp.a((byte) 37, g.field_a, 10) >> 2;
        ((rq) this).field_t = 0;
        int discarded$1 = -30019;
        ((rq) this).field_k = 12 + 24 * ((rq) this).field_s + this.d();
        int discarded$2 = -30019;
        ((rq) this).field_f = 12 + (((rq) this).field_m * 24 - -this.d());
        ((rq) this).field_w = param2 + hp.a((byte) 58, g.field_a, 10);
        ((rq) this).field_p = 0;
        ((rq) this).field_h = hp.a((byte) -110, g.field_a, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Show chat (<%0> unread messages)";
        field_r = "Show game chat from my friends";
        field_n = "Blast humans and zombies, stunning them! If you could only make it 'deadly'...";
        field_g = "Hide lobby chat";
    }
}
