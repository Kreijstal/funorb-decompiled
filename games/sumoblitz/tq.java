/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int field_b;
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

    final void a(boolean param0) {
        if (!param0) {
          this.a(-14, 14);
        } else {
          jaggl.OpenGL.glEndList();
          return;
        }
        jaggl.OpenGL.glEndList();
    }

    tq(LegacyOpenGlGraphicsToolkit param0, int param1) {
        try {
          this.field_b = jaggl.OpenGL.glGenLists(param1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, char param1) {
        jaggl.OpenGL.glCallList(param1 + this.field_b);
        if (param0 != 121) {
          field_a = (LegacyBitmapFont) null;
        }
    }

    final void a(int param0, int param1) {
        jaggl.OpenGL.glNewList(this.field_b + param0, param1);
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
        tq.a(34, -21, true);
        return (param2 & 256) != 0 ? true : false;
    }

    final static void a(byte param0, Drone param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oc.field_e <= FadingWidget.score) {
            GameKeyHandler.a(param1, -1);
            oc.field_e = (int)((double)oc.field_e + 1.5 * (double)oc.field_e);
          }
          if (param0 == -106) {
            return;
          }
          tq.releaseStatics((byte) -12);
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
