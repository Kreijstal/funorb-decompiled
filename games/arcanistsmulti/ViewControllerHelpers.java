/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewControllerHelpers {
    static String field_c;
    static boolean field_a;
    static MenuInputState field_h;
    static int[][] field_b;
    static int field_g;
    static int[] field_f;
    static long field_d;
    static StringBuilder field_e;

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_b = (int[][]) null;
        if (param0 < 16) {
          return;
        }
        field_c = null;
        field_f = null;
        field_h = null;
    }

    final static void installViewController(int param0, boolean param1) {
        Object var2 = null;
        Object var2Lifetime1;
        Object var2Lifetime2;
        Object var2Lifetime3;
        if (param0 < -45) {
          var2 = null;
          if (!param1) {
            var2Lifetime3 = new FixedViewResizeListener();
          } else {
            var2Lifetime3 = new ResizableViewResizeListener();
          }
          ArchiveIndex.setViewportController(-113, new ViewportController((ViewResizeListener) (var2Lifetime3)));
          return;
        }
        ViewControllerHelpers.installViewController(23, true);
        var2Lifetime1 = null;
        if (!param1) {
          var2Lifetime2 = new FixedViewResizeListener();
        } else {
          var2Lifetime2 = new ResizableViewResizeListener();
        }
        ArchiveIndex.setViewportController(-113, new ViewportController((ViewResizeListener) (var2Lifetime2)));
    }

    static {
        field_c = "Unpacking graphics";
        field_b = new int[][]{new int[]{255, 204, 153}, new int[]{255, 153, 102}, new int[]{198, 138, 72}, new int[]{124, 84, 39}, new int[]{255, 253, 253}, new int[]{153, 0, 255}, new int[]{0, 153, 204}, new int[]{64, 255, 0}};
        field_h = new MenuInputState(1);
        field_f = new int[]{3, 4, 5};
        field_e = new StringBuilder(80);
    }
}
