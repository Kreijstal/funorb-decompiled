/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class qla {
    int field_h;
    int field_a;
    private byte[] field_e;
    int field_d;
    int field_g;
    private byte[][] field_c;
    static Calendar field_b;
    static kea field_f;
    static String field_i;

    final static eua a(boolean param0, jea param1, jea param2, br param3, jea param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        eua[] var11 = null;
        int var12 = 0;
        br var13_ref_br = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wua var16 = null;
        int var17 = 0;
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        eua stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        eua stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == param3) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (eua) (Object) stackIn_5_0;
            } else {
              L1: {
                if (param3.field_q == null) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_7_0 = param3.field_q.length;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_10_0;
                if (null == param3.field_l) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = param3.field_l.length;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_14_0;
                var7 = var6 + var5_int;
                var8 = new String[var7];
                var9 = new char[var7];
                var10 = new int[var7];
                if (param0) {
                  break L3;
                } else {
                  field_b = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var11 = new eua[var7];
                  if (null != param3.field_q) {
                    var12 = 0;
                    L6: while (true) {
                      if (~param3.field_q.length >= ~var12) {
                        break L5;
                      } else {
                        var13_ref_br = taa.field_g.a((byte) 98, param3.field_q[var12]);
                        var8[var12] = var13_ref_br.field_n;
                        var9[var12] = param3.field_k[var12];
                        var11[var12] = qla.a(param0, param1, param2, var13_ref_br, param4);
                        var12++;
                        if (var17 != 0) {
                          break L4;
                        } else {
                          if (var17 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                if (null == param3.field_l) {
                  break L4;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (~var14 <= ~param3.field_l.length) {
                      break L4;
                    } else {
                      L8: {
                        L9: {
                          var15 = param3.field_l[var14];
                          if (var15 != -1) {
                            break L9;
                          } else {
                            var8[var14 + var12] = iw.field_a;
                            var9[var14 + var12] = param3.field_o[var14];
                            var10[var14 + var12] = param3.field_l[var14];
                            if (var17 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var16 = qu.field_a.a(false, var15);
                          var8[var12 - -var14] = var16.b((byte) -5);
                          var9[var12 + var14] = param3.field_o[var14];
                          if (0 >= var9[var12 - -var14]) {
                            var13 = (char)(var13 + 1);
                            var9[var14 + var12] = (char) var13;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var10[var14 + var12] = param3.field_l[var14];
                        break L8;
                      }
                      var14++;
                      if (var17 == 0) {
                        continue L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_39_0 = new eua(0L, param4, param2, param1, var11, var10, var8, var9);
              stackIn_40_0 = stackOut_39_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("qla.H(").append(param0).append(',');
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
          L12: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L12;
            }
          }
          L13: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L13;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L13;
            }
          }
          L14: {
            stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param4 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
        return stackIn_40_0;
    }

    final static boolean a(String param0) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          try {
            if (!fia.field_j.startsWith("win")) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (param0.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~param0.length() >= ~var3) {
                      break L3;
                    } else {
                      stackOut_14_0 = -1;
                      stackOut_14_1 = var2.indexOf((int) param0.charAt(var3));
                      stackIn_23_0 = stackOut_14_0;
                      stackIn_23_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_15_0 == stackIn_15_1) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_22_0 = 20;
                  stackOut_22_1 = 5;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L2;
                }
                var3 = stackIn_23_0 / stackIn_23_1;
                Process discarded$1 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                stackOut_23_0 = 1;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_25_0 = 0;
            stackIn_26_0 = stackOut_25_0;
            return stackIn_26_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2_ref2;
            stackOut_27_1 = new StringBuilder().append("qla.K(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + -127 + ')');
        }
    }

    final int a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -6773) {
                break L1;
              } else {
                ((qla) this).field_e = null;
                break L1;
              }
            }
            if (((qla) this).field_c != null) {
              stackOut_6_0 = ((qla) this).field_c[param0][param2];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "qla.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    private final int a(String param0, nh[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_71_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                var4_int = -1;
                var5 = -1;
                if (param2 < -60) {
                  break L1;
                } else {
                  ((qla) this).field_e = null;
                  break L1;
                }
              }
              var6 = 0;
              var7 = param0.length();
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var7 >= ~var8) {
                      break L4;
                    } else {
                      var9 = param0.charAt(var8);
                      stackOut_11_0 = 60;
                      stackIn_72_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var12 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_12_0 == var9) {
                              var4_int = var8;
                              if (var12 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (var9 != 62) {
                              break L7;
                            } else {
                              if (var4_int == -1) {
                                break L7;
                              } else {
                                L8: {
                                  var10 = param0.substring(1 + var4_int, var8);
                                  var4_int = -1;
                                  if (var10.equals((Object) (Object) "lt")) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (!var10.equals((Object) (Object) "gt")) {
                                        break L9;
                                      } else {
                                        var9 = 62;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var10.equals((Object) (Object) "nbsp")) {
                                        break L10;
                                      } else {
                                        L11: {
                                          if (!var10.equals((Object) (Object) "shy")) {
                                            break L11;
                                          } else {
                                            var9 = 173;
                                            if (var12 == 0) {
                                              break L7;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (var10.equals((Object) (Object) "times")) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (!var10.equals((Object) (Object) "euro")) {
                                                break L13;
                                              } else {
                                                var9 = 8364;
                                                if (var12 == 0) {
                                                  break L7;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            L14: {
                                              if (var10.equals((Object) (Object) "copy")) {
                                                break L14;
                                              } else {
                                                L15: {
                                                  if (!var10.equals((Object) (Object) "reg")) {
                                                    break L15;
                                                  } else {
                                                    var9 = 174;
                                                    if (var12 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                if (!var10.startsWith("img=")) {
                                                  break L5;
                                                } else {
                                                  if (param1 == null) {
                                                    break L5;
                                                  } else {
                                                    try {
                                                      L16: {
                                                        int discarded$1 = 70;
                                                        var11_int = jb.a((CharSequence) (Object) var10.substring(4));
                                                        var6 = var6 + param1[var11_int].d();
                                                        var5 = -1;
                                                        decompiledRegionSelector0 = 0;
                                                        break L16;
                                                      }
                                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                      decompiledCaughtException = decompiledCaughtParameter0;
                                                      L17: {
                                                        var11 = (Exception) (Object) decompiledCaughtException;
                                                        if (var12 == 0) {
                                                          decompiledRegionSelector0 = 0;
                                                          break L17;
                                                        } else {
                                                          decompiledRegionSelector0 = 1;
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                    if (decompiledRegionSelector0 == 0) {
                                                      break L5;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var9 = 169;
                                            if (var12 == 0) {
                                              break L7;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var9 = 215;
                                        if (var12 == 0) {
                                          break L7;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var9 = 160;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var9 = 60;
                                break L7;
                              }
                            }
                          }
                          if (-1 != var4_int) {
                            break L5;
                          } else {
                            L18: {
                              var6 = var6 + (((qla) this).field_e[io.a(-377, (char) var9) & 255] & 255);
                              if (((qla) this).field_c == null) {
                                break L18;
                              } else {
                                if (var5 == -1) {
                                  break L18;
                                } else {
                                  var6 = var6 + ((qla) this).field_c[var5][var9];
                                  break L18;
                                }
                              }
                            }
                            var5 = var9;
                            break L5;
                          }
                        }
                        var8++;
                        if (var12 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_71_0 = var6;
                  stackIn_72_0 = stackOut_71_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var4;
            stackOut_73_1 = new StringBuilder().append("qla.C(");
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L19;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L19;
            }
          }
          L20: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L20;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L20;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param2 + ')');
        }
        return stackIn_72_0;
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                int discarded$2 = ((qla) this).a(82, -75);
                break L1;
              }
            }
            stackOut_3_0 = ((qla) this).field_e[param1] & 255;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "qla.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int a(String param0, int param1, String[] param2, nh[] param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        Exception var20 = null;
        int var20_int = 0;
        int var21 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_141_0 = 0;
        int[] stackIn_141_1 = null;
        int stackIn_142_0 = 0;
        int[] stackIn_142_1 = null;
        int stackIn_142_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_185_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_138_0 = 0;
        int[] stackOut_138_1 = null;
        int stackOut_141_0 = 0;
        int[] stackOut_141_1 = null;
        int stackOut_141_2 = 0;
        int stackOut_139_0 = 0;
        int[] stackOut_139_1 = null;
        int stackOut_139_2 = 0;
        int stackOut_149_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        RuntimeException stackOut_172_0 = null;
        StringBuilder stackOut_172_1 = null;
        String stackOut_172_2 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        RuntimeException stackOut_173_0 = null;
        StringBuilder stackOut_173_1 = null;
        RuntimeException stackOut_176_0 = null;
        StringBuilder stackOut_176_1 = null;
        String stackOut_176_2 = null;
        RuntimeException stackOut_174_0 = null;
        StringBuilder stackOut_174_1 = null;
        String stackOut_174_2 = null;
        RuntimeException stackOut_177_0 = null;
        StringBuilder stackOut_177_1 = null;
        RuntimeException stackOut_180_0 = null;
        StringBuilder stackOut_180_1 = null;
        String stackOut_180_2 = null;
        RuntimeException stackOut_178_0 = null;
        StringBuilder stackOut_178_1 = null;
        String stackOut_178_2 = null;
        RuntimeException stackOut_181_0 = null;
        StringBuilder stackOut_181_1 = null;
        RuntimeException stackOut_184_0 = null;
        StringBuilder stackOut_184_1 = null;
        String stackOut_184_2 = null;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        String stackOut_182_2 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var6_int = 0;
                var7 = 0;
                var8 = -1;
                var9 = 0;
                var10 = 0;
                var11 = -1;
                var12 = -1;
                var13 = 0;
                var14 = param0.length();
                if (param1 <= -89) {
                  break L1;
                } else {
                  ((qla) this).field_d = -106;
                  break L1;
                }
              }
              var15 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var15 >= var14) {
                      break L4;
                    } else {
                      var16 = 255 & io.a(-377, param0.charAt(var15));
                      var17 = 0;
                      stackOut_9_0 = 60;
                      stackOut_9_1 = var16;
                      stackIn_164_0 = stackOut_9_0;
                      stackIn_164_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var21 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_10_0 != stackIn_10_1) {
                              break L6;
                            } else {
                              var11 = var15;
                              if (var21 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              if (var11 == -1) {
                                break L8;
                              } else {
                                L9: {
                                  if (var16 == 62) {
                                    break L9;
                                  } else {
                                    if (var21 == 0) {
                                      break L5;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  L11: {
                                    var18 = var11;
                                    var19 = param0.substring(var11 - -1, var15);
                                    var11 = -1;
                                    if (var19.equals((Object) (Object) "br")) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var19.equals((Object) (Object) "lt")) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var19.equals((Object) (Object) "gt")) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (!var19.equals((Object) (Object) "nbsp")) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    var17 = var17 + ((qla) this).a(255, 160);
                                                    if (null == ((qla) this).field_c) {
                                                      break L15;
                                                    } else {
                                                      if (-1 == var12) {
                                                        break L15;
                                                      } else {
                                                        var17 = var17 + ((qla) this).field_c[var12][160];
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  var12 = 160;
                                                  if (var21 == 0) {
                                                    break L10;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L16: {
                                                if (var19.equals((Object) (Object) "shy")) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (!var19.equals((Object) (Object) "times")) {
                                                      break L17;
                                                    } else {
                                                      L18: {
                                                        var17 = var17 + ((qla) this).a(255, 215);
                                                        if (null == ((qla) this).field_c) {
                                                          break L18;
                                                        } else {
                                                          if (var12 != -1) {
                                                            var17 = var17 + ((qla) this).field_c[var12][215];
                                                            break L18;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                      var12 = 215;
                                                      if (var21 == 0) {
                                                        break L10;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L19: {
                                                    if (var19.equals((Object) (Object) "euro")) {
                                                      break L19;
                                                    } else {
                                                      L20: {
                                                        if (!var19.equals((Object) (Object) "copy")) {
                                                          break L20;
                                                        } else {
                                                          L21: {
                                                            var17 = var17 + ((qla) this).a(255, 169);
                                                            if (((qla) this).field_c == null) {
                                                              break L21;
                                                            } else {
                                                              if (var12 != -1) {
                                                                var17 = var17 + ((qla) this).field_c[var12][169];
                                                                break L21;
                                                              } else {
                                                                break L21;
                                                              }
                                                            }
                                                          }
                                                          var12 = 169;
                                                          if (var21 == 0) {
                                                            break L10;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if (var19.equals((Object) (Object) "reg")) {
                                                          break L22;
                                                        } else {
                                                          if (!var19.startsWith("img=")) {
                                                            break L10;
                                                          } else {
                                                            if (null != param3) {
                                                              try {
                                                                L23: {
                                                                  int discarded$1 = 70;
                                                                  var20_int = jb.a((CharSequence) (Object) var19.substring(4));
                                                                  var17 = var17 + param3[var20_int].d();
                                                                  var12 = -1;
                                                                  decompiledRegionSelector0 = 0;
                                                                  break L23;
                                                                }
                                                              } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                                decompiledCaughtException = decompiledCaughtParameter0;
                                                                L24: {
                                                                  var20 = (Exception) (Object) decompiledCaughtException;
                                                                  if (var21 == 0) {
                                                                    decompiledRegionSelector0 = 0;
                                                                    break L24;
                                                                  } else {
                                                                    decompiledRegionSelector0 = 1;
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              if (decompiledRegionSelector0 == 0) {
                                                                break L10;
                                                              } else {
                                                                break L22;
                                                              }
                                                            } else {
                                                              break L10;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L25: {
                                                        var17 = var17 + ((qla) this).a(255, 174);
                                                        if (((qla) this).field_c == null) {
                                                          break L25;
                                                        } else {
                                                          if (var12 != -1) {
                                                            var17 = var17 + ((qla) this).field_c[var12][174];
                                                            break L25;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      var12 = 174;
                                                      if (var21 == 0) {
                                                        break L10;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L26: {
                                                    var17 = var17 + ((qla) this).a(255, 8364);
                                                    if (null == ((qla) this).field_c) {
                                                      break L26;
                                                    } else {
                                                      if (-1 == var12) {
                                                        break L26;
                                                      } else {
                                                        var17 = var17 + ((qla) this).field_c[var12][8364];
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  var12 = 8364;
                                                  if (var21 == 0) {
                                                    break L10;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              L27: {
                                                var17 = var17 + ((qla) this).a(255, 173);
                                                if (((qla) this).field_c == null) {
                                                  break L27;
                                                } else {
                                                  if (var12 == -1) {
                                                    break L27;
                                                  } else {
                                                    var17 = var17 + ((qla) this).field_c[var12][173];
                                                    break L27;
                                                  }
                                                }
                                              }
                                              var12 = 173;
                                              if (var21 == 0) {
                                                break L10;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L28: {
                                            var17 = var17 + ((qla) this).a(255, 62);
                                            if (((qla) this).field_c == null) {
                                              break L28;
                                            } else {
                                              if (-1 == var12) {
                                                break L28;
                                              } else {
                                                var17 = var17 + ((qla) this).field_c[var12][62];
                                                break L28;
                                              }
                                            }
                                          }
                                          var12 = 62;
                                          if (var21 == 0) {
                                            break L10;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L29: {
                                        var17 = var17 + ((qla) this).a(255, 60);
                                        if (null == ((qla) this).field_c) {
                                          break L29;
                                        } else {
                                          if (var12 == -1) {
                                            break L29;
                                          } else {
                                            var17 = var17 + ((qla) this).field_c[var12][60];
                                            break L29;
                                          }
                                        }
                                      }
                                      var12 = 60;
                                      if (var21 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param2[var13] = param0.substring(var7, 1 + var15);
                                  var13++;
                                  if (param2.length > var13) {
                                    var8 = -1;
                                    var7 = 1 + var15;
                                    var6_int = 0;
                                    var12 = -1;
                                    if (var21 == 0) {
                                      break L5;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    stackOut_116_0 = 0;
                                    stackIn_117_0 = stackOut_116_0;
                                    return stackIn_117_0;
                                  }
                                }
                                var16 = -1;
                                if (var21 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L30: {
                              var17 = var17 + ((qla) this).a(255, var16);
                              var18 = var15;
                              if (((qla) this).field_c == null) {
                                break L30;
                              } else {
                                if (var12 != -1) {
                                  var17 = var17 + ((qla) this).field_c[var12][var16];
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            var12 = var16;
                            break L7;
                          }
                          if (var17 > 0) {
                            var6_int = var6_int + var17;
                            if (param4 == null) {
                              break L5;
                            } else {
                              L31: {
                                if (var16 == 32) {
                                  var8 = var15;
                                  var10 = 1;
                                  var9 = var6_int;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              L32: {
                                stackOut_138_0 = var6_int;
                                stackOut_138_1 = (int[]) param4;
                                stackIn_141_0 = stackOut_138_0;
                                stackIn_141_1 = stackOut_138_1;
                                stackIn_139_0 = stackOut_138_0;
                                stackIn_139_1 = stackOut_138_1;
                                if (var13 < param4.length) {
                                  stackOut_141_0 = stackIn_141_0;
                                  stackOut_141_1 = (int[]) (Object) stackIn_141_1;
                                  stackOut_141_2 = var13;
                                  stackIn_142_0 = stackOut_141_0;
                                  stackIn_142_1 = stackOut_141_1;
                                  stackIn_142_2 = stackOut_141_2;
                                  break L32;
                                } else {
                                  stackOut_139_0 = stackIn_139_0;
                                  stackOut_139_1 = (int[]) (Object) stackIn_139_1;
                                  stackOut_139_2 = -1 + param4.length;
                                  stackIn_142_0 = stackOut_139_0;
                                  stackIn_142_1 = stackOut_139_1;
                                  stackIn_142_2 = stackOut_139_2;
                                  break L32;
                                }
                              }
                              L33: {
                                if (stackIn_142_0 > stackIn_142_1[stackIn_142_2]) {
                                  L34: {
                                    if (var8 >= 0) {
                                      break L34;
                                    } else {
                                      param2[var13] = param0.substring(var7, var18);
                                      var13++;
                                      if (~var13 > ~param2.length) {
                                        var6_int = var17;
                                        var8 = -1;
                                        var12 = -1;
                                        var7 = var18;
                                        if (var21 == 0) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      } else {
                                        stackOut_149_0 = 0;
                                        stackIn_150_0 = stackOut_149_0;
                                        return stackIn_150_0;
                                      }
                                    }
                                  }
                                  param2[var13] = param0.substring(var7, 1 + var8 - var10);
                                  var13++;
                                  if (~param2.length < ~var13) {
                                    var7 = 1 + var8;
                                    var6_int = var6_int - var9;
                                    var8 = -1;
                                    var12 = -1;
                                    break L33;
                                  } else {
                                    stackOut_155_0 = 0;
                                    stackIn_156_0 = stackOut_155_0;
                                    return stackIn_156_0;
                                  }
                                } else {
                                  break L33;
                                }
                              }
                              if (var16 == 45) {
                                var8 = var15;
                                var9 = var6_int;
                                var10 = 0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var15++;
                        if (var21 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_163_0 = ~var7;
                  stackOut_163_1 = ~param0.length();
                  stackIn_164_0 = stackOut_163_0;
                  stackIn_164_1 = stackOut_163_1;
                  break L3;
                }
                L35: {
                  if (stackIn_164_0 <= stackIn_164_1) {
                    break L35;
                  } else {
                    param2[var13] = param0.substring(var7, param0.length());
                    var13++;
                    break L35;
                  }
                }
                stackOut_167_0 = var13;
                stackIn_168_0 = stackOut_167_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L36: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_169_0 = (RuntimeException) var6;
            stackOut_169_1 = new StringBuilder().append("qla.J(");
            stackIn_172_0 = stackOut_169_0;
            stackIn_172_1 = stackOut_169_1;
            stackIn_170_0 = stackOut_169_0;
            stackIn_170_1 = stackOut_169_1;
            if (param0 == null) {
              stackOut_172_0 = (RuntimeException) (Object) stackIn_172_0;
              stackOut_172_1 = (StringBuilder) (Object) stackIn_172_1;
              stackOut_172_2 = "null";
              stackIn_173_0 = stackOut_172_0;
              stackIn_173_1 = stackOut_172_1;
              stackIn_173_2 = stackOut_172_2;
              break L36;
            } else {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "{...}";
              stackIn_173_0 = stackOut_170_0;
              stackIn_173_1 = stackOut_170_1;
              stackIn_173_2 = stackOut_170_2;
              break L36;
            }
          }
          L37: {
            stackOut_173_0 = (RuntimeException) (Object) stackIn_173_0;
            stackOut_173_1 = ((StringBuilder) (Object) stackIn_173_1).append(stackIn_173_2).append(',').append(param1).append(',');
            stackIn_176_0 = stackOut_173_0;
            stackIn_176_1 = stackOut_173_1;
            stackIn_174_0 = stackOut_173_0;
            stackIn_174_1 = stackOut_173_1;
            if (param2 == null) {
              stackOut_176_0 = (RuntimeException) (Object) stackIn_176_0;
              stackOut_176_1 = (StringBuilder) (Object) stackIn_176_1;
              stackOut_176_2 = "null";
              stackIn_177_0 = stackOut_176_0;
              stackIn_177_1 = stackOut_176_1;
              stackIn_177_2 = stackOut_176_2;
              break L37;
            } else {
              stackOut_174_0 = (RuntimeException) (Object) stackIn_174_0;
              stackOut_174_1 = (StringBuilder) (Object) stackIn_174_1;
              stackOut_174_2 = "{...}";
              stackIn_177_0 = stackOut_174_0;
              stackIn_177_1 = stackOut_174_1;
              stackIn_177_2 = stackOut_174_2;
              break L37;
            }
          }
          L38: {
            stackOut_177_0 = (RuntimeException) (Object) stackIn_177_0;
            stackOut_177_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
            stackIn_180_0 = stackOut_177_0;
            stackIn_180_1 = stackOut_177_1;
            stackIn_178_0 = stackOut_177_0;
            stackIn_178_1 = stackOut_177_1;
            if (param3 == null) {
              stackOut_180_0 = (RuntimeException) (Object) stackIn_180_0;
              stackOut_180_1 = (StringBuilder) (Object) stackIn_180_1;
              stackOut_180_2 = "null";
              stackIn_181_0 = stackOut_180_0;
              stackIn_181_1 = stackOut_180_1;
              stackIn_181_2 = stackOut_180_2;
              break L38;
            } else {
              stackOut_178_0 = (RuntimeException) (Object) stackIn_178_0;
              stackOut_178_1 = (StringBuilder) (Object) stackIn_178_1;
              stackOut_178_2 = "{...}";
              stackIn_181_0 = stackOut_178_0;
              stackIn_181_1 = stackOut_178_1;
              stackIn_181_2 = stackOut_178_2;
              break L38;
            }
          }
          L39: {
            stackOut_181_0 = (RuntimeException) (Object) stackIn_181_0;
            stackOut_181_1 = ((StringBuilder) (Object) stackIn_181_1).append(stackIn_181_2).append(',');
            stackIn_184_0 = stackOut_181_0;
            stackIn_184_1 = stackOut_181_1;
            stackIn_182_0 = stackOut_181_0;
            stackIn_182_1 = stackOut_181_1;
            if (param4 == null) {
              stackOut_184_0 = (RuntimeException) (Object) stackIn_184_0;
              stackOut_184_1 = (StringBuilder) (Object) stackIn_184_1;
              stackOut_184_2 = "null";
              stackIn_185_0 = stackOut_184_0;
              stackIn_185_1 = stackOut_184_1;
              stackIn_185_2 = stackOut_184_2;
              break L39;
            } else {
              stackOut_182_0 = (RuntimeException) (Object) stackIn_182_0;
              stackOut_182_1 = (StringBuilder) (Object) stackIn_182_1;
              stackOut_182_2 = "{...}";
              stackIn_185_0 = stackOut_182_0;
              stackIn_185_1 = stackOut_182_1;
              stackIn_185_2 = stackOut_182_2;
              break L39;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_185_0, stackIn_185_2 + ')');
        }
        return stackIn_168_0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 35 % ((param1 - -44) / 54);
            stackOut_0_0 = this.a(param0, (nh[]) null, -61);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("qla.A(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final String a(boolean param0, nh[] param1, String param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        Exception var13 = null;
        int var13_int = 0;
        int var14 = 0;
        String stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        String stackIn_60_0 = null;
        String stackIn_76_0 = null;
        int stackIn_80_0 = 0;
        String stackIn_84_0 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        String stackOut_59_0 = null;
        String stackOut_75_0 = null;
        boolean stackOut_79_0 = false;
        String stackOut_83_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (~this.a(param2, param1, -93) < ~param3) {
              param3 = param3 - this.a("...", (nh[]) null, -61);
              var5_int = -1;
              var6 = -1;
              var7 = 0;
              var8 = param2.length();
              var9 = "";
              var10 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var10 <= ~var8) {
                      break L3;
                    } else {
                      var11 = param2.charAt(var10);
                      stackOut_6_0 = -61;
                      stackIn_80_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var14 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 == ~var11) {
                              var5_int = var10;
                              if (var14 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (var11 != 62) {
                              break L6;
                            } else {
                              if (var5_int != -1) {
                                L7: {
                                  var12_ref_String = param2.substring(1 + var5_int, var10);
                                  var5_int = -1;
                                  if (!var12_ref_String.equals((Object) (Object) "lt")) {
                                    break L7;
                                  } else {
                                    var11 = 60;
                                    if (var14 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (var12_ref_String.equals((Object) (Object) "gt")) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (var12_ref_String.equals((Object) (Object) "nbsp")) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (!var12_ref_String.equals((Object) (Object) "shy")) {
                                            break L10;
                                          } else {
                                            var11 = 173;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (!var12_ref_String.equals((Object) (Object) "times")) {
                                            break L11;
                                          } else {
                                            var11 = 215;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (!var12_ref_String.equals((Object) (Object) "euro")) {
                                            break L12;
                                          } else {
                                            var11 = 8364;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (!var12_ref_String.equals((Object) (Object) "copy")) {
                                            break L13;
                                          } else {
                                            var11 = 169;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (!var12_ref_String.equals((Object) (Object) "reg")) {
                                            break L14;
                                          } else {
                                            var11 = 174;
                                            if (var14 == 0) {
                                              break L6;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (!var12_ref_String.startsWith("img=")) {
                                          break L4;
                                        } else {
                                          L15: {
                                            if (null != param1) {
                                              break L15;
                                            } else {
                                              if (var14 == 0) {
                                                break L4;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          try {
                                            L16: {
                                              int discarded$2 = 70;
                                              var13_int = jb.a((CharSequence) (Object) var12_ref_String.substring(4));
                                              var6 = -1;
                                              var7 = var7 + param1[var13_int].d();
                                              if (param3 >= var7) {
                                                var9 = param2.substring(0, 1 + var10);
                                                decompiledRegionSelector0 = 0;
                                                break L16;
                                              } else {
                                                stackOut_59_0 = var9 + "...";
                                                stackIn_60_0 = stackOut_59_0;
                                                return stackIn_60_0;
                                              }
                                            }
                                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                                            decompiledCaughtException = decompiledCaughtParameter0;
                                            L17: {
                                              var13 = (Exception) (Object) decompiledCaughtException;
                                              if (var14 == 0) {
                                                decompiledRegionSelector0 = 0;
                                                break L17;
                                              } else {
                                                decompiledRegionSelector0 = 1;
                                                break L17;
                                              }
                                            }
                                          }
                                          if (decompiledRegionSelector0 == 0) {
                                            break L4;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    var11 = 160;
                                    if (var14 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var11 = 62;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var5_int != -1) {
                            break L4;
                          } else {
                            L18: {
                              var7 = var7 + (((qla) this).field_e[io.a(-377, (char) var11) & 255] & 255);
                              if (null == ((qla) this).field_c) {
                                break L18;
                              } else {
                                if (-1 == var6) {
                                  break L18;
                                } else {
                                  var7 = var7 + ((qla) this).field_c[var6][var11];
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              var6 = var11;
                              var12 = var7;
                              if (((qla) this).field_c == null) {
                                break L19;
                              } else {
                                var12 = var12 + ((qla) this).field_c[var11][46];
                                break L19;
                              }
                            }
                            if (var12 <= param3) {
                              var9 = param2.substring(0, 1 + var10);
                              break L4;
                            } else {
                              stackOut_75_0 = var9 + "...";
                              stackIn_76_0 = stackOut_75_0;
                              return stackIn_76_0;
                            }
                          }
                        }
                        var10++;
                        if (var14 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_79_0 = param0;
                  stackIn_80_0 = stackOut_79_0 ? 1 : 0;
                  break L2;
                }
                L20: {
                  if (stackIn_80_0 == 0) {
                    break L20;
                  } else {
                    int discarded$3 = ((qla) this).a((String) null, (byte) -79);
                    break L20;
                  }
                }
                stackOut_83_0 = (String) param2;
                stackIn_84_0 = stackOut_83_0;
                break L0;
              }
            } else {
              stackOut_2_0 = (String) param2;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L21: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var5;
            stackOut_85_1 = new StringBuilder().append("qla.E(").append(param0).append(',');
            stackIn_88_0 = stackOut_85_0;
            stackIn_88_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L21;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L21;
            }
          }
          L22: {
            stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
            stackIn_92_0 = stackOut_89_0;
            stackIn_92_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param2 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L22;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_93_0 = stackOut_90_0;
              stackIn_93_1 = stackOut_90_1;
              stackIn_93_2 = stackOut_90_2;
              break L22;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + ',' + param3 + ')');
        }
        return stackIn_84_0;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_13_0 = null;
            String stackIn_19_0 = null;
            String stackIn_21_0 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            String stackOut_12_0 = null;
            String stackOut_18_0 = null;
            String stackOut_20_0 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = param1.getParameter("cookieprefix");
                            var3 = var2 + "settings";
                            var4 = (String) lb.b(param1, 2864, "getcookies");
                            var5 = rga.a(32287, var4, ';');
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (~var6 <= ~var5.length) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var8 != 0) {
                                statePc = 17;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (0 > var7) {
                                statePc = 14;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = var5[var6].substring(var7 - -1).trim();
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            var6++;
                            if (var8 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2_ref2 = caughtException;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (ts.field_g == null) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = ts.field_g;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0;
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = param1.getParameter("settings");
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0;
                    }
                    case 22: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_22_0 = (RuntimeException) var2_ref;
                        stackOut_22_1 = new StringBuilder().append("qla.L(").append(0).append(',');
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param1 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "null";
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = "Loaded.";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qla.B(").append(true).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final int a(String param0, int param1, nh[] param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (0 != param4) {
                break L1;
              } else {
                param4 = ((qla) this).field_a;
                break L1;
              }
            }
            var6_int = ((qla) this).a(param0, -124, dra.field_a, param2, new int[1]);
            var7 = (var6_int + -1) * param4;
            var8 = 72 / ((-41 - param3) / 54);
            stackOut_2_0 = ((qla) this).field_h - -var7 - -((qla) this).field_g;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("qla.D(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    qla(byte[] param0) {
        RuntimeException var2 = null;
        uia var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_ref = new uia(param0);
            var3 = var2_ref.h(255);
            if (var3 == 0) {
              L1: {
                if (1 != var2_ref.h(255)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var4 = stackIn_8_0;
                      ((qla) this).field_e = new byte[256];
                      var2_ref.a(((qla) this).field_e, 0, -81, 256);
                      if (var4 != 0) {
                        break L5;
                      } else {
                        ((qla) this).field_a = var2_ref.h(255);
                        if (var12 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = new int[256];
                    var7_int = 0;
                    L6: while (true) {
                      L7: {
                        if (var7_int >= 256) {
                          break L7;
                        } else {
                          var5[var7_int] = var2_ref.h(255);
                          var7_int++;
                          if (var12 != 0) {
                            break L2;
                          } else {
                            if (var12 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var6 = new int[256];
                      var7_int = 0;
                      L8: while (true) {
                        L9: {
                          if (var7_int >= 256) {
                            break L9;
                          } else {
                            var6[var7_int] = var2_ref.h(255);
                            var7_int++;
                            if (var12 != 0) {
                              break L2;
                            } else {
                              if (var12 == 0) {
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        var7 = new byte[256][];
                        var8_int = 0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var8_int >= 256) {
                                break L12;
                              } else {
                                var7[var8_int] = new byte[var5[var8_int]];
                                var9 = 0;
                                stackOut_26_0 = 0;
                                stackIn_36_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (var12 != 0) {
                                  break L11;
                                } else {
                                  var10 = stackIn_27_0;
                                  L13: while (true) {
                                    L14: {
                                      L15: {
                                        if (var7[var8_int].length <= var10) {
                                          break L15;
                                        } else {
                                          var9 = (byte)(var9 + var2_ref.c((byte) 79));
                                          var7[var8_int][var10] = (byte) var9;
                                          var10++;
                                          if (var12 != 0) {
                                            break L14;
                                          } else {
                                            if (var12 == 0) {
                                              continue L13;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var8_int++;
                                      break L14;
                                    }
                                    if (var12 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_35_0 = 256;
                            stackIn_36_0 = stackOut_35_0;
                            break L11;
                          }
                          var8 = new byte[stackIn_36_0][];
                          var9 = 0;
                          L16: while (true) {
                            L17: {
                              L18: {
                                if (var9 >= 256) {
                                  break L18;
                                } else {
                                  var8[var9] = new byte[var5[var9]];
                                  var10 = 0;
                                  stackOut_38_0 = 0;
                                  stackIn_48_0 = stackOut_38_0;
                                  stackIn_39_0 = stackOut_38_0;
                                  if (var12 != 0) {
                                    break L17;
                                  } else {
                                    var11 = stackIn_39_0;
                                    L19: while (true) {
                                      L20: {
                                        L21: {
                                          if (var8[var9].length <= var11) {
                                            break L21;
                                          } else {
                                            var10 = (byte)(var10 + var2_ref.c((byte) 93));
                                            var8[var9][var11] = (byte) var10;
                                            var11++;
                                            if (var12 != 0) {
                                              break L20;
                                            } else {
                                              if (var12 == 0) {
                                                continue L19;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                        var9++;
                                        break L20;
                                      }
                                      if (var12 == 0) {
                                        continue L16;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                              ((qla) this).field_c = new byte[256][256];
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L17;
                            }
                            var9 = stackIn_48_0;
                            L22: while (true) {
                              stackOut_49_0 = -257;
                              stackOut_49_1 = ~var9;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              L23: while (true) {
                                L24: {
                                  if (stackIn_50_0 >= stackIn_50_1) {
                                    break L24;
                                  } else {
                                    stackOut_51_0 = 32;
                                    stackIn_74_0 = stackOut_51_0;
                                    stackIn_52_0 = stackOut_51_0;
                                    if (var12 != 0) {
                                      break L3;
                                    } else {
                                      L25: {
                                        if (stackIn_52_0 == var9) {
                                          break L25;
                                        } else {
                                          if (var9 == 160) {
                                            break L25;
                                          } else {
                                            var10 = 0;
                                            L26: while (true) {
                                              if (var10 >= 256) {
                                                break L25;
                                              } else {
                                                stackOut_60_0 = 32;
                                                stackOut_60_1 = var10;
                                                stackIn_50_0 = stackOut_60_0;
                                                stackIn_50_1 = stackOut_60_1;
                                                stackIn_61_0 = stackOut_60_0;
                                                stackIn_61_1 = stackOut_60_1;
                                                if (var12 != 0) {
                                                  continue L23;
                                                } else {
                                                  L27: {
                                                    if (stackIn_61_0 == stackIn_61_1) {
                                                      break L27;
                                                    } else {
                                                      L28: {
                                                        if (160 != var10) {
                                                          break L28;
                                                        } else {
                                                          if (var12 == 0) {
                                                            break L27;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      ((qla) this).field_c[var9][var10] = (byte)pu.a(var9, var10, true, var7, var5, ((qla) this).field_e, var8, var6);
                                                      break L27;
                                                    }
                                                  }
                                                  var10++;
                                                  if (var12 == 0) {
                                                    continue L26;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      if (var12 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                ((qla) this).field_a = var5[32] + var6[32];
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((qla) this).field_d = var2_ref.h(255);
                  stackOut_73_0 = var2_ref.h(255);
                  stackIn_74_0 = stackOut_73_0;
                  break L3;
                }
                ((qla) this).field_h = var2_ref.h(255);
                ((qla) this).field_g = var2_ref.h(255);
                break L2;
              }
              break L0;
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var2 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var2;
            stackOut_76_1 = new StringBuilder().append("qla.<init>(");
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L29;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L29;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ')');
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_f = null;
            field_b = null;
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "qla.F(" + -63 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = "Use this alternative as your account name";
    }
}
