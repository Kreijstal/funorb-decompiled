/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static bd field_h;
    static String field_a;
    static int field_l;
    static String field_e;
    static bd field_d;
    static int field_c;
    static String field_k;
    static bd field_j;
    static bd field_f;
    static String field_g;
    static bd field_i;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != nj.field_c) {
          L0: {
            ae.field_s = 0;
            var2 = param0.getKeyCode();
            if (0 > var2) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < vc.field_i.length) {
                var2 = -129 & vc.field_i[var2];
                break L0;
              } else {
                var2 = -1;
                if (0 <= uc.field_b) {
                  if (var2 >= 0) {
                    al.field_W[uc.field_b] = var2 ^ -1;
                    uc.field_b = uc.field_b + 1 & 127;
                    if (md.field_o != uc.field_b) {
                      param0.consume();
                      return;
                    } else {
                      uc.field_b = -1;
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
            }
          }
          if (0 <= uc.field_b) {
            if (var2 >= 0) {
              al.field_W[uc.field_b] = var2 ^ -1;
              uc.field_b = uc.field_b + 1 & 127;
              if (md.field_o != uc.field_b) {
                param0.consume();
                return;
              } else {
                uc.field_b = -1;
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

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != nj.field_c) {
            uc.field_b = -1;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != nj.field_c) {
          ae.field_s = 0;
          var2 = param0.getKeyCode();
          if (var2 <= -1) {
            L0: {
              if (vc.field_i.length <= var2) {
                var2 = -1;
                break L0;
              } else {
                var2 = vc.field_i[var2];
                if ((var2 & 128) != 0) {
                  var2 = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (-1 >= uc.field_b) {
              if (0 <= var2) {
                al.field_W[uc.field_b] = var2;
                uc.field_b = 127 & 1 + uc.field_b;
                if (uc.field_b == md.field_o) {
                  uc.field_b = -1;
                  if (-1 >= var2) {
                    var3 = 127 & 1 + oa.field_a;
                    if (var3 == ee.field_e) {
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3)) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if (-11 != var2) {
                            return;
                          } else {
                            param0.consume();
                            return;
                          }
                        }
                      }
                    } else {
                      cm.field_a[oa.field_a] = var2;
                      pe.field_db[oa.field_a] = (char)0;
                      oa.field_a = var3;
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3)) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if (-11 != var2) {
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
                    if (-1 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 != (var2 ^ -1)) {
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
                    if (-1 >= (var2 ^ -1)) {
                      var3 = 127 & 1 + oa.field_a;
                      if (var3 == ee.field_e) {
                        break L1;
                      } else {
                        cm.field_a[oa.field_a] = var2;
                        pe.field_db[oa.field_a] = (char)0;
                        oa.field_a = var3;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3)) {
                      param0.consume();
                      break L2;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        break L2;
                      } else {
                        if (-11 != var2) {
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
                if (-1 >= var2) {
                  var3 = 127 & 1 + oa.field_a;
                  if (var3 == ee.field_e) {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 != var2) {
                          return;
                        } else {
                          param0.consume();
                          return;
                        }
                      }
                    }
                  } else {
                    cm.field_a[oa.field_a] = var2;
                    pe.field_db[oa.field_a] = (char)0;
                    oa.field_a = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 != 85) {
                        if (-11 == var2) {
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
                  if (-1 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 != 85) {
                      if (-11 == (var2 ^ -1)) {
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
              if (-1 <= var2) {
                var3 = 127 & 1 + oa.field_a;
                if (var3 == ee.field_e) {
                  var3 = param0.getModifiers();
                  if (-1 == (10 & var3)) {
                    if (var2 != 85) {
                      if (-11 == var2) {
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
                  cm.field_a[oa.field_a] = var2;
                  pe.field_db[oa.field_a] = (char)0;
                  oa.field_a = var3;
                  var3 = param0.getModifiers();
                  if (-1 == (10 & var3)) {
                    if (var2 != 85) {
                      if (-11 == var2) {
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
                if (-1 == (10 & var3)) {
                  if (var2 != 85) {
                    if (-11 == var2) {
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
              if (-1 > uc.field_b) {
                break L3;
              } else {
                if (0 > var2) {
                  break L3;
                } else {
                  al.field_W[uc.field_b] = var2;
                  uc.field_b = 127 & 1 + uc.field_b;
                  if (uc.field_b == md.field_o) {
                    uc.field_b = -1;
                    break L3;
                  } else {
                    L4: {
                      if (-1 >= (var2 ^ -1)) {
                        var3 = 127 & 1 + oa.field_a;
                        if (var3 == ee.field_e) {
                          break L4;
                        } else {
                          cm.field_a[oa.field_a] = var2;
                          pe.field_db[oa.field_a] = (char)0;
                          oa.field_a = var3;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3)) {
                        param0.consume();
                        break L5;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          break L5;
                        } else {
                          if (-11 != var2) {
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
            if (-1 >= var2) {
              var3 = 127 & 1 + oa.field_a;
              if (var3 == ee.field_e) {
                var3 = param0.getModifiers();
                if (-1 == (10 & var3)) {
                  if (var2 != 85) {
                    if (-11 == var2) {
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
                  cm.field_a[oa.field_a] = var2;
                  pe.field_db[oa.field_a] = (char)0;
                  oa.field_a = var3;
                  var3 = param0.getModifiers();
                  if (-1 != (10 & var3)) {
                    param0.consume();
                    break L6;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      break L6;
                    } else {
                      if (-11 != var2) {
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
                if (-1 != (10 & var3)) {
                  param0.consume();
                  break L7;
                } else {
                  if (var2 == 85) {
                    param0.consume();
                    break L7;
                  } else {
                    if (-11 != (var2 ^ -1)) {
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

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != nj.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (j.a(false, (char) var2)) {
                var3 = 1 + oa.field_a & 127;
                if (ee.field_e == var3) {
                  param0.consume();
                  return;
                } else {
                  cm.field_a[oa.field_a] = -1;
                  pe.field_db[oa.field_a] = (char)var2;
                  oa.field_a = var3;
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

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = HostileSpawn.field_I ? 1 : 0;
        boolean discarded$12 = im.field_e.a(ri.field_n, 8799, true, mf.field_b);
        im.field_e.e((byte) 114);
        L0: while (true) {
          if (!jn.e((byte) -79)) {
            if (dn.field_a == -1) {
              var1 = -20 / ((param0 - -42) / 36);
              if (!eh.field_e) {
                if (ti.field_b == ki.field_f) {
                  return 1;
                } else {
                  if (c.field_a.d((byte) -112)) {
                    if (ti.field_b == od.field_I) {
                      return 2;
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                }
              } else {
                return 3;
              }
            } else {
              var1 = dn.field_a;
              g.a((byte) 122, -1);
              return var1;
            }
          } else {
            boolean discarded$13 = im.field_e.a(pj.field_e, aj.field_e, 80);
            continue L0;
          }
        }
    }

    final static ue a(int param0, byte param1, fd param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        ue var7 = null;
        java.awt.Frame var8 = null;
        var8 = g.a(param4, param3, (byte) 30, param2, param5, param0);
        var6 = var8;
        if (var8 != null) {
          var7 = new ue();
          var7.field_i = var8;
          java.awt.Component discarded$8 = var7.field_i.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param0, param4);
          if (param1 >= -32) {
            field_f = null;
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          } else {
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 > -98) {
            field_e = null;
            hn.field_b = param1;
            qh.field_s = param2;
            return;
        }
        hn.field_b = param1;
        qh.field_s = param2;
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_k = null;
        int var1 = -81 % ((param0 - 68) / 37);
        field_a = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_j = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Login: ";
        field_e = "Open in popup window";
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_k = "Destroy the reactor to stop more spawn entering the base, then get back to the lift.";
        field_a = "Charges planted: ";
    }
}
