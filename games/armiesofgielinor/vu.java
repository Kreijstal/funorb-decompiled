/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends fw {
    static SpellMenuGroup field_O;
    static ClientUiComponent field_Q;
    static java.applet.Applet field_L;
    static String field_P;
    static int[] field_N;
    static LobbyRoom currentRoom;

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_K = !this.field_K ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private vu(String param0, WidgetPainter param1, qo param2) {
        super(param0, param1, param2);
        try {
          this.painter = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
          vu.isCurrentRoomOwner(false);
        }
        return currentRoom.ownerAccountId == oh.localAccountId ? true : false;
    }

    final static boolean isChatRecipientAvailable(int obfuscationGuard) {
        if (obfuscationGuard != 6) {
          field_P = (String) null;
        }
        return FixedQuaternion.isOnlineFriendOrRoomMember(dj.chatRecipientAccountId, wm.chatRecipientNameKey, (byte) -116);
    }

    private vu(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
        try {
          this.painter = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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

    vu(String param0, qo param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_K = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_O = null;
        field_P = "Who can join";
        field_N = new int[]{5, 3, 1};
    }
}
