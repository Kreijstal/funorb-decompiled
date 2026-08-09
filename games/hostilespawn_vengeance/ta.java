/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends me {
    static String field_kb;
    static String field_lb;
    static int[] field_mb;
    static bd field_jb;

    final static boolean p(int param0) {
        if (param0 != 3) {
            field_mb = (int[]) null;
        }
        return md.field_k;
    }

    final void b(ag param0, byte param1) {
        try {
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ta.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ng.field_k = false;
                Math.random();
                cg.field_b = 0;
                n.field_o = false;
                dl.field_l = false;
                of.field_d = km.field_A;
                pm.field_d = 26;
                nl.field_d = 0;
                qi.field_J = 0;
                dn.field_b = 0;
                vi.field_p = null;
                om.field_a = false;
                nh.field_H = 0;
                wk.field_h = false;
                tb.field_N = 0;
                ec.a((byte) -123, hk.field_q);
                ib.a((byte) -72);
                rl.field_c = param1;
                if (bm.field_c != 0) {
                  break L2;
                } else {
                  if (9 != rl.field_c) {
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            L3: {
              L4: {
                pa.field_d = stackIn_5_0 != 0;
                jf.field_d = 0;
                if (-1 != (bm.field_c ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if (3 == rl.field_c) {
                      break L5;
                    } else {
                      if (8 == rl.field_c) {
                        break L5;
                      } else {
                        if (-10 != (rl.field_c ^ -1)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L3;
                }
              }
              stackIn_12_0 = 0;
              break L3;
            }
            L6: {
              wb.field_Z = stackIn_12_0 != 0;
              if (bm.field_c != 0) {
                L7: {
                  if (hh.field_d == rl.field_c) {
                    kh.field_Q[0] = true;
                    kh.field_cb[0] = false;
                    var2_int = 1;
                    L8: while (true) {
                      if (var2_int >= kh.field_Q.length) {
                        pf.a(kh.field_ib, false);
                        kh.field_U[1] = 0;
                        kh.field_U[0] = 0;
                        break L7;
                      } else {
                        kh.field_Q[var2_int] = false;
                        kh.field_cb[var2_int] = false;
                        var2_int++;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                dl.field_n = new bd(72, 72);
                dl.field_n.a();
                var2_int = 0;
                L9: while (true) {
                  if (var2_int >= 3) {
                    vj.field_e[0].a(true, 128, 192, 36, 36);
                    o.field_n.b((byte) 125);
                    break L6;
                  } else {
                    var3 = 0;
                    L10: while (true) {
                      if (var3 >= 3) {
                        var2_int++;
                        continue L9;
                      } else {
                        pk.field_d[8 * var3 + (var2_int + 424)].c(24 * var2_int, var3 * 24);
                        var3++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                L11: {
                  L12: {
                    if (rl.field_c == hh.field_d) {
                      break L12;
                    } else {
                      if (3 != rl.field_c) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2_int = 0;
                  L13: while (true) {
                    if (var2_int >= kh.field_Q.length) {
                      pf.a(kh.field_ib, false);
                      kh.field_ib[0] = 1200;
                      kh.field_U[0] = 1;
                      kh.field_U[1] = 0;
                      break L11;
                    } else {
                      L14: {
                        stackIn_20_0 = kh.field_Q;

                        stackIn_20_1 = var2_int;

                        if ((var2_int ^ -1) <= -3) {
                          stackIn_21_0 = (boolean[]) ((Object) stackIn_20_0);
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = 0;
                          break L14;
                        } else {
                          stackIn_21_0 = (boolean[]) ((Object) stackIn_20_0);
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = 1;
                          break L14;
                        }
                      }
                      stackIn_21_0[stackIn_21_1] = stackIn_21_2 != 0;
                      kh.field_cb[var2_int] = false;
                      var2_int++;
                      continue L13;
                    }
                  }
                }
                if (rl.field_c != 3) {
                  dl.field_n = new bd(72, 72);
                  dl.field_n.a();
                  var2_int = 0;
                  L15: while (true) {
                    if (3 <= var2_int) {
                      vj.field_e[0].a(true, 128, 192, 36, 36);
                      o.field_n.b((byte) 127);
                      break L6;
                    } else {
                      var3 = 0;
                      L16: while (true) {
                        if (3 <= var3) {
                          var2_int++;
                          continue L15;
                        } else {
                          pk.field_d[var3 * 8 + var2_int + 139].c(var2_int * 24, 24 * var3);
                          var3++;
                          continue L16;
                        }
                      }
                    }
                  }
                } else {
                  jf.field_d = 50;
                  dl.field_n = null;
                  break L6;
                }
              }
            }
            L17: {
              tg.field_a = false;
              bj.field_a = false;
              if (hh.field_d == rl.field_c) {
                wa.field_p = 0;
                kf.a(al.field_U, 0, 6);
                sg.field_i = 0;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              L19: {
                ad.field_a = ng.field_u;
                ng.field_u = 0;
                o.field_n.b((byte) -20);
                r.field_a = 1;
                el.field_j = 0;
                if (bm.field_c != 0) {
                  break L19;
                } else {
                  if (-1 != (rl.field_c ^ -1)) {
                    break L19;
                  } else {
                    ul.field_L = 0;
                    break L18;
                  }
                }
              }
              ul.field_L = -1;
              break L18;
            }
            ll.field_a = 0;
            ib.field_c = 0;
            dk.field_o = 0;
            var2_int = 0;
            L20: while (true) {
              if (3000 <= var2_int) {
                var2_int = -118 / ((param0 - -46) / 37);
                var3 = 0;
                L21: while (true) {
                  if (var3 >= 3000) {
                    L22: {
                      ti.field_f.a(-1, 8360, -1);
                      ln.field_a = null;
                      ln.field_a = new id(oc.field_h[bm.field_c][rl.field_c]);
                      mm.a(ln.field_a, true);
                      if (0 <= ti.field_f.field_e) {
                        break L22;
                      } else {
                        System.err.println("Map failed to set player position.");
                        ti.field_f.a(100, 8360, 100);
                        break L22;
                      }
                    }
                    ti.field_f.field_g = ti.field_f.field_g + 1;
                    ti.field_f.field_e = ti.field_f.field_e + 1;
                    mm.field_m[0] = new oj(ti.field_f, 0, rl.field_c);
                    ki.field_c = null;
                    ki.field_c = new bd(ln.field_a.field_a, ln.field_a.field_d);
                    ki.field_c.a();
                    var2_int = ln.field_a.field_a;
                    var3 = ln.field_a.field_d;
                    var4 = 0;
                    var5 = ln.field_a.field_B;
                    var6 = 0;
                    L23: while (true) {
                      if (var2_int <= var6) {
                        L24: {
                          o.field_n.b((byte) -111);
                          le.field_D = 0;
                          if (!om.field_b) {
                            L25: {
                              if (bm.field_c != 0) {
                                break L25;
                              } else {
                                if (rl.field_c != 9) {
                                  break L25;
                                } else {
                                  le.field_D = 7500;
                                  break L24;
                                }
                              }
                            }
                            if (0 != bm.field_c) {
                              break L24;
                            } else {
                              if (3 != rl.field_c) {
                                break L24;
                              } else {
                                le.field_D = 12000;
                                break L24;
                              }
                            }
                          } else {
                            le.field_D = 100 * ub.field_a[bm.field_c][rl.field_c] - -1500;
                            break L24;
                          }
                        }
                        L26: {
                          if (om.field_b) {
                            if (0 != bm.field_c) {
                              break L26;
                            } else {
                              L27: {
                                if (rl.field_c != 3) {
                                  break L27;
                                } else {
                                  wh.field_b[ll.field_a].field_c = 0.0;
                                  wh.field_b[ll.field_a].field_j.a(55, 8360, 83);
                                  wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
                                  wh.field_b[ll.field_a].field_e = 0;
                                  wh.field_b[ll.field_a].field_h = 1;
                                  wh.field_b[ll.field_a].field_i = 0;
                                  ll.field_a = ll.field_a + 1;
                                  break L27;
                                }
                              }
                              if ((rl.field_c ^ -1) != -6) {
                                break L26;
                              } else {
                                var6 = 0;
                                L28: while (true) {
                                  if ((var6 ^ -1) <= -4) {
                                    break L26;
                                  } else {
                                    var7 = 0;
                                    L29: while (true) {
                                      if (-4 >= (var7 ^ -1)) {
                                        var6++;
                                        continue L28;
                                      } else {
                                        wh.field_b[ll.field_a].field_c = 0.0;
                                        wh.field_b[ll.field_a].field_j.a(var6 + 35, 8360, 36 - -var7);
                                        wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
                                        wh.field_b[ll.field_a].field_e = 0;
                                        wh.field_b[ll.field_a].field_h = 3;
                                        wh.field_b[ll.field_a].field_i = 1;
                                        ll.field_a = ll.field_a + 1;
                                        var7++;
                                        continue L29;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L26;
                          }
                        }
                        L30: {
                          ln.field_a.a(-2, 1);
                          ha.field_t = -1;
                          ue.field_d = 0;
                          if (bm.field_c == 0) {
                            if (-4 != (rl.field_c ^ -1)) {
                              if (rl.field_c == 4) {
                                kd.a(1, 1);
                                break L30;
                              } else {
                                if (5 != rl.field_c) {
                                  if (rl.field_c != 6) {
                                    if (-8 == (rl.field_c ^ -1)) {
                                      kd.a(2, 1);
                                      r.field_a = 2;
                                      break L30;
                                    } else {
                                      if (-9 == (rl.field_c ^ -1)) {
                                        kd.a(3, 1);
                                        r.field_a = 2;
                                        break L30;
                                      } else {
                                        if (9 == rl.field_c) {
                                          kd.a(0, 1);
                                          r.field_a = 0;
                                          break L30;
                                        } else {
                                          if (rl.field_c == 0) {
                                            kd.a(4, 1);
                                            break L30;
                                          } else {
                                            if (-2 != (rl.field_c ^ -1)) {
                                              if (-3 == (rl.field_c ^ -1)) {
                                                kd.a(1, 1);
                                                break L30;
                                              } else {
                                                kd.a(0, 1);
                                                break L30;
                                              }
                                            } else {
                                              kd.a(10, 1);
                                              break L30;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    kd.a(0, 1);
                                    break L30;
                                  }
                                } else {
                                  kd.a(0, 1);
                                  break L30;
                                }
                              }
                            } else {
                              kd.a(0, 1);
                              break L30;
                            }
                          } else {
                            break L30;
                          }
                        }
                        L31: {
                          uj.field_p.field_g = (int)(24.0 * (mm.field_m[0].field_l.field_a + (double)mm.field_m[0].field_j.field_g) - 240.0);
                          uj.field_p.field_e = (int)(-320.0 + (mm.field_m[0].field_l.field_f + (double)mm.field_m[0].field_j.field_e) * 24.0);
                          if (null != md.field_g) {
                            var6 = 0;
                            L32: while (true) {
                              if (var6 >= md.field_g.length) {
                                break L31;
                              } else {
                                md.field_g[var6].a(18421);
                                md.field_g[var6] = null;
                                var6++;
                                continue L32;
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        L33: while (true) {
                          if (var8 >= ln.field_a.field_h.length) {
                            L34: {
                              L35: {
                                if (md.field_g == null) {
                                  break L35;
                                } else {
                                  if (var7 == md.field_g.length) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              md.field_g = new lf[var7];
                              break L34;
                            }
                            var8 = 0;
                            var9 = 1;
                            L36: while (true) {
                              if (var8 >= var7) {
                                L37: {
                                  q.field_g = null;
                                  re.field_l = true;
                                  if (-2 != (bm.field_c ^ -1)) {
                                    break L37;
                                  } else {
                                    if (0 == (rl.field_c ^ -1)) {
                                      break L37;
                                    } else {
                                      var9 = rl.field_c;
                                      if (var9 != 0) {
                                        if (1 != var9) {
                                          if (2 == var9) {
                                            q.field_g = (ql) ((Object) new an());
                                            break L37;
                                          } else {
                                            if ((var9 ^ -1) == -4) {
                                              q.field_g = (ql) ((Object) new pj());
                                              break L37;
                                            } else {
                                              if (4 != var9) {
                                                if ((var9 ^ -1) != -6) {
                                                  if (var9 != 6) {
                                                    if ((var9 ^ -1) == -8) {
                                                      q.field_g = (ql) ((Object) new o());
                                                      break L37;
                                                    } else {
                                                      if (8 != var9) {
                                                        if ((var9 ^ -1) != -10) {
                                                          break L37;
                                                        } else {
                                                          q.field_g = (ql) ((Object) new fb());
                                                          break L37;
                                                        }
                                                      } else {
                                                        q.field_g = (ql) ((Object) new pk());
                                                        break L37;
                                                      }
                                                    }
                                                  } else {
                                                    q.field_g = (ql) ((Object) new vj());
                                                    break L37;
                                                  }
                                                } else {
                                                  q.field_g = (ql) ((Object) new ob());
                                                  break L37;
                                                }
                                              } else {
                                                q.field_g = (ql) ((Object) new dd());
                                                break L37;
                                              }
                                            }
                                          }
                                        } else {
                                          q.field_g = (ql) ((Object) new pa());
                                          break L37;
                                        }
                                      } else {
                                        q.field_g = (ql) ((Object) new uf());
                                        break L37;
                                      }
                                    }
                                  }
                                }
                                L38: {
                                  bc.c(-102);
                                  if (q.field_g == null) {
                                    break L38;
                                  } else {
                                    q.field_g.e(0);
                                    break L38;
                                  }
                                }
                                L39: {
                                  mb.field_s.a(500, 8000);
                                  wh.field_f = true;
                                  if (om.field_b) {
                                    break L39;
                                  } else {
                                    if (kh.field_ab.a(bm.field_c, -28, rl.field_c)) {
                                      kh.field_ab.d(64);
                                      break L39;
                                    } else {
                                      kh.field_ab.c(-32238);
                                      break L39;
                                    }
                                  }
                                }
                                break L0;
                              } else {
                                L40: {
                                  if (-1 == (var6 & 1 << var9 ^ -1)) {
                                    break L40;
                                  } else {
                                    incrementValue$0 = var8;
                                    var8++;
                                    md.field_g[incrementValue$0] = new lf(var9, 0, 640);
                                    break L40;
                                  }
                                }
                                var9++;
                                continue L36;
                              }
                            }
                          } else {
                            var9 = ln.field_a.field_h[var8];
                            if (-1 != (var9 ^ -1)) {
                              L41: {
                                if (-1 == (var6 & 1 << var9 ^ -1)) {
                                  var7++;
                                  var6 = var6 | 1 << var9;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              var8++;
                              continue L33;
                            } else {
                              var8++;
                              continue L33;
                            }
                          }
                        }
                      } else {
                        var7 = 0;
                        L42: while (true) {
                          if (var7 >= var3) {
                            var6++;
                            continue L23;
                          } else {
                            L43: {
                              incrementValue$1 = var4;
                              var4++;
                              if (!var5[incrementValue$1]) {
                                break L43;
                              } else {
                                si.a(var7, var6, 16384);
                                break L43;
                              }
                            }
                            var7++;
                            continue L42;
                          }
                        }
                      }
                    }
                  } else {
                    vj.field_w[var3] = null;
                    var3++;
                    continue L21;
                  }
                }
              } else {
                mm.field_m[var2_int] = null;
                var2_int++;
                continue L20;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "ta.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static ii a(boolean param0, String param1) {
        RuntimeException var2 = null;
        ii stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_lb = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new ii(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ta.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(byte param0) {
        field_jb = null;
        if (param0 != 24) {
            ta.p(-39);
        }
        field_mb = null;
        field_kb = null;
        field_lb = null;
    }

    ta(gg param0, ag param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param0 != -320) {
                ta.a((byte) 125, -53);
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = nj.a(param2, true, var3);
                wc.a(param2, var3.toString(), (byte) -97, true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_lb = "There are five more security locks active on this level. I need to find and deactivate them.";
        field_kb = "The bridge is up this corridor. I'll need to deal with the turrets.";
    }
}
