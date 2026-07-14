/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static hj[] field_d;
    static int field_a;
    static int[] field_c;
    static byte[][] field_b;

    public static void c(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 < 9) {
            field_a = 6;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ad.field_b == null)) {
            wg.field_p = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (ad.field_b != null) {
          ji.field_c = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            if (nd.field_a.length > var2) {
              var2 = nd.field_a[var2] & -129;
              if ((wg.field_p ^ -1) <= -1) {
                if (var2 >= 0) {
                  gl.field_i[wg.field_p] = var2 ^ -1;
                  wg.field_p = 1 + wg.field_p & 127;
                  if (al.field_b == wg.field_p) {
                    wg.field_p = -1;
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
              if ((wg.field_p ^ -1) <= -1) {
                if (var2 >= 0) {
                  gl.field_i[wg.field_p] = var2 ^ -1;
                  wg.field_p = 1 + wg.field_p & 127;
                  if (al.field_b == wg.field_p) {
                    wg.field_p = -1;
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
            if ((wg.field_p ^ -1) <= -1) {
              if (var2 >= 0) {
                gl.field_i[wg.field_p] = var2 ^ -1;
                wg.field_p = 1 + wg.field_p & 127;
                if (al.field_b != wg.field_p) {
                  param0.consume();
                  return;
                } else {
                  wg.field_p = -1;
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

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != ad.field_b) {
          ji.field_c = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (nd.field_a.length > var2) {
              var2 = nd.field_a[var2];
              if (-1 != (var2 & 128)) {
                var2 = -1;
                if (-1 <= wg.field_p) {
                  if (-1 <= var2) {
                    gl.field_i[wg.field_p] = var2;
                    wg.field_p = wg.field_p - -1 & 127;
                    if (al.field_b == wg.field_p) {
                      L0: {
                        wg.field_p = -1;
                        if ((var2 ^ -1) > -1) {
                          break L0;
                        } else {
                          var3 = 127 & 1 + uf.field_a;
                          if (var3 != md.field_g) {
                            g.field_g[uf.field_a] = var2;
                            ll.field_b[uf.field_a] = (char)0;
                            uf.field_a = var3;
                            break L0;
                          } else {
                            var3 = param0.getModifiers();
                            if ((10 & var3) != -1) {
                              param0.consume();
                              return;
                            } else {
                              if (-86 == var2) {
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
                      if ((10 & var3) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
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
                      L1: {
                        if ((var2 ^ -1) > -1) {
                          break L1;
                        } else {
                          var3 = 127 & 1 + uf.field_a;
                          if (var3 != md.field_g) {
                            g.field_g[uf.field_a] = var2;
                            ll.field_b[uf.field_a] = (char)0;
                            uf.field_a = var3;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((10 & var3) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
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
                    L2: {
                      if ((var2 ^ -1) > -1) {
                        break L2;
                      } else {
                        var3 = 127 & 1 + uf.field_a;
                        if (var3 != md.field_g) {
                          g.field_g[uf.field_a] = var2;
                          ll.field_b[uf.field_a] = (char)0;
                          uf.field_a = var3;
                          break L2;
                        } else {
                          var3 = param0.getModifiers();
                          if ((10 & var3) != -1) {
                            param0.consume();
                            return;
                          } else {
                            if (-86 == var2) {
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
                    if ((10 & var3) != -1) {
                      param0.consume();
                      return;
                    } else {
                      if (-86 == var2) {
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
                  L3: {
                    if ((var2 ^ -1) > -1) {
                      break L3;
                    } else {
                      var3 = 127 & 1 + uf.field_a;
                      if (var3 != md.field_g) {
                        g.field_g[uf.field_a] = var2;
                        ll.field_b[uf.field_a] = (char)0;
                        uf.field_a = var3;
                        break L3;
                      } else {
                        var3 = param0.getModifiers();
                        if ((10 & var3) != -1) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
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
                  if ((10 & var3) != -1) {
                    param0.consume();
                    return;
                  } else {
                    if (-86 == var2) {
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
                L4: {
                  if (-1 > wg.field_p) {
                    break L4;
                  } else {
                    if (-1 < (var2 ^ -1)) {
                      break L4;
                    } else {
                      gl.field_i[wg.field_p] = var2;
                      wg.field_p = wg.field_p - -1 & 127;
                      if (al.field_b == wg.field_p) {
                        wg.field_p = -1;
                        break L4;
                      } else {
                        L5: {
                          if ((var2 ^ -1) > -1) {
                            break L5;
                          } else {
                            var3 = 127 & 1 + uf.field_a;
                            if (var3 != md.field_g) {
                              g.field_g[uf.field_a] = var2;
                              ll.field_b[uf.field_a] = (char)0;
                              uf.field_a = var3;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((10 & var3) != -1) {
                          param0.consume();
                          return;
                        } else {
                          if (-86 == var2) {
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
                L6: {
                  if ((var2 ^ -1) > -1) {
                    break L6;
                  } else {
                    var3 = 127 & 1 + uf.field_a;
                    if (var3 != md.field_g) {
                      g.field_g[uf.field_a] = var2;
                      ll.field_b[uf.field_a] = (char)0;
                      uf.field_a = var3;
                      break L6;
                    } else {
                      var3 = param0.getModifiers();
                      if ((10 & var3) != -1) {
                        param0.consume();
                        return;
                      } else {
                        if (-86 == var2) {
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
                if ((10 & var3) != -1) {
                  param0.consume();
                  return;
                } else {
                  if (-86 == var2) {
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
              L7: {
                var2 = -1;
                if (-1 < wg.field_p) {
                  break L7;
                } else {
                  if (-1 > var2) {
                    break L7;
                  } else {
                    gl.field_i[wg.field_p] = var2;
                    wg.field_p = wg.field_p - -1 & 127;
                    if (al.field_b == wg.field_p) {
                      wg.field_p = -1;
                      break L7;
                    } else {
                      L8: {
                        if ((var2 ^ -1) > -1) {
                          break L8;
                        } else {
                          var3 = 127 & 1 + uf.field_a;
                          if (var3 != md.field_g) {
                            g.field_g[uf.field_a] = var2;
                            ll.field_b[uf.field_a] = (char)0;
                            uf.field_a = var3;
                            break L8;
                          } else {
                            var3 = param0.getModifiers();
                            if ((10 & var3) == -1) {
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
                            } else {
                              param0.consume();
                              return;
                            }
                          }
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((10 & var3) == -1) {
                        if (-86 != var2) {
                          if (-11 != (var2 ^ -1)) {
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
              L9: {
                if ((var2 ^ -1) > -1) {
                  break L9;
                } else {
                  var3 = 127 & 1 + uf.field_a;
                  if (var3 != md.field_g) {
                    g.field_g[uf.field_a] = var2;
                    ll.field_b[uf.field_a] = (char)0;
                    uf.field_a = var3;
                    break L9;
                  } else {
                    var3 = param0.getModifiers();
                    if ((10 & var3) != -1) {
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
                }
              }
              var3 = param0.getModifiers();
              if ((10 & var3) != -1) {
                param0.consume();
                return;
              } else {
                if (-86 == var2) {
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
            L10: {
              var2 = -1;
              if (-1 < wg.field_p) {
                break L10;
              } else {
                if (-1 > var2) {
                  break L10;
                } else {
                  gl.field_i[wg.field_p] = var2;
                  wg.field_p = wg.field_p - -1 & 127;
                  if (al.field_b == wg.field_p) {
                    wg.field_p = -1;
                    break L10;
                  } else {
                    L11: {
                      if ((var2 ^ -1) > -1) {
                        break L11;
                      } else {
                        var3 = 127 & 1 + uf.field_a;
                        if (var3 != md.field_g) {
                          g.field_g[uf.field_a] = var2;
                          ll.field_b[uf.field_a] = (char)0;
                          uf.field_a = var3;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((10 & var3) == -1) {
                      if (-86 != var2) {
                        if (-11 != (var2 ^ -1)) {
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
            L12: {
              if ((var2 ^ -1) > -1) {
                break L12;
              } else {
                var3 = 127 & 1 + uf.field_a;
                if (var3 != md.field_g) {
                  g.field_g[uf.field_a] = var2;
                  ll.field_b[uf.field_a] = (char)0;
                  uf.field_a = var3;
                  break L12;
                } else {
                  var3 = param0.getModifiers();
                  if ((10 & var3) == -1) {
                    if (-86 != var2) {
                      if (-11 != (var2 ^ -1)) {
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
            var3 = param0.getModifiers();
            if ((10 & var3) == -1) {
              if (-86 != var2) {
                if (-11 != (var2 ^ -1)) {
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

    final static String a(int param0) {
        int var1 = 0;
        if (qc.field_g != mg.field_m) {
          if (!bd.field_u.a(false)) {
            return bd.field_u.a(-63);
          } else {
            var1 = -5 % ((29 - param0) / 53);
            if (tg.field_c == mg.field_m) {
              return bd.field_u.a(-118);
            } else {
              return vh.field_k;
            }
          }
        } else {
          return sk.field_G;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (ad.field_b != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (oc.a((char) var2, 0)) {
                var3 = 127 & 1 + uf.field_a;
                if (var3 != md.field_g) {
                  g.field_g[uf.field_a] = -1;
                  ll.field_b[uf.field_a] = (char)var2;
                  uf.field_a = var3;
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

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static int[] b(int param0) {
        if (param0 != 8) {
            String discarded$0 = qh.a(122);
            return new int[8];
        }
        return new int[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[12];
        field_b = new byte[1000][];
        field_c[9] = 1;
        field_c[2] = 1;
        field_c[6] = 10;
        field_c[7] = 1;
        field_c[4] = 500;
        field_c[10] = 10;
        field_c[0] = 1;
        field_c[8] = 1;
        field_c[1] = 1;
        field_c[3] = 10;
        field_c[5] = 1;
        field_c[11] = 500;
    }
}
