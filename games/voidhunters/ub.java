/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub extends IntrusiveNode implements tv {
    static String field_g;
    static int[] field_f;
    static String[] field_d;
    static ConsoleCommandRegistry field_e;
    static String field_h;

    ub() {
    }

    public void a(faa param0, boolean param1) {
        try {
          if (param1) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ub.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        try {
          if (param0 <= 54) {
            faa var4 = (faa) null;
            this.a((faa) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) -11, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ub.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void reportDifferences(tv other, int obfuscationGuard) {
        try {
          if (obfuscationGuard > -19) {
            field_e = (ConsoleCommandRegistry) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ub.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_h = null;
        if (param0 <= 37) {
          return;
        }
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 103 / ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ub.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
        field_g = "<%0> has entered a game.";
        field_f = new int[]{1, 0};
        field_h = "Waiting for <%0> to start the game...";
        field_d = new String[]{"Game type"};
        field_e = new ConsoleCommandRegistry();
    }
}
