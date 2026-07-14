/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class jq implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static bi field_b;
    static bi field_c;
    static pf field_a;
    static String field_d;
    static bi field_e;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (im.field_c != null) {
          of.field_e = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            L0: {
              if (ms.field_e.length <= var2) {
                var2 = -1;
                break L0;
              } else {
                var2 = ms.field_e[var2] & -129;
                break L0;
              }
            }
            if (0 <= qn.field_c) {
              if (-1 >= (var2 ^ -1)) {
                m.field_x[qn.field_c] = var2 ^ -1;
                qn.field_c = 1 + qn.field_c & 127;
                if (qn.field_c == hb.field_e) {
                  qn.field_c = -1;
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
            if (0 <= qn.field_c) {
              if (-1 >= (var2 ^ -1)) {
                m.field_x[qn.field_c] = var2 ^ -1;
                qn.field_c = 1 + qn.field_c & 127;
                if (qn.field_c == hb.field_e) {
                  qn.field_c = -1;
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
        } else {
          param0.consume();
          return;
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != im.field_c) {
          of.field_e = 0;
          var2 = param0.getKeyCode();
          if (var2 >= 0) {
            L0: {
              if (var2 >= ms.field_e.length) {
                var2 = -1;
                break L0;
              } else {
                var2 = ms.field_e[var2];
                if ((128 & var2) != 0) {
                  var2 = -1;
                  break L0;
                } else {
                  L1: {
                    if (0 > qn.field_c) {
                      break L1;
                    } else {
                      if (0 <= var2) {
                        m.field_x[qn.field_c] = var2;
                        qn.field_c = 1 + qn.field_c & 127;
                        if (hb.field_e != qn.field_c) {
                          break L1;
                        } else {
                          L2: {
                            qn.field_c = -1;
                            if (var2 < 0) {
                              break L2;
                            } else {
                              var3 = cg.field_I - -1 & 127;
                              if (var3 == tc.field_B) {
                                break L2;
                              } else {
                                ng.field_a[cg.field_I] = var2;
                                fb.field_yb[cg.field_I] = (char)0;
                                cg.field_I = var3;
                                break L2;
                              }
                            }
                          }
                          var3 = param0.getModifiers();
                          if ((10 & var3) == 0) {
                            if (85 != var2) {
                              if (10 == var2) {
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
                        L3: {
                          if (var2 < 0) {
                            break L3;
                          } else {
                            var3 = cg.field_I - -1 & 127;
                            if (var3 == tc.field_B) {
                              break L3;
                            } else {
                              ng.field_a[cg.field_I] = var2;
                              fb.field_yb[cg.field_I] = (char)0;
                              cg.field_I = var3;
                              break L3;
                            }
                          }
                        }
                        L4: {
                          var3 = param0.getModifiers();
                          if ((10 & var3) != 0) {
                            param0.consume();
                            break L4;
                          } else {
                            if (85 == var2) {
                              param0.consume();
                              break L4;
                            } else {
                              if (10 != var2) {
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
                  L5: {
                    if (var2 < 0) {
                      break L5;
                    } else {
                      var3 = cg.field_I - -1 & 127;
                      if (var3 == tc.field_B) {
                        break L5;
                      } else {
                        ng.field_a[cg.field_I] = var2;
                        fb.field_yb[cg.field_I] = (char)0;
                        cg.field_I = var3;
                        var3 = param0.getModifiers();
                        if ((10 & var3) == 0) {
                          if (85 != var2) {
                            if (10 == var2) {
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
                  }
                  var3 = param0.getModifiers();
                  if ((10 & var3) == 0) {
                    if (85 != var2) {
                      if (10 == var2) {
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
            }
            if (0 <= qn.field_c) {
              if (0 <= var2) {
                m.field_x[qn.field_c] = var2;
                qn.field_c = 1 + qn.field_c & 127;
                if (hb.field_e != qn.field_c) {
                  L6: {
                    if (var2 < 0) {
                      break L6;
                    } else {
                      var3 = cg.field_I - -1 & 127;
                      if (var3 == tc.field_B) {
                        break L6;
                      } else {
                        ng.field_a[cg.field_I] = var2;
                        fb.field_yb[cg.field_I] = (char)0;
                        cg.field_I = var3;
                        var3 = param0.getModifiers();
                        if ((10 & var3) != 0) {
                          param0.consume();
                          return;
                        } else {
                          if (85 == var2) {
                            param0.consume();
                            return;
                          } else {
                            if (10 != var2) {
                              return;
                            } else {
                              param0.consume();
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      return;
                    } else {
                      if (10 != var2) {
                        return;
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  }
                } else {
                  L7: {
                    qn.field_c = -1;
                    if (var2 < 0) {
                      break L7;
                    } else {
                      var3 = cg.field_I - -1 & 127;
                      if (var3 == tc.field_B) {
                        break L7;
                      } else {
                        ng.field_a[cg.field_I] = var2;
                        fb.field_yb[cg.field_I] = (char)0;
                        cg.field_I = var3;
                        break L7;
                      }
                    }
                  }
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    return;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      return;
                    } else {
                      if (10 != var2) {
                        return;
                      } else {
                        param0.consume();
                        return;
                      }
                    }
                  }
                }
              } else {
                L8: {
                  if (var2 < 0) {
                    break L8;
                  } else {
                    var3 = cg.field_I - -1 & 127;
                    if (var3 == tc.field_B) {
                      break L8;
                    } else {
                      ng.field_a[cg.field_I] = var2;
                      fb.field_yb[cg.field_I] = (char)0;
                      cg.field_I = var3;
                      break L8;
                    }
                  }
                }
                L9: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    param0.consume();
                    break L9;
                  } else {
                    if (85 == var2) {
                      param0.consume();
                      break L9;
                    } else {
                      if (10 != var2) {
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
            } else {
              L10: {
                if (var2 < 0) {
                  break L10;
                } else {
                  var3 = cg.field_I - -1 & 127;
                  if (var3 == tc.field_B) {
                    break L10;
                  } else {
                    ng.field_a[cg.field_I] = var2;
                    fb.field_yb[cg.field_I] = (char)0;
                    cg.field_I = var3;
                    var3 = param0.getModifiers();
                    if ((10 & var3) != 0) {
                      param0.consume();
                      return;
                    } else {
                      if (85 != var2) {
                        if (10 == var2) {
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
                }
              }
              var3 = param0.getModifiers();
              if ((10 & var3) != 0) {
                param0.consume();
                return;
              } else {
                if (85 != var2) {
                  if (10 == var2) {
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
            L11: {
              var2 = -1;
              if (0 > qn.field_c) {
                break L11;
              } else {
                if (0 <= var2) {
                  m.field_x[qn.field_c] = var2;
                  qn.field_c = 1 + qn.field_c & 127;
                  if (hb.field_e != qn.field_c) {
                    break L11;
                  } else {
                    L12: {
                      qn.field_c = -1;
                      if (var2 < 0) {
                        break L12;
                      } else {
                        var3 = cg.field_I - -1 & 127;
                        if (var3 == tc.field_B) {
                          break L12;
                        } else {
                          ng.field_a[cg.field_I] = var2;
                          fb.field_yb[cg.field_I] = (char)0;
                          cg.field_I = var3;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      var3 = param0.getModifiers();
                      if ((10 & var3) != 0) {
                        param0.consume();
                        break L13;
                      } else {
                        if (85 == var2) {
                          param0.consume();
                          break L13;
                        } else {
                          if (10 != var2) {
                            break L13;
                          } else {
                            param0.consume();
                            break L13;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L14: {
                    if (var2 < 0) {
                      break L14;
                    } else {
                      var3 = cg.field_I - -1 & 127;
                      if (var3 == tc.field_B) {
                        break L14;
                      } else {
                        ng.field_a[cg.field_I] = var2;
                        fb.field_yb[cg.field_I] = (char)0;
                        cg.field_I = var3;
                        break L14;
                      }
                    }
                  }
                  L15: {
                    var3 = param0.getModifiers();
                    if ((10 & var3) != 0) {
                      param0.consume();
                      break L15;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L15;
                      } else {
                        if (10 != var2) {
                          break L15;
                        } else {
                          param0.consume();
                          break L15;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            L16: {
              if (var2 < 0) {
                break L16;
              } else {
                var3 = cg.field_I - -1 & 127;
                if (var3 == tc.field_B) {
                  break L16;
                } else {
                  L17: {
                    ng.field_a[cg.field_I] = var2;
                    fb.field_yb[cg.field_I] = (char)0;
                    cg.field_I = var3;
                    var3 = param0.getModifiers();
                    if ((10 & var3) != 0) {
                      param0.consume();
                      break L17;
                    } else {
                      if (85 == var2) {
                        param0.consume();
                        break L17;
                      } else {
                        if (10 != var2) {
                          break L17;
                        } else {
                          param0.consume();
                          break L17;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            var3 = param0.getModifiers();
            if ((10 & var3) == 0) {
              if (85 != var2) {
                if (10 == var2) {
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

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null != im.field_c) {
          var2 = param0.getKeyChar();
          if (var2 != 0) {
            if (var2 != 65535) {
              if (pg.a(28654, (char) var2)) {
                var3 = 1 + cg.field_I & 127;
                if (var3 != tc.field_B) {
                  ng.field_a[cg.field_I] = -1;
                  fb.field_yb[cg.field_I] = (char)var2;
                  cg.field_I = var3;
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

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 > -101) {
          jq.a(115, 98, 0, 80, -77, 117, false, 103);
          field_d = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 >= -125) {
          jq.a(-32, 98, 121, 31, -39, (byte) -98, 83);
          ch.a(20, param1, param0, param2, param4, param3, 0, param6);
          return;
        } else {
          ch.a(20, param1, param0, param2, param4, param3, 0, param6);
          return;
        }
    }

    final static void a(int param0, Throwable param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            pb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            qb stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            qb stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            qb stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            qb stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            qb stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            qb stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param1 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = es.a(param1, (byte) -110);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param2 == null) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1 == null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + param2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            aj.a(var3_ref, false);
                            var7 = nf.a(":", var3_ref, (byte) 103, "%3a");
                            var8 = nf.a("@", var7, (byte) 121, "%40");
                            var9 = nf.a("&", var8, (byte) 80, "%26");
                            var10 = nf.a("#", var9, (byte) 112, "%23");
                            if (null == ei.field_c) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = jl.field_S;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = ei.field_c.getCodeBase();
                            stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(td.field_G).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            if (null == bj.field_E) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (qb) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = bj.field_E;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (qb) (Object) stackIn_13_0;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                            stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                            stackOut_13_5 = "" + co.field_o;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + qb.field_r + "&v2=" + qb.field_i + "&e=" + var10);
                            var4 = ((qb) (Object) stackIn_14_0).a(stackIn_14_1, false);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (0 != var4.field_d) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            jb.a((byte) -106, 1L);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var4.field_d != 1) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var5 = (DataInputStream) var4.field_e;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param0 == -29901) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            jq.a(-48, 12, 85, -13, -5, -119, true, 2);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(im.field_c == null)) {
            qn.field_c = -1;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = 7;
        L0: while (true) {
          if (param2 <= var9) {
            if (param1 < 74) {
              field_c = null;
              var9 = 4;
              L1: while (true) {
                if (var9 >= param2) {
                  var9 = 12;
                  L2: while (true) {
                    if (param2 <= var9) {
                      gf.h(1 + param4, param5 - -6, param4 - -3, param5 - -6, param7, (param0 + param3) / 2);
                      var9 = 16;
                      L3: while (true) {
                        if (var9 >= param2) {
                          return;
                        } else {
                          L4: {
                            var8 = 4;
                            if (param2 > 1 + var8 + var9) {
                              break L4;
                            } else {
                              var8 = -1 + (param2 + -var9);
                              break L4;
                            }
                          }
                          gf.f(var9 + param4, 6 + param5, var8, param7, (param0 - -param3) * (param2 - var9 * var9 / param2) / 2 / param2);
                          var9 += 16;
                          continue L3;
                        }
                      }
                    } else {
                      gf.g(3 + (param4 - -var9), 6 + param5, param4 + var9, 1 + param5, param7, param0 * (-(var9 * var9 / param2) + param2) / param2);
                      gf.g(param4 + var9, param5 + 11, param4 + var9 - -3, param5 - -6, param7, (param0 - -param3) * (-(var9 * var9 / param2) + param2) / 2 / param2);
                      var9 += 16;
                      continue L2;
                    }
                  }
                } else {
                  gf.g(param4 + var9, param5 + 6, param4 + var9 + 3, param5 - -1, param7, param0 * (param2 + -(var9 * var9 / param2)) / param2);
                  gf.g(3 + param4 - -var9, 11 + param5, var9 + param4, 6 + param5, param7, (param3 + param0) * (-(var9 * var9 / param2) + param2) / 2 / param2);
                  var9 += 16;
                  continue L1;
                }
              }
            } else {
              var9 = 4;
              L5: while (true) {
                if (var9 >= param2) {
                  var9 = 12;
                  L6: while (true) {
                    if (param2 <= var9) {
                      gf.h(1 + param4, param5 - -6, param4 - -3, param5 - -6, param7, (param0 + param3) / 2);
                      var9 = 16;
                      L7: while (true) {
                        if (var9 >= param2) {
                          return;
                        } else {
                          L8: {
                            var8 = 4;
                            if (param2 > 1 + var8 + var9) {
                              break L8;
                            } else {
                              var8 = -1 + (param2 + -var9);
                              break L8;
                            }
                          }
                          gf.f(var9 + param4, 6 + param5, var8, param7, (param0 - -param3) * (param2 - var9 * var9 / param2) / 2 / param2);
                          var9 += 16;
                          continue L7;
                        }
                      }
                    } else {
                      gf.g(3 + (param4 - -var9), 6 + param5, param4 + var9, 1 + param5, param7, param0 * (-(var9 * var9 / param2) + param2) / param2);
                      gf.g(param4 + var9, param5 + 11, param4 + var9 - -3, param5 - -6, param7, (param0 - -param3) * (-(var9 * var9 / param2) + param2) / 2 / param2);
                      var9 += 16;
                      continue L6;
                    }
                  }
                } else {
                  gf.g(param4 + var9, param5 + 6, param4 + var9 + 3, param5 - -1, param7, param0 * (param2 + -(var9 * var9 / param2)) / param2);
                  gf.g(3 + param4 - -var9, 11 + param5, var9 + param4, 6 + param5, param7, (param3 + param0) * (-(var9 * var9 / param2) + param2) / 2 / param2);
                  var9 += 16;
                  continue L5;
                }
              }
            }
          } else {
            L9: {
              if (!param6) {
                stackOut_4_0 = 6;
                stackIn_5_0 = stackOut_4_0;
                break L9;
              } else {
                stackOut_3_0 = 4;
                stackIn_5_0 = stackOut_3_0;
                break L9;
              }
            }
            L10: {
              var8 = stackIn_5_0;
              if (1 + (var9 + var8) >= param2) {
                var8 = param2 - var9 + -1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param6) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L11;
              } else {
                stackOut_9_0 = 0;
                stackIn_11_0 = stackOut_9_0;
                break L11;
              }
            }
            gf.f(stackIn_11_0 + param4 + var9, param5 - -1, var8, param7, param0 * (param2 - var9 * var9 / param2) / param2);
            var9 += 16;
            continue L0;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, qb param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9, int param10, int param11, String param12, long param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              sa.field_a = new sl(param4);
              js.field_f = new sl(param2);
              if (!param6) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              ka.field_a = stackIn_3_0 != 0;
              ee.field_o = param7;
              of.field_f = param3;
              nr.field_l = param1;
              if (param0 == 0) {
                break L1;
              } else {
                jq.a((byte) 38);
                break L1;
              }
            }
            L2: {
              be.field_l = param13;
              bb.field_c = param5;
              mk.field_c = param12;
              if (!param8) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            db.field_b = stackIn_8_0 != 0;
            uk.field_a = param9;
            e.field_b = param10;
            sp.field_g = param11;
            if (nr.field_l.field_a != null) {
              try {
                vc.field_a = new ej(nr.field_l.field_a, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
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
        field_d = null;
        field_a = new pf();
    }
}
