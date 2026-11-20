/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetLaserRandomness extends ConsoleCommand {
    static int[] field_r;
    static int field_p;
    static int field_q;
    static int field_o;

    SetLaserRandomness(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            SetLaserRandomness.sortAndLimitScoreIndices((byte) -45, -12);
          }
          SetMachineGunEnergyUsed.a(74, 62, arguments[0].intValue(118));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qea.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_r = null;
        if (!param0) {
          SetLaserRandomness.updateChatInputDialog(-19, -41, true, 117, -123, 114, 51);
        }
    }

    final static void sortAndLimitScoreIndices(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (param0 != -29) {
            field_r = (int[]) null;
          }
          PlayerContextMenu.sortScoreIndices(0, WeaponBehaviourFactory.field_b, MissionBuilder.field_e, true, param1, (byte) 24, Message.field_d);
          for (var2_int = 0; MissionBuilder.field_e > var2_int; var2_int++) {
            UnlitGpuMaterialEffect.field_f[var2_int + param1] = var2_int;
          }
          PlayerContextMenu.sortScoreIndices(param1, ShipAIFactory.field_a, MissionBuilder.field_e + param1, false, param1 + param1, (byte) 24, ServerTickFactory.field_d);
          if (MissionBuilder.field_e <= param1) {
            return;
          }
          MissionBuilder.field_e = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var2), "qea.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void updateChatInputDialog(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        int var8 = 105 / ((27 - param1) / 52);
        if (NetworkMessageState.chatChannel == 2) {
          var7 = GetReadyRoomTeamTime.field_o;
        } else {
          var7 = OpenGlByteTextureFactory.field_b;
        }
        VoidHunters.updateChatInputDialog(param4, param3, param6, param0, var7, param5, true, param2);
    }

    static {
        field_r = new int[16];
        field_q = 100;
        field_o = 0;
    }
}
