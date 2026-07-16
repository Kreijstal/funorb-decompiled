/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lo {
    static db field_a;
    static String[] field_c;
    static hp field_b;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.length()) {
            if (param1 > 42) {
              return false;
            } else {
              return true;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!ep.a((char) var3, (byte) -14)) {
              if (!ag.a((char) var3, 48)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, ng param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              L1: {
                var5 = CrazyCrystals.field_B;
                var6 = new byte[param0];
                var2 = var6;
                if (fp.field_e == null) {
                  break L1;
                } else {
                  try {
                    L2: {
                      fp.field_e.a(0L, -1);
                      fp.field_e.a(var6, -88);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          if (var3_int >= 24) {
                            break L4;
                          } else {
                            if (-1 != var6[var3_int]) {
                              break L4;
                            } else {
                              var3_int++;
                              continue L3;
                            }
                          }
                        }
                        if (-25 <= var3_int) {
                          throw new IOException();
                        } else {
                          param1.a(0, 24, 76, var2);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L6: while (true) {
                        if (-25 >= (var4 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          var2[var4] = (byte)-1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param1.a(0, 24, 76, var2);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized static long a(byte param0) {
        int var3 = 103 % ((35 - param0) / 39);
        long var1 = System.currentTimeMillis();
        if (!(u.field_b <= var1)) {
            r.field_f = r.field_f + (u.field_b - var1);
        }
        u.field_b = var1;
        return var1 - -r.field_f;
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -114 / ((55 - param0) / 48);
        field_c = null;
        field_a = null;
    }

    static {
    }
}
