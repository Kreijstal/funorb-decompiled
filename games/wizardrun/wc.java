/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_c;
    private int field_g;
    String field_h;
    int field_i;
    int[] field_l;
    int field_d;
    static ga field_j;
    static o field_f;
    static int field_k;
    private long field_e;
    private String field_b;
    private boolean field_a;

    final static int a(int param0, int param1, int param2) {
        if (!(ef.field_H != null)) {
            return -1;
        }
        if (param2 >= wk.field_c) {
            if (ef.field_H.field_z + wk.field_c > param2) {
                if (qc.field_L <= param1) {
                    if (!(qc.field_L + ef.field_H.field_p <= param1)) {
                        return 0;
                    }
                }
            }
        }
        if (param2 >= hj.field_f) {
            if (param2 < hj.field_f - -ef.field_H.field_z) {
                if (param1 >= hf.field_b) {
                    if (!(ef.field_H.field_p + hf.field_b <= param1)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 2) {
            field_j = null;
        }
    }

    final int a(byte param0) {
        L0: {
          if (((wc) this).field_a) {
            break L0;
          } else {
            L1: {
              if (((wc) this).field_i != 2) {
                break L1;
              } else {
                if (((wc) this).field_g > 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 102) {
                break L2;
              } else {
                ((wc) this).field_i = -108;
                break L2;
              }
            }
            if (~tg.field_e == ~((wc) this).field_e) {
              return 1;
            } else {
              L3: {
                if (jg.field_k != 2) {
                  break L3;
                } else {
                  if (!aa.a(((wc) this).field_b, (byte) -85)) {
                    break L3;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    wc(boolean param0) {
        ((wc) this).field_i = dj.field_e;
        ((wc) this).field_g = il.field_a;
        ((wc) this).field_a = rb.field_a;
        ((wc) this).field_c = wh.field_g;
        ((wc) this).field_h = vl.field_f;
        ((wc) this).field_d = ac.field_r;
        ((wc) this).field_b = tg.field_b;
        if (!param0) {
            ((wc) this).field_l = null;
        } else {
            ((wc) this).field_l = rh.field_m;
        }
        ((wc) this).field_e = ug.field_N;
    }

    static {
    }
}
