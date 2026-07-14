/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it {
    private kj field_b;
    static int field_c;
    Runnable field_a;
    le field_d;
    private int[] field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1 != -1) {
          field_c = 2;
          var2 = (param0 * param0 >> 1556964972) * param0 >> -1107730164;
          var3 = -61440 + param0 * 6;
          var4 = (param0 * var3 >> 1579015116) + 40960;
          return var4 * var2 >> -871338228;
        } else {
          var2 = (param0 * param0 >> 1556964972) * param0 >> -1107730164;
          var3 = -61440 + param0 * 6;
          var4 = (param0 * var3 >> 1579015116) + 40960;
          return var4 * var2 >> -871338228;
        }
    }

    final void a(Runnable param0, int param1) {
        ((it) this).field_a = param0;
        if (param1 != 6) {
            int discarded$0 = it.a(-108, 56);
        }
    }

    final void a(boolean param0) {
        ((it) this).field_d = new le(((it) this).field_b, (it) this);
        if (param0) {
            int discarded$0 = it.a(11, -13);
        }
    }

    it(kj param0) {
        int var2 = 0;
        iu discarded$0 = new iu();
        ((it) this).field_b = param0;
        ((it) this).field_d = new le(param0, (it) this);
        hm discarded$1 = new hm(((it) this).field_b);
        hm discarded$2 = new hm(((it) this).field_b);
        hm discarded$3 = new hm(((it) this).field_b);
        hm discarded$4 = new hm(((it) this).field_b);
        hm discarded$5 = new hm(((it) this).field_b);
        hm discarded$6 = new hm(((it) this).field_b);
        hm discarded$7 = new hm(((it) this).field_b);
        hm discarded$8 = new hm(((it) this).field_b);
        hm discarded$9 = new hm(((it) this).field_b);
        hm discarded$10 = new hm(((it) this).field_b);
        ((it) this).field_e = new int[hm.field_b];
        for (var2 = 0; hm.field_b > var2; var2++) {
            ((it) this).field_e[var2] = -1;
        }
    }

    static {
    }
}
