/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends of {
    static boolean field_g;
    static int field_j;
    private java.nio.ByteBuffer field_i;
    static String field_h;

    final byte[] c(int param0) {
        byte[] var3 = new byte[((oi) this).field_i.capacity()];
        byte[] var2 = var3;
        if (param0 != 2) {
            byte[] discarded$0 = ((oi) this).c(-92);
        }
        java.nio.Buffer discarded$1 = ((oi) this).field_i.position(0);
        java.nio.ByteBuffer discarded$2 = ((oi) this).field_i.get(var3);
        return var3;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!gh.field_x) {
                pi.field_d[vj.field_c][ea.field_e] = p.a(pi.field_d[vj.field_c][ea.field_e], vi.field_a);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gh.field_x) {
                break L2;
              } else {
                if (!param0) {
                  k.field_b[vj.field_c] = p.a(k.field_b[vj.field_c], 1 << ea.field_e);
                  qi.a(false);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!gh.field_x) {
                break L3;
              } else {
                if (param0) {
                  break L3;
                } else {
                  hk.field_c[vj.field_c] = p.a(hk.field_c[vj.field_c], 1 << -6 + ea.field_e);
                  qi.a(false);
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                var3_int = 28;
                if (null == hf.field_d) {
                  break L5;
                } else {
                  if (var3_int <= hf.field_d.length) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              hf.field_d = null;
              hf.field_d = new byte[var3_int];
              break L4;
            }
            L6: {
              var4 = vj.field_c;
              var5 = 8 * var4;
              var6 = 0;
              if (param1) {
                break L6;
              } else {
                int discarded$1 = oi.a((byte) -108, 92);
                break L6;
              }
            }
            var7 = 0;
            var10 = 0;
            L7: while (true) {
              if (4 <= var10) {
                var10 = 0;
                L8: while (true) {
                  if (var10 >= 4) {
                    L9: {
                      var11 = 0;
                      var13 = ea.field_e + -6;
                      if (!gh.field_x) {
                        var14 = 0;
                        L10: while (true) {
                          if (wl.field_l[ea.field_e] <= var14) {
                            if (param0) {
                              break L9;
                            } else {
                              L11: {
                                var11 = 0;
                                var12 = k.field_b[var4];
                                if (uk.field_U[ea.field_e] >= 0) {
                                  var12 = var12 << uk.field_U[ea.field_e];
                                  break L11;
                                } else {
                                  var12 = var12 >> -uk.field_U[ea.field_e];
                                  break L11;
                                }
                              }
                              L12: {
                                if (b.field_N[ea.field_e] == 0) {
                                  var10 = var6;
                                  break L12;
                                } else {
                                  var10 = var7;
                                  break L12;
                                }
                              }
                              L13: {
                                var12 = var12 & nd.field_h[ea.field_e];
                                var10 = var10 & nd.field_h[ea.field_e];
                                if (0 == (var12 ^ var10)) {
                                  break L13;
                                } else {
                                  var11 = 1;
                                  break L13;
                                }
                              }
                              L14: {
                                if ((ea.field_e + 1) % 2 != 0) {
                                  break L14;
                                } else {
                                  var11 = 0;
                                  break L14;
                                }
                              }
                              L15: {
                                if (var11 != 0) {
                                  var5 = 8 * var4 - -(b.field_N[ea.field_e] * 4);
                                  hf.field_d[var5] = (byte)p.a((int) hf.field_d[var5], jh.a(var12, 255));
                                  hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(255, jh.a(65280, var12) >> 8));
                                  hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(16711680, var12), 16759179) >> 16);
                                  hf.field_d[var5 - -3] = (byte)p.a((int) hf.field_d[var5 - -3], jh.a(255, jh.a(-16777216, var12) >> 24));
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var11 = 0;
                              break L9;
                            }
                          } else {
                            L16: {
                              var12 = pi.field_d[var4][ea.field_e];
                              if (ra.field_p[ea.field_e][var14] < 0) {
                                var12 = var12 >> -ra.field_p[ea.field_e][var14];
                                break L16;
                              } else {
                                var12 = var12 << ra.field_p[ea.field_e][var14];
                                break L16;
                              }
                            }
                            L17: {
                              var12 = al.field_A[ea.field_e][var14] & var12;
                              if (0 != lc.field_p[ea.field_e][var14]) {
                                var10 = var7;
                                break L17;
                              } else {
                                var10 = var6;
                                break L17;
                              }
                            }
                            L18: {
                              var10 = var10 & al.field_A[ea.field_e][var14];
                              if ((var12 ^ var10) == 0) {
                                break L18;
                              } else {
                                var11 = 1;
                                break L18;
                              }
                            }
                            L19: {
                              if (var11 == 0) {
                                break L19;
                              } else {
                                var5 = var4 * 8 - -(4 * lc.field_p[ea.field_e][var14]);
                                hf.field_d[var5] = (byte)p.a((int) hf.field_d[var5], jh.a(var12, 255));
                                hf.field_d[var5 + 1] = (byte)p.a((int) hf.field_d[var5 + 1], jh.a(jh.a(65280, var12) >> 8, 255));
                                hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(16741916, jh.a(16711680, var12)) >> 16);
                                hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(255, jh.a(var12 >> 24, -1)));
                                break L19;
                              }
                            }
                            var11 = 0;
                            var14++;
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L20: {
                      if (!gh.field_x) {
                        break L20;
                      } else {
                        if (!param0) {
                          L21: {
                            var12 = hk.field_c[var4];
                            var11 = 0;
                            if (gb.field_c[var13] >= 0) {
                              var12 = var12 << gb.field_c[var13];
                              break L21;
                            } else {
                              var12 = var12 >> -gb.field_c[var13];
                              break L21;
                            }
                          }
                          L22: {
                            if (pd.field_f[var13] == 0) {
                              var10 = var6;
                              break L22;
                            } else {
                              var10 = var7;
                              break L22;
                            }
                          }
                          L23: {
                            var12 = var12 & rf.field_jb[var13];
                            var10 = var10 & rf.field_jb[var13];
                            if (0 != (var12 ^ var10)) {
                              var11 = 1;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if (var11 != 0) {
                              var5 = pd.field_f[var13] * 4 + 8 * var4;
                              hf.field_d[var5] = (byte)p.a((int) hf.field_d[var5], jh.a(255, var12));
                              hf.field_d[var5 - -1] = (byte)p.a((int) hf.field_d[var5 - -1], jh.a(jh.a(var12, 65280), 65479) >> 8);
                              hf.field_d[var5 - -2] = (byte)p.a((int) hf.field_d[var5 - -2], jh.a(16744105, jh.a(16711680, var12)) >> 16);
                              hf.field_d[3 + var5] = (byte)p.a((int) hf.field_d[3 + var5], jh.a(jh.a(-16777216, var12) >> 24, 255));
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          var11 = 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L25: {
                      var11 = 0;
                      var5 = 24;
                      var6 = hf.field_d[var5] + ((hf.field_d[var5 - -1] << 8) + ((hf.field_d[var5 + 2] << 16) + (hf.field_d[3 + var5] << 24)));
                      if (gh.field_x) {
                        break L25;
                      } else {
                        L26: {
                          var12 = hd.field_c[var4];
                          if (bj.field_a[var4] < 0) {
                            var12 = var12 >> -bj.field_a[var4];
                            break L26;
                          } else {
                            var12 = var12 << bj.field_a[var4];
                            break L26;
                          }
                        }
                        L27: {
                          var10 = var6;
                          var12 = oe.field_b[var4] & var12;
                          var10 = oe.field_b[var4] & var10;
                          if ((var12 ^ var10) != 0) {
                            var11 = 1;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (var11 != 0) {
                            var5 = 4 * oe.field_a[var4] + 24;
                            hf.field_d[var5] = (byte)p.a((int) hf.field_d[var5], jh.a(var12, 255));
                            hf.field_d[1 + var5] = (byte)p.a((int) hf.field_d[1 + var5], jh.a(65506, jh.a(65280, var12)) >> 8);
                            hf.field_d[2 + var5] = (byte)p.a((int) hf.field_d[2 + var5], jh.a(jh.a(var12 >> 16, 255), 255));
                            hf.field_d[var5 - -3] = (byte)p.a((int) hf.field_d[var5 - -3], jh.a(255, jh.a(-16777216, var12) >> 24));
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var11 = 0;
                        break L25;
                      }
                    }
                    L29: {
                      if (!param2) {
                        break L29;
                      } else {
                        if (bh.field_p) {
                          break L29;
                        } else {
                          if (!d.p(-113)) {
                            wj.field_b.a((da) (Object) new eh(hf.field_d), -50);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    L30: {
                      var8 = 0;
                      var9 = 0;
                      var8 = var8 | hf.field_d[var10 + var5 + 4];
                      if (0 == var10) {
                        var9 = 255;
                        break L30;
                      } else {
                        if (var10 != 1) {
                          if (var10 == 2) {
                            var9 = 16711680;
                            break L30;
                          } else {
                            if (var10 != 3) {
                              break L30;
                            } else {
                              var9 = -16777216;
                              break L30;
                            }
                          }
                        } else {
                          var9 = 65280;
                          break L30;
                        }
                      }
                    }
                    var7 = var7 | (255 & var8) << var10 * 8 & var9;
                    var10++;
                    continue L8;
                  }
                }
              } else {
                L31: {
                  var8 = 0;
                  var9 = 0;
                  if (var10 == 0) {
                    var9 = 255;
                    break L31;
                  } else {
                    if (1 != var10) {
                      if (2 == var10) {
                        var9 = 16711680;
                        break L31;
                      } else {
                        if (var10 == 3) {
                          var9 = -16777216;
                          break L31;
                        } else {
                          var8 = var8 | hf.field_d[var5 + var10];
                          var6 = var6 | (255 & var8) << 8 * var10 & var9;
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var9 = 65280;
                      break L31;
                    }
                  }
                }
                var8 = var8 | hf.field_d[var5 + var10];
                var6 = var6 | (255 & var8) << 8 * var10 & var9;
                var10++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "oi.J(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            oi.a(true, true, true);
        }
        qa.field_f = param1;
        ai.field_d = param0;
        lg.field_f = param3;
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = ra.field_j[0];
            if (param1 == var2_int) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3 = pa.field_v;
                var4 = -1;
                var4 = 0;
                if (param0 < -31) {
                  break L1;
                } else {
                  int discarded$2 = oi.a((byte) 8, -19);
                  break L1;
                }
              }
              L2: while (true) {
                if (var4 > 2) {
                  stackOut_16_0 = -1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  var7 = var3[var4][0][3];
                  var6 = var3[var4][0][2];
                  var5 = var6;
                  L3: while (true) {
                    if (var5 > var7) {
                      var4++;
                      continue L2;
                    } else {
                      if (param1 == var5) {
                        stackOut_12_0 = var4;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "oi.G(" + param0 + 44 + param1 + 41);
        }
        return stackIn_17_0;
    }

    final void a(int param0, byte[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((oi) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
              java.nio.Buffer discarded$7 = ((oi) this).field_i.position(0);
              java.nio.ByteBuffer discarded$8 = ((oi) this).field_i.put(param1);
              if (param0 == 50) {
                break L1;
              } else {
                oi.d(-112);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("oi.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 10166) {
            field_g = true;
        }
    }

    oi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Score: ";
        field_g = false;
    }
}
