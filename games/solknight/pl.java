/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static da field_d;
    static int field_a;
    static kb field_b;
    static int[] field_c;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
            if (param1 != -15071) {
                return;
            }
            try {
                param0.getAppletContext().showDocument(kk.a(param1 ^ -15030, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -5045) {
            field_d = null;
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = SolKnight.field_L ? 1 : 0;
          mi.b(param4, param3, 1 + param2, 10000536);
          mi.b(param4, param1 + param3, 1 + param2, 12105912);
          var5 = 1;
          var6 = param1;
          if (param3 + var5 < mi.field_l) {
            var5 = -param3 + mi.field_l;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 - -var6 <= mi.field_e) {
            break L1;
          } else {
            var6 = mi.field_e - param3;
            break L1;
          }
        }
        if (param0) {
          var7 = var5;
          L2: while (true) {
            if (var7 >= var6) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param1);
              var9 = var8 << 1066723688 | var8 << 1268934448 | var8;
              mi.field_f[param4 + mi.field_a * (param3 + var7)] = var9;
              mi.field_f[param2 + (param4 + mi.field_a * (var7 + param3))] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          field_b = null;
          var7 = var5;
          L3: while (true) {
            if (var7 >= var6) {
              return;
            } else {
              var8 = 152 - -(var7 * 48 / param1);
              var9 = var8 << 1066723688 | var8 << 1268934448 | var8;
              mi.field_f[param4 + mi.field_a * (param3 + var7)] = var9;
              mi.field_f[param2 + (param4 + mi.field_a * (var7 + param3))] = var9;
              var7++;
              continue L3;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kb();
        field_c = new int[8192];
    }
}
