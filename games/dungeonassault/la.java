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

    final static int a(byte param0) {
        int var1 = 66 / ((param0 - -40) / 60);
        return -bf.field_b + d.field_e;
    }

    final static int a(int param0, byte param1) {
        if (param1 != 86) {
            field_f = false;
            return re.field_f[param0 & 2047];
        }
        return re.field_f[param0 & 2047];
    }

    final int b(byte param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        if (!this.field_k) {
          if (this.field_n != 2) {
            if ((this.field_a ^ -1L) != (rk.field_l ^ -1L)) {
              if (ke.field_d != 2) {
                if (param0 < 94) {
                  discarded$4 = this.b((byte) -110);
                  return 0;
                } else {
                  return 0;
                }
              } else {
                if (!mj.a(this.field_e, (byte) -17)) {
                  if (param0 < 94) {
                    discarded$5 = this.b((byte) -110);
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
            if (0 >= this.field_h) {
              if ((this.field_a ^ -1L) != (rk.field_l ^ -1L)) {
                if (ke.field_d != 2) {
                  if (param0 < 94) {
                    discarded$6 = this.b((byte) -110);
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  if (!mj.a(this.field_e, (byte) -17)) {
                    if (param0 < 94) {
                      discarded$7 = this.b((byte) -110);
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
        if (param0 != 23940) {
            field_l = (int[]) null;
            return 1;
        }
        return 1;
    }

    public static void c(byte param0) {
        int var1 = -38 / ((0 - param0) / 45);
        field_j = null;
        field_b = null;
        field_l = null;
    }

    la(boolean param0) {
        this.field_e = tk.field_v;
        this.field_n = uk.field_a;
        this.field_o = di.field_d;
        this.field_h = wd.field_j;
        if (param0) {
            this.field_i = kp.field_a;
        } else {
            this.field_i = null;
        }
        this.field_a = gg.field_d;
        this.field_d = sa.field_t;
        this.field_m = ce.field_w;
        this.field_k = ac.field_l;
    }

    static {
        field_g = 0;
        field_l = new int[8192];
        field_f = true;
        field_j = "Income rate: <col=DB0100><%0> per hour</col>";
    }
}
