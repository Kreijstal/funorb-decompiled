/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    int field_a;
    int field_h;
    private boolean field_d;
    private String field_c;
    int[] field_f;
    int field_k;
    static String field_b;
    private long field_g;
    String field_i;
    static int[] field_e;
    private int field_j;

    final static String b(int param0) {
        if (param0 > -34) {
            field_e = null;
        }
        if (qg.field_g == fh.field_B) {
            return ej.field_b;
        }
        return ak.field_w;
    }

    final int a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 35 % ((-36 - param0) / 53);
          if (((bl) this).field_d) {
            break L0;
          } else {
            L1: {
              if (((bl) this).field_h != 2) {
                break L1;
              } else {
                if (((bl) this).field_j > 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (i.field_c != ((bl) this).field_g) {
              if (db.field_V != 2) {
                return 0;
              } else {
                if (fe.a(((bl) this).field_c, (byte) 126)) {
                  return 1;
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    public static void a(int param0) {
        int var1 = 3;
        field_e = null;
        field_b = null;
    }

    bl(boolean param0) {
        ((bl) this).field_i = jg.field_D;
        ((bl) this).field_k = ka.field_n;
        ((bl) this).field_j = de.field_c;
        ((bl) this).field_c = g.field_i;
        ((bl) this).field_g = ek.field_f;
        ((bl) this).field_a = ib.field_n;
        ((bl) this).field_h = eg.field_o;
        if (!param0) {
            ((bl) this).field_f = null;
        } else {
            ((bl) this).field_f = uf.field_c;
        }
        ((bl) this).field_d = ba.field_I;
    }

    static {
    }
}
