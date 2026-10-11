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
        if (!param0) {
          return new qm((int)((float)this.field_n.field_h + (float)(this.field_j.field_h - this.field_n.field_h) * param1), (int)((float)this.field_n.field_f + (float)(-this.field_n.field_f + this.field_j.field_f) * param1));
        }
        return (qm) null;
    }

    g(float param0, int param1, boolean param2) {
        super(param0, param1, param2);
    }

    public static void b(byte param0) {
        field_p = null;
        field_k = null;
        if (param0 != -52) {
          return;
        }
        field_l = null;
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = 255 & param0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime1Lifetime1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 > var2) {
          var3 = -108 / ((param1 - 58) / 61);
          return (char)var2;
        }
        if (var2 < 160) {
          var3Lifetime1 = ja.field_Qb[-128 + var2];
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 63;
          }
          var2 = var3Lifetime1;
          var3Lifetime1Lifetime1 = -108 / ((param1 - 58) / 61);
          return (char)var2;
        }
        var3Lifetime2 = -108 / ((param1 - 58) / 61);
        return (char)var2;
    }

    static {
        field_k = new fd();
        field_h = 50;
        field_l = "Waiting for extra data";
        field_m = -1;
    }
}
