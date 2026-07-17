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
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = param0;
            L1: while (true) {
              if (var4 <= var5) {
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  if (param2.charAt(var5) == param1) {
                    var3_int++;
                    var5++;
                    break L2;
                  } else {
                    var5++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("m.D(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_h = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static rb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        rb var6 = null;
        if (param3 != -6) {
          field_h = null;
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
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
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
                      {
                        L4: {
                          hc.field_c.d(false);
                          break L4;
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
                        break L0;
                      } else {
                        L7: {
                          if (null == tk.field_p[var1_int]) {
                            var1_int++;
                            break L7;
                          } else {
                            {
                              L8: {
                                tk.field_p[var1_int].d(false);
                                var1_int++;
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        var1_int++;
                        continue L6;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw fc.a((Throwable) (Object) var1_ref, "m.C(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new nc();
    }
}
