/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    static gh field_c;
    static int field_e;
    static String field_d;
    static int[][] field_b;
    static boolean field_f;
    static String field_a;

    final static int[][] a(int param0) {
        return uf.field_b;
    }

    final static boolean a(byte param0, int param1) {
        if (param1 < 0) {
            return (param1 + 1) % 4 == -1 ? true : false;
        }
        if (-1583 > param1) {
            return 0 == param1 % 4 ? true : false;
        }
        if (!(param1 % 4 == 0)) {
            return false;
        }
        if (!(param1 % 100 == 0)) {
            return true;
        }
        if (0 == param1 % 400) {
            return true;
        }
        return false;
    }

    final static void a() {
        pi.a(135, true, 170, true, new int[11], 470, 1, 30);
        pi.a(118, true, 170, true, new int[8], 460, 2, 34);
        pi.a(430, false, 0, true, new int[2], 640, 3, 40);
        pi.a(430, false, 30, true, new int[3], 468, 4, 200);
        pi.a(430, false, 0, true, new int[2], 640, 5, 120);
        pi.a(430, false, 100, true, new int[2], 440, 6, 220);
        pi.a(200, true, 194, true, new int[2], 446, 7, 100);
        pi.a(400, false, 50, true, new int[1], 288, 14, 40);
        pi.a(400, false, 50, true, new int[1], 288, 8, 40);
        vk.a(new int[10], false, 9, 240, (byte) 123, new int[6], 400, 160, 428);
        Object var2 = null;
        pi.a(310, false, 180, true, (int[]) null, 440, 10, 60);
        pi.a(0, true, 0, true, new int[0], 0, 11, 0);
        pi.a(0, true, 0, true, new int[1], 0, 12, 0);
        pi.a(430, true, 170, true, new int[1], 470, 13, 0);
        pi.a(430, false, 30, true, new int[2], 468, 15, 330);
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -2) {
          L0: {
            if (21 == ai.field_b) {
              L1: {
                var2 = hg.field_rb;
                if (param0 != -12) {
                  po.a((byte) -12, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == -1) {
                  w.field_m = 0;
                  df.a(-17306, 1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (fb.field_e.field_Q.a((byte) 98) == 0) {
                  w.field_m = w.field_m & -9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-12 == param0) {
                  df.a(-17306, 0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (hg.field_rb != 0) {
                  break L5;
                } else {
                  L6: {
                    if (gh.a(-3, 11653)) {
                      break L6;
                    } else {
                      if (param0 == -14) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  df.a(-17306, jh.field_ic);
                  break L5;
                }
              }
              L7: {
                if (1 != hg.field_rb) {
                  break L7;
                } else {
                  if (gh.a(-8, 11653)) {
                    df.a(-17306, 2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (2 != hg.field_rb) {
                  break L8;
                } else {
                  if (!gh.a(-7, 11653)) {
                    break L8;
                  } else {
                    df.a(-17306, 3);
                    break L8;
                  }
                }
              }
              L9: {
                if (hg.field_rb != 3) {
                  break L9;
                } else {
                  if (gh.a(-3, 11653)) {
                    df.a(-17306, 4);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (4 != hg.field_rb) {
                  break L10;
                } else {
                  if (!gh.a(-13, 11653)) {
                    break L10;
                  } else {
                    df.a(-17306, 5);
                    break L10;
                  }
                }
              }
              L11: {
                if (5 != hg.field_rb) {
                  break L11;
                } else {
                  if (!gh.a(-4, 11653)) {
                    break L11;
                  } else {
                    if (fb.field_e.field_Q.a((byte) 98) > 0) {
                      df.a(-17306, 6);
                      break L11;
                    } else {
                      df.a(-17306, 7);
                      break L11;
                    }
                  }
                }
              }
              L12: {
                if (hg.field_rb != 6) {
                  break L12;
                } else {
                  if (!gh.a(-6, 11653)) {
                    break L12;
                  } else {
                    df.a(-17306, 7);
                    break L12;
                  }
                }
              }
              L13: {
                if (hg.field_rb != 7) {
                  break L13;
                } else {
                  if (gh.a(-5, 11653)) {
                    df.a(-17306, 6);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                L15: {
                  if (6 == hg.field_rb) {
                    break L15;
                  } else {
                    if (hg.field_rb != 7) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                if (!gh.a(-6, 11653)) {
                  break L14;
                } else {
                  if (!gh.a(-5, 11653)) {
                    break L14;
                  } else {
                    df.a(-17306, 8);
                    break L14;
                  }
                }
              }
              L16: {
                if (8 != hg.field_rb) {
                  break L16;
                } else {
                  if (!gh.a(-9, 11653)) {
                    break L16;
                  } else {
                    df.a(-17306, 9);
                    break L16;
                  }
                }
              }
              L17: {
                if (hg.field_rb != 9) {
                  break L17;
                } else {
                  if (gh.a(-10, 11653)) {
                    df.a(-17306, 10);
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (hg.field_rb != 10) {
                  break L18;
                } else {
                  if (!gh.a(-11, 11653)) {
                    break L18;
                  } else {
                    df.a(-17306, 11);
                    break L18;
                  }
                }
              }
              L19: {
                if (hg.field_rb != 4) {
                  break L19;
                } else {
                  if (gh.a(-3, 11653)) {
                    break L19;
                  } else {
                    df.a(-17306, 3);
                    break L19;
                  }
                }
              }
              if (~hg.field_rb == ~var2) {
                break L0;
              } else {
                L20: {
                  if (io.field_g) {
                    break L20;
                  } else {
                    if (hg.field_rb != 0) {
                      break L0;
                    } else {
                      break L20;
                    }
                  }
                }
                fb.field_e.c(true, hg.field_rb);
                break L0;
              }
            } else {
              L21: {
                if (19 == ai.field_b) {
                  break L21;
                } else {
                  if (ai.field_b != 20) {
                    if (-1 != param0) {
                      L22: {
                        if (param0 < 0) {
                          break L22;
                        } else {
                          if (param0 <= 21) {
                            if (io.field_g) {
                              break L0;
                            } else {
                              df.a(-17306, 0);
                              break L0;
                            }
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (-14 == param0) {
                        if (hg.field_rb >= -1 + lm.field_pb) {
                          io.field_g = false;
                          break L0;
                        } else {
                          df.a(-17306, 1 + hg.field_rb);
                          break L0;
                        }
                      } else {
                        if (param0 != -3) {
                          break L0;
                        } else {
                          io.field_g = false;
                          break L0;
                        }
                      }
                    } else {
                      ai.field_b = -1;
                      io.field_g = false;
                      ml.field_Jb = -1;
                      hg.field_rb = -1;
                      se.field_E = 0;
                      ma.field_d = -1;
                      break L0;
                    }
                  } else {
                    break L21;
                  }
                }
              }
              if (param0 == -1) {
                df.a(-17306, 0);
                break L0;
              } else {
                if (param0 == -14) {
                  if (-1 + lm.field_pb > hg.field_rb) {
                    df.a(-17306, 1 + hg.field_rb);
                    break L0;
                  } else {
                    L23: {
                      if (!pp.field_n) {
                        break L23;
                      } else {
                        pp.field_n = false;
                        we.field_g[7] = se.field_D;
                        break L23;
                      }
                    }
                    io.field_g = false;
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          io.field_g = false;
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                int discarded$2 = iq.a(38, -116, 25);
                break L1;
              }
            }
            var3_int = 0;
            var4 = ce.field_k;
            L2: while (true) {
              if (var3_int >= hq.field_m.length) {
                stackOut_13_0 = -1;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L3: {
                  var5 = wd.field_Q[var3_int];
                  if (var5 < 0) {
                    var4 = var4 + se.field_C;
                    break L3;
                  } else {
                    var6 = hn.a(0, hq.field_m[var3_int], true);
                    var7 = am.field_c + -(var6 >> 1);
                    var4 = var4 + al.field_bb;
                    if (th.a(param0, var7 - no.field_Gb, param2, var6 - -(no.field_Gb << 1), var4, (wk.field_G << 1) + me.field_h, -18)) {
                      stackOut_8_0 = var5;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      var4 = var4 + (al.field_bb + (wk.field_G << 1) + me.field_h);
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "iq.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 20;
        field_a = "Add friend";
        field_f = true;
        field_d = "You appear to be telling someone your password - please don't!";
    }
}
