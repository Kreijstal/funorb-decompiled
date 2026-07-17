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
        if (!((og) this).field_l) {
          if (((og) this).field_d != 2) {
            var2 = -57 / ((53 - param0) / 43);
            if (~ea.field_h != ~((og) this).field_m) {
              if (ob.field_H == 2) {
                int discarded$12 = -153798488;
                if (ll.a(((og) this).field_h)) {
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
            if (0 >= ((og) this).field_e) {
              var2 = -57 / ((53 - param0) / 43);
              if (~ea.field_h != ~((og) this).field_m) {
                if (ob.field_H == 2) {
                  int discarded$13 = -153798488;
                  if (ll.a(((og) this).field_h)) {
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
        ((og) this).field_l = ja.field_e;
        ((og) this).field_k = vj.field_a;
        ((og) this).field_e = bh.field_c;
        ((og) this).field_d = wb.field_d;
        ((og) this).field_c = pc.field_X;
        ((og) this).field_h = vk.field_v;
        ((og) this).field_m = tf.field_l;
        if (!param0) {
            ((og) this).field_i = null;
        } else {
            ((og) this).field_i = n.field_c;
        }
        ((og) this).field_f = gb.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[4];
        km.a((byte) -84, 50);
        field_j = "Play the game without logging in just yet";
    }
}
