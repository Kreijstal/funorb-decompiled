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
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            var5 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (null != vi.field_p) {
                    try {
                      L2: {
                        vi.field_p.a(0L, 123);
                        vi.field_p.a(var6, (byte) 0);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (-25 >= (var3_int ^ -1)) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (-25 < (var3_int ^ -1)) {
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
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                param1.a(24, 0, -3493, var2);
                if (param0 == 1) {
                  break L0;
                } else {
                  field_a = (String) null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("wf.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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
        el stackIn_3_0 = null;
        el stackIn_6_0 = null;
        el stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        el stackIn_24_0 = null;
        el stackIn_38_0 = null;
        el stackIn_42_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              if (var2_int <= 64) {
                if (param1.charAt(0) == 34) {
                  if (-35 == (param1.charAt(-1 + var2_int) ^ -1)) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L3;
                              } else {
                                stackIn_20_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  stackIn_24_0 = gm.field_f;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
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
                  } else {
                    stackIn_11_0 = gm.field_f;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = param0 ? 1 : 0;
                  var4 = 0;
                  L5: while (true) {
                    if (var2_int > var4) {
                      L6: {
                        var5 = param1.charAt(var4);
                        if (var5 != 46) {
                          if ((li.field_i.indexOf(var5) ^ -1) != 0) {
                            var3 = 0;
                            break L6;
                          } else {
                            stackIn_42_0 = gm.field_f;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L7: {
                            if (0 == var4) {
                              break L7;
                            } else {
                              if (var2_int + -1 == var4) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              }
                            }
                          }
                          stackIn_38_0 = gm.field_f;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_6_0 = mk.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = pd.field_Kb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var2);

            stackIn_49_1 = new StringBuilder().append("wf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L8;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
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
                  return stackIn_42_0;
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Staff impersonation";
    }
}
