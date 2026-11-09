/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterStateStack {
    private int[] clipScratch;
    private ToolkitRasterStateFrame freeFrames;
    private ToolkitRasterStateFrame top;
    private ToolkitSprite spriteTarget;
    private GraphicsToolkit toolkit;

    final static void a(int param0, int param1, hg param2) {
        pl var5 = null;
        int var4 = 0;
        try {
          var5 = InwardSparkParticle.field_v;
          var5.g(param0, 8);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte((byte) 39, param1);
          var5.writeByte((byte) 99, param2.field_u);
          var5.writeByte((byte) 63, param2.field_q);
          var5.writeInt(48, param2.field_r);
          var5.writeInt(48, param2.field_s);
          var5.writeInt(48, param2.field_n);
          var5.writeInt(48, param2.field_p);
          var5.appendCrc32(var4, false);
          var5.patchByteLength(var5.position - var4, -13745);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pm.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void push(byte guard) {
        ToolkitRasterStateFrame var2 = null;
        ToolkitRasterStateFrame var2Lifetime1;
        this.toolkit.getClip(this.clipScratch);
        if (guard < -40) {
          if (this.freeFrames != null) {
            var2 = this.freeFrames;
            this.freeFrames = this.freeFrames.previous;
          } else {
            var2 = new ToolkitRasterStateFrame();
          }
          var2.set(this.top, this.clipScratch[1], this.clipScratch[2], this.spriteTarget, -1, this.clipScratch[3], this.clipScratch[0]);
          this.top = var2;
          return;
        }
        this.top = (ToolkitRasterStateFrame) null;
        if (this.freeFrames != null) {
          var2Lifetime1 = this.freeFrames;
          this.freeFrames = this.freeFrames.previous;
        } else {
          var2Lifetime1 = new ToolkitRasterStateFrame();
        }
        var2Lifetime1.set(this.top, this.clipScratch[1], this.clipScratch[2], this.spriteTarget, -1, this.clipScratch[3], this.clipScratch[0]);
        this.top = var2Lifetime1;
    }

    final void pop(int guard) {
        ToolkitRasterStateFrame var3 = null;
        ToolkitRasterStateFrame var2 = null;
        ToolkitRasterStateFrame var3Lifetime1;
        ToolkitRasterStateFrame var2Lifetime1;
        ToolkitRasterStateFrame var3Lifetime2;
        ToolkitRasterStateFrame var2Lifetime2;
        if (this.spriteTarget != this.top.spriteTarget) {
          this.toolkit.restoreCanvasTarget();
          if (null != this.top.spriteTarget) {
            this.toolkit.bindSpriteTarget(this.top.spriteTarget, true);
          } else {
            this.spriteTarget = this.top.spriteTarget;
            this.toolkit.setClip(this.top.clipLeft, this.top.clipTop, this.top.clipRight, this.top.clipBottom);
            var3 = this.top;
            var2 = var3;
            this.top = this.top.previous;
            if (guard != 29709) {
              this.push((byte) 28);
            } else {
              var3.previous = this.freeFrames;
              this.freeFrames = var3;
              var3.spriteTarget = null;
              return;
            }
            var3.previous = this.freeFrames;
            this.freeFrames = var3;
            var3.spriteTarget = null;
            return;
          }
          this.spriteTarget = this.top.spriteTarget;
          this.toolkit.setClip(this.top.clipLeft, this.top.clipTop, this.top.clipRight, this.top.clipBottom);
          var3Lifetime2 = this.top;
          var2Lifetime2 = var3Lifetime2;
          this.top = this.top.previous;
          if (guard != 29709) {
            this.push((byte) 28);
          } else {
            var3Lifetime2.previous = this.freeFrames;
            this.freeFrames = var3Lifetime2;
            var3Lifetime2.spriteTarget = null;
            return;
          }
          var3Lifetime2.previous = this.freeFrames;
          this.freeFrames = var3Lifetime2;
          var3Lifetime2.spriteTarget = null;
          return;
        }
        this.toolkit.setClip(this.top.clipLeft, this.top.clipTop, this.top.clipRight, this.top.clipBottom);
        var3Lifetime1 = this.top;
        var2Lifetime1 = var3Lifetime1;
        this.top = this.top.previous;
        if (guard != 29709) {
          this.push((byte) 28);
        } else {
          var3Lifetime1.previous = this.freeFrames;
          this.freeFrames = var3Lifetime1;
          var3Lifetime1.spriteTarget = null;
          return;
        }
        var3Lifetime1.previous = this.freeFrames;
        this.freeFrames = var3Lifetime1;
        var3Lifetime1.spriteTarget = null;
    }

    final void pushClip(byte guard, int top, int bottom, int left, int right) {
        this.push((byte) -50);
        this.toolkit.intersectClip(left, top, right, bottom);
        int var6 = -53 / ((guard + 29) / 57);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param0 >= 45) {
          var3 = ic.b(param2, -431);
          var4 = SocialContact.cosQ16(0, param2);
          var5 = ic.b(param1, -431);
          var6 = SocialContact.cosQ16(0, param1);
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var6 * (long)var3 >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        hg var11 = (hg) null;
        ToolkitRasterStateStack.a(-57, 125, (hg) null);
        var3 = ic.b(param2, -431);
        var4 = SocialContact.cosQ16(0, param2);
        var5 = ic.b(param1, -431);
        var6 = SocialContact.cosQ16(0, param1);
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var6 * (long)var3 >> 16);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    ToolkitRasterStateStack(GraphicsToolkit renderer) {
        this.clipScratch = new int[4];
        this.spriteTarget = null;
        try {
          this.toolkit = renderer;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pm.<init>(" + (renderer != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
