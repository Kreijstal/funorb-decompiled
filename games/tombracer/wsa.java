/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wsa extends ci {
    private int field_n;
    private int field_u;
    private int field_m;
    private int field_t;
    private int field_o;
    private int field_r;
    static su field_v;
    private int field_s;
    private int field_p;
    private int field_q;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var25 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var30 = ((wsa) this).field_h.a(param0, (byte) 109);
            var25 = var30;
            var20 = var25;
            var15 = var20;
            var13 = var15;
            var3 = var13;
            if (!((wsa) this).field_h.field_f) {
              break L0;
            } else {
              var29 = ((wsa) this).a(param0, 0, -1);
              var32 = var29[0];
              var33 = var29[1];
              var31 = var29[2];
              var8 = var30[0];
              var9 = var30[1];
              var10 = var30[2];
              var11 = 0;
              L1: while (true) {
                if (var11 >= ns.field_g) {
                  break L0;
                } else {
                  this.b(2, var31[var11], var32[var11], var33[var11]);
                  ((wsa) this).field_m = ((wsa) this).field_m + ((wsa) this).field_o;
                  ((wsa) this).field_n = ((wsa) this).field_n + ((wsa) this).field_s;
                  ((wsa) this).field_p = ((wsa) this).field_p + ((wsa) this).field_u;
                  L2: while (true) {
                    if (((wsa) this).field_m >= 0) {
                      L3: {
                        if (((wsa) this).field_n < 0) {
                          ((wsa) this).field_n = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: while (true) {
                        if (((wsa) this).field_m <= 4096) {
                          L5: {
                            if (-1 < ((wsa) this).field_p) {
                              ((wsa) this).field_p = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (((wsa) this).field_n > 4096) {
                              ((wsa) this).field_n = 4096;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (-4097 >= ((wsa) this).field_p) {
                              break L7;
                            } else {
                              ((wsa) this).field_p = 4096;
                              break L7;
                            }
                          }
                          this.a(((wsa) this).field_n, 27261, ((wsa) this).field_m, ((wsa) this).field_p);
                          var8[var11] = ((wsa) this).field_t;
                          var9[var11] = ((wsa) this).field_r;
                          var10[var11] = ((wsa) this).field_q;
                          var11++;
                          continue L1;
                        } else {
                          ((wsa) this).field_m = ((wsa) this).field_m - 4096;
                          continue L4;
                        }
                      }
                    } else {
                      ((wsa) this).field_m = ((wsa) this).field_m + 4096;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    public wsa() {
        super(1, false);
        ((wsa) this).field_u = 0;
        ((wsa) this).field_o = 0;
        ((wsa) this).field_s = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
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
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          if (param3 <= 2048) {
            stackOut_2_0 = (param0 + 4096) * param3 >> 12;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0 + (param3 + -(param0 * param3 >> 12));
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (0 < var5) {
            param2 = param2 * 6;
            var6 = param3 + (param3 - var5);
            var7 = (var5 + -var6 << 12) / var5;
            var8 = param2 >> 12;
            var9 = -(var8 << 12) + param2;
            var10 = var5;
            var10 = var7 * var10 >> 12;
            var10 = var9 * var10 >> 12;
            var11 = var6 + var10;
            var12 = var5 + -var10;
            var13 = var8;
            if (0 != var13) {
              if (var13 != 1) {
                if (var13 != 2) {
                  if (var13 == 3) {
                    ((wsa) this).field_q = var5;
                    ((wsa) this).field_r = var12;
                    ((wsa) this).field_t = var6;
                    break L1;
                  } else {
                    if (4 == var13) {
                      ((wsa) this).field_r = var6;
                      ((wsa) this).field_t = var11;
                      ((wsa) this).field_q = var5;
                      break L1;
                    } else {
                      if (var13 != 5) {
                        break L1;
                      } else {
                        ((wsa) this).field_r = var6;
                        ((wsa) this).field_q = var12;
                        ((wsa) this).field_t = var5;
                        break L1;
                      }
                    }
                  }
                } else {
                  ((wsa) this).field_r = var5;
                  ((wsa) this).field_t = var6;
                  ((wsa) this).field_q = var11;
                  break L1;
                }
              } else {
                ((wsa) this).field_q = var6;
                ((wsa) this).field_t = var12;
                ((wsa) this).field_r = var5;
                break L1;
              }
            } else {
              ((wsa) this).field_r = var11;
              ((wsa) this).field_q = var6;
              ((wsa) this).field_t = var5;
              break L1;
            }
          } else {
            ((wsa) this).field_q = param3;
            ((wsa) this).field_r = param3;
            ((wsa) this).field_t = param3;
            break L1;
          }
        }
    }

    public static void c() {
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (~param3 <= ~param2) {
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (~param3 >= ~param2) {
            stackOut_5_0 = param3;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (~param1 < ~var5) {
            stackOut_8_0 = param1;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_9_0;
          if (var6 > param1) {
            stackOut_11_0 = param1;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_12_0;
          ((wsa) this).field_p = (var6 + var5) / 2;
          var7 = var5 + -var6;
          if (((wsa) this).field_p <= 0) {
            ((wsa) this).field_n = 0;
            break L4;
          } else {
            if (((wsa) this).field_p >= 4096) {
              ((wsa) this).field_n = 0;
              break L4;
            } else {
              L5: {
                stackOut_14_0 = this;
                stackOut_14_1 = var7 << 12;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (((wsa) this).field_p > 2048) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = 8192 + -(((wsa) this).field_p * 2);
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 2 * ((wsa) this).field_p;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              ((wsa) this).field_n = stackIn_17_1 / stackIn_17_2;
              break L4;
            }
          }
        }
        L6: {
          if (var7 <= 0) {
            ((wsa) this).field_m = 0;
            break L6;
          } else {
            L7: {
              var8 = (-param2 + var5 << 12) / var7;
              var9 = (-param3 + var5 << 12) / var7;
              var10 = (-param1 + var5 << 12) / var7;
              if (~var5 == ~param2) {
                L8: {
                  stackOut_31_0 = this;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (~var6 == ~param3) {
                    stackOut_33_0 = this;
                    stackOut_33_1 = 20480 - -var10;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L8;
                  } else {
                    stackOut_32_0 = this;
                    stackOut_32_1 = -var9 + 4096;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    break L8;
                  }
                }
                ((wsa) this).field_m = stackIn_34_1;
                break L7;
              } else {
                if (param3 == var5) {
                  L9: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (param1 == var6) {
                      stackOut_29_0 = this;
                      stackOut_29_1 = var8 + 4096;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      break L9;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = -var10 + 12288;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      break L9;
                    }
                  }
                  ((wsa) this).field_m = stackIn_30_1;
                  break L7;
                } else {
                  L10: {
                    stackOut_23_0 = this;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (param2 == var6) {
                      stackOut_25_0 = this;
                      stackOut_25_1 = 12288 + var9;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L10;
                    } else {
                      stackOut_24_0 = this;
                      stackOut_24_1 = 20480 + -var8;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      break L10;
                    }
                  }
                  ((wsa) this).field_m = stackIn_26_1;
                  break L7;
                }
              }
            }
            ((wsa) this).field_m = ((wsa) this).field_m / 6;
            break L6;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  ((wsa) this).field_o = param1.b(false);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (var4_int != 2) {
                      break L1;
                    } else {
                      ((wsa) this).field_u = (param1.c((byte) 44) << 12) / 100;
                      break L1;
                    }
                  } else {
                    ((wsa) this).field_s = (param1.c((byte) 36) << 12) / 100;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("wsa.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        L0: {
          var5 = 15 & param3;
          if (var5 < 8) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (var5 >= 4) {
            L2: {
              if (12 == var5) {
                break L2;
              } else {
                if (var5 != 14) {
                  stackOut_9_0 = param4;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = param1;
            stackIn_10_0 = stackOut_8_0;
            break L1;
          } else {
            stackOut_4_0 = param0;
            stackIn_10_0 = stackOut_4_0;
            break L1;
          }
        }
        L3: {
          var7 = stackIn_10_0;
          if ((1 & var5) != 0) {
            stackOut_12_0 = -var6;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = var6;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        L4: {
          stackOut_13_0 = stackIn_13_0;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if ((var5 & 2) == 0) {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = var7;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L4;
          } else {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = -var7;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L4;
          }
        }
        return stackIn_16_0 - -stackIn_16_1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new su(11, 0, 1, 2);
    }
}
