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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ((kk) this).field_i = ((kk) this).field_i - ((kk) this).field_f;
        ((kk) this).field_c = ((kk) this).field_c - 1;
        ((kk) this).field_f = ((kk) this).field_f - (((kk) this).field_f - -3 >> 2);
        if (param0 >= -35) {
          L0: {
            ((kk) this).field_c = -69;
            if (-1 <= ((kk) this).field_c) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 >= ((kk) this).field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_k = null;
        field_e = null;
        field_j = null;
        if (param0 > -56) {
            field_k = null;
        }
    }

    kk(int param0, int param1, String param2) {
        ((kk) this).field_f = 64;
        ((kk) this).field_c = 16;
        try {
            ((kk) this).field_h = param2;
            ((kk) this).field_i = param1 << 4;
            ((kk) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "kk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        an.field_q.c(((kk) this).field_h, ((kk) this).field_d, ((kk) this).field_i >> 4, 16760896, -1);
        if (param0 != 35) {
            boolean discarded$0 = ((kk) this).b(-48);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_j = new int[]{192, 128, 160, 128, 112, 96, 192, 144, 128, 176};
        field_l = (int)Math.ceil(307.5);
        field_k = new String[]{"Flee", "Clover", "Gates", "Panic Rooms", "Infested", "Quick!", "Teleport Around", "Splodge", "Bomb Rays", "Treasure Rider", "The Key is Key", "Sticky Hedges", "Try to Flee", "Boom Boom Boom", "Spider's Den", "On The Run", "Laser Gun", "Dodge Ball", "Chain Reaction", "Rain", "The Americas", "Boom", "Tight", "Doohickey", "Chain of Madness"};
        field_b = 0.0;
    }
}
