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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!sl.a(param1, param2, 0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 <= -82) {
                var3_int = 0;
                L1: while (true) {
                  if (param2.length() <= var3_int) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!oh.a(param2.charAt(var3_int), (byte) 108)) {
                      stackIn_13_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("qn.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final static String a(byte param0) {
        int var1 = -53 % ((param0 - -57) / 50);
        return field_z;
    }

    qn() {
        this.field_i = new byte[4096];
        this.field_D = new int[16];
        this.field_k = 0;
        this.field_A = new byte[18002];
        this.field_d = new byte[6][258];
        this.field_p = new boolean[256];
        this.field_K = new int[257];
        this.field_y = new boolean[16];
        this.field_x = new int[6][258];
        this.field_F = new int[6][258];
        this.field_l = new int[6][258];
        this.field_o = new int[256];
        this.field_H = new byte[256];
        this.field_b = 0;
        this.field_v = new int[6];
        this.field_c = new byte[18002];
    }

    static {
        field_g = new sj(7, 0, 1, 1);
        field_C = "From only <%0>/month";
        field_u = -1;
        field_z = null;
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
