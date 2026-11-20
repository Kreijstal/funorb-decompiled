/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveCompression {
    final static String readCookie(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = HoldTheLine.field_D;
          try {
            try {
              var3 = (String) (JavaScriptBridge.callJavaScript(21896, "getcookies", param2));
              var4 = BlobWriteRequest.split(var3, (byte) -126, ';');
              var5 = 0;
              if (param1 < 4) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ph.C(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] decompressContainer(byte param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new PacketBuffer(param1);
          var3 = var9.readUnsignedByte((byte) -100);
          var4 = var9.readInt(-93);
          if (param0 != -1) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (var4 >= 0 && (RaceSetupMenu.field_C == 0 ||
            !(var4 > RaceSetupMenu.field_C))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(var4, 0, (byte) 101, var13);
              stackIn_24_0 = var5;
              return stackIn_24_0;
            }
            var5_int = var9.readInt(-76);
            if (var5_int >= 0 && (RaceSetupMenu.field_C == 0 ||
              !(var5_int > RaceSetupMenu.field_C))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                Bzip2Decoder.decompress(var12, var5_int, param1, var4, 9);
              } else {
                var7 = MenuList.field_n;
                synchronized (var7) {
                  MenuList.field_n.decompress((byte) -117, var9, var12);
                }
              }
              stackIn_22_0 = var6;
              return stackIn_22_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ph.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void initializeGameSounds(ResourceArchive param0, byte param1, ResourceArchive param2) {
        NamedSoundEffect discarded$0 = null;
        NamedSoundEffect discarded$1 = null;
        NamedSoundEffect discarded$2 = null;
        NamedSoundEffect discarded$3 = null;
        PackedClientOptions.field_a = new SoundCache(param2, param0);
        ArchiveIndex.field_r = ShadedNineSlicePanel.createVehicleEngineSounds(-113, 2000, 60, "f1", 60);
        DialogLayer.field_G = ShadedNineSlicePanel.createVehicleEngineSounds(param1 ^ 51, 1000, 50, "porshe", 50);
        HoverTargetTracker.field_a = ShadedNineSlicePanel.createVehicleEngineSounds(-108, 1000, 55, "dragster", 55);
        if (param1 != -66) {
          return;
        }
        try {
          EncryptedPacketWriter.field_c = ShadedNineSlicePanel.createVehicleEngineSounds(-113, 2000, 64, "dunebuggy", 64);
          OpacityWidget.field_G = ShadedNineSlicePanel.createVehicleEngineSounds(param1 - 57, 2000, 60, "snowcat", 60);
          ValidationIndicator.field_H = ShadedNineSlicePanel.createVehicleEngineSounds(param1 ^ 50, 2000, 70, "snowmobile", 70);
          RaceSetupMenu.field_s = ShadedNineSlicePanel.createVehicleEngineSounds(param1 - 55, 2000, 40, "bmw", 40);
          MusicPatch.field_n = ShadedNineSlicePanel.createVehicleEngineSounds(param1 ^ 49, 2000, 60, "suv", 60);
          discarded$0 = new NamedSoundEffect("engine_start", 70);
          StrongCacheEntry.field_s = new NamedSoundEffect("turbo_whistle", 140);
          ScreenOptionsMenu.field_b = new NamedSoundEffect("afterburner", 80);
          Point2i.field_c = new NamedSoundEffect("tyre_squeal", 100);
          TutorialScriptState.field_a = new NamedSoundEffect("off_the_track", 768);
          TextFieldRenderer.field_t = new NamedSoundEffect("off_the_track_alpine", 768);
          PolarSortVector.field_g = new NamedSoundEffect("alarm_test", 100);
          ArchiveLoadStage.field_i = new NamedSoundEffect("mine_landing_and_armed", 256);
          NamedSoundEffect.field_p = new NamedSoundEffect("mine_explosion", 256);
          RoadFillRenderer.field_b = new NamedSoundEffect("machine_gun_1070ms_loop", 40);
          ValidatedTextField.field_T = new NamedSoundEffect("missile_launch", 256);
          discarded$1 = new NamedSoundEffect("homing_missile_beeps", 100);
          ResizableDialog.field_O = new NamedSoundEffect("explosion_and_shrapnel", 256);
          CheckboxWidget.field_K = new NamedSoundEffect("vehicle-barrier_collision", 100);
          discarded$2 = new NamedSoundEffect("vehicle-vehicle_collision", 120);
          NineSlicePanel.field_h = new NamedSoundEffect("shield_bounce", 140);
          ChatMessage.field_g = new NamedSoundEffect("powerup_collect_low", 92);
          MouseWheelInput.field_d = new NamedSoundEffect("powerup_collect_high", 88);
          TutorialPage.field_i = new NamedSoundEffect("powerup_drop", 100);
          DualNodeHashTable.field_b = PackedClientOptions.field_a.getMusicSample(param1 - 32594, "wacky_boom_kick");
          StrongCacheEntry.field_r = PackedClientOptions.field_a.getSoundEffect("menu_low_beep", (byte) 77);
          PackedClientOptions.field_a.getSoundEffect("menu_high_beep", (byte) 9);
          TexturedRoadFillRenderer.field_j = new NamedSoundEffect("ZD_update_lightning_strike");
          IntWriteRequest.field_m = new NamedSoundEffect("ZD_update_thunder_roll_1");
          MeshMaterial.field_a = new NamedSoundEffect("ZD_update_thunder_roll_2");
          discarded$3 = new NamedSoundEffect("ZD_update_rain_loop");
          HuffmanDecoder.field_c = new StereoMusicSample("car_pass");
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ph.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String readSettingsCookie(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = HoldTheLine.field_D;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              if (param0 > -43) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = var9 + "settings";
              var4 = (String) (JavaScriptBridge.callJavaScript(21896, "getcookies", param1));
              var5 = BlobWriteRequest.split(var4, (byte) -98, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_10_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (LeaderboardRequests.field_a == null) {
              return param1.getParameter("settings");
            }
            stackIn_17_0 = LeaderboardRequests.field_a;
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("ph.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
