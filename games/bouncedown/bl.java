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
            field_e = (int[]) null;
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
          if (this.field_d) {
            break L0;
          } else {
            L1: {
              if (-3 != (this.field_h ^ -1)) {
                break L1;
              } else {
                if (this.field_j > 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (i.field_c != this.field_g) {
              if (db.field_V != 2) {
                return 0;
              } else {
                if (fe.a(this.field_c, (byte) 126)) {
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
        int var1 = 3 / ((param0 - -51) / 53);
        field_e = null;
        field_b = null;
    }

    bl(boolean param0) {
        this.field_i = jg.field_D;
        this.field_k = ka.field_n;
        this.field_j = de.field_c;
        this.field_c = g.field_i;
        this.field_g = ek.field_f;
        this.field_a = ib.field_n;
        this.field_h = eg.field_o;
        if (!param0) {
            this.field_f = null;
        } else {
            this.field_f = uf.field_c;
        }
        this.field_d = ba.field_I;
    }

    static {
    }
}
