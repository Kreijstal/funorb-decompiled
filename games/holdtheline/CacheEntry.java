/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheEntry extends DualLinkNode {
    static QuickChatDynamicCommand field_p;
    int field_o;

    final static void a(int param0, String param1, float param2) {
        DelayedServerPacket.field_m = param1;
        if (param0 < 79) {
          return;
        }
        try {
          nj.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_p = null;
        int var1 = -28 / ((44 - param0) / 47);
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -53) {
            field_p = (QuickChatDynamicCommand) null;
          }
          stackIn_3_0 = ae.a(param1, (byte) -44, param1.length, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static LoginMethodPreference a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethodPreference[] var3 = null;
        LoginMethodPreference var5 = null;
        int var6 = 0;
        LoginMethodPreference stackIn_4_0 = null;
        LoginMethodPreference stackIn_12_0 = null;
        LoginMethodPreference stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var2 = ph.a("jagex-last-login-method", (byte) 30, param0);
          if (var2 == null) {
            stackIn_4_0 = EmailAddressValidator.field_n;
            return stackIn_4_0;
          }
          if (param1 != 124) {
            field_p = (QuickChatDynamicCommand) null;
          }
          var3 = ko.a(84);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.matchesLoginMethod(param1 ^ 37, var2)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = EmailAddressValidator.field_n;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("jj.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean isSoftReference(int param0);

    abstract Object getValue(byte param0);

    CacheEntry(int param0) {
        this.field_o = param0;
    }

    static {
        field_p = new QuickChatDynamicCommand(2, 4, 4, 0);
    }
}
