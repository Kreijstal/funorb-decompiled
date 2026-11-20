/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareToolkit extends GraphicsToolkit implements NativeResource {
    private boolean field_m;
    private IntrusiveDeque field_c;
    private NativeSoftwareHeap field_k;
    long field_nativeid;
    private p field_e;
    private Transform3D field_j;
    private int field_d;
    private int field_f;
    private NodeHashTable field_i;
    private a[] field_g;
    private boolean field_h;
    private int field_l;

    final boolean supportsShadows() {
        return true;
    }

    final native void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    final boolean supportsEnvironmentMaps() {
        return false;
    }

    final native void setClip(int param0, int param1, int param2, int param3);

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
          java.lang.reflect.Method var6 = null;
          Class var7 = null;
          p var4 = (p) (this.field_i.get((long)param0.hashCode(), 122));
          if (var4 == null) {
            try {
              var7 = Class.forName("java.awt.Canvas");
              var6 = var7.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
              var6.invoke((Object) (param0), new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
            }
            var4 = new p(this, param0, param1, param2);
            this.field_i.put((long)param0.hashCode(), var4, (byte) -127);
          } else {
            if (var4.field_e != param1 ||
              var4.field_g != param2) {
              var4.a(param0, param1, param2);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    final native void getClip(int[] param0);

    final ToolkitSprite createSprite(IndexedSpriteData param0, boolean param1) {
        NativeSoftwareSprite var3 = new NativeSoftwareSprite(this, param0.field_b, param0.field_h, param0.field_a, 0, param0.field_f, param0.field_f, param0.field_e);
        ((ToolkitSprite) ((Object) var3)).setPadding(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
        return (ToolkitSprite) ((Object) var3);
    }

    final native void setProjectionParameters(int param0, int param1, int param2, int param3);

    final boolean hasSlowOffscreenRendering() {
        return false;
    }

    final boolean supportsMultipleCanvases() {
        return true;
    }

    final void releaseResources() {
        if (this.field_m) {
          return;
        }
        this.field_g = null;
        this.field_e = null;
        this.field_k = null;
        this.field_i.clear((byte) -103);
        NativeSoftwareHeap var1 = (NativeSoftwareHeap) (this.field_c.first(0));
        while (var1 != null) {
          var1.ga();
          var1 = (NativeSoftwareHeap) (this.field_c.next((byte) 33));
        }
        this.field_c.clear(93);
        this.FA();
        if (this.field_h) {
          SetDebrisFoundInPairs.a((byte) -115, true, false);
          this.field_h = false;
        }
        this.g();
        NativeDisposalQueue.unregisterToolkit(true);
        this.field_m = true;
    }

    final void bindFramebuffer(Framebuffer param0) {
        NativeSoftwareFramebuffer var2 = (NativeSoftwareFramebuffer) (param0);
        this.n(var2.field_a.field_nativeid, var2.field_b.field_nativeid);
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void restoreDefaultFramebuffer() {
        this.a(this.field_e.field_f);
    }

    final native void intersectClip(int param0, int param1, int param2, int param3);

    final Transform3D createTransform() {
        return (Transform3D) ((Object) new NativeSoftwareTransform3D());
    }

    private final native void ma(long param0);

    final native void clearDepth();

    private final native void va(GraphicsHeap param0);

    final boolean supportsMultipleThreads() {
        return true;
    }

    final boolean hasVolatileBackbuffer() {
        return true;
    }

    final boolean supportsResizableBackbuffer() {
        return true;
    }

    private final native void MA(d param0, int param1, int param2);

    final int getMaxPointLights() {
        return 4;
    }

    private final native void t(p param0);

    private final Object OA() {
        return new ba(this);
    }

    final boolean isBloomSupported() {
        return false;
    }

    final void drawRectangle(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.drawHorizontalLine(param0, param1, param2, param4, param5);
        this.drawHorizontalLine(param0, param1 + param3 - 1, param2, param4, param5);
        this.drawVerticalLine(param0, param1 + 1, param3 - 1, param4, param5);
        this.drawVerticalLine(param0 + param2 - 1, param1 + 1, param3 - 1, param4, param5);
    }

    final ToolkitFont createFont(ToolkitFontMetrics param0, IndexedSpriteData[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].field_f;
          var5[var7] = param1[var7].field_e;
          if (param1[var7].field_a != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (ToolkitFont) ((Object) new NativeSoftwarePaletteFont(this, this.field_k, param0, param1, (ToolkitSprite[]) null));
          }
          throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        }
        if (var6 == 0) {
          return (ToolkitFont) ((Object) new NativeSoftwareMonoFont(this, this.field_k, param0, param1, (ToolkitSprite[]) null));
        }
        throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
    }

    final boolean supportsFastTexturedParticles() {
        return true;
    }

    final native void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final native void clearColor(int param0);

    final boolean supportsUnderwaterEffects() {
        return true;
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        NativeDisposalQueue.drain((byte) -128);
    }

    protected final synchronized void finalize() {
        this.dispose((byte) 30);
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    final void copyFrontToBackBuffer() {
    }

    final boolean enableBloom() {
        return false;
    }

    private final a y() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_l; var1++) {
          if (this.field_g[var1].field_a == Thread.currentThread()) {
            return this.field_g[var1];
          }
        }
        return null;
    }

    private final native void FA();

    final boolean isBloomEnabled() {
        return false;
    }

    final native int getFarPlane();

    final native void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4);

    private final native void n(long param0, long param1);

    final DepthBuffer createDepthBuffer(int param0, int param1) {
        return (DepthBuffer) ((Object) new NativeSoftwareDepthBuffer(param0, param1));
    }

    final void updateFrame(int param0) {
        NativeDisposalQueue.drain((byte) -128);
        this.d(param0);
        NativeSoftwareHeap var2 = (NativeSoftwareHeap) (this.field_c.first(0));
        while (var2 != null) {
          var2.r();
          var2 = (NativeSoftwareHeap) (this.field_c.next((byte) 121));
        }
    }

    final void fillGradientTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        throw new IllegalStateException();
    }

    final void setViewTransform(Transform3D param0) {
        this.field_j = param0;
        this.ma(((NativeSoftwareTransform3D) (param0)).field_nativeid);
    }

    private final native void d(int param0);

    private final void g(int param0) {
        int var2 = 0;
        this.field_l = param0;
        this.field_g = new a[this.field_l];
        for (var2 = 0; var2 < this.field_l; var2++) {
          this.field_g[var2] = new a(this, this.field_d, this.field_f);
        }
    }

    final ka createModel(cbb param0, int param1, int param2, int param3, int param4) {
        return (ka) ((Object) new i(this, this.field_k, param0, param1, param2, param3, param4));
    }

    final GraphicsHeap createHeap(int param0) {
        NativeSoftwareHeap var2 = new NativeSoftwareHeap(this, param0);
        this.field_c.addLast(-10258, var2);
        return (GraphicsHeap) ((Object) var2);
    }

    private final void f(int param0) {
        this.field_g[param0].a();
    }

    final void setHeap(GraphicsHeap param0) {
        this.field_k = (NativeSoftwareHeap) (param0);
        this.va(param0);
    }

    public final native void disposeNative(boolean param0);

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    final void drawThickLine(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.y().a((GraphicsToolkit) (this), param0, param1, param2, param3, param4, param5, param6);
    }

    final boolean supportsMemoryPools() {
        return true;
    }

    final void setBloomParameters(float param0, float param1, float param2) {
    }

    final native void fillCircle(int param0, int param1, int param2, int param3, int param4);

    final ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (ToolkitSprite) ((Object) new NativeSoftwareSprite(this, param0, param1, param2, param3, param4, false));
    }

    final native void setDirectionalLighting(int param0, float param1, float param2, float param3, float param4, float param5);

    final native int[] readPixels(int param0, int param1, int param2, int param3);

    private final void a(java.awt.Canvas param0) {
        p var2 = null;
        if (param0 != null) {
          var2 = (p) (this.field_i.get((long)param0.hashCode(), 124));
          this.field_e = var2;
          this.t(var2);
        } else {
          this.field_e = null;
          this.t((p) null);
        }
    }

    final native int[] getProjectionParameters();

    final native void drawVerticalLine(int param0, int param1, int param2, int param3, int param4);

    final native int getNearPlane();

    final void applyPostProcessing() {
    }

    final Framebuffer createFramebuffer(ColorBuffer param0, DepthBuffer param1) {
        return (Framebuffer) ((Object) new NativeSoftwareFramebuffer(this, (NativeSoftwareSprite) (param0), (NativeSoftwareDepthBuffer) (param1)));
    }

    final native void setDepthRange(int param0, int param1);

    final boolean supportsFarClipPlane() {
        return true;
    }

    final native void setAmbientLight(float param0);

    public NativeSoftwareToolkit(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        NativeSoftwareTransform3D discarded$1 = null;
        Throwable decompiledCaughtException = null;
        Throwable var5 = null;
        this.field_m = false;
        this.field_nativeid = 0L;
        this.field_c = new IntrusiveDeque();
        this.field_f = 4096;
        this.field_d = 4096;
        this.field_i = new NodeHashTable(4);
        this.field_h = false;
        try {
          if (!RasterBuffer.a("sw3d", (byte) 114)) {
            throw new RuntimeException("");
          }
          NativeDisposalQueue.registerToolkit((byte) -76);
          this.MA(this.field_a, 0, 0);
          ocb.a(false, (byte) 33, true);
          this.field_h = true;
          discarded$1 = new NativeSoftwareTransform3D();
          this.setViewTransform(new NativeSoftwareTransform3D());
          this.g(1);
          this.f(0);
          if (param0 != null) {
            this.a(param0, param2, param3);
            this.a(param0);
          }
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          this.dispose((byte) 30);
          throw new RuntimeException();
        }
    }

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        opa var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this.field_a;
        synchronized (var2_ref) {
          if (!this.field_a.a((int) param0, (byte) -73)) {
            return false;
          }
          var3 = this.field_a.a(-20292, (int) param0);
          if (var3 == null) {
            return false;
          }
          if (var3.field_q == 2) {
            var4 = this.field_a.a(99, 128, 128, true, (int) param0, 0.699999988079071f);
          } else {
            var4 = this.field_a.a(128, 0.699999988079071f, true, (int) param0, 128, true);
          }
          this.CA(param0, var4, var3.field_l, var3.field_q, var3.field_c, var3.field_n, var3.field_o, var3.field_h, var3.field_b, var3.field_g, var3.field_p, var3.field_d, var3.field_r, var3.field_m, var3.field_a, var3.field_k, var3.field_s, var3.field_j, var3.field_i, var3.field_e, var3.field_f);
        }
        return true;
    }

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        opa var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this;
        synchronized (var2_ref) {
          var3 = this.field_a.a(-20292, (int) param0);
          if (var3 == null) {
            return false;
          }
          this.AA(param0, var3.field_l, var3.field_q, var3.field_c, var3.field_n, var3.field_o, var3.field_h, var3.field_b, var3.field_g, var3.field_p, var3.field_d, var3.field_r, var3.field_m, var3.field_a, var3.field_k, var3.field_s, var3.field_j, var3.field_i, var3.field_e, var3.field_f);
        }
        return true;
    }

    final void present(int param0, int param1) throws GraphicsPresentException {
        if (this.field_e == null) {
          throw new IllegalStateException("off");
        }
        this.field_e.a(param0, param1);
    }

    final boolean supportsAntialiasing() {
        return false;
    }

    final void beginPostProcessing(int param0, int param1, int param2, int param3) {
    }

    final native void drawCircle(int param0, int param1, int param2, int param3, int param4);

    final ToolkitSprite createSprite(int param0, int param1, boolean param2) {
        return (ToolkitSprite) ((Object) new NativeSoftwareSprite(this, param0, param1));
    }

    final boolean supportsOffscreenRendering() {
        return true;
    }

    final void setRenderTarget(ToolkitSprite param0, boolean param1) {
        this.n(((NativeSoftwareSprite) (param0)).field_nativeid, 0L);
    }

    static {
        Math.max(Math.max(104, 20), 24573);
    }
}
