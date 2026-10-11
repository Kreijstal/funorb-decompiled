/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    static double field_a;
    static Random field_c;
    static int field_b;
    static n field_d;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_d = (n) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static vi a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        vi var7 = null;
        int var8 = 0;
        vi stackIn_4_0 = null;
        vi stackIn_7_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_16_0 = null;
        vi stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (~var2_int == param1) {
            stackIn_4_0 = qj.field_e;
            return stackIn_4_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = ej.field_f;
            return stackIn_7_0;
          }
          var3 = ki.a((byte) -97, '.', param0);
          if (2 > var3.length) {
            stackIn_10_0 = qj.field_e;
            return stackIn_10_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = nc.a(var6, (byte) -33);
            if (var7 != null) {
              stackIn_16_0 = var7;
              return stackIn_16_0;
            }
          }
          stackIn_19_0 = vg.a((byte) -126, var3[var3.length - 1]);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("pd.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = Math.atan2(1.0, 0.0);
        field_c = new Random(15L);
    }
}
