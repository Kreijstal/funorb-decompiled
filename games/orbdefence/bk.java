/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends IOException {
    static hj[] field_d;
    static String field_a;
    static String field_b;
    static int field_e;
    static String field_c;
    static String[] field_f;

    final static void a(int param0, hj[] param1) {
        dm.field_b = param1;
        if (param0 != 90) {
            return;
        }
        if (dm.field_b != null) {
            if (!(param1.length >= 3)) {
                throw new IllegalArgumentException("");
            }
        }
    }

    bk(String param0) {
        super(param0);
    }

    final static fh a(int param0, java.awt.Component param1, int param2, boolean param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            fh var5 = null;
            ij var5_ref = null;
            fh stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            fh stackOut_2_0 = null;
            try {
              L0: {
                if (!param3) {
                  break L0;
                } else {
                  field_c = null;
                  break L0;
                }
              }
              var4 = Class.forName("ch");
              var5 = (fh) var4.newInstance();
              var5.a(88, param2, param0, param1);
              stackOut_2_0 = (fh) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(boolean param0, int param1, vg param2) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        se var7 = uk.field_b;
        se var8 = var7;
        var8.i(param1, -41);
        var8.field_i = var8.field_i + 1;
        int var4 = var8.field_i;
        if (!param0) {
            return;
        }
        var8.a(1, -62);
        var8.b((byte) -60, param2.field_t);
        var8.b((byte) -60, param2.field_g);
        var8.b((byte) -60, param2.field_k);
        var8.b(param2.field_n, -1);
        var8.b(param2.field_m, -1);
        var8.b(param2.field_f, -1);
        var8.b(param2.field_r, -1);
        var8.a(param2.field_o.length, -118);
        for (var5 = 0; var5 < param2.field_o.length; var5++) {
            var7.b(param2.field_o[var5], -1);
        }
        int discarded$0 = var8.e(-18951, var4);
        var8.c((byte) -15, var8.field_i - var4);
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var4 <= var5) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + var6 + 1);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (122 < var6) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(1 + (var6 - 97));
                      break L2;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-21 + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if ((var2 ^ -1L) > -177917621779460414L) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L5: {
            if (param0 >= 121) {
              break L5;
            } else {
              var8 = null;
              String discarded$1 = bk.a((byte[]) null, 109);
              break L5;
            }
          }
          L6: while (true) {
            L7: {
              if (0L != var2 % 37L) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 48) {
            field_d = null;
        }
    }

    final static String a(byte[] param0, int param1) {
        if (param1 != -12465) {
            Object var3 = null;
            bk.a(true, 92, (vg) null);
        }
        return tj.a(param0.length, 0, 0, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "AWESOMEO";
        field_a = "Waiting for fonts";
        field_e = 0;
        field_c = "BEST HISCORES";
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
