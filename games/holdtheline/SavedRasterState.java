/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedRasterState extends IntrusiveNode {
    int height;
    int clipLeft;
    static float field_n;
    int clipBottom;
    int[] pixels;
    int clipRight;
    int width;
    static String field_t;
    static int field_j;
    static Sprite field_o;
    int clipTop;
    static RotatedSpriteAsset field_p;
    static int field_l;

    final void setRasterState(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param5;
        this.clipBottom = param0;
        this.clipLeft = param1;
        this.pixels = param2;
        this.width = param7;
        if (param4 != -1) {
          return;
        }
        try {
          this.clipRight = param3;
          this.clipTop = param6;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "we.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_o = null;
        field_p = null;
        field_t = null;
        if (param0 < 22) {
          field_l = -106;
        }
    }

    final static EmailValidationResult getEmailValidationResult(byte param0, String param1) {
        RuntimeException var2 = null;
        EmailValidationResult stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (WidgetStyleNode.field_o.isComplete(250) &&
            !param1.equals(WidgetStyleNode.field_o.getText((byte) 66))) {
            WidgetStyleNode.field_o = PlayerStatsRequest.createEmailValidationRequest(param1, -7079);
          }
          if (param0 != -85) {
            field_l = 85;
          }
          stackIn_6_0 = WidgetStyleNode.field_o;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("we.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    SavedRasterState() {
    }

    static {
        field_n = 260.0f / (float)(-1.0 + Math.exp(10.0));
        field_l = 250;
        field_t = "Connection lost - attempting to reconnect";
    }
}
