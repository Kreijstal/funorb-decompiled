/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    private gb field_h;
    private dn field_d;
    private gb field_b;
    static vl field_i;
    static String field_f;
    static int field_a;
    static nd field_c;
    static int[] field_j;
    static int field_g;
    static String field_e;

    final hj a(int param0, int param1) {
        byte[] var4 = null;
        hj var3 = (hj) ((ac) this).field_d.a(0, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = ((ac) this).field_h.a(false, param0, 1);
        } else {
            var4 = ((ac) this).field_b.a(false, param0 & 32767, 1);
        }
        if (param1 != 1) {
            field_g = 52;
        }
        hj var3_ref = new hj();
        if (!(var4 == null)) {
            var3_ref.a(new vi(var4), 64);
        }
        if ((param0 ^ -1) <= -32769) {
            var3_ref.c((byte) 64);
        }
        ((ac) this).field_d.a((long)param0, param1 ^ -110, (Object) (Object) var3_ref);
        return var3_ref;
    }

    final static bd a(int param0, int param1, byte param2, gb param3) {
        if (!rl.a(2884, param3, param0, param1)) {
            return null;
        }
        if (param2 >= 0) {
            field_j = null;
        }
        return ag.d((byte) 51);
    }

    final static void a(int param0, double param1, int param2, int param3, double param4, int param5) {
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        p var15 = null;
        p var16 = null;
        int var17 = 0;
        p var18 = null;
        p var19 = null;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= ll.field_a) {
            if (param3 == -5161) {
              var17 = -1 + ll.field_a;
              var8 = var17;
              L1: while (true) {
                if (var17 < 0) {
                  return;
                } else {
                  var16 = wh.field_b[var17];
                  var19 = var16;
                  if ((var19.field_i ^ -1) == 0) {
                    ll.field_a = ll.field_a - 1;
                    var16.field_c = wh.field_b[ll.field_a].field_c;
                    var16.field_l.a(wh.field_b[ll.field_a].field_l, -28860);
                    var16.field_j.a((byte) 46, wh.field_b[ll.field_a].field_j);
                    var16.field_h = wh.field_b[ll.field_a].field_h;
                    var16.field_e = wh.field_b[ll.field_a].field_e;
                    var16.field_n = wh.field_b[ll.field_a].field_n;
                    var16.field_i = wh.field_b[ll.field_a].field_i;
                    var19.field_b = ni.a(var19.field_i, (byte) -64);
                    var17--;
                    continue L1;
                  } else {
                    var17--;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var15 = wh.field_b[var8];
            var18 = var15;
            if (0 >= var18.field_e) {
              var10 = (int)(((double)(-var18.field_j.field_e) + ((double)param0 + param4) - var18.field_l.field_f) * 24.0);
              var11 = (int)(((double)param2 + param1 + (double)(-var18.field_j.field_g) - var18.field_l.field_a) * 24.0);
              if (-24 <= var10) {
                if (-49 <= var10) {
                  if (var11 <= 23) {
                    if (-49 >= var11) {
                      if (0 == var18.field_i) {
                        L2: {
                          var18.field_i = -1;
                          var12 = 1;
                          var13 = var18.field_h + 1;
                          if (!kh.field_Q[var13]) {
                            kh.field_Q[var13] = true;
                            break L2;
                          } else {
                            var12 = 0;
                            break L2;
                          }
                        }
                        L3: {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            if (-1 == (kh.field_U[0] ^ -1)) {
                              L4: {
                                if (!t.a(param3 ^ -5181, 0, var13)) {
                                  stackOut_71_0 = 0;
                                  stackIn_72_0 = stackOut_71_0;
                                  break L4;
                                } else {
                                  stackOut_70_0 = 1;
                                  stackIn_72_0 = stackOut_70_0;
                                  break L4;
                                }
                              }
                              var12 = stackIn_72_0;
                              break L3;
                            } else {
                              if (kh.field_U[1] == 0) {
                                L5: {
                                  if (!t.a(67, 1, var13)) {
                                    stackOut_67_0 = 0;
                                    stackIn_68_0 = stackOut_67_0;
                                    break L5;
                                  } else {
                                    stackOut_66_0 = 1;
                                    stackIn_68_0 = stackOut_66_0;
                                    break L5;
                                  }
                                }
                                var12 = stackIn_68_0;
                                break L3;
                              } else {
                                var12 = 0;
                                break L3;
                              }
                            }
                          }
                        }
                        if (uj.field_l == 1) {
                          if (var12 == 0) {
                            if (sf.field_V[var13 + 15] != null) {
                              eh.field_c.a(sf.field_V[15 + var13], 100, uh.field_i);
                              var8++;
                              continue L0;
                            } else {
                              var8++;
                              continue L0;
                            }
                          } else {
                            var8++;
                            continue L0;
                          }
                        } else {
                          var8++;
                          continue L0;
                        }
                      } else {
                        if (-2 == var18.field_i) {
                          var18.field_i = -1;
                          kh.field_ib[var15.field_h] = kh.field_ib[var15.field_h] + te.field_F[var15.field_h];
                          if ((uj.field_l ^ -1) == -2) {
                            eh.field_c.a(sf.field_V[40], 100, uh.field_i);
                            var8++;
                            continue L0;
                          } else {
                            var8++;
                            continue L0;
                          }
                        } else {
                          if (-3 == (var18.field_i ^ -1)) {
                            L6: {
                              var12 = var18.field_h;
                              if (0 != var12) {
                                if (var12 != -2) {
                                  if (-3 != var12) {
                                    if (-5 == (var12 ^ -1)) {
                                      if (om.field_b) {
                                        bh.field_g[18] = vg.a(new String[1], 82, sf.field_Y);
                                        vg.field_e = new v[1];
                                        pm.field_h = true;
                                        vg.field_e[0] = new v(ch.field_k, 24 * var18.field_j.field_e, var18.field_j.field_g + 3);
                                        vg.field_e[0].field_a = 1;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      if (5 == var12) {
                                        if (null == q.field_g) {
                                          break L6;
                                        } else {
                                          q.field_g.a(-56, var18);
                                          break L6;
                                        }
                                      } else {
                                        if ((var12 ^ -1) != -7) {
                                          if (var12 != -8) {
                                            if (8 != var12) {
                                              if (-10 != var12) {
                                                if (var12 != 10) {
                                                  if (var12 == 3) {
                                                    eh.field_c.a(fg.field_b[23], 100, uh.field_i);
                                                    q.field_g.a(127, var18);
                                                    break L6;
                                                  } else {
                                                    if (-12 != (var12 ^ -1)) {
                                                      break L6;
                                                    } else {
                                                      uf.field_h = true;
                                                      eh.field_c.a(fg.field_b[21], 100, uh.field_i);
                                                      q.field_g.a(112, var18);
                                                      var18.field_i = -1;
                                                      break L6;
                                                    }
                                                  }
                                                } else {
                                                  bh.field_d = bh.field_d + 1000;
                                                  break L6;
                                                }
                                              } else {
                                                qh.field_k = qh.field_k + 5;
                                                break L6;
                                              }
                                            } else {
                                              gb.field_h = gb.field_h + 10;
                                              break L6;
                                            }
                                          } else {
                                            gf.field_j = gf.field_j + 100;
                                            break L6;
                                          }
                                        } else {
                                          jf.field_g = jf.field_g + 100;
                                          break L6;
                                        }
                                      }
                                    }
                                  } else {
                                    pl.field_l = true;
                                    break L6;
                                  }
                                } else {
                                  eh.field_g = ba.a((byte) 114);
                                  eh.field_c.a(fg.field_b[20], 100, uh.field_i);
                                  break L6;
                                }
                              } else {
                                L7: {
                                  eh.field_g = eh.field_g + ba.a((byte) 109) / 4;
                                  if (eh.field_g <= ba.a((byte) 108)) {
                                    break L7;
                                  } else {
                                    eh.field_g = ba.a((byte) 100);
                                    break L7;
                                  }
                                }
                                eh.field_c.a(fg.field_b[19], 100, uh.field_i);
                                break L6;
                              }
                            }
                            var18.field_i = -1;
                            var8++;
                            continue L0;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var8++;
                continue L0;
              }
            } else {
              var10 = ln.field_a.field_c[param5];
              ln.field_a.field_c[param5] = 0;
              var18.field_e = var18.field_e - 1;
              boolean[] discarded$1 = var18.a(4, param3 ^ -5164, ln.field_a);
              var18.a(225, 1.0 + var18.field_c, 50);
              ln.field_a.field_c[param5] = var10;
              var8++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        if (param2 != -1) {
            return;
        }
        de.c(param2 ^ 0);
        im.field_e.f((byte) 32);
        ib.field_e = new lk(rf.field_e, (String) null, li.field_o, param1, param0);
        ke.field_s = new ta(im.field_e, (ag) (Object) ib.field_e);
        im.field_e.c((ag) (Object) ke.field_s, param2 ^ -116);
    }

    private ac() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0) {
        ng var1 = null;
        int var2 = 0;
        int var3 = 0;
        ng var4 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var4 = (ng) (Object) td.field_o.g(-92);
        var1 = var4;
        if (var1 != null) {
          var2 = 0;
          L0: while (true) {
            if (var1.field_t <= var2) {
              L1: {
                if (param0 == 24501) {
                  break L1;
                } else {
                  field_f = null;
                  break L1;
                }
              }
              return true;
            } else {
              L2: {
                if (null == var4.field_r[var2]) {
                  break L2;
                } else {
                  if (-1 != var4.field_r[var2].field_f) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              if (null != var4.field_j[var2]) {
                if (-1 == var4.field_j[var2].field_f) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 != 44) {
            field_a = -66;
        }
        field_i = null;
        field_f = null;
        field_e = null;
        field_j = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new vl();
        field_j = new int[8192];
        field_f = "This level is locked down. Activate the five security consoles to reactivate the lift.";
        field_c = new nd(1, 2, 2, 0);
        field_e = "Unpacking sound effects";
    }
}
