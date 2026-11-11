/*
 * Decompiled by CFR-JS 0.4.0.
 */
class haa extends FocusableWidget {
    static ToolkitSprite field_z;
    static SpriteData field_A;
    private UiWidget field_B;
    static int[][] field_C;

    final boolean requestKeyboardFocus(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_B = (UiWidget) null;
          }
          stackIn_3_0 = this.field_B.requestKeyboardFocus(param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("haa.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    haa(UiWidget param0) {
        try {
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "haa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > 37) {
          field_C = (int[][]) null;
          field_A = null;
          field_z = null;
          return;
        }
        field_A = (SpriteData) null;
        field_C = (int[][]) null;
        field_A = null;
        field_z = null;
    }

    static {
        field_C = new int[][]{new int[]{3, 4, 5, 6}, new int[]{2, 3}};
    }
}
