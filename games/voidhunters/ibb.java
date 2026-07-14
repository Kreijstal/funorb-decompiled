/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ibb {
    static int field_a;
    long field_b;
    private jp field_c;

    final static void a(int param0, int param1, int param2, String param3, byte param4, int param5, int param6, int param7) {
        Object var9 = null;
        if (li.field_i) {
          nma.field_b[param5].a(true, param0 | param1 << 107192920, param2 | param1 << -1773174184, param3, param6, param7);
          if (param4 <= -36) {
            return;
          } else {
            var9 = null;
            ibb.a(-50, -31, 102, (String) null, (byte) 43, -91, 35, -110);
            return;
          }
        } else {
          ita.a(param5, 7988).a(param3, param7, param6, param0, param2, param1);
          if (param4 <= -36) {
            return;
          } else {
            var9 = null;
            ibb.a(-50, -31, 102, (String) null, (byte) 43, -91, 35, -110);
            return;
          }
        }
    }

    protected final void finalize() throws Throwable {
        ((ibb) this).field_c.a(((ibb) this).field_b, 0);
        super.finalize();
    }

    ibb(jp param0, long param1, ue[] param2) {
        ((ibb) this).field_c = param0;
        ((ibb) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 508;
    }
}
