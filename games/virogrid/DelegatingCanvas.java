/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    private java.awt.Component field_k;
    static Sprite field_g;
    static int[] field_f;
    static int[] field_b;
    static int[][] field_j;
    static int[] field_i;
    static int field_c;
    static int field_e;
    static int[] field_a;
    static int[] field_h;
    static SpriteWidget field_d;

    final static boolean hasBlockingInputPopup(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_20_0 = false;
        if (param0 <= -95) {
          if (IntKeyLookup.field_e != null) {
            return true;
          }
          if (IntKeyLookup.isTooltipShown(false)) {
            return true;
          }
          if (null != SpriteWidget.field_yb) {
            stackIn_20_0 = true;
          } else {
            if (AccountCreationSupport.hasOpenDialog(false)) {
              return true;
            }
            stackIn_20_0 = false;
          }
          return stackIn_20_0;
        }
        DelegatingCanvas.releaseStatics(55);
        if (IntKeyLookup.field_e != null) {
          return true;
        }
        if (IntKeyLookup.isTooltipShown(false)) {
          return true;
        }
        if (null != SpriteWidget.field_yb) {
          stackIn_10_0 = true;
        } else {
          if (AccountCreationSupport.hasOpenDialog(false)) {
            return true;
          }
          stackIn_10_0 = false;
        }
        return stackIn_10_0;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_k.update(param0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ag.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeSpecularTable(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          TriangleRasterizer.useRasterClip();
          CacheReference.field_x = new int[260];
          if (param0 != 255) {
            DelegatingCanvas.getEnteredAge(false);
          }
          MarkerSlider.field_N = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            CacheReference.field_x[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < CacheReference.field_x.length) {
            CacheReference.field_x[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "ag.D(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_j = (int[][]) null;
        field_i = null;
        field_a = null;
        field_f = null;
        if (param0 != 25) {
          return;
        }
        field_g = null;
        field_b = null;
        field_d = null;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_k.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ag.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int getEnteredAge(boolean param0) {
        if (!param0) {
          DelegatingCanvas.releaseStatics(39);
          return TextDecodeHelpers.field_d;
        }
        return TextDecodeHelpers.field_d;
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ag.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new Sprite(540, 140);
        field_b = new int[12];
        field_f = new int[12];
        field_h = new int[12];
        field_a = new int[12];
        field_i = new int[8192];
        field_c = 256;
        field_j = new int[12][];
        BoundedUrlRequest.setMenuLayout(0, 490, 116, new int[]{0, 1, 5, 23, 6, 4, 3, 13}, 32, (byte) 126, 150);
        BoundedUrlRequest.setMenuLayout(1, 490, 136, new int[]{14, 15, 16, 17, 28, 8}, 32, (byte) 97, 150);
        BoundedUrlRequest.setMenuLayout(2, 490, 102, new int[]{2, 18, 14, 15, 5, 16, 17, 9}, 32, (byte) 90, 150);
        BoundedUrlRequest.setMenuLayout(3, 490, 88, new int[]{2, 14, 15, 5, 16, 17, 10, 11, 12}, 29, (byte) 66, 150);
        BoundedUrlRequest.setMenuLayout(4, 490, 92, new int[]{2, 14, 15, 5, 16, 17, 18, 12}, 32, (byte) 71, 150);
        BoundedUrlRequest.setMenuLayout(5, 490, 92, new int[]{2, 14, 15, 5, 16, 17, 12}, 32, (byte) 61, 150);
        BoundedUrlRequest.setMenuLayout(6, 490, 328, new int[]{22, 8}, 32, (byte) 90, 150);
        BoundedUrlRequest.setMenuLayout(7, 490, 330, new int[]{19, 8}, 32, (byte) 106, 150);
        BoundedUrlRequest.setMenuLayout(8, 490, 328, new int[]{22, 8}, 32, (byte) 109, 150);
        BoundedUrlRequest.setMenuLayout(9, 490, 300, new int[]{7}, 32, (byte) 58, 150);
        BoundedUrlRequest.setMenuLayout(10, 490, 300, new int[]{}, 32, (byte) 103, 150);
        BoundedUrlRequest.setMenuLayout(11, 490, 116, new int[]{24, 25, 26, 27, 8}, 32, (byte) 78, 150);
    }
}
