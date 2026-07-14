/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static ei[] field_a;
    static jpa[] field_b;

    final static void a(int param0, int param1, pha param2, byte param3, int param4, int param5, iv param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lja var12 = null;
        paa.a(param6, -1, param2.field_vb, param2.field_yb, param3 + -11542, (int[]) null, (jea) (Object) param2, -1, param2.field_wb);
        hka.field_b.a((byte) -22, true);
        hka.field_b.a((int[]) null, 0, 19);
        if (param3 != -93) {
          field_b = null;
          hka.field_b.c(0);
          var12 = hka.field_b;
          var8 = param0;
          var9 = param1;
          var10 = param5;
          var11 = param4;
          var12.field_f.b(var9, var11, -80, var10, var8);
          return;
        } else {
          hka.field_b.c(0);
          var12 = hka.field_b;
          var8 = param0;
          var9 = param1;
          var10 = param5;
          var11 = param4;
          var12.field_f.b(var9, var11, -80, var10, var8);
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_a = null;
        }
    }

    static {
    }
}
