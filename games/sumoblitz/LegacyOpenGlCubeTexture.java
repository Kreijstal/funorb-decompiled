/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlCubeTexture extends LegacyOpenGlTexture {
    static String tooltipText;
    private int framebufferAttachment;
    static SpriteData[] field_n;
    private int framebufferTarget;
    static int[] field_o;

    public static void releaseStatics(int param0) {
        field_o = null;
        field_n = null;
        if (param0 != 1) {
          return;
        }
        tooltipText = null;
    }

    public final void detachFramebuffer(int guard) {
        int var2 = 26 / ((guard - 44) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.framebufferTarget, this.framebufferAttachment, 3553, 0, 0);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
    }

    LegacyOpenGlCubeTexture(LegacyOpenGlGraphicsToolkit owner, int storageFormat, int faceSize, boolean mipmaps, byte[][] faces, int sourceFormat) {
        super(owner, 34067, storageFormat, faceSize * faceSize * 6, mipmaps);
        int var7_int = 0;
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        try {
          this.toolkit.bindTexture(112, (LegacyOpenGlTexture) (this));
          for (var7_int = 0; 6 > var7_int; var7_int++) {
            jaggl.OpenGL.glTexImage2Dub(34069 + var7_int, 0, this.internalFormat, faceSize, faceSize, 0, sourceFormat, 5121, faces[var7_int], 0);
          }
          this.setLinearFiltering(true, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hp.<init>(" + (owner != null ? "{...}" : "null") + ',' + storageFormat + ',' + faceSize + ',' + mipmaps + ',' + (faces != null ? "{...}" : "null") + ',' + sourceFormat + ')');
        }
    }

    final static boolean hasUniformCharacters(String text, boolean guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = text.charAt(0);
          var3 = 1;
          if (!guard) {
            field_o = (int[]) null;
          }
          while (true) {
            if (text.length() <= var3) {
              return true;
            }
            if (text.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hp.A(");
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        tooltipText = null;
        field_o = new int[8192];
    }
}
