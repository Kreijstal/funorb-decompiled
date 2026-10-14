/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static int field_e;
    static int field_b;
    static int field_d;
    static String field_f;
    static int field_c;
    static boolean field_g;
    static boolean field_a;
    static String field_h;

    final static int a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = -1 + param1.length;
          while (true) {
            if (var2_int < 0) {
              if (!param0) {
                var4 = (int[]) null;
                ea.a(true, (int[]) null);
              }
              stackIn_12_0 = -1;
              return stackIn_12_0;
            }
            if (0 == param1[var2_int]) {
              var2_int--;
              continue;
            }
            break;
          }
          stackIn_7_0 = -1 + (ed.unsignedBitLength(9, param1[var2_int]) + (var2_int << 5));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ea.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -33) {
          field_h = (String) null;
          field_f = null;
          field_h = null;
          return;
        }
        field_f = null;
        field_h = null;
    }

    final static void requestUpdateGameOptions(int obfuscationGuard, int opcode) {
        int packedMode = 0;
        BitPacketBuffer packet = k.outgoingPackets;
        int packedModeAfterWrongGuard;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte(71, 5);
        packet.writeByte(obfuscationGuard ^ 10903, o.currentLobbyGame.maxPlayers);
        if (obfuscationGuard == -11008) {
          packedMode = o.currentLobbyGame.joinSortPriority + (o.currentLobbyGame.spectatorMode << 6);
          packet.writeByte(15, packedMode);
          packet.writeBytes(o.currentLobbyGame.settings, -1, 0, o.currentLobbyGame.settings.length);
          packet.backfillByteLength((byte) 118, -payloadStart + packet.position);
          return;
        }
        ea.requestUpdateGameOptions(109, -29);
        packedModeAfterWrongGuard = o.currentLobbyGame.joinSortPriority + (o.currentLobbyGame.spectatorMode << 6);
        packet.writeByte(15, packedModeAfterWrongGuard);
        packet.writeBytes(o.currentLobbyGame.settings, -1, 0, o.currentLobbyGame.settings.length);
        packet.backfillByteLength((byte) 118, -payloadStart + packet.position);
    }

    final static java.awt.Container b(int param0) {
        if (param0 != 0) {
          field_g = true;
          if (null == cb.field_o) {
            return (java.awt.Container) ((Object) uc.e((byte) -83));
          }
          return (java.awt.Container) ((Object) cb.field_o);
        }
        if (null == cb.field_o) {
          return (java.awt.Container) ((Object) uc.e((byte) -83));
        }
        return (java.awt.Container) ((Object) cb.field_o);
    }

    final static MouseWheelSource createMouseWheelSource(int obfuscationGuard) {
        try {
          Throwable var1 = null;
          MouseWheelSource stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (obfuscationGuard <= 59) {
              field_b = -61;
            }
            stackIn_3_0 = (MouseWheelSource) (Class.forName("MouseWheelInput").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = true;
        field_f = "Invite";
        field_d = 0;
        field_h = "You need a rating of <%1> to play with the current options.";
        field_a = true;
    }
}
