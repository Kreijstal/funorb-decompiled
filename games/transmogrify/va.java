/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends me {
    private cg field_k;
    private boolean field_m;
    static int field_j;
    private String field_l;

    final String b(int param0, String param1) {
        if (param0 == -1) {
          if (((va) this).field_k.a(95, param1) == ec.field_d) {
            return ((va) this).field_k.b(-1, param1);
          } else {
            if (((va) this).a(95, param1) == ec.field_d) {
              return hk.field_b;
            } else {
              return wj.field_i;
            }
          }
        } else {
          return null;
        }
    }

    va(rg param0, rg param1) {
        super(param0);
        ((va) this).field_l = "";
        ((va) this).field_m = false;
        ((va) this).field_k = new cg(param0, param1);
    }

    final static int a(hg param0, hg param1, byte param2) {
        int var3 = 22 / ((8 - param2) / 37);
        Object var4 = null;
        return jd.a(0, param1, (byte) -9, (String) null, 0, false, param0);
    }

    final rc a(int param0, String param1) {
        fc var3 = null;
        if (!(((va) this).field_k.a((int) (char)param0, param1) != ec.field_d)) {
            return ec.field_d;
        }
        if (!(param1.equals((Object) (Object) ((va) this).field_l))) {
            var3 = pi.a(17118, param1);
            if (var3.b(-26753)) {
                ((va) this).field_l = param1;
                ((va) this).field_m = var3.a(-1);
                return ((va) this).field_m ? hi.field_b : ec.field_d;
            }
            return fi.field_u;
        }
        return ((va) this).field_m ? hi.field_b : ec.field_d;
    }

    static {
    }
}
