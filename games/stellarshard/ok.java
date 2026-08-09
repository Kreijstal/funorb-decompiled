/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static uc field_a;
    static li field_c;
    static hl field_b;

    final static void a(byte param0, nj param1) {
        int var2_int = 0;
        int var3 = 0;
        nj var4 = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var2_int = 79 / ((param0 - 16) / 36);
            if (param1.field_m == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (0 != param1.field_a) {
                    break L2;
                  } else {
                    if (0 == param1.field_i) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = 0;
                L3: while (true) {
                  if (var3 >= gi.field_g) {
                    break L1;
                  } else {
                    L4: {
                      var4 = ai.field_d[var3];
                      if ((var4.field_p ^ -1) != -3) {
                        break L4;
                      } else {
                        if (var4.field_a != param1.field_a) {
                          break L4;
                        } else {
                          if (param1.field_i == var4.field_i) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var3++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_k != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              vd.a(param1, -128);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ok.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static wb a(String param0, int param1) {
        wb stackIn_3_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        wb stackIn_26_0 = null;
        wb stackIn_40_0 = null;
        wb stackIn_45_0 = null;
        Object stackIn_51_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (-65 > (var2_int ^ -1)) {
                stackIn_7_0 = bg.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (-35 != (param0.charAt(-1 + var2_int) ^ -1)) {
                    stackIn_13_0 = h.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var4 < var2_int - 1) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 != 92) {
                            L3: {
                              if (var5 != 34) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  stackIn_26_0 = h.field_a;
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
                                stackIn_21_0 = 0;
                                break L4;
                              } else {
                                stackIn_21_0 = 1;
                                break L4;
                              }
                            }
                            var3 = stackIn_21_0;
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
                  L5: while (true) {
                    if (var4 >= var2_int) {
                      if (param1 != 1) {
                        field_a = (uc) null;
                        stackIn_51_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (-1 == vk.field_c.indexOf(var5)) {
                            stackIn_45_0 = h.field_a;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L6;
                          }
                        } else {
                          L7: {
                            if (var4 == 0) {
                              break L7;
                            } else {
                              if (var4 == -1 + var2_int) {
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
                          stackIn_40_0 = h.field_a;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = uj.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("ok.A(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L8;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_45_0;
                  } else {
                    return (wb) ((Object) stackIn_51_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -30) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = -110 % ((76 - param0) / 49);
        return -od.field_r + dd.field_e;
    }

    static {
        field_a = new uc();
        field_c = new li(7, 0, 1, 1);
    }
}
