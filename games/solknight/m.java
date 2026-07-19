/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends gg {
    int field_i;
    int field_j;
    static nc field_h;

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        char stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = param0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  stackOut_8_0 = var3_int;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_3_0 = param2.charAt(var5);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (stackIn_4_0 == param1) {
                        var3_int++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("m.D(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static rb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        rb var6 = null;
        if (param3 != -6) {
          field_h = (nc) null;
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        } else {
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        }
    }

    final static void b(boolean param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var3 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (il.field_c == null) {
                    break L1;
                  } else {
                    il.field_c.a((byte) 92);
                    break L1;
                  }
                }
                if (!param0) {
                  L2: {
                    if (pf.field_d != null) {
                      pf.field_d.a(5);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null != hc.field_c) {
                      try {
                        L4: {
                          hc.field_c.d(false);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          iOException = (IOException) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (tk.field_p != null) {
                    var1_int = 0;
                    L6: while (true) {
                      if (tk.field_p.length <= var1_int) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        if (var3 == 0) {
                          L7: {
                            if (null == tk.field_p[var1_int]) {
                              break L7;
                            } else {
                              try {
                                L8: {
                                  tk.field_p[var1_int].d(false);
                                  break L8;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L9: {
                                  var2_ref = (IOException) (Object) decompiledCaughtException;
                                  break L9;
                                }
                              }
                              break L7;
                            }
                          }
                          var1_int++;
                          continue L6;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw fc.a((Throwable) ((Object) var1), "m.C(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = new nc();
    }
}
