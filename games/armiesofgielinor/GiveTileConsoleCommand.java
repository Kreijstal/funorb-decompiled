/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GiveTileConsoleCommand extends ConsoleCommand {
    static boolean field_G;
    static String field_E;
    static String field_F;

    GiveTileConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue[] guardArguments = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -24872) {
            guardArguments = (ConsoleValue[]) null;
            this.execute(-63, (ConsoleValue[]) null);
          }
          result = new ConsoleValue(SoundPlaybackHandle.giveSelectedTileToPlayer(128, arguments[0].asInt(2)));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wt.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_E = null;
        field_F = null;
        if (param0 != 120) {
          field_G = false;
        }
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = -83 % ((-9 - param1) / 39);
          if (!AdaptiveMidiPcmStream.hasValidAccountNameShape(param0, 1, param2)) {
            return false;
          }
          for (var4 = 0; var4 < param0.length(); var4++) {
            if (!IterableDualNodeDeque.a(param0.charAt(var4), -3904)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wt.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3 = false;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        int stackIn_12_7;
        boolean stackIn_12_8;
        int stackIn_12_9;
        boolean stackIn_14_10 = false;
        int var3;
        DialogMessagePane.advanceLobbyNotifications(-117);
        if (ToggleWidget.currentRoom != null) {
          stackIn_6_0 = (r.c(ToggleWidget.currentRoom.playerCount, 2)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_8_0 = true;
        stackIn_8_1 = 65524;
        stackIn_8_2 = 15;
        stackIn_9_3 = (50 >= r.field_u) ? false : true;
        stackIn_12_4 = el.field_d;
        stackIn_12_5 = 65528;
        stackIn_12_6 = 14;
        stackIn_12_7 = 13;
        stackIn_12_8 = true;
        stackIn_12_9 = 11;
        stackIn_14_10 = (fj.field_c) || (ModalDialogHost.field_H);
        hb.a(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_9_3, stackIn_12_4, stackIn_12_5, stackIn_12_6, stackIn_12_7, stackIn_12_8, stackIn_12_9, stackIn_14_10, param1, var2 != 0, 0);
        if (cp.field_h) {
          EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 64);
          cp.field_h = false;
        }
        if (cg.field_a) {
          EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 10);
          cg.field_a = false;
        }
        if (ChatMessage.field_w) {
          MoveAttackAction.a(1, uh.field_a, true, (byte) 90, false);
          ChatMessage.field_w = false;
        }
        var3 = 121 / ((-20 - param0) / 45);
    }

    static {
        field_G = false;
        field_E = "Encouraging rule breaking";
        field_F = "Waiting for <%0> to start the game...";
    }
}
