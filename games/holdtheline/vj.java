/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj extends wc {
    static String field_n;
    static int field_l;
    static String field_m;
    boolean field_q;
    static String field_o;
    boolean field_p;

    abstract vj c(boolean param0);

    final static nd b(int param0, String param1) {
        if (ak.field_b != sf.field_n) {
          if (param0 == 0) {
            if (fd.field_c == ak.field_b) {
              if (!param1.equals((Object) (Object) rd.field_j)) {
                ak.field_b = sf.field_n;
                ja.field_U = null;
                rd.field_j = param1;
                return null;
              } else {
                ak.field_b = gg.field_M;
                return ja.field_U;
              }
            } else {
              ak.field_b = sf.field_n;
              ja.field_U = null;
              rd.field_j = param1;
              return null;
            }
          } else {
            field_o = null;
            if (fd.field_c == ak.field_b) {
              if (!param1.equals((Object) (Object) rd.field_j)) {
                ak.field_b = sf.field_n;
                ja.field_U = null;
                rd.field_j = param1;
                return null;
              } else {
                ak.field_b = gg.field_M;
                return ja.field_U;
              }
            } else {
              ak.field_b = sf.field_n;
              ja.field_U = null;
              rd.field_j = param1;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void h(int param0) {
        field_m = null;
        if (param0 > -43) {
            field_n = null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    vj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Kill the Zombies!";
        field_l = 0;
        field_o = "Orb coins: <%0>";
        field_m = "Password is valid";
    }
}
