/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_f;
    String field_g;
    String field_d;
    static int field_b;
    static oi field_c;
    boolean field_h;
    static String[] field_a;
    static o field_e;

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        var4 = param3.length();
        var5 = param0.length();
        var6 = param2.length();
        if (param1 == var5) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          var7 = var4;
          var8 = var6 - var5;
          if (0 == var8) {
            var9 = new StringBuilder(var7);
            var10 = 0;
            L0: while (true) {
              var11 = param3.indexOf(param0, var10);
              if ((var11 ^ -1) <= -1) {
                StringBuilder discarded$6 = var9.append(param3.substring(var10, var11));
                StringBuilder discarded$7 = var9.append(param2);
                var10 = var11 + var5;
                continue L0;
              } else {
                StringBuilder discarded$8 = var9.append(param3.substring(var10));
                return var9.toString();
              }
            }
          } else {
            var9_int = 0;
            L1: while (true) {
              var9_int = param3.indexOf(param0, var9_int);
              if (-1 >= (var9_int ^ -1)) {
                var9_int = var9_int + var5;
                var7 = var7 + var8;
                continue L1;
              } else {
                var9 = new StringBuilder(var7);
                var10 = 0;
                L2: while (true) {
                  var11 = param3.indexOf(param0, var10);
                  if ((var11 ^ -1) <= -1) {
                    StringBuilder discarded$9 = var9.append(param3.substring(var10, var11));
                    StringBuilder discarded$10 = var9.append(param2);
                    var10 = var11 + var5;
                    continue L2;
                  } else {
                    StringBuilder discarded$11 = var9.append(param3.substring(var10));
                    return var9.toString();
                  }
                }
              }
            }
          }
        }
    }

    final static o[] a(int param0, int param1) {
        o[] var2 = null;
        o[] var3 = null;
        if (param1 != 9) {
          return null;
        } else {
          var3 = new o[9];
          var2 = var3;
          var3[4] = id.a((byte) 98, param0, 64);
          return var2;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          String discarded$2 = wg.a((String) null, 30, (String) null, (String) null);
          field_a = null;
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 1234) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(jl.a(param0 + -1338, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
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
        field_f = "World:<col=ffff00>";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
