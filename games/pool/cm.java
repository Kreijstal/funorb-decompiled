/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ob {
    static String field_J;
    static java.awt.Color field_H;
    static String field_K;
    static String field_I;
    static String[] field_L;

    final int b(byte param0, int param1) {
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
        if (param0 != 6) {
            field_L = null;
        }
        if (var3 != null) {
            return var3.field_ib;
        }
        return ((cm) this).field_x;
    }

    final static eg[] a(eg param0, int[] param1, boolean param2) {
        RuntimeException var3 = null;
        eg[] var3_array = null;
        eg var4 = null;
        eg var5 = null;
        eg var6 = null;
        eg var7 = null;
        eg var8 = null;
        int var9 = 0;
        int var10 = 0;
        eg var11_ref_eg = null;
        int var11 = 0;
        eg var12_ref_eg = null;
        int var12 = 0;
        eg var13 = null;
        int var14 = 0;
        eg var15 = null;
        eg[] var16 = null;
        eg[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = Pool.field_O;
        try {
          L0: {
            var16 = new eg[param1[0] * param1[1] * param1[2]];
            var3_array = var16;
            var9 = 0;
            var5 = new eg(param0, false, false, false, false);
            var10 = 0;
            L1: while (true) {
              if (var10 >= param1[0]) {
                stackOut_21_0 = (eg[]) var3_array;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L2: {
                  if (-1 + param1[0] <= var10) {
                    var4 = var5;
                    break L2;
                  } else {
                    var4 = hq.b((byte) 122);
                    var11_ref_eg = hq.b((byte) 124);
                    ej.a(0, var4, param0.field_D + (1 - -var10) * (param0.field_w + -param0.field_D) / param1[0], false, 0, 0, 1, 0, var11_ref_eg, var5);
                    var5 = var11_ref_eg;
                    break L2;
                  }
                }
                var7 = var4;
                var11 = 0;
                L3: while (true) {
                  if (param1[1] <= var11) {
                    var10++;
                    continue L1;
                  } else {
                    L4: {
                      if (var11 < param1[1] - 1) {
                        var15 = hq.b((byte) 123);
                        var6 = var15;
                        var12_ref_eg = hq.b((byte) 125);
                        ej.a((1 - -var11) * (-param0.field_y + param0.field_S) / param1[1] + param0.field_y, var15, 0, false, 0, 1, 0, 0, var12_ref_eg, var7);
                        var7 = var12_ref_eg;
                        break L4;
                      } else {
                        var6 = var7;
                        break L4;
                      }
                    }
                    var8 = var6;
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= param1[2]) {
                        var11++;
                        continue L3;
                      } else {
                        L6: {
                          if (var12 < param1[2] - 1) {
                            var3_array[var9] = hq.b((byte) 124);
                            var13 = hq.b((byte) 126);
                            ej.a(0, var16[var9], 0, false, param0.field_V + (var12 + 1) * (-param0.field_V + param0.field_x) / param1[2], 0, 0, 1, var13, var8);
                            var8 = var13;
                            break L6;
                          } else {
                            var3_array[var9] = var8;
                            break L6;
                          }
                        }
                        var9++;
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("cm.S(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + 1 + 41);
        }
        return stackIn_22_0;
    }

    final static boolean f(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        dd var3 = null;
        int var4 = 0;
        dd var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            if (cr.field_m == null) {
              if (!hr.field_q.a("benefits", 0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (rl.field_h.a("benefits/", 0)) {
                  cr.field_m = lb.a(hr.field_q, 80, "benefits", "members_benefits_borders");
                  var1_int = 0;
                  L1: while (true) {
                    if (var1_int >= cr.field_m.field_D.length) {
                      rf.field_g = pf.a("benefits", (byte) 118, "members_benefits_logo", hr.field_q);
                      qp.field_Rb = pf.a("benefits", (byte) 69, "members_benefits_price", hr.field_q);
                      var5 = new dd(rl.field_h.a(false, "members_benefits_screenshots.jpg", "benefits/"), (java.awt.Component) (Object) vj.a((byte) -67));
                      dn.field_o = new dd[3];
                      var2 = 0;
                      L2: while (true) {
                        if (var2 >= dn.field_o.length) {
                          sh.field_P.b(15100);
                          ef.a(-2107, cr.field_m, wm.field_Yb);
                          bq.a(40, qp.field_Rb, 80, 80, 15, -2400, 2, -1, 40);
                          kq.a(dn.field_o, -58);
                          hl.a(rf.field_g, 106);
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          var3 = new dd(var5.field_w, var5.field_y / dn.field_o.length);
                          var3.e();
                          var5.a(0, -var2 * var5.field_y / dn.field_o.length);
                          dn.field_o[var2] = var3;
                          var2++;
                          continue L2;
                        }
                      }
                    } else {
                      L3: {
                        if (0 == (-16777216 & cr.field_m.field_D[var1_int])) {
                          cr.field_m.field_D[var1_int] = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var1_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cm.W(" + 109 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final int a(byte param0, int param1) {
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
        if (param0 != 69) {
            field_I = null;
        }
        if (var3 == null) {
            return 36;
        }
        return var3.field_Db;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pool.field_O;
          var4 = ((cm) this).field_h[param2];
          if (var4 != 65) {
            if (var4 != 64) {
              if (var4 == 63) {
                if (!((cm) this).field_B.b((byte) 89)) {
                  break L0;
                } else {
                  if (fr.field_n >= 8) {
                    break L0;
                  } else {
                    fr.field_n = fr.field_n + 1;
                    rj.c((byte) -45);
                    break L0;
                  }
                }
              } else {
                if (27 != var4) {
                  if (28 != var4) {
                    if (44 != var4) {
                      if (var4 == 45) {
                        if (!((cm) this).field_B.b((byte) 71)) {
                          break L0;
                        } else {
                          if (~la.field_a > ~(te.field_p[0] - 1)) {
                            la.field_a = la.field_a + 1;
                            kn.c(param0 ^ -16473);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      } else {
                        if (var4 != 46) {
                          super.b(-16470, param1, param2);
                          break L0;
                        } else {
                          if (!((cm) this).field_B.b((byte) 64)) {
                            break L0;
                          } else {
                            un.field_e = 1 - un.field_e;
                            mb.d(param0 ^ 16424);
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (!((cm) this).field_B.b((byte) 68)) {
                        break L0;
                      } else {
                        if (la.field_a > 0) {
                          la.field_a = la.field_a - 1;
                          kn.c(13);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (!((cm) this).field_B.b((byte) 115)) {
                      break L0;
                    } else {
                      er.field_W = (er.field_W + 2) % 3;
                      this.g(param0 + 16474);
                      break L0;
                    }
                  }
                } else {
                  if (((cm) this).field_B.b((byte) 76)) {
                    er.field_W = (er.field_W + 1) % 3;
                    this.g(4);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              if (!((cm) this).field_B.b((byte) 59)) {
                break L0;
              } else {
                if (2 >= fr.field_n) {
                  break L0;
                } else {
                  fr.field_n = fr.field_n - 1;
                  rj.c((byte) -45);
                  break L0;
                }
              }
            }
          } else {
            if (!((cm) this).field_B.b((byte) 64)) {
              break L0;
            } else {
              if (!dl.a(0)) {
                break L0;
              } else {
                ((cm) this).c(param0 ^ -16474, param1);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == -16470) {
            break L1;
          } else {
            field_H = null;
            break L1;
          }
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((cm) this).field_p = false;
          var2 = 20;
          var3 = 100;
          ((cm) this).a(var2, var3, -10);
          if (((cm) this).field_z == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((cm) this).field_z.field_y;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        nm.field_a = new vh(-1L, (vh) null, var2, var3, qh.field_l + -(2 * var2), -var3 + var4 + (qh.field_f - var3), (String) null);
        bm.field_e = new vh(-1L, (vh) null, 40, 50, 240, 200, (String) null);
        bm.field_e.field_Fb = 1;
        bm.field_e.field_F = rm.field_g;
        bm.field_e.field_Kb = ln.field_s;
        nm.field_a.a(-114, bm.field_e);
        vh dupTemp$6 = u.a((byte) 68, 10, 55, false, 28);
        cj.field_V = dupTemp$6;
        bm.field_e.a(-102, dupTemp$6);
        vh dupTemp$7 = u.a((byte) 120, 210, 55, true, 27);
        we.field_f = dupTemp$7;
        bm.field_e.a(122, dupTemp$7);
        va.a(false, bm.field_e, cj.field_V);
        va.a(false, bm.field_e, we.field_f);
        jq.field_f = new vh(-1L, (vh) null, 0, 0, 160, 150, (String) null);
        jq.field_f.field_Fb = 1;
        jq.field_f.field_cb = 1;
        jq.field_f.field_F = mp.field_N;
        bm.field_e.a(-116, jq.field_f);
        this.g(4);
        al.field_v = new vh(-1L, (vh) null, 290, bm.field_e.field_eb, 270, 60, (String) null);
        al.field_v.field_hb = dq.a(4, 0, ab.field_h);
        al.field_v.field_hb.field_G = 10;
        al.field_v.field_F = rm.field_g;
        dk.a(al.field_v, (byte) 93);
        qk.field_f = new vh(-1L, (vh) null, 130, 10, 100, 40, (String) null);
        qk.field_f.field_cb = 1;
        qk.field_f.field_Fb = 1;
        qk.field_f.field_F = mp.field_N;
        al.field_v.a(-106, qk.field_f);
        va.a(false, al.field_v, qk.field_f);
        vh dupTemp$8 = u.a((byte) 67, 100, 10, false, 64);
        tn.field_w = dupTemp$8;
        al.field_v.a(114, dupTemp$8);
        vh dupTemp$9 = u.a((byte) 112, 235, 10, true, 63);
        ih.field_e = dupTemp$9;
        al.field_v.a(33, dupTemp$9);
        va.a(false, al.field_v, tn.field_w);
        va.a(false, al.field_v, ih.field_e);
        rj.c((byte) -45);
        nm.field_a.a(-111, al.field_v);
        hg.field_c = new vh(0L, (vh) null, al.field_v.field_qb, al.field_v.field_eb - (-al.field_v.field_Db - 10), al.field_v.field_gb, al.field_v.field_Db, (String) null);
        hg.field_c.field_Fb = 0;
        hg.field_c.field_F = rm.field_g;
        hg.field_c.field_hb = dq.a(4, 0, bf.field_e);
        hg.field_c.field_hb.field_G = al.field_v.field_hb.field_G;
        dk.a(hg.field_c, (byte) 93);
        nm.field_a.a(-99, hg.field_c);
        db.field_Nb = new vh(-1L, (vh) null, qk.field_f.field_qb, qk.field_f.field_eb, qk.field_f.field_gb, qk.field_f.field_Db, (String) null);
        db.field_Nb.field_Fb = 1;
        db.field_Nb.field_F = mp.field_N;
        db.field_Nb.field_cb = 1;
        hg.field_c.a(49, db.field_Nb);
        vh dupTemp$10 = u.a((byte) 102, tn.field_w.field_qb, tn.field_w.field_eb, false, 45);
        tk.field_f = dupTemp$10;
        hg.field_c.a(112, dupTemp$10);
        vh dupTemp$11 = u.a((byte) 124, ih.field_e.field_qb, tn.field_w.field_eb, true, 44);
        kb.field_i = dupTemp$11;
        hg.field_c.a(84, dupTemp$11);
        va.a(false, hg.field_c, tk.field_f);
        va.a(false, hg.field_c, kb.field_i);
        kn.c(13);
        kk.field_x = new vh(46L, (vh) null, al.field_v.field_qb, hg.field_c.field_eb - -hg.field_c.field_Db + 10, al.field_v.field_gb, al.field_v.field_Db, (String) null);
        kk.field_x.field_F = rm.field_g;
        kk.field_x.field_Fb = 0;
        kk.field_x.field_Kb = ln.field_s;
        kk.field_x.field_hb = dq.a(4, 0, s.field_d[3]);
        kk.field_x.field_yb = dq.a(3, 0, s.field_d[3]);
        kk.field_x.field_hb.field_G = al.field_v.field_hb.field_G;
        kk.field_x.field_yb.field_G = al.field_v.field_hb.field_G;
        dk.a(kk.field_x, (byte) 93);
        dp.field_c = new vh(-1L, (vh) null, qk.field_f.field_qb, qk.field_f.field_eb, qk.field_f.field_gb, qk.field_f.field_Db, (String) null);
        dp.field_c.field_Fb = 1;
        dp.field_c.field_F = mp.field_N;
        dp.field_c.field_cb = 1;
        mb.d(-113);
        kk.field_x.a(14, dp.field_c);
        nm.field_a.a(-118, kk.field_x);
    }

    final boolean a(int param0, boolean param1) {
        if (!param1) {
            return false;
        }
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param0], (byte) 31);
        if (var3 != null) {
            return var3.field_pb;
        }
        if (65 != ((cm) this).field_h[param0]) {
            return true;
        }
        return dl.a(0);
    }

    private final void g(int param0) {
        bm.field_e.field_hb = dq.a(param0, 0, im.field_ic[er.field_W]);
        jq.field_f.field_hb = sb.field_c[er.field_W];
        dp.a(bm.field_e, jq.field_f, -89);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        ((cm) this).a(false);
        nm.field_a.a((byte) -79, false);
        if (param0 >= 36) {
          var2 = ((cm) this).field_B.field_e + -2;
          L0: while (true) {
            if (((cm) this).field_B.field_e <= var2) {
              return;
            } else {
              if (((cm) this).e(var2, 48)) {
                ((cm) this).b(true, var2);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_K = null;
        field_H = null;
        field_I = null;
        field_J = null;
        field_L = null;
    }

    final void d(int param0) {
        nm.field_a.a(true, false);
        super.d(-1);
        int var2 = ~((cm) this).field_B.field_h <= param0 ? ((cm) this).field_h[((cm) this).field_B.field_h] : -1;
        ek.a(nm.field_a, (byte) -111, var2);
    }

    cm(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(db.field_Wb, param0, param1, param2, param3, param4, param5);
        try {
            this.h(-108);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cm.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final int d(int param0, int param1) {
        if (param0 != 0) {
            int discarded$0 = ((cm) this).a((byte) -23, 61);
        }
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
        if (var3 != null) {
            return var3.field_sb;
        }
        return ((cm) this).field_t - -((-7 + param1) * 250);
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 16) {
              stackOut_3_0 = ib.field_u.a(false, param0, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("cm.P(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        mb.d(param0 ^ -107);
        rj.c((byte) -45);
        this.g(4);
        kn.c(13);
    }

    final int a(boolean param0, int param1) {
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param1], (byte) 31);
        if (param0) {
            ((cm) this).a(16, -44, false);
        }
        if (var3 != null) {
            return var3.field_sb - -var3.field_gb;
        }
        return ((cm) this).field_C + (param1 + -7) * 280;
    }

    final static void f(int param0) {
        bj var1 = (bj) (Object) tm.field_i.c((byte) -105);
        int var2 = 23;
        if (var1 == null) {
            dn.c(-127);
            return;
        }
        oq var3 = kn.field_e;
        int discarded$0 = var3.b(true);
        int discarded$1 = var3.b(true);
        int discarded$2 = var3.b(true);
        int discarded$3 = var3.b(true);
        var1.a((byte) -117);
    }

    final boolean e(int param0, int param1) {
        vh var3 = nm.field_a.a((long)((cm) this).field_h[param0], (byte) 31);
        int var4 = 124 % ((param1 - -42) / 49);
        if (var3 != null) {
            return var3.field_pb;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_K = null;
        field_H = new java.awt.Color(10040319);
    }
}
