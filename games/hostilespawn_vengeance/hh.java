/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_e;
    static bd[] field_a;
    static bd field_b;
    static String field_c;
    static int field_d;

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String stackIn_82_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
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
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              sf.field_U = true;
              be.field_e = param1;
              if (be.field_e != 0) {
                if (-2 != (be.field_e ^ -1)) {
                  if (2 == be.field_e) {
                    var3_int = fa.a(gf.field_c, cg.field_a, 53, lj.field_u, vg.a(new String[]{"<br><%0><br>"}, param0 + 108, wa.field_l));
                    var4 = -1;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var3_int) {
                          break L3;
                        } else {
                          if ("<%0>".equals(gf.field_c[var5])) {
                            var4 = var5;
                            break L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      if ((var4 ^ -1) != 0) {
                        ka.field_o = new String[var4];
                        kf.a(gf.field_c, 0, ka.field_o, 0, var4);
                        p.field_k = new String[-1 + -var4 + var3_int];
                        kf.a(gf.field_c, 1 + var4, p.field_k, 0, -var4 + (var3_int + -1));
                        var3_int = fa.a(gf.field_c, cg.field_a, param0 ^ 102, lj.field_u, vg.a(new String[]{"<br><%0><br>"}, param0 ^ 70, jc.field_d));
                        var4 = -1;
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (var3_int <= var5) {
                              break L5;
                            } else {
                              if ("<%0>".equals(gf.field_c[var5])) {
                                var4 = var5;
                                break L5;
                              } else {
                                var5++;
                                continue L4;
                              }
                            }
                          }
                          if (0 != (var4 ^ -1)) {
                            L6: {
                              gg.field_D = new String[var4];
                              kf.a(gf.field_c, 0, gg.field_D, 0, var4);
                              uh.field_j = new String[var3_int + -var4 - 1];
                              kf.a(gf.field_c, 1 + var4, uh.field_j, 0, -var4 + var3_int + -1);
                              if (ka.field_o.length >= gg.field_D.length) {
                                stackIn_65_0 = ka.field_o.length;
                                break L6;
                              } else {
                                stackIn_65_0 = gg.field_D.length;
                                break L6;
                              }
                            }
                            L7: {
                              var5 = stackIn_65_0;
                              if (p.field_k.length < uh.field_j.length) {
                                stackIn_68_0 = uh.field_j.length;
                                break L7;
                              } else {
                                stackIn_68_0 = p.field_k.length;
                                break L7;
                              }
                            }
                            var6 = stackIn_68_0;
                            var7 = var6 + (var5 + 7);
                            jf.field_b = new int[var7];
                            hf.field_d = new String[var7];
                            var8 = 0;
                            L8: while (true) {
                              if (var8 >= var7) {
                                hf.field_d[1] = al.field_X;
                                jf.field_b[1] = 0;
                                ue.field_k = new int[2];
                                hf.field_d[0] = sg.field_e;
                                hf.field_d[2] = ve.field_d;
                                ue.field_k[0] = 5;
                                ue.field_k[1] = 2;
                                hf.field_d[4] = an.field_f;
                                jf.field_b[3] = 1;
                                hf.field_d[5] = "";
                                hf.field_d[3] = sc.field_i;
                                var8 = 0;
                                L9: while (true) {
                                  if (var5 <= var8) {
                                    hf.field_d[6 + var5] = null;
                                    jf.field_b[6 - -var5] = -2;
                                    var8 = 0;
                                    L10: while (true) {
                                      if (var8 >= var6) {
                                        fj.field_Rb = hn.a((byte) 80);
                                        break L1;
                                      } else {
                                        L11: {
                                          stackIn_81_0 = hf.field_d;

                                          stackIn_81_1 = var8 + 7 - -var5;

                                          if (uh.field_j.length <= var8) {
                                            stackIn_82_0 = (String[]) ((Object) stackIn_81_0);
                                            stackIn_82_1 = stackIn_81_1;
                                            stackIn_82_2 = "";
                                            break L11;
                                          } else {
                                            stackIn_82_0 = (String[]) ((Object) stackIn_81_0);
                                            stackIn_82_1 = stackIn_81_1;
                                            stackIn_82_2 = uh.field_j[var8];
                                            break L11;
                                          }
                                        }
                                        stackIn_82_0[stackIn_82_1] = stackIn_82_2;
                                        var8++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      stackIn_75_0 = hf.field_d;

                                      stackIn_75_1 = 6 + var8;

                                      if (gg.field_D.length + (var8 + -var5) < 0) {
                                        stackIn_76_0 = (String[]) ((Object) stackIn_75_0);
                                        stackIn_76_1 = stackIn_75_1;
                                        stackIn_76_2 = "";
                                        break L12;
                                      } else {
                                        stackIn_76_0 = (String[]) ((Object) stackIn_75_0);
                                        stackIn_76_1 = stackIn_75_1;
                                        stackIn_76_2 = gg.field_D[gg.field_D.length + (var8 - var5)];
                                        break L12;
                                      }
                                    }
                                    stackIn_76_0[stackIn_76_1] = stackIn_76_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                jf.field_b[var8] = -1;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    if (be.field_e == 3) {
                      L13: {
                        if (gf.field_b.field_k) {
                          var3_int = fa.a(gf.field_c, cg.field_a, 98, lj.field_u, kc.field_e);
                          break L13;
                        } else {
                          var3_int = fa.a(gf.field_c, cg.field_a, 50, lj.field_u, he.field_z);
                          break L13;
                        }
                      }
                      var4 = var3_int + 2;
                      hf.field_d = new String[var4];
                      jf.field_b = new int[var4];
                      var5 = 0;
                      L14: while (true) {
                        if (var5 >= var4) {
                          ue.field_k = new int[1];
                          var5 = 0;
                          L15: while (true) {
                            if (var5 >= var3_int) {
                              hf.field_d[-2 + var4] = "";
                              hf.field_d[var4 + -1] = gi.field_n;
                              jf.field_b[-1 + var4] = 0;
                              ue.field_k[0] = 5;
                              break L1;
                            } else {
                              hf.field_d[var5] = gf.field_c[var5];
                              var5++;
                              continue L15;
                            }
                          }
                        } else {
                          jf.field_b[var5] = -1;
                          var5++;
                          continue L14;
                        }
                      }
                    } else {
                      if (4 == be.field_e) {
                        var3_int = fa.a(gf.field_c, cg.field_a, param0 ^ 119, lj.field_u, ha.field_y);
                        var4 = 2 + var3_int;
                        jf.field_b = new int[var4];
                        hf.field_d = new String[var4];
                        var5 = 0;
                        L16: while (true) {
                          if (var5 >= var4) {
                            ue.field_k = new int[1];
                            var5 = 0;
                            L17: while (true) {
                              if (var3_int <= var5) {
                                hf.field_d[var4 - 2] = "";
                                hf.field_d[var4 - 1] = gi.field_n;
                                jf.field_b[-1 + var4] = 0;
                                ue.field_k[0] = 5;
                                break L1;
                              } else {
                                hf.field_d[var5] = gf.field_c[var5];
                                var5++;
                                continue L17;
                              }
                            }
                          } else {
                            jf.field_b[var5] = -1;
                            var5++;
                            continue L16;
                          }
                        }
                      } else {
                        if (5 == be.field_e) {
                          var3_int = fa.a(gf.field_c, cg.field_a, 62, lj.field_u, ph.field_y);
                          var4 = 3 - -var3_int;
                          hf.field_d = new String[var4];
                          jf.field_b = new int[var4];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var4) {
                              ue.field_k = new int[2];
                              var5 = 0;
                              L19: while (true) {
                                if (var3_int <= var5) {
                                  hf.field_d[var4 + -3] = "";
                                  hf.field_d[var4 + -2] = field_c;
                                  jf.field_b[-2 + var4] = 0;
                                  ue.field_k[0] = 3;
                                  hf.field_d[-1 + var4] = gi.field_n;
                                  jf.field_b[var4 - 1] = 1;
                                  ue.field_k[1] = 5;
                                  break L1;
                                } else {
                                  hf.field_d[var5] = gf.field_c[var5];
                                  var5++;
                                  continue L19;
                                }
                              }
                            } else {
                              jf.field_b[var5] = -1;
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
                  var3_int = fa.a(gf.field_c, cg.field_a, 105, lj.field_u, ne.field_p);
                  var4 = var3_int + 2;
                  hf.field_d = new String[var4];
                  jf.field_b = new int[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var4 <= var5) {
                      ue.field_k = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          hf.field_d[-2 + var4] = "";
                          hf.field_d[var4 - 1] = gi.field_n;
                          jf.field_b[-1 + var4] = 0;
                          ue.field_k[0] = 5;
                          break L1;
                        } else {
                          hf.field_d[var5] = gf.field_c[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      jf.field_b[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = fa.a(gf.field_c, cg.field_a, 113, lj.field_u, ne.field_p);
                var4 = var3_int + 3;
                jf.field_b = new int[var4];
                hf.field_d = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    ue.field_k = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        hf.field_d[-3 + var4] = "";
                        hf.field_d[var4 + -2] = lh.field_c;
                        jf.field_b[var4 - 2] = 0;
                        ue.field_k[0] = 4;
                        hf.field_d[var4 - 1] = gi.field_n;
                        jf.field_b[var4 + -1] = 1;
                        ue.field_k[1] = 5;
                        break L1;
                      } else {
                        hf.field_d[var5] = gf.field_c[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    jf.field_b[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            mc.field_F.field_b = ue.field_k.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= hf.field_d.length) {
                L25: {
                  if (-3 != (be.field_e ^ -1)) {
                    break L25;
                  } else {
                    var10 = ka.field_o;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var4_ref_String__ = p.field_k;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = wb.a(115, false, var12);
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
                        var7 = wb.a(86, false, var11);
                        if (var3_int < var7) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                pc.field_d = -(var3_int >> 2119517185) + (wk.field_c - -var3_int);
                hg.field_f = -(var3_int >> 1891470049) + wk.field_c;
                wc.field_m = (ab.field_b - -cl.field_l << -1675940927) * mc.field_F.field_b;
                var4 = 0;
                L28: while (true) {
                  if (var4 >= hf.field_d.length) {
                    L29: {
                      if (param0 == 5) {
                        break L29;
                      } else {
                        hh.a(36);
                        break L29;
                      }
                    }
                    s.field_g = -(wc.field_m >> -176299615) + qg.field_l;
                    q.field_e = new int[hf.field_d.length][];
                    var4 = 0;
                    var5 = s.field_g;
                    L30: while (true) {
                      if (var4 >= hf.field_d.length) {
                        L31: {
                          if (2 == be.field_e) {
                            mc.field_F.a(param2, 0, -1, -1);
                            break L31;
                          } else {
                            mc.field_F.a(param2, 0, sd.a(2, j.field_c, rb.field_m), 0);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var6 = jf.field_b[var4];
                          if (0 > var6) {
                            var5 = var5 + kb.field_d;
                            break L32;
                          } else {
                            var7 = wb.a(103, true, hf.field_d[var4]);
                            var5 = var5 + cl.field_l;
                            var8 = -(var7 >> -1817928287) + wk.field_c;
                            q.field_e[var4] = new int[4];
                            q.field_e[var4][0] = -jd.field_l + var8;
                            q.field_e[var4][1] = var5;
                            q.field_e[var4][2] = (jd.field_l << 33875201) + var7;
                            var5 = var5 + (eh.field_d + (cl.field_l + (ab.field_b << -1455983519)));
                            q.field_e[var4][3] = (ab.field_b << -355479423) + eh.field_d;
                            break L32;
                          }
                        }
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackIn_108_0 = wc.field_m;

                      if ((jf.field_b[var4] ^ -1) > -1) {
                        stackIn_109_0 = stackIn_108_0;
                        stackIn_109_1 = kb.field_d;
                        break L33;
                      } else {
                        stackIn_109_0 = stackIn_108_0;
                        stackIn_109_1 = eh.field_d;
                        break L33;
                      }
                    }
                    wc.field_m = stackIn_109_0 + stackIn_109_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L34: {
                  stackIn_88_0 = 110;

                  if ((jf.field_b[var4] ^ -1) > -1) {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = 0;
                    break L34;
                  } else {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = 1;
                    break L34;
                  }
                }
                L35: {
                  var5 = wb.a(stackIn_89_0, stackIn_89_1 != 0, hf.field_d[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "hh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        try {
            hn.field_a = param6;
            jj.field_k = param2;
            fk.field_a = param4;
            if (param8 != -1) {
                hh.a(114);
            }
            mb.field_p = param1;
            ab.field_c = param7;
            nj.field_a = param0;
            ik.field_a = param3;
            mm.field_s = param5;
            ig.field_N = (ej) ((Object) new ih());
            vc.field_c = new dh(param2);
            sj.field_a = new sg(ig.field_N, vc.field_c);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(boolean param0, p param1, int[] param2) {
        int stackIn_30_0 = 0;
        p stackIn_101_0 = null;
        p stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        StringBuilder stackIn_118_1 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8_int = 0;
        double var8 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        oj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_double = param1.field_c;
              var5 = 0.0;
              if (-91 >= (param1.field_e ^ -1)) {
                break L1;
              } else {
                var5 = (double)(90 - param1.field_e) / 150.0;
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_d = -42;
                break L2;
              }
            }
            var7 = mm.field_m[0].field_j.b(-4);
            var8_int = 0;
            L3: while (true) {
              if ((var8_int ^ -1) <= -11) {
                L4: {
                  if (256.0 > param1.field_c) {
                    if (param1.field_c >= 0.0) {
                      break L4;
                    } else {
                      param1.field_c = param1.field_c + 256.0;
                      break L4;
                    }
                  } else {
                    param1.field_c = param1.field_c - 256.0;
                    break L4;
                  }
                }
                L5: {
                  var8 = param1.field_c - var3_double;
                  if (0.0 <= var8) {
                    if (256.0 <= var8) {
                      var8 = var8 - 256.0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    var8 = var8 + 256.0;
                    break L5;
                  }
                }
                L6: {
                  param1.field_e = param1.field_e + 1;
                  if (var8 <= 64.0) {
                    break L6;
                  } else {
                    if (var8 < 192.0) {
                      L7: {
                        stackIn_101_0 = (p) (param1);

                        if (param1.field_f) {
                          stackIn_102_0 = (p) ((Object) stackIn_101_0);
                          stackIn_102_1 = 0;
                          break L7;
                        } else {
                          stackIn_102_0 = (p) ((Object) stackIn_101_0);
                          stackIn_102_1 = 1;
                          break L7;
                        }
                      }
                      stackIn_102_0.field_f = stackIn_102_1 != 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if ((param1.field_e ^ -1) < -101) {
                    L9: {
                      hg.a((byte) 64, param1);
                      if (param1.field_i == 27) {
                        u.a(30, param1.field_j, true, 48, param1.field_l, 28);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      jn.field_F[ib.field_c].field_c = (double)(int)(Math.random() * 256.0);
                      jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
                      jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
                      jn.field_F[ib.field_c].field_e = 0;
                      jn.field_F[ib.field_c].field_h = 1;
                      jn.field_F[ib.field_c].field_i = 12;
                      ib.field_c = ib.field_c + 1;
                      u.a(-1, param1.field_j, true, 32, param1.field_l, 35);
                      param1.field_i = -1;
                      if (uj.field_l != 1) {
                        break L10;
                      } else {
                        if (ej.d((byte) 116)) {
                          eh.field_c.a(em.field_a[0], 50, uh.field_i);
                          break L10;
                        } else {
                          break L8;
                        }
                      }
                    }
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L0;
              } else {
                L11: {
                  param1.field_l.b(var5, param1.field_c, 127);
                  param1.a(8573);
                  var9 = param1.field_j.b(-4);
                  if (var7 == var9) {
                    break L11;
                  } else {
                    L12: {
                      if (2 == param2[var9]) {
                        break L12;
                      } else {
                        if (param2[var9] == 4) {
                          break L12;
                        } else {
                          if ((param2[var9] ^ -1) != -4) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      L14: {
                        param1.field_l.b(-var5, param1.field_c, 114);
                        param1.a(8573);
                        var10 = 0;
                        var11_int = 0;
                        if (64.0 > param1.field_c) {
                          break L14;
                        } else {
                          if (param1.field_c <= 192.0) {
                            var10 = var9 + -ln.field_a.field_d;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var10 = ln.field_a.field_d + var9;
                      break L13;
                    }
                    L15: {
                      if (param1.field_c >= 128.0) {
                        var11_int = -1 + var9;
                        break L15;
                      } else {
                        var11_int = var9 + 1;
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var10 = param2[var10];
                        var11_int = param2[var11_int];
                        if (param1.field_c <= 32.0) {
                          break L17;
                        } else {
                          if (96.0 <= param1.field_c) {
                            break L17;
                          } else {
                            stackIn_30_0 = 1;
                            break L16;
                          }
                        }
                      }
                      if (160.0 < param1.field_c) {
                        if (param1.field_c < 224.0) {
                          stackIn_30_0 = 1;
                          break L16;
                        } else {
                          stackIn_30_0 = 0;
                          break L16;
                        }
                      } else {
                        stackIn_30_0 = 0;
                        break L16;
                      }
                    }
                    L18: {
                      var12 = stackIn_30_0;
                      if (var12 == 0) {
                        break L18;
                      } else {
                        if ((var11_int ^ -1) == -3) {
                          break L18;
                        } else {
                          if (4 == var11_int) {
                            break L18;
                          } else {
                            if (var11_int == 3) {
                              break L18;
                            } else {
                              param1.field_c = -param1.field_c + 256.0;
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (2 == var10) {
                        break L19;
                      } else {
                        if (-5 == (var10 ^ -1)) {
                          break L19;
                        } else {
                          if (3 == var10) {
                            break L19;
                          } else {
                            param1.field_c = 128.0 - param1.field_c;
                            if (0.0 > param1.field_c) {
                              param1.field_c = param1.field_c + 256.0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L11;
                    } else {
                      if (var11_int == 2) {
                        break L11;
                      } else {
                        if (var11_int == 4) {
                          break L11;
                        } else {
                          if ((var11_int ^ -1) == -4) {
                            break L11;
                          } else {
                            param1.field_c = -param1.field_c + 256.0;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                L20: {
                  if (param1.field_e < 90) {
                    var10 = 0;
                    L21: while (true) {
                      if (el.field_j <= var10) {
                        break L20;
                      } else {
                        L22: {
                          L23: {
                            var11 = mm.field_m[var10];
                            var12 = 0;
                            if (var11 == null) {
                              break L23;
                            } else {
                              if (!var11.field_b) {
                                break L23;
                              } else {
                                L24: {
                                  var13 = var11.field_j.b(-4);
                                  if (var9 == var13) {
                                    break L24;
                                  } else {
                                    if (var13 - 1 == var9) {
                                      break L24;
                                    } else {
                                      if (var9 == -ln.field_a.field_d + var13) {
                                        break L24;
                                      } else {
                                        if (var9 == var13 - 1 + -ln.field_a.field_d) {
                                          break L24;
                                        } else {
                                          L25: {
                                            if ((var11.field_i ^ -1) == -9) {
                                              break L25;
                                            } else {
                                              if (27 != var11.field_i) {
                                                break L22;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          L26: {
                                            if (var9 == -2 + (var13 + -ln.field_a.field_d)) {
                                              break L26;
                                            } else {
                                              if (var9 == var13 + -(2 * ln.field_a.field_d) - 1) {
                                                break L26;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var12 = 1;
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                }
                                var12 = 1;
                                break L22;
                              }
                            }
                          }
                          L27: {
                            if (var11 == null) {
                              break L27;
                            } else {
                              if (!od.a(var11.field_i, 1)) {
                                break L27;
                              } else {
                                if (0 != var11.field_h) {
                                  var13 = var11.field_j.b(-4);
                                  if (var13 == var9) {
                                    var12 = 1;
                                    break L22;
                                  } else {
                                    if (rh.a(var11.field_i, true)) {
                                      if (var9 != -ln.field_a.field_d + var13) {
                                        break L22;
                                      } else {
                                        var12 = 1;
                                        break L22;
                                      }
                                    } else {
                                      if (var13 - -1 == var9) {
                                        var12 = 1;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          if (20 != var11.field_i) {
                            break L22;
                          } else {
                            L28: {
                              var13 = var11.field_j.b(-4);
                              if (var9 == var13) {
                                break L28;
                              } else {
                                if (-ln.field_a.field_d + var13 == var9) {
                                  break L28;
                                } else {
                                  if (var9 == ln.field_a.field_d + var13) {
                                    break L28;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            var12 = 1;
                            break L22;
                          }
                        }
                        if (var12 != 0) {
                          param1.field_e = 90;
                          break L20;
                        } else {
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  } else {
                    break L20;
                  }
                }
                var8_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3 = decompiledCaughtException;
            stackIn_115_0 = (RuntimeException) (var3);

            stackIn_115_1 = new StringBuilder().append("hh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "null";
              break L29;
            } else {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackIn_116_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_118_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(',');

            if (param2 == null) {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackIn_119_2 = "null";
              break L30;
            } else {
              stackIn_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackIn_119_2 = "{...}";
              break L30;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_116_0), stackIn_119_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_a = (bd[]) null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new bd[4];
        field_c = "Try again";
    }
}
