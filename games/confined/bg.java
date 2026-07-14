/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static pf field_b;
    static int field_f;
    static e field_g;
    static jb field_a;
    static kc field_d;
    static nf field_c;

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 175) {
          if (160 != param1) {
            if (param1 != 32) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = bg.a(-126, 'ﾻ');
          if (160 != param1) {
            if (param1 != 32) {
              if (95 != param1) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != tf.field_p) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (nd.a((char) var2, (byte) -18)) {
                var3 = oe.field_W - -1 & 127;
                if (ic.field_b == var3) {
                  param0.consume();
                  return;
                } else {
                  ke.field_P[oe.field_W] = -1;
                  mk.field_n[oe.field_W] = (char)var2;
                  oe.field_W = var3;
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
        if (param0 != 12398) {
            return 114;
        }
        return (int)(1000000000L / ij.field_u);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != tf.field_p) {
          cg.field_d = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            L0: {
              if (tj.field_z.length <= var2) {
                var2 = -1;
                break L0;
              } else {
                var2 = tj.field_z[var2];
                if (0 != (128 & var2)) {
                  var2 = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              if (ab.field_a < 0) {
                break L1;
              } else {
                if (-1 >= (var2 ^ -1)) {
                  on.field_f[ab.field_a] = var2;
                  ab.field_a = 127 & 1 + ab.field_a;
                  if (ab.field_a == mi.field_g) {
                    ab.field_a = -1;
                    break L1;
                  } else {
                    L2: {
                      if (var2 < 0) {
                        break L2;
                      } else {
                        var3 = 127 & 1 + oe.field_W;
                        if (ic.field_b == var3) {
                          break L2;
                        } else {
                          ke.field_P[oe.field_W] = var2;
                          mk.field_n[oe.field_W] = (char)0;
                          oe.field_W = var3;
                          break L2;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == -1) {
                      if (-86 != var2) {
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
                  if (var2 >= 0) {
                    var3 = 127 & 1 + oe.field_W;
                    if (ic.field_b == var3) {
                      L3: {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != -1) {
                          param0.consume();
                          break L3;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            break L3;
                          } else {
                            if (10 != var2) {
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
                        ke.field_P[oe.field_W] = var2;
                        mk.field_n[oe.field_W] = (char)0;
                        oe.field_W = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != -1) {
                          param0.consume();
                          break L4;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            break L4;
                          } else {
                            if (10 != var2) {
                              break L4;
                            } else {
                              param0.consume();
                              break L4;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L5: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        break L5;
                      } else {
                        if (-86 == var2) {
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
            L6: {
              if (var2 < 0) {
                break L6;
              } else {
                var3 = 127 & 1 + oe.field_W;
                if (ic.field_b == var3) {
                  break L6;
                } else {
                  ke.field_P[oe.field_W] = var2;
                  mk.field_n[oe.field_W] = (char)0;
                  oe.field_W = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == -1) {
                    if (-86 != var2) {
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
            }
            var3 = param0.getModifiers();
            if ((var3 & 10) == -1) {
              if (-86 != var2) {
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
            L7: {
              var2 = -1;
              if (ab.field_a < 0) {
                break L7;
              } else {
                if (-1 <= var2) {
                  on.field_f[ab.field_a] = var2;
                  ab.field_a = 127 & 1 + ab.field_a;
                  if (ab.field_a == mi.field_g) {
                    ab.field_a = -1;
                    break L7;
                  } else {
                    L8: {
                      if (var2 < 0) {
                        break L8;
                      } else {
                        var3 = 127 & 1 + oe.field_W;
                        if (ic.field_b == var3) {
                          break L8;
                        } else {
                          ke.field_P[oe.field_W] = var2;
                          mk.field_n[oe.field_W] = (char)0;
                          oe.field_W = var3;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != -1) {
                        param0.consume();
                        break L9;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          break L9;
                        } else {
                          if (10 != var2) {
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
                    if (var2 < 0) {
                      break L10;
                    } else {
                      var3 = 127 & 1 + oe.field_W;
                      if (ic.field_b == var3) {
                        break L10;
                      } else {
                        ke.field_P[oe.field_W] = var2;
                        mk.field_n[oe.field_W] = (char)0;
                        oe.field_W = var3;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != -1) {
                      param0.consume();
                      break L11;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        break L11;
                      } else {
                        if (10 != var2) {
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
              if (var2 < 0) {
                break L12;
              } else {
                var3 = 127 & 1 + oe.field_W;
                if (ic.field_b == var3) {
                  break L12;
                } else {
                  L13: {
                    ke.field_P[oe.field_W] = var2;
                    mk.field_n[oe.field_W] = (char)0;
                    oe.field_W = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != -1) {
                      param0.consume();
                      break L13;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        break L13;
                      } else {
                        if (10 != var2) {
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
            if ((var3 & 10) == -1) {
              if (-86 != var2) {
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
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (tf.field_p != null) {
          L0: {
            cg.field_d = 0;
            var2 = param0.getKeyCode();
            if (0 > var2) {
              var2 = -1;
              break L0;
            } else {
              if (tj.field_z.length > var2) {
                var2 = tj.field_z[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (-1 >= (ab.field_a ^ -1)) {
                  if (0 <= var2) {
                    on.field_f[ab.field_a] = var2 ^ -1;
                    ab.field_a = 1 + ab.field_a & 127;
                    if (mi.field_g == ab.field_a) {
                      ab.field_a = -1;
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
              }
            }
          }
          if (-1 >= (ab.field_a ^ -1)) {
            if (0 <= var2) {
              on.field_f[ab.field_a] = var2 ^ -1;
              ab.field_a = 1 + ab.field_a & 127;
              if (mi.field_g == ab.field_a) {
                ab.field_a = -1;
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

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 >= -45) {
          boolean discarded$2 = bg.a(104, '');
          field_e = null;
          field_c = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != tf.field_p) {
            ab.field_a = -1;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Invalid password.";
        field_g = new e(12, 0, 1, 0);
        field_c = new nf(270, 70);
    }
}
