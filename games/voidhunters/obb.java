/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class obb extends rqa {
    static String[] field_o;

    public static void a(int param0) {
        if (param0 != 21942) {
            int discarded$0 = obb.a(7, -102, -66);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param1 != -18644) {
          field_o = null;
          var3 = 0;
          L0: while (true) {
            if (param0 <= 0) {
              return var3;
            } else {
              var3 = 1 & param2 | var3 << 1288312641;
              param0--;
              param2 = param2 >>> 1;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (param0 <= 0) {
              return var3;
            } else {
              var3 = 1 & param2 | var3 << 1288312641;
              param0--;
              param2 = param2 >>> 1;
              continue L1;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(184, 62, param0[0].a(73));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    obb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
