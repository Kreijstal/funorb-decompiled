/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 99) {
              var4_int = param1.f(8, param0);
              if (-1 != (var4_int ^ -1)) {
                L1: {
                  L2: {
                    if (param2 == null) {
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
                      if (-1 > (var5 ^ -1)) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (var4_int <= var7) {
                              break L7;
                            } else {
                              param2[var7] = (byte)var6;
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
                        stackOut_20_0 = (byte[]) (param2);
                        stackIn_24_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_21_0[var7] = (byte)(var6 + param1.f(param3 + -91, var5));
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
                  stackOut_23_0 = (byte[]) (param2);
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_24_0;
        }
    }

    final void b(byte param0) {
        int discarded$1 = 0;
        int var2_int = 0;
        le var2 = null;
        int var3 = 0;
        vk var3_ref_vk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        vk stackIn_59_0 = null;
        vk stackIn_60_0 = null;
        vk stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        vk stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        vk stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        vk stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        vk stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        vk stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        vk stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        vk stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        vk stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        vk stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        vk stackIn_71_0 = null;
        vk stackIn_72_0 = null;
        vk stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        vk stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        vk stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        vk stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackOut_14_0 = 0;
        byte stackOut_22_0 = 0;
        vk stackOut_58_0 = null;
        vk stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        vk stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        vk stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        vk stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        vk stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        vk stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        vk stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        vk stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        vk stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        vk stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        vk stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        vk stackOut_70_0 = null;
        vk stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        vk stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        vk stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        vk stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        vk stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        ke.field_i.a(0, 0);
        var2_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (480 <= var2_int) {
                break L2;
              } else {
                kj.field_F.c(-(kj.field_F.field_m >> -533000127) + 80, var2_int);
                var2_int = var2_int + kj.field_F.field_n;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            df.field_q[bc.field_a].c(-(df.field_q[0].field_m >> -1513667871) + 80, ne.field_b);
            break L1;
          }
          var2_int = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (-481 >= (var2_int ^ -1)) {
                  break L5;
                } else {
                  kj.field_F.c(560 + -(kj.field_F.field_m >> 1482303553), var2_int);
                  var2_int = var2_int + kj.field_F.field_n;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              df.field_q[ob.field_r].f(-(df.field_q[0].field_m >> 1825633889) + 560, dd.field_e);
              break L4;
            }
            var2_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if ((var2_int ^ -1) <= (dk.field_j ^ -1)) {
                    break L8;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_23_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var6 != 0) {
                      break L7;
                    } else {
                      var3 = stackIn_15_0;
                      L9: while (true) {
                        L10: {
                          L11: {
                            if (var3 >= 5) {
                              break L11;
                            } else {
                              ge.g(pf.a((byte) 25, 640), pf.a((byte) -100, 100), pf.a((byte) 19, 500), 9283525, 60);
                              var3++;
                              if (var6 != 0) {
                                break L10;
                              } else {
                                if (var6 == 0) {
                                  continue L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          ma.a(ve.field_x[var2_int][0] << -243469980, ve.field_x[var2_int][1] << 142028388, 128, 40000);
                          var2_int++;
                          break L10;
                        }
                        if (var6 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = param0;
                stackIn_23_0 = stackOut_22_0;
                break L7;
              }
              L12: {
                if (stackIn_23_0 >= 119) {
                  break L12;
                } else {
                  discarded$1 = this.a((byte) 24, -74);
                  break L12;
                }
              }
              L13: {
                L14: {
                  if ((this.field_g ^ -1) == -9) {
                    break L14;
                  } else {
                    if (10 == this.field_g) {
                      break L14;
                    } else {
                      if ((this.field_g ^ -1) != -10) {
                        if ((this.field_g ^ -1) != -5) {
                          var2 = kb.field_a[this.field_g];
                          break L13;
                        } else {
                          var2 = kb.field_a[3];
                          break L13;
                        }
                      } else {
                        var2 = kb.field_a[2];
                        break L13;
                      }
                    }
                  }
                }
                var2 = kb.field_a[5];
                break L13;
              }
              L15: {
                L16: {
                  L17: {
                    L18: {
                      if (ad.a(false)) {
                        break L18;
                      } else {
                        if (ek.a((byte) -125)) {
                          break L18;
                        } else {
                          if (this.field_d) {
                            break L18;
                          } else {
                            if (20 >= this.field_i) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                    if (!this.field_d) {
                      break L16;
                    } else {
                      if (-1 < (this.field_i ^ -1)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L19: {
                    var3 = var2.field_n;
                    var4 = this.field_i * 255 / 20;
                    if (var4 <= 255) {
                      break L19;
                    } else {
                      var4 = 255;
                      break L19;
                    }
                  }
                  L20: {
                    var5 = var4 + -40;
                    if (0 <= var5) {
                      break L20;
                    } else {
                      var5 = 0;
                      break L20;
                    }
                  }
                  ma.a(var2, 320 - (var2.field_m >> -793499935), 0, var3, var4, var5);
                  if (var6 == 0) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
                var2.c(-(var2.field_m >> -515955519) + 320, 0);
                break L15;
              }
              L21: {
                L22: {
                  if (this.field_g == 2) {
                    break L22;
                  } else {
                    L23: {
                      if (-4 != (this.field_g ^ -1)) {
                        break L23;
                      } else {
                        this.a((byte) 1, true);
                        if (var6 == 0) {
                          break L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (-5 != (this.field_g ^ -1)) {
                        break L24;
                      } else {
                        this.a((byte) 1, false);
                        if (var6 == 0) {
                          break L21;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if (this.field_g == 5) {
                        break L25;
                      } else {
                        L26: {
                          if (6 == this.field_g) {
                            break L26;
                          } else {
                            if (-11 == (this.field_g ^ -1)) {
                              break L26;
                            } else {
                              L27: {
                                if (this.field_g != 7) {
                                  break L27;
                                } else {
                                  L28: {
                                    lb.a(120, 400, (byte) -119, wc.field_e, 180, 185);
                                    var3_ref_vk = pl.field_e;
                                    var4 = var3_ref_vk.field_C + 200;
                                    var5 = 4 + (var3_ref_vk.field_j + var3_ref_vk.field_D);
                                    var3_ref_vk.a(f.field_f, 320, var4, 1, -1);
                                    stackOut_58_0 = (vk) (var3_ref_vk);
                                    stackIn_60_0 = stackOut_58_0;
                                    stackIn_59_0 = stackOut_58_0;
                                    if (-1 == (fg.field_b ^ -1)) {
                                      stackOut_60_0 = (vk) ((Object) stackIn_60_0);
                                      stackOut_60_1 = 0;
                                      stackIn_61_0 = stackOut_60_0;
                                      stackIn_61_1 = stackOut_60_1;
                                      break L28;
                                    } else {
                                      stackOut_59_0 = (vk) ((Object) stackIn_59_0);
                                      stackOut_59_1 = 1;
                                      stackIn_61_0 = stackOut_59_0;
                                      stackIn_61_1 = stackOut_59_1;
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    stackOut_61_0 = (vk) ((Object) stackIn_61_0);
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = 0;
                                    stackOut_61_3 = 22890;
                                    stackIn_63_0 = stackOut_61_0;
                                    stackIn_63_1 = stackOut_61_1;
                                    stackIn_63_2 = stackOut_61_2;
                                    stackIn_63_3 = stackOut_61_3;
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    stackIn_62_2 = stackOut_61_2;
                                    stackIn_62_3 = stackOut_61_3;
                                    if (hf.field_f.field_A == 0) {
                                      stackOut_63_0 = (vk) ((Object) stackIn_63_0);
                                      stackOut_63_1 = stackIn_63_1;
                                      stackOut_63_2 = stackIn_63_2;
                                      stackOut_63_3 = stackIn_63_3;
                                      stackOut_63_4 = 0;
                                      stackIn_64_0 = stackOut_63_0;
                                      stackIn_64_1 = stackOut_63_1;
                                      stackIn_64_2 = stackOut_63_2;
                                      stackIn_64_3 = stackOut_63_3;
                                      stackIn_64_4 = stackOut_63_4;
                                      break L29;
                                    } else {
                                      stackOut_62_0 = (vk) ((Object) stackIn_62_0);
                                      stackOut_62_1 = stackIn_62_1;
                                      stackOut_62_2 = stackIn_62_2;
                                      stackOut_62_3 = stackIn_62_3;
                                      stackOut_62_4 = 1;
                                      stackIn_64_0 = stackOut_62_0;
                                      stackIn_64_1 = stackOut_62_1;
                                      stackIn_64_2 = stackOut_62_2;
                                      stackIn_64_3 = stackOut_62_3;
                                      stackIn_64_4 = stackOut_62_4;
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    ((vk) (Object) stackIn_64_0).a(wa.a(stackIn_64_1 != 0, stackIn_64_2 != 0, stackIn_64_3, stackIn_64_4 != 0), 320, var4 - -var5, 1, -1);
                                    stackOut_64_0 = (vk) (var3_ref_vk);
                                    stackOut_64_1 = -88;
                                    stackIn_66_0 = stackOut_64_0;
                                    stackIn_66_1 = stackOut_64_1;
                                    stackIn_65_0 = stackOut_64_0;
                                    stackIn_65_1 = stackOut_64_1;
                                    if (0 == fg.field_b) {
                                      stackOut_66_0 = (vk) ((Object) stackIn_66_0);
                                      stackOut_66_1 = stackIn_66_1;
                                      stackOut_66_2 = 0;
                                      stackIn_67_0 = stackOut_66_0;
                                      stackIn_67_1 = stackOut_66_1;
                                      stackIn_67_2 = stackOut_66_2;
                                      break L30;
                                    } else {
                                      stackOut_65_0 = (vk) ((Object) stackIn_65_0);
                                      stackOut_65_1 = stackIn_65_1;
                                      stackOut_65_2 = 1;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_67_2 = stackOut_65_2;
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    stackOut_67_0 = (vk) ((Object) stackIn_67_0);
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = stackIn_67_2;
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    stackIn_69_2 = stackOut_67_2;
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    stackIn_68_2 = stackOut_67_2;
                                    if ((hf.field_f.field_A ^ -1) == -1) {
                                      stackOut_69_0 = (vk) ((Object) stackIn_69_0);
                                      stackOut_69_1 = stackIn_69_1;
                                      stackOut_69_2 = stackIn_69_2;
                                      stackOut_69_3 = 0;
                                      stackIn_70_0 = stackOut_69_0;
                                      stackIn_70_1 = stackOut_69_1;
                                      stackIn_70_2 = stackOut_69_2;
                                      stackIn_70_3 = stackOut_69_3;
                                      break L31;
                                    } else {
                                      stackOut_68_0 = (vk) ((Object) stackIn_68_0);
                                      stackOut_68_1 = stackIn_68_1;
                                      stackOut_68_2 = stackIn_68_2;
                                      stackOut_68_3 = 1;
                                      stackIn_70_0 = stackOut_68_0;
                                      stackIn_70_1 = stackOut_68_1;
                                      stackIn_70_2 = stackOut_68_2;
                                      stackIn_70_3 = stackOut_68_3;
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    ((vk) (Object) stackIn_70_0).a(lk.a(stackIn_70_1, stackIn_70_2 != 0, stackIn_70_3 != 0, false), 320, 20 + (var4 - -(var5 * 3)), 1, -1);
                                    stackOut_70_0 = (vk) (var3_ref_vk);
                                    stackIn_72_0 = stackOut_70_0;
                                    stackIn_71_0 = stackOut_70_0;
                                    if ((hf.field_f.field_A ^ -1) == -1) {
                                      stackOut_72_0 = (vk) ((Object) stackIn_72_0);
                                      stackOut_72_1 = 0;
                                      stackIn_73_0 = stackOut_72_0;
                                      stackIn_73_1 = stackOut_72_1;
                                      break L32;
                                    } else {
                                      stackOut_71_0 = (vk) ((Object) stackIn_71_0);
                                      stackOut_71_1 = 1;
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      break L32;
                                    }
                                  }
                                  L33: {
                                    stackOut_73_0 = (vk) ((Object) stackIn_73_0);
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = 122;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    stackIn_74_2 = stackOut_73_2;
                                    if (-1 == (fg.field_b ^ -1)) {
                                      stackOut_75_0 = (vk) ((Object) stackIn_75_0);
                                      stackOut_75_1 = stackIn_75_1;
                                      stackOut_75_2 = stackIn_75_2;
                                      stackOut_75_3 = 0;
                                      stackIn_76_0 = stackOut_75_0;
                                      stackIn_76_1 = stackOut_75_1;
                                      stackIn_76_2 = stackOut_75_2;
                                      stackIn_76_3 = stackOut_75_3;
                                      break L33;
                                    } else {
                                      stackOut_74_0 = (vk) ((Object) stackIn_74_0);
                                      stackOut_74_1 = stackIn_74_1;
                                      stackOut_74_2 = stackIn_74_2;
                                      stackOut_74_3 = 1;
                                      stackIn_76_0 = stackOut_74_0;
                                      stackIn_76_1 = stackOut_74_1;
                                      stackIn_76_2 = stackOut_74_2;
                                      stackIn_76_3 = stackOut_74_3;
                                      break L33;
                                    }
                                  }
                                  ((vk) (Object) stackIn_76_0).a(ma.a(stackIn_76_1 != 0, (byte) stackIn_76_2, stackIn_76_3 != 0, false), 320, 20 + (var5 * 4 + var4 - -40), 1, -1);
                                  if (var6 == 0) {
                                    break L21;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L34: {
                                if ((this.field_g ^ -1) != -10) {
                                  break L34;
                                } else {
                                  this.c(119);
                                  if (var6 == 0) {
                                    break L21;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              if (-9 == (this.field_g ^ -1)) {
                                ri.a((byte) -122, this.field_i, false);
                                if (var6 == 0) {
                                  break L21;
                                } else {
                                  break L26;
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        ri.a((byte) -101, this.field_i, true);
                        if (var6 == 0) {
                          break L21;
                        } else {
                          break L25;
                        }
                      }
                    }
                    ri.a((byte) -100, this.field_i, false);
                    if (var6 == 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                this.b(69);
                break L21;
              }
              var3 = 0;
              L35: while (true) {
                L36: {
                  L37: {
                    L38: {
                      if ((this.field_c.field_i ^ -1) >= (var3 ^ -1)) {
                        break L38;
                      } else {
                        if (var6 != 0) {
                          break L37;
                        } else {
                          L39: {
                            stackOut_91_0 = this;
                            stackOut_91_1 = -1;
                            stackOut_91_2 = var3;
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            stackIn_93_2 = stackOut_91_2;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            stackIn_92_2 = stackOut_91_2;
                            if (this.field_c.field_a != var3) {
                              stackOut_93_0 = this;
                              stackOut_93_1 = stackIn_93_1;
                              stackOut_93_2 = stackIn_93_2;
                              stackOut_93_3 = 0;
                              stackIn_94_0 = stackOut_93_0;
                              stackIn_94_1 = stackOut_93_1;
                              stackIn_94_2 = stackOut_93_2;
                              stackIn_94_3 = stackOut_93_3;
                              break L39;
                            } else {
                              stackOut_92_0 = this;
                              stackOut_92_1 = stackIn_92_1;
                              stackOut_92_2 = stackIn_92_2;
                              stackOut_92_3 = 1;
                              stackIn_94_0 = stackOut_92_0;
                              stackIn_94_1 = stackOut_92_1;
                              stackIn_94_2 = stackOut_92_2;
                              stackIn_94_3 = stackOut_92_3;
                              break L39;
                            }
                          }
                          this.a(stackIn_94_1, stackIn_94_2, stackIn_94_3 != 0);
                          var3++;
                          if (var6 == 0) {
                            continue L35;
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                    if (ad.a(false)) {
                      var3 = hl.field_a;
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                  L40: {
                    if (32 < var3) {
                      var3 = 32;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    var4 = hl.field_a * 3;
                    if ((var4 ^ -1) >= -129) {
                      break L41;
                    } else {
                      var4 = 128;
                      break L41;
                    }
                  }
                  this.a(var3, (byte) 110, 0, var4, 0, 0, 0, 0);
                  break L36;
                }
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -104) {
            field_h = (String) null;
        }
    }

    private final void a(byte param0, boolean param1) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        vk var5 = null;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        String stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        String stackOut_11_0 = null;
        String stackOut_10_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_a.e();
        var3 = 380;
        var4 = 263;
        ge.d(3, 3, var3 - 6, -6 + var4, 16249775);
        lb.a(0, var3, (byte) -124, wc.field_e, 0, var4);
        var5 = pl.field_e;
        var6 = 0;
        var7_int = si.field_r / 8;
        if (param0 == 1) {
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= 8) {
                  break L2;
                } else {
                  var8 = 0;
                  stackOut_3_0 = -33;
                  stackOut_3_1 = si.field_r + var7_int * 6 & 63 ^ -1;
                  stackIn_15_0 = stackOut_3_0;
                  stackIn_15_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var9 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_4_0 <= stackIn_4_1) {
                        var8 = var7_int % 4;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    nh.field_f[0][var6 % 5][var8].c(-160 + 40 * var6 + (var3 >> 1910711617), 15);
                    var6++;
                    var7_int++;
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (param1) {
                  discarded$2 = var5.a(mk.field_j, 15, 53, -30 + var3, var4, 1, -1, 0, 0, 14);
                  break L4;
                } else {
                  L5: {
                    var6 = hb.a(false);
                    if (qb.field_b) {
                      stackOut_11_0 = gg.a(new String[]{Integer.toString(var6), Integer.toString(5)}, jg.field_kb, true);
                      stackIn_12_0 = stackOut_11_0;
                      break L5;
                    } else {
                      stackOut_10_0 = lg.field_I;
                      stackIn_12_0 = stackOut_10_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_12_0;
                  discarded$3 = var5.a(gg.a(new String[]{var7}, je.field_a, true), 14, 53, var3 + -30, var4, 1, -1, 0, 0, 14);
                  break L4;
                }
              }
              ac.field_a.a((byte) 118);
              var6 = this.field_i * var4 / 20;
              stackOut_14_0 = var6 ^ -1;
              stackOut_14_1 = var4 ^ -1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              break L1;
            }
            L6: {
              if (stackIn_15_0 < stackIn_15_1) {
                var6 = var4;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_a.b(130, (-var6 + var4 >> 1971065441) + 104, var3, var6);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        L0: {
          if (2 != this.field_g) {
            L1: {
              L2: {
                if (3 == this.field_g) {
                  break L2;
                } else {
                  if ((this.field_g ^ -1) != -5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-3 >= (param0 ^ -1)) {
                var3 = b.field_j[this.field_g][param0];
                if (19 == var3) {
                  return 30 + (this.field_f[param0].field_m + fl.field_a[this.field_g]);
                } else {
                  if (-19 != (var3 ^ -1)) {
                    break L0;
                  } else {
                    return fl.field_a[this.field_g] + -10 + (-this.field_f[param0].field_m + -20);
                  }
                }
              } else {
                break L1;
              }
            }
            return fl.field_a[this.field_g];
          } else {
            break L0;
          }
        }
        if (param1 == 52) {
          if (3 > param0) {
            return fl.field_a[this.field_g] + (20 + this.field_f[param0].field_m) * param0;
          } else {
            return 20 + this.field_f[param0].field_m + fl.field_a[this.field_g];
          }
        } else {
          return -100;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
            this.b((byte) -56);
        }
        this.field_c.a((byte) 60, this.a(-6, p.field_a, ei.field_a), param0);
    }

    private final void b(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        vk var4 = null;
        de var5 = null;
        String var6 = null;
        int var7 = 0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Throwable var15 = null;
        int[] var19 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (s.field_S != null) {
            break L0;
          } else {
            s.field_S = o.a(41, 10, 3, 1, -114);
            break L0;
          }
        }
        L1: {
          if (param0 >= 39) {
            break L1;
          } else {
            var15 = (Throwable) null;
            kk.a((String) null, (byte) -126, (Throwable) null);
            break L1;
          }
        }
        L2: {
          L3: {
            this.field_a.e();
            var2 = 380;
            var3 = 275;
            ge.d(3, 3, var2 + -6, var3 + -6, 16249775);
            lb.a(0, var2, (byte) -12, wc.field_e, 0, var3);
            sb.field_r.a(bg.field_B[ef.field_b], var2 >> 693749377, 30, 9330743, -1);
            var4 = pl.field_e;
            var5 = s.field_S;
            if (!var5.field_l) {
              break L3;
            } else {
              L4: {
                if (var5.field_g != null) {
                  break L4;
                } else {
                  var6 = re.field_b;
                  if (var14 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var6 = qc.field_O;
              var7_ref_String__ = var5.field_g[ef.field_b];
              var19 = var5.field_i[ef.field_b];
              var9 = ti.a(0, var5, ef.field_b, pg.field_b);
              var10 = var4.field_C - -40;
              var11 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      if (var11 >= 10) {
                        break L8;
                      } else {
                        stackOut_9_0 = 1 & var11 ^ -1;
                        stackOut_9_1 = -1;
                        stackIn_23_0 = stackOut_9_0;
                        stackIn_23_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var14 != 0) {
                          break L7;
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_10_0 != stackIn_10_1) {
                                break L10;
                              } else {
                                ge.c(13, -2 + -var4.field_C + var10, 354, 18, 12303291, 80);
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            ge.c(13, -2 + (-var4.field_C + var10), 354, 18, 14540253, 40);
                            break L9;
                          }
                          L11: {
                            if (null != var7_ref_String__[var11]) {
                              L12: {
                                var12 = 1;
                                var13 = var19[var11];
                                if ((var9 ^ -1) == (var11 ^ -1)) {
                                  var12 = 5683782;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var4.c(var11 + 1 + ". ", 30, var10, var12, -1);
                              var4.b(var7_ref_String__[var11], 30, var10, var12, -1);
                              var4.c(Integer.toString(var13), 360, var10, var12, -1);
                              var6 = "";
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10 += 18;
                          var11++;
                          if (var14 == 0) {
                            continue L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (hf.field_f == null) {
                      break L6;
                    } else {
                      stackOut_22_0 = var9;
                      stackOut_22_1 = -1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L7;
                    }
                  }
                  if (stackIn_23_0 != stackIn_23_1) {
                    break L6;
                  } else {
                    if (0 != hf.field_f.field_A) {
                      var4.b(cl.field_e, 30, var10, 5683782, -1);
                      var4.c(Integer.toString(hf.field_f.field_A), 360, var10, 5683782, -1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var14 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          var6 = eg.field_h;
          break L2;
        }
        L13: {
          discarded$1 = pl.field_e.a(nc.field_c, 30, var3 + -37, -60 + var2, 40, 1, -1, 1, 0, 12);
          var7 = 137;
          sb.field_r.a(var6, var2 / 2, var7, 9330743, -1);
          ac.field_a.a((byte) 116);
          var8 = var3 * this.field_i / 20;
          if (var8 <= var3) {
            break L13;
          } else {
            var8 = var3;
            break L13;
          }
        }
        this.field_a.b(130, (-var8 + var3 >> 530617729) + 90, var2, var8);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -53 / ((param0 - 15) / 33);
        if (this.field_d) {
          L0: {
            this.field_i = this.field_i - 1;
            if ((this.field_i ^ -1) >= -1) {
              L1: {
                if (-1 != this.field_e) {
                  break L1;
                } else {
                  ej.field_b = 50;
                  l.field_f = this.field_e;
                  if (var4 == 0) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (this.field_g == 5) {
                    break L3;
                  } else {
                    if (this.field_g == 6) {
                      break L3;
                    } else {
                      if (-9 == (this.field_g ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                ee.field_F = -1;
                break L2;
              }
              L4: {
                pg.field_d[this.field_e].c((byte) -122);
                if ((this.field_e ^ -1) == -3) {
                  s.field_S = null;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                L6: {
                  L7: {
                    var3 = qh.field_b;
                    if (this.field_g != 1) {
                      break L7;
                    } else {
                      if ((this.field_e ^ -1) == -7) {
                        break L7;
                      } else {
                        if (-11 == (this.field_e ^ -1)) {
                          break L7;
                        } else {
                          if (2 != this.field_e) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (1 != var3) {
                      break L8;
                    } else {
                      vl.field_g = 1;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var3 != 0) {
                    break L5;
                  } else {
                    vl.field_g = 0;
                    if (var4 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                vl.field_g = this.field_g;
                break L5;
              }
              l.field_f = this.field_e;
              qh.field_b = this.field_e;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          this.field_i = this.field_i + 1;
          if (20 > this.field_i) {
            return;
          } else {
            L9: while (true) {
              L10: {
                L11: {
                  if (!ba.a(-1)) {
                    break L11;
                  } else {
                    L12: {
                      if (13 != oa.field_H) {
                        break L12;
                      } else {
                        if ((this.field_g ^ -1) == -1) {
                          break L12;
                        } else {
                          if (this.field_g != 7) {
                            L13: {
                              this.field_e = vl.field_g;
                              if (1 != this.field_g) {
                                break L13;
                              } else {
                                this.field_e = -1;
                                h.a(0, true);
                                break L13;
                              }
                            }
                            if (-1 != this.field_e) {
                              pg.field_d[this.field_e].c((byte) -89);
                              if (var4 == 0) {
                                continue L9;
                              } else {
                                break L12;
                              }
                            } else {
                              continue L9;
                            }
                          } else {
                            continue L9;
                          }
                        }
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (this.field_g == 2) {
                            break L16;
                          } else {
                            if (this.field_g == 3) {
                              break L16;
                            } else {
                              if (-5 != (this.field_g ^ -1)) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        L17: {
                          if (this.field_g == 2) {
                            break L17;
                          } else {
                            L18: {
                              if (3 == this.field_g) {
                                break L18;
                              } else {
                                if (-5 == (this.field_g ^ -1)) {
                                  this.field_c.b((byte) 119);
                                  this.field_c.a(this.d(122), 83);
                                  if (var4 == 0) {
                                    break L14;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                            this.field_c.b((byte) 113);
                            this.field_c.a(this.d(122), -58);
                            if (var4 == 0) {
                              break L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.field_c.b((byte) 107);
                        this.field_c.a(this.a(-99, 3), -117);
                        if (var4 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                      this.field_c.e(0);
                      break L14;
                    }
                    if (this.field_c.field_a == -1) {
                      continue L9;
                    } else {
                      this.a(this.field_c.field_a, false, 77);
                      if (var4 != 0) {
                        break L10;
                      } else {
                        if (var4 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                if ((this.field_e ^ -1) != (this.field_g ^ -1)) {
                  break L10;
                } else {
                  L19: {
                    this.field_c.a(this.a(-6, p.field_a, ei.field_a), this.a(-6, ab.field_e, qg.field_c), true);
                    if (this.field_c.field_a != -1) {
                      this.a(this.field_c.field_a, true, 59);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (this.field_e != qh.field_b) {
                      L21: {
                        this.field_i = 20;
                        if (this.field_e == -1) {
                          break L21;
                        } else {
                          pg.field_d[this.field_e].a(true, false);
                          break L21;
                        }
                      }
                      this.field_d = true;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                }
              }
              L22: {
                if ((this.field_e ^ -1) != 0) {
                  pg.field_d[this.field_e].a(false, false);
                  break L22;
                } else {
                  break L22;
                }
              }
              this.field_d = true;
              this.field_i = 20;
              return;
            }
          }
        }
    }

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            int discarded$1 = 0;
            Exception var3 = null;
            String var3_ref = null;
            ic var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            md stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            md stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            md stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            md stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            md stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            md stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
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
                var7 = eg.a("%3a", 4, ":", var3_ref);
                var8 = eg.a("%40", 4, "@", var7);
                var9 = eg.a("%26", 4, "&", var8);
                var10 = eg.a("%23", 4, "#", var9);
                if (ni.field_e == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    stackOut_12_0 = fk.field_c;
                    stackOut_12_1 = 101;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = ni.field_e.getCodeBase();
                    stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(kd.field_c).append("&u=");
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    stackIn_13_5 = stackOut_12_5;
                    if (null == ck.field_f) {
                      stackOut_14_0 = (md) ((Object) stackIn_14_0);
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) ((Object) stackIn_14_4);
                      stackOut_14_5 = (StringBuilder) ((Object) stackIn_14_5);
                      stackOut_14_6 = "" + cc.field_b;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      stackIn_15_4 = stackOut_14_4;
                      stackIn_15_5 = stackOut_14_5;
                      stackIn_15_6 = stackOut_14_6;
                      break L4;
                    } else {
                      stackOut_13_0 = (md) ((Object) stackIn_13_0);
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = null;
                      stackOut_13_3 = null;
                      stackOut_13_4 = (java.net.URL) ((Object) stackIn_13_4);
                      stackOut_13_5 = (StringBuilder) ((Object) stackIn_13_5);
                      stackOut_13_6 = ck.field_f;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      stackIn_15_4 = stackOut_13_4;
                      stackIn_15_5 = stackOut_13_5;
                      stackIn_15_6 = stackOut_13_6;
                      break L4;
                    }
                  }
                  var4 = ((md) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + md.field_l + "&v2=" + md.field_m + "&e=" + var10));
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
                        if ((var4.field_g ^ -1) == -2) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                      var5 = (DataInputStream) (var4.field_b);
                      discarded$1 = var5.read();
                      var5.close();
                      break L6;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var3 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              L10: {
                if (param1 >= 56) {
                  break L10;
                } else {
                  field_h = (String) null;
                  break L10;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
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
        String[] stackIn_5_0 = null;
        String[] stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        String[] stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String stackIn_7_3 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackOut_4_0 = null;
        String[] stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        String[] stackOut_6_0 = null;
        String[] stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        String stackOut_6_3 = null;
        String[] stackOut_5_0 = null;
        String[] stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        String stackOut_5_3 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          var4 = this.a((byte) -128, param1);
          var5 = this.a(param1, (byte) 52);
          var6 = b.field_j[this.field_g][param1];
          var7 = ma.field_a[var6];
          if (var7 == null) {
            var7 = "ERROR: missing text";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if ((var6 ^ -1) != -17) {
              break L2;
            } else {
              L3: {
                stackOut_4_0 = new String[1];
                stackOut_4_1 = new String[1];
                stackOut_4_2 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                if (qb.field_b) {
                  stackOut_6_0 = (String[]) ((Object) stackIn_6_0);
                  stackOut_6_1 = (String[]) ((Object) stackIn_6_1);
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = ie.field_d;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  break L3;
                } else {
                  stackOut_5_0 = (String[]) ((Object) stackIn_5_0);
                  stackOut_5_1 = (String[]) ((Object) stackIn_5_1);
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = qg.field_b;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  break L3;
                }
              }
              stackIn_7_1[stackIn_7_2] = stackIn_7_3;
              var7 = gg.a(stackIn_7_0, var7, true);
              if (var14 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (-6 != (var6 ^ -1)) {
            break L1;
          } else {
            if ((this.field_g ^ -1) == -3) {
              var7 = pl.field_c;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var8 = this.field_f[param1].field_m;
        if (param0 == -1) {
          L4: {
            this.field_f[param1].e();
            if (param2) {
              stackOut_16_0 = 5683782;
              stackIn_17_0 = stackOut_16_0;
              break L4;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L4;
            }
          }
          L5: {
            var9 = stackIn_17_0;
            if (-8 == (this.field_g ^ -1)) {
              break L5;
            } else {
              lb.a(0, var8, (byte) -33, wc.field_e, 0, 40);
              break L5;
            }
          }
          L6: {
            L7: {
              L8: {
                var10 = sb.field_r;
                if ((var6 ^ -1) == -12) {
                  break L8;
                } else {
                  if (-13 != (var6 ^ -1)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                var11 = lh.field_b - -137;
                var12 = -var11 + var8 >> -839809695;
                var12 = var12 + (lh.field_b - -13);
                var10.c(var7, var12, var10.field_C, var9, -1);
                sd.field_f.c(var12, -6 + mc.field_b[this.field_g] / 2);
                if (-12 == (var6 ^ -1)) {
                  stackOut_24_0 = re.field_e;
                  stackIn_25_0 = stackOut_24_0;
                  break L9;
                } else {
                  stackOut_23_0 = ol.field_e;
                  stackIn_25_0 = stackOut_23_0;
                  break L9;
                }
              }
              var13 = stackIn_25_0;
              de.field_f.c(146 * var13 / 256 + -2 + var12, 14);
              if (var14 == 0) {
                break L6;
              } else {
                break L7;
              }
            }
            var10.a(var7, var8 >> -935373055, var10.field_C, var9, -1);
            break L6;
          }
          L10: {
            L11: {
              ac.field_a.a((byte) 114);
              var11 = 40 * this.field_i / 20;
              if (var11 > 40) {
                break L11;
              } else {
                if (!ad.a(false)) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            var11 = 40;
            break L10;
          }
          this.field_f[param1].b(var5, var4 - -(40 - var11 >> 378069313), var8, var11);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
            return -16;
        }
        return 40;
    }

    private final void c(int param0) {
        this.field_a.e();
        int var2 = 380;
        int var3 = 275;
        ge.d(3, 3, -6 + var2, -6 + var3, 16249775);
        lb.a(0, var2, (byte) 64, wc.field_e, 0, var3);
        int var5 = 86 % ((53 - param0) / 61);
        int var4 = 90;
        int discarded$0 = sb.field_r.a(el.field_c, 20, var4, -40 + var2, 200, 9330743, -1, 1, 0, 0);
        ac.field_a.a((byte) 127);
        int var6 = this.field_i * var3 / 20;
        if ((var3 ^ -1) > (var6 ^ -1)) {
            var6 = var3;
        }
        this.field_a.b(130, 90 + (var3 + -var6 >> -1958809311), var2, var6);
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 >= 93) {
            break L0;
          } else {
            this.a(121, true, 108);
            break L0;
          }
        }
        L1: {
          var2 = this.field_c.field_a;
          if (this.field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 != (oa.field_H ^ -1)) {
              break L1;
            } else {
              L2: {
                this.field_c.field_b = false;
                if (var2 >= 0) {
                  break L2;
                } else {
                  var2 = 0;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var2 ^ -1) == -2) {
                  break L3;
                } else {
                  if (-1 == (var2 ^ -1)) {
                    break L1;
                  } else {
                    var2 = 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = 2;
              break L1;
            }
          }
        }
        L4: {
          if (this.field_c.a((byte) 10)) {
            break L4;
          } else {
            if ((oa.field_H ^ -1) != -98) {
              break L4;
            } else {
              L5: {
                this.field_c.field_b = false;
                if (0 > var2) {
                  break L5;
                } else {
                  L6: {
                    if (1 == var2) {
                      break L6;
                    } else {
                      if (0 != var2) {
                        var2 = 1;
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = 2;
                  if (var3 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = 0;
              break L4;
            }
          }
        }
        L7: {
          if (this.field_c.a((byte) 10)) {
            break L7;
          } else {
            if ((oa.field_H ^ -1) != -99) {
              break L7;
            } else {
              L8: {
                this.field_c.field_b = false;
                if ((var2 ^ -1) <= -1) {
                  break L8;
                } else {
                  var2 = 2;
                  if (var3 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (-3 < (var2 ^ -1)) {
                L9: {
                  if (var2 != 0) {
                    break L9;
                  } else {
                    var2 = 1;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L9;
                    }
                  }
                }
                var2--;
                break L7;
              } else {
                break L7;
              }
            }
          }
        }
        L10: {
          if (this.field_c.a((byte) 10)) {
            break L10;
          } else {
            if (oa.field_H != 99) {
              break L10;
            } else {
              L11: {
                this.field_c.field_b = false;
                if (var2 == -1) {
                  break L11;
                } else {
                  L12: {
                    if (var2 < 1) {
                      break L12;
                    } else {
                      if ((var2 ^ -1) != -2) {
                        break L10;
                      } else {
                        var2 = 0;
                        if (var3 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var2 = 2;
              break L10;
            }
          }
        }
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_4_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -6) {
          var4 = 0;
          L0: while (true) {
            L1: {
              if ((b.field_j[this.field_g].length ^ -1) >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = this.a((byte) -128, var4);
                stackOut_4_0 = this.a(var4, (byte) 52);
                stackIn_12_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6 != 0) {
                  return stackIn_12_0;
                } else {
                  L2: {
                    if (stackIn_5_0 > param2) {
                      break L2;
                    } else {
                      if ((param2 ^ -1) <= (this.b(-6162, var4) ^ -1)) {
                        break L2;
                      } else {
                        if (param1 < var5) {
                          break L2;
                        } else {
                          if (param1 >= this.a(var4, true) + var5) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return -1;
          }
        } else {
          return 122;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_61_0 = 0;
        int stackIn_201_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_c.c((byte) -104)) {
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
          var4 = b.field_j[this.field_g][param0];
          var5 = var4;
          if (-1 == (var5 ^ -1)) {
            if (this.field_c.g(0)) {
              L3: {
                if (!qb.field_b) {
                  L4: {
                    if (!ok.a(false)) {
                      break L4;
                    } else {
                      if (-1 != (lg.field_w ^ -1)) {
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
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L5;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L5;
                          }
                        }
                        qb.field_b = stackIn_61_0 != 0;
                        break L3;
                      }
                    } else {
                      s.field_S = null;
                      lg.field_w = lg.field_w + 1;
                      pg.field_b = null;
                      hf.field_f = new hj();
                      this.field_e = -1;
                      break L2;
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
              this.field_e = -1;
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
                                                  L25: {
                                                    if (var5 != 1) {
                                                      break L25;
                                                    } else {
                                                      if (var8 == 0) {
                                                        if (this.field_c.g(0)) {
                                                          h.a(0, true);
                                                          this.field_e = -1;
                                                          if (var8 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L24;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  L26: {
                                                    if (-16 != (var5 ^ -1)) {
                                                      break L26;
                                                    } else {
                                                      if (var8 == 0) {
                                                        break L24;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  L27: {
                                                    if ((var5 ^ -1) != -6) {
                                                      break L27;
                                                    } else {
                                                      if (var8 == 0) {
                                                        break L23;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  if (13 == var5) {
                                                    break L22;
                                                  } else {
                                                    if (var5 == 3) {
                                                      break L21;
                                                    } else {
                                                      L28: {
                                                        if ((var5 ^ -1) != -3) {
                                                          break L28;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L20;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      if ((var5 ^ -1) == -12) {
                                                        break L19;
                                                      } else {
                                                        L29: {
                                                          if (12 != var5) {
                                                            break L29;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L18;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                        L30: {
                                                          if (var5 != 4) {
                                                            break L30;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L17;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        L31: {
                                                          if ((var5 ^ -1) != -18) {
                                                            break L31;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L16;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                        }
                                                        L32: {
                                                          if (var5 != 6) {
                                                            break L32;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L15;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        if (-8 == (var5 ^ -1)) {
                                                          break L14;
                                                        } else {
                                                          if (-9 == (var5 ^ -1)) {
                                                            break L13;
                                                          } else {
                                                            if (9 == var5) {
                                                              break L12;
                                                            } else {
                                                              L33: {
                                                                if (-19 != (var5 ^ -1)) {
                                                                  break L33;
                                                                } else {
                                                                  if (var8 == 0) {
                                                                    break L11;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                              if (var5 == 19) {
                                                                break L10;
                                                              } else {
                                                                L34: {
                                                                  if (var5 != 14) {
                                                                    break L34;
                                                                  } else {
                                                                    if (var8 == 0) {
                                                                      break L9;
                                                                    } else {
                                                                      break L34;
                                                                    }
                                                                  }
                                                                }
                                                                if (-11 == (var5 ^ -1)) {
                                                                  break L8;
                                                                } else {
                                                                  if (16 == var5) {
                                                                    break L7;
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
                                                if (!this.field_c.g(0)) {
                                                  break L23;
                                                } else {
                                                  kg.field_c = 0;
                                                  break L23;
                                                }
                                              }
                                              if (this.field_c.g(0)) {
                                                this.field_e = 0;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L22;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                            if (!this.field_c.g(0)) {
                                              break L6;
                                            } else {
                                              this.field_e = 5;
                                              if (ok.a(false)) {
                                                this.field_e = 8;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L21;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                          if (!this.field_c.g(0)) {
                                            break L6;
                                          } else {
                                            this.field_e = 3;
                                            if (var8 == 0) {
                                              break L6;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (this.field_c.g(0)) {
                                          this.field_e = 2;
                                          if (!ok.a(false)) {
                                            break L6;
                                          } else {
                                            this.field_e = 9;
                                            if (var8 == 0) {
                                              break L6;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                      L35: {
                                        if (this.field_c.c(102)) {
                                          cj.a((byte) -37, ke.field_h[0]);
                                          qb.a(256, 0);
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                      L36: {
                                        if (this.field_c.b(-29996)) {
                                          cj.a((byte) 102, ke.field_h[0]);
                                          qb.a(256, 256);
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      L37: {
                                        if (this.field_c.a((byte) 10)) {
                                          L38: {
                                            L39: {
                                              var5 = lh.field_b + 137;
                                              var6 = (-var5 + (this.a(param0, (byte) 52) + this.b(-6162, param0)) >> -1332231615) - (-lh.field_b - 30);
                                              var7 = ((-var6 + ei.field_a) * 256 + 4608) / 146;
                                              if (-1 > (var7 ^ -1)) {
                                                break L39;
                                              } else {
                                                qb.a(256, 0);
                                                if (var8 == 0) {
                                                  break L38;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            L40: {
                                              if (-257 < (var7 ^ -1)) {
                                                break L40;
                                              } else {
                                                qb.a(256, 256);
                                                if (var8 == 0) {
                                                  break L38;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            qb.a(256, var7);
                                            break L38;
                                          }
                                          fieldTemp$1 = we.field_j + 1;
                                          we.field_j = we.field_j + 1;
                                          if (-26 <= (fieldTemp$1 ^ -1)) {
                                            break L37;
                                          } else {
                                            we.field_j = 0;
                                            cj.a((byte) 109, ke.field_h[0]);
                                            break L37;
                                          }
                                        } else {
                                          break L37;
                                        }
                                      }
                                      L41: {
                                        if (this.field_c.f(0)) {
                                          cj.a((byte) -126, ke.field_h[0]);
                                          jc.b(-42);
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      if (!this.field_c.d(25149)) {
                                        break L6;
                                      } else {
                                        cj.a((byte) -18, ke.field_h[0]);
                                        wc.a(-17076);
                                        if (var8 == 0) {
                                          break L6;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L42: {
                                      if (this.field_c.c(102)) {
                                        w.a(-1, 0);
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (this.field_c.b(-29996)) {
                                        w.a(-1, 256);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    L44: {
                                      if (this.field_c.a((byte) 10)) {
                                        L45: {
                                          var5 = lh.field_b - -128 - -9;
                                          var6 = 30 + (this.a(param0, (byte) 52) - (-this.b(-6162, param0) + var5) >> -1088242175) + lh.field_b;
                                          var7 = 256 * (ei.field_a - (var6 + -18)) / 146;
                                          if (-1 > (var7 ^ -1)) {
                                            break L45;
                                          } else {
                                            w.a(-1, 0);
                                            if (var8 == 0) {
                                              break L44;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                        L46: {
                                          if (var7 < 256) {
                                            break L46;
                                          } else {
                                            w.a(-1, 256);
                                            if (var8 == 0) {
                                              break L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        w.a(-1, var7);
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                    L47: {
                                      if (!this.field_c.f(0)) {
                                        break L47;
                                      } else {
                                        cj.a((byte) 103, ke.field_h[0]);
                                        vg.a(124);
                                        break L47;
                                      }
                                    }
                                    if (!this.field_c.d(25149)) {
                                      break L6;
                                    } else {
                                      cj.a((byte) -51, ke.field_h[0]);
                                      fl.a(-225);
                                      if (var8 == 0) {
                                        break L6;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if (this.field_c.g(0)) {
                                    L48: {
                                      hl.field_a = 0;
                                      if (null == ba.field_f) {
                                        break L48;
                                      } else {
                                        rb.h(3591);
                                        if (var8 == 0) {
                                          break L6;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    ue.a((byte) 122, param1);
                                    if (var8 == 0) {
                                      break L6;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (this.field_c.g(0)) {
                                  this.field_e = vl.field_g;
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              if (!this.field_c.g(0)) {
                                break L6;
                              } else {
                                L49: {
                                  if (-1 <= (hf.field_f.field_I ^ -1)) {
                                    break L49;
                                  } else {
                                    L50: {
                                      L51: {
                                        hf.field_f.field_A = hf.field_f.field_A + (10000 + hf.field_f.field_I);
                                        var5 = 10000 - -hf.field_f.field_I;
                                        var6 = ej.field_b % 3;
                                        if (-1 == (var6 ^ -1)) {
                                          break L51;
                                        } else {
                                          L52: {
                                            if (var6 == 1) {
                                              break L52;
                                            } else {
                                              var7 = var5 / 3;
                                              cl.field_d = cl.field_d + var7;
                                              nj.field_b = nj.field_b - (-var7 + var5);
                                              if (var8 == 0) {
                                                break L50;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                          nj.field_b = nj.field_b - var5;
                                          if (var8 == 0) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      cl.field_d = cl.field_d + var5;
                                      break L50;
                                    }
                                    hf.field_f.a(-19921);
                                    hf.field_f.field_I = -1;
                                    break L49;
                                  }
                                }
                                L53: {
                                  L54: {
                                    if (!ok.a(false)) {
                                      break L54;
                                    } else {
                                      L55: {
                                        if (hf.field_f.field_A > 0) {
                                          break L55;
                                        } else {
                                          if (0 < fg.field_b) {
                                            break L55;
                                          } else {
                                            this.field_e = 0;
                                            if (var8 == 0) {
                                              break L53;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                      }
                                      this.field_e = 7;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  L56: {
                                    hf.field_f.c((byte) -108);
                                    s.field_S = null;
                                    if (fg.field_b == 0) {
                                      break L56;
                                    } else {
                                      L57: {
                                        if (0 < hf.field_f.field_A) {
                                          break L57;
                                        } else {
                                          this.field_e = 10;
                                          if (var8 == 0) {
                                            break L53;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      this.field_e = 6;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  L58: {
                                    if (hf.field_f.field_A <= 0) {
                                      break L58;
                                    } else {
                                      this.field_e = 2;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  this.field_e = 0;
                                  break L53;
                                }
                                bl.a(50, uh.field_e);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (!this.field_c.g(0)) {
                              break L6;
                            } else {
                              ef.field_b = 0;
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (this.field_c.g(0)) {
                            ef.field_b = 1;
                            if (var8 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          } else {
                            break L2;
                          }
                        }
                        if (!this.field_c.g(0)) {
                          break L6;
                        } else {
                          ef.field_b = 2;
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (!this.field_c.g(0)) {
                        break L6;
                      } else {
                        this.field_e = 3;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (!this.field_c.g(0)) {
                      break L6;
                    } else {
                      this.field_e = 4;
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (!this.field_c.g(0)) {
                    break L6;
                  } else {
                    L59: {
                      if (8 != this.field_g) {
                        break L59;
                      } else {
                        gj.a(0, 8, 5);
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L59;
                        }
                      }
                    }
                    L60: {
                      if (7 != this.field_g) {
                        break L60;
                      } else {
                        L61: {
                          L62: {
                            if (-1 <= (fg.field_b ^ -1)) {
                              break L62;
                            } else {
                              L63: {
                                if (-1 > (hf.field_f.field_A ^ -1)) {
                                  break L63;
                                } else {
                                  var5 = 10;
                                  if (var8 == 0) {
                                    break L61;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var5 = 6;
                              if (var8 == 0) {
                                break L61;
                              } else {
                                break L62;
                              }
                            }
                          }
                          var5 = 2;
                          break L61;
                        }
                        gj.a(0, 7, var5);
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L60;
                        }
                      }
                    }
                    if ((this.field_g ^ -1) == -10) {
                      gj.a(0, 9, 2);
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.field_c.g(0)) {
                  break L6;
                } else {
                  L64: {
                    if (ba.field_f != null) {
                      rb.h(3591);
                      break L64;
                    } else {
                      break L64;
                    }
                  }
                  hd.a(true, ii.a(false));
                  if (var8 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (!this.field_c.g(0)) {
                break L6;
              } else {
                L65: {
                  tl.a(-32663, false);
                  if (qb.field_b) {
                    stackOut_200_0 = 0;
                    stackIn_201_0 = stackOut_200_0;
                    break L65;
                  } else {
                    stackOut_199_0 = 1;
                    stackIn_201_0 = stackOut_199_0;
                    break L65;
                  }
                }
                qb.field_b = stackIn_201_0 != 0;
                break L6;
              }
            }
            break L2;
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -99) {
            break L0;
          } else {
            this.field_d = true;
            break L0;
          }
        }
        L1: {
          var3 = this.field_c.field_a;
          if (this.field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 == (oa.field_H ^ -1)) {
              L2: {
                L3: {
                  if ((var3 ^ -1) > -1) {
                    break L3;
                  } else {
                    if (0 != var3 % param1) {
                      break L2;
                    } else {
                      var3 = var3 + param1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = param1;
                break L2;
              }
              L4: {
                if ((var3 ^ -1) >= (this.field_c.field_i ^ -1)) {
                  break L4;
                } else {
                  var3 = this.field_c.field_i;
                  break L4;
                }
              }
              this.field_c.field_b = false;
              var3--;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L5: {
          if (this.field_c.a((byte) 10)) {
            break L5;
          } else {
            if (97 == oa.field_H) {
              L6: {
                L7: {
                  if (var3 >= 0) {
                    break L7;
                  } else {
                    var3 = 0;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  var3++;
                  if ((var3 % param1 ^ -1) != -1) {
                    break L8;
                  } else {
                    var3 = var3 - param1;
                    break L8;
                  }
                }
                if ((this.field_c.field_i ^ -1) < (var3 ^ -1)) {
                  break L6;
                } else {
                  var3 = var3 - this.field_c.field_i % param1;
                  break L6;
                }
              }
              this.field_c.field_b = false;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L9: {
          if (this.field_c.a((byte) 10)) {
            break L9;
          } else {
            if (-99 == (oa.field_H ^ -1)) {
              L10: {
                L11: {
                  if (param1 > var3) {
                    break L11;
                  } else {
                    var3 = 1;
                    if (var4 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                var3 = var3 - param1;
                break L10;
              }
              this.field_c.field_b = false;
              if (-1 < (var3 ^ -1)) {
                var3 = 3;
                break L9;
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          }
        }
        L12: {
          if (this.field_c.a((byte) 10)) {
            break L12;
          } else {
            if (oa.field_H != 99) {
              break L12;
            } else {
              L13: {
                var3 = var3 + param1;
                if ((var3 ^ -1) <= (this.field_c.field_i ^ -1)) {
                  L14: {
                    if ((this.field_c.field_i + this.field_c.field_i % param1 ^ -1) <= (var3 ^ -1)) {
                      break L14;
                    } else {
                      var3 = 1;
                      if (var4 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var3 = 3;
                  break L13;
                } else {
                  break L13;
                }
              }
              this.field_c.field_b = false;
              break L12;
            }
          }
        }
        return var3;
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        var9 = 101 / ((58 - param1) / 33);
        param4 = ge.field_i.length + -1;
        L0: while (true) {
          L1: {
            if (param4 < 0) {
              break L1;
            } else {
              param5 = ge.field_i[param4];
              param7 = 255 & param5;
              param2 = 255 & param5 >> -140450192;
              param6 = param5 >> -1325656696 & 255;
              if (var10 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (119 <= param6) {
                      break L3;
                    } else {
                      param2 = param2 - param3;
                      param7 = param7 - param3;
                      param6 = param6 - param3;
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param6 = param6 - param0;
                  param7 = param7 - param0;
                  param2 = param2 - param0;
                  break L2;
                }
                L4: {
                  if (param7 >= 0) {
                    break L4;
                  } else {
                    param7 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (0 <= param2) {
                    break L5;
                  } else {
                    param2 = 0;
                    break L5;
                  }
                }
                L6: {
                  if ((param6 ^ -1) > -1) {
                    param6 = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ge.field_i[param4] = bd.a(param7, bd.a(param2 << -845292272, param6 << -8027416));
                param4--;
                if (var10 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        this.field_d = false;
        this.field_i = 0;
        int var2 = -55 % ((param0 - -6) / 62);
        this.field_e = this.field_g;
    }

    kk(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = MonkeyPuzzle2.field_F ? 1 : 0;
              this.field_g = param0;
              this.field_c = new sg(b.field_j[param0].length);
              this.field_f = new le[b.field_j[param0].length];
              if (-3 == (param0 ^ -1)) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if ((param0 ^ -1) == -4) {
                      break L4;
                    } else {
                      if (-5 == (param0 ^ -1)) {
                        break L4;
                      } else {
                        if (param0 != 9) {
                          break L3;
                        } else {
                          this.field_a = new le(380, 275);
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_a = new le(380, 263);
                  break L3;
                }
                var2 = 0;
                L5: while (true) {
                  L6: {
                    if (b.field_j[param0].length <= var2) {
                      break L6;
                    } else {
                      this.field_f[var2] = new le(tj.field_c[param0] - fl.field_a[param0], 40);
                      var2++;
                      if (var3 != 0) {
                        break L0;
                      } else {
                        if (var3 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2 = 0;
            L7: while (true) {
              L8: {
                if ((var2 ^ -1) <= (b.field_j[param0].length ^ -1)) {
                  break L8;
                } else {
                  this.field_f[var2] = new le((-fl.field_a[param0] + tj.field_c[param0] - 30) / 3, 40);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              this.field_a = new le(380, 275);
              break L1;
            }
          }
          this.field_d = false;
          this.field_i = 0;
          this.field_e = this.field_g;
          break L0;
        }
    }

    private final int b(int param0, int param1) {
        L0: {
          if ((this.field_g ^ -1) == -3) {
            break L0;
          } else {
            L1: {
              L2: {
                if (3 == this.field_g) {
                  break L2;
                } else {
                  if (-5 != (this.field_g ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-3 >= (param1 ^ -1)) {
                break L0;
              } else {
                break L1;
              }
            }
            return tj.field_c[this.field_g];
          }
        }
        L3: {
          if (param0 == -6162) {
            break L3;
          } else {
            this.a(false, true);
            break L3;
          }
        }
        return this.a(param1, (byte) 52) + this.field_f[param1].field_m;
    }

    private final int a(byte param0, int param1) {
        if (-3 != (this.field_g ^ -1)) {
          L0: {
            L1: {
              if (this.field_g == 3) {
                break L1;
              } else {
                if (this.field_g != 4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 >= 2) {
              return mc.field_b[this.field_g] + i.field_r[this.field_g];
            } else {
              break L0;
            }
          }
          return mc.field_b[this.field_g] * param1 + i.field_r[this.field_g];
        } else {
          if (param1 < 3) {
            return i.field_r[this.field_g];
          } else {
            L2: {
              if (param0 <= -127) {
                break L2;
              } else {
                this.a(false, false);
                break L2;
              }
            }
            return mc.field_b[this.field_g] + i.field_r[this.field_g];
          }
        }
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
