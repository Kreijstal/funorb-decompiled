/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareBufferSet extends RenderBufferSet {
    private IndexBufferReference field_g;
    private int field_e;
    static String musicText;
    static int accountPacketLength;
    private int field_c;
    static int field_j;
    private VertexBufferReference field_i;
    private VertexBufferReference field_k;
    private VertexBufferReference field_f;
    private VertexBufferReference field_l;

    final void close(byte guard) {
        int var2;
        int var2Lifetime1;
        if (null != this.field_i) {
          this.field_i.close(16711680);
        }
        if (this.field_k == null) {
          if (this.field_l == null) {
            var2 = -105 % ((-65 - guard) / 56);
            if (this.field_f != null) {
              this.field_f.close(16711680);
            }
            if (this.field_g == null) {
              return;
            }
            this.field_g.close(-1);
            return;
          }
          this.field_l.close(16711680);
        } else {
          this.field_k.close(16711680);
          if (this.field_l != null) {
            this.field_l.close(16711680);
          }
        }
        var2Lifetime1 = -105 % ((-65 - guard) / 56);
        if (this.field_f != null) {
          this.field_f.close(16711680);
        }
        if (this.field_g == null) {
          return;
        }
        this.field_g.close(-1);
    }

    HardwareBufferSet(HardwareGraphicsToolkit param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.field_c = param2;
          this.field_e = param1;
          if (param3 ||
            ContentTransitionPhase.hasFlag2048(this.field_e, (byte) -97, this.field_c)) {
            this.field_i = new VertexBufferReference(IntrusiveNodeHashTable.hasFlag2048AndMask55(false, this.field_e, this.field_c));
          }
          if (param3 ||
            ArchiveIndex.hasFlag2048(this.field_c, this.field_e, 37)) {
            this.field_k = new VertexBufferReference(DroneWaveDefinition.hasDisabledMeshFeatureAndFlag2048(this.field_c, this.field_e, (byte) -50));
          }
          if (param3 ||
            BeveledCheckboxRenderer.hasFlag2048(this.field_e, 13836, this.field_c)) {
            this.field_l = new VertexBufferReference(LoginCredentials.hasFlag2048AndConditionalMasks(31, this.field_e, this.field_c));
          }
          if (param3 ||
            EmailAvailabilityRequest.hasFlag2048AndOtherMask55(this.field_e, (byte) -113, this.field_c)) {
            this.field_f = new VertexBufferReference(PerlinNoise2D.hasFlag2048AndOtherMask55WithExtraBits(this.field_c, this.field_e, 30643));
          }
          if (!param3 &&
            !TextureTransformMode.hasFlag2048(this.field_c, -2626, this.field_e)) {
            return;
          }
          this.field_g = new IndexBufferReference(ValidatedTextInputWidget.hasAllMask2064(this.field_e, this.field_c, -126));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("gu.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        musicText = null;
        if (!param0) {
          HardwareBufferSet.releaseStatics(true);
        }
    }

    static {
        musicText = "Music: ";
    }
}
