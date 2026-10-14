/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kp {
    static NodeDeque achievementNotifications;
    static TextFont field_b;
    static RgbSprite[] field_e;
    static int field_a;
    static Vector field_d;

    final static void sendLevelResult(int opcode, byte obfuscationGuard, LevelResultSubmission result) {
        BitPacketBuffer packet = null;
        int payloadStart = 0;
        try {
          packet = TextFieldValidator.outgoingPackets;
          int var4 = 107 / ((44 - obfuscationGuard) / 45);
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          payloadStart = packet.position;
          packet.writeByte(-117, 1);
          packet.writeByte(-99, result.packId);
          packet.writeSignedSmart(result.levelIndex, (byte) 117);
          packet.writeInt(result.resultWordOne, (byte) -79);
          packet.writeInt(result.resultWordTwo, (byte) -79);
          packet.writeInt(result.resultWordThree, (byte) -79);
          packet.writeInt(result.resultWordFour, (byte) -79);
          packet.appendCrc32(3, payloadStart);
          packet.backfillByteLength((byte) 124, -payloadStart + packet.position);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kp.B(" + opcode + ',' + obfuscationGuard + ',' + (result != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 10 % ((param0 + 8) / 43);
        achievementNotifications = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        achievementNotifications = new NodeDeque();
    }
}
