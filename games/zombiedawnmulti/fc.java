/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    int field_e;
    int field_j;
    int[][] field_f;
    static int[] field_m;
    int field_d;
    int[][] field_k;
    int field_i;
    int[][] field_g;
    int[][] field_h;
    private int field_b;
    int[] field_l;
    static boolean[] field_c;
    static cj field_a;

    public static void b(int param0) {
        if (param0 != -1) {
            field_a = (cj) null;
        }
        field_m = null;
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        gf.field_g = 0;
        lq.field_b = 0;
        fn.field_c = 0;
        lb.field_a = nf.field_a;
        if (param0 < 121) {
          return;
        } else {
          gl.field_H = new hh(2);
          gl.field_H.a(-1, param1, -31458, al.c(bo.field_d, -1, bd.field_g));
          return;
        }
    }

    private final id a(int param0, int param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        fd var6 = null;
        h var6_ref = null;
        int var7 = 0;
        wb var8 = null;
        if (-1 != (param1 ^ -1)) {
          if (-2 != (param1 ^ -1)) {
            if (2 != param1) {
              if (3 != param1) {
                if (-5 != (param1 ^ -1)) {
                  if (param2 <= -60) {
                    return null;
                  } else {
                    this.a((byte) 54);
                    return null;
                  }
                } else {
                  var6_ref = new h(param0, param4, false);
                  var6_ref.field_I = (byte)((param3 & -1073741824) >>> -294768322);
                  return (id) ((Object) var6_ref);
                }
              } else {
                return (id) ((Object) new mg(param0, param4, param3));
              }
            } else {
              L0: {
                var6 = new fd(param0, param4, param3 & -1610612737);
                if (0 >= (param3 & 1073741824)) {
                  break L0;
                } else {
                  var6.field_H = true;
                  break L0;
                }
              }
              L1: {
                if (0 < (param3 & 536870912)) {
                  var6.field_K = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (id) ((Object) var6);
            }
          } else {
            return (id) ((Object) pg.a(param0, (byte) -128, param3, param4));
          }
        } else {
          var6_int = 1073741823 & param3;
          var7 = (byte)(param3 >>> -1830245730 & 3);
          var8 = new wb(param0, param4, var6_int);
          var8.field_Lb = var7;
          return (id) ((Object) var8);
        }
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
            this.field_b = 72;
        }
        if (!((this.field_b ^ -1) <= -5)) {
            if (-65 < (param1 ^ -1)) {
                param1 = param1 + this.field_b * 72;
            }
        }
        return param1 << 1928751495;
    }

    th a(int param0) {
        int var2 = 0;
        th var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        id var9 = null;
        int var10 = 0;
        th stackIn_3_0 = null;
        th stackIn_6_0 = null;
        th stackOut_2_0 = null;
        th stackOut_5_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 88 % ((param0 - 37) / 41);
        var3 = new th();
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 >= this.field_l.length) {
                break L2;
              } else {
                var5 = this.field_l[var4];
                var6 = this.field_l[var4 - -1];
                var7 = this.field_l[2 + var4];
                var8 = this.field_l[3 + var4];
                var9 = this.a(var7, var5, (byte) -97, var6, var8);
                stackOut_2_0 = (th) (var3);
                stackIn_6_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var10 != 0) {
                  break L1;
                } else {
                  ((th) (Object) stackIn_3_0).a(var9, false);
                  var4 += 4;
                  if (var10 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_5_0 = (th) (var3);
            stackIn_6_0 = stackOut_5_0;
            break L1;
          }
          return stackIn_6_0;
        }
    }

    void a(byte param0) {
        this.a(this.field_g, 9);
        this.b(this.field_g, -10);
        this.field_d = this.field_g[0].length;
        if (param0 < 120) {
          return;
        } else {
          this.field_e = this.field_g.length;
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -8927) {
            this.field_h = (int[][]) null;
        }
        this.field_k[param1][param2] = cr.b(param3 ? 1 : 0, tq.b(14, this.field_k[param1][param2]));
        if (this.field_k[param1].length > param2 + 1) {
            this.field_k[param1][param2 - -1] = cr.b(tq.b(this.field_k[param1][1 + param2], -3), param3 ? 2 : 0);
        }
        if (0 < param2 + -1) {
            this.field_k[param1][-1 + param2] = cr.b(tq.b(this.field_k[param1][-1 + param2], -5), param3 ? 4 : 0);
        }
    }

    private final void b(int[][] param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                discarded$1 = this.a(94, -4, (byte) -2);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              stackOut_4_0 = param0.length;
              stackOut_4_1 = var3_int;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 <= stackIn_5_1) {
                    break L4;
                  } else {
                    if (var8 != 0) {
                      break L4;
                    } else {
                      var4 = 0;
                      L5: while (true) {
                        L6: {
                          if (param0[0].length <= var4) {
                            break L6;
                          } else {
                            var5 = this.a(var3_int, true, var4);
                            var6 = 511 & var5 >> 627713031;
                            var7 = var5 >> 607305712 & 511;
                            stackOut_9_0 = -1;
                            stackOut_9_1 = -2147483648 & var5 ^ -1;
                            stackIn_5_0 = stackOut_9_0;
                            stackIn_5_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var8 != 0) {
                              continue L3;
                            } else {
                              L7: {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  break L7;
                                } else {
                                  L8: {
                                    L9: {
                                      if (-10 < (var6 ^ -1)) {
                                        break L9;
                                      } else {
                                        if (32 >= var6) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (-10 < (var7 ^ -1)) {
                                        break L10;
                                      } else {
                                        if (32 >= var7) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (((this.a(1 + var3_int, true, var4) & 65408) >> 1483158567 ^ -1) == -17) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var5 = var5 | 67108864;
                                  break L7;
                                }
                              }
                              this.field_f[var3_int][var4] = var5;
                              var4++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var3_int++;
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("fc.D(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L11;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
    }

    final void a(int[][] param0, int param1) {
        id discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              stackOut_2_0 = param0.length;
              stackOut_2_1 = var3_int;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_20_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        var4 = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if (param0[0].length <= var4) {
                              break L6;
                            } else {
                              stackOut_7_0 = -1;
                              stackOut_7_1 = param0[var3_int][var4] & 33554432 ^ -1;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_3_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var6 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 == stackIn_8_1) {
                                    if ((param0[var3_int][var4] & -2147483648) == 0) {
                                      stackOut_12_0 = 1;
                                      stackIn_14_0 = stackOut_12_0;
                                      break L7;
                                    } else {
                                      stackOut_11_0 = 0;
                                      stackIn_14_0 = stackOut_11_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_9_0 = 0;
                                    stackIn_14_0 = stackOut_9_0;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var5 = stackIn_14_0;
                                  stackOut_14_0 = this.field_h[var3_int];
                                  stackOut_14_1 = var4;
                                  stackOut_14_2 = this.field_k[var3_int];
                                  stackOut_14_3 = var4;
                                  stackIn_16_0 = stackOut_14_0;
                                  stackIn_16_1 = stackOut_14_1;
                                  stackIn_16_2 = stackOut_14_2;
                                  stackIn_16_3 = stackOut_14_3;
                                  stackIn_15_0 = stackOut_14_0;
                                  stackIn_15_1 = stackOut_14_1;
                                  stackIn_15_2 = stackOut_14_2;
                                  stackIn_15_3 = stackOut_14_3;
                                  if (var5 == 0) {
                                    stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                                    stackOut_16_1 = stackIn_16_1;
                                    stackOut_16_2 = (int[]) ((Object) stackIn_16_2);
                                    stackOut_16_3 = stackIn_16_3;
                                    stackOut_16_4 = 0;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    stackIn_17_2 = stackOut_16_2;
                                    stackIn_17_3 = stackOut_16_3;
                                    stackIn_17_4 = stackOut_16_4;
                                    break L8;
                                  } else {
                                    stackOut_15_0 = (int[]) ((Object) stackIn_15_0);
                                    stackOut_15_1 = stackIn_15_1;
                                    stackOut_15_2 = (int[]) ((Object) stackIn_15_2);
                                    stackOut_15_3 = stackIn_15_3;
                                    stackOut_15_4 = 1;
                                    stackIn_17_0 = stackOut_15_0;
                                    stackIn_17_1 = stackOut_15_1;
                                    stackIn_17_2 = stackOut_15_2;
                                    stackIn_17_3 = stackOut_15_3;
                                    stackIn_17_4 = stackOut_15_4;
                                    break L8;
                                  }
                                }
                                stackIn_17_2[stackIn_17_3] = stackIn_17_4;
                                stackIn_17_0[stackIn_17_1] = stackIn_17_4;
                                var4++;
                                if (var6 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3_int++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_19_0 = param1;
                  stackIn_20_0 = stackOut_19_0;
                  break L3;
                }
                L9: {
                  if (stackIn_20_0 == 9) {
                    break L9;
                  } else {
                    discarded$1 = this.a(106, -54, (byte) -40, 61, -65);
                    break L9;
                  }
                }
                var3_int = 0;
                L10: while (true) {
                  stackOut_23_0 = var3_int;
                  stackOut_23_1 = param0.length;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  L11: while (true) {
                    L12: {
                      if (stackIn_24_0 >= stackIn_24_1) {
                        break L12;
                      } else {
                        if (var6 != 0) {
                          break L12;
                        } else {
                          var4 = 1;
                          if (param0[0].length + -1 <= var4) {
                            var3_int++;
                            if (var6 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          } else {
                            stackOut_27_0 = 1;
                            stackOut_27_1 = this.field_k[var3_int][var4] & 1;
                            stackIn_24_0 = stackOut_27_0;
                            stackIn_24_1 = stackOut_27_1;
                            continue L11;
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("fc.I(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L13;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = this.a((byte) 91, param2, param0);
          var4 = var4 & -67108865;
          var5 = 511 & var4 >> 506472231;
          if ((var4 & 33554432) == 0) {
            break L0;
          } else {
            if (-1 == (var5 ^ -1)) {
              L1: {
                var4 = var4 & -65409;
                if (!this.a(param2 - -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 - -1, 2)) {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_10_0 = stackOut_7_0;
                    break L1;
                  }
                } else {
                  stackOut_5_0 = 0;
                  stackIn_10_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var6 = stackIn_10_0;
                var7 = this.a(param2, 3 + param0, (byte) -53) ? 1 : 0;
                var8 = this.a(param2, param0 + -1, (byte) -53) ? 1 : 0;
                if (!this.a(param2 + -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 + -1, 2)) {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_16_0 = stackOut_13_0;
                    break L2;
                  }
                } else {
                  stackOut_11_0 = 1;
                  stackIn_16_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_16_0;
                if (!this.a(param2 + 1, param0, (byte) -53)) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var10 = stackIn_19_0;
                    if (!this.a(param0, param2, 2)) {
                      break L6;
                    } else {
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (!this.a(param0, param2, 2)) {
                      break L7;
                    } else {
                      if (var6 == 0) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            stackOut_24_0 = var10;
                            stackIn_27_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (this.a(param2 - -1, 2 + param0, (byte) -53)) {
                              break L9;
                            } else {
                              stackOut_25_0 = stackIn_25_0;
                              stackIn_28_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (!this.a(1 + param2, param0 + 1, (byte) -53)) {
                                stackOut_28_0 = stackIn_28_0;
                                stackOut_28_1 = 0;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                break L8;
                              } else {
                                stackOut_26_0 = stackIn_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                break L9;
                              }
                            }
                          }
                          stackOut_27_0 = stackIn_27_0;
                          stackOut_27_1 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          break L8;
                        }
                        L10: {
                          L11: {
                            var10 = stackIn_29_0 | stackIn_29_1;
                            stackOut_29_0 = var9;
                            stackIn_32_0 = stackOut_29_0;
                            stackIn_30_0 = stackOut_29_0;
                            if (this.a(param2 - 1, 2 + param0, (byte) -53)) {
                              break L11;
                            } else {
                              stackOut_30_0 = stackIn_30_0;
                              stackIn_33_0 = stackOut_30_0;
                              stackIn_31_0 = stackOut_30_0;
                              if (!this.a(-1 + param2, param0 - -1, (byte) -53)) {
                                stackOut_33_0 = stackIn_33_0;
                                stackOut_33_1 = 0;
                                stackIn_34_0 = stackOut_33_0;
                                stackIn_34_1 = stackOut_33_1;
                                break L10;
                              } else {
                                stackOut_31_0 = stackIn_31_0;
                                stackIn_32_0 = stackOut_31_0;
                                break L11;
                              }
                            }
                          }
                          stackOut_32_0 = stackIn_32_0;
                          stackOut_32_1 = 1;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          break L10;
                        }
                        L12: {
                          var9 = stackIn_34_0 | stackIn_34_1;
                          if (!this.a(param2 + 1, param0 - -1, (byte) -53)) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            break L12;
                          } else {
                            stackOut_35_0 = 128;
                            stackIn_37_0 = stackOut_35_0;
                            break L12;
                          }
                        }
                        L13: {
                          var11 = stackIn_37_0;
                          if (var7 != 0) {
                            break L13;
                          } else {
                            if (var8 != 0) {
                              break L13;
                            } else {
                              if (var9 == 0) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 | -var11 + this.a(true, 26);
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          if (var7 != 0) {
                            break L14;
                          } else {
                            if (var8 != 0) {
                              break L14;
                            } else {
                              if (var9 != 0) {
                                break L14;
                              } else {
                                if (var10 == 0) {
                                  break L14;
                                } else {
                                  var4 = var4 | this.a(true, 28) + -var11;
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L15: {
                    if (!this.a(param2, 1 + param0, (byte) -53)) {
                      break L15;
                    } else {
                      L16: {
                        L17: {
                          if (!this.a(1 + param2, param0, (byte) -53)) {
                            break L17;
                          } else {
                            if (this.a(-1 + param2, param0, (byte) -53)) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (!this.a(param2 - -1, param0, (byte) -53)) {
                            break L18;
                          } else {
                            var4 = var4 | this.a(true, 7);
                            if (var12 == 0) {
                              break L4;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (!this.a(param2 - 1, param0, (byte) -53)) {
                            break L19;
                          } else {
                            var4 = var4 | this.a(param1, 3);
                            if (var12 == 0) {
                              break L4;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var4 = var4 | this.a(true, 1);
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L16;
                        }
                      }
                      var4 = var4 | this.a(true, 5);
                      if (var12 == 0) {
                        break L4;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (this.a(param2, param0 + 2, (byte) -53)) {
                    L20: {
                      L21: {
                        if (!this.a(param2 - -1, param0, (byte) -53)) {
                          break L21;
                        } else {
                          if (this.a(param2 - 1, param0, (byte) -53)) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (!this.a(param2 - -1, param0, (byte) -53)) {
                          break L22;
                        } else {
                          var4 = var4 | this.a(param1, 8);
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        if (!this.a(-1 + param2, param0, (byte) -53)) {
                          break L23;
                        } else {
                          var4 = var4 | this.a(true, 4);
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var4 = var4 | this.a(true, 2);
                      if (var12 == 0) {
                        break L4;
                      } else {
                        break L20;
                      }
                    }
                    var4 = var4 | this.a(param1, 6);
                    if (var12 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
                L24: {
                  if (var7 == 0) {
                    break L24;
                  } else {
                    if (var8 == 0) {
                      break L24;
                    } else {
                      if (var9 == 0) {
                        break L24;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 9);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (var7 == 0) {
                    break L25;
                  } else {
                    if (var8 == 0) {
                      break L25;
                    } else {
                      if (var9 == 0) {
                        break L25;
                      } else {
                        if (var10 != 0) {
                          break L25;
                        } else {
                          var4 = var4 | this.a(true, 10);
                          break L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (var7 == 0) {
                    break L26;
                  } else {
                    if (var8 == 0) {
                      break L26;
                    } else {
                      if (var9 != 0) {
                        break L26;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 11);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
                L27: {
                  if (var7 == 0) {
                    break L27;
                  } else {
                    if (var8 == 0) {
                      break L27;
                    } else {
                      if (var9 != 0) {
                        break L27;
                      } else {
                        if (var10 != 0) {
                          break L27;
                        } else {
                          var4 = var4 | this.a(true, 18);
                          break L27;
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (var7 == 0) {
                    break L28;
                  } else {
                    if (var8 != 0) {
                      break L28;
                    } else {
                      if (var9 == 0) {
                        break L28;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 12);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
                L29: {
                  if (var7 == 0) {
                    break L29;
                  } else {
                    if (var8 != 0) {
                      break L29;
                    } else {
                      if (var9 == 0) {
                        break L29;
                      } else {
                        if (var10 != 0) {
                          break L29;
                        } else {
                          var4 = var4 | this.a(true, 14);
                          break L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (var7 == 0) {
                    break L30;
                  } else {
                    if (var8 != 0) {
                      break L30;
                    } else {
                      if (var9 != 0) {
                        break L30;
                      } else {
                        if (var10 == 0) {
                          break L30;
                        } else {
                          var4 = var4 | this.a(true, 15);
                          break L30;
                        }
                      }
                    }
                  }
                }
                L31: {
                  if (var7 == 0) {
                    break L31;
                  } else {
                    if (var8 != 0) {
                      break L31;
                    } else {
                      if (var9 != 0) {
                        break L31;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(true, 21);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                }
                L32: {
                  if (var7 != 0) {
                    break L32;
                  } else {
                    if (var8 == 0) {
                      break L32;
                    } else {
                      if (var9 == 0) {
                        break L32;
                      } else {
                        if (var10 == 0) {
                          break L32;
                        } else {
                          var4 = var4 | this.a(true, 13);
                          break L32;
                        }
                      }
                    }
                  }
                }
                L33: {
                  if (var7 != 0) {
                    break L33;
                  } else {
                    if (var8 == 0) {
                      break L33;
                    } else {
                      if (var9 == 0) {
                        break L33;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(param1, 16);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (var7 != 0) {
                    break L34;
                  } else {
                    if (var8 == 0) {
                      break L34;
                    } else {
                      if (var9 != 0) {
                        break L34;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(param1, 17);
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                }
                L35: {
                  if (var7 != 0) {
                    break L35;
                  } else {
                    if (var8 == 0) {
                      break L35;
                    } else {
                      if (var9 != 0) {
                        break L35;
                      } else {
                        if (var10 == 0) {
                          var4 = var4 | this.a(true, 20);
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                }
                L36: {
                  if (var7 != 0) {
                    break L36;
                  } else {
                    if (var8 != 0) {
                      break L36;
                    } else {
                      if (var9 == 0) {
                        break L36;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 19);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                }
                L37: {
                  if (var7 != 0) {
                    break L37;
                  } else {
                    if (var8 != 0) {
                      break L37;
                    } else {
                      if (var9 == 0) {
                        break L37;
                      } else {
                        if (var10 != 0) {
                          break L37;
                        } else {
                          var4 = var4 | this.a(true, 22);
                          break L37;
                        }
                      }
                    }
                  }
                }
                L38: {
                  if (var7 != 0) {
                    break L38;
                  } else {
                    if (var8 != 0) {
                      break L38;
                    } else {
                      if (var9 != 0) {
                        break L38;
                      } else {
                        if (var10 != 0) {
                          var4 = var4 | this.a(true, 23);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                  }
                }
                if (var7 != 0) {
                  break L4;
                } else {
                  if (var8 != 0) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      break L4;
                    } else {
                      if (var10 == 0) {
                        var4 = var4 | this.a(param1, 24);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L39: {
                if ((65408 & var4) == 0) {
                  var4 = var4 | this.a(param1, 24);
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (param1) {
                  break L40;
                } else {
                  this.a((int[][]) null, -26);
                  break L40;
                }
              }
              return var4;
            } else {
              break L0;
            }
          }
        }
        return var4;
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            this.field_d = -47;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.a(param1, param0 + 1, (byte) -53)) {
              break L2;
            } else {
              if (this.a(param1, param0 + 2, (byte) -53)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void b(byte param0) {
        if (f.field_a != -vm.field_hb + 0) {
            if (-vm.field_hb + 250 != f.field_a) {
            }
        }
        if (param0 != -9) {
            field_a = (cj) null;
        }
        f.field_a = f.field_a + 1;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param2 != -53) {
          return false;
        } else {
          L0: {
            L1: {
              if (0 == (this.a((byte) 82, param0, param1) & 33554432)) {
                break L1;
              } else {
                if (-65 <= (this.a((byte) 105, param0, param1) >> 670815815 & 511 ^ -1)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 31) {
            discarded$0 = this.a(24, -127, (byte) 25);
        }
        if (!(-1 >= (param1 ^ -1))) {
            return 0;
        }
        if (param2 < 0) {
            return 0;
        }
        if (this.field_g.length <= param2) {
            return 0;
        }
        if (!(this.field_g[0].length > param1)) {
            return 0;
        }
        return this.field_g[param2][param1];
    }

    fc(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        int fieldTemp$0 = 0;
        try {
            this.field_j = param2;
            fieldTemp$0 = eh.field_b;
            eh.field_b = eh.field_b + 1;
            this.field_i = fieldTemp$0;
            this.field_l = param1;
            this.field_b = param4;
            this.field_g = param0;
            this.field_f = new int[param0.length][param0[0].length];
            this.field_k = new int[param0.length][param0[0].length];
            this.field_h = new int[param0.length][param0[0].length];
            this.a((byte) 121);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_m = da.a(8);
    }
}
