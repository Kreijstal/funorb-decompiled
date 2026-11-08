/*
 * Decompiled by CFR-JS 0.4.0.
 */
class GradientOutlineTextPainter extends TextWidgetPainter {
    static int[] field_q;
    static int field_t;
    static SceneWidget field_u;
    static ReportReason field_s;
    static int[] field_r;
    static String[] field_w;
    static int field_v;

    public final void drawWidget(UiComponent param0, byte param1, int param2, int param3, boolean param4) {
        try {
          if (param4) {
            BoardView.drawInsetFieldBorder(param3 + param0.field_z, param0.field_C, param0.field_p + param2, param0.field_E, (byte) -51);
          }
          super.drawWidget(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "gh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void writeReflectionCheckResponses(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = ChatMessage.field_f;
          if (param0 != 8) {
            GradientOutlineTextPainter.writeReflectionCheckResponses(110);
          }
          while (WidgetStyleLayer.areReflectionChecksReady((byte) -91)) {
            var1.writeOpcode(8, 15514);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            AudioService.writeReflectionCheckReplies(var1, -20);
            ChatMessage.field_f.backpatchByteLength(var1.position - var2, param0 ^ -9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1_ref), "gh.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_s = null;
        if (param0 >= -72) {
          return;
        }
        field_w = null;
        field_u = null;
        field_r = null;
    }

    final static void detectMaxMemoryMb(byte param0) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                ChatHistoryAllocator.field_h = (int)(var3.longValue() / 1048576L) + 1;
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                if (param0 == 90) {
                  return;
                }
                GradientOutlineTextPainter.writeReflectionCheckResponses(-108);
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
          if (param0 == 90) {
            return;
          }
          GradientOutlineTextPainter.writeReflectionCheckResponses(-108);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    GradientOutlineTextPainter(int param0) {
        this(CanvasInputHelpers.field_d, param0);
    }

    GradientOutlineTextPainter(BitmapFont param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.maxAscent, -1, 2147483647, false);
    }

    static {
        field_r = new int[8192];
        field_s = new ReportReason(14, 0, 4, 1);
        field_w = new String[]{"Welcome to Pixelate!", null, "Alternate Controls", null, null, null};
    }
}
