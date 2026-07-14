/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sf field_b;
    static int field_c;
    static String field_d;
    static String field_e;
    static int[] field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != i.field_J) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (hi.a((char) var2, (byte) 70)) {
                var3 = 127 & rh.field_e + 1;
                if (var3 == pf.field_a) {
                  param0.consume();
                  return;
                } else {
                  lb.field_V[rh.field_e] = -1;
                  r.field_g[rh.field_e] = (char)var2;
                  rh.field_e = var3;
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

    final static ff[] a(int param0) {
        if (param0 > -63) {
          field_b = null;
          return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
        } else {
          return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != i.field_J) {
          L0: {
            lf.field_c = 0;
            var2 = param0.getKeyCode();
            if (var2 > -1) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < sg.field_b.length) {
                var2 = -129 & sg.field_b[var2];
                break L0;
              } else {
                var2 = -1;
                if (-1 <= fg.field_b) {
                  if ((var2 ^ -1) <= -1) {
                    ci.field_qb[fg.field_b] = var2 ^ -1;
                    fg.field_b = 127 & fg.field_b + 1;
                    if (fg.field_b != qd.field_d) {
                      param0.consume();
                      return;
                    } else {
                      fg.field_b = -1;
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
          if (-1 >= (fg.field_b ^ -1)) {
            if ((var2 ^ -1) <= -1) {
              ci.field_qb[fg.field_b] = var2 ^ -1;
              fg.field_b = 127 & fg.field_b + 1;
              if (fg.field_b != qd.field_d) {
                param0.consume();
                return;
              } else {
                fg.field_b = -1;
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
        if (i.field_J != null) {
          lf.field_c = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            L0: {
              if (sg.field_b.length > var2) {
                var2 = sg.field_b[var2];
                if ((128 & var2) == 0) {
                  break L0;
                } else {
                  var2 = -1;
                  break L0;
                }
              } else {
                var2 = -1;
                break L0;
              }
            }
            if (fg.field_b <= -1) {
              if (var2 >= 0) {
                ci.field_qb[fg.field_b] = var2;
                fg.field_b = fg.field_b + 1 & 127;
                if (qd.field_d != fg.field_b) {
                  L1: {
                    if (-1 < (var2 ^ -1)) {
                      break L1;
                    } else {
                      var3 = 127 & 1 + rh.field_e;
                      if (var3 == pf.field_a) {
                        break L1;
                      } else {
                        lb.field_V[rh.field_e] = var2;
                        r.field_g[rh.field_e] = (char)0;
                        rh.field_e = var3;
                        var3 = param0.getModifiers();
                        if (-1 != (10 & var3 ^ -1)) {
                          param0.consume();
                          return;
                        } else {
                          if (85 != var2) {
                            if (var2 == 10) {
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
                  }
                  var3 = param0.getModifiers();
                  if (-1 != (10 & var3 ^ -1)) {
                    param0.consume();
                    return;
                  } else {
                    if (85 != var2) {
                      if (var2 != 10) {
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
                } else {
                  L2: {
                    fg.field_b = -1;
                    if (-1 < (var2 ^ -1)) {
                      break L2;
                    } else {
                      var3 = 127 & 1 + rh.field_e;
                      if (var3 == pf.field_a) {
                        break L2;
                      } else {
                        lb.field_V[rh.field_e] = var2;
                        r.field_g[rh.field_e] = (char)0;
                        rh.field_e = var3;
                        break L2;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if (-1 == (10 & var3 ^ -1)) {
                    if (85 != var2) {
                      if (var2 == 10) {
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
                if (-1 < var2) {
                  L3: {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3)) {
                      param0.consume();
                      break L3;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L3;
                      } else {
                        if (var2 != 10) {
                          break L3;
                        } else {
                          param0.consume();
                          break L3;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L4: {
                    var3 = 127 & 1 + rh.field_e;
                    if (var3 == pf.field_a) {
                      break L4;
                    } else {
                      lb.field_V[rh.field_e] = var2;
                      r.field_g[rh.field_e] = (char)0;
                      rh.field_e = var3;
                      break L4;
                    }
                  }
                  L5: {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3 ^ -1)) {
                      param0.consume();
                      break L5;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L5;
                      } else {
                        if (var2 != 10) {
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
            } else {
              L6: {
                if (-1 > var2) {
                  break L6;
                } else {
                  var3 = 127 & 1 + rh.field_e;
                  if (var3 == pf.field_a) {
                    break L6;
                  } else {
                    lb.field_V[rh.field_e] = var2;
                    r.field_g[rh.field_e] = (char)0;
                    rh.field_e = var3;
                    var3 = param0.getModifiers();
                    if (-1 == (10 & var3 ^ -1)) {
                      if (85 != var2) {
                        if (var2 == 10) {
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
              }
              var3 = param0.getModifiers();
              if (-1 == (10 & var3 ^ -1)) {
                if (85 != var2) {
                  if (var2 == 10) {
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
            L7: {
              var2 = -1;
              if (fg.field_b > -1) {
                break L7;
              } else {
                if (var2 >= 0) {
                  ci.field_qb[fg.field_b] = var2;
                  fg.field_b = fg.field_b + 1 & 127;
                  if (qd.field_d != fg.field_b) {
                    break L7;
                  } else {
                    L8: {
                      fg.field_b = -1;
                      if (-1 < (var2 ^ -1)) {
                        break L8;
                      } else {
                        var3 = 127 & 1 + rh.field_e;
                        if (var3 == pf.field_a) {
                          break L8;
                        } else {
                          lb.field_V[rh.field_e] = var2;
                          r.field_g[rh.field_e] = (char)0;
                          rh.field_e = var3;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3 ^ -1)) {
                        param0.consume();
                        break L9;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          break L9;
                        } else {
                          if (var2 != 10) {
                            break L9;
                          } else {
                            param0.consume();
                            break L9;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    if (-1 > var2) {
                      break L10;
                    } else {
                      var3 = 127 & 1 + rh.field_e;
                      if (var3 == pf.field_a) {
                        break L10;
                      } else {
                        lb.field_V[rh.field_e] = var2;
                        r.field_g[rh.field_e] = (char)0;
                        rh.field_e = var3;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3 ^ -1)) {
                      param0.consume();
                      break L11;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L11;
                      } else {
                        if (var2 != 10) {
                          break L11;
                        } else {
                          param0.consume();
                          break L11;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            L12: {
              if (-1 < (var2 ^ -1)) {
                break L12;
              } else {
                var3 = 127 & 1 + rh.field_e;
                if (var3 == pf.field_a) {
                  break L12;
                } else {
                  L13: {
                    lb.field_V[rh.field_e] = var2;
                    r.field_g[rh.field_e] = (char)0;
                    rh.field_e = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3 ^ -1)) {
                      param0.consume();
                      break L13;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L13;
                      } else {
                        if (var2 != 10) {
                          break L13;
                        } else {
                          param0.consume();
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            var3 = param0.getModifiers();
            if (-1 == (10 & var3 ^ -1)) {
              if (85 != var2) {
                if (var2 == 10) {
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
          return;
        }
    }

    final static java.awt.Container a(byte param0) {
        if (null != oc.field_a) {
          return (java.awt.Container) (Object) oc.field_a;
        } else {
          if (param0 != 60) {
            field_e = null;
            return (java.awt.Container) (Object) ia.g(param0 ^ 99);
          } else {
            return (java.awt.Container) (Object) ia.g(param0 ^ 99);
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == i.field_J)) {
            fg.field_b = -1;
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        if (param3 == 8) {
          L0: {
            var4 = 0;
            if (param0) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1) {
            L1: {
              var4 += 2;
              if (param2) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return ua.field_M[var4];
          } else {
            L2: {
              if (param2) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return ua.field_M[var4];
          }
        } else {
          L3: {
            field_c = -10;
            var4 = 0;
            if (param0) {
              var4 += 4;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            L4: {
              if (param2) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return ua.field_M[var4];
          } else {
            L5: {
              var4 += 2;
              if (param2) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return ua.field_M[var4];
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 1) {
          ff[] discarded$2 = qh.a(-19);
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please enter your age in years";
        field_d = "Your email address is used to identify this account";
        field_a = new int[]{100, 200, 350, 500, 700, 900, 1150, 1300};
    }
}
