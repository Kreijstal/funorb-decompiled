/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReverbFeedback extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue(ComponentAttachmentPlan.field_b);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ugb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int getChatMessageColor(int param0, ChatMessage param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = VoidHunters.field_G;
        try {
          var2_int = CarouselConstantRequests.field_a;
          if (param1.channelType != param0) {
            if (param1.channelType == 4) {
              var2_intLifetime1 = SetLaserEnergyUsed.field_p[param1.channelType];
            } else {
              if (param1.senderKey == BodyInZoneConditionFactory.field_a) {
                var2_intLifetime1 = ConsoleCommand.field_m[param1.channelType];
              } else {
                var2_intLifetime1 = SetLaserEnergyUsed.field_p[param1.channelType];
              }
            }
          } else {
            if (param1.unfiltered) {
              var2_intLifetime1 = CarouselConstantRequests.field_a;
            } else {
              if (0 == param1.field_f &&
                param1.field_h == 0) {
                var2_intLifetime1 = ConsoleCommand.field_m[param1.channelType];
              } else {
                var2_intLifetime1 = SetLaserEnergyUsed.field_p[param1.channelType];
              }
            }
          }
          stackIn_14_0 = var2_intLifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ugb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    GetReverbFeedback(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
