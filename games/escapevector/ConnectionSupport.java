/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConnectionSupport {
    static PcmSample field_a;

    final static void closeTransport(int guard) {
        if (guard != 16) {
          field_a = (PcmSample) null;
        }
        if (TextLayout.field_c != null) {
          TextLayout.field_c.close(12497);
          TextLayout.field_c = null;
        }
    }

    final static TrackerMusicDefinition loadNamedTrackerMusic(int guard, String groupName, SoundCache sounds, ResourceArchive archive, String fileName) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (guard != 2) {
            field_a = (PcmSample) null;
          }
          int var5_int = archive.findGroupId(-1, groupName);
          int var6 = archive.findFileId(var5_int, fileName, true);
          TrackerMusicDefinition stackIn_3_0 = TrackerMusicLoader.load(guard ^ -15620, archive, sounds, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("nm.D(").append(guard).append(',');
          if (groupName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (sounds == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (archive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (fileName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int bitLength(int value, byte guard) {
        if (guard != 78) {
          field_a = (PcmSample) null;
        }
        int var2 = 0;
        if (value < 0 ||
          value >= 65536) {
          var2 += 16;
          value = value >>> 16;
        }
        if (value >= 256) {
          value = value >>> 8;
          var2 += 8;
        }
        if (16 <= value) {
          var2 += 4;
          value = value >>> 4;
        }
        if (4 <= value) {
          var2 += 2;
          value = value >>> 2;
        }
        if (value >= 1) {
          var2++;
          value = value >>> 1;
        }
        return var2 + value;
    }

    final static void drawButtons(byte guard, int selectedAction, LegacyButton[] buttons) {
        try {
          HudMessage.a(buttons, -1, selectedAction, (byte) -28);
          if (guard > -50) {
            field_a = (PcmSample) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "nm.C(" + guard + ',' + selectedAction + ',' + (buttons != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        if (guard) {
          ConnectionSupport.bitLength(-36, (byte) -52);
        }
        field_a = null;
    }

    final static boolean loadAllSpriteTasks(byte guard, SpriteLoadTask[] tasks) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          boolean var2_int = true;
          if (guard > -71) {
            field_a = (PcmSample) null;
          }
          for (int var3 = 0; var3 < tasks.length; var3++) {
            Sprite var4 = tasks[var3].loadSprite(110);
            if (var4 == null) {
              var2_int = false;
            }
          }
          boolean stackIn_11_0 = var2_int;
          return (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("nm.F(").append(guard).append(',');
          if (tasks == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
