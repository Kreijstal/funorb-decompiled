/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rj {
    static ti[] field_a;
    static boolean field_b;

    abstract int a(int param0);

    final static String a(ci param0, byte param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (param0.a((byte) -123)) {
          var9 = param0.a(false);
          var2 = var9;
          var3 = param0.b(79, "index");
          var4 = 0;
          var5 = var9;
          if (param1 <= -2) {
            var6 = 0;
            L0: while (true) {
              if (var6 >= var5.length) {
                return ne.field_c + " - " + var4 / (-1 + var9.length) + "%";
              } else {
                var7 = var5[var6];
                if (var3 != var7) {
                  var4 = var4 + param0.a(true, var7);
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return bd.field_r;
        }
    }

    final static h b(boolean param0) {
        if (null == eh.field_e) {
            eh.field_e = new h(al.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, al.field_i.field_y, -1, 2147483647, true);
        }
        if (!param0) {
            h discarded$0 = rj.b(false);
        }
        return eh.field_e;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_b = false;
        }
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    static {
    }
}
