/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NotificationMessage extends IntrusiveNode {
    static String field_p;
    RgbSprite field_q;
    String field_u;
    static String field_s;
    static RgbSprite field_o;
    static String field_t;
    static String field_v;
    static String field_w;
    static String field_r;

    public static void releaseStatics(int param0) {
        field_o = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
          PacketBuffer var2 = (PacketBuffer) null;
          NotificationMessage.readBooleanByte((PacketBuffer) null, 92);
        }
        field_t = null;
        field_r = null;
        field_w = null;
    }

    final static void pollUnlockStateReply(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 60 % ((3 - param0) / 43);
          if (!NameValidationHelpers.field_h) {
            if (null == TickClock.field_i) {
              TickClock.field_i = RegistrationRequestDialog.queueOutgoingRequest(4, 19999);
            }
            if (TickClock.field_i.field_t) {
              var6 = DirectByteStorage.field_m;
              var13 = TickClock.field_i.field_s;
              for (var4 = 0; var4 < 8; var4++) {
                var6[var4] = DateOfBirthValidator.bitOr(var6[var4], var13[var4]);
              }
              var8 = ce.field_t;
              var14 = TickClock.field_i.field_s;
              var10 = 0;
              var4Lifetime1 = var10;
              while (8 > var10) {
                var8[var10] = ClientUiHelpers.bitAnd(var8[var10], ~var14[var10]);
                var10++;
              }
              NameValidationHelpers.field_h = true;
              TickClock.field_i = null;
              Projectile.refreshUnlockedPartFlags((byte) 8);
            }
            if (NameValidationHelpers.field_h) {
              LoadingScreenHelpers.dismissLoadingUi(79);
              DesignerPageSetup.createDesignerPages(-104);
            }
          }
          if (!DiskCacheRequest.field_I) {
            if (null == QuickChatHelpDialog.field_ac) {
              QuickChatHelpDialog.field_ac = ClientException.sendTrackedRequest(6, true);
            }
            if (QuickChatHelpDialog.field_ac.field_q) {
              PopupMenuSupport.applySavedPreferences(-1, QuickChatHelpDialog.field_ac.field_t);
              QuickChatHelpDialog.field_ac = null;
              DiskCacheRequest.field_I = true;
              ClockAndCookieHelpers.field_g.writeCipheredOpcode(65, (byte) -117);
              ClockAndCookieHelpers.field_g.writeCipheredOpcode(68, (byte) -117);
              ClockAndCookieHelpers.field_g.writeCipheredOpcode(70, (byte) -117);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1), "ai.A(" + param0 + ')');
        }
    }

    NotificationMessage(RgbSprite param0, String param1) {
        try {
          this.field_u = param1;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean readBooleanByte(PacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -32599) {
            NotificationMessage.releaseStatics(-24);
          }
          var2_int = param0.readUnsignedByte((byte) -123);
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ai.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Reject";
        field_s = "Offer draw";
        field_o = new RgbSprite(540, 140);
        field_w = "<%0> has entered a game.";
        field_t = "Waiting for graphics";
        field_v = "Custom-building of sentinels is available in advanced mode only. Earn 1,000 solarite cubes in multiplayer games or in missions to unlock advanced mode.";
        field_r = "asd";
    }
}
