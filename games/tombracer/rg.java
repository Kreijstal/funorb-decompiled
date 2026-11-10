/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends SingleChildWidget {
    static hra field_A;
    int field_y;
    static int field_z;
    static int field_B;

    rg(UiWidget param0) {
        super(param0.field_i, param0.field_n, param0.field_m, param0.field_p, (isa) null, (WidgetListener) null);
        try {
          param0.setBounds((byte) -31, this.field_m, this.field_p, 0, 0);
          this.child = param0;
          this.field_y = 256;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_A = null;
        if (param0 > -125) {
          field_A = (hra) null;
        }
    }

    final static void a(byte param0) {
        int var1 = pna.field_q * pna.field_q;
        int var2 = var1 - pk.field_r * pk.field_r;
        int var4 = -80 % ((param0 + 19) / 32);
        int var3 = var2 * (mha.field_E - tj.field_b) / var1 + tj.field_b;
        era.field_e.a(640, 120, -23776, var3, ava.field_d);
        to.a(640, 5, mna.field_d, 25, pda.field_c, mha.field_E - 24, 0);
    }

    final static void e(int param0) {
        wba.field_q = new String[42];
        wba.field_q[5] = qf.field_l;
        wba.field_q[12] = wc.field_d;
        wba.field_q[16] = ResourceArchive.field_e;
        wba.field_q[3] = ol.field_a;
        wba.field_q[6] = DamageableBehaviour.field_x;
        wba.field_q[14] = qja.field_i;
        wba.field_q[4] = pl.field_b;
        wba.field_q[22] = id.field_k;
        wba.field_q[8] = vea.field_a;
        wba.field_q[7] = s.field_a;
        wba.field_q[17] = fga.field_a;
        wba.field_q[15] = GameAssetLoader.field_i;
        wba.field_q[13] = WidgetContainer.field_v;
        wba.field_q[18] = pl.field_b;
        wba.field_q[0] = fga.field_a;
        wba.field_q[19] = PrimMazeGenerator.field_b;
        wba.field_q[2] = FuseBehaviour.field_t;
        wba.field_q[9] = VortexBehaviour.field_u;
        wba.field_q[10] = pfa.field_a;
        wba.field_q[1] = StandingsPhase.field_s;
        wba.field_q[21] = MiscItemBehaviour.field_t;
        wba.field_q[11] = oia.field_e;
        wba.field_q[20] = wq.field_d;
        wba.field_q[26] = wg.field_m[0];
        wba.field_q[38] = RangeOperator.field_n;
        wba.field_q[41] = WidgetStyleLayer.field_e;
        wba.field_q[23] = bi.field_b[0];
        wba.field_q[28] = goa.field_c;
        wba.field_q[24] = bi.field_b[1];
        wba.field_q[37] = um.field_k;
        wba.field_q[31] = IntPoint.field_b;
        wba.field_q[30] = bq.field_a;
        wba.field_q[36] = kq.field_b;
        TripBeamBehaviour.field_w = new String[4][2];
        wba.field_q[32] = pka.field_a;
        wba.field_q[27] = wg.field_m[1];
        wba.field_q[34] = PrefabComponent.field_E;
        wba.field_q[35] = RopeBridgeComponent.field_I;
        wba.field_q[25] = bi.field_b[2];
        wba.field_q[39] = kq.field_d;
        wba.field_q[33] = OpenGlSprite.field_k;
        wba.field_q[40] = ResourceArchive.field_f;
        wba.field_q[29] = SweeperMountComponent.field_F;
        TripBeamBehaviour.field_w[0][0] = TextInputWidget.field_z[HardwareOpenGlToolkit.field_hd] + "<lt> <gt>" + TextInputWidget.field_z[mf.field_a];
        TripBeamBehaviour.field_w[1][0] = PerlinNoise2D.field_y;
        wg.field_j = new String[3];
        TripBeamBehaviour.field_w[1][1] = waa.field_b;
        wg.field_j[1] = CircleMovementLocomotor.field_s;
        wg.field_j[0] = DoorwayModel.field_m;
        bq.field_k = new String[13];
        wg.field_j[2] = BevelOperator.field_o;
        bq.field_k[5] = gqa.field_a;
        bq.field_k[2] = HardwareReflectionEffect.field_d;
        bq.field_k[7] = TrackingCrusherComponent.field_H;
        bq.field_k[12] = fp.field_b;
        bq.field_k[0] = DraggableWidget.field_B;
        bq.field_k[10] = ConsoleValue.field_b;
        bq.field_k[9] = tha.field_y;
        bq.field_k[3] = hg.field_d;
        bq.field_k[4] = S2CPlayerSyncPacket.field_e;
        bq.field_k[11] = bf.field_f;
        bq.field_k[6] = ItemModel.field_q;
        bq.field_k[8] = tv.field_ub;
        bq.field_k[1] = MonsterModel.field_A;
        dta.field_b = new String[4];
        dta.field_b[1] = S2CNewRoomPacket.field_g;
        dta.field_b[2] = WhirlpoolDigest.field_b;
        sla.field_b = new String[7];
        dta.field_b[3] = tda.field_b;
        dta.field_b[0] = ArchiveManager.field_d;
        sla.field_b[1] = mu.field_wb;
        sla.field_b[5] = ds.field_k;
        sla.field_b[0] = SnakePitBehaviour.field_p;
        Room.field_m = new String[13];
        sla.field_b[6] = FleeLocomotor.field_x;
        sla.field_b[4] = sda.field_h;
        sla.field_b[2] = ValidatedTextInputWidget.field_J;
        sla.field_b[3] = tja.field_p;
        Room.field_m[1] = gh.field_e;
        Room.field_m[10] = pha.field_Ib;
        Room.field_m[9] = rha.field_h;
        Room.field_m[8] = sda.field_k;
        Room.field_m[4] = kma.field_d;
        Room.field_m[5] = GameScreen.field_a;
        Room.field_m[0] = iea.field_e;
        Room.field_m[7] = FacePlayerLocomotor.field_q;
        Room.field_m[2] = hra.field_a;
        Room.field_m[11] = msa.field_b;
        Room.field_m[3] = poa.field_p;
        Room.field_m[12] = tr.field_e;
        Room.field_m[6] = IntrusiveNode.field_b;
        gn.field_w = new String[13];
        gn.field_w[10] = "piles";
        gn.field_w[0] = "henryj";
        gn.field_w[9] = "johnsson";
        if (param0 != -2339) {
          field_A = (hra) null;
          tk.field_a = new String[17][];
          gn.field_w[7] = "hans";
          gn.field_w[4] = "borees";
          gn.field_w[6] = "feng";
          gn.field_w[1] = "ace";
          gn.field_w[11] = "scarlett";
          gn.field_w[3] = "baroness";
          gn.field_w[8] = "jamille";
          gn.field_w[12] = "wilbur";
          gn.field_w[2] = "angelio";
          gn.field_w[5] = "bruce";
          tk.field_a[16] = DateFieldsWidget.gasDeathMessages;
          tk.field_a[8] = gca.skeletonDeathMessages;
          tk.field_a[14] = vk.boulderDeathMessages;
          tk.field_a[10] = hg.bladeDeathMessages;
          tk.field_a[3] = nta.crushDeathMessages;
          tk.field_a[11] = jr.gunshotDeathMessages;
          tk.field_a[2] = dta.skipRoomMessages;
          tk.field_a[0] = kla.unknownDeathMessages;
          tk.field_a[9] = vua.dartDeathMessages;
          tk.field_a[6] = Effect.lavaDeathMessages;
          tk.field_a[1] = BlockComponent.restartMessages;
          tk.field_a[12] = SwitchComponent.fireDeathMessages;
          tk.field_a[5] = tia.fallDeathMessages;
          tk.field_a[13] = id.laserDeathMessages;
          tk.field_a[15] = SingleChildWidget.sawDeathMessages;
          tk.field_a[7] = fpa.snakeDeathMessages;
          tk.field_a[4] = TurbulenceNoise3D.fallingObjectDeathMessages;
          IntrusiveDeque.field_d[0] = new String[]{ConsoleMethod.field_m, fr.field_a, null, null, null, null, qfa.field_a};
          Effect.field_h[0] = new String[]{daa.field_f, LegacySwitchModel.field_o, AccountRegistrationPanel.field_H, PushableBlockMazeComponent.field_K, pba.field_c, hsa.field_c};
          IntrusiveDeque.field_d[1] = new String[]{ct.field_c, HardwareTurbulentWaterNoise.field_o, dka.field_c};
          Effect.field_h[1] = new String[]{dk.field_k, BitPacketBuffer.field_m, ne.field_e};
          IntrusiveDeque.field_d[2] = new String[]{kea.field_b, baa.field_a, dk.field_a};
          Effect.field_h[2] = new String[]{bpa.field_a, du.field_f, vua.field_C};
          IntrusiveDeque.field_d[3] = new String[]{QuickChatMenu.field_Ab, rua.field_hb, Player.field_s};
          IntrusiveDeque.field_d[4] = new String[]{ConstrainToCircleLocomotor.field_t, RewardChoiceSlot.field_b, RopeBridgeComponent.field_G};
          Effect.field_h[3] = new String[]{InvertOperator.field_o, vk.field_a, SwitchLinkList.field_d};
          Effect.field_h[4] = new String[]{DisplaySettingsDialog.field_R, gn.field_y, tr.field_d};
          IntrusiveDeque.field_d[5] = new String[]{TripBeamComponent.field_J, td.field_u, PitModel.field_r};
          Effect.field_h[5] = new String[]{TreasureValuesOverlay.field_k, MazeComponent.field_G, du.field_b};
          IntrusiveDeque.field_d[6] = new String[]{ConstrainToCircleLocomotor.field_v, VortexBehaviour.field_o, PowerUpItemBehaviour.field_s};
          Effect.field_h[6] = new String[]{apa.field_b, pna.field_k, bq.field_e};
          IntrusiveDeque.field_d[7] = new String[]{TouchSwitchBehaviour.field_q, MatchScoringObserver.field_d};
          IntrusiveDeque.field_d[8] = new String[]{uv.field_u, jd.field_m, hoa.field_n};
          Effect.field_h[7] = new String[]{ProceduralTexture.field_n, ld.field_d};
          IntrusiveDeque.field_d[9] = new String[]{td.field_n, nea.field_b, gga.field_L};
          Effect.field_h[8] = new String[]{ThresholdOperator.field_o, StaticCrusherComponent.field_G, ClientException.field_e};
          Effect.field_h[9] = new String[]{qna.field_a, MenuScreen.field_h, PrefabComponent.field_D};
          IntrusiveDeque.field_d[10] = new String[]{kd.field_z, qba.field_d, GridWidgetContainer.field_H};
          Effect.field_h[10] = new String[]{ViewportManager.field_a, IntPoint.field_c, fb.field_b};
          return;
        }
        tk.field_a = new String[17][];
        gn.field_w[7] = "hans";
        gn.field_w[4] = "borees";
        gn.field_w[6] = "feng";
        gn.field_w[1] = "ace";
        gn.field_w[11] = "scarlett";
        gn.field_w[3] = "baroness";
        gn.field_w[8] = "jamille";
        gn.field_w[12] = "wilbur";
        gn.field_w[2] = "angelio";
        gn.field_w[5] = "bruce";
        tk.field_a[16] = DateFieldsWidget.gasDeathMessages;
        tk.field_a[8] = gca.skeletonDeathMessages;
        tk.field_a[14] = vk.boulderDeathMessages;
        tk.field_a[10] = hg.bladeDeathMessages;
        tk.field_a[3] = nta.crushDeathMessages;
        tk.field_a[11] = jr.gunshotDeathMessages;
        tk.field_a[2] = dta.skipRoomMessages;
        tk.field_a[0] = kla.unknownDeathMessages;
        tk.field_a[9] = vua.dartDeathMessages;
        tk.field_a[6] = Effect.lavaDeathMessages;
        tk.field_a[1] = BlockComponent.restartMessages;
        tk.field_a[12] = SwitchComponent.fireDeathMessages;
        tk.field_a[5] = tia.fallDeathMessages;
        tk.field_a[13] = id.laserDeathMessages;
        tk.field_a[15] = SingleChildWidget.sawDeathMessages;
        tk.field_a[7] = fpa.snakeDeathMessages;
        tk.field_a[4] = TurbulenceNoise3D.fallingObjectDeathMessages;
        IntrusiveDeque.field_d[0] = new String[]{ConsoleMethod.field_m, fr.field_a, null, null, null, null, qfa.field_a};
        Effect.field_h[0] = new String[]{daa.field_f, LegacySwitchModel.field_o, AccountRegistrationPanel.field_H, PushableBlockMazeComponent.field_K, pba.field_c, hsa.field_c};
        IntrusiveDeque.field_d[1] = new String[]{ct.field_c, HardwareTurbulentWaterNoise.field_o, dka.field_c};
        Effect.field_h[1] = new String[]{dk.field_k, BitPacketBuffer.field_m, ne.field_e};
        IntrusiveDeque.field_d[2] = new String[]{kea.field_b, baa.field_a, dk.field_a};
        Effect.field_h[2] = new String[]{bpa.field_a, du.field_f, vua.field_C};
        IntrusiveDeque.field_d[3] = new String[]{QuickChatMenu.field_Ab, rua.field_hb, Player.field_s};
        IntrusiveDeque.field_d[4] = new String[]{ConstrainToCircleLocomotor.field_t, RewardChoiceSlot.field_b, RopeBridgeComponent.field_G};
        Effect.field_h[3] = new String[]{InvertOperator.field_o, vk.field_a, SwitchLinkList.field_d};
        Effect.field_h[4] = new String[]{DisplaySettingsDialog.field_R, gn.field_y, tr.field_d};
        IntrusiveDeque.field_d[5] = new String[]{TripBeamComponent.field_J, td.field_u, PitModel.field_r};
        Effect.field_h[5] = new String[]{TreasureValuesOverlay.field_k, MazeComponent.field_G, du.field_b};
        IntrusiveDeque.field_d[6] = new String[]{ConstrainToCircleLocomotor.field_v, VortexBehaviour.field_o, PowerUpItemBehaviour.field_s};
        Effect.field_h[6] = new String[]{apa.field_b, pna.field_k, bq.field_e};
        IntrusiveDeque.field_d[7] = new String[]{TouchSwitchBehaviour.field_q, MatchScoringObserver.field_d};
        IntrusiveDeque.field_d[8] = new String[]{uv.field_u, jd.field_m, hoa.field_n};
        Effect.field_h[7] = new String[]{ProceduralTexture.field_n, ld.field_d};
        IntrusiveDeque.field_d[9] = new String[]{td.field_n, nea.field_b, gga.field_L};
        Effect.field_h[8] = new String[]{ThresholdOperator.field_o, StaticCrusherComponent.field_G, ClientException.field_e};
        Effect.field_h[9] = new String[]{qna.field_a, MenuScreen.field_h, PrefabComponent.field_D};
        IntrusiveDeque.field_d[10] = new String[]{kd.field_z, qba.field_d, GridWidgetContainer.field_H};
        Effect.field_h[10] = new String[]{ViewportManager.field_a, IntPoint.field_c, fb.field_b};
    }

    public rg() {
        super(0, 0, 0, 0, (isa) null, (WidgetListener) null);
        this.field_y = 256;
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        Sprite var6 = null;
        if (param3 != 0) {
          return;
        }
        if (this.child == null) {
          return;
        }
        if (0 == this.field_y) {
          return;
        }
        if (this.field_y != 256) {
          var6 = new Sprite(this.child.field_m, this.child.field_p);
          nm.a(var6, (byte) 110);
          this.child.renderLayer(param2, 0, 0, param3);
          pfa.a(1);
          var6.c(param0 + this.field_i, this.field_n + param1, this.field_y);
          return;
        }
        this.child.renderLayer(param0 + this.field_i, this.field_n + param1, 0, param3);
    }

    final static boolean e(int param0, int param1, int param2) {
        if (param1 <= -32) {
          return 0 != (65536 & param2) ? true : false;
        }
        rg.e(30, 88, 2);
        return 0 != (65536 & param2) ? true : false;
    }

    final static boolean f(int param0) {
        if (param0 != 7) {
          return true;
        }
        return SwitchableId.a((byte) 108, di.a(31));
    }

    final static int g(byte param0) {
        if (param0 < 66) {
          rg.f(79);
          return MotionTrackingModel.field_p;
        }
        return MotionTrackingModel.field_p;
    }

    static {
        field_A = new hra();
        field_B = 0;
    }
}
