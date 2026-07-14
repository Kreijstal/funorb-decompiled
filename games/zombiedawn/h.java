/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_e;
    static boolean field_c;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != ng.field_b) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != ng.field_b) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(vn[] param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param3 == -17) {
          if (-1 != param1) {
            L0: {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == 2) {
                      break L2;
                    } else {
                      if (-4 == param1) {
                        param0[param2].a();
                        param0[param4].e(0, 0);
                        var5 = 0;
                        L3: while (true) {
                          if ((var5 ^ -1) <= -25) {
                            if (0 == 0) {
                              break L0;
                            } else {
                              break L2;
                            }
                          } else {
                            bi.a(0, var5, 24, 0, 5 * var5);
                            var5++;
                            if (0 == 0) {
                              continue L3;
                            } else {
                              if (0 == 0) {
                                cn.field_f.b(-124);
                                return;
                              } else {
                                param0[param2].a();
                                param0[param4].e(0, 0);
                                var5 = 0;
                                L4: while (true) {
                                  L5: {
                                    if (24 <= var5) {
                                      break L5;
                                    } else {
                                      bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                      var5++;
                                      if (0 == 0) {
                                        continue L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  cn.field_f.b(-124);
                                  return;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (param1 == 4) {
                          param0[param2].a();
                          param0[param4].e(0, 0);
                          var5 = 0;
                          L6: while (true) {
                            if ((var5 ^ -1) > -25) {
                              bi.a(0, var5, 24, 0, -(var5 * 5) + 120);
                              var5++;
                              if (0 == 0) {
                                continue L6;
                              } else {
                                L7: {
                                  if (0 == 0) {
                                    break L7;
                                  } else {
                                    param0[param2].a();
                                    param0[param4].e(0, 0);
                                    var5 = 0;
                                    L8: while (true) {
                                      L9: {
                                        if ((var5 ^ -1) <= -25) {
                                          break L9;
                                        } else {
                                          bi.a(0, var5, 24, 0, 5 * var5);
                                          var5++;
                                          if (0 == 0) {
                                            continue L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L7;
                                      } else {
                                        param0[param2].a();
                                        param0[param4].e(0, 0);
                                        var5 = 0;
                                        L10: while (true) {
                                          L11: {
                                            if (24 <= var5) {
                                              break L11;
                                            } else {
                                              bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                              var5++;
                                              if (0 == 0) {
                                                continue L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          if (0 == 0) {
                                            break L7;
                                          } else {
                                            param0[param2].a();
                                            param0[param4].e(0, 0);
                                            var5 = 0;
                                            L12: while (true) {
                                              L13: {
                                                if (var5 >= 24) {
                                                  break L13;
                                                } else {
                                                  bi.g(var5, 0, 24, 0, 5 * var5);
                                                  var5++;
                                                  if (0 == 0) {
                                                    continue L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              if (0 == 0) {
                                                break L7;
                                              } else {
                                                param0[param2].a();
                                                param0[param4].e(0, 0);
                                                bi.a(0, 0, 24, 24, 0, 128);
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                cn.field_f.b(-124);
                                return;
                              }
                            } else {
                              cn.field_f.b(-124);
                              return;
                            }
                          }
                        } else {
                          if (6 == param1) {
                            param0[param2].a();
                            param0[param4].e(0, 0);
                            var5 = 0;
                            L14: while (true) {
                              if (24 > var5) {
                                bi.a(var5 + 1, var5, -var5 + 24, 0, var5 * 5);
                                bi.g(var5, var5, 24 - var5, 0, 5 * var5);
                                var5++;
                                if (0 == 0) {
                                  continue L14;
                                } else {
                                  L15: {
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      param0[param2].a();
                                      param0[param4].e(0, 0);
                                      var5 = 0;
                                      L16: while (true) {
                                        L17: {
                                          if ((var5 ^ -1) <= -25) {
                                            break L17;
                                          } else {
                                            bi.a(0, var5, 24, 0, -(var5 * 5) + 120);
                                            var5++;
                                            if (0 == 0) {
                                              continue L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        if (0 == 0) {
                                          break L15;
                                        } else {
                                          param0[param2].a();
                                          param0[param4].e(0, 0);
                                          var5 = 0;
                                          L18: while (true) {
                                            L19: {
                                              if ((var5 ^ -1) <= -25) {
                                                break L19;
                                              } else {
                                                bi.a(0, var5, 24, 0, 5 * var5);
                                                var5++;
                                                if (0 == 0) {
                                                  continue L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            if (0 == 0) {
                                              break L15;
                                            } else {
                                              param0[param2].a();
                                              param0[param4].e(0, 0);
                                              var5 = 0;
                                              L20: while (true) {
                                                L21: {
                                                  if (24 <= var5) {
                                                    break L21;
                                                  } else {
                                                    bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                                    var5++;
                                                    if (0 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                if (0 == 0) {
                                                  break L15;
                                                } else {
                                                  param0[param2].a();
                                                  param0[param4].e(0, 0);
                                                  var5 = 0;
                                                  L22: while (true) {
                                                    L23: {
                                                      if (var5 >= 24) {
                                                        break L23;
                                                      } else {
                                                        bi.g(var5, 0, 24, 0, 5 * var5);
                                                        var5++;
                                                        if (0 == 0) {
                                                          continue L22;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    if (0 == 0) {
                                                      break L15;
                                                    } else {
                                                      param0[param2].a();
                                                      param0[param4].e(0, 0);
                                                      bi.a(0, 0, 24, 24, 0, 128);
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  cn.field_f.b(-124);
                                  return;
                                }
                              } else {
                                cn.field_f.b(-124);
                                return;
                              }
                            }
                          } else {
                            if (param1 != 8) {
                              if (-8 != param1) {
                                if (-6 == param1) {
                                  param0[param2].a();
                                  param0[param4].e(0, 0);
                                  var5 = 0;
                                  L24: while (true) {
                                    L25: {
                                      if (-25 <= var5) {
                                        break L25;
                                      } else {
                                        bi.a(24 + -var5, var5, var5, 0, -(var5 * 5) + 120);
                                        bi.g(var5, 0, 24 - var5, 0, 5 * var5);
                                        var5++;
                                        if (0 == 0) {
                                          continue L24;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    cn.field_f.b(-124);
                                    return;
                                  }
                                } else {
                                  cn.field_f.b(-124);
                                  return;
                                }
                              } else {
                                param0[param2].a();
                                param0[param4].e(0, 0);
                                var5 = 0;
                                if (-25 > var5) {
                                  bi.a(0, var5, 24 + -var5, 0, var5 * 5);
                                  bi.g(var5, -var5 + 24, var5, 0, 120 - var5 * 5);
                                  var5++;
                                  return;
                                } else {
                                  cn.field_f.b(-124);
                                  return;
                                }
                              }
                            } else {
                              param0[param2].a();
                              param0[param4].e(0, 0);
                              var5 = 0;
                              if (var5 < 24) {
                                bi.a(0, var5, var5 + 1, 0, -(5 * var5) + 120);
                                bi.g(var5, 0, var5, 0, -(5 * var5) + 120);
                                var5++;
                                return;
                              } else {
                                cn.field_f.b(-124);
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  param0[param2].a();
                  param0[param4].e(0, 0);
                  var5 = 0;
                  L26: while (true) {
                    if (24 <= var5) {
                      if (0 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                      var5++;
                      if (0 == 0) {
                        continue L26;
                      } else {
                        L27: {
                          if (0 == 0) {
                            break L27;
                          } else {
                            param0[param2].a();
                            param0[param4].e(0, 0);
                            var5 = 0;
                            L28: while (true) {
                              if (var5 >= 24) {
                                if (0 == 0) {
                                  break L27;
                                } else {
                                  param0[param2].a();
                                  param0[param4].e(0, 0);
                                  bi.a(0, 0, 24, 24, 0, 128);
                                  cn.field_f.b(-124);
                                  return;
                                }
                              } else {
                                bi.g(var5, 0, 24, 0, 5 * var5);
                                var5++;
                                if (0 == 0) {
                                  continue L28;
                                } else {
                                  if (0 == 0) {
                                    cn.field_f.b(-124);
                                    return;
                                  } else {
                                    param0[param2].a();
                                    param0[param4].e(0, 0);
                                    bi.a(0, 0, 24, 24, 0, 128);
                                    cn.field_f.b(-124);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                        }
                        cn.field_f.b(-124);
                        return;
                      }
                    }
                  }
                }
              }
              param0[param2].a();
              param0[param4].e(0, 0);
              var5 = 0;
              L29: while (true) {
                if (var5 >= 24) {
                  if (0 == 0) {
                    break L0;
                  } else {
                    param0[param2].a();
                    param0[param4].e(0, 0);
                    bi.a(0, 0, 24, 24, 0, 128);
                    cn.field_f.b(-124);
                    return;
                  }
                } else {
                  bi.g(var5, 0, 24, 0, 5 * var5);
                  var5++;
                  if (0 == 0) {
                    continue L29;
                  } else {
                    if (0 == 0) {
                      cn.field_f.b(-124);
                      return;
                    } else {
                      param0[param2].a();
                      param0[param4].e(0, 0);
                      bi.a(0, 0, 24, 24, 0, 128);
                      cn.field_f.b(-124);
                      return;
                    }
                  }
                }
              }
            }
            cn.field_f.b(-124);
            return;
          } else {
            param0[param2].a();
            param0[param4].e(0, 0);
            bi.a(0, 0, 24, 24, 0, 128);
            cn.field_f.b(-124);
            return;
          }
        } else {
          return;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    final static v[] a(dj param0, int param1, int param2, int param3) {
        Object var5 = null;
        if (param2 <= -68) {
          if (!ph.a(param1, 31043, param3, param0)) {
            return null;
          } else {
            return di.a(-79);
          }
        } else {
          var5 = null;
          h.a((vn[]) null, -98, 92, (byte) 28, 20);
          if (!ph.a(param1, 31043, param3, param0)) {
            return null;
          } else {
            return di.a(-79);
          }
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (ng.field_b != null) {
            wc.field_Ob = 0;
            lf.field_m = -1;
            vg.field_c = -1;
            kg.field_l = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != ng.field_b) {
          wc.field_Ob = 0;
          ep.field_m = param0.getX();
          pf.field_c = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              nb.field_j = 1;
              le.field_c = 1;
              var2 = param0.getModifiers();
              kg.field_l = true;
              if ((var2 & 8) != 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 16) == 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != (var2 & 4)) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
              return;
            }
          } else {
            L3: {
              nb.field_j = 2;
              le.field_c = 2;
              var2 = param0.getModifiers();
              kg.field_l = true;
              if ((var2 & 8) != 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var2 & 16) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (var2 & 4)) {
                break L5;
              } else {
                break L5;
              }
            }
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ng.field_b != null) {
          L0: {
            wc.field_Ob = 0;
            le.field_c = 0;
            kg.field_l = true;
            var2 = param0.getModifiers();
            if ((var2 & 4) != 0) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 == (var2 & 8 ^ -1)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((var2 & 16) != 0) {
              break L2;
            } else {
              break L2;
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        } else {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == ng.field_b)) {
            le.field_c = 0;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -14380) {
            h.a(-106);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == ng.field_b)) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 25;
        field_e = new int[61];
    }
}
