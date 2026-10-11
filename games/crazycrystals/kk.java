/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    private int field_i;
    static volatile int field_g;
    static f[][] field_a;
    private int field_f;
    private int field_d;
    private String field_h;
    static int field_l;
    private int field_c;
    static int[] field_j;
    static String[] field_k;
    static int[] field_e;
    static double field_b;

    final boolean b(int param0) {
        this.field_i = this.field_i - this.field_f;
        this.field_c = this.field_c - 1;
        this.field_f = this.field_f - (this.field_f + 3 >> 2);
        if (param0 < -35) {
          return this.field_c > 0 ? true : false;
        }
        this.field_c = -69;
        return this.field_c > 0 ? true : false;
    }

    public static void a(int param0) {
        field_a = (f[][]) null;
        field_k = null;
        field_e = null;
        field_j = null;
        if (param0 > -56) {
          field_k = (String[]) null;
        }
    }

    kk(int param0, int param1, String param2) {
        this.field_f = 64;
        this.field_c = 16;
        try {
          this.field_h = param2;
          this.field_i = param1 << 4;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "kk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        an.field_q.c(this.field_h, this.field_d, this.field_i >> 4, 16760896, -1);
        if (param0 != 35) {
          this.b(-48);
        }
    }

    static {
        field_g = 0;
        field_j = new int[]{192, 128, 160, 128, 112, 96, 192, 144, 128, 176};
        field_l = (int)Math.ceil(307.5);
        field_k = new String[]{"Flee", "Clover", "Gates", "Panic Rooms", "Infested", "Quick!", "Teleport Around", "Splodge", "Bomb Rays", "Treasure Rider", "The Key is Key", "Sticky Hedges", "Try to Flee", "Boom Boom Boom", "Spider's Den", "On The Run", "Laser Gun", "Dodge Ball", "Chain Reaction", "Rain", "The Americas", "Boom", "Tight", "Doohickey", "Chain of Madness"};
        field_b = 0.0;
    }
}
