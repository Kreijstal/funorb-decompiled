/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_b;
    static int field_a;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = fa.a((byte) 117, "", param1, '_');
              if (param2 == 0) {
                break L1;
              } else {
                id.a((byte) 108, 39, 2);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ag.a(param1, 1);
                if ((param0.indexOf(param1) ^ -1) != 0) {
                  break L3;
                } else {
                  if ((param0.indexOf(var3) ^ -1) == 0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("id.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static o a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        o var6 = new o(param2, param2);
        o var3 = var6;
        if (param0 <= 51) {
            id.a((byte) -66, -95, 21);
        }
        for (var4 = 0; var4 < var3.field_B.length; var4++) {
            var6.field_B[var4] = param1;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            byte[] var2 = (byte[]) null;
            id.a((byte[]) null, -117, 97, 106);
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        qk var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param1 < param3) {
                var8 = new byte[param2];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param2 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[var5_int + param3];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param0;
                break L1;
              }
            }
            var5 = new qk();
            var5.a(117);
            var5.a((long)(param2 * 8), var4, (byte) -19);
            var6 = new byte[64];
            var5.a(var6, 0, (byte) 124);
            stackIn_7_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("id.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            String var3 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (jc.field_H == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (wh.field_j == hi.field_l) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (-1 != (n.field_b.field_m ^ -1)) {
                    break L2;
                  } else {
                    if (hi.field_k - -10000L < d.a((byte) 44)) {
                      n.field_b.c((byte) 65, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 <= (n.field_b.field_m ^ -1)) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        jc.field_H.a(n.field_b.field_m, n.field_b.field_k, 1, 0);
                        hi.field_k = d.a((byte) 29);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ql.a(param0 ^ 17);
                        break L5;
                      }
                    }
                    n.field_b.field_m = 0;
                    break L3;
                  }
                }
                L6: {
                  if (param0 == -67) {
                    break L6;
                  } else {
                    var3 = (String) null;
                    id.a((String) null, (String) null, -41);
                    break L6;
                  }
                }
                return;
              }
            }
            n.field_b.field_m = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = 0;
        field_b = new int[1024];
    }
}
