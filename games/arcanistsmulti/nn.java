/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class nn extends tf {
    static String field_t;
    static ij field_q;
    static eh field_s;
    static String field_m;
    static int field_p;
    static int[][] field_n;
    int field_r;
    static og field_o;

    abstract boolean f(byte param0);

    final static String g(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -25) {
                break L1;
              } else {
                nn.c(-47);
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + ve.field_m + " " + nf.field_W + " " + se.field_I + ") " + on.field_g;
                if (fj.field_h > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~var2 <= ~fj.field_h) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = 255 & df.field_z.field_j[var2];
                            var4 = var3 >> -153130460;
                            var3 = var3 & 15;
                            if (var4 < 10) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "nn.D(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    public static void c(int param0) {
        field_t = null;
        if (param0 <= 25) {
            return;
        }
        try {
            field_s = null;
            field_o = null;
            field_q = null;
            field_m = null;
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nn.E(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, int[] param1, int param2, qb[][] param3, int param4, String[] param5, String[][] param6, String[] param7, eg param8, byte[] param9, String[] param10, String[][] param11, int param12, qb[][] param13, int param14) {
        Object var17_ref = null;
        kc var15 = null;
        kc var16 = null;
        int var17_int = 0;
        kc var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        qb var19_ref_qb = null;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        kc stackIn_3_0 = null;
        kc stackIn_3_1 = null;
        long stackIn_3_2 = 0L;
        kc stackIn_3_3 = null;
        kc stackIn_4_0 = null;
        kc stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        kc stackIn_4_3 = null;
        kc stackIn_5_0 = null;
        kc stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        kc stackIn_5_3 = null;
        String stackIn_5_4 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        qb stackIn_45_0 = null;
        String stackIn_51_0 = null;
        int stackIn_55_0 = 0;
        kc stackIn_58_0 = null;
        nl stackIn_67_0 = null;
        Object stackIn_76_0 = null;
        nl stackIn_94_0 = null;
        Object stackIn_100_0 = null;
        kc stackOut_2_0 = null;
        kc stackOut_2_1 = null;
        long stackOut_2_2 = 0L;
        kc stackOut_2_3 = null;
        kc stackOut_4_0 = null;
        kc stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        kc stackOut_4_3 = null;
        String stackOut_4_4 = null;
        kc stackOut_3_0 = null;
        kc stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        kc stackOut_3_3 = null;
        String stackOut_3_4 = null;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_44_0 = null;
        qb stackOut_43_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_50_0 = null;
        String stackOut_49_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_54_0 = 0;
        kc stackOut_57_0 = null;
        nl stackOut_66_0 = null;
        kc stackOut_75_0 = null;
        nl stackOut_93_0 = null;
        kc stackOut_99_0 = null;
        var17_ref = null;
        L0: {
          var21 = ArcanistsMulti.field_G ? 1 : 0;
          le.field_q = param12;
          fl.field_b = param7;
          pn.field_b = param13;
          lj.field_o = param6;
          ef.field_t = param4;
          ao.field_h = param1;
          qa.field_o = param11;
          rk.field_I = param5;
          nk.field_m = param3;
          ob.field_bb = param10;
          ml.field_m = param9;
          gb.field_d = param0;
          mo.field_b = qe.a(param8, "gameprivacy", "lobby", 92);
          re.field_j = qe.a(param8, "ratedgame", "lobby", 81);
          sk.field_f = qe.a(param8, "opentome", "lobby", 71);
          ec.field_i = qe.a(param8, "allowspectators", "lobby", 88);
          vm.field_c = new String[5];
          vm.field_c[4] = io.field_C;
          vm.field_c[1] = ne.field_a;
          vm.field_c[0] = wm.field_F;
          vm.field_c[2] = um.field_d;
          vm.field_c[3] = lj.field_m;
          mj.field_s = new kc(0L, (kc) null);
          uc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          nh.field_z = new kc(0L, vf.field_i, ef.field_q);
          nj.field_m = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          mj.field_s.a(uc.field_d, param14 + 87);
          if (!fc.field_a) {
            break L0;
          } else {
            mj.field_s.a(nh.field_z, 41);
            break L0;
          }
        }
        L1: {
          mj.field_s.a((kc) (Object) nj.field_m, 47);
          nj.field_m.field_Hb.a(pg.field_c, (byte) 126);
          var15 = nj.field_m.field_Hb;
          nj.field_m.field_Hb.field_gb = 1;
          var15.field_X = 1;
          kg.field_c = new kc(0L, pg.field_c);
          kg.field_c.field_X = 1;
          ii.field_b = new kc(0L, th.field_c, ti.field_M.toUpperCase());
          sm.field_c = new kc(0L, wa.field_Pb, hb.field_Ib.toUpperCase());
          ad.field_c = new kc(0L, ia.field_a);
          tj.field_o = new kc(0L, vf.field_u, of.field_k);
          hg.field_e = new kc(0L, rn.field_S, lc.field_c);
          ci.field_a = new kc(0L, rn.field_S, ba.field_c);
          lo.field_r = new kc(0L, rn.field_S, dk.field_h);
          vc.field_j = new kc(0L, rn.field_S, g.field_b);
          jo.field_a = new kc(0L, vf.field_i, kh.field_a);
          ee.field_g = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          of.field_a = new kc(0L, ko.field_h, fi.field_f.toUpperCase());
          of.field_a.field_ub = fc.field_a;
          stackOut_2_0 = null;
          stackOut_2_1 = null;
          stackOut_2_2 = 0L;
          stackOut_2_3 = ko.field_h;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (fc.field_a) {
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (kc) (Object) stackIn_4_3;
            stackOut_4_4 = ga.field_t;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackOut_3_1 = null;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = (kc) (Object) stackIn_3_3;
            stackOut_3_4 = sl.field_K;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        L2: {
          jl.field_a = new kc(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_5_4).toUpperCase());
          fn.field_e = new kc(0L, (kc) null);
          fn.field_e.a(sm.field_c, 23);
          fn.field_e.a(ad.field_c, 36);
          ad.field_c.a(tj.field_o, 106);
          ad.field_c.a(hg.field_e, 50);
          ad.field_c.a(ci.field_a, param14 + 20);
          if (!fc.field_a) {
            break L2;
          } else {
            ad.field_c.a(lo.field_r, 44);
            break L2;
          }
        }
        L3: {
          ad.field_c.a(vc.field_j, param14 + 47);
          ad.field_c.a(jo.field_a, 29);
          ad.field_c.a((kc) (Object) ee.field_g, 124);
          if (!fc.field_a) {
            break L3;
          } else {
            fn.field_e.a(of.field_a, 20);
            break L3;
          }
        }
        L4: {
          fn.field_e.a(jl.field_a, 15);
          la.field_c = new kc(0L, pg.field_c);
          la.field_c.field_gb = 0;
          la.field_c.field_X = 1;
          dm.field_E = new kc(0L, gn.field_c, im.field_f.toUpperCase());
          gm.field_h = new kc(0L, mf.field_d);
          gm.field_h.a(la.field_c, 110);
          gm.field_h.a(dm.field_E, 121);
          vc.field_c = new kc(0L, am.field_c);
          vc.field_c.a(pg.field_c, (byte) 119);
          vc.field_c.field_gb = 1;
          var16 = vc.field_c;
          var16.field_X = 1;
          bk.field_M = new kc(0L, (kc) null);
          aj.field_d = new kc(0L, pg.field_c);
          aj.field_d.field_X = 1;
          qc.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          hf.field_q = new kc(0L, vf.field_i, ef.field_q);
          lf.field_b = new dn(0L, new kc(0L, (kc) null), am.field_c, vn.field_i);
          bk.field_M.a(aj.field_d, 30);
          bk.field_M.a(qc.field_d, 51);
          if (fc.field_a) {
            bk.field_M.a(hf.field_q, param14 + 10);
            break L4;
          } else {
            break L4;
          }
        }
        bk.field_M.a((kc) (Object) lf.field_b, 31);
        mo.field_o = new kc(0L, th.field_c, gb.field_a.toUpperCase());
        nl.field_Db = new kc(0L, wa.field_Pb);
        mi.field_m = new kc(0L, ia.field_a);
        ib.field_s = new kc(0L, dd.field_b, o.field_o.toUpperCase());
        s.field_e = new nl[param2 + 4][];
        wd.field_g = new kc[4 + param2];
        wd.field_g[0] = new kc(0L, mi.field_A, gg.field_i);
        s.field_e[0] = new nl[6];
        var17_int = 0;
        L5: while (true) {
          L6: {
            L7: {
              if (var17_int >= 5) {
                break L7;
              } else {
                s.field_e[0][var17_int + 1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, mo.field_b[var17_int], vm.field_c[var17_int]);
                var17_int++;
                if (var21 != 0) {
                  break L6;
                } else {
                  if (var21 == 0) {
                    continue L5;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (ao.field_h.length < 2) {
                break L8;
              } else {
                wd.field_g[1] = new kc(0L, mi.field_A, w.field_Bb);
                s.field_e[1] = new nl[ao.field_h.length - -1];
                s.field_e[1][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                var17_int = 0;
                L9: while (true) {
                  if (ao.field_h.length <= var17_int) {
                    break L8;
                  } else {
                    s.field_e[1][var17_int - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, Integer.toString(ao.field_h[var17_int]));
                    var17_int++;
                    if (var21 != 0) {
                      break L6;
                    } else {
                      if (var21 == 0) {
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
            }
            wd.field_g[2] = new kc(0L, mi.field_A, gb.field_b);
            s.field_e[param14] = new nl[3];
            break L6;
          }
          L10: {
            L11: {
              if (le.field_q > 1) {
                wd.field_g[3] = new kc(0L, mi.field_A, fm.field_e);
                s.field_e[3] = new nl[le.field_q + 1];
                s.field_e[3][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                var17_int = 0;
                L12: while (true) {
                  if (~var17_int <= ~le.field_q) {
                    break L11;
                  } else {
                    s.field_e[3][1 + var17_int] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, fl.field_b[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                      break L10;
                    } else {
                      if (var21 == 0) {
                        continue L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              } else {
                break L11;
              }
            }
            var17_int = 0;
            break L10;
          }
          L13: while (true) {
            L14: {
              L15: {
                if (~param2 >= ~var17_int) {
                  break L15;
                } else {
                  wd.field_g[var17_int + 4] = new kc(0L, mi.field_A, ob.field_bb[var17_int]);
                  s.field_e[var17_int + 4] = new nl[1 + dg.a((int) gb.field_d[var17_int], 255)];
                  s.field_e[4 - -var17_int][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                  stackOut_33_0 = 0;
                  stackIn_55_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var21 != 0) {
                    break L14;
                  } else {
                    stackOut_34_0 = stackIn_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    var18 = stackIn_35_0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var18 >= (gb.field_d[var17_int] & 255)) {
                            break L18;
                          } else {
                            if (var21 != 0) {
                              break L17;
                            } else {
                              L19: {
                                if (null == pn.field_b) {
                                  stackOut_44_0 = null;
                                  stackIn_45_0 = (qb) (Object) stackOut_44_0;
                                  break L19;
                                } else {
                                  if (null != pn.field_b[var17_int]) {
                                    stackOut_43_0 = pn.field_b[var17_int][var18];
                                    stackIn_45_0 = stackOut_43_0;
                                    break L19;
                                  } else {
                                    stackOut_42_0 = null;
                                    stackIn_45_0 = (qb) (Object) stackOut_42_0;
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                var19_ref_qb = stackIn_45_0;
                                if (lj.field_o == null) {
                                  stackOut_50_0 = null;
                                  stackIn_51_0 = (String) (Object) stackOut_50_0;
                                  break L20;
                                } else {
                                  if (null != lj.field_o[var17_int]) {
                                    stackOut_49_0 = lj.field_o[var17_int][var18];
                                    stackIn_51_0 = stackOut_49_0;
                                    break L20;
                                  } else {
                                    stackOut_48_0 = null;
                                    stackIn_51_0 = (String) (Object) stackOut_48_0;
                                    break L20;
                                  }
                                }
                              }
                              var20_ref = stackIn_51_0;
                              s.field_e[4 + var17_int][var18 - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, var19_ref_qb, var20_ref);
                              var18++;
                              if (var21 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        var17_int++;
                        break L17;
                      }
                      if (var21 == 0) {
                        continue L13;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
              stackOut_54_0 = 0;
              stackIn_55_0 = stackOut_54_0;
              break L14;
            }
            var17_int = stackIn_55_0;
            L21: while (true) {
              L22: {
                L23: {
                  if (~(param2 - -4) >= ~var17_int) {
                    break L23;
                  } else {
                    stackOut_57_0 = wd.field_g[var17_int];
                    stackIn_76_0 = (Object) (Object) stackOut_57_0;
                    stackIn_58_0 = stackOut_57_0;
                    if (var21 != 0) {
                      break L22;
                    } else {
                      L24: {
                        if (stackIn_58_0 != null) {
                          wd.field_g[var17_int].field_z = 11;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (s.field_e[var17_int] != null) {
                          var18 = 0;
                          L26: while (true) {
                            if (~s.field_e[var17_int].length >= ~var18) {
                              break L25;
                            } else {
                              stackOut_66_0 = s.field_e[var17_int][var18];
                              stackIn_76_0 = (Object) (Object) stackOut_66_0;
                              stackIn_67_0 = stackOut_66_0;
                              if (var21 != 0) {
                                break L22;
                              } else {
                                L27: {
                                  if (stackIn_67_0 == null) {
                                    break L27;
                                  } else {
                                    if (s.field_e[var17_int][var18].field_Eb != null) {
                                      s.field_e[var17_int][var18].field_Eb.field_z = 11;
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var18++;
                                if (var21 == 0) {
                                  continue L26;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        } else {
                          break L25;
                        }
                      }
                      var17_int++;
                      if (var21 == 0) {
                        continue L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                go.field_d = new kc(0L, ko.field_h);
                dk.field_k = new kc(0L, ko.field_h);
                jf.field_d = new kc(0L, j.field_f);
                jf.field_d.a(pg.field_c, (byte) 119);
                stackOut_75_0 = jf.field_d;
                stackIn_76_0 = (Object) (Object) stackOut_75_0;
                break L22;
              }
              var17_ref = stackIn_76_0;
              jf.field_d.field_gb = 1;
              ((kc) var17_ref).field_X = 1;
              oh.field_h = new kc(0L, (kc) null);
              oh.field_h.a(nl.field_Db, 19);
              oh.field_h.a(mi.field_m, 49);
              mi.field_m.a(ib.field_s, 98);
              var18 = 0;
              L28: while (true) {
                L29: {
                  L30: {
                    L31: {
                      if (~var18 <= ~(param2 - -4)) {
                        break L31;
                      } else {
                        if (var21 != 0) {
                          break L29;
                        } else {
                          L32: {
                            L33: {
                              if (1 != var18) {
                                break L33;
                              } else {
                                if (2 <= ao.field_h.length) {
                                  break L33;
                                } else {
                                  if (var21 == 0) {
                                    break L32;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                            L34: {
                              if (3 != var18) {
                                break L34;
                              } else {
                                if (1 < le.field_q) {
                                  break L34;
                                } else {
                                  if (var21 == 0) {
                                    break L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            mi.field_m.a(wd.field_g[var18], param14 + 5);
                            var19 = 0;
                            L35: while (true) {
                              if (s.field_e[var18].length <= var19) {
                                break L32;
                              } else {
                                stackOut_93_0 = s.field_e[var18][var19];
                                stackIn_100_0 = (Object) (Object) stackOut_93_0;
                                stackIn_94_0 = stackOut_93_0;
                                if (var21 != 0) {
                                  break L30;
                                } else {
                                  L36: {
                                    if (stackIn_94_0 == null) {
                                      break L36;
                                    } else {
                                      mi.field_m.a((kc) (Object) s.field_e[var18][var19], 92);
                                      break L36;
                                    }
                                  }
                                  var19++;
                                  if (var21 == 0) {
                                    continue L35;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                          var18++;
                          if (var21 == 0) {
                            continue L28;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    oh.field_h.a(go.field_d, 13);
                    oh.field_h.a(dk.field_k, 23);
                    oh.field_h.a(jf.field_d, 110);
                    hf.field_t = new kc(0L, be.field_l, mb.field_O.toUpperCase());
                    stackOut_99_0 = new kc(0L, gn.field_c, f.field_i.toUpperCase());
                    stackIn_100_0 = (Object) (Object) stackOut_99_0;
                    break L30;
                  }
                  gj.field_d = (kc) (Object) stackIn_100_0;
                  break L29;
                }
                return;
              }
            }
          }
        }
    }

    abstract Object e(byte param0);

    final static byte[] a(int param0, byte param1, byte[] param2, int param3) {
        RuntimeException var4 = null;
        byte[] var4_array = null;
        int var5_int = 0;
        rm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3 <= 0) {
                  break L2;
                } else {
                  var4_array = new byte[param0];
                  var5_int = 0;
                  L3: while (true) {
                    L4: {
                      if (~param0 >= ~var5_int) {
                        break L4;
                      } else {
                        var4_array[var5_int] = param2[param3 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4_array = param2;
              break L1;
            }
            L5: {
              var5 = new rm();
              if (param1 == -93) {
                break L5;
              } else {
                nn.a((byte[]) null, (int[]) null, 89, (qb[][]) null, -13, (String[]) null, (String[][]) null, (String[]) null, (eg) null, (byte[]) null, (String[]) null, (String[][]) null, 28, (qb[][]) null, -101);
                break L5;
              }
            }
            var5.c(-23645);
            var5.a((long)(8 * param0), 8, var4_array);
            var6 = new byte[64];
            var5.a((byte) 119, 0, var6);
            stackOut_13_0 = (byte[]) var6;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("nn.A(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    nn(int param0) {
        try {
            ((nn) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nn.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "You are offering to draw.";
        field_p = 15;
        field_m = "Start Game";
        field_s = new eh();
        field_n = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
