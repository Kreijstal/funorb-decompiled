/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rrb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static llb field_b;

    final static void a(byte param0) {
        int var1 = 56 / ((0 - param0) / 50);
    }

    final static int a(int param0, int param1) {
        if (param0 != 22433) {
          field_b = null;
          return -4096 + (4096 ^ param1 & 8191);
        } else {
          return -4096 + (4096 ^ param1 & 8191);
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != gha.field_q) {
          L0: {
            baa.field_q = 0;
            var2 = param0.getKeyCode();
            if (var2 < 0) {
              var2 = -1;
              break L0;
            } else {
              if (ee.field_o.length > var2) {
                var2 = ee.field_o[var2] & -129;
                break L0;
              } else {
                var2 = -1;
                if (-1 >= (dh.field_p ^ -1)) {
                  if (var2 >= 0) {
                    kq.field_o[dh.field_p] = var2 ^ -1;
                    dh.field_p = 127 & 1 + dh.field_p;
                    if (wlb.field_p != dh.field_p) {
                      param0.consume();
                      return;
                    } else {
                      dh.field_p = -1;
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
          if (-1 >= (dh.field_p ^ -1)) {
            if (var2 >= 0) {
              kq.field_o[dh.field_p] = var2 ^ -1;
              dh.field_p = 127 & 1 + dh.field_p;
              if (wlb.field_p == dh.field_p) {
                dh.field_p = -1;
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

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != gha.field_q) {
          var2 = param0.getKeyChar();
          if (0 != var2) {
            if (var2 != 65535) {
              if (mia.a((char) var2, true)) {
                var3 = tna.field_o + 1 & 127;
                if (var3 == bva.field_c) {
                  param0.consume();
                  return;
                } else {
                  npa.field_a[tna.field_o] = -1;
                  gca.field_q[tna.field_o] = (char)var2;
                  tna.field_o = var3;
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
        if (null != gha.field_q) {
          baa.field_q = 0;
          var2 = param0.getKeyCode();
          if (0 <= var2) {
            if (ee.field_o.length > var2) {
              var2 = ee.field_o[var2];
              if ((128 & var2) != 0) {
                L0: {
                  var2 = -1;
                  if (dh.field_p < 0) {
                    break L0;
                  } else {
                    if ((var2 ^ -1) > -1) {
                      break L0;
                    } else {
                      kq.field_o[dh.field_p] = var2;
                      dh.field_p = dh.field_p + 1 & 127;
                      if (dh.field_p == wlb.field_p) {
                        dh.field_p = -1;
                        break L0;
                      } else {
                        L1: {
                          if (0 <= var2) {
                            var3 = 127 & 1 + tna.field_o;
                            if (var3 == bva.field_c) {
                              break L1;
                            } else {
                              npa.field_a[tna.field_o] = var2;
                              gca.field_q[tna.field_o] = (char)0;
                              tna.field_o = var3;
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
                if (0 <= var2) {
                  var3 = 127 & 1 + tna.field_o;
                  if (var3 == bva.field_c) {
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
                    npa.field_a[tna.field_o] = var2;
                    gca.field_q[tna.field_o] = (char)0;
                    tna.field_o = var3;
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
                L2: {
                  if (dh.field_p < 0) {
                    break L2;
                  } else {
                    if ((var2 ^ -1) > -1) {
                      break L2;
                    } else {
                      kq.field_o[dh.field_p] = var2;
                      dh.field_p = dh.field_p + 1 & 127;
                      if (dh.field_p == wlb.field_p) {
                        dh.field_p = -1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if (0 <= var2) {
                  var3 = 127 & 1 + tna.field_o;
                  if (var3 == bva.field_c) {
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
                    npa.field_a[tna.field_o] = var2;
                    gca.field_q[tna.field_o] = (char)0;
                    tna.field_o = var3;
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
              L3: {
                var2 = -1;
                if (dh.field_p < 0) {
                  break L3;
                } else {
                  if ((var2 ^ -1) > -1) {
                    break L3;
                  } else {
                    kq.field_o[dh.field_p] = var2;
                    dh.field_p = dh.field_p + 1 & 127;
                    if (dh.field_p == wlb.field_p) {
                      dh.field_p = -1;
                      break L3;
                    } else {
                      L4: {
                        if (0 <= var2) {
                          var3 = 127 & 1 + tna.field_o;
                          if (var3 == bva.field_c) {
                            break L4;
                          } else {
                            npa.field_a[tna.field_o] = var2;
                            gca.field_q[tna.field_o] = (char)0;
                            tna.field_o = var3;
                            break L4;
                          }
                        } else {
                          break L4;
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
              if (0 <= var2) {
                var3 = 127 & 1 + tna.field_o;
                if (var3 == bva.field_c) {
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
                  npa.field_a[tna.field_o] = var2;
                  gca.field_q[tna.field_o] = (char)0;
                  tna.field_o = var3;
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
          } else {
            L5: {
              var2 = -1;
              if (dh.field_p < 0) {
                break L5;
              } else {
                if ((var2 ^ -1) > -1) {
                  break L5;
                } else {
                  kq.field_o[dh.field_p] = var2;
                  dh.field_p = dh.field_p + 1 & 127;
                  if (dh.field_p == wlb.field_p) {
                    dh.field_p = -1;
                    break L5;
                  } else {
                    L6: {
                      if (0 <= var2) {
                        var3 = 127 & 1 + tna.field_o;
                        if (var3 == bva.field_c) {
                          break L6;
                        } else {
                          npa.field_a[tna.field_o] = var2;
                          gca.field_q[tna.field_o] = (char)0;
                          tna.field_o = var3;
                          break L6;
                        }
                      } else {
                        break L6;
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
            if (0 <= var2) {
              var3 = 127 & 1 + tna.field_o;
              if (var3 == bva.field_c) {
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
                npa.field_a[tna.field_o] = var2;
                gca.field_q[tna.field_o] = (char)0;
                tna.field_o = var3;
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

    final static abb b(int param0) {
        if (param0 >= -37) {
            field_a = 79;
            return (abb) (Object) new tgb();
        }
        return (abb) (Object) new tgb();
    }

    final static int a(byte param0, int param1, int param2, int param3, String param4) {
        if (param0 > 23) {
          if (li.field_i) {
            return de.a(param2, 300).a(param3, param4, true, (aja[]) null);
          } else {
            return ita.a(param2, 7988).b(param4, param3);
          }
        } else {
          rrb.a(115);
          if (li.field_i) {
            return de.a(param2, 300).a(param3, param4, true, (aja[]) null);
          } else {
            return ita.a(param2, 7988).b(param4, param3);
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == gha.field_q)) {
            dh.field_p = -1;
        }
    }

    public static void a(int param0) {
        if (param0 >= -1) {
            abb discarded$0 = rrb.b(-72);
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 40;
    }
}
