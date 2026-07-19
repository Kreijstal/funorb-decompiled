/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ci {
    private int field_q;
    private int field_n;
    private int field_p;
    private int field_r;
    static int field_m;
    static kb field_o;

    final int[] c(int param0, int param1) {
        int[] discarded$1 = null;
        int[] var3 = null;
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
        int[] var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_38_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int[] stackOut_19_0 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var15 = this.field_i.a((byte) 20, param1);
          var3 = var15;
          if (this.field_i.field_d) {
            var4 = 0;
            L0: while (true) {
              stackOut_24_0 = var4;
              stackOut_24_1 = ns.field_g;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              L1: while (true) {
                if (stackIn_25_0 < stackIn_25_1) {
                  L2: {
                    var5 = (ht.field_Fb[var4] << 1898795372) / this.field_q + this.field_n;
                    stackOut_27_0 = sj.field_b;
                    stackIn_38_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var14 != 0) {
                      break L2;
                    } else {
                      var6 = (stackIn_28_0[param1] << 155959180) / this.field_q + this.field_p;
                      var7 = var5;
                      var8 = var6;
                      var9 = var5;
                      var10 = var6;
                      var11 = var5 * var5 >> 378726476;
                      var12 = var6 * var6 >> 1320982476;
                      var13 = 0;
                      L3: while (true) {
                        L4: {
                          if (16384 <= var12 + var11) {
                            break L4;
                          } else {
                            stackOut_30_0 = this.field_r;
                            stackOut_30_1 = var13;
                            stackIn_25_0 = stackOut_30_0;
                            stackIn_25_1 = stackOut_30_1;
                            stackIn_31_0 = stackOut_30_0;
                            stackIn_31_1 = stackOut_30_1;
                            if (var14 != 0) {
                              continue L1;
                            } else {
                              if (stackIn_31_0 <= stackIn_31_1) {
                                break L4;
                              } else {
                                var10 = 2 * (var9 * var10 >> 156095276) - -var8;
                                var9 = var7 + var11 - var12;
                                var11 = var9 * var9 >> 1229981932;
                                var12 = var10 * var10 >> 1074359500;
                                var13++;
                                if (var14 == 0) {
                                  continue L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          stackOut_33_0 = (int[]) (var15);
                          stackOut_33_1 = var4;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          if (this.field_r - 1 <= var13) {
                            stackOut_35_0 = (int[]) ((Object) stackIn_35_0);
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            stackIn_36_2 = stackOut_35_2;
                            break L5;
                          } else {
                            stackOut_34_0 = (int[]) ((Object) stackIn_34_0);
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = (var13 << -538468084) / this.field_r;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            stackIn_36_2 = stackOut_34_2;
                            break L5;
                          }
                        }
                        stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                        var4++;
                        if (var14 == 0) {
                          continue L0;
                        } else {
                          stackOut_37_0 = (int[]) (var15);
                          stackIn_38_0 = stackOut_37_0;
                          break L2;
                        }
                      }
                    }
                  }
                  return stackIn_38_0;
                } else {
                  return var15;
                }
              }
            }
          } else {
            return var15;
          }
        } else {
          discarded$1 = this.c(94, -103);
          var15 = this.field_i.a((byte) 20, param1);
          var3 = var15;
          if (this.field_i.field_d) {
            var4 = 0;
            L6: while (true) {
              stackOut_5_0 = var4;
              stackOut_5_1 = ns.field_g;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L7: while (true) {
                if (stackIn_6_0 < stackIn_6_1) {
                  L8: {
                    var5 = (ht.field_Fb[var4] << 1898795372) / this.field_q + this.field_n;
                    stackOut_9_0 = sj.field_b;
                    stackIn_20_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var14 != 0) {
                      break L8;
                    } else {
                      var6 = (stackIn_10_0[param1] << 155959180) / this.field_q + this.field_p;
                      var7 = var5;
                      var8 = var6;
                      var9 = var5;
                      var10 = var6;
                      var11 = var5 * var5 >> 378726476;
                      var12 = var6 * var6 >> 1320982476;
                      var13 = 0;
                      L9: while (true) {
                        L10: {
                          if (16384 <= var12 + var11) {
                            break L10;
                          } else {
                            stackOut_12_0 = this.field_r;
                            stackOut_12_1 = var13;
                            stackIn_6_0 = stackOut_12_0;
                            stackIn_6_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (var14 != 0) {
                              continue L7;
                            } else {
                              if (stackIn_13_0 <= stackIn_13_1) {
                                break L10;
                              } else {
                                var10 = 2 * (var9 * var10 >> 156095276) - -var8;
                                var9 = var7 + var11 - var12;
                                var11 = var9 * var9 >> 1229981932;
                                var12 = var10 * var10 >> 1074359500;
                                var13++;
                                if (var14 == 0) {
                                  continue L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        L11: {
                          stackOut_15_0 = (int[]) (var15);
                          stackOut_15_1 = var4;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (this.field_r - 1 <= var13) {
                            stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            break L11;
                          } else {
                            stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = (var13 << -538468084) / this.field_r;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L11;
                          }
                        }
                        stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                        var4++;
                        if (var14 == 0) {
                          continue L6;
                        } else {
                          stackOut_19_0 = (int[]) (var15);
                          stackIn_20_0 = stackOut_19_0;
                          break L8;
                        }
                      }
                    }
                  }
                  return stackIn_20_0;
                } else {
                  return var15;
                }
              }
            }
          } else {
            return var15;
          }
        }
    }

    final static int[][] a(boolean param0, int param1, int param2, float param3, int param4, byte param5, int param6, int param7, int param8) {
        int[][] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        lva var16 = null;
        lva var17 = null;
        lva stackIn_2_0 = null;
        lva stackIn_3_0 = null;
        lva stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        lva stackIn_9_0 = null;
        lva stackIn_10_0 = null;
        lva stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        lva stackOut_8_0 = null;
        lva stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        lva stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        lva stackOut_1_0 = null;
        lva stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        lva stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param5 >= -46) {
          L0: {
            field_m = -82;
            var15 = new int[param8][param4];
            var14 = var15;
            var13 = var14;
            var9 = var13;
            var16 = new lva();
            var16.field_x = (int)(param3 * 4096.0f);
            var16.field_n = param2;
            stackOut_8_0 = (lva) (var16);
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
              stackOut_10_0 = (lva) ((Object) stackIn_10_0);
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L0;
            } else {
              stackOut_9_0 = (lva) ((Object) stackIn_9_0);
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L0;
            }
          }
          stackIn_11_0.field_s = stackIn_11_1 != 0;
          var16.field_w = param7;
          var16.field_u = param6;
          var16.b((byte) 116);
          uta.a(0, param8, param4);
          var11 = 0;
          L1: while (true) {
            L2: {
              if (var11 >= param8) {
                break L2;
              } else {
                var16.a(var15[var11], -1, var11);
                var11++;
                if (var12 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return var9;
          }
        } else {
          L3: {
            var15 = new int[param8][param4];
            var14 = var15;
            var13 = var14;
            var9 = var13;
            var17 = new lva();
            var17.field_x = (int)(param3 * 4096.0f);
            var17.field_n = param2;
            stackOut_1_0 = (lva) (var17);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (lva) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L3;
            } else {
              stackOut_2_0 = (lva) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L3;
            }
          }
          stackIn_4_0.field_s = stackIn_4_1 != 0;
          var17.field_w = param7;
          var17.field_u = param6;
          var17.b((byte) 116);
          uta.a(0, param8, param4);
          var11 = 0;
          L4: while (true) {
            L5: {
              if (var11 >= param8) {
                break L5;
              } else {
                var17.a(var15[var11], -1, var11);
                var11++;
                if (var12 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            return var9;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      var4_int = param2;
                      if (-1 != (var4_int ^ -1)) {
                        break L4;
                      } else {
                        if (var5 == 0) {
                          this.field_q = param1.d(param0 + 16);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (1 == var4_int) {
                      break L3;
                    } else {
                      if (-3 == (var4_int ^ -1)) {
                        break L2;
                      } else {
                        if (3 == var4_int) {
                          this.field_p = param1.d(121);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  this.field_r = param1.d(121);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                this.field_n = param1.d(124);
                if (var5 == 0) {
                  break L1;
                } else {
                  this.field_p = param1.d(121);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("qv.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        int[][] discarded$0 = null;
        field_o = null;
        if (!param0) {
            discarded$0 = qv.a(false, 72, -128, 0.8583102226257324f, -87, (byte) 7, -60, -76, -111);
        }
    }

    public qv() {
        super(0, true);
        this.field_q = 1365;
        this.field_n = 0;
        this.field_p = 0;
        this.field_r = 20;
    }

    static {
        field_o = null;
    }
}
