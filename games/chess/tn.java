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
        if (param1 < 0) {
          return false;
        }
        if (param1 > 11) {
          return false;
        }
        if (param2 != -25042) {
          tn.a(-77, 46, -60, -41);
          if (param0 < 1) {
            return false;
          }
          if (mf.a(param3, param1, param2 ^ -16806) >= param0) {
            return true;
          }
          return false;
        }
        if (param0 < 1) {
          return false;
        }
        if (mf.a(param3, param1, param2 ^ -16806) >= param0) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_j = null;
        field_l = null;
        if (param0 != -2) {
          tn.a(125, 104, 87, -12);
        }
    }

    tn(na param0, o param1) {
        try {
          this.field_k = param0;
          this.field_o = param0.j();
          this.field_n = param1;
          this.field_k.h(this.field_o * lf.field_S / 80);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "tn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Add friend";
    }
}
