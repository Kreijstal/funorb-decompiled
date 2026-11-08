/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusIcon extends TextButton {
    private int field_W;
    static Sprite field_R;
    private TextValidator field_S;
    static BitmapFont field_V;
    static int field_Q;
    static String field_P;
    static String field_U;
    static int field_T;

    final String getTooltip(int param0) {
        if (param0 != 0) {
          this.field_W = 121;
          if (this.field_r) {
            return this.field_S.getValidationMessage((byte) -73);
          }
          return null;
        }
        if (this.field_r) {
          return this.field_S.getValidationMessage((byte) -73);
        }
        return null;
    }

    final boolean focusNext(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -384169950) {
            return false;
          }
          var4 = (UiWidget) null;
          this.focusNext((UiWidget) null, 31);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ab.EB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int parseInteger(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_T = -32;
          }
          stackIn_3_0 = AccountWelcomePanel.parseInt(true, param2, (byte) -87, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        ValidationState var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = TetraLink.field_J;
        super.drawLayer(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = param1 + (this.field_t + (this.field_F >> 1));
        var6 = (this.field_u >> 1) + (this.field_w + param2);
        var8 = this.field_S.getValidationState(param0 - 96);
        if (FontAndBrightnessHelpers.field_b == var8) {
          var16 = ChatMessage.field_q[0];
          var9 = var16.field_t << 1;
          var10 = var16.field_F << 1;
          if (MenuReturnHelpers.field_c == null) {
            MenuReturnHelpers.field_c = new Sprite(var9, var10);
            SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
          } else {
            if (MenuReturnHelpers.field_c.field_u < var9) {
              MenuReturnHelpers.field_c = new Sprite(var9, var10);
              SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
            } else {
              if (MenuReturnHelpers.field_c.field_E < var10) {
                MenuReturnHelpers.field_c = new Sprite(var9, var10);
                SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
              } else {
                SectorCacheStore.setRasterTarget((byte) 120, MenuReturnHelpers.field_c);
                SoftwareRasterizer.clear();
              }
            }
          }
          var16.drawRotatedAboutPivot(112, 144, var16.field_t << 4, var16.field_F << 4, -this.field_W << 10, 4096);
          LruTextureCache.popRaster(-581);
          MenuReturnHelpers.field_c.drawAdditive(-var16.field_t + var5, var6 - var16.field_F, 256);
          return;
        }
        if (LoadingProgressDialog.field_cb != var8) {
          if (var8 == QuickChatCommandType.field_h) {
            var14 = ChatMessage.field_q[2];
            var14.drawAdditive(var5 - (var14.field_u >> 1), var6 - (var14.field_E >> 1), 256);
            return;
          }
          if (var8 != PlayerContextMenu.field_a) {
            return;
          }
          var13 = ChatMessage.field_q[1];
          var13.drawAdditive(var5 - (var13.field_u >> 1), -(var13.field_E >> 1) + var6, 256);
          return;
        }
        var15 = ChatMessage.field_q[0];
        var9Lifetime1 = var15.field_t << 1;
        var10Lifetime1 = var15.field_F << 1;
        if (MenuReturnHelpers.field_c == null) {
          MenuReturnHelpers.field_c = new Sprite(var9Lifetime1, var10Lifetime1);
          SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
        } else {
          if (MenuReturnHelpers.field_c.field_u < var9Lifetime1) {
            MenuReturnHelpers.field_c = new Sprite(var9Lifetime1, var10Lifetime1);
            SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
          } else {
            if (MenuReturnHelpers.field_c.field_E < var10Lifetime1) {
              MenuReturnHelpers.field_c = new Sprite(var9Lifetime1, var10Lifetime1);
              SectorCacheStore.setRasterTarget((byte) 112, MenuReturnHelpers.field_c);
            } else {
              SectorCacheStore.setRasterTarget((byte) 120, MenuReturnHelpers.field_c);
              SoftwareRasterizer.clear();
            }
          }
        }
        var15.drawRotatedAboutPivot(112, 144, var15.field_t << 4, var15.field_F << 4, -this.field_W << 10, 4096);
        LruTextureCache.popRaster(-581);
        MenuReturnHelpers.field_c.drawAdditive(-var15.field_t + var5, var6 - var15.field_F, 256);
    }

    ValidationStatusIcon(TextValidator param0) {
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_R = null;
        if (param0 <= 11) {
          return;
        }
        field_U = null;
        field_V = null;
        field_P = null;
    }

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        try {
          this.field_W = this.field_W + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ab.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_T = -1;
        field_P = "Withdraw invitation to <%0> to join this game";
    }
}
