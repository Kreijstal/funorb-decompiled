/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tnb extends rqa {
    static int field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                tnb.a((byte) 59, 88L);
                break L1;
              }
            }
            si.a(130, 62, param0[0].a(73));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tnb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0, long param1) {
        lib.field_o.setTime(new Date(param1));
        int var3 = lib.field_o.get(7);
        int var5 = -29 / ((-38 - param0) / 39);
        int var4 = lib.field_o.get(5);
        int var6 = lib.field_o.get(2);
        int var7 = lib.field_o.get(1);
        int var8 = lib.field_o.get(11);
        int var9 = lib.field_o.get(12);
        int var10 = lib.field_o.get(13);
        return waa.field_D[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ena.field_o[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    public static void e(byte param0) {
        field_p = null;
        int var1 = 32 / ((param0 - 67) / 55);
    }

    final static boolean a(int param0, int param1) {
        if (param0 != 130) {
            return true;
        }
        return hab.field_g[param1].field_f;
    }

    tnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Tips";
        field_o = 67;
    }
}
