/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareModel extends Model3D implements NativeResource {
    private NativeModelIntTriple[] nativeIntTriples;
    long nativeHandle;
    private NativeSoftwareHeap heap;
    private NativeModelIntValue[] nativeIntValues;
    private NativeSoftwareToolkit toolkit;

    protected final void finalize() {
        if (this.nativeHandle != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    final native void scale(int param0, int param1, int param2);

    final native int getMaxX();

    final native int getMinZ();

    private final native void initializeFromModelDataNative(NativeSoftwareToolkit param0, NativeSoftwareHeap param1, int param2, int param3, int[] param4, int[] param5, int[] param6, int[] param7, short[] param8, int param9, short[] param10, short[] param11, short[] param12, byte[] param13, byte[] param14, byte[] param15, byte[] param16, short[] param17, short[] param18, int[] param19, byte param20, short[] param21, int param22, byte[] param23, short[] param24, short[] param25, short[] param26, int[] param27, int[] param28, int[] param29, byte[] param30, byte[] param31, int[] param32, int[] param33, int[] param34, int[] param35, int param36, int param37, int param38, int param39, int param40, int param41, int[] param42);

    final native int getMaxZ();

    private final native void initializeNative(NativeSoftwareToolkit param0);

    public final native void disposeNative(boolean param0);

    final native void translate(int param0, int param1, int param2);

    final native int getMinX();

    NativeSoftwareModel(NativeSoftwareToolkit param0, NativeSoftwareHeap param1, ModelData param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        ModelFaceAttachment var18 = null;
        ModelFaceAttachment var21 = null;
        ModelFaceAttachmentDefinition var17 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        ModelFaceAttachment var19 = null;
        int incrementValue$11 = 0;
        int var12 = 0;
        int var15 = 0;
        int var15Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        this.toolkit = param0;
        this.heap = param1;
        this.nativeIntTriples = param2.nativeIntTriples;
        this.nativeIntValues = param2.nativeIntValues;
        int var8 = param2.nativeIntTriples == null ? 0 : param2.nativeIntTriples.length;
        int var9 = param2.nativeIntValues == null ? 0 : param2.nativeIntValues.length;
        int var10 = 0;
        int[] var24 = new int[var8 * 3 + var9];
        int[] var22 = var24;
        int[] var11 = var22;
        for (var12 = 0; var12 < var8; var12++) {
          incrementValue$0 = var10;
          var10++;
          var11[incrementValue$0] = this.nativeIntTriples[var12].firstValue;
          incrementValue$1 = var10;
          var10++;
          var11[incrementValue$1] = this.nativeIntTriples[var12].secondValue;
          incrementValue$2 = var10;
          var10++;
          var11[incrementValue$2] = this.nativeIntTriples[var12].thirdValue;
        }
        for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
          incrementValue$3 = var10;
          var10++;
          var11[incrementValue$3] = this.nativeIntValues[var12Lifetime1].value;
        }
        var12Lifetime2 = param2.faceAttachments == null ? 0 : param2.faceAttachments.length;
        int[] var25 = new int[var12Lifetime2 * 8];
        int[] var23 = var25;
        int[] var13 = var23;
        int var14 = 0;
        for (var15 = 0; var15 < var12Lifetime2; var15++) {
          var18 = param2.faceAttachments[var15];
          var21 = var18;
          var17 = GetBombletSprayAimspeed.getFaceAttachmentDefinition(var21.definitionId, 0);
          incrementValue$4 = var14;
          var14++;
          var13[incrementValue$4] = var18.faceIndex;
          incrementValue$5 = var14;
          var14++;
          var13[incrementValue$5] = var17.field_g;
          incrementValue$6 = var14;
          var14++;
          var13[incrementValue$6] = var17.field_b;
          incrementValue$7 = var14;
          var14++;
          var13[incrementValue$7] = var17.field_e;
          incrementValue$8 = var14;
          var14++;
          var13[incrementValue$8] = var17.field_d;
          incrementValue$9 = var14;
          var14++;
          var13[incrementValue$9] = var17.field_f;
          incrementValue$10 = var14;
          var14++;
          var13[incrementValue$10] = var17.field_a ? -1 : 0;
        }
        int var20 = 0;
        var15Lifetime1 = var20;
        while (var20 < var12Lifetime2) {
          var19 = param2.faceAttachments[var20];
          incrementValue$11 = var14;
          var14++;
          var13[incrementValue$11] = var19.label;
          var20++;
        }
        this.initializeFromModelDataNative(this.toolkit, this.heap, param2.field_s, param2.field_D, param2.vertexX, param2.vertexY, param2.vertexZ, param2.vertexLabels, param2.field_z, param2.faceCount, param2.faceVertexA, param2.faceVertexB, param2.faceVertexC, param2.field_E, param2.field_m, param2.field_r, param2.field_M, param2.field_b, param2.field_u, param2.faceLabels, param2.field_d, param2.field_w, param2.field_B, param2.field_e, param2.field_t, param2.field_i, param2.field_H, param2.field_F, param2.field_a, param2.field_C, param2.field_J, param2.field_n, param2.field_L, param2.field_f, param2.field_I, var24, var8, var9, param3, param4, param5, param6, var25);
    }

    NativeSoftwareModel(NativeSoftwareToolkit param0) {
        this.toolkit = param0;
        this.heap = null;
        this.initializeNative(param0);
    }
}
