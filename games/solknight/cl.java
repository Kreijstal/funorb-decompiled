/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends a {
    static int[] field_l;
    static int field_n;
    static int field_o;
    static boolean field_m;
    static String field_j;
    static String field_k;

    final qf a(String param0, byte param1) {
        int var3 = 0;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var5 = (CharSequence) (Object) param0;
        if (!ec.a(30418, var5)) {
          return rg.field_f;
        } else {
          var6 = (CharSequence) (Object) param0;
          var3 = il.a(var6, 6054);
          if (0 < var3) {
            if (var3 <= 130) {
              if (param1 >= -109) {
                var4 = null;
                qf discarded$2 = ((cl) this).a((String) null, (byte) 83);
                return ph.field_g;
              } else {
                return ph.field_g;
              }
            } else {
              return rg.field_f;
            }
          } else {
            return rg.field_f;
          }
        }
    }

    public static void e(byte param0) {
        Object var2 = null;
        if (param0 > -96) {
          var2 = null;
          cl.a(16, (o) null);
          field_j = null;
          field_k = null;
          field_l = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_l = null;
          return;
        }
    }

    cl(vg param0) {
        super(param0);
    }

    final String a(String param0, boolean param1) {
        if (!(((cl) this).a(param0, (byte) -116) != rg.field_f)) {
            return qh.field_e;
        }
        if (!param1) {
            return null;
        }
        return null;
    }

    final static fg[] d(byte param0) {
        if (param0 != -30) {
          return null;
        } else {
          return new fg[]{sk.field_p, bb.field_I, SolKnight.field_D};
        }
    }

    final static void a(int param0, o param1) {
        fl.b((byte) 91);
        if (param0 > -91) {
          cl.e((byte) 101);
          mi.a(param1.field_v, param1.field_q, param1.field_r);
          return;
        } else {
          mi.a(param1.field_v, param1.field_q, param1.field_r);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Error connecting to server. Please try using a different server.";
        field_k = "Reload game";
    }
}
