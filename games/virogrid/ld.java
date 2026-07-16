/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_h;
    static String field_g;
    static String field_a;
    static String field_f;
    static boolean field_c;
    static km field_b;
    static String field_e;
    static int field_d;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(w.field_L == null)) {
            ch.field_f = -1;
        }
    }

    final static int a(byte param0, int param1, boolean param2, String param3, String param4, String param5, int param6) {
        uh var7 = new uh(param3);
        uh var8 = new uh(param4);
        if (param0 != 2) {
            field_c = false;
        }
        return wh.a(param6, param2, param1, true, param5, var7, var8);
    }

    final static void a(int param0) {
        ij.field_k = new km(0L, (km) null);
        if (ql.field_d) {
          ij.field_k.a(0, qd.field_f);
          ij.field_k.a(0, ij.field_m);
          dd.field_b = new jm(fj.field_a, ij.field_k);
          fd.field_y = new km(0L, (km) null);
          fd.field_y.a(0, (km) (Object) dd.field_b.field_c);
          fd.field_y.a(param0, s.field_b);
          id.b(param0 + -105);
          return;
        } else {
          ij.field_k.a(0, ij.field_m);
          dd.field_b = new jm(fj.field_a, ij.field_k);
          fd.field_y = new km(0L, (km) null);
          fd.field_y.a(0, (km) (Object) dd.field_b.field_c);
          fd.field_y.a(param0, s.field_b);
          id.b(param0 + -105);
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (w.field_L != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (hc.a((char) var2, -1)) {
                var3 = 127 & hh.field_e + 1;
                if (var3 != ph.field_h) {
                  cj.field_o[hh.field_e] = -1;
                  hg.field_q[hh.field_e] = (char)var2;
                  hh.field_e = var3;
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
        int var1 = 64 / ((15 - param0) / 44);
        field_g = null;
        field_h = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != w.field_L) {
          L0: {
            um.field_Fb = 0;
            var2 = param0.getKeyCode();
            if (-1 < (var2 ^ -1)) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < wd.field_c.length) {
                var2 = -129 & wd.field_c[var2];
                break L0;
              } else {
                var2 = -1;
                if (ch.field_f >= 0) {
                  if (0 <= var2) {
                    ab.field_H[ch.field_f] = var2 ^ -1;
                    ch.field_f = ch.field_f - -1 & 127;
                    if (ch.field_f != bf.field_i) {
                      param0.consume();
                      return;
                    } else {
                      ch.field_f = -1;
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
          if (ch.field_f >= 0) {
            if (0 <= var2) {
              ab.field_H[ch.field_f] = var2 ^ -1;
              ch.field_f = ch.field_f - -1 & 127;
              if (ch.field_f != bf.field_i) {
                param0.consume();
                return;
              } else {
                ch.field_f = -1;
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

    final static void a(int param0, int param1, int param2, wg param3) {
        if (param0 != -1) {
            ld.a((byte) -63);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (w.field_L == null) {
          return;
        } else {
          um.field_Fb = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            if (wd.field_c.length > var2) {
              var2 = wd.field_c[var2];
              if (-1 == (128 & var2 ^ -1)) {
                if (ch.field_f >= 0) {
                  if (0 <= var2) {
                    ab.field_H[ch.field_f] = var2;
                    ch.field_f = 1 + ch.field_f & 127;
                    if (bf.field_i != ch.field_f) {
                      if (var2 >= 0) {
                        var3 = 1 + hh.field_e & 127;
                        if (ph.field_h != var3) {
                          cj.field_o[hh.field_e] = var2;
                          hg.field_q[hh.field_e] = (char)0;
                          hh.field_e = var3;
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
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
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
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
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
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
                      ch.field_f = -1;
                      if (var2 >= 0) {
                        var3 = 1 + hh.field_e & 127;
                        if (ph.field_h != var3) {
                          cj.field_o[hh.field_e] = var2;
                          hg.field_q[hh.field_e] = (char)0;
                          hh.field_e = var3;
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
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
                          var3 = param0.getModifiers();
                          if (0 != (10 & var3)) {
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
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
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
                  } else {
                    if (var2 >= 0) {
                      var3 = 1 + hh.field_e & 127;
                      if (ph.field_h != var3) {
                        cj.field_o[hh.field_e] = var2;
                        hg.field_q[hh.field_e] = (char)0;
                        hh.field_e = var3;
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
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
                        var3 = param0.getModifiers();
                        if (0 != (10 & var3)) {
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
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
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
                } else {
                  if (var2 >= 0) {
                    var3 = 1 + hh.field_e & 127;
                    if (ph.field_h != var3) {
                      cj.field_o[hh.field_e] = var2;
                      hg.field_q[hh.field_e] = (char)0;
                      hh.field_e = var3;
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
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
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
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
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
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
              } else {
                L0: {
                  var2 = -1;
                  if (ch.field_f < 0) {
                    break L0;
                  } else {
                    if (0 > var2) {
                      break L0;
                    } else {
                      ab.field_H[ch.field_f] = var2;
                      ch.field_f = 1 + ch.field_f & 127;
                      if (bf.field_i != ch.field_f) {
                        break L0;
                      } else {
                        L1: {
                          ch.field_f = -1;
                          if (var2 >= 0) {
                            var3 = 1 + hh.field_e & 127;
                            if (ph.field_h != var3) {
                              cj.field_o[hh.field_e] = var2;
                              hg.field_q[hh.field_e] = (char)0;
                              hh.field_e = var3;
                              break L1;
                            } else {
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
                if (var2 >= 0) {
                  var3 = 1 + hh.field_e & 127;
                  if (ph.field_h != var3) {
                    cj.field_o[hh.field_e] = var2;
                    hg.field_q[hh.field_e] = (char)0;
                    hh.field_e = var3;
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
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
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
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
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
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
            } else {
              L2: {
                var2 = -1;
                if (ch.field_f < 0) {
                  break L2;
                } else {
                  if (0 > var2) {
                    break L2;
                  } else {
                    ab.field_H[ch.field_f] = var2;
                    ch.field_f = 1 + ch.field_f & 127;
                    if (bf.field_i != ch.field_f) {
                      break L2;
                    } else {
                      L3: {
                        ch.field_f = -1;
                        if (var2 >= 0) {
                          var3 = 1 + hh.field_e & 127;
                          if (ph.field_h != var3) {
                            cj.field_o[hh.field_e] = var2;
                            hg.field_q[hh.field_e] = (char)0;
                            hh.field_e = var3;
                            break L3;
                          } else {
                            var3 = param0.getModifiers();
                            if (0 != (10 & var3)) {
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
                          break L3;
                        }
                      }
                      var3 = param0.getModifiers();
                      if (0 != (10 & var3)) {
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
              if (var2 >= 0) {
                var3 = 1 + hh.field_e & 127;
                if (ph.field_h != var3) {
                  cj.field_o[hh.field_e] = var2;
                  hg.field_q[hh.field_e] = (char)0;
                  hh.field_e = var3;
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
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
                  var3 = param0.getModifiers();
                  if (0 != (10 & var3)) {
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
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
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
          } else {
            L4: {
              var2 = -1;
              if (ch.field_f < 0) {
                break L4;
              } else {
                if (0 > var2) {
                  break L4;
                } else {
                  ab.field_H[ch.field_f] = var2;
                  ch.field_f = 1 + ch.field_f & 127;
                  if (bf.field_i != ch.field_f) {
                    break L4;
                  } else {
                    L5: {
                      ch.field_f = -1;
                      if (var2 >= 0) {
                        var3 = 1 + hh.field_e & 127;
                        if (ph.field_h != var3) {
                          cj.field_o[hh.field_e] = var2;
                          hg.field_q[hh.field_e] = (char)0;
                          hh.field_e = var3;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var3 = param0.getModifiers();
                    if (0 != (10 & var3)) {
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
            if (var2 >= 0) {
              var3 = 1 + hh.field_e & 127;
              if (ph.field_h != var3) {
                cj.field_o[hh.field_e] = var2;
                hg.field_q[hh.field_e] = (char)0;
                hh.field_e = var3;
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
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
                var3 = param0.getModifiers();
                if (0 != (10 & var3)) {
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
              var3 = param0.getModifiers();
              if (0 != (10 & var3)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[8192];
        field_f = "3D";
        field_a = "Encouraging rule breaking";
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
