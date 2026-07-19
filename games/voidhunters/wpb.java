/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpb extends rqa {
    static java.awt.Color field_p;
    static String field_o;

    wpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        asb discarded$0 = null;
        field_o = null;
        if (param0 != 0) {
            discarded$0 = wpb.a(108, -55);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        nc discarded$2 = null;
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              oq.field_d = param0[0].a(66);
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                discarded$2 = this.a((nc[]) null, -50);
                break L1;
              }
            }
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wpb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, int[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != null) {
                if (param0 != null) {
                  if (param2 == 28) {
                    if (param1.length != param0.length) {
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var3_int = 0;
                      var4 = param1.length - 3;
                      L1: while (true) {
                        if (var4 <= var3_int) {
                          var4 += 3;
                          L2: while (true) {
                            if (var4 <= var3_int) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              if (param0[var3_int] == param1[var3_int]) {
                                var3_int++;
                                continue L2;
                              } else {
                                stackOut_40_0 = 1;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            }
                          }
                        } else {
                          if (param0[var3_int] == param1[var3_int]) {
                            var3_int++;
                            if (param1[var3_int] != param0[var3_int]) {
                              stackOut_27_0 = 1;
                              stackIn_28_0 = stackOut_27_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3_int++;
                              if (param1[var3_int] != param0[var3_int]) {
                                stackOut_31_0 = 1;
                                stackIn_32_0 = stackOut_31_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                var3_int++;
                                if (param0[var3_int] == param1[var3_int]) {
                                  var3_int++;
                                  continue L1;
                                } else {
                                  stackOut_34_0 = 1;
                                  stackIn_35_0 = stackOut_34_0;
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L3: {
                  if (param0 == null) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var3);
            stackOut_45_1 = new StringBuilder().append("wpb.D(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L4;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L4;
            }
          }
          L5: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L5;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_32_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_35_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_41_0 != 0;
                          } else {
                            return stackIn_44_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static asb a(int param0, int param1) {
        asb stackIn_5_0 = null;
        asb stackIn_11_0 = null;
        asb stackOut_9_0 = null;
        asb stackOut_4_0 = null;
        asb stackOut_3_0 = null;
        if (param1 == 11835) {
          if (akb.field_a == null) {
            if (-1 == param0) {
              return akb.field_a;
            } else {
              return mla.a(true, false, -52, true, param0, 1);
            }
          } else {
            stackOut_9_0 = akb.field_a;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          field_o = (String) null;
          if (akb.field_a != null) {
            return akb.field_a;
          } else {
            L0: {
              if (-1 != param0) {
                stackOut_4_0 = mla.a(true, false, -52, true, param0, 1);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = akb.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        field_o = "Accept rematch";
        field_p = new java.awt.Color(10040319);
    }
}
