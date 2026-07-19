/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static int[] field_c;
    private int[][] field_b;
    private int field_d;
    static boolean field_f;
    private int field_a;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 127) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final byte[] a(byte[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        byte[] stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -55 % ((param1 - 6) / 44);
              if (null == this.field_b) {
                break L1;
              } else {
                var4 = 14 + (int)((long)this.field_a * (long)param0.length / (long)this.field_d);
                var16 = new int[var4];
                var14 = var16;
                var5 = var14;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (param0.length <= var8) {
                        break L4;
                      } else {
                        var9 = param0[var8];
                        var18 = this.field_b[var7];
                        stackOut_4_0 = 0;
                        stackIn_13_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          var11 = stackIn_5_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (-15 >= (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  var5[var6 - -var11] = var5[var6 - -var11] + var9 * var18[var11];
                                  var11++;
                                  if (var12 != 0) {
                                    break L6;
                                  } else {
                                    if (var12 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var7 = var7 + this.field_a;
                              var11 = var7 / this.field_d;
                              var6 = var6 + var11;
                              var7 = var7 - var11 * this.field_d;
                              var8++;
                              break L6;
                            }
                            if (var12 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    param0 = new byte[var4];
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  }
                  var8 = stackIn_13_0;
                  L8: while (true) {
                    if (var8 >= var4) {
                      break L1;
                    } else {
                      L9: {
                        L10: {
                          var9 = 32768 + var16[var8] >> 488498128;
                          if (127 >= (var9 ^ -1)) {
                            break L10;
                          } else {
                            param0[var8] = (byte)-128;
                            if (var12 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (-128 > (var9 ^ -1)) {
                            break L11;
                          } else {
                            param0[var8] = (byte)var9;
                            if (var12 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        param0[var8] = (byte)127;
                        break L9;
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L8;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            stackOut_23_0 = (byte[]) (param0);
            stackIn_24_0 = stackOut_23_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ci.A(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final int a(int param0, int param1) {
        if (param1 != 18308) {
          return -5;
        } else {
          L0: {
            if (null == this.field_b) {
              break L0;
            } else {
              param0 = 6 - -(int)((long)this.field_a * (long)param0 / (long)this.field_d);
              break L0;
            }
          }
          return param0;
        }
    }

    final int b(int param0, int param1) {
        int discarded$2 = 0;
        L0: {
          if (null == this.field_b) {
            break L0;
          } else {
            param0 = (int)((long)this.field_a * (long)param0 / (long)this.field_d);
            break L0;
          }
        }
        if (param1 != 14698) {
          discarded$2 = this.a(6, 33);
          return param0;
        } else {
          return param0;
        }
    }

    ci(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        var16 = fleas.field_A ? 1 : 0;
        if (param1 != param0) {
          var3 = vc.a(param1, -1, param0);
          param0 = param0 / var3;
          param1 = param1 / var3;
          this.field_d = param0;
          this.field_a = param1;
          this.field_b = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_4_0 >= param0) {
                return;
              } else {
                var5 = this.field_b[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (var6 - 7.0));
                if (var16 == 0) {
                  L2: {
                    if (var8 >= 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = (int)Math.ceil(var6 + 7.0);
                    if (-15 <= (var9 ^ -1)) {
                      break L3;
                    } else {
                      var9 = 14;
                      break L3;
                    }
                  }
                  var10 = (double)param1 / (double)param0;
                  L4: while (true) {
                    if (var9 <= var8) {
                      var4++;
                      continue L0;
                    } else {
                      var12 = 3.141592653589793 * (-var6 + (double)var8);
                      var14 = var10;
                      stackOut_13_0 = (-0.0001 < var12 ? -1 : (-0.0001 == var12 ? 0 : 1));
                      stackIn_4_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_14_0 > 0) {
                              break L6;
                            } else {
                              if (0.0001 >= var12) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var14 = var14 * (Math.sin(var12) / var12);
                          break L5;
                        }
                        var14 = var14 * (Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46 + 0.54);
                        var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                        var8++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        field_f = true;
        field_c = new int[150];
    }
}
