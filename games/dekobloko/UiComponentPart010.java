/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart010 extends ComponentDecorator {
    int integerState0187;
    static NodeDeque nodeDequeState0008;
    static PacketBuffer packetBufferState0004;
    static RgbSprite[] rgbSpriteArrayState0010;
    static int[] integerArrayState0039;
    static int integerState0188;
    static String[] stringArrayState0012;
    static String stringState0150;
    static int integerState0189;

    public static void performAction0458(int integerArgument1) {
        stringArrayState0012 = null;
        stringState0150 = null;
        integerArrayState0039 = null;
        nodeDequeState0008 = null;
        if (integerArgument1 != 0) {
          return;
        }
        rgbSpriteArrayState0010 = null;
        packetBufferState0004 = null;
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RgbSprite rgbSpriteLocal1;
        RgbSprite rgbSpriteLocal2;
        if (integerArgument2 <= -103) {
          if (0 != integerArgument3) {
            return;
          }
          if (null == this.uiComponentState0002) {
            return;
          }
          if (this.integerState0187 == 0) {
            return;
          }
          if (this.integerState0187 == 256) {
            this.uiComponentState0002.performAction0175(integerArgument1 + this.integerState0110, -128, integerArgument3, this.integerState0104 + integerArgument4);
            return;
          }
          rgbSpriteLocal2 = new RgbSprite(this.uiComponentState0002.integerState0107, this.uiComponentState0002.integerState0108);
          RenderingSupport015.performAction1778(true, rgbSpriteLocal2);
          this.uiComponentState0002.performAction0175(0, -107, integerArgument3, 0);
          MixedSupport086.performAction1200((byte) -5);
          rgbSpriteLocal2.performAction0301(integerArgument1 + this.integerState0110, integerArgument4 + this.integerState0104, this.integerState0187);
          return;
        }
        UiComponentPart010.performAction0457((byte) -51);
        if (0 != integerArgument3) {
          return;
        }
        if (null == this.uiComponentState0002) {
          return;
        }
        if (this.integerState0187 == 0) {
          return;
        }
        if (this.integerState0187 == 256) {
          this.uiComponentState0002.performAction0175(integerArgument1 + this.integerState0110, -128, integerArgument3, this.integerState0104 + integerArgument4);
          return;
        }
        rgbSpriteLocal1 = new RgbSprite(this.uiComponentState0002.integerState0107, this.uiComponentState0002.integerState0108);
        RenderingSupport015.performAction1778(true, rgbSpriteLocal1);
        this.uiComponentState0002.performAction0175(0, -107, integerArgument3, 0);
        MixedSupport086.performAction1200((byte) -5);
        rgbSpriteLocal1.performAction0301(integerArgument1 + this.integerState0110, integerArgument4 + this.integerState0104, this.integerState0187);
        return;
    }

    UiComponentPart010(UiComponent uiComponentArgument1) {
        super(uiComponentArgument1.integerState0110, uiComponentArgument1.integerState0104, uiComponentArgument1.integerState0107, uiComponentArgument1.integerState0108, (CallbackContract004) null, (CallbackContract006) null);
        try {
          uiComponentArgument1.performAction0241(this.integerState0108, this.integerState0107, 0, 0, -16555);
          this.integerState0187 = 256;
          this.uiComponentState0002 = uiComponentArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ef.<init>(" + (uiComponentArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    public UiComponentPart010() {
        super(0, 0, 0, 0, (CallbackContract004) null, (CallbackContract006) null);
        this.integerState0187 = 256;
    }

    final static void performAction0457(byte byteArgument1) {
        if (MixedSupport003.integerState0017 != MixedSupport080.framebufferState0001.integerState0191) {
          GameSession.integerState0618 = GameSession.integerState0618 + (MixedSupport080.framebufferState0001.integerState0191 - MixedSupport003.integerState0017);
          MixedSupport003.integerState0017 = MixedSupport080.framebufferState0001.integerState0191;
          if (!(0 >= UiComponentPart003.integerState0073)) {
            UiComponentPart003.integerState0073 = UiComponentPart003.integerState0073 - 1;
          }
          if (!(UiComponentPart003.integerState0073 <= 0)) {
            MixedSupport099.performAction1379((byte) -100);
          }
          if (byteArgument1 < 51) {
            UiComponentPart010.performAction0458(-58);
            return;
          }
          return;
        }
        if (!(0 >= UiComponentPart003.integerState0073)) {
          UiComponentPart003.integerState0073 = UiComponentPart003.integerState0073 - 1;
        }
        if (!(UiComponentPart003.integerState0073 <= 0)) {
          MixedSupport099.performAction1379((byte) -100);
        }
        if (byteArgument1 >= 51) {
          return;
        }
        UiComponentPart010.performAction0458(-58);
    }

    static {
        nodeDequeState0008 = new NodeDeque();
    }
}
