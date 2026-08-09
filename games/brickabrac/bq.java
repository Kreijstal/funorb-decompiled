/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static String field_a;
    static ck field_b;
    static int field_d;
    static jp[] field_c;
    static String field_f;
    static jp[][] field_e;

    public static void a(boolean param0) {
        field_e = (jp[][]) null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (!param0) {
            bq.a(false, 57, (byte) -48);
        }
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param0 != -6) {
            field_c = (jp[]) null;
        }
        return go.a(param4, param3, false, param1, param2, true);
    }

    final static km a(int param0, int param1) {
        if (param1 != 28472) {
            return (km) null;
        }
        return pg.field_k[param0];
    }

    final static void a(boolean param0, int param1, byte param2) {
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        String stackIn_84_2 = null;
        int stackIn_93_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
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
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ik.field_j = true;
              ih.field_p = param1;
              if (0 != ih.field_p) {
                if (1 != ih.field_p) {
                  if (2 == ih.field_p) {
                    var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(ge.field_x, new String[]{"<br><%0><br>"}, (byte) 103));
                    var4 = -1;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var3_int) {
                          break L3;
                        } else {
                          if ("<%0>".equals(kg.field_h[var5])) {
                            var4 = var5;
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        rg.field_k = new String[var4];
                        pm.a(kg.field_h, 0, rg.field_k, 0, var4);
                        h.field_F = new String[-1 + -var4 + var3_int];
                        pm.a(kg.field_h, 1 + var4, h.field_F, 0, -1 + (-var4 + var3_int));
                        var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, rd.a(u.field_e, new String[]{"<br><%0><br>"}, (byte) 103));
                        var4 = -1;
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (var3_int <= var5) {
                              break L5;
                            } else {
                              if (!"<%0>".equals(kg.field_h[var5])) {
                                var5++;
                                continue L4;
                              } else {
                                var4 = var5;
                                break L5;
                              }
                            }
                          }
                          if (0 == (var4 ^ -1)) {
                            throw new IllegalStateException();
                          } else {
                            L6: {
                              ik.field_b = new String[var4];
                              pm.a(kg.field_h, 0, ik.field_b, 0, var4);
                              fk.field_h = new String[var3_int - (var4 - -1)];
                              pm.a(kg.field_h, var4 - -1, fk.field_h, 0, -1 + (var3_int - var4));
                              if (ik.field_b.length > rg.field_k.length) {
                                stackIn_66_0 = ik.field_b.length;
                                break L6;
                              } else {
                                stackIn_66_0 = rg.field_k.length;
                                break L6;
                              }
                            }
                            L7: {
                              var5 = stackIn_66_0;
                              if (fk.field_h.length <= h.field_F.length) {
                                stackIn_69_0 = h.field_F.length;
                                break L7;
                              } else {
                                stackIn_69_0 = fk.field_h.length;
                                break L7;
                              }
                            }
                            var6 = stackIn_69_0;
                            var7 = var6 + (var5 + 7);
                            BrickABrac.field_K = new int[var7];
                            qh.field_i = new String[var7];
                            var8 = 0;
                            L8: while (true) {
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
                                L9: while (true) {
                                  if (var8 >= var5) {
                                    qh.field_i[6 + var5] = null;
                                    BrickABrac.field_K[6 + var5] = -2;
                                    var8 = 0;
                                    L10: while (true) {
                                      if (var8 >= var6) {
                                        un.field_g = ue.a(false);
                                        break L1;
                                      } else {
                                        stackIn_81_0 = qh.field_i;
                                        stackIn_81_1 = 7 + (var5 + var8);
                                        stackIn_81_2 = fk.field_h.length ^ -1;
                                        stackIn_81_3 = var8 ^ -1;
                                        L11: {




                                          if (stackIn_81_2 >= stackIn_81_3) {
                                            stackIn_81_0 = (String[]) ((Object) stackIn_81_0);

                                            stackIn_84_2 = "";
                                            break L11;
                                          } else {
                                            stackIn_81_0 = (String[]) ((Object) stackIn_81_0);

                                            stackIn_84_2 = fk.field_h[var8];
                                            break L11;
                                          }
                                        }
                                        stackIn_81_0[stackIn_81_1] = stackIn_84_2;
                                        var8++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      stackIn_76_0 = qh.field_i;

                                      stackIn_76_1 = 6 - -var8;

                                      if (0 > var8 - (-ik.field_b.length - -var5)) {
                                        stackIn_77_0 = (String[]) ((Object) stackIn_76_0);
                                        stackIn_77_1 = stackIn_76_1;
                                        stackIn_77_2 = "";
                                        break L12;
                                      } else {
                                        stackIn_77_0 = (String[]) ((Object) stackIn_76_0);
                                        stackIn_77_1 = stackIn_76_1;
                                        stackIn_77_2 = ik.field_b[-var5 + (ik.field_b.length + var8)];
                                        break L12;
                                      }
                                    }
                                    stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                BrickABrac.field_K[var8] = -1;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (3 == ih.field_p) {
                      L13: {
                        if (lp.field_ub.field_i) {
                          var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, ff.field_a);
                          break L13;
                        } else {
                          var3_int = qb.a(kg.field_h, m.field_b, param2 ^ -87, ni.field_Wb, df.field_d);
                          break L13;
                        }
                      }
                      var4 = 2 + var3_int;
                      qh.field_i = new String[var4];
                      BrickABrac.field_K = new int[var4];
                      var5 = 0;
                      L14: while (true) {
                        if (var4 <= var5) {
                          ri.field_I = new int[1];
                          var5 = 0;
                          L15: while (true) {
                            if (var5 >= var3_int) {
                              qh.field_i[var4 - 2] = "";
                              qh.field_i[var4 - 1] = oi.field_a;
                              BrickABrac.field_K[-1 + var4] = 0;
                              ri.field_I[0] = 5;
                              break L1;
                            } else {
                              qh.field_i[var5] = kg.field_h[var5];
                              var5++;
                              continue L15;
                            }
                          }
                        } else {
                          BrickABrac.field_K[var5] = -1;
                          var5++;
                          continue L14;
                        }
                      }
                    } else {
                      if (ih.field_p == 4) {
                        var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, oo.field_s);
                        var4 = var3_int + 2;
                        qh.field_i = new String[var4];
                        BrickABrac.field_K = new int[var4];
                        var5 = 0;
                        L16: while (true) {
                          if (var4 <= var5) {
                            ri.field_I = new int[1];
                            var5 = 0;
                            L17: while (true) {
                              if (var3_int <= var5) {
                                qh.field_i[var4 - 2] = "";
                                qh.field_i[var4 + -1] = oi.field_a;
                                BrickABrac.field_K[-1 + var4] = 0;
                                ri.field_I[0] = 5;
                                break L1;
                              } else {
                                qh.field_i[var5] = kg.field_h[var5];
                                var5++;
                                continue L17;
                              }
                            }
                          } else {
                            BrickABrac.field_K[var5] = -1;
                            var5++;
                            continue L16;
                          }
                        }
                      } else {
                        if ((ih.field_p ^ -1) == -6) {
                          var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, eo.field_h);
                          var4 = 3 + var3_int;
                          BrickABrac.field_K = new int[var4];
                          qh.field_i = new String[var4];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var4) {
                              ri.field_I = new int[2];
                              var5 = 0;
                              L19: while (true) {
                                if (var3_int <= var5) {
                                  qh.field_i[var4 - 3] = "";
                                  qh.field_i[var4 - 2] = ja.field_b;
                                  BrickABrac.field_K[var4 + -2] = 0;
                                  ri.field_I[0] = 3;
                                  qh.field_i[var4 + -1] = oi.field_a;
                                  BrickABrac.field_K[-1 + var4] = 1;
                                  ri.field_I[1] = 5;
                                  break L1;
                                } else {
                                  qh.field_i[var5] = kg.field_h[var5];
                                  var5++;
                                  continue L19;
                                }
                              }
                            } else {
                              BrickABrac.field_K[var5] = -1;
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  }
                } else {
                  var3_int = qb.a(kg.field_h, m.field_b, param2 ^ -87, ni.field_Wb, up.field_x);
                  var4 = 2 - -var3_int;
                  BrickABrac.field_K = new int[var4];
                  qh.field_i = new String[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var4) {
                      ri.field_I = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          qh.field_i[var4 - 2] = "";
                          qh.field_i[-1 + var4] = oi.field_a;
                          BrickABrac.field_K[-1 + var4] = 0;
                          ri.field_I[0] = 5;
                          break L1;
                        } else {
                          qh.field_i[var5] = kg.field_h[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      BrickABrac.field_K[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = qb.a(kg.field_h, m.field_b, -63, ni.field_Wb, up.field_x);
                var4 = 3 + var3_int;
                BrickABrac.field_K = new int[var4];
                qh.field_i = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var4 <= var5) {
                    ri.field_I = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var5 >= var3_int) {
                        qh.field_i[var4 + -3] = "";
                        qh.field_i[var4 + -2] = g.field_q;
                        BrickABrac.field_K[var4 - 2] = 0;
                        ri.field_I[0] = 4;
                        qh.field_i[-1 + var4] = oi.field_a;
                        BrickABrac.field_K[-1 + var4] = 1;
                        ri.field_I[1] = 5;
                        break L1;
                      } else {
                        qh.field_i[var5] = kg.field_h[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    BrickABrac.field_K[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            mh.field_H.field_r = ri.field_I.length;
            var3_int = 0;
            if (param2 == 104) {
              var4 = 0;
              L24: while (true) {
                if (var4 >= qh.field_i.length) {
                  L25: {
                    if (ih.field_p == 2) {
                      var10 = rg.field_k;
                      var4_ref_String__ = var10;
                      var5 = 0;
                      L26: while (true) {
                        if (var10.length <= var5) {
                          var4_ref_String__ = h.field_F;
                          var5 = 0;
                          L27: while (true) {
                            if (var4_ref_String__.length <= var5) {
                              break L25;
                            } else {
                              var12 = var4_ref_String__[var5];
                              var7 = hm.a(false, var12, 0);
                              if (var3_int < var7) {
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
                          var11 = var10[var5];
                          var7 = hm.a(false, var11, param2 + -104);
                          if ((var7 ^ -1) < (var3_int ^ -1)) {
                            var3_int = var7;
                            var5++;
                            continue L26;
                          } else {
                            var5++;
                            continue L26;
                          }
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                  jj.field_c = mh.field_H.field_r * (kn.field_y + jb.field_H << -601618751);
                  np.field_b = wi.field_k - (var3_int >> 1637760833);
                  ci.field_u = -(var3_int >> 1316060737) + (var3_int + wi.field_k);
                  var4 = 0;
                  L28: while (true) {
                    if (qh.field_i.length <= var4) {
                      jq.field_r = -(jj.field_c >> 1045690177) + w.field_k;
                      ce.field_a = new int[qh.field_i.length][];
                      var4 = 0;
                      var5 = jq.field_r;
                      L29: while (true) {
                        if (var4 >= qh.field_i.length) {
                          L30: {
                            if (ih.field_p != 2) {
                              mh.field_H.a(qo.b(120, po.field_a, pq.field_k), 0, param0, (byte) -127);
                              break L30;
                            } else {
                              mh.field_H.a(-1, -1, param0, (byte) -128);
                              break L30;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L31: {
                            var6 = BrickABrac.field_K[var4];
                            if ((var6 ^ -1) <= -1) {
                              var7 = hm.a(true, qh.field_i[var4], param2 + -104);
                              var8 = wi.field_k - (var7 >> 273022945);
                              var5 = var5 + kn.field_y;
                              ce.field_a[var4] = new int[4];
                              ce.field_a[var4][0] = -cn.field_c + var8;
                              ce.field_a[var4][1] = var5;
                              ce.field_a[var4][2] = (cn.field_c << 321257345) + var7;
                              var5 = var5 + (kn.field_y + ((jb.field_H << 873149857) - -b.field_c));
                              ce.field_a[var4][3] = (jb.field_H << -987699871) + b.field_c;
                              break L31;
                            } else {
                              var5 = var5 + pe.field_s;
                              break L31;
                            }
                          }
                          var4++;
                          continue L29;
                        }
                      }
                    } else {
                      L32: {
                        stackIn_112_0 = jj.field_c;

                        if (BrickABrac.field_K[var4] >= 0) {
                          stackIn_113_0 = stackIn_112_0;
                          stackIn_113_1 = b.field_c;
                          break L32;
                        } else {
                          stackIn_113_0 = stackIn_112_0;
                          stackIn_113_1 = pe.field_s;
                          break L32;
                        }
                      }
                      jj.field_c = stackIn_113_0 + stackIn_113_1;
                      var4++;
                      continue L28;
                    }
                  }
                } else {
                  L33: {
                    if ((BrickABrac.field_K[var4] ^ -1) > -1) {
                      stackIn_93_0 = 0;
                      break L33;
                    } else {
                      stackIn_93_0 = 1;
                      break L33;
                    }
                  }
                  var5 = hm.a(stackIn_93_0 != 0, qh.field_i[var4], 0);
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "bq.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Open";
        field_f = "Crumbs!";
        field_d = 0;
    }
}
