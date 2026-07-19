/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;

    public static void b(byte param0) {
        if (param0 > -90) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static tf a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        tf stackIn_27_0 = null;
        tf stackIn_34_0 = null;
        tf stackIn_43_0 = null;
        tf stackIn_48_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        tf stackOut_7_0 = null;
        tf stackOut_13_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        tf stackOut_26_0 = null;
        tf stackOut_42_0 = null;
        tf stackOut_47_0 = null;
        tf stackOut_33_0 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = w.field_k;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackOut_7_0 = vi.field_l;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (-35 != (param0.charAt(var2_int - 1) ^ -1)) {
                    stackOut_13_0 = ll.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          L3: {
                            var5 = param0.charAt(var4);
                            if (var5 != 92) {
                              break L3;
                            } else {
                              L4: {
                                if (var3 != 0) {
                                  stackOut_21_0 = 0;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L4;
                                } else {
                                  stackOut_20_0 = 1;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L4;
                                }
                              }
                              var3 = stackIn_22_0;
                              if (var6 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            if (34 != var5) {
                              break L5;
                            } else {
                              if (var3 == 0) {
                                stackOut_26_0 = ll.field_a;
                                stackIn_27_0 = stackOut_26_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3 = 0;
                          break L2;
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  if (param1 == 111) {
                    L6: while (true) {
                      if (var4 < var2_int) {
                        L7: {
                          L8: {
                            var5 = param0.charAt(var4);
                            if (var5 != 46) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 == (var4 ^ -1)) {
                                  break L9;
                                } else {
                                  if (var2_int + -1 == var4) {
                                    break L9;
                                  } else {
                                    if (var3 == 0) {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              stackOut_42_0 = ll.field_a;
                              stackIn_43_0 = stackOut_42_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          }
                          if ((hf.field_c.indexOf(var5) ^ -1) == 0) {
                            stackOut_47_0 = ll.field_a;
                            stackIn_48_0 = stackOut_47_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            var3 = 0;
                            break L7;
                          }
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_33_0 = (tf) null;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var2);
            stackOut_53_1 = new StringBuilder().append("ah.B(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L10;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_43_0;
                  } else {
                    return stackIn_48_0;
                  }
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (param2) {
              L1: while (true) {
                L2: {
                  L3: {
                    if ((param0 ^ -1) >= -1) {
                      break L3;
                    } else {
                      var3_int = var3_int << 438251425 | param1 & 1;
                      param0--;
                      stackOut_5_0 = param1 >>> 1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        param1 = stackIn_6_0;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_7_0 = var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -15;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "ah.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static aj[] a(byte param0) {
        if (param0 != -55) {
          return (aj[]) null;
        } else {
          return new aj[]{gj.field_w, q.field_d, rk.field_n, vb.field_l, rk.field_d, uj.field_c, rj.field_b, li.field_R, nl.field_b, he.field_c, w.field_n, vf.field_m, fb.field_l, qb.field_d};
        }
    }

    static {
        field_a = "Username: ";
    }
}
