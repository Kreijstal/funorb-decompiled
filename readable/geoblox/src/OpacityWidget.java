/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    static String fullscreenAfterAcceptText;
    static String createInvalidEmailAlertText;
    int opacity;
    static ResourceArchive field_F;
    static boolean[] field_G;
    static String createDisplayNameText;

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity = 256;
    }

    final static boolean isLogoAnimationComplete(int methodGuard) {
        if (methodGuard != 7426) {
            createDisplayNameText = (String) null;
        }
        return 250 < DequeCursor.logoAnimationTick ? true : false;
    }

    OpacityWidget(UiWidget content) {
        super(content.widgetX, content.widgetY, content.widgetWidth, content.widgetHeight, (WidgetRenderer) null, (WidgetListener) null);
        try {
            content.setWidgetBounds(this.widgetHeight, this.widgetWidth, (byte) -113, 0, 0);
            this.opacity = 256;
            this.child = content;
        } catch (RuntimeException opacityWidgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) opacityWidgetConstructionFailure), "wj.<init>(" + (content != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_12_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (DualLinkNode.a(-58, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!MessageDialog.isSignedDecimalInt((byte) -123, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ol.a(false, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (-var5 + (var6_int + param1[var8].length()));
              continue;
            }
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            if (param2 >= -12) {
              stackIn_12_0 = (String) null;
              return stackIn_12_0;
            }
            while (true) {
              var8 = param0.indexOf("<%", var5);
              if (0 > var8) {
                discarded$2 = var6.append(param0.substring(var7));
                stackIn_25_0 = var6.toString();
                return stackIn_25_0;
              }
              for (var5 = var8 + 2; var5 < var3_int; var5++) {
                if (DualLinkNode.a(-58, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var9 = param0.substring(2 + var8, var5);
              if (!MessageDialog.isSignedDecimalInt((byte) -125, (CharSequence) ((Object) var9))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var10 = ol.a(false, (CharSequence) ((Object) var9));
              discarded$0 = var6.append(param0.substring(var7, var8));
              var7 = var5;
              discarded$1 = var6.append(param1[var10]);
              continue;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = (RuntimeException) (var3);
          stackIn_28_1 = new StringBuilder().append("wj.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int guardResidue = 16 % ((methodGuard - 1) / 43);
        if (!(renderPass == 0)) {
            return;
        }
        if (null == this.child) {
            return;
        }
        if (this.opacity == 0) {
            return;
        }
        if (this.opacity == 256) {
            this.child.renderWidget(parentX + this.widgetX, parentY + this.widgetY, (byte) 83, renderPass);
            return;
        }
        Sprite contentRaster = new Sprite(this.child.widgetWidth, this.child.widgetHeight);
        Geoblox.setRasterTarget(1, contentRaster);
        this.child.renderWidget(0, 0, (byte) -115, renderPass);
        id.a(true);
        contentRaster.drawAlpha(this.widgetX + parentX, this.widgetY + parentY, this.opacity);
    }

    public static void f(byte param0) {
        field_G = null;
        createInvalidEmailAlertText = null;
        fullscreenAfterAcceptText = null;
        if (param0 != -60) {
            return;
        }
        field_F = null;
        createDisplayNameText = null;
    }

    final static void a(PlatformTaskDispatcher param0, byte param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          if (param0.systemEventQueue == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param0.systemEventQueue.peekEvent()) {
              bc.sleepMillis(0, 1L);
              continue;
            }
            break;
          }
          var4 = 11 / ((param1 - 2) / 48);
          try {
            if (param2 != null) {
              param0.systemEventQueue.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var3_ref);
          stackIn_17_1 = new StringBuilder().append("wj.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static Sprite[] loadSpriteFrames(String resourceName, String groupName, ResourceArchive graphicsArchive, int methodGuard) {
        int archiveGroupId = 0;
        RuntimeException var4 = null;
        int archiveFileId = 0;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 126, groupName);
          archiveFileId = graphicsArchive.findFileId(resourceName, -114, archiveGroupId);
          if (methodGuard != 0) {
            field_G = (boolean[]) null;
          }
          stackIn_3_0 = ll.a(archiveGroupId, (byte) -81, archiveFileId, graphicsArchive);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var4);
          stackIn_6_1 = new StringBuilder().append("wj.C(");
          if (resourceName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (graphicsArchive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createInvalidEmailAlertText = "Please check if address is correct";
        fullscreenAfterAcceptText = "to keep fullscreen or";
        field_G = new boolean[64];
        createDisplayNameText = "Player Name: ";
    }
}
