/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj implements mh {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -4) {
          field_a = 101;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 <= -116) {
          return (34 & param0) != 0 ? true : false;
        }
        oj.a(true);
        return (34 & param0) != 0 ? true : false;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wb var8 = null;
        try {
          var6_int = param4 + param0.field_r;
          if (param2 != 5592405) {
            field_b = (String) null;
          }
          var7 = param1 + param0.field_v;
          nn.a(param0.field_p, var6_int, param0.field_q, (byte) -84, var7);
          var8 = fw.field_m[1];
          if (param0 instanceof wp &&
            ((wp) (param0)).field_C) {
            var8.d((-var8.field_z + param0.field_q >> 1) + (var6_int + 1), (-var8.field_w + param0.field_p >> 1) + (var7 + 1), 256);
          }
          if (!param0.d(param2 - 5592406)) {
            return;
          }
          pp.a(var7 + 2, -4 + param0.field_q, param2 - 5605586, var6_int + 2, -4 + param0.field_p);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oj.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 == 13836) {
          return 0 != (2048 & param0) ? true : false;
        }
        oj.a(-32);
        return 0 != (2048 & param0) ? true : false;
    }

    final static boolean b(int param0) {
        int var1 = -55 / ((-62 - param0) / 36);
        return dv.field_b;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_b = (String) null;
          if (pu.field_e == null) {
            return false;
          }
          if (null != pu.field_e.e((byte) 54)) {
            return true;
          }
          return false;
        }
        if (pu.field_e == null) {
          return false;
        }
        if (null != pu.field_e.e((byte) 54)) {
          return true;
        }
        return false;
    }

    static {
        field_b = "Email address is unavailable";
    }
}
