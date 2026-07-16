/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh {
    static String field_b;
    static String field_a;

    final static void a(int param0, int param1) {
        if (param0 != 24) {
            field_a = null;
        }
        ta.field_a = 1000000000L / (long)param1;
    }

    final static void a(gb param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = SolKnight.field_L ? 1 : 0;
              var6 = new byte[24];
              var2 = var6;
              if (pj.field_D == null) {
                break L0;
              } else {
                try {
                  L1: {
                    pj.field_D.a(0L, (byte) 45);
                    pj.field_D.a((byte) 58, var6);
                    var3_int = 0;
                    L2: while (true) {
                      L3: {
                        if (24 <= var3_int) {
                          break L3;
                        } else {
                          if (var6[var3_int] != 0) {
                            break L3;
                          } else {
                            var3_int++;
                            continue L2;
                          }
                        }
                      }
                      if ((var3_int ^ -1) > -25) {
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
              }
            }
            L6: {
              param0.a(8, 24, var2, 0);
              if (param1 >= 54) {
                break L6;
              } else {
                vh.a(120, 92);
                break L6;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            vh.a((gb) null, 57);
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = "Quit";
    }
}
