/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteBase {
    int pixelHeight;
    int canvasWidth;
    int offsetX;
    int canvasHeight;
    int pixelWidth;
    int offsetY;
    static String field_a;
    static long field_c;
    static java.awt.Canvas field_b;

    final static void b(int param0) {
        if (param0 != 13829) {
          field_c = 27L;
          ProgressMessageDialog.field_lb = null;
          return;
        }
        ProgressMessageDialog.field_lb = null;
    }

    final static boolean isIgnoredAccount(String name, int obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -3404) {
            field_a = (String) null;
          }
          stackIn_5_0 = (null != db.findIgnoredAccount(name, -87));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("si.A(");
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    abstract void draw(int left, int top);

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 18347) {
          IndexedSpriteBase.b(-3);
        }
    }

    abstract void drawAlpha(int left, int top, int alpha);

    static {
        field_a = "This is not your unit";
    }
}
