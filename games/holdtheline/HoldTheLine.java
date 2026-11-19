/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class HoldTheLine extends NetworkGameClient {
    static PaletteBitmapFont field_F;
    private int field_C;
    static String field_B;
    static int field_A;
    private boolean field_z;
    static int[] field_E;
    static String[] field_G;
    public static int field_D;

    public final void init() {
        try {
          this.a(13, 6165, "holdtheline");
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "HoldTheLine.init()");
        }
    }

    final void releaseGameResources(int param0) {
        try {
          HoldTheLine.clearClientReferences(-20);
          RaceWorld.clearSharedReferences(-26919);
          dm.clearSharedReferences((byte) -20);
          rh.clearSharedReferences(-123);
          jo.clearSharedReferences((byte) 108);
          GameAppletShell.clearSharedReferences(-1);
          MouseInputHandler.clearSharedReferences((byte) -126);
          IntrusiveDeque.clearSharedReferences(true);
          o.clearSharedReferences((byte) 39);
          IsaacPacketBuffer.clearSharedReferences(-55);
          eg.clearSharedReferences(32395);
          lj.clearSharedReferences(param0 ^ -29336);
          GameKeyHandler.clearSharedReferences(param0 ^ -129);
          co.clearSharedReferences(-112);
          sl.clearSharedReferences(18668);
          pe.clearSharedReferences(param0 - 128);
          ti.clearSharedReferences(param0 - 21134);
          l.clearSharedReferences(param0 ^ 17182);
          NetworkGameClient.clearSharedReferences(8);
          ClientException.clearSharedReferences(8388479);
          UrlPacketDownloader.clearSharedReferences(-55);
          MouseWheelInput.clearSharedReferences((byte) 106);
          SoftwareRasterizer.clearSharedReferences();
          ResourceArchive.clearSharedReferences(false);
          ml.clearSharedReferences(-21989);
          ko.clearSharedReferences(115);
          PacketBuffer.clearSharedReferences((byte) -37);
          bb.clearSharedReferences(-45);
          ak.clearSharedReferences(0);
          ai.clearSharedReferences((byte) -110);
          q.clearSharedReferences((byte) 86);
          ri.clearSharedReferences(param0 + 1003075144);
          oc.clearSharedReferences(-1);
          wi.clearSharedReferences(28135);
          ij.clearSharedReferences(-90);
          qh.clearSharedReferences(30);
          ad.clearSharedReferences((byte) -58);
          ao.clearSharedReferences(0);
          sm.clearSharedReferences((byte) 72);
          TickClock.clearSharedReferences((byte) 118);
          RasterBuffer.clearSharedReferences(false);
          ArchiveLoadProgress.clearSharedReferences(-3646);
          FullscreenFocusCanvas.clearSharedReferences(0);
          gh.clearSharedReferences(121);
          pc.clearSharedReferences(param0 ^ -129);
          Js5Transport.clearSharedReferences(16831);
          DiskCacheWorker.clearSharedReferences(-3);
          ArchiveCatalog.clearSharedReferences((byte) 100);
          BufferedRandomAccessFile.clearSharedReferences((byte) 121);
          BufferedSocket.clearSharedReferences(param0 ^ 15153);
          vb.clearSharedReferences(-1);
          mn.clearSharedReferences(-103);
          MusicCrossfadeStream.clearSharedReferences(119);
          ec.clearSharedReferences((byte) -122);
          MovingEntity.clearSharedReferences(0);
          m.clearSharedReferences(true);
          tn.clearSharedReferences(1);
          IntrusiveNode.clearSharedReferences(-2);
          ua.clearSharedReferences(param0 + 23881);
          SoundCache.clearSharedReferences(122);
          GrowableObjectList.clearSharedReferences(true);
          GrowableIntList.clearSharedReferences((byte) -13);
          gf.clearSharedReferences();
          r.clearSharedReferences(param0 ^ -13950);
          BitmapFont.clearSharedReferences();
          ni.clearSharedReferences(0);
          ta.clearSharedReferences((byte) 16);
          NineSlicePanel.clearSharedReferences(-1);
          fj.clearSharedReferences((byte) 96);
          nm.clearSharedReferences(param0 ^ -240);
          DualLinkNode.clearSharedReferences(0);
          IndexedSpriteState.clearSharedReferences(true);
          aj.clearSharedReferences(76);
          hh.clearSharedReferences(param0 - 118);
          AccountFormText.clearSharedReferences(10);
          wl.clearSharedReferences(62);
          b.clearSharedReferences(-89);
          LoginCredentialType.clearSharedReferences(127);
          LoginCredentials.clearSharedReferences((byte) -123);
          jh.clearSharedReferences(param0 ^ -202);
          mc.clearSharedReferences(param0 - 34);
          dg.clearSharedReferences(param0 + 32009);
          DialogLayer.clearSharedReferences(true);
          NameCheckProgressDialog.clearSharedReferences(param0 - 135);
          ra.clearSharedReferences((byte) -125);
          StandardContentTransitionDialog.clearSharedReferences((byte) 79);
          AccountCreationForm.clearSharedReferences((byte) -16);
          LoginChoicePanel.clearSharedReferences(-25335);
          LoginForm.clearSharedReferences(param0 - 100);
          DisplayNameForm.clearSharedReferences(-1);
          ga.clearSharedReferences(1);
          mj.clearSharedReferences(126);
          gk.clearSharedReferences((byte) 115);
          ArchiveIndex.clearSharedReferences((byte) 118);
          GzipDecompressor.clearSharedReferences((byte) 40);
          ArchiveProvider.clearSharedReferences(8192);
          ClientTextResources.clearSharedReferences(true);
          d.clearSharedReferences(119);
          RaceVehicle.clearSharedReferences(param0 ^ -129);
          wm.clearSharedReferences(-20668);
          vf.clearSharedReferences(127);
          na.clearSharedReferences(param0 ^ -200);
          kc.clearSharedReferences(true);
          oi.clearSharedReferences((byte) 114);
          IsaacRandom.clearSharedReferences(28820);
          nl.clearSharedReferences((byte) -92);
          SpriteState.clearSharedReferences(-13503);
          jk.clearSharedReferences(1288);
          AudioOutput.clearSharedReferences();
          MidiPcmStream.clearSharedReferences((byte) -104);
          hk.clearSharedReferences(-67);
          MidiFileReader.releaseStatics();
          MusicPatchPcmStream.clearSharedReferences(0);
          BoundedRandomAccessFile.clearSharedReferences(param0 ^ 128);
          DelegatingCanvas.clearSharedReferences(param0 ^ -248);
          pb.clearSharedReferences(0);
          SocketJs5Transport.clearSharedReferences(true);
          SecondaryNodeDeque.clearSharedReferences(6985);
          NetworkArchiveRequest.clearSharedReferences(106);
          DiskCacheStore.clearSharedReferences(-84);
          CachedArchiveProvider.clearSharedReferences(-123);
          hc.clearSharedReferences(24816);
          ArchiveRequest.clearSharedReferences(-1010);
          ka.clearSharedReferences(5);
          rf.clearSharedReferences(-56);
          fe.clearSharedReferences(-754077296);
          TextWidgetStyle.clearSharedReferences(true);
          TriangleRasterState.clearSharedReferences();
          VorbisSample.releaseStatics();
          uj.clearSharedReferences((byte) -122);
          TriangleMesh.clearSharedReferences(-32768);
          hm.clearSharedReferences(0);
          te.clearSharedReferences(-4);
          il.clearSharedReferences(84);
          lh.clearSharedReferences((byte) -33);
          qg.clearSharedReferences(111);
          fm.clearSharedReferences(param0 - 24);
          hi.clearSharedReferences((byte) 104);
          DualNodeHashTable.clearSharedReferences((byte) -97);
          IntHashTable.clearSharedReferences((byte) 124);
          ByteStorage.clearSharedReferences((byte) -20);
          Bzip2Decoder.clearSharedReferences();
          Bzip2State.clearSharedReferences((byte) -125);
          ki.clearSharedReferences(true);
          al.clearSharedReferences((byte) -71);
          ne.clearSharedReferences(117);
          CheckboxRenderer.clearSharedReferences(true);
          LayeredButtonRenderer.clearSharedReferences((byte) 72);
          DialWidgetRenderer.clearSharedReferences(true);
          MarkerSliderRenderer.clearSharedReferences(param0 - 129);
          TextLayout.clearSharedReferences(-11521);
          UiWidget.clearSharedReferences((byte) 25);
          TextButton.clearSharedReferences(param0 ^ -5403);
          SingleChildWidget.clearSharedReferences((byte) 92);
          ResizableDialog.clearSharedReferences(6);
          FadingDialog.clearSharedReferences(-1349126303);
          WidgetContainer.clearSharedReferences((byte) 70);
          IntrusiveDequeCursor.clearSharedReferences((byte) 127);
          fk.clearSharedReferences(114);
          VorbisFloor.clearSharedReferences();
          cd.clearSharedReferences(1);
          QuickChatPhraseDefinition.clearSharedReferences((byte) 116);
          ae.clearSharedReferences((byte) 96);
          QuickChatPhraseCache.clearSharedReferences((byte) -78);
          WeightedLruCache.clearSharedReferences(false);
          um.clearSharedReferences(119);
          HuffmanDecoder.clearSharedReferences(0);
          rc.clearSharedReferences(true);
          ba.clearSharedReferences(12031);
          AudioServiceThread.clearSharedReferences((byte) -48);
          SocketConnector.clearSharedReferences((byte) -42);
          uk.clearSharedReferences((byte) -116);
          NanoTickClock.clearSharedReferences(true);
          ImageProducerRasterBuffer.clearSharedReferences(-1);
          WhirlpoolHasher.clearSharedReferences(true);
          MidiKeyUsage.clearSharedReferences(5751);
          SynthInstrument.releaseStatics();
          fc.clearSharedReferences(-127);
          LabeledField.clearSharedReferences(18701);
          ValidatedTextField.clearSharedReferences(param0 ^ 8078);
          EditableTextField.clearSharedReferences(param0 + 3747);
          ContentTransitionDialog.clearSharedReferences(false);
          NameSuggestionsPanel.clearSharedReferences(param0 ^ -27025);
          TextHotspotWidget.clearSharedReferences(-1);
          ValidationIndicator.clearSharedReferences((byte) 51);
          ValidationHelpWidget.clearSharedReferences(true);
          CheckboxWidget.clearSharedReferences((byte) 103);
          TextFieldValidator.clearSharedReferences(-1);
          bo.clearSharedReferences(false);
          AccountTermsPanel.clearSharedReferences(param0 ^ -9379);
          DialWidget.clearSharedReferences(false);
          MusicPatch.clearSharedReferences((byte) -6);
          MusicPatchEnvelope.clearSharedReferences((byte) 109);
          CachedTextLayout.clearSharedReferences(false);
          DirectByteStorage.clearSharedReferences(param0 ^ -211);
          DraggableWidget.clearSharedReferences(param0 - 32);
          DropTargetWidget.clearSharedReferences(6);
          QuickChatDynamicCommand.clearSharedReferences(-36);
          IterableNodeHashTable.clearSharedReferences(-90);
          IterableSecondaryNodeDeque.clearSharedReferences((byte) 80);
          CacheEntry.clearSharedReferences(-15);
          StrongCacheEntry.clearSharedReferences((byte) 109);
          ProxySocketConnector.clearSharedReferences((byte) -124);
          SynthFilter.releaseStatics();
          cm.clearSharedReferences((byte) -90);
          NodeHashTableIterator.clearSharedReferences((byte) 86);
          SecondaryNodeDequeIterator.clearSharedReferences((byte) 68);
          i.clearSharedReferences((byte) -3);
          vk.clearSharedReferences(3);
          sb.clearSharedReferences(74);
          ue.clearSharedReferences(param0 + 19729);
          RoadStripRenderer.clearSharedReferences(0);
          vd.clearSharedReferences(param0 ^ -204);
          SolidRoadStripRenderer.clearSharedReferences((byte) 110);
          qd.clearSharedReferences((byte) 82);
          ShadedRoadStripRenderer.clearSharedReferences(true);
          OutlinedRoadStripRenderer.clearSharedReferences(-10162);
          pf.clearSharedReferences((byte) 38);
          RotatedSpriteCache.clearSharedReferences((byte) -28);
          SpriteAsset.clearSharedReferences((byte) -99);
          SpriteSheetAsset.clearSharedReferences((byte) -120);
          RotatedSpriteAsset.clearSharedReferences((byte) -103);
          RotatedSpriteSheetAsset.clearSharedReferences((byte) 21);
          NamedSoundEffect.clearSharedReferences((byte) 43);
          StereoMusicSample.clearSharedReferences(1491624464);
          tk.clearSharedReferences(-7689);
          EntitySound.clearSharedReferences(0);
          jg.clearSharedReferences(param0 - 220);
          fb.clearSharedReferences(true);
          jc.clearSharedReferences((byte) 5);
          fo.clearSharedReferences(false);
          Point2i.clearSharedReferences(-22525);
          Vector2i.clearSharedReferences((byte) 110);
          Vector2f.clearSharedReferences(param0 - 129);
          TrackCurve.clearSharedReferences(true);
          BoundaryCurve.clearSharedReferences(param0 - 244);
          RoadSegment.clearSharedReferences(-3369);
          TrackBoundary.clearSharedReferences(false);
          StraightRoadSegment.clearSharedReferences((byte) -87);
          ArcTrackBoundary.clearSharedReferences(false);
          CurvedRoadSegment.clearSharedReferences(-127);
          ha.clearSharedReferences(69);
          SpriteButtonRenderer.clearSharedReferences(-1351579448);
          LinkWidgetRenderer.clearSharedReferences(1);
          TextFieldRenderer.clearSharedReferences(true);
          PasswordFieldRenderer.clearSharedReferences(true);
          gm.clearSharedReferences(4);
          he.clearSharedReferences(1000);
          fi.clearSharedReferences(true);
          qn.clearSharedReferences(param0 - 179);
          SoundPlayback.clearSharedReferences(param0);
          ArchiveLoadStage.clearSharedReferences((byte) 114);
          ma.clearSharedReferences((byte) -85);
          ih.clearSharedReferences((byte) 119);
          ie.clearSharedReferences((byte) 89);
          fl.clearSharedReferences(381);
          TutorialCalloutAnchor.clearSharedReferences((byte) 112);
          TutorialCondition.clearSharedReferences((byte) 1);
          TutorialTransition.clearSharedReferences(false);
          TutorialAction.clearSharedReferences(-116);
          TutorialPage.clearSharedReferences(true);
          EmailValidationResult.clearSharedReferences(-69);
          ll.clearSharedReferences((byte) 124);
          DelayedServerPacket.clearSharedReferences(param0 - 33);
          LoginMethodPreference.clearSharedReferences(-69);
          UsernameLoginCredentials.clearSharedReferences(param0 ^ -237);
          bn.clearSharedReferences((byte) -93);
          EmailLoginCredentials.clearSharedReferences((byte) 61);
          sa.clearSharedReferences((byte) -125);
          NameAvailabilityResult.clearSharedReferences(-4496);
          MessagePanel.clearSharedReferences((byte) 25);
          eb.clearSharedReferences(param0 - 120);
          PointPath.clearSharedReferences((byte) -16);
          LinearPointPath.clearSharedReferences((byte) -52);
          QuadraticPointPath.clearSharedReferences(param0 - 128);
          om.clearSharedReferences((byte) -6);
          h.clearSharedReferences((byte) 99);
          we.clearSharedReferences((byte) 61);
          t.clearSharedReferences(param0 ^ 128);
          se.clearSharedReferences(true);
          nj.clearSharedReferences(param0 - 33);
          TextLineLayout.clearSharedReferences((byte) 5);
          EmailAddressValidator.clearSharedReferences((byte) -76);
          EmailConfirmationValidator.clearSharedReferences(0);
          AgeValidator.clearSharedReferences(-127);
          MatchingTextValidator.clearSharedReferences(-14);
          ge.clearSharedReferences(-31819);
          TextHotspotRange.clearSharedReferences(76);
          ValidationState.clearSharedReferences(115);
          TimedValidator.clearSharedReferences(param0 - 24709);
          sh.clearSharedReferences(11);
          this.field_n = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "HoldTheLine.IA(" + param0 + ')');
        }
    }

    private final void openResourceArchives(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -35) {
            field_F = (PaletteBitmapFont) null;
          }
          if (GameAppletShell.field_i != null) {
            rk.a((byte) 125, GameAppletShell.field_i);
            GameAppletShell.field_i = null;
            qd.d(56);
          }
          DropTargetWidget.field_J = WeightedLruCache.a(122, 3);
          ta.field_a = WeightedLruCache.a(param0 + 162, 4);
          b.field_d = WeightedLruCache.a(-67, 5);
          PacketBuffer.field_m = WeightedLruCache.a(-15, 6);
          SoundCache.field_c = WeightedLruCache.a(121, 7);
          EntitySound.field_i = WeightedLruCache.a(-17, 8);
          QuadraticPointPath.field_j = WeightedLruCache.a(-16, 9);
          NetworkArchiveRequest.field_y = WeightedLruCache.a(param0 ^ -89, 10);
          FullscreenFocusCanvas.a(LinearPointPath.field_p, (byte) -126, StandardContentTransitionDialog.field_lb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.NA(" + param0 + ')');
        }
    }

    final void shutdownGame(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          sb.a((byte) -66);
          if (MidiPcmStream.field_U != null) {
            AgeValidator.a(-29486, false);
          }
          pf.a(false);
          if (param0 != 30) {
            this.field_C = -31;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.MA(" + param0 + ')');
        }
    }

    final static MouseWheelInput createMouseWheelInput(byte param0) {
        try {
          Throwable var1 = null;
          RuntimeException var1_ref = null;
          MouseWheelInput stackIn_4_0 = null;
          Object stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 > -37) {
              field_B = (String) null;
            }
            try {
              stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              stackIn_6_0 = null;
              return (MouseWheelInput) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "HoldTheLine.QA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void initializeGame(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(8, false, 1, 0, (byte) 63, 11, 12, 2);
          this.a(false, true, true, true, 640);
          this.field_z = false;
          if (param0 < 78) {
            this.init();
          }
          lh.a(wi.field_b, -81, (java.awt.Component) ((Object) MouseInputHandler.field_b));
          ec.field_y = null;
          RotatedSpriteAsset.a(0, 16777215, co.field_a, (java.applet.Applet) (this), 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.FA(" + param0 + ')');
        }
    }

    final void updateGameTick(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_38_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_283_1 = 0;
        boolean stackIn_284_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_D;
        try {
          ArchiveRequest.h(-11875);
          LoginForm.h(-1542826527);
          ad.a((byte) -76);
          stackIn_4_1 = 1051;
          stackIn_5_2 = (MidiPcmStream.field_U != null);
          this.b(stackIn_4_1, stackIn_5_2);
          if (EditableTextField.field_R) {
            this.openResourceArchives((byte) -35);
            EditableTextField.field_R = false;
          }
          do {
            if (!PasswordFieldRenderer.pollServerPacket(ae.field_e, 31881)) {
              qn.a(0, 0);
              break;
            }
            this.j(-6);
          } while (var5 == 0);
          if (BufferedSocket.a((byte) -127)) {
            this.l(0);
            if (BufferedSocket.a((byte) -127)) {
              if (jn.a((byte) -30)) {
                this.loadGameResources(false, false);
              }
              return;
            }
          }
          if (!this.field_z) {
            this.loadGameResources(true, false);
            return;
          }
          if (RotatedSpriteCache.field_c &&
            IterableSecondaryNodeDeque.field_g[12] &&
            IterableSecondaryNodeDeque.field_g[82]) {
            stackIn_38_0 = 1;
          } else {
            stackIn_38_0 = 0;
          }
          var2_int = stackIn_38_0;
          if (var2_int != 0) {
            r.a(-28036);
          }
          if (NamedSoundEffect.b((byte) 103)) {
            var3 = this.d((byte) 89);
            if (var3 == 0 ||
              1 == var3) {
              StraightRoadSegment.a(2, (byte) 86);
              DirectByteStorage.a(3, 0);
              b.a(true, 4);
              ec.b(6, (byte) 51);
            }
            if (2 == var3 ||
              var2_int != 0) {
              EmailConfirmationValidator.b(false);
            }
          }
          if (null != MidiPcmStream.field_U &&
            MidiPcmStream.field_U.field_a) {
            RaceWorld.b(false);
            AgeValidator.a(-29486, false);
          }
          if (LoginForm.field_G == 2) {
            if (!pj.b((byte) 123)) {
              dg.a((byte) -118);
            }
            LoginForm.field_G = 3;
          }
          if (!vf.field_v &&
            of.a(-969) &&
            null != ec.field_y.field_i) {
            ai.a(NetworkArchiveRequest.field_y, ec.field_y.field_i, -106);
            NetworkArchiveRequest.field_y = null;
          }
          if (!RotatedSpriteAsset.a(113)) {
            LoginCredentialType.a((byte) 0);
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          var3 = 4 % ((param0 + 18) / 44);
          if (this.field_C <= 0) {
            if (LoginCredentialType.b(-85)) {
              var4 = DiskCacheStore.a((byte) 18);
              switch (var4) {
                default:
                  break;
                case 3:
                  QuadraticPointPath.b((byte) 123);
                  if (var5 == 0) {
                    break;
                  }
                case 4:
                  bo.field_c = true;
                  i.a((byte) 62, false);
                  IntrusiveDeque.b(false);
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  AgeValidator.a(-29486, false);
                  break;
              }
              decompiledFrameRemainder1 = (var5 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (!ki.a(false)) {
                if (~ByteStorage.field_b == ~dg.field_c &&
                  LoginForm.field_G == 0) {
                  if (dg.field_c != -1) {
                    if (EntitySound.field_j &&
                      dg.field_c == 0) {
                      RotatedSpriteCache.a(-1);
                    }
                    if (EntitySound.field_j ||
                      1 != BufferedRandomAccessFile.field_d &&
                      ma.field_k != 1) {
                      fieldTemp$0 = pc.field_h - 2;
                      pc.field_h = pc.field_h - 2;
                      if (!(0 <= fieldTemp$0)) {
                        pc.field_h = 0;
                        if (var5 != 0) {
                          ra.m(126);
                          fieldTemp$1 = pc.field_h + 2;
                          pc.field_h = pc.field_h + 2;
                          if (fieldTemp$1 > 255) {
                            pc.field_h = 255;
                          }
                        }
                      }
                    } else {
                      ra.m(126);
                      fieldTemp$1 = pc.field_h + 2;
                      pc.field_h = pc.field_h + 2;
                      if (fieldTemp$1 > 255) {
                        pc.field_h = 255;
                      }
                    }
                    decompiledFrameRemainder1 = (-1 != dg.field_c);
                    if (decompiledFrameRemainder1) {
                      boolean decompiledSharedTail2 = (13 != dg.field_c);
                      if (!decompiledSharedTail2) {
                        ((ec) (l.field_a[dg.field_c])).c((byte) -109);
                        stackIn_152_0 = (((ec) (l.field_a[dg.field_c])).field_P != 1) ? 0 : 1;
                        var4 = stackIn_152_0;
                        decompiledSharedTail2 = (var5 != 0);
                      }
                      if (decompiledSharedTail2) {
                        ((ti) (l.field_a[dg.field_c])).a(116, false);
                        stackIn_159_0 = (((ti) (l.field_a[dg.field_c])).field_y != 1) ? 0 : 1;
                        var4 = stackIn_159_0;
                      }
                      if (var4 != 0 &&
                        bo.field_c) {
                        QuadraticPointPath.b((byte) 110);
                        bo.field_c = false;
                      }
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    ra.m(121);
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (dg.field_c != -1 &&
                    -1 != ByteStorage.field_b) {
                    if (EntitySound.field_j ||
                      1 != BufferedRandomAccessFile.field_d &&
                      ma.field_k != 1) {
                      fieldTemp$2 = pc.field_h - 2;
                      pc.field_h = pc.field_h - 2;
                      if (!(fieldTemp$2 >= 0)) {
                        pc.field_h = 0;
                        if (var5 != 0) {
                          fieldTemp$3 = pc.field_h + 2;
                          pc.field_h = pc.field_h + 2;
                          if (255 < fieldTemp$3) {
                            pc.field_h = 255;
                          }
                          ra.m(123);
                        }
                      }
                    } else {
                      fieldTemp$3 = pc.field_h + 2;
                      pc.field_h = pc.field_h + 2;
                      if (255 < fieldTemp$3) {
                        pc.field_h = 255;
                      }
                      ra.m(123);
                    }
                    boolean decompiledSharedTail1 = (dg.field_c != 13);
                    if (!decompiledSharedTail1) {
                      ((ec) (l.field_a[dg.field_c])).c((byte) -109);
                      var4 = ((ec) (l.field_a[dg.field_c])).b((byte) -77) ? 1 : 0;
                      decompiledSharedTail1 = (var5 != 0);
                    }
                    if (decompiledSharedTail1) {
                      ((ti) (l.field_a[dg.field_c])).a(73, true);
                      var4 = ((ti) (l.field_a[dg.field_c])).b(false) ? 1 : 0;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (var4 != 0) {
                      if (LoginForm.field_G == 1) {
                        if (ValidationIndicator.field_L) {
                          FullscreenFocusCanvas.a(114);
                          if (var5 != 0) {
                            MouseInputHandler.b((byte) -54);
                          }
                        } else {
                          MouseInputHandler.b((byte) -54);
                        }
                        LoginForm.field_G = 2;
                        decompiledFrameRemainder0 = (var5 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (3 != LoginForm.field_G) {
                          if (ByteStorage.field_b == 0) {
                            qd.a(20830, 0);
                          }
                          dg.field_c = ByteStorage.field_b;
                          decompiledFrameRemainder0 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (!pj.b((byte) 100)) {
                            if (12 == ByteStorage.field_b &&
                              of.a(-969)) {
                              ByteStorage.field_b = 0;
                            }
                            dg.field_c = ByteStorage.field_b;
                            if (dg.field_c == 0) {
                              qd.a(20830, 0);
                            }
                          }
                          boolean decompiledSharedTail0 = (dg.field_c != 13);
                          if (!decompiledSharedTail0) {
                            ((ec) (l.field_a[dg.field_c])).a((byte) 69, false);
                            decompiledSharedTail0 = (var5 != 0);
                          }
                          if (decompiledSharedTail0) {
                            ((ti) (l.field_a[dg.field_c])).b(false, -121);
                          }
                          LoginForm.field_G = 0;
                        }
                      }
                    }
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    ie.field_n = ie.field_n + 1;
                    if (ByteStorage.field_b != -1) {
                      stackIn_253_0 = (80 - ie.field_n) * 256 / 80;
                    } else {
                      stackIn_253_0 = ie.field_n * 256 / 80;
                    }
                    pc.field_h = stackIn_253_0;
                    if (ie.field_n == 80) {
                      ie.field_n = 0;
                      dg.field_c = ByteStorage.field_b;
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (dg.field_c != -1) {
                        if (13 == dg.field_c) {
                          ((ec) (l.field_a[dg.field_c])).c((byte) -109);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          ((ti) (l.field_a[dg.field_c])).a(102, true);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        if (ByteStorage.field_b == 13) {
                          ((ec) (l.field_a[ByteStorage.field_b])).c((byte) -109);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          ((ti) (l.field_a[ByteStorage.field_b])).a(50, true);
                          decompiledFrameRemainder1 = (var5 != 0);
                        }
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_283_1 = -1;
                stackIn_284_2 = (MidiPcmStream.field_U != null);
                var4 = this.c(stackIn_283_1, stackIn_284_2);
                if (var4 == 1) {
                  AgeValidator.a(-29486, false);
                }
                if ((var4 != 1 ||
                  var5 != 0) &&
                  var4 == 2) {
                  te.a(true);
                }
                if (var5 != 0) {
                  if (ValidationIndicator.field_J == 0) {
                    this.field_C = this.field_C - 1;
                    this.field_C = 0;
                  } else {
                    this.field_C = 0;
                  }
                }
              }
            }
          } else {
            if (ValidationIndicator.field_J == 0) {
              this.field_C = this.field_C - 1;
              if (var5 != 0) {
                this.field_C = 0;
              }
            } else {
              this.field_C = 0;
            }
          }
          if (~ma.field_k != ~BufferedRandomAccessFile.field_d) {
            fieldTemp$4 = MouseInputHandler.field_c + 1;
            MouseInputHandler.field_c = MouseInputHandler.field_c + 1;
            if (fieldTemp$4 >= 80 && (ma.field_k == 1 ||
              o.a(ma.field_k, 2) != null)) {
              BufferedRandomAccessFile.field_d = ma.field_k;
              MouseInputHandler.field_c = 0;
            }
          }
          if (ArchiveRequest.field_r != -1 &&
            UsernameLoginCredentials.a(nm.field_b, true)) {
            MusicPatchPcmStream.field_r = new RaceWorld(nm.field_b, ArchiveRequest.field_r, fl.field_j, qn.field_k, QuickChatPhraseDefinition.field_r, DiskCacheStore.field_i);
            ArchiveRequest.field_r = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.DA(" + param0 + ')');
        }
    }

    private final void finishGameLoading(byte param0) {
        int var2_int = 0;
        i var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          GameKeyHandler.a((byte) -105, 50);
          if (!pj.b((byte) 107)) {
            RoadSegment.a(of.a(-969), (byte) 97);
          }
          OutlinedRoadStripRenderer.field_r = -1;
          LoginCredentialType.field_c = false;
          LoginForm.field_P = 0;
          DelegatingCanvas.field_d = 7;
          this.field_C = 125;
          t.field_l = -1;
          var2_int = 84 / ((42 - param0) / 51);
          StrongCacheEntry.field_w = 0;
          IntrusiveDeque.field_b = -1;
          fb.field_n = new IntrusiveDeque();
          bo.field_c = false;
          LoginForm.field_G = 0;
          ValidationIndicator.field_L = true;
          h.b((byte) 115);
          this.field_z = true;
          var3 = new i();
          eg.a(20, 0, 480, field_F.field_G, 0, 0, 5, field_F.field_G, 0, field_F, field_F, 2, (NineSlicePanel) null, 320, 0, 240, (NineSlicePanel) null, 20, 0, 1, var3);
          stackIn_7_0 = !(CachedArchiveProvider.field_x < 2);
          RotatedSpriteCache.field_c = stackIn_7_0;
          qd.a(20830, 0);
          RotatedSpriteCache.a(-1);
          qd.d(110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "HoldTheLine.PA(" + param0 + ')');
        }
    }

    public static void clearClientReferences(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_E = null;
          field_B = null;
          if (param0 >= -13) {
            HoldTheLine.createMouseWheelInput((byte) -81);
          }
          field_F = null;
          field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "HoldTheLine.RA(" + param0 + ')');
        }
    }

    final void renderGameFrame(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_20_0 = 0;
        Object stackIn_20_1 = null;
        boolean stackIn_23_2 = false;
        boolean stackIn_103_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        long var3 = 0L;
        int var3_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        String var9 = null;
        int var10 = 0;
        var10 = field_D;
        try {
          if (MidiPcmStream.field_U == null) {
            stackIn_5_0 = MouseInputHandler.field_b;
          } else {
            stackIn_5_0 = MidiPcmStream.field_U;
          }
          var2 = stackIn_5_0;
          if (BufferedSocket.a((byte) -128)) {
            stackIn_20_0 = -63;
            stackIn_20_1 = var2;
            stackIn_23_2 = (null != MidiPcmStream.field_U) || (vk.field_a);
            ko.drawClientLoadingOrMenuWithIntGuard(stackIn_20_0, (java.awt.Canvas) (stackIn_20_1), stackIn_23_2);
            return;
          }
          if (!this.field_z) {
            MidiNote.a((byte) -97, (java.awt.Canvas) (var2));
            return;
          }
          if (!RotatedSpriteAsset.a(param0 ^ 318)) {
            CacheEntry.a(param0 ^ 350, uj.field_b, 100.0f);
            MidiNote.a((byte) -97, (java.awt.Canvas) (var2));
            return;
          }
          oj.a((byte) 120);
          if (this.field_C > 0) {
            SoftwareRasterizer.c();
            StereoMusicSample.field_a.b(0, 0);
            if (this.field_C < 25) {
              var3_int = 1280 * this.field_C / 25 - 640;
              if (var3_int < 0) {
                SecondaryNodeDequeIterator.a(param0 - 256);
                o.a(128, 480, 0, 128, 640, param0 - 4697, 0);
              }
              cm.field_d.a(var3_int, 0);
            }
            hi.a((java.awt.Canvas) (var2), 0, true, 0);
            return;
          }
          if (param0 != 256) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (ByteStorage.field_b == dg.field_c) {
            if (-1 == dg.field_c) {
              SecondaryNodeDequeIterator.a(param0 ^ 256);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              eg.a(false);
              l.field_a[dg.field_c].a(-55);
              decompiledFrameRemainder0 = (var10 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (dg.field_c == -1) {
              if (!EntitySound.field_j) {
                if (ie.field_n < 40) {
                  SecondaryNodeDequeIterator.a(0);
                  SoftwareRasterizer.c(0, 0, 640, 480, 12566463, ie.field_n * 512 / 80);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  eg.a(false);
                  l.field_a[ByteStorage.field_b].a(param0 ^ -311);
                  SoftwareRasterizer.c(0, 0, 640, 480, 12566463, -(512 * ie.field_n / 80) + 512);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                SecondaryNodeDequeIterator.a(0);
                PacketBuffer.e(param0 - 152, (ie.field_n << 8) / 80);
                l.field_a[ByteStorage.field_b].a(-55);
                decompiledFrameRemainder0 = (var10 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == ByteStorage.field_b) {
                if (EntitySound.field_j) {
                  SecondaryNodeDequeIterator.a(0);
                  PacketBuffer.e(116, 256 - (ie.field_n << 8) / 80);
                  l.field_a[dg.field_c].a(-55);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (ie.field_n >= 40) {
                    SecondaryNodeDequeIterator.a(0);
                    SoftwareRasterizer.c(0, 0, 640, 480, 12566463, -((ie.field_n << 9) / 80) + 512);
                    if (var10 != 0) {
                      eg.a(false);
                      l.field_a[dg.field_c].a(param0 ^ -311);
                      SoftwareRasterizer.c(0, 0, 640, 480, 12566463, (ie.field_n << 9) / 80);
                      eg.a(false);
                      l.field_a[dg.field_c].a(-55);
                    }
                  } else {
                    eg.a(false);
                    l.field_a[dg.field_c].a(param0 ^ -311);
                    SoftwareRasterizer.c(0, 0, 640, 480, 12566463, (ie.field_n << 9) / 80);
                    if (var10 != 0) {
                      eg.a(false);
                      l.field_a[dg.field_c].a(-55);
                    }
                  }
                }
              } else {
                eg.a(false);
                l.field_a[dg.field_c].a(-55);
              }
            }
          }
          boolean decompiledSharedTail0 = !(LoginCredentialType.b(108));
          if (!decompiledSharedTail0) {
            mj.a(640, 480, 0, param0 ^ 256, 0, 128);
            d.a(false);
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (ki.a(false))) {
            stackIn_103_0 = (MidiPcmStream.field_U != null) || (vk.field_a);
            fj.a(stackIn_103_0, true);
          }
          if (LoginCredentialType.field_c) {
            nm.field_c.a(Integer.toString(IterableSecondaryNodeDeque.field_f), 10, 30, 0, -1);
            var3 = Runtime.getRuntime().totalMemory();
            var5 = Runtime.getRuntime().freeMemory();
            var7 = var3 - var5;
            var9 = (int)(var7 >> 10) + "kB";
            nm.field_c.a(var9, 10, 50, 0, -1);
          }
          hi.a((java.awt.Canvas) (var2), 0, true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2_ref), "HoldTheLine.LA(" + param0 + ')');
        }
    }

    private final void loadGameResources(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_D;
        try {
          dg.b(-9342);
          if (param0) {
            DiskCacheWorker.a(LoginForm.field_T, (byte) -81);
          }
          if (ec.field_y == null &&
            of.a(-969)) {
            ec.field_y = ie.a(10, 31043, 2, 0);
          }
          if (null == RotatedSpriteCache.field_g) {
            MusicPatchEnvelope.field_f = false;
            ll.field_a = false;
            RotatedSpriteCache.field_g = new jg[4];
            if (!pj.b((byte) 82)) {
              RotatedSpriteAsset.field_k = SpriteSheetAsset.a((byte) -114, 4);
              IsaacRandom.field_g = hi.a(6, -91);
            }
          }
          if (null != b.field_d &&
            !b.field_d.b((byte) -90)) {
            CacheEntry.a(107, NetworkGameClient.field_r, 2.0f);
            return;
          }
          if (null != PacketBuffer.field_m) {
            if (!PacketBuffer.field_m.b((byte) -49)) {
              CacheEntry.a(125, NetworkGameClient.field_r, 3.0f);
              return;
            }
            if (!co.a(PacketBuffer.field_m, b.field_d, 10302)) {
              CacheEntry.a(85, um.field_f, 4.0f);
              return;
            }
          }
          if (null != EntitySound.field_i && (!EntitySound.field_i.b((byte) -94) ||
            !SoundCache.field_c.b((byte) -111))) {
            CacheEntry.a(91, SolidRoadStripRenderer.field_o, 10.0f);
            return;
          }
          if (null != DropTargetWidget.field_J) {
            if (!DropTargetWidget.field_J.b((byte) -67)) {
              CacheEntry.a(117, Vector2f.field_d, 12.0f);
              return;
            }
            if (!StandardContentTransitionDialog.field_lb.b((byte) -86)) {
              CacheEntry.a(104, Vector2f.field_d, 14.0f);
              return;
            }
            if (!ta.field_a.b((byte) -102)) {
              CacheEntry.a(119, SpriteAsset.field_d, 15.0f);
              return;
            }
            if (!t.a(ta.field_a, DropTargetWidget.field_J, (byte) 111, StandardContentTransitionDialog.field_lb)) {
              CacheEntry.a(98, ge.field_a, 16.0f);
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != QuadraticPointPath.field_j) {
            if ((QuadraticPointPath.field_j.b((byte) -73) &&
              QuadraticPointPath.field_j.a((byte) 108)) &&
              (decompiledFrameRemainder0 = (!(NetworkArchiveRequest.field_y.b((byte) -53)) ||
              !(NetworkArchiveRequest.field_y.a((byte) 126))))) {
              CacheEntry.a(89, ByteStorage.a(TextButton.field_E, RoadStripRenderer.field_a, "", false, NetworkArchiveRequest.field_y), 35.0f);
              return;
            }
            if (decompiledFrameRemainder0) {
              CacheEntry.a(114, ByteStorage.a(TextButton.field_E, RoadStripRenderer.field_a, "", param1, QuadraticPointPath.field_j), 30.0f);
              return;
            }
          }
          if (!param0) {
            CacheEntry.a(126, TutorialCalloutAnchor.field_a, 40.0f);
            return;
          }
          if (!NameAvailabilityResult.field_h) {
            NameSuggestionsPanel.a((byte) 22);
            NameAvailabilityResult.field_h = true;
          }
          if (null != b.field_d &&
            null != PacketBuffer.field_m) {
            CacheEntry.a(108, TutorialCalloutAnchor.field_a, 40.0f);
            this.renderGameFrame(256);
            ph.a(PacketBuffer.field_m, (byte) -66, b.field_d);
            b.field_d = null;
            PacketBuffer.field_m = null;
            qd.d(72);
            return;
          }
          if (SoundCache.field_c != null) {
            CacheEntry.a(113, oc.field_b, 60.0f);
            this.renderGameFrame(256);
            jn.a(EntitySound.field_i, -127, SoundCache.field_c);
            EntitySound.field_i = null;
            SoundCache.field_c = null;
            qd.d(56);
            return;
          }
          if (null != DropTargetWidget.field_J) {
            CacheEntry.a(111, RasterBuffer.field_g, 65.0f);
            this.renderGameFrame(256);
            DropTargetWidget.a(30865, StandardContentTransitionDialog.field_lb, DropTargetWidget.field_J, ta.field_a);
            DropTargetWidget.field_J = null;
            ta.field_a = null;
            qd.d(116);
            return;
          }
          if (null != QuadraticPointPath.field_j) {
            CacheEntry.a(110, fj.field_r, 90.0f);
            this.renderGameFrame(256);
            DropTargetWidget.a(QuadraticPointPath.field_j, -121);
            cd.b(121);
            QuadraticPointPath.field_j = null;
            qd.d(94);
            return;
          }
          if (null != NetworkArchiveRequest.field_y &&
            of.a(-969) &&
            ec.field_y.field_i != null) {
            CacheEntry.a(106, fj.field_r, 95.0f);
            this.renderGameFrame(256);
            ai.a(NetworkArchiveRequest.field_y, ec.field_y.field_i, -95);
            NetworkArchiveRequest.field_y = null;
            qd.d(88);
            return;
          }
          ge.field_c = new VehicleDefinition[8];
          var3_int = 0;
          do {
            if (var3_int >= 8) {
              if (null == MusicPatchPcmStream.field_r &&
                null == nm.field_b) {
                RotatedSpriteCache.a(-1);
              }
              break;
            }
            ge.field_c[var3_int] = new VehicleDefinition(var3_int);
            var3_int++;
          } while (var4 == 0);
          if (param1) {
            this.initializeGame((byte) 4);
          }
          var3_int = 0;
          while (var3_int < 13) {
            l.field_a[var3_int] = (pc) ((Object) new ti(var3_int));
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          l.field_a[13] = (pc) ((Object) new ec(13, new int[]{0, 1, 2, 3}, new Sprite[4], gh.field_t, new String[6], vb.field_c, 8355711));
          dg.field_c = 0;
          this.finishGameLoading((byte) 107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var3), "HoldTheLine.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public HoldTheLine() {
    }

    static {
        field_A = 50;
        field_B = "no effect";
        field_E = new int[12];
        field_G = new String[]{"<col=2>You must reach this course in the Classic championship first.</col>", "<col=2>You must reach this course in the Desert championship first.</col>", "<col=2>You must reach this course in the Alpine championship first.</col>", "<col=2>You must reach this course in the Night championship first.</col>"};
    }
}
