/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AlphaWidgetContainer extends WidgetWrapper {
    static int[] field_I;
    static int[] field_G;
    int field_J;
    static String field_L;
    static Calendar field_K;
    static boolean field_H;
    static od field_M;

    final void drawWidget(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (null == this.field_C) {
          return;
        }
        if (this.field_J == 0) {
          return;
        }
        if (this.field_J == 256) {
          this.field_C.drawWidget(false, param1, this.x + param2, param3 + this.y);
          return;
        }
        Sprite var6 = new Sprite(this.field_C.width, this.field_C.height);
        TextLineMetrics.a(var6, (byte) -94);
        this.field_C.drawWidget(param0, param1, 0, 0);
        ln.d(-28558);
        var6.drawWithOpacity(this.x + param2, param3 + this.y, this.field_J);
    }

    public AlphaWidgetContainer() {
        super(0, 0, 0, 0, (WidgetListener) null, (WidgetEventListener) null);
        this.field_J = 256;
    }

    AlphaWidgetContainer(UiWidget param0) {
        super(param0.x, param0.y, param0.width, param0.height, (WidgetListener) null, (WidgetEventListener) null);
        try {
          param0.setBounds(false, 0, 0, this.height, this.width);
          this.field_J = 256;
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_I = null;
        field_K = null;
        if (param0 != -12477) {
          return;
        }
        field_M = null;
        field_G = null;
        field_L = null;
    }

    final static void i(int param0) {
        p.a(param0 - 33);
        if (param0 != 0) {
          AlphaWidgetContainer.clearStaticReferences(-95);
          rh.b(-14, 4);
          return;
        }
        rh.b(-14, 4);
    }

    static {
        field_G = new int[8192];
        field_L = "Your Time: <%0>";
        field_K = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
