/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends hc {
    int field_N;
    int field_I;
    int field_M;
    static boolean field_H;
    static om field_L;
    int field_F;
    int field_D;
    int field_G;
    static long field_J;
    static int field_K;

    final static void k(int param0) {
        Object var2 = null;
        de.a(kl.field_o, (String) null, 63);
    }

    final static void a(byte[] param0, boolean param1) {
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
        Object var16 = null;
        n var17 = null;
        n var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var15 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var17 = new n(param0);
              var18 = var17;
              var18.field_m = -2 + param0.length;
              qk.field_j = var18.f(1952);
              gn.field_k = new int[qk.field_j];
              bj.field_E = new boolean[qk.field_j];
              bc.field_a = new int[qk.field_j];
              if (param1) {
                break L1;
              } else {
                var16 = null;
                eb.a((byte[]) null, false);
                break L1;
              }
            }
            hn.field_b = new byte[qk.field_j][];
            gi.field_e = new int[qk.field_j];
            qe.field_a = new byte[qk.field_j][];
            qh.field_k = new int[qk.field_j];
            var18.field_m = -(qk.field_j * 8) + (-7 + param0.length);
            on.field_e = var18.f(1952);
            hd.field_c = var18.f(1952);
            var3 = 1 + (var18.e(0) & 255);
            var4 = 0;
            L2: while (true) {
              if (var4 >= qk.field_j) {
                var4 = 0;
                L3: while (true) {
                  if (qk.field_j <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= qk.field_j) {
                        var4 = 0;
                        L5: while (true) {
                          if (qk.field_j <= var4) {
                            var18.field_m = -(var3 * 3) - (-3 - (param0.length - (7 + qk.field_j * 8)));
                            qk.field_f = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var18.field_m = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= qk.field_j) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = qh.field_k[var4];
                                      var6 = bc.field_a[var4];
                                      var7 = var6 * var5;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var8 = var19;
                                      qe.field_a[var4] = var25;
                                      var26 = new byte[var7];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var9 = var20;
                                      hn.field_b[var4] = var26;
                                      var10 = 0;
                                      var11 = var18.e(0);
                                      if ((var11 & 1) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var7 <= var12) {
                                            if (0 != (2 & var11)) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$2 = var18.a(false);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_48_0 = var10;
                                                    stackIn_50_0 = stackOut_48_0;
                                                    stackIn_49_0 = stackOut_48_0;
                                                    if (var13 == -1) {
                                                      stackOut_50_0 = stackIn_50_0;
                                                      stackOut_50_1 = 0;
                                                      stackIn_51_0 = stackOut_50_0;
                                                      stackIn_51_1 = stackOut_50_1;
                                                      break L11;
                                                    } else {
                                                      stackOut_49_0 = stackIn_49_0;
                                                      stackOut_49_1 = 1;
                                                      stackIn_51_0 = stackOut_49_0;
                                                      stackIn_51_1 = stackOut_49_1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_51_0 | stackIn_51_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var18.a(false);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var12 >= var5) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        byte dupTemp$3 = var18.a(false);
                                                        var9[var12 + var5 * var13] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_36_0 = var10;
                                                        stackIn_38_0 = stackOut_36_0;
                                                        stackIn_37_0 = stackOut_36_0;
                                                        if (var14 == -1) {
                                                          stackOut_38_0 = stackIn_38_0;
                                                          stackOut_38_1 = 0;
                                                          stackIn_39_0 = stackOut_38_0;
                                                          stackIn_39_1 = stackOut_38_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_37_0 = stackIn_37_0;
                                                          stackOut_37_1 = 1;
                                                          stackIn_39_0 = stackOut_37_0;
                                                          stackIn_39_1 = stackOut_37_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_39_0 | stackIn_39_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var18.a(false);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    bj.field_E[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  qk.field_f[var4] = var18.d((byte) -124);
                                  if (qk.field_f[var4] == 0) {
                                    qk.field_f[var4] = 1;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            bc.field_a[var4] = var18.f(1952);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        qh.field_k[var4] = var18.f(1952);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    gi.field_e[var4] = var18.f(1952);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                gn.field_k[var4] = var17.f(1952);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var2;
            stackOut_54_1 = new StringBuilder().append("eb.U(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L18;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L18;
            }
          }
          throw t.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param1 + 41);
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              var8_int = -param4 + -((eb) this).field_k - (((eb) this).field_D - param1);
              var9 = -((eb) this).field_j + (-param0 + (-((eb) this).field_I + param3));
              if (((eb) this).field_N * ((eb) this).field_N > var8_int * var8_int - -(var9 * var9)) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - hf.field_c;
                  if (0.0 > var10) {
                    var10 = var10 - 3.141592653589793 / (double)((eb) this).field_M;
                    break L1;
                  } else {
                    if (var10 > 0.0) {
                      var10 = var10 + 3.141592653589793 / (double)((eb) this).field_M;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                ((eb) this).field_F = (int)(var10 * (double)((eb) this).field_M / 6.283185307179586);
                L2: while (true) {
                  if (((eb) this).field_M > ((eb) this).field_F) {
                    L3: while (true) {
                      if (0 <= ((eb) this).field_F) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((eb) this).field_F = ((eb) this).field_F + ((eb) this).field_M;
                        continue L3;
                      }
                    }
                  } else {
                    ((eb) this).field_F = ((eb) this).field_F - ((eb) this).field_M;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("eb.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    public static void a(boolean param0) {
        field_L = null;
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new om(2, 4, 4, 0);
        field_K = 0;
    }
}
