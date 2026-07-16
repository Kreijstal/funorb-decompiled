/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wf {
    static int field_b;
    static String field_a;

    final static void a(int param0, we param1) {
        try {
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var13 = null;
            byte[] var14 = null;
            byte stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            var5 = Pixelate.field_H ? 1 : 0;
            var14 = new byte[24];
            var12 = var14;
            var9 = var12;
            var7 = var9;
            var6 = var7;
            var13 = var6;
            var11 = var13;
            var10 = var11;
            if (null != vi.field_p) {
              try {
                vi.field_p.a(0L, 123);
                vi.field_p.a(var14, (byte) 0);
                var3_int = 0;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (-25 >= (var3_int ^ -1)) {
                        break L2;
                      } else {
                        stackOut_6_0 = var14[var3_int];
                        stackIn_13_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L3: {
                            if (stackIn_7_0 == 0) {
                              break L3;
                            } else {
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var3_int++;
                          if (var5 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    stackOut_12_0 = -25;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  }
                  if (stackIn_13_0 >= (var3_int ^ -1)) {
                    throw new IOException();
                  } else {
                    param1.a(24, 0, -3493, var13);
                    if (param0 == 1) {
                      return;
                    } else {
                      field_a = null;
                      return;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                var4 = 0;
                L4: while (true) {
                  if (24 > var4) {
                    var6[var4] = (byte)-1;
                    var4++;
                    if (var5 != 0) {
                      if (param0 == 1) {
                        return;
                      } else {
                        field_a = null;
                        return;
                      }
                    } else {
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        param1.a(24, 0, -3493, var13);
                        if (param0 == 1) {
                          return;
                        } else {
                          field_a = null;
                          return;
                        }
                      }
                    }
                  } else {
                    param1.a(24, 0, -3493, var13);
                    if (param0 == 1) {
                      return;
                    } else {
                      field_a = null;
                      return;
                    }
                  }
                }
              }
            } else {
              L5: {
                param1.a(24, 0, -3493, var13);
                if (param0 == 1) {
                  break L5;
                } else {
                  field_a = null;
                  break L5;
                }
              }
              return;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = param1.length();
        if (-1 != (var2 ^ -1)) {
          if (var2 <= 64) {
            if (param1.charAt(0) == 34) {
              if (-35 == (param1.charAt(-1 + var2) ^ -1)) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    L1: {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L3: {
                            if (var3 != 0) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L3;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_16_0;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      }
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return gm.field_f;
                          }
                        }
                      }
                      var3 = 0;
                      break L1;
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                return gm.field_f;
              }
            } else {
              var3 = param0 ? 1 : 0;
              var4 = 0;
              L5: while (true) {
                if (var2 > var4) {
                  L6: {
                    L7: {
                      var5 = param1.charAt(var4);
                      if (var5 != 46) {
                        break L7;
                      } else {
                        L8: {
                          if (0 == var4) {
                            break L8;
                          } else {
                            if (var2 + -1 == var4) {
                              break L8;
                            } else {
                              if (var3 != 0) {
                                break L8;
                              } else {
                                var3 = 1;
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        return gm.field_f;
                      }
                    }
                    if ((li.field_i.indexOf(var5) ^ -1) != 0) {
                      var3 = 0;
                      break L6;
                    } else {
                      return gm.field_f;
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
            return mk.field_a;
          }
        } else {
          return pd.field_Kb;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Staff impersonation";
    }
}
