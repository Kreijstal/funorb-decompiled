/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseCache {
    static String field_e;
    private ResourceArchive field_d;
    private WeightedLruCache field_c;
    static String field_b;
    private ResourceArchive field_a;

    final QuickChatPhraseDefinition getPhrase(int param0, int param1) {
        byte[] var4 = null;
        QuickChatPhraseDefinition var3 = (QuickChatPhraseDefinition) (this.field_c.get((long)param0, -113));
        if (var3 != null) {
          return var3;
        }
        if (32768 > param0) {
          var4 = this.field_a.getFile(1, true, param0);
        } else {
          var4 = this.field_d.getFile(1, true, param0 & 32767);
        }
        if (param1 != 1) {
          return (QuickChatPhraseDefinition) null;
        }
        var3 = new QuickChatPhraseDefinition();
        if (var4 != null) {
          var3.decode(120, new PacketBuffer(var4));
        }
        if (param0 < 32768) {
          this.field_c.put((long)param0, var3, false);
          return var3;
        }
        var3.markExtendedLinks(-111);
        this.field_c.put((long)param0, var3, false);
        return var3;
    }

    public static void clearSharedReferences(byte param0) {
        field_e = null;
        int var1 = -98 % ((param0 - 29) / 59);
        field_b = null;
    }

    final static void readAccountStatusAcknowledgement(int param0) {
        ArchiveCatalog.field_h = false;
        if (param0 >= -2) {
          QuickChatPhraseCache.readAccountStatusAcknowledgement(-88);
          RoadStripRenderer.field_e.readUnsignedByte((byte) -55);
          return;
        }
        RoadStripRenderer.field_e.readUnsignedByte((byte) -55);
    }

    private QuickChatPhraseCache() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Please wait...";
    }
}
