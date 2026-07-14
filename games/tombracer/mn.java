/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends kca {
    private String field_m;
    private oe field_j;
    private boolean field_l;
    static String field_n;
    static int field_k;

    final String a(int param0, String param1) {
        if (((mn) this).field_j.a((byte) 14, param1) != fp.field_c) {
          if (param0 == -1) {
            if (((mn) this).a((byte) 14, param1) == fp.field_c) {
              return woa.field_l;
            } else {
              return dua.field_j;
            }
          } else {
            return null;
          }
        } else {
          return ((mn) this).field_j.a(param0 + 0, param1);
        }
    }

    final it a(byte param0, String param1) {
        if (!(((mn) this).field_j.a(param0, param1) != fp.field_c)) {
            return fp.field_c;
        }
        if (param1.equals((Object) (Object) ((mn) this).field_m)) {
            return !((mn) this).field_l ? fp.field_c : uh.field_k;
        }
        us var3 = wd.a((byte) -115, param1);
        if (!(var3.b(47))) {
            return tea.field_b;
        }
        ((mn) this).field_m = param1;
        ((mn) this).field_l = var3.c(81);
        return !((mn) this).field_l ? fp.field_c : uh.field_k;
    }

    mn(tra param0, tra param1) {
        super(param0);
        ((mn) this).field_l = false;
        ((mn) this).field_m = "";
        ((mn) this).field_j = new oe(param0, param1);
    }

    final static void h(int param0) {
        oq.a((byte) 124).c(76);
        if (param0 != 30001) {
            field_n = null;
        }
    }

    final static String g(int param0) {
        if (param0 > -40) {
            field_n = null;
            return ofa.field_D;
        }
        return ofa.field_D;
    }

    public static void f(int param0) {
        field_n = null;
        if (param0 >= -15) {
            mn.h(-88);
        }
    }

    static {
    }
}
