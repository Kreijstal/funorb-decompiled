/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    private ja[] field_d;
    static String field_f;
    static cj field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 100 / ((param0 - -82) / 37);
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
            return;
        }
        s.a(param0, 0, this.field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        if (param0 != -27486) {
            return -94;
        }
        return hp.a((byte) 99, g.field_a, 256) << 644485840 | hp.a((byte) -91, g.field_a, 256) << -1968869272 | hp.a((byte) -97, g.field_a, 256);
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                var5 = (byte[]) null;
                pd.a((byte) 9, (byte[]) null);
                break L1;
              }
            }
            L2: {
              var4 = dn.a(param1, false);
              if (var4 == null) {
                break L2;
              } else {
                if (var4.field_Nb == null) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              L4: {
                if (mh.field_c == null) {
                  break L4;
                } else {
                  if (vm.a(param0, (byte) -81) == null) {
                    break L4;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4_ref);
            stackOut_11_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    pd(ja[] param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        k var16 = null;
        k var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_70_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var16 = new k(param1);
              var17 = var16;
              var17.field_j = -2 + param1.length;
              qc.field_v = var17.d((byte) 69);
              ll.field_h = new boolean[qc.field_v];
              qj.field_o = new int[qc.field_v];
              k.field_i = new int[qc.field_v];
              if (param0 > 82) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            vf.field_b = new byte[qc.field_v][];
            oq.field_w = new int[qc.field_v];
            qp.field_t = new byte[qc.field_v][];
            vj.field_p = new int[qc.field_v];
            var17.field_j = param1.length + -7 - 8 * qc.field_v;
            ie.field_nb = var17.d((byte) 69);
            hj.field_a = var17.d((byte) 69);
            var3 = 1 + (var17.g(31365) & 255);
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= qc.field_v) {
                    break L4;
                  } else {
                    k.field_i[var4] = var16.d((byte) 69);
                    var4++;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4 = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if ((qc.field_v ^ -1) >= (var4 ^ -1)) {
                      break L7;
                    } else {
                      qj.field_o[var4] = var16.d((byte) 69);
                      var4++;
                      if (var15 != 0) {
                        break L6;
                      } else {
                        if (var15 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if ((var4 ^ -1) <= (qc.field_v ^ -1)) {
                        break L10;
                      } else {
                        oq.field_w[var4] = var16.d((byte) 69);
                        var4++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L9;
                  }
                  L11: while (true) {
                    L12: {
                      L13: {
                        if (var4 >= qc.field_v) {
                          break L13;
                        } else {
                          vj.field_p[var4] = var16.d((byte) 69);
                          var4++;
                          if (var15 != 0) {
                            break L12;
                          } else {
                            if (var15 == 0) {
                              continue L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var17.field_j = -(var3 * 3) + -4 + (param1.length + -(8 * qc.field_v));
                      tp.field_t = new int[var3];
                      break L12;
                    }
                    var4 = 1;
                    L14: while (true) {
                      L15: {
                        L16: {
                          L17: {
                            if ((var4 ^ -1) <= (var3 ^ -1)) {
                              break L17;
                            } else {
                              tp.field_t[var4] = var16.e(128);
                              stackOut_29_0 = -1;
                              stackOut_29_1 = tp.field_t[var4] ^ -1;
                              stackIn_36_0 = stackOut_29_0;
                              stackIn_36_1 = stackOut_29_1;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (var15 != 0) {
                                L18: while (true) {
                                  if (stackIn_36_0 >= stackIn_36_1) {
                                    break L15;
                                  } else {
                                    var5 = oq.field_w[var4];
                                    var6 = vj.field_p[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    qp.field_t[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    vf.field_b[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.g(31365);
                                    if (var15 != 0) {
                                      break L16;
                                    } else {
                                      stackOut_38_0 = -1;
                                      stackOut_38_1 = 1 & var11 ^ -1;
                                      stackIn_40_0 = stackOut_38_0;
                                      stackIn_40_1 = stackOut_38_1;
                                      L19: while (true) {
                                        L20: {
                                          L21: {
                                            L22: {
                                              L23: {
                                                if (stackIn_40_0 != stackIn_40_1) {
                                                  break L23;
                                                } else {
                                                  var12 = 0;
                                                  L24: while (true) {
                                                    L25: {
                                                      if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                        break L25;
                                                      } else {
                                                        var8[var12] = var16.d(-249699580);
                                                        var12++;
                                                        if (var15 != 0) {
                                                          break L21;
                                                        } else {
                                                          if (var15 == 0) {
                                                            continue L24;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if ((var11 & 2 ^ -1) == -1) {
                                                      break L22;
                                                    } else {
                                                      var12 = 0;
                                                      L26: while (true) {
                                                        L27: {
                                                          if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                            break L27;
                                                          } else {
                                                            dupTemp$2 = var16.d(-249699580);
                                                            var9[var12] = dupTemp$2;
                                                            var13 = dupTemp$2;
                                                            stackOut_49_0 = var10;
                                                            stackOut_49_1 = 0;
                                                            stackOut_49_2 = var13 ^ -1;
                                                            stackIn_39_0 = stackOut_49_0;
                                                            stackIn_39_1 = stackOut_49_1;
                                                            stackIn_39_2 = stackOut_49_2;
                                                            stackIn_50_0 = stackOut_49_0;
                                                            stackIn_50_1 = stackOut_49_1;
                                                            stackIn_50_2 = stackOut_49_2;
                                                            if (var15 != 0) {
                                                              stackOut_39_0 = stackIn_39_0;
                                                              stackOut_39_1 = stackIn_39_1 ^ stackIn_39_2;
                                                              stackIn_40_0 = stackOut_39_0;
                                                              stackIn_40_1 = stackOut_39_1;
                                                              continue L19;
                                                            } else {
                                                              L28: {
                                                                stackOut_50_0 = stackIn_50_0;
                                                                stackIn_52_0 = stackOut_50_0;
                                                                stackIn_51_0 = stackOut_50_0;
                                                                if (stackIn_50_1 == stackIn_50_2) {
                                                                  stackOut_52_0 = stackIn_52_0;
                                                                  stackOut_52_1 = 0;
                                                                  stackIn_53_0 = stackOut_52_0;
                                                                  stackIn_53_1 = stackOut_52_1;
                                                                  break L28;
                                                                } else {
                                                                  stackOut_51_0 = stackIn_51_0;
                                                                  stackOut_51_1 = 1;
                                                                  stackIn_53_0 = stackOut_51_0;
                                                                  stackIn_53_1 = stackOut_51_1;
                                                                  break L28;
                                                                }
                                                              }
                                                              var10 = stackIn_53_0 | stackIn_53_1;
                                                              var12++;
                                                              if (var15 == 0) {
                                                                continue L26;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (var15 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var12 = 0;
                                              L29: while (true) {
                                                L30: {
                                                  L31: {
                                                    if ((var5 ^ -1) >= (var12 ^ -1)) {
                                                      break L31;
                                                    } else {
                                                      stackOut_57_0 = 0;
                                                      stackIn_66_0 = stackOut_57_0;
                                                      stackIn_58_0 = stackOut_57_0;
                                                      if (var15 != 0) {
                                                        break L30;
                                                      } else {
                                                        var13 = stackIn_58_0;
                                                        L32: while (true) {
                                                          L33: {
                                                            L34: {
                                                              if (var13 >= var6) {
                                                                break L34;
                                                              } else {
                                                                var8[var13 * var5 + var12] = var16.d(-249699580);
                                                                var13++;
                                                                if (var15 != 0) {
                                                                  break L33;
                                                                } else {
                                                                  if (var15 == 0) {
                                                                    continue L32;
                                                                  } else {
                                                                    break L34;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var12++;
                                                            break L33;
                                                          }
                                                          if (var15 == 0) {
                                                            continue L29;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_65_0 = var11 & 2 ^ -1;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L30;
                                                }
                                                if (stackIn_66_0 == -1) {
                                                  break L22;
                                                } else {
                                                  var12 = 0;
                                                  L35: while (true) {
                                                    stackOut_68_0 = var12 ^ -1;
                                                    stackOut_68_1 = var5;
                                                    stackOut_68_2 = -1;
                                                    stackIn_69_0 = stackOut_68_0;
                                                    stackIn_69_1 = stackOut_68_1;
                                                    stackIn_69_2 = stackOut_68_2;
                                                    L36: while (true) {
                                                      if (stackIn_69_0 <= (stackIn_69_1 ^ stackIn_69_2)) {
                                                        break L22;
                                                      } else {
                                                        stackOut_70_0 = 0;
                                                        stackIn_35_0 = stackOut_70_0;
                                                        stackIn_71_0 = stackOut_70_0;
                                                        if (var15 != 0) {
                                                          break L20;
                                                        } else {
                                                          var13 = stackIn_71_0;
                                                          L37: while (true) {
                                                            L38: {
                                                              if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                                break L38;
                                                              } else {
                                                                dupTemp$3 = var16.d(-249699580);
                                                                var9[var12 + var5 * var13] = dupTemp$3;
                                                                var14 = dupTemp$3;
                                                                stackOut_73_0 = var10;
                                                                stackOut_73_1 = 0;
                                                                stackOut_73_2 = var14 ^ -1;
                                                                stackIn_69_0 = stackOut_73_0;
                                                                stackIn_69_1 = stackOut_73_1;
                                                                stackIn_69_2 = stackOut_73_2;
                                                                stackIn_74_0 = stackOut_73_0;
                                                                stackIn_74_1 = stackOut_73_1;
                                                                stackIn_74_2 = stackOut_73_2;
                                                                if (var15 != 0) {
                                                                  continue L36;
                                                                } else {
                                                                  L39: {
                                                                    stackOut_74_0 = stackIn_74_0;
                                                                    stackIn_76_0 = stackOut_74_0;
                                                                    stackIn_75_0 = stackOut_74_0;
                                                                    if (stackIn_74_1 == stackIn_74_2) {
                                                                      stackOut_76_0 = stackIn_76_0;
                                                                      stackOut_76_1 = 0;
                                                                      stackIn_77_0 = stackOut_76_0;
                                                                      stackIn_77_1 = stackOut_76_1;
                                                                      break L39;
                                                                    } else {
                                                                      stackOut_75_0 = stackIn_75_0;
                                                                      stackOut_75_1 = 1;
                                                                      stackIn_77_0 = stackOut_75_0;
                                                                      stackIn_77_1 = stackOut_75_1;
                                                                      break L39;
                                                                    }
                                                                  }
                                                                  var10 = stackIn_77_0 | stackIn_77_1;
                                                                  var13++;
                                                                  if (var15 == 0) {
                                                                    continue L37;
                                                                  } else {
                                                                    break L38;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var12++;
                                                            if (var15 == 0) {
                                                              continue L35;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            ll.field_h[var4] = var10 != 0;
                                            var4++;
                                            break L21;
                                          }
                                          if (var15 == 0) {
                                            stackOut_34_0 = var4;
                                            stackIn_35_0 = stackOut_34_0;
                                            break L20;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        stackOut_35_0 = stackIn_35_0;
                                        stackOut_35_1 = qc.field_v;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        continue L18;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L40: {
                                  if (stackIn_30_0 != stackIn_30_1) {
                                    break L40;
                                  } else {
                                    tp.field_t[var4] = 1;
                                    break L40;
                                  }
                                }
                                var4++;
                                if (var15 == 0) {
                                  continue L14;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var17.field_j = 0;
                          var4 = 0;
                          L41: while (true) {
                            stackOut_34_0 = var4;
                            stackIn_35_0 = stackOut_34_0;
                            L42: while (true) {
                              stackOut_35_0 = stackIn_35_0;
                              stackOut_35_1 = qc.field_v;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              if (stackIn_36_0 >= stackIn_36_1) {
                                break L15;
                              } else {
                                var5 = oq.field_w[var4];
                                var6 = vj.field_p[var4];
                                var7 = var6 * var5;
                                var20 = new byte[var7];
                                var18 = var20;
                                var8 = var18;
                                qp.field_t[var4] = var20;
                                var21 = new byte[var7];
                                var19 = var21;
                                var9 = var19;
                                vf.field_b[var4] = var21;
                                var10 = 0;
                                var11 = var17.g(31365);
                                if (var15 != 0) {
                                  break L16;
                                } else {
                                  stackOut_38_0 = -1;
                                  stackOut_38_1 = 1 & var11 ^ -1;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  L43: while (true) {
                                    L44: {
                                      L45: {
                                        L46: {
                                          if (stackIn_40_0 != stackIn_40_1) {
                                            break L46;
                                          } else {
                                            var12 = 0;
                                            L47: while (true) {
                                              L48: {
                                                if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                  break L48;
                                                } else {
                                                  var8[var12] = var16.d(-249699580);
                                                  var12++;
                                                  if (var15 != 0) {
                                                    break L44;
                                                  } else {
                                                    if (var15 == 0) {
                                                      continue L47;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var11 & 2 ^ -1) == -1) {
                                                break L45;
                                              } else {
                                                var12 = 0;
                                                L49: while (true) {
                                                  L50: {
                                                    if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                      break L50;
                                                    } else {
                                                      dupTemp$2 = var16.d(-249699580);
                                                      var9[var12] = dupTemp$2;
                                                      var13 = dupTemp$2;
                                                      stackOut_49_0 = var10;
                                                      stackOut_49_1 = 0;
                                                      stackOut_49_2 = var13 ^ -1;
                                                      stackIn_39_0 = stackOut_49_0;
                                                      stackIn_39_1 = stackOut_49_1;
                                                      stackIn_39_2 = stackOut_49_2;
                                                      stackIn_50_0 = stackOut_49_0;
                                                      stackIn_50_1 = stackOut_49_1;
                                                      stackIn_50_2 = stackOut_49_2;
                                                      if (var15 != 0) {
                                                        stackOut_39_0 = stackIn_39_0;
                                                        stackOut_39_1 = stackIn_39_1 ^ stackIn_39_2;
                                                        stackIn_40_0 = stackOut_39_0;
                                                        stackIn_40_1 = stackOut_39_1;
                                                        continue L43;
                                                      } else {
                                                        L51: {
                                                          stackOut_50_0 = stackIn_50_0;
                                                          stackIn_52_0 = stackOut_50_0;
                                                          stackIn_51_0 = stackOut_50_0;
                                                          if (stackIn_50_1 == stackIn_50_2) {
                                                            stackOut_52_0 = stackIn_52_0;
                                                            stackOut_52_1 = 0;
                                                            stackIn_53_0 = stackOut_52_0;
                                                            stackIn_53_1 = stackOut_52_1;
                                                            break L51;
                                                          } else {
                                                            stackOut_51_0 = stackIn_51_0;
                                                            stackOut_51_1 = 1;
                                                            stackIn_53_0 = stackOut_51_0;
                                                            stackIn_53_1 = stackOut_51_1;
                                                            break L51;
                                                          }
                                                        }
                                                        var10 = stackIn_53_0 | stackIn_53_1;
                                                        var12++;
                                                        if (var15 == 0) {
                                                          continue L49;
                                                        } else {
                                                          break L50;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var15 == 0) {
                                                    break L45;
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 0;
                                        L52: while (true) {
                                          L53: {
                                            L54: {
                                              if ((var5 ^ -1) >= (var12 ^ -1)) {
                                                break L54;
                                              } else {
                                                stackOut_57_0 = 0;
                                                stackIn_66_0 = stackOut_57_0;
                                                stackIn_58_0 = stackOut_57_0;
                                                if (var15 != 0) {
                                                  break L53;
                                                } else {
                                                  var13 = stackIn_58_0;
                                                  L55: while (true) {
                                                    L56: {
                                                      L57: {
                                                        if (var13 >= var6) {
                                                          break L57;
                                                        } else {
                                                          var8[var13 * var5 + var12] = var16.d(-249699580);
                                                          var13++;
                                                          if (var15 != 0) {
                                                            break L56;
                                                          } else {
                                                            if (var15 == 0) {
                                                              continue L55;
                                                            } else {
                                                              break L57;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      break L56;
                                                    }
                                                    if (var15 == 0) {
                                                      continue L52;
                                                    } else {
                                                      break L54;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_65_0 = var11 & 2 ^ -1;
                                            stackIn_66_0 = stackOut_65_0;
                                            break L53;
                                          }
                                          if (stackIn_66_0 == -1) {
                                            break L45;
                                          } else {
                                            var12 = 0;
                                            L58: while (true) {
                                              stackOut_68_0 = var12 ^ -1;
                                              stackOut_68_1 = var5;
                                              stackOut_68_2 = -1;
                                              stackIn_69_0 = stackOut_68_0;
                                              stackIn_69_1 = stackOut_68_1;
                                              stackIn_69_2 = stackOut_68_2;
                                              L59: while (true) {
                                                if (stackIn_69_0 <= (stackIn_69_1 ^ stackIn_69_2)) {
                                                  break L45;
                                                } else {
                                                  stackOut_70_0 = 0;
                                                  stackIn_35_0 = stackOut_70_0;
                                                  stackIn_71_0 = stackOut_70_0;
                                                  if (var15 != 0) {
                                                    continue L42;
                                                  } else {
                                                    var13 = stackIn_71_0;
                                                    L60: while (true) {
                                                      L61: {
                                                        if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                          break L61;
                                                        } else {
                                                          dupTemp$3 = var16.d(-249699580);
                                                          var9[var12 + var5 * var13] = dupTemp$3;
                                                          var14 = dupTemp$3;
                                                          stackOut_73_0 = var10;
                                                          stackOut_73_1 = 0;
                                                          stackOut_73_2 = var14 ^ -1;
                                                          stackIn_69_0 = stackOut_73_0;
                                                          stackIn_69_1 = stackOut_73_1;
                                                          stackIn_69_2 = stackOut_73_2;
                                                          stackIn_74_0 = stackOut_73_0;
                                                          stackIn_74_1 = stackOut_73_1;
                                                          stackIn_74_2 = stackOut_73_2;
                                                          if (var15 != 0) {
                                                            continue L59;
                                                          } else {
                                                            L62: {
                                                              stackOut_74_0 = stackIn_74_0;
                                                              stackIn_76_0 = stackOut_74_0;
                                                              stackIn_75_0 = stackOut_74_0;
                                                              if (stackIn_74_1 == stackIn_74_2) {
                                                                stackOut_76_0 = stackIn_76_0;
                                                                stackOut_76_1 = 0;
                                                                stackIn_77_0 = stackOut_76_0;
                                                                stackIn_77_1 = stackOut_76_1;
                                                                break L62;
                                                              } else {
                                                                stackOut_75_0 = stackIn_75_0;
                                                                stackOut_75_1 = 1;
                                                                stackIn_77_0 = stackOut_75_0;
                                                                stackIn_77_1 = stackOut_75_1;
                                                                break L62;
                                                              }
                                                            }
                                                            var10 = stackIn_77_0 | stackIn_77_1;
                                                            var13++;
                                                            if (var15 == 0) {
                                                              continue L60;
                                                            } else {
                                                              break L61;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      if (var15 == 0) {
                                                        continue L58;
                                                      } else {
                                                        break L45;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      ll.field_h[var4] = var10 != 0;
                                      var4++;
                                      break L44;
                                    }
                                    if (var15 == 0) {
                                      continue L41;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L63: {
            var2 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) (var2);
            stackOut_82_1 = new StringBuilder().append("pd.B(").append(param0).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L63;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L63;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
