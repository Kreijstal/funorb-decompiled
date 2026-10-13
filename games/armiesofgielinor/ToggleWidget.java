/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleWidget extends InteractiveWidget {
    static SpellMenuGroup field_O;
    static ClientUiComponent field_Q;
    static java.applet.Applet field_L;
    static String field_P;
    static int[] field_N;
    static LobbyRoom currentRoom;

    final void activate(int button, int pointerX, int pointerY, boolean notifyListener) {
        this.active = !this.active ? true : false;
        super.activate(button, pointerX, pointerY, notifyListener);
    }

    private ToggleWidget(String text, WidgetPainter initialPainter, WidgetListener listener) {
        super(text, initialPainter, listener);
        try {
          this.painter = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (text != null ? "{...}" : "null") + ',' + (initialPainter != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 43) {
          field_O = (SpellMenuGroup) null;
        }
        field_Q = null;
        field_O = null;
        field_P = null;
        field_L = null;
        field_N = null;
        currentRoom = null;
    }

    final static boolean isCurrentRoomOwner(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          ToggleWidget.isCurrentRoomOwner(false);
        }
        return currentRoom.ownerAccountId == ChannelBaseVolumeConsoleCommand.localAccountId ? true : false;
    }

    final static boolean isChatRecipientAvailable(int obfuscationGuard) {
        if (obfuscationGuard != 6) {
          field_P = (String) null;
        }
        return FixedQuaternion.isOnlineFriendOrRoomMember(dj.chatRecipientAccountId, wm.chatRecipientNameKey, (byte) -116);
    }

    private ToggleWidget(String text, WidgetListener listener) {
        this(text, t.field_c.field_j, listener);
        try {
          this.painter = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (text != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        IndexedSprite var12 = null;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != nr.activeFoliageSprites &&
            param4 >= 0 &&
            param4 < nr.activeFoliageSprites.length &&
            null != nr.activeFoliageSprites[param4]) {
            param5 = param5 << 8 | param5;
            var7_int = param5 >> 1 ^ param5;
            for (var10 = 0; var10 < 4; var10++) {
              var8 = 40 + (-44 + (var7_int & 7)) + CachedArchiveProvider.field_y[var10][0];
              var9 = 20 + CachedArchiveProvider.field_y[var10][1] + ((param5 & 3) - 64);
              if (param1) {
                var9 = var9 >> 1;
                var8 = var8 >> 1;
              }
              stackIn_13_0 = param0;
              stackIn_14_1 = !(var9 <= param3 - 60);
              if (stackIn_13_0 ^ stackIn_14_1) {
                var11 = 0 + param5 % 6;
                if (var11 >= 0 &&
                  var11 < nr.activeFoliageSprites.length &&
                  nr.activeFoliageSprites[var11] != null) {
                  var12 = nr.activeFoliageSprites[var11];
                  if (param1) {
                    var12.d(db.a(true, param2 + var8), MatchConditionEntry.a(var9 + param3, (byte) 94));
                  } else {
                    var12.draw(db.a(true, var8 + param2), MatchConditionEntry.a(var9 + param3, (byte) 94));
                  }
                }
              }
              param5 = param5 >> 1;
              var7_int = var7_int >> 1;
            }
            if (param6 != 1) {
              field_N = (int[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7), "vu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ToggleWidget(String text, WidgetListener listener, boolean active) {
        this(text, listener);
        try {
          this.active = active ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (text != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + active + ')');
        }
    }

    static {
        field_O = null;
        field_P = "Who can join";
        field_N = new int[]{5, 3, 1};
    }
}
