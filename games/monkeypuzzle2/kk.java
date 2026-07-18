/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;
import java.net.URL;

final class kk {
    private le field_a;
    private int field_g;
    private le[] field_f;
    private boolean field_d;
    int field_e;
    static int field_b;
    static String field_h;
    private int field_i;
    private sg field_c;

    final static byte[] a(int param0, hb param1, byte[] param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_25_0 = null;
        byte[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        byte[] stackOut_24_0 = null;
        byte[] stackOut_28_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 99) {
              var4_int = param1.f(8, param0);
              if (var4_int == 0) {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
              } else {
                L1: {
                  L2: {
                    if (null == param2) {
                      break L2;
                    } else {
                      if (param2.length == var4_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param2 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.f(8, 3);
                      var6 = (byte)param1.f(8, 8);
                      if (var5 > 0) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (var4_int <= var7) {
                              break L7;
                            } else {
                              param2[var7] = (byte) var6;
                              var7++;
                              if (var8 != 0) {
                                break L4;
                              } else {
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var7 = 0;
                    L8: while (true) {
                      if (var7 >= var4_int) {
                        break L4;
                      } else {
                        stackOut_24_0 = (byte[]) param2;
                        stackIn_29_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_25_0[var7] = (byte)(var6 + param1.f(param3 + -91, var5));
                          var7++;
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_28_0 = (byte[]) param2;
                  stackIn_29_0 = stackOut_28_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          L10: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L10;
            }
          }
          throw la.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param3 + ')');
        }
        return stackIn_29_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        le var2_ref = null;
        int var3 = 0;
        vk var3_ref_vk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        vk stackIn_91_0 = null;
        vk stackIn_93_0 = null;
        vk stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        vk stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        vk stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        vk stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_98_4 = 0;
        vk stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        vk stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vk stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        vk stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        vk stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        vk stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        vk stackIn_107_0 = null;
        vk stackIn_109_0 = null;
        vk stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        vk stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        vk stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        vk stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        Object stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        Object stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        Object stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        Object stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        int stackIn_144_2 = 0;
        int stackIn_144_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        byte stackOut_26_0 = 0;
        vk stackOut_90_0 = null;
        vk stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        vk stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        vk stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        vk stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        vk stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        vk stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        vk stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        vk stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        vk stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        vk stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        vk stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        vk stackOut_106_0 = null;
        vk stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        vk stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        vk stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        vk stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        vk stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        Object stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        Object stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        int stackOut_143_3 = 0;
        Object stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        Object stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        int stackOut_141_3 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ke.field_i.a(0, 0);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (480 <= var2_int) {
                    break L3;
                  } else {
                    kj.field_F.c(-(kj.field_F.field_m >> -533000127) + 80, var2_int);
                    var2_int = var2_int + kj.field_F.field_n;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                df.field_q[bc.field_a].c(-(df.field_q[0].field_m >> -1513667871) + 80, ne.field_b);
                break L2;
              }
              var2_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int >= 480) {
                      break L6;
                    } else {
                      kj.field_F.c(560 + -(kj.field_F.field_m >> 1482303553), var2_int);
                      var2_int = var2_int + kj.field_F.field_n;
                      if (var6 != 0) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  df.field_q[ob.field_r].f(-(df.field_q[0].field_m >> 1825633889) + 560, dd.field_e);
                  break L5;
                }
                var2_int = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (~var2_int <= ~dk.field_j) {
                        break L9;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_27_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var6 != 0) {
                          break L8;
                        } else {
                          var3 = stackIn_18_0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var3 >= 5) {
                                  break L12;
                                } else {
                                  ge.g(pf.a((byte) 25, 640), pf.a((byte) -100, 100), pf.a((byte) 19, 500), 9283525, 60);
                                  var3++;
                                  if (var6 != 0) {
                                    break L11;
                                  } else {
                                    if (var6 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              ma.a(ve.field_x[var2_int][0] << -243469980, ve.field_x[var2_int][1] << 142028388, 128, 40000);
                              var2_int++;
                              break L11;
                            }
                            if (var6 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    stackOut_26_0 = param0;
                    stackIn_27_0 = stackOut_26_0;
                    break L8;
                  }
                  L13: {
                    if (stackIn_27_0 >= 119) {
                      break L13;
                    } else {
                      int discarded$1 = this.a((byte) 24, -74);
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      if (((kk) this).field_g == 8) {
                        break L15;
                      } else {
                        if (10 == ((kk) this).field_g) {
                          break L15;
                        } else {
                          if (((kk) this).field_g != 9) {
                            if (((kk) this).field_g != 4) {
                              var2_ref = kb.field_a[((kk) this).field_g];
                              break L14;
                            } else {
                              var2_ref = kb.field_a[3];
                              break L14;
                            }
                          } else {
                            var2_ref = kb.field_a[2];
                            break L14;
                          }
                        }
                      }
                    }
                    var2_ref = kb.field_a[5];
                    break L14;
                  }
                  L16: {
                    L17: {
                      L18: {
                        L19: {
                          if (ad.a(false)) {
                            break L19;
                          } else {
                            if (ek.a((byte) -125)) {
                              break L19;
                            } else {
                              if (((kk) this).field_d) {
                                break L19;
                              } else {
                                if (20 >= ((kk) this).field_i) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        if (!((kk) this).field_d) {
                          break L17;
                        } else {
                          if (((kk) this).field_i < 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        var3 = var2_ref.field_n;
                        var4 = ((kk) this).field_i * 255 / 20;
                        if (var4 <= 255) {
                          break L20;
                        } else {
                          var4 = 255;
                          break L20;
                        }
                      }
                      L21: {
                        var5 = var4 + -40;
                        if (0 <= var5) {
                          break L21;
                        } else {
                          var5 = 0;
                          break L21;
                        }
                      }
                      ma.a(var2_ref, 320 - (var2_ref.field_m >> -793499935), 0, var3, var4, var5);
                      if (var6 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                    var2_ref.c(-(var2_ref.field_m >> -515955519) + 320, 0);
                    break L16;
                  }
                  L22: {
                    L23: {
                      if (((kk) this).field_g == 2) {
                        break L23;
                      } else {
                        L24: {
                          if (((kk) this).field_g != 3) {
                            break L24;
                          } else {
                            this.a((byte) 1, true);
                            if (var6 == 0) {
                              break L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if (((kk) this).field_g != 4) {
                            break L25;
                          } else {
                            this.a((byte) 1, false);
                            if (var6 == 0) {
                              break L22;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (((kk) this).field_g == 5) {
                            break L26;
                          } else {
                            L27: {
                              if (6 == ((kk) this).field_g) {
                                break L27;
                              } else {
                                if (((kk) this).field_g == 10) {
                                  break L27;
                                } else {
                                  L28: {
                                    if (((kk) this).field_g != 7) {
                                      break L28;
                                    } else {
                                      L29: {
                                        lb.a(120, 400, (byte) -119, wc.field_e, 180, 185);
                                        var3_ref_vk = pl.field_e;
                                        var4 = var3_ref_vk.field_C + 200;
                                        var5 = 4 + (var3_ref_vk.field_j + var3_ref_vk.field_D);
                                        var3_ref_vk.a(f.field_f, 320, var4, 1, -1);
                                        stackOut_90_0 = (vk) var3_ref_vk;
                                        stackIn_93_0 = stackOut_90_0;
                                        stackIn_91_0 = stackOut_90_0;
                                        if (fg.field_b == 0) {
                                          stackOut_93_0 = (vk) (Object) stackIn_93_0;
                                          stackOut_93_1 = 0;
                                          stackIn_94_0 = stackOut_93_0;
                                          stackIn_94_1 = stackOut_93_1;
                                          break L29;
                                        } else {
                                          stackOut_91_0 = (vk) (Object) stackIn_91_0;
                                          stackOut_91_1 = 1;
                                          stackIn_94_0 = stackOut_91_0;
                                          stackIn_94_1 = stackOut_91_1;
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        stackOut_94_0 = (vk) (Object) stackIn_94_0;
                                        stackOut_94_1 = stackIn_94_1;
                                        stackOut_94_2 = 0;
                                        stackOut_94_3 = 22890;
                                        stackIn_97_0 = stackOut_94_0;
                                        stackIn_97_1 = stackOut_94_1;
                                        stackIn_97_2 = stackOut_94_2;
                                        stackIn_97_3 = stackOut_94_3;
                                        stackIn_95_0 = stackOut_94_0;
                                        stackIn_95_1 = stackOut_94_1;
                                        stackIn_95_2 = stackOut_94_2;
                                        stackIn_95_3 = stackOut_94_3;
                                        if (hf.field_f.field_A == 0) {
                                          stackOut_97_0 = (vk) (Object) stackIn_97_0;
                                          stackOut_97_1 = stackIn_97_1;
                                          stackOut_97_2 = stackIn_97_2;
                                          stackOut_97_3 = stackIn_97_3;
                                          stackOut_97_4 = 0;
                                          stackIn_98_0 = stackOut_97_0;
                                          stackIn_98_1 = stackOut_97_1;
                                          stackIn_98_2 = stackOut_97_2;
                                          stackIn_98_3 = stackOut_97_3;
                                          stackIn_98_4 = stackOut_97_4;
                                          break L30;
                                        } else {
                                          stackOut_95_0 = (vk) (Object) stackIn_95_0;
                                          stackOut_95_1 = stackIn_95_1;
                                          stackOut_95_2 = stackIn_95_2;
                                          stackOut_95_3 = stackIn_95_3;
                                          stackOut_95_4 = 1;
                                          stackIn_98_0 = stackOut_95_0;
                                          stackIn_98_1 = stackOut_95_1;
                                          stackIn_98_2 = stackOut_95_2;
                                          stackIn_98_3 = stackOut_95_3;
                                          stackIn_98_4 = stackOut_95_4;
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        ((vk) (Object) stackIn_98_0).a(wa.a(stackIn_98_1 != 0, stackIn_98_2 != 0, stackIn_98_3, stackIn_98_4 != 0), 320, var4 - -var5, 1, -1);
                                        stackOut_98_0 = (vk) var3_ref_vk;
                                        stackOut_98_1 = -88;
                                        stackIn_101_0 = stackOut_98_0;
                                        stackIn_101_1 = stackOut_98_1;
                                        stackIn_99_0 = stackOut_98_0;
                                        stackIn_99_1 = stackOut_98_1;
                                        if (0 == fg.field_b) {
                                          stackOut_101_0 = (vk) (Object) stackIn_101_0;
                                          stackOut_101_1 = stackIn_101_1;
                                          stackOut_101_2 = 0;
                                          stackIn_102_0 = stackOut_101_0;
                                          stackIn_102_1 = stackOut_101_1;
                                          stackIn_102_2 = stackOut_101_2;
                                          break L31;
                                        } else {
                                          stackOut_99_0 = (vk) (Object) stackIn_99_0;
                                          stackOut_99_1 = stackIn_99_1;
                                          stackOut_99_2 = 1;
                                          stackIn_102_0 = stackOut_99_0;
                                          stackIn_102_1 = stackOut_99_1;
                                          stackIn_102_2 = stackOut_99_2;
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        stackOut_102_0 = (vk) (Object) stackIn_102_0;
                                        stackOut_102_1 = stackIn_102_1;
                                        stackOut_102_2 = stackIn_102_2;
                                        stackIn_105_0 = stackOut_102_0;
                                        stackIn_105_1 = stackOut_102_1;
                                        stackIn_105_2 = stackOut_102_2;
                                        stackIn_103_0 = stackOut_102_0;
                                        stackIn_103_1 = stackOut_102_1;
                                        stackIn_103_2 = stackOut_102_2;
                                        if (hf.field_f.field_A == 0) {
                                          stackOut_105_0 = (vk) (Object) stackIn_105_0;
                                          stackOut_105_1 = stackIn_105_1;
                                          stackOut_105_2 = stackIn_105_2;
                                          stackOut_105_3 = 0;
                                          stackIn_106_0 = stackOut_105_0;
                                          stackIn_106_1 = stackOut_105_1;
                                          stackIn_106_2 = stackOut_105_2;
                                          stackIn_106_3 = stackOut_105_3;
                                          break L32;
                                        } else {
                                          stackOut_103_0 = (vk) (Object) stackIn_103_0;
                                          stackOut_103_1 = stackIn_103_1;
                                          stackOut_103_2 = stackIn_103_2;
                                          stackOut_103_3 = 1;
                                          stackIn_106_0 = stackOut_103_0;
                                          stackIn_106_1 = stackOut_103_1;
                                          stackIn_106_2 = stackOut_103_2;
                                          stackIn_106_3 = stackOut_103_3;
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        ((vk) (Object) stackIn_106_0).a(lk.a(stackIn_106_1, stackIn_106_2 != 0, stackIn_106_3 != 0, false), 320, 20 + (var4 - -(var5 * 3)), 1, -1);
                                        stackOut_106_0 = (vk) var3_ref_vk;
                                        stackIn_109_0 = stackOut_106_0;
                                        stackIn_107_0 = stackOut_106_0;
                                        if (hf.field_f.field_A == 0) {
                                          stackOut_109_0 = (vk) (Object) stackIn_109_0;
                                          stackOut_109_1 = 0;
                                          stackIn_110_0 = stackOut_109_0;
                                          stackIn_110_1 = stackOut_109_1;
                                          break L33;
                                        } else {
                                          stackOut_107_0 = (vk) (Object) stackIn_107_0;
                                          stackOut_107_1 = 1;
                                          stackIn_110_0 = stackOut_107_0;
                                          stackIn_110_1 = stackOut_107_1;
                                          break L33;
                                        }
                                      }
                                      L34: {
                                        stackOut_110_0 = (vk) (Object) stackIn_110_0;
                                        stackOut_110_1 = stackIn_110_1;
                                        stackOut_110_2 = 122;
                                        stackIn_113_0 = stackOut_110_0;
                                        stackIn_113_1 = stackOut_110_1;
                                        stackIn_113_2 = stackOut_110_2;
                                        stackIn_111_0 = stackOut_110_0;
                                        stackIn_111_1 = stackOut_110_1;
                                        stackIn_111_2 = stackOut_110_2;
                                        if (fg.field_b == 0) {
                                          stackOut_113_0 = (vk) (Object) stackIn_113_0;
                                          stackOut_113_1 = stackIn_113_1;
                                          stackOut_113_2 = stackIn_113_2;
                                          stackOut_113_3 = 0;
                                          stackIn_114_0 = stackOut_113_0;
                                          stackIn_114_1 = stackOut_113_1;
                                          stackIn_114_2 = stackOut_113_2;
                                          stackIn_114_3 = stackOut_113_3;
                                          break L34;
                                        } else {
                                          stackOut_111_0 = (vk) (Object) stackIn_111_0;
                                          stackOut_111_1 = stackIn_111_1;
                                          stackOut_111_2 = stackIn_111_2;
                                          stackOut_111_3 = 1;
                                          stackIn_114_0 = stackOut_111_0;
                                          stackIn_114_1 = stackOut_111_1;
                                          stackIn_114_2 = stackOut_111_2;
                                          stackIn_114_3 = stackOut_111_3;
                                          break L34;
                                        }
                                      }
                                      ((vk) (Object) stackIn_114_0).a(ma.a(stackIn_114_1 != 0, (byte) stackIn_114_2, stackIn_114_3 != 0, false), 320, 20 + (var5 * 4 + var4 - -40), 1, -1);
                                      if (var6 == 0) {
                                        break L22;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L35: {
                                    if (((kk) this).field_g != 9) {
                                      break L35;
                                    } else {
                                      this.c(119);
                                      if (var6 == 0) {
                                        break L22;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  if (((kk) this).field_g == 8) {
                                    ri.a((byte) -122, ((kk) this).field_i, false);
                                    if (var6 == 0) {
                                      break L22;
                                    } else {
                                      break L27;
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            ri.a((byte) -101, ((kk) this).field_i, true);
                            if (var6 == 0) {
                              break L22;
                            } else {
                              break L26;
                            }
                          }
                        }
                        ri.a((byte) -100, ((kk) this).field_i, false);
                        if (var6 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    this.b(69);
                    break L22;
                  }
                  var3 = 0;
                  L36: while (true) {
                    L37: {
                      L38: {
                        L39: {
                          if (~((kk) this).field_c.field_i >= ~var3) {
                            break L39;
                          } else {
                            if (var6 != 0) {
                              break L38;
                            } else {
                              L40: {
                                stackOut_138_0 = this;
                                stackOut_138_1 = -1;
                                stackOut_138_2 = var3;
                                stackIn_143_0 = stackOut_138_0;
                                stackIn_143_1 = stackOut_138_1;
                                stackIn_143_2 = stackOut_138_2;
                                stackIn_139_0 = stackOut_138_0;
                                stackIn_139_1 = stackOut_138_1;
                                stackIn_139_2 = stackOut_138_2;
                                if (((kk) this).field_c.field_a != var3) {
                                  stackOut_143_0 = this;
                                  stackOut_143_1 = stackIn_143_1;
                                  stackOut_143_2 = stackIn_143_2;
                                  stackOut_143_3 = 0;
                                  stackIn_144_0 = stackOut_143_0;
                                  stackIn_144_1 = stackOut_143_1;
                                  stackIn_144_2 = stackOut_143_2;
                                  stackIn_144_3 = stackOut_143_3;
                                  break L40;
                                } else {
                                  stackOut_139_0 = this;
                                  stackOut_139_1 = stackIn_139_1;
                                  stackOut_139_2 = stackIn_139_2;
                                  stackIn_141_0 = stackOut_139_0;
                                  stackIn_141_1 = stackOut_139_1;
                                  stackIn_141_2 = stackOut_139_2;
                                  stackOut_141_0 = this;
                                  stackOut_141_1 = stackIn_141_1;
                                  stackOut_141_2 = stackIn_141_2;
                                  stackOut_141_3 = 1;
                                  stackIn_144_0 = stackOut_141_0;
                                  stackIn_144_1 = stackOut_141_1;
                                  stackIn_144_2 = stackOut_141_2;
                                  stackIn_144_3 = stackOut_141_3;
                                  break L40;
                                }
                              }
                              this.a(stackIn_144_1, stackIn_144_2, stackIn_144_3 != 0);
                              var3++;
                              if (var6 == 0) {
                                continue L36;
                              } else {
                                break L39;
                              }
                            }
                          }
                        }
                        if (ad.a(false)) {
                          var3 = hl.field_a;
                          break L38;
                        } else {
                          break L37;
                        }
                      }
                      L41: {
                        if (32 < var3) {
                          var3 = 32;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        var4 = hl.field_a * 3;
                        if (var4 <= 128) {
                          break L42;
                        } else {
                          var4 = 128;
                          break L42;
                        }
                      }
                      this.a(var3, (byte) 110, 0, var4, 0, 0, 0, 0);
                      break L37;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "kk.I(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_h = null;
            if (param0 != -104) {
                field_h = null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "kk.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        vk var5 = null;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        String stackIn_16_0 = null;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        String stackOut_15_0 = null;
        String stackOut_13_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ((kk) this).field_a.e();
            var3_int = 380;
            var4 = 263;
            ge.d(3, 3, var3_int - 6, -6 + var4, 16249775);
            lb.a(0, var3_int, (byte) -124, wc.field_e, 0, var4);
            var5 = pl.field_e;
            var6 = 0;
            var7_int = si.field_r / 8;
            if (param0 == 1) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6 >= 8) {
                      break L3;
                    } else {
                      var8 = 0;
                      stackOut_4_0 = -33;
                      stackOut_4_1 = ~(si.field_r + var7_int * 6 & 63);
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_19_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_5_0 <= stackIn_5_1) {
                            var8 = var7_int % 4;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        nh.field_f[0][var6 % 5][var8].c(-160 + 40 * var6 + (var3_int >> 1910711617), 15);
                        var6++;
                        var7_int++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param1) {
                      int discarded$2 = var5.a(mk.field_j, 15, 53, -30 + var3_int, var4, 1, -1, 0, 0, 14);
                      break L5;
                    } else {
                      L6: {
                        var6 = hb.a(false);
                        if (qb.field_b) {
                          stackOut_15_0 = gg.a(new String[2], jg.field_kb, true);
                          stackIn_16_0 = stackOut_15_0;
                          break L6;
                        } else {
                          stackOut_13_0 = lg.field_I;
                          stackIn_16_0 = stackOut_13_0;
                          break L6;
                        }
                      }
                      var7 = stackIn_16_0;
                      int discarded$3 = var5.a(gg.a(new String[1], je.field_a, true), 14, 53, var3_int + -30, var4, 1, -1, 0, 0, 14);
                      break L5;
                    }
                  }
                  ac.field_a.a((byte) 118);
                  var6 = ((kk) this).field_i * var4 / 20;
                  stackOut_18_0 = ~var6;
                  stackOut_18_1 = ~var4;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L2;
                }
                L7: {
                  if (stackIn_19_0 < stackIn_19_1) {
                    var6 = var4;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((kk) this).field_a.b(130, (-var6 + var4 >> 1971065441) + 104, var3_int, var6);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        try {
          L0: {
            L1: {
              if (2 != ((kk) this).field_g) {
                L2: {
                  L3: {
                    if (3 == ((kk) this).field_g) {
                      break L3;
                    } else {
                      if (((kk) this).field_g != 4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0 >= 2) {
                    var3_int = b.field_j[((kk) this).field_g][param0];
                    if (19 == var3_int) {
                      stackOut_15_0 = 30 + (((kk) this).field_f[param0].field_m + fl.field_a[((kk) this).field_g]);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (var3_int != 18) {
                        break L1;
                      } else {
                        stackOut_18_0 = fl.field_a[((kk) this).field_g] + -10 + (-((kk) this).field_f[param0].field_m + -20);
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                stackOut_10_0 = fl.field_a[((kk) this).field_g];
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                break L1;
              }
            }
            if (param1 == 52) {
              if (3 > param0) {
                stackOut_26_0 = fl.field_a[((kk) this).field_g] + (20 + ((kk) this).field_f[param0].field_m) * param0;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0;
              } else {
                stackOut_28_0 = 20 + ((kk) this).field_f[param0].field_m + fl.field_a[((kk) this).field_g];
                stackIn_29_0 = stackOut_28_0;
                break L0;
              }
            } else {
              stackOut_21_0 = -100;
              stackIn_22_0 = stackOut_21_0;
              return stackIn_22_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((kk) this).b((byte) -56);
                break L1;
              }
            }
            ((kk) this).field_c.a((byte) 60, this.a(-6, p.field_a, ei.field_a), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        vk var4 = null;
        de var5 = null;
        String var6 = null;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (s.field_S != null) {
                break L1;
              } else {
                s.field_S = o.a(41, 10, 3, 1, -114);
                break L1;
              }
            }
            L2: {
              if (param0 >= 39) {
                break L2;
              } else {
                kk.a((String) null, (byte) -126, (Throwable) null);
                break L2;
              }
            }
            L3: {
              L4: {
                ((kk) this).field_a.e();
                var2_int = 380;
                var3 = 275;
                ge.d(3, 3, var2_int + -6, var3 + -6, 16249775);
                lb.a(0, var2_int, (byte) -12, wc.field_e, 0, var3);
                sb.field_r.a(bg.field_B[ef.field_b], var2_int >> 693749377, 30, 9330743, -1);
                var4 = pl.field_e;
                var5 = s.field_S;
                if (!var5.field_l) {
                  break L4;
                } else {
                  L5: {
                    if (var5.field_g != null) {
                      break L5;
                    } else {
                      var6 = re.field_b;
                      if (var14 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6 = qc.field_O;
                  var7_ref_String__ = var5.field_g[ef.field_b];
                  var8_ref_int__ = var5.field_i[ef.field_b];
                  var9 = ti.a(0, var5, ef.field_b, pg.field_b);
                  var10 = var4.field_C - -40;
                  var11 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var11 >= 10) {
                            break L9;
                          } else {
                            stackOut_14_0 = ~(1 & var11);
                            stackOut_14_1 = -1;
                            stackIn_35_0 = stackOut_14_0;
                            stackIn_35_1 = stackOut_14_1;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            if (var14 != 0) {
                              break L8;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_15_0 != stackIn_15_1) {
                                    break L11;
                                  } else {
                                    ge.c(13, -2 + -var4.field_C + var10, 354, 18, 12303291, 80);
                                    if (var14 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                ge.c(13, -2 + (-var4.field_C + var10), 354, 18, 14540253, 40);
                                break L10;
                              }
                              L12: {
                                if (null != var7_ref_String__[var11]) {
                                  L13: {
                                    var12 = 1;
                                    var13 = var8_ref_int__[var11];
                                    if (~var9 == ~var11) {
                                      var12 = 5683782;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var4.c(var11 + 1 + ". ", 30, var10, var12, -1);
                                  var4.b(var7_ref_String__[var11], 30, var10, var12, -1);
                                  var4.c(Integer.toString(var13), 360, var10, var12, -1);
                                  var6 = "";
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var10 += 18;
                              var11++;
                              if (var14 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (hf.field_f == null) {
                          break L7;
                        } else {
                          stackOut_33_0 = var9;
                          stackOut_33_1 = -1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          break L8;
                        }
                      }
                      if (stackIn_35_0 != stackIn_35_1) {
                        break L7;
                      } else {
                        if (0 != hf.field_f.field_A) {
                          var4.b(cl.field_e, 30, var10, 5683782, -1);
                          var4.c(Integer.toString(hf.field_f.field_A), 360, var10, 5683782, -1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var6 = eg.field_h;
              break L3;
            }
            L14: {
              int discarded$1 = pl.field_e.a(nc.field_c, 30, var3 + -37, -60 + var2_int, 40, 1, -1, 1, 0, 12);
              var7 = 137;
              sb.field_r.a(var6, var2_int / 2, var7, 9330743, -1);
              ac.field_a.a((byte) 116);
              var8 = var3 * ((kk) this).field_i / 20;
              if (var8 <= var3) {
                break L14;
              } else {
                var8 = var3;
                break L14;
              }
            }
            ((kk) this).field_a.b(130, (-var8 + var3 >> 530617729) + 90, var2_int, var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "kk.B(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = -53 / ((param0 - 15) / 33);
            if (((kk) this).field_d) {
              L1: {
                ((kk) this).field_i = ((kk) this).field_i - 1;
                if (((kk) this).field_i <= 0) {
                  L2: {
                    if (-1 != ((kk) this).field_e) {
                      break L2;
                    } else {
                      ej.field_b = 50;
                      l.field_f = ((kk) this).field_e;
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (((kk) this).field_g == 5) {
                        break L4;
                      } else {
                        if (((kk) this).field_g == 6) {
                          break L4;
                        } else {
                          if (((kk) this).field_g == 8) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ee.field_F = -1;
                    break L3;
                  }
                  L5: {
                    pg.field_d[((kk) this).field_e].c((byte) -122);
                    if (((kk) this).field_e == 2) {
                      s.field_S = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      L8: {
                        var3 = qh.field_b;
                        if (((kk) this).field_g != 1) {
                          break L8;
                        } else {
                          if (((kk) this).field_e == 6) {
                            break L8;
                          } else {
                            if (((kk) this).field_e == 10) {
                              break L8;
                            } else {
                              if (2 != ((kk) this).field_e) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        if (1 != var3) {
                          break L9;
                        } else {
                          vl.field_g = 1;
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L6;
                      } else {
                        vl.field_g = 0;
                        if (var4 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    vl.field_g = ((kk) this).field_g;
                    break L6;
                  }
                  l.field_f = ((kk) this).field_e;
                  qh.field_b = ((kk) this).field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              ((kk) this).field_i = ((kk) this).field_i + 1;
              if (20 > ((kk) this).field_i) {
                return;
              } else {
                L10: while (true) {
                  L11: {
                    L12: {
                      if (!ba.a(-1)) {
                        break L12;
                      } else {
                        L13: {
                          if (13 != oa.field_H) {
                            break L13;
                          } else {
                            if (((kk) this).field_g == 0) {
                              break L13;
                            } else {
                              if (((kk) this).field_g != 7) {
                                L14: {
                                  ((kk) this).field_e = vl.field_g;
                                  if (1 != ((kk) this).field_g) {
                                    break L14;
                                  } else {
                                    ((kk) this).field_e = -1;
                                    h.a(0, true);
                                    break L14;
                                  }
                                }
                                if (-1 != ((kk) this).field_e) {
                                  pg.field_d[((kk) this).field_e].c((byte) -89);
                                  if (var4 == 0) {
                                    continue L10;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  continue L10;
                                }
                              } else {
                                continue L10;
                              }
                            }
                          }
                        }
                        L15: {
                          L16: {
                            L17: {
                              if (((kk) this).field_g == 2) {
                                break L17;
                              } else {
                                if (((kk) this).field_g == 3) {
                                  break L17;
                                } else {
                                  if (((kk) this).field_g != 4) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            L18: {
                              if (((kk) this).field_g == 2) {
                                break L18;
                              } else {
                                L19: {
                                  if (3 == ((kk) this).field_g) {
                                    break L19;
                                  } else {
                                    if (((kk) this).field_g == 4) {
                                      ((kk) this).field_c.b((byte) 119);
                                      ((kk) this).field_c.a(this.d(122), 83);
                                      if (var4 == 0) {
                                        break L15;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                ((kk) this).field_c.b((byte) 113);
                                ((kk) this).field_c.a(this.d(122), -58);
                                if (var4 == 0) {
                                  break L15;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            ((kk) this).field_c.b((byte) 107);
                            ((kk) this).field_c.a(this.a(-99, 3), -117);
                            if (var4 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                          ((kk) this).field_c.e(0);
                          break L15;
                        }
                        if (((kk) this).field_c.field_a == -1) {
                          continue L10;
                        } else {
                          this.a(((kk) this).field_c.field_a, false, 77);
                          if (var4 != 0) {
                            break L11;
                          } else {
                            if (var4 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    if (~((kk) this).field_e != ~((kk) this).field_g) {
                      break L11;
                    } else {
                      L20: {
                        ((kk) this).field_c.a(this.a(-6, p.field_a, ei.field_a), this.a(-6, ab.field_e, qg.field_c), true);
                        if (((kk) this).field_c.field_a != -1) {
                          this.a(((kk) this).field_c.field_a, true, 59);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (((kk) this).field_e != qh.field_b) {
                          L22: {
                            ((kk) this).field_i = 20;
                            if (((kk) this).field_e == -1) {
                              break L22;
                            } else {
                              pg.field_d[((kk) this).field_e].a(true, false);
                              break L22;
                            }
                          }
                          ((kk) this).field_d = true;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      break L0;
                    }
                  }
                  L23: {
                    if (((kk) this).field_e != -1) {
                      pg.field_d[((kk) this).field_e].a(false, false);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  ((kk) this).field_d = true;
                  ((kk) this).field_i = 20;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "kk.T(" + param0 + ')');
        }
    }

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ic var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            md stackIn_18_0 = null;
            int stackIn_18_1 = 0;
            java.net.URL stackIn_18_2 = null;
            java.net.URL stackIn_18_3 = null;
            java.net.URL stackIn_18_4 = null;
            StringBuilder stackIn_18_5 = null;
            md stackIn_20_0 = null;
            int stackIn_20_1 = 0;
            java.net.URL stackIn_20_2 = null;
            java.net.URL stackIn_20_3 = null;
            java.net.URL stackIn_20_4 = null;
            StringBuilder stackIn_20_5 = null;
            md stackIn_21_0 = null;
            int stackIn_21_1 = 0;
            java.net.URL stackIn_21_2 = null;
            java.net.URL stackIn_21_3 = null;
            java.net.URL stackIn_21_4 = null;
            StringBuilder stackIn_21_5 = null;
            String stackIn_21_6 = null;
            Throwable decompiledCaughtException = null;
            md stackOut_17_0 = null;
            int stackOut_17_1 = 0;
            java.net.URL stackOut_17_2 = null;
            java.net.URL stackOut_17_3 = null;
            java.net.URL stackOut_17_4 = null;
            StringBuilder stackOut_17_5 = null;
            md stackOut_20_0 = null;
            int stackOut_20_1 = 0;
            java.net.URL stackOut_20_2 = null;
            java.net.URL stackOut_20_3 = null;
            java.net.URL stackOut_20_4 = null;
            StringBuilder stackOut_20_5 = null;
            String stackOut_20_6 = null;
            md stackOut_18_0 = null;
            int stackOut_18_1 = 0;
            java.net.URL stackOut_18_2 = null;
            java.net.URL stackOut_18_3 = null;
            java.net.URL stackOut_18_4 = null;
            StringBuilder stackOut_18_5 = null;
            String stackOut_18_6 = null;
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param2 != null) {
                    var3_ref = id.a(param2, (byte) 37);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L2;
                  }
                }
                ke.a(var3_ref, (byte) 80);
                var3_ref = eg.a("%3a", 4, ":", var3_ref);
                var3_ref = eg.a("%40", 4, "@", var3_ref);
                var3_ref = eg.a("%26", 4, "&", var3_ref);
                var3_ref = eg.a("%23", 4, "#", var3_ref);
                if (ni.field_e == null) {
                  return;
                } else {
                  L4: {
                    stackOut_17_0 = fk.field_c;
                    stackOut_17_1 = 101;
                    stackOut_17_2 = null;
                    stackOut_17_3 = null;
                    stackOut_17_4 = ni.field_e.getCodeBase();
                    stackOut_17_5 = new StringBuilder().append("clienterror.ws?c=").append(kd.field_c).append("&u=");
                    stackIn_20_0 = stackOut_17_0;
                    stackIn_20_1 = stackOut_17_1;
                    stackIn_20_2 = stackOut_17_2;
                    stackIn_20_3 = stackOut_17_3;
                    stackIn_20_4 = stackOut_17_4;
                    stackIn_20_5 = stackOut_17_5;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    stackIn_18_4 = stackOut_17_4;
                    stackIn_18_5 = stackOut_17_5;
                    if (null == ck.field_f) {
                      stackOut_20_0 = (md) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = null;
                      stackOut_20_3 = null;
                      stackOut_20_4 = (java.net.URL) (Object) stackIn_20_4;
                      stackOut_20_5 = (StringBuilder) (Object) stackIn_20_5;
                      stackOut_20_6 = "" + cc.field_b;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackIn_21_3 = stackOut_20_3;
                      stackIn_21_4 = stackOut_20_4;
                      stackIn_21_5 = stackOut_20_5;
                      stackIn_21_6 = stackOut_20_6;
                      break L4;
                    } else {
                      stackOut_18_0 = (md) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = null;
                      stackOut_18_3 = null;
                      stackOut_18_4 = (java.net.URL) (Object) stackIn_18_4;
                      stackOut_18_5 = (StringBuilder) (Object) stackIn_18_5;
                      stackOut_18_6 = ck.field_f;
                      stackIn_21_0 = stackOut_18_0;
                      stackIn_21_1 = stackOut_18_1;
                      stackIn_21_2 = stackOut_18_2;
                      stackIn_21_3 = stackOut_18_3;
                      stackIn_21_4 = stackOut_18_4;
                      stackIn_21_5 = stackOut_18_5;
                      stackIn_21_6 = stackOut_18_6;
                      break L4;
                    }
                  }
                  var4 = ((md) (Object) stackIn_21_0).a((byte) stackIn_21_1, new java.net.URL(stackIn_21_4, stackIn_21_6 + "&v1=" + md.field_l + "&v2=" + md.field_m + "&e=" + var3_ref));
                  L5: while (true) {
                    L6: {
                      L7: {
                        L8: {
                          if (0 != var4.field_g) {
                            break L8;
                          } else {
                            em.a(1L, false);
                            if (var6 != 0) {
                              break L7;
                            } else {
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var4.field_g == 1) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                      var5 = (DataInputStream) var4.field_b;
                      int discarded$1 = var5.read();
                      var5.close();
                      break L6;
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L9;
              }
            }
            L10: {
              if (param1 >= 56) {
                break L10;
              } else {
                field_h = null;
                break L10;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        vk var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String[] stackIn_9_0 = null;
        String[] stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        String[] stackIn_11_0 = null;
        String[] stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        String[] stackIn_12_0 = null;
        String[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        String stackIn_12_3 = null;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_6_0 = null;
        String[] stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        String[] stackOut_11_0 = null;
        String[] stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        String stackOut_11_3 = null;
        String[] stackOut_7_0 = null;
        String[] stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        String[] stackOut_9_0 = null;
        String[] stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        String stackOut_9_3 = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.a((byte) -128, param1);
              var5 = this.a(param1, (byte) 52);
              var6 = b.field_j[((kk) this).field_g][param1];
              var7 = ma.field_a[var6];
              if (var7 == null) {
                var7 = "ERROR: missing text";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (var6 != 16) {
                  break L3;
                } else {
                  L4: {
                    stackOut_6_0 = new String[1];
                    stackOut_6_1 = new String[1];
                    stackOut_6_2 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_11_1 = stackOut_6_1;
                    stackIn_11_2 = stackOut_6_2;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    if (qb.field_b) {
                      stackOut_11_0 = (String[]) (Object) stackIn_11_0;
                      stackOut_11_1 = (String[]) (Object) stackIn_11_1;
                      stackOut_11_2 = stackIn_11_2;
                      stackOut_11_3 = ie.field_d;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      break L4;
                    } else {
                      stackOut_7_0 = (String[]) (Object) stackIn_7_0;
                      stackOut_7_1 = (String[]) (Object) stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      stackOut_9_0 = (String[]) (Object) stackIn_9_0;
                      stackOut_9_1 = (String[]) (Object) stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = qg.field_b;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_12_2 = stackOut_9_2;
                      stackIn_12_3 = stackOut_9_3;
                      break L4;
                    }
                  }
                  stackIn_12_1[stackIn_12_2] = stackIn_12_3;
                  var7 = gg.a(stackIn_12_0, var7, true);
                  if (var14 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var6 != 5) {
                break L2;
              } else {
                if (((kk) this).field_g == 2) {
                  var7 = pl.field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var8 = ((kk) this).field_f[param1].field_m;
            if (param0 == -1) {
              L5: {
                ((kk) this).field_f[param1].e();
                if (param2) {
                  stackOut_27_0 = 5683782;
                  stackIn_28_0 = stackOut_27_0;
                  break L5;
                } else {
                  stackOut_25_0 = 1;
                  stackIn_28_0 = stackOut_25_0;
                  break L5;
                }
              }
              L6: {
                var9 = stackIn_28_0;
                if (((kk) this).field_g == 7) {
                  break L6;
                } else {
                  lb.a(0, var8, (byte) -33, wc.field_e, 0, 40);
                  break L6;
                }
              }
              L7: {
                L8: {
                  L9: {
                    var10 = sb.field_r;
                    if (var6 == 11) {
                      break L9;
                    } else {
                      if (var6 != 12) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var11 = lh.field_b - -137;
                    var12 = -var11 + var8 >> -839809695;
                    var12 = var12 + (lh.field_b - -13);
                    var10.c(var7, var12, var10.field_C, var9, -1);
                    sd.field_f.c(var12, -6 + mc.field_b[((kk) this).field_g] / 2);
                    if (var6 == 11) {
                      stackOut_38_0 = re.field_e;
                      stackIn_39_0 = stackOut_38_0;
                      break L10;
                    } else {
                      stackOut_36_0 = ol.field_e;
                      stackIn_39_0 = stackOut_36_0;
                      break L10;
                    }
                  }
                  var13 = stackIn_39_0;
                  de.field_f.c(146 * var13 / 256 + -2 + var12, 14);
                  if (var14 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
                var10.a(var7, var8 >> -935373055, var10.field_C, var9, -1);
                break L7;
              }
              L11: {
                L12: {
                  ac.field_a.a((byte) 114);
                  var11 = 40 * ((kk) this).field_i / 20;
                  if (var11 > 40) {
                    break L12;
                  } else {
                    if (!ad.a(false)) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                var11 = 40;
                break L11;
              }
              ((kk) this).field_f[param1].b(var5, var4_int - -(40 - var11 >> 378069313), var8, var11);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var4, "kk.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = 40;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -16;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void c(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        try {
            ((kk) this).field_a.e();
            var2_int = 380;
            var3 = 275;
            ge.d(3, 3, -6 + var2_int, -6 + var3, 16249775);
            lb.a(0, var2_int, (byte) 64, wc.field_e, 0, var3);
            int var5 = 86 % ((53 - param0) / 61);
            var4 = 90;
            int discarded$0 = sb.field_r.a(el.field_c, 20, var4, -40 + var2_int, 200, 9330743, -1, 1, 0, 0);
            ac.field_a.a((byte) 127);
            var6 = ((kk) this).field_i * var3 / 20;
            if (~var3 > ~var6) {
                var6 = var3;
            }
            ((kk) this).field_a.b(130, 90 + (var3 + -var6 >> -1958809311), var2_int, var6);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "kk.A(" + param0 + ')');
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_73_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 93) {
                break L1;
              } else {
                this.a(121, true, 108);
                break L1;
              }
            }
            L2: {
              var2_int = ((kk) this).field_c.field_a;
              if (((kk) this).field_c.a((byte) 10)) {
                break L2;
              } else {
                if (oa.field_H != 96) {
                  break L2;
                } else {
                  L3: {
                    ((kk) this).field_c.field_b = false;
                    if (var2_int >= 0) {
                      break L3;
                    } else {
                      var2_int = 0;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var2_int == 1) {
                      break L4;
                    } else {
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        var2_int = 1;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var2_int = 2;
                  break L2;
                }
              }
            }
            L5: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L5;
              } else {
                if (oa.field_H != 97) {
                  break L5;
                } else {
                  L6: {
                    ((kk) this).field_c.field_b = false;
                    if (0 > var2_int) {
                      break L6;
                    } else {
                      L7: {
                        if (1 == var2_int) {
                          break L7;
                        } else {
                          if (0 != var2_int) {
                            var2_int = 1;
                            if (var3 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int = 2;
                      if (var3 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2_int = 0;
                  break L5;
                }
              }
            }
            L8: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L8;
              } else {
                if (oa.field_H != 98) {
                  break L8;
                } else {
                  L9: {
                    ((kk) this).field_c.field_b = false;
                    if (var2_int >= 0) {
                      break L9;
                    } else {
                      var2_int = 2;
                      if (var3 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var2_int < 2) {
                    L10: {
                      if (var2_int != 0) {
                        break L10;
                      } else {
                        var2_int = 1;
                        if (var3 == 0) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var2_int--;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L11: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L11;
              } else {
                if (oa.field_H != 99) {
                  break L11;
                } else {
                  L12: {
                    ((kk) this).field_c.field_b = false;
                    if (var2_int == -1) {
                      break L12;
                    } else {
                      L13: {
                        if (var2_int < 1) {
                          break L13;
                        } else {
                          if (var2_int != 1) {
                            break L11;
                          } else {
                            var2_int = 0;
                            if (var3 == 0) {
                              break L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2_int = 2;
                  break L11;
                }
              }
            }
            stackOut_73_0 = var2_int;
            stackIn_74_0 = stackOut_73_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "kk.J(" + param0 + ')');
        }
        return stackIn_74_0;
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -6) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~b.field_j[((kk) this).field_g].length >= ~var4_int) {
                      break L3;
                    } else {
                      var5 = this.a((byte) -128, var4_int);
                      stackOut_6_0 = this.a(var4_int, (byte) 52);
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 > param2) {
                            break L4;
                          } else {
                            if (~param2 <= ~this.b(-6162, var4_int)) {
                              break L4;
                            } else {
                              if (param1 < var5) {
                                break L4;
                              } else {
                                if (param1 >= this.a(var4_int, true) + var5) {
                                  break L4;
                                } else {
                                  stackOut_19_0 = var4_int;
                                  stackIn_20_0 = stackOut_19_0;
                                  return stackIn_20_0;
                                }
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_22_0 = -1;
                  stackIn_23_0 = stackOut_22_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 122;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var4, "kk.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_83_0 = 0;
        int stackIn_257_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_255_0 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (((kk) this).field_c.c((byte) -104)) {
            cj.a((byte) -47, ke.field_h[0]);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 >= 15) {
            break L1;
          } else {
            field_b = 52;
            break L1;
          }
        }
        L2: {
          var4_int = b.field_j[((kk) this).field_g][param0];
          var5 = var4_int;
          if (var5 == 0) {
            if (((kk) this).field_c.g(0)) {
              L3: {
                if (!qb.field_b) {
                  L4: {
                    if (!ok.a(false)) {
                      break L4;
                    } else {
                      if (lg.field_w != 0) {
                        break L4;
                      } else {
                        qb.field_b = true;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (s.field_S == null) {
                    break L3;
                  } else {
                    if (s.field_S.field_l) {
                      if (null == s.field_S.field_g) {
                        break L3;
                      } else {
                        L5: {
                          var5_ref_String__ = s.field_S.field_g[1];
                          if (null != var5_ref_String__[0]) {
                            stackOut_82_0 = 0;
                            stackIn_83_0 = stackOut_82_0;
                            break L5;
                          } else {
                            stackOut_81_0 = 1;
                            stackIn_83_0 = stackOut_81_0;
                            break L5;
                          }
                        }
                        qb.field_b = stackIn_83_0 != 0;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              s.field_S = null;
              lg.field_w = lg.field_w + 1;
              pg.field_b = null;
              hf.field_f = new hj();
              ((kk) this).field_e = -1;
              break L2;
            } else {
              break L2;
            }
          } else {
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
                                                  if (var5 != 1) {
                                                    break L24;
                                                  } else {
                                                    if (var8 == 0) {
                                                      if (((kk) this).field_c.g(0)) {
                                                        h.a(0, true);
                                                        ((kk) this).field_e = -1;
                                                        if (var8 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L23;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                L25: {
                                                  if (var5 != 15) {
                                                    break L25;
                                                  } else {
                                                    if (var8 == 0) {
                                                      break L23;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                }
                                                L26: {
                                                  if (var5 != 5) {
                                                    break L26;
                                                  } else {
                                                    if (var8 == 0) {
                                                      break L22;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                                if (13 == var5) {
                                                  break L21;
                                                } else {
                                                  if (var5 == 3) {
                                                    break L20;
                                                  } else {
                                                    L27: {
                                                      if (var5 != 2) {
                                                        break L27;
                                                      } else {
                                                        if (var8 == 0) {
                                                          break L19;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    if (var5 == 11) {
                                                      break L18;
                                                    } else {
                                                      L28: {
                                                        if (12 != var5) {
                                                          break L28;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L17;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      L29: {
                                                        if (var5 != 4) {
                                                          break L29;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L16;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      L30: {
                                                        if (var5 != 17) {
                                                          break L30;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L15;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      L31: {
                                                        if (var5 != 6) {
                                                          break L31;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L14;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                      if (var5 == 7) {
                                                        break L13;
                                                      } else {
                                                        if (var5 == 8) {
                                                          break L12;
                                                        } else {
                                                          if (9 == var5) {
                                                            break L11;
                                                          } else {
                                                            L32: {
                                                              if (var5 != 18) {
                                                                break L32;
                                                              } else {
                                                                if (var8 == 0) {
                                                                  break L10;
                                                                } else {
                                                                  break L32;
                                                                }
                                                              }
                                                            }
                                                            if (var5 == 19) {
                                                              break L9;
                                                            } else {
                                                              L33: {
                                                                if (var5 != 14) {
                                                                  break L33;
                                                                } else {
                                                                  if (var8 == 0) {
                                                                    break L8;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                              if (var5 == 10) {
                                                                break L7;
                                                              } else {
                                                                if (16 == var5) {
                                                                  break L6;
                                                                } else {
                                                                  break L2;
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
                                              if (!((kk) this).field_c.g(0)) {
                                                break L22;
                                              } else {
                                                kg.field_c = 0;
                                                break L22;
                                              }
                                            }
                                            if (((kk) this).field_c.g(0)) {
                                              ((kk) this).field_e = 0;
                                              if (var8 == 0) {
                                                break L2;
                                              } else {
                                                break L21;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                          if (!((kk) this).field_c.g(0)) {
                                            break L2;
                                          } else {
                                            ((kk) this).field_e = 5;
                                            if (ok.a(false)) {
                                              ((kk) this).field_e = 8;
                                              if (var8 == 0) {
                                                break L2;
                                              } else {
                                                break L20;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                        if (!((kk) this).field_c.g(0)) {
                                          break L2;
                                        } else {
                                          ((kk) this).field_e = 3;
                                          if (var8 == 0) {
                                            break L2;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      if (((kk) this).field_c.g(0)) {
                                        ((kk) this).field_e = 2;
                                        if (!ok.a(false)) {
                                          break L2;
                                        } else {
                                          ((kk) this).field_e = 9;
                                          if (var8 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                    L34: {
                                      if (((kk) this).field_c.c(102)) {
                                        cj.a((byte) -37, ke.field_h[0]);
                                        qb.a(256, 0);
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    L35: {
                                      if (((kk) this).field_c.b(-29996)) {
                                        cj.a((byte) 102, ke.field_h[0]);
                                        qb.a(256, 256);
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    L36: {
                                      if (((kk) this).field_c.a((byte) 10)) {
                                        L37: {
                                          L38: {
                                            var5 = lh.field_b + 137;
                                            var6 = (-var5 + (this.a(param0, (byte) 52) + this.b(-6162, param0)) >> -1332231615) - (-lh.field_b - 30);
                                            var7 = ((-var6 + ei.field_a) * 256 + 4608) / 146;
                                            if (var7 > 0) {
                                              break L38;
                                            } else {
                                              qb.a(256, 0);
                                              if (var8 == 0) {
                                                break L37;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          L39: {
                                            if (var7 < 256) {
                                              break L39;
                                            } else {
                                              qb.a(256, 256);
                                              if (var8 == 0) {
                                                break L37;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          qb.a(256, var7);
                                          break L37;
                                        }
                                        int fieldTemp$1 = we.field_j + 1;
                                        we.field_j = we.field_j + 1;
                                        if (fieldTemp$1 <= 25) {
                                          break L36;
                                        } else {
                                          we.field_j = 0;
                                          cj.a((byte) 109, ke.field_h[0]);
                                          break L36;
                                        }
                                      } else {
                                        break L36;
                                      }
                                    }
                                    L40: {
                                      if (((kk) this).field_c.f(0)) {
                                        cj.a((byte) -126, ke.field_h[0]);
                                        jc.b(-42);
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    if (!((kk) this).field_c.d(25149)) {
                                      break L2;
                                    } else {
                                      cj.a((byte) -18, ke.field_h[0]);
                                      wc.a(-17076);
                                      if (var8 == 0) {
                                        break L2;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L41: {
                                    if (((kk) this).field_c.c(102)) {
                                      w.a(-1, 0);
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                  L42: {
                                    if (((kk) this).field_c.b(-29996)) {
                                      w.a(-1, 256);
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                  L43: {
                                    if (((kk) this).field_c.a((byte) 10)) {
                                      L44: {
                                        var5 = lh.field_b - -128 - -9;
                                        var6 = 30 + (this.a(param0, (byte) 52) - (-this.b(-6162, param0) + var5) >> -1088242175) + lh.field_b;
                                        var7 = 256 * (ei.field_a - (var6 + -18)) / 146;
                                        if (var7 > 0) {
                                          break L44;
                                        } else {
                                          w.a(-1, 0);
                                          if (var8 == 0) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                      L45: {
                                        if (var7 < 256) {
                                          break L45;
                                        } else {
                                          w.a(-1, 256);
                                          if (var8 == 0) {
                                            break L43;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      w.a(-1, var7);
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                  L46: {
                                    if (!((kk) this).field_c.f(0)) {
                                      break L46;
                                    } else {
                                      cj.a((byte) 103, ke.field_h[0]);
                                      vg.a(124);
                                      break L46;
                                    }
                                  }
                                  if (!((kk) this).field_c.d(25149)) {
                                    break L2;
                                  } else {
                                    cj.a((byte) -51, ke.field_h[0]);
                                    fl.a(-225);
                                    if (var8 == 0) {
                                      break L2;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (((kk) this).field_c.g(0)) {
                                  L47: {
                                    hl.field_a = 0;
                                    if (null == ba.field_f) {
                                      break L47;
                                    } else {
                                      rb.h(3591);
                                      if (var8 == 0) {
                                        break L2;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                  ue.a((byte) 122, param1);
                                  if (var8 == 0) {
                                    break L2;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              if (((kk) this).field_c.g(0)) {
                                ((kk) this).field_e = vl.field_g;
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L2;
                              }
                            }
                            if (!((kk) this).field_c.g(0)) {
                              break L2;
                            } else {
                              L48: {
                                if (hf.field_f.field_I <= 0) {
                                  break L48;
                                } else {
                                  L49: {
                                    L50: {
                                      hf.field_f.field_A = hf.field_f.field_A + (10000 + hf.field_f.field_I);
                                      var5 = 10000 - -hf.field_f.field_I;
                                      var6 = ej.field_b % 3;
                                      if (var6 == 0) {
                                        break L50;
                                      } else {
                                        L51: {
                                          if (var6 == 1) {
                                            break L51;
                                          } else {
                                            var7 = var5 / 3;
                                            cl.field_d = cl.field_d + var7;
                                            nj.field_b = nj.field_b - (-var7 + var5);
                                            if (var8 == 0) {
                                              break L49;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                        nj.field_b = nj.field_b - var5;
                                        if (var8 == 0) {
                                          break L49;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                    cl.field_d = cl.field_d + var5;
                                    break L49;
                                  }
                                  hf.field_f.a(-19921);
                                  hf.field_f.field_I = -1;
                                  break L48;
                                }
                              }
                              L52: {
                                L53: {
                                  if (!ok.a(false)) {
                                    break L53;
                                  } else {
                                    L54: {
                                      if (hf.field_f.field_A > 0) {
                                        break L54;
                                      } else {
                                        if (0 < fg.field_b) {
                                          break L54;
                                        } else {
                                          ((kk) this).field_e = 0;
                                          if (var8 == 0) {
                                            break L52;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                    }
                                    ((kk) this).field_e = 7;
                                    if (var8 == 0) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L55: {
                                  hf.field_f.c((byte) -108);
                                  s.field_S = null;
                                  if (fg.field_b == 0) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (0 < hf.field_f.field_A) {
                                        break L56;
                                      } else {
                                        ((kk) this).field_e = 10;
                                        if (var8 == 0) {
                                          break L52;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    ((kk) this).field_e = 6;
                                    if (var8 == 0) {
                                      break L52;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                L57: {
                                  if (hf.field_f.field_A <= 0) {
                                    break L57;
                                  } else {
                                    ((kk) this).field_e = 2;
                                    if (var8 == 0) {
                                      break L52;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                ((kk) this).field_e = 0;
                                break L52;
                              }
                              bl.a(50, uh.field_e);
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (!((kk) this).field_c.g(0)) {
                            break L2;
                          } else {
                            ef.field_b = 0;
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (((kk) this).field_c.g(0)) {
                          ef.field_b = 1;
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (!((kk) this).field_c.g(0)) {
                        break L2;
                      } else {
                        ef.field_b = 2;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (!((kk) this).field_c.g(0)) {
                      break L2;
                    } else {
                      ((kk) this).field_e = 3;
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (!((kk) this).field_c.g(0)) {
                    break L2;
                  } else {
                    ((kk) this).field_e = 4;
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L8;
                    }
                  }
                }
                if (!((kk) this).field_c.g(0)) {
                  break L2;
                } else {
                  L58: {
                    if (8 != ((kk) this).field_g) {
                      break L58;
                    } else {
                      gj.a(0, 8, 5);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (7 != ((kk) this).field_g) {
                      break L59;
                    } else {
                      L60: {
                        L61: {
                          if (fg.field_b <= 0) {
                            break L61;
                          } else {
                            L62: {
                              if (hf.field_f.field_A > 0) {
                                break L62;
                              } else {
                                var5 = 10;
                                if (var8 == 0) {
                                  break L60;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            var5 = 6;
                            if (var8 == 0) {
                              break L60;
                            } else {
                              break L61;
                            }
                          }
                        }
                        var5 = 2;
                        break L60;
                      }
                      gj.a(0, 7, var5);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L59;
                      }
                    }
                  }
                  if (((kk) this).field_g == 9) {
                    gj.a(0, 9, 2);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (!((kk) this).field_c.g(0)) {
                break L2;
              } else {
                L63: {
                  if (ba.field_f != null) {
                    rb.h(3591);
                    break L63;
                  } else {
                    break L63;
                  }
                }
                hd.a(true, ii.a(false));
                if (var8 == 0) {
                  break L2;
                } else {
                  break L6;
                }
              }
            }
            if (!((kk) this).field_c.g(0)) {
              break L2;
            } else {
              L64: {
                tl.a(-32663, false);
                if (qb.field_b) {
                  stackOut_256_0 = 0;
                  stackIn_257_0 = stackOut_256_0;
                  break L64;
                } else {
                  stackOut_255_0 = 1;
                  stackIn_257_0 = stackOut_255_0;
                  break L64;
                }
              }
              qb.field_b = stackIn_257_0 != 0;
              break L2;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_59_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -99) {
                break L1;
              } else {
                ((kk) this).field_d = true;
                break L1;
              }
            }
            L2: {
              var3_int = ((kk) this).field_c.field_a;
              if (((kk) this).field_c.a((byte) 10)) {
                break L2;
              } else {
                if (oa.field_H == 96) {
                  L3: {
                    L4: {
                      if (var3_int < 0) {
                        break L4;
                      } else {
                        if (0 != var3_int % param1) {
                          break L3;
                        } else {
                          var3_int = var3_int + param1;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var3_int = param1;
                    break L3;
                  }
                  L5: {
                    if (~var3_int >= ~((kk) this).field_c.field_i) {
                      break L5;
                    } else {
                      var3_int = ((kk) this).field_c.field_i;
                      break L5;
                    }
                  }
                  ((kk) this).field_c.field_b = false;
                  var3_int--;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L6: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L6;
              } else {
                if (97 == oa.field_H) {
                  L7: {
                    L8: {
                      if (var3_int >= 0) {
                        break L8;
                      } else {
                        var3_int = 0;
                        if (var4 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var3_int++;
                      if (var3_int % param1 != 0) {
                        break L9;
                      } else {
                        var3_int = var3_int - param1;
                        break L9;
                      }
                    }
                    if (~((kk) this).field_c.field_i < ~var3_int) {
                      break L7;
                    } else {
                      var3_int = var3_int - ((kk) this).field_c.field_i % param1;
                      break L7;
                    }
                  }
                  ((kk) this).field_c.field_b = false;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L10: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L10;
              } else {
                if (oa.field_H == 98) {
                  L11: {
                    L12: {
                      if (param1 > var3_int) {
                        break L12;
                      } else {
                        var3_int = 1;
                        if (var4 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var3_int = var3_int - param1;
                    break L11;
                  }
                  ((kk) this).field_c.field_b = false;
                  if (var3_int < 0) {
                    var3_int = 3;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
            }
            L13: {
              if (((kk) this).field_c.a((byte) 10)) {
                break L13;
              } else {
                if (oa.field_H != 99) {
                  break L13;
                } else {
                  L14: {
                    var3_int = var3_int + param1;
                    if (~var3_int <= ~((kk) this).field_c.field_i) {
                      L15: {
                        if (~(((kk) this).field_c.field_i + ((kk) this).field_c.field_i % param1) <= ~var3_int) {
                          break L15;
                        } else {
                          var3_int = 1;
                          if (var4 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var3_int = 3;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  ((kk) this).field_c.field_b = false;
                  break L13;
                }
              }
            }
            stackOut_58_0 = var3_int;
            stackIn_59_0 = stackOut_58_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_59_0;
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var9_int = 101 / ((58 - param1) / 33);
            param4 = ge.field_i.length + -1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param4 < 0) {
                    break L3;
                  } else {
                    param5 = ge.field_i[param4];
                    param7 = 255 & param5;
                    param2 = 255 & param5 >> -140450192;
                    param6 = param5 >> -1325656696 & 255;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (119 <= param6) {
                            break L5;
                          } else {
                            param2 = param2 - param3;
                            param7 = param7 - param3;
                            param6 = param6 - param3;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param6 = param6 - param0;
                        param7 = param7 - param0;
                        param2 = param2 - param0;
                        break L4;
                      }
                      L6: {
                        if (param7 >= 0) {
                          break L6;
                        } else {
                          param7 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (0 <= param2) {
                          break L7;
                        } else {
                          param2 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        if (param6 < 0) {
                          param6 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ge.field_i[param4] = bd.a(param7, bd.a(param2 << -845292272, param6 << -8027416));
                      param4--;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var9, "kk.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void c(byte param0) {
        try {
            ((kk) this).field_d = false;
            ((kk) this).field_i = 0;
            int var2_int = -55 % ((param0 - -6) / 62);
            ((kk) this).field_e = ((kk) this).field_g;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "kk.Q(" + param0 + ')');
        }
    }

    kk(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((kk) this).field_g = param0;
                  ((kk) this).field_c = new sg(b.field_j[param0].length);
                  ((kk) this).field_f = new le[b.field_j[param0].length];
                  if (param0 == 2) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (param0 == 3) {
                          break L5;
                        } else {
                          if (param0 == 4) {
                            break L5;
                          } else {
                            if (param0 == 9) {
                              ((kk) this).field_a = new le(380, 275);
                              if (var3 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      ((kk) this).field_a = new le(380, 263);
                      break L4;
                    }
                    var2_int = 0;
                    L6: while (true) {
                      L7: {
                        if (b.field_j[param0].length <= var2_int) {
                          break L7;
                        } else {
                          ((kk) this).field_f[var2_int] = new le(tj.field_c[param0] - fl.field_a[param0], 40);
                          var2_int++;
                          if (var3 != 0) {
                            break L1;
                          } else {
                            if (var3 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                L8: while (true) {
                  L9: {
                    if (~var2_int <= ~b.field_j[param0].length) {
                      break L9;
                    } else {
                      ((kk) this).field_f[var2_int] = new le((-fl.field_a[param0] + tj.field_c[param0] - 30) / 3, 40);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  ((kk) this).field_a = new le(380, 275);
                  break L2;
                }
              }
              ((kk) this).field_d = false;
              ((kk) this).field_i = 0;
              ((kk) this).field_e = ((kk) this).field_g;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "kk.<init>(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (((kk) this).field_g == 2) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (3 == ((kk) this).field_g) {
                      break L3;
                    } else {
                      if (((kk) this).field_g != 4) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param1 >= 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                stackOut_10_0 = tj.field_c[((kk) this).field_g];
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            }
            L4: {
              if (param0 == -6162) {
                break L4;
              } else {
                ((kk) this).a(false, true);
                break L4;
              }
            }
            stackOut_15_0 = this.a(param1, (byte) 52) + ((kk) this).field_f[param1].field_m;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    private final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        try {
          L0: {
            if (((kk) this).field_g != 2) {
              L1: {
                L2: {
                  if (((kk) this).field_g == 3) {
                    break L2;
                  } else {
                    if (((kk) this).field_g != 4) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param1 >= 2) {
                  stackOut_12_0 = mc.field_b[((kk) this).field_g] + i.field_r[((kk) this).field_g];
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  break L1;
                }
              }
              stackOut_10_0 = mc.field_b[((kk) this).field_g] * param1 + i.field_r[((kk) this).field_g];
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              if (param1 < 3) {
                stackOut_17_0 = i.field_r[((kk) this).field_g];
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              } else {
                L3: {
                  if (param0 <= -127) {
                    break L3;
                  } else {
                    ((kk) this).a(false, false);
                    break L3;
                  }
                }
                stackOut_22_0 = mc.field_b[((kk) this).field_g] + i.field_r[((kk) this).field_g];
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "kk.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
