/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qu {
    private double field_f;
    private boolean field_b;
    private double field_h;
    static Object field_j;
    static int field_k;
    private int[] field_g;
    private double field_m;
    private double field_a;
    private int[] field_c;
    private double field_e;
    static float[][] field_i;
    private static int field_l;
    private double field_d;

    private final void b(int param0) {
        RuntimeException var2 = null;
        ha var2_ref = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4_int = 0;
        gw var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] stackIn_21_0 = null;
        int[][] stackIn_23_0 = null;
        int[][] stackIn_25_0 = null;
        int[][] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int[][] stackIn_31_0 = null;
        int[][] stackIn_33_0 = null;
        int[][] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[][] stackIn_39_0 = null;
        int[][] stackIn_41_0 = null;
        int[][] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_20_0 = null;
        int[][] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int[][] stackOut_21_0 = null;
        int[][] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int[][] stackOut_30_0 = null;
        int[][] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[][] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[][] stackOut_38_0 = null;
        int[][] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[][] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_ref = nq.field_h.a(param0 ^ -80);
            if (param0 == 60) {
              L1: {
                L2: {
                  if (0 == lg.field_c % 500) {
                    break L2;
                  } else {
                    if (null == ((qu) this).field_c) {
                      break L2;
                    } else {
                      if (((qu) this).field_g == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                L3: {
                  var3_int = oh.field_e % 6;
                  if (var3_int == -1) {
                    var3_int = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var4_int = (tl.field_t + 1) % bi.field_a[var3_int].length;
                  var5 = (2 + tl.field_t) % bi.field_a[var3_int].length;
                  var6 = bi.field_a[var3_int][tl.field_t];
                  var7 = bi.field_a[var3_int][var4_int];
                  var8 = bi.field_a[var3_int][var5];
                  if (!uk.field_ob) {
                    break L4;
                  } else {
                    L5: {
                      if (2 > kr.field_e) {
                        break L5;
                      } else {
                        L6: {
                          stackOut_20_0 = bi.field_a;
                          stackIn_25_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if ((var3_int - 1) % 6 < 0) {
                            stackOut_25_0 = (int[][]) (Object) stackIn_25_0;
                            stackOut_25_1 = 5;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            break L6;
                          } else {
                            stackOut_21_0 = (int[][]) (Object) stackIn_21_0;
                            stackIn_23_0 = stackOut_21_0;
                            stackOut_23_0 = (int[][]) (Object) stackIn_23_0;
                            stackOut_23_1 = (var3_int + -1) % 6;
                            stackIn_26_0 = stackOut_23_0;
                            stackIn_26_1 = stackOut_23_1;
                            break L6;
                          }
                        }
                        var7 = stackIn_26_0[stackIn_26_1][var4_int];
                        break L5;
                      }
                    }
                    L7: {
                      if (kr.field_e >= 1) {
                        L8: {
                          stackOut_30_0 = bi.field_a;
                          stackIn_33_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (0 > (var3_int - 1) % 6) {
                            stackOut_33_0 = (int[][]) (Object) stackIn_33_0;
                            stackOut_33_1 = 5;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            break L8;
                          } else {
                            stackOut_31_0 = (int[][]) (Object) stackIn_31_0;
                            stackOut_31_1 = (var3_int + -1) % 6;
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_34_1 = stackOut_31_1;
                            break L8;
                          }
                        }
                        var6 = stackIn_34_0[stackIn_34_1][tl.field_t];
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      if (kr.field_e == 3) {
                        L10: {
                          stackOut_38_0 = bi.field_a;
                          stackIn_41_0 = stackOut_38_0;
                          stackIn_39_0 = stackOut_38_0;
                          if (0 > (-1 + var3_int) % 6) {
                            stackOut_41_0 = (int[][]) (Object) stackIn_41_0;
                            stackOut_41_1 = 5;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            break L10;
                          } else {
                            stackOut_39_0 = (int[][]) (Object) stackIn_39_0;
                            stackOut_39_1 = (-1 + var3_int) % 6;
                            stackIn_42_0 = stackOut_39_0;
                            stackIn_42_1 = stackOut_39_1;
                            break L10;
                          }
                        }
                        var8 = stackIn_42_0[stackIn_42_1][var5];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    kr.field_e = kr.field_e - 1;
                    if (kr.field_e <= 0) {
                      uk.field_ob = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                ((qu) this).field_c = nf.a(var6, (byte) -117, 501, var7);
                ((qu) this).field_g = nf.a(var7, (byte) -87, 501, var8);
                tl.field_t = tl.field_t + 1;
                if (~bi.field_a[var3_int].length < ~tl.field_t) {
                  break L1;
                } else {
                  tl.field_t = 0;
                  break L1;
                }
              }
              var3 = nf.a(((qu) this).field_c[lg.field_c % 500], (byte) -118, 480, ((qu) this).field_g[lg.field_c % 500]);
              var4_int = 0;
              L11: while (true) {
                L12: {
                  L13: {
                    L14: {
                      L15: {
                        if (var4_int >= 480) {
                          break L15;
                        } else {
                          var2_ref.a(var3[var4_int] - 16777216, param0 + 23, var4_int, 640, 0);
                          var4_int++;
                          if (var9 != 0) {
                            break L14;
                          } else {
                            if (var9 == 0) {
                              continue L11;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      if (ul.field_f != 0) {
                        break L14;
                      } else {
                        ej.field_i.a((int)((qu) this).field_a, (int)((qu) this).field_f, 0, 1140850688, 1);
                        if (null != ni.field_e) {
                          var4 = (gw) (Object) ni.field_e.b(125);
                          L16: while (true) {
                            if (var4 == null) {
                              break L14;
                            } else {
                              var4.a(var2_ref, -123);
                              var4 = (gw) (Object) ni.field_e.d((byte) 18);
                              if (var9 != 0) {
                                break L13;
                              } else {
                                if (var9 == 0) {
                                  continue L16;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (ul.field_f != 1) {
                      break L13;
                    } else {
                      this.a(24, var2_ref);
                      if (var9 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.b(-109, var2_ref);
                  break L12;
                }
                lg.field_c = lg.field_c + 1;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.I(" + param0 + ')');
        }
    }

    private final void a(int param0, ha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            ml.field_w[2].a(0, 0);
            ml.field_w[3].a(608, 0);
            ml.field_w[0].a(0, 448);
            ml.field_w[1].a(608, 448);
            var3_int = 0;
            var4 = (lg.field_c >> 1) % ok.field_f.length;
            var5 = 32;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var5 >= 608) {
                      break L4;
                    } else {
                      ok.field_f[0].a(var5, 5, 1, var3_int << 24, 1);
                      var4++;
                      ok.field_f[0].a(var5, 440, 1, var3_int << 24, 1);
                      stackOut_3_0 = var4;
                      stackOut_3_1 = ok.field_f.length;
                      stackIn_12_0 = stackOut_3_0;
                      stackIn_12_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var6 != 0) {
                        L5: while (true) {
                          if (stackIn_12_0 >= stackIn_12_1) {
                            break L3;
                          } else {
                            ff.field_k[0].a(9, -16 + var5, 1, var3_int << 24, 1);
                            ff.field_k[0].a(598, var5 - 16, 1, var3_int << 24, 1);
                            var4++;
                            stackOut_13_0 = ~ok.field_f.length;
                            stackOut_13_1 = ~var4;
                            stackIn_23_0 = stackOut_13_0;
                            stackIn_23_1 = stackOut_13_1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            if (var6 != 0) {
                              break L2;
                            } else {
                              stackOut_14_0 = stackIn_14_0;
                              stackOut_14_1 = stackIn_14_1;
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_16_1 = stackOut_14_1;
                              L6: {
                                if (stackIn_16_0 == stackIn_16_1) {
                                  var4 = 0;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var5 = var5 + ok.field_f[0].c();
                              if (var6 == 0) {
                                stackOut_11_0 = -449;
                                stackOut_11_1 = ~var5;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                continue L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_4_0 == stackIn_4_1) {
                            var4 = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var5 = var5 + ok.field_f[0].c();
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = 48;
                  L8: while (true) {
                    stackOut_11_0 = -449;
                    stackOut_11_1 = ~var5;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (stackIn_12_0 >= stackIn_12_1) {
                      break L3;
                    } else {
                      ff.field_k[0].a(9, -16 + var5, 1, var3_int << 24, 1);
                      ff.field_k[0].a(598, var5 - 16, 1, var3_int << 24, 1);
                      var4++;
                      stackOut_13_0 = ~ok.field_f.length;
                      stackOut_13_1 = ~var4;
                      stackIn_23_0 = stackOut_13_0;
                      stackIn_23_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        L9: {
                          if (stackIn_16_0 == stackIn_16_1) {
                            var4 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var5 = var5 + ok.field_f[0].c();
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = param0;
                stackOut_22_1 = 24;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L2;
              }
              L10: {
                if (stackIn_23_0 == stackIn_23_1) {
                  break L10;
                } else {
                  this.f(-88);
                  break L10;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("qu.H(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final void a(int param0, ha param1, boolean param2) {
        RuntimeException var4 = null;
        nm var4_ref = null;
        int var4_int = 0;
        tl var4_ref2 = null;
        to var4_ref3 = null;
        nt var4_ref4 = null;
        ah var5 = null;
        int var6 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_34_0 = 0;
        to stackIn_44_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        to stackOut_43_0 = null;
        ms stackOut_53_0 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  param1.GA(0);
                  this.b(60);
                  if (null == is.field_c) {
                    break L3;
                  } else {
                    var4_ref = (nm) (Object) is.field_c.b(-81);
                    L4: while (true) {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        var4_ref.a(param1, -15687169);
                        var4_ref = (nm) (Object) is.field_c.d((byte) 18);
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                if (aa.field_a == null) {
                  break L2;
                } else {
                  var4_int = 0;
                  L5: while (true) {
                    if (~var4_int <= ~aa.field_a.length) {
                      break L2;
                    } else {
                      var5 = aa.field_a[var4_int];
                      stackOut_11_0 = null;
                      stackIn_20_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        L6: {
                          if (stackIn_12_0 != (Object) (Object) var5) {
                            var5.a(param1, 19399);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var4_int++;
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = null;
              stackIn_20_0 = stackOut_19_0;
              break L1;
            }
            L7: {
              L8: {
                L9: {
                  if (stackIn_20_0 == (Object) (Object) bj.field_b) {
                    break L9;
                  } else {
                    var4_ref2 = (tl) (Object) bj.field_b.b(-90);
                    L10: while (true) {
                      if (var4_ref2 == null) {
                        break L9;
                      } else {
                        var4_ref2.a(-62, param1);
                        var4_ref2 = (tl) (Object) bj.field_b.d((byte) 18);
                        if (var6 != 0) {
                          break L8;
                        } else {
                          if (var6 == 0) {
                            continue L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                if (60 > fa.field_b) {
                  break L8;
                } else {
                  break L7;
                }
              }
              L11: {
                if (fa.field_b <= 30) {
                  stackOut_33_0 = fa.field_b;
                  stackIn_34_0 = stackOut_33_0;
                  break L11;
                } else {
                  stackOut_31_0 = 30;
                  stackIn_34_0 = stackOut_31_0;
                  break L11;
                }
              }
              L12: {
                var4_int = stackIn_34_0;
                if (0 != ul.field_f) {
                  break L12;
                } else {
                  ng.field_f[1].a((float)(64 + (ua.field_d >> 8)), (float)(field_l >> 8), 4096, 0, 1, 0, 2);
                  ng.field_f[1].a((float)((ua.field_d >> 8) + -64), (float)(field_l >> 8), 4096, 32768, 1, 0, 2);
                  ng.field_f[1].a((float)(ua.field_d >> 8), (float)((field_l >> 8) + 64), 4096, 49152, 1, 0, 2);
                  ng.field_f[1].a((float)(ua.field_d >> 8), (float)(-64 + (field_l >> 8)), 4096, 16384, 1, 0, 2);
                  ng.field_f[0].a((float)(ua.field_d >> 8), (float)(field_l >> 8), (int)((double)var4_int * 97.52380952380952), 0, 1, 0, 2);
                  if (var6 == 0) {
                    break L7;
                  } else {
                    break L12;
                  }
                }
              }
              pn.field_t.a((ua.field_d >> 8) + -(pn.field_t.c() >> 1), (field_l >> 8) - (pn.field_t.a() >> 1), 1, 0, 2);
              break L7;
            }
            L13: {
              L14: {
                L15: {
                  L16: {
                    if (td.field_m) {
                      break L16;
                    } else {
                      var4_ref3 = (to) (Object) ig.field_b.b(-59);
                      L17: while (true) {
                        if (var4_ref3 == null) {
                          break L16;
                        } else {
                          stackOut_43_0 = (to) var4_ref3;
                          stackIn_54_0 = (Object) (Object) stackOut_43_0;
                          stackIn_44_0 = stackOut_43_0;
                          if (var6 != 0) {
                            break L15;
                          } else {
                            L18: {
                              if (stackIn_44_0 != null) {
                                var4_ref3.a((byte) -70);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var4_ref3 = (to) (Object) ig.field_b.d((byte) 18);
                            if (var6 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (rc.field_m != null) {
                    stackOut_53_0 = rc.field_m.b(-84);
                    stackIn_54_0 = (Object) (Object) stackOut_53_0;
                    break L15;
                  } else {
                    break L14;
                  }
                }
                var4_ref4 = (nt) (Object) stackIn_54_0;
                L19: while (true) {
                  if (null == var4_ref4) {
                    break L14;
                  } else {
                    var4_ref4.a(param1, -127);
                    var4_ref4 = (nt) (Object) rc.field_m.d((byte) 18);
                    if (var6 != 0) {
                      break L13;
                    } else {
                      if (var6 == 0) {
                        continue L19;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
              }
              this.a((byte) -106, param1);
              uc.a(param1, false);
              break L13;
            }
            L20: {
              if (param0 >= 117) {
                break L20;
              } else {
                this.a(6, 60, (String) null);
                break L20;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var4;
            stackOut_65_1 = new StringBuilder().append("qu.S(").append(param0).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L21;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param2 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        cb var3 = null;
        nm var4 = null;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_19_0 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = new cb(is.field_c);
            if (param0 >= 59) {
              var4 = (nm) (Object) var3.b((byte) -80);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      var4.a(1048149637);
                      stackOut_5_0 = 0;
                      stackIn_20_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        var5 = stackIn_6_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (~var5 <= ~aa.field_a.length) {
                                break L6;
                              } else {
                                var6 = aa.field_a[var5];
                                if (var7 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (null == var6) {
                                      break L7;
                                    } else {
                                      if (!var4.c(var6, 2145812808)) {
                                        break L7;
                                      } else {
                                        var2_int = 1;
                                        var4.b(var6, 16776960);
                                        break L7;
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4 = (nm) (Object) var3.b(0);
                            break L5;
                          }
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_19_0 = var2_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                L8: {
                  if (stackIn_20_0 == 0) {
                    mb.field_b = -1;
                    lf.b((byte) -128);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "qu.P(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        try {
            po.field_a = false;
            if (param0 != 112) {
                field_i = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qu.O(" + param0 + ')');
        }
    }

    final static void a(int param0, gk param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        RuntimeException var8 = null;
        gk var8_ref = null;
        int[] var8_array = null;
        int[] var9 = null;
        byte[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        l var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_26_0 = null;
        int[] stackIn_28_0 = null;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        l stackIn_64_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int[] stackOut_25_0 = null;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_30_0 = 0;
        short stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        short stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        short stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        l stackOut_63_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var40 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var8_ref = param1;
                if (null == var8_ref.field_a) {
                  break L2;
                } else {
                  if (var8_ref.field_E <= 1) {
                    break L2;
                  } else {
                    var9_array = var8_ref.field_a;
                    za.a(var9_array, cv.field_G, 0, 0, 0);
                    if (var40 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              vf.a(0);
              break L1;
            }
            if (param6 < -1) {
              var8_array = new int[param1.field_c];
              var9 = new int[param1.field_c];
              var10 = of.field_t;
              var11 = r.field_r;
              var12 = qr.field_d;
              var13 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var13 >= param1.field_c) {
                      break L5;
                    } else {
                      var14 = param4 * var12[var13] + (param0 * var10[var13] + var11[var13] * param7) >> 8;
                      stackOut_12_0 = var14;
                      stackIn_31_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var40 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_13_0 >= 0) {
                            break L6;
                          } else {
                            var14 = -var14;
                            break L6;
                          }
                        }
                        L7: {
                          if (0 > var14) {
                            stackOut_24_0 = 128;
                            stackIn_25_0 = stackOut_24_0;
                            break L7;
                          } else {
                            if (var14 >= 128) {
                              stackOut_23_0 = 256;
                              stackIn_25_0 = stackOut_23_0;
                              break L7;
                            } else {
                              stackOut_21_0 = var14 + 128;
                              stackIn_25_0 = stackOut_21_0;
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var14 = stackIn_25_0;
                          var15 = param3 * var10[var13] + (var11[var13] * param5 - -(var12[var13] * param2)) >> 8;
                          stackOut_25_0 = sq.field_a;
                          stackIn_28_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (var15 < 0) {
                            stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                            stackOut_28_1 = -var15;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            break L8;
                          } else {
                            stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                            stackOut_26_1 = var15;
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_29_1 = stackOut_26_1;
                            break L8;
                          }
                        }
                        var15 = stackIn_29_0[stackIn_29_1];
                        var14 = var14 * (256 + -var15) >>> 8;
                        var8_array[var13] = var14;
                        var9[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L4;
                }
                var13 = stackIn_31_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (sv.field_b <= var13) {
                        break L11;
                      } else {
                        var14 = Sumoblitz.field_G[var13];
                        var15 = param1.field_A[var14];
                        var16 = param1.field_b[var14];
                        var17 = param1.field_l[var14];
                        if (var40 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (param1.field_e[var14] < of.field_t.length) {
                              stackOut_39_0 = param1.field_e[var14];
                              stackIn_40_0 = stackOut_39_0;
                              break L12;
                            } else {
                              stackOut_37_0 = -1;
                              stackIn_40_0 = stackOut_37_0;
                              break L12;
                            }
                          }
                          L13: {
                            var18 = stackIn_40_0;
                            if (~param1.field_k[var14] > ~of.field_t.length) {
                              stackOut_43_0 = param1.field_k[var14];
                              stackIn_44_0 = stackOut_43_0;
                              break L13;
                            } else {
                              stackOut_41_0 = -1;
                              stackIn_44_0 = stackOut_41_0;
                              break L13;
                            }
                          }
                          L14: {
                            var19 = stackIn_44_0;
                            if (~param1.field_h[var14] > ~of.field_t.length) {
                              stackOut_47_0 = param1.field_h[var14];
                              stackIn_48_0 = stackOut_47_0;
                              break L14;
                            } else {
                              stackOut_45_0 = -1;
                              stackIn_48_0 = stackOut_45_0;
                              break L14;
                            }
                          }
                          L15: {
                            L16: {
                              var20 = stackIn_48_0;
                              if (au.field_i == null) {
                                break L16;
                              } else {
                                if (param1.field_K == null) {
                                  break L16;
                                } else {
                                  if (var14 >= param1.field_K.length) {
                                    break L16;
                                  } else {
                                    if (param1.field_K[var14] == -1) {
                                      break L16;
                                    } else {
                                      if (~au.field_i.length < ~param1.field_K[var14]) {
                                        stackOut_63_0 = au.field_i[param1.field_K[var14]];
                                        stackIn_64_0 = stackOut_63_0;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_61_0 = null;
                            stackIn_64_0 = (l) (Object) stackOut_61_0;
                            break L15;
                          }
                          L17: {
                            L18: {
                              var21_ref = stackIn_64_0;
                              var22 = we.field_z[var15];
                              var23 = hp.field_o[var15];
                              var24 = we.field_z[var16];
                              var25 = hp.field_o[var16];
                              var26 = we.field_z[var17];
                              var27 = hp.field_o[var17];
                              if (var19 != var18) {
                                break L18;
                              } else {
                                if (var20 != var19) {
                                  break L18;
                                } else {
                                  L19: {
                                    var28 = var8_array[var18];
                                    var29 = var9[var18];
                                    if (null == var21_ref) {
                                      stackOut_71_0 = 8355711;
                                      stackIn_72_0 = stackOut_71_0;
                                      break L19;
                                    } else {
                                      stackOut_69_0 = var21_ref.field_b;
                                      stackIn_72_0 = stackOut_69_0;
                                      break L19;
                                    }
                                  }
                                  var30 = stackIn_72_0;
                                  var31 = 16711935 & var30;
                                  var32 = 65280 & var30;
                                  var33 = (-16711696 & var31 * var28) >>> 8 | (16711739 & var28 * var32) >>> 8;
                                  var33 = var33 + var29 * 65793;
                                  sd.a(var24, 8355711 & var33 >> 1, var27, (byte) 27, var25, var23, var26, var22);
                                  if (var40 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            L20: {
                              var28 = var8_array[var18];
                              var29 = var8_array[var19];
                              var30 = var8_array[var20];
                              var31 = var9[var18];
                              var32 = var9[var19];
                              var33 = var9[var20];
                              if (null != var21_ref) {
                                stackOut_76_0 = var21_ref.field_b;
                                stackIn_77_0 = stackOut_76_0;
                                break L20;
                              } else {
                                stackOut_74_0 = 8355711;
                                stackIn_77_0 = stackOut_74_0;
                                break L20;
                              }
                            }
                            var34 = stackIn_77_0;
                            var35 = 16711935 & var34;
                            var36 = 65280 & var34;
                            var37 = (-16711691 & var35 * var28) >>> 8 | -1862205696 & var28 * var36 >>> 8;
                            var38 = (16711795 & var29 * var36) >>> 8 | var29 * var35 >>> 8 & 1711210751;
                            var38 = var38 + var32 * 65793;
                            var37 = var37 + 65793 * var31;
                            var39 = (16711933 & var30 * var36) >>> 8 | (var35 * var30 & -16711934) >>> 8;
                            var39 = var39 + var33 * 65793;
                            hi.a(var26, var39 >> 16, var27, (byte) 27, 255 & var37, var22, var38 >> 16, (var39 & 65340) >> 8, var25, var37 >> 16, (65513 & var38) >> 8, var39 & 255, var23, var38 & 255, (65436 & var37) >> 8, var24);
                            break L17;
                          }
                          var13++;
                          if (var40 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    break L10;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var8;
            stackOut_80_1 = new StringBuilder().append("qu.T(").append(param0).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param1 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L21;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L21;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void f(byte param0) {
        RuntimeException runtimeException = null;
        gw var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_10_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (gw) (Object) ni.field_e.b(-68);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.a(-2567);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var2.b(false);
                          break L4;
                        }
                      }
                      var2 = (gw) (Object) ni.field_e.d((byte) 18);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = 61 / ((-13 - param0) / 54);
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              var3 = stackIn_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "qu.F(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        ah var2_ref = null;
        tl var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_ref = aa.field_a[0];
            var3 = (tl) (Object) bj.field_b.b(param0 + 14762);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    var3.c(param0 + -16401);
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null == var2_ref) {
                          break L4;
                        } else {
                          var4 = var2_ref.field_m - -var3.a(-127);
                          if (!wn.a(var2_ref.field_z, var4, -127, var3.c((byte) 70), var2_ref.field_C, var3.d(param0 ^ 14936))) {
                            break L4;
                          } else {
                            if (var3.g(0)) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  var2_ref.a((byte) 88, var3);
                                  gn.a(27, true);
                                  if (2 != var3.field_n) {
                                    break L6;
                                  } else {
                                    b.field_c = true;
                                    rn.a(ee.field_a[2] + "+", var2_ref.field_C >> 8, var2_ref.field_z >> 8, 16732416, 28807);
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (var3.field_n == 0) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var3.field_n != 1) {
                                        break L8;
                                      } else {
                                        cl.field_w = true;
                                        rn.a(ee.field_a[1] + "+", var2_ref.field_C >> 8, var2_ref.field_z >> 8, 12714108, param0 + 43661);
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (3 == var3.field_n) {
                                        break L9;
                                      } else {
                                        if (4 != var3.field_n) {
                                          break L5;
                                        } else {
                                          cl.field_w = true;
                                          rn.a(ee.field_a[4], var2_ref.field_C >> 8, var2_ref.field_z >> 8, 44031, param0 + 43661);
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    cl.field_w = true;
                                    rn.a(ee.field_a[3], var2_ref.field_C >> 8, var2_ref.field_z >> 8, 16711680, 28807);
                                    if (var5 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                hl.field_e = true;
                                rn.a(ee.field_a[0] + "+", var2_ref.field_C >> 8, var2_ref.field_z >> 8, 32780, 28807);
                                break L5;
                              }
                              vb.field_E = true;
                              var3.b(false);
                              break L4;
                            }
                          }
                        }
                      }
                      L10: {
                        if (var3.field_q > 0) {
                          break L10;
                        } else {
                          var3.b(false);
                          break L10;
                        }
                      }
                      var3 = (tl) (Object) bj.field_b.d((byte) 18);
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -14854) {
                  break L2;
                } else {
                  field_k = -94;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.E(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (tg.field_a == 13) {
                po.field_a = true;
                av.a(-7753, false, 1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!td.field_m) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 <= -68) {
                break L3;
              } else {
                field_k = -6;
                break L3;
              }
            }
            if (ku.field_j < 2) {
              return;
            } else {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            var2_int = tg.field_a;
                            if (var2_int == 13) {
                              break L10;
                            } else {
                              L11: {
                                if (var2_int != 35) {
                                  break L11;
                                } else {
                                  if (var3 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var2_int == 34) {
                                break L4;
                              } else {
                                L12: {
                                  if (var2_int != 56) {
                                    break L12;
                                  } else {
                                    if (var3 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (12 == var2_int) {
                                  break L8;
                                } else {
                                  if (11 == var2_int) {
                                    break L7;
                                  } else {
                                    if (var2_int == 10) {
                                      break L6;
                                    } else {
                                      if (var2_int != 9) {
                                        break L4;
                                      } else {
                                        if (var3 == 0) {
                                          break L5;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L13: {
                            if (!hw.field_b[81]) {
                              break L13;
                            } else {
                              gg.a((byte) 125);
                              break L13;
                            }
                          }
                          f.field_w = true;
                          if (var3 == 0) {
                            break L4;
                          } else {
                            break L9;
                          }
                        }
                        nd.field_F = nd.field_F + 1;
                        f.field_w = true;
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                      aa.field_a[0].a(-42, 2);
                      f.field_w = true;
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                    aa.field_a[0].a(-34, 1);
                    f.field_w = true;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  aa.field_a[0].a(-32, 0);
                  f.field_w = true;
                  if (var3 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                o.a(0);
                gg.a((byte) 87);
                f.field_w = true;
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.J(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_j = null;
            field_i = null;
            if (param0 <= 33) {
                field_i = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qu.L(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -120) {
                break L1;
              } else {
                this.a(109, (ha) null);
                break L1;
              }
            }
            hb.field_a = null;
            ig.field_b.e(116);
            in.field_z = 0;
            f.field_w = false;
            fb.field_a = 0;
            ha.field_f = 0;
            ts.field_a = 0;
            wj.field_e = 0;
            iw.field_b = 0;
            kn.field_b = 0;
            te.field_c = 0;
            tc.e(101);
            ct.b(true);
            gt.field_bb = true;
            td.field_m = false;
            ((qu) this).c((byte) 112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.G(" + param0 + ')');
        }
    }

    private final void b(int param0, ha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            an.field_f.a(26.0f, 26.0f, 4915, 0);
            ju.field_p[0].a(16.0f, 16.0f, 4096, -16384);
            ju.field_p[1].a(16.0f, 16.0f, 4096, -16384);
            an.field_f.a(616.0f, 26.0f, 4915, 0);
            ju.field_p[0].a(624.0f, 16.0f, 4096, 32768);
            ju.field_p[1].a(624.0f, 16.0f, 4096, 32768);
            an.field_f.a(26.0f, 454.0f, 4915, 0);
            ju.field_p[0].a(16.0f, 464.0f, 4096, 0);
            ju.field_p[1].a(16.0f, 464.0f, 4096, 0);
            an.field_f.a(614.0f, 454.0f, 4915, 0);
            ju.field_p[0].a(624.0f, 464.0f, 4096, 16384);
            ju.field_p[1].a(624.0f, 464.0f, 4096, 16384);
            var3_int = 0;
            var4 = (lg.field_c >> 1) % ok.field_f.length;
            var5 = 32;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= 608) {
                    break L3;
                  } else {
                    stackOut_3_0 = -256;
                    stackOut_3_1 = ~(((var4 << 3) + (lg.field_c << 2)) % 512);
                    stackIn_24_0 = stackOut_3_0;
                    stackIn_24_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= stackIn_4_1) {
                          stackOut_9_0 = ((var4 << 3) + (lg.field_c << 2)) % 512;
                          stackIn_10_0 = stackOut_9_0;
                          break L4;
                        } else {
                          stackOut_7_0 = 512 - ((var4 << 3) + (lg.field_c << 2)) % 512;
                          stackIn_10_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                      L5: {
                        var3_int = stackIn_10_0;
                        if (var3_int > 240) {
                          var3_int = 240;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var3_int < 20) {
                          var3_int = 20;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        ok.field_f[0].a((float)(var5 + 16), 25.0f, 4096, 0, 3, var3_int << 24, 1);
                        var4++;
                        ok.field_f[0].a((float)(var5 - -16), 454.0f, 4096, 0, 3, var3_int << 24, 1);
                        if (~ok.field_f.length == ~var4) {
                          var4 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var5 = var5 + ok.field_f[0].c();
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_23_0 = param0;
                stackOut_23_1 = -76;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L2;
              }
              L8: {
                if (stackIn_24_0 < stackIn_24_1) {
                  break L8;
                } else {
                  qu.a(84, (gk) null, -85, 57, -45, 101, (byte) 84, -26);
                  break L8;
                }
              }
              var5 = 48;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var5 >= 448) {
                      break L11;
                    } else {
                      if (var6 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (255 < ((var4 << 3) + (lg.field_c << 2)) % 512) {
                            stackOut_35_0 = -(((var4 << 3) + (lg.field_c << 2)) % 512) + 512;
                            stackIn_36_0 = stackOut_35_0;
                            break L12;
                          } else {
                            stackOut_33_0 = ((lg.field_c << 2) + (var4 << 3)) % 512;
                            stackIn_36_0 = stackOut_33_0;
                            break L12;
                          }
                        }
                        L13: {
                          var3_int = stackIn_36_0;
                          if (240 < var3_int) {
                            var3_int = 240;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (var3_int < 20) {
                            var3_int = 20;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          ok.field_f[0].a(25.0f, (float)var5, 4096, 16384, 3, var3_int << 24, 1);
                          var4++;
                          ok.field_f[0].a(614.0f, (float)var5, 4096, 16384, 3, var3_int << 24, 1);
                          if (ok.field_f.length != var4) {
                            break L15;
                          } else {
                            var4 = 0;
                            break L15;
                          }
                        }
                        var5 = var5 + ok.field_f[0].c();
                        if (var6 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  break L10;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var3;
            stackOut_48_1 = new StringBuilder().append("qu.N(").append(param0).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L16;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        nt var3 = null;
        to var3_ref = null;
        ah var3_ref2 = null;
        int var4_int = 0;
        ah var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_109_0 = false;
        int stackIn_115_0 = 0;
        Object stackIn_127_0 = null;
        ah stackIn_127_1 = null;
        int stackIn_159_0 = 0;
        int stackIn_170_0 = 0;
        Object stackIn_241_0 = null;
        ah stackIn_241_1 = null;
        boolean stackOut_17_0 = false;
        boolean stackOut_22_0 = false;
        boolean stackOut_108_0 = false;
        int stackOut_114_0 = 0;
        Object stackOut_126_0 = null;
        ah stackOut_126_1 = null;
        int stackOut_158_0 = 0;
        int stackOut_169_0 = 0;
        Object stackOut_240_0 = null;
        ah stackOut_240_1 = null;
        L0: {
          L1: {
            var6 = Sumoblitz.field_L ? 1 : 0;
            if (!param0) {
              break L1;
            } else {
              L2: while (true) {
                if (!wd.c(-112)) {
                  break L1;
                } else {
                  this.d((byte) -122);
                  if (var6 != 0) {
                    break L0;
                  } else {
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L3: {
            if (ul.field_f != 0) {
              break L3;
            } else {
              this.c(2500);
              break L3;
            }
          }
          ((qu) this).field_f = ((qu) this).field_f + ((qu) this).field_d;
          ((qu) this).field_a = ((qu) this).field_a + ((qu) this).field_e;
          break L0;
        }
        L4: {
          if (null == ni.field_e) {
            break L4;
          } else {
            if (ul.field_f == 0) {
              this.f((byte) 55);
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          L6: {
            if (null == rc.field_m) {
              break L6;
            } else {
              var3 = (nt) (Object) rc.field_m.b(95);
              L7: while (true) {
                if (null == var3) {
                  break L6;
                } else {
                  stackOut_17_0 = var3.a(-2567);
                  stackIn_23_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var6 != 0) {
                    break L5;
                  } else {
                    L8: {
                      if (!stackIn_18_0) {
                        break L8;
                      } else {
                        var3.b(false);
                        break L8;
                      }
                    }
                    var3 = (nt) (Object) rc.field_m.d((byte) 18);
                    if (var6 == 0) {
                      continue L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
          }
          stackOut_22_0 = po.field_a;
          stackIn_23_0 = stackOut_22_0;
          break L5;
        }
        if (stackIn_23_0) {
          return;
        } else {
          if (!ld.field_N.a(false)) {
            if (!cd.a(false)) {
              L9: {
                if (param1 < -65) {
                  break L9;
                } else {
                  this.a(-55, (ha) null);
                  break L9;
                }
              }
              L10: {
                if (iw.field_b - uc.field_f != 100) {
                  break L10;
                } else {
                  if (td.field_m) {
                    break L10;
                  } else {
                    if (gt.field_bb) {
                      break L10;
                    } else {
                      sj.a(-1, an.field_a, oh.field_e);
                      break L10;
                    }
                  }
                }
              }
              L11: {
                if (nd.field_F > 0) {
                  L12: {
                    ts.field_a = ts.field_a + 8;
                    ha.field_f = ha.field_f + 10;
                    fb.field_a = fb.field_a - 5;
                    kn.field_b = kn.field_b - 3;
                    iw.field_b = iw.field_b + 1;
                    if (gj.a((byte) -84, 10) < 5) {
                      break L12;
                    } else {
                      L13: {
                        if (5 > gj.a((byte) -84, 10)) {
                          break L13;
                        } else {
                          kn.field_b = kn.field_b + 1;
                          if (var6 == 0) {
                            break L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                      ts.field_a = ts.field_a + 1;
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (gj.a((byte) -84, 10) < 5) {
                      break L14;
                    } else {
                      fb.field_a = fb.field_a - 1;
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ha.field_f = ha.field_f - 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L15: {
                td.c((byte) 77);
                if (iw.field_b == uc.field_f) {
                  break L15;
                } else {
                  if ((iw.field_b - uc.field_f) % 50 != 0) {
                    break L15;
                  } else {
                    if (!aj.field_C) {
                      aj.field_C = ig.b(114);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              if (td.field_m) {
                return;
              } else {
                L16: {
                  qv.a(2);
                  if (is.field_c != null) {
                    this.e((byte) 111);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    this.d(-112);
                    if (gt.field_ab > 0) {
                      break L18;
                    } else {
                      tl.field_v = 0;
                      if (var6 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  gt.field_ab = gt.field_ab - 1;
                  if (tl.field_v >= ps.field_e[11]) {
                    th.b(24753, 244, 11);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L19: {
                  if (aa.field_a[0] == null) {
                    break L19;
                  } else {
                    L20: {
                      if (6 <= oh.field_e) {
                        break L20;
                      } else {
                        if (wm.field_f[6]) {
                          break L20;
                        } else {
                          if (gt.field_bb) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (fa.field_b <= 0) {
                          break L22;
                        } else {
                          if (30 < fa.field_b) {
                            break L22;
                          } else {
                            fa.field_b = fa.field_b - 1;
                            if (var6 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      L23: {
                        var3_ref2 = aa.field_a[0];
                        if (fa.field_b > 0) {
                          break L23;
                        } else {
                          if (var3_ref2.g(126)) {
                            break L23;
                          } else {
                            L24: {
                              if (wn.a(field_l, var3_ref2.field_m, -105, var3_ref2.field_C, ua.field_d, var3_ref2.field_z)) {
                                L25: {
                                  ro.a(var3_ref2, (byte) 113);
                                  if (ul.field_f != 0) {
                                    break L25;
                                  } else {
                                    rc.field_m.a((ms) (Object) new fi(ua.field_d, field_l, -1), (byte) 39);
                                    break L25;
                                  }
                                }
                                gn.a(30, true);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            fa.field_b = 250;
                            break L23;
                          }
                        }
                      }
                      field_l = var3_ref2.field_z;
                      ua.field_d = var3_ref2.field_C;
                      fa.field_b = fa.field_b - 1;
                      break L21;
                    }
                    L26: {
                      if (fa.field_b == 30) {
                        if (0 == ul.field_f) {
                          rc.field_m.a((ms) (Object) new gb(ua.field_d, field_l, -1), (byte) 39);
                          break L26;
                        } else {
                          break L26;
                        }
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (30 != fa.field_b) {
                        break L27;
                      } else {
                        gn.a(32, true);
                        break L27;
                      }
                    }
                    if (fa.field_b == 30) {
                      gd.a(10, field_l, rc.field_m, 61, ua.field_d, 16711680);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
                var3_ref = (to) (Object) ig.field_b.b(111);
                L28: while (true) {
                  L29: {
                    L30: {
                      if (null == var3_ref) {
                        break L30;
                      } else {
                        stackOut_108_0 = var3_ref.a(80);
                        stackIn_115_0 = stackOut_108_0 ? 1 : 0;
                        stackIn_109_0 = stackOut_108_0;
                        if (var6 != 0) {
                          break L29;
                        } else {
                          L31: {
                            if (stackIn_109_0) {
                              var3_ref.b(false);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          var3_ref = (to) (Object) ig.field_b.d((byte) 18);
                          if (var6 == 0) {
                            continue L28;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    stackOut_114_0 = ~an.field_a;
                    stackIn_115_0 = stackOut_114_0;
                    break L29;
                  }
                  L32: {
                    if (stackIn_115_0 != -1) {
                      L33: {
                        if (-sr.field_b + iw.field_b != 5) {
                          break L33;
                        } else {
                          rn.a(ff.field_m, 320, 240, 16755456, 28807);
                          if (var6 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if (10 != -sr.field_b + iw.field_b) {
                        break L32;
                      } else {
                        rn.a(ff.field_m, 320, 255, 16776960, 28807);
                        break L32;
                      }
                    } else {
                      break L32;
                    }
                  }
                  L34: {
                    L35: {
                      L36: {
                        if (!ok.field_b) {
                          break L36;
                        } else {
                          var4_int = 4;
                          var5 = 0;
                          L37: while (true) {
                            L38: {
                              if (var5 >= db.field_l) {
                                break L38;
                              } else {
                                stackOut_126_0 = null;
                                stackOut_126_1 = aa.field_a[var5];
                                stackIn_241_0 = stackOut_126_0;
                                stackIn_241_1 = stackOut_126_1;
                                stackIn_127_0 = stackOut_126_0;
                                stackIn_127_1 = stackOut_126_1;
                                if (var6 != 0) {
                                  break L34;
                                } else {
                                  L39: {
                                    if (stackIn_127_0 != (Object) (Object) stackIn_127_1) {
                                      var4_int--;
                                      break L39;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                            }
                            L40: while (true) {
                              int incrementValue$2 = var4_int;
                              var4_int--;
                              if (incrementValue$2 <= 0) {
                                break L36;
                              } else {
                                oc.a(uj.a(Math.max(7, fi.a((int)(Math.log((double)in.field_z) / Math.log(10.0)), ki.field_b, (byte) -96)), fi.a(588, ki.field_b, (byte) -96) + 26 << 8, 0, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 8), false);
                                if (var6 != 0) {
                                  break L35;
                                } else {
                                  if (var6 == 0) {
                                    continue L40;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      wj.d(22403);
                      break L35;
                    }
                    L41: {
                      if (!param0) {
                        break L41;
                      } else {
                        if (null == aa.field_a[0]) {
                          break L41;
                        } else {
                          ub.a(20);
                          break L41;
                        }
                      }
                    }
                    L42: {
                      if (!kp.field_a) {
                        break L42;
                      } else {
                        km.a((byte) 32);
                        break L42;
                      }
                    }
                    L43: {
                      L44: {
                        er.c((byte) 54);
                        if (!gt.field_bb) {
                          break L44;
                        } else {
                          if (0 != iw.field_b % 250) {
                            break L43;
                          } else {
                            if (~jc.b(true) > ~(aa.field_a.length + -1)) {
                              var4 = uj.a(1, fi.a(588, ki.field_b, (byte) -96) + 26 << 8, 4, (byte) 84, 26 + fi.a(428, ki.field_b, (byte) -96) << 8);
                              oc.a(var4, false);
                              if (var6 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      L45: {
                        if (aa.field_a[0] == null) {
                          break L45;
                        } else {
                          if (ku.field_J.length <= an.field_a) {
                            break L45;
                          } else {
                            if (an.field_a == -1) {
                              break L45;
                            } else {
                              var4_int = ku.field_J[an.field_a].a(0) + 3 >> 2;
                              var5 = 0;
                              L46: while (true) {
                                L47: {
                                  L48: {
                                    if (~db.field_l >= ~var5) {
                                      break L48;
                                    } else {
                                      stackOut_158_0 = var5;
                                      stackIn_170_0 = stackOut_158_0;
                                      stackIn_159_0 = stackOut_158_0;
                                      if (var6 != 0) {
                                        break L47;
                                      } else {
                                        L49: {
                                          if (stackIn_159_0 == 0) {
                                            break L49;
                                          } else {
                                            if (aa.field_a[var5] == null) {
                                              break L49;
                                            } else {
                                              int incrementValue$3 = var4_int;
                                              var4_int--;
                                              if (0 < incrementValue$3) {
                                                break L49;
                                              } else {
                                                if (var6 == 0) {
                                                  break L45;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var5++;
                                        if (var6 == 0) {
                                          continue L46;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_169_0 = an.field_a;
                                  stackIn_170_0 = stackOut_169_0;
                                  break L47;
                                }
                                if (stackIn_170_0 == -1) {
                                  break L45;
                                } else {
                                  if (aj.field_C) {
                                    L50: {
                                      if (~an.field_a != ~(-1 + ku.field_J.length)) {
                                        sr.field_b = iw.field_b;
                                        rn.a(ff.field_m, 320, 225, 16711680, 28807);
                                        break L50;
                                      } else {
                                        break L50;
                                      }
                                    }
                                    an.field_a = an.field_a + 1;
                                    gn.a(14, true);
                                    ke.a(false);
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (null == ku.field_J) {
                        break L43;
                      } else {
                        if (ku.field_J.length > an.field_a) {
                          break L43;
                        } else {
                          if (!jl.a(-62)) {
                            break L43;
                          } else {
                            if (jc.b(true) == 0) {
                              L51: {
                                o.a(0);
                                if (!mq.a(8230, 10)) {
                                  break L51;
                                } else {
                                  th.b(24753, 239, 16);
                                  if (!sl.a((byte) 90, 10)) {
                                    break L51;
                                  } else {
                                    th.b(24753, 238, 17);
                                    break L51;
                                  }
                                }
                              }
                              L52: {
                                if (!mq.a(8230, 25)) {
                                  break L52;
                                } else {
                                  L53: {
                                    th.b(24753, 237, 18);
                                    if (sl.a((byte) 90, 25)) {
                                      th.b(24753, 236, 19);
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  }
                                  if (!nn.a(25, 115)) {
                                    break L52;
                                  } else {
                                    th.b(24753, 234, 21);
                                    break L52;
                                  }
                                }
                              }
                              L54: {
                                if (nq.field_i != 10) {
                                  break L54;
                                } else {
                                  if (!vb.field_E) {
                                    th.b(24753, 251, 4);
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                              L55: {
                                if (nq.field_i != 5) {
                                  break L55;
                                } else {
                                  if (hl.field_e) {
                                    break L55;
                                  } else {
                                    th.b(24753, 250, 5);
                                    break L55;
                                  }
                                }
                              }
                              L56: {
                                if (nq.field_i != 5) {
                                  break L56;
                                } else {
                                  if (cl.field_w) {
                                    break L56;
                                  } else {
                                    th.b(24753, 249, 6);
                                    break L56;
                                  }
                                }
                              }
                              L57: {
                                if (nq.field_i != 5) {
                                  break L57;
                                } else {
                                  if (!b.field_c) {
                                    th.b(24753, 248, 7);
                                    break L57;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              L58: {
                                if (og.a(-102)) {
                                  oh.field_e = oh.field_e + 1;
                                  break L58;
                                } else {
                                  break L58;
                                }
                              }
                              if (ku.field_J == null) {
                                break L43;
                              } else {
                                if (~ku.field_J.length < ~an.field_a) {
                                  break L43;
                                } else {
                                  if (jl.a(-36)) {
                                    break L43;
                                  } else {
                                    if (jc.b(true) != 0) {
                                      break L43;
                                    } else {
                                      L59: {
                                        if (ku.a((byte) -94) <= ps.field_e[20]) {
                                          break L59;
                                        } else {
                                          th.b(24753, 235, 20);
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        if (ld.field_C != 0) {
                                          break L60;
                                        } else {
                                          th.b(24753, 252, 3);
                                          break L60;
                                        }
                                      }
                                      L61: {
                                        if (oh.field_e != 25) {
                                          break L61;
                                        } else {
                                          L62: {
                                            if (ki.field_f != 10) {
                                              break L62;
                                            } else {
                                              th.b(24753, 255, 0);
                                              break L62;
                                            }
                                          }
                                          L63: {
                                            if (iv.field_i == 10) {
                                              th.b(24753, 254, 1);
                                              break L63;
                                            } else {
                                              break L63;
                                            }
                                          }
                                          if (hc.field_f != 10) {
                                            break L61;
                                          } else {
                                            th.b(24753, 253, 2);
                                            break L61;
                                          }
                                        }
                                      }
                                      ua.a(35040, (ah) (Object) new fe(81920, 61440));
                                      av.a(-7753, true, 12);
                                      ag.a(0, 6);
                                      return;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                    }
                    stackOut_240_0 = null;
                    stackOut_240_1 = aa.field_a[0];
                    stackIn_241_0 = stackOut_240_0;
                    stackIn_241_1 = stackOut_240_1;
                    break L34;
                  }
                  L64: {
                    if (stackIn_241_0 != (Object) (Object) stackIn_241_1) {
                      break L64;
                    } else {
                      if (nd.field_F > 0) {
                        L65: {
                          L66: {
                            nd.field_F = nd.field_F - 1;
                            if (nd.field_F > 0) {
                              break L66;
                            } else {
                              jk.field_a = iw.field_b;
                              uq.a(7, 8);
                              av.a(-7753, true, 11);
                              if (var6 == 0) {
                                break L65;
                              } else {
                                break L66;
                              }
                            }
                          }
                          L67: {
                            if (gt.field_bb) {
                              break L67;
                            } else {
                              ds.a(107);
                              if (var6 == 0) {
                                break L65;
                              } else {
                                break L67;
                              }
                            }
                          }
                          sm.a(72);
                          break L65;
                        }
                        qk.field_T = 0;
                        bi.field_c = 0;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                  }
                  L68: {
                    if (null != aa.field_a[0]) {
                      L69: {
                        var4 = aa.field_a[0];
                        if (var4.i(-2)) {
                          this.a(231, 6356832, pu.field_a);
                          break L69;
                        } else {
                          break L69;
                        }
                      }
                      if (!var4.g((byte) -59)) {
                        break L68;
                      } else {
                        if (((qu) this).field_b) {
                          wd.a((byte) 99, 17);
                          ((qu) this).field_b = false;
                          break L68;
                        } else {
                          break L68;
                        }
                      }
                    } else {
                      break L68;
                    }
                  }
                  L70: {
                    if (null != bj.field_b) {
                      this.f(-14854);
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L71: {
                    lp.a(true);
                    if (!gt.field_bb) {
                      break L71;
                    } else {
                      if (aa.field_a[0] == null) {
                        break L71;
                      } else {
                        L72: {
                          if (300 <= iw.field_b * 20 / 1000) {
                            th.b(24753, 231, 24);
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        L73: {
                          if (180 <= 20 * iw.field_b / 1000) {
                            th.b(24753, 232, 23);
                            break L73;
                          } else {
                            break L73;
                          }
                        }
                        L74: {
                          if (20 * iw.field_b / 1000 >= 60) {
                            th.b(24753, 233, 22);
                            break L74;
                          } else {
                            break L74;
                          }
                        }
                        if (rf.a(false)) {
                          L75: {
                            if (iw.field_b * 20 / 1000 < 300) {
                              break L75;
                            } else {
                              th.b(24753, 228, 27);
                              break L75;
                            }
                          }
                          L76: {
                            if (iw.field_b * 20 / 1000 < 180) {
                              break L76;
                            } else {
                              th.b(24753, 229, 26);
                              break L76;
                            }
                          }
                          if (60 > iw.field_b * 20 / 1000) {
                            break L71;
                          } else {
                            th.b(24753, 230, 25);
                            break L71;
                          }
                        } else {
                          break L71;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            ld.field_N.c(5008);
            return;
          }
        }
    }

    private final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ig.field_b.a((ms) (Object) new to(param2, param1), (byte) 39);
              if (param0 == 231) {
                break L1;
              } else {
                this.c(-6);
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
            stackOut_3_1 = new StringBuilder().append("qu.A(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        gw var9 = null;
        int var10 = 0;
        gw stackIn_26_0 = null;
        gw stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        gw stackIn_28_0 = null;
        gw stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        gw stackIn_29_0 = null;
        gw stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        gw stackIn_49_0 = null;
        gw stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        gw stackIn_51_0 = null;
        gw stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        gw stackIn_52_0 = null;
        gw stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_52_5 = 0;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        RuntimeException decompiledCaughtException = null;
        gw stackOut_25_0 = null;
        gw stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        gw stackOut_28_0 = null;
        gw stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        gw stackOut_26_0 = null;
        gw stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        gw stackOut_48_0 = null;
        gw stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        gw stackOut_51_0 = null;
        gw stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int stackOut_51_5 = 0;
        int stackOut_51_6 = 0;
        int stackOut_51_7 = 0;
        gw stackOut_49_0 = null;
        gw stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (lg.field_c % param0 == 0) {
                  break L2;
                } else {
                  if (((qu) this).field_h != ((qu) this).field_a) {
                    break L1;
                  } else {
                    if (((qu) this).field_m != ((qu) this).field_f) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2_int = fi.a(640 + ej.field_i.c(), ki.field_b, (byte) -96) - ej.field_i.c();
              var3 = fi.a(480 - -ej.field_i.a(), ki.field_b, (byte) -96) - ej.field_i.a();
              ((qu) this).field_d = (-((qu) this).field_f + (double)var3) / 2500.0;
              ((qu) this).field_e = (-((qu) this).field_a + (double)var2_int) / 2500.0;
              break L1;
            }
            L3: {
              if (lg.field_c % 100 != 0) {
                break L3;
              } else {
                if (ni.field_e == null) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_int = 0;
                      var3 = 0;
                      if (0 != fi.a(2, ki.field_b, (byte) -96)) {
                        break L5;
                      } else {
                        var2_int = fi.a(163840, ki.field_b, (byte) -96);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 = fi.a(163840, ki.field_b, (byte) -96);
                    break L4;
                  }
                  L6: {
                    var4 = fi.a(65536, ki.field_b, (byte) -96);
                    var5 = Math.random() / 500.0;
                    var7 = 1 + fi.a(256, ki.field_b, (byte) -96);
                    var8 = 1 + fi.a(256, ki.field_b, (byte) -96);
                    if (fi.a(2, ki.field_b, (byte) -96) != 0) {
                      break L6;
                    } else {
                      L7: {
                        if (var2_int <= 0) {
                          break L7;
                        } else {
                          var8 = var8 * -1;
                          var3 = 122880;
                          if (var10 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (0 >= var3) {
                        break L6;
                      } else {
                        var2_int = 163840;
                        var7 = var7 * -1;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    stackOut_25_0 = null;
                    stackOut_25_1 = null;
                    stackOut_25_2 = 5000;
                    stackOut_25_3 = var2_int;
                    stackOut_25_4 = var3;
                    stackOut_25_5 = 16777215;
                    stackOut_25_6 = 1;
                    stackIn_28_0 = stackOut_25_0;
                    stackIn_28_1 = stackOut_25_1;
                    stackIn_28_2 = stackOut_25_2;
                    stackIn_28_3 = stackOut_25_3;
                    stackIn_28_4 = stackOut_25_4;
                    stackIn_28_5 = stackOut_25_5;
                    stackIn_28_6 = stackOut_25_6;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    stackIn_26_5 = stackOut_25_5;
                    stackIn_26_6 = stackOut_25_6;
                    if (oh.field_e > -1) {
                      stackOut_28_0 = null;
                      stackOut_28_1 = null;
                      stackOut_28_2 = stackIn_28_2;
                      stackOut_28_3 = stackIn_28_3;
                      stackOut_28_4 = stackIn_28_4;
                      stackOut_28_5 = stackIn_28_5;
                      stackOut_28_6 = stackIn_28_6;
                      stackOut_28_7 = oh.field_e % 3;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      stackIn_29_4 = stackOut_28_4;
                      stackIn_29_5 = stackOut_28_5;
                      stackIn_29_6 = stackOut_28_6;
                      stackIn_29_7 = stackOut_28_7;
                      break L8;
                    } else {
                      stackOut_26_0 = null;
                      stackOut_26_1 = null;
                      stackOut_26_2 = stackIn_26_2;
                      stackOut_26_3 = stackIn_26_3;
                      stackOut_26_4 = stackIn_26_4;
                      stackOut_26_5 = stackIn_26_5;
                      stackOut_26_6 = stackIn_26_6;
                      stackOut_26_7 = 0;
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_29_1 = stackOut_26_1;
                      stackIn_29_2 = stackOut_26_2;
                      stackIn_29_3 = stackOut_26_3;
                      stackIn_29_4 = stackOut_26_4;
                      stackIn_29_5 = stackOut_26_5;
                      stackIn_29_6 = stackOut_26_6;
                      stackIn_29_7 = stackOut_26_7;
                      break L8;
                    }
                  }
                  var9 = new gw(stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, (double)var4, var5, var7, var8);
                  ni.field_e.a((ms) (Object) var9, (byte) 39);
                  break L3;
                }
              }
            }
            L9: {
              if (lg.field_c % 200 != 0) {
                break L9;
              } else {
                if (ni.field_e == null) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      var2_int = 0;
                      var3 = 0;
                      if (0 == fi.a(2, ki.field_b, (byte) -96)) {
                        break L11;
                      } else {
                        var3 = fi.a(163840, ki.field_b, (byte) -96);
                        if (var10 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var2_int = fi.a(163840, ki.field_b, (byte) -96);
                    break L10;
                  }
                  L12: {
                    var4 = fi.a(65536, ki.field_b, (byte) -96);
                    var5 = Math.random() / 1000.0;
                    var7 = fi.a(64, ki.field_b, (byte) -96) + 1;
                    var8 = 1 + fi.a(64, ki.field_b, (byte) -96);
                    if (fi.a(2, ki.field_b, (byte) -96) == 0) {
                      L13: {
                        if (0 >= var2_int) {
                          break L13;
                        } else {
                          var3 = 122880;
                          var8 = var8 * -1;
                          if (var10 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (var3 > 0) {
                        var7 = var7 * -1;
                        var2_int = 163840;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L14: {
                    stackOut_48_0 = null;
                    stackOut_48_1 = null;
                    stackOut_48_2 = 5000;
                    stackOut_48_3 = var2_int;
                    stackOut_48_4 = var3;
                    stackOut_48_5 = 16777215;
                    stackOut_48_6 = 0;
                    stackIn_51_0 = stackOut_48_0;
                    stackIn_51_1 = stackOut_48_1;
                    stackIn_51_2 = stackOut_48_2;
                    stackIn_51_3 = stackOut_48_3;
                    stackIn_51_4 = stackOut_48_4;
                    stackIn_51_5 = stackOut_48_5;
                    stackIn_51_6 = stackOut_48_6;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    stackIn_49_2 = stackOut_48_2;
                    stackIn_49_3 = stackOut_48_3;
                    stackIn_49_4 = stackOut_48_4;
                    stackIn_49_5 = stackOut_48_5;
                    stackIn_49_6 = stackOut_48_6;
                    if (oh.field_e > -1) {
                      stackOut_51_0 = null;
                      stackOut_51_1 = null;
                      stackOut_51_2 = stackIn_51_2;
                      stackOut_51_3 = stackIn_51_3;
                      stackOut_51_4 = stackIn_51_4;
                      stackOut_51_5 = stackIn_51_5;
                      stackOut_51_6 = stackIn_51_6;
                      stackOut_51_7 = oh.field_e % 3;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      stackIn_52_2 = stackOut_51_2;
                      stackIn_52_3 = stackOut_51_3;
                      stackIn_52_4 = stackOut_51_4;
                      stackIn_52_5 = stackOut_51_5;
                      stackIn_52_6 = stackOut_51_6;
                      stackIn_52_7 = stackOut_51_7;
                      break L14;
                    } else {
                      stackOut_49_0 = null;
                      stackOut_49_1 = null;
                      stackOut_49_2 = stackIn_49_2;
                      stackOut_49_3 = stackIn_49_3;
                      stackOut_49_4 = stackIn_49_4;
                      stackOut_49_5 = stackIn_49_5;
                      stackOut_49_6 = stackIn_49_6;
                      stackOut_49_7 = 0;
                      stackIn_52_0 = stackOut_49_0;
                      stackIn_52_1 = stackOut_49_1;
                      stackIn_52_2 = stackOut_49_2;
                      stackIn_52_3 = stackOut_49_3;
                      stackIn_52_4 = stackOut_49_4;
                      stackIn_52_5 = stackOut_49_5;
                      stackIn_52_6 = stackOut_49_6;
                      stackIn_52_7 = stackOut_49_7;
                      break L14;
                    }
                  }
                  var9 = new gw(stackIn_52_2, stackIn_52_3, stackIn_52_4, stackIn_52_5, stackIn_52_6, stackIn_52_7, (double)var4, var5, var7, var8);
                  ni.field_e.a((ms) (Object) var9, (byte) 39);
                  break L9;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.R(" + param0 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 54 / ((-65 - param0) / 47);
              if (null != hb.field_a) {
                break L1;
              } else {
                if (0 >= te.field_c) {
                  break L1;
                } else {
                  if (f.field_w) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (gt.field_bb) {
                          break L3;
                        } else {
                          hb.field_a = new id(0, 65535, ha.field_f, fb.field_a, ts.field_a, kn.field_b, new int[2]);
                          if (!Sumoblitz.field_L) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      hb.field_a = new id(1, 65534, ha.field_f, fb.field_a, ts.field_a, kn.field_b, new int[2]);
                      break L2;
                    }
                    L4: {
                      if (vs.b((byte) 9)) {
                        break L4;
                      } else {
                        kp.a(3, hb.field_a, 79);
                        break L4;
                      }
                    }
                    hb.field_a = null;
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "qu.D(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        try {
            if (td.field_m) {
            }
            int var2_int = 31 / ((-57 - param0) / 49);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qu.Q(" + param0 + ')');
        }
    }

    private final void a(byte param0, ha param1) {
        RuntimeException var3 = null;
        pm var3_ref = null;
        fe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -75) {
              L1: {
                L2: {
                  var3_ref = wq.a(param1, (byte) 36);
                  if (0 != nd.field_F) {
                    break L2;
                  } else {
                    if (!td.field_m) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (td.field_m) {
                  break L1;
                } else {
                  L3: {
                    var4 = (fe) (Object) aa.field_a[0];
                    if (gt.field_bb) {
                      break L3;
                    } else {
                      if (ku.field_J != null) {
                        to.field_s[0].a(55, 0);
                        to.field_s[1].a(to.field_s[0].c() + 55, 0);
                        var5 = 55 - -(to.field_s[1].c() * 2);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5 >= 530) {
                                break L6;
                              } else {
                                to.field_s[2].a(var5, 0);
                                var5 = var5 + to.field_s[1].c();
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
                            to.field_s[3].a(-to.field_s[4].c() + 567, 0);
                            to.field_s[4].a(567, 0);
                            qv.field_k.a(19, 85, -11753985, ps.field_b + "" + in.field_z, (byte) -21, -1);
                            uq.field_a.a(19, 85, -4720129, "<col=ffffff>" + ps.field_b + "</col>" + in.field_z, (byte) -18, -1);
                            qv.field_k.a(-1, 560, pl.field_x + "" + (oh.field_e + 1) + " " + fq.field_e + "" + pd.field_p + "x " + as.field_x + "" + nd.field_F + "", 19, -11753985, 74);
                            break L5;
                          }
                          uq.field_a.a(-1, 560, "<col=ffffff> " + pl.field_x + "</col>" + (1 + oh.field_e) + "<col=ffffff> " + fq.field_e + "</col>" + pd.field_p + "x" + "<col=ffffff> " + as.field_x + "</col>" + nd.field_F + "", 19, -4720129, 120);
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  mu.field_B[0].a(139, 448);
                  mu.field_B[1].a(-16 + to.field_s[0].c() + 155, 448);
                  var5 = 145 + 2 * to.field_s[1].c();
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var5 >= 408) {
                          break L9;
                        } else {
                          mu.field_B[2].a(-6 + var5, 448);
                          var5 = var5 + to.field_s[1].c();
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
                      mu.field_B[3].a(-to.field_s[4].c() + 459, 448);
                      mu.field_B[4].a(459, 448);
                      qv.field_k.a(473, 320, -11753985, tj.field_l + dp.b(iw.field_b, -23620) + "", (byte) -73, -1);
                      uq.field_a.a(473, 320, -4720129, "<col=ffffff>" + tj.field_l + "</col>" + dp.b(iw.field_b, -23620) + "</col>", (byte) -76, -1);
                      break L8;
                    }
                    L10: {
                      if (gt.field_bb) {
                        qv.field_k.a(473, 175, -11753985, ps.field_b + "" + in.field_z, (byte) -125, -1);
                        uq.field_a.a(473, 175, -4720129, "<col=ffffff>" + ps.field_b + "</col>" + in.field_z, (byte) -112, -1);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      pr.field_k[0].a(3, 42);
                      var3_ref.a((byte) 75, 395 + -var4.d((byte) -106) + 42, 42 + pr.field_k[0].a(), 0, 40);
                      pr.field_k[1].a(3, 42);
                      var3_ref.a(29709);
                      if (!var4.j(20)) {
                        break L11;
                      } else {
                        L12: {
                          var5 = lg.field_c << 2;
                          if (255 >= var5 % 510) {
                            stackOut_39_0 = var5 % 255;
                            stackIn_40_0 = stackOut_39_0;
                            break L12;
                          } else {
                            stackOut_37_0 = -(var5 % 255) + 510;
                            stackIn_40_0 = stackOut_37_0;
                            break L12;
                          }
                        }
                        var6 = stackIn_40_0;
                        pr.field_k[2].a(3, 42, 0, 16777215 | var6 << 24, 1);
                        break L11;
                      }
                    }
                    if (gt.field_bb) {
                      break L1;
                    } else {
                      if (var4 != null) {
                        ud.field_q[0].a(190.0f, 468.0f, 1600, 0, 1, 0, 2);
                        qv.field_k.a(473, 202, -11753985, Integer.toString(var4.field_I), (byte) -10, -1);
                        uq.field_a.a(473, 202, -1, Integer.toString(var4.field_I), (byte) -30, -1);
                        ud.field_q[1].a(240.0f, 468.0f, 1600, 0, 1, 0, 2);
                        qv.field_k.a(473, 252, -11753985, Integer.toString(var4.field_y), (byte) -30, -1);
                        uq.field_a.a(473, 252, -1, Integer.toString(var4.field_y), (byte) -30, -1);
                        ud.field_q[2].a(290.0f, 468.0f, 1600, 0, 1, 0, 2);
                        qv.field_k.a(473, 302, -11753985, Integer.toString(var4.field_t), (byte) -34, -1);
                        uq.field_a.a(473, 302, -1, Integer.toString(var4.field_t), (byte) -24, -1);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L13: {
                if (ld.field_N.a(false)) {
                  ld.field_N.a(true, param1);
                  break L13;
                } else {
                  break L13;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var3;
            stackOut_53_1 = new StringBuilder().append("qu.M(").append(param0).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L14;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ig.field_b.e(117);
              an.field_a = -1;
              td.field_m = true;
              aa.field_a = new ah[100];
              if (param0 >= 53) {
                break L1;
              } else {
                qu.a(-125, (gk) null, -52, -77, 38, -62, (byte) 105, 54);
                break L1;
              }
            }
            kp.field_a = true;
            ke.a(false);
            ((qu) this).c((byte) 112);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "qu.K(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              hb.field_a = null;
              ig.field_b.e(119);
              wj.field_e = 0;
              in.field_z = 0;
              kn.field_b = 0;
              ld.field_C = param0;
              f.field_w = false;
              te.field_c = 0;
              oh.field_e = param0;
              ha.field_f = 0;
              ts.field_a = 0;
              iw.field_b = 0;
              fb.field_a = 0;
              tc.e(104);
              if (oh.field_e != 0) {
                break L1;
              } else {
                if (wm.field_f[0]) {
                  break L1;
                } else {
                  bw.field_d = true;
                  ((qu) this).field_b = true;
                  break L1;
                }
              }
            }
            gg.a((byte) 105);
            td.field_m = false;
            gt.field_bb = param2;
            ((qu) this).c((byte) 112);
            lg.field_c = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var4, "qu.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qu() {
        try {
            ni.field_e = new jn();
            rc.field_m = new jn();
            ((qu) this).a(127);
            jp discarded$0 = new jp();
            ld.field_N = new bw();
            lp discarded$1 = new lp();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qu.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new float[][]{new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3]};
    }
}
