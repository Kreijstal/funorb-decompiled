/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends tg {
    static fd field_k;
    static volatile int field_m;
    static gn field_p;
    qm field_j;
    qm field_n;
    static int field_h;
    static int field_i;
    static String field_l;
    static int field_o;

    final qm a(boolean param0, float param1) {
        if (param0) {
          return null;
        } else {
          return new qm((int)((float)((g) this).field_n.field_h + (float)(((g) this).field_j.field_h + -((g) this).field_n.field_h) * param1), (int)((float)((g) this).field_n.field_f + (float)(-((g) this).field_n.field_f + ((g) this).field_j.field_f) * param1));
        }
    }

    g(float param0, int param1, boolean param2) {
        super(param0, param1, param2);
    }

    public static void b() {
        field_p = null;
        field_k = null;
        field_l = null;
    }

    final static char a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param0;
        if (var2 != 0) {
          if (128 <= var2) {
            if (var2 >= 160) {
              var3 = 108;
              return (char)var2;
            } else {
              L0: {
                var3 = ja.field_Qb[-128 + var2];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              var3 = 108;
              return (char)var2;
            }
          } else {
            var3 = 108;
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new fd();
        field_h = 50;
        field_l = "Waiting for extra data";
        field_m = -1;
    }
}
