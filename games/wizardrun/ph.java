/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ge {
    static int[] field_q;
    static int field_r;
    static String field_s;
    boolean field_p;
    static int field_o;

    final void a(int param0, boolean param1, int param2, byte param3) {
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          var11 = wizardrun.field_H;
          if (!param1) {
            stackOut_2_0 = 16639;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16777215;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var6 = "";
          if (param2 != 0) {
            if (param2 != -2) {
              L2: {
                L3: {
                  if (-6 != param2) {
                    break L3;
                  } else {
                    if (!e.a(-116)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-5 != param2) {
                    break L4;
                  } else {
                    if (e.a(-103)) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 == (param2 ^ -1)) {
                  L5: {
                    if (pk.field_s) {
                      stackOut_53_0 = ee.field_p;
                      stackIn_54_0 = stackOut_53_0;
                      break L5;
                    } else {
                      stackOut_52_0 = 0;
                      stackIn_54_0 = stackOut_52_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_54_0;
                  var8 = 20 + param0;
                  var9 = 260;
                  ok.field_d[0].a(2 + var9 + 0, -6 + var8 + -10, -118, 20, 0);
                  ok.field_d[0].a(2 + var9 - 0, -6 + (var8 + 10), -86, 20, 0);
                  ok.field_d[0].a(2 + (0 + var9), -6 + var8, -105, 30, 0);
                  ok.field_d[0].a(108 + var9 + 2, -10 + (-6 + var8), -98, 20, 0);
                  ok.field_d[0].a(var9 + 108 - -2, var8 + -6 + 10, -121, 20, 0);
                  ok.field_d[0].a(2 + var9 - -108, -6 + var8, -90, 30, 0);
                  var10 = var9;
                  L6: while (true) {
                    if (var10 >= -12 + var9 - -108) {
                      ed.c(0, 0, 2 + (var7 * 108 / 104 + var9), 480);
                      var10 = var9;
                      L7: while (true) {
                        if (108 + var9 + 2 + -14 <= var10) {
                          ed.c();
                          ok.field_d[0].a(2 + var7 * 108 / 104 + var9, var8 - 16, -102, 30, 0);
                          ok.field_d[0].a(2 + (var7 * 108 / 104 + var9), var8 + -6 + 10, -102, 30, 0);
                          ok.field_d[0].a(108 * var7 / 104 + (var9 - -2), var8 - 6, -90, 40, 0);
                          var6 = qc.field_N + "       ";
                          break L1;
                        } else {
                          ok.field_d[0].a(var10, -20 + var8, 28, 28);
                          var10 += 14;
                          continue L7;
                        }
                      }
                    } else {
                      ok.field_d[0].b(var10, var8 - 14 - 6, 28, 28, 64);
                      var10 += 14;
                      continue L6;
                    }
                  }
                } else {
                  if (3 != param2) {
                    if ((param2 ^ -1) == -5) {
                      if (!e.a(-114)) {
                        if (null == ki.field_E) {
                          var6 = mh.field_lb;
                          break L1;
                        } else {
                          var6 = mh.field_lb;
                          break L1;
                        }
                      } else {
                        L8: {
                          if (param1) {
                            var7 = jj.field_b.b(var6);
                            ok.field_d[2].e(268 - (var7 / 2 - -ok.field_d[2].field_z), param0);
                            ok.field_d[2].e(var7 / 2 + 268, param0);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (param3 <= -98) {
                            break L9;
                          } else {
                            boolean discarded$5 = ph.a((byte) 46);
                            break L9;
                          }
                        }
                        jj.field_b.b(var6, 267, param0 - -18, 0, -1);
                        jj.field_b.b(var6, 269, param0 - -18, 0, -1);
                        jj.field_b.b(var6, 268, 18 + param0 + -1, 0, -1);
                        jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
                        jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
                        jj.field_b.b(var6, 270, 2 + param0 - -18, 0, -1);
                        jj.field_b.b(var6, 268, param0 + 18, var5, -1);
                        return;
                      }
                    } else {
                      L10: {
                        if (param1) {
                          var7 = jj.field_b.b(var6);
                          ok.field_d[2].e(268 - (var7 / 2 - -ok.field_d[2].field_z), param0);
                          ok.field_d[2].e(var7 / 2 + 268, param0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (param3 <= -98) {
                          break L11;
                        } else {
                          boolean discarded$6 = ph.a((byte) 46);
                          break L11;
                        }
                      }
                      jj.field_b.b(var6, 267, param0 - -18, 0, -1);
                      jj.field_b.b(var6, 269, param0 - -18, 0, -1);
                      jj.field_b.b(var6, 268, 18 + param0 + -1, 0, -1);
                      jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
                      jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
                      jj.field_b.b(var6, 270, 2 + param0 - -18, 0, -1);
                      jj.field_b.b(var6, 268, param0 + 18, var5, -1);
                      return;
                    }
                  } else {
                    L12: {
                      if (tl.field_e) {
                        stackOut_26_0 = hc.field_o;
                        stackIn_27_0 = stackOut_26_0;
                        break L12;
                      } else {
                        stackOut_25_0 = 0;
                        stackIn_27_0 = stackOut_25_0;
                        break L12;
                      }
                    }
                    var7 = stackIn_27_0;
                    var8 = param0 - -20;
                    var9 = 260;
                    ok.field_d[0].a(0 + var9 + 2, -16 + var8, -121, 20, 0);
                    ok.field_d[0].a(var9 - 0 + 2, -6 + var8 - -10, -115, 20, 0);
                    ok.field_d[0].a(2 + var9, var8 - 6, -125, 30, 0);
                    ok.field_d[0].a(var9 + 110, -10 + (-6 + var8), -126, 20, 0);
                    ok.field_d[0].a(var9 - -110, -6 + (var8 - -10), -116, 20, 0);
                    ok.field_d[0].a(2 + (108 + var9), var8 + -6, -88, 30, 0);
                    var10 = var9;
                    L13: while (true) {
                      if (2 + (var9 - -108) - 14 <= var10) {
                        ed.c(0, 0, 2 + (var9 - -(var7 * 108 / 200)), 480);
                        var10 = var9;
                        L14: while (true) {
                          if (var10 >= -14 + (110 + var9)) {
                            ed.c();
                            ok.field_d[0].a(var9 - -(var7 * 108 / 200) - -2, var8 - 6 + -10, -122, 30, 0);
                            ok.field_d[0].a(108 * var7 / 200 + (var9 - -2), 10 + var8 + -6, -91, 30, 0);
                            ok.field_d[0].a(108 * var7 / 200 + (var9 + 2), -6 + var8, -98, 40, 0);
                            var6 = qk.field_i + "       ";
                            break L1;
                          } else {
                            ok.field_d[0].a(var10, -6 + (var8 - 14), 28, 28);
                            var10 += 14;
                            continue L14;
                          }
                        }
                      } else {
                        ok.field_d[0].b(var10, -6 + (-14 + var8), 28, 28, 64);
                        var10 += 14;
                        continue L13;
                      }
                    }
                  }
                }
              }
              if (-3 != (wi.field_K ^ -1)) {
                return;
              } else {
                var6 = od.field_o;
                L15: {
                  if (param1) {
                    var7 = jj.field_b.b(var6);
                    ok.field_d[2].e(268 - (var7 / 2 - -ok.field_d[2].field_z), param0);
                    ok.field_d[2].e(var7 / 2 + 268, param0);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param3 <= -98) {
                    break L16;
                  } else {
                    boolean discarded$7 = ph.a((byte) 46);
                    break L16;
                  }
                }
                jj.field_b.b(var6, 267, param0 - -18, 0, -1);
                jj.field_b.b(var6, 269, param0 - -18, 0, -1);
                jj.field_b.b(var6, 268, 18 + param0 + -1, 0, -1);
                jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
                jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
                jj.field_b.b(var6, 270, 2 + param0 - -18, 0, -1);
                jj.field_b.b(var6, 268, param0 + 18, var5, -1);
                return;
              }
            } else {
              L17: {
                var6 = vk.field_o;
                if (param1) {
                  var7 = jj.field_b.b(var6);
                  ok.field_d[2].e(268 - (var7 / 2 - -ok.field_d[2].field_z), param0);
                  ok.field_d[2].e(var7 / 2 + 268, param0);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param3 <= -98) {
                  break L18;
                } else {
                  boolean discarded$8 = ph.a((byte) 46);
                  break L18;
                }
              }
              jj.field_b.b(var6, 267, param0 - -18, 0, -1);
              jj.field_b.b(var6, 269, param0 - -18, 0, -1);
              jj.field_b.b(var6, 268, 18 + param0 + -1, 0, -1);
              jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
              jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
              jj.field_b.b(var6, 270, 2 + param0 - -18, 0, -1);
              jj.field_b.b(var6, 268, param0 + 18, var5, -1);
              return;
            }
          } else {
            L19: {
              if (1 < wi.field_K) {
                break L19;
              } else {
                var6 = og.field_G;
                break L19;
              }
            }
            if (-3 == wi.field_K) {
              var6 = nk.field_K;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L20: {
          if (param1) {
            var7 = jj.field_b.b(var6);
            ok.field_d[2].e(268 - (var7 / 2 - -ok.field_d[2].field_z), param0);
            ok.field_d[2].e(var7 / 2 + 268, param0);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (param3 <= -98) {
            break L21;
          } else {
            boolean discarded$9 = ph.a((byte) 46);
            break L21;
          }
        }
        jj.field_b.b(var6, 267, param0 - -18, 0, -1);
        jj.field_b.b(var6, 269, param0 - -18, 0, -1);
        jj.field_b.b(var6, 268, 18 + param0 + -1, 0, -1);
        jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
        jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
        jj.field_b.b(var6, 270, 2 + param0 - -18, 0, -1);
        jj.field_b.b(var6, 268, param0 + 18, var5, -1);
    }

    ph() {
        super(e.a(-106) ? 5 : 6, 160, 392, 152, 32);
    }

    final static void d(int param0) {
        ei var1_ref = null;
        ei var1 = (ei) (Object) qa.field_q.c(param0 + 39974);
        if (var1 == null) {
            var1_ref = new ei();
        }
        var1_ref.a(ed.field_k, ed.field_d, ed.field_c, ed.field_b, ed.field_h, param0 ^ 9202, ed.field_l, ed.field_i);
        if (param0 != -31782) {
            field_o = 6;
        }
        lh.field_b.a((wl) (Object) var1_ref, false);
    }

    final void b(int param0, int param1) {
        int var4 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var4 = wizardrun.field_H;
          if (param0 < -123) {
            break L0;
          } else {
            field_o = 29;
            break L0;
          }
        }
        L1: {
          if (param1 != 0) {
            if (1 == param1) {
              md.field_d = true;
              break L1;
            } else {
              L2: {
                L3: {
                  if (5 != param1) {
                    break L3;
                  } else {
                    if (!e.a(-112)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (4 != param1) {
                    break L4;
                  } else {
                    if (e.a(-115)) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if ((param1 ^ -1) == -3) {
                  L5: {
                    if (pk.field_s) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L5;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L5;
                    }
                  }
                  pk.field_s = stackIn_24_0 != 0;
                  break L1;
                } else {
                  if ((param1 ^ -1) != -4) {
                    if ((param1 ^ -1) != -5) {
                      break L1;
                    } else {
                      if (e.a(-106)) {
                        break L1;
                      } else {
                        if (ki.field_E != null) {
                          di.a((byte) 60);
                          break L1;
                        } else {
                          pd.a(false, false);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (tl.field_e) {
                      tl.field_e = false;
                      mi.field_D.d(-101);
                      break L1;
                    } else {
                      tl.field_e = true;
                      mi.field_D.a(true, -122, ga.field_e);
                      break L1;
                    }
                  }
                }
              }
              L6: {
                if (2 != wi.field_K) {
                  break L6;
                } else {
                  hi.field_c = hi.field_c + (qh.field_g + 1);
                  hi.field_a = -350;
                  qh.field_g = -1;
                  break L6;
                }
              }
              ((ph) this).field_p = true;
              break L1;
            }
          } else {
            ((ph) this).field_p = true;
            break L1;
          }
        }
    }

    final static int a(int param0, CharSequence param1) {
        if (param0 != 1124) {
            field_o = -19;
        }
        return il.a(10, (byte) -83, param1, true);
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        int var8 = 0;
        L0: {
          var8 = wizardrun.field_H;
          if (param1 == 2) {
            L1: {
              if (260 > param0) {
                break L1;
              } else {
                if (!pk.field_s) {
                  break L1;
                } else {
                  L2: {
                    if (param0 <= 368) {
                      ee.field_p = (param0 - 260) * 104 / 108;
                      break L2;
                    } else {
                      ee.field_p = 104;
                      break L2;
                    }
                  }
                  if (!pk.field_s) {
                    break L0;
                  } else {
                    if ((nl.field_y ^ -1) >= -1) {
                      tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                      nl.field_y = 25;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L3: {
              if (param4) {
                break L3;
              } else {
                super.a(param0, param1, param2, param3, param4, false);
                break L3;
              }
            }
            return;
          } else {
            if (param1 == 3) {
              if (260 > param0) {
                L4: {
                  if (!param4) {
                    super.a(param0, param1, param2, param3, param4, param5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  if (param0 <= 368) {
                    hc.field_o = (-52000 + param0 * 200) / 108;
                    break L5;
                  } else {
                    hc.field_o = 200;
                    break L5;
                  }
                }
                L6: {
                  if (!pk.field_s) {
                    break L6;
                  } else {
                    if (nl.field_y > 0) {
                      break L6;
                    } else {
                      tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                      nl.field_y = 25;
                      break L6;
                    }
                  }
                }
                if (hc.field_o >= 10) {
                  L7: {
                    if (tl.field_e) {
                      break L7;
                    } else {
                      tl.field_e = true;
                      mi.field_D.a(true, -76, ga.field_e);
                      break L7;
                    }
                  }
                  mi.field_D.a(-1, hc.field_o);
                  break L0;
                } else {
                  hc.field_o = 10;
                  if (tl.field_e) {
                    mi.field_D.a(-1, hc.field_o);
                    tl.field_e = false;
                    mi.field_D.d(-123);
                    break L0;
                  } else {
                    L8: {
                      if (!param5) {
                        break L8;
                      } else {
                        ((ph) this).b(-123, 44);
                        break L8;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              super.a(param0, param1, param2, param3, param4, false);
              break L0;
            }
          }
        }
        L9: {
          if (!param5) {
            break L9;
          } else {
            ((ph) this).b(-123, 44);
            break L9;
          }
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
    }

    final void c(int param0) {
        if (param0 <= 12) {
          return;
        } else {
          L0: {
            if (-3 == (wi.field_K ^ -1)) {
              oe.field_a.c(0, 0);
              break L0;
            } else {
              kb.field_jb.c(0, 0);
              break L0;
            }
          }
          super.c(68);
          return;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 12) {
          L0: {
            L1: {
              if (10 > ml.field_t) {
                break L1;
              } else {
                if (-14 < (ri.field_a ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var4 = wizardrun.field_H;
        if (param0 != -6) {
          return;
        } else {
          L0: {
            if ((param1 ^ -1) == -3) {
              ee.field_p = ee.field_p - 13;
              if (-1 > (ee.field_p ^ -1)) {
                break L0;
              } else {
                ee.field_p = 0;
                pk.field_s = false;
                break L0;
              }
            } else {
              if ((param1 ^ -1) != -4) {
                break L0;
              } else {
                hc.field_o = hc.field_o - 25;
                if ((hc.field_o ^ -1) >= -1) {
                  L1: {
                    hc.field_o = 0;
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (tl.field_e) {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L1;
                    } else {
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L1;
                    }
                  }
                  if (stackIn_8_0 == stackIn_8_1) {
                    break L0;
                  } else {
                    tl.field_e = false;
                    mi.field_D.d(-102);
                    break L0;
                  }
                } else {
                  mi.field_D.a(-1, hc.field_o);
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          return;
        } else {
          L0: {
            if (-3 != param0) {
              if (-4 == param0) {
                L1: {
                  hc.field_o = hc.field_o + 25;
                  if (hc.field_o > 200) {
                    hc.field_o = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                mi.field_D.a(-1, hc.field_o);
                if (tl.field_e) {
                  break L0;
                } else {
                  tl.field_e = true;
                  mi.field_D.a(true, -117, ga.field_e);
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              L2: {
                ee.field_p = ee.field_p + 13;
                if (104 >= ee.field_p) {
                  break L2;
                } else {
                  ee.field_p = 104;
                  break L2;
                }
              }
              pk.field_s = true;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Type your password again to make sure it's correct";
        field_r = 0;
        field_o = 0;
    }
}
