/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentNoteMask extends IntrusiveNode {
    static BufferedSocket field_n;
    static String typeYourPasswordAgainText;
    static String timeText;
    byte[] notes;
    static String createAFreeAccountText;

    public static void releaseStatics(byte param0) {
        typeYourPasswordAgainText = null;
        createAFreeAccountText = null;
        int var1 = 87 / ((87 - param0) / 33);
        field_n = null;
        timeText = null;
    }

    final static Sprite c(byte param0) {
        int var4_int = 0;
        Sprite var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        int var1 = vg.field_k[0] * ScrollViewport.field_B[0];
        byte[] var2 = TextLayout.field_d[0];
        int[] var3 = new int[var1];
        Sprite var4Lifetime1;
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = LegacyOpenGlEffectManager.field_l[eb.a(255, (int) var2[var4_int])];
        }
        if (param0 == -8) {
          var4 = new Sprite(vf.field_d, ToolkitImageProducerBuffer.field_u, er.field_h[0], StrongCacheReference.field_C[0], vg.field_k[0], ScrollViewport.field_B[0], var3);
          PowerupPickup.releaseSpriteDecoderArrays((byte) -59);
          return var4;
        }
        InstrumentNoteMask.c((byte) -8);
        var4Lifetime1 = new Sprite(vf.field_d, ToolkitImageProducerBuffer.field_u, er.field_h[0], StrongCacheReference.field_C[0], vg.field_k[0], ScrollViewport.field_B[0], var3);
        PowerupPickup.releaseSpriteDecoderArrays((byte) -59);
        return var4Lifetime1;
    }

    InstrumentNoteMask(byte[] param0) {
        try {
          this.notes = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        timeText = "time: ";
        typeYourPasswordAgainText = "Type your password again to make sure it's correct";
        createAFreeAccountText = "Create a free account to start using this feature";
    }
}
