/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends IntrusiveNode {
    int field_l;
    static QuickChatCommandDefinition field_v;
    int field_s;
    int field_m;
    int field_w;
    int field_r;
    static String field_x;
    static tu field_n;
    static RgbSprite field_o;
    int field_u;
    static int keyCode;
    static int field_k;
    static RgbSprite[] field_p;
    static int outgoingChatChannel;

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = (var3 << 5) - var3 + kw.a(param1.charAt(var4), 100);
          }
          if (param0 == -116) {
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          stackIn_6_0 = 20;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("rs.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean isAccountNameSeparator(char character, byte obfuscationGuard) {
        boolean stackIn_9_0 = false;
        if (obfuscationGuard > -11) {
          return true;
        }
        stackIn_9_0 = (character == 160) || (character == 32) || (character == 95) || (character == 45);
        return stackIn_9_0;
    }

    public static void a(byte param0) {
        field_v = null;
        field_x = null;
        field_p = null;
        field_o = null;
        int var1 = 39 % ((param0 + 61) / 51);
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RgbSprite var5 = null;
        if (!cu.field_a) {
          return;
        }
        if (param0 != 26449) {
          return;
        }
        int var4 = CampaignMenuEntry.field_u[param2];
        if (7 == var4 &&
          5 == (ConsoleExpression.field_p[param2] + param2 & 5)) {
          var5 = tn.activeFoliageShadows[6 + ConsoleExpression.field_p[param2] % 8];
          fe.a(var5, -10 + param1, -30 + param3);
        }
    }

    final static int nextPowerOfTwo(byte obfuscationGuard, int value) {
        value--;
        value = value | value >>> 1;
        value = value | value >>> 2;
        value = value | value >>> 4;
        if (obfuscationGuard < 75) {
          field_o = (RgbSprite) null;
        }
        value = value | value >>> 8;
        value = value | value >>> 16;
        return value + 1;
    }

    private rs() throws Throwable {
        throw new Error();
    }

    static {
        field_v = new QuickChatCommandDefinition(14, 0, 4, 1);
        field_k = 640;
        field_x = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        outgoingChatChannel = 0;
    }
}
