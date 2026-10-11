/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vob extends rqa {
    static no field_r;
    static String field_q;
    static boolean[] field_o;
    static int field_p;

    final static int a(Random param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = VoidHunters.field_G;
        try {
          var3 = -66 / ((param1 + 62) / 62);
          var2_int = hob.a(param0, gn.field_m, 123);
          for (var4 = 0; var4 < 56; var4++) {
            if (tnb.a(130, var4)) {
              if (var2_int == 0) {
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var2_int--;
            }
          }
          throw new IllegalStateException("No playable chassis found. number_of_chassis=" + gn.field_m);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("vob.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(218, 124));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vob.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_q = null;
        field_o = null;
        int var1 = 114 % ((param0 + 51) / 61);
        field_r = null;
    }

    vob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "Hydra chassis";
        field_o = new boolean[11];
    }
}
