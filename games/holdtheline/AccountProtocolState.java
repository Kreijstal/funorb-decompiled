/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountProtocolState {
    static String field_b;
    static boolean field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void fillGouraudTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = HoldTheLine.field_D;
        if (param8 == -27987) {
          if (param0 < param15) {
            if (param10 > param15) {
              GouraudTriangleRasterizer.fillGouraudTriangleRows(param13, param10, param3, param4, param5, param8 + 27986, param11, param6, SoftwareRasterizer.pixels, param2, param7, param12, param15, param9, param14, param0, param1);
              return;
            }
            if (param0 < param10) {
              GouraudTriangleRasterizer.fillGouraudTriangleRows(param13, param15, param14, param11, param6, -1, param4, param5, SoftwareRasterizer.pixels, param2, param7, param1, param10, param9, param3, param0, param12);
              return;
            }
            GouraudTriangleRasterizer.fillGouraudTriangleRows(param3, param15, param14, param2, param6, -1, param4, param9, SoftwareRasterizer.pixels, param11, param12, param1, param0, param5, param13, param10, param7);
            return;
          }
          if (param10 > param0) {
            GouraudTriangleRasterizer.fillGouraudTriangleRows(param14, param10, param3, param2, param5, -1, param11, param9, SoftwareRasterizer.pixels, param4, param1, param12, param0, param6, param13, param15, param7);
            return;
          }
          if (param10 > param15) {
            GouraudTriangleRasterizer.fillGouraudTriangleRows(param14, param0, param13, param11, param9, -1, param2, param5, SoftwareRasterizer.pixels, param4, param1, param7, param10, param6, param3, param15, param12);
            return;
          }
          GouraudTriangleRasterizer.fillGouraudTriangleRows(param3, param0, param13, param4, param9, -1, param2, param6, SoftwareRasterizer.pixels, param11, param12, param7, param15, param5, param14, param10, param1);
          return;
        }
        AccountProtocolState.fillGouraudTriangle(79, 8, 1, 71, -23, 82, 71, -117, -127, 70, 18, -29, -62, 31, 23, -90);
        if (param0 < param15) {
          if (param10 > param15) {
            GouraudTriangleRasterizer.fillGouraudTriangleRows(param13, param10, param3, param4, param5, param8 + 27986, param11, param6, SoftwareRasterizer.pixels, param2, param7, param12, param15, param9, param14, param0, param1);
            return;
          }
          if (param0 < param10) {
            GouraudTriangleRasterizer.fillGouraudTriangleRows(param13, param15, param14, param11, param6, -1, param4, param5, SoftwareRasterizer.pixels, param2, param7, param1, param10, param9, param3, param0, param12);
            return;
          }
          GouraudTriangleRasterizer.fillGouraudTriangleRows(param3, param15, param14, param2, param6, -1, param4, param9, SoftwareRasterizer.pixels, param11, param12, param1, param0, param5, param13, param10, param7);
          return;
        }
        if (param10 > param0) {
          GouraudTriangleRasterizer.fillGouraudTriangleRows(param14, param10, param3, param2, param5, -1, param11, param9, SoftwareRasterizer.pixels, param4, param1, param12, param0, param6, param13, param15, param7);
          return;
        }
        if (param10 > param15) {
          GouraudTriangleRasterizer.fillGouraudTriangleRows(param14, param0, param13, param11, param9, -1, param2, param5, SoftwareRasterizer.pixels, param4, param1, param7, param10, param6, param3, param15, param12);
          return;
        }
        GouraudTriangleRasterizer.fillGouraudTriangleRows(param3, param0, param13, param4, param9, -1, param2, param6, SoftwareRasterizer.pixels, param11, param12, param7, param15, param5, param14, param10, param1);
    }

    final boolean isConnectedState(int param0) {
        if (param0 != -1) {
          ResourceArchive var3 = (ResourceArchive) null;
          AccountProtocolState.loadSprite(-92, -12, -33, (ResourceArchive) null);
          if (SoundPlayback.field_l == this) {
            return true;
          }
          if (this != ScoreSubmission.field_s) {
            return this == ReflectionCheckSupport.field_b ? true : false;
          }
          return true;
        }
        if (SoundPlayback.field_l == this) {
          return true;
        }
        if (this == ScoreSubmission.field_s) {
          return true;
        }
        if (this != ReflectionCheckSupport.field_b) {
          return false;
        }
        return true;
    }

    final static boolean isPasswordAllowed(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (IntArrayReadRequest.containsNonAlphanumeric(0, param2)) {
            return false;
          }
          if (DelayedServerPacket.hasRepeatedCharacter(param2, 1)) {
            return false;
          }
          if (TrackCurve.hasInvalidPasswordLength(param2, (byte) -27)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (param0 >= -75) {
            return false;
          }
          if (AccountUiUtilities.containsForwardOrReversed(param2, (byte) 104, param1)) {
            return false;
          }
          if (LeaderboardPlayer.containsForwardOrReversed(param2, param1, 95)) {
            return false;
          }
          if (!GzipDecompressor.containsNameWithoutUnderscores((byte) -127, param2, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ll.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static Sprite loadSprite(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!TexturedPolygonRenderer.decodeArchivedSpriteSheet(param2, param1, (byte) -27, param3)) {
            stackIn_2_0 = null;
            return (Sprite) (stackIn_2_0);
          }
          if (param0 != -1) {
            field_b = (String) null;
          }
          stackIn_6_0 = CourseObjectSlot.buildDecodedSprite(true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ll.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 124) {
          return;
        }
        field_b = null;
    }

    final static void setMusicVolume(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        NanoTickClock.field_e = param1;
        if (null == ShadedNineSlicePanel.field_m) {
          var2 = 9 % ((-69 - param0) / 38);
          if (null != MeshLighting.field_a) {
            MeshLighting.field_a.setMasterVolume(param1, -32284);
          }
          return;
        }
        ShadedNineSlicePanel.field_m.setMasterVolume(param1, false);
        var2Lifetime1 = 9 % ((-69 - param0) / 38);
        if (null != MeshLighting.field_a) {
          MeshLighting.field_a.setMasterVolume(param1, -32284);
        }
    }

    static {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
