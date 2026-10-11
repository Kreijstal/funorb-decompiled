/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static int field_d;
    static String field_c;
    private static int field_a;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
          eg var2 = (eg) null;
          a.a(true, (eg) null);
        }
    }

    final static eg a(boolean param0, eg param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        eg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          for (var2_int = 0; param1.field_Y.length > var2_int; var2_int++) {
            param1.field_Y[var2_int] = -param1.field_Y[var2_int];
          }
          if (!param0) {
            var4 = (String) null;
            a.a((String) null, false, false, -0.28095385432243347f);
          }
          jf.a(param1, (byte) 38);
          param1.a();
          stackIn_7_0 = (eg) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("a.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -3 % ((69 - param1) / 54);
          stackIn_1_0 = tl.a(param0.length, -7510, param0, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("a.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, boolean param2, float param3) {
        try {
          if (of.field_Nb == null) {
            of.field_Nb = new wa(wd.field_Ub, oa.field_d);
            wd.field_Ub.b(of.field_Nb, 30000);
          }
          of.field_Nb.a(param0, 2113632, param3, param2);
          qh.d();
          to.a((byte) -118, param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "a.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = 15;
        field_c = "Players";
        field_b = "You cannot join this game - it is in progress";
        field_d = 1 << field_a;
    }
}
