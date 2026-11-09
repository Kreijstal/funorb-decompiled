/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlPostProcessEffect extends IntrusiveNode {
    private boolean enabled;
    static String waitingForMusicText;
    LegacyOpenGlGraphicsToolkit toolkit;
    static SpriteData field_k;

    final boolean isEnabled(int guard) {
        if (guard < 106) {
          this.toolkit = (LegacyOpenGlGraphicsToolkit) null;
          return this.enabled;
        }
        return this.enabled;
    }

    final static OpenGlAssemblyProgram compileAssemblyProgram(byte guard, OpenGlGraphicsToolkit toolkit, byte[] source, int target) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        OpenGlAssemblyProgram stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (source == null) {
            stackIn_2_0 = null;
            return (OpenGlAssemblyProgram) (stackIn_2_0);
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          var5 = 50 / ((guard + 9) / 58);
          jaggl.OpenGL.glBindProgramARB(target, var4_int);
          jaggl.OpenGL.glProgramRawARB(target, 34933, source);
          jaggl.OpenGL.glGetIntegerv(34379, GzipDecompressor.field_e, 0);
          if (GzipDecompressor.field_e[0] == -1) {
            jaggl.OpenGL.glBindProgramARB(target, 0);
            stackIn_7_0 = new OpenGlAssemblyProgram(toolkit, target, var4_int);
            return stackIn_7_0;
          }
          jaggl.OpenGL.glBindProgramARB(target, 0);
          stackIn_5_0 = null;
          return (OpenGlAssemblyProgram) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ve.F(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (source == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(target).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        int var1 = 106 / ((param0 - 71) / 40);
        waitingForMusicText = null;
    }

    abstract void close(int guard);

    final static ResourceArchive openResourceArchive(int guard, boolean discardGroups, int archiveId, int retentionPolicy, boolean prefetch) {
        if (guard == 11880) {
          return HardwareSpecularEffect.openResourceArchive(retentionPolicy, guard ^ -11778, discardGroups, archiveId, prefetch, false);
        }
        LegacyOpenGlPostProcessEffect.openResourceArchive(87, true, -113, -52, false);
        return HardwareSpecularEffect.openResourceArchive(retentionPolicy, guard ^ -11778, discardGroups, archiveId, prefetch, false);
    }

    LegacyOpenGlPostProcessEffect(LegacyOpenGlGraphicsToolkit owner) {
        try {
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ve.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    static {
        waitingForMusicText = "Waiting for music";
    }
}
