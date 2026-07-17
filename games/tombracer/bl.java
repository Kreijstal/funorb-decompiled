/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static String field_b;
    static is field_a;
    static int[] field_c;

    final static boolean b(int param0) {
        if (param0 == 0) {
          if (null != oba.field_e) {
            if (!km.field_p.a(param0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          bl.a(-92, 118);
          if (null != oba.field_e) {
            if (!km.field_p.a(param0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              bea.c(param3, param1, 1 + param0, 10000536);
              bea.c(param3, param2 + param1, param0 - -1, 12105912);
              var5_int = 1;
              if (var5_int + param1 >= bea.field_h) {
                break L1;
              } else {
                var5_int = -param1 + bea.field_h;
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (bea.field_k >= var6 + param1) {
                break L2;
              } else {
                var6 = bea.field_k - param1;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                break L0;
              } else {
                var8 = var7 * 48 / param2 + 152;
                var9 = var8 << 16 | var8 << 8 | var8;
                bea.field_l[param3 + (var7 + param1) * bea.field_g] = var9;
                bea.field_l[param0 + ((var7 + param1) * bea.field_g + param3)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "bl.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 1 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (oba.field_e == null) {
                break L0;
              } else {
                L1: {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (uga.field_n == km.field_p) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param1 != ~ql.field_k.field_h) {
                    break L2;
                  } else {
                    if (mha.field_D - -10000L < bva.b((byte) -107)) {
                      ql.field_k.k(param0, -2988);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ql.field_k.field_h > 0) {
                    {
                      L4: {
                        oba.field_e.a(ql.field_k.field_g, 0, ql.field_k.field_h, param1 + 119);
                        mha.field_D = bva.b((byte) -107);
                        break L4;
                      }
                    }
                    ql.field_k.field_h = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            ql.field_k.field_h = 0;
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
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = new int[]{0, 0, 1024, 0, 512, 0, -512, 0, 0, 0, 0, 0, 0};
    }
}
