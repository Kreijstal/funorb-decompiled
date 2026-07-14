/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends rqa {
    dk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          return null;
        } else {
          si.a(171, 62, param0[0].a(82));
          return new nc((Object) (Object) "void");
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var3 = hqb.a(param1, (byte) 43, param2);
        var4 = 107 / ((param0 - -12) / 63);
        if (var3 == null) {
          var5 = 0;
          L0: while (true) {
            if (param2.length() > var5) {
              if (fqb.a(16647, param2.charAt(var5))) {
                var5++;
                continue L0;
              } else {
                return gcb.field_u;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    static {
    }
}
