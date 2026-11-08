/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationMessageWidget extends HotspotTextWidget {
    static UiComponent field_bb;
    private int field_ab;
    static HuffmanCodec field_Z;
    private String field_eb;
    private TextValidator field_db;
    private Sprite field_cb;

    public static void releaseStatics(byte param0) {
        field_bb = null;
        if (param0 < 119) {
          ValidationMessageWidget.releaseStatics((byte) -66);
          field_Z = null;
          return;
        }
        field_Z = null;
    }

    final static void resendPendingQueries(boolean param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        QueuedStatSubmission var4 = null;
        IntrusiveDeque stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TetraLink.field_J;
        try {
          if (!param0) {
            field_Z = (HuffmanCodec) null;
          }
          var4 = (QueuedStatSubmission) (StatefulWidgetRenderer.field_t.first(false));
          while (var4 != null) {
            ViewportController.writeQueuedRecordPacket(param1, var4, 0);
            var4 = (QueuedStatSubmission) (StatefulWidgetRenderer.field_t.next((byte) -70));
          }
          stackIn_8_0 = SecondaryNodeDequeIterator.field_a;
          stackIn_9_1 = !(param0);
          var2 = ((IntrusiveDeque) (Object) stackIn_8_0).first(stackIn_9_1);
          while (var2 != null) {
            GameSession.sendStatQueryRequest((byte) 102, param1);
            var2 = SecondaryNodeDequeIterator.field_a.next((byte) -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var2_ref), "ck.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        ValidationState var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var17;
        Object var18;
        Sprite var19;
        Object var22;
        WidgetTextLayout var28;
        String var5;
        Sprite var20;
        Sprite var21;
        Sprite var23;
        Sprite var24;
        Sprite var26;
        Sprite var27;
        WidgetTextLayout var29;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        ValidationState var6Lifetime1;
        var18 = null;
        var22 = null;
        var13 = TetraLink.field_J;
        var6 = this.field_db.getValidationState(param0 - 57);
        if (FontAndBrightnessHelpers.field_b != var6 &&
          LoadingProgressDialog.field_cb != var6) {
          var5 = this.field_db.getValidationMessage((byte) -73);
          if (var5 == null) {
            var5 = this.field_eb;
          }
          if (!var5.equals(this.field_A)) {
            this.field_A = var5;
            this.rebuildHotspots(~param0);
          }
          super.drawLayer(param0, param1, param2, param3);
          var6 = this.field_db.getValidationState(param0 - 113);
          var29 = (WidgetTextLayout) ((Object) this.field_H);
          var9 = param1 + this.field_t;
          var10 = var29.getTextOriginX((UiWidget) (this), param2, true) + (var29.getTextLayout((UiWidget) (this), false).height(true) >> 1);
          if (FontAndBrightnessHelpers.field_b == var6) {
            var24 = ChatMessage.field_q[0];
            var11 = var24.field_t << 1;
            var12 = var24.field_F << 1;
            if (null == this.field_cb) {
              this.field_cb = new Sprite(var11, var12);
              SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
            } else {
              if (this.field_cb.field_u < var11) {
                this.field_cb = new Sprite(var11, var12);
                SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
              } else {
                if (var12 > this.field_cb.field_E) {
                  this.field_cb = new Sprite(var11, var12);
                  SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
                } else {
                  SectorCacheStore.setRasterTarget((byte) 118, this.field_cb);
                  SoftwareRasterizer.clear();
                }
              }
            }
            var24.drawRotatedAboutPivot(112, 144, var24.field_t << 4, var24.field_F << 4, -this.field_ab << 10, 4096);
            LruTextureCache.popRaster(-581);
            this.field_cb.drawAdditive(var9 - (var24.field_t >> 1), var10 - var24.field_F, 256);
            return;
          }
          if (var6 != LoadingProgressDialog.field_cb) {
            if (QuickChatCommandType.field_h == var6) {
              var26 = ChatMessage.field_q[2];
              var26.drawAdditive(var9, -(var26.field_E >> 1) + var10, 256);
              return;
            }
            if (PlayerContextMenu.field_a == var6) {
              var27 = ChatMessage.field_q[1];
              var27.drawAdditive(var9, -(var27.field_E >> 1) + var10, 256);
            }
            return;
          }
          var23 = ChatMessage.field_q[0];
          var11Lifetime2 = var23.field_t << 1;
          var12Lifetime2 = var23.field_F << 1;
          if (null == this.field_cb) {
            this.field_cb = new Sprite(var11Lifetime2, var12Lifetime2);
            SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
          } else {
            if (this.field_cb.field_u < var11Lifetime2) {
              this.field_cb = new Sprite(var11Lifetime2, var12Lifetime2);
              SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
            } else {
              if (var12Lifetime2 > this.field_cb.field_E) {
                this.field_cb = new Sprite(var11Lifetime2, var12Lifetime2);
                SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
              } else {
                SectorCacheStore.setRasterTarget((byte) 118, this.field_cb);
                SoftwareRasterizer.clear();
              }
            }
          }
          var23.drawRotatedAboutPivot(112, 144, var23.field_t << 4, var23.field_F << 4, -this.field_ab << 10, 4096);
          LruTextureCache.popRaster(-581);
          this.field_cb.drawAdditive(var9 - (var23.field_t >> 1), var10 - var23.field_F, 256);
          return;
        }
        var17 = LoginCredentialType.field_a;
        if (!var17.equals(this.field_A)) {
          this.field_A = var17;
          this.rebuildHotspots(~param0);
        }
        super.drawLayer(param0, param1, param2, param3);
        var6Lifetime1 = this.field_db.getValidationState(param0 - 113);
        var28 = (WidgetTextLayout) ((Object) this.field_H);
        var9Lifetime1 = param1 + this.field_t;
        var10Lifetime1 = var28.getTextOriginX((UiWidget) (this), param2, true) + (var28.getTextLayout((UiWidget) (this), false).height(true) >> 1);
        if (FontAndBrightnessHelpers.field_b != var6Lifetime1 &&
          var6Lifetime1 != LoadingProgressDialog.field_cb) {
          if (QuickChatCommandType.field_h == var6Lifetime1) {
            var20 = ChatMessage.field_q[2];
            var20.drawAdditive(var9Lifetime1, -(var20.field_E >> 1) + var10Lifetime1, 256);
          } else {
            if (PlayerContextMenu.field_a == var6Lifetime1) {
              var21 = ChatMessage.field_q[1];
              var21.drawAdditive(var9Lifetime1, -(var21.field_E >> 1) + var10Lifetime1, 256);
            }
          }
        } else {
          var19 = ChatMessage.field_q[0];
          var11Lifetime1 = var19.field_t << 1;
          var12Lifetime1 = var19.field_F << 1;
          if (null != this.field_cb &&
            this.field_cb.field_u >= var11Lifetime1 &&
            var12Lifetime1 <= this.field_cb.field_E) {
            SectorCacheStore.setRasterTarget((byte) 118, this.field_cb);
            SoftwareRasterizer.clear();
          } else {
            this.field_cb = new Sprite(var11Lifetime1, var12Lifetime1);
            SectorCacheStore.setRasterTarget((byte) 111, this.field_cb);
          }
          var19.drawRotatedAboutPivot(112, 144, var19.field_t << 4, var19.field_F << 4, -this.field_ab << 10, 4096);
          LruTextureCache.popRaster(-581);
          this.field_cb.drawAdditive(var9Lifetime1 - (var19.field_t >> 1), var10Lifetime1 - var19.field_F, 256);
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        try {
          this.field_ab = this.field_ab + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ck.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -384169950) {
            return false;
          }
          field_bb = (UiComponent) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ck.EB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void showLoginDialog(byte param0, boolean param1) {
        if (param0 != 126) {
          return;
        }
        ByteStorage.showLoginPanelWithOptions((byte) -55, param1, false);
    }

    final String getTooltip(int param0) {
        if (param0 == 0) {
          return null;
        }
        this.field_eb = (String) null;
        return null;
    }

    ValidationMessageWidget(TextValidator param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, DiskArchiveRequest.getDefaultTextPainter(-1));
        try {
          this.field_eb = param1;
          this.field_db = param0;
          this.setBounds(param5, param3, -122, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
