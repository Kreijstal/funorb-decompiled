/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rmb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackOut_3_0 = new nc(frb.a(139, 88));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("rmb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
        int var7 = 0;
        int var8 = 0;
        gd var9 = null;
        ana var10 = null;
        nl var5 = null;
        int var6 = 0;
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
            gtb.field_d.b(-10258, var5);
        }
        var6 = 116 % ((param3 - 14) / 45);
    }

    static {
    }
}
