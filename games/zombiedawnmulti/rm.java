/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static StringBuilder field_a;
    static gp field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 80) {
          return;
        }
        field_b = null;
    }

    final static wf a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        wf var8 = null;
        wf var8Lifetime1;
        if (param6 == 8128) {
          var8 = (wf) (dg.field_K.g(41));
          if (var8 == null) {
            var8 = new wf();
          }
          var8.a(param2, param0, -32, param4, param1, param7, param3, param5);
          return var8;
        }
        rm.a(-118, -128, 102, -103, 69, 9, 118, -123);
        var8Lifetime1 = (wf) (dg.field_K.g(41));
        if (var8Lifetime1 == null) {
          var8Lifetime1 = new wf();
        }
        var8Lifetime1.a(param2, param0, -32, param4, param1, param7, param3, param5);
        return var8Lifetime1;
    }

    static {
        field_a = new StringBuilder(80);
    }
}
