/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends rf {
    static String field_D;
    byte field_G;
    dh field_H;
    static int[] field_E;
    int field_F;

    final static nb a(long param0, boolean param1, int param2, String param3, String param4) {
        RuntimeException var6 = null;
        ml stackIn_10_0 = null;
        mi stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        hb stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_11_0 = null;
        ml stackOut_9_0 = null;
        hb stackOut_16_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param0) {
                break L1;
              } else {
                if (null != param4) {
                  stackOut_11_0 = new mi(param4, param3);
                  stackIn_12_0 = stackOut_11_0;
                  return (nb) (Object) stackIn_12_0;
                } else {
                  break L1;
                }
              }
            }
            if (param1) {
              stackOut_9_0 = new ml(param0, param3);
              stackIn_10_0 = stackOut_9_0;
              return (nb) (Object) stackIn_10_0;
            } else {
              if (param2 <= -49) {
                stackOut_16_0 = new hb(param0, param3);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (nb) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("nh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L2;
            }
          }
          L3: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return (nb) (Object) stackIn_17_0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 30937) {
                break L1;
              } else {
                String discarded$2 = nh.a(-94, (CharSequence) null);
                break L1;
              }
            }
            field_D = null;
            field_E = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "nh.E(" + param0 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        String stackOut_39_0 = null;
        Object stackOut_37_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int <= var4) {
                    break L4;
                  } else {
                    var5 = param1.charAt(var4);
                    stackOut_7_0 = ~var5;
                    stackOut_7_1 = -66;
                    stackIn_36_0 = stackOut_7_0;
                    stackIn_36_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L7;
                            } else {
                              if (90 >= var5) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (var5 < 97) {
                                  break L10;
                                } else {
                                  if (var5 <= 122) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (48 > var5) {
                                break L8;
                              } else {
                                if (var5 > 57) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var3[var4] = (char) var5;
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                          var3[var4] = '_';
                          if (var6 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        var3[var4] = (char)(var5 + 32);
                        break L5;
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_35_0 = param0;
                stackOut_35_1 = -31621;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L3;
              }
              if (stackIn_36_0 == stackIn_36_1) {
                stackOut_39_0 = new String(var3);
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                stackOut_37_0 = null;
                stackIn_38_0 = stackOut_37_0;
                return (String) (Object) stackIn_38_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("nh.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L11;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ')');
        }
        return stackIn_40_0;
    }

    final static boolean a(fa param0, fa param1, boolean param2, fa param3) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.a(0)) {
                break L1;
              } else {
                if (!param3.a(-3, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (!param0.a(0)) {
                      break L2;
                    } else {
                      if (param0.a(-3, "commonui")) {
                        if (!param2) {
                          L3: {
                            if (!param1.a(0)) {
                              break L3;
                            } else {
                              if (param1.a(-3, "button.gif")) {
                                stackOut_23_0 = 1;
                                stackIn_24_0 = stackOut_23_0;
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("nh.A(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L4;
            }
          }
          L5: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L5;
            }
          }
          L6: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final byte[] b(boolean param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (((nh) this).field_A) {
                  break L1;
                } else {
                  if (-((nh) this).field_G + ((nh) this).field_H.field_i.length <= ((nh) this).field_H.field_k) {
                    stackOut_9_0 = ((nh) this).field_H.field_i;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "nh.B(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    nh() {
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((nh) this).field_H != null) {
              if (param0 == 0) {
                stackOut_6_0 = 100 * ((nh) this).field_H.field_k / (((nh) this).field_H.field_i.length - ((nh) this).field_G);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = -30;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "nh.C(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[]{1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
}
