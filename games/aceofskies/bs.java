/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bs implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static pa[] field_b;
    static jb field_a;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ua.field_d != null) {
          he.field_n = 0;
          var2 = param0.getKeyCode();
          if (var2 <= -1) {
            if (var2 < so.field_d.length) {
              var2 = so.field_d[var2];
              if (0 != (var2 & 128)) {
                L0: {
                  var2 = -1;
                  if (-1 < fb.field_a) {
                    break L0;
                  } else {
                    if (-1 > var2) {
                      break L0;
                    } else {
                      da.field_b[fb.field_a] = var2;
                      fb.field_a = 127 & fb.field_a + 1;
                      if (fb.field_a != gr.field_h) {
                        break L0;
                      } else {
                        L1: {
                          fb.field_a = -1;
                          if (var2 >= 0) {
                            var3 = 127 & 1 + nl.field_w;
                            if (var3 == ch.field_a) {
                              break L1;
                            } else {
                              ps.field_e[nl.field_w] = var2;
                              qb.field_o[nl.field_w] = (char)0;
                              nl.field_w = var3;
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((10 & var3) != -1) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            return;
                          } else {
                            if (-11 == var2) {
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
                if (var2 >= 0) {
                  var3 = 127 & 1 + nl.field_w;
                  if (var3 == ch.field_a) {
                    var3 = param0.getModifiers();
                    if ((10 & var3) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    ps.field_e[nl.field_w] = var2;
                    qb.field_o[nl.field_w] = (char)0;
                    nl.field_w = var3;
                    var3 = param0.getModifiers();
                    if ((10 & var3) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 == var2) {
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
                  if ((10 & var3) != -1) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == var2) {
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
                  if (-1 < fb.field_a) {
                    break L2;
                  } else {
                    if (-1 > var2) {
                      break L2;
                    } else {
                      da.field_b[fb.field_a] = var2;
                      fb.field_a = 127 & fb.field_a + 1;
                      if (fb.field_a != gr.field_h) {
                        break L2;
                      } else {
                        fb.field_a = -1;
                        break L2;
                      }
                    }
                  }
                }
                if (var2 >= 0) {
                  var3 = 127 & 1 + nl.field_w;
                  if (var3 == ch.field_a) {
                    var3 = param0.getModifiers();
                    if ((10 & var3) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    ps.field_e[nl.field_w] = var2;
                    qb.field_o[nl.field_w] = (char)0;
                    nl.field_w = var3;
                    var3 = param0.getModifiers();
                    if ((10 & var3) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (-11 == var2) {
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
                  if ((10 & var3) != -1) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == var2) {
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
                if (-1 < fb.field_a) {
                  break L3;
                } else {
                  if (-1 > var2) {
                    break L3;
                  } else {
                    da.field_b[fb.field_a] = var2;
                    fb.field_a = 127 & fb.field_a + 1;
                    if (fb.field_a != gr.field_h) {
                      break L3;
                    } else {
                      L4: {
                        fb.field_a = -1;
                        if (var2 >= 0) {
                          var3 = 127 & 1 + nl.field_w;
                          if (var3 == ch.field_a) {
                            break L4;
                          } else {
                            ps.field_e[nl.field_w] = var2;
                            qb.field_o[nl.field_w] = (char)0;
                            nl.field_w = var3;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((10 & var3) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 != 85) {
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
                  }
                }
              }
              if (var2 >= 0) {
                var3 = 127 & 1 + nl.field_w;
                if (var3 == ch.field_a) {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != -1) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  ps.field_e[nl.field_w] = var2;
                  qb.field_o[nl.field_w] = (char)0;
                  nl.field_w = var3;
                  var3 = param0.getModifiers();
                  if ((10 & var3) != -1) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (-11 == var2) {
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
                if ((10 & var3) != -1) {
                  param0.consume();
                  return;
                } else {
                  if (var2 != 85) {
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
            }
          } else {
            L5: {
              var2 = -1;
              if (-1 > fb.field_a) {
                break L5;
              } else {
                if (-1 < (var2 ^ -1)) {
                  break L5;
                } else {
                  da.field_b[fb.field_a] = var2;
                  fb.field_a = 127 & fb.field_a + 1;
                  if (fb.field_a != gr.field_h) {
                    break L5;
                  } else {
                    L6: {
                      fb.field_a = -1;
                      if (var2 >= 0) {
                        var3 = 127 & 1 + nl.field_w;
                        if (var3 == ch.field_a) {
                          break L6;
                        } else {
                          ps.field_e[nl.field_w] = var2;
                          qb.field_o[nl.field_w] = (char)0;
                          nl.field_w = var3;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((10 & var3) == -1) {
                      if (var2 != 85) {
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
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
            }
            if (var2 >= 0) {
              var3 = 127 & 1 + nl.field_w;
              if (var3 == ch.field_a) {
                var3 = param0.getModifiers();
                if ((10 & var3) == -1) {
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
                ps.field_e[nl.field_w] = var2;
                qb.field_o[nl.field_w] = (char)0;
                nl.field_w = var3;
                var3 = param0.getModifiers();
                if ((10 & var3) == -1) {
                  if (var2 != 85) {
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
                } else {
                  param0.consume();
                  return;
                }
              }
            } else {
              var3 = param0.getModifiers();
              if ((10 & var3) == -1) {
                if (var2 != 85) {
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
              } else {
                param0.consume();
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static ll[] a(int param0, boolean param1) {
        ll[] var2 = null;
        ll[] var3 = null;
        var3 = new ll[9];
        var2 = var3;
        var3[4] = tn.a(param0, 64, true);
        if (param1) {
          field_b = (pa[]) null;
          return var2;
        } else {
          return var2;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != ua.field_d) {
          he.field_n = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            if (var2 < so.field_d.length) {
              var2 = so.field_d[var2] & -129;
              if (-1 >= (fb.field_a ^ -1)) {
                if (var2 >= 0) {
                  da.field_b[fb.field_a] = var2 ^ -1;
                  fb.field_a = fb.field_a - -1 & 127;
                  if (fb.field_a == gr.field_h) {
                    fb.field_a = -1;
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
              if (-1 >= (fb.field_a ^ -1)) {
                if (var2 >= 0) {
                  da.field_b[fb.field_a] = var2 ^ -1;
                  fb.field_a = fb.field_a - -1 & 127;
                  if (fb.field_a == gr.field_h) {
                    fb.field_a = -1;
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
          } else {
            var2 = -1;
            if (-1 <= fb.field_a) {
              if (var2 >= 0) {
                da.field_b[fb.field_a] = var2 ^ -1;
                fb.field_a = fb.field_a - -1 & 127;
                if (fb.field_a == gr.field_h) {
                  fb.field_a = -1;
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
        } else {
          param0.consume();
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 127) {
            field_a = (jb) null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != ua.field_d) {
            fb.field_a = -1;
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if ((param2 ^ -1) < param0) {
          if (mg.a(param2, (byte) -20)) {
            return (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> -68849632);
          } else {
            var3 = -2147483648 + -(int)(4294967296L % (long)param2);
            L0: while (true) {
              var4 = param1.nextInt();
              if (var4 < var3) {
                return qg.a((byte) 119, param2, var4);
              } else {
                continue L0;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ua.field_d != null) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (var2 != 65535) {
              if (mr.a((char) var2, 2004352972)) {
                var3 = 1 + nl.field_w & 127;
                if (var3 == ch.field_a) {
                  param0.consume();
                  return;
                } else {
                  ps.field_e[nl.field_w] = -1;
                  qb.field_o[nl.field_w] = (char)var2;
                  nl.field_w = var3;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jb();
    }
}
