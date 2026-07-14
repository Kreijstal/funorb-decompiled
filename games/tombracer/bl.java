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
            if (!km.field_p.a(param0 + 0)) {
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
            if (!km.field_p.a(param0 + 0)) {
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TombRacer.field_G ? 1 : 0;
        bea.c(param3, param1, param4 + param0, 10000536);
        bea.c(param3, param2 + param1, param0 - -1, 12105912);
        int var5 = 1;
        if (var5 + param1 < bea.field_h) {
            var5 = -param1 + bea.field_h;
        }
        int var6 = param2;
        if (bea.field_k < var6 + param1) {
            var6 = bea.field_k - param1;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = var7 * 48 / param2 + 152;
            var9 = var8 << -1662844688 | var8 << -230884408 | var8;
            bea.field_l[param3 + (var7 + param1) * bea.field_g] = var9;
            bea.field_l[param0 + ((var7 + param1) * bea.field_g + param3)] = var9;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 83) {
            field_a = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (oba.field_e == null) {
                break L0;
              } else {
                L1: {
                  if (-1 < param0) {
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
                  if (param1 != ql.field_k.field_h) {
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
                    try {
                      oba.field_e.a(ql.field_k.field_g, 0, ql.field_k.field_h, param1 + 119);
                      mha.field_D = bva.b((byte) -107);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    dea.a(60);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ql.field_k.field_h = 0;
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
