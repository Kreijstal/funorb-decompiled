/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelMetadata extends IntrusiveNode {
    String numberLabel;
    int attributeByte;
    static int field_m;
    int levelId;
    int resourceIndex;
    String title;
    int attributeWord;
    static boolean field_p;
    static String archiveHost;

    public static void a(byte param0) {
        archiveHost = null;
        if (param0 <= 90) {
          LevelMetadata.a((byte) -14);
        }
    }

    final void readMetadata(int obfuscationGuard, PacketBuffer packet) {
        try {
          if (obfuscationGuard != -12988) {
            this.attributeWord = -16;
          }
          this.levelId = packet.readUnsignedShort(obfuscationGuard ^ -52668);
          this.numberLabel = KeyboardInput.a(false, 1 + this.levelId);
          this.resourceIndex = packet.readInt(255);
          this.attributeByte = packet.readUnsignedByte(255);
          this.attributeWord = packet.readInt(obfuscationGuard ^ -12869);
          this.title = packet.readLegacyUtf8String((byte) 24);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wk.B(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    LevelMetadata() {
    }

    static {
    }
}
