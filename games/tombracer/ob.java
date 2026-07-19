/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends vg {
    float field_j;
    static int field_i;
    int field_h;
    static jpa field_n;
    int field_l;
    int field_m;
    static String field_f;
    int field_k;
    int field_g;

    abstract void a(byte param0, int param1);

    public static void a(boolean param0) {
        field_f = null;
        field_n = null;
        if (param0) {
            field_f = (String) null;
        }
    }

    final int b(byte param0) {
        if (param0 != 11) {
            this.field_j = -0.5366194248199463f;
            return this.field_l;
        }
        return this.field_l;
    }

    abstract void a(byte param0, float param1);

    final static void a(ha param0, int param1) {
        nh discarded$5 = null;
        nh discarded$6 = null;
        nh discarded$7 = null;
        nh discarded$8 = null;
        nh discarded$9 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            tp.field_K = su.a(rva.field_v, param0, (byte) 127);
            la.field_p = new nh[6][];
            if (param1 == 17186) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var2_int ^ -1) <= -7) {
                      break L3;
                    } else {
                      la.field_p[var2_int] = ak.a(param0, eta.field_a[var2_int], -82);
                      var2_int++;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ng.field_k = new nh[6];
                  em.field_h = new nh[6];
                  break L2;
                }
                var2_int = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if ((var2_int ^ -1) <= -7) {
                        break L6;
                      } else {
                        ng.field_k[var2_int] = su.a(lm.field_p[var2_int], param0, (byte) -68);
                        lm.field_p[var2_int].b();
                        em.field_h[var2_int] = su.a(lm.field_p[var2_int], param0, (byte) 125);
                        lm.field_p[var2_int].b();
                        var2_int++;
                        if (var11 != 0) {
                          break L5;
                        } else {
                          if (var11 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ik.field_h = su.a(dna.field_F, param0, (byte) 127);
                    dr.field_a = ak.a(param0, bp.field_p, -79);
                    bd.field_i = su.a(ara.field_vb, param0, (byte) -20);
                    lm.field_m = su.a(tla.field_g, param0, (byte) -99);
                    po.field_l = su.a(wd.field_c, param0, (byte) 25);
                    lh.field_b = su.a(lha.field_l, param0, (byte) 127);
                    vua.field_A = su.a(wj.field_a, param0, (byte) 126);
                    dn.field_d = ak.a(param0, qb.field_e, -100);
                    ufa.field_r = ak.a(param0, via.field_a, param1 ^ -17261);
                    bm.field_f = ak.a(param0, gda.field_d, -112);
                    ega.field_e = su.a(nm.field_i, param0, (byte) 126);
                    tv.field_wb = su.a(lt.field_a, param0, (byte) 127);
                    sta.field_y = ak.a(param0, ina.field_c, -104);
                    kq.field_a = su.a(bha.field_C, param0, (byte) 127);
                    id.field_h = ak.a(param0, tba.field_f, -70);
                    lva.field_m = ak.a(param0, ng.field_f, -77);
                    discarded$5 = su.a(ds.field_g, param0, (byte) 126);
                    za.field_g = su.a(jga.field_b, param0, (byte) -50);
                    bca.field_d = su.a(sla.field_a, param0, (byte) -38);
                    rm.field_c = su.a(gv.field_s, param0, (byte) 126);
                    uda.field_r = su.a(aa.field_a, param0, (byte) 125);
                    je.field_E = su.a(pha.field_Bb, param0, (byte) -119);
                    eu.field_a = su.a(ira.field_t, param0, (byte) -5);
                    pq.field_a = su.a(qh.field_q, param0, (byte) 28);
                    uta.field_d = su.a(tl.field_n, param0, (byte) 127);
                    cb.field_i = ak.a(param0, ga.field_F, -67);
                    qf.field_k = new nh[cb.field_i.length];
                    break L5;
                  }
                  var2_int = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (cb.field_i.length <= var2_int) {
                          break L9;
                        } else {
                          var13 = ga.field_F[var2_int].e();
                          var12 = var13;
                          var3 = var12;
                          if (var11 != 0) {
                            break L8;
                          } else {
                            var4 = 0;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var13.length <= var4) {
                                    break L12;
                                  } else {
                                    var5 = var13[var4] >> -616314664 & 255;
                                    var6 = var13[var4] & 255;
                                    var7 = (65319 & var13[var4]) >> -1076656792;
                                    var8 = (var13[var4] & 16752521) >> 824277904;
                                    var9 = (int)(0.3 * (double)var8 + (0.59 * (double)var7 + 0.11 * (double)var6));
                                    var10 = var9 + ((var9 << 1558099312) + (var9 << -1697174200));
                                    var3[var4] = fh.a(var5 << 824001336, var10);
                                    var4++;
                                    if (var11 != 0) {
                                      break L11;
                                    } else {
                                      if (var11 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                qf.field_k[var2_int] = param0.a(var3, cb.field_i[var2_int].c(), 89, cb.field_i[var2_int].a(), cb.field_i[var2_int].a(), 0);
                                var2_int++;
                                break L11;
                              }
                              if (var11 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      bsa.field_i = su.a(hoa.field_l, param0, (byte) -107);
                      fa.field_a = ak.a(param0, nk.field_k, -99);
                      nc.field_e = su.a(hka.field_c, param0, (byte) -15);
                      uua.field_a = su.a(qk.field_u, param0, (byte) 125);
                      discarded$6 = su.a(mp.field_d, param0, (byte) 126);
                      discarded$7 = su.a(baa.field_g, param0, (byte) -43);
                      fra.field_q = su.a(op.field_O, param0, (byte) 126);
                      ij.field_X = su.a(ifa.field_q, param0, (byte) 125);
                      discarded$8 = su.a(field_n, param0, (byte) 125);
                      gg.field_f = su.a(vua.field_y, param0, (byte) 127);
                      eca.field_c = ak.a(param0, up.field_e, -64);
                      nm.field_l = su.a(ena.field_l, param0, (byte) 127);
                      discarded$9 = su.a(aw.field_F, param0, (byte) -2);
                      gca.field_a = su.a(rp.field_f, param0, (byte) 126);
                      ng.field_b = ak.a(param0, qka.field_o, param1 + -17309);
                      vna.field_c = su.a(ko.field_j, param0, (byte) -95);
                      tka.field_p = su.a(ht.field_Db, param0, (byte) 27);
                      ep.field_n = su.a(oea.field_j, param0, (byte) -37);
                      wh.field_y = su.a(cn.field_h, param0, (byte) 127);
                      haa.field_z = su.a(re.field_a, param0, (byte) 126);
                      aq.field_a = ak.a(param0, mna.field_c, -55);
                      mc.field_r = su.a(fm.field_h, param0, (byte) 127);
                      dp.field_d = ri.a(param0, (byte) -105, haa.field_A.field_f);
                      la.field_j = ri.a(param0, (byte) -104, du.field_c.field_f);
                      break L8;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("ob.J(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c(int param0) {
        if (param0 > -111) {
            field_i = -124;
            return this.field_g;
        }
        return this.field_g;
    }

    abstract void a(int param0, int param1);

    final int a(byte param0) {
        int var2 = 76 / ((param0 - 31) / 54);
        return this.field_h;
    }

    final int d(int param0) {
        if (param0 != 13437) {
            return 104;
        }
        return this.field_k;
    }

    abstract void a(int param0, int param1, byte param2, int param3);

    ob(int param0, int param1, int param2, int param3, int param4, float param5) {
        this.field_m = param1;
        this.field_k = param0;
        this.field_l = param2;
        this.field_j = param5;
        this.field_g = param4;
        this.field_h = param3;
    }

    final float b(int param0) {
        if (param0 != 0) {
            return -0.41912034153938293f;
        }
        return this.field_j;
    }

    final int a(int param0) {
        if (param0 != 19848) {
            return -116;
        }
        return this.field_m;
    }

    static {
        field_f = "Send private Quick Chat to <%0>";
    }
}
