/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fjb implements dja {
    static String field_b;
    static String field_a;
    static kob field_c;

    public final tv a(byte param0) {
        int var2 = 124 % ((-64 - param0) / 50);
        return (tv) (Object) new rha();
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 < 76) {
            field_b = null;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = null;
            return (tv[]) (Object) new rha[param1];
        }
        return (tv[]) (Object) new rha[param1];
    }

    final static nc a(String param0, nc[] param1, rqa[] param2, byte param3) throws gva {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        var6 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (param2.length <= var4) {
            if (param3 >= -122) {
              return null;
            } else {
              var7 = new StringBuilder("The method " + param0 + "(");
              var5 = 0;
              L1: while (true) {
                if (param1.length <= var5) {
                  StringBuilder discarded$204 = var7.append(") is undefined.");
                  throw new gva(var7.toString());
                } else {
                  L2: {
                    if (param1[var5].field_a) {
                      StringBuilder discarded$205 = var7.append(sna.a(param1[var5].field_b, (byte) 119).toString());
                      break L2;
                    } else {
                      StringBuilder discarded$206 = var7.append(wp.a(param1[var5].field_b.getClass(), false));
                      break L2;
                    }
                  }
                  if (-1 + param1.length <= var5) {
                    var5++;
                    var5++;
                    var5++;
                    continue L1;
                  } else {
                    StringBuilder discarded$207 = var7.append(44);
                    var5++;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            if (!param2[var4].a(true, param0, param1)) {
              var4++;
              continue L0;
            } else {
              return param2[var4].a(param1, -123);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_b = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_a = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
    }
}
