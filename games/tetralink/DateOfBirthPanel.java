/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthPanel extends ArrayWidgetContainer implements ButtonActionListener {
    static int[] field_P;
    static int field_R;
    static int[] field_Q;
    private NumericDateInputWidget field_W;
    private TextButton field_T;
    static int[] field_S;
    static int field_V;
    static String field_U;

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_T.field_K = this.field_W.getValidationSource(-104).getValidationState(-68) == PlayerContextMenu.field_a ? true : false;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "lb.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    DateOfBirthPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_W = new NumericDateInputWidget(new InsetTextPainter(10000536), NanoTickClock.field_n, 0, 0, 140, 25);
        this.field_W.setBirthDateValidator(45, new DateOfBirthValidator());
        this.field_T = new TextButton(TextWidgetPainter.field_e, (WidgetListener) (this));
        this.field_I = new UiWidget[]{(UiWidget) ((Object) this.field_W), (UiWidget) ((Object) this.field_T)};
        this.field_T.field_H = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.reapplyBounds((byte) 37);
    }

    final void layoutChildren(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 <= -109) {
          var2 = 250;
          this.field_W.setBounds(25, -25 + (this.field_u + 20) >> 1, -125, -var2 + this.field_F >> 1, 140);
          this.field_T.setBounds(30, (this.field_u - 10 >> 1) + 2, -124, 10 + ((-var2 + this.field_F >> 1) + 140), 100);
          return;
        }
        field_P = (int[]) null;
        var2Lifetime1 = 250;
        this.field_W.setBounds(25, -25 + (this.field_u + 20) >> 1, -125, -var2Lifetime1 + this.field_F >> 1, 140);
        this.field_T.setBounds(30, (this.field_u - 10 >> 1) + 2, -124, 10 + ((-var2Lifetime1 + this.field_F >> 1) + 140), 100);
    }

    final static void readPackedRankingValues(PacketBuffer param0, boolean param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          LoginPanel.field_X = param0.readUnsignedShort(127) << 5;
          var2_int = param0.readUnsignedByte((byte) -99);
          BoardAnimator.field_j = (7 & var2_int) << 18;
          LoginPanel.field_X = LoginPanel.field_X + (var2_int >> 3);
          BoardAnimator.field_j = BoardAnimator.field_j + (param0.readUnsignedShort(127) << 2);
          var2_intLifetime1 = param0.readUnsignedByte((byte) -99);
          DiskArchiveRequest.field_F = var2_intLifetime1 << 15 & 2064384;
          BoardAnimator.field_j = BoardAnimator.field_j + (var2_intLifetime1 >> 6);
          DiskArchiveRequest.field_F = DiskArchiveRequest.field_F + (param0.readUnsignedByte((byte) -99) << 7);
          if (param1) {
            PcmSample var3 = (PcmSample) null;
            DateOfBirthPanel.playSample((PcmSample) null, 38);
          }
          var2_intLifetime2 = param0.readUnsignedByte((byte) -99);
          ReportAbuseDialog.field_Nb = (var2_intLifetime2 & 1) << 16;
          DiskArchiveRequest.field_F = DiskArchiveRequest.field_F + (var2_intLifetime2 >> 1);
          ReportAbuseDialog.field_Nb = ReportAbuseDialog.field_Nb + param0.readUnsignedShort(127);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "lb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_S = null;
        if (param0 == 0) {
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        }
        field_V = 73;
        field_Q = null;
        field_U = null;
        field_P = null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        LruTextureCache.field_d.drawLeft(UiWidget.field_G, param1 + (this.field_t + 4), LruTextureCache.field_d.field_N + this.field_w + (param2 + 4), 16777215, -1);
    }

    public final void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        if (param0 >= 0) {
          return;
        }
        if (this.field_W.getValidationSource(-109).getValidationState(-77) != PlayerContextMenu.field_a) {
          return;
        }
        try {
          GameKeyHandler.writeLoginHandshake(this.field_W.getMonthIndex(false), 0, this.field_W.getDay((byte) 90), this.field_W.getYear((byte) 12));
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "lb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static PlayingSound playSample(PcmSample param0, int param1) {
        RuntimeException var2 = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 573509761) {
            field_U = (String) null;
          }
          stackIn_3_0 = CachedTextLayout.playSoundEffect(-11040, PcmSampleStream.createAtRatePercent(param0, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_U = "Connection lost. <%0>";
        field_S = new int[8192];
        field_Q = new int[8192];
    }
}
