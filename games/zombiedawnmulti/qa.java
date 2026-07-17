/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qa extends br {
    static String field_m;
    static String field_g;
    qa field_p;
    static String field_n;
    static String field_j;
    static long field_i;
    static int field_h;
    static int field_o;
    qa field_k;
    static int[] field_f;
    long field_l;

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_n = null;
        field_g = null;
        field_f = null;
    }

    final boolean c(int param0) {
        if (null == ((qa) this).field_p) {
            return false;
        }
        if (param0 != 0) {
            field_i = -71L;
            return true;
        }
        return true;
    }

    final long d(int param0) {
        if (param0 > -60) {
            return -16L;
        }
        return ((qa) this).field_l;
    }

    final void a(byte param0, long param1) {
        if (!(null == ((qa) this).field_p)) {
            throw new RuntimeException();
        }
        ((qa) this).field_l = param1;
        if (param0 != -85) {
            field_g = null;
        }
    }

    final void a(int param0) {
        if (!(((qa) this).field_p != null)) {
            return;
        }
        ((qa) this).field_p.field_k = ((qa) this).field_k;
        ((qa) this).field_k.field_p = ((qa) this).field_p;
        if (param0 != -4564) {
            ((qa) this).a((byte) -27, 73L);
        }
        ((qa) this).field_k = null;
        ((qa) this).field_p = null;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        ja[] var10 = null;
        ja[] var11_ref_ja__ = null;
        int var11 = 0;
        int var12 = 0;
        ja var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = 3;
        var10 = new ja[]{new ja(var9, var9), new ja(3, var9), new ja(var9, var9), new ja(var9, 3), new ja(64, 64), new ja(var9, 3), new ja(var9, var9), new ja(3, var9), new ja(var9, var9)};
        var11_ref_ja__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_ja__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_B[(-var12 + (var9 + -1)) * 3 - -var11] = 65793;
                                var10[3].field_B[var9 + -1 + -var12 + var9 * var11] = 65793;
                                var10[7].field_B[3 * var12 + var11] = 65793;
                                var10[5].field_B[var9 * var11 + var12] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 > var12) {
                            var10[7].field_B[var11 + (-1 + var9 + -var12) * 3] = 0;
                            var10[5].field_B[var9 - (1 + var12 - var9 * var11)] = 0;
                            var10[1].field_B[var12 * 3 + var11] = 0;
                            var10[3].field_B[var12 + var9 * var11] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 > var12) {
                        var10[0].field_B[var12 - -(var11 * var9)] = 0;
                        var10[0].field_B[var9 * var12 - -var11] = 0;
                        if (var9 + -var11 > var12) {
                          var10[2].field_B[var12 - -(var9 * var11)] = 0;
                          var10[6].field_B[var11 + var9 * var12] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[(var9 - (var11 - -1)) * var9 - -var12] = 0;
                    var10[8].field_B[var12 + var9 * (-1 + (var9 - var11))] = 0;
                    var10[2].field_B[var12 * var9 - -var9 + (-1 - var11)] = 0;
                    var10[8].field_B[-var11 + (-1 + var9 + var12 * var9)] = 0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_ja__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_B.length) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var4 = 11 % ((-85 - param0) / 36);
            var3 = 1;
            L1: while (true) {
              if (param1.length() <= var3) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                if (var2_int == param1.charAt(var3)) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("qa.B(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    protected qa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Find opponent";
        field_j = "Shortcut Reference";
        field_m = "Please enter your date of birth to enable chat:";
        field_g = "Account created successfully!";
        field_o = 15;
        field_f = new int[4];
    }
}
