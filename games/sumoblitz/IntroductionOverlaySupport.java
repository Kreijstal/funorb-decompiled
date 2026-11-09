/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroductionOverlaySupport {
    static QuickChatCommand field_d;
    static int field_f;
    static int[] field_b;
    static ToolkitSprite[] field_e;
    static ToolkitSprite field_a;
    static int[] field_c;

    final static long millisSinceServerRead(int guard) {
        if (guard != 26560) {
          return -46L;
        }
        return -CacheReferenceNode.lastServerReadMillis + IntroMeshResources.monotonicTimeMillis(guard - 26634);
    }

    final static boolean supportsFullscreen(byte guard, PlatformTaskDispatcher dispatcher) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -29) {
            IntroductionOverlaySupport.millisSinceServerRead(118);
          }
          stackIn_3_0 = dispatcher.supportsFullscreen((byte) -101);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uc.A(").append(guard).append(',');
          if (dispatcher == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        int var1 = 98 % ((param0 + 76) / 49);
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static void renderDroneIntroduction(GraphicsToolkit toolkit, boolean guard) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard) {
            field_d = (QuickChatCommand) null;
          }
          if (!OpenGlVertexLayout.field_f.isVisible((byte) 91)) {
            return;
          }
          OpenGlVertexLayout.field_f.render(toolkit, -4475);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("uc.C(");
          if (toolkit == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_d = new QuickChatCommand(15, 0, 1, 0);
    }
}
