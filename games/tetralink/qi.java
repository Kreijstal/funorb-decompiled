/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends mc {
    int field_t;
    static hl field_n;
    int field_y;
    int field_w;
    int field_r;
    int field_x;
    int field_s;
    static int field_q;
    static a field_u;
    static a field_p;
    int field_v;
    static String field_o;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = TetraLink.field_J;
        if (0 <= param5) {
          if (param7 < vn.field_n) {
            L0: {
              if (param1 >= 0) {
                break L0;
              } else {
                if (param3 >= 0) {
                  break L0;
                } else {
                  if (param0 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (param1 < vn.field_k) {
                break L1;
              } else {
                if (vn.field_k > param3) {
                  break L1;
                } else {
                  if (vn.field_k > param0) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var14 = param5 - param7;
                if (param7 == param4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var10 = param1 << -1233839664;
                      var9 = param1 << -1233839664;
                      var15 = -param7 + param4;
                      var12 = (-param1 + param0 << -1452931280) / var14;
                      var11 = (-param1 + param3 << -610446064) / var15;
                      if (var12 > var11) {
                        break L5;
                      } else {
                        var13 = 1;
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = 0;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param7 < 0) {
                        L8: {
                          if (0 <= param4) {
                            break L8;
                          } else {
                            param7 = param4 - param7;
                            var9 = var9 + var11 * param7;
                            var10 = var10 + param7 * var12;
                            param7 = param4;
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        param7 = -param7;
                        var10 = var10 + param7 * var12;
                        var9 = var9 + var11 * param7;
                        param7 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var16 = vn.field_h[param7];
                    L9: while (true) {
                      if (param4 <= param7) {
                        break L6;
                      } else {
                        L10: {
                          var17 = var9 >> 2025356656;
                          if (var17 < vn.field_k) {
                            L11: {
                              var18 = (var10 >> 231406128) + -(var9 >> -1666552688);
                              if (var18 != 0) {
                                break L11;
                              } else {
                                if (0 > var17) {
                                  break L10;
                                } else {
                                  if (vn.field_k > var17) {
                                    mh.a(param6, param8, 0, var18, var16 + var17);
                                    if (0 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            L12: {
                              if (var18 + var17 < vn.field_k) {
                                break L12;
                              } else {
                                var18 = -var17 + vn.field_k - 1;
                                break L12;
                              }
                            }
                            L13: {
                              if (var17 < 0) {
                                break L13;
                              } else {
                                mh.a(param6, param8, 0, var18, var17 - -var16);
                                if (0 == 0) {
                                  break L10;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            mh.a(param6, param8, param2 + -98, var17 + var18, var16);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        param7++;
                        if (vn.field_n > param7) {
                          var16 = var16 + ra.field_f;
                          var10 = var10 + var12;
                          var9 = var9 + var11;
                          if (0 == 0) {
                            continue L9;
                          } else {
                            break L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L14: {
                    L15: {
                      var16 = -param4 + param5;
                      if (var16 == 0) {
                        break L15;
                      } else {
                        L16: {
                          L17: {
                            if (var13 != 0) {
                              break L17;
                            } else {
                              var9 = param3 << 1394551952;
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var10 = param3 << -1906052848;
                          break L16;
                        }
                        var17 = param0 << 596682512;
                        var11 = (-var9 + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        if (0 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    break L14;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L18: {
                L19: {
                  if (param5 != param7) {
                    break L19;
                  } else {
                    var12 = 0;
                    var11 = 0;
                    var9 = param1 << 483504112;
                    var10 = param3 << 1701819728;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  var15 = -param4 + param5;
                  if (param1 < param3) {
                    break L20;
                  } else {
                    var11 = (param0 + -param3 << 23180880) / var15;
                    var10 = param1 << 1613313904;
                    var12 = (param0 + -param1 << -1587882704) / var14;
                    var9 = param3 << 1461940368;
                    if (0 == 0) {
                      break L18;
                    } else {
                      break L20;
                    }
                  }
                }
                var11 = (param0 - param1 << 22758736) / var14;
                var12 = (param0 + -param3 << -2118534000) / var15;
                var10 = param3 << -835709328;
                var9 = param1 << 1342383728;
                break L18;
              }
              L21: {
                if (param7 < 0) {
                  param7 = Math.min(-param7, param4 + -param7);
                  var9 = var9 + var11 * param7;
                  var10 = var10 + var12 * param7;
                  param7 = 0;
                  break L21;
                } else {
                  break L21;
                }
              }
              var13 = 0;
              break L2;
            }
            L22: {
              if (param7 >= 0) {
                break L22;
              } else {
                param7 = -param7;
                var10 = var10 + param7 * var12;
                var9 = var9 + param7 * var11;
                param7 = 0;
                break L22;
              }
            }
            L23: {
              var15 = vn.field_h[param7];
              if (param2 == 98) {
                break L23;
              } else {
                field_q = 100;
                break L23;
              }
            }
            L24: while (true) {
              if (param5 > param7) {
                L25: {
                  var16 = var9 >> 1512597744;
                  if (vn.field_k > var16) {
                    L26: {
                      var17 = -(var9 >> -2072214576) + (var10 >> -141422256);
                      if (0 != var17) {
                        break L26;
                      } else {
                        if (var16 < 0) {
                          break L25;
                        } else {
                          if (var16 < vn.field_k) {
                            mh.a(param6, param8, param2 + -98, var17, var16 - -var15);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L27: {
                      if (vn.field_k > var16 + var17) {
                        break L27;
                      } else {
                        var17 = -var16 + vn.field_k + -1;
                        break L27;
                      }
                    }
                    L28: {
                      if (var16 >= 0) {
                        break L28;
                      } else {
                        mh.a(param6, param8, param2 ^ 98, var16 + var17, var15);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L28;
                        }
                      }
                    }
                    mh.a(param6, param8, 0, var17, var16 - -var15);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                param7++;
                if (param7 < vn.field_n) {
                  var15 = var15 + ra.field_f;
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  if (0 == 0) {
                    continue L24;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        gg.c((byte) 43);
        rm.a(1731);
        if (param0 != -98) {
            Object var2 = null;
            qi.a(66, -36, (byte) 110, 18, -22, -126, (int[]) null, 17, -86);
        }
        mm.field_y = null;
        go.c((byte) 42);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        bm.field_s = param0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var6 = param2.getParameter("cookieprefix");
                            var5 = var6;
                            var5 = var6;
                            var4 = param2.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                            var5 = var7;
                            var5 = var7;
                            if (-1 != (param0.length() ^ -1)) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var7 + "; Expires=" + ei.a((byte) 2, 94608000000L + k.a(0)) + "; Max-Age=" + 94608000L;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ii.a(-19149, "document.cookie=\"" + var5 + "\"", param2);
                            if (param1 == -7011) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            field_n = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        q.a(param2, param1 + 7075);
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

    public static void a(int param0) {
        field_u = null;
        field_n = null;
        field_o = null;
        field_p = null;
        if (param0 != 19381) {
            field_u = null;
        }
    }

    qi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((qi) this).field_w = param5;
        ((qi) this).field_s = param6;
        ((qi) this).field_y = param2;
        ((qi) this).field_t = param0;
        ((qi) this).field_x = param3;
        ((qi) this).field_r = param4;
        ((qi) this).field_v = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new a();
        field_o = "Please enter your age in years";
    }
}
