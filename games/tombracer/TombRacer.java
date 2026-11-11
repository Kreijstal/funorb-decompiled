/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class TombRacer extends rfa implements ls {
    static String field_F;
    private int field_E;
    private cja field_H;
    private UnlockOverlay field_D;
    public static boolean field_G;

    public final boolean handleKey(byte param0, char param1, int param2) {
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_17_0 = false;
        if (RasterizerOperator.d(20125)) {
          if (1 == param2) {
            ProxySocketConnector.c((byte) -118);
            return true;
          }
          if (param2 == 2) {
            stackIn_7_0 = !(SimpleHoverMountComponent.field_M);
            SimpleHoverMountComponent.field_M = stackIn_7_0;
            return true;
          }
          if (param2 == 3) {
            stackIn_12_0 = !(ConstrainToLatticeLocomotor.field_s);
            ConstrainToLatticeLocomotor.field_s = stackIn_12_0;
            return true;
          }
          if (param2 == 27) {
            stackIn_17_0 = !(ara.field_wb);
            ara.field_wb = stackIn_17_0;
            return true;
          }
          if (param2 == 5) {
            return true;
          }
          if (param2 == 6) {
            return true;
          }
          if (param2 == 7) {
            return true;
          }
          if (8 == param2) {
            DualLinkNode.field_i = 0;
            TileGridCell.a(DualLinkNode.field_i, param0 - 26037, 0);
            return true;
          }
          if (param2 == 9) {
            DualLinkNode.field_i = 50;
            TileGridCell.a(DualLinkNode.field_i, param0 ^ 26043, 0);
            return true;
          }
          if (param2 == 10) {
            DualLinkNode.field_i = 80;
            TileGridCell.a(DualLinkNode.field_i, param0 - 26037, 5);
            return true;
          }
          if (11 == param2) {
            DualLinkNode.field_i = 150;
            TileGridCell.a(DualLinkNode.field_i, param0 ^ 26043, 0);
            return true;
          }
          if (param2 == 12) {
            DualLinkNode.field_i = 200;
            TileGridCell.a(DualLinkNode.field_i, param0 - 26037, 0);
            return true;
          }
          if (param2 == 52 &&
            VerticalScrollbar.field_tb[81]) {
            System.out.println("Git hash: 86acd69e33288530ebd1917f2ede5a853f902fe7");
            System.out.println("Git committer date: 2015-09-15 11:23:43 +0100");
            System.out.println("Git author date: 2015-09-15 11:23:43 +0100");
            return true;
          }
        }
        if (iqa.field_c.a(param2, param0 ^ 71, param1)) {
          return true;
        }
        if (this.field_D != null) {
          this.field_D.handleKey(MenuEntry.field_h, HardwareOpenGlToolkit.field_td, (byte) 126);
          return true;
        }
        if (SpriteTileOperator.field_t.handleKey(param2, param1, param0 ^ -71)) {
          return true;
        }
        if (param0 != -72) {
          this.beginFrame(-14);
        }
        return false;
    }

    private final void a(boolean param0, rqa param1, byte param2) {
        int stackIn_19_0 = 0;
        boolean stackIn_33_0 = false;
        boolean stackIn_47_0 = false;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ssa var5_ref_ssa = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ssa var9 = null;
        int var10 = 0;
        int var4_intLifetime1;
        var10 = field_G ? 1 : 0;
        try {
          if (null == tga.field_a) {
            return;
          }
          this.beginFrame(91);
          if (null != cs.field_c) {
            cs.field_c.draw((byte) -28, false);
          }
          if (!wka.field_d &&
            param1 != null &&
            wm.field_a != param1 &&
            SpriteTileOperator.field_t != param1) {
            param1.draw((byte) -28, false);
          }
          if (null != wm.field_a) {
            if (!wm.field_a.b(31923)) {
              wm.field_a.draw((byte) -28, false);
            } else {
              if (param1 == null) {
                stackIn_19_0 = (wm.field_a instanceof ala) ? 0 : 1;
                var4_int = stackIn_19_0;
                if (var4_int != 0) {
                  wm.field_a.draw((byte) -28, false);
                  tga.field_a.SA(0, 0, aaa.a(false), SwitchLinkList.b(param2 ^ 17), SoftwareRasterizer.pixels, 0, aaa.a(false));
                }
              }
            }
          }
          var4_intLifetime1 = 0;
          if (SpriteTileOperator.field_t != null) {
            if (SpriteTileOperator.field_t.b(31923)) {
              SoftwareRasterizer.clear();
              var4_intLifetime1 = 1;
              SpriteTileOperator.field_t.draw((byte) -28, true);
            } else {
              SpriteTileOperator.field_t.draw((byte) -28, true);
            }
          }
          if (param0) {
            iqa.field_c.d(true);
            if (iqa.field_c.e(-8832)) {
              SoftwareRasterizer.clear();
              stackIn_33_0 = ((this.field_E & 8) == 0);
              SpawnerBehaviour.a(stackIn_33_0, 0);
              bi.a(tga.field_a, param2 ^ 17);
            }
          }
          if (this.field_D != null) {
            this.field_D.draw((byte) -65);
          }
          this.field_H.a((byte) -90);
          if (param2 != 17) {
            field_F = (String) null;
          }
          if (lca.a(false)) {
            var4_intLifetime1 = 1;
            bka.a((byte) 126);
          }
          if (PlayPhase.beginReconnectGracePeriod(param2 ^ 110) &&
            !lca.a(false)) {
            tga.field_a.c(-1073741824, 0, aaa.a(false), 0, param2 ^ -22956, SwitchLinkList.b(0));
            var5_ref_ssa = IntrusiveDequeCursor.a((byte) 65, tga.field_a);
            var5_ref_ssa.a(aaa.a(false) + mp.a((byte) -112) >> 1, SwitchLinkList.b(0) - MatchPhase.a(96) >> 1, (byte) -12, SwitchLinkList.b(0) + MatchPhase.a(96) >> 1, aaa.a(false) - mp.a((byte) -125) >> 1);
            if (dq.field_f == null) {
              stackIn_47_0 = VortexBehaviour.field_n;
            } else {
              stackIn_47_0 = true;
            }
            S2CNewRoomPacket.a(stackIn_47_0, 106);
            tga.field_a.SA(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
            var5_ref_ssa.a(param2 + 84);
          }
          if (var4_intLifetime1 != 0) {
            if (!lca.a(false)) {
              tga.field_a.SA(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
            } else {
              tga.field_a.c(-1073741824, 0, aaa.a(false), 0, -22971, SwitchLinkList.b(0));
              var5 = ComponentTargetList.a(false);
              var6 = PlantComponent.A(-1);
              var7 = PillarComponent.A(param2 - 7128);
              var8 = rs.a((byte) 124);
              var9 = IntrusiveDequeCursor.a((byte) 65, tga.field_a);
              var9.a(var5 + var7, var6, (byte) -12, var6 + var8, var5);
              tga.field_a.SA(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
              var9.a(99);
            }
            this.finishFrame(-28581);
          } else {
            this.finishFrame(-28581);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_57_0 = var4;
          stackIn_57_1 = new StringBuilder().append("TombRacer.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param2).append(')').toString());
        }
    }

    final void clearAllStatics(int param0) {
        TombRacer.releaseStatics(param0 + 3787);
        cq.releaseStatics(-90);
        GameKeyHandler.a(127);
        pba.releaseStatics(4096);
        IntrusiveDeque.b((byte) 91);
        SoftwareRasterizer.releaseStatics();
        Transform3D.releaseStatics(27316);
        ssa.releaseStatics(-98);
        nba.releaseStatics(false);
        fa.a(-23172);
        BitPacketBuffer.releaseStatics((byte) 0);
        mua.releaseStatics(0);
        bpa.releaseStatics((byte) -57);
        rma.releaseStatics(13902);
        hp.a(32);
        di.releaseStatics(param0 - 19099);
        nla.releaseStatics((byte) 119);
        tk.releaseStatics(false);
        bi.a(false);
        dga.releaseStatics(-29262);
        ke.releaseStatics(3712);
        MenuScreen.a(false);
        RemovedFromGameMenu.releaseStatics((byte) 126);
        MembersUpsellMenu.releaseStatics(-120);
        PlayerProfile.releaseStatics(param0 ^ -3638);
        taa.releaseStatics((byte) 9);
        fw.releaseStatics(0);
        qha.releaseStatics((byte) -122);
        CourseGenerator.releaseStatics(113);
        rm.releaseStatics(param0 + 12213);
        kla.releaseStatics(param0 ^ 11134);
        id.releaseStatics(param0 ^ -3666);
        MatchProtocol.releaseStatics(param0 ^ -3666);
        S2CProfileUpdatePacket.releaseStatics(200);
        S2CPlayerProfilePacket.releaseStatics((byte) 63);
        eca.a(30152);
        IsaacCipher.releaseStatics(-3);
        rc.releaseStatics(true);
        rfa.w(125);
        AppletGameShell.releaseStatics(param0 ^ 3665);
        ClientException.a(false);
        GameApplet.releaseAppletResources((byte) -88);
        MouseInputHandler.releaseStatics(param0 ^ -3666);
        MouseWheelInput.releaseStatics(14979);
        ResourceArchive.d(0);
        PacketBuffer.releaseStatics(true);
        bva.releaseStatics((byte) -13);
        s.releaseStatics(true);
        oi.releaseStatics(false);
        sj.releaseStatics(true);
        msa.releaseStatics(param0 ^ -3666);
        gqa.releaseStatics(95);
        qd.releaseStatics(22442);
        GameClock.releaseStatics(-59);
        RasterBuffer.releaseStatics(true);
        ina.releaseStatics(53);
        via.releaseStatics(64);
        ViewportManager.releaseStatics(param0 ^ -27015);
        tia.releaseStatics((byte) -125);
        GameScreen.releaseStatics((byte) -104);
        ala.releaseStatics(0);
        MatchScreen.releaseStatics(false);
        FunOrbConsole.f(39);
        ej.a(-1);
        uaa.releaseStatics(5193);
        iaa.releaseStatics(-124);
        nb.releaseStatics((byte) -95);
        eu.releaseStatics(114);
        vn.releaseStatics((byte) 0);
        no.b(true);
        GameAssetLoader.releaseStatics((byte) -35);
        kk.a((byte) 120);
        kra.releaseStatics(param0 ^ 1916);
        ega.releaseStatics(2);
        MatchState.f(0);
        vea.a(63);
        ArchiveNetworkClient.releaseStatics((byte) 0);
        ArchiveManager.releaseStatics((byte) -127);
        BufferedCacheFile.releaseStatics(true);
        BufferedSocket.a(-97);
        SoundCache.releaseStatics(-1);
        sq.releaseStatics(true);
        fla.releaseStatics(0);
        ru.releaseStatics(false);
        dra.releaseStatics(-109);
        SoundEventPlayer.releaseStatics(-101);
        MenuEntry.releaseStatics(1);
        ko.b(-100);
        QueuedPlayerEvent.releaseStatics(30967);
        vha.a(640);
        MatchOverlay.releaseStatics(17355);
        MessageOverlay.releaseStatics((byte) 96);
        fda.releaseStatics(param0 + 3574);
        du.releaseStatics(-6884);
        PlayerModel.releaseStatics((byte) 126);
        PenaltyNotice.releaseStatics(true);
        MatchScoringObserver.releaseStatics(-1);
        kq.releaseStatics(param0 ^ 11052);
        MatchPhase.releaseStatics(param0 + 3762);
        Player.releaseStatics(-1);
        goa.b(0);
        kv.releaseStatics(-31014);
        pl.a(0);
        lu.releaseStatics(-12);
        Room.releaseStatics(-128);
        S2CActionPacket.a(4);
        IntrusiveNode.releaseStatics(param0 ^ -3621);
        hw.releaseStatics(-75);
        fr.releaseStatics((byte) 1);
        ta.releaseStatics((byte) -17);
        VerticalScrollbar.releaseStatics(false);
        um.releaseStatics((byte) 18);
        jea.releaseStatics((byte) -107);
        ContextMenu.d((byte) -39);
        hla.releaseStatics(23613);
        PlayerContextMenu.releaseStatics((byte) 67);
        ReportAbuseDialog.a(true);
        pha.d((byte) -68);
        ht.releaseStatics((byte) -113);
        SecondaryNodeHashTable.releaseStatics(123);
        re.releaseStatics((byte) -33);
        DualLinkNode.b(0);
        BitmapFont.releaseStatics();
        NodeHashTable.f(124);
        rf.releaseStatics((byte) -19);
        RoomDefinition.releaseStatics(false);
        CourseLayout.releaseStatics(8);
        ObjectList.releaseStatics(true);
        pra.a(param0 + 3548);
        tea.releaseStatics((byte) -124);
        ida.releaseStatics((byte) 122);
        tv.releaseStatics(119);
        bv.releaseStatics(0);
        is.releaseStatics(2);
        AudioOutput.releaseStatics();
        MidiPcmStream.c(0);
        qt.b(-25809);
        iqa.releaseStatics(126);
        fga.a((byte) -29);
        ck.a(false);
        ModelFactory.a((byte) 91);
        DefaultRoomObjectRenderer.a(param0 ^ -14342);
        RoomComponentFactory.a((byte) -114);
        PlayerSimulation.releaseStatics(param0 ^ param0);
        dva.releaseStatics((byte) 53);
        aq.releaseStatics(-116);
        CharacterChoice.a(3);
        RaceStandings.a((byte) -120);
        ScoreStandings.releaseStatics(-98);
        CommonChooseReward.releaseStatics((byte) 103);
        MatchStatistics.releaseStatics(false);
        bua.a((byte) 97);
        uma.releaseStatics(-1);
        hu.releaseStatics((byte) 119);
        za.releaseStatics((byte) 86);
        FontMetrics.a(-63);
        oc.releaseStatics((byte) -71);
        ka.a(-11);
        SceneLight.releaseStatics(false);
        vj.a(param0 + 3556);
        ConsoleWindow.releaseStatics(0);
        gka.releaseStatics((byte) -124);
        lh.a((byte) 117);
        sw.i(-53);
        ara.releaseStatics(false);
        wj.releaseStatics((byte) 41);
        jta.releaseStatics(false);
        gga.releaseStatics(param0 + 3666);
        kn.releaseStatics(-3);
        dsa.releaseStatics((byte) -126);
        fb.releaseStatics(true);
        rua.releaseStatics(false);
        vs.releaseStatics((byte) -77);
        mpa.releaseStatics(param0 ^ -3666);
        MessageDialog.f(7707);
        AccountRegistrationPanel.f(0);
        tha.releaseStatics(99);
        LoginForm.releaseStatics(91);
        efa.releaseStatics(true);
        hd.releaseStatics(param0 + 32687);
        lsa.a((byte) 101);
        ProceduralTextureProvider.a((byte) 25);
        hh.a(false);
        fha.releaseStatics((byte) 3);
        hba.releaseStatics(1);
        jr.releaseStatics((byte) -87);
        StatefulWidgetPainter.b(96);
        bsa.releaseStatics((byte) -33);
        cj.releaseStatics(47);
        IntrusiveDequeCursor.releaseStatics(param0 ^ -3668);
        UiWidget.releaseStatics((byte) -28);
        SingleChildWidget.releaseStatics(param0 ^ -3666);
        gn.releaseStatics(0);
        TextLayout.releaseStatics(127);
        DisplaySettingsDialog.releaseStatics((byte) -102);
        dh.releaseStatics((byte) -6);
        bw.releaseStatics(115);
        ofa.releaseStatics(0);
        DropdownList.releaseStatics(true);
        GridWidgetContainer.releaseStatics((byte) -124);
        WidgetContainer.releaseStatics((byte) 122);
        ArrayWidgetGroup.b(0);
        joa.a(false);
        ArchiveSource.a(115);
        sb.a(0);
        qba.a(false);
        li.releaseStatics(3);
        ch.releaseStatics((byte) -35);
        rta.releaseStatics(-89);
        MidiFileReader.releaseStatics();
        sv.releaseStatics(-48);
        dea.releaseStatics(true);
        jn.releaseStatics(param0 ^ -3610);
        pk.releaseStatics(true);
        ai.releaseStatics((byte) 41);
        epa.releaseStatics(2);
        qp.releaseStatics(108);
        vba.releaseStatics((byte) -10);
        DrawOfferMenu.releaseStatics(param0 ^ 3680);
        NotLoggedInMenu.releaseStatics(-127);
        MultiplayerLoginMenu.releaseStatics(-128);
        ct.releaseStatics((byte) -121);
        RoomComponent.j((byte) -107);
        EffectEvent.releaseStatics(104);
        SoundEvent.d(-124);
        SoundEventQueue.releaseStatics((byte) -128);
        RenderScene.releaseStatics(param0 + 3666);
        ObjectPool.releaseStatics(true);
        CollisionGrid.releaseStatics(-2147483648);
        bba.releaseStatics((byte) -28);
        TileGrid.releaseStatics((byte) 75);
        SwitchableIdAllocator.a(4);
        RoomEffectTraps.releaseStatics(32);
        RoomHeader.releaseStatics(0);
        ParticleEffects.releaseStatics(-1);
        Trap.releaseStatics(8424);
        Obstacle.releaseStatics((byte) -117);
        Corpse.releaseStatics((byte) -113);
        BeamSegment.releaseStatics(true);
        Effect.releaseStatics((byte) 2);
        Projectile.releaseStatics(114);
        Puddle.j((byte) 87);
        cra.releaseStatics(-63);
        dk.releaseStatics((byte) 104);
        ena.releaseStatics(true);
        al.a((byte) 66);
        C2SActionPacket.b(0);
        S2CEventPacket.releaseStatics(param0 ^ -3922);
        S2CRoundDeadlinePacket.releaseStatics(false);
        S2CNewRoomPacket.releaseStatics((byte) -116);
        S2CPlayerSyncPacket.releaseStatics((byte) 48);
        S2CRoundResultPacket.releaseStatics(10);
        S2CRewardChoicePacket.releaseStatics(false);
        S2CCharacterChoicePacket.releaseStatics(param0 ^ -3670);
        S2CNextRoundPacket.releaseStatics(-105);
        S2CStartRoundPacket.releaseStatics(-87);
        S2CMatchResultPacket.releaseStatics((byte) 117);
        wga.releaseStatics(true);
        C2SChooseRewardPacket.releaseStatics(0);
        C2SChooseCharacterPacket.releaseStatics((byte) 40);
        nra.releaseStatics((byte) 95);
        cm.releaseStatics(true);
        qpa.releaseStatics(false);
        C2SSubmitSettingsPacket.releaseStatics((byte) -121);
        ju.releaseStatics((byte) 120);
        gha.releaseStatics(param0 + 3542);
        cea.releaseStatics(-118);
        QuickChatMenu.releaseStatics(58);
        nc.releaseStatics(122);
        tr.releaseStatics((byte) -125);
        wt.a(112);
        apa.releaseStatics((byte) 7);
        wp.releaseStatics((byte) 97);
        bl.releaseStatics(123);
        wb.releaseStatics((byte) -39);
        qoa.releaseStatics((byte) 33);
        TriangleRasterizer.releaseStatics();
        VorbisSample.releaseStatics();
        uca.releaseStatics(65);
        TriangleMesh.releaseStatics(-32768);
        nn.releaseStatics((byte) 9);
        nea.releaseStatics(0);
        vaa.a(0);
        RandomAccessFileHandle.a((byte) -7);
        DelegatingCanvas.releaseStatics(-24962);
        ol.a(0);
        pla.releaseStatics(-1);
        ByteStorage.releaseStatics(72);
        Bzip2Decompressor.releaseStatics();
        aj.releaseStatics(-11061);
        SpriteState.f(0);
        VorbisFloor1.releaseStatics();
        aqa.releaseStatics((byte) -59);
        QuickChatPhraseDefinition.releaseStatics((byte) -36);
        SoftReferenceCache.releaseStatics(8476);
        wra.releaseStatics(true);
        NanoTickClock.releaseStatics(param0 + 3571);
        ImageProducerRasterBuffer.releaseStatics(param0 + 3668);
        ada.releaseStatics(param0 ^ 3628);
        MiscItemBehaviour.releaseStatics(param0 ^ -3666);
        cba.releaseStatics((byte) 109);
        TeleportState.releaseStatics(32);
        StatusEffect.releaseStatics(2907);
        StandingsPhase.releaseStatics((byte) 62);
        gp.releaseStatics(-117);
        wq.releaseStatics(true);
        jia.releaseStatics((byte) 31);
        GameEvent.releaseStatics(param0 ^ -3601);
        AnimatedLight.a((byte) -113);
        TileGridCell.releaseStatics(param0 + 3674);
        baa.a(param0 + 3786);
        LightSource.releaseStatics(0);
        RenderLayer.releaseStatics(-55);
        CharacterSelectPhase.releaseStatics(115);
        daa.releaseStatics(-12224);
        RoomCompletedScreen.releaseStatics((byte) -77);
        dua.releaseStatics((byte) -128);
        RewardChoicePhase.releaseStatics(6153);
        ResultsPhase.releaseStatics(param0 + 3766);
        RoundWinnerPhase.releaseStatics(0);
        TreasureValuesOverlay.releaseStatics(-28);
        era.releaseStatics((byte) 114);
        qna.releaseStatics(-2);
        uba.releaseStatics((byte) -128);
        DateFieldsWidget.releaseStatics(25);
        SocketArchiveNetworkClient.releaseStatics(false);
        NetworkArchiveRequest.releaseStatics(0);
        SectorCacheStore.releaseStatics(-1551894744);
        DiskArchiveRequest.releaseStatics((byte) -117);
        CachedArchiveSource.releaseStatics((byte) -50);
        AllPlatformsMazeComponent.f(true);
        PushableBlockMazeComponent.releaseStatics(7);
        jl.releaseStatics(param0 ^ -1088533378);
        lk.releaseStatics(false);
        DefaultTileRenderable.releaseStatics(-1);
        PooledObject.releaseStatics(72);
        WhirlpoolDigest.releaseStatics(param0 + 3560);
        jk.releaseStatics((byte) 76);
        SoundTone.releaseStatics();
        aa.releaseStatics(true);
        PerlinNoise2D.releaseStatics((byte) -123);
        TileRenderable.releaseStatics(param0 + 3747);
        wg.releaseStatics(true);
        Behaviour.releaseStatics(18416);
        Locomotor.releaseStatics(param0 + 15738);
        VariantMask.releaseStatics(3);
        IntPoint.releaseStatics((byte) 104);
        SwitchableId.releaseStatics(false);
        nf.a(param0 - 22136);
        ItemBehaviour.releaseStatics(59);
        pka.releaseStatics(-1);
        DarknessBehaviour.d(true);
        WindZoneBehaviour.releaseStatics((byte) 91);
        ComponentMount.releaseStatics((byte) -111);
        tg.releaseStatics((byte) 23);
        tn.releaseStatics((byte) 94);
        bq.releaseStatics((byte) 25);
        TextureMetadata.releaseStatics((byte) 101);
        TestModel.releaseStatics(-30362);
        LegacySwitchModel.releaseStatics(-99);
        jaa.releaseStatics(true);
        DoorwayModel.releaseStatics(5353);
        BlockModel.releaseStatics(false);
        WeaponShooterBehaviour.releaseStatics(884207088);
        HazardModel.n((byte) -51);
        ConstantEffectBehaviour.releaseStatics(-27203);
        PathMoveLocomotor.f(-107);
        SwitchModel.releaseStatics((byte) 100);
        PitModel.releaseStatics(param0 ^ 3665);
        CrusherBehaviour.b(12134);
        ItemModel.releaseStatics((byte) 9);
        PowerUpItemBehaviour.releaseStatics(true);
        SnakePitModel.releaseStatics(-115);
        SnakePitBehaviour.releaseStatics(param0 ^ -25894);
        PitSnake.releaseStatics(-87);
        PlantModel.releaseStatics(false);
        WallModel.releaseStatics((byte) -123);
        MotionTrackingModel.n((byte) 112);
        PlatformModel.l(30389);
        PlatformBehaviour.releaseStatics(1);
        PortalBehaviour.j((byte) 124);
        MonsterModel.releaseStatics((byte) 120);
        BridgeModel.releaseStatics((byte) -125);
        GasVentModel.n((byte) -126);
        DirectRenderModel.releaseStatics(param0 + 3543);
        SimpleBlockBehaviour.releaseStatics(15602);
        TouchSwitchBehaviour.l(15);
        PressureSwitchBehaviour.l(1);
        TripBeamBehaviour.releaseStatics(-127);
        nk.releaseStatics(20);
        rq.releaseStatics();
        BlockComponent.releaseStatics(118);
        PrefabComponent.releaseStatics(0);
        DamageableBehaviour.releaseStatics(-1);
        FlagSet.releaseStatics(70);
        PitComponent.releaseStatics((byte) 112);
        SwitchComponent.A(1);
        SwitchState.releaseStatics(71);
        ComponentTargetList.c(24641);
        PortalComponent.releaseStatics(false);
        MovingSawComponent.s((byte) 120);
        PathMoverComponent.releaseStatics(-12);
        gea.releaseStatics(param0 + 3666);
        GasTrapComponent.releaseStatics(true);
        TimeSwitchBehaviour.releaseStatics(16711422);
        mg.releaseStatics(9980);
        CoinItemComponent.e(true);
        ItemComponent.releaseStatics((byte) -72);
        CoinBagItemComponent.A(32076);
        IdolItemComponent.releaseStatics(true);
        ApproachPlayerLocomotor.releaseStatics((byte) 67);
        FacePlayerLocomotor.releaseStatics(param0 + 3666);
        dna.releaseStatics((byte) 102);
        MovingWallComponent.releaseStatics(15);
        PlatformComponent.B(15);
        MovingPlatformComponent.releaseStatics((byte) 44);
        MirrorComponent.releaseStatics(4);
        MirrorBehaviour.releaseStatics((byte) -105);
        DoorwayComponent.releaseStatics(-121);
        KeySwitchComponent.releaseStatics((byte) -12);
        KeyLockBehaviour.l(11162931);
        TripBeamComponent.releaseStatics((byte) 25);
        CauldronComponent.releaseStatics(param0 + 4197970);
        EffectSwitchBehaviour.releaseStatics(param0 ^ -3655);
        ArrowShooterComponent.releaseStatics(-129);
        ShooterComponent.releaseStatics((byte) 119);
        FlameShooterComponent.releaseStatics(param0 ^ 3597);
        WheeledMountComponent.releaseStatics(4);
        RotaterMountComponent.B(105);
        RotateLocomotor.releaseStatics(true);
        SweeperMountComponent.releaseStatics(7);
        FacePlayerMountComponent.releaseStatics(-121);
        TrackMountComponent.releaseStatics((byte) 79);
        TrackPlayerLocomotor.releaseStatics(param0 + 3680);
        PushableMountComponent.releaseStatics(123);
        TrackingCrusherComponent.releaseStatics((byte) 15);
        StaticCrusherComponent.releaseStatics((byte) -123);
        RopeBridgeComponent.releaseStatics((byte) -90);
        RevolverItemComponent.releaseStatics((byte) -18);
        MazeComponent.e(false);
        WhiteLightShooterComponent.releaseStatics((byte) 75);
        WhiteLightSensorComponent.releaseStatics((byte) -66);
        InvisibleTouchSwitchComponent.f(false);
        BoulderComponent.releaseStatics((byte) 79);
        WallCrusherComponent.releaseStatics(4096);
        SimpleMoveLocomotor.releaseStatics((byte) -92);
        ava.releaseStatics(-1);
        rga.releaseStatics((byte) 99);
        pea.a((byte) -100);
        ProceduralTexture.releaseStatics(-98);
        nka.releaseStatics((byte) -75);
        jla.releaseStatics(-23884);
        rr.releaseStatics(param0 + 3666);
        kd.releaseStatics((byte) -121);
        jsa.releaseStatics(2);
        ValidatedTextInputWidget.m(param0 + 3866);
        TextInputWidget.j(68);
        ContentTransitionDialog.releaseStatics(false);
        ProgressBarWidget.releaseStatics(30548);
        UsernameSuggestionsPanel.releaseStatics(param0 ^ -19478);
        HotspotTextWidget.releaseStatics((byte) -123);
        mha.releaseStatics(-23897);
        ValidationMessageWidget.releaseStatics((byte) 10);
        io.releaseStatics((byte) -57);
        pg.a(param0 + 3666);
        bc.a(118);
        esa.releaseStatics((byte) 102);
        TextureOperator.a((byte) -79);
        CanvasImageBuffer.releaseStatics((byte) 97);
        bf.releaseStatics(true);
        SoftwareTransform3D.releaseStatics(110);
        tw.releaseStatics(122);
        OpenGlToolkit.t(7312);
        hsa.releaseStatics(param0 ^ -3693);
        LegacyOpenGlEffectManager.releaseStatics((byte) -120);
        uv.releaseStatics(0);
        OpenGlTransform3D.releaseStatics((byte) -14);
        mq.releaseStatics(26860);
        OpenGlSprite.releaseStatics(false);
        OpenGlFramebuffer.releaseStatics(param0 ^ -33413);
        LegacyOpenGlTexture.releaseStatics(1956);
        LegacyOpenGlTexture2D.releaseStatics(-1);
        np.d(0);
        tj.a(360);
        qf.releaseStatics((byte) -93);
        LegacyOpenGlCubeTexture.releaseStatics(34067);
        HardwareGraphicsToolkit.releaseStatics((byte) 3);
        gj.releaseStatics(-119);
        una.a(true);
        hk.releaseStatics(param0 + 3674);
        AffineTransform3D.releaseStatics(14);
        ura.a(false);
        kp.releaseStatics(false);
        ShaderEffect.a((byte) 101);
        ld.releaseStatics((byte) -126);
        mna.releaseStatics(false);
        gja.g(3);
        ft.a((byte) 102);
        fp.releaseStatics(29325);
        dn.releaseStatics(0);
        ne.releaseStatics(15);
        iw.releaseStatics(false);
        HardwareOpenGlToolkit.releaseStatics(32885);
        GrowableIntList.releaseStatics(0);
        CachedTextLayout.releaseStatics(false);
        DraggableWidget.releaseStatics(63);
        k.e(0);
        FullscreenConfirmationDialog.releaseStatics(-87);
        bra.releaseStatics((byte) 86);
        vua.releaseStatics((byte) -4);
        ScrollControlWidget.releaseStatics((byte) -126);
        q.a(8);
        ql.releaseStatics(true);
        iha.releaseStatics();
        IterableNodeHashTable.releaseStatics(33);
        SecondaryNodeDeque.releaseStatics(param0 + 11858);
        pb.a((byte) 98);
        DirectByteStorage.releaseStatics(-13170);
        tja.releaseStatics(false);
        ProxySocketConnector.releaseStatics((byte) 90);
        DateInputWidget.k((byte) 77);
        ColourRowCache.releaseStatics(-116);
        RoomViewRenderer.releaseStatics(-2);
        dta.releaseStatics(0);
        AudioFilter.releaseStatics();
        cs.a(3840);
        ConveyorBehaviour.releaseStatics(6);
        SimpleConditionBehaviour.releaseStatics((byte) -119);
        MazeGrid.releaseStatics(false);
        SafeZoneBehaviour.releaseStatics(-2);
        av.b(false);
        SimpleActionBehaviour.releaseStatics(123);
        SpawnerBehaviour.b(125);
        VortexBehaviour.releaseStatics(false);
        SwitchLinkList.a(-108);
        mma.releaseStatics(-1901);
        FuseBehaviour.releaseStatics((byte) 42);
        ControllerLocomotor.releaseStatics((byte) -99);
        FleeLocomotor.e(param0 + 12227);
        MirrorMoverLocomotor.releaseStatics(1);
        ConstrainToCircleLocomotor.releaseStatics((byte) -94);
        ConstraintLocomotor.releaseStatics(91);
        CircleMovementLocomotor.releaseStatics(115);
        FacePointLocomotor.releaseStatics(-73);
        ConstrainToRectangleLocomotor.releaseStatics((byte) 91);
        ConstrainToLatticeLocomotor.releaseStatics((byte) 124);
        ConstrainToFacingArcLocomotor.g(11683);
        TeleportLocomotor.releaseStatics(1);
        nta.releaseStatics(-25821);
        of.releaseStatics(param0 ^ -3599);
        RecursiveBacktrackerMazeGenerator.releaseStatics(115);
        StripedMazeGenerator.releaseStatics(19290);
        PrimMazeGenerator.releaseStatics(-21755);
        DivisionMazeGenerator.releaseStatics(true);
        SpriteSampleOperator.releaseStatics(16711680);
        TextureSampleOperator.releaseStatics(-26382);
        tga.releaseStatics(61);
        MonochromeFillOperator.releaseStatics((byte) -119);
        ColourFillOperator.releaseStatics(7438);
        BrickOperator.d(-21771);
        ClampOperator.releaseStatics(0);
        BlendModeOperator.releaseStatics(param0 ^ 3612);
        CurveOperator.releaseStatics(-92);
        FlipOperator.releaseStatics((byte) -93);
        ColourGradientOperator.d((byte) -109);
        ColouriseOperator.releaseStatics((byte) 90);
        WaveformOperator.releaseStatics((byte) 117);
        BevelOperator.releaseStatics((byte) -102);
        VoronoiNoiseOperator.releaseStatics((byte) 118);
        WeaveOperator.releaseStatics(3);
        HslAdjustOperator.releaseStatics(-33);
        SpriteTileOperator.releaseStatics(true);
        DisplacementOperator.releaseStatics(param0 ^ -3668);
        TileOperator.releaseStatics((byte) -123);
        MaskBlendOperator.releaseStatics(-124);
        InvertOperator.releaseStatics(param0 ^ 14527);
        ThresholdOperator.releaseStatics(false);
        StripesOperator.releaseStatics(true);
        RandomBrickOperator.releaseStatics(-1);
        RasterizerOperator.c(-118);
        RangeOperator.releaseStatics(param0 ^ 17000);
        MandelbrotOperator.a(true);
        EmbossOperator.releaseStatics(true);
        NormalMapOperator.releaseStatics(param0 ^ 12863);
        EdgeDetectOperator.releaseStatics((byte) -105);
        CrossedSineBandsOperator.releaseStatics(0);
        LineNoiseOperator.releaseStatics((byte) 101);
        cna.releaseStatics(param0 ^ 3646);
        ScrollingTexturePixels.releaseStatics();
        ita.a((byte) 48);
        lp.a((byte) 34);
        hna.releaseStatics(121);
        nsa.releaseStatics(false);
        ImageProducerCanvasImageBuffer.releaseStatics(param0 ^ -3634);
        r.releaseStatics(11);
        NativeSceneLight.releaseStatics((byte) -87);
        qfa.releaseStatics(true);
        cua.releaseStatics(3);
        LegacyOpenGlTexture3D.releaseStatics((byte) 91);
        OpenGlRenderbuffer.a((byte) -48);
        LegacyOpenGlEffect.releaseStatics(-18318);
        aaa.releaseStatics((byte) -75);
        LegacyOpenGlUnderwaterEffect.releaseStatics(120);
        pm.a((byte) 79);
        fd.releaseStatics((byte) -124);
        cp.releaseStatics(-197);
        LegacyOpenGlSpriteTexture.j(param0 + 3771);
        cla.releaseStatics(param0 ^ -3666);
        tla.releaseStatics((byte) 124);
        OpenGlSceneLight.releaseStatics(-25657);
        ota.releaseStatics(0);
        nm.releaseStatics((byte) 70);
        o.releaseStatics(param0 ^ -3666);
        VboVertexArray.releaseStatics(34962);
        ClientMemoryVertexArray.releaseStatics(18168);
        LegacyOpenGlTurbulentTextureEffect.releaseStatics(2);
        LegacyOpenGlRidgedWaterEffect.releaseStatics(125);
        LegacyOpenGlTexture1D.releaseStatics(-12242);
        LegacyOpenGlUnlitEffect.c(-125);
        LegacyOpenGlReflectionEffect.releaseStatics(9681);
        LegacyOpenGlEnvironmentWaterEffect.releaseStatics((byte) -58);
        fca.releaseStatics(-1);
        oca.releaseStatics(false);
        TextureFilter.a(32768);
        to.releaseStatics(-114);
        ll.a((byte) 83);
        gca.releaseStatics(4);
        hka.releaseStatics(false);
        tda.releaseStatics((byte) 103);
        gh.releaseStatics(param0 + 3657);
        HardwareSceneLight.releaseStatics((byte) -112);
        HardwareUnlitEffect.releaseStatics(36070);
        HardwareSpecularEffect.releaseStatics(0);
        HardwareAnimatedWaterEffect.releaseStatics(-16973);
        HardwareReflectionEffect.releaseStatics(param0 + 3666);
        FallbackShaderEffect.releaseStatics(-90);
        RidgedNoise3D.releaseStatics(1713718860);
        TurbulenceNoise3D.releaseStatics(24451);
        jg.releaseStatics((byte) 127);
        dka.releaseStatics((byte) 7);
        OpenGlTexture2D.releaseStatics((byte) 4);
        OpenGlTexture.releaseStatics(0);
        pe.releaseStatics(0);
        dma.releaseStatics(-31784);
        jd.releaseStatics(32242);
        OpenGlUnderwaterEffect.releaseStatics(false);
        mf.a(false);
        OpenGlEnvironmentWaterEffect.releaseStatics(13936);
        OpenGlBuffer.releaseStatics(-127);
        dqa.releaseStatics((byte) 11);
        SecondaryNodeDequeIterator.releaseStatics((byte) -92);
        pda.releaseStatics((byte) -114);
        TrapSpawner.releaseStatics(30000);
        eta.releaseStatics(29574);
        wka.c(-31068);
        ooa.releaseStatics(119);
        TextResourceLoader.a((byte) -3);
        pua.releaseStatics((byte) -115);
        hq.releaseStatics(-6682);
        pr.a(28122);
        vt.releaseStatics((byte) 117);
        wl.releaseStatics((byte) -66);
        iea.releaseStatics(-1);
        bb.releaseStatics(false);
        kb.releaseStatics(param0 ^ 3618);
        lqa.releaseStatics((byte) 102);
        kea.releaseStatics(-7646);
        kia.releaseStatics((byte) 107);
        pfa.b(param0 + 3670);
        cc.releaseStatics(0);
        wk.releaseStatics((byte) -54);
        qg.releaseStatics(param0 ^ 2973);
        ur.releaseStatics(-17614);
        td.releaseStatics(-113);
        hga.releaseStatics((byte) 126);
        poa.releaseStatics((byte) 112);
        rg.releaseStatics((byte) -127);
        tka.releaseStatics((byte) -55);
        mu.releaseStatics((byte) 101);
        lt.releaseStatics(param0 ^ 3690);
        cga.a(true);
        ConsoleToken.releaseStatics((byte) 101);
        ConsoleValue.releaseStatics(17049);
        ConsoleMethod.releaseStatics(126);
        rv.releaseStatics(-31950);
        StringCursor.releaseStatics(true);
        cr.releaseStatics((byte) -128);
        us.releaseStatics(-1);
        fta.releaseStatics(0);
        rha.releaseStatics(-29867);
        aca.a(false);
        mp.a(9);
        aua.releaseStatics(true);
        ic.releaseStatics(true);
        mga.a(param0 ^ -35493);
        nl.a((byte) -117);
        tc.b(17129);
        hda.releaseStatics((byte) -128);
        wc.releaseStatics((byte) -78);
        gba.releaseStatics(true);
        CourseLayoutFactory.releaseStatics(param0 ^ -3666);
        mm.a((byte) -44);
        sda.releaseStatics(-1);
        bd.releaseStatics(119);
        CharacterChoiceFactory.releaseStatics(0);
        sja.releaseStatics((byte) -126);
        nt.a(true);
        fpa.releaseStatics(1451);
        LoadLevelCommand.releaseStatics(-50);
        HelloCommand.releaseStatics(true);
        ShowLevelSetCommand.releaseStatics(param0 ^ -31324);
        ToggleMusicChannelCommand.releaseStatics((byte) -90);
        ListTracksCommand.releaseStatics((byte) -125);
        LoadProfileCommand.releaseStatics((byte) 2);
        WidgetStyleLayer.releaseStatics((byte) 46);
        kha.releaseStatics(param0 + 3665);
        ema.a(48);
        pu.releaseStatics((byte) -53);
        fua.releaseStatics(param0 + 3540);
        haa.releaseStatics(121);
        je.g((byte) -119);
        ik.releaseStatics((byte) -104);
        toa.a(3402);
        cia.releaseStatics(-1);
        lw.releaseStatics(70);
        waa.releaseStatics(param0 ^ -7488);
        RenderableNode.a((byte) -49);
        rp.a(true);
        ad.releaseStatics(-10);
        wm.releaseStatics((byte) 115);
        RewardChoiceSlot.releaseStatics((byte) -101);
        gsa.releaseStatics(1);
        it.releaseStatics(-99);
        DebouncedValidationSource.releaseStatics((byte) -91);
        dpa.releaseStatics(param0 + 3665);
        oia.releaseStatics(false);
        lca.releaseStatics(-22593);
        bt.releaseStatics(-1);
        eh.releaseStatics((byte) -114);
        faa.a(false);
        cva.releaseStatics(1);
        PasswordValidator.releaseStatics(false);
        EmailSyntaxValidator.releaseStatics(-1852);
        mn.f(-58);
        AgeValidator.f(501386288);
        MatchingTextValidator.releaseStatics((byte) -112);
        sla.releaseStatics(param0 ^ 9054);
        bm.releaseStatics(717);
        uo.releaseStatics((byte) 10);
        pa.a((byte) 117);
        afa.releaseStatics((byte) 58);
        aba.releaseStatics(true);
        HardwareRidgedWaterNoise.releaseStatics((byte) -86);
        HardwareTurbulentWaterNoise.releaseStatics(-93);
        hg.releaseStatics(param0 ^ -15106);
        gg.releaseStatics((byte) -107);
        gta.releaseStatics(false);
        eda.a(45);
        mca.releaseStatics(0);
        dq.releaseStatics(8148);
        tba.releaseStatics(0);
        woa.releaseStatics(-20476);
        qja.a(param0 ^ 3694);
        oda.releaseStatics(true);
        hra.releaseStatics(false);
        RasterShape.releaseStatics(false);
        nma.releaseStatics(false);
        qo.releaseStatics(true);
        LegacyTurbulentWaterNoise.releaseStatics(param0 + 3668);
        this.field_x = null;
        this.field_H = null;
        this.field_D = null;
    }

    private final void beginFrame(int param0) {
        int var2 = aaa.a(false);
        int var3 = SwitchLinkList.b(0);
        if (DefaultTileRenderable.e(-22766)) {
          tga.field_a.h();
          tga.field_a.a(0.8999999761581421f, 1.0f, 1.0f);
          if (tga.field_a.f()) {
            tga.field_a.a(0, 0, var2, var3);
          }
        }
        int var4 = 106 / ((param0 + 73) / 46);
        tga.field_a.clear(0);
        tga.field_a.ya();
        tga.field_a.DA(var2 / 2, var3 / 2, 512, 512);
        tga.field_a.f(8, 16384);
        Transform3D var5 = tga.field_a.b();
        var5.setCamera(0, 0, -1600, 0, 0, 0);
        tga.field_a.a(var5);
    }

    final boolean isConnectionBusy(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 84) {
          this.field_E = -98;
        }
        stackIn_8_0 = (RandomMazeBehaviour.field_n) || (LegacyOpenGlEnvironmentWaterEffect.field_d) || (ColouriseOperator.field_q);
        return stackIn_8_0;
    }

    public TombRacer() {
        this.field_E = 0;
        this.field_H = new cja();
        ad.field_j = this;
    }

    final void onLoadingComplete(int param0) {
        ItemModel.i(98);
        if (param0 != 24230) {
          this.initializeGame(-10);
        }
        if (2147483647 == PasswordValidator.field_n) {
        } else {
          if (PasswordValidator.field_n == -2) {
            uv.d(30785);
          } else {
            ConstrainToRectangleLocomotor.a(false, PasswordValidator.field_n, (byte) -46);
          }
          PasswordValidator.field_n = 2147483647;
        }
        if (uma.field_c &&
          SecondaryNodeDequeIterator.field_a != null) {
          SecondaryNodeDequeIterator.field_a.o(-18570);
        }
    }

    public final void updateScreen(boolean param0, boolean param1) {
        boolean stackIn_10_0 = false;
        ila stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean stackIn_18_2 = false;
        boolean stackIn_27_0 = false;
        taa var4;
        this.field_E = this.field_E + 1;
        if (null == mq.field_e &&
          !TextWidgetPainter.a(114)) {
          ql.field_k.writeCipheredOpcode(75, -2988);
        }
        if (null != mq.field_e &&
          mq.field_e.a(54) > 0 &&
          this.field_D == null &&
          SpriteTileOperator.field_t != SecondaryNodeDequeIterator.field_a) {
          var4 = mq.field_e.c(43);
          stackIn_10_0 = !param0;
          if (!MultiplayerLoginMenu.b(stackIn_10_0) ||
            !var4.b(1)) {
            this.field_D = new UnlockOverlay(SecondaryNodeDequeIterator.field_a, var4);
          }
        }
        stackIn_17_0 = iqa.field_c;
        stackIn_17_1 = -91;
        stackIn_18_2 = (null != SecondaryNodeDequeIterator.field_a) && (SpriteTileOperator.field_t == SecondaryNodeDequeIterator.field_a);
        ((ila) (Object) stackIn_17_0).a((byte) stackIn_17_1, stackIn_18_2, false);
        if (!param0) {
          this.field_E = 123;
        }
        if (this.field_D == null) {
          if (wm.field_a != null &&
            !(wm.field_a instanceof ala)) {
            wm.field_a.update(false, false, 15283);
          }
          SpriteTileOperator.field_t.update(true, param1, 15283);
          if (cs.field_c != null &&
            wka.field_d) {
            cs.field_c.update(false, false, 15283);
          }
        } else {
          this.field_D.update((byte) -109);
          if (this.field_D.d((byte) -75)) {
            this.field_D = null;
          }
          stackIn_27_0 = (null == this.field_D);
          param1 = stackIn_27_0;
        }
        if (!RandomMazeBehaviour.field_n ||
          SecondaryNodeDequeIterator.field_a == SpriteTileOperator.field_t) {
          rp.a(8824);
        }
        this.field_H.b((byte) -66);
        WheeledMountComponent.s((byte) 49);
    }

    final void initializeGame(int param0) {
        this.a(82, 81);
        this.a(new GameAssetLoader(), 119);
        if (param0 > -15) {
          this.beginFrame(125);
        }
        S2CRoundDeadlinePacket.field_b = false;
        PlatformModel.j(32454);
        S2CEventPacket.field_c[81] = -1;
        S2CEventPacket.field_c[75] = -1;
        S2CEventPacket.field_c[74] = -2;
        S2CEventPacket.field_c[89] = 2;
        S2CEventPacket.field_c[80] = -1;
        S2CEventPacket.field_c[69] = 1;
        S2CEventPacket.field_c[85] = -1;
        S2CEventPacket.field_c[72] = -1;
        S2CEventPacket.field_c[93] = -1;
        S2CEventPacket.field_c[70] = 1;
        S2CEventPacket.field_c[71] = 1;
        S2CEventPacket.field_c[82] = -1;
        S2CEventPacket.field_c[84] = -1;
        S2CEventPacket.field_c[67] = 1;
        S2CEventPacket.field_c[88] = 0;
        S2CEventPacket.field_c[87] = -1;
        S2CEventPacket.field_c[90] = -1;
        S2CEventPacket.field_c[64] = -2;
        S2CEventPacket.field_c[77] = -1;
        S2CEventPacket.field_c[83] = -1;
        S2CEventPacket.field_c[68] = 1;
        S2CEventPacket.field_c[91] = -1;
        S2CEventPacket.field_c[79] = -2;
        S2CEventPacket.field_c[86] = -2;
        S2CEventPacket.field_c[92] = -1;
        S2CEventPacket.field_c[65] = -2;
        S2CEventPacket.field_c[78] = -1;
        S2CEventPacket.field_c[76] = -1;
    }

    public static void releaseStatics(int param0) {
        field_F = null;
        if (param0 < 88) {
          TombRacer.releaseStatics(44);
        }
    }

    final boolean handleGamePacket(int param0, BitPacketBuffer param1, byte param2) {
        int var11_int = 0;
        int var13 = 0;
        int var15 = 0;
        int stackIn_52_0 = 0;
        boolean stackIn_116_0 = false;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        BitSet[] var11 = null;
        boolean[] var12 = null;
        int var14 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        gqa var19 = null;
        String var20 = null;
        FloatingMessage var21 = null;
        gqa var22 = null;
        String var23 = null;
        FloatingMessage var24 = null;
        boolean[] var25 = null;
        S2CPlayerProfilePacket var26 = null;
        S2CProfileUpdatePacket var27 = null;
        BitPacketBuffer var28 = null;
        int[] var29 = null;
        boolean[] var32 = null;
        int[] var33 = null;
        int[] var38 = null;
        int[] var39 = null;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var16 = field_G ? 1 : 0;
        try {
          if (param0 == 75) {
            if (null != SecondaryNodeDequeIterator.field_a) {
              var4_int = param1.readInt(113);
              ql.field_k.writeCipheredOpcode(69, -2988);
              ql.field_k.writeInt(var4_int, (byte) 125);
              SecondaryNodeDequeIterator.field_a.decodePingTimes(106, param1);
            }
            return true;
          }
          if (param0 == 9) {
            LegacyOpenGlEnvironmentWaterEffect.field_d = false;
            ConstrainToRectangleLocomotor.a(false, 1, (byte) -77);
            vj.a(param1.readString((byte) -76), -79);
            return true;
          }
          if (param0 == 14) {
            CircleMovementLocomotor.a(DoorwayComponent.r((byte) 107), lla.a(false, 4), (byte) -51, vo.e(35040), lla.a(false, 2000), MirrorMoverLocomotor.field_o.length, LoadProfileCommand.field_t, 1024, TextSpewerBehaviour.b(19845), 150);
            us.a(-8250, PitBehaviour.b(-80), fa.b((byte) 123));
            RandomMazeBehaviour.field_n = true;
            LegacyOpenGlEnvironmentWaterEffect.field_d = false;
            ConstrainToRectangleLocomotor.a(false, -2, (byte) 90);
            return true;
          }
          if (15 == param0) {
            if (RandomMazeBehaviour.field_n) {
              SwitchModel.o((byte) -108);
              ik.clearChatHistory(5);
              era.field_c = true;
              RandomMazeBehaviour.field_n = false;
              iqa.field_c.c(88);
              ConstrainToRectangleLocomotor.a(false, 0, (byte) 111);
            }
            LegacyOpenGlEnvironmentWaterEffect.field_d = false;
            ColouriseOperator.field_q = false;
            return true;
          }
          if (10 == param0 &&
            RandomMazeBehaviour.field_n) {
            qt.a(-64);
            return true;
          }
          if (param0 == 11) {
            var19 = ila.a(-18787, false);
            k.a((byte) 124, var19);
            if (null != SecondaryNodeDequeIterator.field_a) {
              if (var19.field_m) {
                return true;
              }
              var20 = var19.field_g;
              var21 = PortalBehaviour.a(var19.field_d, var19.field_f, 100, SecondaryNodeDequeIterator.field_a.findPlayerIndex(false, var20), var20);
              iqa.field_c.a(0, var21);
            }
            return true;
          }
          if (param2 <= 34) {
            return false;
          }
          if (12 == param0) {
            var22 = ila.a(-18787, true);
            k.a((byte) 114, var22);
            if (SecondaryNodeDequeIterator.field_a != null &&
              !var22.field_m) {
              var23 = var22.field_g;
              var24 = PortalBehaviour.a(var22.field_d, var22.field_f, -87, SecondaryNodeDequeIterator.field_a.findPlayerIndex(false, var23), var23);
              iqa.field_c.a(0, var24);
            }
            return true;
          }
          if (param0 == 76) {
            var4_intLifetime1 = param1.readUnsignedByte(255);
            for (var5_int = 0; var4_intLifetime1 > var5_int; var5_int++) {
              param1.readString((byte) -76);
            }
            return true;
          }
          if (64 != param0 &&
            param0 != 65) {
            if (param0 == 66) {
              if (SecondaryNodeDequeIterator.field_a != null) {
                SecondaryNodeDequeIterator.field_a.endMatch(false, true, 0);
                ConstrainToRectangleLocomotor.a(false, -2, (byte) -33);
                iqa.field_c.d(96);
              }
              ColouriseOperator.field_q = false;
              return true;
            }
            if (param0 == 86) {
              if (toa.field_j) {
                return true;
              }
              var26 = new S2CPlayerProfilePacket();
              var26.decode(param1, (byte) -19);
              mq.field_e = var26.getProfile(false);
              mq.field_e.field_a = mq.field_e.roomsComplete.get(78);
              mp.setMusicVolume(2, mq.field_e.field_h);
              S2CRoundResultPacket.a(mq.field_e.field_k, -114);
              if (null != baa.field_d &&
                baa.field_d.field_i != null) {
                eda.a(mq.field_e.field_g, true);
              }
              if (wka.field_d &&
                !mq.field_e.field_l &&
                !PlayTrackCommand.field_p) {
                UrlDownloadRequest.a((byte) 101);
              }
              return true;
            }
            if (param0 == 85) {
              if (null == mq.field_e) {
                return true;
              }
              var27 = new S2CProfileUpdatePacket();
              var27.decode(param1, (byte) -19);
              var27.applyTo(mq.field_e, (byte) -128);
              return true;
            }
            if (87 == param0) {
              gh.a(param1, (byte) -79);
              return true;
            }
            if (88 == param0) {
              dea.a(60);
              return true;
            }
            if (param0 == 89) {
              uca.field_a = param1.readByte((byte) 71);
              C2SActionPacket.field_j = param1.readByte((byte) 48);
              return true;
            }
            if (param0 != 72) {
              stackIn_116_0 = this.handleGamePacket(param1, param0, (byte) 111);
              return stackIn_116_0;
            }
            var33 = SwitchComponent.e(true);
            var29 = var33;
            var4 = var29;
            var17 = var4;
            var5 = var17;
            var28 = param1;
            var7 = ((PacketBuffer) ((Object) var28)).readUnsignedByte(255);
            for (var8 = 0; var7 > var8; var8++) {
              var17[var8] = ((PacketBuffer) ((Object) var28)).readInt(-41);
            }
            var38 = sb.a(0, var33);
            this.field_H.a((byte) 6, var38);
            var18 = SimpleConditionBehaviour.field_o;
            var39 = var4;
            for (var8Lifetime2 = 0; var8Lifetime2 < 8; var8Lifetime2++) {
              var18[var8Lifetime2] = WallTile.bitwiseOr(var18[var8Lifetime2], var39[var8Lifetime2]);
            }
            return true;
          }
          var4_intLifetime2 = param1.readInt(-108);
          stackIn_52_0 = (0 == param1.readUnsignedByte(255)) ? 0 : 1;
          var5_intLifetime1 = stackIn_52_0;
          var6 = param1.readUnsignedByte(255);
          var7Lifetime1 = param1.readUnsignedByte(255);
          var8Lifetime1 = param1.readUnsignedByte(255);
          var9 = new String[param1.readUnsignedByte(255)];
          var10 = param1.readByte((byte) 94);
          for (var11_int = 0; var11_int < var9.length; var11_int++) {
            var9[var11_int] = param1.readString((byte) -76);
          }
          var11 = new BitSet[var9.length];
          param1.beginBitAccess((byte) -96);
          var32 = new boolean[var9.length];
          var25 = var32;
          var12 = var25;
          for (var13 = 0; var11.length > var13; var13++) {
            var12[var13] = CircleMovementLocomotor.readBitFlag(5907, param1);
            var14 = pa.b((byte) 121);
            var11[var13] = new BitSet(var14);
            for (var15 = 0; var14 > var15; var15++) {
              if (CircleMovementLocomotor.readBitFlag(5907, param1)) {
                var11[var13].set(var15);
              }
              var11[var13].get(var15);
            }
          }
          param1.endBitAccess((byte) 98);
          MandelbrotOperator.field_o = null;
          SecondaryNodeDequeIterator.field_a = new MatchScreen(true, var4_intLifetime2, var9, var10, var5_intLifetime1 != 0, var6, -1 + var6, var7Lifetime1, var8Lifetime1, 0, var11, var32, (CourseGenerator) null);
          SecondaryNodeDequeIterator.field_a.decodeInitialState(120, param1);
          SecondaryNodeDequeIterator.field_a.initPlayers((byte) -121);
          iqa.field_c.a(-68);
          ConstrainToRectangleLocomotor.a(false, -1, (byte) 83);
          ColouriseOperator.field_q = false;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_119_0 = var4_ref;
          stackIn_119_1 = new StringBuilder().append("TombRacer.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_119_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void init() {
        this.readAppletParameters(31, 640, 480, "tombracer", 20575);
    }

    final void shutdownGame(int param0) {
        if (param0 != -66) {
          this.onLoadingComplete(83);
        }
        PasswordValidator.b((byte) 122);
        NodeHashTableIterator.a((byte) 55);
        if (dq.field_f != null) {
          og.b(0);
        }
        GameScreen.c((byte) 62);
    }

    private final void finishFrame(int param0) {
        try {
          qva qva = null;
          Throwable decompiledCaughtException = null;
          if (DefaultTileRenderable.e(-22766) &&
            tga.field_a.f()) {
            tga.field_a.c();
          }
          tga.field_a.setLights(0, (SceneLight[]) null);
          if (HelloCommand.field_o != null &&
            HelloCommand.field_o.isModal(param0 + 28579)) {
            tga.field_a.SA(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
          }
          if (param0 != -28581) {
            return;
          }
          try {
            tga.field_a.e(param0 + 28581);
          } catch (qva decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            qva = (qva) (Object) decompiledCaughtException;
            System.out.println(qva);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean handleGamePacket(BitPacketBuffer param0, int param1, byte param2) {
        int var5 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        FloatingMessage var9 = null;
        int var10 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        var10 = field_G ? 1 : 0;
        try {
          if (null == SecondaryNodeDequeIterator.field_a) {
            return false;
          }
          if (74 == param1) {
            return true;
          }
          if (param1 == 67) {
            var4_int = param0.readByte((byte) 102);
            SecondaryNodeDequeIterator.field_a.onMatchWinner((byte) -54, var4_int);
            return true;
          }
          if (68 == param1) {
            var4_intLifetime1 = param0.readUnsignedByte(255);
            for (var5 = 0; var5 < SecondaryNodeDequeIterator.field_a.matchState.playerCount; var5++) {
              var6 = 1 & var4_intLifetime1 >> var5;
              var7 = 1 & SecondaryNodeDequeIterator.field_a.matchState.field_b >> var5;
              if (var6 != var7 &&
                1 == var6) {
                var8 = SecondaryNodeDequeIterator.field_a.matchState.getPlayerName(var5, 0);
                var9 = PortalBehaviour.a(1, LegacyOpenGlFlowingWaterEffect.$cfr$intArgs$a$53ce4ab4c593(107, ad.field_h, new String[]{var8}), 111, var5, var8);
                iqa.field_c.a(0, var9);
              }
            }
            SecondaryNodeDequeIterator.field_a.matchState.field_b = var4_intLifetime1;
            return true;
          }
          if (param1 == 69) {
            var4_intLifetime2 = param0.readUnsignedByte(255);
            SecondaryNodeDequeIterator.field_a.announceResignedPlayers(5, var4_intLifetime2);
            return true;
          }
          if (param1 == 70) {
            SecondaryNodeDequeIterator.field_a.matchState.field_t = param0.readUnsignedByte(255);
            return true;
          }
          if (param1 == 71) {
            var4_intLifetime3 = param0.readUnsignedByte(255);
            SecondaryNodeDequeIterator.field_a.announceLeftPlayers(var4_intLifetime3, (byte) -23);
            return true;
          }
          if (param2 <= 108) {
            field_F = (String) null;
          }
          if (!SecondaryNodeDequeIterator.field_a.handleServerPacket(param1, -4, param0)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("TombRacer.VA(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int var4;
        var4 = field_G ? 1 : 0;
        ql.a(2, -28521);
        if (param1 < 107) {
          this.field_D = (UnlockOverlay) null;
        }
        PlantModel.b(false, 3);
        S2CNextRoundPacket.b(4, 2);
        PlantComponent.b(-104, 6);
        Puddle.b(7, (byte) -120);
        if (param0 != 1) {
          if (RandomMazeBehaviour.field_n) {
            era.field_c = true;
            if (null != SecondaryNodeDequeIterator.field_a &&
              !SecondaryNodeDequeIterator.field_a.isSpectating((byte) 79)) {
              vj.a(BufferedCacheFile.field_k, -114);
              SecondaryNodeDequeIterator.field_a = null;
              ConstrainToRectangleLocomotor.a(false, 1, (byte) 122);
            } else {
              wm.field_a = null;
              SecondaryNodeDequeIterator.field_a = null;
              fp.a(-82);
              ConstrainToRectangleLocomotor.a(false, 0, (byte) 124);
            }
            ((MenuScreen) (SpriteTileOperator.field_t)).a(0, 0, false);
            RandomMazeBehaviour.field_n = false;
            iqa.field_c.c(-89);
          }
          ColouriseOperator.field_q = false;
          LegacyOpenGlEnvironmentWaterEffect.field_d = false;
        } else {
          ColouriseOperator.field_q = true;
          LegacyOpenGlEnvironmentWaterEffect.field_d = true;
        }
    }

    public final void drawOverlay(int param0) {
        if (param0 != 1) {
          rqa var3 = (rqa) null;
          this.a(false, (rqa) null, (byte) 51);
        }
        LaserShooterComponent.D(17229);
        cna.field_a = false;
        if (oq.a((byte) 124).isModal(~param0)) {
          return;
        }
        this.a(true, SecondaryNodeDequeIterator.field_a, (byte) 17);
    }

    static {
        field_F = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
