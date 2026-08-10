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
        if (param0 != 45) {
            iq.a((byte) -49, 120);
        }
        return uf.field_b;
    }

    final static boolean a(byte param0, int param1) {
        if (param1 < 0) {
            return (param1 + 1) % 4 == 0 ? true : false;
        }
        if (-1583 < (param1 ^ -1)) {
            return 0 == param1 % 4 ? true : false;
        }
        if (!(-1 == (param1 % 4 ^ -1))) {
            return false;
        }
        if (!(param1 % 100 == 0)) {
            return true;
        }
        if (!(0 == param1 % 400)) {
            return false;
        }
        if (param0 != 98) {
            field_c = (gh) null;
            return true;
        }
        return true;
    }

    final static void a(byte param0) {
        pi.a(135, true, 170, true, new int[]{46, 40, 44, 3, 12, 13, 4, 50, 2, 14, 11}, 470, 1, 30);
        pi.a(118, true, 170, true, new int[]{1, 12, 13, 34, 47, 50, 3, 7}, 460, 2, 34);
        pi.a(430, false, 0, true, new int[]{15, 5}, 640, 3, 40);
        if (param0 > -76) {
            iq.a((byte) -70, -75);
        }
        pi.a(430, false, 30, true, new int[]{17, 6, 18}, 468, 4, 200);
        pi.a(430, false, 0, true, new int[]{15, 5}, 640, 5, 120);
        pi.a(430, false, 100, true, new int[]{2, 5}, 440, 6, 220);
        pi.a(200, true, 194, true, new int[]{15, 16}, 446, 7, 100);
        pi.a(400, false, 50, true, new int[]{5}, 288, 14, 40);
        pi.a(400, false, 50, true, new int[]{5}, 288, 8, 40);
        vk.a(new int[]{5, 39, 26, 27, 28, 29, 30, 31, 32, 33}, false, 9, 240, (byte) 123, new int[]{5, 39, 22, 23, 24, 25}, 400, 160, 428);
        int[] var2 = (int[]) null;
        pi.a(310, false, 180, true, (int[]) null, 440, 10, 60);
        pi.a(0, true, 0, true, new int[]{}, 0, 11, 0);
        pi.a(0, true, 0, true, new int[]{19}, 0, 12, 0);
        pi.a(430, true, 170, true, new int[]{6}, 470, 13, 0);
        pi.a(430, false, 30, true, new int[]{45, 5}, 468, 15, 330);
    }

    public static void a(boolean param0) {
        field_b = (int[][]) null;
        field_d = null;
        field_c = null;
        field_a = null;
        if (!param0) {
            iq.a(true);
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 == 99) {
            break L0;
          } else {
            iq.a(77);
            break L0;
          }
        }
        if ((param0 ^ -1) != 1) {
          L1: {
            if (21 == ai.field_b) {
              L2: {
                var2 = hg.field_rb;
                if (11 != (param0 ^ -1)) {
                  po.a((byte) -12, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 == (param0 ^ -1)) {
                  w.field_m = 0;
                  df.a(-17306, 1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-1 == (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                  w.field_m = w.field_m & -9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (-12 == param0) {
                  df.a(-17306, 0);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (hg.field_rb != 0) {
                  break L6;
                } else {
                  L7: {
                    if (gh.a(-3, param1 + 11554)) {
                      break L7;
                    } else {
                      if ((param0 ^ -1) == 13) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  df.a(-17306, jh.field_ic);
                  break L6;
                }
              }
              L8: {
                if (1 == hg.field_rb) {
                  L9: {
                    if (gh.a(-8, 11653)) {
                      df.a(param1 ^ -17403, 2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (2 != hg.field_rb) {
                    break L8;
                  } else {
                    if (!gh.a(-7, 11653)) {
                      break L8;
                    } else {
                      df.a(param1 + -17405, 3);
                      break L8;
                    }
                  }
                } else {
                  if (2 != hg.field_rb) {
                    break L8;
                  } else {
                    if (!gh.a(-7, 11653)) {
                      break L8;
                    } else {
                      df.a(param1 + -17405, 3);
                      break L8;
                    }
                  }
                }
              }
              L10: {
                if ((hg.field_rb ^ -1) == -4) {
                  L11: {
                    if (gh.a(-3, 11653)) {
                      df.a(-17306, 4);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (4 != hg.field_rb) {
                    break L10;
                  } else {
                    if (!gh.a(-13, 11653)) {
                      break L10;
                    } else {
                      df.a(param1 ^ -17403, 5);
                      break L10;
                    }
                  }
                } else {
                  if (4 != hg.field_rb) {
                    break L10;
                  } else {
                    if (!gh.a(-13, 11653)) {
                      break L10;
                    } else {
                      df.a(param1 ^ -17403, 5);
                      break L10;
                    }
                  }
                }
              }
              L12: {
                if (5 == hg.field_rb) {
                  if (gh.a(-4, 11653)) {
                    L13: {
                      if (-1 > (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                        df.a(param1 ^ -17403, 6);
                        break L13;
                      } else {
                        df.a(param1 + -17405, 7);
                        break L13;
                      }
                    }
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
                  } else {
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
                } else {
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
              }
              L14: {
                if (-8 != (hg.field_rb ^ -1)) {
                  break L14;
                } else {
                  if (gh.a(-5, 11653)) {
                    df.a(-17306, 6);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
              L15: {
                L16: {
                  if (6 == hg.field_rb) {
                    break L16;
                  } else {
                    if ((hg.field_rb ^ -1) != -8) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                if (!gh.a(-6, 11653)) {
                  break L15;
                } else {
                  if (!gh.a(-5, 11653)) {
                    break L15;
                  } else {
                    df.a(-17306, 8);
                    break L15;
                  }
                }
              }
              L17: {
                if (8 != hg.field_rb) {
                  break L17;
                } else {
                  if (!gh.a(-9, 11653)) {
                    break L17;
                  } else {
                    df.a(param1 + -17405, 9);
                    break L17;
                  }
                }
              }
              L18: {
                if (-10 != (hg.field_rb ^ -1)) {
                  break L18;
                } else {
                  if (gh.a(-10, 11653)) {
                    df.a(-17306, 10);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if ((hg.field_rb ^ -1) != -11) {
                  break L19;
                } else {
                  if (!gh.a(-11, 11653)) {
                    break L19;
                  } else {
                    df.a(-17306, 11);
                    break L19;
                  }
                }
              }
              L20: {
                if (hg.field_rb != 4) {
                  break L20;
                } else {
                  if (gh.a(-3, param1 + 11554)) {
                    break L20;
                  } else {
                    df.a(-17306, 3);
                    break L20;
                  }
                }
              }
              if (hg.field_rb == var2) {
                break L1;
              } else {
                L21: {
                  if (io.field_g) {
                    break L21;
                  } else {
                    if (-1 != (hg.field_rb ^ -1)) {
                      break L1;
                    } else {
                      break L21;
                    }
                  }
                }
                fb.field_e.c(true, hg.field_rb);
                break L1;
              }
            } else {
              L22: {
                if (19 == ai.field_b) {
                  break L22;
                } else {
                  if (ai.field_b != 20) {
                    if (-1 != param0) {
                      L23: {
                        if (-1 < (param0 ^ -1)) {
                          break L23;
                        } else {
                          if ((param0 ^ -1) >= -22) {
                            if (io.field_g) {
                              break L1;
                            } else {
                              df.a(param1 ^ -17403, 0);
                              break L1;
                            }
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (-14 == param0) {
                        if (hg.field_rb >= -1 + lm.field_pb) {
                          io.field_g = false;
                          break L1;
                        } else {
                          df.a(param1 ^ -17403, 1 + hg.field_rb);
                          break L1;
                        }
                      } else {
                        if (param0 != -3) {
                          break L1;
                        } else {
                          io.field_g = false;
                          break L1;
                        }
                      }
                    } else {
                      ai.field_b = -1;
                      io.field_g = false;
                      ml.field_Jb = -1;
                      hg.field_rb = -1;
                      se.field_E = 0;
                      ma.field_d = -1;
                      break L1;
                    }
                  } else {
                    break L22;
                  }
                }
              }
              if ((param0 ^ -1) == 0) {
                df.a(-17306, 0);
                break L1;
              } else {
                if (param0 == -14) {
                  if (-1 + lm.field_pb > hg.field_rb) {
                    df.a(-17306, 1 + hg.field_rb);
                    break L1;
                  } else {
                    L24: {
                      if (!pp.field_n) {
                        break L24;
                      } else {
                        pp.field_n = false;
                        we.field_g[7] = se.field_D;
                        break L24;
                      }
                    }
                    io.field_g = false;
                    break L1;
                  }
                } else {
                  break L1;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                iq.a(38, -116, 25);
                break L1;
              }
            }
            var3_int = 0;
            var4 = ce.field_k;
            L2: while (true) {
              if (var3_int >= hq.field_m.length) {
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = wd.field_Q[var3_int];
                  if ((var5 ^ -1) > -1) {
                    var4 = var4 + se.field_C;
                    break L3;
                  } else {
                    var6 = hn.a(0, hq.field_m[var3_int], true);
                    var7 = am.field_c + -(var6 >> -1877360671);
                    var4 = var4 + al.field_bb;
                    if (th.a(param0, var7 - no.field_Gb, param2, var6 - -(no.field_Gb << -1073271007), var4, (wk.field_G << -659720127) + me.field_h, -18)) {
                      stackIn_9_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (al.field_bb + (wk.field_G << -1187784735) + me.field_h);
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
          throw fa.a((Throwable) ((Object) var3), "iq.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
        field_e = 20;
        field_a = "Add friend";
        field_f = true;
        field_d = "You appear to be telling someone your password - please don't!";
    }
}
