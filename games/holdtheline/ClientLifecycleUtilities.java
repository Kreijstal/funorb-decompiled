/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientLifecycleUtilities {
    static String[] field_a;
    static int[] field_d;
    static SpriteAsset field_b;
    static String field_c;
    static String field_e;

    final static int getKeyboardIdleTicks(int param0) {
        if (param0 != 0) {
          field_b = (SpriteAsset) null;
          return DisplayNameValidator.field_j;
        }
        return DisplayNameValidator.field_j;
    }

    final static void releaseKeyHandler(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        ResourceArchive var3 = null;
        Throwable decompiledCaughtException = null;
        ResourceArchive var3Lifetime1;
        if (null == MusicCrossfadeStream.field_n) {
          if (!param0) {
            return;
          }
          var3 = (ResourceArchive) null;
          ClientLifecycleUtilities.pollGameAudioLoaded((ResourceArchive) null, (ResourceArchive) null, 26);
          return;
        }
        var1 = MusicCrossfadeStream.field_n;
        synchronized (var1) {
          MusicCrossfadeStream.field_n = null;
        }
        if (param0) {
          var3Lifetime1 = (ResourceArchive) null;
          ClientLifecycleUtilities.pollGameAudioLoaded((ResourceArchive) null, (ResourceArchive) null, 26);
        }
    }

    final static boolean pollGameAudioLoaded(ResourceArchive param0, ResourceArchive param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10302) {
            return true;
          }
          stackIn_10_0 = (param1.tryLoadAllGroups((byte) 65)) && (param0.tryLoadGroup(0, -78)) && (param0.tryLoadNamedGroup("car_pass_left", -93)) && (param0.tryLoadNamedGroup("car_pass_right", 116)) && (param0.tryLoadNamedGroup("wacky_boom_kick", -111));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("co.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void resetBrowserSession(java.applet.Applet param0, int param1) {
        try {
          SessionCookieWriter.writeSessionCookie("", param0, -1);
          AppletNavigation.reloadApplet(-16666, param0);
          if (param1 != 237) {
            field_a = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "co.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void advanceLogoAnimation(int param0) {
        if (StrongCacheEntry.field_q == -TextLineLayout.field_l + param0) {
          StrongCacheEntry.field_q = StrongCacheEntry.field_q + 1;
          return;
        }
        if (StrongCacheEntry.field_q == -TextLineLayout.field_l + 250) {
          StrongCacheEntry.field_q = StrongCacheEntry.field_q + 1;
          return;
        }
        StrongCacheEntry.field_q = StrongCacheEntry.field_q + 1;
    }

    public static void clearSharedReferences(int param0) {
        int var1 = -96 % ((param0 + 48) / 56);
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new String[]{"Kick up some dust on desert tracks", "Cause mayhem in nighttime races", "Dance on ice on alpine tracks", "Put six new vehicles to the test", "The Rink, and other Demolition tracks", "Play in fullscreen mode"};
        field_c = "Username: ";
    }
}
