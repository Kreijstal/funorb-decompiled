/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class om extends hl {
    private hl field_Vb;
    private hl field_bc;
    private hl field_Ub;
    static String field_Zb;
    private hl field_Wb;
    private int field_Tb;
    private hl field_Mb;
    private mi field_ac;
    private StringBuilder field_Kb;
    static int[] field_Yb;
    static int field_Nb;
    static int field_Rb;
    private hl field_Sb;
    static String field_Lb;
    private hl[] field_Qb;
    static String field_Pb;
    long field_Ob;
    static String field_Xb;

    final static boolean a(ud param0, byte param1, ud param2) {
        int var4 = TetraLink.field_J;
        int var3 = param0.field_Rb + -param2.field_Rb;
        if (param1 < 98) {
            field_Nb = -127;
        }
        if (ul.field_e == param0.field_Ub) {
            var3 -= 200;
        } else {
            if (!(null != param0.field_Ub)) {
                var3 += 200;
            }
        }
        if (param2.field_Ub == ul.field_e) {
            var3 += 200;
        } else {
            if (param2.field_Ub == null) {
                var3 -= 200;
            }
        }
        return var3 > 0 ? true : false;
    }

    final boolean h(int param0) {
        if (param0 != 5) {
            return true;
        }
        if (!(1 == (((om) this).field_Tb ^ -1))) {
            return false;
        }
        if ((dg.field_e ^ -1) != -14) {
            return true;
        }
        ((om) this).field_Tb = -1;
        return true;
    }

    private final int a(int param0, int param1, hl param2, hl param3, String param4, int param5) {
        hl var7 = new hl(0L, param2, 0, param0, param5, 24, param4);
        param0 += 32;
        param3.a((byte) -89, var7);
        int var8 = 105 / ((param1 - -48) / 59);
        return param0;
    }

    final boolean d(byte param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 85) {
            break L0;
          } else {
            var3 = null;
            om.a(false, true, (String) null, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((om) this).field_ac == null) {
              break L2;
            } else {
              if (!((om) this).field_ac.field_zb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_60_2 = null;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_66_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_59_2 = null;
        String[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        String stackOut_58_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        L0: {
          var9 = TetraLink.field_J;
          f.field_z = param2;
          me.field_d = true;
          if (-1 == (f.field_z ^ -1)) {
            var3 = t.a(uf.field_f, 121, ti.field_b, kn.field_f, dk.field_d);
            var4 = 3 + var3;
            ml.field_mb = new int[var4];
            pj.field_h = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                io.field_g = new int[2];
                var5 = 0;
                L2: while (true) {
                  if ((var5 ^ -1) <= (var3 ^ -1)) {
                    pj.field_h[-3 + var4] = "";
                    pj.field_h[-2 + var4] = ug.field_X;
                    ml.field_mb[-2 + var4] = 0;
                    io.field_g[0] = 4;
                    pj.field_h[var4 + -1] = d.field_a;
                    ml.field_mb[var4 + -1] = 1;
                    io.field_g[1] = 5;
                    break L0;
                  } else {
                    pj.field_h[var5] = kn.field_f[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ml.field_mb[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (f.field_z == 1) {
              var3 = t.a(uf.field_f, -12, ti.field_b, kn.field_f, dk.field_d);
              var4 = var3 + 2;
              ml.field_mb = new int[var4];
              pj.field_h = new String[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  io.field_g = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var3 <= var5) {
                      pj.field_h[var4 - 2] = "";
                      pj.field_h[var4 - 1] = d.field_a;
                      ml.field_mb[var4 - 1] = 0;
                      io.field_g[0] = 5;
                      break L0;
                    } else {
                      pj.field_h[var5] = kn.field_f[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  ml.field_mb[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if (-3 == (f.field_z ^ -1)) {
                var3 = t.a(uf.field_f, param1 ^ -59, sk.a(new String[1], jg.field_g, 126), kn.field_f, dk.field_d);
                var4 = -1;
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      if (!"<%0>".equals((Object) (Object) kn.field_f[var5])) {
                        var5++;
                        continue L5;
                      } else {
                        var4 = var5;
                        break L6;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    fi.field_Ab = new String[var4];
                    rd.a((Object[]) (Object) kn.field_f, 0, (Object[]) (Object) fi.field_Ab, 0, var4);
                    qc.field_db = new String[-var4 + var3 - 1];
                    rd.a((Object[]) (Object) kn.field_f, 1 + var4, (Object[]) (Object) qc.field_db, 0, -1 + (var3 + -var4));
                    var3 = t.a(uf.field_f, param1 ^ -125, sk.a(new String[1], gb.field_p, 124), kn.field_f, dk.field_d);
                    var4 = -1;
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var3 ^ -1) >= (var5 ^ -1)) {
                          break L8;
                        } else {
                          if (!"<%0>".equals((Object) (Object) kn.field_f[var5])) {
                            var5++;
                            continue L7;
                          } else {
                            var4 = var5;
                            break L8;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        L9: {
                          jl.field_b = new String[var4];
                          rd.a((Object[]) (Object) kn.field_f, 0, (Object[]) (Object) jl.field_b, 0, var4);
                          ah.field_j = new String[-1 + (-var4 + var3)];
                          rd.a((Object[]) (Object) kn.field_f, var4 + 1, (Object[]) (Object) ah.field_j, 0, -var4 + (var3 + -1));
                          if ((fi.field_Ab.length ^ -1) > (jl.field_b.length ^ -1)) {
                            stackOut_48_0 = jl.field_b.length;
                            stackIn_49_0 = stackOut_48_0;
                            break L9;
                          } else {
                            stackOut_47_0 = fi.field_Ab.length;
                            stackIn_49_0 = stackOut_47_0;
                            break L9;
                          }
                        }
                        L10: {
                          var5 = stackIn_49_0;
                          if ((qc.field_db.length ^ -1) <= (ah.field_j.length ^ -1)) {
                            stackOut_51_0 = qc.field_db.length;
                            stackIn_52_0 = stackOut_51_0;
                            break L10;
                          } else {
                            stackOut_50_0 = ah.field_j.length;
                            stackIn_52_0 = stackOut_50_0;
                            break L10;
                          }
                        }
                        var6 = stackIn_52_0;
                        var7 = var6 + var5 + 7;
                        ml.field_mb = new int[var7];
                        pj.field_h = new String[var7];
                        var8 = 0;
                        L11: while (true) {
                          if ((var7 ^ -1) >= (var8 ^ -1)) {
                            pj.field_h[1] = wa.field_g;
                            ml.field_mb[1] = 0;
                            io.field_g = new int[2];
                            pj.field_h[0] = o.field_n;
                            ml.field_mb[3] = 1;
                            pj.field_h[5] = "";
                            io.field_g[0] = 5;
                            io.field_g[1] = 2;
                            pj.field_h[4] = bb.field_b;
                            pj.field_h[3] = ho.field_Q;
                            pj.field_h[2] = oi.field_g;
                            var8 = 0;
                            L12: while (true) {
                              if ((var8 ^ -1) <= (var5 ^ -1)) {
                                pj.field_h[var5 + 6] = null;
                                ml.field_mb[var5 + 6] = -2;
                                var8 = 0;
                                L13: while (true) {
                                  if ((var8 ^ -1) <= (var6 ^ -1)) {
                                    tg.field_a = k.a(param1 ^ 10);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_63_0 = pj.field_h;
                                      stackOut_63_1 = var5 + 7 + var8;
                                      stackIn_65_0 = stackOut_63_0;
                                      stackIn_65_1 = stackOut_63_1;
                                      stackIn_64_0 = stackOut_63_0;
                                      stackIn_64_1 = stackOut_63_1;
                                      if ((ah.field_j.length ^ -1) >= (var8 ^ -1)) {
                                        stackOut_65_0 = (String[]) (Object) stackIn_65_0;
                                        stackOut_65_1 = stackIn_65_1;
                                        stackOut_65_2 = "";
                                        stackIn_66_0 = stackOut_65_0;
                                        stackIn_66_1 = stackOut_65_1;
                                        stackIn_66_2 = stackOut_65_2;
                                        break L14;
                                      } else {
                                        stackOut_64_0 = (String[]) (Object) stackIn_64_0;
                                        stackOut_64_1 = stackIn_64_1;
                                        stackOut_64_2 = ah.field_j[var8];
                                        stackIn_66_0 = stackOut_64_0;
                                        stackIn_66_1 = stackOut_64_1;
                                        stackIn_66_2 = stackOut_64_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_57_0 = pj.field_h;
                                  stackOut_57_1 = var8 + 6;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  if (-1 >= (var8 - -jl.field_b.length - var5 ^ -1)) {
                                    stackOut_59_0 = (String[]) (Object) stackIn_59_0;
                                    stackOut_59_1 = stackIn_59_1;
                                    stackOut_59_2 = jl.field_b[-var5 + var8 - -jl.field_b.length];
                                    stackIn_60_0 = stackOut_59_0;
                                    stackIn_60_1 = stackOut_59_1;
                                    stackIn_60_2 = stackOut_59_2;
                                    break L15;
                                  } else {
                                    stackOut_58_0 = (String[]) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = "";
                                    stackIn_60_0 = stackOut_58_0;
                                    stackIn_60_1 = stackOut_58_1;
                                    stackIn_60_2 = stackOut_58_2;
                                    break L15;
                                  }
                                }
                                stackIn_60_0[stackIn_60_1] = stackIn_60_2;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            ml.field_mb[var8] = -1;
                            var8++;
                            continue L11;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              } else {
                if ((f.field_z ^ -1) == -4) {
                  L16: {
                    if (!nd.field_Pb.field_e) {
                      var3 = t.a(uf.field_f, -103, wn.field_v, kn.field_f, dk.field_d);
                      break L16;
                    } else {
                      var3 = t.a(uf.field_f, 119, lc.field_b, kn.field_f, dk.field_d);
                      break L16;
                    }
                  }
                  var4 = var3 + 2;
                  pj.field_h = new String[var4];
                  ml.field_mb = new int[var4];
                  var5 = 0;
                  L17: while (true) {
                    if ((var5 ^ -1) <= (var4 ^ -1)) {
                      io.field_g = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var5 >= var3) {
                          pj.field_h[-2 + var4] = "";
                          pj.field_h[-1 + var4] = d.field_a;
                          ml.field_mb[var4 + -1] = 0;
                          io.field_g[0] = 5;
                          break L0;
                        } else {
                          pj.field_h[var5] = kn.field_f[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      ml.field_mb[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                } else {
                  if (f.field_z == 4) {
                    var3 = t.a(uf.field_f, -72, am.field_c, kn.field_f, dk.field_d);
                    var4 = var3 + 2;
                    ml.field_mb = new int[var4];
                    pj.field_h = new String[var4];
                    var5 = 0;
                    L19: while (true) {
                      if (var4 <= var5) {
                        io.field_g = new int[1];
                        var5 = 0;
                        L20: while (true) {
                          if ((var3 ^ -1) >= (var5 ^ -1)) {
                            pj.field_h[var4 - 2] = "";
                            pj.field_h[-1 + var4] = d.field_a;
                            ml.field_mb[-1 + var4] = 0;
                            io.field_g[0] = 5;
                            break L0;
                          } else {
                            pj.field_h[var5] = kn.field_f[var5];
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        ml.field_mb[var5] = -1;
                        var5++;
                        continue L19;
                      }
                    }
                  } else {
                    if ((f.field_z ^ -1) != -6) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = t.a(uf.field_f, param1 ^ -91, km.field_p, kn.field_f, dk.field_d);
                      var4 = var3 + 3;
                      ml.field_mb = new int[var4];
                      pj.field_h = new String[var4];
                      var5 = 0;
                      L21: while (true) {
                        if ((var5 ^ -1) <= (var4 ^ -1)) {
                          io.field_g = new int[2];
                          var5 = 0;
                          L22: while (true) {
                            if ((var3 ^ -1) >= (var5 ^ -1)) {
                              pj.field_h[-3 + var4] = "";
                              pj.field_h[-2 + var4] = mm.field_q;
                              ml.field_mb[-2 + var4] = 0;
                              io.field_g[0] = 3;
                              pj.field_h[-1 + var4] = d.field_a;
                              ml.field_mb[var4 + -1] = 1;
                              io.field_g[1] = 5;
                              break L0;
                            } else {
                              pj.field_h[var5] = kn.field_f[var5];
                              var5++;
                              continue L22;
                            }
                          }
                        } else {
                          ml.field_mb[var5] = -1;
                          var5++;
                          continue L21;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        gm.field_h.field_g = io.field_g.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if ((pj.field_h.length ^ -1) >= (var4 ^ -1)) {
            L24: {
              if (2 == f.field_z) {
                var10 = fi.field_Ab;
                var5 = 0;
                L25: while (true) {
                  if ((var10.length ^ -1) >= (var5 ^ -1)) {
                    var11 = qc.field_db;
                    var5 = 0;
                    L26: while (true) {
                      if ((var11.length ^ -1) >= (var5 ^ -1)) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = fi.a(false, var13, (byte) -106);
                          if ((var3 ^ -1) <= (var7 ^ -1)) {
                            break L27;
                          } else {
                            var3 = var7;
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = fi.a(false, var12, (byte) -111);
                      if (var7 <= var3) {
                        break L28;
                      } else {
                        var3 = var7;
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            lg.field_X = (mn.field_c + da.field_e << -1977270687) * gm.field_h.field_g;
            ia.field_K = -(var3 >> -1612166463) + var3 + vg.field_Lb;
            lb.field_V = vg.field_Lb - (var3 >> 151106721);
            var4 = 0;
            L29: while (true) {
              if ((var4 ^ -1) <= (pj.field_h.length ^ -1)) {
                pj.field_e = dh.field_i - (lg.field_X >> 549162945);
                bl.field_Ob = new int[pj.field_h.length][];
                if (param1 == 10) {
                  var4 = 0;
                  var5 = pj.field_e;
                  L30: while (true) {
                    if (var4 >= pj.field_h.length) {
                      L31: {
                        if ((f.field_z ^ -1) == -3) {
                          gm.field_h.a(-1, -1, param0, 101);
                          break L31;
                        } else {
                          gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), 0, param0, 99);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = ml.field_mb[var4];
                        if ((var6 ^ -1) > -1) {
                          var5 = var5 + la.field_e;
                          break L32;
                        } else {
                          var7 = fi.a(true, pj.field_h[var4], (byte) -83);
                          var8 = -(var7 >> -915475423) + vg.field_Lb;
                          var5 = var5 + mn.field_c;
                          bl.field_Ob[var4] = new int[4];
                          bl.field_Ob[var4][0] = var8 + -io.field_a;
                          bl.field_Ob[var4][1] = var5;
                          bl.field_Ob[var4][2] = var7 - -(io.field_a << -142131391);
                          bl.field_Ob[var4][3] = (da.field_e << -341530111) + bj.field_d;
                          var5 = var5 + ((da.field_e << 2078700769) + mn.field_c - -bj.field_d);
                          break L32;
                        }
                      }
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L33: {
                  stackOut_104_0 = lg.field_X;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if ((ml.field_mb[var4] ^ -1) <= -1) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = bj.field_d;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L33;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = la.field_e;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L33;
                  }
                }
                lg.field_X = stackIn_107_0 + stackIn_107_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              if (ml.field_mb[var4] < 0) {
                stackOut_86_0 = 0;
                stackIn_87_0 = stackOut_86_0;
                break L34;
              } else {
                stackOut_85_0 = 1;
                stackIn_87_0 = stackOut_85_0;
                break L34;
              }
            }
            L35: {
              var5 = fi.a(stackIn_87_0 != 0, pj.field_h[var4], (byte) -77);
              if (var3 >= var5) {
                break L35;
              } else {
                var3 = var5;
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    final String e(byte param0) {
        int var2 = -124 % ((-17 - param0) / 43);
        return ((om) this).field_Kb.toString();
    }

    om(int param0, int param1, int param2, int param3, int param4, hl param5, hl param6, hl param7, hl param8, mi param9, hl param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        hl[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hl[] var28 = null;
        Object stackIn_5_0 = null;
        mi stackIn_5_1 = null;
        mi stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        mi stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        mi stackIn_6_1 = null;
        mi stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        mi stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        mi stackIn_7_1 = null;
        mi stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        mi stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        mi stackIn_8_1 = null;
        mi stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        mi stackIn_8_4 = null;
        String stackIn_8_5 = null;
        hl stackIn_14_0 = null;
        hl stackIn_15_0 = null;
        hl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_4_0 = null;
        mi stackOut_4_1 = null;
        mi stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        mi stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        mi stackOut_5_1 = null;
        mi stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        mi stackOut_5_4 = null;
        Object stackOut_7_0 = null;
        mi stackOut_7_1 = null;
        mi stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        mi stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_6_0 = null;
        mi stackOut_6_1 = null;
        mi stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        mi stackOut_6_4 = null;
        String stackOut_6_5 = null;
        hl stackOut_13_0 = null;
        hl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          ((om) this).field_Tb = -2;
          ((om) this).field_Ob = param12;
          ((om) this).field_Ub = new hl(0L, param6, da.field_h.toUpperCase());
          ((om) this).field_Ub.field_xb = 1;
          ((om) this).a((byte) 43, ((om) this).field_Ub);
          ((om) this).field_Wb = new hl(0L, param7);
          ((om) this).field_Ub.a((byte) 106, ((om) this).field_Wb);
          ((om) this).field_Mb = new hl(0L, (hl) null);
          ((om) this).a((byte) 19, ((om) this).field_Mb);
          if (param11 != null) {
            L1: {
              L2: {
                ((om) this).field_Vb = new hl(0L, param8, gi.field_b);
                ((om) this).field_Vb.field_N = 11184810;
                ((om) this).field_Vb.field_xb = 1;
                ((om) this).field_Mb.a((byte) -94, ((om) this).field_Vb);
                ((om) this).field_Sb = new hl(0L, param8, kb.field_p);
                ((om) this).field_Sb.field_xb = 1;
                ((om) this).field_Sb.field_N = 11184810;
                ((om) this).field_Mb.a((byte) 100, ((om) this).field_Sb);
                ((om) this).field_bc = new hl(0L, param8);
                ((om) this).field_bc.field_N = 16764006;
                ((om) this).field_Mb.a((byte) -120, ((om) this).field_bc);
                ((om) this).field_bc.field_O = "|";
                if (5 <= mb.field_z) {
                  break L2;
                } else {
                  if ((dd.field_c ^ -1) > -3) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_4_0 = this;
                  stackOut_4_1 = null;
                  stackOut_4_2 = null;
                  stackOut_4_3 = 0L;
                  stackOut_4_4 = (mi) param9;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (7 <= mb.field_z) {
                    break L4;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = (mi) (Object) stackIn_5_4;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (2 > dd.field_c) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = null;
                      stackOut_7_2 = null;
                      stackOut_7_3 = stackIn_7_3;
                      stackOut_7_4 = (mi) (Object) stackIn_7_4;
                      stackOut_7_5 = lg.field_I;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      stackIn_8_5 = stackOut_7_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = null;
                stackOut_6_2 = null;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (mi) (Object) stackIn_6_4;
                stackOut_6_5 = ja.field_e;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                break L3;
              }
              ((om) this).field_ac = new mi(stackIn_8_3, stackIn_8_4, stackIn_8_5);
              ((om) this).field_Mb.a((byte) 19, (hl) (Object) ((om) this).field_ac);
              break L1;
            }
            var28 = new hl[3];
            var15 = var28;
            var28[0] = new hl(0L, (hl) null);
            ((om) this).field_Mb.a((byte) 106, var28[0]);
            var28[1] = new hl(0L, (hl) null);
            ((om) this).field_Mb.a((byte) -88, var28[1]);
            var28[2] = new hl(0L, (hl) null);
            ((om) this).field_Mb.a((byte) 57, var28[2]);
            ((om) this).field_Qb = new hl[co.field_q];
            var16 = 0;
            L5: while (true) {
              if (var16 >= co.field_q) {
                L6: {
                  ((om) this).field_Kb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((om) this).field_Kb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_Ib.b(wl.field_b);
                  if (var16 >= var17) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_Ib.b(la.field_j);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_Ib.b(me.field_f);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (co.field_q <= var17) {
                    L11: {
                      if (-141 <= (var16 ^ -1)) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(var18, -124, param6, var28[0], wl.field_b, var16);
                      var18 = this.a(-50, ((om) this).field_Qb[6], var18, var28[0], var16);
                      var18 = this.a(-113, ((om) this).field_Qb[9], var18, var28[0], var16);
                      var18 = this.a(-119, ((om) this).field_Qb[5], var18, var28[0], var16);
                      var18 = this.a(-107, ((om) this).field_Qb[7], var18, var28[0], var16);
                      var18 = this.a(-56, ((om) this).field_Qb[15], var18, var28[0], var16);
                      var18 = this.a(-51, ((om) this).field_Qb[4], var18, var28[0], var16);
                      if (var17 >= var18) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var18, -127, param6, var28[1], la.field_j, var16);
                      var18 = this.a(-116, ((om) this).field_Qb[16], var18, var28[1], var16);
                      var18 = this.a(-103, ((om) this).field_Qb[17], var18, var28[1], var16);
                      var18 = this.a(-80, ((om) this).field_Qb[18], var18, var28[1], var16);
                      var18 = this.a(-38, ((om) this).field_Qb[19], var18, var28[1], var16);
                      var18 = this.a(-35, ((om) this).field_Qb[20], var18, var28[1], var16);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var18, 102, param6, var28[2], me.field_f, var16);
                      var18 = this.a(-122, ((om) this).field_Qb[13], var18, var28[2], var16);
                      var18 = this.a(-74, ((om) this).field_Qb[21], var18, var28[2], var16);
                      var18 = this.a(-41, ((om) this).field_Qb[11], var18, var28[2], var16);
                      if (var18 <= var17) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + 3 * var16;
                      var20 = ((om) this).field_Ub.f(-40);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((om) this).field_ac) {
                        break L16;
                      } else {
                        var20 = ((om) this).field_ac.e(-122, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((om) this).field_Ub.a((byte) -111, 13 - -var19 - -13, 0, 24, 0);
                      ((om) this).field_Wb.a((byte) -109, 15, 5, 15, -20 + ((om) this).field_Ub.field_Hb);
                      var21 = 10;
                      ((om) this).field_Vb.a((byte) -125, var19, var21, qe.field_d * 2, 13);
                      var21 = var21 + qe.field_d * 2;
                      ((om) this).field_Sb.a((byte) -127, var19, var21, 2 * qe.field_d, 13);
                      var21 = var21 + (qe.field_d * 2 - -10);
                      ((om) this).field_bc.a((byte) -79, 0, var21, qe.field_d, 0);
                      var21 = var21 + (qe.field_d + 10);
                      if (((om) this).field_ac == null) {
                        break L17;
                      } else {
                        var20 = ((om) this).field_ac.e(-127, 4);
                        ((om) this).field_ac.a((-var20 + var19) / 2 + 13, var20, 3, qe.field_d, 4, var21);
                        var21 = var21 + (10 + qe.field_d);
                        break L17;
                      }
                    }
                    var28[0].a((byte) -103, var16, var21, var17, 13);
                    var28[1].a((byte) -92, var16, var21, var17, var16 + 13 - -13);
                    var28[2].a((byte) -79, var16, var21, var17, 13 + var16 * 2 + 26);
                    var22 = var21;
                    ((om) this).field_Mb.a((byte) -90, var19 + 13 + 13, 24, 10 + (var22 - -var17), 0);
                    ((om) this).field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, ((om) this).field_Mb.field_R);
                    var23 = 13 + var19 + 13;
                    var24 = var17 + (var22 + 24 - -10);
                    var25 = eo.a(var23, (byte) 97, param0, param2);
                    var26 = mh.a(param3, param1, var24, -8748);
                    ((om) this).a((byte) -85, var23, var26, var24, var25);
                    break L0;
                  } else {
                    if (null != ((om) this).field_Qb[var17]) {
                      var18 = ((om) this).field_Qb[var17].f(-82);
                      if (var18 > var16) {
                        var16 = var18;
                        var17++;
                        continue L10;
                      } else {
                        var17++;
                        continue L10;
                      }
                    } else {
                      var17++;
                      continue L10;
                    }
                  }
                }
              } else {
                if (null != bb.field_d[var16]) {
                  L18: {
                    ((om) this).field_Qb[var16] = new hl(0L, param10, bb.field_d[var16]);
                    ((om) this).field_Qb[var16].field_xb = 0;
                    stackOut_13_0 = ((om) this).field_Qb[var16];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (param11 == null) {
                      stackOut_15_0 = (hl) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L18;
                    } else {
                      stackOut_14_0 = (hl) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L18;
                    }
                  }
                  stackIn_16_0.field_S = stackIn_16_1 != 0;
                  ((om) this).field_Mb.a((byte) 106, ((om) this).field_Qb[var16]);
                  var16++;
                  continue L5;
                } else {
                  var16++;
                  continue L5;
                }
              }
            }
          } else {
            ((om) this).field_Vb = new hl(0L, param8, lo.field_d);
            ((om) this).field_Vb.field_xb = 1;
            ((om) this).field_Vb.field_N = 11184810;
            ((om) this).field_Mb.a((byte) -105, ((om) this).field_Vb);
            var15_int = 226;
            var16 = 10;
            var17 = ((om) this).field_Vb.field_Ib.c(((om) this).field_Vb.field_jb, var15_int);
            ((om) this).field_Vb.a((byte) -114, var15_int, var16, qe.field_d * var17, 13);
            var16 = var16 + qe.field_d * var17;
            ((om) this).field_Mb.a((byte) -99, 13 + var15_int + 13, 24, var16 + 10, 0);
            ((om) this).field_Mb.field_Eb = ah.a(2105376, 3, 8421504, 16, 11579568, ((om) this).field_Mb.field_R);
            var18 = 13 + (var15_int + 13);
            var19 = 34 - -var16;
            var20 = eo.a(var18, (byte) 89, param0, param2);
            var21 = mh.a(param3, param1, var19, -8748);
            ((om) this).a((byte) -116, var18, var21, var19, var20);
            break L0;
          }
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            bc var4 = null;
            bc var5 = null;
            if (cf.field_p == null) {
                cf.field_p = oi.field_l.a(ko.field_t, pd.field_r, (byte) 104);
            }
            if (param1 > -37) {
                return true;
            }
            if (!(0 != cf.field_p.field_d)) {
                return false;
            }
            long dupTemp$0 = k.a(0);
            rj.field_n = dupTemp$0;
            sj.field_k = dupTemp$0;
            if (-2 != (cf.field_p.field_d ^ -1)) {
                qi.field_p = hg.field_d;
            } else {
                try {
                    wa.field_e = new fl((java.net.Socket) cf.field_p.field_f, oi.field_l);
                    var4 = kb.field_q;
                    var5 = var4;
                    nd.field_Lb.field_t = 0;
                    mh.field_g = param0 ? -2 : -1;
                    lk.field_sb = param0 ? -2 : -1;
                    md.field_A = param0 ? -2 : -1;
                    var5.field_t = 0;
                    qi.field_p = bc.field_z;
                    je.a(-85, wg.field_c, (bh) (Object) nd.field_Lb, wc.field_I, rl.field_a);
                    ak.a((byte) -60, -1);
                } catch (IOException iOException) {
                    qi.field_p = hg.field_d;
                }
            }
            cf.field_p = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, hl param1, int param2, hl param3, int param4) {
        if (param0 > -31) {
            return -86;
        }
        param2 += 8;
        int var6 = param1.field_Ib.b(param1.field_jb, param4 - param1.field_V * 2, param1.field_Q);
        param1.a((byte) -86, param4, param2, var6, 0);
        param2 = param2 + (0 + var6);
        param3.a((byte) -96, param1);
        return param2;
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        mi stackIn_6_0 = null;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hl stackIn_14_0 = null;
        hl stackIn_15_0 = null;
        hl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        mi stackOut_5_0 = null;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        mi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        hl stackOut_13_0 = null;
        hl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hl stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = TetraLink.field_J;
          ((om) this).a(0, param0);
          if (null != ((om) this).field_bc) {
            L1: {
              ((om) this).field_bc.field_jb = ((om) this).field_Kb.toString();
              ((om) this).field_bc.field_M = (((om) this).field_Hb + -((om) this).field_bc.field_Ib.b(((om) this).field_bc.field_jb)) / 2;
              if (null != ((om) this).field_ac) {
                if (((om) this).field_ac.field_F == 0) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = ((om) this).field_ac;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((om) this).field_ac.field_zb) {
                      stackOut_7_0 = (mi) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (mi) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_zb = stackIn_8_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            ((om) this).field_bc.field_Hb = ((om) this).field_Hb + -((om) this).field_bc.field_M;
            var3 = 0;
            L3: while (true) {
              if (var3 >= co.field_q) {
                break L0;
              } else {
                if (null != ((om) this).field_Qb[var3]) {
                  L4: {
                    stackOut_13_0 = ((om) this).field_Qb[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (-1 <= ((om) this).field_Kb.length()) {
                      stackOut_15_0 = (hl) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (hl) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_S = stackIn_16_1 != 0;
                  if (((om) this).field_Qb[var3].field_S) {
                    if (-1 != ((om) this).field_Qb[var3].field_F) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (!param1) {
            break L5;
          } else {
            field_Xb = null;
            break L5;
          }
        }
        if (((om) this).field_Wb.field_F != 0) {
          return -1;
        } else {
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (-1 == (tm.field_t ^ -1)) {
                break L6;
              } else {
                if (0 == ((om) this).field_F) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          return ((om) this).field_Tb;
        }
    }

    final static void a(boolean param0, boolean param1, String param2, String param3) {
        mk.field_d = param3;
        ll.field_w = param2;
        uf.a(ec.field_d, param1, param0);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          if (param0) {
            if (lb.field_P[param3] >= lb.field_P[param1]) {
              if (lb.field_P[param1] >= lb.field_P[param3]) {
                if (fe.field_b[param3] < fe.field_b[param1]) {
                  return true;
                } else {
                  if (fe.field_b[param1] >= fe.field_b[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (fe.field_b[param1] > fe.field_b[param3]) {
              return true;
            } else {
              if (fe.field_b[param1] < fe.field_b[param3]) {
                return false;
              } else {
                if (lb.field_P[param3] >= lb.field_P[param1]) {
                  if (lb.field_P[param1] >= lb.field_P[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
        L1: {
          if (param2 >= 112) {
            break L1;
          } else {
            boolean discarded$1 = om.a(false, -3, -111, 88);
            break L1;
          }
        }
        var4 = ac.field_b[param3] - -ai.field_g[param3] - -gl.field_n[param3];
        var5 = ai.field_g[param1] + (ac.field_b[param1] - -gl.field_n[param1]);
        if (var5 > var4) {
          return true;
        } else {
          if (var5 < var4) {
            return false;
          } else {
            L2: {
              if (param1 <= param3) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L2;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L2;
              }
            }
            return stackIn_31_0 != 0;
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          if (!Character.isISOControl(param0)) {
            if (!ka.a(65, param0)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (95 != param0) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_Yb = null;
        }
        field_Xb = null;
        field_Yb = null;
        field_Zb = null;
        field_Pb = null;
        field_Lb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Yes";
        field_Pb = "Confirm Email:";
        field_Lb = "Mouse over an icon for details";
        field_Xb = "Waiting for <%0> to start the game...";
    }
}
