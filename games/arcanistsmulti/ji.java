/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static boolean field_d;
    static String field_j;
    static wk field_b;
    static int field_g;
    static String field_a;
    static String field_l;
    static String field_f;
    static qb[] field_h;
    static String field_k;
    static qb[] field_c;
    static String field_i;

    public static void a(int param0) {
        if (param0 != -733) {
            return;
        }
        field_f = null;
        field_l = null;
        field_k = null;
        field_a = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_b = null;
        field_j = null;
        field_e = null;
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
              if (null != ch.field_a) {
                L2: {
                  L3: {
                    hg.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (var2_int < sb.field_h.length) {
                        var2_int = sb.field_h[var2_int] & -129;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > ub.field_b) {
                  break L1;
                } else {
                  if (-1 < (var2_int ^ -1)) {
                    break L1;
                  } else {
                    dk.field_d[ub.field_b] = var2_int ^ -1;
                    ub.field_b = 127 & ub.field_b + 1;
                    if (ub.field_b == go.field_g) {
                      ub.field_b = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
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

            stackIn_16_1 = new StringBuilder().append("ji.keyReleased(");

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
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == ch.field_a) {
                break L1;
              } else {
                L2: {
                  L3: {
                    hg.field_b = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if (var2_int < sb.field_h.length) {
                        var2_int = sb.field_h[var2_int];
                        if ((128 & var2_int) != 0) {
                          var2_int = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (-1 < (ub.field_b ^ -1)) {
                    break L4;
                  } else {
                    if ((var2_int ^ -1) <= -1) {
                      dk.field_d[ub.field_b] = var2_int;
                      ub.field_b = 127 & ub.field_b - -1;
                      if (ub.field_b != go.field_g) {
                        break L4;
                      } else {
                        ub.field_b = -1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) <= -1) {
                    var3 = 1 + pi.field_a & 127;
                    if (var3 != vk.field_u) {
                      v.field_p[pi.field_a] = var2_int;
                      qa.field_i[pi.field_a] = (char)0;
                      pi.field_a = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if (-1 != (10 & var3 ^ -1)) {
                    break L6;
                  } else {
                    if ((var2_int ^ -1) == -86) {
                      break L6;
                    } else {
                      if (var2_int != 10) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ji.keyPressed(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != -101) {
            field_e = (String) null;
        }
        if (tc.field_A != null) {
            tc.field_A.a(param0, true);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        int var5;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (0 == (param2 ^ -1)) {
            ed.a(param1, (byte) 106);
            break L0;
          } else {
            L1: {
              if (-2 != param2) {
                break L1;
              } else {
                if ((bi.field_I ^ -1) < -4) {
                  sc.a(2, an.field_j, an.field_f);
                  de.d(bi.field_I + -3, 0, 646, an.field_j, 0);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (-2 == param2) {
              de.b();
              break L0;
            } else {
              L2: {
                if (param3) {
                  ed.a(false, (byte) 81);
                  de.b(0, 0, an.field_f, an.field_j);
                  break L2;
                } else {
                  break L2;
                }
              }
              tl.field_f[param2].e((byte) -45);
              break L0;
            }
          }
        }
        L3: {
          if (param0 == -2) {
            break L3;
          } else {
            field_a = (String) null;
            break L3;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2, byte param3, CharSequence param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = param5 - param0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                L2: {
                  if (param3 == 89) {
                    break L2;
                  } else {
                    field_i = (String) null;
                    break L2;
                  }
                }
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param4.charAt(var7 + param0);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (255 >= var8) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param1[param2 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 != 8230) {
                              if (8224 != var8) {
                                if (8225 != var8) {
                                  if (710 != var8) {
                                    if (var8 == 8240) {
                                      param1[param2 + var7] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (338 != var8) {
                                            if (var8 != 381) {
                                              if (var8 != 8216) {
                                                if (8217 != var8) {
                                                  if (var8 == 8220) {
                                                    param1[param2 - -var7] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var8 == 8221) {
                                                      param1[param2 - -var7] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var8 != 8226) {
                                                        if (8211 != var8) {
                                                          if (var8 == 8212) {
                                                            param1[var7 + param2] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (8482 != var8) {
                                                                if (var8 != 353) {
                                                                  if (var8 != 8250) {
                                                                    if (339 == var8) {
                                                                      param1[param2 - -var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 != 376) {
                                                                          param1[var7 + param2] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param2 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[param2 - -var7] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param1[param2 - -var7] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  param1[var7 + param2] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                param1[param2 + var7] = (byte)-103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              param1[param2 + var7] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param1[param2 + var7] = (byte)-106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        param1[var7 + param2] = (byte)-107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  param1[var7 + param2] = (byte)-110;
                                                  break L3;
                                                }
                                              } else {
                                                param1[var7 + param2] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              param1[param2 - -var7] = (byte)-114;
                                              break L3;
                                            }
                                          } else {
                                            param1[param2 + var7] = (byte)-116;
                                            break L3;
                                          }
                                        } else {
                                          param1[param2 + var7] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param1[var7 + param2] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param1[param2 + var7] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  param1[var7 + param2] = (byte)-121;
                                  break L3;
                                }
                              } else {
                                param1[var7 + param2] = (byte)-122;
                                break L3;
                              }
                            } else {
                              param1[param2 + var7] = (byte)-123;
                              break L3;
                            }
                          } else {
                            param1[param2 - -var7] = (byte)-124;
                            break L3;
                          }
                        } else {
                          param1[var7 + param2] = (byte)-125;
                          break L3;
                        }
                      }
                    } else {
                      param1[param2 + var7] = (byte)-128;
                      break L3;
                    }
                  }
                  param1[param2 - -var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("ji.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param5 + ')');
        }
        return stackIn_69_0;
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
              if (ch.field_a == null) {
                break L1;
              } else {
                ub.field_b = -1;
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

            stackIn_5_1 = new StringBuilder().append("ji.focusLost(");

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
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(null == ch.field_a)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535) {
                    if (!(!hf.a((char) var2_int, (byte) 123))) {
                        var3 = 1 + pi.field_a & 127;
                        if (!(var3 == vk.field_u)) {
                            v.field_p[pi.field_a] = -1;
                            qa.field_i[pi.field_a] = (char)var2_int;
                            pi.field_a = var3;
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ji.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Send private message";
        field_k = "All players have left <%0>'s game.";
        field_d = false;
        field_l = "Spell Selection";
        field_f = "Suggested names: ";
        field_a = "This game option has not yet been unlocked for use.";
        field_i = "Passwords must be between 5 and 20 characters long";
    }
}
