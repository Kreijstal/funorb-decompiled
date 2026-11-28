/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Torquing extends NetworkGameClient {
    private TooltipPanel field_t;
    static VolumeScaledPcmStream field_v;
    static String field_w;
    static int field_x;
    public static int field_u;

    final static String readCompressedChatText(int param0, int param1, PacketBuffer param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.readUnsignedSmart((byte) -114);
            if (var3_int > param1) {
              var3_int = param1;
            }
            if (param0 != 26657) {
              Torquing.applyPreferredDisplayMode(9, false);
            }
            var4 = new byte[var3_int];
            param2.position = param2.position + lh.field_u.a(var4, true, param2.position, param2.payload, 0, var3_int);
            var5 = GameApplet.decodeCp1252String(var3_int, true, 0, var4);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("Torquing.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void applyPreferredDisplayMode(int param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        PacketBuffer var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_u;
        try {
          if (param0 >= -33) {
            var4 = (PacketBuffer) null;
            Torquing.readCompressedChatText(-55, 127, (PacketBuffer) null);
          }
          if (wp.field_w > 0) {
            if (AccountRegistrationPanel.field_D == null) {
              TranslucentSpriteLayer.field_i = je.createFullscreenCanvas(640, 480, ArchiveRequest.field_u, 0, 0, -62);
            } else {
              TranslucentSpriteLayer.field_i = AccountRegistrationPanel.field_D.b((byte) -73);
              NameSuggestionsPanel.b(2, -111);
            }
            if (TranslucentSpriteLayer.field_i != null) {
              Bzip2State.a(TranslucentSpriteLayer.field_i, (byte) 63);
              var2_int = 2;
            } else {
              var2_int = 3;
            }
          } else {
            var2_int = (!je.a((byte) 70)) ? 1 : 0;
          }
          if (null == AccountRegistrationPanel.field_D) {
            if (!GzipDecompressor.field_a) {
              return;
            }
            ka.a(var2_int, param1, (byte) -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final void releaseGameResources(int param0) {
        try {
          Torquing.clearTorquingGlobals(29165);
          TriangleRasterizer.clearStaticReferences();
          tj.clearStaticReferences(-36);
          IntrusiveDeque.clearStaticReferences(79);
          cl.a(-11784);
          ol.clearStaticReferences((byte) -51);
          GameKeyHandler.clearStaticReferences(-51);
          ke.clearStaticReferences(-18242);
          vi.clearStaticReferences();
          ua.a(param0 - 10);
          jk.resetStaticState(param0 - 4);
          ClientException.resetStaticState(2712);
          MouseInputHandler.a(18133);
          MouseWheelInput.clearStaticReferences(0);
          SoftwareRasterizer.clearStaticReferences();
          ResourceArchive.clearStaticReferences(param0 + 99);
          BitmapFont.clearStaticReferences();
          l.clearStaticReferences((byte) 88);
          qi.clearStaticReferences(104);
          PacketBuffer.clearBufferStatics((byte) 59);
          km.clearStaticReferences((byte) -123);
          jo.a(16720);
          tf.a((byte) 81);
          dj.clearStaticReferences((byte) -62);
          ff.clearStaticReferences(-61);
          aq.clearStaticReferences(1);
          bq.clearStaticReferences((byte) 74);
          hi.clearStaticReferences(2);
          vd.clearStaticReferences(false);
          hl.clearStaticReferences((byte) -77);
          rh.clearStaticReferences((byte) -47);
          FrameTimer.clearStaticReferences(param0 - 132);
          RasterBuffer.a((byte) 84);
          vf.a(param0 ^ 41);
          FullscreenFocusCanvas.resetStaticState(4);
          m.clearStaticReferences(8192);
          AudioOutput.clearStaticReferences();
          wl.clearStaticReferences();
          SoundCache.clearStaticReferences(108);
          Level.clearLevelGlobals((byte) -113);
          MenuScreen.clearStaticReferences(32);
          FramedPanelLayer.clearStaticReferences(88);
          TooltipPanel.clearStaticReferences(3);
          LevelRun.clearLevelRunGlobals(-3);
          nc.clearStaticReferences(param0 ^ 56);
          hj.clearStaticReferences((byte) 114);
          Js5Transport.clearStaticReferences((byte) -77);
          DiskCacheWorker.a(param0 ^ 6);
          ArchiveSourceManager.clearStaticReferences(21384);
          BufferedRandomAccessFile.clearStaticReferences(-1);
          BufferedSocket.clearStaticReferences(param0 - 4);
          SpriteState.clearStaticReferences(false);
          DualLinkNode.clearDeclaredStaticReferences(-93);
          IntrusiveNode.b((byte) 92);
          gk.clearStaticReferences(-64);
          AudioService.clearStaticReferences(true);
          VolumeScaledPcmStream.clearStaticReferences(160);
          oi.a(0);
          db.d(-98);
          to.a(param0 ^ 29826);
          fn.a(false);
          ag.clearStaticReferences(18945);
          SceneMeshBatch.clearStaticReferences();
          dd.clearStaticReferences((byte) -127);
          g.clearStaticReferences();
          Model.a(param0 ^ 24993);
          ti.clearStaticReferences(false);
          jn.clearStaticReferences((byte) 60);
          oh.clearStaticReferences(20269);
          eo.clearStaticReferences(6);
          dc.clearStaticReferences(false);
          sh.clearStaticReferences(-127);
          vg.clearStaticReferences((byte) -97);
          eh.clearDeclaredStaticReferences((byte) -106);
          ed.clearStaticReferences((byte) -30);
          ArchiveIndex.resetStaticState(76);
          GzipDecompressor.resetStaticState((byte) -12);
          ArchiveSource.a((byte) 75);
          hg.a(false);
          da.a(102);
          bh.clearStaticReferences(-113);
          vo.clearStaticReferences((byte) -125);
          bc.a((byte) -120);
          IsaacPacketBuffer.clearStaticReferences(3);
          nn.b(-93);
          ModalDialogHost.h((byte) 111);
          ProgressDialog.clearDeclaredStaticReferences(-7361);
          StandardContentDialog.resetStaticState(1269);
          ProgressMessageDialog.clearStaticReferences((byte) 77);
          AccountRegistrationPanel.clearStaticReferences(0);
          GuestPlayConfirmationForm.h(-59);
          LoginPanel.g((byte) -122);
          DisplayNameSelectionPanel.clearStaticReferences(2147483647);
          a.clearStaticReferences(param0 ^ 4);
          tl.resetStaticState((byte) -110);
          eb.clearStaticReferences((byte) -31);
          jl.clearStaticReferences(2);
          ap.clearStaticReferences();
          pa.clearStaticReferences((byte) -126);
          bl.clearStaticReferences(-92);
          rl.clearStaticReferences((byte) 120);
          SpriteBase.resetStaticState(param0 ^ -64);
          MenuLayer.clearDeclaredStaticReferences(23394);
          de.clearStaticReferences((byte) 113);
          TranslucentSpriteLayer.clearStaticReferences(12949);
          kg.b((byte) -64);
          ik.clearStaticReferences((byte) 59);
          ji.clearStaticReferences(param0 - 101);
          wk.a((byte) -98);
          cf.clearStaticReferences(1);
          un.clearStaticReferences(-13524);
          wd.clearStaticReferences(0);
          SynthesizerVoice.clearStaticReferences();
          VorbisSample.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          lh.clearStaticReferences(param0 - 128);
          pn.clearStaticReferences(92);
          hf.a(param0 ^ 8);
          gb.clearStaticReferences(-89);
          am.clearStaticReferences((byte) -123);
          IsaacCipher.clearStaticReferences((byte) 126);
          SocketJs5Transport.d(param0 - 1);
          NetworkArchiveRequest.clearStaticReferences(param0 ^ 4);
          SectorCacheStore.clearStaticReferences(false);
          DiskArchiveRequest.clearStaticReferences(0);
          CachedArchiveSource.clearStaticReferences(-96);
          RandomAccessCacheFile.clearStaticReferences(param0 - 82);
          pd.a(false);
          ArchiveRequest.releaseDeclaredStaticReferences(param0 + 252);
          ra.resetStaticState(376);
          FullscreenStatusDialog.clearDeclaredStaticReferences(50);
          ip.clearStaticReferences(108);
          DefaultTextWidgetRenderer.clearStaticReferences(4252);
          pg.a(47);
          jb.a((byte) -124);
          VertexMesh.clearStaticReferences((byte) -81);
          qh.clearStaticReferences((byte) 39);
          cc.clearStaticReferences((byte) 65);
          gi.a((byte) 78);
          qe.clearStaticReferences((byte) 102);
          mb.clearStaticReferences((byte) -83);
          LoginRequestBuilder.clearStaticReferences(-72);
          w.clearStaticReferences(param0 + 2147483644);
          uk.clearStaticReferences(0);
          DelegatingCanvas.a(-137);
          cn.resetStaticState(-1581);
          vb.a(param0 ^ 41);
          ByteStorage.clearStaticReferences(param0 - 110);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.a((byte) 44);
          pm.clearStaticReferences(0);
          DelayedPcmStream.clearStaticReferences(-125);
          ByteArrayPoolSupport.a(-62);
          oc.clearStaticReferences(false);
          oj.clearStaticReferences(param0 ^ 5);
          ld.b((byte) -21);
          rn.a((byte) 116);
          TextLayout.clearStaticReferences((byte) -54);
          UiWidget.d(13509);
          InteractiveWidget.clearStaticReferences(52);
          SingleChildWidgetContainer.clearDeclaredStaticReferences((byte) 69);
          ResizableModalDialog.clearStaticReferences(-126);
          WidgetContainer.f((byte) 2);
          re.clearStaticReferences(21007);
          r.clearStaticReferences(param0 + 33423357);
          p.clearStaticReferences(29841);
          ci.clearStaticReferences(2);
          gh.a(118);
          al.clearStaticReferences((byte) 20);
          ie.clearStaticReferences(-1674);
          ne.clearStaticReferences(param0 + 4508);
          ef.clearStaticReferences(param0 - 1);
          ob.clearStaticReferences((byte) -12);
          SocketConnector.clearStaticReferences(23116);
          ProxyAuthenticationRequiredException.clearStaticReferences((byte) -102);
          NanoFrameTimer.clearDeclaredStaticReferences(0);
          mk.a(115);
          qm.clearStaticReferences(param0 ^ 35);
          ja.clearStaticReferences();
          wi.clearStaticReferences(-126);
          sb.a(31238);
          nf.clearStaticReferences();
          ej.clearStaticReferences();
          ug.clearStaticReferences(false);
          LabeledWidgetContainer.clearStaticReferences(0);
          ValidatedTextField.resetStaticState((byte) 121);
          ContentTransitionDialog.clearDeclaredStaticReferences(0);
          StripedProgressWidget.a(false);
          NameSuggestionsPanel.clearStaticReferences(-1);
          ValidationStatusIcon.clearStaticReferences((byte) -19);
          ValidationStatusWidget.clearStaticReferences((byte) -37);
          ok.clearDeclaredStaticReferences(param0 + 9);
          TextFieldValidator.clearStaticReferences(param0 - 4);
          bf.clearStaticReferences(3);
          va.clearStaticReferences(true);
          om.a(param0 - 4);
          tp.clearStaticReferences(121);
          ro.resetStaticState((byte) 123);
          od.clearStaticReferences(11860);
          jf.clearStaticReferences(37);
          SoundFilter.clearStaticReferences();
          u.clearDeclaredStaticReferences((byte) -47);
          po.clearDeclaredStaticReferences((byte) 0);
          wn.clearStaticReferences(param0 - 4);
          so.clearDeclaredStaticReferences((byte) 126);
          qn.clearStaticReferences(false);
          te.b(param0 - 445141588);
          ee.g((byte) -62);
          kc.clearStaticReferences(param0 ^ param0);
          hm.clearStaticReferences(12);
          lk.clearStaticReferences(0);
          sd.clearDeclaredStaticReferences((byte) 115);
          b.clearStaticReferences(param0 + 16056);
          eg.clearStaticReferences(param0 - 128);
          qg.clearStaticReferences(-1172010644);
          bd.clearStaticReferences(false);
          mo.clearDeclaredStaticReferences((byte) -16);
          lc.resetStaticState(false);
          mi.clearDeclaredStaticReferences((byte) -39);
          go.clearStaticReferences(param0 ^ 58);
          ql.clearStaticReferences(16711935);
          ea.resetStaticState(true);
          pl.clearStaticReferences(param0 ^ -69);
          cq.clearStaticReferences(param0 - 1339901240);
          jg.g((byte) 106);
          wp.a(true);
          rg.clearStaticReferences(param0 + 31631);
          s.clearDeclaredStaticReferences((byte) -73);
          mf.clearDeclaredStaticReferences((byte) 21);
          hb.clearStaticReferences(-799778388);
          nl.d(param0 - 132);
          wh.g((byte) 115);
          rj.clearDeclaredStaticReferences((byte) -102);
          ib.clearStaticReferences(-22719);
          wb.g((byte) 109);
          vk.b(95);
          rd.clearStaticReferences(127);
          RichTextLayout.clearStaticReferences(31003);
          DirectByteStorage.clearDeclaredStaticReferences(-101);
          GrowableIntArray.clearStaticReferences(-1);
          DropTargetWidgetContainer.resetStaticState(-97);
          k.clearStaticReferences(param0 + 98);
          IterableNodeHashTable.clearStaticReferences((byte) 93);
          SecondaryNodeDeque.clearStaticReferences(-83);
          d.releaseDeclaredStaticReferences(param0 ^ -99);
          en.clearStaticReferences(1);
          ProxySocketConnector.clearStaticReferences(false);
          lp.a(0);
          in.clearStaticReferences((byte) -28);
          qf.clearStaticReferences(true);
          ih.clearStaticReferences((byte) -45);
          wa.a(-117);
          on.a(160);
          ah.b(param0 - 3);
          NodeHashTableIterator.clearStaticReferences(true);
          SecondaryNodeDequeIterator.a(true);
          bm.clearStaticReferences(107);
          wc.clearStaticReferences(0);
          qj.clearStaticReferences(false);
          cb.clearStaticReferences(88);
          rf.clearStaticReferences((byte) 61);
          je.clearStaticReferences((byte) 86);
          ig.clearDeclaredStaticReferences(-117);
          io.a((byte) -113);
          kb.clearStaticReferences(param0 ^ 6);
          AlphaWidgetContainer.clearStaticReferences((byte) -118);
          ae.clearStaticReferences((byte) 112);
          og.a((byte) 125);
          rp.clearStaticReferences(-28607);
          nh.a(false);
          AchievementProgressUpdate.clearStaticReferences(-39);
          h.a(13809);
          LevelCompletionUpdate.clearStaticReferences((byte) 109);
          ud.clearStaticReferences((byte) -128);
          ii.a(param0 ^ -28451);
          up.clearStaticReferences(-108);
          ce.clearStaticReferences((byte) -55);
          ai.clearStaticReferences((byte) 64);
          he.a(-1);
          e.clearStaticReferences(true);
          wj.clearDeclaredStaticReferences(false);
          rk.clearStaticReferences(true);
          AccountRequestState.releaseStatics((byte) -119);
          AccountServiceResult.clearStaticReferences((byte) 10);
          DialogMessagePane.h(-2);
          IndexedSpriteLayer.c(param0 ^ -3);
          FullscreenNoticeType.clearStaticReferences((byte) 84);
          qa.a(126);
          ni.clearStaticReferences(-37);
          v.clearStaticReferences((byte) 123);
          pf.clearStaticReferences(106);
          mc.clearStaticReferences(5);
          AccountNameAvailabilityValidator.c((byte) -124);
          PasswordValidator.f(-99);
          EmailFormatValidator.clearDeclaredStaticReferences(0);
          ConfirmedEmailAvailabilityValidator.clearStaticReferences((byte) 17);
          AgeValidator.clearDeclaredStaticReferences(64);
          MatchingFieldValidator.clearStaticReferences((byte) -121);
          qd.clearStaticReferences(15);
          TextHotspotBounds.clearStaticReferences((byte) 103);
          cd.clearStaticReferences((byte) -11);
          DebouncedFieldValidator.clearDeclaredStaticReferences((byte) 62);
          ka.clearStaticReferences(101);
          ui.a(-22677);
          n.clearStaticReferences(0);
          kj.clearStaticReferences((byte) -22);
          ak.b(-1507);
          cp.b(param0 + 2092666600);
          ll.resetStaticState((byte) 81);
          bp.clearStaticReferences(false);
          this.field_i = null;
          this.field_t = null;
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.AA(" + param0 + ')');
        }
    }

    public Torquing() {
    }

    private final void flushQueuedProgressUpdates(boolean param0) {
        int var3 = 0;
        AchievementProgressUpdate var4 = null;
        LevelCompletionUpdate var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_u;
        try {
          if (!param0) {
            return;
          }
          var4 = (AchievementProgressUpdate) (SingleChildWidgetContainer.field_y.beginBackward(0));
          while (var4 != null) {
            wc.a(var4, (byte) 99, 4);
            var4 = (AchievementProgressUpdate) (SingleChildWidgetContainer.field_y.nextBackward(-24059));
          }
          var5 = (LevelCompletionUpdate) (ArchiveSourceManager.field_l.beginBackward(0));
          while (var5 != null) {
            le.a((byte) 126, 5, var5);
            var5 = (LevelCompletionUpdate) (ArchiveSourceManager.field_l.nextBackward(-24059));
          }
          kg.field_c = ip.a(4, -127);
          kb.field_f = tl.a(5, 0, 1, 0);
          if (wp.field_w > 0) {
            ee.field_s = false;
            lp.field_f = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.BB(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        PcmStreamMixer var2 = null;
        PcmStreamMixer var3 = null;
        try {
          this.initializeClientServices(11, 11, false, param0 + 477, 9, 15, 10, 0);
          AudioOutput.configureAudio(22050, true, 10);
          qd.field_b = AudioOutput.createOutput(ArchiveRequest.field_u, (java.awt.Component) ((Object) k.field_d), 0, 22050);
          ResourceArchive.field_c = AudioOutput.createOutput(ArchiveRequest.field_u, (java.awt.Component) ((Object) k.field_d), 1, 1024);
          var2 = new PcmStreamMixer();
          ResourceArchive.field_c.setRootStream(var2);
          var3 = new PcmStreamMixer();
          qd.field_b.setRootStream(var3);
          ql.a(param0 ^ 1618865635, var3, var2);
          this.a(true, false, true, true, false);
          GzipDecompressor.field_b = vi.field_a.length;
          cc.field_c = 1;
          TooltipPanel.field_c = 0;
          if (param0 != -593) {
            this.drawWorldPreview(true, -107);
          }
          qa.field_l = 9;
          SceneMeshBatch.initializeEmptyMesh();
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.DA(" + param0 + ')');
        }
    }

    private final void drawWorldProgressScreen(int param0, int param1) {
        try {
          k.a(param1, 1);
          nc.a(param1, true);
          StandardContentDialog.field_cb.drawFramedPanel((byte) -51, 0, 0);
          wh.field_t[param1].drawWithAlpha(0, 0, 76);
          pm.field_m[param1].drawOpaque(0, 0);
          MenuScreen.field_d[param1].drawWithAlpha(0, 0, 76);
          GameKeyHandler.field_a[param1].drawOpaque(0, 0);
          if (null == this.field_t) {
            this.field_t = new TooltipPanel(FullscreenStatusDialog.field_Q, 0, 372, 286, GameKeyHandler.field_a[param1], -34, -159);
            this.field_t.addFlexibleVerticalSpace((byte) -19, 30);
            this.field_t.appendCenteredText(false, ff.a(new String[]{Integer.toString(param1 + 1)}, 0, DefaultTextWidgetRenderer.field_n));
            this.field_t.addFlexibleVerticalSpace((byte) 120, 40);
            this.field_t.appendCenteredText(false, ff.a(new String[]{Integer.toString(ie.field_b.field_b[param1]), Integer.toString(MenuScreen.field_k[param1])}, 0, ka.field_l));
            this.field_t.addFlexibleVerticalSpace((byte) 97, 30);
            this.field_t.justifyPanelContents(0);
          }
          this.field_t.drawPanel(34, -120, 159);
          qh.field_c.drawParagraph(VolumeScaledPcmStream.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, 3 * (1 + dd.field_c.field_x) / 2);
          if (param0 < 30) {
            this.prepareGameShutdown(61);
          }
          SoftwareRasterizer.drawRectangleOutline(0, 0, 640, 480, 16777215);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean advanceGameAssetLoading(boolean param0, byte param1) {
        Sprite dupTemp$0 = null;
        int var19_int = 0;
        int var20 = 0;
        int var18 = 0;
        StringBuilder discarded$2 = null;
        int incrementValue$1 = 0;
        StringBuilder discarded$4 = null;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] var3 = null;
        int var3_int = 0;
        int[] var3_array = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        byte[] var4 = null;
        Level var4_ref = null;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        int var6 = 0;
        IndexedSprite var7_ref_sm = null;
        int var7 = 0;
        FramedPanelLayer var8_ref_ia = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        Object var10_ref = null;
        int var11_int = 0;
        TranslucentSpriteLayer var11 = null;
        int[] var11_array = null;
        int var12_int = 0;
        int[] var12 = null;
        MenuLayer var13 = null;
        int var13_int = 0;
        StringBuilder var13_ref = null;
        int var14_int = 0;
        Level var14 = null;
        IndexedSprite var15_ref_sm = null;
        int var15 = 0;
        FramedPanelLayer var16_ref_ia = null;
        Sprite var16_ref_t = null;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        PacketBuffer var28 = null;
        int[] var30 = null;
        MeshGeometry var31 = null;
        short[] var32 = null;
        Sprite var33 = null;
        Sprite var34 = null;
        IndexedSprite[] var35 = null;
        IndexedSprite var36 = null;
        Sprite var37 = null;
        Sprite var38 = null;
        Sprite[] var40 = null;
        Sprite var41 = null;
        IndexedSprite[] var42 = null;
        IndexedSprite var43 = null;
        IndexedSprite var44 = null;
        IndexedSprite var45 = null;
        Sprite var46 = null;
        int[] var47 = null;
        Sprite[] var48 = null;
        Sprite var49 = null;
        PcmSample var50 = null;
        byte[] var51 = null;
        PacketBuffer var52 = null;
        String var53 = null;
        StringBuilder var54 = null;
        Level var55 = null;
        byte[] var56 = null;
        PacketBuffer var57 = null;
        String var58 = null;
        Level var59 = null;
        short[] var60 = null;
        int[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        int[] var67 = null;
        int[] var68 = null;
        short[] var3Lifetime1;
        Level var4_refLifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var7Lifetime1;
        int var11_intLifetime1;
        int var12_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11_intLifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        var27 = field_u;
        try {
          nn.a(-98);
          if (rl.field_a != null) {
            if (tp.field_a == null) {
              if (rp.field_d.ensureIndexLoaded(-12749) &&
                rp.field_d.tryLoadGroupByName(true, "basic")) {
                if (!rp.field_d.tryLoadGroupByName(true, "benefits")) {
                  IsaacPacketBuffer.a(1.0f, -93, c.a(param1 ^ -117, ArchiveSourceManager.field_i, "basic", db.field_d, rp.field_d));
                  return false;
                }
                if (!rp.field_d.tryLoadGroupByName(true, "kartika13")) {
                  IsaacPacketBuffer.a(2.0f, 117, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                  return false;
                }
                if (e.field_b.ensureIndexLoaded(-12749) &&
                  e.field_b.tryLoadGroupByName(true, "kartika13")) {
                  if (rl.field_a.ensureIndexLoaded(param1 - 12647) &&
                    rl.field_a.tryLoadAllGroups(-19375)) {
                    if (rg.field_v.ensureIndexLoaded(-12749) &&
                      rg.field_v.tryLoadAllGroups(-19375)) {
                      if (TooltipPanel.field_l.ensureIndexLoaded(-12749) &&
                        TooltipPanel.field_l.tryLoadAllGroups(-19375)) {
                        if (NameSuggestionsPanel.field_D.ensureIndexLoaded(-12749) &&
                          NameSuggestionsPanel.field_D.tryLoadAllGroups(-19375)) {
                          if (n.field_q.ensureIndexLoaded(-12749) &&
                            n.field_q.tryLoadAllGroups(-19375)) {
                            if (bp.field_c.ensureIndexLoaded(-12749) &&
                              bp.field_c.tryLoadAllGroups(param1 ^ 19403)) {
                              if (vd.field_e.ensureIndexLoaded(-12749) &&
                                vd.field_e.tryLoadAllGroups(param1 - 19273)) {
                                if (DisplayNameSelectionPanel.field_C.ensureIndexLoaded(-12749) &&
                                  DisplayNameSelectionPanel.field_C.tryLoadAllGroups(param1 ^ 19403)) {
                                  if (he.field_b.ensureIndexLoaded(-12749) &&
                                    he.field_b.tryLoadAllGroups(-19375)) {
                                    if (wp.field_w > 0 && (!eg.field_t.ensureIndexLoaded(-12749) ||
                                      !eg.field_t.tryLoadAllGroups(param1 - 19273))) {
                                      IsaacPacketBuffer.a(29.0f, -63, c.a(17, pa.field_a, "", pd.field_a, eg.field_t));
                                      return false;
                                    }
                                    pm.a((byte) 80);
                                    IsaacPacketBuffer.a(30.0f, param1 + 116, jn.field_d);
                                    this.renderFrame((byte) 73);
                                    if (!param0) {
                                      return false;
                                    }
                                    tp.field_a = je.a(rl.field_a, "", "sphere", (byte) -124);
                                    cf.a(param1 ^ -6539);
                                    return false;
                                  }
                                  IsaacPacketBuffer.a(28.0f, 101, c.a(17, pa.field_a, "", pd.field_a, he.field_b));
                                  return false;
                                }
                                IsaacPacketBuffer.a(27.0f, -72, c.a(17, tf.field_a, "", NetworkArchiveRequest.field_A, DisplayNameSelectionPanel.field_C));
                                return false;
                              }
                              IsaacPacketBuffer.a(26.0f, param1 ^ 59, c.a(17, fn.field_a, "", WidgetContainer.field_A, vd.field_e));
                              return false;
                            }
                            IsaacPacketBuffer.a(23.0f, param1 ^ 41, c.a(17, fn.field_a, "", WidgetContainer.field_A, bp.field_c));
                            return false;
                          }
                          IsaacPacketBuffer.a(20.0f, param1 + 110, AccountNameAvailabilityValidator.a(pg.field_a, n.field_q, mb.field_c, (byte) 33));
                          return false;
                        }
                        IsaacPacketBuffer.a(20.0f, 5, AccountNameAvailabilityValidator.a(pg.field_a, NameSuggestionsPanel.field_D, mb.field_c, (byte) 113));
                        return false;
                      }
                      IsaacPacketBuffer.a(19.0f, 28, c.a(param1 + 119, ol.field_e, "", l.field_c, TooltipPanel.field_l));
                      return false;
                    }
                    IsaacPacketBuffer.a(10.0f, -99, c.a(17, ArchiveSourceManager.field_i, "", db.field_d, rg.field_v));
                    return false;
                  }
                  IsaacPacketBuffer.a(3.0f, -102, c.a(17, vf.field_g, "", kb.field_c, rl.field_a));
                  return false;
                }
                IsaacPacketBuffer.a(2.0f, -80, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                return false;
              }
              IsaacPacketBuffer.a(1.0f, 84, c.a(17, ArchiveSourceManager.field_i, "basic", db.field_d, rp.field_d));
              return false;
            }
            if (MouseWheelInput.field_c == null) {
              MouseWheelInput.field_c = new Model[32];
              MouseWheelInput.field_c[0] = je.a(rl.field_a, "", "powerups/exit", (byte) -121);
              MouseWheelInput.field_c[2] = je.a(rl.field_a, "", "powerups/time_fixed", (byte) -127);
              MouseWheelInput.field_c[1] = je.a(rl.field_a, "", "powerups/score", (byte) -119);
              MouseWheelInput.field_c[4] = je.a(rl.field_a, "", "powerups/spikes", (byte) -127);
              MouseWheelInput.field_c[5] = je.a(rl.field_a, "", "powerups/frameRotation", (byte) -122);
              cf.a(6639);
              return false;
            }
            if (MouseWheelInput.field_c[6] == null) {
              MouseWheelInput.field_c[6] = je.a(rl.field_a, "", "powerups/gyroscope", (byte) -127);
              MouseWheelInput.field_c[7] = je.a(rl.field_a, "", "powerups/bomb", (byte) -127);
              MouseWheelInput.field_c[8] = je.a(rl.field_a, "", "powerups/shield", (byte) -121);
              MouseWheelInput.field_c[9] = je.a(rl.field_a, "", "powerups/letter_t", (byte) -122);
              MouseWheelInput.field_c[10] = je.a(rl.field_a, "", "powerups/letter_o", (byte) -120);
              cf.a(6639);
              return false;
            }
            if (null == MouseWheelInput.field_c[11]) {
              MouseWheelInput.field_c[11] = je.a(rl.field_a, "", "powerups/letter_r", (byte) -118);
              MouseWheelInput.field_c[12] = je.a(rl.field_a, "", "powerups/letter_q", (byte) -123);
              MouseWheelInput.field_c[13] = je.a(rl.field_a, "", "powerups/letter_u", (byte) -122);
              MouseWheelInput.field_c[14] = je.a(rl.field_a, "", "powerups/letter_i", (byte) -123);
              MouseWheelInput.field_c[15] = je.a(rl.field_a, "", "powerups/letter_n", (byte) -126);
              cf.a(param1 ^ -6539);
              return false;
            }
            if (MouseWheelInput.field_c[16] == null) {
              MouseWheelInput.field_c[16] = je.a(rl.field_a, "", "powerups/letter_g", (byte) -128);
              MouseWheelInput.field_c[17] = je.a(rl.field_a, "", "powerups/skin_tennisball", (byte) -124);
              gi.a(MouseWheelInput.field_c[17].field_l, (byte) 13, 31);
              MouseWheelInput.field_c[18] = new Model(new jl(30, false));
              MouseWheelInput.field_c[19] = je.a(rl.field_a, "", "powerups/skin_marble", (byte) -126);
              gi.a(MouseWheelInput.field_c[19].field_l, (byte) 13, 31);
              MouseWheelInput.field_c[20] = je.a(rl.field_a, "", "powerups/skin_ballbearing", (byte) -119);
              gi.a(MouseWheelInput.field_c[20].field_l, (byte) 13, 31);
              cf.a(6639);
              return false;
            }
            if (MouseWheelInput.field_c[21] == null) {
              MouseWheelInput.field_c[21] = je.a(rl.field_a, "", "powerups/skin_beachball", (byte) -123);
              gi.a(MouseWheelInput.field_c[21].field_l, (byte) 13, 31);
              MouseWheelInput.field_c[22] = je.a(rl.field_a, "", "powerups/skin_apple", (byte) -121);
              MouseWheelInput.field_c[23] = je.a(rl.field_a, "", "powerups/skin_atom", (byte) -123);
              MouseWheelInput.field_c[24] = je.a(rl.field_a, "", "powerups/skin_orb", (byte) -124);
              gi.a(MouseWheelInput.field_c[24].field_l, (byte) 13, 31);
              ji.a(MouseWheelInput.field_c[24].field_l, -1);
              cf.a(6639);
              return false;
            }
            if (FramedPanelLayer.a(-22426, 0)) {
              var31 = MeshGeometry.load(rl.field_a, "", "sphere_halloween");
              gi.a(var31, (byte) 13, 31);
              MouseWheelInput.field_c[17] = new Model(var31);
              MouseWheelInput.field_c[18] = new Model(var31);
              MouseWheelInput.field_c[19] = new Model(var31);
              MouseWheelInput.field_c[20] = new Model(var31);
              MouseWheelInput.field_c[21] = new Model(var31);
              MouseWheelInput.field_c[22] = new Model(var31);
              MouseWheelInput.field_c[23] = new Model(var31);
              MouseWheelInput.field_c[24] = new Model(var31);
              ji.a(MouseWheelInput.field_c[24].field_l, -1);
            }
            if (null == MouseWheelInput.field_c[3]) {
              MouseWheelInput.field_c[3] = je.a(rl.field_a, "", "obstacles/childs_play_block", (byte) -120);
              MouseWheelInput.field_c[25] = je.a(rl.field_a, "", "obstacles/drinks_can", (byte) -128);
              MouseWheelInput.field_c[26] = je.a(rl.field_a, "", "obstacles/grave_stone2", (byte) -128);
              MouseWheelInput.field_c[27] = je.a(rl.field_a, "", "obstacles/pinetree_round", (byte) -123);
              MouseWheelInput.field_c[28] = je.a(rl.field_a, "", "obstacles/pinetree_square", (byte) -122);
              MouseWheelInput.field_c[29] = je.a(rl.field_a, "", "obstacles/statue", (byte) -126);
              var60 = MouseWheelInput.field_c[29].field_l.field_m;
              var32 = var60;
              var3 = var32;
              for (var4_int = 0; var4_int < var60.length; var4_int++) {
                var5 = var60[var4_int];
                var3[var4_int] = (short)(ie.bitwiseAnd(127, var5) + 8704);
              }
              MouseWheelInput.field_c[30] = je.a(rl.field_a, "", "obstacles/traffic_cone", (byte) -123);
              MouseWheelInput.field_c[31] = je.a(rl.field_a, "", "obstacles/traffic_lights_tall", (byte) -121);
              cf.a(6639);
              return false;
            }
            if (vb.field_c[3] == null) {
              vb.field_c[3] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_block").createModel(80, 1365, -1, -12, 12));
              vb.field_c[25] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_can").createModel(80, 1365, -1, -12, 12));
              vb.field_c[26] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_grave").createModel(80, 1365, -1, -12, 12));
              vb.field_c[27] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_roundtree").createModel(80, 1365, -1, -12, 12));
              vb.field_c[28] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_squaretree").createModel(80, 1365, -1, -12, 12));
              vb.field_c[29] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_statue").createModel(80, 1365, -1, -12, 12));
              vb.field_c[30] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_cone").createModel(80, 1365, -1, -12, 12));
              vb.field_c[31] = (LitModelMesh) (MeshGeometry.load(rl.field_a, "", "obstacles/bb_lights_tall_nopost").createModel(80, 1365, -1, -12, 12));
              ka.field_n[31][0] = 0;
              ka.field_n[31][4] = 0;
              ka.field_n[31][1] = 16;
              ka.field_n[31][2] = 8;
              ka.field_n[31][3] = -101;
              cf.a(6639);
              return false;
            }
            gb.field_c = je.a(rl.field_a, "", "powerups/spikesonly", (byte) -127);
            var3Lifetime1 = MouseWheelInput.field_c[9].field_l.field_m;
            for (var4_intLifetime1 = 10; var4_intLifetime1 <= 16; var4_intLifetime1++) {
              if (MouseWheelInput.field_c[var4_intLifetime1].field_l.field_m.length > var3Lifetime1.length) {
                var3Lifetime1 = MouseWheelInput.field_c[var4_intLifetime1].field_l.field_m;
              }
            }
            for (var4_intLifetime2 = 9; var4_intLifetime2 <= 16; var4_intLifetime2++) {
              MouseWheelInput.field_c[var4_intLifetime2].field_l.field_m = var3Lifetime1;
            }
            ArrayBlockSupport.a(var3Lifetime1, 0, var3Lifetime1.length, (short) 960);
            rl.field_a = null;
            cf.a(6639);
            return false;
          }
          if (rp.field_d != null) {
            IsaacPacketBuffer.a(32.0f, -66, k.field_h);
            this.renderFrame((byte) 73);
            VolumeScaledPcmStream.field_o = ProgressMessageDialog.a(rp.field_d, "basic", "unachieved", 112);
            LoginPanel.field_J = ProgressMessageDialog.a(rp.field_d, "basic", "locked", param1 + 207);
            mo.a(VolumeScaledPcmStream.field_o, 4);
            dd.field_i = ProgressMessageDialog.a(rp.field_d, "basic", "orbcoin", 124);
            this.loadInterfaceFonts(8);
            if (0 >= wp.field_w) {
              m.a(16750848, (java.applet.Applet) (this), 0, NodeHashTableIterator.field_a, 0, 16777215);
              var33 = new Sprite(640, 480);
              rj.a(-65, cp.field_i, var33);
              MouseWheelInput.a(ProgressMessageDialog.a(rg.field_v, "", "mb_logo", 96), false);
              var34 = ProgressMessageDialog.a(rg.field_v, "", "mb_price_bg", 97);
              TextLineMetrics.a(var34, 10, 24, 96, 118, 37, 6, false, -2000);
              mk.field_b.setAsRasterTarget(-101);
            }
            rp.field_d = null;
            cf.a(6639);
            return false;
          }
          if (null != rg.field_v) {
            var3_int = dd.field_c.field_t + dd.field_c.field_x;
            Model.field_r = new Sprite(var3_int, var3_int);
            Model.field_r.bindAsRenderTarget();
            dd.field_i.drawScaledAveraged(0, 0, var3_int, var3_int);
            dd.field_i = null;
            mk.field_b.setAsRasterTarget(param1 + 4);
            s.field_t = SectorCacheStore.a("frame", -1, "", rg.field_v);
            DiskArchiveRequest.a(16777215, SectorCacheStore.a("frame2col", -1, "", rg.field_v), SectorCacheStore.a("frame2alpha", -1, "", rg.field_v), param1 ^ -98);
            var35 = ip.a(rg.field_v, -123, "", "intro_components");
            var42 = ip.a(rg.field_v, -109, "", "intro_components_shadows");
            var43 = var35[1];
            var7_ref_sm = var35[3];
            var8_ref_ia = new FramedPanelLayer(18, 142, 404, 320);
            StandardContentDialog.field_cb = var8_ref_ia;
            pa.field_e = ip.a(rg.field_v, -115, "", "world_text");
            GameKeyHandler.field_a = ip.a(rg.field_v, -109, "", "world_img");
            MenuScreen.field_d = ip.a(rg.field_v, param1 - 17, "", "world_img_shadow");
            rp.field_b = new Sprite[32];
            var9_ref_int__ = new int[]{16777215, 14211288, 15000804, 10526880};
            for (var10 = 0; var10 < 8; var10++) {
              var36 = GameKeyHandler.field_a[var10];
              var37 = new Sprite(var36.field_c, var36.field_d);
              var37.bindAsRenderTarget();
              var36.drawOpaque(-var36.field_a, -var36.field_g);
              if (var36.field_d < var36.field_c) {
                var14_int = 48 * var36.field_d / var36.field_c;
                var13_int = 48;
              } else {
                var13_int = var36.field_c * 48 / var36.field_d;
                var14_int = 48;
              }
              for (var15 = 0; var15 < var9_ref_int__.length; var15++) {
                dupTemp$0 = new Sprite(var13_int, var14_int);
                rp.field_b[var15 * 8 + var10] = dupTemp$0;
                var38 = dupTemp$0;
                var16_ref_t = var38;
                var16_ref_t.field_u = 48;
                var16_ref_t.field_r = -var38.field_t + var38.field_u >> 1;
                var38.bindAsRenderTarget();
                var17 = var9_ref_int__[var15];
                SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d, var17);
                var37.drawDownscaledAreaAveraged(0, 0, var13_int, var14_int);
                if (16777215 == var17) {
                  SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
                }
                var67 = var38.field_y;
                for (var19_int = 0; var67.length > var19_int; var19_int++) {
                  if (~var67[var19_int] == ~var17) {
                    var67[var19_int] = 0;
                  }
                }
                var38.trimTransparentBorders();
              }
            }
            mk.field_b.setAsRasterTarget(param1 ^ 11);
            pm.field_m = ip.a(rg.field_v, -114, "", "world_title");
            wh.field_t = ip.a(rg.field_v, param1 ^ 23, "", "world_title_shadows");
            wj.field_k = DelegatingCanvas.a("getready", 31094, rg.field_v, "");
            SceneMeshBatch.field_e = SectorCacheStore.a("sprite_textures", param1 ^ 101, "", rg.field_v);
            SceneMeshBatch.field_a = SectorCacheStore.a("auras", -1, "", rg.field_v);
            var40 = SceneMeshBatch.field_a;
            for (var11_int = 0; var40.length > var11_int; var11_int++) {
              var41 = var40[var11_int];
              var41.normalizeCanvas();
            }
            hj.field_c = var43;
            VertexMesh.field_l = var35[2].toRgbSprite();
            AlphaWidgetContainer.field_F = new TranslucentSpriteLayer(var42[2], 0, 0, 76);
            cq.field_w = var35[4].toRgbSprite();
            ResourceArchive.field_j = var35[0].toRgbSprite();
            SingleChildWidgetContainer.field_B = new TranslucentSpriteLayer(var42[0], 0, 0, 76);
            jb.field_b = var8_ref_ia;
            nh.field_l = var7_ref_sm;
            bd.field_w = ProgressMessageDialog.a(rg.field_v, "", "dashboard", 106);
            VolumeScaledPcmStream.field_n = ProgressMessageDialog.a(rg.field_v, "", "shieldIcon", 105);
            FramedPanelLayer.field_f = ProgressMessageDialog.a(rg.field_v, "", "gyroIcon", 104);
            GrowableIntArray.field_h = SectorCacheStore.a("countdown", -1, "", rg.field_v);
            hi.field_h = new IndexedSprite[8];
            UiWidget.field_r = new IndexedSprite[8];
            for (var10Lifetime2 = 0; 8 > var10Lifetime2; var10Lifetime2++) {
              UiWidget.field_r[var10Lifetime2] = DelegatingCanvas.a("mg" + var10Lifetime2, 31094, rg.field_v, "");
              if (var10Lifetime2 == 1) {
                hi.field_h[var10Lifetime2] = DelegatingCanvas.a("mg" + var10Lifetime2 + "b", 31094, rg.field_v, "");
              }
            }
            RandomAccessCacheFile.field_c = SectorCacheStore.a("skins", param1 + 101, "", rg.field_v);
            bl.field_d = 7;
            qo.field_t = 2;
            for (var10Lifetime3 = 0; var10Lifetime3 < 8; var10Lifetime3++) {
              ModalDialogHost.a((byte) 120, var10Lifetime3 * 640 >> 3);
            }
            nn.field_a = new MenuLayer[12][];
            var10_ref = LevelRun.createIndexedSpriteLayer(var43, 81);
            var11 = new TranslucentSpriteLayer(vg.a(new IndexedSprite[]{var42[3], var42[2], var42[4]}, 52), 0, 0, 76);
            var44 = vg.a(new IndexedSprite[]{var7_ref_sm, var35[2], var35[4]}, 122);
            var13 = LevelRun.createIndexedSpriteLayer(var44, param1 - 7);
            nn.field_a[0] = new MenuLayer[]{(MenuLayer) (var10_ref), (MenuLayer) ((Object) var8_ref_ia), (MenuLayer) ((Object) var11), var13, (MenuLayer) ((Object) new TranslucentSpriteLayer(var42[0], 0, 0, 76)), LevelRun.createIndexedSpriteLayer(var35[0], -115)};
            var45 = DelegatingCanvas.a("pause_title", param1 ^ -30996, rg.field_v, "");
            nn.field_a[1] = new MenuLayer[]{(MenuLayer) (var10_ref), (MenuLayer) ((Object) var8_ref_ia), (MenuLayer) ((Object) var11), var13, (MenuLayer) ((Object) new TranslucentSpriteLayer(var45, 5, 5, 76)), LevelRun.createIndexedSpriteLayer(var45, FullscreenStatusDialog.bitwiseXor((int) param1, 55))};
            nn.field_a[3] = new MenuLayer[]{(MenuLayer) ((Object) new FramedPanelLayer(102, 14, 436, 452)), ByteStorage.a("continue", "", rg.field_v, (byte) 4)};
            nn.field_a[4] = new MenuLayer[]{(MenuLayer) (var10_ref), ByteStorage.a("help_bg_delta", "", rg.field_v, (byte) 4), (MenuLayer) ((Object) new FramedPanelLayer(27, 98, 574, 365))};
            var15_ref_sm = DelegatingCanvas.a("highscore_top", 31094, rg.field_v, "");
            nn.field_a[2] = new MenuLayer[]{(MenuLayer) (var10_ref), (MenuLayer) ((Object) new FramedPanelLayer(102, 108, 436, 362)), ByteStorage.a("highscore_bottom", "", rg.field_v, (byte) 4), (MenuLayer) ((Object) new TranslucentSpriteLayer(var15_ref_sm, 4, 4, 76)), LevelRun.createIndexedSpriteLayer(var15_ref_sm, 103)};
            nn.field_a[5] = new MenuLayer[]{(MenuLayer) ((Object) new FramedPanelLayer(72, 82, 496, 366))};
            nn.field_a[9] = new MenuLayer[]{(MenuLayer) ((Object) new FramedPanelLayer(27, 51, 574, 430)), ByteStorage.a("levelsel", "", rg.field_v, (byte) 4)};
            var16_ref_ia = new FramedPanelLayer(23, 62, 593, 402);
            nn.field_a[6] = new MenuLayer[]{(MenuLayer) ((Object) var16_ref_ia), ByteStorage.a("achievetitle", "", rg.field_v, (byte) 4)};
            nn.field_a[8] = new MenuLayer[]{(MenuLayer) ((Object) var16_ref_ia), ByteStorage.a("gameachtitle", "", rg.field_v, (byte) 4)};
            nn.field_a[7] = new MenuLayer[]{(MenuLayer) ((Object) new FramedPanelLayer(35, 144, 573, 223)), (MenuLayer) ((Object) new TranslucentSpriteLayer(var42[0], 0, 0, 76)), LevelRun.createIndexedSpriteLayer(var35[0], 115)};
            nn.field_a[10] = new MenuLayer[]{(MenuLayer) ((Object) StandardContentDialog.field_cb), (MenuLayer) ((Object) new TranslucentSpriteLayer(var42[0], 0, 0, 76)), LevelRun.createIndexedSpriteLayer(var35[0], param1 + 41), (MenuLayer) ((Object) new TranslucentSpriteLayer(MenuScreen.field_d[1], 0, 0, 76)), LevelRun.createIndexedSpriteLayer(GameKeyHandler.field_a[1], 108)};
            nn.field_a[11] = new MenuLayer[]{(MenuLayer) ((Object) new FramedPanelLayer(11, 11, 618, 122)), (MenuLayer) ((Object) new FramedPanelLayer(11, 139, 209, 330)), (MenuLayer) ((Object) new FramedPanelLayer(226, 139, 403, 242))};
            dj.field_a = SectorCacheStore.a("menu_items_recol", -1, "", rg.field_v);
            ValidationStatusWidget.field_L = ip.a(rg.field_v, param1 ^ 31, "", "death_text");
            qd.field_c = new IndexedSprite[3];
            qd.field_c[1] = DelegatingCanvas.a("death_time", 31094, rg.field_v, "");
            qd.field_c[0] = vo.a(-173, FullscreenStatusDialog.bitwiseXor((int) param1, 101), GameKeyHandler.field_a[2], 43);
            qd.field_c[2] = vo.a(-194, -1, GameKeyHandler.field_a[6], -34);
            DelayedPcmStream.field_p = ProgressMessageDialog.a(rg.field_v, "", "scrolled_instructions_keys", param1 + 186);
            AccountRequestState.field_a = ip.a(rg.field_v, -116, "", "mb_screenshots");
            TriangleRasterizer.setTextureProvider(new op(NameSuggestionsPanel.field_D, n.field_q, rg.field_v, 6, false));
            tj.field_n = SectorCacheStore.a("achievements_lrg", param1 + 101, "", rg.field_v);
            var46 = ProgressMessageDialog.a(rg.field_v, "", "glass", 89);
            var46.normalizeCanvas();
            var68 = var46.field_y;
            tj.field_n[11].normalizeCanvas();
            var62 = tj.field_n[11].field_y;
            var47 = var62;
            var30 = var47;
            var19 = var30;
            for (var20 = 0; var20 < 16384; var20++) {
              var21 = var68[var20];
              if (0 != var21) {
                var22 = var21 >> 6 & 1020 | (var21 & 255) >> 3;
                var23 = -var22 + 256;
                var24 = var62[var20];
                var25 = var24 & 16711935;
                var26 = var24 & 65280;
                var19[var20] = UiWidget.a(ie.bitwiseAnd(65280 * var22 + var26 * var23, 16711865) >> 8, ie.bitwiseAnd(16711935, var25 * var23 + var22 * 16711935 >> 8));
              }
            }
            tj.field_n[11].trimTransparentBorders();
            var48 = tj.field_n;
            for (var18 = 0; var18 < var48.length; var18++) {
              var49 = var48[var18];
              mo.a(var49, 4);
            }
            rg.field_v = null;
            NameSuggestionsPanel.field_D = null;
            cf.a(6639);
            return false;
          }
          if (null != bp.field_c) {
            IsaacPacketBuffer.a(35.0f, param1 ^ -29, jo.field_a);
            this.renderFrame((byte) 73);
            LoginRequestBuilder.field_a = new SoundCache(bp.field_c, vd.field_e);
            DisplayNameSelectionPanel.field_F[26] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_bounce").toPcmSample();
            DisplayNameSelectionPanel.field_F[19] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_collect").toPcmSample();
            DisplayNameSelectionPanel.field_F[12] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_equip_shield").toPcmSample();
            DisplayNameSelectionPanel.field_F[9] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_equip_spikes").toPcmSample();
            DisplayNameSelectionPanel.field_F[13] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_explode").toPcmSample();
            DisplayNameSelectionPanel.field_F[10] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_gyroscope").toPcmSample();
            DisplayNameSelectionPanel.field_F[25] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_land_hard").toPcmSample();
            DisplayNameSelectionPanel.field_F[27] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_playfield_tilts").toPcmSample();
            DisplayNameSelectionPanel.field_F[6] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_powerup").toPcmSample();
            DisplayNameSelectionPanel.field_F[0] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_roll_normal_1").toPcmSample();
            DisplayNameSelectionPanel.field_F[1] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_roll_spiky_1").toPcmSample();
            DisplayNameSelectionPanel.field_F[23] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_select").toPcmSample();
            DisplayNameSelectionPanel.field_F[16] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_shieldhit").toPcmSample();
            DisplayNameSelectionPanel.field_F[11] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_skid_alt").toPcmSample();
            DisplayNameSelectionPanel.field_F[15] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_squash").toPcmSample();
            DisplayNameSelectionPanel.field_F[20] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_tick").toPcmSample();
            DisplayNameSelectionPanel.field_F[28] = SynthesizedSoundEffect.loadByName(bp.field_c, "", "torq_jump2").toPcmSample();
            var3_intLifetime1 = bp.field_c.getGroupIdByName(-1, "");
            var50 = LoginRequestBuilder.field_a.getSoundEffectByGroup(bp.field_c.getFileIdByName("torq_whistle", -107, var3_intLifetime1), var3_intLifetime1, (byte) -84);
            var63 = new byte[var50.data.length];
            var51 = var63;
            var5_ref_byte__ = var51;
            ArrayBlockSupport.copyByteRange(var50.data, 0, var5_ref_byte__, 0, var63.length);
            DisplayNameSelectionPanel.field_F[5] = new PcmSample(var50.sampleRate, var63, var50.loopStart, var50.loopEnd, var50.field_l);
            bp.field_c = null;
            cf.a(6639);
            return false;
          }
          if (vd.field_e != null) {
            IsaacPacketBuffer.a(37.0f, -88, jo.field_a);
            this.renderFrame((byte) 73);
            DisplayNameSelectionPanel.field_F[7] = VorbisSample.loadByName(vd.field_e, "", "torq_cuckoo_clock").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[8] = VorbisSample.loadByName(vd.field_e, "", "laura_uhoh").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[21] = VorbisSample.loadByName(vd.field_e, "", "bigben").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[24] = VorbisSample.loadByName(vd.field_e, "", "collide_1").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[22] = VorbisSample.loadByName(vd.field_e, "", "laura_aaahhh").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[14] = VorbisSample.loadByName(vd.field_e, "", "laura_ow").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[18] = VorbisSample.loadByName(vd.field_e, "", "laura_woohoo").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[17] = LoginRequestBuilder.field_a.getMusicSampleByName("laura_yeah", -114, "");
            DisplayNameSelectionPanel.field_F[4] = VorbisSample.loadByName(vd.field_e, "", "laura_1").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[3] = VorbisSample.loadByName(vd.field_e, "", "laura_2").decodeAllToPcm();
            DisplayNameSelectionPanel.field_F[2] = VorbisSample.loadByName(vd.field_e, "", "laura_3").decodeAllToPcm();
            vd.field_e = null;
            cf.a(6639);
            return false;
          }
          if (DisplayNameSelectionPanel.field_C != null) {
            IsaacPacketBuffer.a(39.0f, -87, SectorCacheStore.field_c);
            this.renderFrame((byte) 73);
            ResourceArchive.field_k[0] = new wl(ih.a(FullscreenStatusDialog.bitwiseXor((int) param1, -7922), "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/Torquing_Titlescreen"));
            ResourceArchive.field_k[1] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_nursery_slopes"));
            ResourceArchive.field_k[2] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_squared_away"));
            ResourceArchive.field_k[3] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_next_steps"));
            ResourceArchive.field_k[4] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_straight_and_narrow"));
            ResourceArchive.field_k[5] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_bombing_along"));
            ResourceArchive.field_k[6] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_amazing"));
            ResourceArchive.field_k[7] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_circuitous_route"));
            ResourceArchive.field_k[8] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/torquing_leap_of_faith"));
            ResourceArchive.field_k[9] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/Torquing_Gamecomplete"));
            ResourceArchive.field_k[10] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/Torquing Football Jingle"));
            ResourceArchive.field_k[10].a(false);
            ResourceArchive.field_k[11] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/Torquing_Levelcomplete"));
            ResourceArchive.field_k[12] = new wl(ih.a(7828, "", LoginRequestBuilder.field_a, DisplayNameSelectionPanel.field_C, "music/Torquing_Gameover"));
            DisplayNameSelectionPanel.field_C = null;
            LoginRequestBuilder.field_a = null;
            cf.a(6639);
            return false;
          }
          if (null != he.field_b) {
            IsaacPacketBuffer.a(40.0f, 34, StripedProgressWidget.field_D + " - 0%");
            var52 = new PacketBuffer(he.field_b.getFileByName(param1 - 18, "levels.tql", ""));
            var53 = var52.readString((byte) 126);
            var5Lifetime1 = 0;
            var6 = 1;
            for (var7 = 0; var7 < var53.length(); var7++) {
              var8 = var53.charAt(var7);
              if (var8 == 10) {
                if (var5Lifetime1 != 0) {
                  var6++;
                }
                var5Lifetime1 = 1;
              } else {
                var5Lifetime1 = 0;
              }
            }
            StandardContentDialog.field_ab = new int[var6];
            MenuScreen.field_k = new int[var6];
            var54 = new StringBuilder(8192);
            var8Lifetime2 = 0;
            var9 = 0;
            var10_ref = null;
            for (var11_intLifetime1 = 0; var11_intLifetime1 < var53.length(); var11_intLifetime1++) {
              var12_int = var53.charAt(var11_intLifetime1);
              if (var12_int == 10) {
                if (var54.length() != 0) {
                  var55 = new Level(var8Lifetime2, var54.toString());
                  var54.setLength(0);
                  StandardContentDialog.field_ab[var8Lifetime2] = StandardContentDialog.field_ab[var8Lifetime2] + 1;
                  var9++;
                  if (var10_ref != null) {
                    ((Level) (var10_ref)).field_m = var55;
                    var10_ref = var55;
                  } else {
                    DirectByteStorage.field_d = var55;
                    var10_ref = var55;
                  }
                } else {
                  var8Lifetime2++;
                }
              } else {
                discarded$2 = var54.append((char) var12_int);
              }
            }
            wi.field_a = new int[var9];
            hg.field_d = new int[var9];
            mk.field_c = new int[StandardContentDialog.field_ab.length];
            var11_intLifetime1Lifetime1 = 0;
            for (var8Lifetime3 = 0; StandardContentDialog.field_ab.length > var8Lifetime3; var8Lifetime3++) {
              mk.field_c[var8Lifetime3] = var11_intLifetime1Lifetime1;
              for (var12_intLifetime1 = 0; var12_intLifetime1 < StandardContentDialog.field_ab[var8Lifetime3]; var12_intLifetime1++) {
                hg.field_d[var11_intLifetime1Lifetime1] = var12_intLifetime1;
                incrementValue$1 = var11_intLifetime1Lifetime1;
                var11_intLifetime1Lifetime1++;
                wi.field_a[incrementValue$1] = var8Lifetime3;
              }
            }
            he.field_b = null;
            cf.a(6639);
            return false;
          }
          if (wp.field_w > 0 &&
            eg.field_t != null) {
            IsaacPacketBuffer.a(40.0f, 81, StripedProgressWidget.field_D + " - 0%");
            if (cc.field_d == null) {
              cc.field_d = fa.a(2, 13, 27375, 0);
            }
            var3_array = cc.field_d.field_j;
            if (var3_array == null) {
              return false;
            }
            var64 = eg.field_t.getFileByNameWithKeys(var3_array, (byte) -97, "", "levels.tql");
            var56 = var64;
            var4 = var56;
            if (var4 == null) {
              return false;
            }
            var57 = new PacketBuffer(var64);
            var58 = var57.readString((byte) 118);
            var7Lifetime1 = 0;
            var8Lifetime1 = StandardContentDialog.field_ab.length + 1;
            for (var9Lifetime1 = 0; var58.length() > var9Lifetime1; var9Lifetime1++) {
              var10Lifetime1 = var58.charAt(var9Lifetime1);
              if (10 != var10Lifetime1) {
                var7Lifetime1 = 0;
              } else {
                if (var7Lifetime1 != 0) {
                  var8Lifetime1++;
                }
                var7Lifetime1 = 1;
              }
            }
            var9Lifetime1Lifetime1 = StandardContentDialog.field_ab.length;
            var10Lifetime1 = 1;
            var11_array = new int[var8Lifetime1];
            ArrayBlockSupport.copyIntRange(StandardContentDialog.field_ab, 0, var11_array, 0, StandardContentDialog.field_ab.length);
            StandardContentDialog.field_ab = var11_array;
            var12 = new int[var8Lifetime1];
            ArrayBlockSupport.copyIntRange(MenuScreen.field_k, 0, var12, 0, MenuScreen.field_k.length);
            MenuScreen.field_k = var12;
            var13_ref = new StringBuilder(8192);
            var14 = DirectByteStorage.field_d;
            while (var14.field_m != null) {
              var14 = var14.field_m;
              var10Lifetime1++;
            }
            for (var15Lifetime1 = 0; var15Lifetime1 < var58.length(); var15Lifetime1++) {
              var16 = var58.charAt(var15Lifetime1);
              if (var16 == 10) {
                if (var13_ref.length() != 0) {
                  var59 = new Level(var9Lifetime1Lifetime1, var13_ref.toString());
                  var13_ref = new StringBuilder(8192);
                  StandardContentDialog.field_ab[var9Lifetime1Lifetime1] = StandardContentDialog.field_ab[var9Lifetime1Lifetime1] + 1;
                  var10Lifetime1++;
                  var14.field_m = var59;
                  var14 = var59;
                } else {
                  var9Lifetime1Lifetime1++;
                }
              } else {
                discarded$4 = var13_ref.append((char) var16);
              }
            }
            hg.field_d = new int[var10Lifetime1];
            wi.field_a = new int[var10Lifetime1];
            mk.field_c = new int[StandardContentDialog.field_ab.length];
            var15Lifetime1Lifetime1 = 0;
            for (var9Lifetime1Lifetime2 = 0; StandardContentDialog.field_ab.length > var9Lifetime1Lifetime2; var9Lifetime1Lifetime2++) {
              mk.field_c[var9Lifetime1Lifetime2] = var15Lifetime1Lifetime1;
              for (var16Lifetime1 = 0; var16Lifetime1 < StandardContentDialog.field_ab[var9Lifetime1Lifetime2]; var16Lifetime1++) {
                hg.field_d[var15Lifetime1Lifetime1] = var16Lifetime1;
                incrementValue$3 = var15Lifetime1Lifetime1;
                var15Lifetime1Lifetime1++;
                wi.field_a[incrementValue$3] = var9Lifetime1Lifetime2;
              }
            }
            ti.field_l = null;
            eg.field_t = null;
            cf.a(6639);
            return false;
          }
          if (!lp.field_f) {
            var3_intLifetime2 = 0;
            var4_ref = DirectByteStorage.field_d;
            while (var4_ref != null) {
              if (var4_ref.processLevelDecoding(0) &&
                var4_ref.prepareTerrainSkirtModel(param1 ^ -15) &&
                var4_ref.processLevelSceneMeshes(1)) {
                var3_intLifetime2++;
                var4_ref = var4_ref.field_m;
                continue;
              }
              IsaacPacketBuffer.a((float)(var3_intLifetime2 * 60 / hg.field_d.length + 40), 51, StripedProgressWidget.field_D + " - " + 100 * var3_intLifetime2 / hg.field_d.length + "%");
              return false;
            }
            ol.field_f = new Level[var3_intLifetime2];
            var3_intLifetime2 = 0;
            var4_refLifetime1 = DirectByteStorage.field_d;
            while (var4_refLifetime1 != null) {
              incrementValue$5 = var3_intLifetime2;
              var3_intLifetime2++;
              ol.field_f[incrementValue$5] = var4_refLifetime1;
              var4_refLifetime1 = var4_refLifetime1.field_m;
            }
            if (TriangleRasterizer.field_a[0] == 0) {
              TriangleRasterizer.useRasterClip();
              TriangleRasterizer.rebuildPaletteWithGamma(1.0f);
            }
            lp.field_f = true;
            cf.a(param1 ^ -6539);
            return false;
          }
          if (null == ig.field_q) {
            ig.field_q = new Level(8, "ZU##############################55555555################################################5555555555###############################################55######555#############################################555#######55#############################################55########555############################################555########55#############################################555######555##############################################55######55########################################################################################################5555####################################################5555555###########55555#################################555##5555#########55555555###############################55#####55########55#####555##############################555####55########55#######55##############################555##555#######55########55###############################555555########55#########55################################555##########55##55###555############################################5555555###55####################################5#######55555555##################################555555555################################################55555555##########5555########################################5555########555555#########################################55#######555##555#################################555555555#######55#####55################################55555555########555###555#####################################5555########55555555#######################################55#######555555555################################555555555#######55#######################################55555555########################################################################5#############################555########5########555555555############################555555555555########55555555###############################5555555555#############5555#################################55###555##############55################################55#####55#######555555555################################5555##55########55555555##################################555555##############5555###################################555#################55################################################555555555################################5555555555555###55555555##################################55555555555#################55############################################55555######55############################55555##########5555555##################################5555555########55555#555################################55555#555#######55#555#55################################55#555#55#######555#55555################################555#55555########55##555##################################55##555################################################################################################################5########################################################55##################################################555555555###############################################5555555555###############################################555####55#################################################55#################################################################################################################55555###################################################5555555#################################################55555#555################################################55#555#55################################################555#55555#################################################55##555#####################fEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfE0007wQ5Y0cw00");
            cf.a(6639);
            return false;
          }
          if (!ig.field_q.processLevelDecoding(param1 ^ -102)) {
            cf.a(6639);
            return false;
          }
          if (null == hg.field_b) {
            lc.d(param1 ^ 1339942777);
            DelayedPcmStream.field_p = null;
            cf.a(param1 + 6741);
            return false;
          }
          if (vo.field_f != null) {
            if (param1 == -102) {
              return true;
            }
            var28 = (PacketBuffer) null;
            Torquing.readCompressedChatText(-38, -61, (PacketBuffer) null);
            return true;
          }
          vo.field_f = new MenuScreen[12];
          fn.field_c = 0;
          for (var3_intLifetime3 = 0; var3_intLifetime3 < 12; var3_intLifetime3++) {
            vo.field_f[var3_intLifetime3] = new MenuScreen(this, var3_intLifetime3);
          }
          SpriteBase.field_h = 0;
          cf.a(6639);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var3_ref), "Torquing.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void updateScreenTransition(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_182_0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Level var12 = null;
        int var13 = 0;
        var13 = field_u;
        try {
          var2_long = km.correctedCurrentTimeMillis(-1);
          oo.field_b = oo.field_b + 1;
          ed.a(0);
          var4 = 0;
          while (NanoFrameTimer.a((byte) -13)) {
            if (e.field_f != 13 &&
              e.field_f != 84 &&
              83 != e.field_f) {
              continue;
            }
            var4 = 1;
          }
          stackIn_13_0 = (0 == DualLinkNode.field_o) ? 0 : 1;
          var5 = stackIn_13_0;
          var6 = 1;
          if (fn.field_c != -1) {
            stackIn_19_0 = (!vo.field_f[fn.field_c].field_a.field_k) ? 0 : 1;
            var6 = stackIn_19_0;
          }
          var11 = SpriteBase.field_h;
          if (var11 != 0) {
            if (var11 == 2) {
              if (1 == oo.field_b) {
                if (GzipDecompressor.field_c == 11) {
                  pl.a((byte) -120, true);
                }
                if (2 == GzipDecompressor.field_c) {
                  IterableNodeHashTable.field_c = null;
                }
              }
              if (oo.field_b >> 1 == GzipDecompressor.field_b) {
                ie.field_b.field_e.clear(param0 + 108);
                SpriteBase.field_h = -1;
                fn.field_c = GzipDecompressor.field_c;
                vo.field_f[fn.field_c].field_i = 0;
              }
            } else {
              if (var11 != 1) {
                if (10 != var11) {
                  if (3 != var11) {
                    if (var11 == 7) {
                      if (250 <= oo.field_b) {
                        this.transitionGameScreen(true, ie.field_b.field_L, 5, var6 != 0);
                      } else {
                        if (oo.field_b > 2 * GzipDecompressor.field_b &&
                          var5 != 0) {
                          this.transitionGameScreen(true, ie.field_b.field_L, 5, true);
                        } else {
                          if (2 * GzipDecompressor.field_b < oo.field_b &&
                            var4 != 0) {
                            this.transitionGameScreen(true, ie.field_b.field_L, 5, false);
                          }
                        }
                      }
                    } else {
                      if (var11 == 4) {
                        var11 = 0;
                        if (ie.field_b.field_L != GzipDecompressor.field_c) {
                          var12 = ie.field_b.field_d.field_m;
                        } else {
                          var12 = ie.field_b.field_d;
                        }
                        if (var12.field_e != null) {
                          var11 = 2 * var12.field_e.getContentHeight(false);
                        }
                        if (2 * GzipDecompressor.field_b < oo.field_b) {
                          if (var11 > oo.field_b) {
                            if (var5 != 0) {
                              this.transitionGameScreen(true, ie.field_b.field_L, 5, true);
                            } else {
                              if (var4 != 0) {
                                this.transitionGameScreen(true, ie.field_b.field_L, 5, false);
                              }
                            }
                          } else {
                            this.transitionGameScreen(true, ie.field_b.field_L, 5, var6 != 0);
                          }
                        }
                      } else {
                        if (6 != var11) {
                          if (var11 != 11) {
                            if (var11 != 12) {
                              if (var11 == 5) {
                                if (GzipDecompressor.field_b <= oo.field_b / 2) {
                                  SpriteBase.field_h = -1;
                                  SingleChildWidgetContainer.a(ResourceArchive.field_k[ie.field_b.field_q], 0);
                                }
                              } else {
                                if (var11 == 8) {
                                  var9 = 0;
                                  stackIn_176_0 = (-1 + StandardContentDialog.field_ab.length != GzipDecompressor.field_c) ? 0 : 1;
                                  var7 = stackIn_176_0;
                                  var10 = 0;
                                  if (wp.field_w <= 0) {
                                    stackIn_182_0 = (GzipDecompressor.field_c == 1) ? 1 : 0;
                                  } else {
                                    stackIn_182_0 = 0;
                                  }
                                  var8 = stackIn_182_0;
                                  if (oo.field_b < 250) {
                                    if (GzipDecompressor.field_b * 2 < oo.field_b &&
                                      var5 != 0) {
                                      var9 = 1;
                                      var10 = 1;
                                    } else {
                                      if (oo.field_b > 2 * GzipDecompressor.field_b &&
                                        var4 != 0) {
                                        var9 = 0;
                                        var10 = 1;
                                      }
                                    }
                                  } else {
                                    var9 = var6;
                                    var10 = 1;
                                  }
                                  if (var10 == 0) {
                                    if (var7 != 0 &&
                                      GzipDecompressor.field_b * 2 == oo.field_b) {
                                      ie.field_b.advanceToNextLevel(1);
                                    }
                                  } else {
                                    if (var8 != 0) {
                                      ie.field_b.b(9);
                                      this.transitionGameScreen(true, 10, 12, var9 != 0);
                                    } else {
                                      if (var7 != 0) {
                                        this.transitionGameScreen(true, GzipDecompressor.field_c, 11, var9 != 0);
                                      } else {
                                        this.transitionGameScreen(true, 1 + GzipDecompressor.field_c, 9, var9 != 0);
                                      }
                                    }
                                  }
                                } else {
                                  if (9 == var11) {
                                    if (oo.field_b == 2 * GzipDecompressor.field_b) {
                                      ie.field_b.advanceToNextLevel(param0 + 109);
                                      cf.a(6639);
                                    } else {
                                      if (250 > oo.field_b) {
                                        if (GzipDecompressor.field_b * 2 < oo.field_b &&
                                          var5 != 0) {
                                          this.transitionGameScreen(true, ie.field_b.field_L, 4, true);
                                        } else {
                                          if (2 * GzipDecompressor.field_b < oo.field_b &&
                                            var4 != 0) {
                                            this.transitionGameScreen(true, ie.field_b.field_L, 4, false);
                                          }
                                        }
                                      } else {
                                        this.transitionGameScreen(true, ie.field_b.field_L, 4, var6 != 0);
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (oo.field_b == 1) {
                                if (GzipDecompressor.field_c == 11) {
                                  pl.a((byte) -97, true);
                                }
                                if (2 == GzipDecompressor.field_c) {
                                  IterableNodeHashTable.field_c = null;
                                }
                              }
                              if (oo.field_b >> 1 == GzipDecompressor.field_b) {
                                fn.field_c = GzipDecompressor.field_c;
                                SpriteBase.field_h = -1;
                                vo.field_f[fn.field_c].field_i = 0;
                              }
                            }
                          } else {
                            if (GzipDecompressor.field_b <= oo.field_b / 2) {
                              SpriteBase.field_h = -1;
                              SingleChildWidgetContainer.a(ResourceArchive.field_k[ie.field_b.field_q], 0);
                            }
                          }
                        } else {
                          var11 = 0;
                          if (GzipDecompressor.field_c == ie.field_b.field_L) {
                            var12 = ie.field_b.field_d;
                          } else {
                            var12 = ie.field_b.field_d.field_m;
                          }
                          if (var12.field_e != null) {
                            var11 = 2 * var12.field_e.getContentHeight(false);
                          }
                          if (GzipDecompressor.field_b * 2 != oo.field_b) {
                            if (2 * GzipDecompressor.field_b < oo.field_b) {
                              if (!ResourceArchive.field_k[11].isLinked(17) &&
                                var11 <= oo.field_b) {
                                this.transitionGameScreen(true, GzipDecompressor.field_c, 5, var6 != 0);
                              } else {
                                if (var5 != 0) {
                                  this.transitionGameScreen(true, GzipDecompressor.field_c, 5, true);
                                } else {
                                  if (var4 != 0) {
                                    this.transitionGameScreen(true, GzipDecompressor.field_c, 5, false);
                                  }
                                }
                              }
                            }
                          } else {
                            ie.field_b.advanceToNextLevel(1);
                            cf.a(6639);
                          }
                        }
                      }
                    }
                  } else {
                    if (oo.field_b < 250) {
                      if (GzipDecompressor.field_b * 2 < oo.field_b &&
                        var5 != 0) {
                        fn.field_c = -1;
                        this.transitionGameScreen(true, ie.field_b.field_L, 4, true);
                      } else {
                        if (2 * GzipDecompressor.field_b < oo.field_b &&
                          var4 != 0) {
                          fn.field_c = -1;
                          this.transitionGameScreen(true, ie.field_b.field_L, 4, false);
                        }
                      }
                    } else {
                      fn.field_c = -1;
                      this.transitionGameScreen(true, ie.field_b.field_L, 4, var6 != 0);
                    }
                  }
                } else {
                  if (GzipDecompressor.field_b == oo.field_b >> 1) {
                    if (fn.field_c == 3) {
                      IsaacCipher.field_l = null;
                    }
                    SpriteBase.field_h = -1;
                    fn.field_c = -1;
                  }
                }
              } else {
                if (oo.field_b == 1) {
                  if (GzipDecompressor.field_c == 11) {
                    pl.a((byte) -128, true);
                  }
                  if (2 == GzipDecompressor.field_c) {
                    IterableNodeHashTable.field_c = null;
                  }
                }
                if (oo.field_b >> 1 == GzipDecompressor.field_b) {
                  if (3 == fn.field_c) {
                    IsaacCipher.field_l = null;
                  }
                  if (11 == GzipDecompressor.field_c &&
                    je.a((byte) 76)) {
                    ie.field_b = null;
                    SingleChildWidgetContainer.field_y.clear(0);
                    nh.field_k = 0;
                    fa.field_b = 0;
                    SocketConnector.field_f = 0;
                    ArchiveSourceManager.field_l.clear(param0 ^ -108);
                  }
                  SpriteBase.field_h = -1;
                  fn.field_c = GzipDecompressor.field_c;
                  vo.field_f[fn.field_c].field_i = 0;
                }
              }
            }
          } else {
            am.a(75);
            if (hj.field_b) {
              SpriteBase.field_h = -1;
            }
          }
          if (param0 != -108) {
            this.drawWorldProgressScreen(-99, 74);
          }
          if (SpriteBase.field_h != 0) {
            if (-var2_long + km.correctedCurrentTimeMillis(param0 ^ 107) >= 2L) {
              return;
            }
            cf.a(param0 + 6747);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.SA(" + param0 + ')');
        }
    }

    final void transitionGameScreen(boolean param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1 ||
            2 == param2 ||
            param2 == 12) {
            if (param1 == -1) {
              return;
            }
            if (param1 == 0 ||
              2 == param1) {
              SingleChildWidgetContainer.a(ResourceArchive.field_k[0], 0);
            }
            vo.field_f[param1].initializeMenuScreen((byte) 94, param3);
          }
          if (!param0) {
            return;
          }
          NanoFrameTimer.a(-1, -32596, 0);
          oo.field_b = 0;
          SpriteBase.field_h = param2;
          this.field_t = null;
          GzipDecompressor.field_c = param1;
          this.updateScreenTransition((byte) -108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void initializeTitleScreen(int param0) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = field_u;
        try {
          oe.a(50, (byte) 44);
          oi.a(50, (byte) 80);
          TextHotspotBounds.a(50, -128);
          BufferedSocket.c(-101);
          SingleChildWidgetContainer.a(ResourceArchive.field_k[0], 0);
          var2_int = GzipDecompressor.field_b;
          MouseInputHandler.field_b = new int[var2_int];
          for (var3 = 1; var3 < var2_int; var3++) {
            MouseInputHandler.field_b[var3] = FullscreenStatusDialog.bitwiseXor(65535, vi.field_a[-var3 + var2_int]);
          }
          if (param0 <= 69) {
            this.field_t = (TooltipPanel) null;
          }
          ok.a((byte) -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.CB(" + param0 + ')');
        }
    }

    final void renderFrame(byte param0) {
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_57_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        tj var3_ref_tj = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_u;
        try {
          if (null != TranslucentSpriteLayer.field_i) {
            stackIn_5_0 = TranslucentSpriteLayer.field_i;
          } else {
            stackIn_5_0 = k.field_d;
          }
          var2 = stackIn_5_0;
          if (sf.a(-1)) {
            boolean decompiledFrameRemainder0 = true;
            stackIn_9_0 = var2;
            if (TranslucentSpriteLayer.field_i == null) {
              stackIn_11_0 = stackIn_9_0;
              if (!ae.field_ib) {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = false;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = stackIn_9_0;
              stackIn_12_1 = true;
            }
            ii.a((java.awt.Canvas) (stackIn_12_0), stackIn_12_1, (byte) -19);
            return;
          }
          if (!ee.field_s) {
            ji.a((byte) -99, (java.awt.Canvas) (var2));
            return;
          }
          if (null == kg.field_c &&
            null == kb.field_f) {
            if (SpriteBase.field_h == -1) {
              if (fn.field_c != -1) {
                vo.field_f[fn.field_c].renderMenuScreen(93);
              } else {
                ie.field_b.renderLevelRun(false);
              }
            } else {
              this.drawScreenTransition(3);
            }
            if (ie.field_b != null) {
              var3_ref_tj = (tj) (ie.field_b.field_B.beginBackward(0));
              if (var3_ref_tj != null) {
                var5 = ie.field_b.field_n;
                if (var5 >= 80) {
                  if (var5 < 230) {
                    var4 = 8;
                  } else {
                    var4 = 123 - var5 / 2;
                  }
                } else {
                  var4 = var5 / 2 - 32;
                }
                tj.field_n[var3_ref_tj.field_k].drawQuarterSize(8, var4);
                MatchingFieldValidator.field_m.drawString(k.field_b[var3_ref_tj.field_k], 48, var4 + MatchingFieldValidator.field_m.field_x, 0, -1);
                FullscreenStatusDialog.field_N.drawString(k.field_b[var3_ref_tj.field_k], 48, var4 + MatchingFieldValidator.field_m.field_x, 16777215, -1);
              }
            }
            if (param0 != 73) {
              return;
            }
            if (on.b(160)) {
              SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
              LevelCompletionUpdate.a(14, 14, s.field_t, (byte) -4);
            }
            if (SectorCacheStore.field_e != -1) {
              var3 = oo.field_b << 3;
              if (var3 > 0) {
                SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d, 0, var3);
              }
            }
            if (FullscreenNoticeType.a(64) &&
              !on.b(160)) {
              stackIn_57_0 = (TranslucentSpriteLayer.field_i != null) || (ae.field_ib);
              oo.a(stackIn_57_0, -25564);
            }
            ni.a((java.awt.Canvas) (var2), 0, 0, -122);
            return;
          }
          IsaacPacketBuffer.a(100.0f, 11, ci.field_d);
          ji.a((byte) -99, (java.awt.Canvas) (var2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2_ref), "Torquing.EA(" + param0 + ')');
        }
    }

    private final void drawLevelDescriptionScreen(int param0, int param1) {
        int var3_int = 0;
        TooltipPanel dupTemp$0 = null;
        TooltipPanel var5 = null;
        Level var4 = null;
        try {
          var3_int = wi.field_a[param0];
          k.a(var3_int, 1);
          nc.a(var3_int, true);
          StandardContentDialog.field_cb.drawFramedPanel((byte) 90, 0, 0);
          wh.field_t[var3_int].drawWithAlpha(0, 0, 76);
          pm.field_m[var3_int].drawOpaque(0, 0);
          MenuScreen.field_d[var3_int].drawWithAlpha(0, 0, 76);
          if (param1 != 22517) {
            this.loadInterfaceFonts(-66);
          }
          GameKeyHandler.field_a[var3_int].drawOpaque(0, 0);
          if (ie.field_b.field_L == param0) {
            var4 = ie.field_b.field_d;
          } else {
            var4 = ie.field_b.field_d.field_m;
          }
          if (var4.field_e == null) {
            dupTemp$0 = new TooltipPanel(FullscreenStatusDialog.field_Q, 0, 372, 286, GameKeyHandler.field_a[var3_int], -34, -159);
            var4.field_e = dupTemp$0;
            var5 = dupTemp$0;
            var5.addFlexibleVerticalSpace((byte) -59, 30);
            var5.appendCenteredText(false, ff.a(new String[]{Integer.toString(1 + var3_int), Integer.toString(hg.field_d[param0] + 1)}, 0, qj.field_b));
            var5.addFlexibleVerticalSpace((byte) -50, 40);
            this.populateLevelDescription(0, var4, var5);
            var5.addVerticalSpace(30, wj.field_k.field_d, 111);
            var5.justifyPanelContents(param1 ^ 22517);
          }
          var4.field_e.drawPanel(34, -127, 159);
          wj.field_k.drawOpaque(-(wj.field_k.field_c / 2) + 219, 414);
          qh.field_c.drawParagraph(VolumeScaledPcmStream.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, (dd.field_c.field_x * 3 + 3) / 2);
          SoftwareRasterizer.drawRectangleOutline(0, 0, 640, 480, 16777215);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void updateGameTick(byte param0) {
        boolean discarded$0 = false;
        MenuScreen dupTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        boolean stackIn_57_1 = false;
        MenuScreen stackIn_127_0 = null;
        boolean stackIn_128_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = field_u;
        try {
          ResourceArchive.field_c.serviceOutput();
          qd.field_b.serviceOutput();
          if (TranslucentSpriteLayer.field_i != null &&
            TranslucentSpriteLayer.field_i.focusLost) {
            ug.a(-95);
            s.b(-23658);
          }
          stackIn_9_1 = 23;
          stackIn_10_2 = (null != TranslucentSpriteLayer.field_i);
          this.updateClientServices((byte) stackIn_9_1, stackIn_10_2);
          if (w.field_F) {
            this.initializeAssetArchives(26418);
            w.field_F = false;
          }
          var2_int = 0;
          if (!sf.a(-1)) {
            if (!ee.field_s) {
              RandomAccessCacheFile.a(-16513, da.field_g);
              if (this.advanceGameAssetLoading(true, (byte) -102)) {
                this.initializeTitleScreen(122);
                ee.field_s = true;
              }
            } else {
              if (null == kg.field_c) {
                if (kb.field_f == null) {
                  if (on.b(160)) {
                    if (SectorCacheStore.field_e == -1) {
                      var3 = ua.a(false);
                      if (var3 != 3) {
                        if (var3 != 2) {
                          if (var3 == 4) {
                            SectorCacheStore.field_e = 4;
                            oo.field_b = 0;
                          }
                        } else {
                          ug.a(-114);
                        }
                      } else {
                        hm.a(true, MatchingFieldValidator.field_m.field_x, (Sprite[]) null, 0, FullscreenStatusDialog.field_Q, 0, (Sprite[]) null, 3, 320, 0, MatchingFieldValidator.field_m.field_x * 3 / 2, 240);
                      }
                      if (!on.b(160)) {
                        vo.field_f[fn.field_c].initializeMenuScreen((byte) 82, true);
                      }
                    } else {
                      var2_int = 1;
                    }
                  } else {
                    if (!FullscreenNoticeType.a(64)) {
                      var2_int = 1;
                    } else {
                      stackIn_57_1 = (TranslucentSpriteLayer.field_i != null);
                      var3 = this.pollAccountUiActions(stackIn_57_1, -92);
                      if (var3 == 1 ||
                        var3 == 2) {
                        if (TranslucentSpriteLayer.field_i != null) {
                          ug.a(-113);
                        }
                        if (var3 == 2) {
                          to.a(ip.a(param0 + 39), -97);
                        }
                      }
                    }
                  }
                } else {
                  if (kb.field_f.field_n) {
                    if (nh.field_k < kb.field_f.field_k[0]) {
                      nh.field_k = kb.field_f.field_k[0];
                    }
                    if (wp.field_w <= 0) {
                      if (StandardContentDialog.field_ab[1] + StandardContentDialog.field_ab[0] <= nh.field_k) {
                        nh.field_k = -1 + StandardContentDialog.field_ab[0] + StandardContentDialog.field_ab[1];
                        kb.field_f = null;
                      } else {
                        kb.field_f = null;
                      }
                    } else {
                      kb.field_f = null;
                    }
                  }
                }
              } else {
                if (kg.field_c.field_n) {
                  SocketConnector.field_f = SocketConnector.field_f & ~kg.field_c.field_m;
                  fa.field_b = fa.field_b | kg.field_c.field_m;
                  kg.field_c = null;
                  pm.a((byte) 102);
                  if (fn.field_c == 8 &&
                    SocketConnector.field_f == 0) {
                    fn.field_c = 2;
                  }
                  c.a(this, 9072);
                }
              }
            }
          } else {
            this.updateLoginFlow(param0 + 126);
            if (sf.a(-1)) {
              if (ResourceArchive.isClientStartupReady(true) &&
                !ee.field_s) {
                discarded$0 = this.advanceGameAssetLoading(false, (byte) -102);
              }
              return;
            }
            if (!je.a((byte) 69)) {
              this.flushQueuedProgressUpdates(true);
            }
          }
          if (param0 != -30) {
            field_v = (VolumeScaledPcmStream) null;
          }
          if (var2_int != 0) {
            if (SectorCacheStore.field_e == -1) {
              SceneMeshBatch.field_o = SceneMeshBatch.field_o + 1;
              if (-1 == SpriteBase.field_h) {
                if (fn.field_c == -1) {
                  ie.field_b.updateLevelRun(40);
                } else {
                  dupTemp$1 = vo.field_f[fn.field_c];
                  dupTemp$1.field_i = dupTemp$1.field_i + 1;
                  stackIn_127_0 = vo.field_f[fn.field_c];
                  stackIn_128_1 = (SpriteBase.field_h == -1);
                  ((MenuScreen) (Object) stackIn_127_0).updateMenuScreen(stackIn_128_1, -22807);
                  NanoFrameTimer.a(-1, -32596, 0);
                }
              } else {
                this.updateScreenTransition((byte) -108);
              }
            } else {
              if (0 == (1073741824 & SectorCacheStore.field_e)) {
                fieldTemp$2 = oo.field_b + 1;
                oo.field_b = oo.field_b + 1;
                if (32 == fieldTemp$2) {
                  if (on.b(160)) {
                    mf.a(true);
                  } else {
                    eb.a(-124);
                  }
                  SectorCacheStore.field_e = SectorCacheStore.field_e | 1073741824;
                }
              } else {
                fieldTemp$3 = oo.field_b;
                oo.field_b = oo.field_b - 1;
                if (32 != fieldTemp$3) {
                  if (oo.field_b == 0) {
                    SectorCacheStore.field_e = -1;
                  }
                } else {
                  var3Lifetime1 = SectorCacheStore.field_e ^ 1073741824;
                  if (!je.a((byte) 67)) {
                    if (var3Lifetime1 != 0) {
                      if (1 == var3Lifetime1) {
                        fn.field_c = 2;
                      } else {
                        if (var3Lifetime1 != 2) {
                          if (3 == var3Lifetime1) {
                            fn.field_c = 9;
                          }
                        } else {
                          fn.field_c = 6;
                        }
                      }
                    } else {
                      ie.field_b.b(9);
                      if (fn.field_c == 7) {
                        fn.field_c = 2;
                      }
                    }
                  }
                  if (var3Lifetime1 == 4) {
                    hm.a(true, MatchingFieldValidator.field_m.field_x, (Sprite[]) null, 0, FullscreenStatusDialog.field_Q, 0, (Sprite[]) null, 3, 320, 0, 3 * MatchingFieldValidator.field_m.field_x / 2, 240);
                  }
                  SpriteBase.field_h = -1;
                }
              }
            }
          }
          if (null != ie.field_b &&
            ie.field_b.field_B.beginBackward(0) != null) {
            fieldTemp$4 = ie.field_b.field_n + 1;
            ie.field_b.field_n = ie.field_b.field_n + 1;
            if (fieldTemp$4 == 335) {
              ie.field_b.field_n = 0;
              ie.field_b.field_B.removeLast((byte) -86);
            }
          }
          while (kg.a(ArchiveRequest.field_s, (byte) 21)) {
            this.dispatchCommonPacket((byte) -117);
          }
          DropTargetWidgetContainer.a((byte) -115, 0);
          if (mk.a((byte) 38)) {
            var3Lifetime2 = this.reconnectAndResendRequests(118);
            if (var3Lifetime2 == 2 && (SpriteBase.field_h != -1 ||
              fn.field_c != -1)) {
              InteractiveWidget.h(-122);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.HA(" + param0 + ')');
        }
    }

    private final void drawWorldPreview(boolean param0, int param1) {
        if (param0) {
          return;
        }
        try {
          k.a(param1, 1);
          nc.a(param1, true);
          StandardContentDialog.field_cb.drawFramedPanel((byte) -40, 0, 0);
          wh.field_t[param1].drawWithAlpha(0, 0, 76);
          pm.field_m[param1].drawOpaque(0, 0);
          MenuScreen.field_d[param1].drawWithAlpha(0, 0, 76);
          GameKeyHandler.field_a[param1].drawOpaque(0, 0);
          pa.field_e[param1].drawOpaque(0, 0);
          SoftwareRasterizer.drawRectangleOutline(0, 0, 640, 480, 16777215);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawScreenTransition(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = field_u;
        try {
          if (param0 != 3) {
            field_x = 119;
          }
          if (0 == SpriteBase.field_h) {
            k.a(0, 1);
            nc.a(0, true);
            jk.a((byte) -118);
            return;
          }
          var2_int = oo.field_b >> 1;
          if (GzipDecompressor.field_b > var2_int) {
            var3 = SpriteBase.field_h;
            if (1 != var3 &&
              var3 != 10 &&
              var3 != 3 &&
              var3 != 7) {
              if (var3 == 2) {
                ie.field_b.renderLevelRun(false);
              } else if (6 != var3 &&
                8 != var3) {
                if (var3 == 4) {
                  this.drawWorldPreview(false, wi.field_a[GzipDecompressor.field_c]);
                } else if (var3 == 5) {
                  this.drawLevelDescriptionScreen(GzipDecompressor.field_c, param0 + 22514);
                } else if (var3 == 9) {
                  this.drawWorldProgressScreen(90, GzipDecompressor.field_c - 1);
                } else if (var3 == 11) {
                  this.drawWorldProgressScreen(param0 + 98, GzipDecompressor.field_c);
                } else if (var3 == 12) {
                  this.drawWorldProgressScreen(96, 1);
                }
              } else {
                ie.field_b.renderLevelRun(false);
              }
            } else {
              vo.field_f[fn.field_c].renderMenuScreen(93);
            }
            if (var2_int > 0) {
              AccountRequestState.field_b.bindAsRenderTarget();
              SoftwareRasterizer.clearRaster();
            }
          }
          if (var2_int > 0) {
            var3Lifetime1 = SpriteBase.field_h;
            if (var3Lifetime1 != 10 &&
              var3Lifetime1 != 5 &&
              var3Lifetime1 != 11) {
              if (var3Lifetime1 != 2 &&
                var3Lifetime1 != 1 &&
                var3Lifetime1 != 12) {
                if (var3Lifetime1 != 3 &&
                  var3Lifetime1 != 9) {
                  if (7 != var3Lifetime1 &&
                    var3Lifetime1 != 6 &&
                    4 != var3Lifetime1) {
                    if (var3Lifetime1 == 8) {
                      this.drawWorldProgressScreen(42, GzipDecompressor.field_c);
                    }
                  } else {
                    this.drawLevelDescriptionScreen(GzipDecompressor.field_c, 22517);
                  }
                } else {
                  this.drawWorldPreview(false, GzipDecompressor.field_c);
                }
              } else {
                vo.field_f[GzipDecompressor.field_c].renderMenuScreen(93);
              }
            } else {
              ie.field_b.renderLevelRun(false);
            }
            if (GzipDecompressor.field_b > var2_int) {
              mk.field_b.setAsRasterTarget(-86);
              vi.a(var2_int, AccountRequestState.field_b, 0, 0, vi.field_a);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.VA(" + param0 + ')');
        }
    }

    final void prepareGameShutdown(int param0) {
        try {
          if (ResourceArchive.field_c != null) {
            ResourceArchive.field_c.dispose();
          }
          if (null != qd.field_b) {
            qd.field_b.dispose();
          }
          if (TranslucentSpriteLayer.field_i != null) {
            ug.a(-120);
          }
          int var2_int = -39 % ((param0 - 75) / 50);
          nb.b(0);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.JA(" + param0 + ')');
        }
    }

    public static void clearTorquingGlobals(int param0) {
        try {
          field_w = null;
          field_v = null;
          if (param0 != 29165) {
            field_x = 30;
          }
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.QA(" + param0 + ')');
        }
    }

    final void populateLevelDescription(int param0, Level param1, TooltipPanel param2) {
        int var6_int = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        String var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var6 = null;
        var8 = field_u;
        try {
          var9 = kc.a('~', param1.description, param0);
          var10 = var9;
          if (1 == var9.length) {
            var5_ref_String__ = kc.a('/', var9[0], 0);
            for (var6_int = 0; var6_int < var5_ref_String__.length; var6_int++) {
              var7 = var5_ref_String__[var6_int];
              param2.appendCenteredText(false, var7);
            }
          } else {
            param2.appendImageAndText((Sprite) null, var9[0], param0 ^ 250);
          }
          for (var5 = 1; var5 < var10.length; var5++) {
            var6 = var10[var5];
            param2.appendImageAndText(FullscreenNoticeType.field_e[var6.charAt(0) - 48], var6.substring(1), param0 ^ 250);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("Torquing.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.startAppletClient(16, "torquing", -116);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.init()");
        }
    }

    private final void loadInterfaceFonts(int param0) {
        int var5_int = 0;
        int[] array$1 = null;
        int var7 = 0;
        int[] array$0 = null;
        int[] var4 = null;
        int var8 = 0;
        IndexedSprite[] var9 = null;
        int[] var11 = null;
        int[] var15 = null;
        byte[] var20 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        IndexedSprite[] var5 = null;
        int[] var13 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var4Lifetime1;
        var8 = field_u;
        try {
          nl.field_s = qg.a(e.field_b, rp.field_d, "kartika13", "", 255);
          var9 = ip.a(rg.field_v, -119, "", "smallfont");
          var20 = TooltipPanel.field_l.getFileByName(param0 - 116, "smallfont", "");
          FullscreenStatusDialog.field_N = ok.a(var9, 256, var20);
          MatchingFieldValidator.field_m = io.a(var9, -1, var20);
          FullscreenStatusDialog.field_Q = ob.a(1579032, new int[]{4473924, 12632256, 13421772}, var20, true, var9);
          var15 = FullscreenStatusDialog.field_Q.field_O[0];
          var11 = var15;
          var4 = var11;
          if (FullscreenStatusDialog.field_Q.field_O.length < 11) {
            FullscreenStatusDialog.field_Q.field_O = new int[11][];
          }
          FullscreenStatusDialog.field_Q.field_O[0] = var15;
          for (var5_int = 1; var5_int < 11; var5_int++) {
            array$1 = new int[var15.length];
            FullscreenStatusDialog.field_Q.field_O[var5_int] = array$1;
            ArrayBlockSupport.copyIntRange(var4, 0, FullscreenStatusDialog.field_Q.field_O[var5_int], 0, var15.length);
          }
          FullscreenStatusDialog.field_Q.field_O[0][1] = 16777215;
          FullscreenStatusDialog.field_Q.field_O[1][1] = 16776960;
          FullscreenStatusDialog.field_Q.field_O[2][1] = 8947848;
          FullscreenStatusDialog.field_Q.field_O[3][1] = 16777215;
          FullscreenStatusDialog.field_Q.field_O[4][1] = 16698162;
          FullscreenStatusDialog.field_Q.field_O[5][1] = 16745242;
          FullscreenStatusDialog.field_Q.field_O[7][5] = 6710886;
          FullscreenStatusDialog.field_Q.field_O[6][1] = 3257116;
          FullscreenStatusDialog.field_Q.field_O[7][3] = 2236962;
          FullscreenStatusDialog.field_Q.field_O[7][4] = 4473924;
          FullscreenStatusDialog.field_Q.field_O[8][3] = 2236962;
          FullscreenStatusDialog.field_Q.field_O[8][1] = 16776960;
          FullscreenStatusDialog.field_Q.field_O[8][4] = 4473924;
          FullscreenStatusDialog.field_Q.field_O[param0][5] = 6710886;
          FullscreenStatusDialog.field_Q.field_O[9][1] = 16750848;
          FullscreenStatusDialog.field_Q.field_O[10][3] = 2236962;
          FullscreenStatusDialog.field_Q.field_O[10][5] = 6710886;
          FullscreenStatusDialog.field_Q.field_O[10][4] = 4473924;
          FullscreenStatusDialog.field_Q.field_O[10][1] = 16750848;
          var5 = ip.a(rg.field_v, -121, "", "minifont");
          var21 = TooltipPanel.field_l.getFileByName(-114, "minifont", "");
          dd.field_c = ok.a(var5, 256, var21);
          qh.field_c = ob.a(1579032, new int[]{4473924, 8421504}, var21, true, var5);
          qh.field_c.field_x = qh.field_c.field_x - 1;
          var17 = qh.field_c.field_O[0];
          var13 = var17;
          var4Lifetime1 = var13;
          if (qh.field_c.field_O.length < 3) {
            qh.field_c.field_O = new int[3][];
          }
          qh.field_c.field_O[0] = var17;
          for (var7 = 1; var7 < 3; var7++) {
            array$0 = new int[var17.length];
            qh.field_c.field_O[var7] = array$0;
            ArrayBlockSupport.copyIntRange(var4Lifetime1, 0, qh.field_c.field_O[var7], 0, var17.length);
          }
          qh.field_c.field_O[0][1] = 16777215;
          qh.field_c.field_O[1][1] = 16711680;
          qh.field_c.field_O[2][1] = 16750848;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var2), "Torquing.UA(" + param0 + ')');
        }
    }

    private final void initializeAssetArchives(int param0) {
        if (param0 != 26418) {
          return;
        }
        try {
          if (null != rd.field_z) {
            hg.a((byte) -77, rd.field_z);
            rd.field_z = null;
            cf.a(6639);
          }
          rl.field_a = vg.a(param0 ^ -3280, 1);
          rg.field_v = vg.a(-27646, 2);
          NameSuggestionsPanel.field_D = vg.a(-27646, 3);
          DisplayNameSelectionPanel.field_C = vg.a(-27646, 4);
          vd.field_e = vg.a(-27646, 5);
          bp.field_c = vg.a(param0 - 54064, 6);
          TooltipPanel.field_l = vg.a(-27646, 8);
          he.field_b = vg.a(-27646, 12);
          eg.field_t = vg.a(-27646, 13);
          n.field_q = vg.a(-27646, 14);
          kc.a(1, rp.field_d, e.field_b);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "Torquing.NA(" + param0 + ')');
        }
    }

    static {
        field_v = new VolumeScaledPcmStream();
    }
}
