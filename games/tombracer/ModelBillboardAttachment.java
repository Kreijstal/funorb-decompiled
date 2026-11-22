/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelBillboardAttachment {
    int field_b;
    int definitionId;
    int field_c;
    int faceIndex;

    final ModelBillboardAttachment withFaceIndex(int param0, int param1) {
        if (param0 != 9677) {
          return (ModelBillboardAttachment) null;
        }
        return new ModelBillboardAttachment(this.definitionId, param1, this.field_b, this.field_c);
    }

    ModelBillboardAttachment(int param0, int param1, int param2, int param3) {
        this.field_b = param2;
        this.faceIndex = param1;
        this.definitionId = param0;
        this.field_c = param3;
    }

    static {
    }
}
