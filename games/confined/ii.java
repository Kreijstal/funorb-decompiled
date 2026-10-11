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
        if (param1 != 30) {
          return;
        }
        try {
          param0.addKeyListener(tf.field_p);
          param0.addFocusListener(tf.field_p);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ii.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(kg param0, byte param1) {
        if (param1 <= 47) {
          return;
        }
        try {
          param0.a(this.field_h, (byte) 46);
          param0.a(11404, this.field_j);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ii.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet b(boolean param0) {
        if (null != kc.field_d) {
          return kc.field_d;
        }
        if (param0) {
          field_i = (String) null;
        }
        return (java.applet.Applet) ((Object) rj.field_e);
    }

    final si b(byte param0) {
        int var2 = 111 % ((51 - param0) / 57);
        return gh.field_a;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        if (param0) {
          ii.b(false);
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 74) {
            field_i = (String) null;
          }
          for (var1_int = 0; var1_int < 10; var1_int++) {
            if (fb.field_d[var1_int] != null) {
              stackIn_11_0 = ((1 << var1_int & ih.field_a) != 0) ? 32 : 16;
              var2 = stackIn_11_0;
              stackIn_14_0 = ((1 << var1_int & ih.field_a) != 0) ? 50 : 30;
              var3 = stackIn_14_0;
              gb.field_a[var1_int] = gb.field_a[var1_int] + 1;
              if (var3 != gb.field_a[var1_int]) {
                stackIn_19_0 = ((1 << var1_int & ih.field_a) != 0) ? 1024 : 512;
                var4 = stackIn_19_0 / (gb.field_a[var1_int] + 8);
                var5 = uh.field_g[var1_int] - var4;
                if (var5 < 4 + var2 << 4) {
                  var5 = var2 + 4 << 4;
                }
                uh.field_g[var1_int] = var5;
              } else {
                fb.field_d[var1_int] = null;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ii.C(" + param0 + ')');
        }
    }

    ii(String param0, String param1) {
        try {
          this.field_h = param0;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Spread fire";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
