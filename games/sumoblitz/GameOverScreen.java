/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameOverScreen extends MenuScreen {
    final void update(int param0) {
        super.update(param0);
    }

    public GameOverScreen() {
        super(11);
    }

    final void render(int opacity, GraphicsToolkit toolkit, int guard) {
        try {
          DelegatingCanvas.drawToolkitNineSlice(IntroMeshProjection.field_c, 360, -5, -16777216, 3, toolkit, 650, 50, 1, true);
          ForceFieldRingEffect.field_t.drawCenteredText(TextureGeneratorNode.defeatText, opacity << 24 | 5023231, -1, 105, 320, 0);
          AccountStatusDialogState.headingFont.drawCenteredText(TextureGeneratorNode.defeatText, -1, -1, 105, 320, 0);
          QueuedIntArrayRequest.field_k.drawWrappedText(100, 5023231 | opacity << 24, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 90, -1, 0, 0, -8787, AchievementThresholds.scoreText.toUpperCase() + " " + FadingWidget.score + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + UiStyleNode.formatGameTime(Js5ClientState.field_a, -23620), (SpriteMask) null, 1, 1);
          GameTrackPlayback.field_a.drawWrappedText(100, -1, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 90, -1, 0, 0, -8787, AchievementThresholds.scoreText.toUpperCase() + " " + FadingWidget.score + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + UiStyleNode.formatGameTime(Js5ClientState.field_a, guard - 21265), (SpriteMask) null, 1, 1);
          super.render(opacity, toolkit, guard);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lp.B(" + opacity + ',' + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void advanceComboTimeout(boolean guard) {
        if (!guard) {
          GameOverScreen.advanceComboTimeout(true);
          if (CacheReferenceNode.comboTimeout <= 0) {
            if (0 != CacheReferenceNode.comboTimeout) {
              return;
            }
            FourIntReadRequest.scoreMultiplier = ScoreMultiplierTable.multipliers[0];
            ComboState.comboCount = 0;
            return;
          }
          CacheReferenceNode.comboTimeout = CacheReferenceNode.comboTimeout - 1;
          if (0 == CacheReferenceNode.comboTimeout) {
            FourIntReadRequest.scoreMultiplier = ScoreMultiplierTable.multipliers[0];
            ComboState.comboCount = 0;
            return;
          }
          return;
        }
        if (CacheReferenceNode.comboTimeout > 0) {
          CacheReferenceNode.comboTimeout = CacheReferenceNode.comboTimeout - 1;
          if (0 != CacheReferenceNode.comboTimeout) {
            return;
          }
          FourIntReadRequest.scoreMultiplier = ScoreMultiplierTable.multipliers[0];
          ComboState.comboCount = 0;
          return;
        }
        if (0 != CacheReferenceNode.comboTimeout) {
          return;
        }
        FourIntReadRequest.scoreMultiplier = ScoreMultiplierTable.multipliers[0];
        ComboState.comboCount = 0;
    }

    static {
    }
}
