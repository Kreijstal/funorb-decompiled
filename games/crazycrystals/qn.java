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
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if (!sl.a(param1, param2, 0)) {
          return false;
        } else {
          if (param0 <= -82) {
            var3 = 0;
            L0: while (true) {
              if (param2.length() > var3) {
                if (!oh.a(param2.charAt(var3), (byte) 108)) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static String a(byte param0) {
        int var1 = -53 % ((param0 - -57) / 50);
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
