/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementStatusRequest extends IntrusiveNode {
    int[] values;
    static SpriteAsset field_l;
    boolean completed;
    static int requestedBackground;
    int unlockedMask;

    public static void clearSharedReferences(byte param0) {
        if (param0 > -48) {
          field_l = (SpriteAsset) null;
        }
        field_l = null;
    }

    final static void readBestChampionshipTime(boolean param0, IsaacPacketBuffer param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        IsaacPacketBuffer var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            var5 = (IsaacPacketBuffer) null;
            AchievementStatusRequest.readBestChampionshipTime(true, (IsaacPacketBuffer) null, -15);
          }
          var3_int = MenuSelectionController.readOptionalBits(16, (byte) -96, param1);
          var4 = AccountProtocolContext.field_c[param2];
          if (var4 != -1 && (var4 < var3_int ||
            var3_int == -1)) {
            ReflectionCheckSupport.field_a = true;
            return;
          }
          AccountProtocolContext.field_c[param2] = var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean isAnyKeyPressed(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param1 != -1) {
            return true;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param0.length) {
              return false;
            }
            if (!IterableSecondaryNodeDeque.field_g[param0[var2_int]]) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ma.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean hasStatusButtonCookie(int param0) {
        if (param0 != 0) {
          return true;
        }
        return BoundaryLoopClipper.hasStatusButtonCookie(GameKeyHandler.getApplet(97), false);
    }

    final static void startSelectedRace(int param0, boolean param1) {
        int var3;
        var3 = HoldTheLine.field_D;
        if (param0 != -21383) {
          AchievementStatusRequest.clearSharedReferences((byte) 26);
        }
        if (PolarSortVector.getChampionshipAccessStatus((byte) 20, ArchiveIndex.getSelectedCourse((byte) -49).field_p) != 0) {
          return;
        }
        PathWaypoint.field_o = null;
        ClientException.field_c = 0;
        TexturedRoadFillRenderer.selectMusicTrack(20830, 3 + StrongCacheEntry.field_w);
        CheckboxRenderer.field_x = 3;
        ScreenOptionsMenu.field_g = new int[4];
        if (7 != DelegatingCanvas.field_d) {
          if (1 != DelegatingCanvas.field_d &&
            !Vector2i.field_c) {
            AgeValidator.field_o = false;
          }
          AlternateUsernameLoginCredentials.requestBackground(1, param0 ^ 21498);
          ResourceArchiveFactory.field_b = ArchiveIndex.getSelectedCourse((byte) -49);
          if (UsernameLoginCredentials.pollRaceGraphicsLoaded(ResourceArchiveFactory.field_b, true)) {
            MusicPatchPcmStream.field_r = new RaceWorld(ResourceArchiveFactory.field_b, DelegatingCanvas.field_d, Vector2i.field_c, AgeValidator.field_o, IntArrayReadRequest.field_l, IntrusiveDeque.field_b);
          } else {
            DiskCacheStore.field_i = IntrusiveDeque.field_b;
            ArchiveRequest.field_r = DelegatingCanvas.field_d;
            MusicPatchPcmStream.field_r = null;
            QuickChatPhraseDefinition.field_r = IntArrayReadRequest.field_l;
            PlayerStatsRequest.field_k = AgeValidator.field_o;
            BlobWriteRequest.field_j = Vector2i.field_c;
          }
          EntitySound.field_j = true;
          TrackObject.switchMenu(param1, false, -1);
        } else {
          Vector2i.field_c = false;
          EntitySound.field_l = 4;
          IntArrayReadRequest.field_j = new int[4];
          AgeValidator.field_o = false;
          IntrusiveDeque.field_b = -1;
          TextWidgetStyle.field_g = 3;
          ClientBackgroundRenderer.field_a = LoginForm.field_P;
          EntitySound.field_m = new int[MenuList.field_l[StrongCacheEntry.field_w]];
          InterfaceLoadingStatus.field_b = 859978912;
          CurvedRoadSegment.field_y = 0;
          LayeredWidgetStyle.field_d = 1913842707 + ((1 & StrongCacheEntry.field_w) << 1) + ((2 & StrongCacheEntry.field_w) >> 1);
          GrowableStringList.field_c = -1134004831;
          MenuHitTesting.field_a = -1329759026;
          IntArrayReadRequest.field_l = RotatedSpriteAsset.field_g[ArchiveIndex.getSelectedCourse((byte) -49).field_p][0];
          ChatMessage.startChampionshipCourse(param1, -79);
          ((GameMenu) (CollisionGeometry.field_a[10])).carouselOffset = 480.0f;
        }
    }

    AchievementStatusRequest() {
        this.completed = false;
    }

    static {
        requestedBackground = 1;
    }
}
