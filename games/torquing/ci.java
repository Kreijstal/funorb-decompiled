/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ci {
    static int field_c;
    private static long[] field_a;
    static String field_b;
    static String field_d;

    final static void a(int param0, String[] param1) {
        try {
            if (!(ib.field_b == null)) {
                ib.field_b.field_M.a(param1, -121);
            }
            if (!(je.field_g == null)) {
                je.field_g.field_I.a(param1, -123);
            }
            int var2_int = -62 % ((param0 - -12) / 62);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ci.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 2) {
            ci.b(-22);
        }
        field_a = null;
    }

    final static up a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        up stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 98 / ((param0 - -18) / 60);
            stackOut_0_0 = new up(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Torquing.field_u;
            try {
              L0: {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_b = (String) null;
                    break L1;
                  }
                }
                L2: {
                  if (null != nn.field_c) {
                    nn.field_c.b((byte) -101);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == gh.field_a) {
                    break L3;
                  } else {
                    gh.field_a.a((byte) -95);
                    break L3;
                  }
                }
                L4: {
                  if (null == jd.field_F) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        jd.field_F.a(false);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                L7: {
                  if (uj.field_b == null) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (uj.field_b.length <= var1_int) {
                        break L7;
                      } else {
                        if (uj.field_b[var1_int] != null) {
                          try {
                            L9: {
                              uj.field_b[var1_int].a(false);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw rb.a((Throwable) ((Object) var1), "ci.E(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (!((param0 ^ -1) >= -1)) {
            var2 = 1;
            if (65535 < param0) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!((param0 ^ -1) >= -256)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (param0 > 15) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(3 >= param0)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (!(param0 <= 1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = param1;
        if (65535 < (param0 ^ -1)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (param0 < -16) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if ((param0 ^ -1) > 3) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_a = new long[256];
            field_b = "Password is valid";
            var2 = 0;
            L0: while (true) {
              if (var2 >= 256) {
                field_d = "Waiting for extra data";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (8 <= var3) {
                    field_a[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L == (var0 & 1L)) {
                      var0 = var0 >>> -1512199487 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
