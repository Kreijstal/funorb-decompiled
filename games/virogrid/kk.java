/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends qe {
    static String field_p;
    static li field_q;
    static dl field_n;
    static String field_o;

    kk(wa param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_q = null;
        field_p = null;
        field_n = null;
        field_o = null;
        int var1 = -65 / ((param0 - -64) / 56);
    }

    final wl a(String param0, boolean param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (param1) {
          var6 = (CharSequence) (Object) param0;
          if (pa.a(var6, -113)) {
            var7 = (CharSequence) (Object) param0;
            var3 = fm.a(var7, false);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return ee.field_c;
              } else {
                return bm.field_i;
              }
            } else {
              return ee.field_c;
            }
          } else {
            return ee.field_c;
          }
        } else {
          field_o = null;
          var4 = (CharSequence) (Object) param0;
          if (pa.a(var4, -113)) {
            var5 = (CharSequence) (Object) param0;
            var3 = fm.a(var5, false);
            if (-1 > (var3 ^ -1)) {
              if (130 < var3) {
                return ee.field_c;
              } else {
                return bm.field_i;
              }
            } else {
              return ee.field_c;
            }
          } else {
            return ee.field_c;
          }
        }
    }

    final String a(int param0, String param1) {
        if (((kk) this).a(param1, true) == ee.field_c) {
            return mb.field_gb;
        }
        if (param0 == -26358) {
            return null;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Accept";
        field_q = null;
        field_o = "Please remove <%0> from your ignore list first.";
        field_n = new dl();
    }
}
