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
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            L0: {
              if (((wb) this).b(false)) {
                L1: {
                  L2: {
                    ((wb) this).field_u = ((wb) this).getCodeBase().getHost();
                    var11 = ((wb) this).field_u.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var11.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var11.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((wb) this).field_s = stackIn_7_1 != 0;
                  ((wb) this).field_q = Integer.parseInt(((wb) this).getParameter("gameport1"));
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
                ((wb) this).a(480, param4, param0, 640, -14384, ((wb) this).field_x, 32);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              ae.a((Throwable) (Object) var6, 10331, (String) null);
              ((wb) this).a("crash", 50);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("wb.O(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 640 + ',' + -17761 + ',' + 480 + ',' + param4 + ')');
        }
    }

    private final void g() {
        wh.field_d[10] = -1;
        wh.field_d[6] = -2;
        wh.field_d[12] = -1;
        wh.field_d[16] = -1;
        wh.field_d[2] = -2;
        wh.field_d[7] = -1;
        wh.field_d[13] = -1;
        wh.field_d[17] = -1;
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
        field_m = null;
    }

    private final void j() {
        int var2 = fj.field_g.d((byte) -121);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = jd.field_b - 1;
        byte[] var5 = new byte[var4];
        fj.field_g.a(var4, var5, 0, 0);
        int discarded$0 = 56;
        int discarded$1 = -20517;
        wi.a(gg.a(var5), hc.a(0), var3 != 0);
    }

    private final void f() {
        int discarded$0 = 126;
        String var2 = jj.i();
        pl.a(var2, (byte) -80, hc.a(0));
        int var3 = 0;
    }

    private final int e() {
        int var2 = 0;
        if (!((wb) this).field_j) {
          if (dn.i(-19301)) {
            if (!ja.field_b) {
              int discarded$2 = 23917;
              var2 = de.a(true, we.p((byte) 106), ja.a(), ((wb) this).field_v, true, ((wb) this).field_s);
              if (var2 != -1) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (lf.field_n) {
                          break L1;
                        } else {
                          ((wb) this).a("reconnect", 50);
                          break L1;
                        }
                      }
                      nc.d((byte) 101);
                      qh.a(10, var2, sc.field_d);
                      ja.field_b = true;
                      qh.field_e = pd.a(-22826) - -15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (fl.field_a != 11) {
                    break L2;
                  } else {
                    if (co.field_b != 0) {
                      break L2;
                    } else {
                      tc.a((byte) 98);
                      break L2;
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
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = 80 / ((param0 - -51) / 51);
            int discarded$12 = 0;
            var2 = this.e();
            if (0 == var2) {
              break L1;
            } else {
              if (var2 != 1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!i.field_X[1]) {
              break L2;
            } else {
              int discarded$13 = -95;
              int discarded$14 = 2;
              td.a();
              break L2;
            }
          }
          L3: {
            if (!i.field_X[2]) {
              break L3;
            } else {
              dp.a(3, -4);
              break L3;
            }
          }
          L4: {
            if (i.field_X[3]) {
              mj.a(4, -1);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!i.field_X[4]) {
              break L5;
            } else {
              ca.a(5, (byte) -118);
              break L5;
            }
          }
          L6: {
            if (!i.field_X[5]) {
              break L6;
            } else {
              int discarded$15 = 6;
              int discarded$16 = 67600;
              wc.f();
              break L6;
            }
          }
          L7: {
            if (!i.field_X[6]) {
              break L7;
            } else {
              wi.a(0, 7);
              break L7;
            }
          }
          if (i.field_X[8]) {
            int discarded$17 = -78;
            ni.a();
            break L0;
          } else {
            break L0;
          }
        }
        return var2;
    }

    final void e(int param0) {
        int var2 = 0;
        aa var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == -12) {
          L0: {
            var2 = l.field_d;
            if (var2 >= 64) {
              break L0;
            } else {
              if (i.field_X[var2]) {
                if (var2 != 0) {
                  L1: {
                    if (1 != var2) {
                      if (var2 == 2) {
                        int discarded$10 = -83;
                        ej.a();
                        break L1;
                      } else {
                        if (3 != var2) {
                          if (4 != var2) {
                            if (var2 != 5) {
                              if (var2 == 6) {
                                wc.w(param0 + 135);
                                break L1;
                              } else {
                                if (var2 != 7) {
                                  if (var2 != 8) {
                                    if (var2 != 16) {
                                      L2: {
                                        if (11 == var2) {
                                          break L2;
                                        } else {
                                          if (var2 != 12) {
                                            if (var2 != 13) {
                                              if (17 == var2) {
                                                int discarded$11 = -1;
                                                this.j();
                                                break L1;
                                              } else {
                                                if (var2 == 18) {
                                                  tg.a(param0 ^ -114);
                                                  break L1;
                                                } else {
                                                  int discarded$12 = 3;
                                                  ae.a((Throwable) null, param0 ^ -10321, "MGS1: " + cb.f());
                                                  p.a(1);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              int discarded$13 = 1545;
                                              va.a();
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_29_0 = 0;
                                          stackIn_30_0 = stackOut_29_0;
                                          break L3;
                                        } else {
                                          stackOut_28_0 = 1;
                                          stackIn_30_0 = stackOut_28_0;
                                          break L3;
                                        }
                                      }
                                      var3 = ln.a(stackIn_30_0 != 0, 62);
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
                                  int discarded$14 = 66;
                                  this.f();
                                  break L1;
                                }
                              }
                            } else {
                              int discarded$15 = -120;
                              ra.b();
                              break L1;
                            }
                          } else {
                            int discarded$16 = 68;
                            pb.c();
                            break L1;
                          }
                        } else {
                          int discarded$17 = 1;
                          fm.b();
                          break L1;
                        }
                      }
                    } else {
                      int discarded$18 = 14740;
                      nm.a();
                      break L1;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          int discarded$19 = 3;
          ae.a((Throwable) null, param0 ^ -10321, "MGS2: " + cb.f());
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
        int stackIn_133_0 = 0;
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
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
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
          int discarded$25 = 27914;
          ha.b();
          int discarded$26 = -74;
          pb.d();
          int discarded$27 = -44;
          if (uk.a()) {
            break L2;
          } else {
            if (fl.field_a == 11) {
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
                int discarded$28 = -120;
                if (dg.a() <= var3) {
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
            int discarded$29 = -110;
            rh.a();
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
              if (co.field_b != 0) {
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
            int discarded$30 = 256;
            co.field_b = ci.a();
            if (var3 == 0) {
              break L9;
            } else {
              if (0 != co.field_b) {
                break L9;
              } else {
                if (fl.field_a != 11) {
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
          if (co.field_b == -1) {
            break L10;
          } else {
            if (co.field_b == 0) {
              break L10;
            } else {
              if (10 <= ld.field_j) {
                if (fl.field_a < 10) {
                  break L10;
                } else {
                  L11: {
                    nc.d((byte) 118);
                    if (co.field_b == 3) {
                      qh.a(10, 256, rf.field_a);
                      break L11;
                    } else {
                      if (co.field_b == 4) {
                        qh.a(10, 256, ac.field_o);
                        break L11;
                      } else {
                        if (co.field_b == 2) {
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
                if (co.field_b == 3) {
                  ((wb) this).a("js5crc", 50);
                  break L10;
                } else {
                  if (co.field_b != 4) {
                    if (co.field_b != 2) {
                      if (co.field_b != 5) {
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
          if (~pd.a(-22826) <= ~qh.field_e) {
            ja.field_b = false;
            if (-1 == co.field_b) {
              break L12;
            } else {
              if (0 != co.field_b) {
                co.field_b = -1;
                int discarded$31 = 0;
                si.x();
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
          if (co.field_b != 0) {
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
          if (ld.field_j == 0) {
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
          if (ld.field_j != 1) {
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
            int discarded$32 = 0;
            int discarded$33 = 1;
            int discarded$34 = -85;
            vo.field_d = wn.a(true, mp.field_d);
            int discarded$35 = 0;
            int discarded$36 = 1;
            int discarded$37 = -85;
            da.field_l = wn.a(true, hf.field_F);
            int discarded$38 = 0;
            int discarded$39 = 1;
            int discarded$40 = -85;
            al.field_a = wn.a(true, ho.field_b);
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
                      int discarded$41 = -50;
                      ep.c();
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
          if (ld.field_j != 3) {
            break L21;
          } else {
            if (!al.a(al.field_a, -31526, vo.field_d, da.field_l)) {
              break L21;
            } else {
              if (eh.a(false, al.field_a)) {
                L22: {
                  L23: {
                    ph.b(26311);
                    int discarded$42 = 121;
                    ng.a();
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
                    int discarded$43 = -50;
                    jp.b();
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != t.field_m) {
                    break L27;
                  } else {
                    int discarded$44 = 0;
                    t.field_m = ui.a();
                    nk.field_g = pb.c(-1);
                    break L27;
                  }
                }
                nl.a(nk.field_g, t.field_m, (byte) -98, al.field_a);
                al.field_a = null;
                vo.field_d = null;
                da.field_l = null;
                ca.a((byte) 104, (java.applet.Applet) this);
                int discarded$45 = -50;
                ep.c();
                ld.field_j = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (ld.field_j != 10) {
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
                int discarded$46 = -1;
                eh.a(ic.a(l.field_g, (byte) 114, cj.field_e, aa.field_f), 0.0f);
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
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (null != bp.field_h) {
                L36: {
                  if (!bp.field_h.a(-1)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L36;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L36;
                  }
                }
                var3 = stackIn_133_0;
                int discarded$47 = -1;
                eh.a(bp.field_h.field_b, bp.field_h.field_a);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              ld.field_j = 20;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!rl.field_f) {
              break L37;
            } else {
              fa.a((byte) -46, cj.field_d);
              ((wb) this).a(true);
              se.a(20922, cj.field_d);
              break L37;
            }
          }
        }
        L38: {
          if (i.field_X[8]) {
            int discarded$48 = -48;
            da.d();
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          if (!param1) {
            break L39;
          } else {
            int discarded$49 = this.a(true, true, -49);
            break L39;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param1 < 107) {
            return;
        }
        try {
            this.a(param2, 640, -17761, 480, param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "wb.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        int var5 = param1 >> 16;
        int var6 = param1 & 65535;
        return param1 * var3 + (var4 * var5 - -(var4 * var6 >> 16));
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
            var8 = ZombieDawn.field_J;
            var4 = bg.a(121, id.field_I, param1, jp.field_a);
            if (var4 != 0) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$8 = -8;
                    var5_int = pa.a(tp.c((byte) 0), cm.a(), (byte) -90);
                    if (var5_int == -1) {
                      break L1;
                    } else {
                      mp.a(1000, ho.field_a, var5_int, sc.field_d);
                      ho.field_a = null;
                      sc.field_d = null;
                      break L1;
                    }
                  }
                  int discarded$9 = 86;
                  var11 = wf.e();
                  if (var11 == null) {
                    break L0;
                  } else {
                    fo.a(-128, var11.booleanValue());
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (2 != var4) {
                  break L2;
                } else {
                  int discarded$10 = 17821;
                  int discarded$11 = 23917;
                  int discarded$12 = 0;
                  var5_int = md.a(co.c(), ra.e((byte) -57), ja.a(), la.b(), (byte) -15, ((wb) this).field_v, we.p((byte) -117));
                  if (var5_int != -1) {
                    ln.a(var5_int, -14, sc.field_d, ho.field_a);
                    ho.field_a = null;
                    sc.field_d = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (co.field_b == -1) {
                      break L4;
                    } else {
                      if (co.field_b != 0) {
                        co.field_b = -1;
                        int discarded$13 = 0;
                        si.x();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    int discarded$14 = 23917;
                    var5_int = de.a(true, we.p((byte) 126), ja.a(), ((wb) this).field_v, false, ((wb) this).field_s);
                    if (var5_int != -1) {
                      if (0 == var5_int) {
                        nk.field_e = p.field_a;
                        tc.a((byte) 124);
                        i.field_Y = false;
                        fl.field_a = 10;
                        break L3;
                      } else {
                        qh.a(10, var5_int, sc.field_d);
                        sc.field_d = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ja.field_b = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 == 4) {
                  if (ih.field_S) {
                    qg.a(hc.a(0), (byte) 80);
                    break L5;
                  } else {
                    fl.field_a = 10;
                    i.field_Y = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  bo.a(-88, hc.a(0));
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (!de.field_i) {
                    break L7;
                  } else {
                    fl.field_a = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  lc.a(hc.a(0), -2895);
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  qg.a(hc.a(0), (byte) 77);
                  break L9;
                }
              }
              L10: {
                if (9 == var4) {
                  vb.a((byte) 50, hc.a(0));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  dp.field_e.j(11, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  fo.a(38205, hc.a(0));
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  int discarded$15 = -12;
                  qi.a(ff.a(), hc.a(0), -66);
                  break L13;
                }
              }
              L14: {
                if (param2 > 36) {
                  break L14;
                } else {
                  ((wb) this).field_q = 102;
                  break L14;
                }
              }
              L15: {
                if (var4 == 13) {
                  try {
                    L16: {
                      L17: {
                        if (hp.field_E != null) {
                          break L17;
                        } else {
                          hp.field_E = new li(vh.field_a, new java.net.URL(((wb) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        }
                      }
                      L18: {
                        if (hp.field_E.a(105)) {
                          L19: {
                            var12 = hp.field_E.a((byte) -118);
                            if (var12 != null) {
                              var7 = fa.a(var12.field_h, var12.field_j, 0, -124);
                              vf.a(74, var7);
                              break L19;
                            } else {
                              var9 = null;
                              vf.a(48, (String) null);
                              break L19;
                            }
                          }
                          hp.field_E = null;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      ae.a((Throwable) (Object) var5, 10331, "S1");
                      var10 = null;
                      vf.a(87, (String) null);
                      hp.field_E = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (var4 == 15) {
                  fl.field_a = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (var4 != 16) {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              } else {
                return 1;
              }
            } else {
              throw new IllegalStateException();
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
        int discarded$0 = -114;
        bd.a();
        int discarded$1 = 94;
        jl.field_u = n.c();
        se.a(param1 ^ 20925, cj.field_d);
        f.field_f = param4;
        if (param1 != 7) {
            field_t = 6;
        }
        hf.field_F = param6;
        ho.field_b = param2;
        jh.field_k = param7;
        mp.field_d = param5;
        int discarded$2 = 17;
        this.g();
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
          int discarded$165 = 18840;
          if (bj.d()) {
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
            int discarded$166 = this.a(stackIn_12_1 != 0, stackIn_12_2 != 0, 115);
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
                  int discarded$167 = this.a(false, false, param0 ^ 72);
                  break L1;
                }
              } else {
                int discarded$168 = -21215;
                am.k();
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
