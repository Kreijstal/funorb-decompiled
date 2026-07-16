/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends o {
    static ci field_j;
    o field_n;
    na field_k;
    int field_o;
    static String field_l;
    static int field_m;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (-1 < (param1 ^ -1)) {
          return false;
        } else {
          if (-12 <= (param1 ^ -1)) {
            if (param2 == -25042) {
              if (-2 >= (param0 ^ -1)) {
                if ((mf.a(param3, param1, param2 ^ -16806) ^ -1) <= (param0 ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              boolean discarded$8 = tn.a(-77, 46, -60, -41);
              if (-2 >= (param0 ^ -1)) {
                if ((mf.a(param3, param1, param2 ^ -16806) ^ -1) <= (param0 ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_l = null;
        if (param0 != -2) {
            boolean discarded$0 = tn.a(125, 104, 87, -12);
        }
    }

    tn(na param0, o param1) {
        ((tn) this).field_k = param0;
        ((tn) this).field_o = param0.j();
        ((tn) this).field_n = param1;
        ((tn) this).field_k.h(((tn) this).field_o * lf.field_S / 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Add friend";
    }
}
