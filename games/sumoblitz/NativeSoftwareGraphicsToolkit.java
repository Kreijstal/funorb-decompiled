/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareGraphicsToolkit extends GraphicsToolkit implements NativeResource {
    private IntrusiveDeque heaps;
    long field_nativeid;
    private boolean disposed;
    private NativeGraphicsHeap currentHeap;
    private Transform3D boundTransform;
    private IntrusiveNodeHashTable canvasSurfaces;
    private int field_n;
    private NativeCanvasSurface currentSurface;
    private int field_j;
    private int contextCount;
    private NativeRenderContext[] renderContexts;
    private boolean colorTablesRetained;

    final native void getClip(int[] bounds);

    public final native void disposeNativeResource(boolean param0);

    final RenderBuffer createRenderBuffer(int width, int height) {
        return (RenderBuffer) ((Object) new NativeRenderBuffer(width, height));
    }

    private final native void nativeUploadTextureMetadata(short textureId, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode) {
        this.nativeDrawLine(x0, y0, x1, y1, color, blendMode);
    }

    protected final synchronized void finalize() {
        this.close((byte) -22);
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    final void bindRenderTarget(RenderTarget target) {
        NativeRenderTarget var2 = (NativeRenderTarget) (target);
        this.nativeBindRenderTarget(var2.sprite.field_nativeid, var2.buffer.field_nativeid);
    }

    private final void prepareCanvasSurface(java.awt.Canvas canvas, int width, int height) {
        try {
          java.lang.reflect.Method var6 = null;
          Class var7 = null;
          NativeCanvasSurface var4 = (NativeCanvasSurface) (this.canvasSurfaces.get(106, (long)canvas.hashCode()));
          if (var4 == null) {
            try {
              var7 = Class.forName("java.awt.Canvas");
              var6 = var7.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
              var6.invoke((Object) (canvas), new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
            }
            var4 = new NativeCanvasSurface(this, canvas, width, height);
            this.canvasSurfaces.a(var4, -1, (long)canvas.hashCode());
          } else {
            if (var4.width != width ||
              var4.height != height) {
              var4.resize(canvas, width, height);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void nativeUseHeap(GraphicsHeap heap);

    private final void bindCanvasSurface(java.awt.Canvas canvas) {
        NativeCanvasSurface var2 = null;
        if (canvas != null) {
          var2 = (NativeCanvasSurface) (this.canvasSurfaces.get(127, (long)canvas.hashCode()));
          this.currentSurface = var2;
          this.nativeBindCanvasSurface(var2);
        } else {
          this.currentSurface = null;
          this.nativeBindCanvasSurface((NativeCanvasSurface) null);
        }
    }

    private final native void nativeDisposeToolkit();

    final native void drawHorizontalLine(int x, int y, int length, int color, int blendMode);

    final native int farPlane();

    final GraphicsHeap createHeap(int capacity) {
        NativeGraphicsHeap var2 = new NativeGraphicsHeap(this, capacity);
        this.heaps.addLast((IntrusiveNode) (var2), (byte) 39);
        return (GraphicsHeap) ((Object) var2);
    }

    private final void bindTransform(Transform3D transform) {
        this.boundTransform = transform;
        this.nativeBindTransform(((NativeTransform3D) (transform)).field_nativeid);
    }

    final native void setClip(int left, int top, int right, int bottom);

    final void copyFrontToBack() {
    }

    final ToolkitSprite createSprite(SpriteData data, boolean preferIndexed) {
        NativeToolkitSprite var3 = new NativeToolkitSprite(this, data.palette, data.indices, data.alpha, 0, data.width, data.width, data.height);
        ((ToolkitSprite) ((Object) var3)).setInsets(data.leftInset, data.topInset, data.rightInset, data.bottomInset);
        return (ToolkitSprite) ((Object) var3);
    }

    final RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer) {
        return (RenderTarget) ((Object) new NativeRenderTarget(this, (NativeToolkitSprite) (surface), (NativeRenderBuffer) (buffer)));
    }

    final native void drawCircle(int centerX, int centerY, int radius, int color, int blendMode);

    final native void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride);

    private final native void nativeDrawLine(int x0, int y0, int x1, int y1, int color, int blendMode);

    private final native void nativeBindRenderTarget(long spriteHandle, long bufferHandle);

    private final void createRenderContexts(int count) {
        int var2 = 0;
        this.contextCount = count;
        this.renderContexts = new NativeRenderContext[this.contextCount];
        for (var2 = 0; var2 < this.contextCount; var2++) {
          this.renderContexts[var2] = new NativeRenderContext(this, this.field_j, this.field_n);
        }
    }

    public NativeSoftwareGraphicsToolkit(java.awt.Canvas param0, TextureProvider param1, int param2, int param3) {
        super(param1);
        NativeTransform3D discarded$1 = null;
        Throwable decompiledCaughtException = null;
        Throwable var5 = null;
        this.disposed = false;
        this.field_nativeid = 0L;
        this.heaps = new IntrusiveDeque();
        this.field_n = 4096;
        this.field_j = 4096;
        this.canvasSurfaces = new IntrusiveNodeHashTable(4);
        this.colorTablesRetained = false;
        try {
          if (!ScrollPane.b((byte) -124, "sw3d")) {
            throw new RuntimeException("");
          }
          NativeResourceReaper.retainOwner((byte) -119);
          this.nativeInitializeToolkit(this.textureProvider, 0, 0);
          RasterColorTables.retainColorTables(true, -21, false);
          this.colorTablesRetained = true;
          discarded$1 = new NativeTransform3D();
          this.bindTransform(new NativeTransform3D());
          this.createRenderContexts(1);
          this.bindRenderContext(0);
          if (param0 != null) {
            this.prepareCanvasSurface(param0, param2, param3);
            this.bindCanvasSurface(param0);
          }
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          this.close((byte) -121);
          throw new RuntimeException();
        }
    }

    private final boolean uploadTextureMetadata(short textureId) {
        Object var2 = null;
        Object var2_ref = null;
        TextureMetadata var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this;
        synchronized (var2_ref) {
          var3 = this.textureProvider.metadata(-29193, (int) textureId);
          if (var3 == null) {
            return false;
          }
          this.nativeUploadTextureMetadata(textureId, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
        }
        return true;
    }

    private final void collectNativeResources() {
        System.gc();
        System.runFinalization();
        NativeResourceReaper.drainPending(-121);
    }

    final void dispose() {
        if (this.disposed) {
          return;
        }
        this.renderContexts = null;
        this.currentSurface = null;
        this.currentHeap = null;
        this.canvasSurfaces.c(6407);
        NativeGraphicsHeap var1 = (NativeGraphicsHeap) (this.heaps.first(99));
        while (var1 != null) {
          var1.ga();
          var1 = (NativeGraphicsHeap) (this.heaps.next((byte) 18));
        }
        this.heaps.clear(125);
        this.nativeDisposeToolkit();
        if (this.colorTablesRetained) {
          CubeMapSource.releaseColorTables(false, true, -1);
          this.colorTablesRetained = false;
        }
        this.collectNativeResources();
        NativeResourceReaper.releaseOwner((byte) -107);
        this.disposed = true;
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
          var4[var7] = glyphs[var7].width;
          var5[var7] = glyphs[var7].height;
          if (glyphs[var7].alpha != null) {
            var6 = 1;
          }
        }
        if (!useMaskGlyphs) {
          if (var6 == 0) {
            return (ToolkitFont) ((Object) new NativePaletteFont(this, this.currentHeap, metrics, glyphs, (ToolkitSprite[]) null));
          }
          throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        }
        if (var6 == 0) {
          return (ToolkitFont) ((Object) new NativeMonochromeFont(this, this.currentHeap, metrics, glyphs, (ToolkitSprite[]) null));
        }
        throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
    }

    final native int nearPlane();

    private final boolean uploadTexturePixels(short textureId) {
        Object var2 = null;
        Object var2_ref = null;
        TextureMetadata var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this.textureProvider;
        synchronized (var2_ref) {
          if (!this.textureProvider.isTextureReady(-29912, (int) textureId)) {
            return false;
          }
          var3 = this.textureProvider.metadata(-29193, (int) textureId);
          if (var3 == null) {
            return false;
          }
          if (var3.field_p == 2) {
            var4 = this.textureProvider.loadPixels(-25069, 128, 128, true, 0.699999988079071f, (int) textureId);
          } else {
            var4 = this.textureProvider.loadPixels(true, 128, (byte) -81, 128, 0.699999988079071f, (int) textureId);
          }
          this.nativeUploadTexturePixels(textureId, var4, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
        }
        return true;
    }

    final boolean usesNativeRendering() {
        return true;
    }

    final native void fillRectangle(int x, int y, int width, int height, int color, int blendMode);

    final void present(int sourceX, int sourceY) throws RenderPresentationException {
        if (this.currentSurface == null) {
          throw new IllegalStateException("off");
        }
        this.currentSurface.present(sourceX, sourceY);
    }

    final native void setProjection(int centerX, int centerY, int scaleX, int scaleY);

    final void restoreCanvasTarget() {
        this.bindCanvasSurface(this.currentSurface.canvas);
    }

    final native int[] projectionParameters();

    final ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels) {
        return (ToolkitSprite) ((Object) new NativeToolkitSprite(this, pixels, offset, stride, width, height, false));
    }

    final void useHeap(GraphicsHeap heap) {
        this.currentHeap = (NativeGraphicsHeap) (heap);
        this.nativeUseHeap(heap);
    }

    final native void setDepthRange(int nearPlane, int farPlane);

    final boolean isFloatPostProcessingEnabled() {
        return false;
    }

    private final native void nativeBindCanvasSurface(NativeCanvasSurface surface);

    private final native void nativeUploadTexturePixels(short textureId, int[] pixels, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    private final native void nativeBindTransform(long handle);

    private final native void nativeInitializeToolkit(TextureProvider textures, int param1, int param2);

    private final native void nativeUpdateTime(int timeMillis);

    final native void intersectClip(int left, int top, int right, int bottom);

    final void updateTime(int timeMillis) {
        NativeResourceReaper.drainPending(-127);
        this.nativeUpdateTime(timeMillis);
        NativeGraphicsHeap var2 = (NativeGraphicsHeap) (this.heaps.first(-61));
        while (var2 != null) {
          var2.r();
          var2 = (NativeGraphicsHeap) (this.heaps.next((byte) 18));
        }
    }

    final void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
        this.nativeBindRenderTarget(((NativeToolkitSprite) (sprite)).field_nativeid, 0L);
    }

    final native void clear(int color);

    private final void bindRenderContext(int index) {
        this.renderContexts[index].bindToCurrentThread();
    }

    private final Object createNativeRenderResource() {
        return new NativeDualLinkedRenderResource(this);
    }

    static {
        Math.max(Math.max(104, 20), 24573);
    }
}
