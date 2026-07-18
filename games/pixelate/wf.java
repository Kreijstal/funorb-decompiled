/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wf {
    static int field_b;
    static String field_a;

    final static void a(int param0, we param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            byte stackIn_7_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_6_0 = 0;
            int stackOut_16_0 = 0;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            var5 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var2 = new byte[24];
                    if (null != vi.field_p) {
                      try {
                        L3: {
                          vi.field_p.a(0L, 123);
                          vi.field_p.a(var2, (byte) 0);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_6_0 = var2[var3_int];
                                  stackIn_17_0 = stackOut_6_0;
                                  stackIn_7_0 = stackOut_6_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (stackIn_7_0 == 0) {
                                        break L7;
                                      } else {
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              stackOut_16_0 = -25;
                              stackIn_17_0 = stackOut_16_0;
                              break L5;
                            }
                            if (stackIn_17_0 < ~var3_int) {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L9: while (true) {
                            L10: {
                              if (24 <= var4) {
                                break L10;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param1.a(24, 0, -3493, var2);
                  break L1;
                }
                L11: {
                  if (param0 == 1) {
                    break L11;
                  } else {
                    field_a = null;
                    break L11;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_32_0 = (RuntimeException) runtimeException;
                stackOut_32_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
                stackIn_35_0 = stackOut_32_0;
                stackIn_35_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (param1 == null) {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L12;
                } else {
                  stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                  stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                  stackOut_33_2 = "{...}";
                  stackIn_36_0 = stackOut_33_0;
                  stackIn_36_1 = stackOut_33_1;
                  stackIn_36_2 = stackOut_33_2;
                  break L12;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            if (param0 >= -48) {
                wf.a((byte) 22);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wf.A(" + param0 + ')');
        }
    }

    final static el a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        el stackIn_3_0 = null;
        el stackIn_6_0 = null;
        el stackIn_12_0 = null;
        int stackIn_22_0 = 0;
        el stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        el stackIn_50_0 = null;
        el stackIn_56_0 = null;
        Object stackIn_60_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        el stackOut_29_0 = null;
        Object stackOut_33_0 = null;
        el stackOut_11_0 = null;
        el stackOut_49_0 = null;
        el stackOut_55_0 = null;
        Object stackOut_59_0 = null;
        el stackOut_5_0 = null;
        el stackOut_2_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int <= 64) {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      L2: {
                        if (-1 + var2_int <= var4) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = param1.charAt(var4);
                              if (var5 == 92) {
                                L5: {
                                  if (var3 != 0) {
                                    stackOut_21_0 = 0;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L5;
                                  } else {
                                    stackOut_19_0 = 1;
                                    stackIn_22_0 = stackOut_19_0;
                                    break L5;
                                  }
                                }
                                var3 = stackIn_22_0;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (var5 != 34) {
                                break L6;
                              } else {
                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  stackOut_29_0 = gm.field_f;
                                  stackIn_30_0 = stackOut_29_0;
                                  return stackIn_30_0;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      return (el) (Object) stackIn_34_0;
                    }
                  } else {
                    stackOut_11_0 = gm.field_f;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  var3 = param0 ? 1 : 0;
                  var4 = 0;
                  L7: while (true) {
                    L8: {
                      if (~var2_int >= ~var4) {
                        break L8;
                      } else {
                        L9: {
                          L10: {
                            var5 = param1.charAt(var4);
                            if (var5 != 46) {
                              break L10;
                            } else {
                              L11: {
                                if (0 == var4) {
                                  break L11;
                                } else {
                                  if (~(var2_int + -1) == ~var4) {
                                    break L11;
                                  } else {
                                    if (var3 != 0) {
                                      break L11;
                                    } else {
                                      var3 = 1;
                                      if (var6 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_49_0 = gm.field_f;
                              stackIn_50_0 = stackOut_49_0;
                              return stackIn_50_0;
                            }
                          }
                          if (li.field_i.indexOf(var5) != -1) {
                            var3 = 0;
                            break L9;
                          } else {
                            stackOut_55_0 = gm.field_f;
                            stackIn_56_0 = stackOut_55_0;
                            return stackIn_56_0;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    stackOut_59_0 = null;
                    stackIn_60_0 = stackOut_59_0;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = mk.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = pd.field_Kb;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var2;
            stackOut_61_1 = new StringBuilder().append("wf.C(").append(param0).append(',');
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L12;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ')');
        }
        return (el) (Object) stackIn_60_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Staff impersonation";
    }
}
