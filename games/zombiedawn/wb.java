/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class wb extends ke {
    static int field_t;
    private boolean field_s;
    private long field_p;
    String field_u;
    static int field_y;
    private int field_x;
    private int field_l;
    private int field_v;
    private int field_n;
    private boolean field_o;
    static rb field_m;
    private boolean field_r;
    private int field_q;
    private int field_w;

    final void d(boolean param0) {
        if (param0) {
            return;
        }
        i.field_X[4] = true;
    }

    final void h(byte param0) {
        i.field_X[5] = true;
        if (param0 < 43) {
            ((wb) this).g((byte) 106);
        }
    }

    final void k(int param0) {
        i.field_X[12] = true;
        i.field_X[13] = true;
        if (param0 > -110) {
            ((wb) this).field_q = -51;
        }
        i.field_X[11] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        ((wb) this).b((byte) 96, false);
        if (param4 != -6046) {
            field_t = -76;
        }
        if (param0) {
            ((wb) this).i(12);
        }
        if (!(!param2)) {
            ((wb) this).f(-1);
        }
        if (!(!param1)) {
            ((wb) this).d(false);
        }
        if (param3) {
            ((wb) this).h((byte) 78);
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((wb) this).b(false)) {
            L0: {
              L1: {
                ((wb) this).field_u = ((wb) this).getCodeBase().getHost();
                var11 = ((wb) this).field_u.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var11.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var11.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((wb) this).field_s = stackIn_7_1 != 0;
              ((wb) this).field_q = Integer.parseInt(((wb) this).getParameter("gameport1"));
              if (param2 == -17761) {
                break L2;
              } else {
                this.j(-81);
                break L2;
              }
            }
            L3: {
              ((wb) this).field_w = Integer.parseInt(((wb) this).getParameter("gameport2"));
              var7 = ((wb) this).getParameter("servernum");
              if (var7 != null) {
                ((wb) this).field_n = Integer.parseInt(var7);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((wb) this).field_x = Integer.parseInt(((wb) this).getParameter("gamecrc"));
              ((wb) this).field_p = Long.parseLong(((wb) this).getParameter("instanceid"));
              ((wb) this).field_o = ((wb) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((wb) this).getParameter("lang");
              if (var8 != null) {
                ((wb) this).field_l = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (5 > ((wb) this).field_l) {
                break L5;
              } else {
                ((wb) this).field_l = 0;
                break L5;
              }
            }
            L6: {
              var9 = ((wb) this).getParameter("affid");
              if (var9 != null) {
                ((wb) this).field_v = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            di.field_J = Boolean.valueOf(((wb) this).getParameter("simplemode")).booleanValue();
            ((wb) this).a(param3, param4, param0, param1, -14384, ((wb) this).field_x, 32);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        ae.a((Throwable) (Object) var6, param2 ^ -27964, (String) null);
        ((wb) this).a("crash", 50);
    }

    private final void g(int param0) {
        wh.field_d[10] = -1;
        wh.field_d[6] = -2;
        wh.field_d[12] = -1;
        wh.field_d[16] = -1;
        wh.field_d[2] = -2;
        wh.field_d[7] = -1;
        wh.field_d[13] = -1;
        wh.field_d[param0] = -1;
        wh.field_d[11] = -1;
        wh.field_d[8] = -2;
        wh.field_d[4] = -1;
        wh.field_d[9] = -1;
        wh.field_d[3] = -1;
        wh.field_d[18] = 1;
        wh.field_d[1] = 16;
        wh.field_d[5] = -1;
    }

    final void f(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((wb) this).a(81, true);
        }
        i.field_X[2] = true;
    }

    public static void f(boolean param0) {
        if (param0) {
            field_y = 57;
        }
        field_m = null;
    }

    private final void j(int param0) {
        int var2 = fj.field_g.d((byte) -121);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        if (param0 != -1) {
            ((wb) this).field_x = -26;
        }
        int var4 = jd.field_b - 1;
        byte[] var5 = new byte[var4];
        fj.field_g.a(var4, var5, 0, param0 + 1);
        wi.a(gg.a(var5, (byte) 56), hc.a(0), var3 != 0, -20517);
    }

    private final void f(byte param0) {
        String var2 = jj.i(126);
        pl.a(var2, (byte) -80, hc.a(0));
        int var3 = 110 % ((5 - param0) / 53);
    }

    private final int e(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        if (!((wb) this).field_j) {
          if (dn.i(-19301)) {
            if (!ja.field_b) {
              var2 = de.a(true, we.p((byte) 106), ja.a(23917), ((wb) this).field_v, true, ((wb) this).field_s);
              if (0 != (var2 ^ -1)) {
                L0: {
                  if (0 != var2) {
                    if (var2 == 1) {
                      if ((fl.field_a ^ -1) == -12) {
                        if (co.field_b == 0) {
                          tc.a((byte) 98);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    } else {
                      L1: {
                        if (lf.field_n) {
                          break L1;
                        } else {
                          ((wb) this).a("reconnect", 50);
                          break L1;
                        }
                      }
                      L2: {
                        nc.d((byte) 101);
                        qh.a(10, var2, sc.field_d);
                        ja.field_b = true;
                        if (!param0) {
                          break L2;
                        } else {
                          var3 = null;
                          ((wb) this).a(-31, 70, (String) null);
                          break L2;
                        }
                      }
                      qh.field_e = pd.a(-22826) - -15000L;
                      return var2;
                    }
                  } else {
                    if ((fl.field_a ^ -1) == -12) {
                      if (co.field_b == 0) {
                        tc.a((byte) 98);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 != -27698) {
            return 106;
        }
        return this.a(true, param1, 101);
    }

    final int h(int param0) {
        int var3 = 80 / ((param0 - -51) / 51);
        int var2 = this.e(false);
        if (0 != var2) {
            // if_icmpne L154
        }
        if (i.field_X[1]) {
            td.a(2, (byte) -95);
        }
        if (i.field_X[2]) {
            dp.a(3, -4);
        }
        if (!(!i.field_X[3])) {
            mj.a(4, -1);
        }
        if (i.field_X[4]) {
            ca.a(5, (byte) -118);
        }
        if (i.field_X[5]) {
            wc.f(67600, 6);
        }
        if (i.field_X[6]) {
            wi.a(0, 7);
        }
        if (!(!i.field_X[8])) {
            ni.a((byte) -78);
        }
        return var2;
    }

    final void e(int param0) {
        int var2 = 0;
        aa var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == -12) {
          L0: {
            var2 = l.field_d;
            if (var2 >= 64) {
              break L0;
            } else {
              if (i.field_X[var2]) {
                if (var2 == 0) {
                  return;
                } else {
                  L1: {
                    if (1 != var2) {
                      if (var2 == 2) {
                        ej.a((byte) -83);
                        break L1;
                      } else {
                        if (3 != var2) {
                          if (4 != var2) {
                            if (var2 != 5) {
                              if (-7 == (var2 ^ -1)) {
                                wc.w(param0 + 135);
                                break L1;
                              } else {
                                if (var2 != 7) {
                                  if (var2 != -9) {
                                    if (-17 != var2) {
                                      L2: {
                                        if (11 == var2) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) != -13) {
                                            if (-14 != var2) {
                                              if (17 == var2) {
                                                this.j(-1);
                                                break L1;
                                              } else {
                                                if (-19 == var2) {
                                                  tg.a(param0 ^ -114);
                                                  break L1;
                                                } else {
                                                  ae.a((Throwable) null, param0 ^ -10321, "MGS1: " + cb.f(3));
                                                  p.a(1);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              va.a(1545);
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_28_0 = 0;
                                          stackIn_29_0 = stackOut_28_0;
                                          break L3;
                                        } else {
                                          stackOut_27_0 = 1;
                                          stackIn_29_0 = stackOut_27_0;
                                          break L3;
                                        }
                                      }
                                      var3 = ln.a(stackIn_29_0 != 0, 62);
                                      oe.a(0, var3);
                                      break L1;
                                    } else {
                                      uk.a(false);
                                      break L1;
                                    }
                                  } else {
                                    di.a((de) (Object) fj.field_g, 30, jd.field_b, vh.field_a);
                                    break L1;
                                  }
                                } else {
                                  this.f((byte) 66);
                                  break L1;
                                }
                              }
                            } else {
                              ra.b((byte) -120);
                              break L1;
                            }
                          } else {
                            pb.c((byte) 68);
                            break L1;
                          }
                        } else {
                          fm.b(true);
                          break L1;
                        }
                      }
                    } else {
                      nm.a(14740);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          ae.a((Throwable) null, param0 ^ -10321, "MGS2: " + cb.f(3));
          p.a(param0 ^ -11);
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_22_0 = 0;
        int stackIn_98_0 = 0;
        String stackIn_98_1 = null;
        int stackIn_99_0 = 0;
        String stackIn_99_1 = null;
        int stackIn_100_0 = 0;
        String stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_97_0 = 0;
        String stackOut_97_1 = null;
        int stackOut_99_0 = 0;
        String stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_98_0 = 0;
        String stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (null != rn.field_b) {
            L1: {
              if (null != cn.field_b) {
                break L1;
              } else {
                var6 = va.b((byte) -121);
                var4 = var6.getSize();
                rn.field_b.b(var4.height, var4.width, -1);
                break L1;
              }
            }
            rn.field_b.d(26);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ha.b(27914);
          pb.d((byte) -74);
          if (uk.a((byte) -44)) {
            break L2;
          } else {
            if (-12 == (fl.field_a ^ -1)) {
              break L2;
            } else {
              mk.a(-128);
              break L2;
            }
          }
        }
        L3: {
          if (jl.field_u == null) {
            break L3;
          } else {
            id.field_I = jl.field_u.a(-96);
            break L3;
          }
        }
        L4: {
          if (!ng.a((byte) -64)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * nk.a((byte) 121);
              if (((wb) this).field_r) {
                break L5;
              } else {
                if (dg.a((byte) -120) <= var3) {
                  break L4;
                } else {
                  if (ia.a((byte) 119) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((wb) this).field_r = false;
            p.a(1);
            nc.d((byte) -3);
            qh.a(10, 2, qb.field_f);
            rh.a(-110);
            ja.field_b = true;
            qh.field_e = 15000L + pd.a(-22826);
            break L4;
          }
        }
        L6: {
          L7: {
            if (co.field_b == -1) {
              break L7;
            } else {
              if (-1 != (co.field_b ^ -1)) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (co.field_b != -1) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L8;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_22_0;
            co.field_b = ci.a(256);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 != co.field_b) {
                break L9;
              } else {
                if (-12 != (fl.field_a ^ -1)) {
                  break L9;
                } else {
                  if (!dn.i(-19301)) {
                    tc.a((byte) -52);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (co.field_b == -1) {
            break L6;
          } else {
            if (co.field_b != 0) {
              qh.field_e = 15000L + pd.a(-22826);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if ((co.field_b ^ -1) == 0) {
            break L10;
          } else {
            if (co.field_b == -1) {
              break L10;
            } else {
              if (10 <= ld.field_j) {
                if (fl.field_a < 10) {
                  break L10;
                } else {
                  L11: {
                    nc.d((byte) 118);
                    if ((co.field_b ^ -1) == -4) {
                      qh.a(10, 256, rf.field_a);
                      break L11;
                    } else {
                      if ((co.field_b ^ -1) == -5) {
                        qh.a(10, 256, ac.field_o);
                        break L11;
                      } else {
                        if ((co.field_b ^ -1) == -3) {
                          qh.a(10, 256, oe.field_d);
                          break L11;
                        } else {
                          if (5 == co.field_b) {
                            qh.a(10, 5, ia.field_f);
                            break L11;
                          } else {
                            qh.a(10, 256, ih.field_T);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  ja.field_b = true;
                  break L10;
                }
              } else {
                if (-4 == co.field_b) {
                  ((wb) this).a("js5crc", 50);
                  break L10;
                } else {
                  if (co.field_b != -5) {
                    if (-3 != co.field_b) {
                      if ((co.field_b ^ -1) != -6) {
                        ((wb) this).a("js5connect", 50);
                        break L10;
                      } else {
                        ((wb) this).a("outofdate", 50);
                        break L10;
                      }
                    } else {
                      ((wb) this).a("js5connect_full", 50);
                      break L10;
                    }
                  } else {
                    ((wb) this).a("js5io", 50);
                    break L10;
                  }
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (co.field_b == -1) {
                break L14;
              } else {
                if (co.field_b != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (dn.i(-19301)) {
              break L13;
            } else {
              break L12;
            }
          }
          if ((pd.a(-22826) ^ -1L) <= (qh.field_e ^ -1L)) {
            ja.field_b = false;
            if (-1 == co.field_b) {
              break L12;
            } else {
              if (0 != co.field_b) {
                co.field_b = -1;
                si.x(0);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (-1 != co.field_b) {
            break L15;
          } else {
            if (!dn.i(-19301)) {
              ma.field_p = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (-1 == ld.field_j) {
            if (!sc.a((byte) -128)) {
              break L16;
            } else {
              ld.field_j = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if ((ld.field_j ^ -1) != -2) {
            break L17;
          } else {
            L18: {
              if (jp.field_a != 0) {
                f.field_i = mm.a(f.field_f, (byte) -63);
                break L18;
              } else {
                break L18;
              }
            }
            vo.field_d = wn.a(true, mp.field_d, (byte) -85, 1, false);
            da.field_l = wn.a(true, hf.field_F, (byte) -85, 1, false);
            al.field_a = wn.a(true, ho.field_b, (byte) -85, 1, false);
            gj.field_i = da.field_l;
            nl.field_p = vo.field_d;
            ld.field_j = 2;
            break L17;
          }
        }
        L19: {
          if (ld.field_j != 2) {
            break L19;
          } else {
            L20: {
              if (f.field_i == null) {
                break L20;
              } else {
                if (f.field_i.a((byte) 73)) {
                  if (!f.field_i.a("", 0)) {
                    f.field_i = null;
                    break L20;
                  } else {
                    if (f.field_i.a(-1, "")) {
                      bn.a(32693, f.field_i);
                      f.field_i = null;
                      ep.c((byte) -50);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (null != f.field_i) {
              break L19;
            } else {
              ld.field_j = 3;
              break L19;
            }
          }
        }
        L21: {
          if ((ld.field_j ^ -1) != -4) {
            break L21;
          } else {
            if (!al.a(al.field_a, -31526, vo.field_d, da.field_l)) {
              break L21;
            } else {
              if (eh.a(false, al.field_a)) {
                L22: {
                  L23: {
                    ph.b(26311);
                    ng.a(121);
                    ka.field_a = ql.field_f;
                    de.field_i = false;
                    nk.a(al.field_a, -1, da.field_l, vo.field_d, ih.field_S);
                    if (sn.field_b) {
                      break L23;
                    } else {
                      if (fo.field_b == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_97_0 = -753;
                    stackOut_97_1 = fo.field_b;
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_99_1 = stackOut_97_1;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    if (sn.field_b) {
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = (String) (Object) stackIn_99_1;
                      stackOut_99_2 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      stackIn_100_1 = stackOut_99_1;
                      stackIn_100_2 = stackOut_99_2;
                      break L24;
                    } else {
                      stackOut_98_0 = stackIn_98_0;
                      stackOut_98_1 = (String) (Object) stackIn_98_1;
                      stackOut_98_2 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      stackIn_100_1 = stackOut_98_1;
                      stackIn_100_2 = stackOut_98_2;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_100_0 = stackIn_100_0;
                    stackOut_100_1 = (String) (Object) stackIn_100_1;
                    stackOut_100_2 = stackIn_100_2;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_102_2 = stackOut_100_2;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    stackIn_101_2 = stackOut_100_2;
                    if (sn.field_b) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = (String) (Object) stackIn_102_1;
                      stackOut_102_2 = stackIn_102_2;
                      stackOut_102_3 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      stackIn_103_3 = stackOut_102_3;
                      break L25;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = (String) (Object) stackIn_101_1;
                      stackOut_101_2 = stackIn_101_2;
                      stackOut_101_3 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      stackIn_103_3 = stackOut_101_3;
                      break L25;
                    }
                  }
                  gl.a(stackIn_103_0, stackIn_103_1, stackIn_103_2 != 0, stackIn_103_3 != 0);
                  break L22;
                }
                L26: {
                  if (di.field_J) {
                    jp.b((byte) -50);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != t.field_m) {
                    break L27;
                  } else {
                    t.field_m = ui.a(0);
                    nk.field_g = pb.c(-1);
                    break L27;
                  }
                }
                nl.a(nk.field_g, t.field_m, (byte) -98, al.field_a);
                al.field_a = null;
                vo.field_d = null;
                da.field_l = null;
                ca.a((byte) 104, (java.applet.Applet) this);
                ep.c((byte) -50);
                ld.field_j = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if ((ld.field_j ^ -1) != -11) {
            break L28;
          } else {
            L29: {
              if (0 != jp.field_a) {
                aa.field_f = mm.a(jh.field_k, (byte) -56);
                break L29;
              } else {
                break L29;
              }
            }
            ld.field_j = 11;
            break L28;
          }
        }
        L30: {
          if (ld.field_j == 11) {
            L31: {
              if (null == aa.field_f) {
                break L31;
              } else {
                L32: {
                  if (!aa.field_f.a((byte) 73)) {
                    break L32;
                  } else {
                    if (!aa.field_f.c(9001)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                eh.a(ic.a(l.field_g, (byte) 114, cj.field_e, aa.field_f), 0.0f, -1);
                break L30;
              }
            }
            di.field_K = true;
            ld.field_j = 12;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (ld.field_j == 12) {
            if (di.field_K) {
              break L33;
            } else {
              ld.field_j = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (ld.field_j != 13) {
            if (param0) {
              break L34;
            } else {
              if (!rl.field_f) {
                break L34;
              } else {
                fa.a((byte) -46, cj.field_d);
                ((wb) this).a(true);
                se.a(20922, cj.field_d);
                break L34;
              }
            }
          } else {
            if (param0) {
              break L34;
            } else {
              if (!rl.field_f) {
                break L34;
              } else {
                fa.a((byte) -46, cj.field_d);
                ((wb) this).a(true);
                se.a(20922, cj.field_d);
                break L34;
              }
            }
          }
        }
        L35: {
          if (i.field_X[8]) {
            da.d((byte) -48);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          if (!param1) {
            break L36;
          } else {
            int discarded$1 = this.a(true, true, -49);
            break L36;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param1 < 107) {
            return;
        }
        this.a(param2, 640, -17761, 480, param0);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 1546377776;
        int var4 = param2 & 65535;
        if (param0 <= 1) {
            wb.f(true);
        }
        int var5 = param1 >> 94076016;
        int var6 = param1 & 65535;
        return param1 * var3 + (var4 * var5 - -(var4 * var6 >> -995403856));
    }

    final void i(int param0) {
        if (param0 != 12) {
            field_m = null;
        }
        i.field_X[1] = true;
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            de var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ZombieDawn.field_J;
                        var4 = bg.a(121, id.field_I, param1, jp.field_a);
                        if (var4 != 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if (var4 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = pa.a(tp.c((byte) 0), cm.a((byte) -8), (byte) -90);
                        if (var5_int == -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        mp.a(1000, ho.field_a, var5_int, sc.field_d);
                        ho.field_a = null;
                        sc.field_d = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var11 = wf.e((byte) 86);
                        if (var11 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        fo.a(-128, var11.booleanValue());
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (2 != var4) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var5_int = md.a(co.c(17821), ra.e((byte) -57), ja.a(23917), la.b(0), (byte) -15, ((wb) this).field_v, we.p((byte) -117));
                        if (var5_int != -1) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ln.a(var5_int, -14, sc.field_d, ho.field_a);
                        ho.field_a = null;
                        sc.field_d = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-4 == var4) {
                            statePc = 14;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 == co.field_b) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (co.field_b != 0) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        co.field_b = -1;
                        si.x(0);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (!param0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ja.field_b = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 20: {
                        var5_int = de.a(true, we.p((byte) 126), ja.a(23917), ((wb) this).field_v, false, ((wb) this).field_s);
                        if ((var5_int ^ -1) != 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 == var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        qh.a(10, var5_int, sc.field_d);
                        sc.field_d = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        nk.field_e = p.field_a;
                        tc.a((byte) 124);
                        i.field_Y = false;
                        fl.field_a = 10;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var4 == 4) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (ih.field_S) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        fl.field_a = 10;
                        i.field_Y = true;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        qg.a(hc.a(0), (byte) 80);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (var4 != -6) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        bo.a(-88, hc.a(0));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (-7 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!de.field_i) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        fl.field_a = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (-8 != (var4 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        lc.a(hc.a(0), -2895);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if ((var4 ^ -1) != -9) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        qg.a(hc.a(0), (byte) 77);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (9 == var4) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        vb.a((byte) 50, hc.a(0));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (var4 != -11) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        dp.field_e.j(11, 17);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (-12 != var4) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        fo.a(38205, hc.a(0));
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if ((var4 ^ -1) != -13) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        qi.a(ff.a((byte) -12), hc.a(0), -66);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (param2 > 36) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        ((wb) this).field_q = 102;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if ((var4 ^ -1) == -14) {
                            statePc = 53;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        try {
                            if (hp.field_E != null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            hp.field_E = new li(vh.field_a, new java.net.URL(((wb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (hp.field_E.a(105)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var12 = hp.field_E.a((byte) -118);
                            if (var12 != null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var9 = null;
                            vf.a(48, (String) null);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7 = fa.a(var12.field_h, var12.field_j, 0, -124);
                            vf.a(74, var7);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            hp.field_E = null;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var5 = (Exception) (Object) caughtException;
                        ae.a((Throwable) (Object) var5, 10331, "S1");
                        var10 = null;
                        vf.a(87, (String) null);
                        hp.field_E = null;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (-16 == var4) {
                            statePc = 65;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        fl.field_a = 10;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (-17 != var4) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        return 1;
                    }
                    case 68: {
                        if ((var4 ^ -1) == -18) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        return 0;
                    }
                    case 70: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((wb) this).setBackground(java.awt.Color.black);
        jp.field_a = ((wb) this).field_l;
        pc.a(jp.field_a, (byte) -66);
        s.a(((wb) this).field_p, 5000, ((wb) this).field_o, jp.field_a, param3, ((wb) this).field_x, ((wb) this).field_n, 5000, ((wb) this).field_q, param0, vh.field_a, ((wb) this).field_u, param1 + 120, ((wb) this).field_w);
        mh.a(((wb) this).field_n, ((wb) this).field_w, ((wb) this).field_x, ((wb) this).field_u, ((wb) this).field_q, param0, vh.field_a, 0, jp.field_a);
        bd.a((byte) -114);
        jl.field_u = n.c((byte) 94);
        se.a(param1 ^ 20925, cj.field_d);
        f.field_f = param4;
        if (param1 != 7) {
            field_t = 6;
        }
        hf.field_F = param6;
        ho.field_b = param2;
        jh.field_k = param7;
        mp.field_d = param5;
        this.g(17);
        gm.b(-23148);
    }

    final void i(byte param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 == 20) {
            break L0;
          } else {
            ((wb) this).field_v = 4;
            break L0;
          }
        }
        L1: {
          if (bj.d(18840)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (cn.field_b == null) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L2;
              }
            }
            int discarded$102 = this.a(stackIn_12_1 != 0, stackIn_12_2 != 0, 115);
            break L1;
          } else {
            if (ld.field_j < 10) {
              break L1;
            } else {
              if (kk.a(param0 ^ -239)) {
                if (fl.field_a != 0) {
                  wd.b(112, id.field_I);
                  break L1;
                } else {
                  int discarded$103 = this.a(false, false, param0 ^ 72);
                  break L1;
                }
              } else {
                am.k(-21215);
                break L1;
              }
            }
          }
        }
    }

    final void b(byte param0, boolean param1) {
        i.field_X[17] = true;
        int var3 = 66 % ((param0 - -23) / 45);
        i.field_X[8] = param1;
        i.field_X[3] = true;
        i.field_X[16] = true;
        i.field_X[0] = true;
        i.field_X[18] = true;
        i.field_X[7] = true;
    }

    wb() {
    }

    final void g(byte param0) {
        i.field_X[6] = true;
        int var2 = 123 / ((-47 - param0) / 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = -1;
        field_y = 0;
    }
}
