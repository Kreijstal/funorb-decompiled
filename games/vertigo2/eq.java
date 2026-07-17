/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends ji {
    private int field_y;
    private int field_A;
    static cr field_z;
    static String field_E;
    static fe field_F;
    static String field_B;
    static String field_C;

    public static void g(int param0) {
        field_F = null;
        field_E = null;
        if (param0 != 11902) {
            eq.g(-49);
        }
        field_z = null;
        field_C = null;
        field_B = null;
    }

    public eq() {
        super(1, false);
        ((eq) this).field_y = 0;
        ((eq) this).field_A = 4096;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var3 = ((eq) this).field_x.a(param0, (byte) 82);
            if (((eq) this).field_x.field_i) {
              var4 = ((eq) this).a(0, -1, param0);
              var5 = 0;
              L1: while (true) {
                if (var5 >= we.field_M) {
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (((eq) this).field_y <= var6) {
                    if (((eq) this).field_A >= var6) {
                      var3[var5] = var6;
                      var5++;
                      continue L1;
                    } else {
                      var3[var5] = ((eq) this).field_A;
                      var5++;
                      continue L1;
                    }
                  } else {
                    var3[var5] = ((eq) this).field_y;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final static bs a(long param0, byte param1) {
        if (param1 < 80) {
            return null;
        }
        return (bs) (Object) ck.field_I.a(3661, param0);
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[][] var34 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        L0: {
          var15 = Vertigo2.field_L ? 1 : 0;
          if (param0 == -3780) {
            break L0;
          } else {
            ((eq) this).field_y = 22;
            break L0;
          }
        }
        L1: {
          var42 = ((eq) this).field_v.a(param1, param0 + 3778);
          var34 = var42;
          var26 = var34;
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (((eq) this).field_v.field_c) {
            var41 = ((eq) this).c(0, 3, param1);
            var43 = var41[0];
            var44 = var41[1];
            var45 = var41[2];
            var46 = var42[0];
            var38 = var46;
            var30 = var38;
            var22 = var30;
            var8 = var22;
            var47 = var42[1];
            var39 = var47;
            var31 = var39;
            var23 = var31;
            var9 = var23;
            var48 = var42[2];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L2: while (true) {
              if (we.field_M <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var43[var11];
                  var13 = var44[var11];
                  var14 = var45[var11];
                  if (((eq) this).field_y > var12) {
                    var8[var11] = ((eq) this).field_y;
                    break L3;
                  } else {
                    if (((eq) this).field_A >= var12) {
                      var46[var11] = var12;
                      break L3;
                    } else {
                      var8[var11] = ((eq) this).field_A;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((eq) this).field_y > var13) {
                    var9[var11] = ((eq) this).field_y;
                    break L4;
                  } else {
                    if (var13 <= ((eq) this).field_A) {
                      var47[var11] = var13;
                      break L4;
                    } else {
                      var9[var11] = ((eq) this).field_A;
                      break L4;
                    }
                  }
                }
                if (((eq) this).field_y <= var14) {
                  if (((eq) this).field_A < var14) {
                    var10[var11] = ((eq) this).field_A;
                    var11++;
                    continue L2;
                  } else {
                    var48[var11] = var14;
                    var11++;
                    continue L2;
                  }
                } else {
                  var10[var11] = ((eq) this).field_y;
                  var11++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 0L) {
            return null;
        }
        if (param1 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = bd.field_d[(int)(var7 + -(param1 * 37L))];
            if (95 == var9) {
                var10 = var6.length() + -1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(param0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int == 0) {
                ((eq) this).field_y = param2.a((byte) -11);
                break L1;
              } else {
                if (1 != var4_int) {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (1 != param2.h(-11)) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((eq) this).field_o = stackIn_11_1 != 0;
                    break L1;
                  }
                } else {
                  ((eq) this).field_A = param2.a((byte) -11);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                ((eq) this).field_y = -81;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("eq.C(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              um.field_F = oe.field_qb;
              if (param2 != 255) {
                L2: {
                  if (100 > param2) {
                    break L2;
                  } else {
                    if (param2 <= 105) {
                      var7 = args;
                      vj.a((byte) -76, var7);
                      rf.field_p = oq.a(-11, args);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                rf.field_p = fn.a(param2, true, param1);
                break L1;
              } else {
                L3: {
                  stackOut_2_0 = -2956;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (ea.field_e >= 13) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L3;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L3;
                  }
                }
                rf.field_p = gi.a(stackIn_5_0, stackIn_5_1 != 0);
                var6 = null;
                vj.a((byte) -107, (String[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("eq.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (args == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Remove name";
        field_C = "Options";
        field_E = "Waiting for levels";
    }
}
