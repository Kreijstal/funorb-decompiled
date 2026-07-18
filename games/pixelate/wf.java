/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wf {
    static int field_b;
    static String field_a;

    final static void a(int param0, we param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            var5 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  var13 = new byte[24];
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var6 = var7;
                  var14 = var6;
                  var12 = var14;
                  var10 = var12;
                  var8 = var10;
                  var2 = var8;
                  if (null != vi.field_p) {
                    try {
                      L2: {
                        vi.field_p.a(0L, 123);
                        vi.field_p.a(var13, (byte) 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var14[var3_int] == 0) {
                                var3_int++;
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int < 24) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (24 <= var4) {
                            param1.a(24, 0, -3493, var14);
                            decompiledRegionSelector0 = 1;
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      param1.a(24, 0, -3493, var14);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    param1.a(24, 0, -3493, var13);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_19_0 = (RuntimeException) var2_ref;
                stackOut_19_1 = new StringBuilder().append("wf.B(").append(1).append(',');
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param1 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L7;
                } else {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L7;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -48) {
            wf.a((byte) 22);
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
        el stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        el stackIn_24_0 = null;
        el stackIn_38_0 = null;
        el stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        el stackOut_23_0 = null;
        el stackOut_10_0 = null;
        el stackOut_41_0 = null;
        el stackOut_37_0 = null;
        el stackOut_5_0 = null;
        el stackOut_2_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int <= 64) {
              if (param1.charAt(0) == 34) {
                if (param1.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (-1 + var2_int > var4) {
                      L1: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L2;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                stackOut_23_0 = gm.field_f;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0;
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
                } else {
                  stackOut_10_0 = gm.field_f;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (var2_int > var4) {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 != 46) {
                        if (li.field_i.indexOf(var5) != -1) {
                          var3 = 0;
                          break L5;
                        } else {
                          stackOut_41_0 = gm.field_f;
                          stackIn_42_0 = stackOut_41_0;
                          return stackIn_42_0;
                        }
                      } else {
                        L6: {
                          if (0 == var4) {
                            break L6;
                          } else {
                            if (var2_int + -1 == var4) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                var3 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = gm.field_f;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0;
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
              stackOut_5_0 = mk.field_a;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = pd.field_Kb;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var2;
            stackOut_47_1 = new StringBuilder().append("wf.C(").append(false).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L7;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Staff impersonation";
    }
}
