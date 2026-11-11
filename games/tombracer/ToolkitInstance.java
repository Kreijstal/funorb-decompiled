/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitInstance {
    static ChatOverlay field_c;
    ToolkitCandidate field_b;
    long field_f;
    java.awt.Canvas field_a;
    private ToolkitState field_e;
    GraphicsToolkit field_d;
    static String field_g;

    final ToolkitState captureState(byte param0) {
        if (param0 < -12) {
          if (null == this.field_e) {
            this.field_e = new ToolkitState();
          }
          this.field_e.capture(127, this);
          return this.field_e;
        }
        return (ToolkitState) null;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        int var1 = 13 % ((param0 - 26) / 56);
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        DialogStack.a(param3, true);
        vha.a(param2, (byte) 95, param3, param1);
        int var4 = -97 / ((param0 - 63) / 38);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (pka.field_b > -param4 + param3) {
          TileOperator.fillClippedCircle(0, param4, param2, param3, param1);
        } else {
          if (param3 + param4 > DiskCacheWorker.field_c) {
            TileOperator.fillClippedCircle(0, param4, param2, param3, param1);
          } else {
            if (gca.field_d > param1 - param4) {
              TileOperator.fillClippedCircle(0, param4, param2, param3, param1);
            } else {
              if (param1 + param4 > LineShape.field_h) {
                TileOperator.fillClippedCircle(0, param4, param2, param3, param1);
              } else {
                bq.a(param1, param3, param2, (byte) -13, param4);
              }
            }
          }
        }
        if (param0 == 30237) {
          return;
        }
        ToolkitInstance.a(114, -54, -16, -30, -116);
    }

    ToolkitInstance(GraphicsToolkit param0, ToolkitCandidate param1, java.awt.Canvas param2) {
        try {
          this.field_a = param2;
          this.field_d = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "iqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Age:";
        field_c = new ChatOverlay();
    }
}
