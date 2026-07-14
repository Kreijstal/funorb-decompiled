/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_e;
    static lo field_c;
    java.awt.Frame field_a;
    static String field_b;
    static String field_d;
    static int field_f;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((wg) this).field_e = true;
    }

    final static int a(String param0, byte param1, boolean param2, String param3, int param4, String param5, int param6) {
        m var7 = new m(param5);
        if (param1 > -45) {
            field_c = null;
        }
        m var8 = new m(param3);
        return wl.a(param0, param2, param4, var7, param6, var8, 4);
    }

    final static int a(boolean param0) {
        Object var2 = null;
        dp.field_v.a(77);
        if (!param0) {
          if (!vd.field_f.b(72)) {
            return sm.b(-1);
          } else {
            return 0;
          }
        } else {
          var2 = null;
          wg.a(43, (km) null);
          if (!vd.field_f.b(72)) {
            return sm.b(-1);
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          int discarded$2 = wg.a((String) null, (byte) 44, true, (String) null, -49, (String) null, 29);
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final void a(tg param0, int param1) {
        sq.a(param0, -20954, ((wg) this).field_a);
        int var3 = -13 / ((param1 - 82) / 32);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void a(int param0, km param1) {
        if (param0 <= -53) {
          if ((param1.field_a ^ -1) <= -1) {
            if (pg.field_k.length <= param1.field_a) {
              return;
            } else {
              pg.field_k[param1.field_a] = param1;
              return;
            }
          } else {
            return;
          }
        } else {
          field_d = null;
          if ((param1.field_a ^ -1) <= -1) {
            if (pg.field_k.length <= param1.field_a) {
              return;
            } else {
              pg.field_k[param1.field_a] = param1;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        mh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        mh var10 = null;
        gb var11 = null;
        mh var12 = null;
        mh var12_ref = null;
        gb var13 = null;
        mh var16 = null;
        mh var18 = null;
        mh var20 = null;
        mh var20_ref = null;
        gb var21 = null;
        mh var22 = null;
        mh var24 = null;
        mh var26 = null;
        mh var30 = null;
        gb var31 = null;
        mh var32 = null;
        mh var34 = null;
        mh var36 = null;
        mh var41 = null;
        gb var42 = null;
        mh var43 = null;
        mh var43_ref = null;
        gb var44 = null;
        mh var45 = null;
        mh var45_ref = null;
        gb var46 = null;
        mh var47 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (hj.field_Yb <= hc.field_f) {
          if (kc.field_q.field_f == ej.field_O) {
            if (param2 <= (hc.field_f ^ -1)) {
              return;
            } else {
              ef.a(param2 + -123);
              gp.field_d.a(param3, -15211);
              if (null != vd.field_a) {
                if (!um.field_e) {
                  vd.field_a = null;
                  var4 = 0;
                  L0: while (true) {
                    if (5 <= var4) {
                      L1: {
                        if (mj.field_c.field_L != 0) {
                          no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        var44 = sj.a(om.field_oc, np.field_a, -13294, param0);
                        if (var44 != null) {
                          hj.a(0, var44);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        var8 = pn.c(-9235);
                        if (var8 != null) {
                          ep.field_e = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      var43_ref = ik.field_i[var4];
                      var45 = var43_ref;
                      var47 = var45;
                      var45 = var43_ref;
                      if (var43_ref != null) {
                        L4: {
                          if (-1 != (var43_ref.field_L ^ -1)) {
                            wd.a(784, var4, var43_ref);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var6 = tm.a(var4, (byte) 18);
                        vj.field_a[var4].field_wb = ef.field_b[var6];
                        wd.field_F[var4].field_Mb = rh.field_e[var6];
                        var4++;
                        continue L0;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                } else {
                  boolean discarded$3 = vd.field_a.a(gp.field_d.field_db, gp.field_d.field_Eb, 116, param3);
                  var4 = 0;
                  L5: while (true) {
                    if (5 <= var4) {
                      L6: {
                        if (mj.field_c.field_L != 0) {
                          no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var46 = sj.a(om.field_oc, np.field_a, -13294, param0);
                        if (var46 != null) {
                          hj.a(0, var46);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        var8 = pn.c(-9235);
                        if (var8 != null) {
                          ep.field_e = var8;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return;
                    } else {
                      var45_ref = ik.field_i[var4];
                      var47 = var45_ref;
                      var47 = var45_ref;
                      if (var45_ref != null) {
                        L9: {
                          if (-1 != (var45_ref.field_L ^ -1)) {
                            wd.a(784, var4, var45_ref);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var6 = tm.a(var4, (byte) 18);
                        vj.field_a[var4].field_wb = ef.field_b[var6];
                        wd.field_F[var4].field_Mb = rh.field_e[var6];
                        var4++;
                        continue L5;
                      } else {
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L10: while (true) {
                  if (5 <= var4) {
                    L11: {
                      if (mj.field_c.field_L != 0) {
                        no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      var42 = sj.a(om.field_oc, np.field_a, -13294, param0);
                      if (var42 != null) {
                        hj.a(0, var42);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      var8 = pn.c(-9235);
                      if (var8 != null) {
                        ep.field_e = var8;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    return;
                  } else {
                    var41 = ik.field_i[var4];
                    var43 = var41;
                    var45 = var43;
                    var47 = var45;
                    var43 = var41;
                    if (var41 != null) {
                      L14: {
                        if (-1 != (var41.field_L ^ -1)) {
                          wd.a(784, var4, var41);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var6 = tm.a(var4, (byte) 18);
                      vj.field_a[var4].field_wb = ef.field_b[var6];
                      wd.field_F[var4].field_Mb = rh.field_e[var6];
                      var4++;
                      continue L10;
                    } else {
                      var4++;
                      continue L10;
                    }
                  }
                }
              }
            }
          } else {
            rn.field_h = rn.field_h + (-ej.field_O + kc.field_q.field_f);
            ej.field_O = kc.field_q.field_f;
            if (param2 <= (hc.field_f ^ -1)) {
              return;
            } else {
              ef.a(param2 + -123);
              gp.field_d.a(param3, -15211);
              if (null != vd.field_a) {
                if (!um.field_e) {
                  L15: {
                    vd.field_a = null;
                    var4 = 0;
                    if (5 <= var4) {
                      break L15;
                    } else {
                      L16: {
                        var20_ref = ik.field_i[var4];
                        var22 = var20_ref;
                        var24 = var22;
                        var26 = var24;
                        var22 = var20_ref;
                        if (var20_ref != null) {
                          L17: {
                            if (-1 != (var20_ref.field_L ^ -1)) {
                              wd.a(784, var4, var20_ref);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          var6 = tm.a(var4, (byte) 18);
                          vj.field_a[var4].field_wb = ef.field_b[var6];
                          wd.field_F[var4].field_Mb = rh.field_e[var6];
                          break L16;
                        } else {
                          var4++;
                          break L16;
                        }
                      }
                      var4++;
                      var4++;
                      var4++;
                      break L15;
                    }
                  }
                  L18: {
                    if (mj.field_c.field_L != 0) {
                      no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var21 = sj.a(om.field_oc, np.field_a, -13294, param0);
                    if (var21 != null) {
                      hj.a(0, var21);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    var8 = pn.c(-9235);
                    if (var8 != null) {
                      ep.field_e = var8;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                } else {
                  L21: {
                    boolean discarded$4 = vd.field_a.a(gp.field_d.field_db, gp.field_d.field_Eb, 116, param3);
                    var4 = 0;
                    if (5 <= var4) {
                      break L21;
                    } else {
                      L22: {
                        var30 = ik.field_i[var4];
                        var32 = var30;
                        var34 = var32;
                        var36 = var34;
                        var32 = var30;
                        if (var30 != null) {
                          L23: {
                            if (-1 != (var30.field_L ^ -1)) {
                              wd.a(784, var4, var30);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          var6 = tm.a(var4, (byte) 18);
                          vj.field_a[var4].field_wb = ef.field_b[var6];
                          wd.field_F[var4].field_Mb = rh.field_e[var6];
                          break L22;
                        } else {
                          var4++;
                          break L22;
                        }
                      }
                      var4++;
                      var4++;
                      var4++;
                      break L21;
                    }
                  }
                  L24: {
                    if (mj.field_c.field_L != 0) {
                      no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    var31 = sj.a(om.field_oc, np.field_a, -13294, param0);
                    if (var31 != null) {
                      hj.a(0, var31);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    var8 = pn.c(-9235);
                    if (var8 != null) {
                      ep.field_e = var8;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return;
                }
              } else {
                L27: {
                  var4 = 0;
                  if (5 <= var4) {
                    break L27;
                  } else {
                    L28: {
                      var12 = ik.field_i[var4];
                      var16 = var12;
                      var18 = var16;
                      var20 = var18;
                      var16 = var12;
                      var5 = var12;
                      if (var12 != null) {
                        L29: {
                          if (-1 != (var12.field_L ^ -1)) {
                            wd.a(784, var4, var12);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var6 = tm.a(var4, (byte) 18);
                        vj.field_a[var4].field_wb = ef.field_b[var6];
                        wd.field_F[var4].field_Mb = rh.field_e[var6];
                        break L28;
                      } else {
                        var4++;
                        break L28;
                      }
                    }
                    var4++;
                    var4++;
                    var4++;
                    break L27;
                  }
                }
                L30: {
                  if (mj.field_c.field_L != 0) {
                    no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  var13 = sj.a(om.field_oc, np.field_a, -13294, param0);
                  if (var13 != null) {
                    hj.a(0, var13);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  var8 = pn.c(-9235);
                  if (var8 != null) {
                    ep.field_e = var8;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                return;
              }
            }
          }
        } else {
          L33: {
            hc.field_f = hc.field_f + 1;
            if (kc.field_q.field_f == ej.field_O) {
              break L33;
            } else {
              rn.field_h = rn.field_h + (-ej.field_O + kc.field_q.field_f);
              ej.field_O = kc.field_q.field_f;
              break L33;
            }
          }
          if (param2 <= (hc.field_f ^ -1)) {
            return;
          } else {
            L34: {
              ef.a(param2 + -123);
              gp.field_d.a(param3, -15211);
              if (null != vd.field_a) {
                if (um.field_e) {
                  boolean discarded$5 = vd.field_a.a(gp.field_d.field_db, gp.field_d.field_Eb, 116, param3);
                  break L34;
                } else {
                  vd.field_a = null;
                  break L34;
                }
              } else {
                break L34;
              }
            }
            L35: {
              var4 = 0;
              if (5 <= var4) {
                break L35;
              } else {
                L36: {
                  var10 = ik.field_i[var4];
                  var12_ref = var10;
                  var16 = var12_ref;
                  var12_ref = var10;
                  var5 = var12_ref;
                  if (var10 != null) {
                    L37: {
                      if (-1 != (var10.field_L ^ -1)) {
                        wd.a(784, var4, var10);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    var6 = tm.a(var4, (byte) 18);
                    vj.field_a[var4].field_wb = ef.field_b[var6];
                    wd.field_F[var4].field_Mb = rh.field_e[var6];
                    break L36;
                  } else {
                    var4++;
                    break L36;
                  }
                }
                var4++;
                var4++;
                var4++;
                break L35;
              }
            }
            L38: {
              if (mj.field_c.field_L != 0) {
                no.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var11 = sj.a(om.field_oc, np.field_a, -13294, param0);
              if (var11 != null) {
                hj.a(0, var11);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var8 = pn.c(-9235);
              if (var8 != null) {
                ep.field_e = var8;
                break L40;
              } else {
                break L40;
              }
            }
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    wg() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new lo();
        field_d = "Game full";
        field_b = "Please try again in a few minutes.";
    }
}
