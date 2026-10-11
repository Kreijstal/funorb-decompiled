/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends qb {
    int field_j;
    static int field_h;
    vi[] field_r;
    byte[][][] field_l;
    vi[] field_p;
    int[] field_i;
    int field_o;
    static char field_n;
    static int[] field_q;
    static int[] field_g;
    int[] field_m;
    int[] field_k;

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (ph.a(param1, !param0 ? true : false)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param0) {
          return false;
        }
        ib var3 = (ib) null;
        fd.a(-68, (ib) null, false);
        return false;
    }

    final static int a(int param0) {
        if (param0 != -28506) {
          field_g = (int[]) null;
          return kl.field_E;
        }
        return kl.field_E;
    }

    public static void b(byte param0) {
        field_q = null;
        if (param0 != 3) {
          ib var2 = (ib) null;
          fd.a(21, (ib) null, false);
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static void a(int param0, ib param1, boolean param2) {
        try {
          gh.a(li.a(param1, 100, param0), (byte) -109);
          if (param2) {
            field_h = 107;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    fd() {
    }

    static {
        field_h = 0;
        field_g = new int[8192];
    }
}
