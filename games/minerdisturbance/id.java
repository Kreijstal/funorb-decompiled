/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    int field_g;
    int field_d;
    static bj field_c;
    static String[] field_l;
    private long field_k;
    String field_e;
    private int field_h;
    static int[] field_b;
    private String field_m;
    static String field_i;
    private boolean field_j;
    int[] field_a;
    int field_f;

    public static void b(int param0) {
        field_l = null;
        field_i = null;
        field_b = null;
        field_c = null;
        if (param0 != 8192) {
            field_i = null;
        }
    }

    final static jh a(byte param0, String param1, int param2) {
        ic var3 = null;
        if (param0 != -34) {
          field_b = null;
          var3 = new ic();
          ((jh) (Object) var3).field_f = param1;
          ((jh) (Object) var3).field_e = param2;
          return (jh) (Object) var3;
        } else {
          var3 = new ic();
          ((jh) (Object) var3).field_f = param1;
          ((jh) (Object) var3).field_e = param2;
          return (jh) (Object) var3;
        }
    }

    final int a(int param0) {
        if (!((id) this).field_j) {
          if (-3 != (((id) this).field_g ^ -1)) {
            if (param0 >= 25) {
              if (kf.field_f == ((id) this).field_k) {
                return 1;
              } else {
                if (-3 == (ha.field_g ^ -1)) {
                  if (!fa.a(((id) this).field_m, (byte) 66)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 26;
            }
          } else {
            if (((id) this).field_h <= 0) {
              if (param0 >= 25) {
                if (kf.field_f == ((id) this).field_k) {
                  return 1;
                } else {
                  if (-3 == (ha.field_g ^ -1)) {
                    if (!fa.a(((id) this).field_m, (byte) 66)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 26;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    id(boolean param0) {
        ((id) this).field_h = mk.field_a;
        ((id) this).field_m = vd.field_x;
        ((id) this).field_e = bf.field_c;
        ((id) this).field_k = il.field_v;
        ((id) this).field_d = ig.field_e;
        ((id) this).field_g = pf.field_i;
        if (param0) {
            ((id) this).field_a = pi.field_l;
        } else {
            ((id) this).field_a = null;
        }
        ((id) this).field_f = pl.field_c;
        ((id) this).field_j = sa.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_i = "Email (Login):";
    }
}
