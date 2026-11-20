/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PlayerStatsRequest extends IntrusiveNode {
    int rowLimit;
    static boolean field_k;
    static PolarSortVector[] field_l;
    int requestId;
    static IndexedSprite[] field_m;
    static String field_n;

    final static void flushServerPackets(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (IterableSecondaryNodeDeque.field_h != null && (param0 < 0 ||
            AccountProtocolContext.field_f == ReflectionCheckSupport.field_b)) {
            if (param1 == IsaacPacketBuffer.field_p.position &&
              BoundaryLoopTracer.monotonicTimeMillis(-1) > (10000L + MatchingTextValidator.field_l)) {
              IsaacPacketBuffer.field_p.writeCipheredOpcode((byte) 33, param0);
            }
            if (IsaacPacketBuffer.field_p.position > 0) {
              try {
                IterableSecondaryNodeDeque.field_h.write(IsaacPacketBuffer.field_p.position, IsaacPacketBuffer.field_p.payload, 0, 1);
                MatchingTextValidator.field_l = BoundaryLoopTracer.monotonicTimeMillis(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ServerConnectionState.closeServerConnection(-28036);
              }
              IsaacPacketBuffer.field_p.position = 0;
            }
            return;
          }
          IsaacPacketBuffer.field_p.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_n = null;
        if (param0 >= -41) {
          field_l = (PolarSortVector[]) null;
        }
        field_l = null;
        field_m = null;
    }

    private PlayerStatsRequest() throws Throwable {
        throw new Error();
    }

    final static EmailValidationResult createEmailValidationRequest(String param0, int param1) {
        RuntimeException var2 = null;
        EmailValidationResult stackIn_2_0 = null;
        EmailValidationResult stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -7079) {
            stackIn_4_0 = new EmailValidationResult(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (EmailValidationResult) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void processRaceResult(int param0, boolean param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        float stackIn_31_0 = 0.0f;
        float stackIn_59_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        String var9 = null;
        RaceVehicle var10 = null;
        RaceVehicle var11 = null;
        RaceVehicle var12 = null;
        RaceVehicle var13 = null;
        int var3_intLifetime1;
        float var5Lifetime1;
        float var6Lifetime1;
        float var7Lifetime1;
        int var3_intLifetime1Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (NameAvailabilityResult.field_e) {
            NameAvailabilityResult.field_e = false;
            GrowableStringList.savePlayerProgress(param0 - 7);
          }
          if (3 == MusicPatchPcmStream.field_r.gameMode) {
            TrackObject.switchMenu(param1, false, 0);
            return;
          }
          OutlinedRoadStripRenderer.field_r = -1;
          if (DelegatingCanvas.field_d != 7) {
            if (MusicPatchPcmStream.field_r.raceFinished &&
              !param2) {
              if (0 == DelegatingCanvas.field_d) {
                CheckboxRenderer.field_x = 4;
                for (var3_int = 0; var3_int < 4; var3_int++) {
                  var10 = MusicPatchPcmStream.field_r.vehicles[var3_int];
                  var12 = var10;
                  if (MusicPatchPcmStream.field_r.lapLimit >= var12.lapsCompleted) {
                    if (var12.courseProgress < var12.furthestCourseProgress) {
                      stackIn_31_0 = var12.courseProgress;
                    } else {
                      stackIn_31_0 = var12.furthestCourseProgress;
                    }
                    var5 = stackIn_31_0;
                    var6 = EmailDomainValidator.normalizedCourseProgress(MusicPatchPcmStream.field_r.roadSegments, 1, var5);
                    var7 = (-1.0f + ((float)var12.lapsCompleted + var6)) / (float)MusicPatchPcmStream.field_r.lapLimit;
                    if (0.0f == var7) {
                      ScreenOptionsMenu.field_g[var3_int] = -1;
                    } else {
                      ScreenOptionsMenu.field_g[var3_int] = (int)((float)MusicPatchPcmStream.field_r.field_ob / var7);
                      if (ScreenOptionsMenu.field_g[var3_int] > MusicPatchPcmStream.field_r.field_ob + 1000) {
                        ScreenOptionsMenu.field_g[var3_int] = -1;
                      }
                    }
                  } else {
                    ScreenOptionsMenu.field_g[var3_int] = var10.field_Pb;
                  }
                }
                NetworkArchiveRequest.recordBestCourseTime(MusicPatchPcmStream.field_r.vehicles[0].racePosition, StrongCacheEntry.field_w, LoginForm.field_P, MusicPatchPcmStream.field_r.field_ob, -126);
              } else {
                if (2 != DelegatingCanvas.field_d) {
                  throw new RuntimeException();
                }
                CheckboxRenderer.field_x = 5;
              }
              TrackObject.switchMenu(param1, false, 11);
              return;
            }
            if (RoadShadowRenderer.isGuestMode((byte) 121)) {
              if (0 == ClientException.field_c &&
                !ReflectionCheckSupport.field_a) {
                TrackObject.switchMenu(param1, false, 0);
                return;
              }
              TrackObject.switchMenu(param1, false, 9);
            } else {
              if (ClientException.field_c == 0) {
                TrackObject.switchMenu(param1, false, 0);
              } else {
                TrackObject.switchMenu(param1, false, 8);
              }
            }
            return;
          }
          ((GameMenu) (CollisionGeometry.field_a[3])).initializeChampionshipCarousel(0, StrongCacheEntry.field_w);
          if (MusicPatchPcmStream.field_r.raceFinished &&
            !param2) {
            NetworkArchiveRequest.recordBestCourseTime(MusicPatchPcmStream.field_r.vehicles[0].racePosition, StrongCacheEntry.field_w, LoginForm.field_P, MusicPatchPcmStream.field_r.field_ob, -122);
            for (var3_intLifetime1 = 0; var3_intLifetime1 < 4; var3_intLifetime1++) {
              var11 = MusicPatchPcmStream.field_r.vehicles[var3_intLifetime1];
              var13 = var11;
              IntArrayReadRequest.field_j[var3_intLifetime1] = IntArrayReadRequest.field_j[var3_intLifetime1] + SingleChildWidget.field_C[var11.racePosition];
              if (var13.lapsCompleted > MusicPatchPcmStream.field_r.lapLimit) {
                ScreenOptionsMenu.field_g[var3_intLifetime1] = var11.field_Pb;
              } else {
                if (!(var13.furthestCourseProgress > var13.courseProgress)) {
                  stackIn_59_0 = var13.furthestCourseProgress;
                } else {
                  stackIn_59_0 = var13.courseProgress;
                }
                var5Lifetime1 = stackIn_59_0;
                var6Lifetime1 = EmailDomainValidator.normalizedCourseProgress(MusicPatchPcmStream.field_r.roadSegments, param0 ^ 6, var5Lifetime1);
                var7Lifetime1 = (var6Lifetime1 + (float)var13.lapsCompleted - 1.0f) / (float)MusicPatchPcmStream.field_r.lapLimit;
                if (0.0f == var7Lifetime1) {
                  ScreenOptionsMenu.field_g[var3_intLifetime1] = -1;
                } else {
                  ScreenOptionsMenu.field_g[var3_intLifetime1] = (int)((float)MusicPatchPcmStream.field_r.field_ob / var7Lifetime1);
                  if (MusicPatchPcmStream.field_r.field_ob + 1000 < ScreenOptionsMenu.field_g[var3_intLifetime1]) {
                    ScreenOptionsMenu.field_g[var3_intLifetime1] = -1;
                  }
                }
              }
            }
            if (MusicPatchPcmStream.field_r.vehicles[0].racePosition >= 2) {
              DropTargetWidget.setBackground(3, (byte) 102, true);
              fieldTemp$0 = EntitySound.field_l - 1;
              EntitySound.field_l = EntitySound.field_l - 1;
              if (1 > fieldTemp$0) {
                CheckboxRenderer.field_x = 6;
                TrackObject.switchMenu(param1, false, 11);
              } else {
                CheckboxRenderer.field_x = 1;
                TextWidgetStyle.field_g = TextWidgetStyle.field_g - 1;
                TrackObject.switchMenu(param1, false, 10);
              }
              return;
            }
            DropTargetWidget.setBackground(2, (byte) 116, true);
            if (param0 != 7) {
              var9 = (String) null;
              PlayerStatsRequest.createEmailValidationRequest((String) null, -40);
            }
            if (StrongCacheEntry.field_w == BoundaryLoopClipper.field_b &&
              RoadControlPathBuilder.field_d == LoginForm.field_P) {
              fieldTemp$1 = RoadControlPathBuilder.field_d + 1;
              RoadControlPathBuilder.field_d = RoadControlPathBuilder.field_d + 1;
              if (fieldTemp$1 == MenuList.field_l[BoundaryLoopClipper.field_b]) {
                RoadControlPathBuilder.field_d = RoadControlPathBuilder.field_d - 1;
              }
              GrowableStringList.savePlayerProgress(0);
              FullscreenErrorReason.populateCourseMenu((byte) 121);
            }
            var3_intLifetime1Lifetime1 = MusicPatchPcmStream.field_r.field_ob;
            EntitySound.field_m[LoginForm.field_P] = var3_intLifetime1Lifetime1;
            LayeredWidgetStyle.field_d = MusicPatchPcmStream.field_r.field_t;
            CurvedRoadSegment.field_y = CurvedRoadSegment.field_y + var3_intLifetime1Lifetime1;
            InterfaceLoadingStatus.field_b = MusicPatchPcmStream.field_r.field_hb;
            MenuHitTesting.field_a = MusicPatchPcmStream.field_r.field_y;
            GrowableStringList.field_c = MusicPatchPcmStream.field_r.field_g;
            InterfaceLoadingStatus.field_b = InterfaceLoadingStatus.field_b - 1;
            GrowableStringList.field_c = GrowableStringList.field_c + 1;
            MenuHitTesting.field_a = MenuHitTesting.field_a - (GrowableStringList.field_c + CurvedRoadSegment.field_y);
            LayeredWidgetStyle.field_d = LayeredWidgetStyle.field_d + InterfaceLoadingStatus.field_b;
            fieldTemp$2 = LoginForm.field_P + 1;
            LoginForm.field_P = LoginForm.field_P + 1;
            if (fieldTemp$2 == MenuList.field_l[StrongCacheEntry.field_w]) {
              if (ClientBackgroundRenderer.field_a == 0) {
                NetworkArchiveRequest.submitChampionshipScores(EntitySound.field_m, (byte) -89, StrongCacheEntry.field_w);
                if (StrongCacheEntry.field_w == BoundaryLoopClipper.field_b &&
                  3 > BoundaryLoopClipper.field_b) {
                  RoadControlPathBuilder.field_d = 0;
                  fieldTemp$3 = BoundaryLoopClipper.field_b + 1;
                  BoundaryLoopClipper.field_b = BoundaryLoopClipper.field_b + 1;
                  OutlinedRoadStripRenderer.field_r = fieldTemp$3;
                  GrowableStringList.savePlayerProgress(0);
                  FullscreenErrorReason.populateCourseMenu((byte) -125);
                }
              }
              LoginForm.field_P = 0;
              CheckboxRenderer.field_x = 2;
            } else {
              TextWidgetStyle.field_g = 3;
              CheckboxRenderer.field_x = 0;
            }
            if (CheckboxRenderer.field_x != 0 &&
              1 != CheckboxRenderer.field_x) {
              TrackObject.switchMenu(param1, false, 11);
              return;
            }
            TrackObject.switchMenu(param1, false, 10);
            return;
          }
          AlternateUsernameLoginCredentials.requestBackground(1, param0 - 121);
          if (RoadShadowRenderer.isGuestMode((byte) 102)) {
            if (0 == ClientException.field_c &&
              !ReflectionCheckSupport.field_a) {
              TrackObject.switchMenu(param1, false, 12);
              return;
            }
            TrackObject.switchMenu(param1, false, 9);
          } else {
            if (0 != ClientException.field_c) {
              TrackObject.switchMenu(param1, false, 7);
            } else {
              TrackObject.switchMenu(param1, false, 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "qn.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
