/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static km[] field_c;
    static String field_d;
    static String field_f;
    static char[] field_a;
    static String[] field_b;
    static long field_e;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ak.field_q[param4] = param0;
            ak.field_k[param4] = param5;
            ak.field_r[param4] = param1;
            ak.field_m[param4] = param3;
            ak.field_y[param4] = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "sa.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + 27690 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static void a(p param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var6 = Chess.field_G;
            try {
              L0: {
                L1: {
                  var3 = 0;
                  var7 = new byte[24];
                  var2 = var7;
                  if (null != tc.field_z) {
                    try {
                      L2: {
                        tc.field_z.a(0L, 0);
                        tc.field_z.a(0, var7);
                        var4_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var4_int) {
                              break L4;
                            } else {
                              if (0 == var2[var4_int]) {
                                var4_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (24 > var4_int) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        var5 = 0;
                        L6: while (true) {
                          if (var5 >= 24) {
                            break L5;
                          } else {
                            var2[var5] = (byte) -1;
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(var2, (byte) -45, 0, 24);
                    break L1;
                  } else {
                    param0.a(var2, (byte) -45, 0, 24);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("sa.C(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 109 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ek b(int param0) {
        try {
            Throwable var1 = null;
            ek stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ek stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 24) {
                    break L1;
                  } else {
                    ek discarded$2 = sa.b(-8);
                    break L1;
                  }
                }
                stackOut_2_0 = (ek) Class.forName("oe").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Staff impersonation";
        field_d = "From <%0>: ";
        field_a = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
