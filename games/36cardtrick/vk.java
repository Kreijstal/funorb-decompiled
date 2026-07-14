/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_b;
    private String field_g;
    int field_h;
    int field_c;
    String field_i;
    private long field_d;
    int[] field_a;
    int field_k;
    static String field_j;
    private int field_l;
    static de field_e;
    private boolean field_f;

    final int b(int param0) {
        if (!((vk) this).field_f) {
          if ((((vk) this).field_k ^ -1) != -3) {
            if ((((vk) this).field_d ^ -1L) == (uh.field_p ^ -1L)) {
              return 1;
            } else {
              if (ii.field_c == param0) {
                if (wh.a(((vk) this).field_g, false)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            }
          } else {
            if (((vk) this).field_l <= 0) {
              if ((((vk) this).field_d ^ -1L) == (uh.field_p ^ -1L)) {
                return 1;
              } else {
                if (ii.field_c == param0) {
                  if (!wh.a(((vk) this).field_g, false)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_b = -122;
            field_j = null;
            field_e = null;
            return;
        }
        field_j = null;
        field_e = null;
    }

    vk(boolean param0) {
        ((vk) this).field_d = ff.field_a;
        ((vk) this).field_l = be.field_a;
        ((vk) this).field_f = gg.field_a;
        if (!param0) {
            ((vk) this).field_a = null;
        } else {
            ((vk) this).field_a = bl.field_c;
        }
        ((vk) this).field_k = hg.field_b;
        ((vk) this).field_g = fj.field_c;
        ((vk) this).field_c = fg.field_l;
        ((vk) this).field_i = hi.field_b;
        ((vk) this).field_h = bi.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "LEVEL";
        field_e = new de(13, 0, 1, 0);
    }
}
