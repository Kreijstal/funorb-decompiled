/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String field_c;
    static String field_b;
    static int field_f;
    static CipherPacketBuffer field_e;
    static RgbSprite field_d;
    static String field_a;
    static int field_g;

    abstract void setBytes(byte obfuscationGuard, byte[] bytes);

    final static RgbSprite[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= -23) {
          return BattleCharacter.a(param3, 1, param4, 1, 3, param1, -1, 1, param0);
        }
        ByteStorage.a(0, -20, (byte) -123, -41, 33);
        return BattleCharacter.a(param3, 1, param4, 1, 3, param1, -1, 1, param0);
    }

    public static void b(int param0) {
        if (param0 != 9892) {
          return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    abstract byte[] getBytes(int startOffset);

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_7_0 = null;
          String stackIn_13_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (lj.a("getcookies", (byte) 114, param1));
              var5 = dj.a(-111, ';', var4);
              for (var6 = param0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (TurnTimerDial.field_b == null) {
              stackIn_15_0 = param1.getParameter("settings");
              return stackIn_15_0;
            }
            stackIn_13_0 = TurnTimerDial.field_b;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("mg.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Accept invitation to <%0>'s game";
        field_c = "Most health lost";
        field_f = -1;
        field_g = 0;
        field_a = "You need to play <%0> more rated games to unlock this option.";
    }
}
