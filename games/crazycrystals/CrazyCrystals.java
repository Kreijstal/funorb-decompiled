/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class CrazyCrystals extends eb {
    static String field_C;
    static int field_D;
    public static int field_B;

    public final void init() {
        try {
          this.a(-1, "crazycrystals", 14);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "CrazyCrystals.init()");
        }
    }

    private final void g(byte param0) {
        uc stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_191_0 = 0;
        boolean stackIn_348_0 = false;
        int stackIn_355_0 = 0;
        boolean stackIn_358_0 = false;
        int stackIn_376_0 = 0;
        f[] stackIn_411_0 = null;
        int stackIn_412_1 = 0;
        boolean stackIn_443_0 = false;
        int stackIn_456_0 = 0;
        int stackIn_456_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_347_0;
        boolean stackOut_357_0;
        int var2_int = 0;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var3 = 0;
        we var3_ref_we = null;
        double var4_double = 0.0;
        int var4 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        double var14_double = 0.0;
        nj var14 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        var20 = field_B;
        try {
          if (null != uh.field_p) {
            while (true) {
              if (ge.b(-92)) {
                stackIn_16_0 = uh.field_p;
                stackIn_16_1 = 75;
                if (var20 == 0) {
                  if (!((uc) (Object) stackIn_16_0).b((byte) stackIn_16_1)) {
                    continue;
                  }
                  this.a(true);
                  return;
                }
                break;
              }
              stackIn_16_0 = uh.field_p;
              stackIn_16_1 = 1;
              break;
            }
            ((uc) (Object) stackIn_16_0).a(stackIn_16_1 != 0);
            return;
          }
          fe.b(42806);
          if (!uh.field_n) {
            if (null != ab.field_D) {
              ab.field_D = ab.field_D.b((byte) -39);
              if (!r.field_m) {
                gh.i(127);
                this.a(true);
                return;
              }
            }
            while (true) {
              if (!ge.b(-45)) {
                if (cp.field_k[vf.field_c] &&
                  !lb.field_k &&
                  qh.field_o.isEmpty() &&
                  en.field_O == 0 &&
                  cn.field_d == null) {
                  lb.field_k = true;
                  stackIn_81_0 = !(qp.field_f);
                  qp.field_f = stackIn_81_0;
                }
                if (qp.field_f) {
                  if (mo.field_f >= 12) {
                    break;
                  }
                  mo.field_f = mo.field_f + 1;
                  if (var20 == 0) {
                    break;
                  }
                }
                stackIn_91_0 = ~mo.field_f;
                stackIn_91_1 = -1;
              } else {
                var2_int = pj.field_q;
                stackIn_91_0 = ~var2_int;
                stackIn_91_1 = -86;
                if (var20 == 0) {
                  L9: {
                    if (stackIn_91_0 != stackIn_91_1) {
                      switch (var2_int) {
                        case 80:
                          continue;
                        case 13:
                          break L9;
                        default:
                          continue;
                        case 84:
                          break;
                      }
                    } else {
                      if (ab.field_D instanceof ja) {
                        continue;
                      }
                      hc.a(false, false);
                      continue;
                    }
                    if (li.field_a == null) {
                      continue;
                    }
                    li.field_a = li.field_a.b((byte) -108);
                    continue;
                  }
                  gh.i(127);
                  if (!(ab.field_D instanceof ja)) {
                    uh.field_p = (uc) ((Object) new p(false));
                  } else {
                    ((ja) (ab.field_D)).c((byte) -41);
                    ab.field_D = null;
                  }
                  this.a(true);
                  return;
                }
              }
              if (stackIn_91_0 >= stackIn_91_1) {
                break;
              }
              mo.field_f = mo.field_f - 1;
              break;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          km.field_d = km.field_d + 1;
          pa.a(tm.field_d, w.field_f, ia.field_i, (byte) -26);
          if (!uh.field_n) {
            boolean decompiledFrameRemainder1 = true;
            if (qh.field_o.isEmpty() ||
              en.field_O != 0) {
              if ((1 == en.field_O) &&
                (qh.field_o.isEmpty())) {
                if (null != cn.field_d) {
                  en.field_O = 0;
                  decompiledFrameRemainder1 = (var20 != 0);
                }
                if (decompiledFrameRemainder1) {
                  td.field_c = ce.b((byte) -125);
                  if (null != td.field_c) {
                    ca.field_j = 0;
                    cn.field_d = bq.field_i;
                    mi.i(22075);
                    en.field_O = 0;
                    if (var20 != 0) {
                      mo.field_f = 0;
                      en.field_O = 1;
                      qp.field_f = false;
                      bq.field_i = ce.b((byte) -124);
                    }
                  }
                }
              }
            } else {
              mo.field_f = 0;
              en.field_O = 1;
              qp.field_f = false;
              bq.field_i = ce.b((byte) -124);
            }
            if (en.field_O == 0 &&
              cn.field_d != null) {
              ca.field_j = ca.field_j + 1;
              if (ca.field_j < ia.field_g) {
                if (ca.field_j > 0) {
                  var2_double = (double)ca.field_j / (double)ia.field_g;
                  var4_double = cn.field_d[0] / cn.field_d[2];
                  var6 = cn.field_d[1] / cn.field_d[2];
                  var8 = td.field_c[0] / td.field_c[2];
                  var10 = td.field_c[1] / td.field_c[2];
                  var12_double = cn.field_d[2];
                  var14_double = td.field_c[2];
                  var16 = var12_double * Math.pow(var14_double / var12_double, var2_double);
                  var18 = (-(1.0 / var12_double) + 1.0 / var16) / (-(1.0 / var12_double) + 1.0 / var14_double);
                  if (Double.isNaN(var18) ||
                    0.0 > var18 ||
                    var18 > 1.0) {
                    var18 = var2_double;
                  }
                  bq.field_i = new double[]{var16 * (var18 * (-var4_double + var8) + var4_double), var16 * (var6 + (-var6 + var10) * var18), var16};
                  decompiledFrameRemainder2 = (var20 != 0);
                }
                if (decompiledFrameRemainder2) {
                  bq.field_i = cn.field_d;
                  decompiledFrameRemainder2 = (var20 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                bq.field_i = td.field_c;
                cn.field_d = null;
                decompiledFrameRemainder2 = (var20 != 0);
              }
            }
            if ((decompiledFrameRemainder2) &&
              (qh.field_o.isEmpty())) {
              tm.field_e = tm.field_e + 1;
              ij.a(w.field_f, -2, ia.field_i, tm.field_d);
              if (0 == en.field_O) {
                bq.field_i = ce.b((byte) -125);
                if (bq.field_i == null) {
                  bq.field_i = kd.field_l;
                }
                if (mo.field_f > 0) {
                  var2_double = (double)mo.field_f / 12.0;
                  var4_double = bq.field_i[0] / bq.field_i[2];
                  var6 = bq.field_i[1] / bq.field_i[2];
                  var8 = kd.field_l[0] / kd.field_l[2];
                  var10 = kd.field_l[1] / kd.field_l[2];
                  var12_double = bq.field_i[2];
                  var14_double = kd.field_l[2];
                  var16 = Math.pow(var14_double / var12_double, var2_double) * var12_double;
                  var18 = (-(1.0 / var12_double) + 1.0 / var16) / (1.0 / var14_double - 1.0 / var12_double);
                  if (Double.isNaN(var18) ||
                    0.0 > var18 ||
                    var18 > 1.0) {
                    var18 = var2_double;
                  }
                  bq.field_i = new double[]{var16 * (var18 * (var8 - var4_double) + var4_double), var16 * ((-var6 + var10) * var18 + var6), var16};
                }
              }
            }
          }
          gh.i(127);
          if (param0 >= -126) {
            this.a(false, (byte) -6);
          }
          boolean decompiledFrameRemainder3 = true;
          if (!uh.field_n &&
            ab.field_D == null) {
            var2_int = 3;
            var3 = 1 + ia.field_i;
            L30: while (true) {
              if (-1 + (-ia.field_i + tm.field_d.length) > var3) {
                stackIn_191_0 = 1 + w.field_f;
                if (var20 != 0) {
                  break L30;
                }
                var4 = stackIn_191_0;
                while ((-w.field_f + tm.field_d[0].length - 1) > var4) {
                  var2_int = var2_int & tm.field_d[var3][var4].d(-92);
                  var4++;
                }
                var3++;
                continue;
              }
              stackIn_191_0 = 1 & var2_int;
              break;
            }
            if (stackIn_191_0 == 0) {
              if (((var2_int & 2) != 0)) {
                ab.field_D = (te) ((Object) new r());
              }
              decompiledFrameRemainder3 = false;
            }
            else {
              if (uo.field_o == ke.field_b[jo.field_o]) {
                ei.field_F = ei.field_F + 8;
                sm.field_f = sm.field_f + 8;
                ka.field_n = ka.field_n + 4;
                je.field_j = je.field_j + 5;
                we.field_h = we.field_h + 8;
                fp.field_a = fp.field_a + 8;
                b.field_a = b.field_a + 4;
                qk.field_F = qk.field_F + 5;
                var3_ref_we = new we(jo.field_o, uo.field_o, we.field_h, b.field_a, je.field_j, fp.field_a);
                if (rc.a(-89)) {
                  ec.field_l.b(0, var3_ref_we);
                  if (var20 != 0) {
                    lj.a(5, var3_ref_we, -93);
                  }
                } else {
                  lj.a(5, var3_ref_we, -93);
                }
                ke.field_b[jo.field_o] = uo.field_o + 1;
              }
              if (uo.field_o <= ke.field_b[jo.field_o]) {
                if (jo.field_o == 1) {
                  if (9 == uo.field_o) {
                    rc.a(1, we.field_h, b.field_a, 255, je.field_j, 0, fp.field_a);
                  }
                  if (19 == uo.field_o) {
                    rc.a(1, we.field_h, b.field_a, 254, je.field_j, 1, fp.field_a);
                  }
                  if (uo.field_o == 39) {
                    rc.a(1, we.field_h, b.field_a, 253, je.field_j, 2, fp.field_a);
                  }
                  if (59 == uo.field_o) {
                    rc.a(1, we.field_h, b.field_a, 252, je.field_j, 3, fp.field_a);
                  }
                  if (uo.field_o == 69) {
                    rc.a(1, we.field_h, b.field_a, 251, je.field_j, 4, fp.field_a);
                  }
                }
                if (jo.field_o == 4) {
                  if (uo.field_o == 4) {
                    rc.a(1, we.field_h, b.field_a, 250, je.field_j, 5, fp.field_a);
                  }
                  if (14 == uo.field_o) {
                    rc.a(1, we.field_h, b.field_a, 249, je.field_j, 6, fp.field_a);
                  }
                  if (uo.field_o == 24) {
                    rc.a(1, we.field_h, b.field_a, 248, je.field_j, 7, fp.field_a);
                  }
                  ld.field_y = ld.field_y + q.field_a[2].field_d;
                  if (ld.field_y >= 30) {
                    rc.a(1, we.field_h, b.field_a, 243, je.field_j, 12, fp.field_a);
                  }
                  if (uo.field_o == 11 &&
                    va.field_d != 0) {
                    rc.a(1, we.field_h, b.field_a, 242, je.field_j, 13, fp.field_a);
                  }
                  if (uo.field_o == 15 &&
                    3000 > tm.field_e) {
                    rc.a(1, we.field_h, b.field_a, 241, je.field_j, 14, fp.field_a);
                  }
                  if (uo.field_o == 9 &&
                    va.field_d != 0 &&
                    ol.field_B != 0) {
                    rc.a(1, we.field_h, b.field_a, 240, je.field_j, 15, fp.field_a);
                  }
                }
                if (ai.a(100, 0) &&
                  uo.field_o - dk.field_h == 12) {
                  rc.a(1, we.field_h, b.field_a, 239, je.field_j, 16, fp.field_a);
                }
                gh.j(-10935);
              }
              ab.field_D = (te) ((Object) new ja());
            }
          }
          boolean decompiledSharedTail0 = (null == li.field_a);
          if (!decompiledSharedTail0) {
            li.field_a = li.field_a.c(-28530);
            decompiledSharedTail0 = (var20 != 0);
          }
          if ((decompiledSharedTail0) && (vh.field_a &&
            qh.field_o.isEmpty() &&
            0 == en.field_O &&
            null == cn.field_d &&
            !(ab.field_D instanceof ja) &&
            !go.field_i)) {
            va.a(127);
          }
          if (!uh.field_n &&
            pj.field_v != 0) {
            if (to.field_a < 480) {
              if (null != ab.field_D) {
                return;
              }
              var2_double = bq.field_i[0];
              var4_double = bq.field_i[1];
              var6 = bq.field_i[2];
              var8 = 240.0 - var2_double;
              var10 = -var4_double + (240.0 + var6 / 2.0);
              var12 = (int)Math.floor(((double)to.field_a - var8) / (var6 * 2.0));
              var13 = (int)Math.floor(((double)dp.field_h - var10) / (var6 * 2.0));
              if (var12 >= 0 &&
                var12 < tm.field_d[0].length &&
                var13 >= 0 &&
                var13 < tm.field_d.length) {
                var14 = tm.field_d[var13][var12].a(23525, li.field_a);
                if (null != var14) {
                  li.field_a = var14;
                }
              }
              if (var20 == 0) {
                return;
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (null == ab.field_D &&
              !vh.field_a &&
              dp.field_h >= 48 &&
              158 > dp.field_h) {
              var2_int = 0;
              var3 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3 >= 3))) {
                stackOut_347_0 = q.field_a[var3].field_b;
                stackIn_355_0 = stackOut_347_0 ? 1 : 0;
                stackIn_348_0 = stackOut_347_0;
                if (var20 == 0) {
                  if (stackIn_348_0) {
                    var2_int++;
                  }
                  var3++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                var3 = -(var2_int * 26) + 562;
                stackIn_355_0 = 0;
              }
              var4 = stackIn_355_0;
              while (var4 < 3) {
                stackOut_357_0 = q.field_a[var4].field_b;
                stackIn_376_0 = stackOut_357_0 ? 1 : 0;
                stackIn_358_0 = stackOut_357_0;
                if (var20 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_358_0) {
                  if (oe.field_a[var4] != null &&
                    var3 <= to.field_a &&
                    to.field_a < (var3 + 48)) {
                    li.field_a = oe.field_a[var4].a(23525, li.field_a);
                    break;
                  }
                  var3 += 52;
                }
                var4++;
              }
            }
            if (decompiledFrameCompleted1) {
              stackIn_376_0 = ~dp.field_h;
            }
            if (stackIn_376_0 > -159 ||
              null == li.field_a) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if (!vh.field_a &&
                null == ab.field_D) {
                if (to.field_a >= 506 &&
                  614 > to.field_a) {
                  var2_int = 158;
                  var3 = 0;
                  while (2 > var3) {
                    stackIn_456_0 = ~gm.field_c[var3];
                    stackIn_456_1 = -1;
                    if (var20 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_456_0 < stackIn_456_1 &&
                      dp.field_h >= 12 + var2_int &&
                      dp.field_h < var2_int + 60) {
                      stackIn_411_0 = lm.field_d;
                      if (var3 == 0) {
                        stackIn_412_1 = 15;
                      } else {
                        stackIn_412_1 = 25;
                      }
                      li.field_a = ((f) (Object) stackIn_411_0[stackIn_412_1]).a(23525, li.field_a);
                      break;
                    }
                    var2_int += 48;
                    var3++;
                  }
                }
                if ((decompiledFrameCompleted0) && (qh.field_o.isEmpty() &&
                  en.field_O == 0 &&
                  cn.field_d == null)) {
                  var2_int = go.field_l.a(f.field_e, 152);
                  var3 = -(10 * var2_int) + 100;
                  if (3 <= var2_int) {
                    var3 += 10;
                  }
                  var4 = var3 + var2_int * 20;
                  if (480 <= to.field_a &&
                    640 > to.field_a &&
                    (var3 + 282) <= dp.field_h &&
                    dp.field_h < var4 + 282) {
                    stackIn_443_0 = !(qp.field_f);
                    qp.field_f = stackIn_443_0;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                var2_int = 460;
                if ((ab.field_D instanceof ja) &&
                  (decompiledFrameRemainder0 = !(dp.field_h < var2_int)) &&
                  (decompiledFrameRemainder0 = !(dp.field_h >= 20 + var2_int))) {
                  ((ja) (ab.field_D)).c((byte) -41);
                  ab.field_D = null;
                  decompiledFrameRemainder0 = (var20 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_456_0 = ~dp.field_h;
                  stackIn_456_1 = ~var2_int;
                }
              }
              if (decompiledFrameRemainder0) {
                if (stackIn_456_0 <= stackIn_456_1 &&
                  dp.field_h < (var2_int + 20)) {
                  uh.field_p = (uc) ((Object) new p(true));
                }
                var2_int -= 20;
                if (dp.field_h >= var2_int &&
                  20 + var2_int > dp.field_h) {
                  hc.a(true, false);
                }
              }
              if (var20 == 0) {
                return;
              }
            }
            li.field_a = li.field_a.b((byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "CrazyCrystals.P(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          CrazyCrystals.m(param0 + 30555);
          ne.a(-1);
          bd.e(7279);
          vf.a((byte) -117);
          jf.a(0);
          cn.a(127);
          eb.f((byte) 78);
          ub.a(true);
          wa.e(5);
          ai.a(8076);
          a.a(true);
          jm.a(-122);
          kh.d();
          db.b((byte) 127);
          dg.b((byte) 64);
          hf.b(4);
          ng.e((byte) -125);
          lo.a(param0 - 183);
          ll.a((byte) -85);
          oe.a(-106);
          vl.a((byte) -85);
          lp.a(0);
          qi.a(true);
          ui.a((byte) 110);
          q.a(param0 - 3680);
          uf.a(0);
          sn.a((byte) -123);
          gf.a(20);
          gm.a(true);
          ke.a((byte) 127);
          bc.b(-26389);
          vm.b((byte) 119);
          dd.a(param0 ^ -45);
          oa.b(-98);
          f.a(100);
          id.b();
          wg.e(64);
          am.a(117);
          me.a((byte) 127);
          wb.f(118);
          sg.a(true);
          fq.b(true);
          vh.b((byte) -114);
          nj.a(12);
          te.a((byte) -77);
          uc.a(0);
          ob.a(12554);
          pk.b(120);
          qa.a(param0 - 6231);
          j.a((byte) 45);
          bn.a((byte) -3);
          kp.b(false);
          mj.a((byte) -64);
          ea.f(-1);
          jb.c(-24894);
          pl.a(-124);
          ic.g();
          ka.a((byte) 120);
          to.a((byte) -109);
          rp.b(2);
          dn.a(param0 - 210);
          kb.a(-96);
          vc.a();
          ij.d(1);
          wi.a(0);
          jh.a(18744);
          re.d((byte) -97);
          ge.a(-113);
          hj.a(0);
          oc.a((byte) -121);
          lc.c(-102);
          g.a((byte) 122);
          hc.a(-21017);
          vj.a(26988);
          qg.a((byte) 51);
          ih.a(param0 + 13);
          lk.a((byte) -29);
          pn.c((byte) 119);
          if (param0 != 89) {
            CrazyCrystals.a(107, 81, 58, -104, (int[]) null, (int[]) null, -4, -89);
          }
          sl.b(true);
          mi.h(-20188);
          fb.a((byte) -50);
          gg.b(-123);
          td.a(0);
          ag.a(19266);
          bp.a((byte) 76);
          ol.i(param0 ^ 89);
          sa.d(false);
          kl.h((byte) -1);
          ck.l(param0 ^ 29);
          na.m(-18883);
          dc.j(81);
          ae.a(20);
          vk.a(-23);
          qk.j(-26005);
          rh.c(15157);
          nd.a(32);
          ao.b((byte) -72);
          lj.a(30447);
          rb.c((byte) 100);
          rg.a(-1);
          de.f(3);
          pj.g(param0 ^ -39);
          bo.f(0);
          vn.c(-100);
          m.c((byte) -124);
          jo.f(6);
          em.b(param0 ^ -66);
          mc.b((byte) 126);
          bl.c();
          ej.b();
          nm.a();
          r.d(27);
          ff.c(param0 ^ -18779);
          ja.d(27348);
          kn.g(-104);
          c.g(-1);
          bb.b(true);
          qf.e((byte) -72);
          ro.f(4);
          gh.k(0);
          cd.b(false);
          gi.b(true);
          cj.f((byte) -21);
          cb.f(996201186);
          aa.a(param0 + 20204);
          jl.a((byte) -105);
          hd.a(-1246);
          wh.a((byte) 19);
          mg.b(-111);
          md.j(0);
          vg.a(8877);
          ua.a(0);
          d.a(-8130);
          nc.b(false);
          p.b(-1);
          nn.a(-127);
          wm.b(-1);
          bm.a((byte) -66);
          km.e(0);
          ld.f(100);
          sp.a((byte) 113);
          mf.f(param0 - 20);
          ee.d(0);
          gl.a((byte) -117);
          rk.a((byte) 54);
          wl.c((byte) -89);
          cm.b(-121);
          gn.e(false);
          rc.a(false);
          lb.a((byte) -114);
          nb.c();
          qj.a(param0 ^ 84);
          hm.b(-2);
          jg.a(32767);
          cc.a(-18277);
          so.a(-11774);
          on.a((byte) -128);
          vo.a(true);
          je.a(0);
          dj.a((byte) 46);
          vp.a((byte) -14);
          pg.a((byte) -126);
          tf.a(param0 - 215);
          v.a(114);
          qb.a((byte) 100);
          di.a();
          qn.a(param0 + 169);
          pi.a(102);
          h.a(0);
          kf.a(param0 ^ -90);
          fl.a((byte) -121);
          fk.b(param0 - 5171);
          gk.a(-125);
          ip.a((byte) -103);
          tb.b(param0 ^ -2180);
          qm.g(1);
          pc.d((byte) -58);
          om.e((byte) 122);
          en.i(0);
          ab.c(false);
          og.h(param0 ^ 736);
          tm.a(-11909);
          cf.a(0);
          jc.a(param0 + 33469896);
          tg.a((byte) -100);
          lg.b(31039);
          b.a(param0 ^ 89);
          ra.a(true);
          jj.a((byte) 65);
          wp.a((byte) -98);
          tl.b(2);
          va.a(true);
          s.b((byte) 118);
          tk.a((byte) -125);
          df.a(-20012);
          al.a(param0 + 31664);
          ma.f(125);
          dm.a(param0 + 14137);
          dk.a((byte) 55);
          cp.a(112);
          pf.f((byte) 33);
          ig.f(24);
          ah.a((byte) 40);
          fm.f(-108);
          ji.e((byte) -8);
          tn.f(param0 + 10);
          el.b(2);
          nl.b(0);
          qo.b((byte) -64);
          uo.c(-59);
          jk.a(true);
          ei.f((byte) -46);
          sd.h((byte) 54);
          ga.o(0);
          ud.h((byte) -124);
          co.a(2);
          nh.a(-7397);
          rf.e((byte) -98);
          sb.e((byte) 2);
          io.h(param0 - 211);
          of.h(3);
          se.d((byte) -96);
          fj.b(param0 ^ 45);
          ph.c(true);
          pa.e((byte) -104);
          dq.f((byte) -69);
          bk.a();
          kj.a(-99);
          af.c(0);
          ch.a(855);
          oj.f((byte) 0);
          ed.f((byte) 87);
          sj.a(21732);
          ug.b(32);
          be.a((byte) -48);
          ib.g(31438);
          qd.i(400);
          wf.c(0);
          la.a(16777215);
          ii.a(param0 - 179);
          wk.a(false);
          ak.a(77);
          hp.a(20974);
          tp.a(7566);
          sc.b((byte) -34);
          ok.a(false);
          wc.b((byte) -107);
          aq.b(param0 - 201);
          wn.a(108);
          th.h(param0 ^ -13158);
          ce.b(false);
          hb.b(true);
          lm.a(-26377);
          pp.a((byte) 2);
          we.a(-22523);
          dp.a(-127);
          ca.a(param0 ^ 89);
          ik.a((byte) 105);
          nk.c(-2);
          mh.c(-70);
          si.a(param0 ^ 14362);
          e.a(false);
          mk.b(-27838);
          mo.a(-60);
          jd.e((byte) 54);
          hl.b(param0 + 25559);
          fe.d((byte) -118);
          l.a((byte) -101);
          o.c(58);
          ec.a(param0 - 85);
          ia.a(true);
          qe.a(17659);
          ba.b(48);
          fn.a(true);
          fh.a(124);
          le.b(-1);
          go.b((byte) 54);
          ln.a((byte) -128);
          kk.a(param0 - 192);
          pb.a(param0 ^ -31326);
          hk.b(6388);
          oh.b(32);
          rl.e(120);
          qc.c((byte) 124);
          nf.c((byte) 39);
          pd.a(true);
          rd.a(true);
          ta.a(true);
          gj.d(19);
          ek.b(16);
          ul.b(true);
          ad.c(0);
          eq.f(1);
          sh.c(126);
          aj.g(35);
          ac.d((byte) 23);
          uk.c(89);
          fg.c(121);
          mn.c((byte) 19);
          rn.c(-128);
          ti.c(92);
          cl.c(param0 - 45);
          qh.c((byte) 88);
          il.a(false);
          sm.b(10);
          mb.a(11458);
          fa.a(true);
          uh.c(param0 ^ 217);
          bq.a(true);
          an.b((byte) 118);
          wd.c(param0 ^ 31368);
          bf.a((byte) -125);
          pe.d(1);
          qp.a(param0 + 1095153591);
          pm.a((byte) 35);
          bh.a(param0 ^ -90);
          no.b(true);
          jn.d(-31737);
          kd.e((byte) -33);
          ci.d(70);
          fp.a((byte) 125);
          fo.a((byte) -56);
          oi.a((byte) 118);
          li.c(param0 + 261);
          jp.a((byte) 120);
          this.field_u = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "CrazyCrystals.A(" + param0 + ')');
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int var9;
        for (var8 = 0; var8 < 480; var8++) {
          var9 = mi.field_A[var8];
          param2 = param7;
          param6 = param7 + var9 - param3;
          while (param2 < param6) {
            param4[param2] = param5[param2 + param3];
            param2++;
          }
          param6 = param6 + (param3 + param3);
          param7 += 640;
          if (param6 > param7) {
            param6 = param7;
          }
          while (param2 < param6) {
            param0 = param4[param2];
            param0 = ((param0 & 16711935) * param1 & -16711936) + ((param0 & 65280) * param1 & 16711680);
            incrementValue$0 = param2;
            param2++;
            param4[incrementValue$0] = param0 >>> 8;
          }
          while (param2 < param7) {
            param4[param2] = param5[param2 - param3];
            param2++;
          }
        }
    }

    final void a(int param0) {
        boolean stackIn_43_0 = false;
        boolean stackIn_60_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var3Lifetime2;
        int var4Lifetime2;
        var10 = field_B;
        try {
          if (param0 > -119) {
            this.c(101);
          }
          var2 = gd.c(128);
          if (aj.e((byte) 114)) {
            pl.a(al.a((byte) 2), var2, (byte) -59);
            return;
          }
          if (!ij.field_i) {
            to.a(0, var2);
            return;
          }
          fo.a(0);
          if (!ul.a(true)) {
            td.a(96.0f, rh.field_e, false);
            to.a(0, var2);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == a.field_b) {
            if (r.field_m) {
              dq.a(-26477);
              qb.b(480);
            }
            if (!fj.a(136)) {
              if (null != uh.field_p) {
                uh.field_p.a((byte) 127);
              }
              if (r.field_m) {
                var3 = qn.field_n;
                if (640 > var3) {
                  var4_ref_int__ = ge.field_d.field_w;
                  var5_ref_int__ = kh.field_i;
                  var6 = (var3 << 7) / 640 + 128;
                  var7 = 0;
                  CrazyCrystals.a(0, var6, 0, var3, var5_ref_int__, var4_ref_int__, 0, var7);
                }
              }
              decompiledFrameRemainder0 = !(!gn.d(false));
              if (decompiledFrameRemainder0) {
                if (ph.field_E == null) {
                  stackIn_43_0 = mb.field_d;
                } else {
                  stackIn_43_0 = true;
                }
                fe.a(stackIn_43_0, 7923);
                decompiledFrameRemainder0 = (var10 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var3 = ub.a(255);
              var4 = rl.c((byte) 76);
              go.a((var4 + 41) / 24, (var3 + 35) / 24, false);
              wp.b((byte) -99);
              decompiledFrameRemainder0 = (var10 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            a.field_b.b(8);
            if ((!fj.a(136) &&
              cb.field_w <= 0) &&
              (decompiledFrameRemainder0 = !(!j.c((byte) -23)))) {
              if (ph.field_E == null) {
                stackIn_60_0 = mb.field_d;
              } else {
                stackIn_60_0 = true;
              }
              fe.a(stackIn_60_0, 7923);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              var3Lifetime2 = ub.a(255);
              var4Lifetime2 = rl.c((byte) 95);
              var5 = 320 + (-(var3Lifetime2 / 2) - 30);
              var6Lifetime1 = 30 + (var3Lifetime2 / 2 + 320);
              var7Lifetime1 = var5 + cb.field_w * ((var6Lifetime1 - var5) * cb.field_w) / 400;
              var8 = -20 - var4Lifetime2 / 2 + 240;
              var9 = var4Lifetime2 / 2 + 240 + 20;
              wi.a(var5, jn.field_o, var8, var9 - var8, (byte) -71, -var5 + var7Lifetime1);
              kh.d(var5 + 8, var8 + 8, -16 + (var7Lifetime1 - var5), -16 - var8 + var9, 0, 192);
              if (fj.a(136) &&
                20 == cb.field_w) {
                wp.b((byte) -110);
              }
            }
          }
          if (rb.field_h >= 2 &&
            sg.field_a) {
            var3Lifetime1 = (int)(Runtime.getRuntime().freeMemory() / 1024L);
            var4Lifetime1 = (int)(Runtime.getRuntime().totalMemory() / 1024L);
            an.field_q.b(-var3Lifetime1 + var4Lifetime1 + " kB / " + var4Lifetime1 + " kB", 636, 16, 16777215, -1);
            an.field_q.b(p.field_j + " fps", 636, 30, 16777215, -1);
          }
          bq.a(var2, 0, 0, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "CrazyCrystals.I(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ak.field_f != null) {
            tl.a(121, ak.field_f);
            ak.field_f = null;
            vp.a(103);
          }
          l.field_d = mi.c(1, -115);
          uf.field_e = mi.c(7, -123);
          md.field_p = mi.c(9, -97);
          vm.field_k = we.a(true, (byte) -127, true, true, 2);
          ma.field_p = we.a(true, (byte) -111, true, true, 4);
          rl.field_i = we.a(true, (byte) -51, true, param0, 8);
          mg.field_c = we.a(true, (byte) -70, true, true, 3);
          mg.field_g = we.a(true, (byte) -124, true, true, 5);
          ba.field_k = we.a(true, (byte) -46, true, true, 0);
          io.a(4096, lo.field_a, dj.field_ab);
          qd.a(-91, 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "CrazyCrystals.Q(" + param0 + ')');
        }
    }

    public CrazyCrystals() {
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ph.field_E) {
            q.a(false);
          }
          if (hb.field_h != null) {
            hb.field_h.d();
          }
          if (null != gf.field_c) {
            gf.field_c.d();
          }
          ue.b((byte) -106);
          if (param0 != 241) {
            field_D = 122;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "CrazyCrystals.J(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int[] array$0 = null;
        int[] array$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var3 = null;
        dl[] var3_array = null;
        dl var3_ref = null;
        int var3_int = 0;
        RuntimeException var3_ref2 = null;
        wj[] var4_ref_wj__ = null;
        int var4 = 0;
        int var5 = 0;
        dl[] var6_ref_dl__ = null;
        int var6 = 0;
        Object var7 = null;
        dl[] var8_ref_dl__ = null;
        int var8 = 0;
        dl[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_123_0Lifetime1;
        int stackIn_123_1Lifetime1;
        var13 = field_B;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (null == fq.field_x) {
            if (dj.field_ab.a((byte) 102) &&
              dj.field_ab.a(-20402, "basic")) {
              if (l.field_d.a((byte) 102) &&
                l.field_d.a(-20402, "")) {
                if (uf.field_e.a((byte) 102) &&
                  uf.field_e.a(false)) {
                  if (md.field_p.a((byte) 102) &&
                    md.field_p.a(false)) {
                    if (vm.field_k.a((byte) 102) &&
                      vm.field_k.a(-20402, "initialset")) {
                      if (ma.field_p.a((byte) 102) &&
                        ma.field_p.e(0, 81) &&
                        ma.field_p.a(-20402, "initialset")) {
                        if (!rl.field_i.a((byte) 102)) {
                          td.a(20.0f, jl.field_f, false);
                          return;
                        }
                        if (!mg.field_c.a((byte) 102)) {
                          td.a(20.0f, jl.field_f, false);
                          return;
                        }
                        if (mg.field_g.a((byte) 102) &&
                          mg.field_g.a(false)) {
                          if (ba.field_k.a((byte) 102) &&
                            ba.field_k.a(false)) {
                            if (!param0) {
                              return;
                            }
                            bm.field_e = new int[][]{new int[]{jm.field_g, vp.field_b, kp.field_j, tg.field_b}, new int[]{rk.field_d, pa.field_E, oo.field_i, ji.field_t}, new int[]{96, 97, 98, 99}};
                            fq.field_x = new wg();
                            fq.field_x.a(128, 9, (byte) -103);
                            gf.field_c.b(fq.field_x);
                            aa.field_b = new bn(vm.field_k, ma.field_p);
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, ba.field_k), false);
                            return;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, mg.field_g), false);
                          return;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, ma.field_p), false);
                        return;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, vm.field_k), false);
                      return;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    td.a(12.0f, kp.a(ld.field_w, jn.field_k, "", 3, md.field_p), false);
                    return;
                  }
                }
                if (decompiledFrameRemainder0) {
                  td.a(8.0f, vl.a(re.field_n, 0, 4164, dp.field_j, uf.field_e), false);
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                td.a(8.0f, kp.a(re.field_n, dp.field_j, "", 3, l.field_d), false);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              td.a(8.0f, kp.a(re.field_n, dp.field_j, "basic", 3, dj.field_ab), false);
              return;
            }
          }
          dc.a(true, "menu", (byte) -106);
          if (null == h.field_d) {
            ba.b((byte) 126);
            td.a(28.0f, oi.field_b, false);
            this.a(-124);
            h.field_d = bf.a(-1, "buttonframe", "", l.field_d);
            af.field_c = bf.a(-1, "hoverbuttonframe", "", l.field_d);
            fo.field_g = bf.a(-1, "smallbuttonframe", "", l.field_d);
            mi.field_x = bf.a(-1, "hoversmallbuttonframe", "", l.field_d);
            jn.field_o = bf.a(-1, "hollowframe", "", l.field_d);
            mg.field_b = bf.a(-1, "tinyhollowframe", "", l.field_d);
            an.field_q = hp.a(md.field_p, 0, "fonts_smallfont", l.field_d, "");
            var3 = md.field_p.a(7693, "fonts_largefont", "");
            var4_ref_wj__ = ep.a(l.field_d, "fonts_largefont", "", false);
            bd.a(l.field_d, var3, var4_ref_wj__, 8);
            go.field_l = wi.a(0, var4_ref_wj__, var3);
            gj.field_m = pp.a(new int[]{}, (byte) 80, 1, var3, var4_ref_wj__);
            var5 = gj.field_m.field_K[0].length;
            array$0 = new int[var5];
            gj.field_m.field_K[1] = array$0;
            eg.a(gj.field_m.field_K[0], 0, gj.field_m.field_K[1], 0, var5);
            array$1 = new int[var5];
            gj.field_m.field_K[2] = array$1;
            eg.a(gj.field_m.field_K[0], 0, gj.field_m.field_K[2], 0, var5);
            gj.field_m.field_K[0][1] = 12640511;
            gj.field_m.field_K[1][1] = 16777215;
            md.field_p = null;
            lo.field_a = null;
            gj.field_m.field_K[2][1] = 16760896;
            var6_ref_dl__ = bf.a(-1, "bgtiles_rocky", "", l.field_d);
            var7 = bf.a(-1, "bgtiles_grass", "", l.field_d);
            var8_ref_dl__ = bf.a(-1, "bgtiles_metal", "", l.field_d);
            var9 = bf.a(-1, "bgtiles_tiles", "", l.field_d);
            var10 = var9.length + (var8_ref_dl__.length + var6_ref_dl__.length + java.lang.reflect.Array.getLength(var7)) - 12;
            tb.field_e = new dl[4 + var10];
            tb.field_e[0] = var6_ref_dl__[0];
            tb.field_e[3] = var9[0];
            tb.field_e[1] = (dl) (((Object[]) (var7))[0]);
            tb.field_e[2] = var8_ref_dl__[0];
            kj.field_a[0] = var6_ref_dl__[1];
            kj.field_a[1] = (dl) (((Object[]) (var7))[1]);
            kj.field_a[3] = var9[1];
            kj.field_a[2] = var8_ref_dl__[1];
            qc.field_f[1] = (dl) (((Object[]) (var7))[2]);
            qc.field_f[0] = var6_ref_dl__[2];
            qc.field_f[2] = var8_ref_dl__[2];
            qc.field_f[3] = var9[2];
            var11 = 4;
            vp.field_a[0] = var11;
            var12 = 3;
            do {
              if (var12 >= var6_ref_dl__.length) {
                vp.field_a[1] = var11;
                break;
              }
              incrementValue$2 = var11;
              var11++;
              tb.field_e[incrementValue$2] = var6_ref_dl__[var12];
              var12++;
            } while (var13 == 0);
            var12 = 3;
            do {
              if (!(var12 < java.lang.reflect.Array.getLength(var7))) {
                vp.field_a[2] = var11;
                break;
              }
              incrementValue$3 = var11;
              var11++;
              tb.field_e[incrementValue$3] = (dl) (((Object[]) (var7))[var12]);
              var12++;
            } while (var13 == 0);
            var12 = 3;
            do {
              if (var8_ref_dl__.length <= var12) {
                vp.field_a[3] = var11;
                break;
              }
              incrementValue$4 = var11;
              var11++;
              tb.field_e[incrementValue$4] = var8_ref_dl__[var12];
              var12++;
            } while (var13 == 0);
            var12 = 3;
            do {
              if (var9.length <= var12) {
                vp.field_a[4] = var11;
                ec.field_j = bf.a(-1, "bgtiles_teleport", "", l.field_d);
                mg.a(-104, l.field_d);
                break;
              }
              incrementValue$5 = var11;
              var11++;
              tb.field_e[incrementValue$5] = var9[var12];
              var12++;
            } while (var13 == 0);
            var6 = 0;
            L23: while (true) {
              if (var6 < 17) {
                var7 = ci.a(new String[]{an.field_o[var6]}, wn.field_a, 3);
                var8 = 3;
                stackIn_123_0 = var6;
                stackIn_123_1 = 8;
                if (var13 != 0) {
                  if (stackIn_123_0 > stackIn_123_1) {
                    return;
                  }
                  break L23;
                }
                if (stackIn_123_0 >= stackIn_123_1 &&
                  var6 <= 11) {
                  var8 = 2;
                }
                if (var6 >= 13) {
                  var8 = 4;
                }
                if (var8 >= gh.a((String) (var7), -113)) {
                }
                var6++;
                continue;
              }
              var6 = 0;
              while (true) {
                stackIn_123_0Lifetime1 = ~var6;
                stackIn_123_1Lifetime1 = -5;
                if (stackIn_123_0Lifetime1 <= stackIn_123_1Lifetime1) {
                  break;
                }
                if (var13 != 0) {
                  return;
                }
                var7 = null;
                if (var6 == 0) {
                  var7 = ci.a(new String[]{"80C0FF", md.field_t[0], md.field_t[1]}, fb.field_e, 3);
                }
                if (var6 == 1) {
                  var7 = ci.a(new String[]{"80C0FF", md.field_t[1], md.field_t[2]}, fb.field_e, 3);
                }
                if (var6 == 2) {
                  var7 = ci.a(new String[]{"80C0FF", md.field_t[2]}, of.field_G, 3);
                }
                if (var6 == 3) {
                  var7 = jn.field_n;
                }
                if (go.field_l.a((String) (var7), 148) <= 5) {
                }
                var6++;
              }
              break;
            }
            vp.a(111);
            return;
          }
          if (s.field_o == null) {
            td.a(32.0f, oi.field_b, false);
            this.a(-124);
            s.field_o = bf.a(-1, "fgtiles_earth", "", l.field_d);
            qb.field_b = wl.a("fgtiles_laserhub", l.field_d, 10, "");
            jm.field_i = wl.a("sprites_rock", l.field_d, 10, "");
            vp.field_i = new dl[2][];
            vp.field_i[0] = bf.a(-1, "sprites_crystal1", "", l.field_d);
            vp.field_i[1] = bf.a(-1, "sprites_crystal2", "", l.field_d);
            var3_array = bf.a(-1, "sprites_mirrors", "", l.field_d);
            en.field_K = new dl[6];
            tk.field_h = new dl[6];
            db.field_j = new dl[6];
            ig.field_q = var3_array[6];
            nf.field_g = var3_array[19];
            ja.field_h = new dl[6];
            var4 = 0;
            while (6 > var4) {
              en.field_K[var4] = var3_array[-var4 + 12];
              tk.field_h[var4] = var3_array[-var4 + 25];
              ja.field_h[var4] = var3_array[var4 + 13];
              db.field_j[var4] = var3_array[var4];
              var4++;
              if (var13 != 0) {
                return;
              }
            }
            vp.a(108);
            return;
          }
          if (null == ac.field_j) {
            td.a(36.0f, oi.field_b, false);
            this.a(-125);
            var3_array = bf.a(-1, "sprites_lasers", "", l.field_d);
            jl.field_b = var3_array[3];
            ai.field_b = var3_array[5];
            qn.field_e = var3_array[1];
            en.field_M = var3_array[2];
            ce.field_eb = var3_array[4];
            ac.field_j = var3_array[0];
            de.field_k = wl.a("sprites_ledge", l.field_d, 10, "");
            qj.field_b = wl.a("sprites_stickyball", l.field_d, 10, "");
            il.field_e = wl.a("sprites_pingpongball", l.field_d, 10, "");
            var3_array = bf.a(-1, "sprites_ball_indicators", "", l.field_d);
            na.field_eb = var3_array[1];
            qi.field_a = var3_array[5];
            mk.field_a = var3_array[2];
            ln.field_d = var3_array[7];
            vp.field_d = var3_array[0];
            tl.field_b = var3_array[3];
            rf.field_C = var3_array[4];
            ba.field_j = var3_array[6];
            ag.field_c = new dl[12];
            al.field_h = new dl[12];
            cp.field_d = new dl[12];
            sa.field_qb = new dl[12];
            var3_array = bf.a(-1, "sprites_spider", "", l.field_d);
            var4 = 0;
            do {
              if (var4 >= 12) {
                var4 = 0;
                break;
              }
              sa.field_qb[var4] = var3_array[var4];
              var4++;
            } while (var13 == 0);
            do {
              if (12 <= var4) {
                var4 = 0;
                break;
              }
              ag.field_c[var4] = var3_array[12 + var4];
              var4++;
            } while (var13 == 0);
            do {
              if (var4 >= 12) {
                var4 = 0;
                break;
              }
              cp.field_d[var4] = var3_array[var4 + 24];
              var4++;
            } while (var13 == 0);
            while (var4 < 12) {
              al.field_h[var4] = var3_array[var4 + 36];
              var4++;
              if (var13 != 0) {
                return;
              }
            }
            vp.a(118);
            return;
          }
          if (null == pa.field_H) {
            td.a(40.0f, oi.field_b, false);
            this.a(-127);
            pa.field_H = wl.a("sprites_spider_bright", l.field_d, 10, "");
            wl.field_p = new dl[4][4];
            var3_array = bf.a(-1, "sprites_spider_web", "", l.field_d);
            var4 = 0;
            do {
              if (16 <= var4) {
                jd.field_A = wl.a("sprites_grave", l.field_d, 10, "");
                fl.field_i = bf.a(-1, "sprites_key", "", l.field_d);
                v.field_b = bf.a(-1, "sprites_safe", "", l.field_d);
                bb.field_y = new dl[12];
                var3_array = bf.a(-1, "sprites_safe_base", "", l.field_d);
                break;
              }
              wl.field_p[var4 >> 2][pf.b(3, var4)] = var3_array[var4];
              var4++;
            } while (var13 == 0);
            var4 = 1;
            while (12 > var4) {
              bb.field_y[var4] = var3_array[var4 - 1];
              var4++;
              if (var13 != 0) {
                return;
              }
            }
            al.field_a = wl.a("sprites_bomb", l.field_d, 10, "");
            vp.a(104);
            return;
          }
          if (null == ba.field_g) {
            td.a(44.0f, oi.field_b, false);
            this.a(-122);
            pl.field_B = new dl[8];
            ba.field_g = new dl[8];
            q.field_b = new dl[8];
            hj.field_b = new dl[8];
            bd.field_n = new dl[8];
            cl.field_n = new dl[8];
            jg.field_i = new dl[8];
            var3_array = bf.a(-1, "sprites_explosion", "", l.field_d);
            var4 = 0;
            while (var4 < 8) {
              ba.field_g[var4] = var3_array[7 * var4 + 0];
              jg.field_i[var4] = var3_array[7 * var4 + 1];
              hj.field_b[var4] = var3_array[var4 * 7 + 2];
              q.field_b[var4] = var3_array[7 * var4 + 3];
              pl.field_B[var4] = var3_array[4 + var4 * 7];
              cl.field_n[var4] = var3_array[7 * var4 + 5];
              bd.field_n[var4] = var3_array[6 + var4 * 7];
              var4++;
              if (var13 != 0) {
                return;
              }
            }
            vp.a(118);
            return;
          }
          if (null == jf.field_b) {
            td.a(48.0f, oi.field_b, false);
            this.a(-124);
            jf.field_b = bf.a(-1, "control_keys", "", l.field_d);
            qh.a(9260, 52, 0, l.field_d);
            qh.a(9260, 56, 1, l.field_d);
            qh.a(9260, 60, 2, l.field_d);
            qh.a(9260, 64, 3, l.field_d);
            vp.a(118);
            return;
          }
          if (null == d.field_c) {
            td.a(68.0f, oi.field_b, false);
            this.a(-126);
            ln.a(0, l.field_d);
            am.a(l.field_d, uf.field_e, -88);
            d.field_c = bf.a(-1, "achievements", "", l.field_d);
            ro.field_q = wl.a("unachieved", dj.field_ab, 10, "basic");
            ah.field_b = wl.a("locked", dj.field_ab, 10, "basic");
            var3_ref = wl.a("orbcoin", dj.field_ab, 10, "basic");
            vf.field_b = new dl[d.field_c.length];
            cn.field_c = new dl[d.field_c.length];
            var4 = 0;
            while (d.field_c.length > var4) {
              vf.field_b[var4] = new dl(48, 48);
              vf.field_b[var4].a();
              d.field_c[var4].d(0, 0, 48, 48);
              cn.field_c[var4] = new dl(32, 32);
              cn.field_c[var4].a();
              d.field_c[var4].d(0, 0, 32, 32);
              var4++;
              if (var13 != 0) {
                return;
              }
            }
            oj.field_B = new dl(32, 32);
            oj.field_B.a();
            ro.field_q.d(0, 0, 32, 32);
            p.field_k = new dl(32, 32);
            p.field_k.a();
            ah.field_b.d(0, 0, 32, 32);
            ne.field_i = new dl(20, 20);
            ne.field_i.a();
            var3_ref.d(0, 0, 20, 20);
            dk.field_o.a(6945);
            l.field_d = null;
            dj.field_ab = null;
            uf.field_e = null;
            vp.a(102);
            return;
          }
          if (fk.field_x == null) {
            td.a(72.0f, gl.field_l, false);
            this.a(-128);
            fk.field_x = new ko[2];
            fk.field_x[0] = bl.a(ma.field_p, "initialset", "crystal1").a();
            fk.field_x[1] = bl.a(ma.field_p, "initialset", "crystal2").a();
            nk.field_j = ha.a(vm.field_k, "initialset", "ball-bounce").b();
            wm.field_a = ha.a(vm.field_k, "initialset", "ball-rolling").b();
            uk.field_i = bl.a(ma.field_p, "initialset", "ball-into-hole").a();
            aq.field_t = bl.a(ma.field_p, "initialset", "ball-punch").a();
            qf.field_w = ha.a(vm.field_k, "initialset", "dig-through-earth").b();
            fb.field_c = bl.a(ma.field_p, "initialset", "laser-humming").a();
            ti.field_l = bl.a(ma.field_p, "initialset", "rock-push").a();
            pe.field_h = bl.a(ma.field_p, "initialset", "rock-falling").a();
            mg.field_d = ha.a(vm.field_k, "initialset", "rock_land").b();
            io.field_H = ha.a(vm.field_k, "initialset", "bomb-push").b();
            vp.a(103);
            return;
          }
          if (null == fo.field_i) {
            td.a(76.0f, gl.field_l, false);
            this.a(-124);
            fo.field_i = new ko[4];
            fo.field_i[0] = ha.a(vm.field_k, "initialset", "footstep-rocky").b();
            fo.field_i[1] = ha.a(vm.field_k, "initialset", "footstep-grass").b();
            fo.field_i[2] = ha.a(vm.field_k, "initialset", "footstep-metal").b();
            fo.field_i[3] = ha.a(vm.field_k, "initialset", "footstep-tiles").b();
            rn.field_p = ha.a(vm.field_k, "initialset", "footstep-ball").b();
            nj.field_c = bl.a(ma.field_p, "initialset", "spider-advancing").a();
            cf.field_f = bl.a(ma.field_p, "initialset", "spider-crushed").a();
            lm.field_a = bl.a(ma.field_p, "initialset", "spider-explode-into-sparks").a();
            jc.field_a = bl.a(ma.field_p, "initialset", "safes-open").a();
            oa.field_e = bl.a(ma.field_p, "initialset", "key").a();
            gk.field_j = bl.a(ma.field_p, "initialset", "break-ledge").a();
            jm.field_k = ha.a(vm.field_k, "initialset", "bomb-explode").b();
            lb.field_d = ha.a(vm.field_k, "initialset", "tile-explode").b();
            vp.a(119);
            return;
          }
          if (an.field_s == null) {
            td.a(80.0f, gl.field_l, false);
            this.a(-120);
            an.field_s = bl.a(ma.field_p, "initialset", "mirror-start-bending").a();
            cl.field_m = bl.a(ma.field_p, "initialset", "mirror-ping").a();
            ab.field_z = ha.a(vm.field_k, "initialset", "teleport").b();
            sa.field_nb = bl.a(ma.field_p, "initialset", "player-push-upwards").a();
            tg.field_c = bl.a(ma.field_p, "initialset", "player-sticky-feet").a();
            va.field_b = bl.a(ma.field_p, "initialset", "player-prod-spider").a();
            ga.field_H = bl.a(ma.field_p, "initialset", "player-taunt-spider").a();
            e.a(0, vm.field_k, ma.field_p);
            sb.a(ma.field_p, 18180);
            of.a(vm.field_k, 23, ma.field_p);
            ma.field_p = null;
            vm.field_k = null;
            vp.a(118);
            return;
          }
          if (null == dc.a(true, "menu", (byte) 121)) {
            td.a(84.0f, be.field_b, false);
            this.a(-121);
            vp.a(124);
            return;
          }
          td.a(88.0f, ae.field_D, false);
          this.a(-126);
          kf.field_d = new int[30];
          lm.field_d = new f[30];
          kf.field_d[0] = 0;
          lm.field_d[0] = (f) ((Object) new kp());
          kf.field_d[1] = 8;
          lm.field_d[1] = (f) ((Object) new pj(0));
          kf.field_d[2] = 16;
          lm.field_d[2] = (f) ((Object) new pj(1));
          kf.field_d[3] = 24;
          lm.field_d[3] = (f) ((Object) new pj(2));
          kf.field_d[4] = 32;
          lm.field_d[4] = (f) ((Object) new pj(3));
          kf.field_d[5] = 40;
          lm.field_d[5] = (f) ((Object) new pj(4));
          kf.field_d[6] = 48;
          lm.field_d[6] = (f) ((Object) new pj(5));
          kf.field_d[7] = 56;
          lm.field_d[7] = (f) ((Object) new pj(6));
          kf.field_d[8] = 64;
          lm.field_d[8] = (f) ((Object) new pj(7));
          kf.field_d[9] = 72;
          lm.field_d[9] = (f) ((Object) new pj(8));
          kf.field_d[10] = 80;
          lm.field_d[10] = (f) ((Object) new pj(9));
          kf.field_d[11] = 88;
          lm.field_d[11] = (f) ((Object) new de());
          kf.field_d[12] = 112;
          lm.field_d[12] = (f) ((Object) new kn(new kp()));
          kf.field_d[13] = 120;
          lm.field_d[13] = (f) ((Object) new c(new kp()));
          kf.field_d[14] = 96;
          lm.field_d[14] = (f) ((Object) new bb(new kp()));
          kf.field_d[15] = 104;
          lm.field_d[15] = (f) ((Object) new jo(new kp(), 0));
          kf.field_d[16] = 128;
          lm.field_d[16] = (f) ((Object) new ro(0, new kp()));
          kf.field_d[17] = 129;
          lm.field_d[17] = (f) ((Object) new ro(1, new kp()));
          kf.field_d[18] = 136;
          lm.field_d[18] = (f) ((Object) new vb(new kp()));
          kf.field_d[19] = 144;
          lm.field_d[19] = (f) ((Object) new cd(new kp(), 1, 0, 0, 1));
          kf.field_d[20] = 145;
          lm.field_d[20] = (f) ((Object) new gh(new kp(), 1, 0));
          var3_int = 116 / ((param1 - 34) / 63);
          kf.field_d[21] = 146;
          lm.field_d[21] = (f) ((Object) new mi(new kp()));
          kf.field_d[22] = 152;
          lm.field_d[22] = (f) ((Object) new gi(0, new kp()));
          kf.field_d[23] = 160;
          lm.field_d[23] = (f) ((Object) new ep(new jo(new kp(), 0), 0));
          kf.field_d[24] = 168;
          lm.field_d[24] = (f) ((Object) new cj(new kp(), 2, 0, 0));
          kf.field_d[25] = 105;
          lm.field_d[25] = (f) ((Object) new jo(new kp(), 1));
          kf.field_d[26] = 200;
          lm.field_d[26] = (f) ((Object) new cb(new kp(), 0, 0));
          kf.field_d[27] = 248;
          lm.field_d[27] = (f) ((Object) new fq(new kp(), 0, 0, 0));
          kf.field_d[28] = 249;
          lm.field_d[28] = (f) ((Object) new fq(new kp(), 1, 0, 0));
          kf.field_d[29] = 250;
          lm.field_d[29] = (f) ((Object) new fq(new kp(), 2, 0, 0));
          a.field_b = (ue) ((Object) new re());
          vp.a(103);
          ij.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3_ref2), "CrazyCrystals.R(" + param0 + ',' + param1 + ')');
        }
    }

    public static void m(int param0) {
        try {
          field_C = null;
          if (param0 != 30644) {
            CrazyCrystals.m(-45);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "CrazyCrystals.O(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        this.a(13, 10, (byte) 111, false, 12, 6, 11, 15);
        fe.field_g = this;
        if (param0 != -82) {
          return;
        }
        try {
          id.a(22050, true, 10);
          hb.field_h = id.a(te.field_a, (java.awt.Component) ((Object) jd.field_D), 0, 0);
          gf.field_c = id.a(te.field_a, (java.awt.Component) ((Object) jd.field_D), 1, 22050);
          tb.field_d = new tj();
          hb.field_h.b(tb.field_d);
          this.a(true, false, true, true, -1);
          ao.field_e = 16760896;
          mc.field_s = 0;
          jn.field_i = 1;
          qo.c((byte) 107);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "CrazyCrystals.H(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        boolean stackIn_19_1 = false;
        boolean stackIn_69_1 = false;
        ef stackIn_198_0 = null;
        int stackIn_199_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        re var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        var5 = field_B;
        try {
          if (cp.field_k[8]) {
            sg.field_a = false;
          }
          if (cp.field_k[9]) {
            sg.field_a = true;
          }
          if (ph.field_E != null &&
            ph.field_E.field_d) {
            q.a(false);
            cm.a(-15544);
          }
          hb.field_h.c();
          gf.field_c.c();
          stackIn_19_1 = (ph.field_E != null);
          this.a(stackIn_19_1, 15000);
          if (hb.field_g) {
            this.d(true);
            hb.field_g = false;
          }
          if (!cp.field_k[vf.field_c]) {
            lb.field_k = false;
          }
          if (!param0) {
            this.c(70);
          }
          if (!aj.e((byte) -9)) {
            if (!ij.field_i) {
              pi.a(of.field_H, -118);
              this.a(true, (byte) -81);
            }
            boolean decompiledFrameRemainder1 = true;
            if (ij.field_i) {
              if (ul.a(true)) {
                if (!fj.a(136)) {
                  if (gn.d(false)) {
                    if (cb.field_w <= 0) {
                      if (ti.field_o) {
                        dg.a(false, 50);
                        ti.field_o = false;
                      }
                      if (r.field_m &&
                        qn.field_n < 640) {
                        if (qn.field_n < 136) {
                          gh.field_C = gh.field_C + 1;
                        }
                        qn.field_n = qn.field_n + gh.field_C;
                      }
                      stackIn_69_1 = (ph.field_E != null);
                      var2_int = na.a((eb) (this), stackIn_69_1, 10);
                      if (var2_int == 2364824) {
                        w.a(33423575);
                      }
                      if (var2_int == 1) {
                        q.a(false);
                      }
                      if (var2_int == 2) {
                        q.a(false);
                        ta.a(le.b((byte) -20), 19);
                      }
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      cb.field_w = cb.field_w - 1;
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (!ti.field_o) {
                      dg.a(false, 60);
                      ti.field_o = true;
                    }
                    if (cb.field_w > 0) {
                      cb.field_w = cb.field_w - 1;
                    }
                    if (a.field_b != null) {
                      a.field_b.a(false);
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder1 = !(!r.field_m))) {
                      if (!uh.field_n &&
                        qn.field_n < 640) {
                        if (qn.field_n < 136) {
                          gh.field_C = gh.field_C + 1;
                        }
                        qn.field_n = qn.field_n + gh.field_C;
                        if (qn.field_n < 320 &&
                          ca.field_j < 0) {
                          ca.field_j = ca.field_j - 1;
                        }
                      }
                      this.g((byte) -128);
                      decompiledFrameRemainder1 = !(!uh.field_n);
                      if (decompiledFrameRemainder1) {
                        qn.field_n = qn.field_n - gh.field_C;
                        if (136 > qn.field_n) {
                          gh.field_C = gh.field_C - 1;
                        }
                        decompiledFrameRemainder1 = (0 == qn.field_n);
                        if (decompiledFrameRemainder1) {
                          vk.j(17);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  var2 = (re) (a.field_b);
                  var3 = 0;
                  if (s.field_l) {
                    var3 = 40;
                  }
                  if (null != var2) {
                    var2.f(-88);
                    var2.b(-115, var3, 2);
                    if (s.field_l) {
                      if (!(0 >= cb.field_w)) {
                        cb.field_w = cb.field_w - 1;
                        if ((var5 != 0) &&
                          (cb.field_w < 20)) {
                          cb.field_w = cb.field_w + 1;
                        }
                      }
                    } else {
                      if (cb.field_w < 20) {
                        cb.field_w = cb.field_w + 1;
                      }
                    }
                  }
                  boolean decompiledFrameRemainder0 = true;
                  if (!s.field_l) {
                    if (var2 != null) {
                      var2.c(-1);
                    }
                    var4 = tb.a(true);
                    if (3 == var4) {
                      dq.a(-32056, true);
                    }
                    if (var4 == 2) {
                      q.a(false);
                    }
                    if (var4 == 4) {
                      s.field_l = true;
                    }
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (40 <= var2.field_f)) {
                    if (tp.field_e) {
                      tp.field_e = false;
                      s.field_l = false;
                      dq.a(-32056, true);
                      if (var5 != 0) {
                        of.e((byte) -76);
                        tp.field_e = true;
                      }
                    } else {
                      of.e((byte) -76);
                      tp.field_e = true;
                    }
                  }
                  if (var5 != 0) {
                    pi.a(of.field_H, -94);
                    uk.d(-9762);
                  }
                }
              } else {
                pi.a(of.field_H, -94);
                uk.d(-9762);
              }
            }
            while (true) {
              if (ee.a(ai.field_c, 64)) {
                this.l(-124);
                if (var5 == 0) {
                  continue;
                }
              } else {
                ak.a(0, (byte) -48);
              }
              break;
            }
            if (!gl.c(-11)) {
              return;
            }
            var2_intLifetime1 = this.i(-1);
            if (var2_intLifetime1 == 0 ||
              var2_intLifetime1 == 1) {
              ue.a(2, -109);
              fo.a(3, (byte) -98);
              si.a(4, false);
              hk.a((byte) 5, 5);
            }
            if (var2_intLifetime1 == 2) {
              stackIn_198_0 = go.field_l;
              if (r.field_m) {
                stackIn_199_1 = 240;
              } else {
                stackIn_199_1 = 320;
              }
              ja.a(stackIn_198_0, stackIn_199_1, 240, 23, 25, -17213);
            }
            if (var5 == 0) {
              return;
            }
          }
          if (ti.field_o) {
            dg.a(false, 50);
            ti.field_o = false;
          }
          this.k(6579);
          if (kf.b(45)) {
            this.a(false, (byte) 103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "CrazyCrystals.F(" + param0 + ')');
        }
    }

    static {
        field_C = "No highscores";
    }
}
