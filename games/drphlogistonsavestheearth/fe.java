/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static String field_b;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (ji.field_c != null) {
            gm.field_O = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ji.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (ka.a((char) var2, 8192)) {
                var3 = 1 + jc.field_j & 127;
                if (var3 != rc.field_g) {
                  ac.field_f[jc.field_j] = -1;
                  na.field_a[jc.field_j] = (char)var2;
                  jc.field_j = var3;
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

    public static void a(byte param0) {
        if (param0 <= 116) {
            field_a = 14;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ji.field_c) {
          dk.field_c = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            L0: {
              if (d.field_d.length > var2) {
                var2 = d.field_d[var2];
                if ((var2 & 128) == 0) {
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
            if (-1 >= (gm.field_O ^ -1)) {
              L1: {
                if ((var2 ^ -1) <= -1) {
                  qk.field_f[gm.field_O] = var2;
                  gm.field_O = 127 & gm.field_O + 1;
                  if (b.field_l == gm.field_O) {
                    gm.field_O = -1;
                    break L1;
                  } else {
                    L2: {
                      if ((var2 ^ -1) <= -1) {
                        var3 = 127 & jc.field_j - -1;
                        if (rc.field_g != var3) {
                          ac.field_f[jc.field_j] = var2;
                          na.field_a[jc.field_j] = (char)0;
                          jc.field_j = var3;
                          break L2;
                        } else {
                          L3: {
                            var3 = param0.getModifiers();
                            if ((10 & var3) != 0) {
                              param0.consume();
                              break L3;
                            } else {
                              if (-86 == (var2 ^ -1)) {
                                param0.consume();
                                break L3;
                              } else {
                                if ((var2 ^ -1) != -11) {
                                  break L3;
                                } else {
                                  param0.consume();
                                  break L3;
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        break L2;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((10 & var3) == 0) {
                      if (-86 != (var2 ^ -1)) {
                        if ((var2 ^ -1) != -11) {
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
                  break L1;
                }
              }
              if (var2 <= -1) {
                var3 = 127 & jc.field_j - -1;
                if (rc.field_g == var3) {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (-86 != (var2 ^ -1)) {
                      if ((var2 ^ -1) == -11) {
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
                } else {
                  ac.field_f[jc.field_j] = var2;
                  na.field_a[jc.field_j] = (char)0;
                  jc.field_j = var3;
                  var3 = param0.getModifiers();
                  if ((10 & var3) == 0) {
                    if (-86 != (var2 ^ -1)) {
                      if ((var2 ^ -1) == -11) {
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
                if ((10 & var3) == 0) {
                  if (-86 != var2) {
                    if ((var2 ^ -1) != -11) {
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
              if (var2 <= -1) {
                var3 = 127 & jc.field_j - -1;
                if (rc.field_g == var3) {
                  var3 = param0.getModifiers();
                  if ((10 & var3) == 0) {
                    if (-86 != (var2 ^ -1)) {
                      if ((var2 ^ -1) == -11) {
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
                  L4: {
                    ac.field_f[jc.field_j] = var2;
                    na.field_a[jc.field_j] = (char)0;
                    jc.field_j = var3;
                    var3 = param0.getModifiers();
                    if ((10 & var3) != 0) {
                      param0.consume();
                      break L4;
                    } else {
                      if (-86 == (var2 ^ -1)) {
                        param0.consume();
                        break L4;
                      } else {
                        if ((var2 ^ -1) != -11) {
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
                  if ((10 & var3) != 0) {
                    param0.consume();
                    break L5;
                  } else {
                    if (-86 == var2) {
                      param0.consume();
                      break L5;
                    } else {
                      if ((var2 ^ -1) != -11) {
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
              var2 = -1;
              if (-1 < (gm.field_O ^ -1)) {
                break L6;
              } else {
                if ((var2 ^ -1) <= -1) {
                  qk.field_f[gm.field_O] = var2;
                  gm.field_O = 127 & gm.field_O + 1;
                  if (b.field_l == gm.field_O) {
                    gm.field_O = -1;
                    break L6;
                  } else {
                    L7: {
                      if ((var2 ^ -1) <= -1) {
                        var3 = 127 & jc.field_j - -1;
                        if (rc.field_g == var3) {
                          break L7;
                        } else {
                          ac.field_f[jc.field_j] = var2;
                          na.field_a[jc.field_j] = (char)0;
                          jc.field_j = var3;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var3 = param0.getModifiers();
                      if ((10 & var3) != 0) {
                        param0.consume();
                        break L8;
                      } else {
                        if (-86 == (var2 ^ -1)) {
                          param0.consume();
                          break L8;
                        } else {
                          if ((var2 ^ -1) != -11) {
                            break L8;
                          } else {
                            param0.consume();
                            break L8;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  break L6;
                }
              }
            }
            if (var2 <= -1) {
              var3 = 127 & jc.field_j - -1;
              if (rc.field_g == var3) {
                var3 = param0.getModifiers();
                if ((10 & var3) == 0) {
                  if (-86 != (var2 ^ -1)) {
                    if ((var2 ^ -1) == -11) {
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
                L9: {
                  ac.field_f[jc.field_j] = var2;
                  na.field_a[jc.field_j] = (char)0;
                  jc.field_j = var3;
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    break L9;
                  } else {
                    if (-86 == (var2 ^ -1)) {
                      param0.consume();
                      break L9;
                    } else {
                      if ((var2 ^ -1) != -11) {
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
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  break L10;
                } else {
                  if (-86 == var2) {
                    param0.consume();
                    break L10;
                  } else {
                    if ((var2 ^ -1) != -11) {
                      break L10;
                    } else {
                      param0.consume();
                      break L10;
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

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != ji.field_c) {
          L0: {
            dk.field_c = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (d.field_d.length > var2) {
                var2 = d.field_d[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (gm.field_O >= 0) {
                  if (var2 >= 0) {
                    qk.field_f[gm.field_O] = var2 ^ -1;
                    gm.field_O = gm.field_O + 1 & 127;
                    if (b.field_l != gm.field_O) {
                      param0.consume();
                      return;
                    } else {
                      gm.field_O = -1;
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
          if (gm.field_O >= 0) {
            if (var2 >= 0) {
              qk.field_f[gm.field_O] = var2 ^ -1;
              gm.field_O = gm.field_O + 1 & 127;
              if (b.field_l == gm.field_O) {
                gm.field_O = -1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Return to game";
    }
}
