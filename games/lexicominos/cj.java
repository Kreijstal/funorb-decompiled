/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends kd {
    static volatile int field_i;
    byte[] field_h;

    final static hc a(byte param0, String param1) {
        String var2 = null;
        hc var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (null != cl.field_P) {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var2 = ck.a(var6, (byte) -48);
            if (var2 == null) {
              var2 = (String) (Object) var6;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = (hc) (Object) cl.field_P.a((long)var2.hashCode(), true);
          L1: while (true) {
            if (var3 != null) {
              L2: {
                var7 = (CharSequence) (Object) var3.field_R;
                var4 = ck.a(var7, (byte) -48);
                if (var4 == null) {
                  var4 = var3.field_R;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var4.equals((Object) (Object) var2)) {
                return var3;
              } else {
                var3 = (hc) (Object) cl.field_P.b(-99);
                continue L1;
              }
            } else {
              var4_int = -88 % ((-51 - param0) / 52);
              return null;
            }
          }
        } else {
          return null;
        }
    }

    cj(byte[] param0) {
        ((cj) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
    }
}
