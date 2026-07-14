/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends bw {
    static sna field_g;
    int field_j;
    static String field_i;
    static int field_h;
    int field_f;

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 > -21) {
            field_g = null;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var3 = lk.a(param1, param0, (byte) -53);
        if (var3 != null) {
          return var3;
        } else {
          var4 = param2;
          L0: while (true) {
            if (param1.length() > var4) {
              if (vu.a((byte) 118, param1.charAt(var4))) {
                var4++;
                continue L0;
              } else {
                return fha.field_k;
              }
            } else {
              return null;
            }
          }
        }
    }

    mc(int param0, int param1) {
        ((mc) this).field_f = param0;
        ((mc) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Accept";
        field_h = 0;
    }
}
