/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ci field_g;
    private int field_d;
    private int field_h;
    static int field_i;
    private int field_c;
    static String field_a;
    private int field_b;
    private of field_e;
    static int field_f;

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (((aa) this).field_c != 4) {
                break L1;
              } else {
                if (vi.a(-3)) {
                  break L1;
                } else {
                  L2: {
                    if (param1 < 2) {
                      stackOut_9_0 = 300 + 240 * param1;
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 380;
                      stackIn_10_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  return stackIn_10_0;
                }
              }
            }
            if (((aa) this).field_c != 5) {
              L3: {
                if (param0 == -3) {
                  break L3;
                } else {
                  ((aa) this).field_e = null;
                  break L3;
                }
              }
              stackOut_17_0 = ak.field_r[((aa) this).field_c];
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_12_0 = this.e(0, param1) - -140;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -43) {
                break L1;
              } else {
                this.a(false, -21, 28);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (ak.field_q[((aa) this).field_c].length <= var4_int) {
                    break L4;
                  } else {
                    var5 = this.a(var4_int, 210);
                    stackOut_6_0 = this.a(var4_int, (byte) 113);
                    stackIn_26_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_7_0) {
                          break L5;
                        } else {
                          if (param0 < this.e(0, var4_int)) {
                            break L5;
                          } else {
                            if (param0 >= this.d(-3, var4_int)) {
                              break L5;
                            } else {
                              if (param2 < var5) {
                                break L5;
                              } else {
                                if (~(var5 - -this.c(32, var4_int)) >= ~param2) {
                                  break L5;
                                } else {
                                  stackOut_22_0 = var4_int;
                                  stackIn_23_0 = stackOut_22_0;
                                  return stackIn_23_0;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4_int++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_25_0 = -1;
                stackIn_26_0 = stackOut_25_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "aa.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_93_0 = 0;
        rk[] stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        int stackIn_93_5 = 0;
        int stackIn_93_6 = 0;
        int stackIn_93_7 = 0;
        int stackIn_93_8 = 0;
        boolean stackIn_93_9 = false;
        int stackIn_95_0 = 0;
        rk[] stackIn_95_1 = null;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        int stackIn_95_5 = 0;
        int stackIn_95_6 = 0;
        int stackIn_95_7 = 0;
        int stackIn_95_8 = 0;
        boolean stackIn_95_9 = false;
        int stackIn_96_0 = 0;
        rk[] stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        int stackIn_96_5 = 0;
        int stackIn_96_6 = 0;
        int stackIn_96_7 = 0;
        int stackIn_96_8 = 0;
        boolean stackIn_96_9 = false;
        int stackIn_96_10 = 0;
        int stackIn_97_0 = 0;
        rk[] stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_97_5 = 0;
        int stackIn_97_6 = 0;
        int stackIn_97_7 = 0;
        int stackIn_97_8 = 0;
        int stackIn_99_0 = 0;
        rk[] stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        int stackIn_99_5 = 0;
        int stackIn_99_6 = 0;
        int stackIn_99_7 = 0;
        int stackIn_99_8 = 0;
        int stackIn_100_0 = 0;
        rk[] stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        int stackIn_100_4 = 0;
        int stackIn_100_5 = 0;
        int stackIn_100_6 = 0;
        int stackIn_100_7 = 0;
        int stackIn_100_8 = 0;
        int stackIn_100_9 = 0;
        int stackIn_101_0 = 0;
        rk[] stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        int stackIn_101_5 = 0;
        int stackIn_101_6 = 0;
        int stackIn_101_7 = 0;
        boolean stackIn_101_8 = false;
        int stackIn_103_0 = 0;
        rk[] stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_103_5 = 0;
        int stackIn_103_6 = 0;
        int stackIn_103_7 = 0;
        boolean stackIn_103_8 = false;
        int stackIn_104_0 = 0;
        rk[] stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_104_5 = 0;
        int stackIn_104_6 = 0;
        int stackIn_104_7 = 0;
        boolean stackIn_104_8 = false;
        int stackIn_104_9 = 0;
        int stackIn_105_0 = 0;
        rk[] stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        int stackIn_105_5 = 0;
        int stackIn_105_6 = 0;
        int stackIn_105_7 = 0;
        int stackIn_107_0 = 0;
        rk[] stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        int stackIn_107_4 = 0;
        int stackIn_107_5 = 0;
        int stackIn_107_6 = 0;
        int stackIn_107_7 = 0;
        int stackIn_108_0 = 0;
        rk[] stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        int stackIn_108_4 = 0;
        int stackIn_108_5 = 0;
        int stackIn_108_6 = 0;
        int stackIn_108_7 = 0;
        int stackIn_108_8 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        Object stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        Object stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        Object stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        int stackIn_124_4 = 0;
        Object stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_92_0 = 0;
        rk[] stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        int stackOut_92_5 = 0;
        int stackOut_92_6 = 0;
        int stackOut_92_7 = 0;
        int stackOut_92_8 = 0;
        boolean stackOut_92_9 = false;
        int stackOut_95_0 = 0;
        rk[] stackOut_95_1 = null;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        int stackOut_95_5 = 0;
        int stackOut_95_6 = 0;
        int stackOut_95_7 = 0;
        int stackOut_95_8 = 0;
        boolean stackOut_95_9 = false;
        int stackOut_95_10 = 0;
        int stackOut_93_0 = 0;
        rk[] stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        int stackOut_93_5 = 0;
        int stackOut_93_6 = 0;
        int stackOut_93_7 = 0;
        int stackOut_93_8 = 0;
        boolean stackOut_93_9 = false;
        int stackOut_93_10 = 0;
        int stackOut_96_0 = 0;
        rk[] stackOut_96_1 = null;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_96_5 = 0;
        int stackOut_96_6 = 0;
        int stackOut_96_7 = 0;
        int stackOut_96_8 = 0;
        int stackOut_99_0 = 0;
        rk[] stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        int stackOut_99_5 = 0;
        int stackOut_99_6 = 0;
        int stackOut_99_7 = 0;
        int stackOut_99_8 = 0;
        int stackOut_99_9 = 0;
        int stackOut_97_0 = 0;
        rk[] stackOut_97_1 = null;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        int stackOut_97_5 = 0;
        int stackOut_97_6 = 0;
        int stackOut_97_7 = 0;
        int stackOut_97_8 = 0;
        int stackOut_97_9 = 0;
        int stackOut_100_0 = 0;
        rk[] stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        int stackOut_100_5 = 0;
        int stackOut_100_6 = 0;
        int stackOut_100_7 = 0;
        boolean stackOut_100_8 = false;
        int stackOut_103_0 = 0;
        rk[] stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        int stackOut_103_5 = 0;
        int stackOut_103_6 = 0;
        int stackOut_103_7 = 0;
        boolean stackOut_103_8 = false;
        int stackOut_103_9 = 0;
        int stackOut_101_0 = 0;
        rk[] stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        int stackOut_101_5 = 0;
        int stackOut_101_6 = 0;
        int stackOut_101_7 = 0;
        boolean stackOut_101_8 = false;
        int stackOut_101_9 = 0;
        int stackOut_104_0 = 0;
        rk[] stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        int stackOut_104_5 = 0;
        int stackOut_104_6 = 0;
        int stackOut_104_7 = 0;
        int stackOut_107_0 = 0;
        rk[] stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        int stackOut_107_4 = 0;
        int stackOut_107_5 = 0;
        int stackOut_107_6 = 0;
        int stackOut_107_7 = 0;
        int stackOut_107_8 = 0;
        int stackOut_105_0 = 0;
        rk[] stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        int stackOut_105_5 = 0;
        int stackOut_105_6 = 0;
        int stackOut_105_7 = 0;
        int stackOut_105_8 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        Object stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int stackOut_123_4 = 0;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int stackOut_121_4 = 0;
        Object stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.c(param0 ^ -40);
                if (nc.field_T == 0) {
                  break L2;
                } else {
                  if (16 <= nc.field_T) {
                    stackOut_7_0 = qk.field_h;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = ((aa) this).field_c;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
            L3: {
              var3 = stackIn_8_0;
              var4 = 64;
              var5 = wb.field_d;
              if (param0 == 59) {
                break L3;
              } else {
                this.a(108);
                break L3;
              }
            }
            L4: {
              var6 = wb.field_h;
              var7 = wb.field_c;
              if (var3 != 0) {
                break L4;
              } else {
                ph.a(-7125);
                break L4;
              }
            }
            L5: {
              if (rn.field_b != 2) {
                break L5;
              } else {
                L6: {
                  if (uh.i(23156) == null) {
                    break L6;
                  } else {
                    if (!uh.i(23156).field_g) {
                      break L5;
                    } else {
                      if (nc.field_T != 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  if (null == b.field_a) {
                    b.field_a = new km(wb.field_h, wb.field_c);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                b.field_a.e();
                nh.a();
                nh.c(370, 240 - -ec.c((byte) -63));
                break L5;
              }
            }
            L8: {
              L9: {
                L10: {
                  if (var3 == 0) {
                    break L10;
                  } else {
                    if (var3 == 6) {
                      break L10;
                    } else {
                      if (var3 == 4) {
                        break L10;
                      } else {
                        L11: {
                          if (5 != var3) {
                            break L11;
                          } else {
                            if (0 == qk.field_h) {
                              break L10;
                            } else {
                              if (pg.field_s == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        if (var3 != 8) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                qd.field_w.h(param0 ^ -113);
                var4 = 32;
                this.a(var4, -var2_int, 13551);
                if (var10 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
              L12: {
                if (var3 == 2) {
                  break L12;
                } else {
                  if (11 == var3) {
                    break L12;
                  } else {
                    if (var3 == 1) {
                      break L12;
                    } else {
                      if (var3 == 9) {
                        break L12;
                      } else {
                        L13: {
                          if (5 != var3) {
                            break L13;
                          } else {
                            if (0 == qk.field_h) {
                              break L13;
                            } else {
                              if (pg.field_s != 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (3 == var3) {
                            break L14;
                          } else {
                            if (var3 != 10) {
                              break L8;
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.a(17922);
                        var4 = 128;
                        if (var10 == 0) {
                          break L8;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
              }
              this.b(130);
              var4 = 128;
              this.a(var4 / 2, -var2_int, param0 ^ 13524);
              break L8;
            }
            L15: {
              this.f(var2_int, -7098);
              if (uh.i(param0 + 23097) == null) {
                break L15;
              } else {
                L16: {
                  if (((aa) this).field_c == 1) {
                    break L16;
                  } else {
                    if (2 == ((aa) this).field_c) {
                      break L16;
                    } else {
                      if (((aa) this).field_c == 11) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                L17: {
                  ek.a(16777215, ak.field_m[((aa) this).field_c] + -50, -100 + (var2_int - -320), 10, ak.field_m[((aa) this).field_c] - 25, 0, (byte) 63, 100 + var2_int + 320);
                  stackOut_92_0 = 16777215;
                  stackOut_92_1 = pg.field_v;
                  stackOut_92_2 = 320 + (var2_int - 90);
                  stackOut_92_3 = ak.field_m[((aa) this).field_c] - 50;
                  stackOut_92_4 = 3;
                  stackOut_92_5 = 60;
                  stackOut_92_6 = 0;
                  stackOut_92_7 = uh.i(23156).field_e / 50;
                  stackOut_92_8 = 3;
                  stackOut_92_9 = uh.i(param0 ^ 23119).field_b;
                  stackIn_95_0 = stackOut_92_0;
                  stackIn_95_1 = stackOut_92_1;
                  stackIn_95_2 = stackOut_92_2;
                  stackIn_95_3 = stackOut_92_3;
                  stackIn_95_4 = stackOut_92_4;
                  stackIn_95_5 = stackOut_92_5;
                  stackIn_95_6 = stackOut_92_6;
                  stackIn_95_7 = stackOut_92_7;
                  stackIn_95_8 = stackOut_92_8;
                  stackIn_95_9 = stackOut_92_9;
                  stackIn_93_0 = stackOut_92_0;
                  stackIn_93_1 = stackOut_92_1;
                  stackIn_93_2 = stackOut_92_2;
                  stackIn_93_3 = stackOut_92_3;
                  stackIn_93_4 = stackOut_92_4;
                  stackIn_93_5 = stackOut_92_5;
                  stackIn_93_6 = stackOut_92_6;
                  stackIn_93_7 = stackOut_92_7;
                  stackIn_93_8 = stackOut_92_8;
                  stackIn_93_9 = stackOut_92_9;
                  if (0 != (r.field_Eb / 50 & 1)) {
                    stackOut_95_0 = stackIn_95_0;
                    stackOut_95_1 = (rk[]) (Object) stackIn_95_1;
                    stackOut_95_2 = stackIn_95_2;
                    stackOut_95_3 = stackIn_95_3;
                    stackOut_95_4 = stackIn_95_4;
                    stackOut_95_5 = stackIn_95_5;
                    stackOut_95_6 = stackIn_95_6;
                    stackOut_95_7 = stackIn_95_7;
                    stackOut_95_8 = stackIn_95_8;
                    stackOut_95_9 = stackIn_95_9;
                    stackOut_95_10 = 0;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    stackIn_96_3 = stackOut_95_3;
                    stackIn_96_4 = stackOut_95_4;
                    stackIn_96_5 = stackOut_95_5;
                    stackIn_96_6 = stackOut_95_6;
                    stackIn_96_7 = stackOut_95_7;
                    stackIn_96_8 = stackOut_95_8;
                    stackIn_96_9 = stackOut_95_9;
                    stackIn_96_10 = stackOut_95_10;
                    break L17;
                  } else {
                    stackOut_93_0 = stackIn_93_0;
                    stackOut_93_1 = (rk[]) (Object) stackIn_93_1;
                    stackOut_93_2 = stackIn_93_2;
                    stackOut_93_3 = stackIn_93_3;
                    stackOut_93_4 = stackIn_93_4;
                    stackOut_93_5 = stackIn_93_5;
                    stackOut_93_6 = stackIn_93_6;
                    stackOut_93_7 = stackIn_93_7;
                    stackOut_93_8 = stackIn_93_8;
                    stackOut_93_9 = stackIn_93_9;
                    stackOut_93_10 = 1;
                    stackIn_96_0 = stackOut_93_0;
                    stackIn_96_1 = stackOut_93_1;
                    stackIn_96_2 = stackOut_93_2;
                    stackIn_96_3 = stackOut_93_3;
                    stackIn_96_4 = stackOut_93_4;
                    stackIn_96_5 = stackOut_93_5;
                    stackIn_96_6 = stackOut_93_6;
                    stackIn_96_7 = stackOut_93_7;
                    stackIn_96_8 = stackOut_93_8;
                    stackIn_96_9 = stackOut_93_9;
                    stackIn_96_10 = stackOut_93_10;
                    break L17;
                  }
                }
                L18: {
                  stackOut_96_0 = stackIn_96_0;
                  stackOut_96_1 = (rk[]) (Object) stackIn_96_1;
                  stackOut_96_2 = stackIn_96_2;
                  stackOut_96_3 = stackIn_96_3;
                  stackOut_96_4 = stackIn_96_4;
                  stackOut_96_5 = stackIn_96_5;
                  stackOut_96_6 = stackIn_96_6;
                  stackOut_96_7 = stackIn_96_7;
                  stackOut_96_8 = stackIn_96_8;
                  stackIn_99_0 = stackOut_96_0;
                  stackIn_99_1 = stackOut_96_1;
                  stackIn_99_2 = stackOut_96_2;
                  stackIn_99_3 = stackOut_96_3;
                  stackIn_99_4 = stackOut_96_4;
                  stackIn_99_5 = stackOut_96_5;
                  stackIn_99_6 = stackOut_96_6;
                  stackIn_99_7 = stackOut_96_7;
                  stackIn_99_8 = stackOut_96_8;
                  stackIn_97_0 = stackOut_96_0;
                  stackIn_97_1 = stackOut_96_1;
                  stackIn_97_2 = stackOut_96_2;
                  stackIn_97_3 = stackOut_96_3;
                  stackIn_97_4 = stackOut_96_4;
                  stackIn_97_5 = stackOut_96_5;
                  stackIn_97_6 = stackOut_96_6;
                  stackIn_97_7 = stackOut_96_7;
                  stackIn_97_8 = stackOut_96_8;
                  if (stackIn_96_9 | stackIn_96_10 == 0) {
                    stackOut_99_0 = stackIn_99_0;
                    stackOut_99_1 = (rk[]) (Object) stackIn_99_1;
                    stackOut_99_2 = stackIn_99_2;
                    stackOut_99_3 = stackIn_99_3;
                    stackOut_99_4 = stackIn_99_4;
                    stackOut_99_5 = stackIn_99_5;
                    stackOut_99_6 = stackIn_99_6;
                    stackOut_99_7 = stackIn_99_7;
                    stackOut_99_8 = stackIn_99_8;
                    stackOut_99_9 = 0;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    stackIn_100_3 = stackOut_99_3;
                    stackIn_100_4 = stackOut_99_4;
                    stackIn_100_5 = stackOut_99_5;
                    stackIn_100_6 = stackOut_99_6;
                    stackIn_100_7 = stackOut_99_7;
                    stackIn_100_8 = stackOut_99_8;
                    stackIn_100_9 = stackOut_99_9;
                    break L18;
                  } else {
                    stackOut_97_0 = stackIn_97_0;
                    stackOut_97_1 = (rk[]) (Object) stackIn_97_1;
                    stackOut_97_2 = stackIn_97_2;
                    stackOut_97_3 = stackIn_97_3;
                    stackOut_97_4 = stackIn_97_4;
                    stackOut_97_5 = stackIn_97_5;
                    stackOut_97_6 = stackIn_97_6;
                    stackOut_97_7 = stackIn_97_7;
                    stackOut_97_8 = stackIn_97_8;
                    stackOut_97_9 = 32;
                    stackIn_100_0 = stackOut_97_0;
                    stackIn_100_1 = stackOut_97_1;
                    stackIn_100_2 = stackOut_97_2;
                    stackIn_100_3 = stackOut_97_3;
                    stackIn_100_4 = stackOut_97_4;
                    stackIn_100_5 = stackOut_97_5;
                    stackIn_100_6 = stackOut_97_6;
                    stackIn_100_7 = stackOut_97_7;
                    stackIn_100_8 = stackOut_97_8;
                    stackIn_100_9 = stackOut_97_9;
                    break L18;
                  }
                }
                L19: {
                  se.a(stackIn_100_0, stackIn_100_1, stackIn_100_2, stackIn_100_3, stackIn_100_4, stackIn_100_5, stackIn_100_6, stackIn_100_7, stackIn_100_8 | stackIn_100_9, da.field_y);
                  stackOut_100_0 = 16711680;
                  stackOut_100_1 = pg.field_v;
                  stackOut_100_2 = 10 + (320 + var2_int);
                  stackOut_100_3 = -50 + ak.field_m[((aa) this).field_c];
                  stackOut_100_4 = 3;
                  stackOut_100_5 = 60;
                  stackOut_100_6 = 0;
                  stackOut_100_7 = uh.i(23156).field_v / 50;
                  stackOut_100_8 = uh.i(param0 ^ 23119).field_b;
                  stackIn_103_0 = stackOut_100_0;
                  stackIn_103_1 = stackOut_100_1;
                  stackIn_103_2 = stackOut_100_2;
                  stackIn_103_3 = stackOut_100_3;
                  stackIn_103_4 = stackOut_100_4;
                  stackIn_103_5 = stackOut_100_5;
                  stackIn_103_6 = stackOut_100_6;
                  stackIn_103_7 = stackOut_100_7;
                  stackIn_103_8 = stackOut_100_8;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  stackIn_101_3 = stackOut_100_3;
                  stackIn_101_4 = stackOut_100_4;
                  stackIn_101_5 = stackOut_100_5;
                  stackIn_101_6 = stackOut_100_6;
                  stackIn_101_7 = stackOut_100_7;
                  stackIn_101_8 = stackOut_100_8;
                  if ((r.field_Eb / 50 & 1) != 0) {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = (rk[]) (Object) stackIn_103_1;
                    stackOut_103_2 = stackIn_103_2;
                    stackOut_103_3 = stackIn_103_3;
                    stackOut_103_4 = stackIn_103_4;
                    stackOut_103_5 = stackIn_103_5;
                    stackOut_103_6 = stackIn_103_6;
                    stackOut_103_7 = stackIn_103_7;
                    stackOut_103_8 = stackIn_103_8;
                    stackOut_103_9 = 0;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    stackIn_104_2 = stackOut_103_2;
                    stackIn_104_3 = stackOut_103_3;
                    stackIn_104_4 = stackOut_103_4;
                    stackIn_104_5 = stackOut_103_5;
                    stackIn_104_6 = stackOut_103_6;
                    stackIn_104_7 = stackOut_103_7;
                    stackIn_104_8 = stackOut_103_8;
                    stackIn_104_9 = stackOut_103_9;
                    break L19;
                  } else {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = (rk[]) (Object) stackIn_101_1;
                    stackOut_101_2 = stackIn_101_2;
                    stackOut_101_3 = stackIn_101_3;
                    stackOut_101_4 = stackIn_101_4;
                    stackOut_101_5 = stackIn_101_5;
                    stackOut_101_6 = stackIn_101_6;
                    stackOut_101_7 = stackIn_101_7;
                    stackOut_101_8 = stackIn_101_8;
                    stackOut_101_9 = 1;
                    stackIn_104_0 = stackOut_101_0;
                    stackIn_104_1 = stackOut_101_1;
                    stackIn_104_2 = stackOut_101_2;
                    stackIn_104_3 = stackOut_101_3;
                    stackIn_104_4 = stackOut_101_4;
                    stackIn_104_5 = stackOut_101_5;
                    stackIn_104_6 = stackOut_101_6;
                    stackIn_104_7 = stackOut_101_7;
                    stackIn_104_8 = stackOut_101_8;
                    stackIn_104_9 = stackOut_101_9;
                    break L19;
                  }
                }
                L20: {
                  stackOut_104_0 = stackIn_104_0;
                  stackOut_104_1 = (rk[]) (Object) stackIn_104_1;
                  stackOut_104_2 = stackIn_104_2;
                  stackOut_104_3 = stackIn_104_3;
                  stackOut_104_4 = stackIn_104_4;
                  stackOut_104_5 = stackIn_104_5;
                  stackOut_104_6 = stackIn_104_6;
                  stackOut_104_7 = stackIn_104_7;
                  stackIn_107_0 = stackOut_104_0;
                  stackIn_107_1 = stackOut_104_1;
                  stackIn_107_2 = stackOut_104_2;
                  stackIn_107_3 = stackOut_104_3;
                  stackIn_107_4 = stackOut_104_4;
                  stackIn_107_5 = stackOut_104_5;
                  stackIn_107_6 = stackOut_104_6;
                  stackIn_107_7 = stackOut_104_7;
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  stackIn_105_3 = stackOut_104_3;
                  stackIn_105_4 = stackOut_104_4;
                  stackIn_105_5 = stackOut_104_5;
                  stackIn_105_6 = stackOut_104_6;
                  stackIn_105_7 = stackOut_104_7;
                  if (stackIn_104_8 | stackIn_104_9 != 0) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = (rk[]) (Object) stackIn_107_1;
                    stackOut_107_2 = stackIn_107_2;
                    stackOut_107_3 = stackIn_107_3;
                    stackOut_107_4 = stackIn_107_4;
                    stackOut_107_5 = stackIn_107_5;
                    stackOut_107_6 = stackIn_107_6;
                    stackOut_107_7 = stackIn_107_7;
                    stackOut_107_8 = 32;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    stackIn_108_2 = stackOut_107_2;
                    stackIn_108_3 = stackOut_107_3;
                    stackIn_108_4 = stackOut_107_4;
                    stackIn_108_5 = stackOut_107_5;
                    stackIn_108_6 = stackOut_107_6;
                    stackIn_108_7 = stackOut_107_7;
                    stackIn_108_8 = stackOut_107_8;
                    break L20;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = (rk[]) (Object) stackIn_105_1;
                    stackOut_105_2 = stackIn_105_2;
                    stackOut_105_3 = stackIn_105_3;
                    stackOut_105_4 = stackIn_105_4;
                    stackOut_105_5 = stackIn_105_5;
                    stackOut_105_6 = stackIn_105_6;
                    stackOut_105_7 = stackIn_105_7;
                    stackOut_105_8 = 0;
                    stackIn_108_0 = stackOut_105_0;
                    stackIn_108_1 = stackOut_105_1;
                    stackIn_108_2 = stackOut_105_2;
                    stackIn_108_3 = stackOut_105_3;
                    stackIn_108_4 = stackOut_105_4;
                    stackIn_108_5 = stackOut_105_5;
                    stackIn_108_6 = stackOut_105_6;
                    stackIn_108_7 = stackOut_105_7;
                    stackIn_108_8 = stackOut_105_8;
                    break L20;
                  }
                }
                se.a(stackIn_108_0, stackIn_108_1, stackIn_108_2, stackIn_108_3, stackIn_108_4, stackIn_108_5, stackIn_108_6, stackIn_108_7, stackIn_108_8 | 3, da.field_y);
                break L15;
              }
            }
            L21: {
              if (~((aa) this).field_c <= ~dc.field_n.length) {
                break L21;
              } else {
                if (dc.field_n[((aa) this).field_c] == null) {
                  break L21;
                } else {
                  dc.field_n[((aa) this).field_c].a(var2_int, 0);
                  break L21;
                }
              }
            }
            var8 = 0;
            var9 = ak.field_m[((aa) this).field_c];
            L22: while (true) {
              L23: {
                L24: {
                  L25: {
                    L26: {
                      if (~var8 <= ~((aa) this).field_e.field_f) {
                        break L26;
                      } else {
                        stackOut_117_0 = this;
                        stackOut_117_1 = 0;
                        stackOut_117_2 = var8;
                        stackOut_117_3 = var9;
                        stackIn_159_0 = stackOut_117_0;
                        stackIn_159_1 = stackOut_117_1;
                        stackIn_159_2 = stackOut_117_2;
                        stackIn_159_3 = stackOut_117_3;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        stackIn_118_3 = stackOut_117_3;
                        if (var10 != 0) {
                          break L25;
                        } else {
                          L27: {
                            stackOut_118_0 = this;
                            stackOut_118_1 = stackIn_118_1;
                            stackOut_118_2 = stackIn_118_2;
                            stackOut_118_3 = stackIn_118_3;
                            stackIn_123_0 = stackOut_118_0;
                            stackIn_123_1 = stackOut_118_1;
                            stackIn_123_2 = stackOut_118_2;
                            stackIn_123_3 = stackOut_118_3;
                            stackIn_119_0 = stackOut_118_0;
                            stackIn_119_1 = stackOut_118_1;
                            stackIn_119_2 = stackOut_118_2;
                            stackIn_119_3 = stackOut_118_3;
                            if (((aa) this).field_e.field_h != var8) {
                              stackOut_123_0 = this;
                              stackOut_123_1 = stackIn_123_1;
                              stackOut_123_2 = stackIn_123_2;
                              stackOut_123_3 = stackIn_123_3;
                              stackOut_123_4 = 0;
                              stackIn_124_0 = stackOut_123_0;
                              stackIn_124_1 = stackOut_123_1;
                              stackIn_124_2 = stackOut_123_2;
                              stackIn_124_3 = stackOut_123_3;
                              stackIn_124_4 = stackOut_123_4;
                              break L27;
                            } else {
                              stackOut_119_0 = this;
                              stackOut_119_1 = stackIn_119_1;
                              stackOut_119_2 = stackIn_119_2;
                              stackOut_119_3 = stackIn_119_3;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_121_1 = stackOut_119_1;
                              stackIn_121_2 = stackOut_119_2;
                              stackIn_121_3 = stackOut_119_3;
                              stackOut_121_0 = this;
                              stackOut_121_1 = stackIn_121_1;
                              stackOut_121_2 = stackIn_121_2;
                              stackOut_121_3 = stackIn_121_3;
                              stackOut_121_4 = 1;
                              stackIn_124_0 = stackOut_121_0;
                              stackIn_124_1 = stackOut_121_1;
                              stackIn_124_2 = stackOut_121_2;
                              stackIn_124_3 = stackOut_121_3;
                              stackIn_124_4 = stackOut_121_4;
                              break L27;
                            }
                          }
                          this.a(stackIn_124_1 != 0, stackIn_124_2, stackIn_124_3, stackIn_124_4 != 0, var2_int);
                          var9 = var9 + ak.field_y[((aa) this).field_c];
                          var8++;
                          if (var10 == 0) {
                            continue L22;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L28: {
                      L29: {
                        if (var3 == 3) {
                          break L29;
                        } else {
                          if (var3 != 10) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      var8 = 0;
                      L30: while (true) {
                        if (5 <= var8) {
                          break L28;
                        } else {
                          ok.field_Ib[var8].c((byte) 56);
                          var8++;
                          if (var10 != 0) {
                            break L24;
                          } else {
                            if (var10 == 0) {
                              continue L30;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                    if (((aa) this).field_c == 4) {
                      break L24;
                    } else {
                      L31: {
                        if (5 != ((aa) this).field_c) {
                          break L31;
                        } else {
                          this.b(var2_int, true);
                          if (var10 == 0) {
                            break L23;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L32: {
                        if (((aa) this).field_c == 6) {
                          break L32;
                        } else {
                          L33: {
                            if (((aa) this).field_c != 7) {
                              break L33;
                            } else {
                              this.a(-18210, true, var2_int);
                              if (var10 == 0) {
                                break L23;
                              } else {
                                break L33;
                              }
                            }
                          }
                          if (((aa) this).field_c == 8) {
                            ek.a(16777215, 155, 50 - -var2_int, 10, ak.field_m[((aa) this).field_c] - 30, 0, (byte) 63, var2_int + 590);
                            int discarded$1 = v.field_j.a(ad.field_d, var2_int + 50, 155, 540, 480, 16444375, -1, 0, 0, v.field_j.field_q);
                            if (var10 == 0) {
                              break L23;
                            } else {
                              break L32;
                            }
                          } else {
                            break L23;
                          }
                        }
                      }
                      stackOut_157_0 = this;
                      stackOut_157_1 = -18210;
                      stackOut_157_2 = 0;
                      stackOut_157_3 = var2_int;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      stackIn_159_2 = stackOut_157_2;
                      stackIn_159_3 = stackOut_157_3;
                      break L25;
                    }
                  }
                  this.a(stackIn_159_1, stackIn_159_2 != 0, stackIn_159_3);
                  if (var10 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
                this.b(-481, var2_int);
                break L23;
              }
              L34: {
                wb.a(var5, var6, var7);
                if (null == b.field_a) {
                  break L34;
                } else {
                  if (2 != rn.field_b) {
                    break L34;
                  } else {
                    L35: {
                      if (uh.i(23156) == null) {
                        break L35;
                      } else {
                        if (!uh.i(23156).field_g) {
                          break L34;
                        } else {
                          if (nc.field_T == 0) {
                            break L35;
                          } else {
                            break L34;
                          }
                        }
                      }
                    }
                    b.field_a.b(0, 0, var4 << 546974337);
                    break L34;
                  }
                }
              }
              L36: {
                if (oc.field_p != null) {
                  sf.b(16777215);
                  break L36;
                } else {
                  break L36;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.L(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                this.a(true, -60, -103, true, -118);
                break L1;
              }
            }
            stackOut_3_0 = 30;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 > 111) {
                break L1;
              } else {
                km[] discarded$2 = aa.a((km) null, 106);
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (vg.field_a == 13) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (jc.field_f != 5) {
                        break L4;
                      } else {
                        this.e(-36);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((aa) this).field_e.c((byte) 127);
                    break L3;
                  }
                  if (((aa) this).field_e.field_h != -1) {
                    this.a(false, 2, ((aa) this).field_e.field_h);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                L6: {
                  if (1 == ((aa) this).field_c) {
                    break L6;
                  } else {
                    if (((aa) this).field_c == 2) {
                      break L6;
                    } else {
                      if (((aa) this).field_c == 3) {
                        break L6;
                      } else {
                        if (((aa) this).field_c != 11) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (((aa) this).field_c != 3) {
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L7;
                  } else {
                    stackOut_29_0 = 1;
                    stackIn_32_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  var2_int = stackIn_32_0;
                  if (var2_int == 0) {
                    stackOut_35_0 = -1;
                    stackIn_36_0 = stackOut_35_0;
                    break L8;
                  } else {
                    stackOut_33_0 = -5;
                    stackIn_36_0 = stackOut_33_0;
                    break L8;
                  }
                }
                var3 = stackIn_36_0;
                uk.a(qk.field_h, false, 28333, var3);
                if (var4 == 0) {
                  break L1;
                } else {
                  break L5;
                }
              }
              if (7 == jc.field_f) {
                break L1;
              } else {
                var2_int = pg.field_s;
                uk.a(qk.field_h, false, 28333, var2_int);
                break L1;
              }
            }
            L9: {
              if (param0 > 89) {
                break L9;
              } else {
                this.a(-113, -38, -3);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.W(" + param0 + ')');
        }
    }

    private final void f(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 10;
              var4 = 0;
              var5 = 16777215;
              var6 = param0 + ak.field_k[((aa) this).field_c];
              var7 = ak.field_m[((aa) this).field_c];
              var8 = param0 + ak.field_r[((aa) this).field_c];
              var9 = -5;
              if (param1 == -7098) {
                break L1;
              } else {
                ((aa) this).field_h = 10;
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = ((aa) this).field_e.field_f * ak.field_y[((aa) this).field_c] + (var7 + var9);
                if (((aa) this).field_c != 5) {
                  break L3;
                } else {
                  var10 = var9 + (var7 + ak.field_y[((aa) this).field_c] * (-3 + ((aa) this).field_e.field_f));
                  ek.a(var5, var7, var6, var3_int, var10, var4, (byte) 63, var8);
                  var7 = 2 * ak.field_y[((aa) this).field_c] + var10 + -var9;
                  var10 = var7 + (var9 + ak.field_y[((aa) this).field_c]);
                  ek.a(var5, var7, var6, var3_int, var10, var4, (byte) 63, var8);
                  if (Chess.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ek.a(var5, var7, var6, var3_int, var10, var4, (byte) 63, var8);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 210) {
                break L1;
              } else {
                this.a(124, false, -22);
                break L1;
              }
            }
            L2: {
              if (((aa) this).field_c != 4) {
                break L2;
              } else {
                if (!vi.a(-3)) {
                  if (param0 < 2) {
                    stackOut_12_0 = ak.field_m[((aa) this).field_c];
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    stackOut_14_0 = ak.field_m[((aa) this).field_c] - -ak.field_y[((aa) this).field_c];
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (((aa) this).field_c == 5) {
              stackOut_19_0 = ak.field_m[((aa) this).field_c];
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0;
            } else {
              stackOut_21_0 = param0 * ak.field_y[((aa) this).field_c] + ak.field_m[((aa) this).field_c];
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                wg.field_p = param2;
                try {
                  L1: {
                    L2: {
                      L3: {
                        var3 = param0.getParameter("cookieprefix");
                        var4 = param0.getParameter("cookiehost");
                        var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                        if (param1 != ~param2.length()) {
                          break L3;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (Chess.field_G == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + sk.a(5, 94608000000L + ud.a(2)) + "; Max-Age=" + 94608000L;
                      break L2;
                    }
                    u.a((byte) -81, "document.cookie=\"" + var5 + "\"", param0);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    throwable = decompiledCaughtException;
                    break L4;
                  }
                }
                od.a(false, param0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) runtimeException;
                stackOut_9_1 = new StringBuilder().append("aa.EA(");
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_13_1 = stackOut_10_1;
                  stackIn_13_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wg var12_ref_wg = null;
        wg var13_ref_wg = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_37_0 = 0;
        int stackIn_51_0 = 0;
        wg stackIn_55_0 = null;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        wg stackOut_54_0 = null;
        wg stackOut_52_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        var14 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_f = -70;
                break L1;
              }
            }
            var6_int = ak.field_k[((aa) this).field_c] - -param4;
            var7 = ak.field_q[((aa) this).field_c][param1];
            var8 = fm.field_R[var7];
            if (35 == var7) {
              return;
            } else {
              L2: {
                if (var7 != 33) {
                  break L2;
                } else {
                  if (((aa) this).field_h != 19) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              L3: {
                if (var7 != 34) {
                  break L3;
                } else {
                  if (((aa) this).field_h == 25) {
                    return;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (12 == var7) {
                  var8 = da.field_C[tk.field_e];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var7 == 26) {
                  L6: {
                    L7: {
                      if (rn.field_b == 0) {
                        break L7;
                      } else {
                        L8: {
                          if (rn.field_b == 1) {
                            break L8;
                          } else {
                            var9_ref_String = pk.field_h;
                            if (var14 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var9_ref_String = sj.field_t;
                        if (var14 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9_ref_String = dm.field_a;
                    break L6;
                  }
                  var8 = var8 + var9_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L9: {
                if (param3) {
                  stackOut_36_0 = 13732679;
                  stackIn_37_0 = stackOut_36_0;
                  break L9;
                } else {
                  stackOut_34_0 = 16444375;
                  stackIn_37_0 = stackOut_34_0;
                  break L9;
                }
              }
              L10: {
                var9 = stackIn_37_0;
                if (~((aa) this).field_h == ~var7) {
                  var8 = "{<col=b0b0b0>" + var8 + "</col>}";
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                L12: {
                  var10 = 2043695;
                  v.field_j.a(var8, var6_int, v.field_j.field_C + param2, var9, var10);
                  if (var7 == 14) {
                    break L12;
                  } else {
                    if (var7 == 15) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  var11 = 75 + var6_int;
                  if (var7 == 14) {
                    stackOut_50_0 = lf.field_S;
                    stackIn_51_0 = stackOut_50_0;
                    break L13;
                  } else {
                    stackOut_48_0 = bc.field_b;
                    stackIn_51_0 = stackOut_48_0;
                    break L13;
                  }
                }
                L14: {
                  var12 = stackIn_51_0;
                  if (var7 != 14) {
                    stackOut_54_0 = hg.field_b;
                    stackIn_55_0 = stackOut_54_0;
                    break L14;
                  } else {
                    stackOut_52_0 = mi.field_q;
                    stackIn_55_0 = stackOut_52_0;
                    break L14;
                  }
                }
                var13_ref_wg = stackIn_55_0;
                var13_ref_wg.field_i = var11;
                var13_ref_wg.field_k = param2 + 8;
                var13_ref_wg.field_x = var12;
                var13_ref_wg.a(110);
                break L11;
              }
              L15: {
                L16: {
                  if (var7 != 32) {
                    break L16;
                  } else {
                    var11 = 67 + var6_int;
                    var12_ref_wg = nb.field_Fb;
                    if (var12_ref_wg == null) {
                      break L16;
                    } else {
                      var12_ref_wg.field_i = var11;
                      var12_ref_wg.field_k = param2 + 8;
                      var12_ref_wg.a(-116);
                      var13 = 0;
                      L17: while (true) {
                        if (~ok.field_Ib.length >= ~var13) {
                          break L16;
                        } else {
                          ok.field_Ib[var13].field_i = var12_ref_wg.field_i + 22 * var13;
                          ok.field_Ib[var13].field_k = v.field_j.field_q + (param2 - -6);
                          var13++;
                          if (var14 != 0) {
                            break L15;
                          } else {
                            if (var14 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (!param3) {
                  break L15;
                } else {
                  if (((aa) this).field_c == 9) {
                    L18: {
                      var11 = ak.field_m[((aa) this).field_c];
                      var12 = var6_int + 160;
                      if (0 != oc.field_p.field_C) {
                        stackOut_73_0 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        break L18;
                      } else {
                        stackOut_71_0 = 1;
                        stackIn_74_0 = stackOut_71_0;
                        break L18;
                      }
                    }
                    L19: {
                      var13 = stackIn_74_0;
                      if (var7 != 29) {
                        break L19;
                      } else {
                        rl.field_d[var13][3].c(var12, var11);
                        break L19;
                      }
                    }
                    L20: {
                      if (var7 != 28) {
                        break L20;
                      } else {
                        rl.field_d[var13][2].c(var12, var11);
                        break L20;
                      }
                    }
                    L21: {
                      if (var7 != 30) {
                        break L21;
                      } else {
                        rl.field_d[var13][5].c(var12, var11);
                        break L21;
                      }
                    }
                    if (var7 != 27) {
                      break L15;
                    } else {
                      rl.field_d[var13][4].c(var12, var11);
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var6, "aa.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        String var4 = null;
        int var5 = 0;
        int var6_int = 0;
        rk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((aa) this).field_c = 16;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          var6_int = ((aa) this).field_h;
                          if (var6_int == 20) {
                            var5 = 0;
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          } else {
                            L9: {
                              if (var6_int != 21) {
                                break L9;
                              } else {
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var6_int != 22) {
                                break L10;
                              } else {
                                if (var9 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (23 == var6_int) {
                              break L6;
                            } else {
                              L11: {
                                if (var6_int != 24) {
                                  break L11;
                                } else {
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var6_int == 25) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var5 = 1;
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                      var5 = 2;
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                    var5 = 3;
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                  var5 = 4;
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                var5 = 5;
                if (var9 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var5 = -1;
              break L2;
            }
            L12: {
              L13: {
                if (-1 != var5) {
                  break L13;
                } else {
                  var3_ref = wm.field_i;
                  var4 = sg.field_a;
                  if (var9 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              var4 = o.field_i[var5];
              var3_ref = pa.field_j[var5];
              break L12;
            }
            L14: {
              tb.field_a.b(-param0, 0);
              wb.c(tb.field_a.field_s + 1 + -param0, tb.field_a.field_r + 1, tb.field_a.field_w - 1, tb.field_a.field_t - 1, 1);
              v.field_j.a(var4, 15 - param0, v.field_j.field_q + 155, 4096, -1);
              int discarded$1 = jj.field_d.a(var3_ref, 15 + -param0, 165, 250, 640, 4096, -1, 0, 0, -1 + jj.field_d.field_q);
              if (var5 != -1) {
                var6 = jd.field_c[var5];
                var7 = 285 - param0;
                var8 = 148;
                var6.b(var7, var8);
                wb.f(var7 - 2, var8 + -2, var6.field_k - -4, 4 + var6.field_h, 2, 1);
                wb.c(-1 + var7, var8 + -1, var6.field_k - -3, var6.field_h - -3, 1);
                break L14;
              } else {
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = 87 % ((param0 - 70) / 52);
              if (nc.field_T == 0) {
                break L1;
              } else {
                L2: {
                  if (16 <= nc.field_T) {
                    break L2;
                  } else {
                    var2_int = nc.field_T * 640 / 16;
                    if (Chess.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = (-nc.field_T * 640 - -20480) / 16;
                break L1;
              }
            }
            stackOut_6_0 = var2_int;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.A(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var4_int = 300 - -param1;
            var5 = 50 + var4_int;
            var6 = var4_int;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6 <= ~var5) {
                    break L3;
                  } else {
                    wb.d(var6, 0, 0, var6, 16777215, param0);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4_int = param1 + 500;
                var5 = 75 + var4_int;
                break L2;
              }
              var6 = var4_int;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var6 >= var5) {
                      break L6;
                    } else {
                      wb.d(var6, 0, 0, var6, 16777215, param0);
                      var6++;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4_int = 600 - -param1;
                  var5 = 25 + var4_int;
                  break L5;
                }
                if (param2 == 13551) {
                  var6 = var4_int;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var5 <= var6) {
                          break L9;
                        } else {
                          wb.d(var6, 0, 0, var6, 16777215, param0);
                          var6++;
                          if (var7 != 0) {
                            break L8;
                          } else {
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) (Object) runtimeException, "aa.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, um param1) {
        RuntimeException var2 = null;
        nk var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        em var5 = null;
        int[] var6 = null;
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2_ref = new nk(param1.a("logo.fo3d", 30045, ""));
              if (param0 == -8428) {
                break L1;
              } else {
                field_f = 65;
                break L1;
              }
            }
            var3 = var2_ref.i(param0 ^ 8372);
            var2_ref.m(param0 ^ 18713);
            m.field_e = cl.a(param0 ^ 13190, var2_ref);
            ei.field_v = new em[var3];
            ql.field_a = new int[var3][];
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= var3) {
                    break L4;
                  } else {
                    ei.field_v[var4] = ac.a(var2_ref, true);
                    var4++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2_ref.g((byte) 67);
                break L3;
              }
              var4 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (~var4 <= ~var3) {
                      break L7;
                    } else {
                      var5 = ei.field_v[var4];
                      var5.a(6, 6, (byte) -70, 6, 1);
                      var5.a(param0 ^ -24341);
                      var6 = new int[]{var5.field_K + var5.field_P >> -1974506943, var5.field_I + var5.field_v >> 607540513, var5.field_x + var5.field_n >> -23409215};
                      ql.field_a[var4] = var6;
                      var5.a(-var6[1], -var6[0], -var6[2], (byte) -81);
                      var4++;
                      if (var7 != 0) {
                        break L6;
                      } else {
                        if (var7 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("aa.V(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L8;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (hj.field_i) {
                var3_int = param1 ? 1 : 0;
                uk.a(qk.field_h, var3_int != 0, 28333, -5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (hl.field_h) {
                la.a(11, (byte) -60, 0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 11) {
                break L3;
              } else {
                ((aa) this).field_d = -42;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((aa) this).field_e.b(false)) {
                break L1;
              } else {
                if (vg.field_a != 98) {
                  break L1;
                } else {
                  L2: while (true) {
                    L3: {
                      ((aa) this).field_e.field_h = ((aa) this).field_e.field_h - 1;
                      if (0 <= ((aa) this).field_e.field_h) {
                        break L3;
                      } else {
                        ((aa) this).field_e.field_h = -1 + ((aa) this).field_e.field_f;
                        break L3;
                      }
                    }
                    if (ak.field_q[jc.field_f][((aa) this).field_e.field_h] == 35) {
                      continue L2;
                    } else {
                      ((aa) this).field_e.field_e = false;
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (((aa) this).field_e.b(false)) {
                break L4;
              } else {
                if (vg.field_a == 99) {
                  L5: while (true) {
                    L6: {
                      ((aa) this).field_e.field_h = ((aa) this).field_e.field_h + 1;
                      if (((aa) this).field_e.field_f > ((aa) this).field_e.field_h) {
                        break L6;
                      } else {
                        ((aa) this).field_e.field_h = 0;
                        break L6;
                      }
                    }
                    if (ak.field_q[jc.field_f][((aa) this).field_e.field_h] == 35) {
                      continue L5;
                    } else {
                      ((aa) this).field_e.field_e = false;
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (param0 == -36) {
                break L7;
              } else {
                field_i = -71;
                break L7;
              }
            }
            ((aa) this).field_e.b((byte) -61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.M(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        wg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Chess.field_G;
          if (param1 == 2) {
            break L0;
          } else {
            field_f = -103;
            break L0;
          }
        }
        L1: {
          var4_int = ak.field_q[((aa) this).field_c][param2];
          if (!((aa) this).field_e.d((byte) 91)) {
            break L1;
          } else {
            if (var4_int == 14) {
              break L1;
            } else {
              if (var4_int == 15) {
                break L1;
              } else {
                if (var4_int == 32) {
                  break L1;
                } else {
                  wf.a(um.field_l[0], 59);
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          L3: {
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    L24: {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            L28: {
                                                              L29: {
                                                                var9 = var4_int;
                                                                if (var9 == 0) {
                                                                  break L29;
                                                                } else {
                                                                  L30: {
                                                                    if (var9 != 1) {
                                                                      break L30;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  L31: {
                                                                    if (var9 != 2) {
                                                                      break L31;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L27;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  L32: {
                                                                    if (var9 != 37) {
                                                                      break L32;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L27;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  L33: {
                                                                    if (var9 != 6) {
                                                                      break L33;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L26;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                  L34: {
                                                                    if (18 != var9) {
                                                                      break L34;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L25;
                                                                      } else {
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  L35: {
                                                                    if (var9 != 16) {
                                                                      break L35;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L24;
                                                                      } else {
                                                                        break L35;
                                                                      }
                                                                    }
                                                                  }
                                                                  L36: {
                                                                    if (var9 != 4) {
                                                                      break L36;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L23;
                                                                      } else {
                                                                        break L36;
                                                                      }
                                                                    }
                                                                  }
                                                                  L37: {
                                                                    if (var9 != 7) {
                                                                      break L37;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L22;
                                                                      } else {
                                                                        break L37;
                                                                      }
                                                                    }
                                                                  }
                                                                  L38: {
                                                                    if (var9 != 3) {
                                                                      break L38;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L21;
                                                                      } else {
                                                                        break L38;
                                                                      }
                                                                    }
                                                                  }
                                                                  L39: {
                                                                    if (var9 != 14) {
                                                                      break L39;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L20;
                                                                      } else {
                                                                        break L39;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var9 == 15) {
                                                                    break L19;
                                                                  } else {
                                                                    if (var9 == 5) {
                                                                      break L18;
                                                                    } else {
                                                                      L40: {
                                                                        if (var9 != 26) {
                                                                          break L40;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L17;
                                                                          } else {
                                                                            break L40;
                                                                          }
                                                                        }
                                                                      }
                                                                      L41: {
                                                                        if (8 != var9) {
                                                                          break L41;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L16;
                                                                          } else {
                                                                            break L41;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var9 == 9) {
                                                                        break L15;
                                                                      } else {
                                                                        if (10 == var9) {
                                                                          break L14;
                                                                        } else {
                                                                          if (11 == var9) {
                                                                            break L13;
                                                                          } else {
                                                                            L42: {
                                                                              if (var9 != 12) {
                                                                                break L42;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L12;
                                                                                } else {
                                                                                  break L42;
                                                                                }
                                                                              }
                                                                            }
                                                                            L43: {
                                                                              if (var9 != 17) {
                                                                                break L43;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L11;
                                                                                } else {
                                                                                  break L43;
                                                                                }
                                                                              }
                                                                            }
                                                                            L44: {
                                                                              if (var9 != 13) {
                                                                                break L44;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L10;
                                                                                } else {
                                                                                  break L44;
                                                                                }
                                                                              }
                                                                            }
                                                                            L45: {
                                                                              if (30 != var9) {
                                                                                break L45;
                                                                              } else {
                                                                                if (var11 == 0) {
                                                                                  break L9;
                                                                                } else {
                                                                                  break L45;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var9 == 27) {
                                                                              break L8;
                                                                            } else {
                                                                              if (28 == var9) {
                                                                                break L7;
                                                                              } else {
                                                                                L46: {
                                                                                  if (29 != var9) {
                                                                                    break L46;
                                                                                  } else {
                                                                                    if (var11 == 0) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      break L46;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var9 == 31) {
                                                                                  break L5;
                                                                                } else {
                                                                                  L47: {
                                                                                    if (var9 != 19) {
                                                                                      break L47;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L47;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L48: {
                                                                                    if (var9 != 20) {
                                                                                      break L48;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L48;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L49: {
                                                                                    if (var9 != 21) {
                                                                                      break L49;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L49;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L50: {
                                                                                    if (22 != var9) {
                                                                                      break L50;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L50;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L51: {
                                                                                    if (var9 != 23) {
                                                                                      break L51;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L51;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L52: {
                                                                                    if (var9 != 24) {
                                                                                      break L52;
                                                                                    } else {
                                                                                      if (var11 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L52;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (var9 == 25) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (var9 == 33) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      L53: {
                                                                                        if (var9 != 34) {
                                                                                          break L53;
                                                                                        } else {
                                                                                          if (var11 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L53;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L54: {
                                                                                        if (var9 != 35) {
                                                                                          break L54;
                                                                                        } else {
                                                                                          if (var11 == 0) {
                                                                                            break L2;
                                                                                          } else {
                                                                                            break L54;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (32 != var9) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        if (var11 == 0) {
                                                                                          break L3;
                                                                                        } else {
                                                                                          break L29;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              if (((aa) this).field_e.d((byte) 34)) {
                                                                qk.field_h = -3;
                                                                ph.a(-7125);
                                                                if (var11 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                            if (!((aa) this).field_e.d((byte) 34)) {
                                                              break L2;
                                                            } else {
                                                              L55: {
                                                                if (vi.a(-3)) {
                                                                  break L55;
                                                                } else {
                                                                  var9 = param0 ? 1 : 0;
                                                                  uk.a(qk.field_h, var9 != 0, 28333, -4);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L55;
                                                                  }
                                                                }
                                                              }
                                                              ca.a(0, v.field_j.field_t + (v.field_j.field_H + -2), v.field_j.field_H, gh.field_b, (byte) 113, 320, 240, gh.field_b, an.field_d, 8, 2, (lh) (Object) v.field_j, param0, 8, true);
                                                              if (var11 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          if (!((aa) this).field_e.d((byte) 84)) {
                                                            break L2;
                                                          } else {
                                                            var9 = param0 ? 1 : 0;
                                                            uk.a(qk.field_h, var9 != 0, 28333, -1);
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        if (!((aa) this).field_e.d((byte) 35)) {
                                                          break L2;
                                                        } else {
                                                          var9 = param0 ? 1 : 0;
                                                          uk.a(qk.field_h, var9 != 0, 28333, 0);
                                                          ma.field_D = false;
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      if (((aa) this).field_e.d((byte) 36)) {
                                                        var9 = param0 ? 1 : 0;
                                                        uk.a(qk.field_h, var9 != 0, 28333, 0);
                                                        mf.field_o = true;
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L24;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                    if (((aa) this).field_e.d((byte) 101)) {
                                                      var9 = param0 ? 1 : 0;
                                                      uk.a(qk.field_h, var9 != 0, param1 + 28331, 6);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L23;
                                                      }
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                  if (((aa) this).field_e.d((byte) 64)) {
                                                    var9 = param0 ? 1 : 0;
                                                    uk.a(qk.field_h, var9 != 0, param1 ^ 28335, 5);
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L22;
                                                    }
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                                if (((aa) this).field_e.d((byte) 40)) {
                                                  var9 = pg.field_s;
                                                  var10 = param0 ? 1 : 0;
                                                  uk.a(qk.field_h, var10 != 0, 28333, var9);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              }
                                              if (!((aa) this).field_e.d((byte) 101)) {
                                                break L2;
                                              } else {
                                                var9 = param0 ? 1 : 0;
                                                uk.a(qk.field_h, var9 != 0, 28333, 4);
                                                if (var11 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L56: {
                                              var5 = lf.field_S;
                                              if (!((aa) this).field_e.a((byte) 94)) {
                                                break L56;
                                              } else {
                                                an.a(0, (byte) 81);
                                                break L56;
                                              }
                                            }
                                            L57: {
                                              if (((aa) this).field_e.a(true)) {
                                                an.a(80, (byte) 84);
                                                break L57;
                                              } else {
                                                break L57;
                                              }
                                            }
                                            L58: {
                                              if (!((aa) this).field_e.b(false)) {
                                                break L58;
                                              } else {
                                                L59: {
                                                  mi.field_q.c((byte) 57);
                                                  if (mi.field_q.field_d) {
                                                    break L59;
                                                  } else {
                                                    L60: {
                                                      if (mi.field_q.field_i <= hn.field_k) {
                                                        break L60;
                                                      } else {
                                                        an.a(0, (byte) 87);
                                                        if (var11 == 0) {
                                                          break L58;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                    }
                                                    an.a(80, (byte) 99);
                                                    if (var11 == 0) {
                                                      break L58;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                }
                                                an.a(mi.field_q.field_x, (byte) 95);
                                                break L58;
                                              }
                                            }
                                            L61: {
                                              if (((aa) this).field_e.a(-97)) {
                                                dm.a(false);
                                                break L61;
                                              } else {
                                                break L61;
                                              }
                                            }
                                            L62: {
                                              if (((aa) this).field_e.b(97)) {
                                                vm.g(1);
                                                break L62;
                                              } else {
                                                break L62;
                                              }
                                            }
                                            if (~lf.field_S == ~var5) {
                                              break L2;
                                            } else {
                                              mi.field_q.field_x = lf.field_S;
                                              wf.a(um.field_l[0], 18);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L63: {
                                            var5 = bc.field_b;
                                            if (((aa) this).field_e.a((byte) 94)) {
                                              rf.b(80, 0);
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            if (((aa) this).field_e.a(true)) {
                                              rf.b(80, 80);
                                              break L64;
                                            } else {
                                              break L64;
                                            }
                                          }
                                          L65: {
                                            if (((aa) this).field_e.b(false)) {
                                              L66: {
                                                hg.field_b.c((byte) 90);
                                                if (!hg.field_b.field_d) {
                                                  break L66;
                                                } else {
                                                  rf.b(80, hg.field_b.field_x);
                                                  if (var11 == 0) {
                                                    break L65;
                                                  } else {
                                                    break L66;
                                                  }
                                                }
                                              }
                                              L67: {
                                                if (~hg.field_b.field_i >= ~hn.field_k) {
                                                  break L67;
                                                } else {
                                                  rf.b(param1 ^ 82, 0);
                                                  if (var11 == 0) {
                                                    break L65;
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                              }
                                              rf.b(param1 + 78, 80);
                                              break L65;
                                            } else {
                                              break L65;
                                            }
                                          }
                                          L68: {
                                            if (!((aa) this).field_e.a(param1 ^ -99)) {
                                              break L68;
                                            } else {
                                              cm.d((byte) -104);
                                              break L68;
                                            }
                                          }
                                          L69: {
                                            if (((aa) this).field_e.b(97)) {
                                              cl.a((byte) 27);
                                              break L69;
                                            } else {
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (~var5 == ~bc.field_b) {
                                              break L70;
                                            } else {
                                              hg.field_b.field_x = bc.field_b;
                                              wf.a(um.field_l[0], -77);
                                              break L70;
                                            }
                                          }
                                          ib.field_a = bc.field_b;
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        if (!((aa) this).field_e.d((byte) 111)) {
                                          break L2;
                                        } else {
                                          L71: {
                                            if (rm.field_R == null) {
                                              break L71;
                                            } else {
                                              b.a(true);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          fk.a(param0, 15);
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L72: {
                                        var6 = rn.field_b;
                                        if (((aa) this).field_e.c(84)) {
                                          rn.field_b = rn.field_b + 1;
                                          break L72;
                                        } else {
                                          break L72;
                                        }
                                      }
                                      L73: {
                                        if (!((aa) this).field_e.e(0)) {
                                          break L73;
                                        } else {
                                          rn.field_b = rn.field_b - 1;
                                          break L73;
                                        }
                                      }
                                      L74: {
                                        if (2 >= rn.field_b) {
                                          break L74;
                                        } else {
                                          rn.field_b = 0;
                                          break L74;
                                        }
                                      }
                                      L75: {
                                        if (0 <= rn.field_b) {
                                          break L75;
                                        } else {
                                          rn.field_b = 2;
                                          break L75;
                                        }
                                      }
                                      if (~rn.field_b == ~var6) {
                                        break L2;
                                      } else {
                                        ph.a(-7125);
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (((aa) this).field_e.d((byte) 99)) {
                                      lc.field_q = true;
                                      qk.field_h = 0;
                                      ma.field_D = false;
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                  if (((aa) this).field_e.d((byte) 63)) {
                                    oc.field_p.h(28);
                                    qk.field_h = -1;
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (!((aa) this).field_e.d((byte) 92)) {
                                  break L2;
                                } else {
                                  oc.field_p.b(true);
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (((aa) this).field_e.d((byte) 92)) {
                                this.a(param1 + 9, param0);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L2;
                              }
                            }
                            L76: {
                              if (((aa) this).field_e.e(0)) {
                                tk.field_e = tk.field_e - 1;
                                if (tk.field_e >= 0) {
                                  break L76;
                                } else {
                                  tk.field_e = -1 + cm.field_r.length;
                                  break L76;
                                }
                              } else {
                                break L76;
                              }
                            }
                            if (((aa) this).field_e.c(84)) {
                              tk.field_e = tk.field_e + 1;
                              if (cm.field_r.length == tk.field_e) {
                                tk.field_e = 0;
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                          if (!((aa) this).field_e.d((byte) 68)) {
                            break L2;
                          } else {
                            L77: {
                              if (((aa) this).field_c == 7) {
                                break L77;
                              } else {
                                L78: {
                                  if (((aa) this).field_c == 6) {
                                    break L78;
                                  } else {
                                    if (4 != jc.field_f) {
                                      break L2;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                                hj.a(((aa) this).field_c, ((aa) this).field_c, false);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L77;
                                }
                              }
                            }
                            hj.a(((aa) this).field_c, ((aa) this).field_c, false);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (!((aa) this).field_e.d((byte) 116)) {
                          break L2;
                        } else {
                          L79: {
                            if (rm.field_R != null) {
                              b.a(true);
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          dh.a(bh.i(81), true);
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (!((aa) this).field_e.d((byte) 123)) {
                        break L2;
                      } else {
                        this.a((byte) 110, 5);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (((aa) this).field_e.d((byte) 119)) {
                      this.a((byte) 125, 4);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (((aa) this).field_e.d((byte) 38)) {
                    this.a((byte) 112, 2);
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    break L2;
                  }
                }
                if (!((aa) this).field_e.d((byte) 114)) {
                  break L2;
                } else {
                  this.a((byte) 118, 3);
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              if (!((aa) this).field_e.d((byte) 43)) {
                break L2;
              } else {
                oc.field_p.field_t.a(-1, false, -1);
                qk.field_h = -1;
                if (var11 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L80: {
              if (!((aa) this).field_e.field_e) {
                break L80;
              } else {
                if (!((aa) this).field_e.d((byte) 84)) {
                  break L2;
                } else {
                  break L80;
                }
              }
            }
            ((aa) this).field_h = var4_int;
            if (var11 == 0) {
              break L2;
            } else {
              break L3;
            }
          }
          L81: {
            var7 = nb.field_Fb;
            if (null != var7) {
              break L81;
            } else {
              if (var11 == 0) {
                break L2;
              } else {
                break L81;
              }
            }
          }
          L82: {
            var7.c((byte) -119);
            if (null != uh.i(param1 + 23154)) {
              var7.field_y = uh.i(param1 ^ 23158).field_t.a((byte) -113);
              if (var7.field_x != -1) {
                break L82;
              } else {
                var7.field_x = var7.field_y;
                break L82;
              }
            } else {
              break L82;
            }
          }
          L83: {
            var8 = 0;
            if (((aa) this).field_e.b(97)) {
              L84: {
                nb.field_Fb.field_x = nb.field_Fb.field_x + 1;
                if (nb.field_Fb.field_y >= nb.field_Fb.field_x) {
                  break L84;
                } else {
                  nb.field_Fb.field_x = nb.field_Fb.field_y;
                  break L84;
                }
              }
              var8 = 1;
              break L83;
            } else {
              break L83;
            }
          }
          L85: {
            if (!((aa) this).field_e.a(param1 + -99)) {
              break L85;
            } else {
              L86: {
                nb.field_Fb.field_x = nb.field_Fb.field_x - 1;
                if (0 > nb.field_Fb.field_x) {
                  nb.field_Fb.field_x = 0;
                  break L86;
                } else {
                  break L86;
                }
              }
              var8 = 1;
              break L85;
            }
          }
          L87: {
            if (!var7.field_d) {
              break L87;
            } else {
              if (nb.field_Fb.field_x != uh.i(23156).field_t.field_o) {
                var8 = 1;
                break L87;
              } else {
                break L87;
              }
            }
          }
          if (var8 == 0) {
            break L2;
          } else {
            uh.i(23156).field_t.field_o = nb.field_Fb.field_x;
            wf.a(um.field_l[0], param1 + 122);
            break L2;
          }
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 108) {
                break L1;
              } else {
                ((aa) this).field_d = 116;
                break L1;
              }
            }
            L2: {
              if (uh.i(23156) == null) {
                break L2;
              } else {
                if (param1 == 0) {
                  break L2;
                } else {
                  uh.i(23156).field_l = param1;
                  qk.field_h = -1;
                  uh.i(23156).a(uh.i(23156).field_u, -111);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wg var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 5) {
                  break L2;
                } else {
                  ok.field_Ib[var2_int].b(-108);
                  var2_int++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var2_ref = nb.field_Fb;
                if (var2_ref != null) {
                  L4: {
                    if (ok.field_Ib[0].field_d) {
                      var2_ref.field_x = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!ok.field_Ib[1].field_d) {
                      break L5;
                    } else {
                      var2_ref.field_x = var2_ref.field_x - 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (!ok.field_Ib[2].field_u) {
                      break L6;
                    } else {
                      ((aa) this).field_b = 50 + r.field_Eb;
                      break L6;
                    }
                  }
                  L7: {
                    if (!ok.field_Ib[2].field_d) {
                      break L7;
                    } else {
                      if (~((aa) this).field_b >= ~r.field_Eb) {
                        ((aa) this).field_b = r.field_Eb - -50;
                        var2_ref.field_x = var2_ref.field_x + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (!ok.field_Ib[3].field_d) {
                      break L8;
                    } else {
                      var2_ref.field_x = var2_ref.field_x + 1;
                      break L8;
                    }
                  }
                  L9: {
                    if (!ok.field_Ib[4].field_d) {
                      break L9;
                    } else {
                      var2_ref.field_x = var2_ref.field_y;
                      break L9;
                    }
                  }
                  var2_ref.c((byte) 73);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (param0 < -91) {
                L10: {
                  if (((aa) this).field_d == 0) {
                    ((aa) this).field_d = th.field_d;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (r.field_bc) {
                    break L11;
                  } else {
                    if (fi.field_a) {
                      break L11;
                    } else {
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (!kf.d(18954)) {
                              break L14;
                            } else {
                              ((aa) this).b((byte) 101);
                              if (var3 != 0) {
                                break L13;
                              } else {
                                if (var3 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          ((aa) this).field_e.a(61, ak.field_k[((aa) this).field_c], ak.field_r[((aa) this).field_c], ak.field_y[((aa) this).field_c], ak.field_m[((aa) this).field_c]);
                          break L13;
                        }
                        if (-1 != ((aa) this).field_e.field_h) {
                          this.a(true, 2, ((aa) this).field_e.field_h);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                qd.field_w.a(-0.1, (double)r.field_Eb / 300.0, true);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.H(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        if (((aa) this).field_e.field_h != -1) {
            param2 = ((aa) this).field_e.field_h;
        }
        ((aa) this).field_e.a(param2, this.a(hn.field_k, (byte) -89, rf.field_b), param1, 0);
        if (param0 < 92) {
            return;
        }
        try {
            ad.field_a = -1;
            qf.field_e = -1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "aa.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        if (param0 != -57) {
            return;
        }
        try {
            if (((aa) this).field_c == 4) {
                ce.field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "aa.P(" + param0 + ')');
        }
    }

    aa(int param0) {
        ((aa) this).field_h = 19;
        ((aa) this).field_d = th.field_d;
        try {
            ((aa) this).field_c = param0;
            ((aa) this).field_e = new of(ak.field_q[((aa) this).field_c].length);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "aa.<init>(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        c var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_114_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_99_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_111_0 = 0;
        var18 = Chess.field_G;
        try {
          L0: {
            L1: {
              var4_ref = v.field_j;
              var5 = param2 + 90;
              var6 = new int[4];
              wb.b(var6);
              wb.b(5 + var5, 135, var5 - -455, 385);
              var7 = 16772045;
              wb.c(5 + var5, 135, 450, 250, 13875857, 15987691);
              var7 = 5189423;
              var8 = 0;
              if (param0 == -18210) {
                break L1;
              } else {
                ((aa) this).c((byte) 94);
                break L1;
              }
            }
            var9 = 16;
            L2: while (true) {
              stackOut_5_0 = -481;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 >= ~var9) {
                      break L5;
                    } else {
                      stackOut_7_0 = 16;
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var18 != 0) {
                        break L4;
                      } else {
                        var10 = stackIn_8_0;
                        L6: while (true) {
                          L7: {
                            if (640 <= var10) {
                              break L7;
                            } else {
                              stackOut_10_0 = var8;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var18 != 0) {
                                continue L3;
                              } else {
                                L8: {
                                  if (stackIn_11_0 != 0) {
                                    stackOut_14_0 = 0;
                                    stackIn_15_0 = stackOut_14_0;
                                    break L8;
                                  } else {
                                    stackOut_12_0 = 1;
                                    stackIn_15_0 = stackOut_12_0;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var8 = stackIn_15_0;
                                  if (var8 != 0) {
                                    wb.b(var10, var9, 44, 44, var7, 16);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var10 += 44;
                                if (var18 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var9 += 44;
                          if (var18 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  wb.a(var6);
                  stackOut_21_0 = param1;
                  stackIn_22_0 = stackOut_21_0 ? 1 : 0;
                  break L4;
                }
                L10: {
                  if (stackIn_22_0 != 0) {
                    stackOut_25_0 = vk.field_b;
                    stackIn_26_0 = stackOut_25_0;
                    break L10;
                  } else {
                    stackOut_23_0 = wc.field_w;
                    stackIn_26_0 = stackOut_23_0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var9 = stackIn_26_0;
                    var10 = var5 + 10;
                    ad.field_a = -1;
                    var11 = 146;
                    if ((1024 & var9) != 0) {
                      break L12;
                    } else {
                      if (qm.field_g == 1) {
                        break L12;
                      } else {
                        var12 = 44;
                        if (var18 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var12 = 40;
                  break L11;
                }
                var13 = 0;
                L13: while (true) {
                  L14: {
                    L15: {
                      if (~var13 <= ~da.field_m.length) {
                        break L15;
                      } else {
                        stackOut_34_0 = qm.field_f[var13];
                        stackIn_100_0 = stackOut_34_0 ? 1 : 0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var18 != 0) {
                          break L14;
                        } else {
                          L16: {
                            L17: {
                              if (stackIn_35_0) {
                                break L17;
                              } else {
                                if (0 == (var9 & 1 << var13)) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (-1 != ad.field_a) {
                                break L18;
                              } else {
                                if (hn.field_k < var10) {
                                  break L18;
                                } else {
                                  if (~(var10 - -var12) > ~hn.field_k) {
                                    break L18;
                                  } else {
                                    if (rf.field_b < var11) {
                                      break L18;
                                    } else {
                                      if (rf.field_b > var11 + 32) {
                                        break L18;
                                      } else {
                                        ad.field_a = var13;
                                        if (1 == ((aa) this).field_d) {
                                          L19: {
                                            L20: {
                                              if (~qf.field_e == ~ad.field_a) {
                                                break L20;
                                              } else {
                                                qf.field_e = ad.field_a;
                                                if (var18 == 0) {
                                                  break L19;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            qf.field_e = -1;
                                            break L19;
                                          }
                                          ((aa) this).field_d = 0;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L21: {
                              L22: {
                                if ((1 << var13 & var9) != 0) {
                                  break L22;
                                } else {
                                  if (param1) {
                                    break L16;
                                  } else {
                                    L23: {
                                      if (~var13 != ~qf.field_e) {
                                        break L23;
                                      } else {
                                        lj.field_n.c(6 + var10 + param2, var11);
                                        if (var18 == 0) {
                                          break L21;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    L24: {
                                      if (var13 == ad.field_a) {
                                        break L24;
                                      } else {
                                        lj.field_n.c(param2 + 6 + var10, var11);
                                        if (var18 == 0) {
                                          break L21;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    lj.field_n.c(6 + (var10 + param2), var11);
                                    if (var18 == 0) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              me.field_c[var13].c(6 + var10, var11);
                              break L21;
                            }
                            L25: {
                              if (~ad.field_a == ~var13) {
                                wb.g(var10 - -6, var11, 32, 32, 3100495, 64);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (~var13 == ~qf.field_e) {
                                wb.d(var10 + 6, var11, 32, 32, 3100495);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            wb.a(-10 + var10, 32 + (var11 + 5), var12 + 20, 1);
                            var10 = var10 + var12;
                            break L16;
                          }
                          var13++;
                          if (var18 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    var10 = 16 + (var5 + param2);
                    var11 = 210 + var4_ref.field_q;
                    ((aa) this).field_d = 0;
                    stackOut_99_0 = 0;
                    stackIn_100_0 = stackOut_99_0;
                    break L14;
                  }
                  L27: {
                    if (stackIn_100_0 == ~qf.field_e) {
                      stackOut_103_0 = ad.field_a;
                      stackIn_104_0 = stackOut_103_0;
                      break L27;
                    } else {
                      stackOut_101_0 = qf.field_e;
                      stackIn_104_0 = stackOut_101_0;
                      break L27;
                    }
                  }
                  L28: {
                    L29: {
                      var13 = stackIn_104_0;
                      if (-1 == var13) {
                        break L29;
                      } else {
                        L30: {
                          var4_ref.b("<u=000001>" + da.field_m[var13] + "</u>", param2 + 320, 210, 1, -1);
                          if (!vi.a(param0 + 18207)) {
                            break L30;
                          } else {
                            jj.field_b.b(bf.field_N, 320 + param2, var11, 1, -1);
                            break L30;
                          }
                        }
                        L31: {
                          if ((1 << var13 & var9) == 0) {
                            stackOut_113_0 = 0;
                            stackIn_114_0 = stackOut_113_0;
                            break L31;
                          } else {
                            stackOut_111_0 = 1;
                            stackIn_114_0 = stackOut_111_0;
                            break L31;
                          }
                        }
                        L32: {
                          var14_int = stackIn_114_0;
                          var15_ref = null;
                          if (var14_int != 0) {
                            me.field_c[var13].a(var10, var11);
                            var15_ref_String = ca.field_d;
                            break L32;
                          } else {
                            lj.field_n.a(var10, var11);
                            var15_ref_String = hm.field_d;
                            break L32;
                          }
                        }
                        var4_ref.a(var15_ref_String, var10, lj.field_n.field_h + var11 + var4_ref.field_q, 1, -1);
                        var10 = var10 + (16 + lj.field_n.field_k + 20);
                        var16 = 460 + var5;
                        int discarded$1 = var4_ref.a(ai.field_a[var13], var10, var11, -var10 + (-10 + var16), 480, 1, -1, 0, 0, var4_ref.field_C);
                        var11 += 7;
                        var4_ref.a(pd.field_Ob + ma.field_J[var13], var10, var11 + 4 * var4_ref.field_q, 1, -1);
                        var11 = var11 + (-(ao.field_e.field_h / 4) + 128);
                        var4_ref.a(hc.field_d, var10, var4_ref.field_C + var11, 1, -1);
                        var17 = 0;
                        L33: while (true) {
                          L34: {
                            if (var17 >= se.field_ab[var13]) {
                              break L34;
                            } else {
                              ao.field_e.c(var17 * 5 + var4_ref.b(hc.field_d) + (10 + var10), var11);
                              var17++;
                              if (var18 != 0) {
                                break L28;
                              } else {
                                if (var18 == 0) {
                                  continue L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          if (var18 == 0) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    var4_ref.b(gh.field_d, param2 + 320, 210, 1, -1);
                    break L28;
                  }
                  var14 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
                  var15 = 4;
                  L35: while (true) {
                    L36: {
                      L37: {
                        if (var15 < 0) {
                          break L37;
                        } else {
                          wb.a(var15 + var5, var15 + 130, 460 - (var15 << 1289375809), 260 + -(var15 << 1574632577), 10 - var15, var14[var15]);
                          wb.a(var15 + var5, var15 + 130, 460 + -(var15 << -1523232735), 260 - (var15 << -125393087), 10 - (var15 << 1479847617), var14[var15]);
                          var15--;
                          if (var18 != 0) {
                            break L36;
                          } else {
                            if (var18 == 0) {
                              continue L35;
                            } else {
                              break L37;
                            }
                          }
                        }
                      }
                      break L36;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "aa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static km[] a(km param0, int param1) {
        km[] var2 = null;
        RuntimeException var2_ref = null;
        km[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        km[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new km[9];
            var2[param1] = param0;
            stackOut_0_0 = (km[]) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("aa.I(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void d(int param0) {
        try {
            field_a = null;
            field_g = null;
            if (param0 != 0) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "aa.R(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        c var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        String var11_ref_String = null;
        String[] var12_ref_String__ = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        String var22 = null;
        int var23_int = 0;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        int var29 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_48_0 = null;
        String stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_47_0 = null;
        String stackOut_45_0 = null;
        String stackOut_62_0 = null;
        String stackOut_60_0 = null;
        var29 = Chess.field_G;
        try {
          L0: {
            var3_ref = v.field_j;
            ak.field_y[4] = ak.field_y[6];
            if (param0 == -481) {
              var4 = 70 + param1;
              var5 = new int[4];
              wb.b(var5);
              wb.b(5 + var4, 135, -10 + var4 - -5 - -500, 385);
              wb.c(5 + var4, 135, 490, 250, 13875857, 15987691);
              var6 = 16772045;
              var6 = 5189423;
              var7 = 0;
              var8 = 16;
              L1: while (true) {
                stackOut_4_0 = -481;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= ~var8) {
                        break L4;
                      } else {
                        stackOut_6_0 = 16;
                        stackIn_20_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var29 != 0) {
                          break L3;
                        } else {
                          var9 = stackIn_7_0;
                          L5: while (true) {
                            L6: {
                              if (var9 >= 640) {
                                break L6;
                              } else {
                                stackOut_9_0 = var7;
                                stackIn_5_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var29 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_10_0 != 0) {
                                      stackOut_13_0 = 0;
                                      stackIn_14_0 = stackOut_13_0;
                                      break L7;
                                    } else {
                                      stackOut_11_0 = 1;
                                      stackIn_14_0 = stackOut_11_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    var7 = stackIn_14_0;
                                    if (var7 == 0) {
                                      break L8;
                                    } else {
                                      wb.b(var9, var8, 44, 44, var6, 16);
                                      break L8;
                                    }
                                  }
                                  var9 += 44;
                                  if (var29 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var8 += 44;
                            if (var29 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    wb.a(var5);
                    var8 = 110 + param1;
                    stackOut_19_0 = 550 - -param1;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  }
                  L9: {
                    L10: {
                      var9 = stackIn_20_0;
                      if (vi.a(-3)) {
                        break L10;
                      } else {
                        L11: {
                          if (ce.field_b != null) {
                            break L11;
                          } else {
                            ce.field_b = ge.a(true, 7, 0, 10);
                            break L11;
                          }
                        }
                        L12: {
                          L13: {
                            var10_int = tk.field_e;
                            if (ce.field_b.field_l) {
                              break L13;
                            } else {
                              var11_ref_String = m.field_c;
                              if (var29 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (null != ce.field_b.field_t) {
                              break L14;
                            } else {
                              var11_ref_String = ii.field_O;
                              if (var29 == 0) {
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var11_ref_String = um.field_h;
                          var12_ref_String__ = ce.field_b.field_t[var10_int];
                          var13 = ce.field_b.field_j[var10_int];
                          var14 = 140 + var3_ref.field_C;
                          var15 = 1;
                          var3_ref.a(ao.field_j, var8, var14, var15, -1);
                          var3_ref.c(tk.field_f, -220 + var9, var14, var15, -1);
                          var3_ref.c(qe.field_y, var9 + -150, var14, var15, -1);
                          var3_ref.b(fm.field_O, -115 + var9, var14, var15, -1);
                          var3_ref.b(mh.field_g, var9 + -65, var14, var15, -1);
                          var3_ref.b(kl.field_a, var9 + -15, var14, var15, -1);
                          wb.e(-35 + var8, 1 - -var14, 50 + var9 - var8, 1, 128);
                          wb.e(var8 + -35, var14 + 1 + 2, -var8 + var9 - -50, 1, 128);
                          var14 += 20;
                          var16 = 0;
                          var17 = 0;
                          L15: while (true) {
                            L16: {
                              if (var17 >= 10) {
                                break L16;
                              } else {
                                if (var29 != 0) {
                                  break L12;
                                } else {
                                  L17: {
                                    if (null != var12_ref_String__[var17]) {
                                      L18: {
                                        var18 = 1;
                                        var19 = var13[4 * var17 + 1];
                                        var20 = var13[var17 * 4 + 2];
                                        var21 = var13[var17 * 4 + 3];
                                        var22_int = var13[4 * var17];
                                        var23_int = var19 - (-var20 - var21);
                                        var24 = var12_ref_String__[var17];
                                        if (qd.a((byte) 13, var24)) {
                                          var16 = 1;
                                          var18 = 13732679;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        var3_ref.c(var17 - -1 + ". ", var8, var14, var18, -1);
                                        var3_ref.a(var24, var8, var14, var18, -1);
                                        var3_ref.c(Integer.toString(var22_int), -220 + var9, var14, var18, -1);
                                        if (var23_int > 50) {
                                          stackOut_47_0 = "50+";
                                          stackIn_48_0 = stackOut_47_0;
                                          break L19;
                                        } else {
                                          stackOut_45_0 = Integer.toString(var23_int);
                                          stackIn_48_0 = stackOut_45_0;
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        L21: {
                                          var25 = stackIn_48_0;
                                          var3_ref.c(var25, var9 + -150, var14, var18, -1);
                                          if (var23_int == 0) {
                                            break L21;
                                          } else {
                                            var26 = oc.a(wf.field_S, new String[1], (byte) -95);
                                            var27 = oc.a(wf.field_S, new String[1], (byte) -59);
                                            var28 = oc.a(wf.field_S, new String[1], (byte) -96);
                                            if (var29 == 0) {
                                              break L20;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        var28 = Chess.field_C;
                                        var27 = Chess.field_C;
                                        var26 = Chess.field_C;
                                        break L20;
                                      }
                                      var3_ref.b(var26, var9 + -115, var14, var18, -1);
                                      var3_ref.b(var27, -65 + var9, var14, var18, -1);
                                      var3_ref.b(var28, var9 + -15, var14, var18, -1);
                                      wb.e(var8 + -35, var14 + 1, var9 + -var8 - -50, 1, 32);
                                      wb.a(-278 + var9, -19 + var14, 20, 1, 16);
                                      wb.a(-215 + var9, 1 - (-var14 - -20), 20, 1, 16);
                                      wb.a(var9 + -140, 1 - -var14 - 20, 20, 1, 16);
                                      wb.a(-90 + var9, -20 + (var14 + 1), 20, 1, 16);
                                      var11_ref_String = "";
                                      wb.a(var9 - 40, var14 + -19, 20, 1, 16);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  var14 += 20;
                                  var17++;
                                  if (var29 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            if (var16 != 0) {
                              break L12;
                            } else {
                              if (var11_ref_String.length() == 0) {
                                L22: {
                                  var17 = 13732679;
                                  var3_ref.a(ci.field_J, var8, var14, var17, -1);
                                  var3_ref.c(Integer.toString(ce.field_b.field_k), var9 - 220, var14, var17, -1);
                                  var18 = ce.field_b.field_m;
                                  var19 = ce.field_b.field_r;
                                  var20 = ce.field_b.field_p;
                                  var21 = var20 + var18 + var19;
                                  if (50 < var21) {
                                    stackOut_62_0 = "50+";
                                    stackIn_63_0 = stackOut_62_0;
                                    break L22;
                                  } else {
                                    stackOut_60_0 = Integer.toString(var21);
                                    stackIn_63_0 = stackOut_60_0;
                                    break L22;
                                  }
                                }
                                L23: {
                                  L24: {
                                    var25 = stackIn_63_0;
                                    var3_ref.c(var25, -150 + var9, var14, var17, -1);
                                    if (0 == var21) {
                                      break L24;
                                    } else {
                                      var22 = oc.a(wf.field_S, new String[1], (byte) -102);
                                      var23 = oc.a(wf.field_S, new String[1], (byte) -88);
                                      var24 = oc.a(wf.field_S, new String[1], (byte) -98);
                                      if (var29 == 0) {
                                        break L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var24 = Chess.field_C;
                                  var23 = Chess.field_C;
                                  var22 = Chess.field_C;
                                  break L23;
                                }
                                var3_ref.b(var22, var9 + -115, var14, var17, -1);
                                var3_ref.b(var23, -65 + var9, var14, var17, -1);
                                var3_ref.b(var24, var9 + -15, var14, var17, -1);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var12 = 100 + var3_ref.field_C + 140;
                        var3_ref.b(var11_ref_String, param1 + 330, var12, 1, -1);
                        if (var29 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    v.field_j.b(bf.field_N, param1 + 320, 240, 1, -1);
                    break L9;
                  }
                  var10 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
                  var11 = 4;
                  L25: while (true) {
                    L26: {
                      L27: {
                        if (var11 < 0) {
                          break L27;
                        } else {
                          wb.a(var11 + var4, 130 + var11, 500 + -(var11 << -1413404575), 260 + -(var11 << 53236161), -var11 + 10, var10[var11]);
                          wb.a(var11 + var4, var11 + 130, -(var11 << -196184831) + 500, -(var11 << -137978655) + 260, 10 - (var11 << 1342469249), var10[var11]);
                          var11--;
                          if (var29 != 0) {
                            break L26;
                          } else {
                            if (var29 == 0) {
                              continue L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      break L26;
                    }
                    break L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final int e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((aa) this).field_h = -33;
                break L1;
              }
            }
            L2: {
              if (4 != ((aa) this).field_c) {
                break L2;
              } else {
                if (vi.a(-3)) {
                  break L2;
                } else {
                  L3: {
                    if (2 <= param1) {
                      stackOut_12_0 = 260;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 100 + 240 * param1;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  return stackIn_13_0;
                }
              }
            }
            if (((aa) this).field_c == 5) {
              stackOut_17_0 = 180 * param1 + ak.field_k[((aa) this).field_c];
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0;
            } else {
              stackOut_19_0 = ak.field_k[((aa) this).field_c];
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var3, "aa.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    private final void a(int param0) {
        Object var2_ref2 = null;
        RuntimeException var2 = null;
        km var2_ref = null;
        qe var3 = null;
        int var4 = 0;
        int var5_int = 0;
        wg var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        String[] var11_ref_String__ = null;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        eb stackIn_83_0 = null;
        eb stackIn_84_0 = null;
        eb stackIn_86_0 = null;
        eb stackIn_88_0 = null;
        eb stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        eb stackOut_82_0 = null;
        eb stackOut_83_0 = null;
        eb stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        eb stackOut_84_0 = null;
        eb stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        var2_ref2 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (uh.i(23156) != null) {
                L2: {
                  L3: {
                    uh.i(23156).field_t.f(nb.field_Fb.field_y, -1);
                    var2_ref2 = null;
                    var3 = uh.i(param0 + 5234).field_t.field_K;
                    if (var3 != null) {
                      break L3;
                    } else {
                      var4 = -1;
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (((uk) (Object) var3).a((byte) 61, 4096)) {
                      break L4;
                    } else {
                      L5: {
                        if (!((uk) (Object) var3).a((byte) 61, 0)) {
                          break L5;
                        } else {
                          var4 = 1;
                          if (var15 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (!uh.i(23156).field_B.field_d) {
                          break L6;
                        } else {
                          var4 = eg.a(uh.i(param0 ^ 7286).field_B.field_l, 0, uh.i(23156).field_B.field_k);
                          if (var15 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 = -1;
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4 = 0;
                  break L2;
                }
                L7: {
                  L8: {
                    var5_int = var4;
                    if (var5_int == 0) {
                      break L8;
                    } else {
                      L9: {
                        if (var5_int != 1) {
                          break L9;
                        } else {
                          if (var15 == 0) {
                            var2_ref = vn.field_Bb;
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var5_int == -1) {
                          break L10;
                        } else {
                          if (-3 != var5_int) {
                            var2_ref = fa.field_e;
                            break L7;
                          } else {
                            if (var15 == 0) {
                              break L10;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      var2_ref = fa.field_e;
                      break L7;
                    }
                  }
                  var2_ref = jh.field_b;
                  break L7;
                }
                L11: {
                  L12: {
                    if (16 > nc.field_T) {
                      break L12;
                    } else {
                      this.b(param0 + -17792);
                      var2_ref.b(0, 0, (-4096 + nc.field_T * 256) / 16);
                      if (var15 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2_ref.d(0, 0);
                  wb.a(15, 16, 210, 2 * ec.c((byte) -63) + 435, 9, 13421772, 96);
                  break L11;
                }
                L13: {
                  var5 = nb.field_Fb;
                  if (var5 == null) {
                    break L13;
                  } else {
                    var5.field_y = uh.i(23156).field_t.a((byte) -114);
                    if (var5.field_x == -1) {
                      var5.field_x = var5.field_y;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  L15: {
                    var6 = ec.c((byte) -63) * 2 + 435;
                    var7 = ak.field_m[3] + ((aa) this).field_e.field_f * ak.field_y[((aa) this).field_c];
                    wb.a(21, 218, 198, var6 - var7, 9, 1, 170);
                    var8 = uh.i(param0 + 5234).field_t.field_L;
                    if (var8 == null) {
                      break L15;
                    } else {
                      if (0 != var8.length) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var9 = v.field_j.field_t + v.field_j.field_C;
                  var10_ref_String = wc.field_F;
                  var11_ref_String__ = new String[50];
                  var12_ref_int__ = new int[50];
                  var13 = 0;
                  L16: while (true) {
                    L17: {
                      L18: {
                        if (var13 >= 50) {
                          break L18;
                        } else {
                          var12_ref_int__[var13] = 200;
                          var13++;
                          if (var15 != 0) {
                            break L17;
                          } else {
                            if (var15 == 0) {
                              continue L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      var13 = v.field_j.a(var10_ref_String, var12_ref_int__, var11_ref_String__);
                      break L17;
                    }
                    var14 = var13 * var9 - -(var9 / 2);
                    wb.a(331, 191, 218, 18 + var14, 9, 13421772, 96);
                    wb.a(335, 195, 210, var14 + 10, 9, 1, 170);
                    int discarded$2 = v.field_j.a(var10_ref_String, 340, 200, 200, var14, 16777215, 1, 1, 1, var9);
                    if (var15 == 0) {
                      break L1;
                    } else {
                      break L14;
                    }
                  }
                }
                int discarded$3 = uh.i(param0 ^ 7286).field_t.a(true, r.field_Eb, nb.field_Fb.field_x);
                var9 = var8.length;
                var11 = -1 + var9;
                var12 = 256;
                L19: while (true) {
                  L20: {
                    L21: {
                      if (var11 < 0) {
                        break L21;
                      } else {
                        stackOut_66_0 = 0;
                        stackOut_66_1 = var12;
                        stackIn_78_0 = stackOut_66_0;
                        stackIn_78_1 = stackOut_66_1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        if (var15 != 0) {
                          break L20;
                        } else {
                          if (stackIn_67_0 >= stackIn_67_1) {
                            break L21;
                          } else {
                            L22: {
                              var10 = (var11 + -var9) * v.field_j.field_q + var6;
                              var12 = 256 * (-var7 + var10) / (var6 - var7);
                              if (var12 < 0) {
                                break L22;
                              } else {
                                v.field_j.a(var8[var11], ak.field_k[10], var10 + v.field_j.field_C, 16777215, 1, var12);
                                break L22;
                              }
                            }
                            var11--;
                            if (var15 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                    if (uh.i(23156).field_b) {
                      stackOut_77_0 = param0;
                      stackOut_77_1 = 7286;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      break L20;
                    } else {
                      break L1;
                    }
                  }
                  uh.i(stackIn_78_0 ^ stackIn_78_1).c(param0 + -17921, true);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L23: {
              if (param0 == 17922) {
                break L23;
              } else {
                aa.a((java.applet.Applet) null, -125, (String) null);
                break L23;
              }
            }
            L24: {
              L25: {
                nb.b(0, 25);
                qh.field_b.field_J = (lh) (Object) jj.field_b;
                stackOut_82_0 = qh.field_b;
                stackIn_86_0 = stackOut_82_0;
                stackIn_83_0 = stackOut_82_0;
                if (hl.field_h) {
                  break L25;
                } else {
                  stackOut_83_0 = (eb) (Object) stackIn_83_0;
                  stackIn_88_0 = stackOut_83_0;
                  stackIn_84_0 = stackOut_83_0;
                  if (!pk.field_j) {
                    stackOut_88_0 = (eb) (Object) stackIn_88_0;
                    stackOut_88_1 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    break L24;
                  } else {
                    stackOut_84_0 = (eb) (Object) stackIn_84_0;
                    stackIn_86_0 = stackOut_84_0;
                    break L25;
                  }
                }
              }
              stackOut_86_0 = (eb) (Object) stackIn_86_0;
              stackOut_86_1 = 1;
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              break L24;
            }
            stackIn_89_0.field_C = stackIn_89_1 != 0;
            qh.field_b.d((byte) -2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.CA(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        qe stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        qe stackIn_15_0 = null;
        boolean stackIn_15_1 = false;
        qe stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        qe stackIn_18_0 = null;
        boolean stackIn_18_1 = false;
        int stackIn_18_2 = 0;
        RuntimeException decompiledCaughtException = null;
        qe stackOut_12_0 = null;
        boolean stackOut_12_1 = false;
        qe stackOut_17_0 = null;
        boolean stackOut_17_1 = false;
        int stackOut_17_2 = 0;
        qe stackOut_13_0 = null;
        boolean stackOut_13_1 = false;
        qe stackOut_15_0 = null;
        boolean stackOut_15_1 = false;
        int stackOut_15_2 = 0;
        try {
          L0: {
            if (uh.i(param0 ^ 23286) == null) {
              wb.b(0, 0, 640, 480, 1, 64);
              return;
            } else {
              L1: {
                if (param0 == 130) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (!uh.i(23156).field_g) {
                    break L3;
                  } else {
                    uh.i(23156).field_t.h(-78);
                    if (Chess.field_G == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  stackOut_12_0 = uh.i(23156).field_t;
                  stackOut_12_1 = uh.i(23156).b(0);
                  stackIn_17_0 = stackOut_12_0;
                  stackIn_17_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (jc.field_f != -1) {
                    stackOut_17_0 = (qe) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L4;
                  } else {
                    stackOut_13_0 = (qe) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackOut_15_0 = (qe) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_18_1 = stackOut_15_1;
                    stackIn_18_2 = stackOut_15_2;
                    break L4;
                  }
                }
                int discarded$2 = ((qe) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2 != 0, qb.field_a, 0, (byte) -104, true);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2, "aa.AA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Create account";
    }
}
