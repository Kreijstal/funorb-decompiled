/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static RgbSprite field_A;
    static String field_F;
    static String field_B;
    static String[] field_E;
    static int field_C;

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_x = param6;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void pointerReleased(int param0, int param1, UiWidget param2, int param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(param0, param1, param2, param3, (int) (char)param4, param5);
          var7 = NameSuggestionsPanel.field_A;
          if (var7 != null) {
            if (!this.containsPointer(param5, param4 ^ 34, param3, param1, param0)) {
              return;
            }
            if (this.field_n instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_n)).widgetDropped(var7, (byte) -56, this);
              NameSuggestionsPanel.field_A = null;
              return;
            }
            if (!(var7.field_n instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var7.field_n)).widgetDropped(var7, (byte) 90, this);
            NameSuggestionsPanel.field_A = null;
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "se.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_B = null;
        field_F = null;
        field_E = null;
        field_A = null;
        if (!param0) {
          DropTargetWidgetContainer.a(-39, 118L);
        }
    }

    final static String a(int param0, long param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        lj.field_c.setTime(new Date(param1));
        int var3 = lj.field_c.get(7);
        int var4 = lj.field_c.get(5);
        if (param0 <= -79) {
          var5 = lj.field_c.get(2);
          var6 = lj.field_c.get(1);
          var7 = lj.field_c.get(11);
          var8 = lj.field_c.get(12);
          var9 = lj.field_c.get(13);
          return StripedProgressWidget.field_A[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + vk.field_d[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        field_F = (String) null;
        var5Lifetime1 = lj.field_c.get(2);
        var6Lifetime1 = lj.field_c.get(1);
        var7Lifetime1 = lj.field_c.get(11);
        var8Lifetime1 = lj.field_c.get(12);
        var9Lifetime1 = lj.field_c.get(13);
        return StripedProgressWidget.field_A[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + vk.field_d[var5Lifetime1] + "-" + var6Lifetime1 + " " + var7Lifetime1 / 10 + var7Lifetime1 % 10 + ":" + var8Lifetime1 / 10 + var8Lifetime1 % 10 + ":" + var9Lifetime1 / 10 + var9Lifetime1 % 10 + " GMT";
    }

    static {
        field_F = "Waiting for extra data";
        field_B = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
