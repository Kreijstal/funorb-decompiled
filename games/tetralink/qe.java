/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static boolean field_b;
    static String field_f;
    static el field_a;
    static int field_d;
    static String field_e;
    static hl field_c;
    static int field_g;

    final static void a(int param0, int param1, int param2, int param3) {
        tb.field_j.field_t = 0;
        tb.field_j.a(12, false);
        tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
        tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
        tb.field_j.a(param3, false);
        tb.field_j.a(param0, false);
        tb.field_j.b(param2, false);
        tb.field_j.a(ki.field_c, jg.field_c, -25035);
        nd.field_Lb.f(18, (byte) -92);
        nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
        int var4 = nd.field_Lb.field_t + 1;
        nd.field_Lb.a(param1, param1 + 128, tb.field_j.field_u, tb.field_j.field_t);
        nd.field_Lb.b(-var4 + nd.field_Lb.field_t, -2);
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        int var1 = -12 % ((0 - param0) / 63);
        field_a = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(vi.field_a == null)) {
            mh.field_b = -1;
        }
    }

    final static void a(int param0, int param1, long param2) {
        bc var4 = nd.field_Lb;
        var4.f(param1, (byte) -92);
        var4.field_t = var4.field_t + 1;
        int var5 = var4.field_t;
        int var6 = 16 % ((param0 - -59) / 54);
        var4.a(7, false);
        var4.a(-1, param2);
        var4.b(var4.field_t + -var5, -2);
    }

    final static void a(int param0) {
        dh.field_q = em.b(param0 ^ param0);
        mf.field_s = new pk();
        jd.a((byte) -96, true, true);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (vi.field_a != null) {
          wk.field_c = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            L0: {
              if (ci.field_y.length > var2) {
                var2 = ci.field_y[var2];
                if ((128 & var2) != 0) {
                  var2 = -1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var2 = -1;
                break L0;
              }
            }
            if (mh.field_b >= 0) {
              if (-1 >= (var2 ^ -1)) {
                ah.field_g[mh.field_b] = var2;
                mh.field_b = mh.field_b + 1 & 127;
                if (s.field_d == mh.field_b) {
                  mh.field_b = -1;
                  if (var2 >= 0) {
                    var3 = 127 & eh.field_n - -1;
                    if (var3 == dh.field_m) {
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (10 != var2) {
                            return;
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      }
                    } else {
                      af.field_e[eh.field_n] = var2;
                      fm.field_c[eh.field_n] = (char)0;
                      eh.field_n = var3;
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (10 != var2) {
                            return;
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 != var2) {
                          return;
                        } else {
                          param0.consume();
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L1: {
                    if (var2 >= 0) {
                      var3 = 127 & eh.field_n - -1;
                      if (var3 == dh.field_m) {
                        break L1;
                      } else {
                        af.field_e[eh.field_n] = var2;
                        fm.field_c[eh.field_n] = (char)0;
                        eh.field_n = var3;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      break L2;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        break L2;
                      } else {
                        if (10 != var2) {
                          break L2;
                        } else {
                          param0.consume();
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                if (var2 >= 0) {
                  var3 = 127 & eh.field_n - -1;
                  if (var3 == dh.field_m) {
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (10 != var2) {
                          return;
                        } else {
                          param0.consume();
                          return;
                        }
                      }
                    }
                  } else {
                    af.field_e[eh.field_n] = var2;
                    fm.field_c[eh.field_n] = (char)0;
                    eh.field_n = var3;
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) != -86) {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) != -86) {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
            } else {
              if (var2 >= 0) {
                var3 = 127 & eh.field_n - -1;
                if (var3 == dh.field_m) {
                  var3 = param0.getModifiers();
                  if (0 == (10 & var3)) {
                    if ((var2 ^ -1) != -86) {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  af.field_e[eh.field_n] = var2;
                  fm.field_c[eh.field_n] = (char)0;
                  eh.field_n = var3;
                  var3 = param0.getModifiers();
                  if (0 == (10 & var3)) {
                    if ((var2 ^ -1) != -86) {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                }
              } else {
                var3 = param0.getModifiers();
                if (0 == (10 & var3)) {
                  if ((var2 ^ -1) != -86) {
                    if (10 == var2) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          } else {
            L3: {
              var2 = -1;
              if (mh.field_b < 0) {
                break L3;
              } else {
                if (-1 > var2) {
                  break L3;
                } else {
                  ah.field_g[mh.field_b] = var2;
                  mh.field_b = mh.field_b + 1 & 127;
                  if (s.field_d == mh.field_b) {
                    mh.field_b = -1;
                    break L3;
                  } else {
                    L4: {
                      if (var2 >= 0) {
                        var3 = 127 & eh.field_n - -1;
                        if (var3 == dh.field_m) {
                          break L4;
                        } else {
                          af.field_e[eh.field_n] = var2;
                          fm.field_c[eh.field_n] = (char)0;
                          eh.field_n = var3;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
                        param0.consume();
                        break L5;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          break L5;
                        } else {
                          if (10 != var2) {
                            break L5;
                          } else {
                            param0.consume();
                            break L5;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (var2 >= 0) {
              var3 = 127 & eh.field_n - -1;
              if (var3 == dh.field_m) {
                var3 = param0.getModifiers();
                if (0 == (10 & var3)) {
                  if ((var2 ^ -1) != -86) {
                    if (10 == var2) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              } else {
                L6: {
                  af.field_e[eh.field_n] = var2;
                  fm.field_c[eh.field_n] = (char)0;
                  eh.field_n = var3;
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    break L6;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      break L6;
                    } else {
                      if (10 != var2) {
                        break L6;
                      } else {
                        param0.consume();
                        break L6;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L7: {
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  break L7;
                } else {
                  if ((var2 ^ -1) == -86) {
                    param0.consume();
                    break L7;
                  } else {
                    if (10 != var2) {
                      break L7;
                    } else {
                      param0.consume();
                      break L7;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (vi.field_a != null) {
          L0: {
            wk.field_c = 0;
            var2 = param0.getKeyCode();
            if (-1 < var2) {
              var2 = -1;
              break L0;
            } else {
              if (ci.field_y.length > var2) {
                var2 = -129 & ci.field_y[var2];
                break L0;
              } else {
                var2 = -1;
                if (0 <= mh.field_b) {
                  if (-1 > var2) {
                    param0.consume();
                    return;
                  } else {
                    L1: {
                      ah.field_g[mh.field_b] = var2 ^ -1;
                      mh.field_b = 127 & mh.field_b - -1;
                      if (s.field_d == mh.field_b) {
                        mh.field_b = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    param0.consume();
                    return;
                  }
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          }
          if (0 <= mh.field_b) {
            if (-1 >= (var2 ^ -1)) {
              ah.field_g[mh.field_b] = var2 ^ -1;
              mh.field_b = 127 & mh.field_b - -1;
              if (s.field_d != mh.field_b) {
                param0.consume();
                return;
              } else {
                mh.field_b = -1;
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != vi.field_a) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (le.a(128, (char) var2)) {
                var3 = 127 & 1 + eh.field_n;
                if (dh.field_m == var3) {
                  param0.consume();
                  return;
                } else {
                  af.field_e[eh.field_n] = -1;
                  fm.field_c[eh.field_n] = (char)var2;
                  eh.field_n = var3;
                  param0.consume();
                  return;
                }
              } else {
                param0.consume();
                return;
              }
            } else {
              param0.consume();
              return;
            }
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This game option has not yet been unlocked for use.";
        field_e = "<%0>'s game";
    }
}
