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
          wo.a(up.field_c, 360, -5, -16777216, 3, toolkit, 650, 50, 1, true);
          ForceFieldRingEffect.field_t.a(tt.defeatText, opacity << 24 | 5023231, -1, 105, 320, 0);
          hc.field_e.a(tt.defeatText, -1, -1, 105, 320, 0);
          qv.field_k.a(100, 5023231 | opacity << 24, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 90, -1, 0, 0, -8787, ps.scoreText.toUpperCase() + " " + FadingWidget.score + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + dp.b(jk.field_a, -23620), (SpriteMask) null, 1, 1);
          uq.field_a.a(100, -1, 0, 200, 220, (int[]) null, (ToolkitSprite[]) null, 90, -1, 0, 0, -8787, ps.scoreText.toUpperCase() + " " + FadingWidget.score + "<br>" + InstrumentNoteMask.timeText.toUpperCase() + " " + dp.b(jk.field_a, guard - 21265), (SpriteMask) null, 1, 1);
          super.render(opacity, toolkit, guard);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lp.B(" + opacity + ',' + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          GameOverScreen.a(true);
          if (CacheReferenceNode.field_u <= 0) {
            if (0 != CacheReferenceNode.field_u) {
              return;
            }
            pd.field_p = un.field_a[0];
            nv.field_a = 0;
            return;
          }
          CacheReferenceNode.field_u = CacheReferenceNode.field_u - 1;
          if (0 == CacheReferenceNode.field_u) {
            pd.field_p = un.field_a[0];
            nv.field_a = 0;
            return;
          }
          return;
        }
        if (CacheReferenceNode.field_u > 0) {
          CacheReferenceNode.field_u = CacheReferenceNode.field_u - 1;
          if (0 != CacheReferenceNode.field_u) {
            return;
          }
          pd.field_p = un.field_a[0];
          nv.field_a = 0;
          return;
        }
        if (0 != CacheReferenceNode.field_u) {
          return;
        }
        pd.field_p = un.field_a[0];
        nv.field_a = 0;
    }

    static {
    }
}
