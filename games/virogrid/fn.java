/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static km field_d;
    static String[] field_b;
    static String field_g;
    static String field_f;
    static p field_a;
    static int field_c;
    static km field_e;

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        Object var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        Object var42 = null;
        CharSequence var43 = null;
        L0: {
          var42 = null;
          var12 = Virogrid.field_F ? 1 : 0;
          var3 = 1;
          if (uf.field_i) {
            break L0;
          } else {
            if (null != qc.field_i) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (sd.field_e != 0) {
            break L1;
          } else {
            if (null == la.field_h) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (-3 != (sd.field_e ^ -1)) {
            break L2;
          } else {
            if (ub.g(68)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        var4 = -34 % ((param2 - 59) / 55);
        if (-85 != (um.field_Gb ^ -1)) {
          if (um.field_Gb != 85) {
            var5 = nm.field_d;
            if (!ig.a((byte) -126, (char) var5)) {
              return false;
            } else {
              L3: {
                if (var3 == 0) {
                  break L3;
                } else {
                  if (80 <= oi.field_h.length()) {
                    break L3;
                  } else {
                    L4: {
                      StringBuilder discarded$6 = oi.field_h.append(var5);
                      var6 = 485;
                      var18 = mi.field_d;
                      var8 = var18;
                      var8 = var18;
                      var17 = jb.a(124, var18);
                      var8 = var17;
                      var8 = var17;
                      var20 = var17;
                      var8 = var20;
                      var8 = var20;
                      if (-3 != (sd.field_e ^ -1)) {
                        L5: {
                          var8 = "";
                          if (sd.field_e != 0) {
                            break L5;
                          } else {
                            L6: {
                              if (null != wl.field_d) {
                                break L6;
                              } else {
                                if (!ch.field_e) {
                                  break L6;
                                } else {
                                  var8 = "[" + fj.field_a + "] ";
                                  break L6;
                                }
                              }
                            }
                            if (wl.field_d != null) {
                              if (!bf.field_t) {
                                L7: {
                                  var39 = "[" + oi.a(new String[1], ra.field_c, 2) + "] ";
                                  var40 = var39 + var20 + ": ";
                                  var6 = var6 - hk.field_Ob.a(var40);
                                  if ((hk.field_Ob.a(oi.field_h.toString()) ^ -1) < (var6 ^ -1)) {
                                    StringBuilder discarded$7 = gi.a(oi.field_h, -18340, oi.field_h.length() + -1, ' ');
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                return true;
                              } else {
                                if (null != tl.field_e) {
                                  var8 = "[" + tl.field_e + "] ";
                                  break L5;
                                } else {
                                  L8: {
                                    var37 = "[" + oi.a(new String[1], ra.field_c, 2) + "] ";
                                    var38 = var37 + var20 + ": ";
                                    var6 = var6 - hk.field_Ob.a(var38);
                                    if ((hk.field_Ob.a(oi.field_h.toString()) ^ -1) < (var6 ^ -1)) {
                                      StringBuilder discarded$8 = gi.a(oi.field_h, -18340, oi.field_h.length() + -1, ' ');
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  return true;
                                }
                              }
                            } else {
                              L9: {
                                var36 = var8 + var20 + ": ";
                                var6 = var6 - hk.field_Ob.a(var36);
                                if ((hk.field_Ob.a(oi.field_h.toString()) ^ -1) < (var6 ^ -1)) {
                                  StringBuilder discarded$9 = gi.a(oi.field_h, -18340, oi.field_h.length() + -1, ' ');
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              return true;
                            }
                          }
                        }
                        var41 = var8 + var20 + ": ";
                        var6 = var6 - hk.field_Ob.a(var41);
                        break L4;
                      } else {
                        var43 = (CharSequence) (Object) va.field_d;
                        var19 = oi.a(new String[1], lm.field_c, 2);
                        var8 = var19;
                        var8 = var19;
                        var9 = oi.a(new String[1], mf.field_d, 2);
                        var8 = var9;
                        var8 = var9;
                        var10 = hk.field_Ob.a(var19);
                        var11 = hk.field_Ob.a(var9);
                        if (var10 <= var11) {
                          var6 = var6 - var11;
                          break L4;
                        } else {
                          var6 = var6 - var10;
                          break L4;
                        }
                      }
                    }
                    if ((hk.field_Ob.a(oi.field_h.toString()) ^ -1) < (var6 ^ -1)) {
                      StringBuilder discarded$10 = gi.a(oi.field_h, -18340, oi.field_h.length() + -1, ' ');
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
              }
              return true;
            }
          } else {
            L10: {
              if (var3 == 0) {
                break L10;
              } else {
                if (oi.field_h.length() > 0) {
                  StringBuilder discarded$11 = gi.a(oi.field_h, -18340, -1 + oi.field_h.length(), ' ');
                  break L10;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        } else {
          L11: {
            if (var3 != 0) {
              L12: {
                if (0 < oi.field_h.length()) {
                  var5_ref_String = oi.field_h.toString();
                  var8 = var5_ref_String;
                  var8 = var5_ref_String;
                  if (!jf.a(-96, var5_ref_String)) {
                    L13: {
                      var6 = sd.field_e;
                      if (var6 != 0) {
                        break L13;
                      } else {
                        if (null == wl.field_d) {
                          break L13;
                        } else {
                          var6 = 1;
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if ((id.a(var6, (byte) 123) ^ -1) == -3) {
                        sd.a(1, param1, var6, (byte) 97);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    jl.a(-1, sd.field_e, va.field_d, param0, (byte) 39, var5_ref_String);
                    break L12;
                  } else {
                    var14 = null;
                    var13 = null;
                    gf.a((String) null, 0, false, am.field_d, 2, (String) null);
                    var16 = null;
                    var15 = null;
                    gf.a((String) null, 0, false, rl.field_q, 2, (String) null);
                    re.c((byte) 121);
                    return true;
                  }
                } else {
                  break L12;
                }
              }
              re.c((byte) 121);
              break L11;
            } else {
              if ((sd.field_e ^ -1) == -1) {
                break L11;
              } else {
                re.c((byte) 121);
                break L11;
              }
            }
          }
          return true;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        int var1 = -60 / ((30 - param0) / 54);
        field_a = null;
        field_g = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        lk var3 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        la.field_h = null;
        ld.field_c = false;
        wl.field_d = null;
        if (ci.field_o == null) {
          L0: {
            ti.field_i = null;
            if (null != te.field_f) {
              te.field_f.a(false);
              te.field_f = null;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            ma.field_c = null;
            if (qm.field_Mb != null) {
              qm.field_Mb.a(false);
              qm.field_Mb = null;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ah.field_h = null;
            if (ti.field_i != null) {
              var3 = (lk) (Object) ti.field_i.a(true);
              L3: while (true) {
                if (var3 == null) {
                  ti.field_i = null;
                  break L2;
                } else {
                  var3.c(40);
                  var3 = (lk) (Object) ti.field_i.b(-1);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          if (param0 >= -30) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          L4: {
            ci.field_o.a(false);
            ci.field_o = null;
            ti.field_i = null;
            if (null != te.field_f) {
              te.field_f.a(false);
              te.field_f = null;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            ma.field_c = null;
            if (qm.field_Mb != null) {
              qm.field_Mb.a(false);
              qm.field_Mb = null;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            ah.field_h = null;
            if (ti.field_i != null) {
              var3 = (lk) (Object) ti.field_i.a(true);
              L7: while (true) {
                if (var3 == null) {
                  ti.field_i = null;
                  break L6;
                } else {
                  var3.c(40);
                  var3 = (lk) (Object) ti.field_i.b(-1);
                  continue L7;
                }
              }
            } else {
              break L6;
            }
          }
          if (param0 < -30) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        pa.field_l = rg.field_d;
        if (param0 == 255) {
          L0: {
            stackOut_14_0 = -32;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (13 <= nf.field_d) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L0;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L0;
            }
          }
          vb.field_c = Virogrid.b((byte) stackIn_17_0, stackIn_17_1 != 0);
          if (param1 != 105) {
            fn.a((byte) 118);
            return;
          } else {
            return;
          }
        } else {
          if (-101 < (param0 ^ -1)) {
            vb.field_c = lc.a(param0, param3, param1 ^ 29532);
            if (param1 == 105) {
              return;
            } else {
              fn.a((byte) 118);
              return;
            }
          } else {
            if (param0 > 105) {
              vb.field_c = lc.a(param0, param3, param1 ^ 29532);
              if (param1 != 105) {
                fn.a((byte) 118);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                vb.field_c = md.a(param2, 7655);
                if (param1 == 105) {
                  break L1;
                } else {
                  fn.a((byte) 118);
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        hg var2 = null;
        if (!param1) {
          return;
        } else {
          var2 = gk.field_g;
          var2.g(param0, 8);
          var2.a(1, -91);
          var2.a(2, -96);
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (param0 != -69) {
          field_e = null;
          var1 = 0;
          L0: while (true) {
            if (qh.field_K <= var1) {
              qh.field_K = 0;
              return;
            } else {
              el.field_s[var1] = null;
              var1++;
              continue L0;
            }
          }
        } else {
          var1 = 0;
          L1: while (true) {
            if (qh.field_K <= var1) {
              qh.field_K = 0;
              return;
            } else {
              el.field_s[var1] = null;
              var1++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Play the game without logging in just yet";
        field_g = "2D - Fastest";
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = new p();
    }
}
