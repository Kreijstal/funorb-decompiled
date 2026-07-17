/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class eb {
    int[] field_g;
    int[] field_G;
    int field_H;
    int field_d;
    int field_o;
    static String field_e;
    static int field_A;
    int field_n;
    boolean[] field_I;
    static boolean field_p;
    byte[][] field_z;
    static int[] field_J;
    static ao field_w;
    static String field_L;
    byte[] field_C;
    int field_x;
    int[][] field_O;
    byte[] field_t;
    int field_D;
    int field_q;
    int[][] field_c;
    byte[] field_l;
    int field_K;
    int[] field_a;
    byte[] field_v;
    int[][] field_h;
    int field_b;
    byte[] field_r;
    int field_N;
    int field_P;
    boolean[] field_E;
    int field_F;
    byte field_j;
    int field_u;
    int field_s;
    static cj field_B;
    byte[] field_k;
    int field_f;
    int[] field_m;
    static int field_M;
    static String field_i;
    static String field_y;

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 24 / ((param0 - -12) / 58);
            if (160 == param1) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (param1 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static ja[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        ja[] var1 = new ja[qc.field_v];
        for (var2 = 0; var2 < qc.field_v; var2++) {
            var3 = vj.field_p[var2] * oq.field_w[var2];
            var4 = qp.field_t[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = tp.field_t[tq.b((int) var4[var6], 255)];
            }
            var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var5);
        }
        fd.h((byte) 127);
        return var1;
    }

    final static String a(int param0, boolean param1, boolean param2) {
        if (param2) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                return gm.a(param0, param1, 10, -1);
              }
            }
          }
          return Integer.toString(param0);
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3_int = 0;
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
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String stackIn_67_2 = null;
        String[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String stackIn_73_2 = null;
        int stackIn_85_0 = 0;
        String stackIn_85_1 = null;
        int stackIn_86_0 = 0;
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        String[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String stackOut_71_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_84_0 = 0;
        String stackOut_84_1 = null;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          ho.field_q = param2;
          bq.field_c = true;
          if (ho.field_q == 0) {
            var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
            var4 = 3 + var3_int;
            hq.field_m = new String[var4];
            wd.field_Q = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                v.field_b = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3_int <= var5) {
                    hq.field_m[-3 + var4] = "";
                    hq.field_m[-2 + var4] = p.field_b;
                    wd.field_Q[var4 - 2] = 0;
                    v.field_b[0] = 4;
                    hq.field_m[var4 + -1] = ic.field_f;
                    wd.field_Q[var4 + -1] = 1;
                    v.field_b[1] = 5;
                    break L0;
                  } else {
                    hq.field_m[var5] = cq.field_e[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                wd.field_Q[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (ho.field_q != 1) {
              if (ho.field_q == 2) {
                var3_int = mb.a(uq.field_f, param0, vl.a(ba.field_l, new String[1], 2), cq.field_e, ib.field_b);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var3_int <= var5) {
                      break L4;
                    } else {
                      if (!"<%0>".equals((Object) (Object) cq.field_e[var5])) {
                        var5++;
                        continue L3;
                      } else {
                        var4 = var5;
                        break L4;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    aa.field_n = new String[var4];
                    d.a((Object[]) (Object) cq.field_e, 0, (Object[]) (Object) aa.field_n, 0, var4);
                    ik.field_a = new String[var3_int - var4 - 1];
                    d.a((Object[]) (Object) cq.field_e, var4 + 1, (Object[]) (Object) ik.field_a, 0, var3_int + -var4 + -1);
                    var4 = -1;
                    var3_int = mb.a(uq.field_f, false, vl.a(rn.field_g, new String[1], 2), cq.field_e, ib.field_b);
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) cq.field_e[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L7: {
                          q.field_a = new String[var4];
                          d.a((Object[]) (Object) cq.field_e, 0, (Object[]) (Object) q.field_a, 0, var4);
                          ud.field_N = new String[var3_int + -var4 + -1];
                          d.a((Object[]) (Object) cq.field_e, var4 + 1, (Object[]) (Object) ud.field_N, 0, var3_int + (-var4 + -1));
                          if (aa.field_n.length >= q.field_a.length) {
                            stackOut_55_0 = aa.field_n.length;
                            stackIn_56_0 = stackOut_55_0;
                            break L7;
                          } else {
                            stackOut_54_0 = q.field_a.length;
                            stackIn_56_0 = stackOut_54_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_56_0;
                          if (ud.field_N.length <= ik.field_a.length) {
                            stackOut_58_0 = ik.field_a.length;
                            stackIn_59_0 = stackOut_58_0;
                            break L8;
                          } else {
                            stackOut_57_0 = ud.field_N.length;
                            stackIn_59_0 = stackOut_57_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_59_0;
                        var7 = var6 + var5 + 7;
                        hq.field_m = new String[var7];
                        wd.field_Q = new int[var7];
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            v.field_b = new int[2];
                            wd.field_Q[1] = 0;
                            hq.field_m[1] = rb.field_b;
                            hq.field_m[0] = mq.field_q;
                            hq.field_m[3] = dd.field_e;
                            v.field_b[1] = 2;
                            v.field_b[0] = 5;
                            hq.field_m[2] = cq.field_a;
                            hq.field_m[4] = wj.field_h;
                            hq.field_m[5] = "";
                            wd.field_Q[3] = 1;
                            var8 = 0;
                            L10: while (true) {
                              if (var5 <= var8) {
                                hq.field_m[6 + var5] = null;
                                wd.field_Q[var5 + 6] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var6 <= var8) {
                                    so.field_s = bl.a((byte) 41);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_70_0 = hq.field_m;
                                      stackOut_70_1 = var5 + 7 + var8;
                                      stackIn_72_0 = stackOut_70_0;
                                      stackIn_72_1 = stackOut_70_1;
                                      stackIn_71_0 = stackOut_70_0;
                                      stackIn_71_1 = stackOut_70_1;
                                      if (var8 < ud.field_N.length) {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = ud.field_N[var8];
                                        stackIn_73_0 = stackOut_72_0;
                                        stackIn_73_1 = stackOut_72_1;
                                        stackIn_73_2 = stackOut_72_2;
                                        break L12;
                                      } else {
                                        stackOut_71_0 = (String[]) (Object) stackIn_71_0;
                                        stackOut_71_1 = stackIn_71_1;
                                        stackOut_71_2 = "";
                                        stackIn_73_0 = stackOut_71_0;
                                        stackIn_73_1 = stackOut_71_1;
                                        stackIn_73_2 = stackOut_71_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_73_0[stackIn_73_1] = stackIn_73_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_64_0 = hq.field_m;
                                  stackOut_64_1 = 6 + var8;
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  stackIn_65_0 = stackOut_64_0;
                                  stackIn_65_1 = stackOut_64_1;
                                  if (0 > var8 + (q.field_a.length + -var5)) {
                                    stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = "";
                                    stackIn_67_0 = stackOut_66_0;
                                    stackIn_67_1 = stackOut_66_1;
                                    stackIn_67_2 = stackOut_66_2;
                                    break L13;
                                  } else {
                                    stackOut_65_0 = (String[]) (Object) stackIn_65_0;
                                    stackOut_65_1 = stackIn_65_1;
                                    stackOut_65_2 = q.field_a[var8 - -q.field_a.length + -var5];
                                    stackIn_67_0 = stackOut_65_0;
                                    stackIn_67_1 = stackOut_65_1;
                                    stackIn_67_2 = stackOut_65_2;
                                    break L13;
                                  }
                                }
                                stackIn_67_0[stackIn_67_1] = stackIn_67_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            wd.field_Q[var8] = -1;
                            var8++;
                            continue L9;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              } else {
                if (ho.field_q != 3) {
                  if (ho.field_q == 4) {
                    var3_int = mb.a(uq.field_f, false, on.field_cb, cq.field_e, ib.field_b);
                    var4 = 2 - -var3_int;
                    hq.field_m = new String[var4];
                    wd.field_Q = new int[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= var4) {
                        v.field_b = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var3_int) {
                            hq.field_m[var4 - 2] = "";
                            hq.field_m[var4 - 1] = ic.field_f;
                            wd.field_Q[var4 - 1] = 0;
                            v.field_b[0] = 5;
                            break L0;
                          } else {
                            hq.field_m[var5] = cq.field_e[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        wd.field_Q[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  } else {
                    if (ho.field_q == 5) {
                      var3_int = mb.a(uq.field_f, false, ga.field_t, cq.field_e, ib.field_b);
                      var4 = 3 + var3_int;
                      wd.field_Q = new int[var4];
                      hq.field_m = new String[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var4 <= var5) {
                          v.field_b = new int[2];
                          var5 = 0;
                          L17: while (true) {
                            if (var5 >= var3_int) {
                              hq.field_m[-3 + var4] = "";
                              hq.field_m[-2 + var4] = ei.field_d;
                              wd.field_Q[-2 + var4] = 0;
                              v.field_b[0] = 3;
                              hq.field_m[var4 - 1] = ic.field_f;
                              wd.field_Q[-1 + var4] = 1;
                              v.field_b[1] = 5;
                              break L0;
                            } else {
                              hq.field_m[var5] = cq.field_e[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          wd.field_Q[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                } else {
                  L18: {
                    if (pl.field_J.field_d) {
                      var3_int = mb.a(uq.field_f, param0, hg.field_sb, cq.field_e, ib.field_b);
                      break L18;
                    } else {
                      var3_int = mb.a(uq.field_f, false, aa.field_j, cq.field_e, ib.field_b);
                      break L18;
                    }
                  }
                  var4 = 2 - -var3_int;
                  wd.field_Q = new int[var4];
                  hq.field_m = new String[var4];
                  var5 = 0;
                  L19: while (true) {
                    if (var5 >= var4) {
                      v.field_b = new int[1];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var3_int) {
                          hq.field_m[-2 + var4] = "";
                          hq.field_m[-1 + var4] = ic.field_f;
                          wd.field_Q[-1 + var4] = 0;
                          v.field_b[0] = 5;
                          break L0;
                        } else {
                          hq.field_m[var5] = cq.field_e[var5];
                          var5++;
                          continue L20;
                        }
                      }
                    } else {
                      wd.field_Q[var5] = -1;
                      var5++;
                      continue L19;
                    }
                  }
                }
              }
            } else {
              var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
              var4 = var3_int + 2;
              wd.field_Q = new int[var4];
              hq.field_m = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var4 <= var5) {
                  v.field_b = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var3_int) {
                      hq.field_m[var4 - 2] = "";
                      hq.field_m[var4 - 1] = ic.field_f;
                      wd.field_Q[var4 - 1] = 0;
                      v.field_b[0] = 5;
                      break L0;
                    } else {
                      hq.field_m[var5] = cq.field_e[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  wd.field_Q[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        aq.field_B.field_c = v.field_b.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (hq.field_m.length <= var4) {
            L24: {
              if (ho.field_q != 2) {
                break L24;
              } else {
                var10 = aa.field_n;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = ik.field_a;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = hn.a(0, var13, false);
                          if (var7 <= var3_int) {
                            break L27;
                          } else {
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
                      var7 = hn.a(0, var12, false);
                      if (var3_int < var7) {
                        var3_int = var7;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            qk.field_j = aq.field_B.field_c * (al.field_bb + wk.field_G << 1);
            ZombieDawnMulti.field_H = am.field_c - (var3_int >> 1);
            fl.field_a = -(var3_int >> 1) + (am.field_c - -var3_int);
            var4 = 0;
            L29: while (true) {
              if (hq.field_m.length <= var4) {
                L30: {
                  ce.field_k = bp.field_r - (qk.field_j >> 1);
                  uf.field_b = new int[hq.field_m.length][];
                  if (!param0) {
                    break L30;
                  } else {
                    field_M = -108;
                    break L30;
                  }
                }
                var4 = 0;
                var5 = ce.field_k;
                L31: while (true) {
                  if (var4 >= hq.field_m.length) {
                    L32: {
                      if (ho.field_q != 2) {
                        aq.field_B.a(0, param1, -31458, iq.a(bo.field_d, -1, bd.field_g));
                        break L32;
                      } else {
                        aq.field_B.a(-1, param1, -31458, -1);
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var6 = wd.field_Q[var4];
                      if (var6 < 0) {
                        var5 = var5 + se.field_C;
                        break L33;
                      } else {
                        var7 = hn.a(0, hq.field_m[var4], true);
                        var8 = am.field_c + -(var7 >> 1);
                        var5 = var5 + al.field_bb;
                        uf.field_b[var4] = new int[4];
                        uf.field_b[var4][0] = var8 + -no.field_Gb;
                        uf.field_b[var4][1] = var5;
                        uf.field_b[var4][2] = var7 - -(no.field_Gb << 1);
                        uf.field_b[var4][3] = (wk.field_G << 1) + me.field_h;
                        var5 = var5 + ((wk.field_G << 1) - (-al.field_bb + -me.field_h));
                        break L33;
                      }
                    }
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L34: {
                  stackOut_104_0 = qk.field_j;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (wd.field_Q[var4] >= 0) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = me.field_h;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L34;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = se.field_C;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L34;
                  }
                }
                qk.field_j = stackIn_107_0 + stackIn_107_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L35: {
              stackOut_84_0 = 0;
              stackOut_84_1 = hq.field_m[var4];
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (0 > wd.field_Q[var4]) {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = (String) (Object) stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L35;
              } else {
                stackOut_85_0 = stackIn_85_0;
                stackOut_85_1 = (String) (Object) stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L35;
              }
            }
            L36: {
              var5 = hn.a(stackIn_87_0, stackIn_87_1, stackIn_87_2 != 0);
              if (var3_int < var5) {
                var3_int = var5;
                break L36;
              } else {
                break L36;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    public static void a(boolean param0) {
        field_L = null;
        field_e = null;
        field_w = null;
        field_J = null;
        field_y = null;
        field_i = null;
        field_B = null;
    }

    eb() {
        ((eb) this).field_z = new byte[6][258];
        ((eb) this).field_c = new int[6][258];
        ((eb) this).field_I = new boolean[256];
        ((eb) this).field_O = new int[6][258];
        ((eb) this).field_b = 0;
        ((eb) this).field_l = new byte[18002];
        ((eb) this).field_C = new byte[256];
        ((eb) this).field_t = new byte[18002];
        ((eb) this).field_E = new boolean[16];
        ((eb) this).field_D = 0;
        ((eb) this).field_g = new int[16];
        ((eb) this).field_v = new byte[4096];
        ((eb) this).field_h = new int[6][258];
        ((eb) this).field_G = new int[257];
        ((eb) this).field_a = new int[6];
        ((eb) this).field_m = new int[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Field Marshal";
        field_L = "This game option has not yet been unlocked for use.";
        field_A = 2;
        field_J = new int[8192];
        field_w = new ao(15, 0, 1, 0);
        field_i = "Strong zombie is strong.";
        field_y = "Password is valid";
    }
}
