/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class nl extends kb implements gw {
    static String field_D;
    kb field_E;
    static String field_F;
    static String field_G;
    static String field_C;

    void b(boolean param0) {
        if (null != this.field_E) {
            this.field_E.e(0);
        }
        if (!param0) {
            kb var3 = (kb) null;
            this.a(-121, -73, 76, 99, (kb) null, -116, -36);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 >= 93) {
                break L1;
              } else {
                this.a(87, -41, (byte) 121, -47);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(false)) {
                    break L3;
                  } else {
                    if (!this.field_E.a(param0, param1, param2, param3, param4, 96, param6)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("nl.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, kb param3) {
        kb var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0 + 0, param1, param2, param3);
              if (param0 == 32722) {
                break L1;
              } else {
                var6 = (kb) null;
                this.a(-74, (kb) null, -57, (byte) -35, 30, 107);
                break L1;
              }
            }
            L2: {
              if (this.field_E == null) {
                break L2;
              } else {
                this.field_E.a(32722, this.field_B + param1, param2 + this.field_p, param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("nl.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              var7_int = -82 % ((param3 - -58) / 53);
              if (this.field_E == null) {
                break L1;
              } else {
                this.field_E.a(param0 - -this.field_p, param1, param2, (byte) 109, param4, this.field_B + param5);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("nl.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        if (!(null == this.field_E)) {
            this.field_E.f(1);
        }
        if (param0 != 1) {
            iw var3 = (iw) null;
            nl.a(-28, -106, (iw) null);
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        kl var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param3, param0, (byte) 39, param1)) {
                this.a(param0, param3, true, param1);
                this.a(param3, param0, 106, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 26477) {
                break L2;
              } else {
                var6 = (kl) null;
                nl.a((kl) null, (qb[][]) null, (kl) null, (byte) -118);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("nl.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            discarded$11 = param3.append('\n');
            var5_int = -96 / ((param2 - 43) / 54);
            var6 = 0;
            L1: while (true) {
              if (var6 > param1) {
                L2: {
                  if (null != this.field_E) {
                    this.field_E.a(param1 - -1, param3, 26477, param0);
                    break L2;
                  } else {
                    discarded$12 = param3.append("null");
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$13 = param3.append(' ');
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("nl.HA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != -31989) {
            kb var3 = (kb) null;
            this.a(87, 114, -83, (kb) null);
        }
        return this.field_E != null ? this.field_E.g(-31989) : 0;
    }

    nl(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(param0, param1 - -this.field_B, param2 - -this.field_p, 125, param4, param5, param6)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("nl.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte[] param0, int param1, int param2, String[] param3, String[][] param4, byte[] param5, String[][] param6, kl param7, wk[][] param8, wk[][] param9, String[] param10, int[] param11, String[] param12, boolean param13, int param14) {
        nf[] array$0 = null;
        nf[] array$1 = null;
        nf[] array$2 = null;
        je stackIn_5_0;
        je stackIn_5_1;
        long stackIn_5_2;
        je stackIn_5_3;
        je stackIn_6_0 = null;
        je stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        je stackIn_6_3 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        je var16 = null;
        int var17_int = 0;
        je var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        iw var22 = null;
        je var24 = null;
        je var25 = null;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              tr.field_F = param5;
              lm.field_e = param11;
              ob.field_M = param10;
              ll.field_Mb = param6;
              wb.field_a = param4;
              cj.field_j = param3;
              gt.field_f = param12;
              ei.field_h = param14;
              mi.field_r = param0;
              jn.field_b = param8;
              ju.field_a = param9;
              mt.field_d = param2;
              rs.field_p = fk.a("gameprivacy", (byte) -128, param7, "lobby");
              bp.field_d = fk.a("ratedgame", (byte) -125, param7, "lobby");
              mo.field_g = fk.a("opentome", (byte) -124, param7, "lobby");
              lm.field_h = fk.a("allowspectators", (byte) -125, param7, "lobby");
              ks.field_u = new String[5];
              ks.field_u[1] = pc.field_i;
              ks.field_u[3] = ek.field_f;
              ks.field_u[2] = kd.field_L;
              ks.field_u[0] = ns.field_D;
              ks.field_u[4] = io.field_p;
              nf.field_Kb = new je(0L, (je) null);
              rj.field_F = new je(0L, te.field_p, su.field_b);
              cm.field_a = new je(0L, br.field_e, rh.field_g);
              ne.field_f = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              nf.field_Kb.a(rj.field_F, 79);
              if (!fh.field_c) {
                break L1;
              } else {
                nf.field_Kb.a(cm.field_a, 69);
                break L1;
              }
            }
            L2: {
              nf.field_Kb.a(ne.field_f, 59);
              ne.field_f.field_Nb.a(0, eq.field_h);
              ne.field_f.field_Nb.field_Fb = 1;
              var24 = ne.field_f.field_Nb;
              var25 = var24;
              var25.field_Eb = 1;
              t.field_g = new je(0L, eq.field_h);
              t.field_g.field_Eb = 1;
              cp.field_d = new je(0L, kd.field_M, eq.field_e.toUpperCase());
              tg.field_n = new je(0L, be.field_y, nr.field_d.toUpperCase());
              of.field_Lb = new je(0L, sh.field_m);
              r.field_v = new je(0L, te.field_p, tc.field_a);
              ek.field_c = new je(0L, ho.field_a, wb.field_c);
              sr.field_p = new je(0L, ho.field_a, fk.field_g);
              bs.field_a = new je(0L, ho.field_a, fw.field_H);
              ee.field_A = new je(0L, ho.field_a, hs.field_D);
              wl.field_K = new je(0L, br.field_e, rt.field_B);
              bv.field_x = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              fj.field_d = new je(0L, nd.field_a, l.field_f.toUpperCase());
              fj.field_d.field_xb = fh.field_c;
              stackIn_5_0 = null;

              stackIn_5_1 = null;

              stackIn_5_2 = 0L;

              stackIn_5_3 = nd.field_a;

              if (!fh.field_c) {
                stackIn_6_0 = null;
                stackIn_6_1 = null;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = (je) ((Object) stackIn_5_3);
                stackIn_6_4 = jf.field_G;
                break L2;
              } else {
                stackIn_6_0 = null;
                stackIn_6_1 = null;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = (je) ((Object) stackIn_5_3);
                stackIn_6_4 = cq.field_C;
                break L2;
              }
            }
            L3: {
              pe.field_x = new je(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              ov.field_i = new je(0L, (je) null);
              ov.field_i.a(tg.field_n, 92);
              ov.field_i.a(of.field_Lb, 47);
              of.field_Lb.a(r.field_v, 38);
              of.field_Lb.a(ek.field_c, 114);
              of.field_Lb.a(sr.field_p, 121);
              if (!fh.field_c) {
                break L3;
              } else {
                of.field_Lb.a(bs.field_a, 114);
                break L3;
              }
            }
            L4: {
              of.field_Lb.a(ee.field_A, 78);
              of.field_Lb.a(wl.field_K, 99);
              of.field_Lb.a(bv.field_x, 70);
              if (!fh.field_c) {
                break L4;
              } else {
                ov.field_i.a(fj.field_d, 127);
                break L4;
              }
            }
            L5: {
              ov.field_i.a(pe.field_x, 93);
              vu.field_Q = new je(0L, eq.field_h);
              vu.field_Q.field_Eb = 1;
              vu.field_Q.field_Fb = 0;
              td.field_g = new je(0L, bw.field_h, ul.field_f.toUpperCase());
              qc.field_c = new je(0L, jm.field_b);
              qc.field_c.a(vu.field_Q, 116);
              qc.field_c.a(td.field_g, 89);
              uj.field_l = new je(0L, cb.field_c);
              uj.field_l.a(0, eq.field_h);
              uj.field_l.field_Fb = 1;
              var16 = uj.field_l;
              var16.field_Eb = 1;
              eb.field_c = new je(0L, (je) null);
              gg.field_E = new je(0L, eq.field_h);
              gg.field_E.field_Eb = 1;
              di.field_l = new je(0L, te.field_p, su.field_b);
              pj.field_D = new je(0L, br.field_e, rh.field_g);
              bu.field_a = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
              eb.field_c.a(gg.field_E, 72);
              eb.field_c.a(di.field_l, 83);
              if (fh.field_c) {
                eb.field_c.a(pj.field_D, 107);
                break L5;
              } else {
                break L5;
              }
            }
            eb.field_c.a(bu.field_a, 109);
            mp.field_Lb = new je(0L, kd.field_M, pl.field_v.toUpperCase());
            kd.field_F = new je(0L, be.field_y);
            vc.field_l = new je(0L, sh.field_m);
            iu.field_d = new je(0L, rn.field_a, tb.field_d.toUpperCase());
            rl.field_z = new je[param1 - -4];
            pu.field_k = new nf[4 + param1][];
            rl.field_z[0] = new je(0L, fp.field_Lb, et.field_c);
            pu.field_k[0] = new nf[6];
            var17_int = 0;
            L6: while (true) {
              if ((var17_int ^ -1) <= -6) {
                L7: {
                  if ((lm.field_e.length ^ -1) <= -3) {
                    rl.field_z[1] = new je(0L, fp.field_Lb, ep.field_h);
                    array$0 = new nf[1 + lm.field_e.length];
                    pu.field_k[1] = array$0;
                    pu.field_k[1][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                    var17_int = 0;
                    L8: while (true) {
                      if (lm.field_e.length <= var17_int) {
                        break L7;
                      } else {
                        pu.field_k[1][var17_int - -1] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, Integer.toString(lm.field_e[var17_int]));
                        var17_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  rl.field_z[2] = new je(0L, fp.field_Lb, oj.field_p);
                  pu.field_k[2] = new nf[]{new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a), new nf(0L, eb.field_a, (je) null, ms.field_k, lm.field_h[0], gm.field_e), new nf(0L, eb.field_a, (je) null, ms.field_k, lm.field_h[1], po.field_b)};
                  if (ei.field_h > 1) {
                    rl.field_z[3] = new je(0L, fp.field_Lb, wp.field_u);
                    array$1 = new nf[1 + ei.field_h];
                    pu.field_k[3] = array$1;
                    pu.field_k[3][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                    var17_int = 0;
                    L10: while (true) {
                      if (var17_int >= ei.field_h) {
                        break L9;
                      } else {
                        pu.field_k[3][1 + var17_int] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, gt.field_f[var17_int]);
                        var17_int++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var17_int = 0;
                L11: while (true) {
                  if (param1 <= var17_int) {
                    var17_int = 0;
                    L12: while (true) {
                      if (param1 - -4 <= var17_int) {
                        L13: {
                          lm.field_b = new je(0L, nd.field_a);
                          so.field_d = new je(0L, nd.field_a);
                          pi.field_N = new je(0L, ke.field_e);
                          pi.field_N.a(0, eq.field_h);
                          var17 = pi.field_N;
                          pi.field_N.field_Fb = 1;
                          if (!param13) {
                            break L13;
                          } else {
                            var22 = (iw) null;
                            nl.a(-73, 39, (iw) null);
                            break L13;
                          }
                        }
                        var17.field_Eb = 1;
                        pd.field_c = new je(0L, (je) null);
                        pd.field_c.a(kd.field_F, 44);
                        pd.field_c.a(vc.field_l, 68);
                        vc.field_l.a(iu.field_d, 106);
                        var18 = 0;
                        L14: while (true) {
                          if (var18 >= param1 - -4) {
                            pd.field_c.a(lm.field_b, 77);
                            pd.field_c.a(so.field_d, 69);
                            pd.field_c.a(pi.field_N, 91);
                            bk.field_f = new je(0L, hr.field_m, em.field_d.toUpperCase());
                            dv.field_m = new je(0L, bw.field_h, dr.field_D.toUpperCase());
                            break L0;
                          } else {
                            L15: {
                              L16: {
                                if (var18 != 1) {
                                  break L16;
                                } else {
                                  if (2 > lm.field_e.length) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var18 != 3) {
                                  break L17;
                                } else {
                                  if ((ei.field_h ^ -1) >= -2) {
                                    break L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              vc.field_l.a(rl.field_z[var18], 86);
                              var19 = 0;
                              L18: while (true) {
                                if (var19 >= pu.field_k[var18].length) {
                                  break L15;
                                } else {
                                  L19: {
                                    if (pu.field_k[var18][var19] != null) {
                                      vc.field_l.a(pu.field_k[var18][var19], 48);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var19++;
                                  continue L18;
                                }
                              }
                            }
                            var18++;
                            continue L14;
                          }
                        }
                      } else {
                        L20: {
                          if (null == rl.field_z[var17_int]) {
                            break L20;
                          } else {
                            rl.field_z[var17_int].field_pb = 11;
                            break L20;
                          }
                        }
                        L21: {
                          if (pu.field_k[var17_int] != null) {
                            var18 = 0;
                            L22: while (true) {
                              if (pu.field_k[var17_int].length <= var18) {
                                break L21;
                              } else {
                                L23: {
                                  if (pu.field_k[var17_int][var18] == null) {
                                    break L23;
                                  } else {
                                    if (null == pu.field_k[var17_int][var18].field_Ob) {
                                      break L23;
                                    } else {
                                      pu.field_k[var17_int][var18].field_Ob.field_pb = 11;
                                      break L23;
                                    }
                                  }
                                }
                                var18++;
                                continue L22;
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                        var17_int++;
                        continue L12;
                      }
                    }
                  } else {
                    rl.field_z[var17_int + 4] = new je(0L, fp.field_Lb, ob.field_M[var17_int]);
                    array$2 = new nf[rn.a(255, (int) mi.field_r[var17_int]) + 1];
                    pu.field_k[var17_int + 4] = array$2;
                    pu.field_k[var17_int + 4][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                    var18 = 0;
                    L24: while (true) {
                      if (var18 >= (mi.field_r[var17_int] & 255)) {
                        var17_int++;
                        continue L11;
                      } else {
                        L25: {
                          if (jn.field_b == null) {
                            var19_ref = null;
                            break L25;
                          } else {
                            if (jn.field_b[var17_int] != null) {
                              var19_ref = jn.field_b[var17_int][var18];
                              break L25;
                            } else {
                              var19_ref = null;
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (ll.field_Mb != null) {
                            if (ll.field_Mb[var17_int] != null) {
                              var20 = ll.field_Mb[var17_int][var18];
                              break L26;
                            } else {
                              var20 = null;
                              break L26;
                            }
                          } else {
                            var20 = null;
                            break L26;
                          }
                        }
                        pu.field_k[var17_int + 4][1 + var18] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) (var19_ref), (String) (var20));
                        var18++;
                        continue L24;
                      }
                    }
                  }
                }
              } else {
                pu.field_k[0][var17_int + 1] = new nf(0L, eb.field_a, (je) null, ms.field_k, rs.field_p[var17_int], ks.field_u[var17_int]);
                var17_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var15 = decompiledCaughtException;
            stackIn_76_0 = (RuntimeException) (var15);

            stackIn_76_1 = new StringBuilder().append("nl.FA(");

            if (param0 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L27;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L28;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_82_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');

            if (param4 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "null";
              break L29;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackIn_83_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_85_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');

            if (param5 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L30;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_88_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',');

            if (param6 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L31;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_91_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');

            if (param7 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "null";
              break L32;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_94_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',');

            if (param8 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L33;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L33;
            }
          }
          L34: {


            stackIn_97_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_95_2).append(',');

            if (param9 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L34;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L34;
            }
          }
          L35: {


            stackIn_100_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_98_2).append(',');

            if (param10 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "null";
              break L35;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackIn_101_2 = "{...}";
              break L35;
            }
          }
          L36: {


            stackIn_103_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');

            if (param11 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L36;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L36;
            }
          }
          L37: {


            stackIn_106_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');

            if (param12 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "null";
              break L37;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackIn_107_2 = "{...}";
              break L37;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_77_0), stackIn_107_2 + ',' + param13 + ',' + param14 + ')');
        }
    }

    kb a(int param0) {
        kb var2 = this.field_E;
        if (var2 != null) {
            if (!(!var2.a(false))) {
                return var2;
            }
        }
        if (param0 == -1848) {
            return null;
        }
        kb var3 = (kb) null;
        this.a(-40, -59, -4, 58, 32, -127, (kb) null);
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (-1 == (param3 ^ -1)) {
            if (!(this.field_k == null)) {
                this.field_k.a((kb) (this), param0, -94, true, param1);
            }
        }
        if (param2 > -82) {
            return;
        }
        if (this.field_E != null) {
            this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -118, param3);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_D = (String) null;
        }
        return this.a(-1848) != null ? true : false;
    }

    String h(int param0) {
        String var3 = null;
        if (param0 != 21384) {
            return (String) null;
        }
        String var2 = super.h(param0 + 0);
        if (this.field_E != null) {
            var3 = this.field_E.h(21384);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    public static void i(int param0) {
        field_C = null;
        if (param0 > -81) {
            field_F = (String) null;
        }
        field_D = null;
        field_G = null;
        field_F = null;
    }

    private final boolean b(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 4) {
              L1: {
                L2: {
                  if (null == this.field_E) {
                    break L2;
                  } else {
                    if (this.field_E.a(false)) {
                      break L2;
                    } else {
                      if (!this.field_E.a(11, param1)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("nl.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -12215) {
                break L1;
              } else {
                var6 = (String[]) null;
                nl.a((byte[]) null, 101, 110, (String[]) null, (String[][]) null, (byte[]) null, (String[][]) null, (kl) null, (wk[][]) null, (wk[][]) null, (String[]) null, (int[]) null, (String[]) null, true, 39);
                break L1;
              }
            }
            L2: {
              if (this.field_E == null) {
                break L2;
              } else {
                if (!this.field_E.a(false)) {
                  break L2;
                } else {
                  if (!this.field_E.a(param0, param1, param2, -12215)) {
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            var5_int = param1;
            if (80 == var5_int) {
              L3: {
                if (!br.field_f[81]) {
                  stackIn_12_0 = this.a(param0, (byte) 107);
                  break L3;
                } else {
                  stackIn_12_0 = this.b(4, param0);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("nl.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_12_0;
        }
    }

    final static void a(int param0, int param1, iw param2) {
        try {
            if (param0 != 0) {
                iw var4 = (iw) null;
                nl.a(30, -59, (iw) null);
            }
            cg.field_c.a((byte) -119, (tc) (param2));
            ot.a((byte) 112, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nl.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(true);
    }

    final static void a(kl param0, qb[][] param1, kl param2, byte param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var4_int = param1.length;
              var5 = 0;
              L1: while (true) {
                if (var4_int <= var5) {
                  L2: {
                    if (param3 >= 124) {
                      break L2;
                    } else {
                      field_D = (String) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (param1[var5] == null) {
                      break L3;
                    } else {
                      var6 = param1[var5].length;
                      var7 = 0;
                      L4: while (true) {
                        if (var6 <= var7) {
                          break L3;
                        } else {
                          L5: {
                            var8 = param1[var5][var7];
                            if (var8 == null) {
                              break L5;
                            } else {
                              var17 = var8.field_a;
                              var16 = var17;
                              var9 = var16;
                              if (var9 == null) {
                                break L5;
                              } else {
                                var10 = var17.length;
                                var11 = 0;
                                L6: while (true) {
                                  if (var11 >= var10) {
                                    break L5;
                                  } else {
                                    L7: {
                                      var12 = var17[var11] >> 103014960;
                                      var13 = ge.a(0, var12) ? 1 : 0;
                                      if (var13 == 0) {
                                        L8: {
                                          var14 = new fd(param2, param0, var12);
                                          if (null == bk.field_e) {
                                            bk.field_e = new at();
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                        bk.field_e.a((byte) -119, (tc) (var14));
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var11++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                          var7++;
                          continue L4;
                        }
                      }
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("nl.KA(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, kb param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == this.field_E) {
                  break L3;
                } else {
                  if (!this.field_E.a(param0 + 0, param1)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("nl.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final boolean a(kb param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 107) {
              L1: {
                L2: {
                  if (null == this.field_E) {
                    break L2;
                  } else {
                    if (this.field_E.a(false)) {
                      break L2;
                    } else {
                      if (!this.field_E.a(11, param0)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("nl.GA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_G = "Battle";
        field_D = "Fire";
        field_F = "Hotseat Game";
        field_C = "Location";
    }
}
