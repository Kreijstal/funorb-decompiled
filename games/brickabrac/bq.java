/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bq {
    static String field_a;
    static ck field_b;
    static int field_d;
    static jp[] field_c;
    static String field_f;
    static jp[][] field_e;

    public static void a(boolean param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        return go.a(param4, param3, false, param1, param2, true);
    }

    final static km a(int param0, int param1) {
        return pg.field_k[param0];
    }

    final static void a(boolean param0, int param1, byte param2) {
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
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String stackIn_82_2 = null;
        int stackIn_90_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String stackOut_75_2 = null;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          ik.field_j = true;
          ih.field_p = param1;
          if (0 != ih.field_p) {
            if (1 != ih.field_p) {
              if (2 == ih.field_p) {
                var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(ge.field_x, new String[1], (byte) 103));
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3_int) {
                      break L2;
                    } else {
                      if ("<%0>".equals((Object) (Object) kg.field_h[var5])) {
                        var4 = var5;
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  if (-1 == var4) {
                    throw new IllegalStateException();
                  } else {
                    rg.field_k = new String[var4];
                    pm.a((Object[]) (Object) kg.field_h, 0, (Object[]) (Object) rg.field_k, 0, var4);
                    h.field_F = new String[-1 + -var4 + var3_int];
                    pm.a((Object[]) (Object) kg.field_h, 1 + var4, (Object[]) (Object) h.field_F, 0, -1 + (-var4 + var3_int));
                    var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(u.field_e, new String[1], (byte) 103));
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if (!"<%0>".equals((Object) (Object) kg.field_h[var5])) {
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
                        L5: {
                          ik.field_b = new String[var4];
                          pm.a((Object[]) (Object) kg.field_h, 0, (Object[]) (Object) ik.field_b, 0, var4);
                          fk.field_h = new String[var3_int - (var4 - -1)];
                          pm.a((Object[]) (Object) kg.field_h, var4 - -1, (Object[]) (Object) fk.field_h, 0, -1 + (var3_int - var4));
                          if (ik.field_b.length > rg.field_k.length) {
                            stackOut_64_0 = ik.field_b.length;
                            stackIn_65_0 = stackOut_64_0;
                            break L5;
                          } else {
                            stackOut_63_0 = rg.field_k.length;
                            stackIn_65_0 = stackOut_63_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_65_0;
                          if (fk.field_h.length <= h.field_F.length) {
                            stackOut_67_0 = h.field_F.length;
                            stackIn_68_0 = stackOut_67_0;
                            break L6;
                          } else {
                            stackOut_66_0 = fk.field_h.length;
                            stackIn_68_0 = stackOut_66_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_68_0;
                        var7 = var6 + (var5 + 7);
                        BrickABrac.field_K = new int[var7];
                        qh.field_i = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            qh.field_i[0] = dg.field_k;
                            qh.field_i[1] = c.field_c;
                            BrickABrac.field_K[1] = 0;
                            ri.field_I = new int[2];
                            BrickABrac.field_K[3] = 1;
                            ri.field_I[1] = 2;
                            qh.field_i[4] = u.field_f;
                            ri.field_I[0] = 5;
                            qh.field_i[2] = rf.field_e;
                            qh.field_i[5] = "";
                            qh.field_i[3] = di.field_c;
                            var8 = 0;
                            L8: while (true) {
                              if (var8 >= var5) {
                                qh.field_i[6 + var5] = null;
                                BrickABrac.field_K[6 + var5] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var6) {
                                    un.field_g = ue.a(false);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_79_0 = qh.field_i;
                                      stackOut_79_1 = 7 + (var5 + var8);
                                      stackIn_81_0 = stackOut_79_0;
                                      stackIn_81_1 = stackOut_79_1;
                                      stackIn_80_0 = stackOut_79_0;
                                      stackIn_80_1 = stackOut_79_1;
                                      if (fk.field_h.length <= var8) {
                                        stackOut_81_0 = (String[]) (Object) stackIn_81_0;
                                        stackOut_81_1 = stackIn_81_1;
                                        stackOut_81_2 = "";
                                        stackIn_82_0 = stackOut_81_0;
                                        stackIn_82_1 = stackOut_81_1;
                                        stackIn_82_2 = stackOut_81_2;
                                        break L10;
                                      } else {
                                        stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = fk.field_h[var8];
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        stackIn_82_2 = stackOut_80_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_82_0[stackIn_82_1] = stackIn_82_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_73_0 = qh.field_i;
                                  stackOut_73_1 = 6 - -var8;
                                  stackIn_75_0 = stackOut_73_0;
                                  stackIn_75_1 = stackOut_73_1;
                                  stackIn_74_0 = stackOut_73_0;
                                  stackIn_74_1 = stackOut_73_1;
                                  if (0 > var8 - (-ik.field_b.length - -var5)) {
                                    stackOut_75_0 = (String[]) (Object) stackIn_75_0;
                                    stackOut_75_1 = stackIn_75_1;
                                    stackOut_75_2 = "";
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    stackIn_76_2 = stackOut_75_2;
                                    break L11;
                                  } else {
                                    stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = ik.field_b[-var5 + (ik.field_b.length + var8)];
                                    stackIn_76_0 = stackOut_74_0;
                                    stackIn_76_1 = stackOut_74_1;
                                    stackIn_76_2 = stackOut_74_2;
                                    break L11;
                                  }
                                }
                                stackIn_76_0[stackIn_76_1] = stackIn_76_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            BrickABrac.field_K[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (3 == ih.field_p) {
                  L12: {
                    if (lp.field_ub.field_i) {
                      var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, ff.field_a);
                      break L12;
                    } else {
                      var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, df.field_d);
                      break L12;
                    }
                  }
                  var4 = 2 + var3_int;
                  qh.field_i = new String[var4];
                  BrickABrac.field_K = new int[var4];
                  var5 = 0;
                  L13: while (true) {
                    if (var4 <= var5) {
                      ri.field_I = new int[1];
                      var5 = 0;
                      L14: while (true) {
                        if (var5 >= var3_int) {
                          qh.field_i[var4 - 2] = "";
                          qh.field_i[var4 - 1] = oi.field_a;
                          BrickABrac.field_K[-1 + var4] = 0;
                          ri.field_I[0] = 5;
                          break L0;
                        } else {
                          qh.field_i[var5] = kg.field_h[var5];
                          var5++;
                          continue L14;
                        }
                      }
                    } else {
                      BrickABrac.field_K[var5] = -1;
                      var5++;
                      continue L13;
                    }
                  }
                } else {
                  if (ih.field_p == 4) {
                    var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, oo.field_s);
                    var4 = var3_int + 2;
                    qh.field_i = new String[var4];
                    BrickABrac.field_K = new int[var4];
                    var5 = 0;
                    L15: while (true) {
                      if (var4 <= var5) {
                        ri.field_I = new int[1];
                        var5 = 0;
                        L16: while (true) {
                          if (var3_int <= var5) {
                            qh.field_i[var4 - 2] = "";
                            qh.field_i[var4 + -1] = oi.field_a;
                            BrickABrac.field_K[-1 + var4] = 0;
                            ri.field_I[0] = 5;
                            break L0;
                          } else {
                            qh.field_i[var5] = kg.field_h[var5];
                            var5++;
                            continue L16;
                          }
                        }
                      } else {
                        BrickABrac.field_K[var5] = -1;
                        var5++;
                        continue L15;
                      }
                    }
                  } else {
                    if (ih.field_p == 5) {
                      var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, eo.field_h);
                      var4 = 3 + var3_int;
                      BrickABrac.field_K = new int[var4];
                      qh.field_i = new String[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var5 >= var4) {
                          ri.field_I = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var3_int <= var5) {
                              qh.field_i[var4 - 3] = "";
                              qh.field_i[var4 - 2] = ja.field_b;
                              BrickABrac.field_K[var4 + -2] = 0;
                              ri.field_I[0] = 3;
                              qh.field_i[var4 + -1] = oi.field_a;
                              BrickABrac.field_K[-1 + var4] = 1;
                              ri.field_I[1] = 5;
                              break L0;
                            } else {
                              qh.field_i[var5] = kg.field_h[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          BrickABrac.field_K[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              }
            } else {
              var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, up.field_x);
              var4 = 2 - -var3_int;
              BrickABrac.field_K = new int[var4];
              qh.field_i = new String[var4];
              var5 = 0;
              L19: while (true) {
                if (var5 >= var4) {
                  ri.field_I = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3_int) {
                      qh.field_i[var4 - 2] = "";
                      qh.field_i[-1 + var4] = oi.field_a;
                      BrickABrac.field_K[-1 + var4] = 0;
                      ri.field_I[0] = 5;
                      break L0;
                    } else {
                      qh.field_i[var5] = kg.field_h[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  BrickABrac.field_K[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, up.field_x);
            var4 = 3 + var3_int;
            BrickABrac.field_K = new int[var4];
            qh.field_i = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                ri.field_I = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3_int) {
                    qh.field_i[var4 + -3] = "";
                    qh.field_i[var4 + -2] = g.field_q;
                    BrickABrac.field_K[var4 - 2] = 0;
                    ri.field_I[0] = 4;
                    qh.field_i[-1 + var4] = oi.field_a;
                    BrickABrac.field_K[-1 + var4] = 1;
                    ri.field_I[1] = 5;
                    break L0;
                  } else {
                    qh.field_i[var5] = kg.field_h[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                BrickABrac.field_K[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        mh.field_H.field_r = ri.field_I.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= qh.field_i.length) {
            L24: {
              if (ih.field_p == 2) {
                var10 = rg.field_k;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = h.field_F;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = hm.a(false, var13, 0);
                          if (var3_int >= var7) {
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
                      var7 = hm.a(false, var12, 0);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
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
            jj.field_c = mh.field_H.field_r * (kn.field_y + jb.field_H << 1);
            np.field_b = wi.field_k - (var3_int >> 1);
            ci.field_u = -(var3_int >> 1) + (var3_int + wi.field_k);
            var4 = 0;
            L29: while (true) {
              if (qh.field_i.length <= var4) {
                jq.field_r = -(jj.field_c >> 1) + w.field_k;
                ce.field_a = new int[qh.field_i.length][];
                var4 = 0;
                var5 = jq.field_r;
                L30: while (true) {
                  if (var4 >= qh.field_i.length) {
                    L31: {
                      if (ih.field_p != 2) {
                        mh.field_H.a(qo.b(120, po.field_a, pq.field_k), 0, param0, (byte) -127);
                        break L31;
                      } else {
                        mh.field_H.a(-1, -1, param0, (byte) -128);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = BrickABrac.field_K[var4];
                      if (var6 >= 0) {
                        var7 = hm.a(true, qh.field_i[var4], 0);
                        var8 = wi.field_k - (var7 >> 1);
                        var5 = var5 + kn.field_y;
                        ce.field_a[var4] = new int[4];
                        ce.field_a[var4][0] = -cn.field_c + var8;
                        ce.field_a[var4][1] = var5;
                        ce.field_a[var4][2] = (cn.field_c << 1) + var7;
                        var5 = var5 + (kn.field_y + ((jb.field_H << 1) - -b.field_c));
                        ce.field_a[var4][3] = (jb.field_H << 1) + b.field_c;
                        break L32;
                      } else {
                        var5 = var5 + pe.field_s;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_104_0 = jj.field_c;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (BrickABrac.field_K[var4] >= 0) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = b.field_c;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L33;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = pe.field_s;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L33;
                  }
                }
                jj.field_c = stackIn_107_0 + stackIn_107_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              if (BrickABrac.field_K[var4] < 0) {
                stackOut_89_0 = 0;
                stackIn_90_0 = stackOut_89_0;
                break L34;
              } else {
                stackOut_88_0 = 1;
                stackIn_90_0 = stackOut_88_0;
                break L34;
              }
            }
            L35: {
              var5 = hm.a(stackIn_90_0 != 0, qh.field_i[var4], 0);
              if (var5 <= var3_int) {
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Open";
        field_f = "Crumbs!";
        field_d = 0;
    }
}
