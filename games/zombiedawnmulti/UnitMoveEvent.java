/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitMoveEvent extends GameEvent {
    static GameScreen field_m;
    private int field_k;
    private int field_q;
    private int field_p;
    static String field_l;
    private int field_o;
    private int field_n;
    private int field_i;
    private int field_j;

    final void apply(int param0, GameScreen param1) {
        try {
          param1.applyUnitMove(this.field_k, this.field_i, -34, this.field_q, this.field_p, this.field_n, this.field_o, this.field_j);
          if (param0 != 0) {
            this.drawDebugOverlay(-4, true, -103, 39);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "np.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.drawDebugOverlay(-45, true, 92, -81);
          if (this.field_j == 1) {
            return;
          }
          EffectAudioHelpers.field_e.drawLeft(Integer.toString(this.field_f - param3), this.field_i >> -param2 + 16, this.field_o >> -param0 + 16, 4, -1);
          EffectAudioHelpers.field_e.drawLeft(Integer.toString(-param3 + this.field_f), -param2 + this.field_n, -param0 + this.field_p, 0, -1);
          SoftwareRasterizer.drawThickLine(this.field_i >> -param2 + 16, this.field_o >> 16 - param0, -param2 + this.field_n, this.field_p - param0, 16711680, 10);
          return;
        }
        if (this.field_j == 1) {
          return;
        }
        EffectAudioHelpers.field_e.drawLeft(Integer.toString(this.field_f - param3), this.field_i >> -param2 + 16, this.field_o >> -param0 + 16, 4, -1);
        EffectAudioHelpers.field_e.drawLeft(Integer.toString(-param3 + this.field_f), -param2 + this.field_n, -param0 + this.field_p, 0, -1);
        SoftwareRasterizer.drawThickLine(this.field_i >> -param2 + 16, this.field_o >> 16 - param0, -param2 + this.field_n, this.field_p - param0, 16711680, 10);
    }

    UnitMoveEvent(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0);
        this.field_i = param6;
        this.field_o = param7;
        this.field_p = param4;
        this.field_q = param5;
        this.field_n = param3;
        this.field_k = param1;
        this.field_j = param2;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_l = null;
        field_m = null;
    }

    static {
        field_l = "Select a zombie!";
    }
}
