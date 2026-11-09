/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class VictoryScreen extends MenuScreen {
    private int field_i;

    final void update(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        super.update(param0 + 0);
        LegacyOpenGlRenderbuffer.field_u.update(param0 ^ 18481);
        if (this.field_i % 50 == 0) {
          up.field_a = ExpandingRingEffect.nextRandomInt(640, HardwareGraphicsHeap.field_o, (byte) -96) << 8;
          LoginForm.field_E = ExpandingRingEffect.nextRandomInt(480, HardwareGraphicsHeap.field_o, (byte) -96) << 8;
        }
        LegacyOpenGlRenderbuffer.field_u.steerTowardPoint(false, LoginForm.field_E, up.field_a);
        if (param0 != -18556) {
          this.field_i = -126;
        }
        if (0 == this.field_i % 100) {
          TurbulenceNoise3D.a(LegacyOpenGlRenderbuffer.field_u.xQ8, 40, LegacyOpenGlRenderbuffer.field_u.yQ8, im.field_b, VertexBufferReference.field_a[ExpandingRingEffect.nextRandomInt(6, HardwareGraphicsHeap.field_o, (byte) -96)], (byte) 94);
          ArchiveLoadRequirement.playSoundEffect(34 + ExpandingRingEffect.nextRandomInt(4, HardwareGraphicsHeap.field_o, (byte) -96), true);
        }
        if (this.field_i % 2 == 0) {
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + (LegacyOpenGlRenderbuffer.field_u.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, LegacyOpenGlRenderbuffer.field_u.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) - 1024 >> 8, -1, 0, false)), (byte) 39);
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + (LegacyOpenGlRenderbuffer.field_u.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, -1024 + (LegacyOpenGlRenderbuffer.field_u.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, -1, 2, false)), (byte) 39);
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + LegacyOpenGlRenderbuffer.field_u.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) >> 8, LegacyOpenGlRenderbuffer.field_u.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) - 1024 >> 8, -1, 4, false)), (byte) 39);
        } else {
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, LegacyOpenGlRenderbuffer.field_u.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) - 1024 >> 8, -1024 + (LegacyOpenGlRenderbuffer.field_u.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, -1, 1, true)), (byte) 39);
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, LegacyOpenGlRenderbuffer.field_u.xQ8 - (-ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) + 1024) >> 8, LegacyOpenGlRenderbuffer.field_u.yQ8 - (-ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) + 1024) >> 8, -1, 3, true)), (byte) 39);
          im.field_b.addLast((IntrusiveNode) (new PowerupTrailParticle(50, LegacyOpenGlRenderbuffer.field_u.xQ8 - (-ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) + 1024) >> 8, -1024 + LegacyOpenGlRenderbuffer.field_u.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) >> 8, -1, 5, true)), (byte) 39);
        }
        TimedSceneEffect var2 = (TimedSceneEffect) (im.field_b.first(68));
        while (var2 != null) {
          if (var2.updateAndIsExpired(-2567)) {
            var2.unlink(false);
            if (var2 instanceof SlowBurstParticle &&
              ExpandingRingEffect.nextRandomInt(3, HardwareGraphicsHeap.field_o, (byte) -96) == 1 &&
              !((SlowBurstParticle) (var2)).field_u) {
              SpriteOptionRenderer.emitBurstParticles(VertexBufferReference.field_a[ExpandingRingEffect.nextRandomInt(6, HardwareGraphicsHeap.field_o, (byte) -96)], var2.y, param0 ^ 18547, var2.x, im.field_b, 20);
            }
          }
          var2 = (TimedSceneEffect) (im.field_b.next((byte) 18));
        }
        this.field_i = this.field_i + 1;
    }

    final static String b(byte param0) {
        int var3 = 0;
        String var8 = null;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 42 / ((param0 + 75) / 49);
        String var7 = "(" + ToolkitImageProducerBuffer.field_r + " " + RotarySelectorWidget.field_I + " " + ContentTransitionDialog.field_Q + ") " + TextureFormat.field_a;
        String var1 = var7;
        if (0 >= gu.field_d) {
        } else {
          var1 = var7 + ":";
          for (var3 = 0; var3 < gu.field_d; var3++) {
            var8 = var1 + ' ';
            var4 = ig.field_a.payload[var3] & 255;
            var5 = var4 >> 4;
            var4 = var4 & 15;
            if (10 <= var5) {
              var5 += 55;
            } else {
              var5 += 48;
            }
            if (10 <= var4) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var9 = var8 + (char)var5;
            var1 = var9 + (char)var4;
          }
        }
        return var1;
    }

    public VictoryScreen() {
        super(12);
        im.field_b = new IntrusiveDeque();
    }

    final void render(int opacity, GraphicsToolkit toolkit, int guard) {
        GraphicsToolkit var8 = null;
        ToolkitSprite[] var5 = null;
        TimedSceneEffect var7 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = toolkit;
          var5 = ResizingDialog.field_H;
          DelegatingCanvas.a(var5, 60, 210, 0, 1, var8, 220, 350, 1, true);
          DelegatingCanvas.a(ResizingDialog.field_H, LegacyOpenGlSpriteMask.field_e.height() + 20, -10 + (-(LegacyOpenGlSpriteMask.field_e.width() >> 1) + 320), -1426063360, 3, toolkit, LegacyOpenGlSpriteMask.field_e.width() + 20, 190 - (LegacyOpenGlSpriteMask.field_e.height() >> 1), 1, true);
          LegacyOpenGlSpriteMask.field_e.draw(-(LegacyOpenGlSpriteMask.field_e.width() >> 1) + 320, 200 - (LegacyOpenGlSpriteMask.field_e.height() >> 1));
          var7 = (TimedSceneEffect) (im.field_b.first(-102));
          while (var7 != null) {
            var7.render(toolkit, guard + 2230);
            var7 = (TimedSceneEffect) (im.field_b.next((byte) 18));
          }
          LegacyOpenGlRenderbuffer.field_u.render(toolkit, guard + 21754);
          super.render(opacity, toolkit, guard);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "di.B(" + opacity + ',' + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static {
    }
}
