/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static String field_d;
    static String field_a;
    static String field_b;

    public static void b(int param0) {
        if (param0 != 128) {
          field_d = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, cc param1, mm param2, int param3, int param4, cc param5, int param6, mm param7, int param8, int param9, cc param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        lk.a(param7, true, param2, param8);
        int var21 = 80 % ((param12 - -81) / 39);
        s.a(param6, param20, (byte) -91, param0, param16);
        pj.a(31004, param15, param14);
        ci.a(param10, param13, param4, (byte) -63, param11, param5);
        gk.a(param19, param18, (byte) -75, param1);
        wf.a(param17, param3, param9, true);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (f.field_r != null) {
          om.field_d = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (var2 < be.field_w.length) {
              L0: {
                var2 = be.field_w[var2];
                if ((128 & var2) != 0) {
                  var2 = -1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (wi.field_b >= 0) {
                if ((var2 ^ -1) <= -1) {
                  la.field_h[wi.field_b] = var2;
                  wi.field_b = wi.field_b - -1 & 127;
                  if (wi.field_b != rc.field_a) {
                    if (var2 >= 0) {
                      var3 = jh.field_e + 1 & 127;
                      if (var3 != sf.field_B) {
                        pf.field_i[jh.field_e] = var2;
                        bl.field_Z[jh.field_e] = (char)0;
                        jh.field_e = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                          if (var2 == 85) {
                            param0.consume();
                            return;
                          } else {
                            if (var2 == 10) {
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
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
                            param0.consume();
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L1: {
                      wi.field_b = -1;
                      if (var2 >= 0) {
                        var3 = jh.field_e + 1 & 127;
                        if (var3 != sf.field_B) {
                          pf.field_i[jh.field_e] = var2;
                          bl.field_Z[jh.field_e] = (char)0;
                          jh.field_e = var3;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        break L2;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          break L2;
                        } else {
                          if (var2 == 10) {
                            param0.consume();
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (var2 >= 0) {
                    var3 = jh.field_e + 1 & 127;
                    if (var3 != sf.field_B) {
                      pf.field_i[jh.field_e] = var2;
                      bl.field_Z[jh.field_e] = (char)0;
                      jh.field_e = var3;
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
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
                        if (var2 == 85) {
                          param0.consume();
                          return;
                        } else {
                          if (var2 == 10) {
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
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                  var3 = jh.field_e + 1 & 127;
                  if (var3 != sf.field_B) {
                    pf.field_i[jh.field_e] = var2;
                    bl.field_Z[jh.field_e] = (char)0;
                    jh.field_e = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                      if (var2 == 85) {
                        param0.consume();
                        return;
                      } else {
                        if (var2 == 10) {
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
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 10) {
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
                if (wi.field_b < 0) {
                  break L3;
                } else {
                  if ((var2 ^ -1) > -1) {
                    break L3;
                  } else {
                    la.field_h[wi.field_b] = var2;
                    wi.field_b = wi.field_b - -1 & 127;
                    if (wi.field_b != rc.field_a) {
                      break L3;
                    } else {
                      L4: {
                        wi.field_b = -1;
                        if (var2 >= 0) {
                          var3 = jh.field_e + 1 & 127;
                          if (var3 != sf.field_B) {
                            pf.field_i[jh.field_e] = var2;
                            bl.field_Z[jh.field_e] = (char)0;
                            jh.field_e = var3;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) == 0) {
                        if (var2 != 85) {
                          if (var2 != 10) {
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
                var3 = jh.field_e + 1 & 127;
                if (var3 != sf.field_B) {
                  pf.field_i[jh.field_e] = var2;
                  bl.field_Z[jh.field_e] = (char)0;
                  jh.field_e = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == 85) {
                      param0.consume();
                      return;
                    } else {
                      if (var2 == 10) {
                        param0.consume();
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L5: {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      break L5;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        break L5;
                      } else {
                        if (var2 == 10) {
                          param0.consume();
                          break L5;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (var2 != 85) {
                    if (var2 != 10) {
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
            L6: {
              var2 = -1;
              if (wi.field_b < 0) {
                break L6;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L6;
                } else {
                  la.field_h[wi.field_b] = var2;
                  wi.field_b = wi.field_b - -1 & 127;
                  if (wi.field_b != rc.field_a) {
                    break L6;
                  } else {
                    L7: {
                      wi.field_b = -1;
                      if (var2 >= 0) {
                        var3 = jh.field_e + 1 & 127;
                        if (var3 != sf.field_B) {
                          pf.field_i[jh.field_e] = var2;
                          bl.field_Z[jh.field_e] = (char)0;
                          jh.field_e = var3;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == 0) {
                      if (var2 != 85) {
                        if (var2 != 10) {
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
              var3 = jh.field_e + 1 & 127;
              if (var3 != sf.field_B) {
                pf.field_i[jh.field_e] = var2;
                bl.field_Z[jh.field_e] = (char)0;
                jh.field_e = var3;
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (var2 != 85) {
                    if (var2 == 10) {
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
                  if (var2 != 85) {
                    if (var2 == 10) {
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
              if ((var3 & 10) == 0) {
                if (var2 != 85) {
                  if (var2 != 10) {
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

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null == f.field_r) {
            return;
        }
        wi.field_b = -1;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (f.field_r != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (he.a(-97, (char) var2)) {
                var3 = 1 + jh.field_e & 127;
                if (var3 == sf.field_B) {
                  param0.consume();
                  return;
                } else {
                  pf.field_i[jh.field_e] = -1;
                  bl.field_Z[jh.field_e] = (char)var2;
                  jh.field_e = var3;
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

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (f.field_r != null) {
          om.field_d = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            L0: {
              if (var2 >= be.field_w.length) {
                var2 = -1;
                break L0;
              } else {
                var2 = be.field_w[var2] & -129;
                break L0;
              }
            }
            if (wi.field_b >= 0) {
              if (var2 >= 0) {
                la.field_h[wi.field_b] = var2 ^ -1;
                wi.field_b = 127 & wi.field_b - -1;
                if (rc.field_a != wi.field_b) {
                  param0.consume();
                  return;
                } else {
                  wi.field_b = -1;
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
            if (wi.field_b >= 0) {
              if (var2 >= 0) {
                la.field_h[wi.field_b] = var2 ^ -1;
                wi.field_b = 127 & wi.field_b - -1;
                if (rc.field_a != wi.field_b) {
                  param0.consume();
                  return;
                } else {
                  wi.field_b = -1;
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

    final static int a(byte param0) {
        if (param0 != -74) {
            int discarded$0 = n.a((byte) -95);
            return (int)(1000000000L / ul.field_g);
        }
        return (int)(1000000000L / ul.field_g);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = client.field_A ? 1 : 0;
        ed.field_d = null;
        if (param0 == 1) {
          mg.field_Nb = false;
          if (!vb.field_Z) {
            var1 = bb.field_e;
            if (0 >= var1) {
              cl.field_r.n(-127);
              em.a(-1199770620);
              return;
            } else {
              if (var1 == 1) {
                ed.field_d = aa.field_d;
                ed.field_d = db.a(new CharSequence[3], -62);
                cl.field_r.n(-127);
                em.a(-1199770620);
                return;
              } else {
                ed.field_d = cm.a((byte) 87, jc.field_e, new String[1]);
                ed.field_d = db.a(new CharSequence[3], -62);
                cl.field_r.n(-127);
                em.a(-1199770620);
                return;
              }
            }
          } else {
            cl.field_r.o(4210752);
            return;
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          if (param1 < param2) {
            var3 = param1;
            param1 = param2;
            param2 = var3;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= 37) {
          L1: while (true) {
            if (param2 == 0) {
              return param1;
            } else {
              var3 = param1 % param2;
              param1 = param2;
              param2 = var3;
              continue L1;
            }
          }
        } else {
          n.b(77);
          L2: while (true) {
            if (param2 == 0) {
              return param1;
            } else {
              var3 = param1 % param2;
              param1 = param2;
              param2 = var3;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Day";
        field_a = "Total: ";
    }
}
