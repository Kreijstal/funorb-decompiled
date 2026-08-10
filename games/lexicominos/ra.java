/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_d;
    static le field_c;
    static byte[] field_a;
    java.awt.Frame field_b;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (0 > mc.field_k) {
          return;
        } else {
          L0: {
            var3 = -135 + param0;
            var4 = -35 + param2;
            var5 = 256;
            if (-76 < (mc.field_k ^ -1)) {
              var5 = (mc.field_k << -1476670264) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-201 > (mc.field_k ^ -1)) {
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
                  L8: {
                    var6 = mc.field_k + -140;
                    if ((var6 ^ -1) >= -1) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if ((var6 ^ -1) <= -21) {
                          break L9;
                        } else {
                          var7 = 256 * var6 / 20;
                          break L9;
                        }
                      }
                      jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) >= -1) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L11;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L11;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    break L10;
                  }
                }
                return;
              }
            } else {
              be.field_d.f(var3, var4);
              var6 = mc.field_k - 125;
              if ((var6 ^ -1) >= -1) {
                L12: {
                  var6 = mc.field_k + -140;
                  if ((var6 ^ -1) >= -1) {
                    break L12;
                  } else {
                    L13: {
                      var7 = 256;
                      if ((var6 ^ -1) <= -21) {
                        break L13;
                      } else {
                        var7 = 256 * var6 / 20;
                        break L13;
                      }
                    }
                    jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                    break L12;
                  }
                }
                return;
              } else {
                L14: {
                  if (-51 < (var6 ^ -1)) {
                    L15: {
                      if (-21 >= (var6 ^ -1)) {
                        if (30 > var6) {
                          t.field_a.d(var3, var4, 256);
                          break L15;
                        } else {
                          var7 = 256 * (50 + -var6) / 20;
                          t.field_a.d(var3, var4, var7);
                          break L15;
                        }
                      } else {
                        var7 = var6 * 256 / 20;
                        t.field_a.d(var3, var4, var7);
                        break L15;
                      }
                    }
                    L16: {
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L16;
                      } else {
                        L17: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L17;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L17;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L16;
                      }
                    }
                    break L14;
                  } else {
                    L18: {
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L18;
                      } else {
                        L19: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L19;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L19;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L18;
                      }
                    }
                    break L14;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              lf.c(0, 0, lf.field_f, lf.field_a, 0, -var5 + 256);
              pd.a(param1 ^ -22835);
              if (param1 <= mc.field_k) {
                nc.field_n.b(var3 + 15, var4 + 10, var5);
                break L20;
              } else {
                be.field_d.f(var3, var4);
                break L20;
              }
            }
            L21: {
              L22: {
                var6 = mc.field_k - 125;
                if ((var6 ^ -1) >= -1) {
                  break L22;
                } else {
                  if (-51 < (var6 ^ -1)) {
                    if (-21 >= (var6 ^ -1)) {
                      if (30 > var6) {
                        t.field_a.d(var3, var4, 256);
                        break L22;
                      } else {
                        var7 = 256 * (50 + -var6) / 20;
                        t.field_a.d(var3, var4, var7);
                        break L22;
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      t.field_a.d(var3, var4, var7);
                      break L22;
                    }
                  } else {
                    L23: {
                      var6 = mc.field_k + -140;
                      if ((var6 ^ -1) >= -1) {
                        break L23;
                      } else {
                        L24: {
                          var7 = 256;
                          if ((var6 ^ -1) <= -21) {
                            break L24;
                          } else {
                            var7 = 256 * var6 / 20;
                            break L24;
                          }
                        }
                        jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                        break L23;
                      }
                    }
                    break L21;
                  }
                }
              }
              L25: {
                var6 = mc.field_k + -140;
                if ((var6 ^ -1) >= -1) {
                  break L25;
                } else {
                  L26: {
                    var7 = 256;
                    if ((var6 ^ -1) <= -21) {
                      break L26;
                    } else {
                      var7 = 256 * var6 / 20;
                      break L26;
                    }
                  }
                  jg.field_m.b(var3 + 15, var4 - -10, var5 * var7 >> -917014616);
                  break L25;
                }
              }
              break L21;
            }
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 20) {
            ra.a(0);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(boolean param0, ab param1) {
        try {
            ca.a(param1, 15232, this.field_b);
            if (param0) {
                this.field_b = (java.awt.Frame) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ra.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int var6;
        int var7;
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
              stackIn_23_0 = 0;
              break L1;
            } else {
              stackIn_23_0 = 1000 * param5 / var6;
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
              stackIn_7_0 = 0;
              break L5;
            } else {
              stackIn_7_0 = 1000 * param5 / var6;
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
            field_c = (le) null;
            return sc.field_e;
        }
        return sc.field_e;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_d = true;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ra.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    ra() {
    }

    static {
        field_a = new byte[520];
    }
}
