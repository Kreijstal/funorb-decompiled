/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static cd field_a;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        if (param0 < -121) {
          var6 = ci.a(param1, (byte) -79);
          if (-1 == param2.indexOf(param1)) {
            if ((param2.indexOf(var6) ^ -1) == 0) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var6)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var6)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var4 = null;
          bi.a((byte) -69, (java.awt.Component) null);
          var5 = ci.a(param1, (byte) -79);
          var3 = var5;
          if (-1 == param2.indexOf(param1)) {
            if ((param2.indexOf(var5) ^ -1) == 0) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var5)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var5)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            bi.a((byte) 12, (java.awt.Component) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (ol.field_l != null) {
          tb.field_b = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            L0: {
              if (var2 >= vc.field_K.length) {
                var2 = -1;
                break L0;
              } else {
                var2 = vc.field_K[var2] & -129;
                break L0;
              }
            }
            if (0 <= vg.field_b) {
              if (var2 >= 0) {
                ji.field_e[vg.field_b] = var2 ^ -1;
                vg.field_b = vg.field_b - -1 & 127;
                if (ud.field_a != vg.field_b) {
                  param0.consume();
                  return;
                } else {
                  vg.field_b = -1;
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
            var2 = -1;
            if (0 <= vg.field_b) {
              if (var2 >= 0) {
                ji.field_e[vg.field_b] = var2 ^ -1;
                vg.field_b = vg.field_b - -1 & 127;
                if (ud.field_a != vg.field_b) {
                  param0.consume();
                  return;
                } else {
                  vg.field_b = -1;
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
          param0.consume();
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        if (ol.field_l == null) {
            param0.consume();
            return;
        }
        int var2 = param0.getKeyChar();
        if (0 == var2) {
            param0.consume();
            return;
        }
        if (var2 == 65535) {
            param0.consume();
            return;
        }
        if (!rf.a((byte) -10, (char) var2)) {
            param0.consume();
            return;
        }
        int var3 = Lexicominos.field_G + 1 & 127;
        if (tj.field_h == var3) {
            param0.consume();
            return;
        }
        gj.field_x[Lexicominos.field_G] = -1;
        ok.field_q[Lexicominos.field_G] = (char)var2;
        Lexicominos.field_G = var3;
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) hh.field_M);
        if (param0 != 104) {
          field_a = null;
          param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
          return;
        } else {
          param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hh.field_M);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) hh.field_M);
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != ol.field_l) {
            vg.field_b = -1;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ol.field_l != null) {
          tb.field_b = 0;
          var2 = param0.getKeyCode();
          if (var2 < 0) {
            L0: {
              var2 = -1;
              if (0 > vg.field_b) {
                break L0;
              } else {
                if (-1 < (var2 ^ -1)) {
                  break L0;
                } else {
                  ji.field_e[vg.field_b] = var2;
                  vg.field_b = 1 + vg.field_b & 127;
                  if (ud.field_a == vg.field_b) {
                    vg.field_b = -1;
                    break L0;
                  } else {
                    L1: {
                      if (var2 >= 0) {
                        var3 = 127 & 1 + Lexicominos.field_G;
                        if (tj.field_h == var3) {
                          break L1;
                        } else {
                          gj.field_x[Lexicominos.field_G] = var2;
                          ok.field_q[Lexicominos.field_G] = (char)0;
                          Lexicominos.field_G = var3;
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 != 85) {
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
                    }
                  }
                }
              }
            }
            if (var2 >= 0) {
              var3 = 127 & 1 + Lexicominos.field_G;
              if (tj.field_h == var3) {
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
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
                gj.field_x[Lexicominos.field_G] = var2;
                ok.field_q[Lexicominos.field_G] = (char)0;
                Lexicominos.field_G = var3;
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
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
              if (0 != (var3 & 10)) {
                param0.consume();
                return;
              } else {
                if (var2 != 85) {
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
              }
            }
          } else {
            if (vc.field_K.length > var2) {
              L2: {
                var2 = vc.field_K[var2];
                if (-1 == (128 & var2 ^ -1)) {
                  break L2;
                } else {
                  var2 = -1;
                  break L2;
                }
              }
              if (0 <= vg.field_b) {
                if (-1 <= var2) {
                  ji.field_e[vg.field_b] = var2;
                  vg.field_b = 1 + vg.field_b & 127;
                  if (ud.field_a == vg.field_b) {
                    vg.field_b = -1;
                    if (var2 >= 0) {
                      var3 = 127 & 1 + Lexicominos.field_G;
                      if (tj.field_h == var3) {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
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
                        gj.field_x[Lexicominos.field_G] = var2;
                        ok.field_q[Lexicominos.field_G] = (char)0;
                        Lexicominos.field_G = var3;
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
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
                      if (0 != (var3 & 10)) {
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
                    if (var2 >= 0) {
                      var3 = 127 & 1 + Lexicominos.field_G;
                      if (tj.field_h == var3) {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
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
                        gj.field_x[Lexicominos.field_G] = var2;
                        ok.field_q[Lexicominos.field_G] = (char)0;
                        Lexicominos.field_G = var3;
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
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
                      if (0 != (var3 & 10)) {
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
                  if (var2 >= 0) {
                    var3 = 127 & 1 + Lexicominos.field_G;
                    if (tj.field_h == var3) {
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
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
                      gj.field_x[Lexicominos.field_G] = var2;
                      ok.field_q[Lexicominos.field_G] = (char)0;
                      Lexicominos.field_G = var3;
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
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
                    if (0 != (var3 & 10)) {
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
                if (var2 >= 0) {
                  var3 = 127 & 1 + Lexicominos.field_G;
                  if (tj.field_h == var3) {
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == -11) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    gj.field_x[Lexicominos.field_G] = var2;
                    ok.field_q[Lexicominos.field_G] = (char)0;
                    Lexicominos.field_G = var3;
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
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
                  if (0 != (var3 & 10)) {
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
              var2 = -1;
              if (0 <= vg.field_b) {
                if (-1 <= var2) {
                  L3: {
                    ji.field_e[vg.field_b] = var2;
                    vg.field_b = 1 + vg.field_b & 127;
                    if (ud.field_a == vg.field_b) {
                      vg.field_b = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var2 >= 0) {
                      var3 = 127 & 1 + Lexicominos.field_G;
                      if (tj.field_h == var3) {
                        break L4;
                      } else {
                        gj.field_x[Lexicominos.field_G] = var2;
                        ok.field_q[Lexicominos.field_G] = (char)0;
                        Lexicominos.field_G = var3;
                        var3 = param0.getModifiers();
                        if (0 == (var3 & 10)) {
                          if (var2 != 85) {
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
                      break L4;
                    }
                  }
                  var3 = param0.getModifiers();
                  if (0 == (var3 & 10)) {
                    if (var2 != 85) {
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
                } else {
                  L5: {
                    if (var2 >= 0) {
                      var3 = 127 & 1 + Lexicominos.field_G;
                      if (tj.field_h == var3) {
                        break L5;
                      } else {
                        gj.field_x[Lexicominos.field_G] = var2;
                        ok.field_q[Lexicominos.field_G] = (char)0;
                        Lexicominos.field_G = var3;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var3 = param0.getModifiers();
                  if (0 == (var3 & 10)) {
                    if (var2 != 85) {
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
                L6: {
                  if (var2 >= 0) {
                    var3 = 127 & 1 + Lexicominos.field_G;
                    if (tj.field_h == var3) {
                      break L6;
                    } else {
                      gj.field_x[Lexicominos.field_G] = var2;
                      ok.field_q[Lexicominos.field_G] = (char)0;
                      Lexicominos.field_G = var3;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var3 = param0.getModifiers();
                if (0 == (var3 & 10)) {
                  if (var2 != 85) {
                    if (var2 != -11) {
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
        } else {
          return;
        }
    }

    static {
    }
}
