/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlobSubmission extends IntrusiveNode {
    static String field_k;
    static DraggableWidget field_g;
    static int[] field_j;
    static int[] field_p;
    byte[] payload;
    static long field_i;
    static String field_e;
    static String field_n;
    static ArchivePreloader field_h;
    static String field_l;
    int requestCrc;
    static UiLayoutNode field_f;

    final static void writeSettingsCookie(java.applet.Applet param0, boolean param1, String param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          HighScoreSubmission var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            wk.field_b = param2;
            try {
              var7 = param0.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (!param1) {
                var6 = (HighScoreSubmission) null;
                BlobSubmission.writeHighScoreSubmission(-99, 111, (HighScoreSubmission) null);
              }
              var8 = var7 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (0 != param2.length()) {
                var5Lifetime6 = var8 + "; Expires=" + SoundCache.formatCookieExpiry(MonotonicClock.monotonicMillis(118) + 94608000000L, -128) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              AppletJavaScriptBridge.evaluateScript("document.cookie=\"" + var5Lifetime6 + "\"", param0, (byte) 115);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            KitStyleTile.a(param0, (byte) 103);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("mp.C(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        CipherPacketBuffer var2 = or.field_d;
        var2.b(param0, (byte) 109);
        var2.writeByte(127, 1);
        var2.writeByte(103, 3);
        if (param1 >= 76) {
          return;
        }
        field_i = 81L;
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_h = null;
        if (param0 == 1) {
          field_j = null;
          field_e = null;
          field_f = null;
          field_g = null;
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
        field_e = (String) null;
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_k = null;
        field_n = null;
        field_l = null;
    }

    final static void writeHighScoreSubmission(int param0, int param1, HighScoreSubmission param2) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        CipherPacketBuffer var7 = or.field_d;
        CipherPacketBuffer var8 = var7;
        var8.b(param1, (byte) -58);
        var8.field_n = var8.field_n + 1;
        int var4 = var8.field_n;
        if (param0 < 40) {
          return;
        }
        try {
          var8.writeByte(125, 1);
          var8.writeShort(-1207444472, param2.field_k);
          var8.writeShort(-1207444472, param2.field_g);
          var8.writeShort(-1207444472, param2.field_h);
          var8.writeInt(-79, param2.field_n);
          var8.writeInt(-81, param2.field_e);
          var8.writeInt(-120, param2.field_i);
          var8.writeInt(-49, param2.field_f);
          var8.writeByte(124, param2.field_r.length);
          for (var5 = 0; param2.field_r.length > var5; var5++) {
            var7.writeInt(-61, param2.field_r[var5]);
          }
          var8.appendCrc32(var4, false);
          var8.backpatchByteLength(62, var8.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "mp.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private BlobSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new int[128];
        field_k = "Trinkets";
        field_e = "Breaking real-world laws";
        field_p = new int[]{0, 1, 2};
        field_l = "(in auction)";
        field_n = "<col=ff0000>Warning:</col> This player's trinket slots are part of the member's expansion for Kickabout - subscribe to FunOrb to make use of them. Any trinkets this player has equipped will have no effect in the game.";
    }
}
