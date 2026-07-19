/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static String field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 139) {
            ei.a(102);
        }
    }

    final static qg[] a(byte param0, int param1, int param2, ki param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qg[] stackIn_5_0 = null;
        qg[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qg[] stackOut_6_0 = null;
        qg[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (pk.a(101, param2, param3, param1)) {
              if (param0 == 97) {
                stackOut_6_0 = ba.a(17867);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (qg[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ei.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qg[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0) {
        int discarded$4 = 0;
        qg[] discarded$5 = null;
        int discarded$6 = 0;
        int discarded$7 = 0;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        ki var5 = null;
        hj var6 = null;
        hj var7 = null;
        hj var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            ul.d(243, 197, 369, 143, 16777215);
            ul.h(244, 198, 367, 141, 0);
            if (dm.field_b == null) {
              L1: {
                if (rc.field_a != null) {
                  discarded$4 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -463) {
                  break L2;
                } else {
                  var5 = (ki) null;
                  discarded$5 = ei.a((byte) 4, -62, 74, (ki) null);
                  break L2;
                }
              }
              L3: {
                L4: {
                  var6 = dm.field_b[kb.field_m];
                  if (var6 != null) {
                    break L4;
                  } else {
                    if (rc.field_a != null) {
                      discarded$6 = rc.field_a.a(cj.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var6.c(245, 199);
                break L3;
              }
              L5: {
                if (og.field_b > h.field_A) {
                  var7 = dm.field_b[lj.field_u];
                  if (var7 != null) {
                    L6: {
                      var2_int = h.field_A * (var7.field_s + 60) / og.field_b;
                      var3 = -30 + var2_int;
                      if (bh.field_b) {
                        break L6;
                      } else {
                        jf.a((byte) -20, 256 * (-var3 + var7.field_s) / 30, var7, -256 * var3 / 30, 199, 245);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    jf.a((byte) -20, var3 * -256 / 30, var7, 256 * (var7.field_s + -var3) / 30, 199, 245);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L7: {
                if (rc.field_a == null) {
                  break L7;
                } else {
                  var2 = null;
                  var3 = 0;
                  L8: while (true) {
                    L9: {
                      if (dm.field_b.length <= var3) {
                        break L9;
                      } else {
                        var8 = dm.field_b[var3];
                        if (var4 != 0) {
                          break L7;
                        } else {
                          L10: {
                            if (var8 != null) {
                              L11: {
                                if (var8.field_s != 365) {
                                  break L11;
                                } else {
                                  if ((var8.field_t ^ -1) != -140) {
                                    break L11;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L12: {
                                if (var2 == null) {
                                  break L12;
                                } else {
                                  var2 = (String) (var2) + ", " + var3;
                                  if (var4 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var2 = Integer.toString(var3);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var3++;
                          if (var4 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var2 == null) {
                      break L7;
                    } else {
                      discarded$7 = rc.field_a.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "ei.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = "Names should contain a maximum of 12 characters";
        field_b = "Area";
    }
}
