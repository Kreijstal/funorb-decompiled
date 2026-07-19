/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    byte[] field_q;
    int[] field_x;
    int[][] field_J;
    byte[] field_z;
    int field_m;
    int field_B;
    byte field_c;
    int field_j;
    int[][] field_F;
    int field_u;
    static String field_e;
    int field_n;
    int[][] field_E;
    int field_C;
    static int[] field_g;
    int field_f;
    byte[] field_h;
    int field_w;
    int field_H;
    int[] field_b;
    static String field_r;
    boolean[] field_I;
    int field_i;
    int[] field_t;
    boolean[] field_v;
    byte[] field_y;
    byte[] field_a;
    byte[][] field_G;
    int field_A;
    byte[] field_l;
    int field_p;
    int field_s;
    int field_d;
    int[] field_K;
    int field_k;
    static int[] field_o;

    public static void a(int param0) {
        field_o = null;
        field_e = null;
        if (param0 >= -69) {
            return;
        }
        field_r = null;
        field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = wizardrun.field_H;
        if (param12 != -719) {
          field_g = (int[]) null;
          if (param14 <= param1) {
            if (param10 <= param1) {
              if (param10 > param14) {
                nh.a(param10, param5, param15, param14, param7, param8, param13, param1, param6, param0, param2, param3, param12 ^ 691, ed.field_k, param9, param11, param4);
                return;
              } else {
                nh.a(param14, param5, param15, param10, param6, param9, param2, param1, param7, param11, param13, param3, -120, ed.field_k, param8, param0, param4);
                return;
              }
            } else {
              nh.a(param1, param7, param8, param14, param5, param15, param13, param10, param6, param0, param4, param11, param12 ^ 693, ed.field_k, param9, param3, param2);
              return;
            }
          } else {
            if (param14 >= param10) {
              if (param1 < param10) {
                nh.a(param10, param6, param9, param1, param7, param8, param4, param14, param5, param3, param2, param0, param12 ^ 689, ed.field_k, param15, param11, param13);
                return;
              } else {
                nh.a(param1, param6, param9, param10, param5, param15, param2, param14, param7, param11, param4, param0, param12 + 591, ed.field_k, param8, param3, param13);
                return;
              }
            } else {
              nh.a(param14, param7, param8, param1, param6, param9, param4, param10, param5, param3, param13, param11, -126, ed.field_k, param15, param0, param2);
              return;
            }
          }
        } else {
          if (param14 <= param1) {
            if (param10 <= param1) {
              if (param10 > param14) {
                nh.a(param10, param5, param15, param14, param7, param8, param13, param1, param6, param0, param2, param3, param12 ^ 691, ed.field_k, param9, param11, param4);
                return;
              } else {
                nh.a(param14, param5, param15, param10, param6, param9, param2, param1, param7, param11, param13, param3, -120, ed.field_k, param8, param0, param4);
                return;
              }
            } else {
              nh.a(param1, param7, param8, param14, param5, param15, param13, param10, param6, param0, param4, param11, param12 ^ 693, ed.field_k, param9, param3, param2);
              return;
            }
          } else {
            if (param14 >= param10) {
              if (param1 < param10) {
                nh.a(param10, param6, param9, param1, param7, param8, param4, param14, param5, param3, param2, param0, param12 ^ 689, ed.field_k, param15, param11, param13);
                return;
              } else {
                nh.a(param1, param6, param9, param10, param5, param15, param2, param14, param7, param11, param4, param0, param12 + 591, ed.field_k, param8, param3, param13);
                return;
              }
            } else {
              nh.a(param14, param7, param8, param1, param6, param9, param4, param10, param5, param3, param13, param11, -126, ed.field_k, param15, param0, param2);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, vd param2, vd param3) {
        try {
            le.field_j = param2;
            uf.field_c = param3;
            kc.field_I = param1;
            kj.a(1048576, ed.field_d / 2, ed.field_h / 2);
            if (param0 <= 15) {
                field_o = (int[]) null;
            }
            qk.a(param2.field_B + param2.field_q, param3.field_q, param2.field_q, 1882, param3.field_q + param3.field_B);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "gk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    gk() {
        this.field_J = new int[6][258];
        this.field_E = new int[6][258];
        this.field_x = new int[257];
        this.field_b = new int[16];
        this.field_z = new byte[18002];
        this.field_F = new int[6][258];
        this.field_I = new boolean[16];
        this.field_v = new boolean[256];
        this.field_l = new byte[4096];
        this.field_G = new byte[6][258];
        this.field_j = 0;
        this.field_K = new int[256];
        this.field_d = 0;
        this.field_a = new byte[18002];
        this.field_t = new int[6];
        this.field_h = new byte[256];
    }

    static {
        field_g = new int[8192];
        field_r = "Mouse over an icon for details";
        field_e = "If you do nothing the game will revert to normal view in <%0> second.";
        field_o = new int[8192];
    }
}
