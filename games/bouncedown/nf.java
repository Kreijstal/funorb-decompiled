/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (qj.field_c != null) {
          L0: {
            ak.field_y = 0;
            var2 = param0.getKeyCode();
            if (-1 < (var2 ^ -1)) {
              var2 = -1;
              break L0;
            } else {
              if ((mb.field_o.length ^ -1) < (var2 ^ -1)) {
                var2 = -129 & mb.field_o[var2];
                break L0;
              } else {
                var2 = -1;
                if (db.field_R >= 0) {
                  if (-1 >= (var2 ^ -1)) {
                    di.field_b[db.field_R] = var2 ^ -1;
                    db.field_R = 127 & 1 + db.field_R;
                    if (db.field_R == rj.field_g) {
                      db.field_R = -1;
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
            }
          }
          L1: {
            if (db.field_R < 0) {
              break L1;
            } else {
              if (-1 >= (var2 ^ -1)) {
                di.field_b[db.field_R] = var2 ^ -1;
                db.field_R = 127 & 1 + db.field_R;
                if (db.field_R == rj.field_g) {
                  db.field_R = -1;
                  break L1;
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
          param0.consume();
          return;
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
        if (null != qj.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (vf.a(-13891, (char) var2)) {
                var3 = Bounce.field_F + 1 & 127;
                if (oh.field_a == var3) {
                  param0.consume();
                  return;
                } else {
                  pf.field_A[Bounce.field_F] = -1;
                  fk.field_b[Bounce.field_F] = (char)var2;
                  Bounce.field_F = var3;
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
        if (qj.field_c != null) {
          ak.field_y = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if ((mb.field_o.length ^ -1) < (var2 ^ -1)) {
              var2 = mb.field_o[var2];
              if (-1 != (var2 & 128 ^ -1)) {
                var2 = -1;
                if (db.field_R >= 0) {
                  if ((var2 ^ -1) <= -1) {
                    di.field_b[db.field_R] = var2;
                    db.field_R = 127 & db.field_R - -1;
                    if (rj.field_g == db.field_R) {
                      db.field_R = -1;
                      if (0 <= var2) {
                        var3 = Bounce.field_F - -1 & 127;
                        if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                          var3 = param0.getModifiers();
                          if (-1 != (10 & var3 ^ -1)) {
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
                          pf.field_A[Bounce.field_F] = var2;
                          fk.field_b[Bounce.field_F] = (char)0;
                          Bounce.field_F = var3;
                          var3 = param0.getModifiers();
                          if (-1 != (10 & var3 ^ -1)) {
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
                        if (-1 != (10 & var3 ^ -1)) {
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
                      if (0 <= var2) {
                        var3 = Bounce.field_F - -1 & 127;
                        if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                          var3 = param0.getModifiers();
                          if (-1 != (10 & var3 ^ -1)) {
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
                          pf.field_A[Bounce.field_F] = var2;
                          fk.field_b[Bounce.field_F] = (char)0;
                          Bounce.field_F = var3;
                          var3 = param0.getModifiers();
                          if (-1 != (10 & var3 ^ -1)) {
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
                        if (-1 != (10 & var3 ^ -1)) {
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
                    if (0 <= var2) {
                      var3 = Bounce.field_F - -1 & 127;
                      if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                        var3 = param0.getModifiers();
                        if (-1 != (10 & var3 ^ -1)) {
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
                        pf.field_A[Bounce.field_F] = var2;
                        fk.field_b[Bounce.field_F] = (char)0;
                        Bounce.field_F = var3;
                        var3 = param0.getModifiers();
                        if (-1 != (10 & var3 ^ -1)) {
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
                      if (-1 != (10 & var3 ^ -1)) {
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
                  if (0 <= var2) {
                    var3 = Bounce.field_F - -1 & 127;
                    if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3 ^ -1)) {
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
                      pf.field_A[Bounce.field_F] = var2;
                      fk.field_b[Bounce.field_F] = (char)0;
                      Bounce.field_F = var3;
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3 ^ -1)) {
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
                    if (-1 != (10 & var3 ^ -1)) {
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
                L0: {
                  if (db.field_R < 0) {
                    break L0;
                  } else {
                    if ((var2 ^ -1) > -1) {
                      break L0;
                    } else {
                      di.field_b[db.field_R] = var2;
                      db.field_R = 127 & db.field_R - -1;
                      if (rj.field_g == db.field_R) {
                        db.field_R = -1;
                        break L0;
                      } else {
                        L1: {
                          if (0 <= var2) {
                            var3 = Bounce.field_F - -1 & 127;
                            if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                              break L1;
                            } else {
                              pf.field_A[Bounce.field_F] = var2;
                              fk.field_b[Bounce.field_F] = (char)0;
                              Bounce.field_F = var3;
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                        var3 = param0.getModifiers();
                        if (-1 != (10 & var3 ^ -1)) {
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
                  }
                }
                if (0 <= var2) {
                  var3 = Bounce.field_F - -1 & 127;
                  if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3 ^ -1)) {
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
                    pf.field_A[Bounce.field_F] = var2;
                    fk.field_b[Bounce.field_F] = (char)0;
                    Bounce.field_F = var3;
                    var3 = param0.getModifiers();
                    if (-1 != (10 & var3 ^ -1)) {
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
                  if (-1 != (10 & var3 ^ -1)) {
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
              if (db.field_R >= 0) {
                L2: {
                  if ((var2 ^ -1) > -1) {
                    break L2;
                  } else {
                    di.field_b[db.field_R] = var2;
                    db.field_R = 127 & db.field_R - -1;
                    if (rj.field_g == db.field_R) {
                      db.field_R = -1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 <= var2) {
                    var3 = Bounce.field_F - -1 & 127;
                    if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                      break L3;
                    } else {
                      pf.field_A[Bounce.field_F] = var2;
                      fk.field_b[Bounce.field_F] = (char)0;
                      Bounce.field_F = var3;
                      var3 = param0.getModifiers();
                      if (-1 != (10 & var3 ^ -1)) {
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
                    break L3;
                  }
                }
                var3 = param0.getModifiers();
                if (-1 != (10 & var3 ^ -1)) {
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
                L4: {
                  if (0 <= var2) {
                    var3 = Bounce.field_F - -1 & 127;
                    if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                      break L4;
                    } else {
                      pf.field_A[Bounce.field_F] = var2;
                      fk.field_b[Bounce.field_F] = (char)0;
                      Bounce.field_F = var3;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var3 = param0.getModifiers();
                if (-1 != (10 & var3 ^ -1)) {
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
            L5: {
              var2 = -1;
              if (db.field_R < 0) {
                break L5;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L5;
                } else {
                  di.field_b[db.field_R] = var2;
                  db.field_R = 127 & db.field_R - -1;
                  if (rj.field_g == db.field_R) {
                    db.field_R = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (0 <= var2) {
                var3 = Bounce.field_F - -1 & 127;
                if ((var3 ^ -1) == (oh.field_a ^ -1)) {
                  break L6;
                } else {
                  pf.field_A[Bounce.field_F] = var2;
                  fk.field_b[Bounce.field_F] = (char)0;
                  Bounce.field_F = var3;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            var3 = param0.getModifiers();
            if (-1 != (10 & var3 ^ -1)) {
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
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -58) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (qj.field_c != null) {
            db.field_R = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play the game without logging in just yet";
        field_b = "Two Player Battle";
    }
}
