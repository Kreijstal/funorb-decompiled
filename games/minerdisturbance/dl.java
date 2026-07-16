/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static bg field_e;
    static String field_b;
    static int field_c;
    static ea[] field_d;
    static String field_f;
    static String field_a;

    final static void a(boolean param0, wh param1, int param2, int param3, int param4) {
        if (param2 != -32532) {
            return;
        }
        nj.field_e.a(false, param1, !param0 ? true : false, 1000000, param3, param4);
    }

    final static String b(byte param0) {
        if (param0 > -8) {
            field_a = null;
            return bi.a(sj.field_d, true);
        }
        return bi.a(sj.field_d, true);
    }

    final static String a(sb param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.b(true);
              if (var3_int <= param1) {
                break L1;
              } else {
                var3_int = param1;
                break L1;
              }
            }
            L2: {
              var4 = new byte[var3_int];
              param0.field_o = param0.field_o + hf.field_q.a(param0.field_o, 0, var3_int, param0.field_u, var4, 256);
              var5 = ph.a((byte) 54, var3_int, var4, 0);
              if (param2 == -27898) {
                break L2;
              } else {
                int discarded$2 = dl.b(48);
                break L2;
              }
            }
            stackOut_4_0 = (String) var5;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_5_0;
    }

    final static vm a(bj param0, int param1, int param2, byte param3, bj param4) {
        int var5 = 0;
        if (!cn.a(param1, 258, param2, param4)) {
          return null;
        } else {
          var5 = 1 / ((37 - param3) / 62);
          return bh.a((byte) 104, param0.a(false, param2, param1));
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = MinerDisturbance.field_ab;
        if (param0 <= -69) {
          var1 = 0;
          var2 = 0;
          L0: while (true) {
            if (!mm.b((byte) 102)) {
              L1: {
                pn.field_a.a(sj.a(nk.field_w, (byte) 126, gb.field_e), sj.a(wi.field_w, (byte) 124, m.field_e), -1);
                if (pn.field_a.b(true)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (pn.field_a.field_e ^ -1)) {
                  var3 = wf.field_P[pn.field_a.field_e];
                  if ((var3 ^ -1) == -3) {
                    L2: {
                      om.a(-22126);
                      if ((var3 ^ -1) != -1) {
                        break L2;
                      } else {
                        if ((ti.field_M ^ -1) == -3) {
                          var4 = -tl.field_o + sf.a((byte) -57);
                          var6 = (int)((10999L + -var4) / 1000L);
                          if (-1 > (var6 ^ -1)) {
                            break L2;
                          } else {
                            var3 = 2;
                            qd.a(-63, true, 5);
                            break L2;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                    return var3;
                  } else {
                    if ((var3 ^ -1) == -6) {
                      L3: {
                        om.a(-22126);
                        if ((var3 ^ -1) != -1) {
                          break L3;
                        } else {
                          if ((ti.field_M ^ -1) == -3) {
                            var4 = -tl.field_o + sf.a((byte) -57);
                            var6 = (int)((10999L + -var4) / 1000L);
                            if (-1 > (var6 ^ -1)) {
                              break L3;
                            } else {
                              var3 = 2;
                              qd.a(-63, true, 5);
                              break L3;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    } else {
                      if ((var3 ^ -1) == -1) {
                        if ((ti.field_M ^ -1) == -3) {
                          L4: {
                            var4 = -tl.field_o + sf.a((byte) -57);
                            var6 = (int)((10999L + -var4) / 1000L);
                            if (-1 > (var6 ^ -1)) {
                              break L4;
                            } else {
                              var3 = 2;
                              qd.a(-63, true, 5);
                              break L4;
                            }
                          }
                          return var3;
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                } else {
                  L5: {
                    if (var2 == 0) {
                      break L5;
                    } else {
                      if (2 != ti.field_M) {
                        om.a(-22126);
                        break L5;
                      } else {
                        L6: {
                          if ((var3 ^ -1) != -1) {
                            break L6;
                          } else {
                            if ((ti.field_M ^ -1) == -3) {
                              var4 = -tl.field_o + sf.a((byte) -57);
                              var6 = (int)((10999L + -var4) / 1000L);
                              if (-1 > (var6 ^ -1)) {
                                break L6;
                              } else {
                                var3 = 2;
                                qd.a(-63, true, 5);
                                break L6;
                              }
                            } else {
                              return var3;
                            }
                          }
                        }
                        return var3;
                      }
                    }
                  }
                  if ((var3 ^ -1) == -1) {
                    if ((ti.field_M ^ -1) == -3) {
                      L7: {
                        var4 = -tl.field_o + sf.a((byte) -57);
                        var6 = (int)((10999L + -var4) / 1000L);
                        if (-1 > (var6 ^ -1)) {
                          break L7;
                        } else {
                          var3 = 2;
                          qd.a(-63, true, 5);
                          break L7;
                        }
                      }
                      return var3;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              } else {
                L8: {
                  if (var2 == 0) {
                    break L8;
                  } else {
                    if (2 != ti.field_M) {
                      om.a(-22126);
                      break L8;
                    } else {
                      L9: {
                        if ((var3 ^ -1) != -1) {
                          break L9;
                        } else {
                          if ((ti.field_M ^ -1) == -3) {
                            var4 = -tl.field_o + sf.a((byte) -57);
                            var6 = (int)((10999L + -var4) / 1000L);
                            if (-1 > (var6 ^ -1)) {
                              break L9;
                            } else {
                              var3 = 2;
                              qd.a(-63, true, 5);
                              break L9;
                            }
                          } else {
                            return var3;
                          }
                        }
                      }
                      return var3;
                    }
                  }
                }
                L10: {
                  if ((var3 ^ -1) != -1) {
                    break L10;
                  } else {
                    if ((ti.field_M ^ -1) == -3) {
                      var4 = -tl.field_o + sf.a((byte) -57);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (-1 > (var6 ^ -1)) {
                        break L10;
                      } else {
                        var3 = 2;
                        qd.a(-63, true, 5);
                        break L10;
                      }
                    } else {
                      return var3;
                    }
                  }
                }
                return var3;
              }
            } else {
              L11: {
                pn.field_a.b((byte) 117);
                if (!pn.field_a.b(true)) {
                  break L11;
                } else {
                  var1 = 1;
                  break L11;
                }
              }
              if (13 != lj.field_t) {
                continue L0;
              } else {
                var2 = 1;
                continue L0;
              }
            }
          }
        } else {
          var8 = null;
          dl.a(false, (wh) null, -17, -116, -117);
          var1 = 0;
          var2 = 0;
          L12: while (true) {
            if (!mm.b((byte) 102)) {
              L13: {
                pn.field_a.a(sj.a(nk.field_w, (byte) 126, gb.field_e), sj.a(wi.field_w, (byte) 124, m.field_e), -1);
                if (pn.field_a.b(true)) {
                  var1 = 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (pn.field_a.field_e ^ -1)) {
                  L14: {
                    var3 = wf.field_P[pn.field_a.field_e];
                    if ((var3 ^ -1) == -3) {
                      om.a(-22126);
                      break L14;
                    } else {
                      if ((var3 ^ -1) == -6) {
                        L15: {
                          om.a(-22126);
                          if ((var3 ^ -1) != -1) {
                            break L15;
                          } else {
                            if ((ti.field_M ^ -1) == -3) {
                              var4 = -tl.field_o + sf.a((byte) -57);
                              var6 = (int)((10999L + -var4) / 1000L);
                              if (-1 > (var6 ^ -1)) {
                                break L15;
                              } else {
                                var3 = 2;
                                qd.a(-63, true, 5);
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        return var3;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L16: {
                    if ((var3 ^ -1) != -1) {
                      break L16;
                    } else {
                      if ((ti.field_M ^ -1) == -3) {
                        var4 = -tl.field_o + sf.a((byte) -57);
                        var6 = (int)((10999L + -var4) / 1000L);
                        if (-1 > (var6 ^ -1)) {
                          break L16;
                        } else {
                          var3 = 2;
                          qd.a(-63, true, 5);
                          break L16;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                  return var3;
                } else {
                  L17: {
                    if (var2 == 0) {
                      break L17;
                    } else {
                      if (2 != ti.field_M) {
                        om.a(-22126);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((var3 ^ -1) != -1) {
                      break L18;
                    } else {
                      if ((ti.field_M ^ -1) == -3) {
                        var4 = -tl.field_o + sf.a((byte) -57);
                        var6 = (int)((10999L + -var4) / 1000L);
                        if (-1 > (var6 ^ -1)) {
                          break L18;
                        } else {
                          var3 = 2;
                          qd.a(-63, true, 5);
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                  return var3;
                }
              } else {
                L19: {
                  if (var2 == 0) {
                    break L19;
                  } else {
                    if (2 != ti.field_M) {
                      om.a(-22126);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  if ((var3 ^ -1) != -1) {
                    break L20;
                  } else {
                    if ((ti.field_M ^ -1) == -3) {
                      var4 = -tl.field_o + sf.a((byte) -57);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (-1 > (var6 ^ -1)) {
                        break L20;
                      } else {
                        var3 = 2;
                        qd.a(-63, true, 5);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                return var3;
              }
            } else {
              L21: {
                pn.field_a.b((byte) 117);
                if (!pn.field_a.b(true)) {
                  break L21;
                } else {
                  var1 = 1;
                  break L21;
                }
              }
              if (13 != lj.field_t) {
                continue L12;
              } else {
                var2 = 1;
                continue L12;
              }
            }
          }
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) lb.field_y);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) lb.field_y);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) lb.field_y);
        if (param1 != 73) {
            field_a = null;
        }
    }

    final static boolean a(int param0) {
        if (param0 < 52) {
            field_a = null;
            return gd.field_B;
        }
        return gd.field_B;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != -118) {
            return;
        }
        field_b = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new bg(12, 0, 1, 0);
        field_b = "Ranking: Macho Miner";
        field_d = new ea[2];
        field_f = "Achieved";
        field_a = "Email address is unavailable";
    }
}
