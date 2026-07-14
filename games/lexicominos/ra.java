/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_d;
    static le field_c;
    static byte[] field_a;
    java.awt.Frame field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (0 > mc.field_k) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param2;
            var5 = 256;
            if (-76 < mc.field_k) {
              var5 = (mc.field_k << -1476670264) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-201 < mc.field_k) {
              var5 = (250 - mc.field_k << -1659086456) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          de.a(be.field_d, param1 ^ 144);
          k.b();
          lf.a();
          rg.b(0);
          if (-257 >= (var5 ^ -1)) {
            pd.a(param1 ^ -22835);
            if (param1 <= mc.field_k) {
              nc.field_n.b(var3 + 15, var4 + 10, var5);
              var6 = mc.field_k - 125;
              if ((var6 ^ -1) < -1) {
                if (-51 < (var6 ^ -1)) {
                  if (-21 >= (var6 ^ -1)) {
                    if (30 <= var6) {
                      L2: {
                        var7 = 256 * (50 + -var6) / 20;
                        t.field_a.d(var3, var4, var7);
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L2;
                        } else {
                          L3: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L3;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L3;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        t.field_a.d(var3, var4, 256);
                        var6 = mc.field_k + -140;
                        if ((var6 ^ -1) >= -1) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if ((var6 ^ -1) <= -21) {
                              break L5;
                            } else {
                              var7 = 256 * var6 / 20;
                              break L5;
                            }
                          }
                          jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var7 = var6 * 256 / 20;
                      t.field_a.d(var3, var4, var7);
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L6;
                      } else {
                        L7: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L7;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L7;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) < -1) {
                    L8: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L8;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L8;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L9: {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) >= -1) {
                    break L9;
                  } else {
                    L10: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L10;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L10;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    break L9;
                  }
                }
                return;
              }
            } else {
              be.field_d.f(var3, var4);
              var6 = mc.field_k - 125;
              if (var6 >= -1) {
                L11: {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) >= -1) {
                    break L11;
                  } else {
                    L12: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L12;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L12;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    break L11;
                  }
                }
                return;
              } else {
                L13: {
                  if (-51 > var6) {
                    L14: {
                      if (-21 >= (var6 ^ -1)) {
                        if (30 > var6) {
                          t.field_a.d(var3, var4, 256);
                          break L14;
                        } else {
                          var7 = 256 * (50 + -var6) / 20;
                          t.field_a.d(var3, var4, var7);
                          break L14;
                        }
                      } else {
                        var7 = var6 * 256 / 20;
                        t.field_a.d(var3, var4, var7);
                        break L14;
                      }
                    }
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L13;
                    } else {
                      L15: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L15;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L15;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L13;
                    }
                  } else {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L13;
                    } else {
                      L16: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L16;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L16;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L13;
                    }
                  }
                }
                return;
              }
            }
          } else {
            L17: {
              lf.c(0, 0, lf.field_f, lf.field_a, 0, -var5 + 256);
              pd.a(param1 ^ -22835);
              if (param1 <= mc.field_k) {
                nc.field_n.b(var3 + 15, var4 + 10, var5);
                break L17;
              } else {
                be.field_d.f(var3, var4);
                break L17;
              }
            }
            L18: {
              L19: {
                var6 = mc.field_k - 125;
                if (var6 >= -1) {
                  break L19;
                } else {
                  if (-51 > var6) {
                    if (-21 >= (var6 ^ -1)) {
                      if (30 > var6) {
                        t.field_a.d(var3, var4, 256);
                        break L19;
                      } else {
                        var7 = 256 * (50 + -var6) / 20;
                        t.field_a.d(var3, var4, var7);
                        break L19;
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      t.field_a.d(var3, var4, var7);
                      break L19;
                    }
                  } else {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L18;
                    } else {
                      L20: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L20;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L20;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L18;
                    }
                  }
                }
              }
              var6 = mc.field_k + -140;
              if ((var6 ^ -1) >= -1) {
                break L18;
              } else {
                L21: {
                  var7 = 256;
                  if ((var6 ^ -1) <= -21) {
                    break L21;
                  } else {
                    var7 = 256 * var6 / 20;
                    break L21;
                  }
                }
                jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                break L18;
              }
            }
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 20) {
            boolean discarded$0 = ra.a(0);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(boolean param0, ab param1) {
        ca.a(param1, 15232, ((ra) this).field_b);
        if (param0) {
            ((ra) this).field_b = null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        p.field_d[pf.field_o] = param4;
        ff.field_a[pf.field_o] = pf.field_o;
        we.field_g[pf.field_o] = param2;
        if (rb.field_a >= param2) {
          L0: {
            if (param2 < r.field_D) {
              ve.field_d = param2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            l.field_D[pf.field_o] = param5;
            oc.field_a[pf.field_o] = param0;
            hl.field_N[pf.field_o] = param3;
            var6 = param3 + (param0 + param5);
            if (param1 == var6) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L1;
            } else {
              stackOut_21_0 = 1000 * param5 / var6;
              stackIn_23_0 = stackOut_21_0;
              break L1;
            }
          }
          var7 = stackIn_23_0;
          oj.field_j[pf.field_o] = var7;
          if (ve.field_d > var7) {
            L2: {
              ve.field_d = var7;
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L2;
              } else {
                break L2;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          } else {
            L3: {
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L3;
              } else {
                break L3;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          }
        } else {
          L4: {
            l.field_G = param2;
            if (param2 < r.field_D) {
              ve.field_d = param2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            l.field_D[pf.field_o] = param5;
            oc.field_a[pf.field_o] = param0;
            hl.field_N[pf.field_o] = param3;
            var6 = param3 + (param0 + param5);
            if (param1 == var6) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L5;
            } else {
              stackOut_5_0 = 1000 * param5 / var6;
              stackIn_7_0 = stackOut_5_0;
              break L5;
            }
          }
          var7 = stackIn_7_0;
          oj.field_j[pf.field_o] = var7;
          if (ve.field_d > var7) {
            L6: {
              ve.field_d = var7;
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L6;
              } else {
                break L6;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          } else {
            L7: {
              if (var7 > l.field_G) {
                l.field_G = var7;
                break L7;
              } else {
                break L7;
              }
            }
            pf.field_o = pf.field_o + 1;
            return;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != -17977) {
            field_c = null;
            return sc.field_e;
        }
        return sc.field_e;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ra) this).field_d = true;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ra() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[520];
    }
}
