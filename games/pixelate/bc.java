/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends mg {
    static String field_p;
    static String field_n;
    static boolean[] field_m;
    static ak field_o;

    final dj a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        dj stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            bc.e(54);
          }
          stackIn_5_0 = (hm.a(0, param0) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return qk.field_g;
          }
          stackIn_8_0 = sk.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bc.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    bc(c param0) {
        super(param0);
    }

    final static void a(byte param0, int param1) {
        mc.a(8 * ci.field_o + param1, -127);
        if (param0 != 96) {
          field_n = (String) null;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_m = null;
        field_o = null;
        field_n = null;
        int var1 = -73 / ((-35 - param0) / 59);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            return false;
          }
          if (null == hq.field_t) {
            return false;
          }
          stackIn_10_0 = !(0 > param0.toLowerCase().indexOf(hq.field_t.toLowerCase()));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("bc.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String b(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = param0; var4 < var2_int; var4++) {
            var3[-var4 + (var2_int - 1)] = param1.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        ie.a(pg.field_e, w.field_s, true, aa.field_o, 0, 127, param0);
        for (var2_int = 0; var2_int < pg.field_e; var2_int++) {
          gn.field_A[param0 + var2_int] = var2_int;
        }
        ie.a(param0 + pg.field_e, ro.field_a, false, qn.field_k, param0, 81, param0 + param0);
        if (param1 < 1) {
          return;
        }
        try {
          if (pg.field_e > param0) {
            pg.field_e = param0;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bc.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
          var6[var4] = param1;
        }
        if (param0) {
          field_o = (ak) null;
        }
        return new String(var3);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, true) == sk.field_a) {
            stackIn_2_0 = kp.field_A;
            return stackIn_2_0;
          }
          if (param0 > -76) {
            field_n = (String) null;
          }
          stackIn_6_0 = e.field_c;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_n = "Find opponent";
        field_p = "You are not currently logged in to the game.";
        field_m = new boolean[112];
    }
}
