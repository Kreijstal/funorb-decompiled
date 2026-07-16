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
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param1 = fa.a((byte) 117, "", param1, '_');
          if (param2 == 0) {
            break L0;
          } else {
            o discarded$2 = id.a((byte) 108, 39, 2);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ag.a(param1, 1);
            if ((param0.indexOf(param1) ^ -1) != 0) {
              break L2;
            } else {
              if ((param0.indexOf(var3) ^ -1) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static o a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        o var6 = new o(param2, param2);
        o var3 = var6;
        if (param0 <= 51) {
            o discarded$0 = id.a((byte) -66, -95, 21);
        }
        for (var4 = 0; var4 < var3.field_B.length; var4++) {
            var6.field_B[var4] = param1;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            byte[] discarded$0 = id.a((byte[]) null, -117, 97, 106);
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = wizardrun.field_H;
        if (param1 >= param3) {
            var4 = param0;
        } else {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; param2 > var5_int; var5_int++) {
                var8[var5_int] = param0[var5_int + param3];
            }
        }
        qk var5 = new qk();
        var5.a(117);
        var5.a((long)(param2 * 8), var4, (byte) -19);
        byte[] var6 = new byte[64];
        var5.a(var6, 0, (byte) 124);
        return var6;
    }

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            Object var3 = null;
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
                  if (-1 != n.field_b.field_m) {
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
                  if (-1 >= n.field_b.field_m) {
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
                    var3 = null;
                    boolean discarded$2 = id.a((String) null, (String) null, -41);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new int[1024];
    }
}
