/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextMenuHelpers {
    static int field_f;
    boolean field_e;
    static int field_h;
    static java.applet.Applet field_a;
    static String field_i;
    String field_g;
    static float field_c;
    String field_d;
    static String textBack;

    final static void openContextMenu(int param0, ScrollPane param1, int[] param2, String param3, long param4, String param5, int param6, SpriteWidget param7, int param8) {
        try {
          if (param8 <= 43) {
            ContextMenuHelpers.releaseStatics(false);
          }
          RasterBuffer.field_d = param1;
          IntKeyLookup.field_e = new PlayerContextMenu(param7, param4, param5, param3, param6, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ai.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_i = null;
        textBack = null;
        if (param0) {
          field_i = (String) null;
        }
    }

    final static void popRasterTarget(boolean param0) {
        RasterSnapshot var1_ref = null;
        Object var1 = null;
        RasterSnapshot var1_refLifetime1;
        if (!param0) {
          ContextMenuHelpers.popRasterTarget(false);
          var1_ref = (RasterSnapshot) (BitCountAndDialogHelpers.field_a.removeLast(15));
          if (var1_ref != null) {
            Rasterizer.setTarget(var1_ref.field_p, var1_ref.field_q, var1_ref.field_v);
            Rasterizer.setClip(var1_ref.field_o, var1_ref.field_k, var1_ref.field_t, var1_ref.field_i);
            var1_ref.field_p = null;
            PatchNoteUsage.field_m.addFirst(var1_ref, (byte) -84);
            return;
          }
          throw new IllegalStateException();
        }
        var1_refLifetime1 = (RasterSnapshot) (BitCountAndDialogHelpers.field_a.removeLast(15));
        if (var1_refLifetime1 != null) {
          Rasterizer.setTarget(var1_refLifetime1.field_p, var1_refLifetime1.field_q, var1_refLifetime1.field_v);
          Rasterizer.setClip(var1_refLifetime1.field_o, var1_refLifetime1.field_k, var1_refLifetime1.field_t, var1_refLifetime1.field_i);
          var1_refLifetime1.field_p = null;
          PatchNoteUsage.field_m.addFirst(var1_refLifetime1, (byte) -84);
          return;
        }
        throw new IllegalStateException();
    }

    static {
        field_i = "Suggest muting this player";
        textBack = "Back";
    }
}
