/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lha extends rqa {
    final static void a(int param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        he.field_o = param0;
        pob.field_b = 0;
        wgb.field_f = param3;
        if (param2 == -85) {
          if (wqa.a(false, wgb.field_f)) {
            L0: {
              ana discarded$2 = lha.a(-103, fa.field_d[75]);
              var4 = 0;
              if ((wgb.field_f ^ -1) != -8) {
                break L0;
              } else {
                var4 = -1;
                break L0;
              }
            }
            L1: {
              if (5 == wgb.field_f) {
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            lo.field_a[wgb.field_f].a(param1, 320, var4);
            if (wgb.field_f != 7) {
              return;
            } else {
              mna.a(param1, (byte) 90);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    lha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ana a(int param0, gd param1) {
        if (param0 > -85) {
            return null;
        }
        return ka.a(61, fga.a(param1, 100, 96));
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          ana discarded$2 = lha.a(-99, (gd) null);
          return new nc((Object) (Object) frb.a(17, 86));
        } else {
          return new nc((Object) (Object) frb.a(17, 86));
        }
    }

    static {
    }
}
