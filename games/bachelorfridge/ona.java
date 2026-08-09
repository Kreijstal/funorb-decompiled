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
        rga stackIn_4_0 = null;
        rga stackIn_7_0 = null;
        rga stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        rga stackIn_27_0 = null;
        rga stackIn_42_0 = null;
        rga stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = uc.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int <= 64) {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(var2_int + -1) != 34) {
                    stackIn_13_0 = cha.field_m;
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
                                stackIn_22_0 = 0;
                                break L3;
                              } else {
                                stackIn_22_0 = 1;
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
                                  stackIn_27_0 = cha.field_m;
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
                            stackIn_46_0 = cha.field_m;
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
                          stackIn_42_0 = cha.field_m;
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
                stackIn_7_0 = rm.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("ona.B(");

            if (param0 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L9;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
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
