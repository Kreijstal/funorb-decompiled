/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMachineGunFireForce extends ConsoleCommand {
    static String field_q;
    static int[][] logoMeshCenters;
    static String field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(103, 62, arguments[0].intValue(96));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("raa.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMachineGunFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static AccountRequestText e(int param0) {
        int var2 = -9 % ((param0 + 52) / 62);
        String var1 = LoadBlackboxRecording.a(87);
        if (var1 == null) {
          return new AccountRequestText(LoadBlackboxRecording.a(94), GetMissileLauncherRandomness.isAccountRequestPending(-3840));
        }
        if (var1.indexOf('@') >= 0) {
          var1 = "";
          return new AccountRequestText(LoadBlackboxRecording.a(94), GetMissileLauncherRandomness.isAccountRequestPending(-3840));
        }
        return new AccountRequestText(LoadBlackboxRecording.a(94), GetMissileLauncherRandomness.isAccountRequestPending(-3840));
    }

    final static void drawDebugArrows(byte param0, Camera2D param1) {
        WorldDebugArrow var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (null == SocketConnector.debugArrows) {
            return;
          }
          var2 = (WorldDebugArrow) (SocketConnector.debugArrows.first(0));
          while (var2 != null) {
            AccountCreationDialog.drawWorldArrow(var2.endY, (byte) 83, var2.startX, var2.endX, var2.startY, 16711935, param1);
            var2 = (WorldDebugArrow) (SocketConnector.debugArrows.next((byte) 108));
          }
          if (param0 == -99) {
            return;
          }
          logoMeshCenters = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("raa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 0) {
          return;
        }
        field_q = null;
        logoMeshCenters = (int[][]) null;
    }

    static {
        field_o = "Spawn <%0>";
        field_q = "Auto-respond to <%0>";
    }
}
