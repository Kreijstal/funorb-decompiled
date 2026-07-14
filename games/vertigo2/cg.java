/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static jp[] field_b;
    static String field_c;
    static wp field_a;
    static int field_d;
    static cc field_f;
    static int[] field_e;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (kb.field_a != null) {
            fh.field_w = -1;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != kb.field_a) {
          L0: {
            mm.field_a = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (gk.field_a.length > var2) {
                var2 = gk.field_a[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (fh.field_w >= 0) {
                  if ((var2 ^ -1) <= -1) {
                    bq.field_D[fh.field_w] = var2 ^ -1;
                    fh.field_w = 127 & fh.field_w + 1;
                    if (bd.field_f != fh.field_w) {
                      param0.consume();
                      return;
                    } else {
                      fh.field_w = -1;
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
          if (fh.field_w >= 0) {
            if ((var2 ^ -1) <= -1) {
              bq.field_D[fh.field_w] = var2 ^ -1;
              fh.field_w = 127 & fh.field_w + 1;
              if (bd.field_f != fh.field_w) {
                param0.consume();
                return;
              } else {
                fh.field_w = -1;
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
        field_c = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 92) {
            return;
        }
        field_e = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != kb.field_a) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (gr.a(0, (char) var2)) {
                var3 = 127 & ro.field_e - -1;
                if (var3 != rq.field_B) {
                  wm.field_j[ro.field_e] = -1;
                  af.field_F[ro.field_e] = (char)var2;
                  ro.field_e = var3;
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

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (kb.field_a != null) {
          mm.field_a = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            L0: {
              if (var2 < gk.field_a.length) {
                var2 = gk.field_a[var2];
                if ((128 & var2) == 0) {
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
            L1: {
              if ((fh.field_w ^ -1) > -1) {
                break L1;
              } else {
                if (var2 >= 0) {
                  bq.field_D[fh.field_w] = var2;
                  fh.field_w = fh.field_w - -1 & 127;
                  if (fh.field_w == bd.field_f) {
                    fh.field_w = -1;
                    break L1;
                  } else {
                    L2: {
                      if ((var2 ^ -1) > -1) {
                        break L2;
                      } else {
                        var3 = 1 + ro.field_e & 127;
                        if (var3 == rq.field_B) {
                          break L2;
                        } else {
                          wm.field_j[ro.field_e] = var2;
                          af.field_F[ro.field_e] = (char)0;
                          ro.field_e = var3;
                          break L2;
                        }
                      }
                    }
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
                  if ((var2 ^ -1) <= -1) {
                    var3 = 1 + ro.field_e & 127;
                    if (var3 != rq.field_B) {
                      wm.field_j[ro.field_e] = var2;
                      af.field_F[ro.field_e] = (char)0;
                      ro.field_e = var3;
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
                    } else {
                      L3: {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          break L3;
                        } else {
                          if (var2 == 85) {
                            param0.consume();
                            break L3;
                          } else {
                            if (var2 != 10) {
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
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        break L4;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          break L4;
                        } else {
                          if (var2 != 10) {
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
              }
            }
            L5: {
              if ((var2 ^ -1) > -1) {
                break L5;
              } else {
                var3 = 1 + ro.field_e & 127;
                if (var3 == rq.field_B) {
                  break L5;
                } else {
                  wm.field_j[ro.field_e] = var2;
                  af.field_F[ro.field_e] = (char)0;
                  ro.field_e = var3;
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
            L6: {
              var2 = -1;
              if ((fh.field_w ^ -1) > -1) {
                break L6;
              } else {
                if (var2 >= 0) {
                  bq.field_D[fh.field_w] = var2;
                  fh.field_w = fh.field_w - -1 & 127;
                  if (fh.field_w == bd.field_f) {
                    fh.field_w = -1;
                    break L6;
                  } else {
                    L7: {
                      if ((var2 ^ -1) > -1) {
                        break L7;
                      } else {
                        var3 = 1 + ro.field_e & 127;
                        if (var3 == rq.field_B) {
                          break L7;
                        } else {
                          wm.field_j[ro.field_e] = var2;
                          af.field_F[ro.field_e] = (char)0;
                          ro.field_e = var3;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        break L8;
                      } else {
                        if (var2 == 85) {
                          param0.consume();
                          break L8;
                        } else {
                          if (var2 != 10) {
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
                    if ((var2 ^ -1) > -1) {
                      break L9;
                    } else {
                      var3 = 1 + ro.field_e & 127;
                      if (var3 == rq.field_B) {
                        break L9;
                      } else {
                        wm.field_j[ro.field_e] = var2;
                        af.field_F[ro.field_e] = (char)0;
                        ro.field_e = var3;
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
                      if (var2 == 85) {
                        param0.consume();
                        break L10;
                      } else {
                        if (var2 != 10) {
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
            L11: {
              if ((var2 ^ -1) > -1) {
                break L11;
              } else {
                var3 = 1 + ro.field_e & 127;
                if (var3 == rq.field_B) {
                  break L11;
                } else {
                  L12: {
                    wm.field_j[ro.field_e] = var2;
                    af.field_F[ro.field_e] = (char)0;
                    ro.field_e = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      break L12;
                    } else {
                      if (var2 == 85) {
                        param0.consume();
                        break L12;
                      } else {
                        if (var2 != 10) {
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
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Tips";
        field_a = new wp();
        field_d = -1;
    }
}
