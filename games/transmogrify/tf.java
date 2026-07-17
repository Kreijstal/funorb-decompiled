/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tf {
    int field_b;
    static int field_a;
    int field_c;

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        am var4 = null;
        o var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (am) (Object) ec.field_b.a((byte) -95);
            L1: while (true) {
              if (var4 == null) {
                int discarded$8 = 0;
                int discarded$9 = -55;
                tf.a();
                var5 = (o) (Object) mh.field_a.a((byte) -95);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$10 = -31995;
                    nk.a(3, var5);
                    var5 = (o) (Object) mh.field_a.a(true);
                    continue L2;
                  }
                }
              } else {
                ei.a(true, 3, var4);
                var4 = (am) (Object) ec.field_b.a(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "tf.B(" + 3 + 44 + 0 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, boolean param1, int param2) {
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
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        String[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String stackIn_81_2 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        String[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String stackOut_79_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          ej.field_n = true;
          q.field_a = param2;
          if (q.field_a != 0) {
            if (1 != q.field_a) {
              if (q.field_a == 2) {
                var3_int = vd.a(nc.field_r, gd.field_m, ij.a(ef.field_c, new String[1], (byte) -53), ce.field_b, (byte) -80);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3_int) {
                      break L2;
                    } else {
                      if (!"<%0>".equals((Object) (Object) nc.field_r[var5])) {
                        var5++;
                        continue L1;
                      } else {
                        var4 = var5;
                        break L2;
                      }
                    }
                  }
                  if (var4 != -1) {
                    bd.field_p = new String[var4];
                    ji.a((Object[]) (Object) nc.field_r, 0, (Object[]) (Object) bd.field_p, 0, var4);
                    ne.field_a = new String[-1 + var3_int - var4];
                    ji.a((Object[]) (Object) nc.field_r, 1 + var4, (Object[]) (Object) ne.field_a, 0, -1 + (var3_int - var4));
                    var4 = -1;
                    var3_int = vd.a(nc.field_r, gd.field_m, ij.a(mk.field_C, new String[1], (byte) -46), ce.field_b, (byte) 112);
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (~var3_int >= ~var5) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) nc.field_r[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          ng.field_i = new String[var4];
                          ji.a((Object[]) (Object) nc.field_r, 0, (Object[]) (Object) ng.field_i, 0, var4);
                          th.field_d = new String[-1 + var3_int + -var4];
                          ji.a((Object[]) (Object) nc.field_r, var4 - -1, (Object[]) (Object) th.field_d, 0, -1 + -var4 + var3_int);
                          if (ng.field_i.length <= bd.field_p.length) {
                            stackOut_63_0 = bd.field_p.length;
                            stackIn_64_0 = stackOut_63_0;
                            break L5;
                          } else {
                            stackOut_62_0 = ng.field_i.length;
                            stackIn_64_0 = stackOut_62_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_64_0;
                          if (~ne.field_a.length <= ~th.field_d.length) {
                            stackOut_66_0 = ne.field_a.length;
                            stackIn_67_0 = stackOut_66_0;
                            break L6;
                          } else {
                            stackOut_65_0 = th.field_d.length;
                            stackIn_67_0 = stackOut_65_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_67_0;
                        var7 = var5 + 7 - -var6;
                        ce.field_a = new int[var7];
                        qb.field_f = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (~var7 >= ~var8) {
                            uj.field_d = new int[2];
                            qb.field_f[0] = ab.field_a;
                            qb.field_f[1] = wd.field_i;
                            ce.field_a[1] = 0;
                            ce.field_a[3] = 1;
                            qb.field_f[3] = ac.field_h;
                            uj.field_d[0] = 5;
                            qb.field_f[5] = "";
                            uj.field_d[1] = 2;
                            qb.field_f[4] = oi.field_j;
                            qb.field_f[2] = nj.field_l;
                            var8 = 0;
                            L8: while (true) {
                              if (~var5 >= ~var8) {
                                qb.field_f[6 + var5] = null;
                                ce.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (~var8 <= ~var6) {
                                    c.field_c = lk.a(0);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_78_0 = qb.field_f;
                                      stackOut_78_1 = 7 - (-var5 - var8);
                                      stackIn_80_0 = stackOut_78_0;
                                      stackIn_80_1 = stackOut_78_1;
                                      stackIn_79_0 = stackOut_78_0;
                                      stackIn_79_1 = stackOut_78_1;
                                      if (~th.field_d.length >= ~var8) {
                                        stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = "";
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        break L10;
                                      } else {
                                        stackOut_79_0 = (String[]) (Object) stackIn_79_0;
                                        stackOut_79_1 = stackIn_79_1;
                                        stackOut_79_2 = th.field_d[var8];
                                        stackIn_81_0 = stackOut_79_0;
                                        stackIn_81_1 = stackOut_79_1;
                                        stackIn_81_2 = stackOut_79_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_81_0[stackIn_81_1] = stackIn_81_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_72_0 = qb.field_f;
                                  stackOut_72_1 = 6 + var8;
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (-var5 + ng.field_i.length + var8 >= 0) {
                                    stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = ng.field_i[-var5 + (var8 - -ng.field_i.length)];
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    break L11;
                                  } else {
                                    stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = "";
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    break L11;
                                  }
                                }
                                stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            ce.field_a[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (q.field_a != 3) {
                  if (4 != q.field_a) {
                    if (5 != q.field_a) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = vd.a(nc.field_r, gd.field_m, dg.field_e, ce.field_b, (byte) 71);
                      var4 = 3 - -var3_int;
                      qb.field_f = new String[var4];
                      ce.field_a = new int[var4];
                      var5 = 0;
                      L12: while (true) {
                        if (~var4 >= ~var5) {
                          uj.field_d = new int[2];
                          var5 = 0;
                          L13: while (true) {
                            if (~var5 <= ~var3_int) {
                              qb.field_f[-3 + var4] = "";
                              qb.field_f[var4 - 2] = pe.field_a;
                              ce.field_a[var4 - 2] = 0;
                              uj.field_d[0] = 3;
                              qb.field_f[-1 + var4] = oe.field_a;
                              ce.field_a[var4 + -1] = 1;
                              uj.field_d[1] = 5;
                              break L0;
                            } else {
                              qb.field_f[var5] = nc.field_r[var5];
                              var5++;
                              continue L13;
                            }
                          }
                        } else {
                          ce.field_a[var5] = -1;
                          var5++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    var3_int = vd.a(nc.field_r, gd.field_m, n.field_b, ce.field_b, (byte) -111);
                    var4 = 2 - -var3_int;
                    qb.field_f = new String[var4];
                    ce.field_a = new int[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= var4) {
                        uj.field_d = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (~var3_int >= ~var5) {
                            qb.field_f[-2 + var4] = "";
                            qb.field_f[-1 + var4] = oe.field_a;
                            ce.field_a[-1 + var4] = 0;
                            uj.field_d[0] = 5;
                            break L0;
                          } else {
                            qb.field_f[var5] = nc.field_r[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        ce.field_a[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  L16: {
                    if (!lk.field_b.field_e) {
                      var3_int = vd.a(nc.field_r, gd.field_m, nh.field_m, ce.field_b, (byte) -103);
                      break L16;
                    } else {
                      var3_int = vd.a(nc.field_r, gd.field_m, e.field_x, ce.field_b, (byte) -118);
                      break L16;
                    }
                  }
                  var4 = 2 - -var3_int;
                  ce.field_a = new int[var4];
                  qb.field_f = new String[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (~var4 >= ~var5) {
                      uj.field_d = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var3_int <= var5) {
                          qb.field_f[-2 + var4] = "";
                          qb.field_f[-1 + var4] = oe.field_a;
                          ce.field_a[-1 + var4] = 0;
                          uj.field_d[0] = 5;
                          break L0;
                        } else {
                          qb.field_f[var5] = nc.field_r[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      ce.field_a[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) -103);
              var4 = var3_int + 2;
              qb.field_f = new String[var4];
              ce.field_a = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (~var4 >= ~var5) {
                  uj.field_d = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3_int) {
                      qb.field_f[-2 + var4] = "";
                      qb.field_f[var4 - 1] = oe.field_a;
                      ce.field_a[-1 + var4] = 0;
                      uj.field_d[0] = 5;
                      break L0;
                    } else {
                      qb.field_f[var5] = nc.field_r[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  ce.field_a[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) 110);
            var4 = 3 - -var3_int;
            ce.field_a = new int[var4];
            qb.field_f = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                uj.field_d = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (~var3_int >= ~var5) {
                    qb.field_f[-3 + var4] = "";
                    qb.field_f[var4 - 2] = vg.field_g;
                    ce.field_a[var4 + -2] = 0;
                    uj.field_d[0] = 4;
                    qb.field_f[var4 - 1] = oe.field_a;
                    ce.field_a[-1 + var4] = 1;
                    uj.field_d[1] = 5;
                    break L0;
                  } else {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                ce.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        bk.field_c.field_a = uj.field_d.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= qb.field_f.length) {
            L24: {
              if (q.field_a != 2) {
                break L24;
              } else {
                var10 = bd.field_p;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = ne.field_a;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = uc.a(var13, false, false);
                          if (var7 <= var3_int) {
                            break L27;
                          } else {
                            var3_int = var7;
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
                      var7 = uc.a(var12, false, false);
                      if (~var3_int > ~var7) {
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
            ic.field_b = wd.field_j + -(var3_int >> 1);
            jd.field_a = wd.field_j - (-var3_int + (var3_int >> 1));
            mf.field_d = (ee.field_D + jl.field_o << 1) * bk.field_c.field_a;
            var4 = 0;
            L29: while (true) {
              if (var4 >= qb.field_f.length) {
                qa.field_u = -(mf.field_d >> 1) + lb.field_j;
                if (param0 > 33) {
                  jj.field_c = new int[qb.field_f.length][];
                  var4 = 0;
                  var5 = qa.field_u;
                  L30: while (true) {
                    if (qb.field_f.length <= var4) {
                      L31: {
                        if (q.field_a != 2) {
                          bk.field_c.a(tl.a(196077633, oa.field_j, bk.field_a), 0, (byte) -104, param1);
                          break L31;
                        } else {
                          bk.field_c.a(-1, -1, (byte) 124, param1);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = ce.field_a[var4];
                        if (var6 >= 0) {
                          var7 = uc.a(qb.field_f[var4], false, true);
                          var5 = var5 + ee.field_D;
                          var8 = -(var7 >> 1) + wd.field_j;
                          jj.field_c[var4] = new int[4];
                          jj.field_c[var4][0] = var8 + -vh.field_m;
                          jj.field_c[var4][1] = var5;
                          jj.field_c[var4][2] = (vh.field_m << 1) + var7;
                          var5 = var5 + (ee.field_D + (jl.field_o << 1) - -hi.field_c);
                          jj.field_c[var4][3] = hi.field_c + (jl.field_o << 1);
                          break L32;
                        } else {
                          var5 = var5 + fi.field_x;
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
                  stackOut_105_0 = mf.field_d;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (ce.field_a[var4] >= 0) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = hi.field_c;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L33;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = fi.field_x;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L33;
                  }
                }
                mf.field_d = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_85_0 = qb.field_f[var4];
              stackOut_85_1 = 0;
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              if (0 > ce.field_a[var4]) {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = stackIn_87_1;
                stackOut_87_2 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                stackIn_88_2 = stackOut_87_2;
                break L34;
              } else {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_88_2 = stackOut_86_2;
                break L34;
              }
            }
            L35: {
              var5 = uc.a(stackIn_88_0, stackIn_88_1 != 0, stackIn_88_2 != 0);
              if (var5 <= var3_int) {
                break L35;
              } else {
                var3_int = var5;
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    tf(int param0, int param1, int param2, int param3) {
        ((tf) this).field_c = param0;
        ((tf) this).field_b = param3;
    }

    static {
    }
}
