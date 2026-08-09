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
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              var3_int = param2.length();
              if (var3_int < 1) {
                stackIn_8_0 = 0;
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
                                if (param2.length() <= var6) {
                                  if (0 < var5) {
                                    stackIn_32_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (wv.a((byte) -85, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if ((var5 ^ -1) > -3) {
                                      break L5;
                                    } else {
                                      if (param0) {
                                        break L5;
                                      } else {
                                        stackIn_27_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("g.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L6;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
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
                  return stackIn_27_0 != 0;
                } else {
                  return stackIn_32_0 != 0;
                }
              }
            }
          }
        }
    }

    final static dk a(byte param0, String param1) {
        dk stackIn_3_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        dk stackIn_24_0 = null;
        dk stackIn_38_0 = null;
        dk stackIn_43_0 = null;
        Object stackIn_49_0 = null;
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
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -65) {
                stackIn_7_0 = cn.field_ib;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (34 != param1.charAt(0)) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var2_int) {
                      if (param0 > -118) {
                        field_c = -60;
                        stackIn_49_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (-47 != (var5 ^ -1)) {
                          if (0 == (se.field_b.indexOf(var5) ^ -1)) {
                            stackIn_43_0 = gs.field_a;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L2;
                          }
                        } else {
                          L3: {
                            if (var4 == 0) {
                              break L3;
                            } else {
                              if (var4 == var2_int + -1) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  var3 = 1;
                                  break L2;
                                }
                              }
                            }
                          }
                          stackIn_38_0 = gs.field_a;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  if (34 == param1.charAt(-1 + var2_int)) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var4 < -1 + var2_int) {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L6;
                              } else {
                                stackIn_20_0 = 1;
                                break L6;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  stackIn_24_0 = gs.field_a;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_11_0 = gs.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = qo.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("g.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L8;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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
                  return stackIn_38_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_43_0;
                  } else {
                    return (dk) ((Object) stackIn_49_0);
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
