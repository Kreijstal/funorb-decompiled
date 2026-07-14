/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dl[] field_b;
    static long field_d;
    static int[] field_e;
    static int[] field_a;
    static int field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != uf.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (pn.a(true, (char) var2)) {
                var3 = 127 & ei.field_A - -1;
                if (var3 != td.field_d) {
                  re.field_o[ei.field_A] = -1;
                  tp.field_i[ei.field_A] = (char)var2;
                  ei.field_A = var3;
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
        if (uf.field_c != null) {
            bo.field_n = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != uf.field_c) {
          L0: {
            jf.field_a = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (rg.field_a.length > var2) {
                var2 = rg.field_a[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (bo.field_n >= 0) {
                  if (0 <= var2) {
                    pl.field_n[bo.field_n] = var2 ^ -1;
                    bo.field_n = 127 & bo.field_n - -1;
                    if (bo.field_n != ud.field_Z) {
                      param0.consume();
                      return;
                    } else {
                      bo.field_n = -1;
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
          if (bo.field_n >= 0) {
            if (0 <= var2) {
              pl.field_n[bo.field_n] = var2 ^ -1;
              bo.field_n = 127 & bo.field_n - -1;
              if (bo.field_n == ud.field_Z) {
                bo.field_n = -1;
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
          } else {
            param0.consume();
            return;
          }
        } else {
          param0.consume();
          return;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (uf.field_c != null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == -1) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    vf.a((byte) -2);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) uf.field_c;
                    // monitorenter uf.field_c
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        uf.field_c = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (param0 == -1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    vf.a((byte) -2);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (uf.field_c != null) {
          jf.field_a = 0;
          var2 = param0.getKeyCode();
          if (-1 >= (var2 ^ -1)) {
            if (rg.field_a.length > var2) {
              L0: {
                var2 = rg.field_a[var2];
                if ((var2 & 128) == 0) {
                  break L0;
                } else {
                  var2 = -1;
                  break L0;
                }
              }
              if (0 <= bo.field_n) {
                if (var2 >= 0) {
                  pl.field_n[bo.field_n] = var2;
                  bo.field_n = 127 & bo.field_n + 1;
                  if (ud.field_Z == bo.field_n) {
                    bo.field_n = -1;
                    if (var2 >= 0) {
                      var3 = ei.field_A + 1 & 127;
                      if (var3 == td.field_d) {
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        re.field_o[ei.field_A] = var2;
                        tp.field_i[ei.field_A] = (char)0;
                        ei.field_A = var3;
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (var2 >= 0) {
                      var3 = ei.field_A + 1 & 127;
                      if (var3 == td.field_d) {
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        re.field_o[ei.field_A] = var2;
                        tp.field_i[ei.field_A] = (char)0;
                        ei.field_A = var3;
                        var3 = param0.getModifiers();
                        if (-1 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
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
                  if (var2 >= 0) {
                    var3 = ei.field_A + 1 & 127;
                    if (var3 == td.field_d) {
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      re.field_o[ei.field_A] = var2;
                      tp.field_i[ei.field_A] = (char)0;
                      ei.field_A = var3;
                      var3 = param0.getModifiers();
                      if (-1 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
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
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                if (var2 >= 0) {
                  var3 = ei.field_A + 1 & 127;
                  if (var3 == td.field_d) {
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    re.field_o[ei.field_A] = var2;
                    tp.field_i[ei.field_A] = (char)0;
                    ei.field_A = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                  if (-1 != (var3 & 10)) {
                    param0.consume();
                    return;
                  } else {
                    if (-86 != var2) {
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
                }
              }
            } else {
              var2 = -1;
              if (0 <= bo.field_n) {
                L1: {
                  if (var2 >= 0) {
                    pl.field_n[bo.field_n] = var2;
                    bo.field_n = 127 & bo.field_n + 1;
                    if (ud.field_Z != bo.field_n) {
                      break L1;
                    } else {
                      bo.field_n = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (var2 >= 0) {
                  var3 = ei.field_A + 1 & 127;
                  if (var3 == td.field_d) {
                    var3 = param0.getModifiers();
                    if (-1 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 != var2) {
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
                    re.field_o[ei.field_A] = var2;
                    tp.field_i[ei.field_A] = (char)0;
                    ei.field_A = var3;
                    var3 = param0.getModifiers();
                    if (-1 == (var3 & 10)) {
                      if (-86 != var2) {
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
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if (-1 == (var3 & 10)) {
                    if (-86 != var2) {
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
                  } else {
                    param0.consume();
                    return;
                  }
                }
              } else {
                L2: {
                  if (var2 >= 0) {
                    var3 = ei.field_A + 1 & 127;
                    if (var3 == td.field_d) {
                      break L2;
                    } else {
                      re.field_o[ei.field_A] = var2;
                      tp.field_i[ei.field_A] = (char)0;
                      ei.field_A = var3;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var3 = param0.getModifiers();
                if (-1 == (var3 & 10)) {
                  if (-86 != var2) {
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
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          } else {
            L3: {
              var2 = -1;
              if (0 > bo.field_n) {
                break L3;
              } else {
                if (var2 >= 0) {
                  pl.field_n[bo.field_n] = var2;
                  bo.field_n = 127 & bo.field_n + 1;
                  if (ud.field_Z != bo.field_n) {
                    break L3;
                  } else {
                    bo.field_n = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var2 >= 0) {
                var3 = ei.field_A + 1 & 127;
                if (var3 == td.field_d) {
                  break L4;
                } else {
                  re.field_o[ei.field_A] = var2;
                  tp.field_i[ei.field_A] = (char)0;
                  ei.field_A = var3;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            var3 = param0.getModifiers();
            if (-1 == (var3 & 10)) {
              if (-86 != var2) {
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
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        mc.field_s = param3;
        if (param1 <= 113) {
            return;
        }
        jn.field_i = param2;
        ao.field_e = param0;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -117) {
            vf.a(-34);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 70;
        field_a = new int[]{0, 12, 24, 36, 0, 12, 24, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_e = new int[8192];
    }
}
