/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ig {
    static jn field_b;
    static pl field_a;

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        ah[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wc var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (ku.field_J != null) {
              if (0 != (an.field_a ^ -1)) {
                if (ku.field_J.length <= an.field_a) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var12 = ku.field_J[an.field_a];
                  var2 = var12.field_b;
                  var3 = 0;
                  var4 = 26 / ((67 - param0) / 42);
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var2.length) {
                          break L3;
                        } else {
                          if (var11 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (var2[var5] == null) {
                                break L4;
                              } else {
                                if (var2[var5].field_F != g.field_c) {
                                  break L4;
                                } else {
                                  var6 = var2[var5];
                                  var7 = var6.field_C;
                                  var8 = var6.field_z;
                                  var9 = var6.field_Q;
                                  var10 = var6.field_N;
                                  var3 = 1;
                                  oc.a(uj.a(var9, var7, var10, (byte) 84, var8), false);
                                  break L4;
                                }
                              }
                            }
                            var5++;
                            if (var11 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      g.field_c = g.field_c + 1;
                      break L2;
                    }
                    if (var3 == 0) {
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ig.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 22075) {
            ig.a(66);
            lf.a(0, 256);
            return;
        }
        lf.a(0, 256);
    }

    final static int a(String param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        byte stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        byte stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_b = (jn) null;
                break L1;
              }
            }
            if (!qn.field_e.field_f) {
              stackOut_5_0 = -1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (mi.field_b.containsKey(param0)) {
                stackOut_9_0 = 100;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var10 = ua.a((byte) 53, param0);
                if (var10 == null) {
                  stackOut_13_0 = -1;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3 = pn.field_n + var10;
                  if (ha.field_e.b("", var3, -1)) {
                    if (ha.field_e.a(var3, 100)) {
                      var15 = ha.field_e.a("", var3, -1);
                      var13 = var15;
                      var4 = var13;
                      var5 = null;
                      try {
                        L2: {
                          var11 = el.a(var10, (byte) -8);
                          break L2;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                      L3: {
                        if (var4 == null) {
                          break L3;
                        } else {
                          if (var11 == null) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                L6: {
                                  L7: {
                                    var6 = 1;
                                    var14 = si.a(var11, (byte) -23);
                                    var12 = var14;
                                    var7 = var12;
                                    if (var7 == null) {
                                      break L7;
                                    } else {
                                      if (var14.length == var15.length) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var6 = 0;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8_int = 0;
                                L8: while (true) {
                                  if (var14.length <= var8_int) {
                                    break L5;
                                  } else {
                                    stackOut_34_0 = var14[var8_int];
                                    stackIn_41_0 = stackOut_34_0;
                                    stackIn_35_0 = stackOut_34_0;
                                    if (var9 != 0) {
                                      break L4;
                                    } else {
                                      L9: {
                                        if (stackIn_35_0 != var15[var8_int]) {
                                          var6 = 0;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var8_int++;
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_40_0 = var6;
                              stackIn_41_0 = stackOut_40_0;
                              break L4;
                            }
                            L10: {
                              if (stackIn_41_0 != 0) {
                                break L10;
                              } else {
                                try {
                                  L11: {
                                    discarded$1 = qn.field_e.a(var15, -31357, var11);
                                    break L11;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  var8 = decompiledCaughtException;
                                  stackOut_44_0 = -1;
                                  stackIn_45_0 = stackOut_44_0;
                                  return stackIn_45_0;
                                }
                                break L10;
                              }
                            }
                            hw.a(var11, param0, 23295);
                            stackOut_46_0 = 100;
                            stackIn_47_0 = stackOut_46_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      stackOut_48_0 = -1;
                      stackIn_49_0 = stackOut_48_0;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackOut_19_0 = ha.field_e.a(var3, (byte) 33);
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_16_0 = -1;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L12: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ig.C(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_47_0;
                  } else {
                    return stackIn_49_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (pl) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new jn();
    }
}
