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
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackOut_4_0 = null;
        String stackOut_14_0 = null;
        L0: {
          L1: {
            var5 = ArcanistsMulti.field_G ? 1 : 0;
            var1 = "(" + ve.field_m + " " + nf.field_W + " " + se.field_I + ") " + on.field_g;
            if (fj.field_h > 0) {
              var1 = var1 + ":";
              var2 = 0;
              L2: while (true) {
                if (var2 >= fj.field_h) {
                  break L1;
                } else {
                  stackOut_4_0 = var1 + 32;
                  stackIn_15_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        var1 = stackIn_5_0;
                        var3 = 255 & df.field_z.field_j[var2];
                        var4 = var3 >> 4;
                        var3 = var3 & 15;
                        if (var4 < 10) {
                          break L4;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 += 48;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (var3 >= 10) {
                          break L6;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 += 55;
                      break L5;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_14_0 = (String) var1;
          stackIn_15_0 = stackOut_14_0;
          break L0;
        }
        return stackIn_15_0;
    }

    public static void c(int param0) {
        field_t = null;
    }

    final static void a(byte[] param0, int[] param1, int param2, qb[][] param3, int param4, String[] param5, String[][] param6, String[] param7, eg param8, byte[] param9, String[] param10, String[][] param11, int param12, qb[][] param13, int param14) {
        Object var17_ref = null;
        kc var16 = null;
        int var17_int = 0;
        kc var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        kc var23 = null;
        kc var24 = null;
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
        int stackIn_51_0 = 0;
        kc stackIn_54_0 = null;
        nl stackIn_62_0 = null;
        Object stackIn_69_0 = null;
        nl stackIn_83_0 = null;
        Object stackIn_88_0 = null;
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
        int stackOut_50_0 = 0;
        int stackOut_33_0 = 0;
        kc stackOut_53_0 = null;
        nl stackOut_61_0 = null;
        kc stackOut_68_0 = null;
        nl stackOut_82_0 = null;
        kc stackOut_87_0 = null;
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
          mj.field_s.a(uc.field_d, -14);
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
          var23 = nj.field_m.field_Hb;
          var24 = var23;
          nj.field_m.field_Hb.field_gb = 1;
          var24.field_X = 1;
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
          ad.field_c.a(ci.field_a, -81);
          if (!fc.field_a) {
            break L2;
          } else {
            ad.field_c.a(lo.field_r, 44);
            break L2;
          }
        }
        L3: {
          ad.field_c.a(vc.field_j, -54);
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
            bk.field_M.a(hf.field_q, -91);
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
            s.field_e[-101] = new nl[3];
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
                  if (var17_int >= le.field_q) {
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
              if (param2 <= var17_int) {
                stackOut_50_0 = 0;
                stackIn_51_0 = stackOut_50_0;
                break L14;
              } else {
                wd.field_g[var17_int + 4] = new kc(0L, mi.field_A, ob.field_bb[var17_int]);
                s.field_e[var17_int + 4] = new nl[1 + dg.a((int) gb.field_d[var17_int], 255)];
                s.field_e[4 - -var17_int][0] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) null, ij.field_Rb);
                stackOut_33_0 = 0;
                stackIn_51_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (var21 != 0) {
                  break L14;
                } else {
                  var18 = stackIn_34_0;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (var18 >= (gb.field_d[var17_int] & 255)) {
                          break L17;
                        } else {
                          if (var21 != 0) {
                            break L16;
                          } else {
                            L18: {
                              if (null == pn.field_b) {
                                var19_ref = null;
                                break L18;
                              } else {
                                if (null != pn.field_b[var17_int]) {
                                  var19_ref = (Object) (Object) pn.field_b[var17_int][var18];
                                  break L18;
                                } else {
                                  var19_ref = null;
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              if (lj.field_o == null) {
                                var20 = null;
                                break L19;
                              } else {
                                if (null != lj.field_o[var17_int]) {
                                  var20 = (Object) (Object) lj.field_o[var17_int][var18];
                                  break L19;
                                } else {
                                  var20 = null;
                                  break L19;
                                }
                              }
                            }
                            s.field_e[4 + var17_int][var18 - -1] = new nl(0L, nf.field_j, (kc) null, nj.field_d, (qb) var19_ref, (String) var20);
                            var18++;
                            if (var21 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      var17_int++;
                      break L16;
                    }
                    continue L13;
                  }
                }
              }
            }
            var17_int = stackIn_51_0;
            L20: while (true) {
              L21: {
                L22: {
                  if (param2 - -4 <= var17_int) {
                    break L22;
                  } else {
                    stackOut_53_0 = wd.field_g[var17_int];
                    stackIn_69_0 = (Object) (Object) stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var21 != 0) {
                      break L21;
                    } else {
                      L23: {
                        if (stackIn_54_0 != null) {
                          wd.field_g[var17_int].field_z = 11;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (s.field_e[var17_int] != null) {
                          var18 = 0;
                          L25: while (true) {
                            if (s.field_e[var17_int].length <= var18) {
                              break L24;
                            } else {
                              stackOut_61_0 = s.field_e[var17_int][var18];
                              stackIn_69_0 = (Object) (Object) stackOut_61_0;
                              stackIn_62_0 = stackOut_61_0;
                              if (var21 != 0) {
                                break L21;
                              } else {
                                L26: {
                                  if (stackIn_62_0 == null) {
                                    break L26;
                                  } else {
                                    if (s.field_e[var17_int][var18].field_Eb != null) {
                                      s.field_e[var17_int][var18].field_Eb.field_z = 11;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var18++;
                                if (var21 == 0) {
                                  continue L25;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        } else {
                          break L24;
                        }
                      }
                      var17_int++;
                      if (var21 == 0) {
                        continue L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                go.field_d = new kc(0L, ko.field_h);
                dk.field_k = new kc(0L, ko.field_h);
                jf.field_d = new kc(0L, j.field_f);
                jf.field_d.a(pg.field_c, (byte) 119);
                stackOut_68_0 = jf.field_d;
                stackIn_69_0 = (Object) (Object) stackOut_68_0;
                break L21;
              }
              var17_ref = stackIn_69_0;
              jf.field_d.field_gb = 1;
              ((kc) var17_ref).field_X = 1;
              oh.field_h = new kc(0L, (kc) null);
              oh.field_h.a(nl.field_Db, 19);
              oh.field_h.a(mi.field_m, 49);
              mi.field_m.a(ib.field_s, 98);
              var18 = 0;
              L27: while (true) {
                L28: {
                  L29: {
                    L30: {
                      if (var18 >= param2 - -4) {
                        break L30;
                      } else {
                        if (var21 != 0) {
                          break L28;
                        } else {
                          L31: {
                            L32: {
                              if (1 != var18) {
                                break L32;
                              } else {
                                if (2 <= ao.field_h.length) {
                                  break L32;
                                } else {
                                  if (var21 == 0) {
                                    break L31;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                            L33: {
                              if (3 != var18) {
                                break L33;
                              } else {
                                if (1 < le.field_q) {
                                  break L33;
                                } else {
                                  if (var21 == 0) {
                                    break L31;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                            mi.field_m.a(wd.field_g[var18], -96);
                            var19 = 0;
                            L34: while (true) {
                              if (s.field_e[var18].length <= var19) {
                                break L31;
                              } else {
                                stackOut_82_0 = s.field_e[var18][var19];
                                stackIn_88_0 = (Object) (Object) stackOut_82_0;
                                stackIn_83_0 = stackOut_82_0;
                                if (var21 != 0) {
                                  break L29;
                                } else {
                                  L35: {
                                    if (stackIn_83_0 == null) {
                                      break L35;
                                    } else {
                                      mi.field_m.a((kc) (Object) s.field_e[var18][var19], 92);
                                      break L35;
                                    }
                                  }
                                  var19++;
                                  if (var21 == 0) {
                                    continue L34;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                            }
                          }
                          var18++;
                          if (var21 == 0) {
                            continue L27;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    oh.field_h.a(go.field_d, 13);
                    oh.field_h.a(dk.field_k, 23);
                    oh.field_h.a(jf.field_d, 110);
                    hf.field_t = new kc(0L, be.field_l, mb.field_O.toUpperCase());
                    stackOut_87_0 = new kc(0L, gn.field_c, f.field_i.toUpperCase());
                    stackIn_88_0 = (Object) (Object) stackOut_87_0;
                    break L29;
                  }
                  gj.field_d = (kc) (Object) stackIn_88_0;
                  break L28;
                }
                return;
              }
            }
          }
        }
    }

    abstract Object e(byte param0);

    final static byte[] a(int param0, byte param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        rm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = param2;
              var5 = new rm();
              if (param1 == -93) {
                break L1;
              } else {
                nn.a((byte[]) null, (int[]) null, 89, (qb[][]) null, -13, (String[]) null, (String[][]) null, (String[]) null, (eg) null, (byte[]) null, (String[]) null, (String[][]) null, 28, (qb[][]) null, -101);
                break L1;
              }
            }
            var5.c(-23645);
            var5.a((long)(8 * param0), 8, var4);
            var6 = new byte[64];
            var5.a((byte) 119, 0, var6);
            stackOut_5_0 = (byte[]) var6;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("nn.A(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 0 + 41);
        }
        return stackIn_6_0;
    }

    nn(int param0) {
        ((nn) this).field_r = param0;
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
