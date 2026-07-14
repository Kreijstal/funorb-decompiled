/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends ne {
    int field_j;
    static int field_k;
    long field_l;
    static cn field_n;
    static String[] field_i;
    static int field_o;
    byte[] field_m;

    public static void d(int param0) {
        field_n = null;
        if (param0 != 10625) {
            field_n = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static String a(int param0) {
        if (param0 != -21) {
            ao.d(85);
            return jj.field_d;
        }
        return jj.field_d;
    }

    ao(long param0, int param1, byte[] param2) {
        ((ao) this).field_m = param2;
        ((ao) this).field_l = param0;
        ((ao) this).field_j = param1;
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        var1 = -108 / ((param0 - 29) / 43);
        if ((dk.field_c ^ -1) <= -21) {
          if (vk.a(22084)) {
            if ((hf.field_sb ^ -1) < -1) {
              if (dh.a(false)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Pit Immunity", "Such is the dexterity of the <%0> that he can traverse any pit without danger of failure."};
    }
}
