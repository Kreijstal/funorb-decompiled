/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends kh {
    private int field_P;
    private int field_T;
    private int field_S;
    static boolean field_R;
    private int field_Q;
    private int field_V;
    private int field_U;

    final void a(int param0, int param1, int param2, byte param3) {
        if (-1 <= (param0 ^ -1)) {
            ((ei) this).b(98, param2, param1);
            return;
        }
        ((ei) this).field_S = ((ei) this).field_p;
        if (param3 != -80) {
            return;
        }
        ((ei) this).field_P = param1;
        ((ei) this).field_Q = ((ei) this).field_n;
        ((ei) this).field_U = param2;
        ((ei) this).field_T = param0;
        ((ei) this).field_V = 0;
    }

    ei(d param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ei) this).field_T = 0;
        ((ei) this).field_V = 0;
    }

    void g(byte param0) {
        if (param0 != 109) {
            ((ei) this).field_U = 62;
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static int a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        uj.field_d = uj.field_d + 65536;
        L0: while (true) {
          if (65536 > li.a(uj.field_d, -117, ke.field_e)) {
            L1: {
              if (param0 <= -100) {
                break L1;
              } else {
                field_R = false;
                break L1;
              }
            }
            L2: {
              var2 = -1;
              if (rk.field_f == null) {
                if (wg.field_l == null) {
                  break L2;
                } else {
                  var2 = wg.field_l.length;
                  break L2;
                }
              } else {
                var2 = rk.field_f.length;
                break L2;
              }
            }
            L3: {
              if (-1 == var2) {
                break L3;
              } else {
                L4: {
                  if (ke.field_f <= vi.field_p) {
                    break L4;
                  } else {
                    L5: {
                      vi.field_p = vi.field_p + 1;
                      if (ke.field_c >= vi.field_p) {
                        break L5;
                      } else {
                        L6: {
                          if (null == rk.field_f) {
                            break L6;
                          } else {
                            if (null != rk.field_f[vi.field_q]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        vi.field_p = vi.field_p - 1;
                        break L4;
                      }
                    }
                    if (vi.field_p < ke.field_f) {
                      break L4;
                    } else {
                      if (rk.field_f[(1 + vi.field_q) % var2] == null) {
                        vi.field_p = vi.field_p - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L7: {
                  if (ke.field_f > vi.field_p) {
                    break L7;
                  } else {
                    L8: {
                      hd.field_h = vi.field_q;
                      if (ve.field_c) {
                        vi.field_q = vi.field_q + 1;
                        if (var2 > vi.field_q) {
                          break L8;
                        } else {
                          vi.field_q = vi.field_q - var2;
                          break L8;
                        }
                      } else {
                        vi.field_q = vi.field_q - 1;
                        if ((vi.field_q ^ -1) > -1) {
                          vi.field_q = vi.field_q + var2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    vi.field_p = vi.field_p - ke.field_f;
                    break L7;
                  }
                }
                if (ke.field_c < vi.field_p) {
                  ve.field_c = true;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L9: {
              if (ig.field_a != null) {
                L10: {
                  var3 = 357 + -(ig.field_a.field_u / 2);
                  var4 = 0;
                  if (ma.field_I == 0) {
                    break L10;
                  } else {
                    if (lm.field_c <= var3) {
                      break L10;
                    } else {
                      if (lm.field_c >= var3 + ig.field_a.field_t) {
                        break L10;
                      } else {
                        L11: {
                          if (-ig.field_a.field_r + 269 >= mm.field_c) {
                            break L11;
                          } else {
                            if (mm.field_c >= 269) {
                              break L11;
                            } else {
                              var4 = 1;
                              ve.field_c = false;
                              vi.field_p = ke.field_f;
                              break L11;
                            }
                          }
                        }
                        if (586 >= mm.field_c) {
                          break L10;
                        } else {
                          if (ig.field_a.field_r + 586 <= mm.field_c) {
                            break L10;
                          } else {
                            ve.field_c = true;
                            vi.field_p = ke.field_f;
                            var4 = 1;
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L9;
                } else {
                  if (ke.field_c >= vi.field_p) {
                    break L9;
                  } else {
                    if (jb.field_b <= var3) {
                      break L9;
                    } else {
                      if (ig.field_a.field_t + var3 > jb.field_b) {
                        L12: {
                          if (ef.field_j <= 269 - ig.field_a.field_r) {
                            break L12;
                          } else {
                            if (269 <= ef.field_j) {
                              break L12;
                            } else {
                              vi.field_p = ke.field_c;
                              break L12;
                            }
                          }
                        }
                        if (586 >= ef.field_j) {
                          break L9;
                        } else {
                          if (ef.field_j < ig.field_a.field_r + 586) {
                            vi.field_p = ke.field_c;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            if (param1) {
              L13: {
                si.field_ob.a(kk.a(10472, ef.field_j, jb.field_b), 127, kk.a(10472, mm.field_c, lm.field_c));
                if (si.field_ob.c((byte) -121)) {
                  if (0 != si.field_ob.field_h) {
                    if (si.field_ob.field_h == 1) {
                      return 2;
                    } else {
                      break L13;
                    }
                  } else {
                    return 3;
                  }
                } else {
                  break L13;
                }
              }
              L14: while (true) {
                if (!fd.d(1)) {
                  return 0;
                } else {
                  L15: {
                    si.field_ob.a((byte) -125, 0);
                    if (!si.field_ob.c((byte) -121)) {
                      break L15;
                    } else {
                      if (-1 == (si.field_ob.field_h ^ -1)) {
                        return 3;
                      } else {
                        if ((si.field_ob.field_h ^ -1) != -2) {
                          break L15;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                  if (lf.field_c != 13) {
                    continue L14;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 0;
            }
          } else {
            el.field_e = el.field_e + 1;
            uj.field_d = uj.field_d - ke.field_e;
            continue L0;
          }
        }
    }

    boolean i(int param0) {
        int var2 = -90 % ((param0 - -2) / 63);
        ((ei) this).j(-2065096856);
        return super.i(-127);
    }

    void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        var16 = Terraphoenix.field_V;
        l.b(6 + param0, param1 - -35, ((ei) this).field_p + -12, ((ei) this).field_n + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            L1: {
              if (param2 == 82) {
                break L1;
              } else {
                var17 = null;
                byte[] discarded$1 = ei.a((Object) null, false, true);
                break L1;
              }
            }
            var6 = 169;
            var5 = 194;
            var4 = 22;
            var7 = 0;
            var8 = 35 + param1;
            L2: while (true) {
              if (var4 <= var7) {
                hd.field_o.b(((ei) this).field_p + param0 + -90, 10 + param1);
                gd.a(param1 + 35, e.field_p, 5 + param0, 121, ((ei) this).field_p + -10);
                gd.a(-22 + (((ei) this).field_n + param1), qb.field_f, param0, 126, ((ei) this).field_p);
                var4 = ((ei) this).field_n + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 1704355984 | var9 << -12255800);
                    l.d(param0, var8, 6, var9);
                    l.d(-6 + (param0 + ((ei) this).field_p), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 1098736648 | var9 << -2040424976);
                l.d(param0, var8, 6, var9);
                l.d(((ei) this).field_p + (param0 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= l.field_d) {
              if (var8 < l.field_c) {
                L4: {
                  L5: {
                    L6: {
                      var9 = (var6 - var5) * var7 / var4 + var5;
                      var10 = 0;
                      var11 = ((ei) this).field_p;
                      if (var7 >= -21) {
                        L7: while (true) {
                          if (-21 < var10) {
                            break L6;
                          } else {
                            var12 = (-var7 + 20) * (20 + -var7) - -((20 - var10) * (20 + -var10));
                            if (var12 <= 462) {
                              if (var12 >= 420) {
                                var13 = (-var12 + 462) * var9 / 42;
                                var13 = var13 | (var13 << -1022660080 | var13 << 591567624);
                                l.field_i[param0 + (var8 * l.field_k - -var10)] = var13;
                                var10++;
                                continue L7;
                              } else {
                                if (-21 <= (var7 ^ -1)) {
                                  var12 = var11;
                                  var11 -= 21;
                                  var13 = 0;
                                  L8: while (true) {
                                    if ((var13 ^ -1) < -21) {
                                      break L5;
                                    } else {
                                      var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                                      if (462 < var14) {
                                        break L5;
                                      } else {
                                        if (var14 >= 420) {
                                          var15 = (462 - var14) * var9 / 42;
                                          var15 = var15 | (var15 << -1159819960 | var15 << 1196367952);
                                          l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                                          var13++;
                                          var11++;
                                          continue L8;
                                        } else {
                                          var12 = 1 + var11;
                                          var13++;
                                          var11++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var10++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    if (-21 <= (var7 ^ -1)) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L9: while (true) {
                        if ((var13 ^ -1) < -21) {
                          break L5;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                          if (462 < var14) {
                            break L5;
                          } else {
                            if (var14 >= 420) {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << -1159819960 | var15 << 1196367952);
                              l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L9;
                            } else {
                              var12 = 1 + var11;
                              var13++;
                              var11++;
                              continue L9;
                            }
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var11 = var12;
                  break L4;
                }
                var9 = var9 | (var9 << 851199856 | var9 << -2065096856);
                l.d(param0 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) a.field_d);
        if (param1 != -24289) {
            Object var3 = null;
            ec discarded$0 = ei.a(-4, (String) null);
        }
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) a.field_d);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) a.field_d);
    }

    void j(int param0) {
        if (param0 != -2065096856) {
            Object var3 = null;
            ei.a((java.awt.Component) null, -28);
        }
        if (0 >= ((ei) this).field_T) {
            return;
        }
        ((ei) this).b(98, ((ei) this).field_U, ((ei) this).field_P);
        ((ei) this).field_T = 0;
        ((ei) this).g((byte) 109);
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -121) {
            Object var6 = null;
            byte[] discarded$0 = ei.a((Object) null, true, false);
        }
        if (-1 > (((ei) this).field_T ^ -1)) {
            var2 = ((ei) this).field_P;
            var3 = ((ei) this).field_U;
            ((ei) this).field_V = ((ei) this).field_V + 1;
            if (((ei) this).field_V + 1 >= ((ei) this).field_T) {
                ((ei) this).field_T = 0;
                ((ei) this).g((byte) 109);
            } else {
                var4 = ((ei) this).field_V * (((ei) this).field_T * 2 - ((ei) this).field_V);
                var5 = ((ei) this).field_T * ((ei) this).field_T;
                var3 = ((ei) this).field_Q + (((ei) this).field_U + -((ei) this).field_Q) * var4 / var5;
                var2 = var4 * (-((ei) this).field_S + ((ei) this).field_P) / var5 + ((ei) this).field_S;
            }
            ((ei) this).b(98, var3, var2);
        }
        return super.f((byte) -121);
    }

    final static ec a(int param0, String param1) {
        int var2 = -124 % ((param0 - 26) / 49);
        if (vc.field_a.a(-71)) {
            if (!(param1.equals((Object) (Object) vc.field_a.b(-110)))) {
                vc.field_a = gl.b(param1, 20);
            }
        }
        return vc.field_a;
    }

    final static byte[] a(Object param0, boolean param1, boolean param2) {
        byte[] var3 = null;
        ke var4 = null;
        if (param2) {
            return null;
        }
        if (param0 == null) {
            return null;
        }
        if (param0 instanceof byte[]) {
            var3 = (byte[]) param0;
            if (param1) {
                return li.a(0, var3);
            }
            return var3;
        }
        if (param0 instanceof ke) {
            var4 = (ke) param0;
            return var4.c(false);
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = true;
    }
}
