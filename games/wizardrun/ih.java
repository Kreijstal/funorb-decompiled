/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_c;
    static boolean field_a;
    static uc field_b;

    final static int a(byte param0) {
        if (param0 <= -77) {
          return (int)(1000000000L / wj.field_E);
        }
        ih.a(76, -4, -17, 16, true, -96, 63);
        return (int)(1000000000L / wj.field_E);
    }

    final static boolean a(String param0, boolean param1, nk param2, int param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        kk var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            field_a = true;
          }
          if (fi.field_y != ej.field_b) {
            return false;
          }
          var8 = new kk(u.field_A, param2);
          u.field_A.b((ub) (var8), (byte) 94);
          if (ri.c(42)) {
            var8.p(param3 ^ -20371);
            return true;
          }
          ki.field_F = null;
          fi.field_y = pl.field_E;
          na.field_l = param0;
          ac.field_t = param4;
          sf.field_a = param5;
          we.field_a = param6;
          ub.field_m = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("ih.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!qb.field_p) {
          throw new IllegalStateException();
        }
        vc.field_M = true;
        ml.a(param0 + 11579568, true);
        ml.field_t = param0;
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
          String var2 = (String) null;
          ih.a((String) null, false, (nk) null, -33, -128, (String) null, (String) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (!param4) {
          field_a = true;
          if (param5 < param0) {
            return false;
          }
          if (param5 >= param0 + param1) {
            return false;
          }
          if (param6 < param3) {
            return false;
          }
          if (param3 + param2 > param6) {
            return true;
          }
          return false;
        }
        if (param5 < param0) {
          return false;
        }
        if (param5 >= param0 + param1) {
          return false;
        }
        if (param6 < param3) {
          return false;
        }
        if (param3 + param2 > param6) {
          return true;
        }
        return false;
    }

    static {
        field_a = false;
        field_c = new String[]{"By rating", "By win percentage"};
    }
}
