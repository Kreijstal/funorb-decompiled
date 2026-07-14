/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    private int field_v;
    private float field_s;
    private int field_b;
    private boolean field_l;
    private rd field_q;
    private int field_c;
    private int field_e;
    private int field_u;
    private int field_a;
    private int field_h;
    static og[] field_d;
    static int[] field_j;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_i;
    private int field_p;
    private int field_k;
    static String[] field_r;
    static int[] field_t;
    private int field_m;
    private int field_o;

    final ea c(int param0) {
        int var2 = 0;
        ea var3 = null;
        ((jk) this).field_a = th.field_e;
        ((jk) this).field_h = bd.field_k;
        ((jk) this).field_q.a((byte) 14, ((jk) this).field_c, ((jk) this).field_f);
        var2 = -96 / ((-34 - param0) / 57);
        vc.field_a = false;
        var3 = wd.a(((jk) this).field_c, (byte) 77, 0, 0, wc.field_c, ((jk) this).field_f);
        if (var3 == null) {
          ((jk) this).c((byte) -91);
          return var3;
        } else {
          return var3;
        }
    }

    final static void a(int param0) {
        String var1 = null;
        int var2 = 0;
        if (!vh.field_j) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (oj.field_q != null) {
              oj.field_q.q(4210752);
              break L0;
            } else {
              break L0;
            }
          }
          var2 = -45 / ((26 - param0) / 52);
          var1 = fe.b((byte) -127);
          ig.field_ib = new pk(var1, (String) null, true, false, false);
          bm.field_d.b((byte) 74, (pj) (Object) kg.field_j);
          kg.field_j.a(false, (pj) (Object) ig.field_ib);
          kg.field_j.m(0);
          return;
        }
    }

    final static byte[] a(int param0, String param1) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          int discarded$2 = jk.a(91, -71, (ee) null, (String) null, (ee) null, true, -102);
          return md.field_d.a(param1, 1, "");
        } else {
          return md.field_d.a(param1, 1, "");
        }
    }

    final static void a(int param0, ef param1, boolean param2) {
        int var4 = 0;
        se var5 = null;
        var5 = uk.field_b;
        var5.i(param0, -98);
        var5.field_i = var5.field_i + 1;
        var4 = var5.field_i;
        var5.a(1, -75);
        if (param1.field_l != null) {
          var5.a(param1.field_l.length, -32);
          var5.a(0, param1.field_l.length, (byte) -11, param1.field_l);
          int discarded$41 = var5.e(-18951, var4);
          if (!param2) {
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            return;
          } else {
            field_j = null;
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            return;
          }
        } else {
          var5.a(0, -128);
          int discarded$42 = var5.e(-18951, var4);
          if (!param2) {
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            return;
          } else {
            field_j = null;
            var5.field_i = var5.field_i - 4;
            param1.field_f = var5.l(0);
            var5.c((byte) 113, var5.field_i - var4);
            return;
          }
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        if (null == mg.field_k) {
          L0: {
            if (0 >= tc.field_b) {
              ((jk) this).field_l = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((jk) this).field_l) {
            if (((jk) this).field_n <= bd.field_k) {
              if (-1 <= (((jk) this).field_n ^ -1)) {
                if (bd.field_k == ((jk) this).field_e) {
                  if (((jk) this).field_b != th.field_e) {
                    ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                  return;
                }
              } else {
                em.field_r = 0;
                if (bd.field_k == ((jk) this).field_e) {
                  if (((jk) this).field_b != th.field_e) {
                    ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                  return;
                }
              }
            } else {
              em.field_r = (-bd.field_k + ((jk) this).field_n) / 2;
              if (bd.field_k == ((jk) this).field_e) {
                if (((jk) this).field_b == th.field_e) {
                  return;
                } else {
                  ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                  return;
                }
              } else {
                ((jk) this).field_q.a((byte) 46, ((jk) this).field_b, ((jk) this).field_e);
                return;
              }
            }
          } else {
            ((jk) this).field_m = ((jk) this).field_m - 1;
            if ((((jk) this).field_m - 1 ^ -1) >= -1) {
              ((jk) this).field_m = ((jk) this).field_v;
              if (((jk) this).field_o > mg.field_f) {
                ((jk) this).field_l = false;
                return;
              } else {
                this.b((byte) 98);
                var2 = -52 / ((22 - param0) / 52);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0, int param1, int param2) {
        fd.field_c = param1;
        if (param2 != 249) {
            Object var4 = null;
            jk.a(-96, (ef) null, false);
            sf.field_T = param0;
            return;
        }
        sf.field_T = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 65) {
            return;
        }
        field_t = null;
        field_r = null;
        field_j = null;
    }

    final static int a(int param0, int param1, ee param2, String param3, ee param4, boolean param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        mg stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        mg stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        mg stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        mg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mg stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        mg stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        String stackIn_22_2 = null;
        mg stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        mg stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        mg stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        mg stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mg stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        String stackOut_21_2 = null;
        mg stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        String stackOut_20_2 = null;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          var14 = param4.a(true);
          var11_ref = var14;
          var11_ref = var14;
          if (param6 == -23739) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          var8 = param2.a(true);
          var11_ref = var8;
          var11_ref = var8;
          if (null == p.field_d) {
            if (!fg.a(false, param6 ^ 23694)) {
              return -1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (sk.field_E == dh.field_bb) {
            L3: {
              uk.field_b.field_i = 0;
              ci.field_h = null;
              if (param3 == null) {
                L4: {
                  pg.field_c.field_i = 0;
                  pg.field_c.b(tl.field_f.nextInt(), -1);
                  pg.field_c.b(tl.field_f.nextInt(), -1);
                  stackOut_16_0 = pg.field_c;
                  stackOut_16_1 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (!param4.b(-125)) {
                    stackOut_18_0 = (mg) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = "";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = (mg) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (String) var14;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                L5: {
                  ((mg) (Object) stackIn_19_0).a(stackIn_19_1 != 0, stackIn_19_2);
                  stackOut_19_0 = pg.field_c;
                  stackOut_19_1 = 0;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  if (!param2.b(-111)) {
                    stackOut_21_0 = (mg) (Object) stackIn_21_0;
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = "";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    break L5;
                  } else {
                    stackOut_20_0 = (mg) (Object) stackIn_20_0;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = (String) var8;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_22_2 = stackOut_20_2;
                    break L5;
                  }
                }
                ((mg) (Object) stackIn_22_0).a(stackIn_22_1 != 0, stackIn_22_2);
                uk.field_b.a(16, -15);
                uk.field_b.field_i = uk.field_b.field_i + 1;
                var9 = uk.field_b.field_i;
                cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                uk.field_b.c((byte) 123, uk.field_b.field_i + -var9);
                break L3;
              } else {
                L6: {
                  var9 = 0;
                  if (param5) {
                    var9 = var9 | 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  pg.field_c.field_i = 0;
                  pg.field_c.b(tl.field_f.nextInt(), param6 ^ 23738);
                  pg.field_c.b(tl.field_f.nextInt(), -1);
                  pg.field_c.a(false, var14);
                  pg.field_c.a(false, var8);
                  var15 = (CharSequence) (Object) param3;
                  pg.field_c.a(false, wb.a(var15, 122));
                  pg.field_c.b((byte) -60, param1);
                  pg.field_c.a(param0, -60);
                  pg.field_c.a(var9, param6 ^ 23799);
                  uk.field_b.a(18, -126);
                  uk.field_b.field_i = uk.field_b.field_i + 2;
                  var10 = uk.field_b.field_i;
                  var11_ref = tc.a((byte) -41, uj.b((byte) -120));
                  if (var11_ref != null) {
                    break L7;
                  } else {
                    var11_ref = "";
                    break L7;
                  }
                }
                uk.field_b.a(var11_ref, -6528);
                cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
                uk.field_b.d(-var10 + uk.field_b.field_i, -2);
                break L3;
              }
            }
            bh.a(-1, -1);
            dh.field_bb = ea.field_f;
            break L2;
          } else {
            break L2;
          }
        }
        if (dh.field_bb == ea.field_f) {
          if (va.a(true, 1)) {
            L8: {
              L9: {
                var9 = cd.field_t.b((byte) 90);
                cd.field_t.field_i = 0;
                if (-101 < (var9 ^ -1)) {
                  break L9;
                } else {
                  if (var9 > 105) {
                    break L9;
                  } else {
                    vd.field_e = new String[var9 + -100];
                    dh.field_bb = fd.field_h;
                    break L8;
                  }
                }
              }
              if (var9 != 248) {
                if ((var9 ^ -1) != -100) {
                  L10: {
                    tf.field_c = -1;
                    dh.field_bb = nk.field_w;
                    ab.field_l = var9;
                    if (dh.field_bb != fd.field_h) {
                      break L10;
                    } else {
                      var9 = 2;
                      if (!va.a(true, var9)) {
                        break L10;
                      } else {
                        var10 = cd.field_t.j(98203176);
                        cd.field_t.field_i = 0;
                        if (!va.a(true, var10)) {
                          break L10;
                        } else {
                          var11 = vd.field_e.length;
                          var12 = 0;
                          L11: while (true) {
                            if (var11 <= var12) {
                              th.a(108);
                              ea.field_a = false;
                              return 100 + var11;
                            } else {
                              vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                              var12++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (dh.field_bb == nk.field_w) {
                      if (!ce.a(-68)) {
                        break L12;
                      } else {
                        L13: {
                          if (ab.field_l == 255) {
                            var9_ref = cd.field_t.i(-1);
                            if (var9_ref != null) {
                              kb.a(uj.b((byte) -120), false, var9_ref);
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            kk.field_Y = cd.field_t.g(2);
                            break L13;
                          }
                        }
                        th.a(126);
                        ea.field_a = false;
                        return ab.field_l;
                      }
                    } else {
                      break L12;
                    }
                  }
                  if (null == p.field_d) {
                    if (!ea.field_a) {
                      var9 = eg.field_v;
                      eg.field_v = sj.field_x;
                      sj.field_x = var9;
                      ea.field_a = true;
                      return -1;
                    } else {
                      L14: {
                        if (30000L < ed.b(-1)) {
                          kk.field_Y = ee.field_c;
                          break L14;
                        } else {
                          kk.field_Y = dj.field_j;
                          break L14;
                        }
                      }
                      ea.field_a = false;
                      return 249;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  boolean discarded$1 = va.a(true, ue.b((byte) 123));
                  ci.field_h = new Boolean(af.a((mg) (Object) cd.field_t, true));
                  cd.field_t.field_i = 0;
                  break L8;
                }
              } else {
                wl.a(uj.b((byte) -120), (byte) 54);
                kk.field_Y = ob.field_C;
                th.a(param6 + 23856);
                ea.field_a = false;
                return var9;
              }
            }
            if (dh.field_bb == fd.field_h) {
              var9 = 2;
              if (va.a(true, var9)) {
                var10 = cd.field_t.j(98203176);
                cd.field_t.field_i = 0;
                if (!va.a(true, var10)) {
                  if (dh.field_bb == nk.field_w) {
                    if (!ce.a(-68)) {
                      L15: {
                        if (null == p.field_d) {
                          if (!ea.field_a) {
                            var9 = eg.field_v;
                            eg.field_v = sj.field_x;
                            sj.field_x = var9;
                            ea.field_a = true;
                            break L15;
                          } else {
                            if (30000L < ed.b(-1)) {
                              kk.field_Y = ee.field_c;
                              ea.field_a = false;
                              return 249;
                            } else {
                              kk.field_Y = dj.field_j;
                              ea.field_a = false;
                              return 249;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      return -1;
                    } else {
                      if (ab.field_l == 255) {
                        var9_ref = cd.field_t.i(-1);
                        if (var9_ref != null) {
                          kb.a(uj.b((byte) -120), false, var9_ref);
                          th.a(126);
                          ea.field_a = false;
                          return ab.field_l;
                        } else {
                          th.a(126);
                          ea.field_a = false;
                          return ab.field_l;
                        }
                      } else {
                        kk.field_Y = cd.field_t.g(2);
                        th.a(126);
                        ea.field_a = false;
                        return ab.field_l;
                      }
                    }
                  } else {
                    L16: {
                      if (null == p.field_d) {
                        if (!ea.field_a) {
                          var9 = eg.field_v;
                          eg.field_v = sj.field_x;
                          sj.field_x = var9;
                          ea.field_a = true;
                          break L16;
                        } else {
                          if (30000L < ed.b(-1)) {
                            kk.field_Y = ee.field_c;
                            ea.field_a = false;
                            return 249;
                          } else {
                            kk.field_Y = dj.field_j;
                            ea.field_a = false;
                            return 249;
                          }
                        }
                      } else {
                        break L16;
                      }
                    }
                    return -1;
                  }
                } else {
                  var11 = vd.field_e.length;
                  var12 = 0;
                  L17: while (true) {
                    if (var11 <= var12) {
                      th.a(108);
                      ea.field_a = false;
                      return 100 + var11;
                    } else {
                      vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                      var12++;
                      continue L17;
                    }
                  }
                }
              } else {
                if (dh.field_bb == nk.field_w) {
                  if (!ce.a(-68)) {
                    L18: {
                      if (null == p.field_d) {
                        if (!ea.field_a) {
                          var9 = eg.field_v;
                          eg.field_v = sj.field_x;
                          sj.field_x = var9;
                          ea.field_a = true;
                          break L18;
                        } else {
                          if (30000L < ed.b(-1)) {
                            kk.field_Y = ee.field_c;
                            ea.field_a = false;
                            return 249;
                          } else {
                            kk.field_Y = dj.field_j;
                            ea.field_a = false;
                            return 249;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    return -1;
                  } else {
                    if (ab.field_l == 255) {
                      var9_ref = cd.field_t.i(-1);
                      if (var9_ref != null) {
                        kb.a(uj.b((byte) -120), false, var9_ref);
                        th.a(126);
                        ea.field_a = false;
                        return ab.field_l;
                      } else {
                        th.a(126);
                        ea.field_a = false;
                        return ab.field_l;
                      }
                    } else {
                      kk.field_Y = cd.field_t.g(2);
                      th.a(126);
                      ea.field_a = false;
                      return ab.field_l;
                    }
                  }
                } else {
                  L19: {
                    if (null == p.field_d) {
                      if (!ea.field_a) {
                        var9 = eg.field_v;
                        eg.field_v = sj.field_x;
                        sj.field_x = var9;
                        ea.field_a = true;
                        break L19;
                      } else {
                        if (30000L < ed.b(-1)) {
                          kk.field_Y = ee.field_c;
                          ea.field_a = false;
                          return 249;
                        } else {
                          kk.field_Y = dj.field_j;
                          ea.field_a = false;
                          return 249;
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                  return -1;
                }
              }
            } else {
              if (dh.field_bb == nk.field_w) {
                if (!ce.a(-68)) {
                  L20: {
                    if (null == p.field_d) {
                      if (!ea.field_a) {
                        var9 = eg.field_v;
                        eg.field_v = sj.field_x;
                        sj.field_x = var9;
                        ea.field_a = true;
                        break L20;
                      } else {
                        if (30000L < ed.b(-1)) {
                          kk.field_Y = ee.field_c;
                          ea.field_a = false;
                          return 249;
                        } else {
                          kk.field_Y = dj.field_j;
                          ea.field_a = false;
                          return 249;
                        }
                      }
                    } else {
                      break L20;
                    }
                  }
                  return -1;
                } else {
                  if (ab.field_l == 255) {
                    var9_ref = cd.field_t.i(-1);
                    if (var9_ref != null) {
                      kb.a(uj.b((byte) -120), false, var9_ref);
                      th.a(126);
                      ea.field_a = false;
                      return ab.field_l;
                    } else {
                      th.a(126);
                      ea.field_a = false;
                      return ab.field_l;
                    }
                  } else {
                    kk.field_Y = cd.field_t.g(2);
                    th.a(126);
                    ea.field_a = false;
                    return ab.field_l;
                  }
                }
              } else {
                if (null == p.field_d) {
                  if (ea.field_a) {
                    if (30000L < ed.b(-1)) {
                      kk.field_Y = ee.field_c;
                      ea.field_a = false;
                      return 249;
                    } else {
                      kk.field_Y = dj.field_j;
                      ea.field_a = false;
                      return 249;
                    }
                  } else {
                    var9 = eg.field_v;
                    eg.field_v = sj.field_x;
                    sj.field_x = var9;
                    ea.field_a = true;
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            }
          } else {
            L21: {
              if (dh.field_bb != fd.field_h) {
                break L21;
              } else {
                var9 = 2;
                if (!va.a(true, var9)) {
                  break L21;
                } else {
                  var10 = cd.field_t.j(98203176);
                  cd.field_t.field_i = 0;
                  if (!va.a(true, var10)) {
                    break L21;
                  } else {
                    var11 = vd.field_e.length;
                    var12 = 0;
                    L22: while (true) {
                      if (var11 <= var12) {
                        th.a(108);
                        ea.field_a = false;
                        return 100 + var11;
                      } else {
                        vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                        var12++;
                        continue L22;
                      }
                    }
                  }
                }
              }
            }
            if (dh.field_bb == nk.field_w) {
              if (!ce.a(-68)) {
                if (null == p.field_d) {
                  if (ea.field_a) {
                    if (30000L >= ed.b(-1)) {
                      kk.field_Y = dj.field_j;
                      ea.field_a = false;
                      return 249;
                    } else {
                      kk.field_Y = ee.field_c;
                      ea.field_a = false;
                      return 249;
                    }
                  } else {
                    var9 = eg.field_v;
                    eg.field_v = sj.field_x;
                    sj.field_x = var9;
                    ea.field_a = true;
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (ab.field_l == 255) {
                  var9_ref = cd.field_t.i(-1);
                  if (var9_ref == null) {
                    th.a(126);
                    ea.field_a = false;
                    return ab.field_l;
                  } else {
                    kb.a(uj.b((byte) -120), false, var9_ref);
                    th.a(126);
                    ea.field_a = false;
                    return ab.field_l;
                  }
                } else {
                  kk.field_Y = cd.field_t.g(2);
                  th.a(126);
                  ea.field_a = false;
                  return ab.field_l;
                }
              }
            } else {
              if (null == p.field_d) {
                if (ea.field_a) {
                  L23: {
                    if (30000L < ed.b(-1)) {
                      kk.field_Y = ee.field_c;
                      break L23;
                    } else {
                      kk.field_Y = dj.field_j;
                      break L23;
                    }
                  }
                  ea.field_a = false;
                  return 249;
                } else {
                  var9 = eg.field_v;
                  eg.field_v = sj.field_x;
                  sj.field_x = var9;
                  ea.field_a = true;
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          L24: {
            if (dh.field_bb != fd.field_h) {
              break L24;
            } else {
              var9 = 2;
              if (!va.a(true, var9)) {
                break L24;
              } else {
                var10 = cd.field_t.j(98203176);
                cd.field_t.field_i = 0;
                if (!va.a(true, var10)) {
                  break L24;
                } else {
                  var11 = vd.field_e.length;
                  var12 = 0;
                  L25: while (true) {
                    if (var11 <= var12) {
                      th.a(108);
                      ea.field_a = false;
                      return 100 + var11;
                    } else {
                      vd.field_e[var12] = cd.field_t.f(gi.a(param6, -23760));
                      var12++;
                      continue L25;
                    }
                  }
                }
              }
            }
          }
          if (dh.field_bb == nk.field_w) {
            if (!ce.a(-68)) {
              if (null == p.field_d) {
                if (ea.field_a) {
                  if (30000L >= ed.b(-1)) {
                    kk.field_Y = dj.field_j;
                    ea.field_a = false;
                    return 249;
                  } else {
                    kk.field_Y = ee.field_c;
                    ea.field_a = false;
                    return 249;
                  }
                } else {
                  var9 = eg.field_v;
                  eg.field_v = sj.field_x;
                  sj.field_x = var9;
                  ea.field_a = true;
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              if (ab.field_l == 255) {
                var9_ref = cd.field_t.i(-1);
                if (var9_ref == null) {
                  th.a(126);
                  ea.field_a = false;
                  return ab.field_l;
                } else {
                  kb.a(uj.b((byte) -120), false, var9_ref);
                  th.a(126);
                  ea.field_a = false;
                  return ab.field_l;
                }
              } else {
                kk.field_Y = cd.field_t.g(2);
                th.a(126);
                ea.field_a = false;
                return ab.field_l;
              }
            }
          } else {
            if (null == p.field_d) {
              if (ea.field_a) {
                L26: {
                  if (30000L < ed.b(-1)) {
                    kk.field_Y = ee.field_c;
                    break L26;
                  } else {
                    kk.field_Y = dj.field_j;
                    break L26;
                  }
                }
                ea.field_a = false;
                return 249;
              } else {
                var9 = eg.field_v;
                eg.field_v = sj.field_x;
                sj.field_x = var9;
                ea.field_a = true;
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((jk) this).field_u = param1;
        if (param0 != 14592) {
            field_r = null;
            ((jk) this).field_n = param2;
            return;
        }
        ((jk) this).field_n = param2;
    }

    final boolean b(int param0) {
        if (param0 > 28) {
          if (mg.field_f >= ((jk) this).field_o) {
            if (0 >= tc.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = null;
          if (mg.field_f >= ((jk) this).field_o) {
            if (0 >= tc.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        var2 = ((jk) this).field_n;
        if (param0 < 50) {
          ((jk) this).field_n = 104;
          var3 = ((jk) this).field_u;
          if (((jk) this).b(120)) {
            L0: {
              if (var3 > ((jk) this).field_i) {
                var3 = ((jk) this).field_i;
                break L0;
              } else {
                if (var3 < ((jk) this).field_k) {
                  L1: {
                    var3 = ((jk) this).field_k;
                    if (var2 <= ((jk) this).field_g) {
                      if (var2 >= ((jk) this).field_p) {
                        break L1;
                      } else {
                        var2 = ((jk) this).field_p;
                        break L1;
                      }
                    } else {
                      var2 = ((jk) this).field_g;
                      break L1;
                    }
                  }
                  if (0.0f >= ((jk) this).field_s) {
                    L2: {
                      L3: {
                        if (bd.field_k != var2) {
                          break L3;
                        } else {
                          if (var3 == th.field_e) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((jk) this).field_q.a((byte) 53, var3, var2);
                      break L2;
                    }
                    L4: {
                      if (((jk) this).field_n <= 0) {
                        break L4;
                      } else {
                        em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                        break L4;
                      }
                    }
                    return;
                  } else {
                    L5: {
                      var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                      if (var2 >= var4) {
                        if (var4 >= var2) {
                          break L5;
                        } else {
                          var2 = var4;
                          break L5;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((jk) this).field_s);
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (bd.field_k != var2) {
                          break L7;
                        } else {
                          if (var3 == th.field_e) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((jk) this).field_q.a((byte) 53, var3, var2);
                      break L6;
                    }
                    L8: {
                      if (((jk) this).field_n <= 0) {
                        break L8;
                      } else {
                        em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                        break L8;
                      }
                    }
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (var2 <= ((jk) this).field_g) {
              L9: {
                if (var2 >= ((jk) this).field_p) {
                  break L9;
                } else {
                  var2 = ((jk) this).field_p;
                  break L9;
                }
              }
              L10: {
                if (0.0f >= ((jk) this).field_s) {
                  break L10;
                } else {
                  var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      break L10;
                    } else {
                      var2 = var4;
                      break L10;
                    }
                  } else {
                    var3 = (int)((float)var2 / ((jk) this).field_s);
                    if (bd.field_k != var2) {
                      ((jk) this).field_q.a((byte) 53, var3, var2);
                      if (((jk) this).field_n > 0) {
                        em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (var3 == th.field_e) {
                        if (((jk) this).field_n > 0) {
                          em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L11: {
                          ((jk) this).field_q.a((byte) 53, var3, var2);
                          if (((jk) this).field_n <= 0) {
                            break L11;
                          } else {
                            em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                            break L11;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              if (bd.field_k != var2) {
                ((jk) this).field_q.a((byte) 53, var3, var2);
                if (((jk) this).field_n > 0) {
                  em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (var3 == th.field_e) {
                  if (((jk) this).field_n <= 0) {
                    return;
                  } else {
                    em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                    return;
                  }
                } else {
                  ((jk) this).field_q.a((byte) 53, var3, var2);
                  if (((jk) this).field_n > 0) {
                    em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L12: {
                var2 = ((jk) this).field_g;
                if (0.0f >= ((jk) this).field_s) {
                  break L12;
                } else {
                  var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      break L12;
                    } else {
                      var2 = var4;
                      break L12;
                    }
                  } else {
                    var3 = (int)((float)var2 / ((jk) this).field_s);
                    break L12;
                  }
                }
              }
              L13: {
                L14: {
                  if (bd.field_k != var2) {
                    break L14;
                  } else {
                    if (var3 == th.field_e) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                ((jk) this).field_q.a((byte) 53, var3, var2);
                break L13;
              }
              if (((jk) this).field_n > 0) {
                em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                return;
              } else {
                return;
              }
            }
          } else {
            ((jk) this).field_l = false;
            return;
          }
        } else {
          var3 = ((jk) this).field_u;
          if (((jk) this).b(120)) {
            L15: {
              if (var3 > ((jk) this).field_i) {
                var3 = ((jk) this).field_i;
                break L15;
              } else {
                if (var3 < ((jk) this).field_k) {
                  L16: {
                    var3 = ((jk) this).field_k;
                    if (var2 <= ((jk) this).field_g) {
                      if (var2 >= ((jk) this).field_p) {
                        break L16;
                      } else {
                        var2 = ((jk) this).field_p;
                        break L16;
                      }
                    } else {
                      var2 = ((jk) this).field_g;
                      break L16;
                    }
                  }
                  L17: {
                    if (0.0f >= ((jk) this).field_s) {
                      break L17;
                    } else {
                      var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                      if (var2 >= var4) {
                        if (var4 >= var2) {
                          break L17;
                        } else {
                          var2 = var4;
                          break L17;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((jk) this).field_s);
                        break L17;
                      }
                    }
                  }
                  L18: {
                    L19: {
                      if (bd.field_k != var2) {
                        break L19;
                      } else {
                        if (var3 == th.field_e) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ((jk) this).field_q.a((byte) 53, var3, var2);
                    break L18;
                  }
                  L20: {
                    if (((jk) this).field_n <= 0) {
                      break L20;
                    } else {
                      em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                      break L20;
                    }
                  }
                  return;
                } else {
                  break L15;
                }
              }
            }
            if (var2 <= ((jk) this).field_g) {
              L21: {
                if (var2 >= ((jk) this).field_p) {
                  break L21;
                } else {
                  var2 = ((jk) this).field_p;
                  break L21;
                }
              }
              L22: {
                if (0.0f >= ((jk) this).field_s) {
                  break L22;
                } else {
                  var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      break L22;
                    } else {
                      var2 = var4;
                      break L22;
                    }
                  } else {
                    L23: {
                      L24: {
                        var3 = (int)((float)var2 / ((jk) this).field_s);
                        if (bd.field_k != var2) {
                          break L24;
                        } else {
                          if (var3 == th.field_e) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      ((jk) this).field_q.a((byte) 53, var3, var2);
                      break L23;
                    }
                    L25: {
                      if (((jk) this).field_n <= 0) {
                        break L25;
                      } else {
                        em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                        break L25;
                      }
                    }
                    return;
                  }
                }
              }
              if (bd.field_k == var2) {
                if (var3 == th.field_e) {
                  if (((jk) this).field_n > 0) {
                    em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L26: {
                    ((jk) this).field_q.a((byte) 53, var3, var2);
                    if (((jk) this).field_n <= 0) {
                      break L26;
                    } else {
                      em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                      break L26;
                    }
                  }
                  return;
                }
              } else {
                L27: {
                  ((jk) this).field_q.a((byte) 53, var3, var2);
                  if (((jk) this).field_n <= 0) {
                    break L27;
                  } else {
                    em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                    break L27;
                  }
                }
                return;
              }
            } else {
              L28: {
                var2 = ((jk) this).field_g;
                if (0.0f >= ((jk) this).field_s) {
                  break L28;
                } else {
                  var4 = (int)(((jk) this).field_s * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      break L28;
                    } else {
                      var2 = var4;
                      break L28;
                    }
                  } else {
                    var3 = (int)((float)var2 / ((jk) this).field_s);
                    break L28;
                  }
                }
              }
              L29: {
                L30: {
                  if (bd.field_k != var2) {
                    break L30;
                  } else {
                    if (var3 == th.field_e) {
                      break L29;
                    } else {
                      break L30;
                    }
                  }
                }
                ((jk) this).field_q.a((byte) 53, var3, var2);
                break L29;
              }
              L31: {
                if (((jk) this).field_n <= 0) {
                  break L31;
                } else {
                  em.field_r = (((jk) this).field_n - bd.field_k) / 2;
                  break L31;
                }
              }
              return;
            }
          } else {
            ((jk) this).field_l = false;
            return;
          }
        }
    }

    final void c(byte param0) {
        ((jk) this).field_q.a((byte) 105, ((jk) this).field_a, ((jk) this).field_h);
        if (param0 >= -54) {
            ((jk) this).field_c = 116;
        }
    }

    private jk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[8192];
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
