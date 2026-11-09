/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareGraphicsToolkit extends GraphicsToolkit implements NativeResource {
    private IntrusiveDeque field_o;
    long field_nativeid;
    private boolean field_m;
    private NativeGraphicsHeap field_i;
    private Transform3D field_p;
    private IntrusiveNodeHashTable field_q;
    private int field_n;
    private NativeCanvasSurface field_r;
    private int field_j;
    private int field_l;
    private NativeRenderContext[] field_s;
    private boolean field_k;

    final native void getClip(int[] bounds);

    public final native void disposeNativeResource(boolean param0);

    final RenderBuffer createRenderBuffer(int width, int height) {
        return (RenderBuffer) ((Object) new NativeRenderBuffer(width, height));
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        this.wa(x0, y0, x1, y1, color, blendMode);
    }

    protected final synchronized void finalize() {
        this.close((byte) -22);
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    final void bindRenderTarget(RenderTarget target) {
        NativeRenderTarget var2 = (NativeRenderTarget) (target);
        this.n(var2.sprite.field_nativeid, var2.buffer.field_nativeid);
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
          java.lang.reflect.Method var6 = null;
          Class var7 = null;
          NativeCanvasSurface var4 = (NativeCanvasSurface) (this.field_q.get(106, (long)param0.hashCode()));
          if (var4 == null) {
            try {
              var7 = Class.forName("java.awt.Canvas");
              var6 = var7.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
              var6.invoke((Object) (param0), new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
            }
            var4 = new NativeCanvasSurface(this, param0, param1, param2);
            this.field_q.a(var4, -1, (long)param0.hashCode());
          } else {
            if (var4.width != param1 ||
              var4.height != param2) {
              var4.resize(param0, param1, param2);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void va(GraphicsHeap param0);

    private final void a(java.awt.Canvas param0) {
        NativeCanvasSurface var2 = null;
        if (param0 != null) {
          var2 = (NativeCanvasSurface) (this.field_q.get(127, (long)param0.hashCode()));
          this.field_r = var2;
          this.t(var2);
        } else {
          this.field_r = null;
          this.t((NativeCanvasSurface) null);
        }
    }

    private final native void FA();

    final native void drawHorizontalLine(int x, int y, int length, int color, int blendMode);

    final native int farPlane();

    final GraphicsHeap createHeap(int capacity) {
        NativeGraphicsHeap var2 = new NativeGraphicsHeap(this, capacity);
        this.field_o.addLast((IntrusiveNode) (var2), (byte) 39);
        return (GraphicsHeap) ((Object) var2);
    }

    private final void a(Transform3D param0) {
        this.field_p = param0;
        this.ma(((NativeTransform3D) (param0)).field_nativeid);
    }

    final native void setClip(int left, int top, int right, int bottom);

    final void copyFrontToBack() {
    }

    final ToolkitSprite createSprite(SpriteData data, boolean preferIndexed) {
        NativeToolkitSprite var3 = new NativeToolkitSprite(this, data.field_g, data.field_e, data.field_a, 0, data.field_h, data.field_h, data.field_i);
        ((ToolkitSprite) ((Object) var3)).setInsets(data.field_c, data.field_d, data.field_b, data.field_f);
        return (ToolkitSprite) ((Object) var3);
    }

    final RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer) {
        return (RenderTarget) ((Object) new NativeRenderTarget(this, (NativeToolkitSprite) (surface), (NativeRenderBuffer) (buffer)));
    }

    final native void drawCircle(int centerX, int centerY, int radius, int color, int blendMode);

    final native void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride);

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void n(long param0, long param1);

    private final void h(int param0) {
        int var2 = 0;
        this.field_l = param0;
        this.field_s = new NativeRenderContext[this.field_l];
        for (var2 = 0; var2 < this.field_l; var2++) {
          this.field_s[var2] = new NativeRenderContext(this, this.field_j, this.field_n);
        }
    }

    public NativeSoftwareGraphicsToolkit(java.awt.Canvas param0, TextureProvider param1, int param2, int param3) {
        super(param1);
        NativeTransform3D discarded$1 = null;
        Throwable decompiledCaughtException = null;
        Throwable var5 = null;
        this.field_m = false;
        this.field_nativeid = 0L;
        this.field_o = new IntrusiveDeque();
        this.field_n = 4096;
        this.field_j = 4096;
        this.field_q = new IntrusiveNodeHashTable(4);
        this.field_k = false;
        try {
          if (!ScrollPane.b((byte) -124, "sw3d")) {
            throw new RuntimeException("");
          }
          NativeResourceReaper.retainOwner((byte) -119);
          this.MA(this.textureProvider, 0, 0);
          RasterColorTables.retainColorTables(true, -21, false);
          this.field_k = true;
          discarded$1 = new NativeTransform3D();
          this.a(new NativeTransform3D());
          this.h(1);
          this.g(0);
          if (param0 != null) {
            this.a(param0, param2, param3);
            this.a(param0);
          }
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          this.close((byte) -121);
          throw new RuntimeException();
        }
    }

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        TextureMetadata var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this;
        synchronized (var2_ref) {
          var3 = this.textureProvider.a(-29193, (int) param0);
          if (var3 == null) {
            return false;
          }
          this.AA(param0, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
        }
        return true;
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        NativeResourceReaper.drainPending(-121);
    }

    final void dispose() {
        if (this.field_m) {
          return;
        }
        this.field_s = null;
        this.field_r = null;
        this.field_i = null;
        this.field_q.c(6407);
        NativeGraphicsHeap var1 = (NativeGraphicsHeap) (this.field_o.first(99));
        while (var1 != null) {
          var1.ga();
          var1 = (NativeGraphicsHeap) (this.field_o.next((byte) 18));
        }
        this.field_o.clear(125);
        this.FA();
        if (this.field_k) {
          CubeMapSource.releaseColorTables(false, true, -1);
          this.field_k = false;
        }
        this.g();
        NativeResourceReaper.releaseOwner((byte) -107);
        this.field_m = true;
    }

    final ToolkitFont createFont(FontMetrics metrics, SpriteData[] glyphs, boolean useMaskGlyphs) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[glyphs.length];
        var5 = new int[glyphs.length];
        var6 = 0;
        for (var7 = 0; var7 < glyphs.length; var7++) {
          var4[var7] = glyphs[var7].field_h;
          var5[var7] = glyphs[var7].field_i;
          if (glyphs[var7].field_a != null) {
            var6 = 1;
          }
        }
        if (!useMaskGlyphs) {
          if (var6 == 0) {
            return (ToolkitFont) ((Object) new NativePaletteFont(this, this.field_i, metrics, glyphs, (ToolkitSprite[]) null));
          }
          throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        }
        if (var6 == 0) {
          return (ToolkitFont) ((Object) new NativeMonochromeFont(this, this.field_i, metrics, glyphs, (ToolkitSprite[]) null));
        }
        throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
    }

    final native int nearPlane();

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        TextureMetadata var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this.textureProvider;
        synchronized (var2_ref) {
          if (!this.textureProvider.b(-29912, (int) param0)) {
            return false;
          }
          var3 = this.textureProvider.a(-29193, (int) param0);
          if (var3 == null) {
            return false;
          }
          if (var3.field_p == 2) {
            var4 = this.textureProvider.a(-25069, 128, 128, true, 0.699999988079071f, (int) param0);
          } else {
            var4 = this.textureProvider.a(true, 128, (byte) -81, 128, 0.699999988079071f, (int) param0);
          }
          this.CA(param0, var4, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
        }
        return true;
    }

    final boolean usesNativeRendering() {
        return true;
    }

    final native void fillRectangle(int x, int y, int width, int height, int color, int blendMode);

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        if (this.field_r == null) {
          throw new IllegalStateException("off");
        }
        this.field_r.present(sourceX, sourceY);
    }

    final native void setProjection(int centerX, int centerY, int scaleX, int scaleY);

    final void restoreCanvasTarget() {
        this.a(this.field_r.canvas);
    }

    final native int[] projectionParameters();

    final ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels) {
        return (ToolkitSprite) ((Object) new NativeToolkitSprite(this, pixels, offset, stride, width, height, false));
    }

    final void useHeap(GraphicsHeap heap) {
        this.field_i = (NativeGraphicsHeap) (heap);
        this.va(heap);
    }

    final native void setDepthRange(int nearPlane, int farPlane);

    final boolean isFloatPostProcessingEnabled() {
        return false;
    }

    private final native void t(NativeCanvasSurface param0);

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    private final native void ma(long param0);

    private final native void MA(TextureProvider param0, int param1, int param2);

    private final native void d(int param0);

    final native void intersectClip(int left, int top, int right, int bottom);

    final void updateTime(int timeMillis) {
        NativeResourceReaper.drainPending(-127);
        this.d(timeMillis);
        NativeGraphicsHeap var2 = (NativeGraphicsHeap) (this.field_o.first(-61));
        while (var2 != null) {
          var2.r();
          var2 = (NativeGraphicsHeap) (this.field_o.next((byte) 18));
        }
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
        this.n(((NativeToolkitSprite) (sprite)).field_nativeid, 0L);
    }

    final native void clear(int color);

    private final void g(int param0) {
        this.field_s[param0].bindToCurrentThread();
    }

    private final Object OA() {
        return new NativeDualLinkedRenderResource(this);
    }

    static {
        Math.max(Math.max(104, 20), 24573);
    }
}
