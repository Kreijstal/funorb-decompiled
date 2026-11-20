/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReverbGain extends ConsoleCommand {
    static TextureFormat field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(SetMissileLauncherEnergyUsed.field_p);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qf.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetReverbGain(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void resendClientDataRequests(int param0, byte param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        ClientDataWriteRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = VoidHunters.field_G;
        try {
          var4 = (ClientDataWriteRequest) (SetGrapplingHookAimarc.pendingClientDataWrites.first(0));
          if (param1 != -52) {
            field_o = (TextureFormat) null;
          }
          while (var4 != null) {
            OpenGlRenderbuffer.sendClientDataWrite((byte) 88, var4, param0);
            var4 = (ClientDataWriteRequest) (SetGrapplingHookAimarc.pendingClientDataWrites.next((byte) 89));
          }
          var2 = GetBoostersActiveTime.pendingClientDataReads.first(0);
          while (var2 != null) {
            MatchResultsFactory.sendClientDataRead(param0, 22681);
            var2 = GetBoostersActiveTime.pendingClientDataReads.next((byte) 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var2_ref), "qf.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 < 26) {
          field_o = (TextureFormat) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    static {
        DebugRequestFactory discarded$0 = new DebugRequestFactory();
        field_o = new TextureFormat(1);
    }
}
