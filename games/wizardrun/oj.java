/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_b;
    static String field_a;
    static int field_c;
    static String field_d;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ff.field_H == null)) {
            wk.field_b = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ff.field_H != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (ne.a((char) var2, 160)) {
                var3 = qh.field_b + 1 & 127;
                if (tg.field_i == var3) {
                  param0.consume();
                  return;
                } else {
                  ge.field_n[qh.field_b] = -1;
                  ve.field_a[qh.field_b] = (char)var2;
                  qh.field_b = var3;
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
        field_d = null;
        field_a = null;
        if (param0 < 86) {
            field_a = null;
        }
    }

    final static void a(int param0, vf param1, int param2) {
        mg var3 = null;
        if (param2 >= -9) {
          field_a = null;
          var3 = n.field_b;
          var3.c((byte) -127, param0);
          var3.b((byte) 11, param1.field_k);
          var3.b(-1947079288, param1.field_i);
          return;
        } else {
          var3 = n.field_b;
          var3.c((byte) -127, param0);
          var3.b((byte) 11, param1.field_k);
          var3.b(-1947079288, param1.field_i);
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != ff.field_H) {
          L0: {
            h.field_p = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < he.field_s.length) {
                var2 = he.field_s[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (-1 >= (wk.field_b ^ -1)) {
                  if (-1 >= (var2 ^ -1)) {
                    wd.field_a[wk.field_b] = var2 ^ -1;
                    wk.field_b = 127 & wk.field_b - -1;
                    if (wk.field_b == lk.field_a) {
                      wk.field_b = -1;
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
          L1: {
            if (-1 < (wk.field_b ^ -1)) {
              break L1;
            } else {
              if (-1 >= (var2 ^ -1)) {
                wd.field_a[wk.field_b] = var2 ^ -1;
                wk.field_b = 127 & wk.field_b - -1;
                if (wk.field_b == lk.field_a) {
                  wk.field_b = -1;
                  break L1;
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
          param0.consume();
          return;
        } else {
          param0.consume();
          return;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ff.field_H != null) {
          h.field_p = 0;
          var2 = param0.getKeyCode();
          if (var2 < 0) {
            L0: {
              var2 = -1;
              if (-1 < (wk.field_b ^ -1)) {
                break L0;
              } else {
                if (var2 < 0) {
                  break L0;
                } else {
                  wd.field_a[wk.field_b] = var2;
                  wk.field_b = 1 + wk.field_b & 127;
                  if ((lk.field_a ^ -1) == (wk.field_b ^ -1)) {
                    wk.field_b = -1;
                    break L0;
                  } else {
                    L1: {
                      if ((var2 ^ -1) > -1) {
                        break L1;
                      } else {
                        var3 = 127 & qh.field_b + 1;
                        if (var3 == tg.field_i) {
                          break L1;
                        } else {
                          ge.field_n[qh.field_b] = var2;
                          ve.field_a[qh.field_b] = (char)0;
                          qh.field_b = var3;
                          break L1;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((10 & var3) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if ((var2 ^ -1) == -86) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 == (var2 ^ -1)) {
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
            L2: {
              if ((var2 ^ -1) > -1) {
                break L2;
              } else {
                var3 = 127 & qh.field_b + 1;
                if (var3 == tg.field_i) {
                  break L2;
                } else {
                  ge.field_n[qh.field_b] = var2;
                  ve.field_a[qh.field_b] = (char)0;
                  qh.field_b = var3;
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == (var2 ^ -1)) {
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
            var3 = param0.getModifiers();
            if ((10 & var3) != 0) {
              param0.consume();
              return;
            } else {
              if ((var2 ^ -1) == -86) {
                param0.consume();
                return;
              } else {
                if (-11 == (var2 ^ -1)) {
                  param0.consume();
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if ((var2 ^ -1) > (he.field_s.length ^ -1)) {
              var2 = he.field_s[var2];
              if (-1 != (var2 & 128 ^ -1)) {
                L3: {
                  var2 = -1;
                  if (-1 < (wk.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (var2 < 0) {
                      break L3;
                    } else {
                      wd.field_a[wk.field_b] = var2;
                      wk.field_b = 1 + wk.field_b & 127;
                      if ((lk.field_a ^ -1) == (wk.field_b ^ -1)) {
                        wk.field_b = -1;
                        break L3;
                      } else {
                        L4: {
                          if ((var2 ^ -1) > -1) {
                            break L4;
                          } else {
                            var3 = 127 & qh.field_b + 1;
                            if (var3 == tg.field_i) {
                              break L4;
                            } else {
                              ge.field_n[qh.field_b] = var2;
                              ve.field_a[qh.field_b] = (char)0;
                              qh.field_b = var3;
                              var3 = param0.getModifiers();
                              if ((10 & var3) != 0) {
                                param0.consume();
                                return;
                              } else {
                                if ((var2 ^ -1) == -86) {
                                  param0.consume();
                                  return;
                                } else {
                                  if (-11 == (var2 ^ -1)) {
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
                        var3 = param0.getModifiers();
                        if ((10 & var3) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (-11 == (var2 ^ -1)) {
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
                L5: {
                  if ((var2 ^ -1) > -1) {
                    break L5;
                  } else {
                    var3 = 127 & qh.field_b + 1;
                    if (var3 == tg.field_i) {
                      break L5;
                    } else {
                      ge.field_n[qh.field_b] = var2;
                      ve.field_a[qh.field_b] = (char)0;
                      qh.field_b = var3;
                      var3 = param0.getModifiers();
                      if ((10 & var3) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (-11 == (var2 ^ -1)) {
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
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -86) {
                    param0.consume();
                    return;
                  } else {
                    if (-11 == (var2 ^ -1)) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L6: {
                  if (-1 < (wk.field_b ^ -1)) {
                    break L6;
                  } else {
                    if (var2 < 0) {
                      break L6;
                    } else {
                      wd.field_a[wk.field_b] = var2;
                      wk.field_b = 1 + wk.field_b & 127;
                      if ((lk.field_a ^ -1) == (wk.field_b ^ -1)) {
                        wk.field_b = -1;
                        break L6;
                      } else {
                        L7: {
                          if ((var2 ^ -1) > -1) {
                            break L7;
                          } else {
                            var3 = 127 & qh.field_b + 1;
                            if (var3 == tg.field_i) {
                              break L7;
                            } else {
                              ge.field_n[qh.field_b] = var2;
                              ve.field_a[qh.field_b] = (char)0;
                              qh.field_b = var3;
                              break L7;
                            }
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((10 & var3) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (-11 == (var2 ^ -1)) {
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
                L8: {
                  if ((var2 ^ -1) > -1) {
                    break L8;
                  } else {
                    var3 = 127 & qh.field_b + 1;
                    if (var3 == tg.field_i) {
                      break L8;
                    } else {
                      ge.field_n[qh.field_b] = var2;
                      ve.field_a[qh.field_b] = (char)0;
                      qh.field_b = var3;
                      var3 = param0.getModifiers();
                      if ((10 & var3) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if ((var2 ^ -1) == -86) {
                          param0.consume();
                          return;
                        } else {
                          if (-11 == (var2 ^ -1)) {
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
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -86) {
                    param0.consume();
                    return;
                  } else {
                    if (-11 == (var2 ^ -1)) {
                      param0.consume();
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              var2 = -1;
              if (-1 >= (wk.field_b ^ -1)) {
                if (var2 >= 0) {
                  L9: {
                    wd.field_a[wk.field_b] = var2;
                    wk.field_b = 1 + wk.field_b & 127;
                    if ((lk.field_a ^ -1) == (wk.field_b ^ -1)) {
                      wk.field_b = -1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var2 ^ -1) > -1) {
                      break L10;
                    } else {
                      var3 = 127 & qh.field_b + 1;
                      if (var3 == tg.field_i) {
                        break L10;
                      } else {
                        ge.field_n[qh.field_b] = var2;
                        ve.field_a[qh.field_b] = (char)0;
                        qh.field_b = var3;
                        var3 = param0.getModifiers();
                        if ((10 & var3) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if ((var2 ^ -1) == -86) {
                            param0.consume();
                            return;
                          } else {
                            if (-11 == (var2 ^ -1)) {
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
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == (var2 ^ -1)) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L11: {
                    if ((var2 ^ -1) > -1) {
                      break L11;
                    } else {
                      var3 = 127 & qh.field_b + 1;
                      if (var3 == tg.field_i) {
                        break L11;
                      } else {
                        ge.field_n[qh.field_b] = var2;
                        ve.field_a[qh.field_b] = (char)0;
                        qh.field_b = var3;
                        break L11;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2 ^ -1) == -86) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == (var2 ^ -1)) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L12: {
                  if ((var2 ^ -1) > -1) {
                    break L12;
                  } else {
                    var3 = 127 & qh.field_b + 1;
                    if (var3 == tg.field_i) {
                      break L12;
                    } else {
                      ge.field_n[qh.field_b] = var2;
                      ve.field_a[qh.field_b] = (char)0;
                      qh.field_b = var3;
                      break L12;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if ((10 & var3) != 0) {
                  param0.consume();
                  return;
                } else {
                  if ((var2 ^ -1) == -86) {
                    param0.consume();
                    return;
                  } else {
                    if (-11 == (var2 ^ -1)) {
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
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Level only availiable to members";
        field_d = "Name is available";
    }
}
