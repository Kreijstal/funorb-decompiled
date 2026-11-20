/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiToggleButton extends UiFocusableComponent {
    static String field_B;

    final void fireAction(int param0, int param1, int param2, int param3) {
        this.active = !this.active ? true : false;
        super.fireAction(param0, param1, param2, param3);
    }

    private UiToggleButton(String param0, UiRenderer param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.renderer = GetDebrisMax.field_s.field_d;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 77 % ((param0 + 87) / 33);
        field_B = null;
    }

    private UiToggleButton(String param0, UiListener param1) {
        this(param0, GetDebrisMax.field_s.field_a, param1);
        try {
          this.renderer = GetDebrisMax.field_s.field_d;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ClientDataWriteRequest submitClientData(byte[] param0, byte param1, int param2) {
        ClientDataWriteRequest var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ClientDataWriteRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ClientDataWriteRequest(param0);
          var4 = -111 / ((param1 + 2) / 45);
          SetGrapplingHookAimarc.pendingClientDataWrites.addLast(-10258, var3);
          OpenGlRenderbuffer.sendClientDataWrite((byte) -61, var3, param2);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("jla.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    UiToggleButton(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.active = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_B = "<%0> is not a member, and cannot play with the current options.";
    }
}
