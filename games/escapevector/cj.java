/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static Sprite field_a;
    static String field_b;
    static int[][] field_d;
    static String field_c;

    final static void a(int param0, ResourceArchive param1) {
        try {
          Sprite var2 = new Sprite(param1.getNamedFile(-4, "", "final_frame.jpg"), (java.awt.Component) ((Object) of.field_d));
          int var3 = var2.width;
          int var4 = var2.height;
          hf.a(param0 ^ 58);
          cb.field_a = new Sprite(var3, 3 * var4 / 4);
          cb.field_a.bindAsFramebuffer();
          var2.drawOpaque(0, param0);
          Js5NetworkRequest.field_G = new Sprite(var3, -cb.field_a.height + var4);
          Js5NetworkRequest.field_G.bindAsFramebuffer();
          var2.drawOpaque(0, -cb.field_a.height);
          Js5NetworkRequest.field_G.offsetY = cb.field_a.height;
          dl.a((byte) 120);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "cj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2 = -55 % ((param0 + 59) / 39);
          int[] var6 = EditableTextWidget.field_I;
          int[] var1 = var6;
          int var3 = 0;
          int var4 = var6.length;
          while (var4 > var3) {
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "cj.C(" + param0 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (guard == 17159) {
          field_d = (int[][]) null;
          return;
        }
        cj.a((byte) 122);
        field_d = (int[][]) null;
    }

    static {
        field_c = "Just play";
        field_b = " - show/hide mini-map";
    }
}
