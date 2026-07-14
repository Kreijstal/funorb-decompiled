/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_c;
    static String field_f;
    static gi field_d;
    static hl field_g;
    static int field_b;
    static int field_e;
    static volatile int field_a;

    final static void a(int param0, hl[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param1 != null) {
          if (-1 <= (param4 ^ -1)) {
            return;
          } else {
            var5 = param1[0].field_x;
            var6 = param1[2].field_x;
            var7 = param1[1].field_x;
            param1[0].e(param2, param3);
            param1[2].e(param2 + param4 + -var6, param3);
            ki.a(be.field_c);
            ki.c(var5 + param2, param3, -var6 + param2 + param4, param1[1].field_q + param3);
            var8 = param2 - -var5;
            var9 = 80 % ((param0 - 53) / 32);
            var10 = param2 + (param4 + -var6);
            param2 = var8;
            L0: while (true) {
              if (var10 <= param2) {
                ki.b(be.field_c);
                return;
              } else {
                param1[1].e(param2, param3);
                param2 = param2 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param0.getDocumentBase().getFile();
                            var4 = var2;
                            var4 = var2;
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (-1 < (var3 ^ -1)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = new java.net.URL(param0.getCodeBase(), var4);
                            param0.getAppletContext().showDocument(wh.a(127, var5, param0), "_self");
                            if (param1 == 0) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            field_f = null;
                            return;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          wj.a((java.applet.Applet) null, -56);
          field_d = null;
          field_f = null;
          field_c = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_c = null;
          field_g = null;
          return;
        }
    }

    final static void b(boolean param0) {
        bc var1 = null;
        bc var1_ref = null;
        Object var2 = null;
        L0: {
          var1 = (bc) (Object) va.field_h.d(77);
          if (var1 == null) {
            var1_ref = new bc();
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          var2 = null;
          wj.a(-47, (hl[]) null, 85, -18, 75);
          var1_ref.a(ki.field_j, ki.field_g, ki.field_i, ki.field_a, ki.field_l, ki.field_e, ki.field_f, false);
          gi.field_a.b(70, (rf) (Object) var1_ref);
          return;
        } else {
          var1_ref.a(ki.field_j, ki.field_g, ki.field_i, ki.field_a, ki.field_l, ki.field_e, ki.field_f, false);
          gi.field_a.b(70, (rf) (Object) var1_ref);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_e = 0;
        field_g = new hl(540, 140);
        field_a = -1;
    }
}
