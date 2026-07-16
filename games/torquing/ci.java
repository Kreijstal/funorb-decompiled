/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ci {
    static int field_c;
    private static long[] field_a;
    static String field_b;
    static String field_d;

    final static void a(int param0, String[] param1) {
        if (!(ib.field_b == null)) {
            ib.field_b.field_M.a(param1, -121);
        }
        if (!(je.field_g == null)) {
            je.field_g.field_I.a(param1, -123);
        }
        int var2 = -62 % ((param0 - -12) / 62);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 2) {
            ci.b(-22);
        }
        field_a = null;
    }

    final static up a(int param0, String param1) {
        int var2 = 98 / ((param0 - -18) / 60);
        return new up(param1);
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = Torquing.field_u;
              if (param0 == 0) {
                break L0;
              } else {
                field_b = null;
                break L0;
              }
            }
            L1: {
              if (null != nn.field_c) {
                nn.field_c.b((byte) -101);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == gh.field_a) {
                break L2;
              } else {
                gh.field_a.a((byte) -95);
                break L2;
              }
            }
            L3: {
              if (null == jd.field_F) {
                break L3;
              } else {
                try {
                  L4: {
                    jd.field_F.a(false);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (uj.field_b == null) {
                break L6;
              } else {
                var1 = 0;
                L7: while (true) {
                  if (uj.field_b.length <= var1) {
                    break L6;
                  } else {
                    if (uj.field_b[var1] != null) {
                      try {
                        L8: {
                          uj.field_b[var1].a(false);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (!((param0 ^ -1) >= -1)) {
            var2 = 1;
            if (65535 < param0) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!((param0 ^ -1) >= -256)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (param0 > 15) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(3 >= param0)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (!(param0 <= 1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = param1;
        if (65535 < (param0 ^ -1)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (param0 < -16) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if ((param0 ^ -1) > 3) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_a = new long[256];
        field_b = "Password is valid";
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_d = "Waiting for extra data";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_a[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L == (var0 & 1L)) {
                  var0 = var0 >>> -1512199487 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
