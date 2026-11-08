/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteRecordSubmission extends IntrusiveNode {
    int field_o;
    byte[] field_p;
    static int field_m;
    static String field_q;
    static int field_n;
    static UiComponent field_r;
    static int[] field_s;
    static int[] field_t;
    static ReflectionRequestSupport field_l;

    final static String c(byte param0) {
        if (TabbedPane.field_Lb == IntegerRecordProtocolSupport.field_e) {
          return SocialListEntry.field_Rb;
        }
        if (param0 <= 44) {
          ByteRecordSubmission.c((byte) 49);
          return VertexTransformSupport.field_a;
        }
        return VertexTransformSupport.field_a;
    }

    public static void releaseStatics(byte param0) {
        field_q = null;
        field_r = null;
        field_t = null;
        field_s = null;
        int var1 = -63 % ((param0 + 36) / 40);
        field_l = null;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ViewportController.field_c = new ProjectedVertex[param0];
          if (param1 != 49) {
            ByteRecordSubmission.releaseStatics((byte) -107);
          }
          for (var2_int = 0; ViewportController.field_c.length > var2_int; var2_int++) {
            ViewportController.field_c[var2_int] = new ProjectedVertex();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "kg.A(" + param0 + ',' + param1 + ')');
        }
    }

    private ByteRecordSubmission() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        ShotRecord.field_y = param2;
        if (param1) {
          ModelTableScene.field_K = param4;
          WidgetContainer.field_I = param3;
          Camera.field_b = param0;
          return;
        }
        ByteRecordSubmission.a(-104, true, -107, 21, 17);
        ModelTableScene.field_K = param4;
        WidgetContainer.field_I = param3;
        Camera.field_b = param0;
    }

    static {
        field_m = -1;
        field_s = new int[]{0, 0};
        field_t = new int[4];
    }
}
