/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlDisplayLists {
    private int baseListId;
    static LegacyBitmapFont field_a;

    final static void a(int param0, int param1, boolean param2) {
        if (param1 == GameInstructions.field_b) {
          return;
        }
        GameInstructions.field_b = param1;
        if (param2) {
          TextureCoordinateGeneration.a(GameInstructions.field_b, 124);
          qv.a(GameInstructions.field_b, 4);
          if (param0 > -87) {
            field_a = (LegacyBitmapFont) null;
            return;
          }
          return;
        }
        gn.a(GameInstructions.field_b, true);
        if (param0 > -87) {
          field_a = (LegacyBitmapFont) null;
          return;
        }
    }

    final void endList(boolean guard) {
        if (!guard) {
          this.beginList(-14, 14);
        } else {
          jaggl.OpenGL.glEndList();
          return;
        }
        jaggl.OpenGL.glEndList();
    }

    LegacyOpenGlDisplayLists(LegacyOpenGlGraphicsToolkit toolkit, int count) {
        try {
          this.baseListId = jaggl.OpenGL.glGenLists(count);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tq.<init>(" + (toolkit != null ? "{...}" : "null") + ',' + count + ')');
        }
    }

    final void callList(byte guard, char index) {
        jaggl.OpenGL.glCallList(index + this.baseListId);
        if (guard != 121) {
          field_a = (LegacyBitmapFont) null;
        }
    }

    final void beginList(int index, int mode) {
        jaggl.OpenGL.glNewList(this.baseListId + index, mode);
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -6) {
          field_a = (LegacyBitmapFont) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return (param2 & 256) != 0 ? true : false;
        }
        LegacyOpenGlDisplayLists.a(34, -21, true);
        return (param2 & 256) != 0 ? true : false;
    }

    final static void a(byte param0, Drone param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (HardwareUnlitEffect.field_e <= FadingWidget.score) {
            GameKeyHandler.a(param1, -1);
            HardwareUnlitEffect.field_e = (int)((double)HardwareUnlitEffect.field_e + 1.5 * (double)HardwareUnlitEffect.field_e);
          }
          if (param0 == -106) {
            return;
          }
          LegacyOpenGlDisplayLists.releaseStatics((byte) -12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
