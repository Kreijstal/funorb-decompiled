/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int field_b;
    static int field_a;
    int field_c;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        am var4 = null;
        o var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (am) ((Object) ec.field_b.a((byte) -95));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    tf.a(-55, false);
                    break L2;
                  }
                }
                var5 = (o) ((Object) mh.field_a.a((byte) -95));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    nk.a(param0, var5, -31995);
                    var5 = (o) ((Object) mh.field_a.a(true));
                    continue L3;
                  }
                }
              } else {
                ei.a(true, param0, var4);
                var4 = (am) ((Object) ec.field_b.a(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "tf.B(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, boolean param1, int param2) {
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        String stackIn_83_2 = null;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        String stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ej.field_n = true;
              q.field_a = param2;
              if (q.field_a != 0) {
                if (1 != q.field_a) {
                  if ((q.field_a ^ -1) == -3) {
                    var3_int = vd.a(nc.field_r, gd.field_m, ij.a(ef.field_c, new String[]{"<br><%0><br>"}, (byte) -53), ce.field_b, (byte) -80);
                    var4 = -1;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var3_int) {
                          break L3;
                        } else {
                          if (!"<%0>".equals(nc.field_r[var5])) {
                            var5++;
                            continue L2;
                          } else {
                            var4 = var5;
                            break L3;
                          }
                        }
                      }
                      if ((var4 ^ -1) != 0) {
                        bd.field_p = new String[var4];
                        ji.a(nc.field_r, 0, bd.field_p, 0, var4);
                        ne.field_a = new String[-1 + var3_int - var4];
                        ji.a(nc.field_r, 1 + var4, ne.field_a, 0, -1 + (var3_int - var4));
                        var4 = -1;
                        var3_int = vd.a(nc.field_r, gd.field_m, ij.a(mk.field_C, new String[]{"<br><%0><br>"}, (byte) -46), ce.field_b, (byte) 112);
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (var3_int <= var5) {
                              break L5;
                            } else {
                              if ("<%0>".equals(nc.field_r[var5])) {
                                var4 = var5;
                                break L5;
                              } else {
                                var5++;
                                continue L4;
                              }
                            }
                          }
                          if ((var4 ^ -1) == 0) {
                            throw new IllegalStateException();
                          } else {
                            L6: {
                              ng.field_i = new String[var4];
                              ji.a(nc.field_r, 0, ng.field_i, 0, var4);
                              th.field_d = new String[-1 + var3_int + -var4];
                              ji.a(nc.field_r, var4 - -1, th.field_d, 0, -1 + -var4 + var3_int);
                              if (ng.field_i.length <= bd.field_p.length) {
                                stackIn_65_0 = bd.field_p.length;
                                break L6;
                              } else {
                                stackIn_65_0 = ng.field_i.length;
                                break L6;
                              }
                            }
                            L7: {
                              var5 = stackIn_65_0;
                              if (ne.field_a.length >= th.field_d.length) {
                                stackIn_68_0 = ne.field_a.length;
                                break L7;
                              } else {
                                stackIn_68_0 = th.field_d.length;
                                break L7;
                              }
                            }
                            var6 = stackIn_68_0;
                            var7 = var5 + 7 - -var6;
                            ce.field_a = new int[var7];
                            qb.field_f = new String[var7];
                            var8 = 0;
                            L8: while (true) {
                              if (var7 <= var8) {
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
                                L9: while (true) {
                                  if (var5 <= var8) {
                                    qb.field_f[6 + var5] = null;
                                    ce.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L10: while (true) {
                                      if (var8 >= var6) {
                                        c.field_c = lk.a(0);
                                        break L1;
                                      } else {
                                        stackIn_80_0 = qb.field_f;
                                        stackIn_80_1 = 7 - (-var5 - var8);
                                        stackIn_80_2 = th.field_d.length ^ -1;
                                        stackIn_80_3 = var8 ^ -1;
                                        L11: {




                                          if (stackIn_80_2 >= stackIn_80_3) {
                                            stackIn_80_0 = (String[]) ((Object) stackIn_80_0);

                                            stackIn_83_2 = "";
                                            break L11;
                                          } else {
                                            stackIn_80_0 = (String[]) ((Object) stackIn_80_0);

                                            stackIn_83_2 = th.field_d[var8];
                                            break L11;
                                          }
                                        }
                                        stackIn_80_0[stackIn_80_1] = stackIn_83_2;
                                        var8++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      stackIn_75_0 = qb.field_f;

                                      stackIn_75_1 = 6 + var8;

                                      if (-1 >= (-var5 + ng.field_i.length + var8 ^ -1)) {
                                        stackIn_76_0 = (String[]) ((Object) stackIn_75_0);
                                        stackIn_76_1 = stackIn_75_1;
                                        stackIn_76_2 = ng.field_i[-var5 + (var8 - -ng.field_i.length)];
                                        break L12;
                                      } else {
                                        stackIn_76_0 = (String[]) ((Object) stackIn_75_0);
                                        stackIn_76_1 = stackIn_75_1;
                                        stackIn_76_2 = "";
                                        break L12;
                                      }
                                    }
                                    stackIn_76_0[stackIn_76_1] = stackIn_76_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                ce.field_a[var8] = -1;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    if (-4 != (q.field_a ^ -1)) {
                      if (4 != q.field_a) {
                        if (5 != q.field_a) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = vd.a(nc.field_r, gd.field_m, dg.field_e, ce.field_b, (byte) 71);
                          var4 = 3 - -var3_int;
                          qb.field_f = new String[var4];
                          ce.field_a = new int[var4];
                          var5 = 0;
                          L13: while (true) {
                            if (var4 <= var5) {
                              uj.field_d = new int[2];
                              var5 = 0;
                              L14: while (true) {
                                if (var5 >= var3_int) {
                                  qb.field_f[-3 + var4] = "";
                                  qb.field_f[var4 - 2] = pe.field_a;
                                  ce.field_a[var4 - 2] = 0;
                                  uj.field_d[0] = 3;
                                  qb.field_f[-1 + var4] = oe.field_a;
                                  ce.field_a[var4 + -1] = 1;
                                  uj.field_d[1] = 5;
                                  break L1;
                                } else {
                                  qb.field_f[var5] = nc.field_r[var5];
                                  var5++;
                                  continue L14;
                                }
                              }
                            } else {
                              ce.field_a[var5] = -1;
                              var5++;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        var3_int = vd.a(nc.field_r, gd.field_m, n.field_b, ce.field_b, (byte) -111);
                        var4 = 2 - -var3_int;
                        qb.field_f = new String[var4];
                        ce.field_a = new int[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var4) {
                            uj.field_d = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var3_int <= var5) {
                                qb.field_f[-2 + var4] = "";
                                qb.field_f[-1 + var4] = oe.field_a;
                                ce.field_a[-1 + var4] = 0;
                                uj.field_d[0] = 5;
                                break L1;
                              } else {
                                qb.field_f[var5] = nc.field_r[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            ce.field_a[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        if (!lk.field_b.field_e) {
                          var3_int = vd.a(nc.field_r, gd.field_m, nh.field_m, ce.field_b, (byte) -103);
                          break L17;
                        } else {
                          var3_int = vd.a(nc.field_r, gd.field_m, e.field_x, ce.field_b, (byte) -118);
                          break L17;
                        }
                      }
                      var4 = 2 - -var3_int;
                      ce.field_a = new int[var4];
                      qb.field_f = new String[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (var4 <= var5) {
                          uj.field_d = new int[1];
                          var5 = 0;
                          L19: while (true) {
                            if (var3_int <= var5) {
                              qb.field_f[-2 + var4] = "";
                              qb.field_f[-1 + var4] = oe.field_a;
                              ce.field_a[-1 + var4] = 0;
                              uj.field_d[0] = 5;
                              break L1;
                            } else {
                              qb.field_f[var5] = nc.field_r[var5];
                              var5++;
                              continue L19;
                            }
                          }
                        } else {
                          ce.field_a[var5] = -1;
                          var5++;
                          continue L18;
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
                  L20: while (true) {
                    if (var4 <= var5) {
                      uj.field_d = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          qb.field_f[-2 + var4] = "";
                          qb.field_f[var4 - 1] = oe.field_a;
                          ce.field_a[-1 + var4] = 0;
                          uj.field_d[0] = 5;
                          break L1;
                        } else {
                          qb.field_f[var5] = nc.field_r[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      ce.field_a[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) 110);
                var4 = 3 - -var3_int;
                ce.field_a = new int[var4];
                qb.field_f = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    uj.field_d = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        qb.field_f[-3 + var4] = "";
                        qb.field_f[var4 - 2] = vg.field_g;
                        ce.field_a[var4 + -2] = 0;
                        uj.field_d[0] = 4;
                        qb.field_f[var4 - 1] = oe.field_a;
                        ce.field_a[-1 + var4] = 1;
                        uj.field_d[1] = 5;
                        break L1;
                      } else {
                        qb.field_f[var5] = nc.field_r[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    ce.field_a[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            bk.field_c.field_a = uj.field_d.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= qb.field_f.length) {
                L25: {
                  if ((q.field_a ^ -1) != -3) {
                    break L25;
                  } else {
                    var10 = bd.field_p;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = ne.field_a;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = uc.a(var12, false, false);
                            if (var7 > var3_int) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        L28: {
                          var11 = var10[var5];
                          var7 = uc.a(var11, false, false);
                          if ((var3_int ^ -1) > (var7 ^ -1)) {
                            var3_int = var7;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  }
                }
                ic.field_b = wd.field_j + -(var3_int >> 270975585);
                jd.field_a = wd.field_j - (-var3_int + (var3_int >> -771634431));
                mf.field_d = (ee.field_D + jl.field_o << -572514079) * bk.field_c.field_a;
                var4 = 0;
                L29: while (true) {
                  if (var4 >= qb.field_f.length) {
                    qa.field_u = -(mf.field_d >> 512549121) + lb.field_j;
                    if (param0 > 33) {
                      jj.field_c = new int[qb.field_f.length][];
                      var4 = 0;
                      var5 = qa.field_u;
                      L30: while (true) {
                        if (qb.field_f.length <= var4) {
                          L31: {
                            if ((q.field_a ^ -1) != -3) {
                              bk.field_c.a(tl.a(196077633, oa.field_j, bk.field_a), 0, (byte) -104, param1);
                              break L31;
                            } else {
                              bk.field_c.a(-1, -1, (byte) 124, param1);
                              break L31;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L32: {
                            var6 = ce.field_a[var4];
                            if ((var6 ^ -1) <= -1) {
                              var7 = uc.a(qb.field_f[var4], false, true);
                              var5 = var5 + ee.field_D;
                              var8 = -(var7 >> 277539905) + wd.field_j;
                              jj.field_c[var4] = new int[4];
                              jj.field_c[var4][0] = var8 + -vh.field_m;
                              jj.field_c[var4][1] = var5;
                              jj.field_c[var4][2] = (vh.field_m << 687384449) + var7;
                              var5 = var5 + (ee.field_D + (jl.field_o << 2062419617) - -hi.field_c);
                              jj.field_c[var4][3] = hi.field_c + (jl.field_o << -3910015);
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
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    L33: {
                      stackIn_109_0 = mf.field_d;

                      if (ce.field_a[var4] >= 0) {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = hi.field_c;
                        break L33;
                      } else {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = fi.field_x;
                        break L33;
                      }
                    }
                    mf.field_d = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackIn_89_0 = qb.field_f[var4];

                  stackIn_89_1 = 0;

                  if (0 > ce.field_a[var4]) {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = stackIn_89_1;
                    stackIn_90_2 = 0;
                    break L34;
                  } else {
                    stackIn_90_0 = (String) ((Object) stackIn_89_0);
                    stackIn_90_1 = stackIn_89_1;
                    stackIn_90_2 = 1;
                    break L34;
                  }
                }
                var5 = uc.a(stackIn_90_0, stackIn_90_1 != 0, stackIn_90_2 != 0);
                if (var5 > var3_int) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "tf.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    tf(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_b = param3;
    }

    static {
    }
}
