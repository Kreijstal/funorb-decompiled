/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static int[] field_d;
    static long field_b;
    static int field_a;
    static boolean field_c;

    public static void a(int param0) {
        if (param0 != 15873) {
          field_b = -75L;
        }
        field_d = null;
    }

    final static void a(String param0, int param1) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveDeque var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        String[] var5 = null;
        ConsoleValue var6 = null;
        ConsoleValue[] var7 = null;
        ConsoleCommand var8 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          param0 = ne.a((char)param1, (byte) 119, "", param0);
          param0 = ne.a('\t', (byte) 124, "", param0);
          param0 = ne.a('\n', (byte) 99, ";", param0);
          var2 = ConsoleCommandRegistry.a(16);
          System.out.println("String s=" + param0);
          var3 = SetFighterBayAimspeed.a((byte) -67, ';', param0);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = SetFighterBayAimspeed.a((byte) -67, '(', var3[var4]);
            if (var5 != null &&
              var5.length == 2) {
              var5[1] = ne.a(')', (byte) 111, "", var5[1]);
              var6 = new ConsoleValue(lob.a(-92, (CharSequence) ((Object) var5[1])));
              var7 = new ConsoleValue[]{var6};
              var8 = (ConsoleCommand) (var2.d(0));
              while (var8 != null) {
                if (var8.a(true, var5[0], var7)) {
                  var8.execute(var7, param1 - 157);
                }
                var8 = (ConsoleCommand) (var2.a((byte) 12));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("hb.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(kka param0, byte param1) {
        try {
          be.a(32, true, param0);
          int var2_int = -81 / ((param1 + 42) / 61);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = 8;
    }
}
