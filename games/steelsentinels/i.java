/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_d;
    static ji[] field_e;
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(byte param0) {
        int var1 = -36 % ((-59 - param0) / 57);
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (wc.field_i != null) {
            qj.field_h = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (wc.field_i != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (ak.a(-2036, (char) var2)) {
                var3 = 127 & 1 + fk.field_e;
                if (ad.field_b == var3) {
                  param0.consume();
                  return;
                } else {
                  kk.field_b[fk.field_e] = -1;
                  pi.field_b[fk.field_e] = (char)var2;
                  fk.field_e = var3;
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

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (wc.field_i != null) {
          km.field_f = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            if (qj.field_a.length > var2) {
              L0: {
                var2 = qj.field_a[var2];
                if ((128 & var2) == 0) {
                  break L0;
                } else {
                  var2 = -1;
                  break L0;
                }
              }
              if (0 <= qj.field_h) {
                if (-1 >= (var2 ^ -1)) {
                  ni.field_b[qj.field_h] = var2;
                  qj.field_h = 1 + qj.field_h & 127;
                  if (qj.field_h == hh.field_b) {
                    qj.field_h = -1;
                    if ((var2 ^ -1) <= -1) {
                      var3 = fk.field_e - -1 & 127;
                      if (ad.field_b != var3) {
                        kk.field_b[fk.field_e] = var2;
                        pi.field_b[fk.field_e] = (char)0;
                        fk.field_e = var3;
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
                    if ((var2 ^ -1) <= -1) {
                      var3 = fk.field_e - -1 & 127;
                      if (ad.field_b != var3) {
                        kk.field_b[fk.field_e] = var2;
                        pi.field_b[fk.field_e] = (char)0;
                        fk.field_e = var3;
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
                  if ((var2 ^ -1) <= -1) {
                    var3 = fk.field_e - -1 & 127;
                    if (ad.field_b != var3) {
                      kk.field_b[fk.field_e] = var2;
                      pi.field_b[fk.field_e] = (char)0;
                      fk.field_e = var3;
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
                if ((var2 ^ -1) <= -1) {
                  var3 = fk.field_e - -1 & 127;
                  if (ad.field_b != var3) {
                    kk.field_b[fk.field_e] = var2;
                    pi.field_b[fk.field_e] = (char)0;
                    fk.field_e = var3;
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
                  }
                }
              }
            } else {
              var2 = -1;
              if (0 <= qj.field_h) {
                L1: {
                  if (-1 >= (var2 ^ -1)) {
                    ni.field_b[qj.field_h] = var2;
                    qj.field_h = 1 + qj.field_h & 127;
                    if (qj.field_h != hh.field_b) {
                      break L1;
                    } else {
                      qj.field_h = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if ((var2 ^ -1) <= -1) {
                  var3 = fk.field_e - -1 & 127;
                  if (ad.field_b != var3) {
                    kk.field_b[fk.field_e] = var2;
                    pi.field_b[fk.field_e] = (char)0;
                    fk.field_e = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
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
              } else {
                L2: {
                  if ((var2 ^ -1) <= -1) {
                    var3 = fk.field_e - -1 & 127;
                    if (ad.field_b != var3) {
                      kk.field_b[fk.field_e] = var2;
                      pi.field_b[fk.field_e] = (char)0;
                      fk.field_e = var3;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
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
          } else {
            L3: {
              var2 = -1;
              if (0 > qj.field_h) {
                break L3;
              } else {
                if (-1 >= (var2 ^ -1)) {
                  ni.field_b[qj.field_h] = var2;
                  qj.field_h = 1 + qj.field_h & 127;
                  if (qj.field_h != hh.field_b) {
                    break L3;
                  } else {
                    qj.field_h = -1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if ((var2 ^ -1) <= -1) {
                var3 = fk.field_e - -1 & 127;
                if (ad.field_b != var3) {
                  kk.field_b[fk.field_e] = var2;
                  pi.field_b[fk.field_e] = (char)0;
                  fk.field_e = var3;
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
        } else {
          return;
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (wc.field_i != null) {
          km.field_f = 0;
          var2 = param0.getKeyCode();
          if (-1 >= var2) {
            if (var2 < qj.field_a.length) {
              var2 = -129 & qj.field_a[var2];
              if (0 <= qj.field_h) {
                if (-1 >= (var2 ^ -1)) {
                  ni.field_b[qj.field_h] = var2 ^ -1;
                  qj.field_h = 127 & 1 + qj.field_h;
                  if (hh.field_b == qj.field_h) {
                    qj.field_h = -1;
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
              if (0 > qj.field_h) {
                param0.consume();
                return;
              } else {
                if (-1 >= (var2 ^ -1)) {
                  ni.field_b[qj.field_h] = var2 ^ -1;
                  qj.field_h = 127 & 1 + qj.field_h;
                  if (hh.field_b == qj.field_h) {
                    qj.field_h = -1;
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
            if (0 > qj.field_h) {
              param0.consume();
              return;
            } else {
              if (-1 <= var2) {
                ni.field_b[qj.field_h] = var2 ^ -1;
                qj.field_h = 127 & 1 + qj.field_h;
                if (hh.field_b == qj.field_h) {
                  qj.field_h = -1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This control is disabled. To enable it, click on <col=1f76a6><%0></col> in the options menu.";
        field_b = "Unrated game";
        field_c = "Asking for or providing contact information";
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_e = new ji[23];
    }
}
