/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb implements sm {
    private ac field_f;
    static boolean field_e;
    static long field_g;
    int[] field_d;
    int field_b;
    int field_c;
    static String[] field_a;

    final static int a(int param0) {
        om.field_c.a((byte) 95);
        if (ul.field_r.f(param0 + param0)) {
            return 0;
        }
        return wl.t(19078);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2_ref = null;
            try {
                var2_ref = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(jf.a(param1, var2_ref, -69), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            int var2 = -36 / ((-4 - param0) / 53);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lb(kj param0, pa param1, ac param2) {
        jg var5 = null;
        vh var6 = null;
        if (!(param1 instanceof vh)) {
            if (!(param1 instanceof jg)) {
                throw new RuntimeException();
            }
            var5 = (jg) param1;
            ((lb) this).field_b = ((jg) var5).field_p;
            ((lb) this).field_c = ((jg) var5).field_o;
            ((lb) this).field_d = ((jg) var5).field_E;
        } else {
            var6 = (vh) param1;
            ((lb) this).field_b = ((vh) var6).field_p;
            ((lb) this).field_c = ((vh) var6).field_o;
            ((lb) this).field_d = ((vh) var6).field_E;
        }
        if (param2 == null) {
        }
        ((lb) this).field_f = param2;
        if (((lb) this).field_f.field_a != ((lb) this).field_c) {
            throw new RuntimeException();
        }
        if (((lb) this).field_f.field_g != ((lb) this).field_b) {
            throw new RuntimeException();
        }
    }

    final static void a(int param0, int param1) {
        dl var2 = null;
        if (param1 != 0) {
          field_e = true;
          var2 = q.field_p;
          var2.g(109, param0);
          var2.b(param1 + -1336879960, 1);
          var2.b(-1336879960, 2);
          return;
        } else {
          var2 = q.field_p;
          var2.g(109, param0);
          var2.b(param1 + -1336879960, 1);
          var2.b(-1336879960, 2);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 < 18) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param0 = lm.a('_', -128, param0, "");
        var3 = ph.a(param0, 0);
        var4 = -32 % ((param2 - -6) / 63);
        if (0 == (param1.indexOf(param0) ^ -1)) {
          if (-1 != param1.indexOf(var3)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0L;
        field_a = new String[]{"Knight of Skies", "King of Skies", "Ace of Skies", "Squadron Leader", "Flying Fortress", "Veteran", "Defender of the Realm", "Top Gun", "Kamikaze"};
        field_e = true;
    }
}
