/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static int field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0) {
        String var1 = null;
        if (!tc.field_x) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != fa.field_G) {
              fa.field_G.n(-125);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = ob.c(param0 ^ 32013);
          wi.field_c = new rg(var1, (String) null, true, false, false);
          ti.field_b.a((byte) 86, (uj) (Object) t.field_h);
          t.field_h.c(param0 ^ 12814, (uj) (Object) wi.field_c);
          if (param0 != 32083) {
            vg.b(-60);
            t.field_h.j(-125);
            return;
          } else {
            t.field_h.j(-125);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 > -87) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Instructions";
        field_a = "achievements to collect";
    }
}
