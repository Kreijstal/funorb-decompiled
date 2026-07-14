/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dm field_a;
    static String field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (je.field_j != null) {
          nk.field_e = 0;
          var2 = param0.getKeyCode();
          if (var2 <= -1) {
            if (oe.field_P.length > var2) {
              var2 = oe.field_P[var2];
              if (-1 == (var2 & 128)) {
                if (-1 <= ii.field_c) {
                  if (var2 >= 0) {
                    gf.field_c[ii.field_c] = var2;
                    ii.field_c = 127 & 1 + ii.field_c;
                    if (gk.field_b == ii.field_c) {
                      ii.field_c = -1;
                      if (var2 >= 0) {
                        var3 = 127 & 1 + ba.field_c;
                        if (var3 != vd.field_n) {
                          kj.field_O[ba.field_c] = var2;
                          ai.field_n[ba.field_c] = (char)0;
                          ba.field_c = var3;
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
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
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
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
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                      if (var2 >= 0) {
                        var3 = 127 & 1 + ba.field_c;
                        if (var3 != vd.field_n) {
                          kj.field_O[ba.field_c] = var2;
                          ai.field_n[ba.field_c] = (char)0;
                          ba.field_c = var3;
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
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
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            return;
                          } else {
                            if (85 == var2) {
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
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                      var3 = 127 & 1 + ba.field_c;
                      if (var3 != vd.field_n) {
                        kj.field_O[ba.field_c] = var2;
                        ai.field_n[ba.field_c] = (char)0;
                        ba.field_c = var3;
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
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
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                    var3 = 127 & 1 + ba.field_c;
                    if (var3 != vd.field_n) {
                      kj.field_O[ba.field_c] = var2;
                      ai.field_n[ba.field_c] = (char)0;
                      ba.field_c = var3;
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 == var2) {
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
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
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
                  if (-1 > ii.field_c) {
                    break L0;
                  } else {
                    if (var2 < 0) {
                      break L0;
                    } else {
                      gf.field_c[ii.field_c] = var2;
                      ii.field_c = 127 & 1 + ii.field_c;
                      if (gk.field_b == ii.field_c) {
                        ii.field_c = -1;
                        break L0;
                      } else {
                        L1: {
                          if (var2 >= 0) {
                            var3 = 127 & 1 + ba.field_c;
                            if (var3 != vd.field_n) {
                              kj.field_O[ba.field_c] = var2;
                              ai.field_n[ba.field_c] = (char)0;
                              ba.field_c = var3;
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
                  var3 = 127 & 1 + ba.field_c;
                  if (var3 != vd.field_n) {
                    kj.field_O[ba.field_c] = var2;
                    ai.field_n[ba.field_c] = (char)0;
                    ba.field_c = var3;
                    var3 = param0.getModifiers();
                    if ((var3 & 10) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 == var2) {
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
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
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
                if (-1 < (ii.field_c ^ -1)) {
                  break L2;
                } else {
                  if (var2 < 0) {
                    break L2;
                  } else {
                    gf.field_c[ii.field_c] = var2;
                    ii.field_c = 127 & 1 + ii.field_c;
                    if (gk.field_b == ii.field_c) {
                      ii.field_c = -1;
                      break L2;
                    } else {
                      L3: {
                        if (var2 >= 0) {
                          var3 = 127 & 1 + ba.field_c;
                          if (var3 != vd.field_n) {
                            kj.field_O[ba.field_c] = var2;
                            ai.field_n[ba.field_c] = (char)0;
                            ba.field_c = var3;
                            break L3;
                          } else {
                            var3 = param0.getModifiers();
                            if ((var3 & 10) == 0) {
                              if (85 != var2) {
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
                          break L3;
                        }
                      }
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        return;
                      } else {
                        if (85 != var2) {
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
                      }
                    }
                  }
                }
              }
              if (var2 >= 0) {
                var3 = 127 & 1 + ba.field_c;
                if (var3 != vd.field_n) {
                  kj.field_O[ba.field_c] = var2;
                  ai.field_n[ba.field_c] = (char)0;
                  ba.field_c = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
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
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
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
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2) {
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
              if (-1 > ii.field_c) {
                break L4;
              } else {
                if (var2 < 0) {
                  break L4;
                } else {
                  gf.field_c[ii.field_c] = var2;
                  ii.field_c = 127 & 1 + ii.field_c;
                  if (gk.field_b == ii.field_c) {
                    ii.field_c = -1;
                    break L4;
                  } else {
                    L5: {
                      if (var2 >= 0) {
                        var3 = 127 & 1 + ba.field_c;
                        if (var3 != vd.field_n) {
                          kj.field_O[ba.field_c] = var2;
                          ai.field_n[ba.field_c] = (char)0;
                          ba.field_c = var3;
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
            if (var2 >= 0) {
              var3 = 127 & 1 + ba.field_c;
              if (var3 != vd.field_n) {
                kj.field_O[ba.field_c] = var2;
                ai.field_n[ba.field_c] = (char)0;
                ba.field_c = var3;
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (85 != var2) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (85 != var2) {
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
              var3 = param0.getModifiers();
              if ((var3 & 10) == 0) {
                if (85 != var2) {
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
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 31997) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (je.field_j != null) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (tc.a((byte) -112, (char) var2)) {
                var3 = 1 + ba.field_c & 127;
                if (var3 == vd.field_n) {
                  param0.consume();
                  return;
                } else {
                  kj.field_O[ba.field_c] = -1;
                  ai.field_n[ba.field_c] = (char)var2;
                  ba.field_c = var3;
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
        if (je.field_j != null) {
          nk.field_e = 0;
          var2 = param0.getKeyCode();
          if (var2 <= -1) {
            if (oe.field_P.length > var2) {
              var2 = oe.field_P[var2] & -129;
              if (-1 >= (ii.field_c ^ -1)) {
                if (0 <= var2) {
                  gf.field_c[ii.field_c] = var2 ^ -1;
                  ii.field_c = 1 + ii.field_c & 127;
                  if (gk.field_b == ii.field_c) {
                    ii.field_c = -1;
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
              if (-1 < (ii.field_c ^ -1)) {
                param0.consume();
                return;
              } else {
                if (0 <= var2) {
                  gf.field_c[ii.field_c] = var2 ^ -1;
                  ii.field_c = 1 + ii.field_c & 127;
                  if (gk.field_b == ii.field_c) {
                    ii.field_c = -1;
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
            if (-1 > ii.field_c) {
              param0.consume();
              return;
            } else {
              if (0 <= var2) {
                gf.field_c[ii.field_c] = var2 ^ -1;
                ii.field_c = 1 + ii.field_c & 127;
                if (gk.field_b == ii.field_c) {
                  ii.field_c = -1;
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

    final static void b(int param0) {
        Object var2 = null;
        f.b(rh.field_i, (String) null, 7697781);
        if (param0 != -1) {
            field_a = null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == je.field_j)) {
            ii.field_c = -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dm(30, 30);
        field_b = "Clear bonus!";
    }
}
