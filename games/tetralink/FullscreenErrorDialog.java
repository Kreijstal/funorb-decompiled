/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenErrorDialog extends ResizableDialog implements ButtonActionListener {
    static int[] field_gb;
    static String field_fb;
    static MusicTrack[] field_bb;
    static String[] field_db;
    static UiComponent field_eb;
    static String field_ab;
    private TextButton field_Y;
    static volatile int field_Z;
    static DiskCacheWorker field_X;
    static VerticalScrollbar field_cb;

    public static void releaseStatics(byte param0) {
        field_db = null;
        if (param0 > -111) {
          field_cb = (VerticalScrollbar) null;
        }
        field_fb = null;
        field_eb = null;
        field_cb = null;
        field_X = null;
        field_gb = null;
        field_bb = null;
        field_ab = null;
    }

    final static void resendQueuedRequests(boolean param0, int param1) {
        int var3 = 0;
        QueuedListRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TetraLink.field_J;
        try {
          var4 = (QueuedListRequest) (DelayedIncomingPacket.field_p.first(false));
          if (!param0) {
            return;
          }
          while (var4 != null) {
            DiskArchiveRequest.writeEntryRequestPacket(-74, param1, var4);
            var4 = (QueuedListRequest) (DelayedIncomingPacket.field_p.next((byte) -70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2), "qc.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final TextButton appendButton(int param0, WidgetListener param1, String param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param2, param1);
          var4.field_H = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var5 = this.field_u - 6;
          this.field_u = this.field_u + 38;
          var4.setBounds(30, var5, 57, 15, -16 + (-14 + this.field_F));
          if (param0 != 6223) {
            field_fb = (String) null;
          }
          this.addChild(var4, 10);
          this.reapplyBounds((byte) 55);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("qc.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    FullscreenErrorDialog(WidgetContainer param0, JoinStatusTextHelpers param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var4 = null;
        try {
          var3 = null;
          if (param1 == LongAndTextCredentials.field_l) {
            var3 = MusicPatchPcmStream.field_v;
          } else {
            if (ChatMessageReader.field_d != param1) {
              if (PointerTrailBubble.field_o == param1) {
                var3 = PendingSubmission.field_p;
                this.field_u = this.field_u + 30;
              }
            } else {
              var3 = MiscTextGlobals.field_c;
              this.field_u = this.field_u + 10;
              if (DualLinkDeque.canResizeViewport(0)) {
                this.field_u = this.field_u + 20;
                var3 = AgeValidator.field_s;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.field_F = this.field_F;
          var4.field_w = 50;
          var4.field_u = 80;
          var4.field_t = 0;
          var4.field_H = (WidgetPainter) ((Object) new TextWidgetPainter(LruTextureCache.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 10);
          this.field_Y = this.appendButton(6223, (WidgetListener) (this), DebouncedValidator.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qc.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_Y == param1) {
            this.hideFullscreenError((byte) -113);
          }
          if (param0 >= 0) {
            FullscreenErrorDialog.releaseStatics((byte) 23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("qc.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void hideFullscreenError(byte param0) {
        if (!this.field_K) {
          return;
        }
        int var2 = 51 / ((param0 + 38) / 47);
        this.field_K = false;
    }

    static {
        int var0 = 0;
        field_fb = "That name is not available";
        field_Z = 0;
        field_ab = "More suggestions";
        field_gb = new int[8];
        for (var0 = 0; var0 < 8; var0++) {
          field_gb[var0] = -1;
        }
        field_gb[7] = 0;
    }
}
