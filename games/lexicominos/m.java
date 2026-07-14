/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_c;
    static byte[][] field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 1000) {
            field_a = null;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 70 / ((param1 - -35) / 38);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          L0: {
            if (param0 > -2049) {
              stackOut_7_0 = v.field_w[param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = v.field_w[4096 + -param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 <= param0) {
              stackOut_3_0 = -v.field_w[-param0 + 8192];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -v.field_w[-4096 + param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, String param1) {
        if (param0 < 73) {
            ((m) this).field_c = null;
            return ((m) this).field_c.equals((Object) (Object) param1);
        }
        return ((m) this).field_c.equals((Object) (Object) param1);
    }

    final static void a(String param0, int param1, boolean param2) {
        gb.field_d = true;
        lh.field_w = param2 ? true : false;
        int var3 = -67 / ((param1 - -72) / 33);
        jj.field_a = new uc(ug.field_A, ra.field_c, param0, ca.field_k, lh.field_w);
        ug.field_A.a(-14579, (w) (Object) jj.field_a);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 4096) {
            return;
        }
        te.a("jagex-last-login-method", 31536000L, param0, ((m) this).field_c, param1 + -3096);
    }

    final static void a(boolean param0, boolean param1, String param2, java.applet.Applet param3) {
        try {
            if (ab.field_b.startsWith("win")) {
                if (!(!ul.a(param2, 14080))) {
                    return;
                }
            }
            if (!param1) {
                return;
            }
            try {
                param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                uj.a("MGR1: " + param2, (Throwable) null, 1);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    m(String param0) {
        ((m) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Creating your account";
        field_a = new byte[1000][];
    }
}
