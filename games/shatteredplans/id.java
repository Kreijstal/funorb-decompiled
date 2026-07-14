/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_b;
    static String field_a;
    static String field_e;
    static byte[] field_c;
    static ln field_d;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != -77) {
            field_a = null;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                int var3 = 3 / ((12 - param1) / 37);
                param0.getAppletContext().showDocument(jg.a(param0, false, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        int var1 = -6 / ((-56 - param0) / 40);
        if (ln.field_o == null) {
            return "";
        }
        return ln.field_o;
    }

    final static bi a(int param0, bc param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 2) {
          field_d = null;
          var4 = param1.a(125, param2);
          var5 = param1.a(var4, (byte) 106, param3);
          return ga.a(param1, var5, var4, -20487);
        } else {
          var4 = param1.a(125, param2);
          var5 = param1.a(var4, (byte) 106, param3);
          return ga.a(param1, var5, var4, -20487);
        }
    }

    final static void a(String[] args, int param1, sq param2) {
        lm var3 = null;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        lm var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = new lm();
        var3 = var7;
        var7.field_c = args[param1];
        if (-3 <= (args.length ^ -1)) {
          var7.field_b = args[1];
          param2.a((byte) 33, var3);
          return;
        } else {
          var4 = new StringBuilder(args[1]);
          var5 = 2;
          L0: while (true) {
            if (args.length <= var5) {
              var3.field_b = var4.toString();
              param2.a((byte) 33, var3);
              return;
            } else {
              StringBuilder discarded$16 = var4.append(", ");
              StringBuilder discarded$17 = var4.append(args[var5]);
              var5++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = 0;
          if (-1 != (param1 ^ -1)) {
            break L0;
          } else {
            var2 = vm.field_Bb;
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) == -2) {
            var2 = sq.field_a;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) != -3) {
            break L2;
          } else {
            var2 = ul.field_Hb;
            break L2;
          }
        }
        if (param0 != -7019) {
          var3 = null;
          bi discarded$2 = id.a(20, (bc) null, (String) null, (String) null);
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        field_b = param4;
        e.field_d = param0;
        if (param2 != 26883) {
          field_b = 22;
          dp.field_v = param1;
          je.field_g = param3;
          return;
        } else {
          dp.field_v = param1;
          je.field_g = param3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Clan";
        field_e = "Hide players in <%0>'s game";
    }
}
