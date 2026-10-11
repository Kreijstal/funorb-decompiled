/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static ut field_a;
    static String field_c;
    static String field_b;

    final static ut a(byte param0, String param1, sj param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ut stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.b(param1, -1);
          var5 = param2.a((byte) -95, param3, var4_int);
          if (param0 <= 96) {
            field_b = (String) null;
          }
          stackIn_3_0 = ju.a(var4_int, var5, param2, (byte) -9);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -128 / ((param0 - 30) / 42);
        field_b = null;
    }

    final static ot a(int param0, int param1) {
        ut var8 = null;
        ot var9 = null;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var4Lifetime1;
        if (param0 < -89) {
          var8 = new ut(108, 108);
          iw.a(-118, var8);
          on.d(54, 54, 51, 255);
          on.d(54, 54, 43, 0);
          ts.a(param1, 0, 124);
          ta.e(117);
          var9 = new ot(54, 54);
          iw.a(-92, var9);
          var8.f(0, 0);
          ta.e(119);
          for (var4 = 0; var9.field_y.length > var4; var4++) {
            var9.field_y[var4] = hf.a(var9.field_y[var4] << 24, 1118668);
          }
          return var9;
        }
        wa.b((byte) 1);
        ut var6 = new ut(108, 108);
        iw.a(-118, var6);
        on.d(54, 54, 51, 255);
        on.d(54, 54, 43, 0);
        ts.a(param1, 0, 124);
        ta.e(117);
        ot var7 = new ot(54, 54);
        iw.a(-92, var7);
        var6.f(0, 0);
        ta.e(119);
        for (var4Lifetime1 = 0; var7.field_y.length > var4Lifetime1; var4Lifetime1++) {
          var7.field_y[var4Lifetime1] = hf.a(var7.field_y[var4Lifetime1] << 24, 1118668);
        }
        return var7;
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Kickabout.field_G;
        try {
          var5 = qe.field_b;
          var1 = var5;
          var2 = 0;
          if (param0 > -84) {
            field_b = (String) null;
          }
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "wa.B(" + param0 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
          wp.field_h = param1;
          fp.field_e = 1;
          if (param0 != 52) {
            wa.a(34, 19);
          }
          et.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new ut(96, 100);
        field_c = "Waiting for <%0> to start the game...";
        field_b = "The online auction system is a marketplace where your characters can be traded with other FunOrb players.<br><col=ffff00>Note: Auctions may not appear in the system for a few minutes after they are created.</col>";
    }
}
