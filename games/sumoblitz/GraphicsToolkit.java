/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GraphicsToolkit {
    TextureProvider textureProvider;
    static ResourceArchive field_e;
    static int field_b;
    int toolkitId;
    static int field_f;
    static String field_d;
    static ResourceArchive field_g;
    static pm field_c;

    abstract void setDepthRange(int nearPlane, int farPlane);

    final synchronized static GraphicsToolkit createToolkit(int backend, java.awt.Canvas canvas, int guard, int samples, TextureProvider textures, int width, int height, ResourceArchive resources) {
        RuntimeException var8 = null;
        GraphicsToolkit stackIn_3_0 = null;
        GraphicsToolkit stackIn_6_0 = null;
        GraphicsToolkit stackIn_9_0 = null;
        GraphicsToolkit stackIn_12_0 = null;
        GraphicsToolkit stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == ~backend) {
            stackIn_3_0 = SoftCacheReference.createSoftwareToolkit(width, canvas, textures, height, -1);
            return stackIn_3_0;
          }
          if (2 == backend) {
            stackIn_6_0 = qc.a(width, height, guard ^ 0, canvas, textures);
            return stackIn_6_0;
          }
          if (backend == 1) {
            stackIn_9_0 = HardwareGraphicsToolkit.a(textures, canvas, samples, 27541);
            return stackIn_9_0;
          }
          if (5 == backend) {
            stackIn_12_0 = sb.a(resources, guard ^ 6707, textures, canvas, samples);
            return stackIn_12_0;
          }
          if (backend != 3) {
            throw new IllegalArgumentException("UM");
          }
          stackIn_16_0 = nu.a(7023, resources, textures, canvas, samples);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("ha.HG(").append(backend).append(',');
          if (canvas == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(guard).append(',').append(samples).append(',');
          if (textures == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(width).append(',').append(height).append(',');
          if (resources == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    abstract void setClip(int left, int top, int right, int bottom);

    final static void a(int param0) {
        int var1 = -102 % ((param0 - 39) / 38);
    }

    final ToolkitSprite createSpriteCopy(int offset, int guard, int height, int stride, int width, int[] pixels) {
        RuntimeException var7 = null;
        ToolkitSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -2) {
            field_g = (ResourceArchive) null;
          }
          stackIn_3_0 = this.createSprite(pixels, offset, stride, width, height, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ha.IG(").append(offset).append(',').append(guard).append(',').append(height).append(',').append(stride).append(',').append(width).append(',');
          if (pixels == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_g = null;
        field_d = null;
    }

    abstract boolean a();

    final static void insertNodeBefore(int guard, IntrusiveNode before, IntrusiveNode node) {
        if (null != node.previous) {
          node.unlink(false);
        }
        if (guard != -2) {
          return;
        }
        try {
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ha.AG(" + guard + ',' + (before != null ? "{...}" : "null") + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean usesNativeRendering();

    final void present(boolean guard) throws RenderPresentationException {
        if (!guard) {
          field_c = (pm) null;
          this.present(0, 0);
          return;
        }
        this.present(0, 0);
    }

    abstract ToolkitFont createFont(FontMetrics metrics, SpriteData[] glyphs, boolean useMaskGlyphs);

    abstract void fillRectangle(int x, int y, int width, int height, int color, int blendMode);

    final void fillRectangle(byte guard, int width, int y, int color, int x, int height) {
        this.fillRectangle(x, y, width, height, color, 1);
        if (guard >= -38) {
          this.toolkitId = 121;
        }
    }

    final void drawHorizontalLineAlpha(int color, int guard, int y, int length, int x) {
        if (guard > 80) {
          this.drawHorizontalLine(x, y, length, color, 1);
          return;
        }
        this.a();
        this.drawHorizontalLine(x, y, length, color, 1);
    }

    abstract RenderTarget createRenderTarget(RenderSurface surface, RenderBuffer buffer);

    final static void b(int param0) {
        LimitedRandomAccessFile.field_d = false;
        uw.field_b = null;
        uw.field_c = null;
        if (param0 != 23639) {
          return;
        }
        ResizingDialog.field_F = null;
        no.field_b = null;
    }

    abstract void drawLine(int x0, int y0, int x1, int y1, int color, int blendMode);

    abstract void drawCircle(int centerX, int centerY, int radius, int color, int blendMode);

    abstract int farPlane();

    abstract RenderBuffer createRenderBuffer(int width, int height);

    abstract void dispose();

    abstract void setProjection(int centerX, int centerY, int scaleX, int scaleY);

    abstract void restoreCanvasTarget();

    abstract void drawHorizontalLine(int x, int y, int length, int color, int blendMode);

    final void close(byte guard) {
        PacketBuffer.field_o[this.toolkitId] = false;
        this.dispose();
        if (guard >= -11) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          GraphicsToolkit.insertNodeBefore(-61, (IntrusiveNode) null, (IntrusiveNode) null);
        }
    }

    abstract void getClip(int[] bounds);

    void bindSpriteTarget(ToolkitSprite sprite, boolean withBuffer) {
        try {
          this.bindRenderTarget(this.createRenderTarget(sprite, withBuffer ? this.createRenderBuffer(sprite.width(), sprite.height()) : null));
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ha.MF(" + (sprite != null ? "{...}" : "null") + ',' + withBuffer + ')');
        }
    }

    abstract void useHeap(GraphicsHeap heap);

    abstract void updateTime(int timeMillis);

    abstract int nearPlane();

    abstract GraphicsHeap createHeap(int capacity);

    protected void finalize() {
        this.close((byte) -21);
    }

    abstract void bindRenderTarget(RenderTarget target);

    final static void a(byte param0, String param1) {
        try {
          if (param0 < 106) {
            ResourceArchive var3 = (ResourceArchive) null;
            GraphicsToolkit.createToolkit(-117, (java.awt.Canvas) null, -59, 3, (TextureProvider) null, -128, -20, (ResourceArchive) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ha.EG(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract ToolkitSprite createSprite(SpriteData data, boolean preferIndexed);

    abstract void clear(int color);

    abstract ToolkitSprite createSprite(int[] pixels, int offset, int stride, int width, int height, boolean copyPixels);

    GraphicsToolkit(TextureProvider textures) {
        int var2_int = 0;
        int var3 = 0;
        try {
          this.textureProvider = textures;
          var2_int = -1;
          for (var3 = 0; 8 > var3; var3++) {
            if (!PacketBuffer.field_o[var3]) {
              PacketBuffer.field_o[var3] = true;
              var2_int = var3;
              break;
            }
          }
          if (var2_int == -1) {
            throw new IllegalStateException("NFTI");
          }
          this.toolkitId = var2_int;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ha.<init>(" + (textures != null ? "{...}" : "null") + ')');
        }
    }

    abstract void drawPixels(int x, int y, int width, int height, int[] pixels, int offset, int stride);

    abstract int[] projectionParameters();

    abstract void present(int sourceX, int sourceY) throws RenderPresentationException;

    abstract void copyFrontToBack();

    abstract void intersectClip(int left, int top, int right, int bottom);

    static {
        field_c = null;
    }
}
