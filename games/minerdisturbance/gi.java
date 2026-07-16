/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static int field_c;
    static ea field_a;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (di.field_O != null) {
          L0: {
            hb.field_b = 0;
            var2 = param0.getKeyCode();
            if (0 > var2) {
              var2 = -1;
              break L0;
            } else {
              if (d.field_d.length > var2) {
                var2 = d.field_d[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if ((cg.field_H ^ -1) <= -1) {
                  if (-1 >= (var2 ^ -1)) {
                    L1: {
                      ib.field_b[cg.field_H] = var2 ^ -1;
                      cg.field_H = 127 & 1 + cg.field_H;
                      if ((dm.field_b ^ -1) == (cg.field_H ^ -1)) {
                        cg.field_H = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    param0.consume();
                    return;
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
          L2: {
            if ((cg.field_H ^ -1) > -1) {
              break L2;
            } else {
              if (-1 < (var2 ^ -1)) {
                break L2;
              } else {
                ib.field_b[cg.field_H] = var2 ^ -1;
                cg.field_H = 127 & 1 + cg.field_H;
                if ((dm.field_b ^ -1) == (cg.field_H ^ -1)) {
                  cg.field_H = -1;
                  break L2;
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          }
          param0.consume();
          return;
        } else {
          param0.consume();
          return;
        }
    }

    final static void a(int param0, int param1) {
        pi var2 = null;
        int var3 = 0;
        hf var4 = null;
        var3 = MinerDisturbance.field_ab;
        var4 = (hf) (Object) kk.field_a.b(96);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 85) {
              var2 = ag.field_b.b(param0 + -8);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  ca.a(param1, 1);
                  var2 = ag.field_b.b((byte) 56);
                  continue L1;
                }
              }
            } else {
              gi.a(-40, 0);
              var2 = ag.field_b.b(param0 + -8);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  ca.a(param1, 1);
                  var2 = ag.field_b.b((byte) 56);
                  continue L2;
                }
              }
            }
          } else {
            ag.a(var4, param1, param0 + -195);
            var4 = (hf) (Object) kk.field_a.b((byte) 56);
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != di.field_O) {
            cg.field_H = -1;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != di.field_O) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (var2 != 65535) {
              if (bn.a(93, (char) var2)) {
                var3 = 127 & 1 + qf.field_n;
                if (var3 == dn.field_w) {
                  param0.consume();
                  return;
                } else {
                  jk.field_ib[qf.field_n] = -1;
                  hj.field_n[qf.field_n] = (char)var2;
                  qf.field_n = var3;
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

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != di.field_O) {
          hb.field_b = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            if ((d.field_d.length ^ -1) < (var2 ^ -1)) {
              var2 = d.field_d[var2];
              if ((128 & var2) != 0) {
                L0: {
                  var2 = -1;
                  if (0 > cg.field_H) {
                    break L0;
                  } else {
                    if (-1 < (var2 ^ -1)) {
                      break L0;
                    } else {
                      ib.field_b[cg.field_H] = var2;
                      cg.field_H = 127 & cg.field_H - -1;
                      if ((cg.field_H ^ -1) != (dm.field_b ^ -1)) {
                        break L0;
                      } else {
                        L1: {
                          cg.field_H = -1;
                          if (0 <= var2) {
                            var3 = qf.field_n - -1 & 127;
                            if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                              break L1;
                            } else {
                              jk.field_ib[qf.field_n] = var2;
                              hj.field_n[qf.field_n] = (char)0;
                              qf.field_n = var3;
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            return;
                          } else {
                            if ((var2 ^ -1) == -11) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (0 <= var2) {
                  var3 = qf.field_n - -1 & 127;
                  if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    jk.field_ib[qf.field_n] = var2;
                    hj.field_n[qf.field_n] = (char)0;
                    qf.field_n = var3;
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
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
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -11) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L2: {
                  if (0 > cg.field_H) {
                    break L2;
                  } else {
                    if (-1 < (var2 ^ -1)) {
                      break L2;
                    } else {
                      ib.field_b[cg.field_H] = var2;
                      cg.field_H = 127 & cg.field_H - -1;
                      if ((cg.field_H ^ -1) != (dm.field_b ^ -1)) {
                        break L2;
                      } else {
                        cg.field_H = -1;
                        break L2;
                      }
                    }
                  }
                }
                if (0 <= var2) {
                  var3 = qf.field_n - -1 & 127;
                  if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    jk.field_ib[qf.field_n] = var2;
                    hj.field_n[qf.field_n] = (char)0;
                    qf.field_n = var3;
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
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
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -11) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              L3: {
                var2 = -1;
                if (0 > cg.field_H) {
                  break L3;
                } else {
                  if (-1 < (var2 ^ -1)) {
                    break L3;
                  } else {
                    ib.field_b[cg.field_H] = var2;
                    cg.field_H = 127 & cg.field_H - -1;
                    if ((cg.field_H ^ -1) != (dm.field_b ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        cg.field_H = -1;
                        if (0 <= var2) {
                          var3 = qf.field_n - -1 & 127;
                          if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                            break L4;
                          } else {
                            jk.field_ib[qf.field_n] = var2;
                            hj.field_n[qf.field_n] = (char)0;
                            qf.field_n = var3;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -11) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (0 <= var2) {
                var3 = qf.field_n - -1 & 127;
                if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -11) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  jk.field_ib[qf.field_n] = var2;
                  hj.field_n[qf.field_n] = (char)0;
                  qf.field_n = var3;
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -11) {
                        param0.consume();
                        return;
                      } else {
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
                  if (var2 == 85) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -11) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              var2 = -1;
              if (0 > cg.field_H) {
                break L5;
              } else {
                if (-1 < (var2 ^ -1)) {
                  break L5;
                } else {
                  ib.field_b[cg.field_H] = var2;
                  cg.field_H = 127 & cg.field_H - -1;
                  if ((cg.field_H ^ -1) != (dm.field_b ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      cg.field_H = -1;
                      if (0 <= var2) {
                        var3 = qf.field_n - -1 & 127;
                        if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                          break L6;
                        } else {
                          jk.field_ib[qf.field_n] = var2;
                          hj.field_n[qf.field_n] = (char)0;
                          qf.field_n = var3;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (0 <= var2) {
              var3 = qf.field_n - -1 & 127;
              if ((var3 ^ -1) == (dn.field_w ^ -1)) {
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  return;
                } else {
                  if (var2 == 85) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -11) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                jk.field_ib[qf.field_n] = var2;
                hj.field_n[qf.field_n] = (char)0;
                qf.field_n = var3;
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  return;
                } else {
                  if (var2 == 85) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -11) {
                      param0.consume();
                      return;
                    } else {
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
                if (var2 == 85) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -11) {
                    param0.consume();
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "2x multiplier: Doubles all points. Combines with 3x muliplier to make a 6x multiplier!";
    }
}
