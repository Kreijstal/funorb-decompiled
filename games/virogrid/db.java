/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    int field_J;
    int field_E;
    int field_L;
    byte field_G;
    int field_r;
    byte[] field_g;
    int field_e;
    int[] field_w;
    byte[] field_d;
    int[] field_H;
    int field_A;
    int[][] field_F;
    int field_l;
    int[] field_m;
    static String field_f;
    byte[] field_i;
    int field_j;
    int field_n;
    int field_p;
    boolean[] field_t;
    int field_o;
    int field_y;
    static int field_D;
    boolean[] field_a;
    byte[] field_q;
    byte[] field_K;
    int field_x;
    static lc field_z;
    int field_b;
    int[][] field_s;
    static int[] field_k;
    static v field_h;
    byte[][] field_c;
    byte[] field_I;
    static int field_v;
    int[][] field_C;
    int[] field_u;
    int field_B;

    public static void a(int param0) {
        field_k = null;
        if (param0 != 6) {
            return;
        }
        field_h = null;
        field_f = null;
        field_z = null;
    }

    final static void a(byte param0, int param1) {
        qh.field_K = 0;
        nb.field_s = param1;
        hf.field_D = new int[3];
        el.field_s = new cj[15 * param1];
        if (param0 < 33) {
            field_v = -82;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 16) {
          L0: {
            boolean discarded$10 = db.b((byte) 58, 113);
            if (ao.field_Kb != cb.field_c) {
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
            if (ao.field_Kb != cb.field_c) {
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

    final static boolean b(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -1) {
          return true;
        } else {
          if (param0 != 13) {
            L0: {
              db.a((byte) 49, 53);
              if ((1 << param1 & la.field_g) == 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if ((1 << param1 & la.field_g) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final static String a(eh param0, String param1, byte param2, String param3) {
        Object var5 = null;
        if (param0.c(0)) {
          if (param2 > -36) {
            var5 = null;
            String discarded$2 = db.a((eh) null, (String) null, (byte) 85, (String) null);
            return param1 + " - " + param0.a(-2677) + "%";
          } else {
            return param1 + " - " + param0.a(-2677) + "%";
          }
        } else {
          return param3;
        }
    }

    final static lk a(long param0, boolean param1) {
        if (param1) {
            db.a((byte) 12, 38);
            return (lk) (Object) ti.field_i.a(param0, (byte) -9);
        }
        return (lk) (Object) ti.field_i.a(param0, (byte) -9);
    }

    db() {
        ((db) this).field_g = new byte[4096];
        ((db) this).field_H = new int[257];
        ((db) this).field_m = new int[6];
        ((db) this).field_a = new boolean[256];
        ((db) this).field_n = 0;
        ((db) this).field_F = new int[6][258];
        ((db) this).field_s = new int[6][258];
        ((db) this).field_c = new byte[6][258];
        ((db) this).field_K = new byte[18002];
        ((db) this).field_t = new boolean[16];
        ((db) this).field_d = new byte[18002];
        ((db) this).field_p = 0;
        ((db) this).field_w = new int[16];
        ((db) this).field_I = new byte[256];
        ((db) this).field_C = new int[6][258];
        ((db) this).field_u = new int[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Report <%0> for abuse";
        field_z = new lc(2, 4, 4, 0);
    }
}
