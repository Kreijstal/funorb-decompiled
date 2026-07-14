/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends oh {
    int field_p;
    int[] field_u;
    static String[] field_y;
    int field_w;
    int field_x;
    static ro field_t;
    int field_n;
    int field_j;
    static String field_i;
    ln field_s;
    int field_z;
    int[] field_o;
    int field_r;
    int field_v;
    int[] field_l;
    fs field_m;
    ln field_q;
    int field_k;
    static String field_h;

    final static vd a(pf param0, int param1, byte param2, int param3) {
        vd var5 = null;
        int var6 = 0;
        int var7 = 0;
        vd var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != null) {
          var8 = (vd) (Object) param0.d(0);
          var6 = -44 / ((47 - param2) / 57);
          L0: while (true) {
            if (var8 != null) {
              L1: {
                var5 = var8.b((byte) 105, param1, param3);
                if (var5 == null) {
                  break L1;
                } else {
                  if (!var5.field_s) {
                    break L1;
                  } else {
                    return var5;
                  }
                }
              }
              var8 = (vd) (Object) param0.a((byte) -71);
              continue L0;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, v param3) {
        nr.field_h = param3;
        dn.field_l = param0;
        qi.field_j = param2;
        if (param1 != 20) {
            field_i = null;
        }
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 20) {
          field_h = null;
          field_h = null;
          field_y = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_y = null;
          field_i = null;
          return;
        }
    }

    as(mg param0) {
        ((as) this).field_m = param0.field_G;
        ((as) this).field_x = param0.field_z;
        ((as) this).field_s = param0.field_y;
        ((as) this).field_q = param0.field_B;
        ((as) this).field_n = ((as) this).field_s.field_S;
        ((as) this).field_k = ((as) this).field_q.field_S;
        ((as) this).field_r = ((as) this).field_s.field_A;
        ((as) this).field_l = new int[20];
        ((as) this).field_w = ((as) this).field_s.field_z;
        ((as) this).field_o = new int[20];
        ((as) this).field_u = new int[20];
        ((as) this).field_p = ((as) this).field_q.field_z;
        ((as) this).field_j = ((as) this).field_q.field_A;
        ((as) this).field_v = (int)Math.sqrt((double)((-((as) this).field_r + ((as) this).field_j) * (((as) this).field_j + -((as) this).field_r) - -((((as) this).field_k + -((as) this).field_n) * (-((as) this).field_n + ((as) this).field_k)))) / 2;
        ((as) this).field_z = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_i = "Names can only contain letters, numbers, spaces and underscores";
        field_h = "You must play <%1> more rated games before playing with the current options.";
        field_t = new ro();
    }
}
