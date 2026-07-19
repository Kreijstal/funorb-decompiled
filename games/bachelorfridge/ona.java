/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ona extends sna {
    static String field_vb;
    kna field_zb;
    static kv field_yb;
    int field_wb;
    static String field_xb;

    final static rga a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        rga stackIn_4_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        rga stackIn_27_0 = null;
        rga stackIn_42_0 = null;
        rga stackIn_46_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rga stackOut_3_0 = null;
        rga stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        rga stackOut_26_0 = null;
        rga stackOut_45_0 = null;
        rga stackOut_41_0 = null;
        rga stackOut_6_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = uc.field_j;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int <= 64) {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(var2_int + -1) != 34) {
                    stackOut_12_0 = cha.field_m;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var4 < var2_int - 1) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackOut_21_0 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                break L3;
                              } else {
                                stackOut_20_0 = 1;
                                stackIn_22_0 = stackOut_20_0;
                                break L3;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  stackOut_26_0 = cha.field_m;
                                  stackIn_27_0 = stackOut_26_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  L5: {
                    var3 = 0;
                    if (param1 == -15679) {
                      break L5;
                    } else {
                      ona.f(47);
                      break L5;
                    }
                  }
                  var4 = 0;
                  L6: while (true) {
                    if (var4 < var2_int) {
                      L7: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (-1 != jk.field_l.indexOf(var5)) {
                            var3 = 0;
                            break L7;
                          } else {
                            stackOut_45_0 = cha.field_m;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L8: {
                            if (var4 == 0) {
                              break L8;
                            } else {
                              if (var4 == var2_int - 1) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackOut_41_0 = cha.field_m;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackOut_6_0 = rm.field_c;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ona.B(");
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
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_46_0;
                }
              }
            }
          }
        }
    }

    final static boolean c(int param0, int param1) {
        if (param1 != 34) {
            ona.f(87);
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    public static void f(int param0) {
        field_xb = null;
        field_vb = null;
        field_yb = null;
        if (param0 != 1) {
            ona.f(26);
        }
    }

    ona(int param0, kv param1, kna param2) {
        try {
            this.field_p = 39;
            this.field_v = param1;
            this.field_wb = param0;
            this.field_sb = 39;
            if (cc.field_b.field_z != null) {
                this.field_kb = cc.field_b.field_z.g(0) % 4 * 39;
                this.field_rb = 39 * (cc.field_b.field_z.g(0) / 4);
            }
            this.field_zb = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ona.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_vb = "Please send me news and updates (I can unsubscribe at any time)";
        field_xb = "Cooldown <%0> turns";
    }
}
