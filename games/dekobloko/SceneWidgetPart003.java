/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart003 extends SceneWidget {
    private SceneWidget sceneWidgetState0043;
    static RawSound[] rawSoundArrayState0001;
    private SceneWidget sceneWidgetState0044;

    SceneWidgetPart003(long longArgument1, RgbSprite rgbSpriteArgument2, RgbSprite rgbSpriteArgument3, int integerArgument4, SceneWidget sceneWidgetArgument5, String stringArgument6) {
        this(longArgument1, (SceneWidget) null, sceneWidgetArgument5, stringArgument6);
        try {
          this.sceneWidgetState0044.rgbSpriteState0070 = rgbSpriteArgument3;
          this.sceneWidgetState0044.rgbSpriteState0069 = rgbSpriteArgument2;
          this.sceneWidgetState0044.integerState0885 = integerArgument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ha.<init>(" + longArgument1 + ',' + (rgbSpriteArgument2 != null ? "{...}" : "null") + ',' + (rgbSpriteArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + (sceneWidgetArgument5 != null ? "{...}" : "null") + ',' + (stringArgument6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction0677(int integerArgument1) {
        if (integerArgument1 != 3) {
          return;
        }
        rawSoundArrayState0001 = null;
    }

    final static void performAction0676(int integerArgument1) {
        MixedSupport022.uiComponentPart031State0001 = new UiComponentPart031();
        if (integerArgument1 != 0) {
          return;
        }
        UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport022.uiComponentPart031State0001, (byte) 62);
    }

    final int computeInteger0674(int integerArgument1, int integerArgument2) {
        if (integerArgument2 == -4168) {
          return integerArgument1 + (this.sceneWidgetState0044.computeInteger2000(true) + this.sceneWidgetState0043.computeInteger2000(true));
        }
        SceneWidgetPart003.performAction0677(-106);
        return integerArgument1 + (this.sceneWidgetState0044.computeInteger2000(true) + this.sceneWidgetState0043.computeInteger2000(true));
    }

    final void performAction0673(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        this.performAction1994(integerArgument1, 0, integerArgument3, integerArgument6, integerArgument4);
        this.performAction0675(integerArgument5, integerArgument2 ^ integerArgument2);
    }

    private final void performAction0675(int integerArgument1, int integerArgument2) {
        this.sceneWidgetState0044.performAction1994(this.sceneWidgetState0044.computeInteger2000(true), integerArgument2, 0, this.integerState0915, 0);
        int integerLocal1 = this.sceneWidgetState0044.integerState0896 + integerArgument1;
        this.sceneWidgetState0043.performAction1994(this.integerState0896 - integerLocal1, 0, 0, this.integerState0915, integerLocal1);
    }

    private SceneWidgetPart003(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, String stringArgument4) {
        super(longArgument1, (SceneWidget) null);
        try {
          this.sceneWidgetState0044 = new SceneWidget(0L, sceneWidgetArgument2);
          this.sceneWidgetState0043 = new SceneWidget(0L, sceneWidgetArgument3);
          this.sceneWidgetState0043.stringState0598 = stringArgument4;
          this.performAction1998(this.sceneWidgetState0044, -16834);
          this.performAction1998(this.sceneWidgetState0043, -16834);
          this.performAction2004(-126);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ha.<init>(" + longArgument1 + ',' + (sceneWidgetArgument2 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument3 != null ? "{...}" : "null") + ',' + (stringArgument4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0672(int integerArgument1, byte byteArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3;
        if (0 != (7 & integerArgument1)) {
          integerLocal2 = 8 - (integerArgument1 & 7);
        }
        if (byteArgument2 == -126) {
          integerLocal1 = integerArgument1 + integerLocal2;
          return integerLocal1;
        }
        SceneWidgetPart003.computeInteger0672(-69, (byte) 62);
        integerLocal3 = integerArgument1 + integerLocal2;
        return integerLocal3;
    }

    SceneWidgetPart003(long longArgument1, SceneWidgetPart003 sceneWidgetPart003Argument2, String stringArgument3) {
        this(longArgument1, sceneWidgetPart003Argument2.sceneWidgetState0044, sceneWidgetPart003Argument2.sceneWidgetState0043, stringArgument3);
    }

    static {
        rawSoundArrayState0001 = new RawSound[3];
    }
}
