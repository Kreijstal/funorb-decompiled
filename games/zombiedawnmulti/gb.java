/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_d;
    static db field_c;
    static cj field_a;
    static th field_e;
    static byte[][][] field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (um.field_c != null) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (var2 != 65535) {
              if (am.a((char) var2, (byte) 91)) {
                var3 = f.field_c + 1 & 127;
                if (var3 == lp.field_j) {
                  param0.consume();
                  return;
                } else {
                  td.field_a[f.field_c] = -1;
                  ta.field_pb[f.field_c] = (char)var2;
                  f.field_c = var3;
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
        L0: {
          if (um.field_c != null) {
            em.field_cb = 0;
            var2 = param0.getKeyCode();
            if (0 <= var2) {
              if (ud.field_V.length > var2) {
                L1: {
                  var2 = ud.field_V[var2];
                  if (-1 != (128 & var2)) {
                    var2 = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (-1 <= qf.field_f) {
                  if (0 <= var2) {
                    ln.field_f[qf.field_f] = var2;
                    qf.field_f = 127 & 1 + qf.field_f;
                    if (fh.field_j != qf.field_f) {
                      if (-1 <= var2) {
                        var3 = 127 & f.field_c + 1;
                        if (var3 != lp.field_j) {
                          td.field_a[f.field_c] = var2;
                          ta.field_pb[f.field_c] = (char)0;
                          f.field_c = var3;
                          var3 = param0.getModifiers();
                          if (0 != (var3 & 10)) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 85) {
                              param0.consume();
                              return;
                            } else {
                              if (-11 != (var2 ^ -1)) {
                                break L0;
                              } else {
                                param0.consume();
                                return;
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
                              if (-11 != (var2 ^ -1)) {
                                return;
                              } else {
                                param0.consume();
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
                            if (-11 != (var2 ^ -1)) {
                              return;
                            } else {
                              param0.consume();
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L2: {
                        qf.field_f = -1;
                        if (-1 >= (var2 ^ -1)) {
                          var3 = 127 & f.field_c + 1;
                          if (var3 != lp.field_j) {
                            td.field_a[f.field_c] = var2;
                            ta.field_pb[f.field_c] = (char)0;
                            f.field_c = var3;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          break L3;
                        } else {
                          if (var2 == 85) {
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
                    if (-1 <= var2) {
                      var3 = 127 & f.field_c + 1;
                      if (var3 != lp.field_j) {
                        td.field_a[f.field_c] = var2;
                        ta.field_pb[f.field_c] = (char)0;
                        f.field_c = var3;
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            return;
                          } else {
                            if (-11 != (var2 ^ -1)) {
                              return;
                            } else {
                              param0.consume();
                              return;
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
                            if (-11 != (var2 ^ -1)) {
                              return;
                            } else {
                              param0.consume();
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
                  }
                } else {
                  if (-1 >= var2) {
                    var3 = 127 & f.field_c + 1;
                    if (var3 != lp.field_j) {
                      td.field_a[f.field_c] = var2;
                      ta.field_pb[f.field_c] = (char)0;
                      f.field_c = var3;
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
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
                      }
                    } else {
                      var3 = param0.getModifiers();
                      if (0 == (var3 & 10)) {
                        if (var2 != 85) {
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
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if (0 == (var3 & 10)) {
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
                  }
                }
              } else {
                L4: {
                  var2 = -1;
                  if (-1 < (qf.field_f ^ -1)) {
                    break L4;
                  } else {
                    if (0 > var2) {
                      break L4;
                    } else {
                      ln.field_f[qf.field_f] = var2;
                      qf.field_f = 127 & 1 + qf.field_f;
                      if (fh.field_j != qf.field_f) {
                        break L4;
                      } else {
                        L5: {
                          qf.field_f = -1;
                          if (-1 >= (var2 ^ -1)) {
                            var3 = 127 & f.field_c + 1;
                            if (var3 != lp.field_j) {
                              td.field_a[f.field_c] = var2;
                              ta.field_pb[f.field_c] = (char)0;
                              f.field_c = var3;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          var3 = param0.getModifiers();
                          if (0 != (var3 & 10)) {
                            param0.consume();
                            break L6;
                          } else {
                            if (var2 == 85) {
                              param0.consume();
                              break L6;
                            } else {
                              if (-11 != var2) {
                                break L6;
                              } else {
                                param0.consume();
                                break L6;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (-1 <= var2) {
                  var3 = 127 & f.field_c + 1;
                  if (var3 != lp.field_j) {
                    td.field_a[f.field_c] = var2;
                    ta.field_pb[f.field_c] = (char)0;
                    f.field_c = var3;
                    var3 = param0.getModifiers();
                    if (0 == (var3 & 10)) {
                      if (var2 != 85) {
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
                    } else {
                      param0.consume();
                      return;
                    }
                  } else {
                    L7: {
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        break L7;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          break L7;
                        } else {
                          if (-11 != (var2 ^ -1)) {
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
                  L8: {
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      break L8;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        break L8;
                      } else {
                        if (-11 != (var2 ^ -1)) {
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
              }
            } else {
              L9: {
                var2 = -1;
                if (-1 < (qf.field_f ^ -1)) {
                  break L9;
                } else {
                  if (0 > var2) {
                    break L9;
                  } else {
                    ln.field_f[qf.field_f] = var2;
                    qf.field_f = 127 & 1 + qf.field_f;
                    if (fh.field_j != qf.field_f) {
                      break L9;
                    } else {
                      L10: {
                        qf.field_f = -1;
                        if (-1 >= (var2 ^ -1)) {
                          var3 = 127 & f.field_c + 1;
                          if (var3 != lp.field_j) {
                            td.field_a[f.field_c] = var2;
                            ta.field_pb[f.field_c] = (char)0;
                            f.field_c = var3;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          break L11;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            break L11;
                          } else {
                            if (-11 != var2) {
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
              }
              if (-1 <= var2) {
                var3 = 127 & f.field_c + 1;
                if (var3 != lp.field_j) {
                  td.field_a[f.field_c] = var2;
                  ta.field_pb[f.field_c] = (char)0;
                  f.field_c = var3;
                  var3 = param0.getModifiers();
                  if (0 == (var3 & 10)) {
                    if (var2 != 85) {
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
                  } else {
                    param0.consume();
                    return;
                  }
                } else {
                  L12: {
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      break L12;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        break L12;
                      } else {
                        if (-11 != (var2 ^ -1)) {
                          break L12;
                        } else {
                          param0.consume();
                          break L12;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  var3 = param0.getModifiers();
                  if (0 != (var3 & 10)) {
                    param0.consume();
                    break L13;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      break L13;
                    } else {
                      if (-11 != (var2 ^ -1)) {
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
          } else {
            break L0;
          }
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != um.field_c) {
          em.field_cb = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            if (var2 < ud.field_V.length) {
              var2 = -129 & ud.field_V[var2];
              if (-1 >= qf.field_f) {
                if (-1 <= var2) {
                  ln.field_f[qf.field_f] = var2 ^ -1;
                  qf.field_f = 1 + qf.field_f & 127;
                  if (fh.field_j == qf.field_f) {
                    qf.field_f = -1;
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
              if (-1 < qf.field_f) {
                param0.consume();
                return;
              } else {
                if (-1 <= var2) {
                  ln.field_f[qf.field_f] = var2 ^ -1;
                  qf.field_f = 1 + qf.field_f & 127;
                  if (fh.field_j == qf.field_f) {
                    qf.field_f = -1;
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
            if (-1 > qf.field_f) {
              param0.consume();
              return;
            } else {
              if (-1 >= (var2 ^ -1)) {
                ln.field_f[qf.field_f] = var2 ^ -1;
                qf.field_f = 1 + qf.field_f & 127;
                if (fh.field_j == qf.field_f) {
                  qf.field_f = -1;
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

    public static void b(int param0) {
        field_a = null;
        if (param0 <= 96) {
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = 0;
        oo.f(param1, param0, param3, param2, 0, 96);
        var5 = 3;
        oo.i(var5, var5, param1, param0, param3, param2);
        if (param4 != 122) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 250) {
            return true;
        }
        return f.field_a > 250 ? true : false;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(um.field_c == null)) {
            qf.field_f = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No players";
        field_c = new db();
        field_e = new th();
    }
}
