/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static dd[] field_d;
    static rh field_a;
    String field_e;
    static int[] field_f;
    static int field_h;
    String field_b;
    static int[] field_c;
    static int field_g;
    boolean field_i;

    final static void b(int param0) {
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        var4 = fleas.field_A ? 1 : 0;
        gb.b(243, 197, 369, 143, 16777215);
        gb.e(244, param0, 367, 141, 0);
        if (null != wa.field_k) {
          var6 = wa.field_k[ql.field_o];
          if (var6 == null) {
            if (qj.field_H == null) {
              L0: {
                if (td.field_i >= hd.field_c) {
                  break L0;
                } else {
                  var7 = wa.field_k[t.field_a];
                  if (var7 == null) {
                    break L0;
                  } else {
                    var2_int = td.field_i * (60 + var7.field_x) / hd.field_c;
                    var3 = var2_int + -30;
                    if (!rc.field_i) {
                      L1: {
                        d.a(var3 * -256 / 30, 199, var7, 245, 2147483647, 256 * (-var3 + var7.field_x) / 30);
                        if (null == qj.field_H) {
                          break L1;
                        } else {
                          var2 = null;
                          var5 = 0;
                          var3 = var5;
                          L2: while (true) {
                            if (wa.field_k.length <= var5) {
                              if (var2 != null) {
                                int discarded$11 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                                break L1;
                              } else {
                                return;
                              }
                            } else {
                              var8 = wa.field_k[var5];
                              if (var8 != null) {
                                L3: {
                                  if (var8.field_x != 365) {
                                    break L3;
                                  } else {
                                    if (-140 != (var8.field_r ^ -1)) {
                                      break L3;
                                    } else {
                                      var5++;
                                      continue L2;
                                    }
                                  }
                                }
                                if (var2 != null) {
                                  var2 = (Object) (Object) (var2 + ", " + var5);
                                  var5++;
                                  continue L2;
                                } else {
                                  var2 = (Object) (Object) Integer.toString(var5);
                                  var5++;
                                  continue L2;
                                }
                              } else {
                                var5++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L4: {
                        d.a((-var3 + var7.field_x) * 256 / 30, 199, var7, 245, 2147483647, -256 * var3 / 30);
                        if (null == qj.field_H) {
                          break L4;
                        } else {
                          var2 = null;
                          var5 = 0;
                          var3 = var5;
                          L5: while (true) {
                            if (wa.field_k.length <= var5) {
                              if (var2 != null) {
                                int discarded$12 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                                break L4;
                              } else {
                                return;
                              }
                            } else {
                              var8 = wa.field_k[var5];
                              if (var8 != null) {
                                L6: {
                                  if (var8.field_x != 365) {
                                    break L6;
                                  } else {
                                    if (-140 != (var8.field_r ^ -1)) {
                                      break L6;
                                    } else {
                                      var5++;
                                      continue L5;
                                    }
                                  }
                                }
                                if (var2 != null) {
                                  var2 = (Object) (Object) (var2 + ", " + var5);
                                  var5++;
                                  continue L5;
                                } else {
                                  var2 = (Object) (Object) Integer.toString(var5);
                                  var5++;
                                  continue L5;
                                }
                              } else {
                                var5++;
                                continue L5;
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
              L7: {
                if (null == qj.field_H) {
                  break L7;
                } else {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L8: while (true) {
                    if (wa.field_k.length <= var5) {
                      if (var2 != null) {
                        int discarded$13 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L7;
                      } else {
                        return;
                      }
                    } else {
                      var8 = wa.field_k[var5];
                      if (var8 != null) {
                        L9: {
                          if (var8.field_x != 365) {
                            break L9;
                          } else {
                            if (-140 != (var8.field_r ^ -1)) {
                              break L9;
                            } else {
                              var5++;
                              continue L8;
                            }
                          }
                        }
                        if (var2 != null) {
                          var2 = (Object) (Object) (var2 + ", " + var5);
                          var5++;
                          continue L8;
                        } else {
                          var2 = (Object) (Object) Integer.toString(var5);
                          var5++;
                          continue L8;
                        }
                      } else {
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              int discarded$14 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              if (td.field_i < hd.field_c) {
                var7 = wa.field_k[t.field_a];
                if (var7 == null) {
                  if (null != qj.field_H) {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L10: while (true) {
                      if (wa.field_k.length <= var5) {
                        if (var2 != null) {
                          int discarded$15 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var8 = wa.field_k[var5];
                        if (var8 != null) {
                          L11: {
                            if (var8.field_x != 365) {
                              break L11;
                            } else {
                              if (-140 != (var8.field_r ^ -1)) {
                                break L11;
                              } else {
                                var5++;
                                continue L10;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (Object) (Object) (var2 + ", " + var5);
                            var5++;
                            continue L10;
                          } else {
                            var2 = (Object) (Object) Integer.toString(var5);
                            var5++;
                            continue L10;
                          }
                        } else {
                          var5++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  var2_int = td.field_i * (60 + var7.field_x) / hd.field_c;
                  var3 = var2_int + -30;
                  if (rc.field_i) {
                    L12: {
                      d.a((-var3 + var7.field_x) * 256 / 30, 199, var7, 245, 2147483647, -256 * var3 / 30);
                      if (null == qj.field_H) {
                        break L12;
                      } else {
                        var2 = null;
                        var5 = 0;
                        var3 = var5;
                        L13: while (true) {
                          if (wa.field_k.length <= var5) {
                            if (var2 != null) {
                              int discarded$16 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            var8 = wa.field_k[var5];
                            if (var8 != null) {
                              L14: {
                                if (var8.field_x != 365) {
                                  break L14;
                                } else {
                                  if (-140 != (var8.field_r ^ -1)) {
                                    break L14;
                                  } else {
                                    var5++;
                                    continue L13;
                                  }
                                }
                              }
                              if (var2 != null) {
                                var2 = (Object) (Object) (var2 + ", " + var5);
                                var5++;
                                continue L13;
                              } else {
                                var2 = (Object) (Object) Integer.toString(var5);
                                var5++;
                                continue L13;
                              }
                            } else {
                              var5++;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L15: {
                      d.a(var3 * -256 / 30, 199, var7, 245, 2147483647, 256 * (-var3 + var7.field_x) / 30);
                      if (null == qj.field_H) {
                        break L15;
                      } else {
                        var2 = null;
                        var5 = 0;
                        var3 = var5;
                        L16: while (true) {
                          if (wa.field_k.length <= var5) {
                            if (var2 != null) {
                              int discarded$17 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            var8 = wa.field_k[var5];
                            if (var8 != null) {
                              L17: {
                                if (var8.field_x != 365) {
                                  break L17;
                                } else {
                                  if (-140 != (var8.field_r ^ -1)) {
                                    break L17;
                                  } else {
                                    var5++;
                                    continue L16;
                                  }
                                }
                              }
                              if (var2 != null) {
                                var2 = (Object) (Object) (var2 + ", " + var5);
                                var5++;
                                continue L16;
                              } else {
                                var2 = (Object) (Object) Integer.toString(var5);
                                var5++;
                                continue L16;
                              }
                            } else {
                              var5++;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                L18: {
                  if (null == qj.field_H) {
                    break L18;
                  } else {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L19: while (true) {
                      if (wa.field_k.length <= var5) {
                        if (var2 != null) {
                          int discarded$18 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L18;
                        } else {
                          break L18;
                        }
                      } else {
                        var8 = wa.field_k[var5];
                        if (var8 != null) {
                          L20: {
                            if (var8.field_x != 365) {
                              break L20;
                            } else {
                              if (-140 != (var8.field_r ^ -1)) {
                                break L20;
                              } else {
                                var5++;
                                continue L19;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (Object) (Object) (var2 + ", " + var5);
                            var5++;
                            continue L19;
                          } else {
                            var2 = (Object) (Object) Integer.toString(var5);
                            var5++;
                            continue L19;
                          }
                        } else {
                          var5++;
                          continue L19;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L21: {
              var6.d(245, 199);
              if (td.field_i >= hd.field_c) {
                break L21;
              } else {
                var7 = wa.field_k[t.field_a];
                if (var7 == null) {
                  break L21;
                } else {
                  var2_int = td.field_i * (60 + var7.field_x) / hd.field_c;
                  var3 = var2_int + -30;
                  if (!rc.field_i) {
                    d.a(var3 * -256 / 30, 199, var7, 245, 2147483647, 256 * (-var3 + var7.field_x) / 30);
                    break L21;
                  } else {
                    d.a((-var3 + var7.field_x) * 256 / 30, 199, var7, 245, 2147483647, -256 * var3 / 30);
                    break L21;
                  }
                }
              }
            }
            if (null == qj.field_H) {
              return;
            } else {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L22: while (true) {
                if (wa.field_k.length <= var5) {
                  L23: {
                    if (var2 != null) {
                      int discarded$19 = qj.field_H.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  return;
                } else {
                  var8 = wa.field_k[var5];
                  if (var8 != null) {
                    L24: {
                      if (var8.field_x != 365) {
                        break L24;
                      } else {
                        if (-140 != (var8.field_r ^ -1)) {
                          break L24;
                        } else {
                          var5++;
                          continue L22;
                        }
                      }
                    }
                    if (var2 != null) {
                      var2 = (Object) (Object) (var2 + ", " + var5);
                      var5++;
                      continue L22;
                    } else {
                      var2 = (Object) (Object) Integer.toString(var5);
                      var5++;
                      continue L22;
                    }
                  } else {
                    var5++;
                    continue L22;
                  }
                }
              }
            }
          }
        } else {
          if (qj.field_H != null) {
            int discarded$20 = qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            return;
          } else {
            return;
          }
        }
    }

    final static boolean a(byte param0) {
        int var1 = -34 / ((-35 - param0) / 60);
        return uk.b(15000);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 > -68) {
            Object var2 = null;
            il.a((byte) 45, (java.applet.Applet) null);
        }
    }

    final static void a(boolean param0, java.awt.Component param1) {
        if (param0) {
            return;
        }
        param1.addMouseListener((java.awt.event.MouseListener) (Object) sg.field_i);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) sg.field_i);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) sg.field_i);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 77) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(ib.a(param1, var2, param0 ^ -5390), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_f = new int[4];
        field_c = new int[8192];
    }
}
