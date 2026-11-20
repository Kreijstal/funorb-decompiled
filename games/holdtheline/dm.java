/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static java.awt.Color field_d;
    static int[] field_b;
    static int field_a;
    static String field_c;
    static int[] field_e;

    final static void popRasterState(byte param0) {
        SavedRasterState var1 = (SavedRasterState) (MarkerSliderRenderer.field_g.removeLast((byte) 74));
        if (param0 != -10) {
          return;
        }
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.bindRaster(var1.pixels, var1.width, var1.height);
        SoftwareRasterizer.setClip(var1.clipLeft, var1.clipTop, var1.clipRight, var1.clipBottom);
        var1.pixels = null;
        BlobWriteRequest.field_i.addLast((byte) -101, var1);
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -20) {
          dm.popRasterState((byte) -112);
        }
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = HoldTheLine.field_D;
        try {
          TriangleRasterState.c();
          il.field_c = 11;
          MatchingTextValidator.field_i = new int[260];
          if (param0 != 255) {
            field_a = -31;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            MatchingTextValidator.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (MatchingTextValidator.field_i.length > var5) {
            MatchingTextValidator.field_i[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "dm.D(" + param0 + ')');
        }
    }

    final static void a(IsaacPacketBuffer param0, int param1, int param2) {
        try {
          eg.a(d.field_c[param1], 16, true, param0);
          if (param2 != 255) {
            field_e = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new java.awt.Color(10040319);
        field_b = new int[4];
        field_a = 0;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
