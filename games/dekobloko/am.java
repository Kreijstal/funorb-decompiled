/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_d;
    static ke field_a;
    static String field_b;
    static boolean field_c;

    final static kc a(int param0, boolean param1, int param2, int param3, int param4) {
        kc var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var5 = (kc) ((Object) dg.field_e.c((byte) 49));
        L0: while (true) {
          if (var5 != null) {
            if (param3 != var5.field_n) {
              var5 = (kc) ((Object) dg.field_e.d(true));
              continue L0;
            } else {
              return var5;
            }
          } else {
            var5 = new kc();
            var5.field_n = param3;
            var5.field_o = 10;
            var5.field_v = 1;
            dg.field_e.a(var5, 2777);
            wb.a(var5, 3, 60);
            return var5;
          }
        }
    }

    final static int b(int param0) {
        int discarded$2 = 0;
        if (param0 <= 69) {
          discarded$2 = am.b(-17);
          return wl.field_o + (wh.field_d << 2) + (qk.field_i << 4);
        } else {
          return wl.field_o + (wh.field_d << 2) + (qk.field_i << 4);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_b = "The following settings need to be changed:  ";
    }
}
