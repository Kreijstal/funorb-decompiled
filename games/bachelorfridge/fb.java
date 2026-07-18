/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends td {
    static int field_p;
    static kv field_r;
    static String field_q;

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_r = null;
              if (param0 == -91) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "fb.C(" + param0 + ')');
        }
    }

    fb(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var3_ref = null;
        fna var4 = null;
        int[][] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        ko var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_35_0 = false;
        fna stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_30_0 = 0;
        boolean stackOut_34_0 = false;
        fna stackOut_40_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var3_ref = ((fb) this).field_h.a(40, param0);
            var4 = new fna(((fb) this).field_g, new nq(var3_ref));
            var5 = new int[param0.g((byte) 79)][2];
            var6 = 0;
            var7_int = 0;
            L1: while (true) {
              stackOut_2_0 = ~param0.field_d;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= ~var7_int) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_17_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        var8_int = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if (7 <= var8_int) {
                              break L6;
                            } else {
                              stackOut_7_0 = this.a(param0.field_S[var7_int].field_b[var8_int], -8, param0);
                              stackIn_3_0 = stackOut_7_0 ? 1 : 0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var12 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  L8: {
                                    if (stackIn_8_0) {
                                      break L8;
                                    } else {
                                      if (var12 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var5[var6] = new int[2];
                                  var6++;
                                  break L7;
                                }
                                var8_int++;
                                if (var12 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var7_int++;
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = var5.length;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                }
                var7 = new int[stackIn_17_0];
                var8_int = 0;
                L9: while (true) {
                  L10: {
                    if (var8_int >= var7.length) {
                      break L10;
                    } else {
                      var7[var8_int] = var8_int;
                      var8_int++;
                      if (var12 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var8 = new ko(new int[1]);
                  var6 = 0;
                  var9 = 0;
                  L11: while (true) {
                    L12: {
                      L13: {
                        if (~var7.length >= ~var9) {
                          break L13;
                        } else {
                          var10 = var8.a(-21000, var7.length);
                          var11 = var7[var10];
                          var7[var10] = var7[var9];
                          var7[var9] = var11;
                          var9++;
                          if (var12 != 0) {
                            break L12;
                          } else {
                            if (var12 == 0) {
                              continue L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var9 = 0;
                      break L12;
                    }
                    L14: {
                      if (param1 == 3) {
                        break L14;
                      } else {
                        field_p = 40;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      stackOut_30_0 = ~param0.field_d;
                      stackIn_31_0 = stackOut_30_0;
                      L16: while (true) {
                        L17: {
                          if (stackIn_31_0 >= ~var9) {
                            break L17;
                          } else {
                            var10 = 0;
                            L18: while (true) {
                              L19: {
                                if (var10 >= 7) {
                                  break L19;
                                } else {
                                  stackOut_34_0 = this.a(param0.field_S[var9].field_b[var10], -8, param0);
                                  stackIn_31_0 = stackOut_34_0 ? 1 : 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  if (var12 != 0) {
                                    continue L16;
                                  } else {
                                    L20: {
                                      if (!stackIn_35_0) {
                                        break L20;
                                      } else {
                                        var4.field_o.a((bw) (Object) new cn(new nq(param0.field_S[var9].field_b[var10]), var5[var7[var6]][0], var5[var7[var6]][1]), true);
                                        var6++;
                                        break L20;
                                      }
                                    }
                                    var10++;
                                    if (var12 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var9++;
                              if (var12 == 0) {
                                continue L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        stackOut_40_0 = (fna) var4;
                        stackIn_41_0 = stackOut_40_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("fb.A(");
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L21;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L21;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_41_0;
    }

    private final boolean a(aga param0, int param1, op param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (!param0.i(param1 + 116)) {
                if (param0.a(32, (byte) 60)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  if (param1 == -8) {
                    if (param2.b(false, param2.field_a[param0.field_x][param0.field_J].field_n) != -1) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("fb.B(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L1;
            }
          }
          L2: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "***No Target!***";
    }
}
