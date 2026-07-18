/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_h;
    static volatile boolean field_f;
    static int[] field_c;
    static String field_g;
    static km field_a;
    static bn field_e;
    static int field_d;
    static ta field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ln param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        tl[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        tl var13 = null;
        int var14 = 0;
        int var15 = 0;
        tl[] var16 = null;
        int[] var17 = null;
        tl[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        tl[][] stackIn_31_0 = null;
        tl[][] stackIn_32_0 = null;
        tl[][] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        tl[][] stackOut_30_0 = null;
        tl[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        tl[][] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param4 > param3) {
                L2: {
                  stackOut_30_0 = ba.field_P;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (param3 == -1) {
                    stackOut_32_0 = (tl[][]) (Object) stackIn_32_0;
                    stackOut_32_1 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L2;
                  } else {
                    stackOut_31_0 = (tl[][]) (Object) stackIn_31_0;
                    stackOut_31_1 = 4 + param3;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_33_0[stackIn_33_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (param7) {
                    if (param3 != -1) {
                      var10 = 0;
                      L4: while (true) {
                        L5: {
                          if (var16.length - 1 <= var10) {
                            break L5;
                          } else {
                            if (0 != (fe.field_d[(var10 + param2) / 8] & 1 << (var10 + param2 & 7))) {
                              var9 = 0;
                              break L5;
                            } else {
                              var10++;
                              continue L4;
                            }
                          }
                        }
                        param2 = param2 + (255 & wk.field_e[param3]);
                        break L3;
                      }
                    } else {
                      var10 = 0;
                      L6: while (true) {
                        if (var10 >= wn.field_d.length) {
                          break L3;
                        } else {
                          if ((g.field_f[var10 / 8] & 1 << (var10 & 7)) != 0) {
                            var9 = 0;
                            break L3;
                          } else {
                            var10++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    stackOut_50_0 = var11;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (-1 != param3) {
                      stackOut_52_0 = stackIn_52_0;
                      stackOut_52_1 = -1 + var18.length;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      break L8;
                    } else {
                      stackOut_51_0 = stackIn_51_0;
                      stackOut_51_1 = wn.field_d.length;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_53_1 = stackOut_51_1;
                      break L8;
                    }
                  }
                  if (stackIn_53_0 >= stackIn_53_1) {
                    if (var10 != 0) {
                      break L1;
                    } else {
                      var11 = 0;
                      L9: while (true) {
                        if (var11 >= var18.length + -1) {
                          break L1;
                        } else {
                          L10: {
                            if (param3 != -1) {
                              d.field_Jb[param3] = (byte)var11;
                              break L10;
                            } else {
                              param5 = var11;
                              break L10;
                            }
                          }
                          b.a(param0, -56, param2, param3 + 1, param4, param5, param6, param7);
                          if (!pk.field_g) {
                            var11++;
                            continue L9;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L11: {
                      if (param3 != -1) {
                        d.field_Jb[param3] = (byte)var11;
                        break L11;
                      } else {
                        param5 = var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (param3 != -1) {
                          break L13;
                        } else {
                          if (wn.field_d.length == 1) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8_array[var11 + 1];
                      if (param7) {
                        L14: {
                          if (!var13.field_gb) {
                            if (var9 != 0) {
                              if (var13.field_tb) {
                                stackOut_75_0 = 1;
                                stackIn_77_0 = stackOut_75_0;
                                break L14;
                              } else {
                                stackOut_74_0 = 0;
                                stackIn_77_0 = stackOut_74_0;
                                break L14;
                              }
                            } else {
                              stackOut_72_0 = 0;
                              stackIn_77_0 = stackOut_72_0;
                              break L14;
                            }
                          } else {
                            stackOut_70_0 = 1;
                            stackIn_77_0 = stackOut_70_0;
                            break L14;
                          }
                        }
                        var12 = stackIn_77_0;
                        break L12;
                      } else {
                        L15: {
                          if (param3 == -1) {
                            if (pd.field_Rb.field_hc != wn.field_d[var11]) {
                              stackOut_67_0 = 0;
                              stackIn_68_0 = stackOut_67_0;
                              break L15;
                            } else {
                              stackOut_66_0 = 1;
                              stackIn_68_0 = stackOut_66_0;
                              break L15;
                            }
                          } else {
                            if (var11 != (pd.field_Rb.field_sc[param3] & 255)) {
                              stackOut_64_0 = 0;
                              stackIn_68_0 = stackOut_64_0;
                              break L15;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_68_0 = stackOut_63_0;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_68_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 != 0) {
                        b.a(param0, -43, param2, param3 - -1, param4, param5, param6, param7);
                        var10 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (pk.field_g) {
                      return;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (hd.field_n.length <= var9) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      pk.field_g = true;
                      break L1;
                    }
                  } else {
                    var21 = hd.field_n[var9];
                    var20 = var21;
                    var19 = var20;
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var21.length <= var12) {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (qa.field_e == param3) {
                                break L20;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L21: while (true) {
                            if (var21.length <= var12) {
                              break L19;
                            } else {
                              L22: {
                                var13_int = var21[var12];
                                if (var13_int != -1) {
                                  if (var13_int < param3) {
                                    bi.field_d[var13_int] = true;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                } else {
                                  d.field_Gb = true;
                                  break L22;
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        } else {
                          L23: {
                            var13_int = var21[var12];
                            var14 = var10_ref_int__[var12 - -1];
                            if (var13_int != -1) {
                              L24: {
                                if (var13_int != param3) {
                                  break L24;
                                } else {
                                  if (var14 != param0) {
                                    break L24;
                                  } else {
                                    var11 = 1;
                                    break L23;
                                  }
                                }
                              }
                              if (var13_int >= param3) {
                                break L19;
                              } else {
                                if ((255 & d.field_Jb[var13_int]) != var14) {
                                  break L19;
                                } else {
                                  break L23;
                                }
                              }
                            } else {
                              if (var14 != wn.field_d[param5]) {
                                break L19;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var12 += 2;
                          continue L18;
                        }
                      }
                      var9++;
                      continue L17;
                    }
                  }
                }
              }
            }
            L25: {
              if (param1 <= -40) {
                break L25;
              } else {
                field_c = null;
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) var8;
            stackOut_98_1 = new StringBuilder().append("b.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param6 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L26;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L26;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0) {
        if (null == rm.field_R) {
            return;
        }
        kl.a((java.awt.Canvas) (Object) rm.field_R, (byte) -114);
        rm.field_R.a(oc.field_l, -3);
        rm.field_R = null;
        if (null != ch.field_gb) {
            ch.field_gb.c((byte) -103);
        }
        ja.field_h.requestFocus();
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, byte[] param1) {
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
        p var16 = null;
        p var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            var16 = new p(param1);
            var17 = var16;
            var17.field_l = -2 + param1.length;
            h.field_n = var17.f(674914976);
            wm.field_b = new int[h.field_n];
            a.field_c = new int[h.field_n];
            gg.field_y = new byte[h.field_n][];
            in.field_c = new boolean[h.field_n];
            vk.field_d = new byte[h.field_n][];
            be.field_a = new int[h.field_n];
            field_c = new int[h.field_n];
            var17.field_l = -(8 * h.field_n) + -7 + param1.length;
            cd.field_p = var17.f(674914976);
            ek.field_a = var17.f(674914976);
            var3 = (var17.i(-127) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= h.field_n) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= h.field_n) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= h.field_n) {
                        var4 = 0;
                        L4: while (true) {
                          if (h.field_n <= var4) {
                            var17.field_l = -(h.field_n * 8) + -7 + (param1.length - 3 * (-1 + var3));
                            uh.field_r = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_l = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= h.field_n) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = wm.field_b[var4];
                                      var6 = field_c[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      vk.field_d[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      gg.field_y[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.i(-104);
                                      if ((1 & var11) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.g(0);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_44_0 = var10;
                                                        stackIn_46_0 = stackOut_44_0;
                                                        stackIn_45_0 = stackOut_44_0;
                                                        if (var14 == -1) {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 0;
                                                          stackIn_47_0 = stackOut_46_0;
                                                          stackIn_47_1 = stackOut_46_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 1;
                                                          stackIn_47_0 = stackOut_45_0;
                                                          stackIn_47_1 = stackOut_45_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_47_0 | stackIn_47_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var5 * var13 + var12] = var17.g(0);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var7 <= var12) {
                                            if (0 == (var11 & 2)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.g(0);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_29_0 = var10;
                                                    stackIn_31_0 = stackOut_29_0;
                                                    stackIn_30_0 = stackOut_29_0;
                                                    if (var13 == -1) {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      stackIn_32_1 = stackOut_31_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 1;
                                                      stackIn_32_0 = stackOut_30_0;
                                                      stackIn_32_1 = stackOut_30_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_32_0 | stackIn_32_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.g(0);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    in.field_c[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  uh.field_r[var4] = var17.k(1389913160);
                                  if (uh.field_r[var4] == 0) {
                                    uh.field_r[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            field_c[var4] = var17.f(674914976);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        wm.field_b[var4] = var17.f(674914976);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    a.field_c[var4] = var17.f(674914976);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                be.field_a[var4] = var16.f(674914976);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("b.C(").append(122).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 65) {
                break L2;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (97 > param0) {
                break L3;
              } else {
                if (122 < param0) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = true;
        field_a = null;
        field_h = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_g = "Searching for opponents";
    }
}
