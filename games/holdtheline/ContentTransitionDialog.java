/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    private int transitionTicks;
    private int headerHeight;
    private ContentTransitionState transitionState;
    private int fadeOutDuration;
    private UiWidget pendingContent;
    private int fadeInDuration;
    static QuickChatDynamicCommand field_ib;
    static Sprite field_ab;
    static int field_bb;
    private int resizeDuration;
    private OpacityWidget contentWrapper;
    static String field_hb;

    final void finishResize(boolean param0) {
        if (null == this.transitionState) {
          super.finishResize(param0);
          return;
        }
        if (this.transitionState != CurvedRoadSegment.field_G) {
          this.setCenteredSize(537342017, this.pendingContent.width + 12, 12 - (-this.headerHeight - this.pendingContent.height));
          this.installContent(this.pendingContent, -100);
        } else {
          this.transitionState = null;
          this.contentWrapper.opacity = 256;
          super.finishResize(param0);
          return;
        }
        this.transitionState = null;
        this.contentWrapper.opacity = 256;
        super.finishResize(param0);
    }

    boolean updateAnimation(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 == 39) {
          if (null == this.transitionState) {
            return super.updateAnimation((byte) 39);
          }
          if (this.transitionState == dg.field_a) {
            fieldTemp$0 = this.transitionTicks + 1;
            this.transitionTicks = this.transitionTicks + 1;
            if (this.fadeOutDuration == fieldTemp$0) {
              this.transitionState = DialogLayer.field_M;
              this.animateResize(117, 12 + this.pendingContent.width, this.resizeDuration, 12 + (this.headerHeight + this.pendingContent.height));
              this.transitionTicks = 0;
              this.contentWrapper.opacity = 0;
              return super.updateAnimation((byte) 39);
            }
            this.contentWrapper.opacity = -((this.transitionTicks << 8) / this.fadeOutDuration) + 256;
            return super.updateAnimation((byte) 39);
          }
          if (CurvedRoadSegment.field_G != this.transitionState) {
            return super.updateAnimation((byte) 39);
          }
          fieldTemp$1 = this.transitionTicks + 1;
          this.transitionTicks = this.transitionTicks + 1;
          if (this.fadeInDuration != fieldTemp$1) {
            this.contentWrapper.opacity = (this.transitionTicks << 8) / this.fadeInDuration;
            return super.updateAnimation((byte) 39);
          }
          this.transitionState = null;
          this.contentWrapper.opacity = 256;
          return super.updateAnimation((byte) 39);
        }
        field_hb = (String) null;
        if (null == this.transitionState) {
          return super.updateAnimation((byte) 39);
        }
        if (this.transitionState == dg.field_a) {
          fieldTemp$2 = this.transitionTicks + 1;
          this.transitionTicks = this.transitionTicks + 1;
          if (this.fadeOutDuration == fieldTemp$2) {
            this.transitionState = DialogLayer.field_M;
            this.animateResize(117, 12 + this.pendingContent.width, this.resizeDuration, 12 + (this.headerHeight + this.pendingContent.height));
            this.transitionTicks = 0;
            this.contentWrapper.opacity = 0;
            return super.updateAnimation((byte) 39);
          }
          this.contentWrapper.opacity = -((this.transitionTicks << 8) / this.fadeOutDuration) + 256;
          return super.updateAnimation((byte) 39);
        }
        if (CurvedRoadSegment.field_G != this.transitionState) {
          return super.updateAnimation((byte) 39);
        }
        int fieldTemp$3 = this.transitionTicks + 1;
        this.transitionTicks = this.transitionTicks + 1;
        if (this.fadeInDuration != fieldTemp$3) {
          this.contentWrapper.opacity = (this.transitionTicks << 8) / this.fadeInDuration;
          return super.updateAnimation((byte) 39);
        }
        this.transitionState = null;
        this.contentWrapper.opacity = 256;
        return super.updateAnimation((byte) 39);
    }

    void setContent(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -27 % ((param1 + 38) / 50);
          this.pendingContent = param0;
          if (this.transitionState == DialogLayer.field_M) {
            this.animateResize(67, 12 + this.pendingContent.width, this.resizeDuration, this.pendingContent.height + 12 + this.headerHeight);
            this.transitionTicks = 0;
            return;
          }
          if (this.transitionState == dg.field_a) {
            return;
          }
          this.transitionTicks = 0;
          this.transitionState = dg.field_a;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dc.HA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void installContent(UiWidget param0, int param1) {
        try {
          if (null != this.contentWrapper) {
            this.contentWrapper.unlink(0);
          }
          if (param0 == null) {
            this.contentWrapper = new OpacityWidget();
          } else {
            param0.setBounds(6, (byte) 122, this.headerHeight + 6, param0.height, param0.width);
            this.contentWrapper = new OpacityWidget(param0);
          }
          this.addChild(true, this.contentWrapper);
          if (param1 != -100) {
            this.transitionTicks = -75;
          }
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dc.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (null != this.contentWrapper) {
            if (param1 == 98) {
              this.contentWrapper.requestFocus(param0, -25823);
            }
            if (param1 == 99) {
              this.contentWrapper.requestFocus(param0, -25823);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dc.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_hb = null;
        field_ib = null;
        field_ab = null;
        if (param0) {
          field_ab = (Sprite) null;
        }
    }

    final static int m(int param0) {
        if (param0 != 29675) {
          ContentTransitionDialog.clearSharedReferences(false);
          return ua.field_a;
        }
        return ua.field_a;
    }

    final boolean finishAnimations(boolean param0) {
        this.finishResize(false);
        if (!param0) {
          this.fadeOutDuration = 23;
          return super.finishAnimations(param0);
        }
        return super.finishAnimations(param0);
    }

    final void onResizeComplete(int param0) {
        if (dg.field_a == this.transitionState) {
          return;
        }
        this.transitionTicks = 0;
        this.transitionState = CurvedRoadSegment.field_G;
        if (param0 < -100) {
          this.installContent(this.pendingContent, -100);
          this.pendingContent = null;
          this.contentWrapper.opacity = 0;
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.setContent((UiWidget) null, (byte) -61);
        this.installContent(this.pendingContent, -100);
        this.pendingContent = null;
        this.contentWrapper.opacity = 0;
    }

    ContentTransitionDialog(DialogLayer param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.width + 12, param1.height + (param2 + 12));
        try {
          this.resizeDuration = param4;
          this.fadeInDuration = param3;
          this.fadeOutDuration = param3;
          this.headerHeight = param2;
          this.installContent(param1, -100);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static CurvedRoadSegment sliceCurvedRoadSegment(float param0, int param1, float param2, CurvedRoadSegment param3) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        CurvedRoadSegment var6 = null;
        CurvedRoadSegment stackIn_2_0 = null;
        CurvedRoadSegment stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = param3.startAngle + (param3.endAngle - param3.startAngle) * param0;
          var5 = param3.startAngle + (-param3.startAngle + param3.endAngle) * param2;
          var6 = new CurvedRoadSegment(param3.center, param3.radius, var4_float, var5, param3.layer, param3.leftRoadOffset, param3.rightRoadOffset, param3.leftCollisionOffset, param3.rightCollisionOffset, param3.controlPathStart, param3.controlPathEnd, param3.controlPathControl, param3.field_w, param3.field_s, param3.field_m, param3.field_x, param3.field_t, param3.field_q);
          var6.controlPathStartParameter = (param3.controlPathEndParameter - param3.controlPathStartParameter) * param0 + param3.controlPathStartParameter;
          var6.layerSlope = param3.layerSlope;
          var6.controlPathEndParameter = (-param3.controlPathStartParameter + param3.controlPathEndParameter) * param2 + param3.controlPathStartParameter;
          if (param1 == -18895) {
            stackIn_4_0 = var6;
            return stackIn_4_0;
          }
          stackIn_2_0 = (CurvedRoadSegment) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_ib = new QuickChatDynamicCommand(12, 0, 1, 0);
        field_hb = "Error connecting to server. Please try using a different server.";
    }
}
