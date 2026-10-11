/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class te {
    static java.util.zip.CRC32 field_a;
    static ib field_d;
    static tk field_c;
    static hj[] field_b;

    final static void a(boolean param0) {
        if (null != kf.field_U) {
          em.a(-29486, false);
          kd.a(en.a(76), param0);
          return;
        }
        kd.a(en.a(76), param0);
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = HoldTheLine.field_D;
        try {
          var3_int = 1;
          var4 = -15 / ((param1 - 36) / 53);
          while (param2 > 1) {
            if (0 != (param2 & 1)) {
              var3_int = var3_int * param0;
            }
            param2 = param2 >> 1;
            param0 = param0 * param0;
          }
          if (1 == param2) {
            stackIn_11_0 = param0 * var3_int;
            return stackIn_11_0;
          }
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "te.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, hj[] param1) {
        if (param0 != -4) {
          return;
        }
        try {
          qk.field_y = param1;
          if (null != qk.field_y &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != -4) {
          field_a = (java.util.zip.CRC32) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, boolean param5) {
        int[] var8 = null;
        try {
          var8 = new int[]{(-param0 + 640) / 2 - 15, param0};
          int[] var6 = var8;
          fk.a(var8, new String[]{param4}, 122, param5 ? 0 : -1, param3, -1, param1);
          int var7 = 21 / ((param2 - 81) / 32);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "te.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, th param2, int param3, int param4, int param5, byte[] param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var9Lifetime1;
        var11 = HoldTheLine.field_D;
        try {
          var7_int = jg.a(-1, param5);
          if (an.field_a == null) {
            an.field_a = new java.security.SecureRandom();
          }
          var14 = new int[4];
          var13 = var14;
          var8 = var13;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = an.field_a.nextInt();
          }
          if (r.field_d == null ||
            !(var7_int <= r.field_d.field_i.length)) {
            r.field_d = new th(var7_int);
          }
          r.field_d.field_l = 0;
          r.field_d.a(param5, 13, param6, param3);
          r.field_d.b((byte) 127, var7_int);
          r.field_d.a(var14, 111);
          if (om.field_n == null ||
            !(om.field_n.field_i.length >= 100)) {
            om.field_n = new th(100);
          }
          om.field_n.field_l = 0;
          om.field_n.f(111, 10);
          var12 = 0;
          var9Lifetime1 = var12;
          var10 = 4 / ((param4 - 61) / 43);
          while (4 > var12) {
            om.field_n.a((byte) -58, var14[var12]);
            var12++;
          }
          om.field_n.b(-652561784, param5);
          om.field_n.a(param0, param1, (byte) 114);
          param2.a(om.field_n.field_l, 19, om.field_n.field_i, 0);
          param2.a(r.field_d.field_l, 58, r.field_d.field_i, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("te.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    static {
        field_a = new java.util.zip.CRC32();
    }
}
