/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    private long field_e;
    static String field_c;
    static double field_a;
    static int field_b;
    static long field_d;

    public final String getValidationMessage(int param0) {
        if (param0 < 115) {
          this.field_e = 37L;
          if (this.hasMissingInput(true)) {
            return null;
          }
          if (350L + this.field_e <= km.correctedCurrentTimeMillis(-1)) {
            return this.evaluateValidationMessage(0);
          }
          return null;
        }
        if (this.hasMissingInput(true)) {
          return null;
        }
        if (350L + this.field_e <= km.correctedCurrentTimeMillis(-1)) {
          return this.evaluateValidationMessage(0);
        }
        return null;
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_c = null;
        int var1 = 86 / ((param0 + 24) / 46);
    }

    public final void recordInputChange(boolean param0) {
        if (!param0) {
          DebouncedFieldValidator.clearDeclaredStaticReferences((byte) 82);
          this.field_e = km.correctedCurrentTimeMillis(-1);
          return;
        }
        this.field_e = km.correctedCurrentTimeMillis(-1);
    }

    abstract String evaluateValidationMessage(int param0);

    abstract cd evaluateValidationStatus(int param0);

    public final cd getValidationStatus(byte param0) {
        if (this.hasMissingInput(true)) {
          return IsaacPacketBuffer.field_r;
        }
        if (this.field_e + 350L > km.correctedCurrentTimeMillis(-1)) {
          return IntrusiveNode.field_a;
        }
        if (param0 < -74) {
          return this.evaluateValidationStatus(0);
        }
        this.recordInputChange(true);
        return this.evaluateValidationStatus(0);
    }

    final static void a(Sprite param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = -param1 + (param4 + param0.field_v) + param3;
          var10 = param8 + param3 + (param4 + param0.field_v);
          var11 = (param0.field_t >> 1) + (param0.field_r + param5);
          SoftwareRasterizer.intersectClip(var9_int, 0, var10, param7 + var11);
          param0.drawAdditive(-1 + param4, param5 - 1, param6);
          param0.drawAdditive(param4 - 1, 1 + param5, param6);
          SoftwareRasterizer.restoreClip(mo.field_w);
          SoftwareRasterizer.intersectClip(1 + var9_int, 0, var10 + 1, var11 + param7);
          param0.drawAdditive(1 + param4, param5 - 1, param6);
          param0.drawAdditive(1 + param4, 1 + param5, param6);
          SoftwareRasterizer.restoreClip(mo.field_w);
          var9_intLifetime1 = -param8 + (param0.field_s + param0.field_v) - (-param4 + param3);
          var10Lifetime1 = param0.field_v + (param0.field_s + (param4 - param3) - param1);
          SoftwareRasterizer.intersectClip(var9_intLifetime1, var11 - param7, var10Lifetime1, 480);
          param0.drawAdditive(param4 - 1, -1 + param5, param6);
          param0.drawAdditive(param4 - 1, 1 + param5, param6);
          SoftwareRasterizer.restoreClip(mo.field_w);
          SoftwareRasterizer.intersectClip(var9_intLifetime1 + param2, var11 - param7, var10Lifetime1 + 1, 480);
          param0.drawAdditive(1 + param4, param5 - 1, param6);
          param0.drawAdditive(param4 + 1, 1 + param5, param6);
          SoftwareRasterizer.restoreClip(mo.field_w);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "eq.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_c = "<col=2>Look out for:</col>";
        field_a = -1.0;
        field_d = 0L;
    }
}
