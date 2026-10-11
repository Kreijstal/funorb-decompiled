/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static dd field_a;
    static int[] field_d;
    static lr field_e;
    static String field_c;
    static boolean field_f;
    static String[] field_b;

    final static void b(int param0) {
        if (param0 >= -50) {
          field_a = (dd) null;
        }
    }

    final static re a(long param0, int param1, String param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        String var7 = null;
        ub stackIn_5_0 = null;
        ca stackIn_7_0 = null;
        se stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0L &&
            param4 != null) {
            stackIn_7_0 = new ca(param4, param2);
            return (re) ((Object) stackIn_7_0);
          }
          if (param3) {
            stackIn_5_0 = new ub(param0, param2);
            return (re) ((Object) stackIn_5_0);
          }
          if (param1 != -16595) {
            var7 = (String) null;
            bi.a(92L, -15, (String) null, true, (String) null);
          }
          stackIn_11_0 = new se(param0, param2);
          return (re) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("bi.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          if (0L == (pd.field_i & 1L)) {
            return false;
          }
          de.a(-106);
          if (param0 > -66) {
            bi.a(23);
          }
          var1_int = 0;
          while (true) {
            if (var1_int >= aq.field_a.length) {
              return false;
            }
            if (!aq.field_a[var1_int].c((byte) -125)) {
              var1_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "bi.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_c = "Show players in <%0>'s game";
    }
}
