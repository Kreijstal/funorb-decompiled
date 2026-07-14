/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du {
    int field_c;
    static js field_a;
    int field_d;
    static ee field_b;
    static int[] field_e;

    final static eq a(String param0, byte param1) {
        Object var3 = null;
        if (param1 == -43) {
          if (dka.field_G != kq.field_j) {
            if (dka.field_G == ki.field_w) {
              if (!param0.equals((Object) (Object) vh.field_w)) {
                vh.field_w = param0;
                dka.field_G = kq.field_j;
                vo.field_d = null;
                return null;
              } else {
                dka.field_G = tn.field_a;
                return vo.field_d;
              }
            } else {
              vh.field_w = param0;
              dka.field_G = kq.field_j;
              vo.field_d = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          var3 = null;
          eq discarded$5 = du.a((String) null, (byte) -83);
          if (dka.field_G != kq.field_j) {
            if (dka.field_G == ki.field_w) {
              if (!param0.equals((Object) (Object) vh.field_w)) {
                vh.field_w = param0;
                dka.field_G = kq.field_j;
                vo.field_d = null;
                return null;
              } else {
                dka.field_G = tn.field_a;
                return vo.field_d;
              }
            } else {
              vh.field_w = param0;
              dka.field_G = kq.field_j;
              vo.field_d = null;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    du(int param0, int param1, int param2, int param3) {
        ((du) this).field_d = param3;
        ((du) this).field_c = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
            field_a = null;
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
    }
}
