/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPlayerRepairAmount extends ConsoleCommand {
    static Widget field_q;
    static String field_o;
    static String field_p;

    SetPlayerRepairAmount(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void e(int param0) {
        if (GetAngularForceDownshift.field_p != SetClientSideDragging.field_q.height) {
          GetPhasedEnergyBeamProjectiles.field_o = GetPhasedEnergyBeamProjectiles.field_o + (SetClientSideDragging.field_q.height - GetAngularForceDownshift.field_p);
          GetAngularForceDownshift.field_p = SetClientSideDragging.field_q.height;
          if (param0 > ~SocialPanelState.chatPanelProgress) {
            SocialPanelState.chatPanelProgress = SocialPanelState.chatPanelProgress - 1;
            if (!(SocialPanelState.chatPanelProgress <= 0)) {
              SoftwareFaceAttachmentState.updateAnimatedPanelLayout((byte) -31);
            }
            return;
          }
          if (!(SocialPanelState.chatPanelProgress <= 0)) {
            SoftwareFaceAttachmentState.updateAnimatedPanelLayout((byte) -31);
          }
          return;
        }
        if (param0 <= ~SocialPanelState.chatPanelProgress) {
          if (!(SocialPanelState.chatPanelProgress <= 0)) {
            SoftwareFaceAttachmentState.updateAnimatedPanelLayout((byte) -31);
          }
          return;
        }
        SocialPanelState.chatPanelProgress = SocialPanelState.chatPanelProgress - 1;
        if (!(SocialPanelState.chatPanelProgress <= 0)) {
          SoftwareFaceAttachmentState.updateAnimatedPanelLayout((byte) -31);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            SetPlayerRepairAmount.e(-68);
          }
          SetMachineGunEnergyUsed.submitSettingsChange(227, 62, arguments[0].intValue(12));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vj.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_q = null;
        int var1 = -29 / ((param0 + 16) / 58);
        field_p = null;
    }

    static {
        field_o = "Fighter bay";
        field_p = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
