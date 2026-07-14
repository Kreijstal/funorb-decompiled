/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt extends rqa {
    static int field_p;
    static vla field_o;

    public static void a(int param0) {
        if (param0 != 26468) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(192, 62, param0[0].a(85));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    jt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var7 = 0;
        aja var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        aja var14 = null;
        aja var15 = null;
        aja var16 = null;
        aja var17 = null;
        aja var18 = null;
        aja var19 = null;
        aja var20 = null;
        aja var21 = null;
        L0: {
          var7 = -51 % ((-20 - param3) / 43);
          if (li.field_i) {
            var8 = mmb.field_d[param4];
            var9 = var8.d();
            var10 = var8.a();
            var11 = 16777215 | param5 << -1669316712;
            var12 = 0;
            var13 = 1;
            var8.a(param6, param0, var12, var11, var13);
            var14 = mmb.field_d[param4 + 1];
            var14.b(param6 + var9, param0, param1 + -(var9 << 1045890849), var10, var12, var11, var13);
            var15 = mmb.field_d[2 + param4];
            var15.a(param1 + (param6 - var9), param0, var12, var11, var13);
            var16 = mmb.field_d[3 + param4];
            var16.b(param6, param0 + var10, var9, param2 - (var10 << -511700447), var12, var11, var13);
            var17 = mmb.field_d[4 + param4];
            var17.b(var9 + param6, param0 - -var10, param1 + -(var9 << -670389151), -(var10 << 15714433) + param2, var12, var11, var13);
            var18 = mmb.field_d[param4 + 5];
            var18.b(-var9 + param1 + param6, param0 - -var10, var9, -(var10 << -866331679) + param2, var12, var11, var13);
            var19 = mmb.field_d[param4 + 6];
            var19.a(param6, param2 + param0 - var10, var12, var11, var13);
            var20 = mmb.field_d[7 + param4];
            var20.b(param6 - -var9, -var10 + param0 - -param2, param1 + -(var9 << 241671937), var10, var12, var11, var13);
            var21 = mmb.field_d[param4 + 8];
            var21.a(param6 - (-param1 + var9), param0 + (param2 + -var10), var12, var11, var13);
            break L0;
          } else {
            paa.a(3377322, -77, param1, param0, param2, param6);
            uv.a(116, param6, param2, param0, 16777215, param1);
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 50;
    }
}
