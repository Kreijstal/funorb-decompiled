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
        try {
          if (ib.field_b != null) {
            ib.field_b.field_M.a(param1, -121);
          }
          if (je.field_g != null) {
            je.field_g.field_I.a(param1, -123);
          }
          int var2_int = -62 % ((param0 + 12) / 62);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ci.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        int var2_int = 0;
        RuntimeException var2 = null;
        up stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 98 / ((param0 + 18) / 60);
          stackIn_1_0 = new up(param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Torquing.field_u;
          try {
            if (param0 != 0) {
              field_b = (String) null;
            }
            if (null != nn.field_c) {
              nn.field_c.b((byte) -101);
            }
            if (null != gh.field_a) {
              gh.field_a.a((byte) -95);
            }
            if (null != jd.field_F) {
              try {
                jd.field_F.a(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (uj.field_b != null) {
              for (var1_int = 0; uj.field_b.length > var1_int; var1_int++) {
                if (uj.field_b[var1_int] != null) {
                  try {
                    uj.field_b[var1_int].a(false);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw rb.a((Throwable) ((Object) var1), "ci.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (65535 < param0) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 > 15) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (3 < param0) {
            param0 = param0 >> 2;
            var2 += 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = param1;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_a = new long[256];
        field_b = "Password is valid";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if (1L == (var0 & 1L)) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_a[var2] = var0;
        }
        field_d = "Waiting for extra data";
    }
}
