/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class g {
    int field_d;
    static int field_c;
    static ta field_a;
    String field_b;

    public static void a(int param0) {
        int var1 = 58 % ((param0 - 20) / 45);
        field_a = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-13 <= (var3_int ^ -1)) {
                  L1: {
                    var4 = uk.a(-1, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 <= var4.length()) {
                        L2: {
                          if (wv.a((byte) -124, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!wv.a((byte) -84, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = param1;
                              L3: while (true) {
                                L4: {
                                  L5: {
                                    if (param2.length() <= var6) {
                                      break L5;
                                    } else {
                                      var7 = param2.charAt(var6);
                                      stackOut_21_0 = wv.a((byte) -85, (char) var7);
                                      stackIn_32_0 = stackOut_21_0 ? 1 : 0;
                                      stackIn_22_0 = stackOut_21_0;
                                      if (var8 != 0) {
                                        break L4;
                                      } else {
                                        L6: {
                                          if (!stackIn_22_0) {
                                            var5 = 0;
                                            if (var8 == 0) {
                                              break L6;
                                            } else {
                                              var5++;
                                              break L6;
                                            }
                                          } else {
                                            var5++;
                                            break L6;
                                          }
                                        }
                                        L7: {
                                          if ((var5 ^ -1) > -3) {
                                            break L7;
                                          } else {
                                            if (param0) {
                                              break L7;
                                            } else {
                                              stackOut_28_0 = 0;
                                              stackIn_29_0 = stackOut_28_0;
                                              decompiledRegionSelector0 = 4;
                                              break L0;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var8 == 0) {
                                          continue L3;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_31_0 = 0;
                                  stackIn_32_0 = stackOut_31_0;
                                  break L4;
                                }
                                if (stackIn_32_0 < var5) {
                                  stackOut_34_0 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
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
          L8: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("g.J(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  return stackIn_35_0 != 0;
                }
              }
            }
          }
        }
    }

    final static dk a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        dk stackIn_24_0 = null;
        dk stackIn_41_0 = null;
        dk stackIn_46_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_6_0 = null;
        dk stackOut_40_0 = null;
        dk stackOut_45_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        dk stackOut_23_0 = null;
        dk stackOut_10_0 = null;
        dk stackOut_2_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -65) {
                stackOut_6_0 = cn.field_ib;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (34 != param1.charAt(0)) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if (var4 >= var2_int) {
                        if (param0 > -118) {
                          field_c = -60;
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        var5 = param1.charAt(var4);
                        var8 = var5 ^ -1;
                        var7 = -47;
                        if (var6 != 0) {
                          if (var7 > var8) {
                            field_c = -60;
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          L3: {
                            L4: {
                              if (var7 != var8) {
                                break L4;
                              } else {
                                L5: {
                                  if (var4 == 0) {
                                    break L5;
                                  } else {
                                    if (var4 == var2_int + -1) {
                                      break L5;
                                    } else {
                                      if (var3 != 0) {
                                        break L5;
                                      } else {
                                        var3 = 1;
                                        if (var6 == 0) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_40_0 = gs.field_a;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                            if (0 == (se.field_b.indexOf(var5) ^ -1)) {
                              stackOut_45_0 = gs.field_a;
                              stackIn_46_0 = stackOut_45_0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              var3 = 0;
                              break L3;
                            }
                          }
                          var4++;
                          continue L1;
                        }
                      }
                    }
                    stackOut_53_0 = null;
                    stackIn_54_0 = stackOut_53_0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  if (34 == param1.charAt(-1 + var2_int)) {
                    var3 = 0;
                    var4 = 1;
                    L6: while (true) {
                      if (var4 < -1 + var2_int) {
                        L7: {
                          L8: {
                            var5 = param1.charAt(var4);
                            if (var5 == 92) {
                              L9: {
                                if (var3 != 0) {
                                  stackOut_19_0 = 0;
                                  stackIn_20_0 = stackOut_19_0;
                                  break L9;
                                } else {
                                  stackOut_18_0 = 1;
                                  stackIn_20_0 = stackOut_18_0;
                                  break L9;
                                }
                              }
                              var3 = stackIn_20_0;
                              if (var6 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (var5 != 34) {
                              break L10;
                            } else {
                              if (var3 != 0) {
                                break L10;
                              } else {
                                stackOut_23_0 = gs.field_a;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var3 = 0;
                          break L7;
                        }
                        var4++;
                        continue L6;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_10_0 = gs.field_a;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = qo.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var2);
            stackOut_55_1 = new StringBuilder().append("g.I(").append(param0).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L11;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_46_0;
                  } else {
                    return (dk) ((Object) stackIn_54_0);
                  }
                }
              }
            }
          }
        }
    }

    abstract java.net.Socket b(byte param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 <= 94) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_d);
    }

    static {
    }
}
