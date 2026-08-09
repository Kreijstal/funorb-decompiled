/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_e;
    static o field_f;
    static String field_b;
    static int field_a;
    static String field_d;
    static hl field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == hj.field_c)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && 65535 != var2_int && ua.a((char) var2_int, 0)) {
                    var3 = 127 & pd.field_b - -1;
                    if (!(wg.field_b == var3)) {
                        pe.field_e[pd.field_b] = -1;
                        ik.field_s[pd.field_b] = (char)var2_int;
                        pd.field_b = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 123 % ((-4 - param0) / 33);
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == hj.field_c) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ie.field_D = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (cg.field_j.length > var2_int) {
                        var2_int = cg.field_j[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (-1 < (ah.field_c ^ -1)) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) <= -1) {
                    ab.field_A[ah.field_c] = var2_int ^ -1;
                    ah.field_c = 127 & ah.field_c - -1;
                    if (ec.field_a == ah.field_c) {
                      ah.field_c = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("bg.keyReleased(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (hj.field_c == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    ie.field_D = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if (var2_int >= cg.field_j.length) {
                        break L3;
                      } else {
                        var2_int = cg.field_j[var2_int];
                        if (0 != (var2_int & 128)) {
                          var2_int = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (ah.field_c < 0) {
                    break L4;
                  } else {
                    if (var2_int < 0) {
                      break L4;
                    } else {
                      ab.field_A[ah.field_c] = var2_int;
                      ah.field_c = 1 + ah.field_c & 127;
                      if (ah.field_c != ec.field_a) {
                        break L4;
                      } else {
                        ah.field_c = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) > -1) {
                    break L5;
                  } else {
                    var3 = 127 & pd.field_b + 1;
                    if (wg.field_b == var3) {
                      break L5;
                    } else {
                      pe.field_e[pd.field_b] = var2_int;
                      ik.field_s[pd.field_b] = (char)0;
                      pd.field_b = var3;
                      break L5;
                    }
                  }
                }
                var3 = param0.getModifiers();
                if (-1 != (var3 & 10 ^ -1)) {
                  param0.consume();
                  return;
                } else {
                  if (85 == var2_int) {
                    param0.consume();
                    return;
                  } else {
                    if ((var2_int ^ -1) != -11) {
                      break L1;
                    } else {
                      param0.consume();
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("bg.keyPressed(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == hj.field_c) {
                break L1;
              } else {
                ah.field_c = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bg.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void b(int param0) {
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        gi stackIn_45_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gi var9 = null;
        int var10 = 0;
        var10 = StarCannon.field_A;
        try {
          L0: {
            if (param0 == 1000) {
              L1: {
                var1_int = nd.field_m;
                var2 = 0;
                if (bh.field_a != 2) {
                  break L1;
                } else {
                  var3_long = dd.b(57) + -af.field_x;
                  var2 = (int)((-var3_long + 10999L) / 1000L);
                  if ((var2 ^ -1) > -1) {
                    var2 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var3 = 0;
              L2: while (true) {
                if (uh.field_h.length <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = eg.field_a[var3];
                    if ((var4 ^ -1) <= -1) {
                      if (ja.field_c.field_k == var4) {
                        var5 = ig.field_b;
                        break L3;
                      } else {
                        var5 = sd.field_a;
                        break L3;
                      }
                    } else {
                      var5 = sb.field_m;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = uh.field_h[var3];
                    if (bh.field_a != 2) {
                      break L4;
                    } else {
                      if (1 == var2) {
                        L5: {
                          if (se.field_n.length >= ri.field_b.length) {
                            stackIn_20_0 = se.field_n.length;
                            break L5;
                          } else {
                            stackIn_20_0 = ri.field_b.length;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_20_0;
                          if (-7 < (var3 ^ -1)) {
                            break L6;
                          } else {
                            if (6 + var7 <= var3) {
                              break L6;
                            } else {
                              L7: {
                                if (-1 >= (-var7 + se.field_n.length + (-6 + var3) ^ -1)) {
                                  stackIn_25_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                                  break L7;
                                } else {
                                  stackIn_25_0 = "";
                                  break L7;
                                }
                              }
                              var6 = stackIn_25_0;
                              break L6;
                            }
                          }
                        }
                        L8: {
                          if (fb.field_c.length >= rd.field_q.length) {
                            stackIn_29_0 = fb.field_c.length;
                            break L8;
                          } else {
                            stackIn_29_0 = rd.field_q.length;
                            break L8;
                          }
                        }
                        var8 = stackIn_29_0;
                        if (var3 < 7 - -var7) {
                          break L4;
                        } else {
                          if (var3 < 7 + (var7 + var8)) {
                            L9: {
                              if (-var7 + (-7 + var3) >= fb.field_c.length) {
                                stackIn_35_0 = "";
                                break L9;
                              } else {
                                stackIn_35_0 = fb.field_c[-7 + (var3 - var7)];
                                break L9;
                              }
                            }
                            var6 = stackIn_35_0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if ((var4 ^ -1) != 1) {
                      break L10;
                    } else {
                      var6 = Integer.toString(var2);
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0 = (String) (var6);

                    stackIn_40_1 = 26;

                    if ((var4 ^ -1) > -1) {
                      stackIn_41_0 = (String) ((Object) stackIn_40_0);
                      stackIn_41_1 = stackIn_40_1;
                      stackIn_41_2 = 0;
                      break L11;
                    } else {
                      stackIn_41_0 = (String) ((Object) stackIn_40_0);
                      stackIn_41_1 = stackIn_40_1;
                      stackIn_41_2 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = fb.a(stackIn_41_0, (byte) stackIn_41_1, stackIn_41_2 != 0);
                    var8 = -(var7 >> 2002371233) + ee.field_b;
                    if ((var4 ^ -1) > -1) {
                      break L12;
                    } else {
                      L13: {
                        if (var4 == ja.field_c.field_k) {
                          stackIn_45_0 = ie.field_y;
                          break L13;
                        } else {
                          stackIn_45_0 = wj.field_d;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_45_0;
                        var1_int = var1_int + mc.field_h;
                        if (var9 != null) {
                          var9.a(-rh.field_i + var8, (rh.field_i << 1681688929) + var7, param0 ^ -947, var1_int, pk.field_c - -(kc.field_S << 1009772353));
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var1_int = var1_int + kc.field_S;
                      break L12;
                    }
                  }
                  L15: {
                    if (-1 >= (var4 ^ -1)) {
                      ai.field_h.a(var6, var8, var1_int - -rg.field_D, var5, -1);
                      var1_int = var1_int + (pk.field_c + (kc.field_S - -mc.field_h));
                      break L15;
                    } else {
                      rh.field_h.a(var6, var8, kf.field_v + var1_int, var5, -1);
                      var1_int = var1_int + sg.field_e;
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "bg.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_f = new o(10, 2, 2, 0);
        field_b = "Quit to website";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
