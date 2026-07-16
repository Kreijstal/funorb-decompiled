/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ca {
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    final static jj a(int param0, int param1, int param2, pf param3, gk param4) {
        if (param1 != 24325) {
            return null;
        }
        byte[] var6 = param3.a(param2, 16, param0);
        byte[] var5 = var6;
        if (var6 == null) {
            return null;
        }
        return new jj(new ka(var6), param4);
    }

    final static void a(int param0, kl param1, byte param2) {
        int var3 = 112 / ((11 - param2) / 36);
        ha var4 = pg.field_fb;
        var4.f(param0, 950);
        var4.field_k = var4.field_k + 1;
        int var5 = var4.field_k;
        var4.a(false, 1);
        var4.a(false, param1.field_l);
        var4.a(false, param1.field_s);
        var4.b(0, param1.field_m);
        var4.b(0, param1.field_n);
        var4.b(0, param1.field_q);
        var4.b(0, param1.field_p);
        int discarded$0 = var4.c(var5, (byte) -3);
        var4.a(var4.field_k + -var5, (byte) -94);
    }

    final static byte[] a(int param0, String param1) {
        if (param0 < 84) {
            field_a = null;
        }
        return nc.field_y.a("", param1, (byte) -12);
    }

    final static void a(ka param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = stellarshard.field_B;
              var6 = new byte[24];
              var2 = var6;
              if (e.field_a != null) {
                try {
                  L1: {
                    e.field_a.a(0L, 0);
                    e.field_a.a(0, var6);
                    var3_int = 0;
                    L2: while (true) {
                      L3: {
                        if (24 <= var3_int) {
                          break L3;
                        } else {
                          if (0 != var6[var3_int]) {
                            break L3;
                          } else {
                            var3_int++;
                            continue L2;
                          }
                        }
                      }
                      if (-25 < (var3_int ^ -1)) {
                        break L1;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    var4 = 0;
                    L5: while (true) {
                      if (var4 >= 24) {
                        break L4;
                      } else {
                        var2[var4] = (byte)-1;
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
            L6: {
              if (param1 == -23074) {
                break L6;
              } else {
                field_a = null;
                break L6;
              }
            }
            param0.a(24, 0, (byte) -13, var2);
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
        field_a = "Confirm Email:";
    }
}
