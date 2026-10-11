/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static java.awt.Frame field_a;
    static String field_f;
    static String field_d;

    final static void a(java.math.BigInteger param0, p param1, p param2, int param3, java.math.BigInteger param4) {
        if (param3 <= 53) {
          return;
        }
        try {
          ni.a(0, param1.field_l, param0, param2, -21105, param4, param1.field_o);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          lk.a((java.math.BigInteger) null, (p) null, (p) null, 110, (java.math.BigInteger) null);
        }
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          g.field_a = kn.field_D;
          if (param1 != param2) {
            if (100 <= param2 &&
              param2 <= 105) {
              lg.field_a = a.a(args, param1 ^ -183);
              return;
            }
            lg.field_a = sc.a(param3, param2, (byte) 90);
            return;
          }
          stackIn_4_0 = 18621;
          stackIn_5_1 = !(cn.field_f >= 13);
          lg.field_a = cf.b(stackIn_4_0, stackIn_5_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("lk.A(");
          if (args == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 77) {
          return true;
        }
        if (null != pi.field_d) {
          return true;
        }
        if (ve.k(-105)) {
          return true;
        }
        if (null != pj.field_h) {
          return true;
        }
        if (!jj.b(7)) {
          return false;
        }
        return true;
    }

    static {
        field_c = new int[8192];
        field_e = 0;
        field_b = "The account name you use to access RuneScape and other Jagex.com games";
        field_f = "Show lobby chat from my friends";
        field_d = "Try again";
    }
}
