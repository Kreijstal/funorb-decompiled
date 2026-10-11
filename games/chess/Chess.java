/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Chess extends gb {
    private int[] field_H;
    static String field_D;
    static int field_E;
    static um field_B;
    static String field_C;
    private int field_F;
    public static int field_G;

    final static void a(String[] args, String[] param1, byte[] param2, rk[] param3, um param4, int param5, int[] param6, byte[] param7, km[][] param8, boolean param9, String[][] param10, um param11, int param12, um param13, int[] param14, km[][] param15, String[][] param16, int param17, int param18) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          var20 = (String[]) null;
          bl.a(args, param12, (byte) 31, param5, param6, param13, param2, param15, param14, param9, param3, param18, param16, param8, param10, (String[]) null, param4, param1, param11, param7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_4_0 = var19;
          stackIn_4_1 = new StringBuilder().append("Chess.P(");
          if (args == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param7 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param8 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param11 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param14 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param15 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param16 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param17).append(',').append(param18).append(')').toString());
        }
    }

    private final void p(int param0) {
        b.field_e = new bn(4, 2, 1);
        b.field_e.a(-66, 0, -66);
        b.field_e.a(66, 0, -66);
        b.field_e.a(-66, 0, 66);
        b.field_e.a(66, 0, 66);
        b.field_e.a(0, 1, 2, (byte) 1, (byte) -1, (short) 127, (short) -1);
        b.field_e.a(3, 2, 1, (byte) 1, (byte) -1, (short) 127, (short) -1);
        rm.field_H = (dd) (b.field_e.a(100, 131072, 0, -10, 0));
        bd.field_b = (dd) (b.field_e.a(8, 131072, 0, -10, 0));
        ea.field_cb = new bn(4, 2, 1);
        ea.field_cb.a(-344, 0, -344);
        ea.field_cb.a(344, 0, -344);
        ea.field_cb.a(-344, 0, 344);
        ea.field_cb.a(344, 0, 344);
        ea.field_cb.a(param0, 1, 2, (byte) 1, (byte) -1, ik.field_g[qm.field_g], (short) -1);
        ea.field_cb.a(3, 2, 1, (byte) 1, (byte) -1, ik.field_g[qm.field_g], (short) -1);
        ea.field_cb.field_j[0] = ik.field_g[qm.field_g];
        ea.field_cb.field_j[1] = ik.field_g[qm.field_g];
        ei.field_q = (dd) (ea.field_cb.a(100, 131072, 0, -10, 0));
        lj.field_i = new bn(4, 2, 1);
        lj.field_i.a(-66, 0, -66);
        lj.field_i.a(66, 0, -66);
        lj.field_i.a(-66, 0, 66);
        lj.field_i.a(66, 0, 66);
        lj.field_i.a(0, 1, 2, (byte) 1, (byte) -1, (short) 960, (short) -1);
        lj.field_i.a(3, 2, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
        lj.field_i.field_j[0] = (short)960;
        lj.field_i.field_j[1] = (short)960;
        mm.field_a = (dd) (lj.field_i.a(100, 131072, 0, -10, 0));
        tk.field_i = new bn(4, 2, 1);
        tk.field_i.a(-66, 0, -66);
        tk.field_i.a(66, 0, -66);
        tk.field_i.a(-66, 0, 66);
        tk.field_i.a(66, 0, 66);
        tk.field_i.a(0, 1, 2, (byte) 1, (byte) -1, (short) 960, (short) -1);
        tk.field_i.a(3, 2, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
        tk.field_i.field_j[1] = (short)960;
        tk.field_i.field_j[0] = (short)960;
        mh.field_f = (dd) (tk.field_i.a(16, 131072, 0, -10, 0));
    }

    final static int t(int param0) {
        if (param0 != 0) {
          field_D = (String) null;
        }
        return cn.field_f;
    }

    final void b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        boolean stackIn_19_1 = false;
        int stackIn_54_1 = 0;
        boolean stackIn_55_2 = false;
        int stackIn_100_0 = 0;
        int stackIn_109_0 = 0;
        int var2;
        Object var2_ref;
        int var3;
        int var4;
        String[] var4_ref_String__;
        int var5;
        int var6;
        int var7;
        un var8;
        int var9;
        int var10;
        int var11;
        ac var12;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        int var5Lifetime2;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        var11 = field_G;
        if (param0 <= 50) {
          this.q(61);
        }
        ea.h((byte) -16);
        fl.field_n = ib.a(true);
        la.b(-49);
        if (!fk.field_q.d((byte) -125)) {
          ug.a(123);
        }
        if (!ka.field_a.d((byte) -126) &&
          bc.field_b != ib.field_a) {
          if (ib.field_a > bc.field_b) {
            fieldTemp$0 = bc.field_b + 2;
            bc.field_b = bc.field_b + 2;
            rf.b(80, fieldTemp$0);
          }
          if (bc.field_b > ib.field_a) {
            fieldTemp$1 = bc.field_b - 2;
            bc.field_b = bc.field_b - 2;
            rf.b(80, fieldTemp$1);
          }
        }
        if (rm.field_R != null &&
          rm.field_R.field_b) {
          b.a(true);
          om.a(119);
        }
        stackIn_19_1 = (null != rm.field_R);
        this.b(stackIn_19_1, (byte) 31);
        if (ic.field_b) {
          this.o(111);
          ic.field_b = false;
        }
        r.field_Eb = r.field_Eb + 1;
        tl.k(31553);
        if (qh.field_b != null &&
          qh.field_b.field_J == null) {
          df.a(qh.field_b, 0);
        }
        nh.a();
        nh.c(370, ec.c((byte) -63) + 240);
        if (je.h(30065)) {
          this.m(-122);
          if (je.h(30065)) {
            if (vd.p(-77)) {
              discarded$2 = this.b(19763, false);
            }
            return;
          }
        }
        if (qi.field_l) {
          if (bh.e((byte) 55)) {
            if (!ga.a(true)) {
              if (!d.a(true)) {
                if (!ug.a(true)) {
                  this.a(false, 83);
                } else {
                  if (n.field_e == n.field_f) {
                    var2 = kg.b(true);
                    if (var2 == 1) {
                      ia.field_l = true;
                      hj.a(0, -2, false);
                    }
                    this.a(true, 12);
                  } else {
                    this.a(false, 22);
                  }
                }
              } else {
                stackIn_54_1 = 68;
                stackIn_55_2 = (null != rm.field_R);
                var2 = this.b((byte) stackIn_54_1, stackIn_55_2);
                if (var2 == 1 ||
                  var2 == 2) {
                  if (rm.field_R != null) {
                    b.a(true);
                  }
                  if (var2 == 2) {
                    dh.a(bh.i(81), true);
                  }
                }
                this.a(true, -114);
              }
            } else {
              if (0 == n.field_e) {
                var2 = wf.c(true);
                if (var2 == 2) {
                  b.a(true);
                } else {
                  if (var2 != 3) {
                    if (var2 == 4) {
                      a.field_d = true;
                      hj.a(0, -6, false);
                    }
                  } else {
                    fk.a(true, 15);
                  }
                }
              } else {
                this.a(true, 101);
              }
              if (!ga.a(true)) {
                ae.field_e[jc.field_f].a((byte) 114, true, -1);
              }
            }
          } else {
            qm.a(87);
          }
        } else {
          cf.a(fl.field_p, (byte) -120);
          if (this.b(19763, true)) {
            qi.field_l = true;
          }
        }
        if (!vi.a(-3)) {
          while (true) {
            var12 = (ac) (tg.field_e.f(1184188328));
            if (var12 == null) {
              break;
            }
            tl.a(var12, 4, (byte) 117);
          }
        }
        while (true) {
          if (!tj.a((byte) 103, sk.field_r)) {
            vh.a(0, (byte) 93);
            if (wn.field_f) {
              s.field_O = 0;
            }
            if (nc.j(124)) {
              var2Lifetime1 = this.l(0);
              if (var2Lifetime1 == 0 ||
                var2Lifetime1 == 1) {
                sc.a(-116, 2);
                ka.a((byte) -76, 3);
                q.a(4, 97);
                m.a(5, 0);
                h.a(7, 0);
                dj.a(true);
                if (var2Lifetime1 != 1) {
                  if (pk.field_j) {
                    lc.field_q = true;
                    ma.field_D = false;
                    ji.field_P = true;
                    if (hj.field_i) {
                      ad.field_d = id.field_b;
                      uk.a(qk.field_h, false, 28333, 8);
                    } else {
                      uk.a(qk.field_h, false, 28333, 0);
                    }
                    de.a(-31645);
                    ae.field_e[jc.field_f].a((byte) 122, false, 0);
                    pk.field_j = false;
                    hl.field_h = false;
                    hj.field_i = false;
                  }
                  fi.field_a = false;
                  r.field_bc = false;
                } else {
                  r.field_bc = true;
                  fi.field_a = true;
                }
              }
              var3 = 0;
              if (2 == var2Lifetime1) {
                var3 = 1;
              }
              if (pk.field_j ||
                r.field_bc ||
                fi.field_a) {
                var3 = 1;
              }
              if (var3 != 0) {
                dh.c(12);
              }
            }
            return;
          }
          if (9 == wg.field_B) {
            de.a(-31645);
            r.field_bc = false;
            qk.field_h = 8;
            ad.field_d = tk.field_h.d(0);
            continue;
          }
          if (wg.field_B == 14) {
            de.a(-31645);
            hg.a(rl.field_a.length, 1024, aj.a(false), ak.a(8, 1045), o.b((byte) 19), ak.a(2000, 1045), true, 150, cn.a(11520), ai.field_h);
            il.a(hj.b(63910), sj.a((byte) -57), (byte) 15);
            wn.field_f = true;
            qk.field_h = -2;
            s.field_O = 0;
            ma.field_D = false;
            pk.field_j = true;
            r.field_bc = false;
            continue;
          }
          if (wg.field_B == 15) {
            if (pk.field_j) {
              de.a(-31645);
              fj.a(0);
              em.b(false);
              pk.field_j = false;
              ma.field_D = false;
              lc.field_q = true;
              ji.field_P = true;
              hl.field_h = false;
              hj.field_i = false;
              qk.field_h = 0;
            }
            fi.field_a = false;
            r.field_bc = false;
            continue;
          }
          if (wg.field_B == 10 &&
            pk.field_j) {
            kh.c(17);
            continue;
          }
          if (wg.field_B == 67) {
            var2Lifetime1Lifetime1 = tk.field_h.i(-105);
            var3Lifetime1 = 1 << var2Lifetime1Lifetime1;
            wc.field_w = wc.field_w | var3Lifetime1;
            vk.field_b = vk.field_b | var3Lifetime1;
            hd.field_l.a((o) (new ef(var2Lifetime1Lifetime1)), (byte) -108);
            continue;
          }
          if (wg.field_B != 57 &&
            wg.field_B != 58) {
            if (59 == wg.field_B) {
              if (hj.field_i ||
                hl.field_h) {
                de.a(-31645);
                if (hj.field_i) {
                  oc.field_p.a(71, false);
                }
                ma.field_D = false;
                lc.field_q = true;
                s.field_O = 0;
                qk.field_h = -2;
                hl.field_h = false;
                wn.field_f = true;
                hj.field_i = false;
              }
              fi.field_a = false;
              continue;
            }
            var2_ref = null;
            if (hj.field_i) {
              var2_ref = oc.field_p;
            } else {
              if (hl.field_h) {
                var2_ref = pd.field_Lb;
              }
            }
            if (var2_ref != null) {
              if (wg.field_B == 60) {
                var3Lifetime2 = tk.field_h.f(674914976);
                var4 = tk.field_h.i(-101);
                var5 = tk.field_h.e((byte) -120);
                ((un) (var2_ref)).field_B.a(var4, 255, var3Lifetime2);
                if (((un) (var2_ref)).field_B.field_k == var3Lifetime2) {
                  ((un) (var2_ref)).field_e = var5;
                } else {
                  ((un) (var2_ref)).field_v = var5;
                }
                if (((un) (var2_ref)).field_e == -1000) {
                  ((un) (var2_ref)).field_e = var5;
                }
                if (((un) (var2_ref)).field_v == -1000) {
                  ((un) (var2_ref)).field_v = var5;
                }
                if (!((un) (var2_ref)).field_c) {
                  ((un) (var2_ref)).field_e = ((un) (var2_ref)).field_e - 400;
                  ((un) (var2_ref)).field_c = true;
                }
                if (((un) (var2_ref)).field_k) {
                  continue;
                }
                ((un) (var2_ref)).field_v = ((un) (var2_ref)).field_v - 400;
                ((un) (var2_ref)).field_k = true;
                continue;
              }
              if (wg.field_B == 61) {
                var3Lifetime2Lifetime1 = tk.field_h.c(true);
                var4Lifetime1 = tk.field_h.c(true);
                var5Lifetime2 = tk.field_h.g(0);
                ((un) (var2_ref)).field_B.a(var3Lifetime2Lifetime1, var5Lifetime2, ((un) (var2_ref)).field_t, -65, var4Lifetime1);
                eb.a(var5Lifetime2, ((un) (var2_ref)).field_t.field_f[var4Lifetime1] & -16773121, ((un) (var2_ref)).field_t.field_f[var3Lifetime2Lifetime1] & -16773121, 3);
                ((un) (var2_ref)).b((byte) 26);
                continue;
              }
              if (wg.field_B == 62) {
                var3Lifetime2Lifetime2 = tk.field_h.g(0);
                ((un) (var2_ref)).field_B.a((byte) 93, var3Lifetime2Lifetime2);
                if (null != oc.field_p) {
                  oc.field_p.field_B.field_f = var3Lifetime2Lifetime2;
                }
                ((un) (var2_ref)).i(-100);
                continue;
              }
              if (wg.field_B == 63) {
                ((un) (var2_ref)).field_B.field_m = tk.field_h.i(-118);
                if (oc.field_p == null) {
                  continue;
                }
                rf.b(-116);
                continue;
              }
              if (wg.field_B == 64) {
                ((un) (var2_ref)).field_B.field_e = tk.field_h.i(-82);
                continue;
              }
              if (wg.field_B == 65) {
                ((un) (var2_ref)).field_B.field_c = tk.field_h.i(-100);
                if (null == oc.field_p) {
                  continue;
                }
                db.i(-37);
                continue;
              }
              if (66 == wg.field_B) {
                ((un) (var2_ref)).field_A = tk.field_h.i(-88);
                continue;
              }
            }
            this.b(true);
            continue;
          }
          de.a(-31645);
          var2Lifetime1Lifetime2 = tk.field_h.i(-81);
          stackIn_100_0 = (tk.field_h.i(-111) != 1) ? 0 : 1;
          var3Lifetime3 = stackIn_100_0;
          var4_ref_String__ = new String[tk.field_h.i(-106)];
          var5Lifetime1 = tk.field_h.g(0);
          if (var5Lifetime1 < 0) {
            var5Lifetime1 = -2;
          }
          for (var6 = 0; var6 < var4_ref_String__.length; var6++) {
            var4_ref_String__[var6] = tk.field_h.d(false);
          }
          var6Lifetime1 = tk.field_h.i(-123);
          var7 = -1;
          if (var5Lifetime1 >= 0) {
            stackIn_109_0 = (var5Lifetime1 != var6Lifetime1) ? 4096 : 0;
            var7 = stackIn_109_0;
          }
          cb.field_e = null;
          var8 = new un(true, var2Lifetime1Lifetime2, var4_ref_String__, var5Lifetime1, var7, var3Lifetime3 != 0);
          var8.field_B.field_k = var6Lifetime1;
          var9 = tk.field_h.i(-109);
          if (1 == var9) {
            var8.field_B.a(0, tk.field_h, var8.field_t, var8);
          }
          if (wg.field_B == 57) {
            oc.field_p = var8;
            hj.field_i = true;
            pd.field_Lb = null;
            rf.b(-111);
            db.i(-39);
            ph.a(-7125);
            qk.field_h = -1;
            ma.field_D = true;
          } else {
            pd.field_Lb = var8;
            oc.field_p = null;
            hl.field_h = true;
            nh.a();
            nh.c(370, 240 + ec.c((byte) -63));
            var10 = eg.a(var8.field_B.field_f, 0, var8.field_B.field_k);
            if (var10 != -2) {
              qk.field_h = 3;
              var8.field_d = 75;
            } else {
              qk.field_h = -1;
            }
          }
          fi.field_a = false;
          ma.field_D = true;
        }
    }

    final void e(byte param0) {
        tk.a(-2919);
        int var2 = -63 / ((-31 - param0) / 42);
        if (rm.field_R != null) {
          b.a(true);
        }
        ao.b(-25220);
    }

    private final void j(byte param0) {
        nj.a(-20, mm.field_e, 92.0f);
        this.a(true);
        cm.field_s = jn.a("logo", 8221, "", mm.field_d);
        o.field_g = jn.a("achievements", 8221, "", mm.field_d);
        ml.field_g = jn.a("instructions", 8221, "", mm.field_d);
        g.field_g = jn.a("rankings", 8221, "", mm.field_d);
        cm.field_s.field_a = -(cm.field_s.field_k / 2) + 320;
        cm.field_s.field_m = cm.field_s.field_h / 4;
        o.field_g.field_m = cm.field_s.field_m;
        ml.field_g.field_m = cm.field_s.field_m;
        g.field_g.field_m = cm.field_s.field_m;
        o.field_g.field_a = 320 - o.field_g.field_k / 2;
        ml.field_g.field_a = -(ml.field_g.field_k / 2) + 320;
        g.field_g.field_a = 320 - g.field_g.field_k / 2;
        dc.field_n = new rk[12];
        if (param0 != 16) {
          return;
        }
        dc.field_n[7] = null;
        dc.field_n[8] = cm.field_s;
        dc.field_n[4] = g.field_g;
        dc.field_n[5] = ml.field_g;
        dc.field_n[1] = cm.field_s;
        dc.field_n[9] = null;
        dc.field_n[2] = cm.field_s;
        dc.field_n[3] = null;
        dc.field_n[6] = o.field_g;
        dc.field_n[11] = cm.field_s;
        dc.field_n[10] = null;
        dc.field_n[0] = cm.field_s;
        this.k((byte) 117);
        jd.field_c = qm.a(1, "", "help", mm.field_d);
        ph.field_l = jn.a("clock", 8221, "", mm.field_d);
        ja.field_g = jn.a("clock_button", 8221, "", mm.field_d);
        pg.field_v = qm.a(param0 ^ 17, "", "clock_numbers", mm.field_d);
        da.field_y = jn.a("clock_display_separator", 8221, "", mm.field_d);
    }

    final void a(boolean param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_26_0 = false;
        Object var2;
        int var3_int;
        Runtime var3;
        int var4;
        int var5;
        Object var6;
        var5 = field_G;
        if (rm.field_R == null) {
          stackIn_3_0 = ja.field_h;
        } else {
          stackIn_3_0 = rm.field_R;
        }
        var6 = stackIn_3_0;
        var2 = var6;
        if (je.h(30065)) {
          ph.a((java.awt.Canvas) (var6), param0, tj.h(103));
          return;
        }
        if (!qi.field_l) {
          cg.a(-12, (java.awt.Canvas) (var6));
          return;
        }
        if (!bh.e((byte) 55)) {
          nj.a(-20, wn.field_g, 100.0f);
          cg.a(-12, (java.awt.Canvas) (var6));
          return;
        }
        if (qk.field_h == jc.field_f) {
          l.a(wn.field_e, jc.field_f, (byte) -86, true);
        } else {
          qd.field_w.a(-0.1, (double)r.field_Eb / 300.0, true);
          if (nc.field_T < 16) {
            l.a(wn.field_e, jc.field_f, (byte) -86, false);
          } else {
            l.a(ma.field_D, qk.field_h, (byte) -86, false);
          }
        }
        if (!wn.field_e ||
          !ma.field_D) {
          jb.a(-7093, ak.a(true));
        }
        if (ga.a(param0)) {
          wb.g(0, 0, wb.field_h, wb.field_c);
          nj.a(em.field_r, (byte) -17, em.field_r[0].field_t, em.field_r[0].field_w);
        }
        if (d.a(param0) &&
          !ga.a(param0)) {
          if (rm.field_R != null) {
            stackIn_26_0 = true;
          } else {
            stackIn_26_0 = wc.field_x;
          }
          of.a(stackIn_26_0, -122);
        } else {
          if (ug.a(param0) &&
            !ga.a(true)) {
            wb.g(0, 0, wb.field_h, wb.field_c);
            qm.a(em.field_r, -105, em.field_r[0].field_t, em.field_r[0].field_w);
          }
        }
        if (n.field_f != n.field_e) {
          var3_int = ji.field_S * 256 / 16;
          if (var3_int > 0) {
            wb.b(0, 0, wb.field_h, wb.field_c, 0, var3_int);
          }
        }
        if (sk.field_t >= 2) {
          var3 = Runtime.getRuntime();
          var4 = (int)(var3.totalMemory() - var3.freeMemory()) >> 20;
          v.field_j.a(ie.field_a + " fps; " + var4 + "MiB", 30, 70, 267386880, -1);
        }
        sf.b(16777215);
        kf.a(0, (byte) 98, (java.awt.Canvas) (var6), 0);
    }

    private final void u(int param0) {
        short[] dupTemp$0 = null;
        int stackIn_7_0 = 0;
        int var2;
        int var3;
        short[] var4_ref_short__;
        int var4;
        int var5;
        int[] var5_ref_int__;
        short[] var6;
        int var7_int;
        int[] var7;
        int var8;
        short[] var9;
        short[] var10;
        int var11;
        short[] var12;
        short[] var13;
        int var7_intLifetime1;
        short[] var4_ref_short__Lifetime1;
        int var2Lifetime1;
        var8 = field_G;
        m.field_a = bn.a(lg.field_b, "", "chess_board2");
        sl.field_g = (dd) (m.field_a.a(96, 1365, 5, -10, 5));
        j.field_v = bn.a(lg.field_b, "", "coin");
        jb.field_e = (dd) (j.field_v.a(96, 1365, 5, -10, 5));
        var2 = qm.field_g;
        if (var2 != 1 &&
          var2 != 0) {
        }
        stackIn_7_0 = (1 != qm.field_g) ? 14 : 28;
        var2Lifetime1 = stackIn_7_0;
        am.field_c = new dd[var2Lifetime1];
        da.field_w = new bn[var2Lifetime1];
        tf.field_l = new bn[var2Lifetime1];
        qe.field_u = new dd[var2Lifetime1];
        var3 = qm.field_g;
        if (var3 == 1) {
          for (var3 = 1; var3 < var2Lifetime1; var3++) {
            if (null != uh.field_u[var3]) {
              this.a(2, "halloween_backgrounds", uh.field_u[var3], true, var3, uh.field_w[var3]);
            }
            if (null != tf.field_l[var3]) {
              qe.field_u[var3] = (dd) (tf.field_l[var3].a(96, 1365, 5, -10, 5));
              am.field_c[var3] = (dd) (da.field_w[var3].a(96, 1365, 5, -10, 5));
            }
          }
        } else {
          if (0 == var3) {
          }
          for (var3 = 1; var3 < var2Lifetime1; var3++) {
            if (var3 == 13) {
              tf.field_l[var3] = new bn(new bn[]{tf.field_l[11]}, 1);
              tf.field_l[var3].c();
              da.field_w[var3] = new bn(new bn[]{da.field_w[11]}, 1);
              da.field_w[var3].c();
            }
            if (fc.field_e[var3] != null) {
              this.a(2, "", fc.field_e[var3], true, var3, fc.field_d[var3]);
            }
            if (tf.field_l[var3] != null) {
              if (3 == var3 ||
                var3 == 4 ||
                var3 == 5 ||
                6 == var3) {
                var13 = tf.field_l[var3].field_j;
                var12 = var13;
                var9 = var12;
                var4_ref_short__ = var9;
                for (var5 = var13.length - 1; var5 >= 0; var5--) {
                  var4_ref_short__[var5] = (short)(16296 - eh.a(28207, sk.field_n, 16));
                }
              }
              qe.field_u[var3] = (dd) (tf.field_l[var3].a(96, 1365, 5, -10, 5));
              am.field_c[var3] = (dd) (da.field_w[var3].a(96, 1365, 5, -10, 5));
            }
          }
        }
        this.p(0);
        kl.field_k[0] = null;
        var3 = qm.field_g;
        if (1 == var3) {
          kl.field_k[1] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_pawn_halloween");
          kl.field_k[4] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_rook_halloween");
          kl.field_k[2] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_knight_halloween");
          kl.field_k[3] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_bishop_halloween");
          kl.field_k[5] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_queen_halloween");
          kl.field_k[6] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/white_king_halloween");
        } else {
          if (var3 != 0) {
          }
          kl.field_k[1] = bn.a(lg.field_b, "", "white_pawn");
          kl.field_k[4] = bn.a(lg.field_b, "", "white_rook");
          kl.field_k[2] = bn.a(lg.field_b, "", "white_knight");
          kl.field_k[3] = bn.a(lg.field_b, "", "white_bishop");
          kl.field_k[5] = bn.a(lg.field_b, "", "white_queen");
          kl.field_k[6] = bn.a(lg.field_b, "", "white_king_gold_crown");
        }
        se.field_N[0] = null;
        for (var3 = 1; var3 <= 6; var3++) {
          se.field_N[var3] = (dd) (kl.field_k[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, -10, 5));
          n.field_b[var3] = new bn(new bn[]{kl.field_k[var3]}, 1);
          dupTemp$0 = n.field_b[var3].field_j;
          var10 = dupTemp$0;
          var4_ref_short__Lifetime1 = dupTemp$0;
          for (var5 = n.field_b[var3].field_j.length - 1; 0 <= var5; var5--) {
            var10[var5] = (short)0;
          }
          n.field_b[var3].a(this.field_H);
          jj.field_c[var3] = (dd) (n.field_b[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, -10, 5));
          dl.field_c[var3] = new bn(new bn[]{kl.field_k[var3]}, 1);
          for (var5 = dl.field_c[var3].field_h - 1; var5 >= 0; var5--) {
            dl.field_c[var3].field_C[var5] = -dl.field_c[var3].field_C[var5];
          }
          var5_ref_int__ = dl.field_c[var3].field_O;
          dl.field_c[var3].field_O = dl.field_c[var3].field_P;
          dl.field_c[var3].field_P = var5_ref_int__;
          q.field_b[var3] = (dd) (dl.field_c[var3].a(t.field_P[qm.field_g], vn.field_sb[qm.field_g], 5, 10, 5));
        }
        var3 = qm.field_g;
        if (var3 != 1) {
          if (var3 == 0) {
          }
          kl.field_k[1] = bn.a(lg.field_b, "", "black_pawn2_lighter");
          kl.field_k[4] = bn.a(lg.field_b, "", "black_rook2_lighter");
          kl.field_k[2] = bn.a(lg.field_b, "", "black_knight2_lighter");
          kl.field_k[3] = bn.a(lg.field_b, "", "black_bishop2_lighter");
          kl.field_k[5] = bn.a(lg.field_b, "", "black_queen_lighter");
          kl.field_k[6] = bn.a(lg.field_b, "", "black_king_red_crown2_lighter");
        } else {
          kl.field_k[1] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_pawn_halloween");
          kl.field_k[4] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_rook_halloween");
          kl.field_k[2] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_knight_halloween");
          kl.field_k[3] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_bishop_halloween");
          kl.field_k[5] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_queen_halloween");
          kl.field_k[6] = bn.a(lg.field_b, "halloween_chess_foreground", "halloween_chess_pieces/black_king_halloween");
        }
        var3 = -19 % ((26 - param0) / 45);
        ad.field_f[0] = null;
        var3 = t.field_P[qm.field_g];
        var4 = vn.field_sb[qm.field_g];
        for (var5 = 1; var5 <= 6; var5++) {
          ad.field_f[var5] = (dd) (kl.field_k[var5].a(var3, var4, 5, -10, 5));
          n.field_b[var5] = new bn(new bn[]{kl.field_k[var5]}, 1);
          var6 = n.field_b[var5].field_j;
          for (var7_int = n.field_b[var5].field_j.length - 1; var7_int >= 0; var7_int--) {
            var6[var7_int] = (short)0;
          }
          n.field_b[var5].a(this.field_H);
          ig.field_f[var5] = (dd) (n.field_b[var5].a(var3, var4, 5, -10, 5));
          dl.field_c[var5] = new bn(new bn[]{kl.field_k[var5]}, 1);
          var11 = -1 + dl.field_c[var5].field_h;
          var7_intLifetime1 = var11;
          while (var11 >= 0) {
            dl.field_c[var5].field_C[var11] = -dl.field_c[var5].field_C[var11];
            var11--;
          }
          var7 = dl.field_c[var5].field_O;
          dl.field_c[var5].field_O = dl.field_c[var5].field_P;
          dl.field_c[var5].field_P = var7;
          pj.field_c[var5] = (dd) (dl.field_c[var5].a(var3 * 4, var4 / 4, 5, 10, 5));
        }
        for (var5 = -1 + kl.field_k.length; 0 <= var5; var5--) {
          kl.field_k[var5] = null;
        }
        for (var5 = n.field_b.length - 1; var5 >= 0; var5--) {
          n.field_b[var5] = null;
        }
        jj.field_c[0] = null;
        ig.field_f[0] = null;
        nh.a(0.6000000238418579f);
        nh.a();
        nh.c(370, ec.c((byte) -63) + 240);
        this.d(true);
    }

    public static void v(int param0) {
        field_C = null;
        if (param0 != 2137) {
          field_C = (String) null;
        }
        field_D = null;
        field_B = null;
    }

    private final void a(boolean param0, km param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = field_G;
        try {
          var6 = param1.field_x;
          var3 = var6;
          var4 = -1 + var6.length;
          if (param0) {
            this.a(true);
          }
          while (var4 >= 0) {
            var3[var4] = s.a(var3[var4], 1);
            var4--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("Chess.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void q(int param0) {
        nj.a(-20, mm.field_e, 88.0f);
        this.a(true);
        km var6 = new km(25, 25);
        km var3 = new km(25, 25);
        int[] var4 = new int[]{12, 3, 19, 10, 15, 10, 15, 18, 10, 18, 10, 10, 6, 10, 12, 4};
        var6.e();
        wb.h(0, 0, wb.field_h, wb.field_c, 4, 1647364);
        wa.a(var4, 16777215);
        var3.e();
        wb.h(0, 0, wb.field_h, wb.field_c, 4, 1647364);
        wa.a(var4, 255);
        be.field_d = var6.c();
        df.field_e = var3.c();
        var6.a();
        var3.a();
        tb.field_c = var6.c();
        vn.field_rb = var3.c();
        ng.field_b = var6.b();
        me.field_d = var3.b();
        var6.a();
        var3.a();
        kn.field_G = var6.c();
        int var5 = -41 / ((19 - param0) / 56);
        vn.field_xb = var3.c();
        bg.field_Z = new km(77, 20);
        bg.field_Z.e();
        wb.h(0, 0, wb.field_h, wb.field_c, -1 + wb.field_c / 2, 1449732);
        ph.field_j.b(48);
        ek.field_c = qm.a(1, "", "history_replay_controls", mm.field_d);
        ke.field_g = ao.a(mm.field_d, "turntime_icons", 2993, "");
    }

    private final void o(int param0) {
        if (td.field_o != null) {
          q.a(5, td.field_o);
          td.field_o = null;
          ob.f(0);
        }
        if (param0 < 43) {
          this.field_F = 37;
        }
        mm.field_d = ri.a(1, (byte) 127);
        lc.field_m = ri.a(2, (byte) 127);
        tk.field_g = ri.a(3, (byte) 127);
        pg.field_o = ri.a(4, (byte) 127);
        li.field_g = ri.a(5, (byte) 127);
        wg.field_q = ri.a(6, (byte) 127);
        lg.field_b = ri.a(7, (byte) 127);
        bo.field_d = ri.a(9, (byte) 127);
        ca.field_b = ri.a(13, (byte) 127);
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = field_G;
        nj.a(-20, mm.field_e, 85.0f);
        this.a(true);
        v.field_j = dm.a(param0 - 16231, mm.field_d, "font", bo.field_d, "");
        jj.field_b = dm.a(param0 - 16231, hm.field_e, "", f.field_b, "kartika13");
        jj.field_d = dm.a(0, hm.field_e, "", f.field_b, "roman12");
        dm.a(0, mm.field_d, "font_prose_bold", bo.field_d, "");
        lj.field_n = jn.a("unachieved", 8221, "basic", hm.field_e);
        lj.field_n.a();
        ao.field_e = jn.a("orbcoin", 8221, "basic", hm.field_e);
        ao.field_e.a();
        me.field_c = qm.a(1, "", "achievements_large", mm.field_d);
        for (var2 = me.field_c.length - 1; 0 <= var2; var2--) {
          me.field_c[var2].a();
        }
        em.field_r = ai.a(27176, "frame", "", mm.field_d);
        if (param0 != 16231) {
          field_C = (String) null;
        }
        gh.field_b = ai.a(27176, "button_frame", "", mm.field_d);
    }

    private final void d(boolean param0) {
        int var12 = 0;
        int var13 = 0;
        dd[] stackIn_5_0 = null;
        int[] var2;
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        int var8_int;
        km var8;
        int var9;
        dd[] var9_ref_dd__;
        int var10;
        int var11;
        int[] var11_ref_int__;
        int var14;
        int[] var15;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        var14 = field_G;
        var15 = new int[]{0, -95, -600, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        var2 = var15;
        var3 = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        var4 = new int[]{0, 0, 0, 0, 0, -65536, 0, 65536, 0, 65536, 0, 0};
        var5 = (int)(Math.sin(0.39269908169872414) * 65536.0);
        var6 = (int)(Math.cos(0.39269908169872414) * 65536.0);
        var7 = new int[]{0, 0, 0, var6, 0, var5, 0, 65536, 0, -var5, 0, var6};
        rl.field_d[0][0] = new km(0, 0);
        rl.field_d[1][0] = new km(0, 0);
        hb.field_b[0][0] = new km(0, 0);
        hb.field_b[1][0] = new km(0, 0);
        ub.field_d[0][0] = new km(0, 0);
        ub.field_d[1][0] = new km(0, 0);
        qc.field_d[0][0] = new km(0, 0);
        qc.field_d[1][0] = new km(0, 0);
        for (var8_int = 0; var8_int <= 1; var8_int++) {
          if (var8_int != 0) {
            stackIn_5_0 = se.field_N;
          } else {
            stackIn_5_0 = ad.field_f;
          }
          var9_ref_dd__ = stackIn_5_0;
          for (var10 = 1; 7 > var10; var10++) {
            ub.field_d[var8_int][var10] = new km(180, 180);
            ub.field_d[var8_int][var10].e();
            nh.a();
            if (var10 == 2) {
              var11_ref_int__ = var4;
            } else {
              if (var10 != 4) {
                var11_ref_int__ = var3;
              } else {
                var11_ref_int__ = var7;
              }
            }
            var9_ref_dd__[var10].a(var15, var11_ref_int__);
            rl.field_d[var8_int][var10] = tg.field_r[-var10 + 6 + 6 * var8_int];
          }
        }
        dj.field_t = ub.field_d[1][1].c();
        ph.field_j.b(48);
        nh.a();
        nh.c(370, ec.c((byte) -63) + 240);
        for (var8_intLifetime1 = 0; 2 > var8_intLifetime1; var8_intLifetime1++) {
          dj.field_t.f(1);
        }
        for (var8_intLifetime2 = 0; var8_intLifetime2 <= 1; var8_intLifetime2++) {
          var9 = (var8_intLifetime2 != 0) ? 1 : 16777215;
          for (var10Lifetime1 = 1; var10Lifetime1 < 7; var10Lifetime1++) {
            for (var11 = 0; var11 < 2; var11++) {
              rl.field_d[var8_intLifetime2][var10Lifetime1].f(var9);
            }
            hb.field_b[var8_intLifetime2][var10Lifetime1] = new km(45, 45);
            hb.field_b[var8_intLifetime2][var10Lifetime1].e();
            rl.field_d[var8_intLifetime2][var10Lifetime1].a(23, 1024, 23, 0, (byte) 94);
            hb.field_b[var8_intLifetime2][var10Lifetime1].f(var9);
            for (var11Lifetime2 = 0; var11Lifetime2 < 2; var11Lifetime2++) {
              ub.field_d[var8_intLifetime2][var10Lifetime1].f(var9);
            }
            qc.field_d[var8_intLifetime2][var10Lifetime1] = new km(45, 45);
            qc.field_d[var8_intLifetime2][var10Lifetime1].e();
            ub.field_d[var8_intLifetime2][var10Lifetime1].a(23, 1024, 23, 0, (byte) 101);
            qc.field_d[var8_intLifetime2][var10Lifetime1].f(var9);
          }
        }
        var10Lifetime2 = 0;
        if (!param0) {
          return;
        }
        while (var10Lifetime2 < 2) {
          for (var11Lifetime1 = 0; var11Lifetime1 < 2; var11Lifetime1++) {
            if (0 == var10Lifetime2 &&
              var11Lifetime1 == 0) {
              var9Lifetime1 = 3100495;
            } else if (var10Lifetime2 == 0 &&
              var11Lifetime1 == 1) {
              var9Lifetime1 = 16444375;
            } else if (var10Lifetime2 == 1 &&
              var11Lifetime1 == 0) {
              var9Lifetime1 = 4525064;
            } else {
              var9Lifetime1 = 14101529;
            }
            for (var12 = 0; var12 < 2; var12++) {
              for (var13 = 0; 7 > var13; var13++) {
                var8 = new km(45, 45);
                var8.e();
                wb.f(0, 0, 45, 45, var9Lifetime1);
                rl.field_d[var12][var13].a(0, 0);
                cl.field_c[var10Lifetime2][var11Lifetime1][var12][var13] = var8;
              }
            }
          }
          var10Lifetime2++;
        }
        dj.field_t.d();
        dj.field_t.field_r = 0;
        dj.field_t.field_s = 0;
        ph.field_j.b(48);
        tg.field_r = null;
    }

    private final void l(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_14_5;
        int stackIn_14_6;
        int stackIn_14_7;
        boolean stackIn_15_8 = false;
        int stackIn_18_9;
        boolean stackIn_18_10;
        boolean stackIn_20_11;
        var4 = field_G;
        if (param0 != 106) {
          return;
        }
        if (jc.field_f != 2 &&
          11 != jc.field_f) {
          var2 = 1;
          if (null != pd.field_Rb) {
            stackIn_10_0 = (g.a(-1, pd.field_Rb.field_Xb)) ? 1 : 0;
          } else {
            stackIn_10_0 = 0;
          }
          var3 = stackIn_10_0;
          if (lk.a((byte) 104)) {
            stackIn_14_0 = -105;
            stackIn_14_1 = 15;
            stackIn_14_2 = 14;
            stackIn_14_3 = 11;
            stackIn_14_4 = var2;
            stackIn_14_5 = fl.field_p;
            stackIn_14_6 = 13;
            stackIn_14_7 = 0;
            stackIn_15_8 = !(fl.field_n <= 50);
            stackIn_18_9 = var3;
            stackIn_18_10 = true;
            stackIn_20_11 = (hj.field_i) || (hl.field_h);
            bh.a(stackIn_14_0, stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4 != 0, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_15_8, stackIn_18_9 != 0, stackIn_18_10, stackIn_20_11);
          }
          while (kf.d(18954)) {
            if (wn.field_f) {
              tl.a(12, 13, param0 + 17, 15);
            }
            if (hl.field_h &&
              pd.field_Lb.f(89)) {
              continue;
            }
            if (hj.field_i &&
              oc.field_p.f(-110)) {
              continue;
            }
            ae.field_e[jc.field_f].b((byte) 113);
          }
        }
        ae.field_e[jc.field_f].a((byte) -115);
    }

    private final void a(int param0, String param1, String param2, boolean param3, int param4, int param5) {
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] var7 = null;
        RuntimeException var7_ref = null;
        byte[] var8 = null;
        int var10 = 0;
        short[] var11 = null;
        short[] var12 = null;
        short[] var13 = null;
        var10 = field_G;
        try {
          tf.field_l[param4] = bn.a(lg.field_b, param1, param2);
          tf.field_l[param4].a(param5, param5, param5, param0);
          da.field_w[param4] = new bn(new bn[]{tf.field_l[param4]}, 1);
          if (!param3) {
            return;
          }
          var13 = da.field_w[param4].field_j;
          var12 = var13;
          var11 = var12;
          var7 = var11;
          var8 = new byte[var13.length];
          for (var9 = da.field_w[param4].field_j.length - 1; var9 >= 0; var9--) {
            var11[var9] = (short)0;
            var8[var9] = (byte)-36;
          }
          da.field_w[param4].field_D = var8;
          da.field_w[param4].a(this.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_10_0 = var7_ref;
          stackIn_10_1 = new StringBuilder().append("Chess.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int param0) {
        this.a(14, 12, 0, 11, 14, false, -4, 10);
        aa.field_f = ug.field_b;
        nh.field_m = false;
        vl var4 = new vl();
        var4.b(128, 16383, 9);
        vl var3 = new vl();
        var3.b(128, 16383, 9);
        d.a(var3, 22050, var4, oc.field_l, (java.awt.Component) ((Object) ja.field_h), true, (byte) -71);
        kj.field_h = 255;
        ni.field_d = 1;
        le.field_f = 16777215;
        cm.field_w = 255;
        kg.field_V = 1;
        qb.field_b = 16777215;
        if (param0 != 2) {
          field_E = -100;
        }
        this.a(true, param0 + 10229, false, true, false, false, true);
        sk.field_r[62] = 1;
        sk.field_r[64] = 1;
        sk.field_r[61] = 5;
        sk.field_r[10] = -1;
        sk.field_r[66] = 1;
        sk.field_r[67] = 1;
        sk.field_r[65] = 1;
        sk.field_r[57] = -2;
        sk.field_r[63] = 1;
        sk.field_r[9] = -1;
        sk.field_r[60] = 7;
        sk.field_r[58] = -2;
    }

    private final void a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String[] var9;
        int var3Lifetime1;
        var8 = field_G;
        if (n.field_e != n.field_f) {
          if (n.field_e != ka.field_h) {
            if (n.field_e == on.field_d) {
              if (vi.a(-3)) {
                jc.field_f = cc.field_z;
              } else {
                gf.field_d = vc.a(-127, 4);
                if (cb.field_e != null) {
                  ba.a(cb.field_e, -102, 3);
                }
                um.a(5);
                qk.field_h = ge.field_bb;
                if (a.field_d) {
                  fk.a(false, 15);
                }
                if (ia.field_l) {
                  uk.a(qk.field_h, false, 28333, -4);
                }
                if (da.a(qk.field_h, true)) {
                  de.a(-31645);
                }
              }
              var3 = jc.field_f;
              uk.a(qk.field_h, false, 28333, var3);
              n.field_e = pj.field_d;
              nc.field_T = 31;
            } else {
              ji.field_S = ji.field_S - 1;
              if (ji.field_S == 0) {
                n.field_e = n.field_f;
              }
            }
          } else {
            ji.field_S = ji.field_S + 1;
            if (ji.field_S == 16) {
              if (ga.a(true)) {
                uh.j(-3750);
              } else {
                db.h(12082);
              }
              n.field_e = on.field_d;
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (!param0) {
            if (jc.field_f != qk.field_h) {
              nc.field_T = nc.field_T + 1;
              if (nc.field_T == 32) {
                de.a(-31645);
              }
            } else {
              if (jc.field_f == -1) {
                if (!pk.field_j) {
                  oc.field_p.a((byte) -39, true);
                  while (kf.d(18954)) {
                    if (oc.field_p.f(-111)) {
                      continue;
                    }
                  }
                } else {
                  var4 = 1;
                  var3 = 1;
                }
                if (-1 != jc.field_f &&
                  da.a(jc.field_f, true)) {
                  ae.field_e[jc.field_f].a((byte) -110);
                }
              } else {
                if (jc.field_f != -2) {
                  if (da.a(jc.field_f, true)) {
                    if (!pk.field_j) {
                      ae.field_e[jc.field_f].a((byte) -125);
                    } else {
                      this.l((byte) 106);
                    }
                  }
                } else {
                  var3 = 1;
                }
              }
              if (jc.field_f == 3) {
                var3 = 1;
                var4 = 1;
              }
            }
          }
          if (pk.field_j &&
            !r.field_bc &&
            !fi.field_a) {
            mi.a((byte) -78, var3 != 0);
            if (hl.field_h) {
              pd.field_Lb.a((byte) -37, var4 != 0);
            }
            if (hj.field_i) {
              oc.field_p.a((byte) -65, var4 != 0);
            }
            while (kf.d(18954)) {
              if (wn.field_f) {
                tl.a(12, 13, 94, 15);
              }
              if (hl.field_h) {
                pd.field_Lb.f(26);
              }
              if (!hj.field_i) {
                continue;
              }
              oc.field_p.f(57);
            }
          }
          if (!pk.field_j) {
            id.a((byte) 29);
          }
          if (wn.field_f) {
            if (aa.field_f >= ug.field_b) {
              var5 = ug.field_b * ug.field_b;
              var6 = var5 - aa.field_f * aa.field_f;
              var7 = var6 * 120 / var5 + sb.field_tb;
              ih.a(var7, 65);
            } else {
              aa.field_f = aa.field_f + 1;
              nh.c(370, 240 + ec.c((byte) -63));
              vk.field_e = true;
              t.field_Q = true;
              var5 = ug.field_b * ug.field_b;
              var6 = var5 - aa.field_f * aa.field_f;
              var7 = var6 * 120 / var5 + sb.field_tb;
              ih.a(var7, 65);
            }
          } else {
            if (aa.field_f > 0) {
              aa.field_f = aa.field_f - 1;
              nh.c(370, ec.c((byte) -63) + 240);
              t.field_Q = true;
              vk.field_e = true;
            }
            var5 = ug.field_b * ug.field_b;
            var6 = var5 - aa.field_f * aa.field_f;
            var7 = var6 * 120 / var5 + sb.field_tb;
            ih.a(var7, 65);
          }
        }
        if (-3 == qk.field_h) {
          cb.field_e = null;
          var9 = new String[]{vg.field_b, mm.field_c};
          oc.field_p = new un(false, 0, var9, 0, 0, false);
          qk.field_h = -1;
          ma.field_D = true;
        }
        if (-4 == qk.field_h) {
          qn.field_U.f(9, -87);
          r.field_bc = true;
          qk.field_h = jc.field_f;
        }
        var3Lifetime1 = 107 / ((param1 + 51) / 45);
        if (qk.field_h == -5) {
          if (null != pd.field_Rb) {
            db.a(11, pd.field_Rb.g((byte) -121), 28113);
          }
          fi.field_a = true;
          qk.field_h = jc.field_f;
        }
    }

    public final void init() {
        this.a(16742, 15, "Chess");
    }

    private final void r(int param0) {
        km var2;
        int var3;
        int var4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = field_G;
        nj.a(-20, mm.field_e, 95.0f);
        this.a(true);
        vn.field_Bb = this.a(2, wk.a(mm.field_d, 1, "win_black", ""));
        jh.field_b = this.a(2, wk.a(mm.field_d, 1, "win_white", ""));
        fa.field_e = this.a(2, wk.a(mm.field_d, 1, "win_none", ""));
        this.a(false, vn.field_Bb);
        this.a(false, jh.field_b);
        this.a(false, fa.field_e);
        var3 = qm.field_g;
        if (var3 != 1) {
          var2 = wk.a(mm.field_d, 1, "background_3d", "");
        } else {
          var2 = wk.a(mm.field_d, 1, "background_3d_halloween", "");
        }
        ph.field_f = new km(var2.field_w * 2, var2.field_t * 2);
        ph.field_f.e();
        var2.a(0, 0, wb.field_h, wb.field_c);
        wb.e(2, 2, 0, 0, wb.field_h, wb.field_c);
        ph.field_j.b(48);
        var3Lifetime1 = qm.field_g;
        if (var3Lifetime1 != 1) {
          ob.field_B = jn.a("scenery_2d_grass", 8221, "", mm.field_d);
        } else {
          ob.field_B = jn.a("scenery_2d_mud", 8221, "halloween_chess_background", mm.field_d);
        }
        if (param0 > -120) {
          return;
        }
        bj.field_bb = qm.a(1, "", "slider_ends", mm.field_d);
        wh.field_c = jn.a("slider_body", 8221, "", mm.field_d);
        var3Lifetime2 = qm.field_g;
        if (var3Lifetime2 != 1) {
          tg.field_r = ao.a(mm.field_d, "2d_icons", 2993, "");
        } else {
          tg.field_r = ao.a(mm.field_d, "2d_icons_halloween", 2993, "halloween_chess_background");
        }
        for (var3Lifetime3 = 0; tg.field_r.length > var3Lifetime3; var3Lifetime3++) {
          tg.field_r[var3Lifetime3].f();
        }
        wf.field_Q = wk.a(mm.field_d, 1, "logo_for_lobby", "");
    }

    final void f(byte param0) {
        int var3 = field_G;
        Chess.v(2137);
        ef.a(27706);
        jc.d(-31);
        ic.a(false);
        dn.a(82);
        me.a(18854);
        dd.b();
        nh.c();
        vc.a(0);
        fi.b(124);
        q.a(5);
        i.a(0);
        jl.a(-1699);
        gb.f(-113);
        ae.a(122);
        fa.a((byte) -53);
        qk.a(true);
        rl.b(1);
        ek.b((byte) 30);
        wb.d();
        um.d((byte) 73);
        lh.a();
        jf.a((byte) -8);
        p.f((byte) -128);
        ud.a((byte) -109);
        gi.a(true);
        il.a(91);
        bb.b(-16987);
        rn.a(-2);
        ti.a(3411);
        ng.a((byte) -85);
        li.a(-69);
        wh.a((byte) -46);
        ld.a(0);
        vk.a((byte) -14);
        wk.a(-26815);
        ca.a((byte) -102);
        gm.a(6);
        vj.a(-97);
        rh.a(104);
        a.a(-9);
        gg.c(0);
        fe.a((byte) 106);
        aa.d(0);
        un.a((byte) 123);
        oh.b(-16534);
        eb.a(-29115);
        wm.b((byte) -108);
        hj.c(64655);
        lc.b((byte) -9);
        hn.a(false);
        o.a((byte) -91);
        tn.a(-2);
        md.d();
        vl.f(-1);
        mc.a((byte) 47);
        pi.b(-107);
        qb.a((byte) -113);
        ue.a(6);
        he.a(false);
        pd.n(0);
        ei.d((byte) -55);
        ci.i(-128);
        cf.k(5);
        ok.f((byte) 3);
        dh.d((byte) -75);
        nb.f((byte) -33);
        pc.k(0);
        r.m(92);
        kl.a((byte) -66);
        qd.a(27265);
        al.d();
        mi.c((byte) 124);
        sh.c(-119);
        of.c(false);
        le.a(-485);
        bo.a(-39);
        tb.b((byte) -99);
        in.b((byte) 23);
        an.a((byte) -109);
        ln.k(0);
        dk.b(12000);
        ce.a(true);
        lj.a(87);
        pj.a(-6145);
        ua.a(1007);
        rd.a(32286);
        ie.a(-1962602524);
        fm.l(-9);
        vd.l((byte) -106);
        ch.m(30);
        vn.j((byte) 5);
        ol.h(106);
        ii.a(82);
        wf.a(35);
        s.g((byte) -93);
        vg.b(125);
        tg.a((byte) 93);
        n.a(-123);
        rc.a(1);
        gh.a(-1);
        tl.f((byte) -105);
        id.a(23111);
        mm.a(120);
        hb.a(false);
        sn.a((byte) -65);
        wg.b(69);
        cd.a(1570);
        qe.k(2);
        nk.l(8);
        sc.a(-26862);
        hd.a((byte) -2);
        fk.d((byte) 1);
        l.c((byte) -26);
        wa.b();
        b.a(-17436);
        gf.a(540);
        cb.a(-1);
        ga.a(-124);
        af.a(-123);
        pk.b((byte) -100);
        lg.a(85);
        jj.a(7);
        uc.a(-112);
        be.a((byte) 122);
        dm.a((byte) 123);
        ke.a((byte) -105);
        gl.a((byte) 67);
        ej.a((byte) -30);
        jg.l(10000536);
        uk.c(-1);
        bc.a(10);
        bi.a((byte) 60);
        hm.a((byte) 76);
        int var2 = 98 % ((-27 - param0) / 55);
        w.k(-13077);
        fl.b(true);
        eg.b(-1);
        fg.a(true);
        va.a((byte) 121);
        pe.a((byte) 71);
        ig.a(-49);
        ob.b(false);
        ad.a(-82);
        cc.e((byte) 109);
        gd.a((byte) 84);
        tc.i(-7588);
        da.e(16);
        jh.a((byte) -93);
        ab.g(-115);
        sl.a((byte) 59);
        ge.k(0);
        hl.a(true);
        hi.c();
        am.c((byte) 119);
        fn.a(-86);
        em.b(3);
        rb.b(-18067);
        lk.a(0);
        sg.a((byte) 124);
        la.a(69);
        g.a(-20905);
        qm.a((byte) -6);
        qh.a(-99);
        f.a(-24420);
        en.a();
        ia.a(256);
        ql.a((byte) 109);
        vh.a(102);
        nd.a(84);
        nj.c(-10406);
        ka.a((byte) -122);
        sj.a(true);
        ub.b((byte) 80);
        mf.f(0);
        fb.h(-1);
        kn.e((byte) 127);
        k.h((byte) -24);
        eh.i(888706465);
        ma.f((byte) -96);
        qj.a(124);
        m.a(false);
        dg.a();
        ib.a(-12374);
        qf.a((byte) -46);
        th.a(0);
        rf.a(9);
        di.g((byte) -54);
        kj.a((byte) 115);
        qc.a(7);
        j.d((byte) -84);
        dj.d((byte) -114);
        v.a((byte) -117);
        wn.b(false);
        oa.a(17);
        kh.b(64);
        si.c(23);
        de.a((byte) -120);
        tm.a((byte) 76);
        og.a();
        td.a(5239);
        cl.a(12);
        df.b(-6);
        vi.a((byte) 116);
        kf.c((byte) -101);
        dl.b(7);
        d.k(-110);
        kd.l(-4403);
        qa.a(-1);
        kg.c(false);
        bg.n(2491);
        qn.m(-14);
        bj.k(45);
        rm.a(850101921);
        t.a(8);
        se.e((byte) 67);
        jn.e((byte) -61);
        ea.g((byte) -44);
        ki.b(true);
        vm.c(true);
        ni.a(0);
        ba.c(false);
        od.b(false);
        nc.e((byte) -116);
        cg.a(1);
        fc.a(-29306);
        ri.h(1);
        ih.i((byte) 48);
        bh.j(0);
        bf.d(false);
        ah.d((byte) 83);
        ja.a((byte) -115);
        ml.a((byte) -122);
        kb.i(-15237);
        ji.i(5849);
        bl.a(0);
        cn.b(7043);
        cm.a(false);
        hg.a((byte) -76);
        el.e((byte) 125);
        mn.a(32768);
        gn.a();
        bd.a(-40);
        ik.a((byte) -120);
        hc.a(false);
        fd.c((byte) 101);
        ak.a(21296);
        ao.a(1);
        pg.c((byte) 11);
        hh.c((byte) 109);
        sf.c(103);
        wj.a(-3);
        wc.b(true);
        hk.c((byte) -42);
        vf.b(false);
        lf.j(1839839976);
        ve.l(103);
        bk.a(true);
        ac.c((byte) -119);
        mh.a(3);
        tk.b((byte) 77);
        tf.a(false);
        ed.a((byte) -31);
        aj.a(0);
        e.a(99);
        h.a(1187598372);
        jd.a(false);
        ph.b(0);
        sk.c(10);
        ec.d((byte) 98);
        oj.a((byte) 52);
        pa.c((byte) -117);
        dc.d(5);
        ij.b(255);
        uj.c((byte) -118);
        om.c((byte) -126);
        ai.a(-125);
        fj.a((byte) 126);
        uh.k(16);
        tj.i(-19374);
        db.d(true);
        qi.b((byte) 79);
        oc.h(0);
        ag.a(9604);
        re.a(-7101);
        mk.a((byte) -95);
        jb.c(350);
        sa.a(-20127);
        this.field_H = null;
        this.field_w = null;
    }

    private final boolean b(int param0, boolean param1) {
        km discarded$0 = null;
        int var3;
        int var4;
        km var5;
        km[][] var6;
        int var3Lifetime1;
        var4 = field_G;
        ab.h(param0 - 19759);
        if (null == lc.field_m) {
          if (null != tk.field_g) {
            nj.a(param0 ^ -19745, ae.field_a, 70.0f);
            this.a(true);
            this.n(33);
            tk.field_g = null;
            ob.f(0);
            return false;
          }
          if (param0 != 19763) {
            var5 = (km) null;
            discarded$0 = this.a(16, (km) null);
          }
          if (null != li.field_g) {
            nj.a(param0 ^ -19745, qe.field_O, 75.0f);
            this.a(true);
            for (var3 = 0; 7 > var3; var3++) {
              el.field_y[var3] = pf.a(li.field_g, "", "chess" + (1 + var3));
              if (null != el.field_y[var3]) {
                fk.field_q.a(pg.field_o, param0 ^ -19794, 0, el.field_y[var3], s.field_S);
              }
            }
            gl.field_b = pf.a(li.field_g, "", "fanfare");
            if (null != gl.field_b) {
              ka.field_a.a(pg.field_o, param0 - 19887, 0, gl.field_b, s.field_S);
            }
            fk.field_q.c((byte) -61);
            ka.field_a.c((byte) -61);
            ug.a(86);
            s.field_S = null;
            li.field_g = null;
            pg.field_o = null;
            ob.f(0);
            return false;
          }
          if (null == mm.field_d) {
            if (wg.field_q != null) {
              kd.a((byte) -90, new sn(wg.field_q.a("", 30045, "huffman")));
              wg.field_q = null;
              ob.f(param0 ^ 19763);
              return false;
            }
            if (null != lg.field_b) {
              nj.a(-20, q.field_c, 97.0f);
              this.a(true);
              this.u(-21);
              lg.field_b = null;
              ob.f(0);
              return false;
            }
            um.b(param0 - 19123);
            for (var3Lifetime1 = 0; var3Lifetime1 < 12; var3Lifetime1++) {
              ae.field_e[var3Lifetime1] = new aa(var3Lifetime1);
            }
            qk.field_h = 0;
            jc.field_f = 0;
            bf.a(true, 50);
            if (vi.a(-3)) {
              return true;
            }
            gf.field_d = vc.a(param0 - 19841, 4);
            return true;
          }
          if (this.field_F == 0) {
            this.s(16231);
            this.field_F = 1;
            return false;
          }
          if (this.field_F == 1) {
            this.q(param0 - 19818);
            this.field_F = 2;
            return false;
          }
          if (this.field_F == 2) {
            this.j((byte) 16);
            this.field_F = 3;
            return false;
          }
          if (this.field_F == 3) {
            this.r(-128);
            this.field_F = 4;
            return false;
          }
          if (this.field_F == 4) {
            mm.field_d = null;
          }
          var6 = (km[][]) null;
          eg.a(rl.field_a, ek.field_f, -109, true, f.field_b, new km[][]{ke.field_g}, wh.field_g, hm.field_e, ai.field_h, 2, ca.field_b, wh.field_g, ih.field_S, 1, (km[][]) null);
          ig.field_h = wf.field_Q;
          tk.b(200, 93);
          hm.field_e = null;
          ob.f(0);
          return false;
        }
        if (lc.field_m.c((byte) 118) &&
          lc.field_m.b((byte) -40)) {
          if (tk.field_g.c((byte) 127) &&
            tk.field_g.b((byte) -40)) {
            if (pg.field_o.c((byte) 126) &&
              pg.field_o.b((byte) -40)) {
              if (li.field_g.c((byte) 121) &&
                li.field_g.b((byte) -40)) {
                if (mm.field_d.c((byte) 121) &&
                  mm.field_d.b((byte) -40)) {
                  if (wg.field_q.c((byte) 121) &&
                    wg.field_q.b((byte) -40)) {
                    if (!lg.field_b.c((byte) 122) ||
                      !lg.field_b.b((byte) -40)) {
                      nj.a(-20, ji.a(ve.field_Qb, "", hh.field_j, lg.field_b, (byte) 36), 56.0f);
                    }
                    if (bo.field_d.c((byte) 127) &&
                      bo.field_d.b((byte) -40)) {
                      if (hm.field_e.c((byte) 118) &&
                        hm.field_e.b("basic", 100)) {
                        if (hm.field_e.c((byte) 122) &&
                          hm.field_e.b("roman12", param0 - 19663)) {
                          if (f.field_b.c((byte) 123) &&
                            f.field_b.b("roman12", param0 - 19663)) {
                            if (hm.field_e.c((byte) 123) &&
                              hm.field_e.b("kartika13", 100)) {
                              if (f.field_b.c((byte) 127) &&
                                f.field_b.b("kartika13", 100)) {
                                if (hm.field_e.c((byte) 118) &&
                                  hm.field_e.b("lobby", 100)) {
                                  if (f.field_b.c((byte) 118) &&
                                    f.field_b.b("lobby", 100)) {
                                    if (ca.field_b.c((byte) 123) &&
                                      ca.field_b.b((byte) -40)) {
                                      if (!param1) {
                                        return false;
                                      }
                                      dn.a(true);
                                      nj.a(-20, ae.field_a, 70.0f);
                                      this.a(true);
                                      s.field_S = new fe(lc.field_m, tk.field_g);
                                      lc.field_m = null;
                                      ob.f(0);
                                      return false;
                                    }
                                    nj.a(-20, da.a(ld.field_a, wn.field_g, ca.field_b, -62), 80.0f);
                                    return false;
                                  }
                                  nj.a(param0 ^ -19745, ji.a(sn.field_d, "lobby", nc.field_P, f.field_b, (byte) 126), 17.0f);
                                  return false;
                                }
                                nj.a(-20, ji.a(gb.field_o, "lobby", k.field_V, hm.field_e, (byte) 30), 13.0f);
                                return false;
                              }
                              nj.a(-20, ji.a(sn.field_d, "kartika13", nc.field_P, f.field_b, (byte) 95), 17.0f);
                              return false;
                            }
                            nj.a(-20, ji.a(gb.field_o, "kartika13", k.field_V, hm.field_e, (byte) 78), 11.0f);
                            return false;
                          }
                          nj.a(-20, ji.a(sn.field_d, "roman12", nc.field_P, f.field_b, (byte) 86), 17.0f);
                          return false;
                        }
                        nj.a(-20, ji.a(gb.field_o, "roman12", k.field_V, hm.field_e, (byte) 118), 11.0f);
                        return false;
                      }
                      nj.a(-20, ji.a(gb.field_o, "basic", k.field_V, hm.field_e, (byte) 120), 65.0f);
                      return false;
                    }
                    nj.a(param0 - 19783, ji.a(sn.field_d, "", nc.field_P, bo.field_d, (byte) 49), 63.0f);
                    return false;
                  }
                  nj.a(-20, ji.a(ld.field_a, "", wn.field_g, wg.field_q, (byte) 31), 55.0f);
                  return false;
                }
                nj.a(-20, ji.a(gb.field_o, "", k.field_V, mm.field_d, (byte) 113), 35.0f);
                return false;
              }
              nj.a(-20, ji.a(vk.field_c, "", hh.field_k, li.field_g, (byte) 68), 30.0f);
              return false;
            }
            nj.a(-20, sc.a(ej.field_d, pg.field_o, 0, sk.field_u, (byte) -47), 20.0f);
            return false;
          }
          nj.a(-20, ji.a(sc.field_g, "", ol.field_X, tk.field_g, (byte) 90), 10.0f);
          return false;
        }
        nj.a(-20, ji.a(sc.field_g, "", ol.field_X, lc.field_m, (byte) 116), 5.0f);
        return false;
    }

    private final km a(int param0, km param1) {
        km var3 = null;
        RuntimeException var3_ref = null;
        km stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new km(2 * param1.field_w, param1.field_t * 2);
          var3.e();
          param1.a(0, 0, wb.field_h, wb.field_c);
          wb.e(param0, 2, 0, 0, wb.field_h, wb.field_c);
          ph.field_j.b(48);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("Chess.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void k(byte param0) {
        if (param0 != 117) {
          return;
        }
        tb.field_a = new km(270, 325);
        tb.field_a.field_r = 145;
        tb.field_a.e();
        wb.c(0, 0, 270, 325, 13875857, 15987691);
        wb.d(0, 0, 270, 325, 1);
        wb.f(0, 0, 4, wb.field_c, 0);
        wb.f(4, 0, wb.field_c, 1);
        ph.field_j.b(48);
        tb.field_a.d();
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3;
        var3 = field_G;
        um.field_l[0] = g.a((byte) -34, param0);
        for (var2 = 1; var2 < 13; var2++) {
          if (ic.field_a[var2]) {
            um.field_l[var2] = s.field_S.a(va.field_c[var2], "", -12983);
          } else {
            um.field_l[var2] = s.field_S.a(va.field_c[var2], false, "");
          }
        }
    }

    public Chess() {
        this.field_H = new int[]{0, 0, 0, 65536, 0, 0, 32768, 0, 16384, 0, 0, 65536};
        this.field_F = 0;
    }

    static {
        field_D = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_E = 480;
        field_C = "NA";
    }
}
