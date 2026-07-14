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
        param0.addKeyListener((java.awt.event.KeyListener) (Object) tf.field_p);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) tf.field_p);
    }

    final void a(kg param0, byte param1) {
        if (param1 <= 47) {
            return;
        }
        param0.a(((ii) this).field_h, (byte) 46);
        param0.a(11404, ((ii) this).field_j);
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
        if (param0) {
            java.applet.Applet discarded$0 = ii.b(false);
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (param0 == 74) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (var1 >= 10) {
            return;
          } else {
            if (fb.field_d[var1] != null) {
              L2: {
                if ((1 << var1 & ih.field_a) != 0) {
                  stackOut_8_0 = 32;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 16;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var2 = stackIn_9_0;
                if ((1 << var1 & ih.field_a) != 0) {
                  stackOut_11_0 = 50;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 30;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              var3 = stackIn_12_0;
              gb.field_a[var1] = gb.field_a[var1] + 1;
              if (var3 != gb.field_a[var1]) {
                L4: {
                  if ((1 << var1 & ih.field_a) != 0) {
                    stackOut_16_0 = 1024;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 512;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var4 = stackIn_17_0 / (gb.field_a[var1] + 8);
                  var5 = uh.field_g[var1] - var4;
                  if (var5 >= 4 - -var2 << -1285699900) {
                    break L5;
                  } else {
                    var5 = var2 + 4 << 991886948;
                    break L5;
                  }
                }
                uh.field_g[var1] = var5;
                var1++;
                continue L1;
              } else {
                fb.field_d[var1] = null;
                var1++;
                continue L1;
              }
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    ii(String param0, String param1) {
        ((ii) this).field_h = param0;
        ((ii) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Spread fire";
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
