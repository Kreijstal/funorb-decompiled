/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nna {
    int field_c;
    byte[] field_y;
    int field_F;
    int field_f;
    byte[] field_v;
    int[][] field_t;
    byte[][] field_e;
    boolean[] field_C;
    int[][] field_b;
    int field_i;
    int[][] field_s;
    byte[] field_p;
    byte[] field_g;
    boolean[] field_r;
    int field_B;
    int[] field_w;
    byte[] field_l;
    int field_E;
    int field_d;
    byte field_k;
    int[] field_q;
    int field_D;
    int field_o;
    int field_u;
    int field_n;
    int field_A;
    byte[] field_m;
    int field_x;
    int field_h;
    int[] field_j;
    int field_z;
    int[] field_a;

    final static String a(int param0, String param1, int param2) {
        int var4 = 0;
        kh var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        if (fs.a(true, var6)) {
          if (ue.a(param1, 0)) {
            return iia.field_q;
          } else {
            if ((ae.field_g ^ -1) == param0) {
              if (qaa.a(2180, param1)) {
                return gl.a((byte) 125, bva.field_a, new String[1]);
              } else {
                if (100 <= tba.field_k) {
                  return bs.field_h;
                } else {
                  if (dda.a(false, param1)) {
                    return gl.a((byte) 94, bha.field_o, new String[1]);
                  } else {
                    var5 = ql.field_k;
                    var5.k(param2, -2988);
                    var5.field_h = var5.field_h + 1;
                    var4 = var5.field_h;
                    var5.i(2, 0);
                    var5.a(param1, false);
                    var5.d(-var4 + var5.field_h, (byte) -104);
                    return null;
                  }
                }
              }
            } else {
              return eia.field_o;
            }
          }
        } else {
          return pk.field_v;
        }
    }

    nna() {
        ((nna) this).field_C = new boolean[16];
        ((nna) this).field_e = new byte[6][258];
        ((nna) this).field_s = new int[6][258];
        ((nna) this).field_b = new int[6][258];
        ((nna) this).field_r = new boolean[256];
        ((nna) this).field_w = new int[16];
        ((nna) this).field_g = new byte[4096];
        ((nna) this).field_t = new int[6][258];
        ((nna) this).field_B = 0;
        ((nna) this).field_y = new byte[18002];
        ((nna) this).field_p = new byte[18002];
        ((nna) this).field_m = new byte[256];
        ((nna) this).field_A = 0;
        ((nna) this).field_j = new int[6];
        ((nna) this).field_q = new int[256];
        ((nna) this).field_a = new int[257];
    }

    static {
    }
}
