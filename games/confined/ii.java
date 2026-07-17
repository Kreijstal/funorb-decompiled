/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends em {
    private String field_j;
    static String field_i;
    private String field_h;
    static String field_g;

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        try {
            param0.addKeyListener((java.awt.event.KeyListener) (Object) tf.field_p);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) tf.field_p);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ii.F(" + (param0 != null ? "{...}" : "null") + 44 + 30 + 41);
        }
    }

    final void a(kg param0, byte param1) {
        if (param1 <= 47) {
            return;
        }
        try {
            param0.a(((ii) this).field_h, (byte) 46);
            param0.a(11404, ((ii) this).field_j);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ii.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static java.applet.Applet b(boolean param0) {
        if (null != kc.field_d) {
            return kc.field_d;
        }
        if (param0) {
            field_i = null;
        }
        return (java.applet.Applet) (Object) rj.field_e;
    }

    final si b(byte param0) {
        int var2 = 111 % ((51 - param0) / 57);
        return gh.field_a;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
    }

    final static void c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 10) {
                break L0;
              } else {
                L2: {
                  if (fb.field_d[var1_int] == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ii.C(" + 74 + 41);
        }
    }

    ii(String param0, String param1) {
        try {
            ((ii) this).field_h = param0;
            ((ii) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ii.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Spread fire";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
