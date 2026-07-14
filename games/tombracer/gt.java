/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static String field_d;
    static float[] field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var6 = rp.a(hc.field_h, param4 + -16236, gca.field_d, param2);
        if (param4 == 10) {
          var7 = rp.a(hc.field_h, param4 ^ -16236, gca.field_d, param5);
          var8 = rp.a(ss.field_c, param4 + -16236, pka.field_b, param1);
          var9 = rp.a(ss.field_c, -16226, pka.field_b, param0);
          var10 = var6;
          L0: while (true) {
            if (var7 < var10) {
              return;
            } else {
              nra.a((byte) -55, param3, var9, vaa.field_a[var10], var8);
              var10++;
              continue L0;
            }
          }
        } else {
          gt.a((byte) 101);
          var7 = rp.a(hc.field_h, param4 ^ -16236, gca.field_d, param5);
          var8 = rp.a(ss.field_c, param4 + -16236, pka.field_b, param1);
          var9 = rp.a(ss.field_c, -16226, pka.field_b, param0);
          var10 = var6;
          L1: while (true) {
            if (var7 < var10) {
              return;
            } else {
              nra.a((byte) -55, param3, var9, vaa.field_a[var10], var8);
              var10++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (ipa.field_P == null) {
          var1 = 1 % ((-17 - param0) / 60);
          if (null != gg.field_b) {
            gg.field_b.a();
            return;
          } else {
            return;
          }
        } else {
          ipa.field_P.a();
          var1 = 1 % ((-17 - param0) / 60);
          if (null == gg.field_b) {
            return;
          } else {
            gg.field_b.a();
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != nfa.field_n) {
          cda.field_p = 0;
          var2 = param0.getKeyCode();
          if (0 > var2) {
            L0: {
              var2 = -1;
              if (ita.field_f > -1) {
                break L0;
              } else {
                if (-1 > var2) {
                  break L0;
                } else {
                  cna.field_c[ita.field_f] = var2;
                  ita.field_f = 127 & 1 + ita.field_f;
                  if (ita.field_f == hka.field_a) {
                    ita.field_f = -1;
                    break L0;
                  } else {
                    L1: {
                      if (-1 >= (var2 ^ -1)) {
                        var3 = rca.field_n - -1 & 127;
                        if (var3 == vha.field_b) {
                          break L1;
                        } else {
                          dl.field_o[rca.field_n] = var2;
                          uk.field_O[rca.field_n] = (char)0;
                          rca.field_n = var3;
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
                      if (85 != var2) {
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
                    }
                  }
                }
              }
            }
            if (-1 >= (var2 ^ -1)) {
              var3 = rca.field_n - -1 & 127;
              if (var3 == vha.field_b) {
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2) {
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
                dl.field_o[rca.field_n] = var2;
                uk.field_O[rca.field_n] = (char)0;
                rca.field_n = var3;
                var3 = param0.getModifiers();
                if (0 != (var3 & 10)) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2) {
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
              if (0 != (var3 & 10)) {
                param0.consume();
                return;
              } else {
                if (85 != var2) {
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
              }
            }
          } else {
            if (var2 < bba.field_c.length) {
              L2: {
                var2 = bba.field_c[var2];
                if ((var2 & 128) == 0) {
                  break L2;
                } else {
                  var2 = -1;
                  break L2;
                }
              }
              if (ita.field_f <= -1) {
                if (-1 >= var2) {
                  cna.field_c[ita.field_f] = var2;
                  ita.field_f = 127 & 1 + ita.field_f;
                  if (ita.field_f == hka.field_a) {
                    ita.field_f = -1;
                    if (-1 >= (var2 ^ -1)) {
                      var3 = rca.field_n - -1 & 127;
                      if (var3 == vha.field_b) {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                        dl.field_o[rca.field_n] = var2;
                        uk.field_O[rca.field_n] = (char)0;
                        rca.field_n = var3;
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                    if (-1 >= (var2 ^ -1)) {
                      var3 = rca.field_n - -1 & 127;
                      if (var3 == vha.field_b) {
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                        dl.field_o[rca.field_n] = var2;
                        uk.field_O[rca.field_n] = (char)0;
                        rca.field_n = var3;
                        var3 = param0.getModifiers();
                        if (0 != (var3 & 10)) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                  if (-1 <= var2) {
                    var3 = rca.field_n - -1 & 127;
                    if (var3 == vha.field_b) {
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                      dl.field_o[rca.field_n] = var2;
                      uk.field_O[rca.field_n] = (char)0;
                      rca.field_n = var3;
                      var3 = param0.getModifiers();
                      if (0 != (var3 & 10)) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
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
                if (-1 <= var2) {
                  var3 = rca.field_n - -1 & 127;
                  if (var3 == vha.field_b) {
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
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
                    dl.field_o[rca.field_n] = var2;
                    uk.field_O[rca.field_n] = (char)0;
                    rca.field_n = var3;
                    var3 = param0.getModifiers();
                    if (0 != (var3 & 10)) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
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
                  if (0 != (var3 & 10)) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
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
              var2 = -1;
              if (ita.field_f <= -1) {
                if (-1 >= var2) {
                  L3: {
                    cna.field_c[ita.field_f] = var2;
                    ita.field_f = 127 & 1 + ita.field_f;
                    if (ita.field_f == hka.field_a) {
                      ita.field_f = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-1 >= (var2 ^ -1)) {
                      var3 = rca.field_n - -1 & 127;
                      if (var3 == vha.field_b) {
                        break L4;
                      } else {
                        dl.field_o[rca.field_n] = var2;
                        uk.field_O[rca.field_n] = (char)0;
                        rca.field_n = var3;
                        var3 = param0.getModifiers();
                        if (0 == (var3 & 10)) {
                          if (85 != var2) {
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
                    } else {
                      break L4;
                    }
                  }
                  var3 = param0.getModifiers();
                  if (0 == (var3 & 10)) {
                    if (85 != var2) {
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
                } else {
                  L5: {
                    if (-1 <= var2) {
                      var3 = rca.field_n - -1 & 127;
                      if (var3 == vha.field_b) {
                        break L5;
                      } else {
                        dl.field_o[rca.field_n] = var2;
                        uk.field_O[rca.field_n] = (char)0;
                        rca.field_n = var3;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var3 = param0.getModifiers();
                  if (0 == (var3 & 10)) {
                    if (85 != var2) {
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
              } else {
                L6: {
                  if (-1 <= var2) {
                    var3 = rca.field_n - -1 & 127;
                    if (var3 == vha.field_b) {
                      break L6;
                    } else {
                      dl.field_o[rca.field_n] = var2;
                      uk.field_O[rca.field_n] = (char)0;
                      rca.field_n = var3;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var3 = param0.getModifiers();
                if (0 == (var3 & 10)) {
                  if (85 != var2) {
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
        } else {
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(nfa.field_n == null)) {
            ita.field_f = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (nfa.field_n != null) {
          L0: {
            cda.field_p = 0;
            var2 = param0.getKeyCode();
            if (0 > var2) {
              var2 = -1;
              break L0;
            } else {
              if (var2 < bba.field_c.length) {
                var2 = bba.field_c[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (0 <= ita.field_f) {
                  if (0 > var2) {
                    param0.consume();
                    return;
                  } else {
                    L1: {
                      cna.field_c[ita.field_f] = var2 ^ -1;
                      ita.field_f = 127 & 1 + ita.field_f;
                      if (ita.field_f == hka.field_a) {
                        ita.field_f = -1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
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
          if (0 <= ita.field_f) {
            if (0 <= var2) {
              cna.field_c[ita.field_f] = var2 ^ -1;
              ita.field_f = 127 & 1 + ita.field_f;
              if (ita.field_f != hka.field_a) {
                param0.consume();
                return;
              } else {
                ita.field_f = -1;
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

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 127) {
            gt.a((byte) 34);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (nfa.field_n != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (msa.a((char) var2, (byte) 124)) {
                var3 = 1 + rca.field_n & 127;
                if (vha.field_b == var3) {
                  param0.consume();
                  return;
                } else {
                  dl.field_o[rca.field_n] = -1;
                  uk.field_O[rca.field_n] = (char)var2;
                  rca.field_n = var3;
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
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_c = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        field_b = -1;
    }
}
