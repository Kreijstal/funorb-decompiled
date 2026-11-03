/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Checkbox extends TextButton {
    static String field_O;
    static ge field_N;
    static int[] field_Y;
    static String field_U;
    static String field_S;
    static int[][] field_Z;
    static UiTheme field_X;
    static int field_T;
    static boolean field_R;
    static Sprite[] field_V;
    static boolean[] field_P;
    static int field_Q;
    static int field_W;

    Checkbox(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_M = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private Checkbox(String param0, UiListener param1) {
        this(param0, field_X.field_r, param1);
        try {
          this.field_y = field_X.field_t;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private Checkbox(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.field_y = field_X.field_t;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_M = !this.field_M ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(int param0, Sprite param1) {
        try {
          MidiPcmStream.a(false);
          SoftwareRasterizer.setTarget(param1.pixels, param1.field_A, param1.field_B);
          if (param0 >= -58) {
            field_V = (Sprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "h.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static io[] a(byte param0) {
        if (param0 == -8) {
          return new io[]{ig.field_e, vm.field_a, cd.field_c};
        }
        Sprite var2 = (Sprite) null;
        Checkbox.a(-96, (Sprite) null);
        return new io[]{ig.field_e, vm.field_a, cd.field_c};
    }

    public static void releaseStatics(int param0) {
        field_U = null;
        field_P = null;
        field_S = null;
        if (param0 >= 43) {
          field_N = null;
          field_X = null;
          field_V = null;
          field_Z = (int[][]) null;
          field_Y = null;
          field_O = null;
          return;
        }
    }

    static {
        field_Y = new int[8192];
        field_O = "Single-Player";
        field_S = "Join";
        field_N = new ge();
        field_P = new boolean[64];
        field_Q = -1;
    }
}
