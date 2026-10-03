/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends IntrusiveNode {
    int[] field_g;
    static gk field_h;
    boolean field_f;
    static int[] field_i;
    int field_j;

    public static void c(int param0) {
        field_h = null;
        if (param0 != 59) {
            return;
        }
        field_i = null;
    }

    final static boolean ensureArchiveCatalogLoaded(int methodGuard) {
        int unusedCatalogGuardRemainder = -46 % ((methodGuard + 28) / 60);
        return gb.archiveCatalog.ensureCatalogLoaded((byte) 126);
    }

    final static boolean d(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 76) {
          field_h = (gk) null;
        }
        stackIn_6_0 = (ra.field_d > 0) && ((65536 & ra.field_d) != 0);
        return stackIn_6_0;
    }

    qi() {
        this.field_f = false;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            int var6 = 0;
            int var3_int = 0;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            int var8 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var3 = null;
            Throwable var4_ref = null;
            var8 = Geoblox.field_C;
            try {
              var3_int = -105 / ((param2 + 33) / 57);
              try {
                L0: {
                  var4 = (String) (wk.a((byte) -6, param1, "getcookies"));
                  var5 = uj.a(';', true, var4);
                  for (var6 = 0; var6 < var5.length; var6++) {
                    var7 = var5[var6].indexOf('=');
                    if (var7 >= 0) {
                      if (var5[var6].substring(0, var7).trim().equals(param0)) {
                        stackIn_7_0 = var5[var6].substring(1 + var7).trim();
                        return stackIn_7_0;
                      }
                    }
                  }
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
              }
              stackIn_12_0 = null;
              return (String) ((Object) stackIn_12_0);
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_15_0 = (RuntimeException) (var3);
              stackIn_15_1 = new StringBuilder().append("qi.B(");
              if (param0 == null) {
                stackIn_16_2 = "null";
              } else {
                stackIn_16_2 = "{...}";
              }
              stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
              if (param1 == null) {
                stackIn_19_2 = "null";
              } else {
                stackIn_19_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0, int param1) {
        if (param1 != 1) {
            return 99;
        }
        return AwtRasterBuffer.a((byte) -75, gk.field_d, param0);
    }

    static {
        field_h = new gk();
    }
}
