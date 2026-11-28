/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static int field_a;

    final static void a(String param0, int param1, float param2, boolean param3) {
        try {
          if (na.field_c == null) {
            na.field_c = new ProgressDialog(bm.field_d, bm.field_a);
            bm.field_d.showDialog((byte) 74, (UiWidget) (na.field_c));
          }
          na.field_c.setProgress(param3, param0, param2, 2113632);
          SoftwareRasterizer.clearRaster();
          m.a(true, param1);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ih.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 > -121) {
          ih.clearStaticReferences(5);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "You cannot afford this turret";
        field_a = 0;
    }
}
