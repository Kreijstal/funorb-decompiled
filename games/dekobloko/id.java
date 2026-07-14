/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends ma {
    static String field_O;
    static int[] field_M;
    static int field_P;
    static s field_N;

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        se var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = lg.field_Y;
        if (var7 != null) {
          if (((id) this).a(param5, (byte) -58, param4, param0, param2)) {
            if (!(((id) this).field_v instanceof na)) {
              if (!(var7.field_v instanceof na)) {
                return;
              } else {
                ((na) (Object) var7.field_v).a(var7, (id) this, (byte) -128);
                lg.field_Y = null;
                return;
              }
            } else {
              ((na) (Object) ((id) this).field_v).a(var7, (id) this, (byte) -128);
              lg.field_Y = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private id(int param0, int param1, int param2, int param3, gl param4, kg param5, ce param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((id) this).field_L = param6;
    }

    final static ck a(ji param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param3 != 8192) {
          field_N = null;
          var4 = param0.b(-1, param2);
          var5 = param0.a(var4, 13030, param1);
          return af.a(var5, 50, param0, var4);
        } else {
          var4 = param0.b(-1, param2);
          var5 = param0.a(var4, 13030, param1);
          return af.a(var5, 50, param0, var4);
        }
    }

    public static void c(boolean param0) {
        Object var2 = null;
        field_M = null;
        field_N = null;
        if (!param0) {
          var2 = null;
          id.a(99, 26, 67, 28, -65, -116, 74, (ck) null, 106);
          field_O = null;
          return;
        } else {
          field_O = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ck param7, int param8) {
        qk.field_k = param8;
        pm.field_d = param5;
        g.field_Q = param2;
        db.field_a = param3;
        le.field_y = param4;
        ce.field_r = param1;
        wg.field_b = param7;
        if (param6 != 8192) {
          id.c(false);
          nk.field_g = param0;
          return;
        } else {
          nk.field_g = param0;
          return;
        }
    }

    final static w g(int param0) {
        if (param0 != 8192) {
            id.c(false);
            return jg.b(false);
        }
        return jg.b(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "<%0>: <%1>";
        field_M = new int[8192];
    }
}
