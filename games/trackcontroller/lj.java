/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_f;
    static int field_a;
    static int[] field_e;
    static String field_c;
    static int field_d;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != cj.field_o) {
          mb.field_f = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (pb.field_c.length > var2) {
              var2 = pb.field_c[var2];
              if ((var2 & 128) == 0) {
                if (mg.field_f >= 0) {
                  if (var2 >= 0) {
                    md.field_b[mg.field_f] = var2;
                    mg.field_f = mg.field_f + 1 & 127;
                    if (hb.field_f != mg.field_f) {
                      if (var2 >= 0) {
                        var3 = ri.field_V - -1 & 127;
                        if (field_d != var3) {
                          mc.field_K[ri.field_V] = var2;
                          tk.field_o[ri.field_V] = (char)0;
                          ri.field_V = var3;
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
                                param0.consume();
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
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
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      mg.field_f = -1;
                      if (var2 >= 0) {
                        var3 = ri.field_V - -1 & 127;
                        if (field_d != var3) {
                          mc.field_K[ri.field_V] = var2;
                          tk.field_o[ri.field_V] = (char)0;
                          ri.field_V = var3;
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
                                param0.consume();
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
                              param0.consume();
                              return;
                            } else {
                              if (10 == var2) {
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
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
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
                      var3 = ri.field_V - -1 & 127;
                      if (field_d != var3) {
                        mc.field_K[ri.field_V] = var2;
                        tk.field_o[ri.field_V] = (char)0;
                        ri.field_V = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
                              param0.consume();
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
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
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (10 == var2) {
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
                    var3 = ri.field_V - -1 & 127;
                    if (field_d != var3) {
                      mc.field_K[ri.field_V] = var2;
                      tk.field_o[ri.field_V] = (char)0;
                      ri.field_V = var3;
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (10 == var2) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          return;
                        } else {
                          if (10 == var2) {
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
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
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
                  if (mg.field_f < 0) {
                    break L0;
                  } else {
                    if (var2 < 0) {
                      break L0;
                    } else {
                      md.field_b[mg.field_f] = var2;
                      mg.field_f = mg.field_f + 1 & 127;
                      if (hb.field_f != mg.field_f) {
                        break L0;
                      } else {
                        L1: {
                          mg.field_f = -1;
                          if (var2 >= 0) {
                            var3 = ri.field_V - -1 & 127;
                            if (field_d != var3) {
                              mc.field_K[ri.field_V] = var2;
                              tk.field_o[ri.field_V] = (char)0;
                              ri.field_V = var3;
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 == var2) {
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
                  var3 = ri.field_V - -1 & 127;
                  if (field_d != var3) {
                    mc.field_K[ri.field_V] = var2;
                    tk.field_o[ri.field_V] = (char)0;
                    ri.field_V = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
                          param0.consume();
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        return;
                      } else {
                        if (10 == var2) {
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
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
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
                if (mg.field_f < 0) {
                  break L2;
                } else {
                  if (var2 < 0) {
                    break L2;
                  } else {
                    md.field_b[mg.field_f] = var2;
                    mg.field_f = mg.field_f + 1 & 127;
                    if (hb.field_f != mg.field_f) {
                      break L2;
                    } else {
                      L3: {
                        mg.field_f = -1;
                        if (var2 >= 0) {
                          var3 = ri.field_V - -1 & 127;
                          if (field_d != var3) {
                            mc.field_K[ri.field_V] = var2;
                            tk.field_o[ri.field_V] = (char)0;
                            ri.field_V = var3;
                            break L3;
                          } else {
                            var3 = param0.getModifiers();
                            if ((var3 & 10) == 0) {
                              if (85 != var2) {
                                if (10 != var2) {
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
                          break L3;
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 != var2) {
                          if (10 != var2) {
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
                var3 = ri.field_V - -1 & 127;
                if (field_d != var3) {
                  mc.field_K[ri.field_V] = var2;
                  tk.field_o[ri.field_V] = (char)0;
                  ri.field_V = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      return;
                    } else {
                      if (10 == var2) {
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
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2) {
                    param0.consume();
                    return;
                  } else {
                    if (10 == var2) {
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
              if (mg.field_f < 0) {
                break L4;
              } else {
                if (var2 < 0) {
                  break L4;
                } else {
                  md.field_b[mg.field_f] = var2;
                  mg.field_f = mg.field_f + 1 & 127;
                  if (hb.field_f != mg.field_f) {
                    break L4;
                  } else {
                    L5: {
                      mg.field_f = -1;
                      if (var2 >= 0) {
                        var3 = ri.field_V - -1 & 127;
                        if (field_d != var3) {
                          mc.field_K[ri.field_V] = var2;
                          tk.field_o[ri.field_V] = (char)0;
                          ri.field_V = var3;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == 0) {
                      if (85 != var2) {
                        if (10 != var2) {
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
              var3 = ri.field_V - -1 & 127;
              if (field_d != var3) {
                mc.field_K[ri.field_V] = var2;
                tk.field_o[ri.field_V] = (char)0;
                ri.field_V = var3;
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (85 != var2) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (85 != var2) {
                    if (10 != var2) {
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
              if ((var3 & 10) == 0) {
                if (85 != var2) {
                  if (10 != var2) {
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

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        if (cj.field_o == null) {
            param0.consume();
            return;
        }
        mb.field_f = 0;
        int var2 = param0.getKeyCode();
        if ((var2 ^ -1) > -1) {
            var2 = -1;
            if (-1 >= (mg.field_f ^ -1)) {
                if (0 > var2) {
                    param0.consume();
                    return;
                }
                md.field_b[mg.field_f] = var2 ^ -1;
                mg.field_f = 1 + mg.field_f & 127;
                if (mg.field_f != hb.field_f) {
                    param0.consume();
                    return;
                }
                mg.field_f = -1;
            }
            param0.consume();
            return;
        }
        if (pb.field_c.length > var2) {
            var2 = -129 & pb.field_c[var2];
        } else {
            var2 = -1;
        }
        if (-1 >= (mg.field_f ^ -1)) {
            if (0 > var2) {
                param0.consume();
                return;
            }
            md.field_b[mg.field_f] = var2 ^ -1;
            mg.field_f = 1 + mg.field_f & 127;
            if (mg.field_f != hb.field_f) {
                param0.consume();
                return;
            }
            mg.field_f = -1;
        }
        param0.consume();
    }

    public static void a(int param0) {
        if (param0 <= 91) {
          field_e = null;
          field_f = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(fc param0, fc param1, int param2) {
        L0: {
          if (null != param1.field_e) {
            param1.a(-91);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 > -124) {
          field_a = -44;
          param1.field_h = param0;
          param1.field_e = param0.field_e;
          param1.field_e.field_h = param1;
          param1.field_h.field_e = param1;
          return;
        } else {
          param1.field_h = param0;
          param1.field_e = param0.field_e;
          param1.field_e.field_h = param1;
          param1.field_h.field_e = param1;
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(byte param0) {
        if (param0 < 111) {
          L0: {
            lj.a(-39);
            if (r.field_i != null) {
              r.field_i.d(16777215);
              r.field_i = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (r.field_i != null) {
              r.field_i.d(16777215);
              r.field_i = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (cj.field_o != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (nd.a(-92, (char) var2)) {
                var3 = 1 + ri.field_V & 127;
                if (field_d != var3) {
                  mc.field_K[ri.field_V] = -1;
                  tk.field_o[ri.field_V] = (char)var2;
                  ri.field_V = var3;
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
        if (!(null == cj.field_o)) {
            mg.field_f = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "You cannot play this level yet. Create a free account to store your progress. If you have an account, log in to start at any level you've reached.";
        field_e = new int[256];
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = 0;
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_e[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (1 & var0)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 2040663841 ^ -306674912;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
