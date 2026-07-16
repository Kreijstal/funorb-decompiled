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
          L0: {
            if (-1 == (param1 ^ -1)) {
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    if (param1 == 1) {
                      break L3;
                    } else {
                      L4: {
                        if (param1 == 2) {
                          break L4;
                        } else {
                          L5: {
                            if (-4 == (param1 ^ -1)) {
                              break L5;
                            } else {
                              L6: {
                                if (param1 == 4) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (6 == param1) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (param1 != 8) {
                                          break L8;
                                        } else {
                                          param0[param2].a();
                                          param0[param4].e(0, 0);
                                          var5 = 0;
                                          L9: while (true) {
                                            L10: {
                                              if (var5 >= 24) {
                                                break L10;
                                              } else {
                                                bi.a(0, var5, var5 + 1, 0, -(5 * var5) + 120);
                                                bi.g(var5, 0, var5, 0, -(5 * var5) + 120);
                                                var5++;
                                                if (0 == 0) {
                                                  if (0 == 0) {
                                                    continue L9;
                                                  } else {
                                                    break L10;
                                                  }
                                                } else {
                                                  return;
                                                }
                                              }
                                            }
                                            if (0 != 0) {
                                              break L8;
                                            } else {
                                              cn.field_f.b(-124);
                                              return;
                                            }
                                          }
                                        }
                                      }
                                      L11: {
                                        if (-8 != (param1 ^ -1)) {
                                          break L11;
                                        } else {
                                          param0[param2].a();
                                          param0[param4].e(0, 0);
                                          var5 = 0;
                                          L12: while (true) {
                                            L13: {
                                              if (-25 >= (var5 ^ -1)) {
                                                break L13;
                                              } else {
                                                bi.a(0, var5, 24 + -var5, 0, var5 * 5);
                                                bi.g(var5, -var5 + 24, var5, 0, 120 - var5 * 5);
                                                var5++;
                                                if (0 == 0) {
                                                  if (0 == 0) {
                                                    continue L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                } else {
                                                  return;
                                                }
                                              }
                                            }
                                            if (0 != 0) {
                                              break L11;
                                            } else {
                                              cn.field_f.b(-124);
                                              return;
                                            }
                                          }
                                        }
                                      }
                                      if (-6 != (param1 ^ -1)) {
                                        break L2;
                                      } else {
                                        param0[param2].a();
                                        param0[param4].e(0, 0);
                                        var5 = 0;
                                        L14: while (true) {
                                          L15: {
                                            if (-25 >= (var5 ^ -1)) {
                                              break L15;
                                            } else {
                                              bi.a(24 + -var5, var5, var5, 0, -(var5 * 5) + 120);
                                              bi.g(var5, 0, 24 - var5, 0, 5 * var5);
                                              var5++;
                                              if (0 != 0) {
                                                break L1;
                                              } else {
                                                if (0 == 0) {
                                                  continue L14;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  param0[param2].a();
                                  param0[param4].e(0, 0);
                                  var5 = 0;
                                  L16: while (true) {
                                    if (24 <= var5) {
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      bi.a(var5 + 1, var5, -var5 + 24, 0, var5 * 5);
                                      bi.g(var5, var5, 24 - var5, 0, 5 * var5);
                                      var5++;
                                      if (0 != 0) {
                                        break L1;
                                      } else {
                                        if (0 == 0) {
                                          continue L16;
                                        } else {
                                          L17: {
                                            L18: {
                                              if (0 == 0) {
                                                break L18;
                                              } else {
                                                param0[param2].a();
                                                param0[param4].e(0, 0);
                                                var5 = 0;
                                                L19: while (true) {
                                                  L20: {
                                                    if ((var5 ^ -1) <= -25) {
                                                      break L20;
                                                    } else {
                                                      bi.a(0, var5, 24, 0, -(var5 * 5) + 120);
                                                      var5++;
                                                      if (0 != 0) {
                                                        break L17;
                                                      } else {
                                                        if (0 == 0) {
                                                          continue L19;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (0 == 0) {
                                                    break L18;
                                                  } else {
                                                    param0[param2].a();
                                                    param0[param4].e(0, 0);
                                                    var5 = 0;
                                                    L21: while (true) {
                                                      L22: {
                                                        if ((var5 ^ -1) <= -25) {
                                                          break L22;
                                                        } else {
                                                          bi.a(0, var5, 24, 0, 5 * var5);
                                                          var5++;
                                                          if (0 != 0) {
                                                            break L17;
                                                          } else {
                                                            if (0 == 0) {
                                                              continue L21;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (0 == 0) {
                                                        break L18;
                                                      } else {
                                                        param0[param2].a();
                                                        param0[param4].e(0, 0);
                                                        var5 = 0;
                                                        L23: while (true) {
                                                          L24: {
                                                            if (24 <= var5) {
                                                              break L24;
                                                            } else {
                                                              bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                                              var5++;
                                                              if (0 != 0) {
                                                                break L17;
                                                              } else {
                                                                if (0 == 0) {
                                                                  continue L23;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (0 == 0) {
                                                            break L18;
                                                          } else {
                                                            param0[param2].a();
                                                            param0[param4].e(0, 0);
                                                            var5 = 0;
                                                            L25: while (true) {
                                                              L26: {
                                                                if (var5 >= 24) {
                                                                  break L26;
                                                                } else {
                                                                  bi.g(var5, 0, 24, 0, 5 * var5);
                                                                  var5++;
                                                                  if (0 != 0) {
                                                                    break L17;
                                                                  } else {
                                                                    if (0 == 0) {
                                                                      continue L25;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              if (0 == 0) {
                                                                break L18;
                                                              } else {
                                                                param0[param2].a();
                                                                param0[param4].e(0, 0);
                                                                bi.a(0, 0, 24, 24, 0, 128);
                                                                break L18;
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
                                            break L17;
                                          }
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              param0[param2].a();
                              param0[param4].e(0, 0);
                              var5 = 0;
                              L27: while (true) {
                                if ((var5 ^ -1) <= -25) {
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  bi.a(0, var5, 24, 0, -(var5 * 5) + 120);
                                  var5++;
                                  if (0 != 0) {
                                    break L1;
                                  } else {
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      L28: {
                                        L29: {
                                          if (0 == 0) {
                                            break L29;
                                          } else {
                                            param0[param2].a();
                                            param0[param4].e(0, 0);
                                            var5 = 0;
                                            L30: while (true) {
                                              L31: {
                                                if ((var5 ^ -1) <= -25) {
                                                  break L31;
                                                } else {
                                                  bi.a(0, var5, 24, 0, 5 * var5);
                                                  var5++;
                                                  if (0 != 0) {
                                                    break L28;
                                                  } else {
                                                    if (0 == 0) {
                                                      continue L30;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                              }
                                              if (0 == 0) {
                                                break L29;
                                              } else {
                                                param0[param2].a();
                                                param0[param4].e(0, 0);
                                                var5 = 0;
                                                L32: while (true) {
                                                  L33: {
                                                    if (24 <= var5) {
                                                      break L33;
                                                    } else {
                                                      bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                                      var5++;
                                                      if (0 != 0) {
                                                        break L28;
                                                      } else {
                                                        if (0 == 0) {
                                                          continue L32;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (0 == 0) {
                                                    break L29;
                                                  } else {
                                                    param0[param2].a();
                                                    param0[param4].e(0, 0);
                                                    var5 = 0;
                                                    L34: while (true) {
                                                      L35: {
                                                        if (var5 >= 24) {
                                                          break L35;
                                                        } else {
                                                          bi.g(var5, 0, 24, 0, 5 * var5);
                                                          var5++;
                                                          if (0 != 0) {
                                                            break L28;
                                                          } else {
                                                            if (0 == 0) {
                                                              continue L34;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (0 == 0) {
                                                        break L29;
                                                      } else {
                                                        param0[param2].a();
                                                        param0[param4].e(0, 0);
                                                        bi.a(0, 0, 24, 24, 0, 128);
                                                        break L29;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        cn.field_f.b(-124);
                                        break L28;
                                      }
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          param0[param2].a();
                          param0[param4].e(0, 0);
                          var5 = 0;
                          L36: while (true) {
                            if ((var5 ^ -1) <= -25) {
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            } else {
                              bi.a(0, var5, 24, 0, 5 * var5);
                              var5++;
                              if (0 != 0) {
                                break L1;
                              } else {
                                if (0 == 0) {
                                  continue L36;
                                } else {
                                  L37: {
                                    if (0 == 0) {
                                      cn.field_f.b(-124);
                                      break L37;
                                    } else {
                                      param0[param2].a();
                                      param0[param4].e(0, 0);
                                      var5 = 0;
                                      L38: while (true) {
                                        L39: {
                                          if (24 <= var5) {
                                            break L39;
                                          } else {
                                            bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                                            var5++;
                                            if (0 != 0) {
                                              break L37;
                                            } else {
                                              if (0 == 0) {
                                                continue L38;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                        }
                                        if (0 == 0) {
                                          cn.field_f.b(-124);
                                          return;
                                        } else {
                                          param0[param2].a();
                                          param0[param4].e(0, 0);
                                          var5 = 0;
                                          L40: while (true) {
                                            L41: {
                                              if (var5 >= 24) {
                                                break L41;
                                              } else {
                                                bi.g(var5, 0, 24, 0, 5 * var5);
                                                var5++;
                                                if (0 != 0) {
                                                  break L37;
                                                } else {
                                                  if (0 == 0) {
                                                    continue L40;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                            }
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
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      param0[param2].a();
                      param0[param4].e(0, 0);
                      var5 = 0;
                      L42: while (true) {
                        if (24 <= var5) {
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          bi.g(var5, 0, 24, 0, -(var5 * 5) + 120);
                          var5++;
                          if (0 != 0) {
                            break L1;
                          } else {
                            if (0 == 0) {
                              continue L42;
                            } else {
                              L43: {
                                L44: {
                                  if (0 == 0) {
                                    break L44;
                                  } else {
                                    param0[param2].a();
                                    param0[param4].e(0, 0);
                                    var5 = 0;
                                    L45: while (true) {
                                      if (var5 >= 24) {
                                        if (0 == 0) {
                                          break L44;
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
                                        if (0 != 0) {
                                          break L43;
                                        } else {
                                          if (0 == 0) {
                                            continue L45;
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
                                }
                                cn.field_f.b(-124);
                                break L43;
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  param0[param2].a();
                  param0[param4].e(0, 0);
                  var5 = 0;
                  L46: while (true) {
                    if (var5 >= 24) {
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L0;
                      }
                    } else {
                      bi.g(var5, 0, 24, 0, 5 * var5);
                      var5++;
                      if (0 != 0) {
                        break L1;
                      } else {
                        if (0 == 0) {
                          continue L46;
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
                break L1;
              }
              return;
            }
          }
          param0[param2].a();
          param0[param4].e(0, 0);
          bi.a(0, 0, 24, 24, 0, 128);
          cn.field_f.b(-124);
          return;
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
