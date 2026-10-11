/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class client extends bd {
    static byte[] field_D;
    static ud field_F;
    static String field_E;
    static String field_y;
    static ck[] field_x;
    static ck[] field_C;
    static String field_B;
    public static boolean field_A;

    private final void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != wk.field_q) {
            sh.a(false, wk.field_q);
            wk.field_q = null;
            vj.a(true);
          }
          tm.b((byte) -81);
          cl.field_y = vg.a(3, 21);
          vb.field_S = vg.a(4, 44);
          ii.field_t = vg.a(6, 39);
          eg.field_e = vg.a(11, 102);
          ph.field_Db = vg.a(7, 50);
          jj.field_c = vg.a(8, 113);
          ah.field_d = vg.a(9, param0 ^ 24867);
          wg.field_h = vg.a(10, param0 ^ 24938);
          sh.field_g = new cb(65);
          sh.field_g.a("basic", ah.field_i, bn.field_d, (byte) 95, ng.field_l);
          sh.field_g.a("arial13", ah.field_i, un.field_a, (byte) 112, ne.field_d);
          sh.field_g.a("arial13", qc.field_vb, un.field_a, (byte) 106, ne.field_d);
          sh.field_g.a("arialbold14", ah.field_i, un.field_a, (byte) -97, ne.field_d);
          sh.field_g.a("arialbold14", qc.field_vb, un.field_a, (byte) 94, ne.field_d);
          sh.field_g.a("lobby", ah.field_i, bn.field_d, (byte) -21, ng.field_l);
          sh.field_g.a("lobby", qc.field_vb, un.field_a, (byte) 87, ne.field_d);
          sh.field_g.a(sc.field_k, (byte) 122, jj.field_c, he.field_fb);
          sh.field_g.a(sc.field_k, (byte) -109, ah.field_d, he.field_fb);
          if (param0 != 24903) {
            client.a((String) null, -14);
          }
          sh.field_g.a(tm.field_g, (byte) 51, wg.field_h, kd.field_q);
          sh.field_g.a("", ii.field_t, bn.field_d, (byte) 102, ng.field_l);
          sh.field_g.a("", ph.field_Db, un.field_a, (byte) -107, ne.field_d);
          sh.field_g.a(qa.field_w, (byte) -121, eg.field_e, ga.field_b);
          sh.field_g.a(bk.field_Ob, (byte) 114, cl.field_y, bg.field_c);
          sh.field_g.a(bk.field_Ob, (byte) -45, vb.field_S, bg.field_c);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.V(" + param0 + ')');
        }
    }

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jc var5 = null;
        jc stackIn_5_0 = null;
        jc stackIn_10_0 = null;
        jc stackIn_13_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (-1 == var2_int) {
              stackIn_10_0 = hm.field_a;
              return stackIn_10_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(1 + var2_int);
            if (param1 != -12828) {
              stackIn_13_0 = (jc) null;
              return stackIn_13_0;
            }
            var5 = ng.a(param1 + 12827, var3);
            if (null != var5) {
              stackIn_18_0 = var5;
              return stackIn_18_0;
            }
            stackIn_20_0 = da.a(var4, -2734);
            return stackIn_20_0;
          }
          stackIn_5_0 = eh.field_b;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("client.R(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void i(byte param0) {
        lb dupTemp$0 = null;
        boolean stackIn_63_1 = false;
        boolean stackIn_111_1 = false;
        boolean stackIn_166_0 = false;
        int stackIn_250_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        Object stackIn_338_0 = null;
        Object stackIn_338_1 = null;
        Object stackIn_346_0 = null;
        boolean stackIn_347_1 = false;
        int stackIn_371_0 = 0;
        int stackIn_398_0 = 0;
        int stackIn_398_1 = 0;
        int stackIn_409_0 = 0;
        int stackIn_512_0 = 0;
        int stackIn_512_1 = 0;
        int stackIn_522_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        int var4 = 0;
        Object var4_ref = null;
        Object var5_ref = null;
        int var5 = 0;
        int var6_int = 0;
        lk var6 = null;
        vm var6_ref = null;
        int var7 = 0;
        uf var7_ref_uf = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        rf var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        int var17 = 0;
        qc var18 = null;
        int var19 = 0;
        int var20 = 0;
        ui[] var21 = null;
        int var22 = 0;
        var22 = field_A ? 1 : 0;
        try {
          var2_int = 0;
          if (kf.field_I != null &&
            kf.field_I.field_g.field_i >= 3) {
            var2_int = 1;
          }
          if (null != ce.field_C &&
            ce.field_C.field_g.field_i >= 3) {
            var2_int = 1;
          }
          if (var2_int != 0) {
            if (of.field_e > 0) {
              of.field_e = of.field_e - 1;
            }
            if (of.field_e == 0) {
              if (kd.field_u < 15 &&
                jf.field_c < 15 &&
                8 > ak.field_d) {
                ak.field_d = ak.field_d + 1;
              }
              if (15 < kd.field_u &&
                jf.field_c > 15 &&
                ak.field_d > 1) {
                ak.field_d = ak.field_d - 1;
              }
              of.field_e = 50;
              kd.field_u = jf.field_c;
              if (var22 != 0) {
                ak.field_d = 1;
              }
            }
          } else {
            ak.field_d = 1;
          }
          fl.a((byte) -108);
          pm.field_g = ne.b((byte) -40);
          if (sa.field_x &&
            null != wj.field_Ob) {
            wj.field_Ob.a(a.field_g * 50 / 128);
            sa.field_x = false;
          }
          if (cl.field_v != null &&
            cl.field_v.field_e) {
            sn.a(false);
            nm.e(54);
          }
          stackIn_63_1 = (null != cl.field_v);
          this.b(stackIn_63_1, -11);
          if (of.field_c) {
            this.o(24903);
            of.field_c = false;
          }
          uf.field_A = uf.field_A + 1;
          if (ta.a((byte) -104)) {
            this.g(10);
            if (ta.a((byte) -93)) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!sh.field_j) {
            ql.a(jk.field_c, (byte) -115);
            decompiledFrameRemainder0 = !(!this.n(0));
            if (decompiledFrameRemainder0) {
              sh.field_j = true;
              decompiledFrameRemainder0 = (var22 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (se.i(-1)) {
              if (!ai.f((byte) -127)) {
                if (!pk.d(65)) {
                  if (cn.f((byte) 123)) {
                    if (gb.field_Vb != gb.field_Ob) {
                      this.b(30661, false);
                      decompiledFrameRemainder0 = (var22 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      var3 = we.a(false);
                      if (var3 == 1) {
                        og.a(im.field_f, fe.field_b, true);
                      }
                      this.b(30661, true);
                      decompiledFrameRemainder0 = (var22 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    this.b(30661, false);
                    decompiledFrameRemainder0 = (var22 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_111_1 = (null != cl.field_v);
                  var3 = this.a(stackIn_111_1, (byte) 102);
                  if (1 == var3 ||
                    2 == var3) {
                    if (cl.field_v != null) {
                      sn.a(false);
                    }
                    if (var3 == 2) {
                      pk.a((byte) -17, se.h(25144));
                    }
                  }
                  this.b(30661, true);
                  decompiledFrameRemainder0 = (var22 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (~gb.field_Vb != ~gb.field_Ob) {
                  this.b(30661, false);
                  decompiledFrameRemainder0 = (var22 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var3 = tm.a((byte) -117);
                  switch (var3) {
                    case 2:
                      sn.a(false);
                    default:
                      break;
                    case 4:
                      og.a(true, 3, true);
                      if (var22 == 0) {
                        break;
                      }
                    case 3:
                      jk.a(2, true);
                      break;
                  }
                  this.b(30661, true);
                  if (var22 != 0) {
                    dc.a(-60);
                  }
                }
              }
            } else {
              dc.a(-60);
            }
          }
          if (!ph.n(-30146)) {
            L28: while (true) {
              var3_ref = (ki) (si.field_e.a(4));
              if (var3_ref != null) {
                ce.a(4, (ki) (var3_ref), -697);
                if (var22 != 0) {
                  break;
                }
                continue;
              }
              do {
                var3_ref = (ff) (jm.field_r.a(4));
                if (var3_ref == null) {
                  if (var22 == 0) {
                    break L28;
                  }
                } else {
                  wk.a(3, 5, (ff) (var3_ref));
                }
              } while (var22 == 0);
              break L28;
            }
          }
          L34: while (true) {
            stackIn_166_0 = vi.a(mk.field_c, 0);
            while (true) {
              if (stackIn_166_0) {
                stackIn_512_0 = ~bh.field_k;
                stackIn_512_1 = -10;
                if (var22 == 0) {
                  if (stackIn_512_0 == stackIn_512_1) {
                    mn.field_c = false;
                    var3_ref = de.field_V.c((byte) -38);
                    wj.a(1, -86, false, 0, true, (String) (var3_ref));
                    continue L34;
                  }
                  if (77 == bh.field_k) {
                    mn.field_c = false;
                    pn.a(true, false, true);
                    continue L34;
                  }
                  if (bh.field_k == 14) {
                    we.a((byte) 66);
                    cd.a(true);
                    nk.a(id.g(8192), rd.b(-95), 0, 5, oe.b(-10498, 2000), qi.e((byte) 117), vl.field_A, 150, oe.b(-10498, 8), 1024);
                    dg.a(21014, tc.g((byte) 98), l.a(-126));
                    gk.field_Ib = true;
                    uh.field_b = true;
                    mn.field_c = false;
                    var3_ref = j.field_d;
                    var4 = 0;
                    while (var4 < 8) {
                      ((int[]) (var3_ref))[var4] = 0;
                      var4++;
                    }
                    continue L34;
                  }
                  if (bh.field_k == 15) {
                    if (uh.field_b) {
                      bb.b(true);
                      kh.a(true);
                      kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                      dc.a(false, 126);
                      un.a((byte) -124);
                      fm.field_b = false;
                      fa.field_n = false;
                      gd.field_f = true;
                      uh.field_b = false;
                      jg.a(-48);
                    }
                    mn.field_c = false;
                    wk.field_i = false;
                    continue L34;
                  }
                  if (bh.field_k == 10 &&
                    uh.field_b) {
                    ke.a((byte) 113);
                    continue L34;
                  }
                  if (bh.field_k == 75) {
                    var3_ref = b.h(-123);
                    var4_ref = var3_ref;
                    var5_ref = de.field_V;
                    var6_int = ((wl) (var5_ref)).d((byte) -45);
                    var7 = 0;
                    L49: while (true) {
                      if (var7 < var6_int) {
                        ((int[]) (var4_ref))[var7] = ((wl) (var5_ref)).i(7553);
                        var7++;
                        continue;
                      }
                      if (!nm.field_Qb) {
                        break L49;
                      }
                      var4_ref = var3_ref;
                      var5_ref = o.field_g;
                      var6_int = 0;
                      while (var6_int < 8) {
                        ((int[]) (var4_ref))[var6_int] = lb.a(((int[]) (var4_ref))[var6_int], ~((int[]) (var5_ref))[var6_int]);
                        var6_int++;
                      }
                      if (null != kf.field_I &&
                        kf.field_I.field_g.field_p[kf.field_I.field_P] != null) {
                        var4 = 0;
                        while (var4 < 31) {
                          stackIn_166_0 = rb.a(-18, var4, (int[]) (var3_ref));
                          if (stackIn_166_0) {
                            kf.field_I.field_g.field_p[kf.field_I.field_P].field_cb.a(new vd(var4), 2777);
                          }
                          var4++;
                        }
                      }
                      var4_ref = j.field_d;
                      var5_ref = var3_ref;
                      var6_int = 0;
                      while (var6_int < 8) {
                        ((int[]) (var4_ref))[var6_int] = de.b(((int[]) (var4_ref))[var6_int], ((int[]) (var5_ref))[var6_int]);
                        var6_int++;
                      }
                      break;
                    }
                    var4_ref = o.field_g;
                    var5_ref = var3_ref;
                    var6_int = 0;
                    while (var6_int < 8) {
                      ((int[]) (var4_ref))[var6_int] = de.b(((int[]) (var4_ref))[var6_int], ((int[]) (var5_ref))[var6_int]);
                      var6_int++;
                    }
                    continue L34;
                  }
                  if (58 == bh.field_k ||
                    bh.field_k == 59) {
                    var3 = de.field_V.e(3);
                    var4 = var3 & 15;
                    var5 = 3 & var3 >> 4;
                    var6_int = var3 >> 6 & 7;
                    var7 = (var3 & 3812) >> 9;
                    stackIn_250_0 = ((var3 & 4096) == 0) ? 0 : 1;
                    var8 = stackIn_250_0;
                    stackIn_254_0 = ((8192 & var3) == 0) ? 0 : 1;
                    var9 = stackIn_254_0;
                    stackIn_258_0 = ((var3 & 16384) == 0) ? 0 : 1;
                    var10_int = stackIn_258_0;
                    stackIn_262_0 = ((var3 & 32768) == 0) ? 0 : 1;
                    var11 = stackIn_262_0;
                    var12 = de.field_V.e(3);
                    var13 = de.field_V.d((byte) -92);
                    var14 = de.field_V.d((byte) -116);
                    var15 = de.field_V.g((byte) -100);
                    if (var15 < 0) {
                      var15 = -2;
                    }
                    var16 = new String[var14];
                    var17 = 0;
                    while (var17 < var14) {
                      var16[var17] = de.field_V.b(true);
                      var17++;
                    }
                    var17 = de.field_V.d((byte) -27);
                    gh.field_e = null;
                    var18 = new qc(true, var13, var8 != 0, var4, var5, var6_int, var7, var16, var15, var9 != 0, false, false);
                    var18.field_R = var12;
                    var18.field_r = var10_int != 0;
                    if (var10_int == 0) {
                      if (var11 != 0) {
                        var18.field_p.a(new in(cf.field_e, 10, true), 2777);
                      }
                    } else {
                      var18.field_p.a(new in(bn.field_c, 8, true), 2777);
                    }
                    var19 = 0;
                    var20 = 0;
                    while (var20 < var18.field_g.field_b) {
                      stackIn_292_0 = -1;
                      stackIn_292_1 = ~(var17 & 1 << var20);
                      if (stackIn_292_0 != stackIn_292_1) {
                        var18.field_V[var20] = 200;
                        var19++;
                      }
                      var20++;
                    }
                    stackIn_292_0 = -3;
                    stackIn_292_1 = ~var19;
                    if (stackIn_292_0 > stackIn_292_1) {
                      var18.field_Ab = 100;
                    }
                    var20 = var18.field_P;
                    if (var20 < 0) {
                      var20 = 0;
                      while (200 != var18.field_V[var20]) {
                        var20++;
                      }
                    }
                    if (2 == var19) {
                      var20 = (var20 + 1) % var18.field_g.field_b;
                      while (var18.field_V[var20] != 200) {
                        var20 = (var20 + 1) % var18.field_g.field_b;
                      }
                    }
                    var18.field_i = var20;
                    var18.field_D = var20;
                    var18.field_lb = var20;
                    if (bh.field_k != 58) {
                      ce.field_C = var18;
                      fa.field_n = true;
                    } else {
                      kf.field_I = var18;
                      fm.field_b = true;
                      eb.a(58);
                    }
                    wk.field_i = false;
                    am.field_c = true;
                    if (var4 != 10) {
                      var21 = sb.field_u[var13];
                    } else {
                      var21 = ee.field_a;
                    }
                    nn.a(var18.b(true), var21[0], true);
                    continue L34;
                  }
                  if (bh.field_k == 60) {
                    if (fm.field_b ||
                      fa.field_n) {
                      fm.field_b = false;
                      am.field_c = false;
                      fa.field_n = false;
                      cd.a(true);
                      un.a((byte) -125);
                      jg.a(-111);
                    }
                    wk.field_i = false;
                    continue L34;
                  }
                  var3_ref = null;
                  if (!fm.field_b) {
                    if (fa.field_n) {
                      var3_ref = ce.field_C;
                    }
                  } else {
                    var3_ref = kf.field_I;
                  }
                  stackIn_338_0 = null;
                  stackIn_338_1 = var3_ref;
                  while (stackIn_338_0 != stackIn_338_1) {
                    if (61 == bh.field_k) {
                      var4 = de.field_V.d((byte) -92);
                      var5_ref = ((qc) (var3_ref)).field_g.field_p[var4];
                      stackIn_346_0 = var5_ref;
                      stackIn_347_1 = (~var4 == ~((qc) (var3_ref)).field_P);
                      ((lk) stackIn_346_0).a(stackIn_347_1, de.field_V, (byte) 118);
                      ((qc) (var3_ref)).a(true, (lk) (var5_ref), 600, 200, ((lk) (var5_ref)).field_jb, var4, false);
                      if (((qc) (var3_ref)).field_P != var4) {
                        continue L34;
                      }
                      we.field_b.f(59, -4);
                      we.field_b.a(true, ((lk) (var5_ref)).field_U);
                      ((qc) (var3_ref)).field_E = 7 * ((lk) (var5_ref)).field_yb - 4;
                      continue L34;
                    }
                    if (bh.field_k == 62) {
                      var4 = de.field_V.d((byte) -124);
                      var5 = de.field_V.d((byte) -116);
                      if (!(((qc) (var3_ref)).field_g.field_b > var4) ||
                        ((qc) (var3_ref)).field_g.field_p[var4] == null) {
                        qb.a((Throwable) null, 16408, "T4: " + var4);
                        si.a(85);
                        continue L34;
                      }
                      var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                      while (true) {
                        if (var6.field_fb < var6.field_gb) {
                          var7 = ((qc) (var3_ref)).b(-117, var4) ? 1 : 0;
                          stackIn_371_0 = var7;
                          if (stackIn_371_0 == 0) {
                            qb.a((Throwable) null, 16408, "T6");
                            si.a(79);
                            continue L34;
                          }
                          continue;
                        }
                        break;
                      }
                      ((qc) (var3_ref)).a(18, var6, var4);
                      ((qc) (var3_ref)).field_g.field_p[var4] = null;
                      ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & ~(1 << var4);
                      ((qc) (var3_ref)).field_g.field_i = ((qc) (var3_ref)).field_g.field_i - 1;
                      stackIn_371_0 = ((qc) (var3_ref)).field_P;
                      if (stackIn_371_0 == var4) {
                        cd.a(true);
                        ob.field_k = true;
                        ((qc) (var3_ref)).a(rm.field_b, 0);
                      }
                      ((qc) (var3_ref)).field_r = false;
                      ca.field_kb = 1;
                      jb.field_a = false;
                      rb.field_e = 0;
                      ak.field_d = 1;
                      ((qc) (var3_ref)).field_T = var5;
                      continue L34;
                    }
                    if (bh.field_k == 63) {
                      var4 = de.field_V.d((byte) -53);
                      var5 = de.field_V.d((byte) -118);
                      var6_int = sm.field_e - de.field_V.field_n;
                      if (0 > var6_int) {
                        qb.a((Throwable) null, 16408, "T8: " + var4 + " " + var5 + " " + var6_int);
                        si.a(65);
                        continue L34;
                      }
                      var7_ref_uf = new uf(var6_int + 1);
                      var7_ref_uf.a(true, var5);
                      var7_ref_uf.a(false, var6_int, de.field_V.field_r, de.field_V.field_n);
                      var7_ref_uf.field_n = 0;
                      ((qc) (var3_ref)).field_v[var4].field_g.a(var7_ref_uf, 2777);
                      dupTemp$0 = ((qc) (var3_ref)).field_v[var4];
                      dupTemp$0.field_e = dupTemp$0.field_e + var5;
                      continue L34;
                    }
                    if (bh.field_k == 64) {
                      var4 = de.field_V.d((byte) -127);
                      var5_ref = ((qc) (var3_ref)).field_g.field_p[var4];
                      var6_ref = new vm();
                      var6_ref.field_y = de.field_V.g((byte) -88);
                      var6_ref.field_n = de.field_V.g((byte) -118);
                      var6_ref.field_v = de.field_V.d((byte) -93);
                      var6_ref.field_o = de.field_V.d((byte) -83);
                      var6_ref.field_q = ((qc) (var3_ref)).field_db.a(true, true, de.field_V);
                      var6_ref.field_t = de.field_V.d((byte) -64);
                      ((qc) (var3_ref)).field_v[var4].field_g.a(var6_ref, 2777);
                      var7 = de.field_V.a(117);
                      var8 = de.field_V.a(127) + var7;
                      if (var8 > var7) {
                        var9 = var7;
                        while (true) {
                          if (var8 > var9) {
                            var10 = new rf(var9);
                            stackIn_398_0 = ~var4;
                            stackIn_398_1 = ~((qc) (var3_ref)).field_P;
                            if (stackIn_398_0 == stackIn_398_1) {
                              var10.field_m = -var7 + var9;
                            }
                            ((qc) (var3_ref)).field_db.a(var10, 0);
                            var9++;
                            continue;
                          }
                          break;
                        }
                        while (true) {
                          stackIn_398_0 = ~((lk) (var5_ref)).field_fb;
                          stackIn_398_1 = ~((lk) (var5_ref)).field_gb;
                          if (stackIn_398_0 <= stackIn_398_1) {
                            break;
                          }
                          var9 = ((qc) (var3_ref)).b(-126, var4) ? 1 : 0;
                          stackIn_409_0 = var9;
                          if (stackIn_409_0 == 0) {
                            qb.a((Throwable) null, 16408, "T7");
                            si.a(97);
                            continue;
                          }
                        }
                        ((lk) (var5_ref)).field_gb = var8;
                        ((lk) (var5_ref)).field_fb = var7;
                      }
                      stackIn_409_0 = ((qc) (var3_ref)).field_P;
                      if (stackIn_409_0 != var4) {
                        continue L34;
                      }
                      while (var6_ref.a((byte) 58)) {
                        ((qc) (var3_ref)).b(-118, var4);
                      }
                      we.field_b.f(59, -4);
                      we.field_b.a(true, ((qc) (var3_ref)).field_g.field_p[var4].field_U);
                      ((qc) (var3_ref)).field_w = 0;
                      continue L34;
                    }
                    if (bh.field_k == 65) {
                      var4 = de.field_V.d((byte) -60);
                      var5_ref = ((qc) (var3_ref)).field_g.field_p[var4];
                      do {
                        var6_int = ((qc) (var3_ref)).b(-116, var4) ? 1 : 0;
                      } while (var6_int != 0);
                      if (~((qc) (var3_ref)).field_P == ~var4) {
                        var6_int = 0;
                        while (!(((lk) (var5_ref)).field_jb <= var6_int)) {
                          fh.field_h = fh.field_h + 30000;
                          rk.field_cb = rk.field_cb + 30000;
                          var6_int++;
                        }
                      }
                      ((lk) (var5_ref)).field_jb = 0;
                      ((lk) (var5_ref)).k(-9897);
                      ((qc) (var3_ref)).field_w = 0;
                      if (~var4 != ~((qc) (var3_ref)).field_P) {
                        continue L34;
                      }
                      ((qc) (var3_ref)).field_p.a(new in(cb.field_i, 13, true), 2777);
                      ((qc) (var3_ref)).field_ob = true;
                      continue L34;
                    }
                    if (bh.field_k == 66) {
                      var4 = de.field_V.d((byte) -22);
                      var5 = de.field_V.d((byte) -76);
                      var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                      var7 = 0;
                      while (var7 < var5) {
                        var6.b(-19939);
                        var7++;
                      }
                      continue L34;
                    }
                    if (67 == bh.field_k) {
                      var4 = de.field_V.d((byte) -50);
                      var5_ref = ((qc) (var3_ref)).field_db.a(true, true, de.field_V);
                      ((qc) (var3_ref)).field_g.field_p[var4].a((rf) (var5_ref), (byte) -121);
                      continue L34;
                    }
                    if (bh.field_k == 68) {
                      ((qc) (var3_ref)).field_T = de.field_V.d((byte) -35);
                      ((qc) (var3_ref)).field_p.a(new in(eb.field_c, 12, false), 2777);
                      continue L34;
                    }
                    if (bh.field_k == 69) {
                      ((qc) (var3_ref)).field_T = de.field_V.d((byte) -78);
                      ((qc) (var3_ref)).field_r = true;
                      ((qc) (var3_ref)).field_p.a(new in(bn.field_c, 8, false), 2777);
                      continue L34;
                    }
                    if (bh.field_k == 76) {
                      ((qc) (var3_ref)).field_g.field_f[((qc) (var3_ref)).field_g.field_o] = de.field_V.g((byte) -89);
                      ((qc) (var3_ref)).field_g.field_o = ((qc) (var3_ref)).field_g.field_o + 1;
                      continue L34;
                    }
                    if (70 == bh.field_k) {
                      var4 = de.field_V.g((byte) -104);
                      var5 = 0;
                      while (var5 < ((qc) (var3_ref)).field_g.field_b) {
                        stackIn_338_0 = null;
                        stackIn_338_1 = var3_ref;
                        if (stackIn_338_0 != ((qc) (stackIn_338_1)).field_g.field_p[var5]) {
                          while (!((qc) (var3_ref)).field_v[var5].field_g.b(-24)) {
                            ((qc) (var3_ref)).b(39, var5);
                          }
                        }
                        var5++;
                      }
                      ((qc) (var3_ref)).field_g.a(var4, (byte) -70);
                      ((qc) (var3_ref)).a(100);
                      if (((qc) (var3_ref)).field_P >= 0) {
                        cd.a(true);
                      }
                      if (var4 < 0 ||
                        ((qc) (var3_ref)).field_ob) {
                        ((qc) (var3_ref)).a(rm.field_b, 0);
                      } else {
                        ((qc) (var3_ref)).a(hb.field_Ub, 0);
                      }
                      ob.field_k = true;
                      continue L34;
                    }
                    if (71 == bh.field_k) {
                      ((qc) (var3_ref)).field_g.field_d = de.field_V.d((byte) -45);
                      continue L34;
                    }
                    if (bh.field_k == 72) {
                      ((qc) (var3_ref)).field_g.field_h = de.field_V.d((byte) -19);
                      continue L34;
                    }
                    if (bh.field_k == 73) {
                      ((qc) (var3_ref)).field_g.field_a = de.field_V.d((byte) -77);
                      continue L34;
                    }
                    if (bh.field_k == 74) {
                      ((qc) (var3_ref)).field_yb = de.field_V.d((byte) -31);
                      ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & ~((qc) (var3_ref)).field_yb;
                      ((qc) (var3_ref)).field_g.field_a = ((qc) (var3_ref)).field_g.field_a & ~((qc) (var3_ref)).field_yb;
                      continue L34;
                    }
                    break;
                  }
                  this.f((byte) 126);
                  continue L34;
                }
              } else {
                wj.c(4792, 0);
                stackIn_512_0 = param0;
                stackIn_512_1 = 49;
              }
              if (stackIn_512_0 < stackIn_512_1) {
                client.a((String) null, 33);
              }
              if (null != hh.field_a &&
                ef.field_N <= 0) {
                stackIn_522_0 = 0;
              } else {
                stackIn_522_0 = 1;
              }
              var3 = stackIn_522_0;
              if (fm.field_b) {
                var3 = nk.field_i ? 1 : 0;
              }
              if (fa.field_n) {
                var3 = og.field_ib ? 1 : 0;
              }
              if (var3 != 0) {
                bg.field_b = 0;
              }
              if (ea.c((byte) -60)) {
                var4 = this.g((byte) 125);
                if (var4 == 0 ||
                  var4 == 1) {
                  if (1 != var4) {
                    if (uh.field_b) {
                      un.a((byte) -123);
                      gd.field_f = true;
                      if (fm.field_b) {
                        wj.a(1, -99, false, 0, true, af.field_a);
                      }
                      kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                      dc.a(false, 96);
                      uh.field_b = false;
                      fm.field_b = false;
                      fa.field_n = false;
                      jg.a(-100);
                      am.field_c = false;
                    }
                    wk.field_i = false;
                    mn.field_c = false;
                    if (var22 != 0) {
                      wk.field_i = true;
                      mn.field_c = true;
                    }
                  } else {
                    wk.field_i = true;
                    mn.field_c = true;
                  }
                }
                var5 = 0;
                if (var4 == 2) {
                  var5 = 1;
                }
                if (uh.field_b ||
                  mn.field_c ||
                  wk.field_i) {
                  var5 = 1;
                }
                if (!ea.c((byte) -88)) {
                  var5 = 0;
                }
                if (var5 != 0) {
                  gh.a(false);
                }
              }
              of.a(0);
              if (sh.field_j &&
                !am.field_c &&
                jg.field_a != rc.field_d) {
                nn.a(256, jg.field_a, true);
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.Q(" + param0 + ')');
        }
    }

    public static void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_y = null;
          field_D = null;
          field_E = null;
          field_F = null;
          field_C = null;
          if (param0 != -56) {
            field_C = (ck[]) null;
          }
          field_x = null;
          field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "client.U(" + param0 + ')');
        }
    }

    public client() {
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (km.field_z != null) {
            km.field_z.e();
          }
          if (param0 != 0) {
            return;
          }
          if (null != cj.field_b) {
            cj.field_b.e();
          }
          if (null != cl.field_v) {
            sn.a(false);
          }
          s.h((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.I(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        ke stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        boolean stackIn_127_2 = false;
        int stackIn_157_0 = 0;
        boolean stackIn_171_0 = false;
        int stackIn_208_0 = 0;
        int stackIn_255_0 = 0;
        boolean stackIn_298_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var9 = field_A ? 1 : 0;
        try {
          if (param0 != 30661) {
            return;
          }
          if (gb.field_Vb != gb.field_Ob) {
            if (ve.field_nc == gb.field_Ob) {
              rf.field_f = rf.field_f + 1;
              if (rf.field_f != 16) {
                return;
              }
              if (!im.field_f) {
                ed.a(param0 - 30553);
                if (var9 != 0) {
                  gf.a((byte) -126);
                }
              } else {
                gf.a((byte) -126);
              }
              gb.field_Ob = g.field_L;
              if (var9 == 0) {
                return;
              }
            }
            if (~gb.field_Ob != ~g.field_L) {
              rf.field_f = rf.field_f - 1;
              if (rf.field_f != 0) {
                return;
              }
              gb.field_Ob = gb.field_Vb;
              if (var9 == 0) {
                return;
              }
            }
            boolean decompiledFrameRemainder3 = true;
            if (!ph.n(-30146)) {
              if (null != gh.field_e) {
                qb.a(3, (byte) 85, gh.field_e);
              }
              ek.g(param0 - 31870);
              if (1 != fe.field_b) {
                if (2 != fe.field_b) {
                  if (fe.field_b != 3) {
                    if (fe.field_b == 4) {
                      dc.a(false, param0 - 30547);
                      decompiledFrameRemainder3 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder3) {
                      if (fe.field_b != 5) {
                        if (fe.field_b == 6) {
                          cl.field_B = qj.a(-44, false);
                          decompiledFrameRemainder3 = (var9 != 0);
                        }
                        if (decompiledFrameRemainder3) {
                          if (fe.field_b != 8) {
                            if (7 != fe.field_b) {
                              throw new IllegalStateException(Integer.toString(fe.field_b));
                            }
                            ca.field_wb = oj.a(false, 415);
                            decompiledFrameRemainder3 = (var9 != 0);
                          }
                          if (decompiledFrameRemainder3) {
                            am.field_a = ib.a((byte) 82, false);
                            decompiledFrameRemainder3 = (var9 != 0);
                          }
                        }
                      }
                      if (decompiledFrameRemainder3) {
                        h.field_d = uh.a(o.field_g, false, 0, -111);
                        if (var9 != 0) {
                          jk.a(2, true);
                          jm.a(0, true);
                          vk.a(true, (byte) -53);
                        }
                      }
                    }
                  } else {
                    jk.a(2, true);
                    if (var9 != 0) {
                      jm.a(0, true);
                      vk.a(true, (byte) -53);
                    }
                  }
                } else {
                  jm.a(0, true);
                  if (var9 != 0) {
                    vk.a(true, (byte) -53);
                  }
                }
              } else {
                vk.a(true, (byte) -53);
              }
            }
            gb.field_Ob = lk.field_I;
            if (var9 == 0) {
              return;
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder2 = true;
          var3_int = 0;
          var4 = 0;
          if (!param1) {
            if (null != kf.field_G) {
              if (ba.field_c) {
                pd.field_d.g((byte) -96);
                decompiledFrameRemainder2 = (var9 != 0);
              }
              if (decompiledFrameRemainder2) {
                if (!lk.field_F) {
                  if (!mg.field_Zb) {
                    if (!fm.field_e) {
                      if (!ve.field_Hc) {
                        if (nk.field_k) {
                          f.field_s.g(2824);
                          decompiledFrameRemainder2 = (var9 != 0);
                        }
                        if (decompiledFrameRemainder2) {
                          if (!gi.field_b) {
                            kf.field_G.k(128);
                            decompiledFrameRemainder2 = (var9 != 0);
                          }
                          if (decompiledFrameRemainder2) {
                            h.a((ke) null, (byte) 95);
                            wf.a(false);
                            var5 = lg.a(0, true);
                            if (1 == var5 ||
                              var5 == 2) {
                              gi.field_b = false;
                              stackIn_126_0 = kf.field_G;
                              stackIn_126_1 = param0 ^ -30662;
                              stackIn_127_2 = (var5 == 2);
                              ((ke) (Object) stackIn_126_0).c(stackIn_126_1, stackIn_127_2);
                            }
                            if (3 == var5) {
                              sm.a((byte) -65, se.h(25144));
                            }
                            decompiledFrameRemainder2 = (var9 != 0);
                          }
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        ca.field_wb.d(-8622);
                        decompiledFrameRemainder2 = (var9 != 0);
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      am.field_a.l((byte) 101);
                      decompiledFrameRemainder2 = (var9 != 0);
                    }
                  }
                  if (decompiledFrameRemainder2) {
                    cl.field_B.f((byte) -63);
                    decompiledFrameRemainder2 = (var9 != 0);
                  }
                }
                if (decompiledFrameRemainder2) {
                  h.field_d.j(-114);
                  decompiledFrameRemainder2 = (var9 != 0);
                }
              }
            }
            if (decompiledFrameRemainder2) {
              if (am.field_c) {
                if (uh.field_b) {
                  var3_int = 1;
                  if (kf.field_G == null &&
                    !ea.d((byte) 92)) {
                    stackIn_157_0 = 1;
                  } else {
                    stackIn_157_0 = 0;
                  }
                  var4 = stackIn_157_0;
                  decompiledFrameRemainder2 = (var9 != 0);
                }
                if (decompiledFrameRemainder2) {
                  var5Lifetime3 = kf.field_I.b(2, true) ? 1 : 0;
                  while (var5Lifetime3 == 0) {
                    stackIn_171_0 = ab.$cfr$intArgs$c$a284cb190b53(50);
                    if (var9 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_171_0) {
                      var5Lifetime3 = kf.field_I.e(false) ? 1 : 0;
                      continue;
                    }
                    break;
                  }
                  if ((decompiledFrameCompleted1) &&
                    (var9 != 0 &&
                    uh.field_b)) {
                    var3_int = 1;
                  }
                }
              } else {
                if (uh.field_b) {
                  var3_int = 1;
                }
              }
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_171_0 = uh.field_b;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_171_0 &&
            !mn.field_c &&
            !wk.field_i) {
            if (fm.field_b &&
              jg.field_i) {
              var3_int = 0;
            }
            ka.a(var3_int != 0, -3051);
            if (fa.field_n) {
              ce.field_C.b(2, var4 != 0);
            }
            if (fm.field_b) {
              ph.a(180, 320, false, var4 != 0);
              if (jg.field_i) {
                var4 = 0;
              }
              kf.field_I.b(2, var4 != 0);
            }
            while (ab.$cfr$intArgs$c$a284cb190b53(-123)) {
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != hh.field_a &&
                ef.field_N <= 0) {
                stackIn_208_0 = 0;
              } else {
                stackIn_208_0 = 1;
              }
              var5Lifetime1 = stackIn_208_0;
              if (fm.field_b) {
                var5Lifetime1 = nk.field_i ? 1 : 0;
              }
              if (fa.field_n) {
                var5Lifetime1 = og.field_ib ? 1 : 0;
              }
              boolean decompiledFrameRemainder4 = true;
              if (!param1) {
                if ((fm.field_b) &&
                  (decompiledFrameRemainder4 = !(!gd.a(13, 12, 15, (byte) -83)))) {
                  continue;
                }
                if ((decompiledFrameRemainder4) &&
                  (var5Lifetime1 != 0)) {
                  ig.a(12, 15, 13, (byte) 69);
                }
              }
              if (fa.field_n &&
                var4 != 0) {
                ce.field_C.e(false);
              }
              if (fm.field_b &&
                var4 != 0) {
                kf.field_I.e(false);
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (decompiledFrameRemainder1 = !(uh.field_b))) {
            gn.b(-29550);
          }
          if ((decompiledFrameRemainder1) &&
            (ab.e(param0 - 58860) == 0)) {
            we.a((byte) 68);
          }
          if (hh.field_a != null &&
            ef.field_N <= 0) {
            stackIn_255_0 = 0;
          } else {
            stackIn_255_0 = 1;
          }
          var5Lifetime2 = stackIn_255_0;
          if (fm.field_b) {
            var5Lifetime2 = nk.field_i ? 1 : 0;
          }
          if (fa.field_n) {
            var5Lifetime2 = og.field_ib ? 1 : 0;
          }
          if (var5Lifetime2 == 0) {
            if (!(ef.field_N <= 0)) {
              ef.field_N = ef.field_N - 1;
              if ((var9 != 0) &&
                (ef.field_N < dl.field_M)) {
                ef.field_N = ef.field_N + 1;
              }
            }
          } else {
            if (ef.field_N < dl.field_M) {
              ef.field_N = ef.field_N + 1;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var6 = dl.field_M * dl.field_M;
          var7 = -(ef.field_N * ef.field_N) + var6;
          var8 = ea.field_p + 120 * var7 / var6;
          ij.a(var8, -32);
          if (ue.field_b == hh.field_a &&
            ab.e(param0 - 58860) == 0) {
            if (am.field_c) {
              db.field_d = false;
              if (kf.field_I != null &&
                kf.field_I.field_hb < 38) {
                ue.field_b = dn.field_p[kf.field_I.field_g.field_l];
              }
              if (fa.field_n) {
                ue.field_b = dn.field_p[ce.field_C.field_g.field_l];
              }
              stackIn_298_0 = !(uh.field_b);
              wg.field_f = stackIn_298_0;
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (uh.field_b) {
                db.field_d = false;
                wg.field_f = false;
                ue.field_b = null;
                if (var9 != 0) {
                  db.field_d = true;
                  ue.field_b = tc.field_Tb;
                  wg.field_f = true;
                }
              } else {
                db.field_d = true;
                ue.field_b = tc.field_Tb;
                wg.field_f = true;
              }
            }
          }
          if (ue.field_b != hh.field_a) {
            vf.field_b = vf.field_b + 1;
            if (30 <= vf.field_b) {
              vf.field_b = 0;
              hh.field_a = ue.field_b;
              qd.field_Nb = wg.field_f;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "client.O(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        client.j((byte) -56);
        vd.c((byte) 101);
        vj.b((byte) 79);
        bj.a(112);
        km.c(710);
        n.b(128);
        ml.a((byte) -33);
        wh.a(true);
        jb.a((byte) -9);
        hn.b(6);
        oh.b(false);
        wg.a(true);
        hm.b(64);
        hk.a();
        ji.a(127);
        th.a(122);
        bb.a(-117);
        wl.d(8);
        ik.b(78);
        jh.a(false);
        fe.a((byte) -108);
        ge.a(true);
        dm.a(121);
        hc.a((byte) 82);
        o.a(false);
        l.b(126);
        u.a(23358);
        hl.a(-21128);
        pc.a((byte) -46);
        sh.a((byte) -105);
        lj.a(89);
        jf.a(-114);
        ie.a((byte) -120);
        eh.a(24744);
        cb.b(12623);
        ql.b(-100);
        ri.a((byte) -91);
        dd.b((byte) 115);
        im.a(0);
        ne.a((byte) 0);
        nh.a((byte) -73);
        qk.c(-11657);
        pl.b(113);
        en.f();
        ui.b(31158);
        ia.f();
        ke.l(126);
        qc.a(false);
        ah.a(8);
        gn.a(0);
        ul.b((byte) -75);
        lk.g(36);
        bh.b(25189);
        wa.a(18);
        ch.a(78);
        d.a(36);
        rc.a(-120);
        tm.a(103);
        j.a(true);
        w.f((byte) 77);
        ve.h((byte) 116);
        nk.a(-121);
        tj.e(-18263);
        gg.c(0);
        be.a(-106);
        vh.a(true);
        p.a(110);
        ed.b(-96);
        rg.a(-114);
        ka.h((byte) 102);
        wj.s(0);
        qn.n((byte) 89);
        ph.m((byte) 24);
        gk.p(15);
        tf.b(true);
        lg.f((byte) 1);
        he.i(0);
        cn.j(3);
        jg.b((byte) 101);
        c.a(23302);
        mc.a(0);
        ng.a(-61);
        je.b(23369);
        oa.b(-1);
        ad.a((byte) -67);
        lf.a(-13495);
        of.a((byte) 91);
        am.a(119);
        lc.a(-27983);
        mm.a();
        ub.b((byte) -32);
        nd.a(3);
        pd.a((byte) -120);
        h.b((byte) -128);
        uc.a(true);
        rn.a(-117);
        ll.a(108);
        qd.f(77);
        nm.g(48);
        ha.f(3);
        jd.e(32);
        gb.e(-2);
        s.i((byte) -94);
        pf.a((byte) -103);
        mg.f(256);
        ak.a((byte) -112);
        ec.a((byte) 102);
        sk.e(-28610);
        vk.a((byte) -93);
        ic.a(-18551);
        vf.a(27067);
        om.a(false);
        kb.a(-109);
        jk.a((byte) -91);
        hh.a(-9724);
        cc.a((byte) -94);
        e.a(-22811);
        pe.a(-1);
        fh.b(0);
        eb.b(92);
        oi.a(2);
        sa.c((byte) -82);
        uk.c(127);
        sl.a((byte) 110);
        uf.h((byte) 120);
        nn.a(14925);
        gf.a(2);
        v.a(-66);
        gh.a(98);
        fm.a(true);
        ee.a((byte) -78);
        hg.a((byte) 126);
        rf.a(false);
        in.a(123);
        vm.a(121);
        eg.a(10140);
        pm.a(62);
        mf.i(-17690);
        gd.a((byte) -118);
        ok.d();
        aj.b(0);
        bk.e(15338);
        qb.d(112);
        ab.d(1);
        pj.h((byte) 106);
        kh.b(-1643605936);
        el.b(true);
        le.b(true);
        hf.b(12741);
        ci.a(-27513);
        sf.f((byte) -126);
        pg.a((byte) 126);
        ib.m(-30);
        a.a(-1);
        qg.a();
        va.c();
        oj.a(3805);
        dh.a((byte) -68);
        vg.a((byte) 91);
        rm.a(2);
        fc.a(38);
        aa.a(true);
        li.a(101);
        dk.b(16057);
        un.b((byte) 86);
        oc.a(true);
        mk.a(false);
        if (param0 < 75) {
          return;
        }
        try {
          td.a();
          vl.a(true);
          kl.a(true);
          uj.a((byte) 111);
          mn.a(-117);
          kk.a((byte) -117);
          bc.b((byte) -102);
          al.a((byte) -100);
          qj.b((byte) 126);
          cf.a((byte) 126);
          ce.c(54);
          ma.e((byte) -79);
          t.l((byte) 94);
          bl.i(2);
          kf.h(116);
          rd.b((byte) -119);
          k.a(-5161);
          ih.b();
          ue.a((byte) -128);
          fl.a(29047);
          ga.a((byte) -52);
          cj.a(-48);
          ig.g((byte) 34);
          em.a((byte) 82);
          sm.a(30553);
          ac.g((byte) -17);
          me.c(0);
          la.a((byte) 92);
          fb.a((byte) 117);
          jj.a(false);
          we.b((byte) -37);
          db.a((byte) 91);
          dn.d(72);
          wf.f(-119);
          gi.a(79);
          dc.a(true);
          qe.a(-20007);
          kj.a();
          fj.a(25988);
          cg.a(124);
          bn.a((byte) 92);
          wd.a(1);
          de.g(-121);
          og.i((byte) 109);
          rk.j(81);
          ca.l(104);
          df.a(1);
          qi.f((byte) 117);
          g.a(-99);
          pa.h((byte) 47);
          dl.b(false);
          wm.c(18966);
          bg.a((byte) 22);
          md.f((byte) 106);
          ai.a(-59);
          b.a(-109);
          tc.h((byte) 105);
          hb.e(-102);
          da.a((byte) -121);
          rb.a(573767765);
          qf.c(119);
          pn.l(33);
          oe.b(true);
          vb.j(-20);
          ea.b((byte) -37);
          fn.b(0);
          mb.a(false);
          se.g(11344);
          id.c(true);
          si.e(0);
          uh.b((byte) 73);
          vi.f((byte) 46);
          qm.a(2);
          ua.e(8);
          sc.b(false);
          hj.a();
          wi.a(0);
          cm.a(1714134600);
          dg.a(8);
          kc.a(93);
          kn.a(-1);
          sg.a(3);
          ug.a(-21771);
          fk.c(8);
          on.a((byte) 6);
          di.c(87);
          gm.d(38);
          tg.a(false);
          ef.g(0);
          wb.e(-78);
          cl.c((byte) -39);
          pb.a((byte) 78);
          lb.a(-19893);
          f.c(30061);
          ki.c((byte) 22);
          sb.a(13820388);
          ff.a(-45);
          ta.a(false);
          um.a(0);
          bf.a(-73);
          af.a((byte) -47);
          cd.a((byte) 121);
          dj.b(true);
          wc.a(2);
          ij.a(-85);
          wk.c(7751);
          qa.e(-30349);
          ob.a((byte) 121);
          ln.a((byte) -89);
          hd.a(22771);
          fa.c((byte) -74);
          sn.a((byte) 86);
          nf.a(-120);
          jm.e(62);
          te.e(0);
          ii.e(9369);
          tl.g((byte) -68);
          kd.e(127);
          re.g((byte) -112);
          i.b(28180);
          pk.c(-59);
          tb.a(20908);
          ba.d((byte) 127);
          jc.a(true);
          this.field_m = null;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "client.J(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_27_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        boolean stackIn_117_1 = false;
        int stackIn_149_0 = 0;
        boolean stackIn_150_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var4Lifetime1;
        var9 = field_A ? 1 : 0;
        try {
          var2 = ne.d(-86);
          if (ta.a((byte) -56)) {
            jf.a(var2, cd.a(param0 ^ 8512), -6351);
            return;
          }
          if (!sh.field_j) {
            cn.a(true, var2);
            return;
          }
          if (!se.i(-1)) {
            qi.a(100.0f, -81, bg.field_c);
            cn.a(true, var2);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          qn.a(kd.field_t, qm.field_c, (byte) -109);
          if (kf.field_G == null &&
            !ea.d((byte) 111) && (!fm.field_b ||
            !jg.field_i)) {
            stackIn_27_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_27_0 = 0;
          }
          var3 = stackIn_27_0;
          if (0 == rb.field_e) {
            ca.field_kb = ak.field_d;
          }
          if (ca.field_kb <= 1) {
            jb.field_a = false;
            if (var9 != 0) {
              sg.field_b.a();
            }
          } else {
            sg.field_b.a();
          }
          while (true) {
            if (rb.field_e == 0) {
              ai.e((byte) 84);
            }
            if (kf.field_I != null) {
              kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
            }
            if (null != ce.field_C) {
              ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
            }
            if (1 < ca.field_kb) {
              rb.field_e = rb.field_e + 1;
              if (!jb.field_a &&
                ca.field_kb > rb.field_e) {
                continue;
              }
            }
            break;
          }
          if (1 < ca.field_kb) {
            if (rb.field_e >= ca.field_kb) {
              var4_ref_ck = pa.field_U;
              pa.field_U = sg.field_b;
              jb.field_a = true;
              rb.field_e = 0;
              sg.field_b = var4_ref_ck;
            }
            le.field_m.a((byte) -113);
            pa.field_U.e(0, 0);
          }
          if (null != kf.field_I) {
            kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
          }
          if (ce.field_C != null) {
            ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
          }
          if (!am.field_c &&
            !uh.field_b) {
            kf.field_G.a(false);
            var4 = 0;
            if (null != pd.field_d) {
              var4 = 1;
              pd.field_d.c((byte) -75);
            }
            if (h.field_d != null) {
              var4 = 1;
              h.field_d.h((byte) 99);
            }
            if (null != cl.field_B) {
              cl.field_B.b((byte) -48);
              var4 = 1;
            }
            if (null != am.field_a) {
              am.field_a.i(123);
              var4 = 1;
            }
            if (null != ca.field_wb) {
              ca.field_wb.d((byte) 45);
              var4 = 1;
            }
            if (f.field_s != null) {
              f.field_s.c(2);
              var4 = 1;
            }
            if (gi.field_b &&
              hh.field_a == ue.field_b &&
              var4 == 0) {
              pb.a(390);
            }
          }
          if (fm.field_b &&
            jg.field_i) {
            stackIn_107_0 = 1;
          } else {
            stackIn_107_0 = 0;
          }
          var4Lifetime1 = stackIn_107_0;
          stackIn_116_0 = 88;
          stackIn_117_1 = (var4Lifetime1 == 0) && (kf.field_G == null) && (cb.a((byte) -128));
          tf.$cfr$intArgs$a$7ffe4b125357(stackIn_116_0, stackIn_117_1);
          if (var4Lifetime1 != 0) {
            da.a(false, cb.a((byte) -128));
          }
          if (param0 != 320) {
            field_B = (String) null;
          }
          if ((am.field_c ||
            uh.field_b) &&
            kf.field_G != null) {
            hk.d(0, 0, 640, 480);
            kf.field_G.f(-26325);
            if (f.field_s != null) {
              f.field_s.c(2);
            }
          }
          if (cn.f((byte) 99)) {
            hk.a(320 - wk.b(3) / 2 - 34, -(pj.d(20) / 2) + 240 - 24, wk.b(3) + 68, pj.d(126) + 48, 0, 200);
            vk.a(pj.d(param0 - 356) + 60, (byte) 50, a.field_n, wk.b(3) + 80, 240 - pj.d(-5) / 2 - 30, 320 - wk.b(3) / 2 - 40);
            uh.b(32659);
          }
          if (!ai.f((byte) 94)) {
            if (pk.d(67)) {
              stackIn_149_0 = 112;
              if (cl.field_v != null) {
                stackIn_150_1 = true;
              } else {
                stackIn_150_1 = qc.field_N;
              }
              t.a(stackIn_149_0, stackIn_150_1);
              if (var9 != 0) {
                hk.a(-34 - vd.a(480) / 2 + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
                vk.a(dj.a(113) + 60, (byte) 50, a.field_n, 80 + vd.a(480), 210 - dj.a(108) / 2, 320 - (vd.a(param0 ^ 160) / 2 + 40));
                cl.a(true);
              }
            }
          } else {
            hk.a(-34 - vd.a(480) / 2 + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
            vk.a(dj.a(113) + 60, (byte) 50, a.field_n, 80 + vd.a(480), 210 - dj.a(108) / 2, 320 - (vd.a(param0 ^ 160) / 2 + 40));
            cl.a(true);
          }
          if (gb.field_Ob != gb.field_Vb) {
            var5_int = 256 * rf.field_f / 16;
            if (var5_int > 0) {
              hk.a(0, 0, hk.field_j, hk.field_i, 0, var5_int);
            }
          }
          if (2 <= te.field_p) {
            var5 = Runtime.getRuntime().totalMemory() / 1024L;
            var7 = -(Runtime.getRuntime().freeMemory() / 1024L) + var5;
            se.field_S.a("FPS: " + jf.field_c, 12, 38, 16777215, 1);
            se.field_S.a(var7 + "/" + var5 + " kB", 12, 52, 16777215, 1);
          }
          mf.a(1, 0, 0, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "client.F(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = field_A ? 1 : 0;
        try {
          var2_int = 0;
          do {
            if (8 <= var2_int) {
              this.i((byte) 51);
              var2_int = 0;
              break;
            }
            pg.field_a[var2_int] = false;
            ah.field_b[var2_int] = false;
            kd.field_s[0][var2_int] = 9 * kd.field_s[0][var2_int] / 10;
            kd.field_s[1][var2_int] = 9 * kd.field_s[1][var2_int] / 10;
            var2_int++;
          } while (var4 == 0);
          if (param0 != 11978) {
            return;
          }
          while (8 > var2_int) {
            if (var4 != 0) {
              return;
            }
            if (!pg.field_a[var2_int] &&
              wf.field_l[var2_int] != null) {
              wf.field_l[var2_int].f(0);
              if (!wf.field_l[var2_int].a((byte) 78)) {
                wf.field_l[var2_int] = null;
              }
            }
            if (!ah.field_b[var2_int] &&
              null != ik.field_c[var2_int]) {
              ik.field_c[var2_int].g(en.field_o / 50);
              ik.field_c[var2_int] = null;
            }
            if (sk.field_a[0][var2_int] != null) {
              var3 = kd.field_s[0][var2_int];
              if (0 == var3) {
                sk.field_a[0][var2_int].g(en.field_o / 50);
                sk.field_a[0][var2_int] = null;
              } else {
                sk.field_a[0][var2_int].e(en.field_o / 50, pb.field_d * var3);
              }
            }
            if (null != sk.field_a[1][var2_int]) {
              var3Lifetime1 = kd.field_s[1][var2_int];
              if (0 == var3Lifetime1) {
                sk.field_a[1][var2_int].g(en.field_o / 50);
                sk.field_a[1][var2_int] = null;
              } else {
                sk.field_a[1][var2_int].e(en.field_o / 50, var3Lifetime1 * pb.field_d);
              }
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.D(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        try {
          this.a(5, 94, 31, 0, 1, 12, 2, param0);
          en.a(22050, true, 10);
          km.field_z = en.a(lf.field_e, (java.awt.Component) ((Object) jh.field_b), 0, 22050);
          cj.field_b = en.a(lf.field_e, (java.awt.Component) ((Object) jh.field_b), 1, 1024);
          dg.field_c = new mi();
          cj.field_b.b(dg.field_c);
          sh.field_a = new mi();
          km.field_z.b(sh.field_a);
          this.a(false, true, true, false, true, true, false);
          mk.field_c[66] = 2;
          mk.field_c[74] = 1;
          mk.field_c[64] = -2;
          mk.field_c[68] = 1;
          mk.field_c[10] = -1;
          mk.field_c[70] = 1;
          mk.field_c[73] = 1;
          mk.field_c[58] = -2;
          mk.field_c[9] = -1;
          mk.field_c[62] = 2;
          mk.field_c[72] = 1;
          bc.field_D = hm.field_e;
          mk.field_c[71] = 1;
          mk.field_c[63] = -1;
          mk.field_c[59] = -2;
          mk.field_c[65] = 1;
          mk.field_c[75] = -1;
          mk.field_c[76] = 1;
          mk.field_c[69] = 1;
          ik.field_h = dj.field_T;
          uc.field_a = true;
          mg.field_Ob = fl.field_d;
          mk.field_c[61] = -2;
          mk.field_c[67] = -1;
          pa.field_U = new ck(640, 480);
          sg.field_b = new ck(640, 480);
          ak.field_d = 1;
          rb.field_e = 0;
          ca.field_kb = 1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "client.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, byte param6) {
        w dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        nm stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_5_4 = false;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        ve stackIn_18_0;
        w stackIn_18_1;
        w stackIn_18_2;
        long stackIn_18_3;
        w stackIn_19_1 = null;
        w stackIn_19_2 = null;
        w stackIn_19_4 = null;
        ve stackIn_43_0;
        w stackIn_43_1;
        w stackIn_43_2;
        long stackIn_43_3;
        w stackIn_44_1;
        w stackIn_44_2;
        w stackIn_44_4;
        int stackIn_49_0 = 0;
        int stackIn_125_0 = 0;
        ck[] stackIn_129_0 = null;
        int stackIn_140_0 = 0;
        ck[] stackIn_143_0 = null;
        int stackIn_144_1 = 0;
        ck[] stackIn_155_0 = null;
        int stackIn_156_1 = 0;
        String stackIn_230_0 = null;
        boolean stackIn_238_0 = false;
        String stackIn_251_0 = null;
        String stackIn_265_0 = null;
        String stackIn_273_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        vj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ve var12 = null;
        int var13 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        int var18_int = 0;
        w var18 = null;
        w var19 = null;
        w var20 = null;
        w var21 = null;
        int var22_int = 0;
        w var22 = null;
        w var23 = null;
        w var24 = null;
        w var25 = null;
        w var26 = null;
        w var27 = null;
        w var28 = null;
        w var29 = null;
        w var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        ck var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        ck[] stackIn_129_0Lifetime1;
        ck[] stackIn_143_0Lifetime1;
        ck[] stackIn_155_0Lifetime1;
        w var15Lifetime1;
        w var16Lifetime1;
        w var17Lifetime1;
        w var23Lifetime1;
        ck var35Lifetime1;
        ck var35Lifetime2;
        ck var35Lifetime3;
        ck var35Lifetime4;
        ck var35Lifetime1Lifetime1;
        ck var35Lifetime1Lifetime2;
        ck var35Lifetime1Lifetime3;
        ck var35Lifetime1Lifetime4;
        int stackIn_140_0Lifetime1;
        int stackIn_144_1Lifetime1;
        int stackIn_156_1Lifetime1;
        boolean stackIn_238_0Lifetime1;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        int var36Lifetime2;
        var41 = field_A ? 1 : 0;
        try {
          stackIn_4_0 = gf.field_c;
          stackIn_4_1 = 2 * (kf.field_O + 2);
          stackIn_4_2 = (kf.field_O * 4 + 8) * param0;
          stackIn_4_3 = -15230;
          stackIn_5_4 = (ki.field_w == gf.field_c);
          var7_int = ((nm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, 2, param2) ? 1 : 0;
          var8 = gf.field_c.field_Ob.field_M;
          if (param6 > -48) {
            client.j((byte) 82);
          }
          var9 = ik.a(4);
          var11 = null;
          var12 = (ve) (var8.c((byte) -101));
          while (null != var12) {
            var13 = 0;
            if (var41 != 0) {
              return;
            }
            if (null == var12.field_M) {
              stackIn_16_0 = param3;
              stackIn_16_1 = param1;
              while (true) {
                var14 = stackIn_16_0 | stackIn_16_1;
                var12.field_Pb = new w(0L, fc.field_f);
                var12.a(var12.field_Pb, -16834);
                var12.field_Pb.field_X = 1;
                var12.field_Bc = new w(0L, gg.field_G);
                var12.a(var12.field_Bc, -16834);
                var12.field_Dc = new w(0L, fc.field_f);
                var12.a(var12.field_Dc, -16834);
                var12.field_Dc.field_ub = 0;
                var12.field_ec = new w(0L, fc.field_f);
                var12.a(var12.field_ec, -16834);
                var12.field_ec.field_ub = 0;
                var12.field_jc = new w(0L, gg.field_G);
                var12.a(var12.field_jc, -16834);
                var12.field_jc.field_X = 2;
                stackIn_18_0 = var12;
                stackIn_18_1 = null;
                stackIn_18_2 = null;
                stackIn_18_3 = 0L;
                if (pd.field_a) {
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_4 = fc.field_f;
                } else {
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_4 = gg.field_G;
                }
                stackIn_18_0.field_zc = new w(stackIn_18_3, stackIn_19_4);
                var12.a(var12.field_zc, -16834);
                var12.field_fc = new w[j.field_b];
                var12.field_pc = new w(0L, (w) null);
                if ((var14 & 1 << u.field_f) != 0) {
                  var12.field_zc.a(var12.field_pc, -16834);
                }
                var12.field_Ac = new w(0L, (w) null);
                if ((var14 & 1 << u.field_b) != 0) {
                  var12.field_zc.a(var12.field_Ac, -16834);
                }
                var12.field_Tb = new w(0L, (w) null);
                if ((1 << rf.field_a & var14) != 0) {
                  var12.field_zc.a(var12.field_Tb, -16834);
                }
                var12.field_Fc = new w(0L, (w) null);
                if ((1 << ul.field_f & var14) != 0) {
                  var12.field_zc.a(var12.field_Fc, -16834);
                }
                var15 = var12.field_pc;
                var16 = var12.field_Fc;
                var12.field_Tb.field_W = 1;
                var17 = var12.field_Ac;
                var17.field_W = 1;
                var16.field_W = 1;
                var15.field_W = 1;
                var18_int = 0;
                while (j.field_b > var18_int) {
                  var12.field_fc[var18_int] = new w(0L, (w) null);
                  stackIn_16_0 = ~(1 << var18_int + um.field_a & var14);
                  stackIn_16_1 = -1;
                  if (stackIn_16_0 != stackIn_16_1) {
                    var12.field_zc.a(var12.field_fc[var18_int], -16834);
                  }
                  var12.field_fc[var18_int].field_W = 1;
                  var18_int++;
                }
                stackIn_43_0 = var12;
                stackIn_43_1 = null;
                stackIn_43_2 = null;
                stackIn_43_3 = 0L;
                if (!pd.field_a) {
                  stackIn_44_1 = null;
                  stackIn_44_2 = null;
                  stackIn_44_4 = fc.field_f;
                } else {
                  stackIn_44_1 = null;
                  stackIn_44_2 = null;
                  stackIn_44_4 = gg.field_G;
                }
                stackIn_43_0.field_yc = new w(stackIn_43_3, stackIn_44_4);
                var12.a(var12.field_yc, -16834);
                var12.field_yc.field_X = 2;
                var12.field_Sb = new w(0L, gg.field_G);
                var12.a(var12.field_Sb, -16834);
                var12.field_Ec = new w(0L, df.field_ab);
                var12.a(var12.field_Ec, -16834);
                var12.field_bc = new w(0L, df.field_ab);
                var12.a(var12.field_bc, -16834);
                var12.field_sc = new w(0L, ua.field_H);
                var12.a(var12.field_sc, -16834);
                var12.d(-69);
                var12.field_Yb = new w(0L, lj.field_c);
                var13 = 1;
                var12.a(var12.field_Yb, -16834);
                break;
              }
            }
            stackIn_49_0 = (var12.field_lc) ? param3 : param1;
            var14Lifetime1 = stackIn_49_0;
            var12.field_Pb.field_Y = null;
            var12.field_Pb.field_N = 0;
            var15Lifetime1 = var12.field_Pb;
            var15Lifetime1.field_mb = 0;
            var12.field_Yb.field_Y = null;
            var12.field_Yb.field_N = 0;
            var16Lifetime1 = var12.field_Yb;
            var16Lifetime1.field_mb = 0;
            var12.field_Bc.field_Y = null;
            var12.field_Bc.field_N = 0;
            var17Lifetime1 = var12.field_Bc;
            var17Lifetime1.field_mb = 0;
            var12.field_Dc.field_Y = null;
            var18 = var12.field_Dc;
            var12.field_Dc.field_N = 0;
            var18.field_mb = 0;
            var12.field_ec.field_Y = null;
            var19 = var12.field_ec;
            var12.field_ec.field_N = 0;
            var19.field_mb = 0;
            var12.field_jc.field_Y = null;
            var20 = var12.field_jc;
            var12.field_jc.field_N = 0;
            var12.field_zc.field_Y = null;
            var20.field_mb = 0;
            var12.field_zc.field_N = 0;
            var21 = var12.field_zc;
            var21.field_mb = 0;
            var22_int = 0;
            while (j.field_b > var22_int) {
              var12.field_fc[var22_int].field_I = null;
              var23 = var12.field_fc[var22_int];
              var12.field_fc[var22_int].field_N = 0;
              var23.field_mb = 0;
              var22_int++;
            }
            var12.field_pc.field_I = null;
            var12.field_pc.field_N = 0;
            var22 = var12.field_pc;
            var22.field_mb = 0;
            var12.field_Fc.field_I = null;
            var23Lifetime1 = var12.field_Fc;
            var12.field_Fc.field_N = 0;
            var12.field_Ac.field_I = null;
            var23Lifetime1.field_mb = 0;
            var24 = var12.field_Ac;
            var12.field_Ac.field_N = 0;
            var24.field_mb = 0;
            var12.field_Tb.field_I = null;
            var12.field_Tb.field_N = 0;
            var25 = var12.field_Tb;
            var25.field_mb = 0;
            var12.field_yc.field_Y = null;
            var12.field_yc.field_N = 0;
            var26 = var12.field_yc;
            var26.field_mb = 0;
            var12.field_Sb.field_Y = null;
            var12.field_Sb.field_N = 0;
            var27 = var12.field_Sb;
            var12.field_Ec.field_Y = null;
            var27.field_mb = 0;
            var12.field_Ec.field_N = 0;
            var28 = var12.field_Ec;
            var28.field_mb = 0;
            var12.field_bc.field_Y = null;
            var12.field_bc.field_N = 0;
            var29 = var12.field_bc;
            var12.field_sc.field_Y = null;
            var29.field_mb = 0;
            var12.field_sc.field_N = 0;
            var30 = var12.field_sc;
            var30.field_mb = 0;
            var12.field_mb = gf.field_c.field_Ob.field_mb;
            var31 = 0;
            var32 = var12.field_Vb;
            if (!var12.i((byte) 126)) {
              if (var12.field_lc) {
                if (var12.field_Nb >= 0) {
                  var12.field_Pb.field_Y = uf.field_t;
                } else if (!var12.field_wc ||
                  !var12.field_gc &&
                  !var12.field_Zb) {
                  if (var12.field_qc == 2) {
                    var12.field_Yb.field_Y = gd.field_h;
                  } else {
                    var12.field_Pb.field_Y = ak.field_i;
                  }
                } else {
                  var12.field_Yb.field_Y = gb.field_ac;
                }
              } else if (var12.field_gc ||
                var12.field_Zb) {
                var12.field_Yb.field_Y = gb.field_ac;
              } else if (var12.field_Cc) {
                var12.field_Pb.field_Y = cd.field_l;
              } else {
                var12.field_Pb.field_Y = pc.field_d;
              }
              if (null == var12.field_Yb.field_Y) {
                var12.field_Pb.a(68, 0, var31, kf.field_O, 0);
              } else {
                var12.field_Yb.a(68, 0, var31, kf.field_O, 0);
              }
              var12.field_Bc.field_Y = mm.a(var12.field_Bc.field_J, var32, 78);
              var12.field_Bc.a(78, 0, var31, kf.field_O, 70);
              if (var12.field_Bc.field_jb &&
                !var12.field_Bc.field_Y.equals(var32)) {
                sl.field_g = var32;
              }
              var12.field_Dc.field_Y = Integer.toString(var12.field_rc);
              if (var12.field_wc) {
                var12.field_Dc.field_X = 2;
                var12.field_ec.field_Y = "/" + var12.field_mc;
                var33_int = (-var12.field_ec.field_J.a("/") + 348) / 2;
                var12.field_Dc.a(var33_int - 150, 0, var31, kf.field_O, 150);
                var12.field_ec.a(198 - var33_int, 0, var31, kf.field_O, var33_int);
              } else {
                var12.field_Dc.field_X = 1;
                var12.field_Dc.a(48, 0, var31, kf.field_O, 150);
              }
              var12.field_jc.field_Y = Integer.toString(var12.field_Ub);
              var12.field_jc.a(48, 0, var31, kf.field_O, 200);
              stackIn_125_0 = (!pd.field_a) ? 200 : 250;
              L36: {
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameCompleted1 = true;
                var33_intLifetime1 = stackIn_125_0;
                var12.field_zc.a(-2 + (-var33_intLifetime1 + 365), 0, var31, kf.field_O, var33_intLifetime1);
                var34_int = j.field_c;
                if (0 == (var14Lifetime1 & 1 << u.field_f)) {
                  while (true) {
                    if (0 != (var14Lifetime1 & 1 << u.field_b)) {
                      if (!var12.field_gc &&
                        !var12.field_Zb) {
                        stackIn_140_0 = 0;
                      } else {
                        stackIn_140_0 = 1;
                      }
                      var36 = stackIn_140_0;
                      stackIn_143_0 = (ck[]) (field_x);
                      if (var36 == 0) {
                        stackIn_144_1 = 0;
                      } else {
                        stackIn_144_1 = 1;
                      }
                      var35 = stackIn_143_0[stackIn_144_1];
                      var12.field_Ac.field_I = var35;
                      var12.field_Ac.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (var35.field_K + j.field_c);
                    }
                    if ((1 << rf.field_a & var14Lifetime1) != 0) {
                      var35Lifetime2 = bb.field_b[-1 + var12.field_qc];
                      var12.field_Tb.field_I = var35Lifetime2;
                      var12.field_Tb.a(var35Lifetime2.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (j.field_c + var35Lifetime2.field_K);
                    }
                    if ((1 << ul.field_f & var14Lifetime1) != 0) {
                      stackIn_155_0 = si.field_d;
                      if (!var12.field_Ic) {
                        stackIn_156_1 = 0;
                      } else {
                        stackIn_156_1 = 1;
                      }
                      var35Lifetime3 = stackIn_155_0[stackIn_156_1];
                      var12.field_Fc.field_I = var35Lifetime3;
                      var12.field_Fc.a(var35Lifetime3.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (j.field_c + var35Lifetime3.field_K);
                    }
                    if (null == be.field_u) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    var36 = 0;
                    while (!(j.field_b <= var36)) {
                      stackIn_129_0 = be.field_u[var36];
                      if (stackIn_129_0 != null &&
                        (var14Lifetime1 & 1 << um.field_a + var36) != 0) {
                        var35Lifetime4 = be.field_u[var36][var12.field_kc[var36] & 255];
                        var12.field_fc[var36].field_I = var35Lifetime4;
                        var12.field_fc[var36].a(var35Lifetime4.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35Lifetime4.field_K + j.field_c);
                      }
                      var36++;
                    }
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  stackIn_129_0Lifetime1 = fj.field_a;
                  while (true) {
                    var35Lifetime1 = stackIn_129_0Lifetime1[var12.field_Wb];
                    var12.field_pc.field_I = var35Lifetime1;
                    var12.field_pc.a(var35Lifetime1.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (var35Lifetime1.field_K + j.field_c);
                    if (0 != (var14Lifetime1 & 1 << u.field_b)) {
                      if (!var12.field_gc &&
                        !var12.field_Zb) {
                        stackIn_140_0Lifetime1 = 0;
                      } else {
                        stackIn_140_0Lifetime1 = 1;
                      }
                      var36Lifetime2 = stackIn_140_0Lifetime1;
                      stackIn_143_0Lifetime1 = (ck[]) (field_x);
                      if (var36Lifetime2 == 0) {
                        stackIn_144_1Lifetime1 = 0;
                      } else {
                        stackIn_144_1Lifetime1 = 1;
                      }
                      var35Lifetime1Lifetime1 = stackIn_143_0Lifetime1[stackIn_144_1Lifetime1];
                      var12.field_Ac.field_I = var35Lifetime1Lifetime1;
                      var12.field_Ac.a(var35Lifetime1Lifetime1.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (var35Lifetime1Lifetime1.field_K + j.field_c);
                    }
                    if ((1 << rf.field_a & var14Lifetime1) != 0) {
                      var35Lifetime1Lifetime2 = bb.field_b[-1 + var12.field_qc];
                      var12.field_Tb.field_I = var35Lifetime1Lifetime2;
                      var12.field_Tb.a(var35Lifetime1Lifetime2.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (j.field_c + var35Lifetime1Lifetime2.field_K);
                    }
                    if ((1 << ul.field_f & var14Lifetime1) != 0) {
                      stackIn_155_0Lifetime1 = si.field_d;
                      if (!var12.field_Ic) {
                        stackIn_156_1Lifetime1 = 0;
                      } else {
                        stackIn_156_1Lifetime1 = 1;
                      }
                      var35Lifetime1Lifetime3 = stackIn_155_0Lifetime1[stackIn_156_1Lifetime1];
                      var12.field_Fc.field_I = var35Lifetime1Lifetime3;
                      var12.field_Fc.a(var35Lifetime1Lifetime3.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                      var34_int = var34_int + (j.field_c + var35Lifetime1Lifetime3.field_K);
                    }
                    if (null == be.field_u) {
                      break;
                    }
                    var36Lifetime2 = 0;
                    while (!(j.field_b <= var36Lifetime2)) {
                      stackIn_129_0Lifetime1 = be.field_u[var36Lifetime2];
                      if (stackIn_129_0Lifetime1 != null &&
                        (var14Lifetime1 & 1 << um.field_a + var36Lifetime2) != 0) {
                        var35Lifetime1Lifetime4 = be.field_u[var36Lifetime2][var12.field_kc[var36Lifetime2] & 255];
                        var12.field_fc[var36Lifetime2].field_I = var35Lifetime1Lifetime4;
                        var12.field_fc[var36Lifetime2].a(var35Lifetime1Lifetime4.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                        var34_int = var34_int + (var35Lifetime1Lifetime4.field_K + j.field_c);
                      }
                      var36Lifetime2++;
                    }
                    break;
                  }
                }
              }
              var36Lifetime1 = (-var34_int + var12.field_zc.field_mb) / 2;
              if (var36Lifetime1 > 0) {
                var12.field_pc.field_vb = var12.field_pc.field_vb + var36Lifetime1;
                var12.field_Ac.field_vb = var12.field_Ac.field_vb + var36Lifetime1;
                var12.field_Tb.field_vb = var12.field_Tb.field_vb + var36Lifetime1;
                var12.field_Fc.field_vb = var12.field_Fc.field_vb + var36Lifetime1;
                var37_int = 0;
                while (!(j.field_b <= var37_int)) {
                  dupTemp$0 = var12.field_fc[var37_int];
                  dupTemp$0.field_vb = dupTemp$0.field_vb + var36Lifetime1;
                  var37_int++;
                }
              }
              if (var12.field_lc) {
                var37_intLifetime1 = var12.field_Nb;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_tc);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 >= 60) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_yc.field_Y = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_yc.field_Y = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_yc.a(var12.field_mb - 365, 0, var31, kf.field_O, 365);
              var31 = var31 + kf.field_O;
              if (null != var12.field_xc) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(jg.field_c);
                discarded$2 = var37.append(var12.field_xc[0]);
                var38_intLifetime1 = 1;
                while (var38_intLifetime1 < var12.field_rc) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_xc[var38_intLifetime1]);
                  var38_intLifetime1++;
                }
                var38 = var37.toString();
                var12.field_Sb.field_Y = var38;
                var39Lifetime1 = var12.field_Sb.field_J.a(var38, var12.field_mb - 2 * var12.field_Sb.field_ub);
                var12.field_Sb.a(var12.field_mb, 0, var31, var39Lifetime1 * kf.field_O, 0);
                var31 = var31 + kf.field_O * var39Lifetime1;
              }
              if (var12.field_Zb) {
                var12.field_Ec.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(121, li.field_g, new String[]{var32});
                var12.field_Ec.a(-(2 * nk.field_b) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                var31 = var31 + kf.field_O;
              }
              if (var12.field_Ob) {
                var12.field_bc.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(106, qe.field_b, new String[]{var32});
                var12.field_bc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                var31 = var31 + kf.field_O;
              }
            }
            var33 = vk.a(var32, var12.field_oc, true);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_sc.field_J.a(var33, -nk.field_b + (var12.field_mb - nk.field_b));
              var12.field_sc.field_wb = var12.field_Rb * 256 / oa.field_a;
              var12.field_sc.field_Y = var33;
              var12.field_sc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, var34_intLifetime1 * kf.field_O, nk.field_b);
              var31 = var31 + kf.field_O * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_F = var31 - var12.field_N;
            }
            if (var13 != 0) {
              gf.field_c.field_Ob.a((w) (var11), var12, 2, 0);
            }
            var34_intLifetime2 = 0;
            while (var34_intLifetime2 < j.field_b) {
              stackIn_238_0 = var12.field_fc[var34_intLifetime2].field_jb;
              if (stackIn_238_0) {
                if (hb.field_Qb != null) {
                  if (null == hb.field_Qb[var34_intLifetime2]) {
                    stackIn_230_0 = null;
                  } else {
                    stackIn_230_0 = hb.field_Qb[var34_intLifetime2][var12.field_kc[var34_intLifetime2] & 255];
                  }
                } else {
                  stackIn_230_0 = null;
                }
                var35_ref = stackIn_230_0;
                if (var35_ref != null) {
                  sl.field_g = pa.field_db[var34_intLifetime2] + " - " + var35_ref;
                } else {
                  sl.field_g = pa.field_db[var34_intLifetime2];
                }
              }
              var34_intLifetime2++;
            }
            stackIn_238_0Lifetime1 = var12.field_pc.field_jb;
            if (stackIn_238_0Lifetime1) {
              if (var12.field_Wb != 1) {
                var34 = ed.field_b[var12.field_Wb];
              } else {
                var34 = bh.field_j;
              }
              sl.field_g = hl.field_c + " - " + var34;
            }
            if (var12.field_Fc.field_jb) {
              if (var12.field_Ic) {
                stackIn_251_0 = cl.field_s;
              } else {
                stackIn_251_0 = si.field_k;
              }
              sl.field_g = stackIn_251_0;
            }
            if (var12.field_Ac.field_jb) {
              if (!var12.field_gc &&
                !var12.field_Zb) {
                if (!var12.field_wc) {
                  stackIn_265_0 = ec.field_b;
                } else {
                  stackIn_265_0 = bh.field_c;
                }
              } else {
                stackIn_265_0 = wa.field_f;
              }
              sl.field_g = stackIn_265_0;
            }
            if (var12.field_Tb.field_jb) {
              if (var12.field_qc != 2) {
                stackIn_273_0 = bc.field_F;
              } else {
                stackIn_273_0 = tl.field_r;
              }
              sl.field_g = stackIn_273_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_ob != 0 &&
              !var12.i((byte) 100)) {
              if (var12.field_Yb.field_ob != 0) {
                if (!var12.field_lc ||
                  var12.field_wc &&
                  (var12.field_gc ||
                  var12.field_Zb)) {
                  cg.a(var12.e(-36), (byte) -9, param5);
                } else {
                  ga.a(false, var12.e(-87), param5);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                hd.a(0, param4, var12, var32);
              }
            }
            var12 = (ve) (var8.d(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "client.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final boolean n(int param0) {
        ck[] dupTemp$0 = null;
        ck[] dupTemp$1 = null;
        ck[] dupTemp$2 = null;
        ck[] dupTemp$3 = null;
        ck[] dupTemp$4 = null;
        ck[] dupTemp$5 = null;
        ck[] dupTemp$6 = null;
        ck[] dupTemp$7 = null;
        RuntimeException var2 = null;
        int var20 = 0;
        int stackIn_16_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_108_0 = 0;
        byte[] stackIn_113_0 = null;
        int stackIn_135_0 = 0;
        RuntimeException decompiledCaughtException = null;
        je var2_ref = null;
        pi[] var2_array = null;
        byte[] var3 = null;
        pi[] var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        ck var6 = null;
        Object var6_ref = null;
        pi var7 = null;
        ck[] var7_array = null;
        byte[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        ck var10 = null;
        ck[] var10_array = null;
        int var11_int = 0;
        ck[][] var11 = null;
        int var12_int = 0;
        ck var12 = null;
        ck[][] var12_array = null;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        byte[] var9Lifetime1;
        ck[] var10_arrayLifetime1;
        int var18Lifetime1;
        var20 = field_A ? 1 : 0;
        try {
          if (null != jj.field_c) {
            fh.b((byte) -123);
            qi.a(65.0f, param0 + 98, rf.field_p);
            this.d(320);
            ka.field_N = new pl(jj.field_c, ah.field_d);
            pg.field_d = ka.field_N.a("", "fruit_step", param0 ^ 0);
            field_F = ka.field_N.a("", "cooked_fruit_step", 0);
            ib.field_ob = ka.field_N.a("", "db_loose_shape_rotate", 0);
            bj.field_e = ka.field_N.a("", "db_loose_shape_land_squish", 0);
            fh.field_c = ka.field_N.a("", "db_group_shape_land", 0);
            hm.field_d = ka.field_N.a("", "fruit_move", 0);
            wd.field_c = ka.field_N.a("", "db_loose_tiles_pop", 0);
            sa.field_w = ka.field_N.a("", "db_solid_tiles_pop2", 0);
            jm.field_v[0] = ka.field_N.a("", "db_combo_1", 0);
            jm.field_v[1] = ka.field_N.a("", "db_combo_2", param0 + 0);
            jm.field_v[2] = ka.field_N.a("", "db_combo_3", qm.b(param0, 0));
            jm.field_v[3] = ka.field_N.a("", "db_combo_4", qm.b(param0, 0));
            bf.field_w = ka.field_N.a("", "db_simultaneous_bonus2", 0);
            ob.field_n = ka.field_N.a((byte) 101, "", "db_loose_drill");
            fj.field_k = ka.field_N.a((byte) 101, "", "db_bucket_water_capsule2");
            pk.field_q = ka.field_N.a("", "db_quake", param0 ^ 0);
            ee.field_g = ka.field_N.a("", "db_special_item_explode", param0 ^ 0);
            var2_ref = new je(22050, 11025);
            pk.field_q = pk.field_q.a(var2_ref);
            ee.field_g = ee.field_g.a(var2_ref);
            w.field_Eb = ka.field_N.a("", "db_poison", param0 ^ 0);
            qa.field_s = ka.field_N.a("", "db_glass_lower", 0);
            ha.field_Pb[2] = ka.field_N.a("", "db_bucket_glass_crack2_2", param0 + 0);
            ha.field_Pb[1] = ka.field_N.a("", "db_bucket_glass_crack3", param0 + 0);
            ha.field_Pb[0] = ka.field_N.a((byte) 101, "", "db_bucket_glass_explode");
            ie.field_e = ka.field_N.a("", "db_bucket_explode", 0);
            jg.field_j = ka.field_N.a("", "db_bucket_debris", 0);
            bf.field_u = ka.field_N.a("", "db_loose_shape_fall_looped", 0);
            rc.field_i = ka.field_N.a("", "db_loose_shape_fall_quake_looped", 0);
            ak.field_b = ka.field_N.a("", "db_suck_into_machine", 0);
            kf.field_P = ka.field_N.a("", "microwave_motor_2", 0);
            ul.field_i = ka.field_N.a("", "db_shape_out_of_machine2", param0 ^ 0);
            ig.field_ac = ka.field_N.a("", "db_last_shape_out", 0);
            jj.field_c = null;
            ah.field_d = null;
            vj.a(true);
            return false;
          }
          if (wg.field_h != null) {
            qi.a(75.0f, -96, v.field_b);
            this.d(320);
            jg.field_a = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Titlescreen");
            sb.field_u[0][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_NORMAL");
            sb.field_u[0][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_PANIC");
            sb.field_u[0][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_REALLY_PANIC");
            sb.field_u[0][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_FINISH_THEM");
            sb.field_u[1][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_NORMAL");
            sb.field_u[1][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_PANIC");
            sb.field_u[1][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_REALLY_PANIC");
            sb.field_u[1][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_FINISH_THEM");
            sb.field_u[2][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_NORMAL");
            sb.field_u[2][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_PANIC");
            sb.field_u[2][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_REALLY_PANIC");
            sb.field_u[2][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_FINISH_THEM");
            sb.field_u[6][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_NORMAL");
            sb.field_u[6][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_PANIC");
            sb.field_u[6][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_REALLY_PANIC");
            sb.field_u[6][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_FINISH_THEM");
            sb.field_u[7][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_NORMAL");
            sb.field_u[7][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_PANIC");
            sb.field_u[7][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_REALLY_PANIC");
            sb.field_u[7][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_FINISH_THEM");
            sb.field_u[4][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_NORMAL");
            sb.field_u[4][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_PANIC");
            sb.field_u[4][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_REALLY_PANIC");
            sb.field_u[4][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_FINISH_THEM");
            sb.field_u[3][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_NORMAL");
            sb.field_u[3][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_PANIC");
            sb.field_u[3][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_REALLY_PANIC");
            sb.field_u[3][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_FINISH_THEM");
            sb.field_u[5][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_NORMAL");
            sb.field_u[5][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_PANIC");
            sb.field_u[5][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_REALLY_PANIC");
            sb.field_u[5][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_FINISH_THEM");
            ee.field_a[0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_NORMAL");
            ee.field_a[1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_PANIC");
            ee.field_a[2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_REALLY_PANIC");
            ee.field_a[3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_FINISH_THEM");
            hb.field_Ub = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Win");
            rm.field_b = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Lose");
            wg.field_h = null;
            vj.a(true);
            return false;
          }
          if (null == ph.field_Db) {
            if (cl.field_y != null) {
              ge.a((byte) -93, new jk(cl.field_y.a(0, "huffman", "")));
              cl.field_y = null;
              vj.a(true);
              return false;
            }
            bj.a(320, on.field_e, eh.field_j, true, km.field_A, 20, param0, 4, 1, 20, 20, 20, a.field_n, 14, 480, 240, im.field_i, 32, 16, 0, 5);
            ie.a(on.field_e, km.field_A, a.field_n, 320, 20, 0, 32, 20, 240, 4, 5, 20, eh.field_j, im.field_i, 1, 14, 10406, 0, 16, 20);
            kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
            bd.a(50, -27096);
            le.a((byte) 86, 50);
            af.a(param0 + 4, 50);
            nn.a(256, jg.field_a, true);
            vj.a(true);
            return true;
          }
          qi.a(90.0f, 96, vd.field_o);
          this.d(320);
          se.field_S = cd.a("", qc.field_vb, ah.field_i, (byte) 108, "arial13");
          var2_array = t.a("", ah.field_i, false, "arialbold14");
          var3 = qc.field_vb.a(0, "", "arialbold14");
          w.field_kb = gg.a(var2_array, 55, var3);
          km.field_A = ge.a((byte) -49, 16777215, 1, var2_array, var3, 1);
          var4 = t.a("tinybloko", ii.field_t, false, "");
          var5 = ph.field_Db.a(param0 ^ 0, "tinybloko", "");
          in.field_n = gg.a(var4, param0 ^ 111, var5);
          var6_int = 0;
          while (true) {
            stackIn_16_0 = ~var4.length;
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_16_0 < ~var6_int) {
              var7 = var4[var6_int];
              var8 = new byte[4 * (var7.field_i * var7.field_b)];
              stackIn_31_0 = 0;
              decompiledFrameRemainder2 = (var20 == 0);
              if (decompiledFrameRemainder2) {
                var9_int = stackIn_31_0;
                while (var9_int < var7.field_i) {
                  stackIn_16_0 = 0;
                  var10_int = stackIn_16_0;
                  while (var7.field_b > var10_int) {
                    var11_int = var7.field_k[var7.field_b * var9_int + var10_int];
                    var12_int = 2 * var10_int + 4 * var7.field_b * var9_int;
                    var8[var12_int] = (byte) var11_int;
                    var8[1 + var12_int] = (byte) var11_int;
                    var8[var12_int + 2 * var7.field_b] = (byte) var11_int;
                    var8[var7.field_b * 2 + var12_int + 1] = (byte) var11_int;
                    var10_int++;
                  }
                  var9_int++;
                }
                var7.field_d = var7.field_d * 2;
                var7.field_g = var7.field_g * 2;
                var7.field_a = var7.field_a * 2;
                var7.field_b = var7.field_b * 2;
                var7.field_i = var7.field_i * 2;
                var7.field_k = var8;
                var7.field_c = var7.field_c * 2;
                var6_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder2) {
              stackIn_31_0 = 0;
            }
            var6_int = stackIn_31_0;
            do {
              if (var6_int >= var5.length) {
                a.field_t = gg.a(var4, param0 ^ 103, var5);
                eh.field_j = ge.a((byte) 100, 16694016, 2, var4, var5, 1);
                eh.field_j.field_X[1] = new int[]{0, 16777215, 1};
                break;
              }
              var5[var6_int] = (byte)(var5[var6_int] * 2);
              var6_int++;
            } while (var20 == 0);
            var6_int = 0;
            while (true) {
              stackIn_40_0 = ~var6_int;
              boolean decompiledFrameRemainder1 = true;
              if (stackIn_40_0 > ~var4.length) {
                var7 = var4[var6_int];
                var8 = new byte[var7.field_b * var7.field_i * 9 / 4];
                stackIn_55_0 = 0;
                decompiledFrameRemainder1 = (var20 == 0);
                if (decompiledFrameRemainder1) {
                  var9_int = stackIn_55_0;
                  while (var7.field_i > var9_int) {
                    stackIn_40_0 = 0;
                    var10_int = stackIn_40_0;
                    while (var10_int < var7.field_b) {
                      var11_int = var7.field_k[var10_int + var7.field_b * var9_int];
                      var12_int = var7.field_b * (var9_int * 9) / 4 + 3 * var10_int / 2;
                      var8[var12_int] = (byte) var11_int;
                      var8[1 + var12_int] = (byte) var11_int;
                      var8[2 + var12_int] = (byte) var11_int;
                      var8[var12_int + 3 * var7.field_b / 2] = (byte) var11_int;
                      var8[1 + var12_int + var7.field_b * 3 / 2] = (byte) var11_int;
                      var8[2 + (var12_int + 3 * var7.field_b / 2)] = (byte) var11_int;
                      var8[var12_int + 3 * var7.field_b] = (byte) var11_int;
                      var8[var12_int + 3 * var7.field_b + 1] = (byte) var11_int;
                      var8[var12_int + (3 * var7.field_b + 2)] = (byte) var11_int;
                      var10_int += 2;
                    }
                    var9_int += 2;
                  }
                  var7.field_d = 3 * var7.field_d / 2;
                  var7.field_i = var7.field_i * 3 / 2;
                  var7.field_k = var8;
                  var7.field_c = var7.field_c * 3 / 2;
                  var7.field_g = var7.field_g * 3 / 2;
                  var7.field_b = var7.field_b * 3 / 2;
                  var7.field_a = var7.field_a * 3 / 2;
                  var6_int++;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_55_0 = 0;
              }
              var6_int = stackIn_55_0;
              do {
                if (var5.length <= var6_int) {
                  hn.field_g = gg.a(var4, 121, var5);
                  a.field_n = db.a("ui_frame_vbrick", "ui_frame_hbrick", ii.field_t, true, "ui_frame_corner");
                  on.field_e = ek.a("ui_button_up", "", param0 ^ -95, ii.field_t);
                  im.field_i = ek.a("ui_button_highlight", "", -114, ii.field_t);
                  ce.field_s = bj.a(112, ii.field_t, "", "chat_toggle_button");
                  gd.field_g = bj.a(112, ii.field_t, "", "chat_toggle_button_highlight");
                  vg.field_h = id.a(ah.field_i, "unachieved", "basic", 8192);
                  wg.field_c = id.a(ah.field_i, "locked", "basic", param0 + 8192);
                  db.field_f = new ck(32, 32);
                  db.field_f.a();
                  vg.field_h.a(0, 0, 32, 32);
                  gf.field_a = new ck(32, 32);
                  gf.field_a.a();
                  wg.field_c.a(0, 0, 32, 32);
                  le.field_m.a((byte) -84);
                  break;
                }
                var5[var6_int] = (byte)(var5[var6_int] * 3 / 2);
                var6_int++;
              } while (var20 == 0);
              var6 = id.a(ah.field_i, "orbcoin", "basic", 8192);
              rn.field_c = new ck(20, 20);
              rn.field_c.a();
              var6.a(0, 0, 20, 20);
              le.field_m.a((byte) -106);
              var6_ref = null;
              gf.field_f = t.a("solid_mask", ii.field_t, false, "");
              oa.field_b = bj.a(112, ii.field_t, "", "pop");
              qf.field_h = si.a(param0 ^ 25972, false, bj.a(112, ii.field_t, "", "explode"), false);
              qm.field_c = me.a(id.a(ii.field_t, "wildcard", "", 8192), false, (byte) -28, false);
              kd.field_t = qm.field_c.c();
              var7_array = bj.a(112, ii.field_t, "", "specialitems");
              var8_int = 0;
              L24: while (true) {
                if (var8_int < 6) {
                  stackIn_74_0 = 0;
                  if (var20 != 0) {
                    break L24;
                  }
                  var9_int = stackIn_74_0;
                  while (4 > var9_int) {
                    ik.field_b[var8_int][var9_int] = me.a(var7_array[var8_int * 4 + var9_int], false, (byte) -55, false);
                    var9_int++;
                  }
                  var8_int++;
                  continue L24;
                }
                stackIn_74_0 = 0;
                break;
              }
              var8_int = stackIn_74_0;
              while (true) {
                stackIn_76_0 = ~var8_int;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_76_0 > -9) {
                  var7_array = bj.a(param0 + 112, ii.field_t, "", ri.field_f[var8_int] + "_tiles");
                  stackIn_108_0 = 0;
                  decompiledFrameRemainder0 = (var20 == 0);
                  if (decompiledFrameRemainder0) {
                    var9_int = stackIn_108_0;
                    while (7 > var9_int) {
                      fb.field_c[var8_int][var9_int] = me.a(var7_array[var9_int], false, (byte) -63, false);
                      var9_int++;
                    }
                    fb.field_c[var8_int][7] = kd.field_t;
                    var9_int = 0;
                    L37: while (true) {
                      stackIn_87_0 = -8;
                      if (stackIn_87_0 < ~var9_int) {
                        var10 = me.a(var7_array[var9_int + 7], true, (byte) -124, true);
                        stackIn_76_0 = 0;
                        var11_int = stackIn_76_0;
                        L40: while (true) {
                          stackIn_91_0 = -17;
                          stackIn_91_1 = ~var11_int;
                          if (stackIn_91_0 < stackIn_91_1) {
                            var12 = var10.c();
                            var12.a();
                            fb.field_c[var8_int][var9_int].b(6, 6, 24, 24);
                            var10.c(0, 0, 128);
                            var13 = gf.field_f[var11_int];
                            stackIn_87_0 = 0;
                            var14 = stackIn_87_0;
                            while (1296 > var14) {
                              var15 = var13.field_l[var13.field_k[var14] & 255] & 255;
                              var16 = var12.field_D[var14];
                              stackIn_91_0 = var15;
                              stackIn_91_1 = 128;
                              if (stackIn_91_0 > stackIn_91_1) {
                                var17 = 131586 * (var15 - 128);
                                var18 = var16;
                                var19 = var18 + var17;
                                var17 = (16711935 & var18) + (16711935 & var17);
                                var18Lifetime1 = (-var17 + var19 & 65536) + (16777472 & var17);
                                var16 = var19 - var18Lifetime1 | var18Lifetime1 - (var18Lifetime1 >>> 8);
                              } else {
                                var16 = ((var16 & 16711935) * var15 >> 7 & 16711935) + (((65280 & var16) * var15 & 8355876) >> 7);
                              }
                              if (var16 == 0) {
                                var16 = 1;
                              }
                              var12.field_D[var14] = var16;
                              var14++;
                            }
                            ob.field_j[var8_int][var9_int][var11_int] = var12;
                            var11_int++;
                            continue L40;
                          }
                          break;
                        }
                        var9_int++;
                        continue L37;
                      }
                      break;
                    }
                    s.field_Qb[var8_int] = id.a(ii.field_t, ri.field_f[var8_int] + "_bucketback", "", 8192);
                    s.field_Qb[var8_int].b();
                    var8_int++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  le.field_m.a((byte) -114);
                  stackIn_108_0 = 0;
                }
                var8_int = stackIn_108_0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (8 <= var8_int))) {
                  stackIn_113_0 = eg.field_e.a(param0 + 0, "", ri.field_f[var8_int] + ".jpg");
                  if (var20 == 0) {
                    var9 = stackIn_113_0;
                    dn.field_p[var8_int] = new ck(var9, (java.awt.Component) ((Object) jh.field_b));
                    var8_int++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_113_0 = eg.field_e.a(param0 + 0, "", "menu2.jpg");
                }
                var8 = stackIn_113_0;
                tc.field_Tb = new ck(var8, (java.awt.Component) ((Object) jh.field_b));
                var9Lifetime1 = eg.field_e.a(0, "", "achievements.jpg");
                uf.field_y = fc.a(31, new ck(var9Lifetime1, (java.awt.Component) ((Object) jh.field_b)), -10241);
                var10_array = bj.a(112, ii.field_t, "", "achievements");
                var11_int = 0;
                while (var11_int < 31) {
                  var10_array[var11_int].b();
                  mg.a(0, var10_array[var11_int], uf.field_y[var11_int]);
                  var10_array[var11_int] = null;
                  var11_int++;
                  if (var20 == 0) {
                    continue;
                  }
                  break;
                }
                var10_arrayLifetime1 = null;
                tl.field_w = new ck[31];
                var11_int = 0;
                do {
                  if (var11_int >= 31) {
                    le.field_m.a((byte) -108);
                    pg.field_e = id.a(ii.field_t, "ui_clouds", "", 8192);
                    dk.field_h = id.a(ii.field_t, "ui_border_tl", "", 8192);
                    jh.field_d = id.a(ii.field_t, "ui_border_t", "", 8192);
                    sk.field_g = id.a(ii.field_t, "ui_border_tr", "", 8192);
                    fl.field_f = id.a(ii.field_t, "ui_border_l", "", param0 ^ 8192);
                    wm.field_n = id.a(ii.field_t, "ui_border_r", "", 8192);
                    vg.field_x = id.a(ii.field_t, "ui_border_bl", "", 8192);
                    pg.field_f = id.a(ii.field_t, "ui_border_b", "", 8192);
                    wc.field_r = id.a(ii.field_t, "ui_border_br", "", param0 ^ 8192);
                    wk.field_l = id.a(ii.field_t, "ui_menu_title", "", 8192);
                    ve.field_dc = id.a(ii.field_t, "ui_lobby_logo", "", 8192);
                    ij.field_d = mg.a(16776192, 16743168, ul.field_b, in.field_n, 6, 0, (byte) 107);
                    wh.field_f = mg.a(16776192, 16743168, ak.field_e, in.field_n, 6, 0, (byte) 120);
                    field_C[0] = mg.a(16776192, 16743168, mf.field_P, in.field_n, 6, 0, (byte) 120);
                    field_C[1] = mg.a(16776192, 16743168, qf.field_k, in.field_n, 6, 0, (byte) 114);
                    field_C[2] = mg.a(16776192, 16743168, ad.field_z, in.field_n, 6, 0, (byte) 104);
                    ng.field_b = mg.a(16776192, 16743168, de.field_P, in.field_n, 6, 0, (byte) 102);
                    l.field_j = mg.a(16776192, 16743168, im.field_g, in.field_n, 6, 0, (byte) 99);
                    ad.field_g = mg.a(16776192, 16743168, u.field_g, in.field_n, 6, 0, (byte) 88);
                    ve.field_uc[0] = bj.a(112, ii.field_t, "", "fruit_buckettop");
                    uj.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_lefttex"), true);
                    bb.field_a[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_leftsidetex"), true);
                    cc.field_f[0] = t.a("fruit_leftmask", ii.field_t, false, "");
                    rb.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_righttex"), true);
                    dg.field_d[0] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "fruit_rightsidetex"), true);
                    sc.field_j[0] = t.a("fruit_rightmask", ii.field_t, false, "");
                    ad.field_j[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_bottomtex"), true);
                    fk.field_G[0] = t.a("fruit_bottommask", ii.field_t, false, "");
                    ve.field_uc[1] = bj.a(112, ii.field_t, "", "animals_buckettop");
                    dupTemp$0 = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                    rb.field_j[1] = dupTemp$0;
                    hf.field_e[1] = dupTemp$0;
                    bh.field_d[1] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "animals_bottomspecial"), false);
                    fk.field_G[1] = t.a("animals_bottommask", ii.field_t, false, "");
                    ve.field_uc[2] = bj.a(112, ii.field_t, "", "breakfast_buckettop");
                    uj.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_lefttex"), true);
                    bb.field_a[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_leftsidetex"), true);
                    cc.field_f[2] = t.a("breakfast_leftmask", ii.field_t, false, "");
                    rb.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_righttex"), true);
                    dg.field_d[2] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "breakfast_rightsidetex"), true);
                    sc.field_j[2] = t.a("breakfast_rightmask", ii.field_t, false, "");
                    ad.field_j[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_bottomtex"), true);
                    fk.field_G[2] = t.a("breakfast_bottommask", ii.field_t, false, "");
                    ve.field_uc[3] = bj.a(112, ii.field_t, "", "bugs_buckettop");
                    dupTemp$1 = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                    rb.field_j[3] = dupTemp$1;
                    hf.field_e[3] = dupTemp$1;
                    bh.field_d[3] = si.a(qm.b(param0, 25972), true, bj.a(param0 + 112, ii.field_t, "", "bugs_bottomspecial"), false);
                    fk.field_G[3] = t.a("bugs_bottommask", ii.field_t, false, "");
                    ve.field_uc[4] = bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_buckettop");
                    uj.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_lefttex"), true);
                    bb.field_a[4] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_leftsidetex"), true);
                    cc.field_f[4] = t.a("flowers_leftmask", ii.field_t, false, "");
                    rb.field_d[4] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "flowers_righttex"), true);
                    dg.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_rightsidetex"), true);
                    sc.field_j[4] = t.a("flowers_rightmask", ii.field_t, false, "");
                    ad.field_j[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_bottomtex"), true);
                    fk.field_G[4] = t.a("flowers_bottommask", ii.field_t, false, "");
                    ve.field_uc[5] = bj.a(112, ii.field_t, "", "undersea_buckettop");
                    dupTemp$2 = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                    rb.field_j[5] = dupTemp$2;
                    hf.field_e[5] = dupTemp$2;
                    bh.field_d[5] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "undersea_bottomspecial"), false);
                    fk.field_G[5] = t.a("undersea_bottommask", ii.field_t, false, "");
                    ve.field_uc[6] = bj.a(112, ii.field_t, "", "city_buckettop");
                    uj.field_d[6] = si.a(param0 + 25972, true, bj.a(param0 + 112, ii.field_t, "", "city_lefttex"), true);
                    bb.field_a[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_leftsidetex"), true);
                    cc.field_f[6] = t.a("city_leftmask", ii.field_t, false, "");
                    rb.field_d[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_righttex"), true);
                    dg.field_d[6] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "city_rightsidetex"), true);
                    sc.field_j[6] = t.a("city_rightmask", ii.field_t, false, "");
                    ad.field_j[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_bottomtex"), true);
                    fk.field_G[6] = t.a("city_bottommask", ii.field_t, false, "");
                    ve.field_uc[7] = bj.a(112, ii.field_t, "", "eightbit_buckettop");
                    uj.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_lefttex"), true);
                    bb.field_a[7] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "eightbit_leftsidetex"), true);
                    cc.field_f[7] = t.a("eightbit_leftmask", ii.field_t, false, "");
                    rb.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_righttex"), true);
                    dg.field_d[7] = si.a(qm.b(param0, 25972), true, bj.a(qm.b(param0, 112), ii.field_t, "", "eightbit_rightsidetex"), true);
                    sc.field_j[7] = t.a("eightbit_rightmask", ii.field_t, false, "");
                    ad.field_j[7] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "eightbit_bottomtex"), true);
                    fk.field_G[7] = t.a("eightbit_bottommask", ii.field_t, false, "");
                    break;
                  }
                  tl.field_w[var11_int] = new ck(32, 32);
                  tl.field_w[var11_int].a();
                  uf.field_y[var11_int].a(0, 0, 32, 32);
                  var11_int++;
                } while (var20 == 0);
                var11_int = 0;
                L56: while (true) {
                  if (var11_int < 8) {
                    on.a(uj.field_d[var11_int], 19264);
                    on.a(rb.field_d[var11_int], param0 + 19264);
                    on.a(ad.field_j[var11_int], 19264);
                    uh.a(cc.field_f[var11_int], (byte) 115);
                    uh.a(sc.field_j[var11_int], (byte) -118);
                    uh.a(fk.field_G[var11_int], (byte) 114);
                    stackIn_135_0 = 0;
                    if (var20 != 0) {
                      break L56;
                    }
                    var12_int = stackIn_135_0;
                    while (var12_int < ve.field_uc[var11_int].length) {
                      ve.field_uc[var11_int][var12_int].b();
                      var12_int++;
                    }
                    var11_int++;
                    continue L56;
                  }
                  uf.field_w = id.a(ii.field_t, "machine_buttons1", "", 8192);
                  bn.field_e = id.a(ii.field_t, "machine_front", "", param0 ^ 8192);
                  cd.field_k = id.a(ii.field_t, "machine_glass", "", 8192);
                  e.field_b = id.a(ii.field_t, "machine_glasslit", "", param0 ^ 8192);
                  ca.field_qb = id.a(ii.field_t, "machine_lights1", "", 8192);
                  ln.field_c = id.a(ii.field_t, "machine_mouth", "", 8192);
                  aa.field_e = id.a(ii.field_t, "machine_next", "", param0 + 8192);
                  jc.field_f = id.a(ii.field_t, "machine_nextlit", "", 8192);
                  bb.field_c = id.a(ii.field_t, "machine_pipe", "", 8192);
                  u.field_h = id.a(ii.field_t, "machine_portal", "", param0 + 8192);
                  bc.field_J = id.a(ii.field_t, "blobmatch_scorecols", "", 8192).field_D;
                  a.field_u = id.a(ii.field_t, "eliminatetile_scorecols", "", param0 ^ 8192).field_D;
                  jg.field_f = id.a(ii.field_t, "simultaneous_scorecols", "", 8192).field_D;
                  nf.field_f = id.a(ii.field_t, "chain_scorecols", "", 8192).field_D;
                  oh.field_c = id.a(ii.field_t, "bomb_scorecols", "", param0 ^ 8192).field_D;
                  vl.field_G = id.a(ii.field_t, "bombardmessagecols", "", 8192).field_D;
                  ph.field_yb = bj.a(112, ii.field_t, "", "instructions_keys");
                  ma.field_K = id.a(ii.field_t, "instructions_arrow", "", 8192);
                  aj.field_c = id.a(ii.field_t, "instructions_inmultiplayer", "", 8192);
                  li.field_i = id.a(ii.field_t, "instructions_insingleplayer", "", param0 + 8192);
                  stackIn_135_0 = 5;
                  break;
                }
                var11 = new ck[stackIn_135_0][];
                var12_array = new ck[5][];
                dupTemp$3 = bj.a(112, ii.field_t, "", "bucketsize_icons");
                var12_array[0] = dupTemp$3;
                var11[0] = dupTemp$3;
                dupTemp$4 = bj.a(112, ii.field_t, "", "speed_icons");
                var12_array[1] = dupTemp$4;
                var11[1] = dupTemp$4;
                dupTemp$5 = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                var12_array[4] = dupTemp$5;
                var11[4] = dupTemp$5;
                lf.field_h = dupTemp$5;
                dupTemp$6 = bj.a(112, ii.field_t, "", "colours_icons");
                var12_array[2] = dupTemp$6;
                var11[2] = dupTemp$6;
                dupTemp$7 = bj.a(112, ii.field_t, "", "specialitems_icons");
                var12_array[3] = dupTemp$7;
                var11[3] = dupTemp$7;
                bg.a(vl.field_A, nd.field_a, si.field_f, pf.field_d, 8, qd.field_Pb, ah.field_i, 5, 25150, qc.field_vb, var11, var12_array, true, vb.field_S, tg.field_d);
                gm.a(-3504, 200);
                qf.a(ah.field_i, qc.field_vb, -96);
                rf.a(ac.field_z, 0, 180, -94, 16694016, (java.applet.Applet) (this));
                qc.field_vb = null;
                ph.field_Db = null;
                vj.a(true);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.T(" + param0 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 79) {
            client.a((String) null, -100);
          }
          if (null != param1 &&
            param1.length() >= mc.field_f &&
            param1.length() <= dn.field_r) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("client.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.a(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "client.init()");
        }
    }

    static {
        field_D = new byte[65536];
        an.a(field_D, 0, 65536, (byte) -128);
        field_E = "Theme <%0> strategy";
        field_y = "Show all private chat";
        field_C = new ck[3];
        field_B = "Use this alternative as your account name";
    }
}
