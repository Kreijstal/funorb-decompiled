/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginAndPacketHelpers {
    static int field_c;
    static FullscreenErrorReason field_b;
    static boolean field_a;

    final static boolean pollIncomingPacket(int[] param0, byte param1) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        DelayedPacket var5_ref_bg = null;
        int var5 = 0;
        DelayedPacket var6 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (ValidatedTextWidget.field_T != PendingFlagRequest.field_j) {
            return false;
          }
          var2_int = 26 % ((-18 - param1) / 33);
          var3 = MonotonicClock.monotonicTimeMillis(-22826);
          if (ArchiveIndex.field_h != 0 &&
            TextAndNameCredentials.field_e < 0) {
            var5_ref_bg = (DelayedPacket) (AudioMixerHelpers.field_f.last((byte) 26));
            if (var5_ref_bg != null &&
              var5_ref_bg.field_h < var3) {
              var5_ref_bg.unlink(-27598);
              MeshDepthBuckets.field_b = var5_ref_bg.field_m.length;
              MatchingTextValidator.field_g.position = 0;
              for (var6_int = 0; var6_int < MeshDepthBuckets.field_b; var6_int++) {
                MatchingTextValidator.field_g.payload[var6_int] = var5_ref_bg.field_m[var6_int];
              }
              Scrollbar.field_U = FunOrbApplet.field_t;
              FunOrbApplet.field_t = MessageDialogContent.field_P;
              MessageDialogContent.field_P = TextAndNameCredentials.field_d;
              TextAndNameCredentials.field_d = var5_ref_bg.field_j;
              return true;
            }
          }
          while (true) {
            if (0 > TextAndNameCredentials.field_e) {
              MatchingTextValidator.field_g.position = 0;
              if (!Blast.fillIncomingBuffer((byte) -117, 1)) {
                return false;
              }
              TextAndNameCredentials.field_e = MatchingTextValidator.field_g.readCipheredByte((byte) 126);
              MatchingTextValidator.field_g.position = 0;
              MeshDepthBuckets.field_b = param0[TextAndNameCredentials.field_e];
            }
            if (!PendingHighscoreRequest.isPacketPayloadReady(-2887)) {
              return false;
            }
            if (0 == ArchiveIndex.field_h) {
              Scrollbar.field_U = FunOrbApplet.field_t;
              FunOrbApplet.field_t = MessageDialogContent.field_P;
              MessageDialogContent.field_P = TextAndNameCredentials.field_d;
              TextAndNameCredentials.field_d = TextAndNameCredentials.field_e;
              TextAndNameCredentials.field_e = -1;
              return true;
            }
            var5 = ArchiveIndex.field_h;
            if (UiResourceHelpers.field_a != 0.0) {
              var5 = (int)((double)var5 + SessionSocketHelpers.field_b.nextGaussian() * UiResourceHelpers.field_a);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new DelayedPacket((long)var5 + var3, TextAndNameCredentials.field_e, new byte[MeshDepthBuckets.field_b]);
            for (var7 = 0; MeshDepthBuckets.field_b > var7; var7++) {
              var6.field_m[var7] = MatchingTextValidator.field_g.payload[var7];
            }
            AudioMixerHelpers.field_f.addFirst(0, var6);
            TextAndNameCredentials.field_e = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("gf.D(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          LoginAndPacketHelpers.loadSpriteByName((Js5Archive) null, (String) null, -54, (String) null);
        }
        field_b = null;
    }

    final static String joinCharSequences(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var3 = (String) null;
            LoginAndPacketHelpers.loadSpriteByName((Js5Archive) null, (String) null, 11, (String) null);
          }
          stackIn_3_0 = ReflectionQueueHelpers.joinCharSequenceRange(param1.length, 0, param0 + 127, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static Sprite loadSpriteByName(Js5Archive param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 8) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          var4_int = param0.getGroupIdByName(param3, (byte) 8);
          var5 = param0.getFileIdByName(var4_int, param1, true);
          stackIn_4_0 = ConnectionCleanupHelpers.loadSprite(var5, var4_int, param0, -2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gf.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void beginReconnectLogin(byte param0) {
        RoamingCountryHuman.resetLoginState((byte) -102);
        if (param0 != 41) {
          field_a = true;
        }
        RankingRowHelpers.field_e = true;
        IntRecordReplyHelpers.field_c = true;
        MessageDialogContent.field_S.hideAllDialogs(-636330975);
        PopupMenuBuilder.openLoginProgress(GameKeyHandler.field_a, false, false);
    }

    final static int bitLength(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (255 < param0) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (15 < param0) {
            var2 += 4;
            param0 = param0 >> 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (1 < param0) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        var3 = 23 % ((param1 + 72) / 44);
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (-256 > param0) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < -16) {
          param0 = param0 >> 4;
          var2Lifetime1 += 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_c = 2;
        field_b = new FullscreenErrorReason();
        field_a = false;
    }
}
