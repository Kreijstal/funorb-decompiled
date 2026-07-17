/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int field_c;
    static gp field_b;
    static boolean field_f;
    static int field_g;
    private int field_h;
    static int[] field_l;
    String field_d;
    int[] field_i;
    private long field_a;
    int field_o;
    private boolean field_k;
    static String field_j;
    int field_n;
    private String field_e;
    int field_m;

    final static int a() {
        int var1 = -66;
        return -bf.field_b + d.field_e;
    }

    final static int a(int param0, byte param1) {
        return re.field_f[param0 & 2047];
    }

    final int b(byte param0) {
        if (!((la) this).field_k) {
          if (((la) this).field_n != 2) {
            if (~((la) this).field_a != ~rk.field_l) {
              if (ke.field_d != 2) {
                if (param0 < 94) {
                  int discarded$6 = ((la) this).b((byte) -110);
                  return 0;
                } else {
                  return 0;
                }
              } else {
                int discarded$7 = -17;
                if (!mj.a(((la) this).field_e)) {
                  if (param0 < 94) {
                    int discarded$8 = ((la) this).b((byte) -110);
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            if (0 >= ((la) this).field_h) {
              if (~((la) this).field_a != ~rk.field_l) {
                if (ke.field_d != 2) {
                  if (param0 < 94) {
                    int discarded$9 = ((la) this).b((byte) -110);
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  int discarded$10 = -17;
                  if (!mj.a(((la) this).field_e)) {
                    if (param0 < 94) {
                      int discarded$11 = ((la) this).b((byte) -110);
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
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

    final static int a(int param0) {
        return 1;
    }

    public static void c() {
        int var1 = -19;
        field_j = null;
        field_b = null;
        field_l = null;
    }

    la(boolean param0) {
        ((la) this).field_e = tk.field_v;
        ((la) this).field_n = uk.field_a;
        ((la) this).field_o = di.field_d;
        ((la) this).field_h = wd.field_j;
        if (param0) {
            ((la) this).field_i = kp.field_a;
        } else {
            ((la) this).field_i = null;
        }
        ((la) this).field_a = gg.field_d;
        ((la) this).field_d = sa.field_t;
        ((la) this).field_m = ce.field_w;
        ((la) this).field_k = ac.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_l = new int[8192];
        field_f = true;
        field_j = "Income rate: <col=DB0100><%0> per hour</col>";
    }
}
