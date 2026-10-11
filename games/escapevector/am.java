/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends hg {
    static ed field_l;
    static int field_g;
    static int field_k;
    int field_h;
    int field_j;
    int field_i;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == 57) {
          var2 = 0;
          if ((param1 & 7) != 0) {
            var2 = -(param1 & 7) + 8;
          }
          var3 = var2 + param1;
          return var3;
        }
        am.a((byte) 123, -70);
        var2Lifetime1 = 0;
        if ((param1 & 7) != 0) {
          var2Lifetime1 = -(param1 & 7) + 8;
        }
        var3Lifetime1 = var2Lifetime1 + param1;
        return var3Lifetime1;
    }

    am(int param0, int param1, int param2) {
        this.field_j = param2;
        this.field_h = param1;
        this.field_i = param0;
    }

    public static void a(byte param0) {
        if (param0 > -67) {
          am.a((byte) -101);
          field_l = null;
          return;
        }
        field_l = null;
    }

    static {
        field_k = 0;
        field_l = new ed(540, 140);
    }
}
