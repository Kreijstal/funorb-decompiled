/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static int field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != sj.field_d) {
          mh.field_b = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            L0: {
              if (var2 < mi.field_c.length) {
                var2 = mi.field_c[var2];
                if (0 == (var2 & 128)) {
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
            if (-1 >= bg.field_rb) {
              L1: {
                if ((var2 ^ -1) <= -1) {
                  oc.field_h[bg.field_rb] = var2;
                  bg.field_rb = 1 + bg.field_rb & 127;
                  if (field_b == bg.field_rb) {
                    bg.field_rb = -1;
                    break L1;
                  } else {
                    if ((var2 ^ -1) <= -1) {
                      var3 = 1 + sa.field_b & 127;
                      if (ab.field_t == var3) {
                        L2: {
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
                            param0.consume();
                            break L2;
                          } else {
                            if (-86 == var2) {
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
                      } else {
                        db.field_c[sa.field_b] = var2;
                        e.field_b[sa.field_b] = (char)0;
                        sa.field_b = var3;
                        L3: {
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
                            param0.consume();
                            break L3;
                          } else {
                            if (-86 == var2) {
                              param0.consume();
                              break L3;
                            } else {
                              if (-11 != var2) {
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
                      L4: {
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
                          param0.consume();
                          break L4;
                        } else {
                          if (-86 == var2) {
                            param0.consume();
                            break L4;
                          } else {
                            if (-11 != var2) {
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
                  }
                } else {
                  break L1;
                }
              }
              if (var2 <= -1) {
                var3 = 1 + sa.field_b & 127;
                if (ab.field_t == var3) {
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if (-86 == var2) {
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
                  db.field_c[sa.field_b] = var2;
                  e.field_b[sa.field_b] = (char)0;
                  sa.field_b = var3;
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    return;
                  } else {
                    if (-86 != var2) {
                      if (-11 != var2) {
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
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  return;
                } else {
                  if (-86 != var2) {
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
            } else {
              if (var2 <= -1) {
                var3 = 1 + sa.field_b & 127;
                if (ab.field_t == var3) {
                  var3 = param0.getModifiers();
                  if (0 == (10 & var3)) {
                    if (-86 != var2) {
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
                  db.field_c[sa.field_b] = var2;
                  e.field_b[sa.field_b] = (char)0;
                  sa.field_b = var3;
                  var3 = param0.getModifiers();
                  if (0 == (10 & var3)) {
                    if (-86 != var2) {
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
                if (0 == (10 & var3)) {
                  if (-86 != var2) {
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
            L5: {
              var2 = -1;
              if (-1 > bg.field_rb) {
                break L5;
              } else {
                if ((var2 ^ -1) <= -1) {
                  oc.field_h[bg.field_rb] = var2;
                  bg.field_rb = 1 + bg.field_rb & 127;
                  if (field_b == bg.field_rb) {
                    bg.field_rb = -1;
                    break L5;
                  } else {
                    L6: {
                      if ((var2 ^ -1) <= -1) {
                        var3 = 1 + sa.field_b & 127;
                        if (ab.field_t == var3) {
                          break L6;
                        } else {
                          db.field_c[sa.field_b] = var2;
                          e.field_b[sa.field_b] = (char)0;
                          sa.field_b = var3;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
                        param0.consume();
                        break L7;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          break L7;
                        } else {
                          if (-11 != var2) {
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
                } else {
                  break L5;
                }
              }
            }
            if (var2 <= -1) {
              var3 = 1 + sa.field_b & 127;
              if (ab.field_t == var3) {
                var3 = param0.getModifiers();
                if (0 == (10 & var3)) {
                  if (-86 != var2) {
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
                L8: {
                  db.field_c[sa.field_b] = var2;
                  e.field_b[sa.field_b] = (char)0;
                  sa.field_b = var3;
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
                    param0.consume();
                    break L8;
                  } else {
                    if (-86 == var2) {
                      param0.consume();
                      break L8;
                    } else {
                      if (-11 != var2) {
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
              L9: {
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
                  param0.consume();
                  break L9;
                } else {
                  if (-86 == var2) {
                    param0.consume();
                    break L9;
                  } else {
                    if (-11 != (var2 ^ -1)) {
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
          }
        } else {
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(sj.field_d == null)) {
            bg.field_rb = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (sj.field_d != null) {
          mh.field_b = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            if (mi.field_c.length > var2) {
              var2 = -129 & mi.field_c[var2];
              if (bg.field_rb >= 0) {
                if ((var2 ^ -1) <= -1) {
                  oc.field_h[bg.field_rb] = var2 ^ -1;
                  bg.field_rb = bg.field_rb + 1 & 127;
                  if (field_b == bg.field_rb) {
                    bg.field_rb = -1;
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
              var2 = -1;
              if (bg.field_rb < 0) {
                param0.consume();
                return;
              } else {
                if ((var2 ^ -1) <= -1) {
                  oc.field_h[bg.field_rb] = var2 ^ -1;
                  bg.field_rb = bg.field_rb + 1 & 127;
                  if (field_b == bg.field_rb) {
                    bg.field_rb = -1;
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
          } else {
            var2 = -1;
            if (bg.field_rb < 0) {
              param0.consume();
              return;
            } else {
              if ((var2 ^ -1) <= -1) {
                oc.field_h[bg.field_rb] = var2 ^ -1;
                bg.field_rb = bg.field_rb + 1 & 127;
                if (field_b == bg.field_rb) {
                  bg.field_rb = -1;
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
        } else {
          param0.consume();
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (sj.field_d != null) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (65535 != var2) {
              if (cg.a(111, (char) var2)) {
                var3 = sa.field_b - -1 & 127;
                if (var3 != ab.field_t) {
                  db.field_c[sa.field_b] = -1;
                  e.field_b[sa.field_b] = (char)var2;
                  sa.field_b = var3;
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

    final static void a(int param0, int param1) {
        ti.field_c = gf.field_h[param1];
        oe.field_d = ri.field_a[param1];
        int var2 = -109 / ((-56 - param0) / 40);
        fg.field_j = dg.field_I[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
