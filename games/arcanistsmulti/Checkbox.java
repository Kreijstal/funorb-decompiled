/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Checkbox extends TextButton {
    static IndexedSprite[] field_L;
    static int field_I;
    static String field_K;
    static String field_H;
    static SceneWidget field_M;
    static nf field_J;

    final void activate(int param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.activate(-121, param1, param2, param3);
        if (param0 > -99) {
          Checkbox.a(-47);
          return;
        }
    }

    Checkbox(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        field_J = null;
        field_K = null;
        field_L = null;
        if (param0 != 0) {
          Checkbox.a(126);
          field_M = null;
          return;
        }
        field_M = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1021) {
          Checkbox.releaseStatics(44);
          if (2 <= param0) {
            return 2;
          }
          if (param2 < 5) {
            return 0;
          }
          return 1;
        }
        if (2 <= param0) {
          return 2;
        }
        if (param2 < 5) {
          return 0;
        }
        return 1;
    }

    private Checkbox(String param0, UiListener param1) {
        this(param0, MusicCrossfadeStream.field_n.field_u, param1);
        try {
          this.field_r = MusicCrossfadeStream.field_n.field_b;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        DualLinkDeque.field_e.reset(-12619);
        for (var1_int = 0; 32 > var1_int; var1_int++) {
          TextFieldValidator.field_l[var1_int] = 0L;
        }
        var1_int = 0;
        if (param0 != 2) {
          return;
        }
        try {
          while (32 > var1_int) {
            OptionsDialog.field_tb[var1_int] = 0L;
            var1_int++;
          }
          LoginPanel.field_Q = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "bk.C(" + param0 + ')');
        }
    }

    private Checkbox(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.field_r = MusicCrossfadeStream.field_n.field_b;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Email (Login):";
        field_H = "Level <%0>";
    }
}
