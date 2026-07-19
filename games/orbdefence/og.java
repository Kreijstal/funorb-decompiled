/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private boolean field_l;
    int field_f;
    int field_c;
    int[] field_i;
    static int field_o;
    static int field_a;
    static int[] field_n;
    static int field_b;
    String field_k;
    private String field_h;
    int field_d;
    private int field_e;
    static ki field_g;
    private long field_m;
    static String field_j;

    public static void a(byte param0) {
        field_n = null;
        field_j = null;
        if (param0 > -9) {
            og.a((byte) -121);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final int b(byte param0) {
        int var2 = 0;
        if (!this.field_l) {
          if (-3 != (this.field_d ^ -1)) {
            var2 = -57 / ((53 - param0) / 43);
            if ((ea.field_h ^ -1L) != (this.field_m ^ -1L)) {
              if (-3 == (ob.field_H ^ -1)) {
                if (ll.a(this.field_h, -153798488)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            if (0 >= this.field_e) {
              var2 = -57 / ((53 - param0) / 43);
              if ((ea.field_h ^ -1L) != (this.field_m ^ -1L)) {
                if (-3 == (ob.field_H ^ -1)) {
                  if (ll.a(this.field_h, -153798488)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    og(boolean param0) {
        L0: {
          L1: {
            this.field_l = ja.field_e;
            this.field_k = vj.field_a;
            this.field_e = bh.field_c;
            this.field_d = wb.field_d;
            this.field_c = pc.field_X;
            this.field_h = vk.field_v;
            this.field_m = tf.field_l;
            if (param0) {
              break L1;
            } else {
              this.field_i = null;
              if (!OrbDefence.field_D) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_i = n.field_c;
          break L0;
        }
        this.field_f = gb.field_b;
    }

    static {
        field_n = new int[4];
        km.a((byte) -84, 50);
        field_j = "Play the game without logging in just yet";
    }
}
