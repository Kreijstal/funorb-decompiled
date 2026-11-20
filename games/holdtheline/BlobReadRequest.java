/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlobReadRequest extends IntrusiveNode {
    static RotatedSpriteAsset field_k;
    static int field_n;
    byte[] payload;
    static int field_j;
    static SpriteAsset field_i;
    boolean completed;

    final static ArchiveKeyRequest requestArchiveKey(int param0, int param1, int param2, int param3) {
        ArchiveKeyRequest var4 = new ArchiveKeyRequest();
        var4.category = param0;
        var4.id = param3;
        TutorialPage.field_a.addLast((byte) -94, var4);
        if (param1 == 31043) {
          WidgetContainer.sendArchiveKeyRequest(3, param2, var4);
          return var4;
        }
        field_j = -119;
        WidgetContainer.sendArchiveKeyRequest(3, param2, var4);
        return var4;
    }

    BlobReadRequest() {
    }

    public static void clearSharedReferences(byte param0) {
        field_i = null;
        field_k = null;
        if (param0 <= 67) {
          field_k = (RotatedSpriteAsset) null;
        }
    }

    static {
    }
}
