/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    byte field_f;
    int[] field_K;
    int[][] field_l;
    byte[] field_A;
    int[] field_o;
    static dl field_e;
    int field_h;
    int field_s;
    int[][] field_x;
    int field_L;
    int field_k;
    int field_J;
    byte[] field_i;
    int[] field_D;
    byte[][] field_d;
    int field_t;
    byte[] field_q;
    int field_O;
    int field_G;
    int field_b;
    byte[] field_M;
    int[][] field_F;
    boolean[] field_y;
    int field_I;
    static int field_n;
    static sj field_g;
    boolean[] field_p;
    int field_m;
    byte[] field_H;
    int field_a;
    int field_B;
    static String field_C;
    static int field_u;
    static String field_z;
    int field_w;
    int field_r;
    static String field_j;
    byte[] field_c;
    int[] field_v;
    static String[] field_E;

    public static void a(int param0) {
        field_z = null;
        field_g = null;
        field_C = null;
        field_E = null;
        if (param0 != 258) {
            return;
        }
        field_e = null;
        field_j = null;
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            int discarded$8 = 0;
            if (!sl.a(false, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  int discarded$9 = 108;
                  if (!oh.a(param2.charAt(var3_int))) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("qn.B(").append(-123).append(44).append(0).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final static String a() {
        int var1 = 0;
        return field_z;
    }

    qn() {
        ((qn) this).field_i = new byte[4096];
        ((qn) this).field_D = new int[16];
        ((qn) this).field_k = 0;
        ((qn) this).field_A = new byte[18002];
        ((qn) this).field_d = new byte[6][258];
        ((qn) this).field_p = new boolean[256];
        ((qn) this).field_K = new int[257];
        ((qn) this).field_y = new boolean[16];
        ((qn) this).field_x = new int[6][258];
        ((qn) this).field_F = new int[6][258];
        ((qn) this).field_l = new int[6][258];
        ((qn) this).field_o = new int[256];
        ((qn) this).field_H = new byte[256];
        ((qn) this).field_b = 0;
        ((qn) this).field_v = new int[6];
        ((qn) this).field_c = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sj(7, 0, 1, 1);
        field_C = "From only <%0>/month";
        field_u = -1;
        field_z = null;
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
