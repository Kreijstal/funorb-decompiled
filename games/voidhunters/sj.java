/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj extends rqa {
    static int[] field_p;
    static int field_o;

    final static int a(int param0, int param1, Random param2, boolean param3, int[] param4) {
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var8Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (param4 == null) {
            stackIn_4_0 = hob.a(param2, param1, 123);
            return stackIn_4_0;
          }
          if (param0 >= -36) {
            stackIn_7_0 = -67;
            return stackIn_7_0;
          }
          var5_int = 0;
          var6 = 2147483647;
          if (param3) {
            var6 = -2147483648;
          }
          var7 = 0;
          for (var8 = 0; var8 < param1; var8++) {
            if ((param3 ||
              param4[var8] >= var6) &&
              (!param3 ||
              var6 >= param4[var8])) {
              if (var6 == param4[var8]) {
                var7++;
              }
            } else {
              var6 = param4[var8];
              var5_int = var8;
              var7 = 1;
            }
          }
          if (1 < var7) {
            var8Lifetime1 = hob.a(param2, var7, 123);
            var9 = 0;
            for (var10 = 0; param1 > var10; var10++) {
              if (param4[var10] == var6) {
                if (var9 == var8Lifetime1) {
                  stackIn_32_0 = var10;
                  return stackIn_32_0;
                }
                var9++;
              }
            }
          }
          stackIn_36_0 = var5_int;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("sj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        if (lob.field_a != null) {
          ukb.a(lob.field_a, (byte) 17);
        }
        if (cka.field_o != null) {
          cka.field_o.a(1, param0);
        }
        dba.a(79, param0);
        int var2 = 103 / ((16 - param1) / 32);
        if (null != crb.field_v) {
          crb.field_v.b(param0, -117);
        }
        ocb.a(param0, 124);
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
          si.a(29, 62, param0[0].a(88));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sj.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    sj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_p = null;
    }

    static {
    }
}
