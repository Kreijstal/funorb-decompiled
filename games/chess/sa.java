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

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            if (param6 != 27690) {
                field_e = -20L;
            }
            ak.field_q[param4] = param0;
            ak.field_k[param4] = param5;
            ak.field_r[param4] = param1;
            ak.field_m[param4] = param3;
            ak.field_y[param4] = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "sa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -20127) {
            return;
        }
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static void a(p param0, int param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3 = 0;
            int var4_int = 0;
            Exception var4 = null;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
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
                  var3 = 40 % ((30 - param1) / 62);
                  var10 = new byte[24];
                  var8 = var10;
                  var7 = var8;
                  var11 = var7;
                  var9 = var11;
                  var2 = var9;
                  if (null != tc.field_z) {
                    try {
                      L2: {
                        tc.field_z.a(0L, 0);
                        tc.field_z.a(0, var10);
                        var4_int = 0;
                        L3: while (true) {
                          L4: {
                            if (24 <= var4_int) {
                              break L4;
                            } else {
                              if (0 == var11[var4_int]) {
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
                          if ((var5 ^ -1) <= -25) {
                            break L5;
                          } else {
                            var2[var5] = (byte)-1;
                            var5++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(var11, (byte) -45, 0, 24);
                    break L1;
                  } else {
                    param0.a(var11, (byte) -45, 0, 24);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) (var2_ref);
                stackOut_16_1 = new StringBuilder().append("sa.C(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ek b(int param0) {
        try {
            ek discarded$2 = null;
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
                    discarded$2 = sa.b(-8);
                    break L1;
                  }
                }
                stackOut_2_0 = (ek) (Class.forName("oe").newInstance());
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
        field_f = "Staff impersonation";
        field_d = "From <%0>: ";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
