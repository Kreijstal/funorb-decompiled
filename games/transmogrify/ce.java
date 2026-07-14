/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static kg field_b;
    static int[] field_a;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (el.field_n != null) {
          vd.field_a = 0;
          var2 = param0.getKeyCode();
          if ((var2 ^ -1) <= -1) {
            L0: {
              if (tj.field_w.length <= var2) {
                var2 = -1;
                break L0;
              } else {
                var2 = tj.field_w[var2] & -129;
                break L0;
              }
            }
            if (j.field_b >= 0) {
              if ((var2 ^ -1) <= -1) {
                se.field_p[j.field_b] = var2 ^ -1;
                j.field_b = 127 & j.field_b + 1;
                if (sc.field_a == j.field_b) {
                  j.field_b = -1;
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
            if (j.field_b >= 0) {
              if ((var2 ^ -1) <= -1) {
                se.field_p[j.field_b] = var2 ^ -1;
                j.field_b = 127 & j.field_b + 1;
                if (sc.field_a != j.field_b) {
                  param0.consume();
                  return;
                } else {
                  j.field_b = -1;
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

    final static boolean a(int param0) {
        if (param0 == 0) {
          L0: {
            if (-1 == tg.field_a) {
              if (ue.a(1, 0)) {
                tg.field_a = nf.field_l.d((byte) 34);
                nf.field_l.field_h = 0;
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (1 == (tg.field_a ^ -1)) {
            if (!ue.a(2, 0)) {
              return false;
            } else {
              tg.field_a = nf.field_l.a((byte) -85);
              nf.field_l.field_h = 0;
              return ue.a(tg.field_a, param0 ^ 0);
            }
          } else {
            return ue.a(tg.field_a, param0 ^ 0);
          }
        } else {
          L1: {
            ce.a((byte) 110);
            if (-1 == tg.field_a) {
              if (ue.a(1, 0)) {
                tg.field_a = nf.field_l.d((byte) 34);
                nf.field_l.field_h = 0;
                break L1;
              } else {
                return false;
              }
            } else {
              break L1;
            }
          }
          if (1 == (tg.field_a ^ -1)) {
            if (!ue.a(2, 0)) {
              return false;
            } else {
              tg.field_a = nf.field_l.a((byte) -85);
              nf.field_l.field_h = 0;
              return ue.a(tg.field_a, param0 ^ 0);
            }
          } else {
            return ue.a(tg.field_a, param0 ^ 0);
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (el.field_n != null) {
            j.field_b = -1;
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != el.field_n) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (65535 != var2) {
              if (el.a(-9904, (char) var2)) {
                var3 = 127 & dk.field_i + 1;
                if (bg.field_l == var3) {
                  param0.consume();
                  return;
                } else {
                  te.field_c[dk.field_i] = -1;
                  hf.field_h[dk.field_i] = (char)var2;
                  dk.field_i = var3;
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
        if (el.field_n != null) {
          vd.field_a = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            L0: {
              if (tj.field_w.length > var2) {
                var2 = tj.field_w[var2];
                if (0 != (128 & var2)) {
                  var2 = -1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var2 = -1;
                break L0;
              }
            }
            if (j.field_b <= -1) {
              L1: {
                if (-1 >= var2) {
                  se.field_p[j.field_b] = var2;
                  j.field_b = j.field_b + 1 & 127;
                  if (j.field_b == sc.field_a) {
                    j.field_b = -1;
                    break L1;
                  } else {
                    if (-1 <= var2) {
                      var3 = 1 + dk.field_i & 127;
                      if (bg.field_l == var3) {
                        L2: {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            break L2;
                          } else {
                            if (var2 == -86) {
                              param0.consume();
                              break L2;
                            } else {
                              if (-11 != var2) {
                                break L2;
                              } else {
                                param0.consume();
                                break L2;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        te.field_c[dk.field_i] = var2;
                        hf.field_h[dk.field_i] = (char)0;
                        dk.field_i = var3;
                        L3: {
                          var3 = param0.getModifiers();
                          if ((var3 & 10) != 0) {
                            param0.consume();
                            break L3;
                          } else {
                            if (var2 == -86) {
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
                      L4: {
                        var3 = param0.getModifiers();
                        if ((var3 & 10) != 0) {
                          param0.consume();
                          break L4;
                        } else {
                          if (var2 == -86) {
                            param0.consume();
                            break L4;
                          } else {
                            if (-11 != var2) {
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
                } else {
                  break L1;
                }
              }
              if (-1 >= (var2 ^ -1)) {
                var3 = 1 + dk.field_i & 127;
                if (bg.field_l == var3) {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 == -86) {
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
                  te.field_c[dk.field_i] = var2;
                  hf.field_h[dk.field_i] = (char)0;
                  dk.field_i = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (var2 != -86) {
                      if (-11 != var2) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  return;
                } else {
                  if (var2 != -86) {
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
              if (-1 <= var2) {
                var3 = 1 + dk.field_i & 127;
                if (bg.field_l == var3) {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == 0) {
                    if (var2 != -86) {
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
                } else {
                  te.field_c[dk.field_i] = var2;
                  hf.field_h[dk.field_i] = (char)0;
                  dk.field_i = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) == 0) {
                    if (var2 != -86) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (var2 != -86) {
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
            L5: {
              var2 = -1;
              if (j.field_b > -1) {
                break L5;
              } else {
                if (-1 <= var2) {
                  se.field_p[j.field_b] = var2;
                  j.field_b = j.field_b + 1 & 127;
                  if (j.field_b == sc.field_a) {
                    j.field_b = -1;
                    break L5;
                  } else {
                    L6: {
                      if (-1 >= (var2 ^ -1)) {
                        var3 = 1 + dk.field_i & 127;
                        if (bg.field_l == var3) {
                          break L6;
                        } else {
                          te.field_c[dk.field_i] = var2;
                          hf.field_h[dk.field_i] = (char)0;
                          dk.field_i = var3;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var3 = param0.getModifiers();
                      if ((var3 & 10) != 0) {
                        param0.consume();
                        break L7;
                      } else {
                        if (var2 == -86) {
                          param0.consume();
                          break L7;
                        } else {
                          if (-11 != var2) {
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
                  break L5;
                }
              }
            }
            if (-1 >= (var2 ^ -1)) {
              var3 = 1 + dk.field_i & 127;
              if (bg.field_l == var3) {
                var3 = param0.getModifiers();
                if ((var3 & 10) == 0) {
                  if (var2 != -86) {
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
              } else {
                L8: {
                  te.field_c[dk.field_i] = var2;
                  hf.field_h[dk.field_i] = (char)0;
                  dk.field_i = var3;
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    param0.consume();
                    break L8;
                  } else {
                    if (var2 == -86) {
                      param0.consume();
                      break L8;
                    } else {
                      if (-11 != var2) {
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
                var3 = param0.getModifiers();
                if ((var3 & 10) != 0) {
                  param0.consume();
                  break L9;
                } else {
                  if (var2 == -86) {
                    param0.consume();
                    break L9;
                  } else {
                    if (-11 != var2) {
                      break L9;
                    } else {
                      param0.consume();
                      break L9;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -127) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
