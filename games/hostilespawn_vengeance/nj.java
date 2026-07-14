/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nj {
    static String field_e;
    static jg field_c;
    static String field_b;
    static int field_a;
    static pg[][] field_d;

    public static void b(byte param0) {
        if (param0 != -93) {
            field_c = null;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, bd param4, int param5) {
        if (param3 != 22173) {
            return;
        }
        ld.a(param1 << -1668743547, (byte) -84, param5 << 242536488, param0, param4, param2);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        p var8_ref_p = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var4 = uj.field_p.field_e + 24;
        var5 = uj.field_p.field_g;
        var17 = new int[12];
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var6 = var14;
        var7 = 0;
        var1 = 0;
        L0: while (true) {
          if (ib.field_c <= var1) {
            if (param0 != 11178) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  return;
                } else {
                  var3 = var6[1 + var8];
                  var2 = var17[var8];
                  var9 = var6[2 + var8];
                  ue.field_c.a(true, 128, var9, var2, var3);
                  var8 += 3;
                  continue L1;
                }
              }
            }
          } else {
            L2: {
              L3: {
                L4: {
                  var8_ref_p = jn.field_F[var1];
                  var9 = var8_ref_p.field_j.b(-4);
                  var3 = (int)(24.0 * (var8_ref_p.field_l.field_a + (double)var8_ref_p.field_j.field_g)) + -var5;
                  var2 = -var4 + (int)(24.0 * (var8_ref_p.field_l.field_f + (double)var8_ref_p.field_j.field_e));
                  if (var2 < -96) {
                    break L4;
                  } else {
                    if (var3 < -96) {
                      break L4;
                    } else {
                      if (-737 > (var2 ^ -1)) {
                        break L4;
                      } else {
                        if (var3 <= 576) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (5 == var8_ref_p.field_i) {
                  break L3;
                } else {
                  if (24 != var8_ref_p.field_i) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (var8_ref_p.field_i != 13) {
                  if (ln.field_a.field_u[var9] >= 24) {
                    break L5;
                  } else {
                    ln.field_a.field_u[var9] = 24;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              var10 = 0;
              var12 = var8_ref_p.field_i;
              if (-21 != var12) {
                if (-1 != var12) {
                  if (var12 != 18) {
                    L6: {
                      if (-10 == (var12 ^ -1)) {
                        break L6;
                      } else {
                        if (23 == var12) {
                          break L6;
                        } else {
                          if (32 != var12) {
                            if (1 == var12) {
                              L7: {
                                var11 = var8_ref_p.field_e / 2;
                                if (0 > var11) {
                                  var11 = 0;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (me.field_ib.length > var11) {
                                  break L8;
                                } else {
                                  var11 = -1 + me.field_ib.length;
                                  break L8;
                                }
                              }
                              if (-2 == (bm.field_c ^ -1)) {
                                if (kd.field_t) {
                                  nj.a(var2 - me.field_ib[var11].field_z / 2, 128, -(me.field_ib[var11].field_A / 2) + var3, 22173, me.field_ib[var11], (int)var8_ref_p.field_c);
                                  break L2;
                                } else {
                                  if (-1 <= (var11 ^ -1)) {
                                    break L2;
                                  } else {
                                    me.field_ib[var11].a(true, 128, (int)var8_ref_p.field_c, var2, var3);
                                    break L2;
                                  }
                                }
                              } else {
                                me.field_ib[var11].c(var2 - me.field_ib[var11].field_z / 2, -(me.field_ib[var11].field_A / 2) + var3, 128);
                                break L2;
                              }
                            } else {
                              if (var12 == -3) {
                                var10 = 16711680;
                                si.f(var2, var3, var8_ref_p.field_e * 2, var10, 128 - var8_ref_p.field_e * 4);
                                break L2;
                              } else {
                                if (-4 != var12) {
                                  if (-22 != (var12 ^ -1)) {
                                    L9: {
                                      if (var12 == 4) {
                                        break L9;
                                      } else {
                                        if (var12 != -9) {
                                          if (-18 != var12) {
                                            if (var12 == -30) {
                                              break L9;
                                            } else {
                                              L10: {
                                                if (-29 == var12) {
                                                  break L10;
                                                } else {
                                                  if (var12 != -31) {
                                                    if (var12 != 5) {
                                                      if (-8 == var12) {
                                                        var17 = var16;
                                                        if (var7 < var17.length) {
                                                          var7++;
                                                          var6[var7] = var2;
                                                          var7++;
                                                          var6[var7] = var3;
                                                          var7++;
                                                          var6[var7] = (int)var8_ref_p.field_c;
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        if (var12 == 24) {
                                                          bn.a(true, var3, var8_ref_p, var2);
                                                          break L2;
                                                        } else {
                                                          if (var12 == -7) {
                                                            tm.a((byte) 88, var2, var3, var8_ref_p);
                                                            break L2;
                                                          } else {
                                                            if (-38 == var12) {
                                                              am.a(-1, var3, var2, var8_ref_p);
                                                              break L2;
                                                            } else {
                                                              L11: {
                                                                if (10 != var12) {
                                                                  if (-26 != (var12 ^ -1)) {
                                                                    if (var12 == -12) {
                                                                      ri.a(91, var3, var8_ref_p, var2);
                                                                      break L2;
                                                                    } else {
                                                                      if (var12 == 34) {
                                                                        f.a(var2, var3, var8_ref_p, param0 ^ 11176);
                                                                        break L2;
                                                                      } else {
                                                                        if (33 == var12) {
                                                                          in.a(param0 ^ 11182, var8_ref_p, var3, var2);
                                                                          break L2;
                                                                        } else {
                                                                          if (-13 != var12) {
                                                                            if (var12 == -14) {
                                                                              ka.a(var2, var8_ref_p, var3, 128);
                                                                              break L2;
                                                                            } else {
                                                                              if (-15 != var12) {
                                                                                L12: {
                                                                                  if ((var12 ^ -1) == -23) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (var12 == 27) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      break L2;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                bi.a(var8_ref_p, var3, var2, -49);
                                                                                break L2;
                                                                              } else {
                                                                                mg.a(var8_ref_p, var2, var3, 2);
                                                                                break L2;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L13: {
                                                                              var11 = var8_ref_p.field_e * ln.field_m.length / 128;
                                                                              if (var11 < ln.field_m.length) {
                                                                                break L13;
                                                                              } else {
                                                                                var11 = ln.field_m.length - 1;
                                                                                break L13;
                                                                              }
                                                                            }
                                                                            L14: {
                                                                              if (var11 >= 0) {
                                                                                break L14;
                                                                              } else {
                                                                                var11 = 0;
                                                                                break L14;
                                                                              }
                                                                            }
                                                                            ln.field_m[var11].a((double)var3, (double)var2, false, var8_ref_p.field_c, 256);
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L11;
                                                                  }
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                              el.a(var2, var8_ref_p, param0 + -11295, var3);
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      ha.a(var2, param0 ^ -896, var8_ref_p, var3);
                                                      break L2;
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              hd.a(var2, -110, var3, var8_ref_p);
                                              break L2;
                                            }
                                          } else {
                                            pf.a(var3, true, var8_ref_p, var2);
                                            break L2;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    pf.a(var3, true, var8_ref_p, var2);
                                    break L2;
                                  } else {
                                    ic.a(var2, var3, var8_ref_p, (byte) 107);
                                    break L2;
                                  }
                                } else {
                                  nm.a(var2, var8_ref_p, var3, param0 ^ 11187);
                                  break L2;
                                }
                              }
                            }
                          } else {
                            oa.a(-17652, var3, var8_ref_p, var2);
                            break L2;
                          }
                        }
                      }
                    }
                    gb.a(var3, (byte) 81, var8_ref_p, var2);
                    break L2;
                  } else {
                    gb.a(var3, (byte) 81, var8_ref_p, var2);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                wi.a(var8_ref_p, var2, (byte) -87, var3);
                break L2;
              }
            }
            var1++;
            continue L0;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        L0: {
          var3 = null;
          var4 = null;
          if (null == bi.field_g) {
            break L0;
          } else {
            if (!bi.field_g.equals((Object) (Object) param0.getParameter("settings"))) {
              var3 = bi.field_g;
              var4 = var3;
              var4 = var3;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (vh.field_c == null) {
            break L1;
          } else {
            if (vh.field_c.equals((Object) (Object) param0.getParameter("session"))) {
              break L1;
            } else {
              var4 = vh.field_c;
              break L1;
            }
          }
        }
        if (!param1) {
          return null;
        } else {
          return ig.a(true, param2, var3, -1, var4);
        }
    }

    final static gb a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param0 <= 66) {
            return null;
        }
        return bf.a(false, param2, param1, param4, param3, -31);
    }

    final static int a(oc param0, oc param1, int param2) {
        int var3 = param1.field_e > param0.field_e ? param1.field_e - param0.field_e : param0.field_e - param1.field_e;
        if (param2 != -28835) {
            nj.b((byte) -110);
        }
        int var4 = param1.field_g > param0.field_g ? -param0.field_g + param1.field_g : param0.field_g - param1.field_g;
        return var3 < var4 ? var4 : var3;
    }

    abstract void a(int param0, byte[] param1);

    abstract byte[] a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Hard mode";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_c = new jg();
    }
}
