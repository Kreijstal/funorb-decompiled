/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ona extends sna {
    static String field_vb;
    kna field_zb;
    static kv field_yb;
    int field_wb;
    static String field_xb;

    final static rga a(String param0) {
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
        rga stackIn_40_0 = null;
        rga stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        rga stackOut_3_0 = null;
        rga stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        rga stackOut_26_0 = null;
        rga stackOut_43_0 = null;
        rga stackOut_39_0 = null;
        rga stackOut_6_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = uc.field_j;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 64) {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(var2_int + -1) != 34) {
                  stackOut_12_0 = cha.field_m;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var4 < var2_int - 1) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L2;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = cha.field_m;
                                stackIn_27_0 = stackOut_26_0;
                                return stackIn_27_0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (var4 < var2_int) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (-1 != jk.field_l.indexOf(var5)) {
                          var3 = 0;
                          break L5;
                        } else {
                          stackOut_43_0 = cha.field_m;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        }
                      } else {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (var4 == var2_int - 1) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = cha.field_m;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_6_0 = rm.field_c;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("ona.B(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + -15679 + ')');
        }
    }

    final static boolean c(int param0, int param1) {
        return param0 == (-param0 & param0);
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
            ((ona) this).field_p = 39;
            ((ona) this).field_v = param1;
            ((ona) this).field_wb = param0;
            ((ona) this).field_sb = 39;
            if (cc.field_b.field_z != null) {
                ((ona) this).field_kb = cc.field_b.field_z.g(0) % 4 * 39;
                ((ona) this).field_rb = 39 * (cc.field_b.field_z.g(0) / 4);
            }
            ((ona) this).field_zb = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ona.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = "Please send me news and updates (I can unsubscribe at any time)";
        field_xb = "Cooldown <%0> turns";
    }
}
