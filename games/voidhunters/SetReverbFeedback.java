/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetReverbFeedback extends ConsoleCommand {
    static PcmStreamMixer field_p;
    static int[] field_o;

    SetReverbFeedback(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean b(boolean param0) {
        boolean[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = TutorialProgressState.completedHints;
          var1 = var5;
          var2 = 0;
          while (true) {
            if (var5.length <= var2) {
              if (param0) {
                return true;
              }
              SetReverbFeedback.b(false);
              return true;
            }
            var3 = var5[var2] ? 1 : 0;
            if (var3 != 0) {
              var2++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref), "ji.D(" + param0 + ')');
        }
    }

    final static void e(int param0) {
        SoundPlayback var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        SoundPlayback var1Lifetime1;
        var2 = VoidHunters.field_G;
        try {
          if (param0 != 200) {
            return;
          }
          SetSelfDestructTimer.field_o.service();
          LobbyGameContextMenuBuilder.field_b.service();
          GetShieldsDirectionalRadius.field_o = GetShieldsDirectionalRadius.field_o - 1;
          if (GetShieldsDirectionalRadius.field_o == 0) {
            GetShieldsDirectionalRadius.field_o = 200;
            var1 = (SoundPlayback) (GetToggledScoreboard.field_p.first(0));
            while (var1 != null) {
              if (!var1.lifetimeNode.isLinked((byte) -63)) {
                var1.unlink(-3846);
              }
              var1 = (SoundPlayback) (GetToggledScoreboard.field_p.next((byte) 96));
            }
            if (GetSniperCannonReload.field_o != null) {
              var1Lifetime1 = (SoundPlayback) (GetSniperCannonReload.field_o.first(0));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.lifetimeNode.isLinked((byte) -63)) {
                  var1Lifetime1.unlink(-3846);
                }
                var1Lifetime1 = (SoundPlayback) (GetSniperCannonReload.field_o.next((byte) 47));
              }
            }
          }
          if (SetMassDriverRandomness.field_o != null) {
            stackIn_20_0 = SetMassDriverRandomness.field_o.isPlaying(-100);
            if (!stackIn_20_0) {
              Bzip2State.field_u = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref), "ji.B(" + param0 + ')');
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
          if (obfuscationGuard >= -119) {
            SetReverbFeedback.b(true);
          }
          ComponentAttachmentPlan.field_b = arguments[0].floatValue(0);
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ji.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 200) {
          return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        field_o = new int[8192];
    }
}
