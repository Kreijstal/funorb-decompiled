/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rmb extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(139, 88));
    }

    final static int a(int param0, int param1) {
        if (param0 != -16777216) {
            return 34;
        }
        return (param1 >>> 1903636385 & -2139127937) + (-16777216 & param1);
    }

    rmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gd var9 = null;
        ana var10 = null;
        nl var5 = null;
        if (!(null != kba.field_a)) {
            return;
        }
        nl var12 = ohb.a(param2, -112, param1);
        nl var13 = var12;
        if (var13 != null) {
            var13.field_h = true;
            var13.field_f = param0;
            var13.field_i = param4;
        } else {
            var6 = uv.a(128, param4);
            var7 = pja.b((byte) 126, param4, param0);
            var8 = param2;
            if (fbb.field_j[param2] > 1) {
                var8 = hob.a(jp.field_Jc, fbb.field_j[param2], 121) + param2;
            }
            var9 = fa.field_d[var8];
            var10 = coa.a(var7, 100, var6, var9);
            var10.field_e.d(-1);
            var5 = new nl();
            var5.field_i = param4;
            var5.field_k = param2;
            var5.field_f = param0;
            var5.field_l = param1;
            var5.field_h = true;
            var5.field_d = var10;
            var5.field_g = true;
            gtb.field_d.b(-10258, (ksa) (Object) var5);
        }
        var6 = 116 % ((param3 - 14) / 45);
    }

    static {
    }
}
