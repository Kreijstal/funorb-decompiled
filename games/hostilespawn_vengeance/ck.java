/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    int field_J;
    int field_G;
    byte[][] field_D;
    int field_H;
    int field_r;
    int[][] field_i;
    int field_l;
    int field_F;
    byte[] field_s;
    int field_d;
    int[] field_I;
    byte[] field_z;
    int[] field_j;
    int[] field_K;
    byte[] field_t;
    int[][] field_p;
    int field_x;
    int field_g;
    int field_w;
    static String field_o;
    int field_L;
    static bd field_C;
    int field_q;
    byte[] field_M;
    static int field_e;
    int[][] field_m;
    boolean[] field_b;
    byte[] field_a;
    int field_v;
    byte[] field_f;
    int[] field_k;
    boolean[] field_h;
    int field_B;
    static vl field_u;
    static bd[][] field_y;
    byte field_n;
    int field_c;

    public static void a(int param0) {
        field_C = null;
        if (param0 != -665) {
            return;
        }
        field_y = null;
        field_o = null;
        field_u = null;
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = -41 % ((param0 - 36) / 54);
        if (0 <= param1) {
          if (param1 < ln.field_a.field_o.length) {
            var3 = ln.field_a.field_o[param1];
            if (var3 >= 0) {
              if (512 != var3) {
                if (var3 != -665) {
                  if (-697 != var3) {
                    if ((var3 ^ -1) != -680) {
                      if (var3 == 681) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    ck() {
        ((ck) this).field_I = new int[257];
        ((ck) this).field_z = new byte[256];
        ((ck) this).field_t = new byte[18002];
        ((ck) this).field_f = new byte[4096];
        ((ck) this).field_x = 0;
        ((ck) this).field_D = new byte[6][258];
        ((ck) this).field_j = new int[6];
        ((ck) this).field_k = new int[256];
        ((ck) this).field_M = new byte[18002];
        ((ck) this).field_b = new boolean[16];
        ((ck) this).field_K = new int[16];
        ((ck) this).field_i = new int[6][258];
        ((ck) this).field_B = 0;
        ((ck) this).field_p = new int[6][258];
        ((ck) this).field_h = new boolean[256];
        ((ck) this).field_m = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Connection lost. <%0>";
    }
}
