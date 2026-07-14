/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_a;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != mc.field_r) {
          L0: {
            ia.field_i = 0;
            var2 = param0.getKeyCode();
            if ((var2 ^ -1) > -1) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < tn.field_j.length) {
                var2 = tn.field_j[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if ((ol.field_q ^ -1) <= -1) {
                  if (0 <= var2) {
                    qp.field_Q[ol.field_q] = var2 ^ -1;
                    ol.field_q = ol.field_q + 1 & 127;
                    if (ol.field_q != wm.field_c) {
                      param0.consume();
                      return;
                    } else {
                      ol.field_q = -1;
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
          if ((ol.field_q ^ -1) <= -1) {
            if (0 <= var2) {
              qp.field_Q[ol.field_q] = var2 ^ -1;
              ol.field_q = ol.field_q + 1 & 127;
              if (ol.field_q == wm.field_c) {
                ol.field_q = -1;
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

    final static void a(int param0, int param1, int param2, int param3, cb param4, int param5, String param6, int param7, int param8) {
        Object var10 = null;
        kj.field_s = param3;
        if (param7 != -21462) {
          var10 = null;
          rp.a(117, 59, -61, 116, (cb) null, -123, (String) null, 58, -63);
          fj.field_a = param0;
          bl.field_e = param6;
          ak.field_ib = param2;
          ql.field_o = param8;
          pd.field_Eb = param5;
          lk.field_n = param1;
          ef.field_e = param4;
          pm.field_h = (rf) (Object) new wn();
          fh.field_J = new gm(param4);
          ck.field_j = new am(pm.field_h, fh.field_J);
          return;
        } else {
          fj.field_a = param0;
          bl.field_e = param6;
          ak.field_ib = param2;
          ql.field_o = param8;
          pd.field_Eb = param5;
          lk.field_n = param1;
          ef.field_e = param4;
          pm.field_h = (rf) (Object) new wn();
          fh.field_J = new gm(param4);
          ck.field_j = new am(pm.field_h, fh.field_J);
          return;
        }
    }

    final static void a(byte param0, tf param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        if (((param1.field_F | param1.field_E | param1.field_D | param1.field_y) & 3) == 0) {
          return;
        } else {
          var2 = (3 & param1.field_D) + param1.field_F;
          var3 = param1.field_E + (param1.field_y & 3);
          var2 = var2 - -4 - (var2 & 3);
          var3 = -(var3 & 3) - (-4 - var3);
          var4 = new int[var2 * var3];
          var5 = 0;
          var6 = (3 & param1.field_D) - -((3 & param1.field_y) * var2);
          var7 = 0;
          L0: while (true) {
            if (param1.field_E <= var7) {
              if (param0 != -59) {
                field_a = null;
                param1.field_y = param1.field_y & -4;
                param1.field_D = param1.field_D & -4;
                param1.field_F = var2;
                param1.field_E = var3;
                param1.field_G = var4;
                return;
              } else {
                param1.field_y = param1.field_y & -4;
                param1.field_D = param1.field_D & -4;
                param1.field_F = var2;
                param1.field_E = var3;
                param1.field_G = var4;
                return;
              }
            } else {
              var8 = 0;
              L1: while (true) {
                if (param1.field_F <= var8) {
                  var6 = var6 + (var2 - param1.field_F);
                  var7++;
                  continue L0;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param1.field_G[var5];
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (mc.field_r != null) {
            ol.field_q = -1;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (mc.field_r != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (kj.a((char) var2, (byte) 111)) {
                var3 = 127 & 1 + jd.field_s;
                if (qn.field_p == var3) {
                  param0.consume();
                  return;
                } else {
                  gn.field_z[jd.field_s] = -1;
                  fm.field_d[jd.field_s] = (char)var2;
                  jd.field_s = var3;
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
        if (null != mc.field_r) {
          ia.field_i = 0;
          var2 = param0.getKeyCode();
          if (-1 >= (var2 ^ -1)) {
            L0: {
              if (tn.field_j.length > var2) {
                var2 = tn.field_j[var2];
                if ((128 & var2) != 0) {
                  var2 = -1;
                  break L0;
                } else {
                  L1: {
                    if (0 > ol.field_q) {
                      break L1;
                    } else {
                      if ((var2 ^ -1) > -1) {
                        break L1;
                      } else {
                        qp.field_Q[ol.field_q] = var2;
                        ol.field_q = 127 & 1 + ol.field_q;
                        if (ol.field_q == wm.field_c) {
                          ol.field_q = -1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if (-1 < (var2 ^ -1)) {
                      break L2;
                    } else {
                      var3 = 127 & 1 + jd.field_s;
                      if (qn.field_p != var3) {
                        gn.field_z[jd.field_s] = var2;
                        fm.field_d[jd.field_s] = (char)0;
                        jd.field_s = var3;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
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
                var2 = -1;
                break L0;
              }
            }
            if (0 <= ol.field_q) {
              if (var2 <= -1) {
                qp.field_Q[ol.field_q] = var2;
                ol.field_q = 127 & 1 + ol.field_q;
                if (ol.field_q == wm.field_c) {
                  L4: {
                    ol.field_q = -1;
                    if (-1 < (var2 ^ -1)) {
                      break L4;
                    } else {
                      var3 = 127 & 1 + jd.field_s;
                      if (qn.field_p != var3) {
                        gn.field_z[jd.field_s] = var2;
                        fm.field_d[jd.field_s] = (char)0;
                        jd.field_s = var3;
                        break L4;
                      } else {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
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
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
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
                  L5: {
                    if (-1 < (var2 ^ -1)) {
                      break L5;
                    } else {
                      var3 = 127 & 1 + jd.field_s;
                      if (qn.field_p != var3) {
                        gn.field_z[jd.field_s] = var2;
                        fm.field_d[jd.field_s] = (char)0;
                        jd.field_s = var3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
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
                  }
                }
              } else {
                L6: {
                  if (-1 > var2) {
                    break L6;
                  } else {
                    var3 = 127 & 1 + jd.field_s;
                    if (qn.field_p != var3) {
                      gn.field_z[jd.field_s] = var2;
                      fm.field_d[jd.field_s] = (char)0;
                      jd.field_s = var3;
                      break L6;
                    } else {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) == 0) {
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
                }
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
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
                }
              }
            } else {
              L7: {
                if (-1 < (var2 ^ -1)) {
                  break L7;
                } else {
                  var3 = 127 & 1 + jd.field_s;
                  if (qn.field_p != var3) {
                    gn.field_z[jd.field_s] = var2;
                    fm.field_d[jd.field_s] = (char)0;
                    jd.field_s = var3;
                    break L7;
                  } else {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) == 0) {
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
              }
              var3 = param0.getModifiers();
              if ((var3 & 10) == 0) {
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
            L8: {
              var2 = -1;
              if (0 > ol.field_q) {
                break L8;
              } else {
                if (var2 > -1) {
                  break L8;
                } else {
                  qp.field_Q[ol.field_q] = var2;
                  ol.field_q = 127 & 1 + ol.field_q;
                  if (ol.field_q == wm.field_c) {
                    ol.field_q = -1;
                    break L8;
                  } else {
                    L9: {
                      if (-1 > var2) {
                        break L9;
                      } else {
                        var3 = 127 & 1 + jd.field_s;
                        if (qn.field_p != var3) {
                          gn.field_z[jd.field_s] = var2;
                          fm.field_d[jd.field_s] = (char)0;
                          jd.field_s = var3;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        break L10;
                      } else {
                        if (-86 == var2) {
                          param0.consume();
                          break L10;
                        } else {
                          if (-11 != var2) {
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
              }
            }
            L11: {
              if (-1 < (var2 ^ -1)) {
                break L11;
              } else {
                var3 = 127 & 1 + jd.field_s;
                if (qn.field_p != var3) {
                  gn.field_z[jd.field_s] = var2;
                  fm.field_d[jd.field_s] = (char)0;
                  jd.field_s = var3;
                  break L11;
                } else {
                  L12: {
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      break L12;
                    } else {
                      if (-86 == var2) {
                        param0.consume();
                        break L12;
                      } else {
                        if (-11 != var2) {
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
              }
            }
            var3 = param0.getModifiers();
            if ((var3 & 10) == 0) {
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
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create your own free Jagex account";
        field_b = "<%0> has left the lobby.";
    }
}
