/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int field_d;
    static long field_b;
    static kc field_c;
    static int[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static aa a(byte param0, String param1) {
        int var2 = 0;
        Object var3 = null;
        aa var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = Main.field_T;
        if (sl.field_b != null) {
          L0: {
            var2 = -89 / ((param0 - 27) / 60);
            var7 = (CharSequence) (Object) param1;
            var3 = (Object) (Object) ff.a((byte) 116, var7);
            if (var3 == null) {
              var3 = (Object) (Object) var7;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = (aa) (Object) sl.field_b.a(-126, (long)((String) var3).hashCode());
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_gb;
                var5 = ff.a((byte) 116, var8);
                if (var5 != null) {
                  break L2;
                } else {
                  var5 = var4.field_gb;
                  break L2;
                }
              }
              if (var5.equals(var3)) {
                return var4;
              } else {
                var4 = (aa) (Object) sl.field_b.a(26847);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
