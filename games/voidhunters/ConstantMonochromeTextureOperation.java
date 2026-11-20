/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConstantMonochromeTextureOperation extends TextureOperation {
    static int fontJustificationStep;
    static String field_k;
    private int value;

    public static void clearSharedReferences(byte param0) {
        field_k = null;
        if (param0 > -80) {
          field_k = (String) null;
        }
    }

    final static ClientDataReadRequest requestClientData(boolean param0, int param1) {
        ClientDataReadRequest var2 = new ClientDataReadRequest();
        if (param0) {
          GetBoostersActiveTime.pendingClientDataReads.addLast(-10258, var2);
          MatchResultsFactory.sendClientDataRead(param1, 22681);
          return var2;
        }
        return (ClientDataReadRequest) null;
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        if (!param1) {
          return (int[]) null;
        }
        int[] var4 = this.field_f.getRow((byte) 117, param0);
        int[] var3 = var4;
        if (!this.field_f.field_e) {
          return var4;
        }
        ArrayOperations.fill(var4, 0, TextHotspotRegion.textureWidth, this.value);
        return var4;
    }

    private ConstantMonochromeTextureOperation(int param0) {
        super(0, true);
        this.value = 4096;
        this.value = param0;
    }

    public ConstantMonochromeTextureOperation() {
        this(4096);
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -60) {
            ConstantMonochromeTextureOperation.clearSharedReferences((byte) 48);
          }
          var4_int = param0;
          if (0 != var4_int) {
            return;
          }
          this.value = (param2.readUnsignedByte((byte) -115) << 12) / 255;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("drb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        fontJustificationStep = 0;
        field_k = "Loading graphics";
    }
}
