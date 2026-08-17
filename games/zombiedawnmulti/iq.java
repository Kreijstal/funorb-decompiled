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
        RuntimeException var1 = null;
        int[][] stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 45) {
                break L1;
              } else {
                iq.a((byte) -49, 120);
                break L1;
              }
            }
            stackIn_3_0 = uf.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "iq.A(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param1 >= 0) {
              if (-1583 >= (param1 ^ -1)) {
                if (-1 != (param1 % 4 ^ -1)) {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 % 100 != 0) {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (0 != param1 % 400) {
                      stackIn_26_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param0 == 98) {
                        stackIn_31_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        field_c = (gh) null;
                        return true;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  if (0 != param1 % 4) {
                    stackIn_11_0 = 0;
                    break L1;
                  } else {
                    stackIn_11_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if ((param1 + 1) % 4 != 0) {
                  stackIn_5_0 = 0;
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "iq.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_26_0 != 0;
                } else {
                  return stackIn_31_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "iq.E(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
            field_b = (int[][]) null;
            field_d = null;
            field_c = null;
            field_a = null;
            if (!param0) {
                iq.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "iq.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 99) {
                break L1;
              } else {
                iq.a(77);
                break L1;
              }
            }
            if ((param0 ^ -1) != 1) {
              L2: {
                L3: {
                  if (21 == ai.field_b) {
                    L4: {
                      var2_int = hg.field_rb;
                      if (11 != (param0 ^ -1)) {
                        po.a((byte) -12, param0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (0 == (param0 ^ -1)) {
                        w.field_m = 0;
                        df.a(-17306, 1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 == (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                        w.field_m = w.field_m & -9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (-12 == param0) {
                        df.a(-17306, 0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (hg.field_rb != 0) {
                        break L8;
                      } else {
                        L9: {
                          if (gh.a(-3, param1 + 11554)) {
                            break L9;
                          } else {
                            if ((param0 ^ -1) == 13) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                        df.a(-17306, jh.field_ic);
                        break L8;
                      }
                    }
                    L10: {
                      if (1 != hg.field_rb) {
                        break L10;
                      } else {
                        if (gh.a(-8, 11653)) {
                          df.a(param1 ^ -17403, 2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (2 != hg.field_rb) {
                        break L11;
                      } else {
                        if (!gh.a(-7, 11653)) {
                          break L11;
                        } else {
                          df.a(param1 + -17405, 3);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if ((hg.field_rb ^ -1) != -4) {
                        break L12;
                      } else {
                        if (gh.a(-3, 11653)) {
                          df.a(-17306, 4);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (4 != hg.field_rb) {
                        break L13;
                      } else {
                        if (!gh.a(-13, 11653)) {
                          break L13;
                        } else {
                          df.a(param1 ^ -17403, 5);
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (5 != hg.field_rb) {
                        break L14;
                      } else {
                        if (!gh.a(-4, 11653)) {
                          break L14;
                        } else {
                          if (-1 > (fb.field_e.field_Q.a((byte) 98) ^ -1)) {
                            df.a(param1 ^ -17403, 6);
                            break L14;
                          } else {
                            df.a(param1 + -17405, 7);
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      if (hg.field_rb != 6) {
                        break L15;
                      } else {
                        if (!gh.a(-6, 11653)) {
                          break L15;
                        } else {
                          df.a(-17306, 7);
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (-8 != (hg.field_rb ^ -1)) {
                        break L16;
                      } else {
                        if (gh.a(-5, 11653)) {
                          df.a(-17306, 6);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (6 == hg.field_rb) {
                          break L18;
                        } else {
                          if ((hg.field_rb ^ -1) != -8) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (!gh.a(-6, 11653)) {
                        break L17;
                      } else {
                        if (!gh.a(-5, 11653)) {
                          break L17;
                        } else {
                          df.a(-17306, 8);
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (8 != hg.field_rb) {
                        break L19;
                      } else {
                        if (!gh.a(-9, 11653)) {
                          break L19;
                        } else {
                          df.a(param1 + -17405, 9);
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (-10 != (hg.field_rb ^ -1)) {
                        break L20;
                      } else {
                        if (gh.a(-10, 11653)) {
                          df.a(-17306, 10);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if ((hg.field_rb ^ -1) != -11) {
                        break L21;
                      } else {
                        if (!gh.a(-11, 11653)) {
                          break L21;
                        } else {
                          df.a(-17306, 11);
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if (hg.field_rb != 4) {
                        break L22;
                      } else {
                        if (gh.a(-3, param1 + 11554)) {
                          break L22;
                        } else {
                          df.a(-17306, 3);
                          break L22;
                        }
                      }
                    }
                    if (hg.field_rb == var2_int) {
                      break L3;
                    } else {
                      L23: {
                        if (io.field_g) {
                          break L23;
                        } else {
                          if (-1 != (hg.field_rb ^ -1)) {
                            break L3;
                          } else {
                            break L23;
                          }
                        }
                      }
                      fb.field_e.c(true, hg.field_rb);
                      break L2;
                    }
                  } else {
                    L24: {
                      if (19 == ai.field_b) {
                        break L24;
                      } else {
                        if (ai.field_b != 20) {
                          if (-1 != param0) {
                            L25: {
                              if (-1 < (param0 ^ -1)) {
                                break L25;
                              } else {
                                if ((param0 ^ -1) >= -22) {
                                  if (io.field_g) {
                                    break L3;
                                  } else {
                                    df.a(param1 ^ -17403, 0);
                                    break L2;
                                  }
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if (-14 == param0) {
                              if (hg.field_rb >= -1 + lm.field_pb) {
                                io.field_g = false;
                                break L2;
                              } else {
                                df.a(param1 ^ -17403, 1 + hg.field_rb);
                                break L2;
                              }
                            } else {
                              if (param0 != -3) {
                                break L3;
                              } else {
                                io.field_g = false;
                                break L2;
                              }
                            }
                          } else {
                            ai.field_b = -1;
                            io.field_g = false;
                            ml.field_Jb = -1;
                            hg.field_rb = -1;
                            se.field_E = 0;
                            ma.field_d = -1;
                            break L2;
                          }
                        } else {
                          break L24;
                        }
                      }
                    }
                    if ((param0 ^ -1) == 0) {
                      df.a(-17306, 0);
                      break L2;
                    } else {
                      if (param0 == -14) {
                        if (-1 + lm.field_pb > hg.field_rb) {
                          df.a(-17306, 1 + hg.field_rb);
                          break L2;
                        } else {
                          L26: {
                            if (!pp.field_n) {
                              break L26;
                            } else {
                              pp.field_n = false;
                              we.field_g[7] = se.field_D;
                              break L26;
                            }
                          }
                          io.field_g = false;
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              io.field_g = false;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "iq.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                stackIn_15_0 = -1;
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
                      stackIn_10_0 = var5;
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
          return stackIn_10_0;
        } else {
          return stackIn_15_0;
        }
    }

    static {
        field_e = 20;
        field_a = "Add friend";
        field_f = true;
        field_d = "You appear to be telling someone your password - please don't!";
    }
}
