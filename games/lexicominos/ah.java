/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;

    public static void b(byte param0) {
        if (param0 > -90) {
            field_a = (String) null;
        }
        field_a = null;
    }

    final static tf a(String param0, byte param1) {
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        tf stackIn_27_0 = null;
        tf stackIn_33_0 = null;
        tf stackIn_42_0 = null;
        tf stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = w.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_8_0 = vi.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (-35 != (param0.charAt(var2_int - 1) ^ -1)) {
                    stackIn_14_0 = ll.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 != 92) {
                            L3: {
                              if (34 != var5) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  stackIn_27_0 = ll.field_a;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          } else {
                            L4: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L4;
                              } else {
                                stackIn_22_0 = 1;
                                break L4;
                              }
                            }
                            var3 = stackIn_22_0;
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
                  var3 = 0;
                  var4 = 0;
                  if (param1 == 111) {
                    L5: while (true) {
                      if (var4 < var2_int) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 != 46) {
                            if ((hf.field_c.indexOf(var5) ^ -1) == 0) {
                              stackIn_47_0 = ll.field_a;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3 = 0;
                              break L6;
                            }
                          } else {
                            L7: {
                              if (-1 == (var4 ^ -1)) {
                                break L7;
                              } else {
                                if (var2_int + -1 == var4) {
                                  break L7;
                                } else {
                                  if (var3 == 0) {
                                    var3 = 1;
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            stackIn_42_0 = ll.field_a;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_33_0 = (tf) null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("ah.B(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L8;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ')');
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
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    return stackIn_47_0;
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
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (param2) {
              L1: while (true) {
                if ((param0 ^ -1) >= -1) {
                  stackIn_7_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = var3_int << 438251425 | param1 & 1;
                  param0--;
                  param1 = param1 >>> 1;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -15;
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
          return stackIn_7_0;
        }
    }

    final static aj[] a(byte param0) {
        if (param0 != -55) {
            return (aj[]) null;
        }
        return new aj[]{gj.field_w, q.field_d, rk.field_n, vb.field_l, rk.field_d, uj.field_c, rj.field_b, li.field_R, nl.field_b, he.field_c, w.field_n, vf.field_m, fb.field_l, qb.field_d};
    }

    static {
        field_a = "Username: ";
    }
}
