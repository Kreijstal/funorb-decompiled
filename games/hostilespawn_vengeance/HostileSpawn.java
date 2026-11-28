/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class HostileSpawn extends NetworkGameClient {
    private int field_D;
    static int[] field_K;
    private int field_H;
    static java.applet.Applet field_B;
    static RgbSprite[] field_J;
    private qh field_G;
    static boolean field_F;
    static int[] field_E;
    private static RgbSprite field_C;
    public static boolean field_I;

    private final void loadGameplaySprites(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RgbSprite[] var2 = null;
        IndexedSprite[] var2_array = null;
        int var3_int = 0;
        IndexedSprite var3 = null;
        RgbSprite var4 = null;
        int var4_int = 0;
        IndexedSprite[] var4_array = null;
        int var5_int = 0;
        IndexedSprite[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite[] var2_arrayLifetime1;
        IndexedSprite[] var2_arrayLifetime2;
        IndexedSprite[] var2_arrayLifetime3;
        IndexedSprite[] var2_arrayLifetime4;
        var7 = field_I ? 1 : 0;
        try {
          gj.a(20, EditableTextField.field_H, 77.0f);
          this.renderFrame((byte) -76);
          this.loadScenerySprites(13119);
          wk.field_b[0] = ia.field_e;
          wk.field_b[3] = qm.field_P;
          wk.field_b[2] = sc.field_a;
          wk.field_b[1] = FullscreenFocusCanvas.field_f;
          wk.field_b[4] = fg.a("", "key", DequeWidgetContainer.field_C, false);
          wk.field_b[11] = KeyboardInput.field_f;
          VolumeRampingMidiPcmStream.field_bb = new int[101];
          wk.field_b[10] = aa.field_b;
          wk.field_b[5] = e.field_r;
          wk.field_b[9] = BufferedRandomAccessFile.field_l;
          wk.field_b[8] = mg.field_b;
          wk.field_b[6] = KeyboardInput.field_h;
          wk.field_b[7] = qh.field_l;
          var2_int = 0;
          do {
            if (101 <= var2_int) {
              BoundedRandomAccessFile.field_d = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "crosshair");
              break;
            }
            VolumeRampingMidiPcmStream.field_bb[var2_int] = var2_int * 131586;
            var2_int++;
          } while (var7 == 0);
          var2 = BoundedRandomAccessFile.field_d;
          var3_int = 0;
          while (var3_int < var2.length) {
            var4 = var2[var3_int];
            var4.normalizeCanvas();
            var3_int++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var3 = new IndexedSprite(24, 24, 2);
          var3.field_k[1] = 65280;
          var4_int = 0;
          while (var3.field_j.length > var4_int) {
            var3.field_j[var4_int] = (byte) 1;
            var4_int++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var4_array = new IndexedSprite[256];
          var5_int = 0;
          do {
            if (var5_int >= var4_array.length) {
              ak.field_b = new IndexedSprite[2048];
              break;
            }
            var4_array[var5_int] = var3;
            var5_int++;
          } while (var7 == 0);
          var2_array = sg.a(true, "", DequeWidgetContainer.field_C, "wall_hammerhead");
          ArrayBlockSupport.copyObjectRange(var2_array, 0, ak.field_b, 0, 256);
          ArrayBlockSupport.copyObjectRange(var4_array, 0, ak.field_b, 256, 256);
          var2_arrayLifetime1 = sg.a(true, "", DequeWidgetContainer.field_C, "wall_normal_kerrus");
          ArrayBlockSupport.copyObjectRange(var2_arrayLifetime1, 0, ak.field_b, 512, 256);
          var2_arrayLifetime2 = sg.a(true, "", DequeWidgetContainer.field_C, "wall_station");
          ArrayBlockSupport.copyObjectRange(var2_arrayLifetime2, 0, ak.field_b, 768, 256);
          var2_arrayLifetime3 = sg.a(true, "", DequeWidgetContainer.field_C, "wall_hive");
          ArrayBlockSupport.copyObjectRange(var2_arrayLifetime3, 0, ak.field_b, 1024, 256);
          ArrayBlockSupport.copyObjectRange(var4_array, 0, ak.field_b, 1280, 256);
          ArrayBlockSupport.copyObjectRange(var4_array, 0, ak.field_b, 1536, 256);
          var2_arrayLifetime4 = sg.a(true, "", DequeWidgetContainer.field_C, "wall_office");
          ArrayBlockSupport.copyObjectRange(var2_arrayLifetime4, 0, ak.field_b, 1792, 256);
          var4_array = null;
          ValidationStatusWidget.field_Z = th.a(DequeWidgetContainer.field_C, -124, "digitalserial_10", RegistrationAgreementPane.field_J, "");
          wh.field_d = th.a(DequeWidgetContainer.field_C, param0 + 201, "digitalserial_16", RegistrationAgreementPane.field_J, "");
          AccountRegistrationPanel.field_L = th.a(DequeWidgetContainer.field_C, 49, "digitalserial_20", RegistrationAgreementPane.field_J, "");
          id.field_A = th.a(DequeWidgetContainer.field_C, -127, "digitalserial_12", RegistrationAgreementPane.field_J, "");
          ArchiveIndex.a("basicfont12", ResourceArchive.field_a, 83, wd.field_a, "");
          ClientLookupTables.field_e = th.a(DequeWidgetContainer.field_C, -111, "micro_numbers", RegistrationAgreementPane.field_J, "");
          NetworkArchiveRequest.field_y = fg.a("", "splat_guard", DequeWidgetContainer.field_C, false);
          NetworkGameClient.field_s = fg.a("", "splat_dormant", DequeWidgetContainer.field_C, false);
          BoundedRandomAccessFile.field_g = fg.a("", "splat_praetorian", DequeWidgetContainer.field_C, false);
          AccountRequestState.field_c = fg.a("", "splat_queen", DequeWidgetContainer.field_C, false);
          DiskArchiveRequest.field_x = fg.a("", "splat_runner", DequeWidgetContainer.field_C, false);
          tb.field_I = fg.a("", "splat_spitter", DequeWidgetContainer.field_C, false);
          StandardContentDialog.field_jb = fg.a("", "splat_egg", DequeWidgetContainer.field_C, false);
          ProgressDialog.field_fb = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "muzzle");
          ln.field_m = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 105, "", "newexplosion");
          ContentTransitionDialog.field_ib = ln.field_m;
          if (!ib.a((byte) -72)) {
            var5 = sg.a(true, "", DequeWidgetContainer.field_C, "member_benefits");
            DiskCacheWorker.field_a = new e(ni.field_g, SpriteBase.field_g, var5, MouseInput.field_i);
          }
          var5 = sg.a(true, "", DequeWidgetContainer.field_C, "keys");
          var6 = 0;
          do {
            if (var5.length <= var6) {
              ValidationStatusWidget.field_Z.setInlineSprites(var5, (int[]) null);
              id.field_A.setInlineSprites(var5, (int[]) null);
              il.field_c = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "infoscreen");
              DialogMessagePane.field_H = MouseInput.a("", 27, "numkeys", DequeWidgetContainer.field_C);
              MusicPatchEnvelope.field_f = MouseInput.a("", 114, "secweaponkeys", DequeWidgetContainer.field_C);
              fj.field_Kb = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "achievements_lrg");
              SpriteGeometry.field_v = qm.a("", 0, "hs_unachieved", DequeWidgetContainer.field_C);
              de.field_i = MouseInput.a("basic", param0 + 222, "locked", wd.field_a);
              ob.field_B = sg.a(true, "", DequeWidgetContainer.field_C, "hs_coins");
              PcmResampler.field_f = MouseInput.a("", -100, "sliderbutton", DequeWidgetContainer.field_C);
              oa.field_m = new RgbSprite[9];
              oa.field_m[0] = new RgbSprite(4, 4);
              oa.field_m[1] = new RgbSprite(4, 4);
              break;
            }
            var5[var6].field_i = var5[var6].field_a;
            var5[var6].field_c = 0;
            var6++;
          } while (var7 == 0);
          var6 = 0;
          do {
            if (!(oa.field_m[1].field_D.length > var6)) {
              oa.field_m[6] = oa.field_m[0];
              oa.field_m[8] = oa.field_m[0];
              oa.field_m[4] = oa.field_m[1];
              oa.field_m[2] = oa.field_m[0];
              oa.field_m[3] = oa.field_m[0];
              oa.field_m[5] = oa.field_m[0];
              oa.field_m[7] = oa.field_m[1];
              SpriteGeometry.field_x = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "level_select_mouseover_frame");
              fm.field_a = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "level_select_selected_frame");
              ModalDialog.field_J = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "menu_frame");
              ModalDialog.field_J[4] = null;
              o.field_n.setAsRasterTarget((byte) -36);
              cf.field_q = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 + 218, "", "marine_run");
              ng.field_p = new RgbSprite[5][];
              ng.field_p[2] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 + 228, "", "marine_legs_left");
              ng.field_p[3] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 97, "", "marine_legs_right");
              ng.field_p[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor((int) param0, -10), "", "marine_legs_forward");
              ng.field_p[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 116, "", "marine_legs_back");
              ng.field_p[4] = FullscreenStatusDialog.a(ng.field_p[4], 150, 27);
              ng.field_p[0] = null;
              km.field_A = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 96, "", "marine_idle");
              vj.field_e = km.field_A;
              dn.field_i = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 104, "", "marine_interact");
              DropTargetWidgetContainer.field_G = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 100, "", "marine_firing");
              DropTargetWidgetContainer.field_G = FullscreenStatusDialog.a(DropTargetWidgetContainer.field_G, 150, 25);
              aa.field_d = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 ^ -7, "", "marine_death");
              gj.a(param0 ^ -101, EditableTextField.field_H, 84.0f);
              this.renderFrame((byte) -106);
              GridPoint.field_c = fg.a("", "hud_gun_big", DequeWidgetContainer.field_C, false);
              KeyboardInput.field_d = fg.a("", "hud_bottom", DequeWidgetContainer.field_C, false);
              gj.field_d = fg.a("", "hud_progress_bar", DequeWidgetContainer.field_C, false);
              ti.field_j = fg.a("", "hud_gun_box", DequeWidgetContainer.field_C, false);
              field_J = new RgbSprite[3];
              field_J[0] = fg.a("", "hud_health_base", DequeWidgetContainer.field_C, false);
              field_J[1] = fg.a("", "hud_health_slice", DequeWidgetContainer.field_C, false);
              field_J[2] = fg.a("", "hud_health_top", DequeWidgetContainer.field_C, false);
              vg.field_c = qm.a("", 0, "marine_face", DequeWidgetContainer.field_C);
              ByteStorage.field_d = new IndexedSprite[2][10];
              ByteStorage.field_d[0][0] = qm.a("", 0, "kerrus_1_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][1] = qm.a("", 0, "kerrus_2_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][2] = qm.a("", 0, "kerrus_3_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][3] = qm.a("", 0, "kerrus_4_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][4] = qm.a("", param0 + 113, "kerrus_5_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][5] = qm.a("", 0, "kerrus_6_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][6] = qm.a("", param0 + 113, "kerrus_7_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][7] = qm.a("", bm.bitwiseXor((int) param0, -113), "kerrus_8_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][8] = qm.a("", 0, "kerrus_9_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[0][9] = qm.a("", 0, "kerrus_10_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][0] = qm.a("", bm.bitwiseXor((int) param0, -113), "vengeance_1_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][1] = qm.a("", 0, "vengeance_2_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][2] = qm.a("", 0, "vengeance_3_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][3] = qm.a("", 0, "vengeance_4_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][4] = qm.a("", 0, "vengeance_5_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][5] = qm.a("", 0, "vengeance_6_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][6] = qm.a("", param0 + 113, "vengeance_7_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][7] = qm.a("", 0, "vengeance_8_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][8] = qm.a("", 0, "vengeance_9_preview", DequeWidgetContainer.field_C);
              ByteStorage.field_d[1][9] = qm.a("", 0, "vengeance_10_preview", DequeWidgetContainer.field_C);
              this.loadEnemyAnimationSprites(param0 + 152);
              ia.field_l[10] = fg.a("", "spawn20", DequeWidgetContainer.field_C, false);
              ia.field_l[12] = fg.a("", "gunturret", DequeWidgetContainer.field_C, false);
              MouseInput.field_b = fg.a("", "cragturret", DequeWidgetContainer.field_C, false);
              ia.field_l[13] = fg.a("", "barrel", DequeWidgetContainer.field_C, false);
              jd.a((byte) 33, "", DequeWidgetContainer.field_C, "spawneyes0");
              ia.field_l[23] = MouseInput.a("", -32, "doorgfx", DequeWidgetContainer.field_C);
              AccountCreationResultPanel.field_zb = fg.a("", "hatching", DequeWidgetContainer.field_C, false);
              gj.a(param0 + 133, EditableTextField.field_H, 91.0f);
              this.renderFrame((byte) -51);
              qa.field_g = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 101, "", "guns");
              di.field_b = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "gun_silhouettes");
              AccountServiceResult.field_j = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 125, "", "bullet_acid");
              sj.field_e = fg.a("", "bullet_plasma", DequeWidgetContainer.field_C, false);
              FullscreenFocusCanvas.field_c = MouseInput.a("", -36, "bullet_rocket", DequeWidgetContainer.field_C);
              GrowableIntArray.field_g = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 125, "", "muzzleflash");
              id.field_p = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 89, "", "impact_gun");
              fg.a("", "impact_rail", DequeWidgetContainer.field_C, false);
              MouseInput.a("", 116, "scorchmark_alpha", DequeWidgetContainer.field_C);
              NanoFrameTimer.field_k = fg.a("", "spatter_spawn", DequeWidgetContainer.field_C, false);
              break;
            }
            oa.field_m[1].field_D[var6] = 14342656;
            var6++;
          } while (var7 == 0);
          if (param0 != -113) {
            return;
          }
          om.field_d = fg.a("", "bullet_pistol", DequeWidgetContainer.field_C, false);
          RegistrationAgreementPane.field_G = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 109, "", "grenade_roll");
          sc.field_l = fg.a("", "acid_drop", DequeWidgetContainer.field_C, false);
          v.field_j = fg.a("", "battle_damaged_cragturret", DequeWidgetContainer.field_C, false);
          rl.field_d = fg.a("", "battle_damaged_gunturret", DequeWidgetContainer.field_C, false);
          this.populateScenerySpriteTable((byte) 114);
          fa.field_d = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "lights");
          gj.a(20, EditableTextField.field_H, 99.0f);
          this.renderFrame((byte) -69);
          pi.field_a[0] = MouseInput.a("", 116, "shadow0", DequeWidgetContainer.field_C);
          pi.field_a[1] = MouseInput.a("", 110, "shadow1", DequeWidgetContainer.field_C);
          pi.field_a[2] = MouseInput.a("", param0 + 232, "shadow2", DequeWidgetContainer.field_C);
          hh.field_a = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 97, "", "ammo");
          fg.a("", "pointer", DequeWidgetContainer.field_C, false);
          MatchingFieldValidator.field_t = fg.a("", "compass", DequeWidgetContainer.field_C, false);
          pi.field_b = MouseInput.a("", param0 + 225, "health", DequeWidgetContainer.field_C);
          eg.field_v = fg.a("", "dragged_egg", DequeWidgetContainer.field_C, false);
          qg.field_q = fg.a("", "dragged_slime", DequeWidgetContainer.field_C, false);
          uf.field_g = new IndexedSprite[3];
          uf.field_g[0] = qm.a("", 0, "win_kerrus", DequeWidgetContainer.field_C);
          uf.field_g[1] = qm.a("", bm.bitwiseXor((int) param0, -113), "win_vengeance", DequeWidgetContainer.field_C);
          uf.field_g[2] = qm.a("", 0, "win_vengeance_alt", DequeWidgetContainer.field_C);
          DequeWidgetContainer.field_C = null;
          ResourceArchive.field_a = null;
          var6 = 0;
          while (ia.field_l.length > var6) {
            if (var7 != 0) {
              return;
            }
            if (null != ia.field_l[var6]) {
              dc.field_a[var6] = ne.a(ia.field_l[var6], (byte) -93);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.W(" + param0 + ')');
        }
    }

    private final void populateScenerySpriteTable(byte param0) {
        RuntimeException runtimeException = null;
        RgbSprite var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new RgbSprite(1, 1);
          ia.field_l[99] = vf.field_H;
          ia.field_l[118] = tb.field_L;
          ia.field_l[145] = AccountNameAvailabilityValidator.field_q;
          ia.field_l[141] = ln.field_g;
          ia.field_l[164] = pi.field_c;
          ia.field_l[108] = DefaultTextWidgetRenderer.field_h;
          ia.field_l[162] = ga.field_a;
          ia.field_l[115] = BufferedSocket.field_f;
          ia.field_l[212] = SpriteGeometry.field_q;
          ia.field_l[140] = IsaacGenerator.field_j;
          ia.field_l[207] = ArchiveIndex.field_e;
          ia.field_l[74] = ki.field_b;
          ia.field_l[177] = ProxySocketFactory.field_d;
          ia.field_l[201] = vb.field_Lb;
          ia.field_l[41] = og.field_d;
          ia.field_l[120] = ub.field_c;
          ia.field_l[210] = hj.field_r;
          ia.field_l[146] = ml.field_a;
          ia.field_l[130] = PacketBuffer.field_k;
          ia.field_l[62] = rb.field_y;
          ia.field_l[89] = tc.field_b;
          ia.field_l[105] = EditableTextField.field_R;
          ia.field_l[189] = oa.field_i;
          ia.field_l[128] = bm.field_f;
          ia.field_l[54] = cl.field_j;
          ia.field_l[91] = km.field_z;
          ia.field_l[209] = dn.field_h;
          ia.field_l[173] = AwtRasterBuffer.field_i;
          ia.field_l[55] = de.field_o;
          ia.field_l[137] = DiskArchiveRequest.field_C;
          ia.field_l[129] = ca.field_b;
          ia.field_l[61] = lc.field_b;
          ia.field_l[135] = mg.field_f;
          ia.field_l[60] = MouseInput.field_k;
          ia.field_l[125] = mn.field_b;
          ia.field_l[127] = hh.field_b;
          ia.field_l[186] = dc.field_b;
          ia.field_l[138] = DiskArchiveRequest.field_z;
          ia.field_l[149] = ByteArrayPoolSupport.field_e;
          ia.field_l[217] = IntrusiveNodeHashTable.field_a;
          ia.field_l[114] = DraggableWidgetContainer.field_N;
          ia.field_l[208] = DualLinkDeque.field_c;
          ia.field_l[176] = TextInputField.field_T;
          ia.field_l[79] = oa.field_e;
          ia.field_l[136] = le.field_xb;
          ia.field_l[171] = ModalDialog.field_G;
          ia.field_l[163] = oh.field_a;
          ia.field_l[75] = LabeledWidgetContainer.field_C;
          ia.field_l[159] = MouseInput.field_j;
          ia.field_l[170] = bh.field_h;
          ia.field_l[219] = AchievementNotification.field_l;
          ia.field_l[40] = f.field_b;
          ia.field_l[168] = id.field_w;
          ia.field_l[58] = an.field_l;
          ia.field_l[77] = IsaacGenerator.field_c;
          ia.field_l[175] = gm.field_j;
          ia.field_l[123] = MouseInput.field_l;
          ia.field_l[65] = ImageProducerRasterBuffer.field_o;
          ia.field_l[66] = AwtRasterBuffer.field_h;
          ia.field_l[97] = GrowableIntArray.field_a;
          ia.field_l[203] = qh.field_g;
          ia.field_l[102] = lh.field_e;
          ia.field_l[111] = qg.field_m;
          ia.field_l[92] = ProxyAuthenticationRequiredException.field_a;
          ia.field_l[184] = ra.field_b;
          ia.field_l[104] = DualLinkDeque.field_b;
          ia.field_l[180] = GuestPlayConfirmationForm.field_E;
          ia.field_l[32] = CrossfadingMidiPcmStream.field_y;
          ia.field_l[134] = mj.field_a;
          ia.field_l[93] = GameCanvas.field_k;
          ia.field_l[211] = pj.field_l;
          ia.field_l[199] = var2;
          ia.field_l[202] = uh.field_f;
          ia.field_l[84] = gf.field_a;
          ia.field_l[197] = var2;
          ia.field_l[103] = vg.field_d;
          ia.field_l[198] = var2;
          ia.field_l[51] = eh.field_b;
          ia.field_l[121] = fa.field_e;
          ia.field_l[206] = vk.field_p;
          ia.field_l[44] = NodeHashTableIterator.field_g;
          ia.field_l[150] = ResourceArchive.field_l;
          ia.field_l[190] = om.field_e;
          ia.field_l[96] = q.field_c;
          ia.field_l[70] = e.field_d;
          ia.field_l[182] = gf.field_g;
          ia.field_l[133] = ImageProducerRasterBuffer.field_n;
          ia.field_l[221] = s.field_d;
          ia.field_l[152] = ni.field_b;
          ia.field_l[158] = AlphaWidgetContainer.field_B;
          ia.field_l[63] = FullscreenFocusCanvas.field_h;
          ia.field_l[113] = AgeValidator.field_p;
          ia.field_l[48] = ByteArrayPoolSupport.field_b;
          ia.field_l[94] = jc.field_a;
          ia.field_l[187] = bb.field_a;
          ia.field_l[205] = j.field_a;
          ia.field_l[193] = cf.field_t;
          ia.field_l[144] = sj.field_b;
          ia.field_l[139] = FrameTimer.field_d;
          if (param0 <= 113) {
            this.loadVengeanceCampaignLevels(-63);
          }
          ia.field_l[42] = r.field_e;
          ia.field_l[78] = ProxySocketFactory.field_f;
          ia.field_l[218] = GuestPlayConfirmationForm.field_J;
          ia.field_l[183] = sd.field_w;
          ia.field_l[81] = FullscreenFocusCanvas.field_f;
          ia.field_l[53] = bi.field_b;
          ia.field_l[153] = fm.field_b;
          ia.field_l[131] = ri.field_k;
          ia.field_l[174] = la.field_e;
          ia.field_l[220] = uc.field_a;
          ia.field_l[69] = CipherPacketBuffer.field_w;
          ia.field_l[132] = MouseInput.field_g;
          ia.field_l[116] = dd.field_j;
          ia.field_l[73] = GameCanvas.field_h;
          ia.field_l[178] = GrowableIntArray.field_j;
          ia.field_l[38] = GridPoint.field_d;
          ia.field_l[64] = KeyboardInput.field_j;
          ia.field_l[88] = ea.field_e;
          ia.field_l[147] = p.field_d;
          ia.field_l[192] = ne.field_n;
          ia.field_l[155] = o.field_g;
          ia.field_l[59] = PacketBuffer.field_j;
          ia.field_l[169] = AgeValidator.field_o;
          ia.field_l[117] = Bzip2State.field_C;
          ia.field_l[80] = qa.field_g[7];
          ia.field_l[85] = bl.field_c;
          ia.field_l[90] = NodeHashTableIterator.field_d;
          ia.field_l[194] = uj.field_r;
          ia.field_l[36] = ih.field_v;
          ia.field_l[143] = kc.field_d;
          ia.field_l[160] = ln.field_j;
          ia.field_l[67] = MusicPatchEnvelope.field_j;
          ia.field_l[156] = wi.field_e;
          ia.field_l[68] = ProgressDialog.field_hb;
          ia.field_l[39] = hg.field_a;
          ia.field_l[213] = field_C;
          ia.field_l[72] = f.field_d;
          ia.field_l[166] = BufferedRandomAccessFile.field_o;
          ia.field_l[112] = SpriteGeometry.field_B;
          ia.field_l[56] = an.field_j;
          ia.field_l[100] = nd.field_a;
          ia.field_l[200] = sd.field_t;
          ia.field_l[196] = ByteArrayPoolSupport.field_j;
          ia.field_l[98] = sj.field_g;
          ia.field_l[122] = ej.field_d;
          ia.field_l[216] = gf.field_d;
          ia.field_l[87] = vj.field_p;
          ia.field_l[188] = qg.field_i;
          ia.field_l[109] = FullscreenStatusDialog.field_cb;
          ia.field_l[107] = eb.field_b;
          ia.field_l[191] = DelayedPacket.field_n;
          ia.field_l[154] = MusicPatchEnvelope.field_p;
          ia.field_l[148] = wk.field_a;
          ia.field_l[185] = AchievementNotification.field_j;
          ia.field_l[110] = SocketFactory.field_c;
          ia.field_l[82] = ia.field_e;
          ia.field_l[215] = la.field_h;
          ia.field_l[167] = MusicPatchPcmStream.field_r;
          ia.field_l[195] = var2;
          ia.field_l[165] = AwtRasterBuffer.field_d;
          ia.field_l[35] = om.field_c;
          ia.field_l[161] = KeyboardInput.field_i;
          ia.field_l[86] = u.field_h;
          ia.field_l[52] = lc.field_a;
          ia.field_l[119] = wd.field_b;
          ia.field_l[83] = SecondaryNodeDequeIterator.field_f;
          ia.field_l[172] = DelayedPacket.field_p;
          ia.field_l[124] = ng.field_i;
          ia.field_l[95] = hm.field_l;
          ia.field_l[37] = ValidationStatusIcon.field_L;
          ia.field_l[50] = DebouncedFieldValidator.field_j;
          ia.field_l[71] = EditableTextField.field_S;
          ia.field_l[46] = ng.field_v;
          ia.field_l[45] = SoundCache.field_a;
          ia.field_l[101] = ProxySocketFactory.field_l;
          ia.field_l[151] = wh.field_e;
          ia.field_l[179] = DualLinkNode.field_n;
          ia.field_l[43] = r.field_b;
          ia.field_l[49] = qj.field_l;
          ia.field_l[126] = ln.field_c;
          ia.field_l[57] = IsaacGenerator.field_f;
          ia.field_l[181] = ni.field_d;
          ia.field_l[34] = jd.field_h;
          ia.field_l[33] = c.field_f[0];
          ia.field_l[76] = ResizableModalDialog.field_W;
          ia.field_l[106] = ic.field_k;
          ia.field_l[142] = MatchingFieldValidator.field_y;
          ia.field_l[204] = DelayedPacket.field_m;
          ia.field_l[214] = rg.field_a;
          ia.field_l[157] = fg.field_d;
          ia.field_l[47] = re.field_q;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.WA(" + param0 + ')');
        }
    }

    final void drawMissionMap(int param0, int param1) {
        boolean stackIn_37_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_36_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        GridPoint var8 = null;
        int var9_int = 0;
        p var9 = null;
        oj var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        p var9Lifetime1;
        int stackIn_111_0Lifetime1;
        int stackIn_111_1Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var9_intLifetime1;
        var12 = field_I ? 1 : 0;
        try {
          var6 = ln.field_a.field_d;
          var7 = ln.field_a.field_a;
          var8_int = 0;
          scanLoop1: while ((-1 + var6) > var8_int) {
            var9_int = 0;
            while (true) {
              if (var7 - 1 > var9_int) {
                var4 = var9_int * param1 + 1;
                var3_int = var8_int * param1 + 1;
                var5 = var8_int + var6 * var9_int;
                if (var12 == 0) {
                  if (null != pk.field_d[ln.field_a.field_y[var5]]) {
                    pk.field_d[ln.field_a.field_y[var5]].drawScaled(var3_int, var4, param1, param1);
                  }
                  var10 = ln.field_a.field_o[var5];
                  if (0 <= var10) {
                    ak.field_b[var10].drawScaled(var3_int, var4, param1, param1);
                    if (r.field_a == 0) {
                      SoftwareRasterizer.fillRectangleAlpha(var3_int, var4, param1, param1, 0, 128);
                    }
                  }
                  var11 = ln.field_a.field_i[var5];
                  if (ln.field_a.field_f[var5] == 0) {
                    var11 = 0;
                  } else {
                    var11 = var11 * 5;
                  }
                  if (var11 <= 0) {
                    SoftwareRasterizer.fillRectangle(var3_int, var4, param1, param1, 0);
                  } else {
                    if (var11 < 25) {
                      SoftwareRasterizer.fillRectangleAlpha(var3_int, var4, param1, param1, 0, 255 - 10 * var11);
                    }
                  }
                  var9_int++;
                  continue;
                }
              } else {
                var8_int++;
              }
              break;
            }
            if (var12 == 0) {
              continue scanLoop1;
            }
            break;
          }
          var8 = new GridPoint(0, 0);
          var5Lifetime1 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(ll.field_a > var5Lifetime1)))) {
            var9 = wh.field_b[var5Lifetime1];
            stackOut_36_0 = ln.field_a.field_B[var9.field_j.getClampedTileIndex(-4)];
            stackIn_43_0 = stackOut_36_0 ? 1 : 0;
            stackIn_37_0 = stackOut_36_0;
            if (var12 == 0) {
              if (stackIn_37_0) {
                var3_intLifetime1 = 1 + param1 * var9.field_j.field_e;
                var4Lifetime1 = 1 + var9.field_j.field_g * param1;
                SoftwareRasterizer.fillRectangle(var3_intLifetime1 - 1, var4Lifetime1 - 1, param1, param1, 16776960);
                SoftwareRasterizer.fillRectangleAlpha(-2 + var3_intLifetime1, var4Lifetime1 - 2, param1 + 2, 2 + param1, 16776960, 32);
                SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime1 - 3, var4Lifetime1 - 3, param1 + 4, param1 + 4, 16776960, 32);
              }
              var5Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_43_0 = 0;
          }
          var5Lifetime2 = stackIn_43_0;
          scanLoop2: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (ProxySocketFactory.field_j > var5Lifetime2) {
              var9_ref = TextHotspotBounds.field_m[var5Lifetime2];
              stackIn_155_0 = var9_ref.field_i;
              stackIn_155_1 = 1;
              if (var12 == 0) {
                if ((stackIn_155_0 == stackIn_155_1 ||
                  var9_ref.field_i == 2 ||
                  var9_ref.field_i == 18 ||
                  19 == var9_ref.field_i ||
                  var9_ref.field_i == 23 ||
                  var9_ref.field_i == 24 &&
                  var9_ref.field_s ||
                  (var9_ref.field_i == 25 ||
                  var9_ref.field_i == 27 ||
                  var9_ref.field_i == 28)) && (var9_ref.field_n &&
                  ln.field_a.field_i[var9_ref.field_j.getClampedTileIndex(-4)] > 0)) {
                  var3_intLifetime2 = param1 * var9_ref.field_j.field_e + 1;
                  var4Lifetime2 = 1 + var9_ref.field_j.field_g * param1;
                  SoftwareRasterizer.fillCircle(param1 / 2 + var3_intLifetime2, param1 / 2 + var4Lifetime2, param1 / 2, 16711680);
                  SoftwareRasterizer.fillCircleAlpha(var3_intLifetime2 + param1 / 2, var4Lifetime2 + param1 / 2, param1 / 2 + 1, 16711680, 128);
                  SoftwareRasterizer.fillCircleAlpha(var3_intLifetime2 + param1 / 2, param1 / 2 + var4Lifetime2, param1 / 2 + 2, 16711680, 64);
                }
                var5Lifetime2++;
                continue;
              }
            } else {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              regionExit3: {
                var9_intLifetime1 = ha.field_t;
                if ((var9_intLifetime1 != 0 ||
                  var12 != 0) && var9_intLifetime1 != 6) {
                  if (2 == var9_intLifetime1) {
                    break regionExit3;
                  }
                  if (var9_intLifetime1 == 3 &&
                    var12 == 0) {
                    for (var5Lifetime2 = 0; var5Lifetime2 < ProxySocketFactory.field_j; var5Lifetime2++) {
                      var9_ref = TextHotspotBounds.field_m[var5Lifetime2];
                      stackIn_155_0 = ~var9_ref.field_i;
                      stackIn_155_1 = -9;
                      if (stackIn_155_0 == stackIn_155_1) {
                        var4Lifetime2 = var9_ref.field_j.field_g * param1 + 1;
                        var3_intLifetime2 = var9_ref.field_j.field_e * param1 + 1;
                        SoftwareRasterizer.fillRectangle(var3_intLifetime2 - 1, -1 + var4Lifetime2, 2 * param1, param1 * 2, 16711680);
                        SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 2, -2 + var4Lifetime2, 2 * param1 + 2, param1 * 2 + 2, 16711680, 32);
                        SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 3, var4Lifetime2 - 3, 4 + param1 * 2, 4 + param1 * 2, 16711680, 32);
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (12 != var9_intLifetime1) {
                      if (!(LabeledWidgetContainer.field_E.field_e < 0)) {
                        var4Lifetime2 = 1 + param1 * LabeledWidgetContainer.field_E.field_g;
                        var3_intLifetime2 = 1 + LabeledWidgetContainer.field_E.field_e * param1;
                        SoftwareRasterizer.fillCircleAlpha(var3_intLifetime2, var4Lifetime2, 2 + param1, 16711680, 32);
                        SoftwareRasterizer.drawCircleOutline(var3_intLifetime2, var4Lifetime2, param1 + 4, 16711680);
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var12 == 0) {
                        for (var5Lifetime2 = 0; var5Lifetime2 < ll.field_a; var5Lifetime2++) {
                          var9Lifetime1 = wh.field_b[var5Lifetime2];
                          stackIn_155_0 = ~var9Lifetime1.field_i;
                          stackIn_155_1 = -3;
                          if (stackIn_155_0 == stackIn_155_1 &&
                            var9Lifetime1.field_h == 11) {
                            var4Lifetime2 = 1 + param1 * var9Lifetime1.field_j.field_g;
                            var3_intLifetime2 = var9Lifetime1.field_j.field_e * param1 + 1;
                            SoftwareRasterizer.fillRectangle(-1 + var3_intLifetime2, var4Lifetime2 - 1, param1, param1, 16711680);
                            SoftwareRasterizer.fillRectangleAlpha(-2 + var3_intLifetime2, var4Lifetime2 - 2, param1 + 2, 2 + param1, 16711680, 32);
                            SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 3, -3 + var4Lifetime2, 4 + param1, param1 + 4, 16711680, 32);
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var8.field_e = 0;
                  while (true) {
                    stackIn_111_0 = var6;
                    stackIn_111_1 = var8.field_e;
                    if (stackIn_111_0 <= stackIn_111_1) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (var12 != 0) {
                      break scanLoop2;
                    }
                    var8.field_g = 0;
                    while (var7 > var8.field_g) {
                      stackIn_111_0Lifetime1 = ~ln.field_a.field_y[var8.getClampedTileIndex(-4)];
                      stackIn_111_1Lifetime1 = -149;
                      if (stackIn_111_0Lifetime1 == stackIn_111_1Lifetime1) {
                        var4Lifetime2 = 1 + (var8.field_g - 1) * param1;
                        var3_intLifetime2 = 1 + (-1 + var8.field_e) * param1;
                        SoftwareRasterizer.fillRectangle(var3_intLifetime2, var4Lifetime2, param1 * 3, param1 * 3, 255);
                        SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 1, -1 + var4Lifetime2, 3 * param1 + 2, 3 * param1 + 2, 255, 32);
                        SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 2, -2 + var4Lifetime2, 3 * param1 + 4, 4 + 3 * param1, 255, 32);
                      }
                      var8.field_g = var8.field_g + 1;
                    }
                    var8.field_e = var8.field_e + 1;
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1)) {
                for (var5Lifetime2 = 0; var5Lifetime2 < ProxySocketFactory.field_j; var5Lifetime2++) {
                  var9_ref = TextHotspotBounds.field_m[var5Lifetime2];
                  stackIn_155_0 = -5;
                  stackIn_155_1 = ~var9_ref.field_i;
                  if (var12 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_155_0 == stackIn_155_1) {
                    var4Lifetime2 = 1 + var9_ref.field_j.field_g * param1;
                    var3_intLifetime2 = 1 + var9_ref.field_j.field_e * param1;
                    SoftwareRasterizer.fillRectangle(var3_intLifetime2, var4Lifetime2, param1, param1, 16711680);
                    SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 1, -1 + var4Lifetime2, param1 + 2, 2 + param1, 16711680, 32);
                    SoftwareRasterizer.fillRectangleAlpha(var3_intLifetime2 - 2, -2 + var4Lifetime2, 4 + param1, param1 + 4, 16711680, 32);
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_155_0 = param0;
                stackIn_155_1 = 4;
              }
            }
            if (stackIn_155_0 != stackIn_155_1) {
              this.drawFrameOverlaysAndPresent((java.awt.Canvas) null, -115);
            }
            break;
          }
          var4Lifetime3 = param1 * TextHotspotBounds.field_m[0].field_j.field_g;
          var3_intLifetime3 = TextHotspotBounds.field_m[0].field_j.field_e * param1;
          SoftwareRasterizer.fillRectangle(var3_intLifetime3, var4Lifetime3, param1, param1, 16777215);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var3), "HostileSpawn.TA(" + param0 + ',' + param1 + ')');
        }
    }

    final void prepareGameShutdown(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ImageProducerRasterBuffer.field_q) {
            tb.f((byte) -100);
          }
          la.b(19659);
          if (param0 != 21085) {
            field_C = (RgbSprite) null;
          }
          tg.a((byte) 75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2), "HostileSpawn.CA(" + param0 + ')');
        }
    }

    private final PcmResampler loadBaseSoundEffects(int param0) {
        PcmResampler var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        PcmResampler stackIn_57_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_I ? 1 : 0;
        try {
          gj.a(20, ac.field_e, 56.0f);
          this.renderFrame((byte) -80);
          nd.field_e = new SoundCache(ModalDialog.field_P, InteractiveWidget.field_F);
          var2 = new PcmResampler(22050, AudioOutput.field_g);
          em.field_a[10] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "flamethrower_all").toPcmSample().resample(var2);
          em.field_a[11] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "footstep1").toPcmSample().resample(var2);
          em.field_a[12] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "footstep2").toPcmSample().resample(var2);
          em.field_a[19] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "slidingdoor_close").toPcmSample().resample(var2);
          em.field_a[20] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "slidingdoor_open").toPcmSample().resample(var2);
          em.field_a[22] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "spawn_kill").toPcmSample().resample(var2);
          em.field_a[23] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "spawnhurt_splat").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[1] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "acid_spit").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[3] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "menu_beep").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[4] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "menu_click").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[5] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "burning_fire_loop").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[6] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "queen_spawn").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[7] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "fast_spawn").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[8] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "final_explosion").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[9] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "baby_spawn").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[14] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "crate_explode").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[13] = em.field_a[14];
          NetworkArchiveRequest.field_A[17] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "explode").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[20] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "normal_alien_attack").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[21] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "lift_up").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[22] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "lift_down").toPcmSample().resample(var2);
          NetworkArchiveRequest.field_A[23] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "trigger_reactor").toPcmSample().resample(var2);
          PcmOutputWorker.field_c = new PcmSample[]{NetworkArchiveRequest.field_A[24], NetworkArchiveRequest.field_A[5]};
          var3 = 0;
          do {
            if (5 <= var3) {
              var3 = 0;
              break;
            }
            TextInputField.field_V[var3 + 5] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_machine_gun_0" + (var3 + 1) + "_tail").toPcmSample().resample(var2);
            TextInputField.field_V[0 + var3] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_machine_gun_0" + (var3 + 1) + "_no_tail").toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          do {
            if (var3 >= 2) {
              var3 = 0;
              break;
            }
            TextInputField.field_V[var3 + 10] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_machine_gun_cartridge_drop_0" + (1 + var3)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          do {
            if (var3 >= 3) {
              TextInputField.field_V[15] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_pistol_equip_01").toPcmSample().resample(var2);
              TextInputField.field_V[16] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_machine_gun_equip_01").toPcmSample().resample(var2);
              TextInputField.field_V[17] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_shotgun_equip_01").toPcmSample().resample(var2);
              TextInputField.field_V[18] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_flamethrower_equip").toPcmSample().resample(var2);
              TextInputField.field_V[19] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_railgun_equip").toPcmSample().resample(var2);
              TextInputField.field_V[20] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_rocket_equip").toPcmSample().resample(var2);
              TextInputField.field_V[21] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_plasma_equip_01").toPcmSample().resample(var2);
              TextInputField.field_V[22] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_grenade_equip").toPcmSample().resample(var2);
              break;
            }
            TextInputField.field_V[var3 + 12] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_pistol_0" + (1 + var3)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          var3 = 0;
          do {
            if (var3 >= 5) {
              var3 = 0;
              break;
            }
            TextInputField.field_V[23 + var3] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_shotgun_0" + (1 + var3)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          do {
            if (var3 >= 3) {
              var3 = 0;
              break;
            }
            TextInputField.field_V[var3 + 28] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_plasma_0" + (1 + var3)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          do {
            if (4 <= var3) {
              TextInputField.field_V[35] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_flamethrower_all").toPcmSample().resample(var2);
              TextInputField.field_V[36] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_flamethrower_end").toPcmSample().resample(var2);
              TextInputField.field_V[37] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_rocket_fire_02").toPcmSample().resample(var2);
              TextInputField.field_V[38] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_plasma_impact_01").toPcmSample().resample(var2);
              TextInputField.field_V[39] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_grenade_fire_01").toPcmSample().resample(var2);
              fg.field_b[23] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_collect_charge_01").toPcmSample().resample(var2);
              fg.field_b[25] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_force_field_01").toPcmSample().resample(var2);
              fg.field_b[26] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_rumble_bgsound").toPcmSample().resample(var2);
              break;
            }
            TextInputField.field_V[var3 + 31] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_railgun_0" + (var3 + 1)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          var3 = 0;
          do {
            if (var3 >= 5) {
              if (param0 > -94) {
                this.updateGameTick((byte) 51);
              }
              break;
            }
            TextInputField.field_V[var3 + 41] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_crag_turret_0" + (var3 + 1)).toPcmSample().resample(var2);
            TextInputField.field_V[46 + var3] = SynthesizedSoundEffect.loadByName(ModalDialog.field_P, "", "HS_turret_0" + (1 + var3)).toPcmSample().resample(var2);
            var3++;
          } while (var4 == 0);
          stackIn_57_0 = var2;
          return stackIn_57_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.KA(" + param0 + ')');
        }
    }

    private final void configureInterfaceThemeAndCursor(int param0) {
        try {
          LoginPanel.a(4, 16776960, 4, AccountRegistrationPanel.field_L, 24, 320, 65280, 16777215, 24, id.field_A.field_y + ValidationStatusWidget.field_Z.field_F, ModalDialog.field_J, (RgbSprite[]) null, (RgbSprite[]) null, 4, 24, 7662, 240, 40, 40, param0, id.field_A);
          this.initializeCustomCursorSupport((byte) -91);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.EA(" + param0 + ')');
        }
    }

    private final void loadAdditionalSoundEffects(int param0, PcmResampler param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          gj.a(20, ac.field_e, 63.0f);
          this.renderFrame((byte) -43);
          em.field_a[0] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bang1").decodeAllToPcm().resample(param1);
          em.field_a[1] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bang4").decodeAllToPcm().resample(param1);
          em.field_a[6] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spawnhurt").decodeAllToPcm().resample(param1);
          em.field_a[7] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spawnhurt2").decodeAllToPcm().resample(param1);
          em.field_a[8] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spawnkill").decodeAllToPcm().resample(param1);
          em.field_a[24] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bigspawnkill").decodeAllToPcm().resample(param1);
          TextInputField.field_V[40] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "reload").decodeAllToPcm().resample(param1);
          fg.field_b[0] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "acid_hit_01").decodeAllToPcm().resample(param1);
          fg.field_b[1] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_01").decodeAllToPcm().resample(param1);
          fg.field_b[2] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_02").decodeAllToPcm().resample(param1);
          fg.field_b[3] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_03").decodeAllToPcm().resample(param1);
          fg.field_b[4] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_04").decodeAllToPcm().resample(param1);
          fg.field_b[5] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_05").decodeAllToPcm().resample(param1);
          fg.field_b[6] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_06").decodeAllToPcm().resample(param1);
          fg.field_b[7] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_07").decodeAllToPcm().resample(param1);
          fg.field_b[8] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_08").decodeAllToPcm().resample(param1);
          fg.field_b[9] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_09").decodeAllToPcm().resample(param1);
          fg.field_b[10] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_10").decodeAllToPcm().resample(param1);
          fg.field_b[11] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_11").decodeAllToPcm().resample(param1);
          fg.field_b[12] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_12").decodeAllToPcm().resample(param1);
          fg.field_b[13] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_13").decodeAllToPcm().resample(param1);
          fg.field_b[14] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_14").decodeAllToPcm().resample(param1);
          if (param0 != 22) {
            field_B = (java.applet.Applet) null;
          }
          fg.field_b[15] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_pain_15").decodeAllToPcm().resample(param1);
          fg.field_b[17] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "human_death_01").decodeAllToPcm().resample(param1);
          fg.field_b[18] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "heal_killcount").decodeAllToPcm().resample(param1);
          fg.field_b[19] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "heal_small").decodeAllToPcm().resample(param1);
          fg.field_b[20] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "heal_large").decodeAllToPcm().resample(param1);
          fg.field_b[21] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "pass_card").decodeAllToPcm().resample(param1);
          fg.field_b[22] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "lift_powerup").decodeAllToPcm().resample(param1);
          fg.field_b[24] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "door_locked").decodeAllToPcm().resample(param1);
          jc.field_c[0] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_attack_01").decodeAllToPcm().resample(param1);
          jc.field_c[1] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_01").decodeAllToPcm().resample(param1);
          jc.field_c[2] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_02").decodeAllToPcm().resample(param1);
          jc.field_c[3] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_03").decodeAllToPcm().resample(param1);
          jc.field_c[4] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_04").decodeAllToPcm().resample(param1);
          jc.field_c[5] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_05").decodeAllToPcm().resample(param1);
          jc.field_c[6] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_06").decodeAllToPcm().resample(param1);
          jc.field_c[7] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_07").decodeAllToPcm().resample(param1);
          jc.field_c[8] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "bullet_hit_08").decodeAllToPcm().resample(param1);
          jc.field_c[9] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_die_01").decodeAllToPcm().resample(param1);
          jc.field_c[10] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_die_02").decodeAllToPcm().resample(param1);
          jc.field_c[11] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_die_03").decodeAllToPcm().resample(param1);
          jc.field_c[12] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_01").decodeAllToPcm().resample(param1);
          jc.field_c[13] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_02").decodeAllToPcm().resample(param1);
          jc.field_c[14] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_03").decodeAllToPcm().resample(param1);
          jc.field_c[15] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_04").decodeAllToPcm().resample(param1);
          jc.field_c[16] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_05").decodeAllToPcm().resample(param1);
          jc.field_c[17] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "basic_roar_06").decodeAllToPcm().resample(param1);
          jc.field_c[18] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_roar_01").decodeAllToPcm().resample(param1);
          jc.field_c[19] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_roar_02").decodeAllToPcm().resample(param1);
          jc.field_c[20] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_roar_03").decodeAllToPcm().resample(param1);
          jc.field_c[21] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_die_01").decodeAllToPcm().resample(param1);
          jc.field_c[22] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_die_02").decodeAllToPcm().resample(param1);
          jc.field_c[23] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "runner_die_03").decodeAllToPcm().resample(param1);
          jc.field_c[24] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spitter_die_03").decodeAllToPcm().resample(param1);
          jc.field_c[26] = jc.field_c[24];
          jc.field_c[25] = jc.field_c[24];
          jc.field_c[27] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "guard_hurt_loop_01").decodeAllToPcm().resample(param1);
          jc.field_c[28] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "guard_roar_01").decodeAllToPcm().resample(param1);
          jc.field_c[29] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "guard_roar_02").decodeAllToPcm().resample(param1);
          jc.field_c[30] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "guard_roar_03").decodeAllToPcm().resample(param1);
          jc.field_c[32] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_roar_01").decodeAllToPcm().resample(param1);
          jc.field_c[33] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_roar_02").decodeAllToPcm().resample(param1);
          jc.field_c[34] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_roar_03").decodeAllToPcm().resample(param1);
          jc.field_c[31] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_big_roar_01").decodeAllToPcm().resample(param1);
          jc.field_c[35] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_bite_01").decodeAllToPcm().resample(param1);
          jc.field_c[36] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_bite_02").decodeAllToPcm().resample(param1);
          jc.field_c[37] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_bite_03").decodeAllToPcm().resample(param1);
          jc.field_c[38] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_bite_04").decodeAllToPcm().resample(param1);
          jc.field_c[39] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_bite_05").decodeAllToPcm().resample(param1);
          jc.field_c[40] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "queen_die_proc_01").decodeAllToPcm().resample(param1);
          jc.field_c[41] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_01").decodeAllToPcm().resample(param1);
          jc.field_c[42] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_02").decodeAllToPcm().resample(param1);
          jc.field_c[43] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_03").decodeAllToPcm().resample(param1);
          jc.field_c[44] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_04").decodeAllToPcm().resample(param1);
          jc.field_c[45] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_05").decodeAllToPcm().resample(param1);
          jc.field_c[46] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "dormant_hatch_06").decodeAllToPcm().resample(param1);
          jc.field_c[47] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "egg_burst_01").decodeAllToPcm().resample(param1);
          jc.field_c[48] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "egg_burst_02").decodeAllToPcm().resample(param1);
          jc.field_c[49] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "egg_burst_03").decodeAllToPcm().resample(param1);
          jc.field_c[55] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_01").decodeAllToPcm().resample(param1);
          jc.field_c[56] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_02").decodeAllToPcm().resample(param1);
          jc.field_c[57] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_03").decodeAllToPcm().resample(param1);
          jc.field_c[58] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_04").decodeAllToPcm().resample(param1);
          jc.field_c[59] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_05").decodeAllToPcm().resample(param1);
          jc.field_c[60] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_06").decodeAllToPcm().resample(param1);
          jc.field_c[61] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "larva_die_07").decodeAllToPcm().resample(param1);
          jc.field_c[62] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spitter_spit_01").decodeAllToPcm().resample(param1);
          jc.field_c[63] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spitter_spit_02").decodeAllToPcm().resample(param1);
          jc.field_c[64] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "spitter_spit_03").decodeAllToPcm().resample(param1);
          NetworkArchiveRequest.field_A[11] = VorbisSample.loadByName(InteractiveWidget.field_F, "", "barrel_hit_mg_only").decodeAllToPcm().resample(param1);
          param1 = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("HostileSpawn.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearHostileSpawnGlobals(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_K = null;
          field_C = null;
          field_B = null;
          field_E = null;
          if (param0 <= 126) {
            HostileSpawn.decodeCp1252Byte(21, (byte) 54);
          }
          field_J = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var1), "HostileSpawn.UA(" + param0 + ')');
        }
    }

    private final void loadAndPreloadMusic(int param0) {
        try {
          gj.a(20, wh.field_a, 70.0f);
          this.renderFrame((byte) -124);
          vg.field_h = MusicTrack.load(tk.field_a, "", "hostilespawntitle");
          rb.field_s = MusicTrack.load(tk.field_a, "", "hostilespawninstructions");
          ProgressMessageDialog.field_tb = MusicTrack.load(tk.field_a, "", "hostilespawnmissioncomplete");
          ProgressDialog.field_ab = MusicTrack.load(tk.field_a, "", "hostilespawngameover");
          cl.field_o = MusicTrack.load(tk.field_a, "", "Hostilespawnloop");
          bb.field_b = MusicTrack.load(tk.field_a, "", "Hostilespawnloop_planet");
          ArchiveProvider.field_d = MusicTrack.load(tk.field_a, "", "Hostilespawnloop_goo");
          bb.field_e = MusicTrack.load(tk.field_a, "", "Hostilespawnthreat");
          int var2_int = -11 % ((57 - param0) / 52);
          CipherPacketBuffer.field_u = MusicTrack.load(tk.field_a, "", "hostilespawnloop_vengeance");
          PcmOutputWorker.field_f = MusicTrack.load(tk.field_a, "", "hostilespawnthreat_vengeance");
          InteractiveWidget.field_F = null;
          ModalDialog.field_P = null;
          tk.field_a = null;
          ha.field_w.field_F.prepareTrackSamples(0, vg.field_h, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, rb.field_s, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, ProgressMessageDialog.field_tb, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, ProgressDialog.field_ab, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, cl.field_o, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, bb.field_b, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, ArchiveProvider.field_d, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, bb.field_e, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, CipherPacketBuffer.field_u, ej.field_h, nd.field_e, false);
          ha.field_w.field_F.prepareTrackSamples(0, PcmOutputWorker.field_f, ej.field_h, nd.field_e, false);
          nd.field_e = null;
          ej.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.DA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("hostilespawn", 480, 14);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.init()");
        }
    }

    final void releaseGameResources(int param0) {
        try {
          HostileSpawn.clearHostileSpawnGlobals((byte) 127);
          AchievementNotification.clearStaticReferences(-15154);
          IntrusiveDeque.clearStaticReferences(param0 + 51);
          cm.a((byte) -105);
          CrossfadingMidiPcmStream.clearDeclaredStaticReferences((byte) -13);
          r.clearStaticReferences(13496);
          em.clearStaticReferences((byte) 126);
          ga.clearStaticReferences((byte) -94);
          VolumeRampingMidiPcmStream.clearDeclaredStaticReferences((byte) -34);
          ki.clearStaticReferences(true);
          om.clearStaticReferences((byte) 122);
          eh.clearStaticReferences(true);
          ib.a(121);
          tg.clearStaticReferences(param0 ^ 111);
          NetworkGameClient.clearStaticReferences((byte) -106);
          kc.clearStaticReferences(-82);
          GameAppletShell.c((byte) 88);
          sc.clearStaticReferences(-87);
          KeyboardInput.clearStaticReferences(-69);
          MouseInput.b(-31);
          MouseWheelInput.clearStaticReferences((byte) -63);
          SoftwareRasterizer.clearStaticReferences();
          ResourceArchive.clearStaticReferences(-16199);
          gf.clearStaticReferences((byte) -105);
          il.clearStaticReferences(-91);
          PacketBuffer.g(255);
          hn.a(false);
          ie.clearStaticReferences((byte) 4);
          vg.a(param0 - 26);
          ec.clearStaticReferences(99);
          rl.clearStaticReferences(719371458);
          tc.clearStaticReferences(true);
          wh.clearStaticReferences(0);
          oa.clearStaticReferences(32);
          ln.clearStaticReferences(31311);
          nl.resetStaticState(false);
          FrameTimer.clearStaticReferences(-107);
          AwtRasterBuffer.clearStaticReferences((byte) -102);
          ja.a(26);
          FullscreenFocusCanvas.clearStaticReferences((byte) -27);
          gn.clearStaticReferences(-40);
          e.clearStaticReferences(param0 ^ 103);
          he.clearDeclaredStaticReferences(true);
          re.clearStaticReferences(83);
          cg.clearStaticReferences(false);
          mg.clearStaticReferences(-12586);
          GridPoint.clearMissionMapGlobals(-9575);
          eg.clearStaticReferences(-1);
          qh.a((byte) -66);
          bi.clearStaticReferences(true);
          PcmResampler.resetStaticState((byte) 76);
          IntrusiveNode.clearStaticReferences((byte) -50);
          ej.clearStaticReferences(-21742);
          DiskCacheWorker.clearStaticReferences(-3);
          sg.b(-106);
          BufferedRandomAccessFile.clearStaticReferences(false);
          BufferedSocket.clearStaticReferences(200);
          im.clearStaticReferences(-14986);
          lh.clearStaticReferences(-95);
          oj.clearStaticReferences((byte) 118);
          v.b(2);
          ql.resetStaticState(-3);
          we.clearStaticReferences((byte) 122);
          p.clearStaticReferences(-4676);
          qm.clearDeclaredStaticReferences(-13);
          id.clearStaticReferences((byte) 21);
          ia.clearStaticReferences((byte) -8);
          SoundCache.clearStaticReferences(1);
          og.resetStaticState((byte) -50);
          MidiPcmStream.a(false);
          jm.a(true);
          MusicPatchNode.clearStaticReferences(true);
          MidiFileReader.clearStaticReferences();
          MusicPatchPcmStream.d(-1);
          AudioOutput.clearStaticReferences();
          ch.clearStaticReferences(false);
          sa.clearStaticReferences((byte) -121);
          PcmOutputWorker.clearStaticReferences((byte) 60);
          l.clearStaticReferences((byte) -7);
          i.clearStaticReferences(true);
          ml.clearStaticReferences((byte) -67);
          s.a(false);
          pi.clearStaticReferences(param0 ^ param0);
          c.clearStaticReferences(true);
          bl.clearStaticReferences(120);
          ca.a(param0 ^ 29);
          CipherPacketBuffer.clearStaticReferences(-10723);
          jc.clearStaticReferences((byte) 89);
          uc.resetStaticState(212563556);
          kl.clearStaticReferences(126);
          fm.a((byte) -102);
          BitmapFont.clearStaticReferences();
          be.clearStaticReferences(param0 ^ 28);
          pc.b(1);
          bb.clearStaticReferences((byte) -85);
          ModalDialogHost.clearStaticReferences(false);
          AccountCreationResultPanel.resetStaticState(true);
          ProgressDialog.releaseDeclaredStaticReferences(8421504);
          StandardContentDialog.g((byte) 24);
          ProgressMessageDialog.releaseDeclaredStaticReferences(param0 ^ -285);
          AccountRegistrationPanel.l(param0 ^ 28);
          GuestPlayConfirmationForm.clearStaticReferences(82);
          LoginPanel.j(param0 + 27191);
          DisplayNameSelectionPanel.clearDeclaredStaticReferences((byte) 75);
          na.clearStaticReferences(param0 + 61);
          oh.clearStaticReferences(-32278);
          ArchiveIndex.clearStaticReferences(-17514);
          GzipDecompressor.clearStaticReferences(9992);
          ArchiveProvider.clearStaticReferences(param0 - 109);
          pb.resetDeclaredStaticState(param0 - 139);
          th.releaseDeclaredStaticReferences((byte) 16);
          fj.resetDeclaredStaticState(-24510);
          cf.a(false);
          le.resetStaticState(-3354);
          wk.clearStaticReferences(2);
          DualLinkNode.clearDeclaredStaticReferences((byte) 71);
          SpriteBase.clearExpansionTitle(-46);
          vh.clearStaticReferences(false);
          ni.clearStaticReferences(param0 ^ 107);
          SpriteGeometry.a(true);
          VorbisSample.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          SynthesizerVoice.clearStaticReferences();
          aa.clearStaticReferences((byte) -104);
          wl.clearStaticReferences(110);
          eb.b(param0 + 32);
          lc.a(param0 ^ 63);
          qg.clearStaticReferences(true);
          ih.clearDeclaredStaticReferences(param0 ^ 212);
          bh.clearStaticReferences(-4);
          NetworkArchiveRequest.b(true);
          SectorCacheStore.clearStaticReferences(255);
          DiskArchiveRequest.clearStaticReferences(param0 ^ 26);
          rb.clearStaticReferences(false);
          BoundedRandomAccessFile.clearStaticReferences(param0 - 28);
          fg.clearStaticReferences((byte) -98);
          ArchiveRequest.resetStaticState(true);
          IsaacGenerator.clearStaticReferences(true);
          uf.clearStaticReferences(24);
          pa.g(param0 ^ 107);
          an.resetDeclaredStaticState(2);
          pj.c((byte) 98);
          dd.b(true);
          ob.clearStaticReferences((byte) -127);
          vj.clearStaticReferences(param0 + 112);
          o.clearStaticReferences(43);
          pk.clearStaticReferences(param0 - 26);
          jk.clearStaticReferences(-100);
          FullscreenStatusDialog.g((byte) -115);
          DefaultTextWidgetRenderer.clearStaticReferences(param0 ^ 110);
          ge.clearStaticReferences();
          sj.clearStaticReferences((byte) 58);
          u.clearStaticReferences(true);
          pf.clearStaticReferences(true);
          wd.clearStaticReferences((byte) 69);
          ad.clearStaticReferences(-24221);
          qa.clearStaticReferences(true);
          tk.clearStaticReferences(117);
          lb.clearStaticReferences(-16182);
          cb.clearStaticReferences((byte) -122);
          GameCanvas.clearStaticReferences(119);
          mf.b(-33);
          rg.clearStaticReferences(1);
          ByteStorage.clearStaticReferences((byte) -93);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences(-665);
          ng.clearStaticReferences(10448);
          ByteArrayPoolSupport.clearStaticReferences(false);
          ve.clearStaticReferences(0);
          rf.clearStaticReferences(5592405);
          ha.clearStaticReferences(true);
          ra.clearStaticReferences(11129);
          h.clearStaticReferences((byte) 76);
          TextLayout.clearStaticReferences(param0 + 6909);
          UiWidget.d(5956);
          InteractiveWidget.clearStaticReferences(84);
          SingleChildWidgetContainer.resetStaticState(1);
          ResizableModalDialog.clearDeclaredStaticReferences(420);
          ModalDialog.clearStaticReferences(param0 ^ -1847325763);
          DequeWidgetContainer.a((byte) 75);
          fl.clearStaticReferences((byte) -52);
          dc.clearStaticReferences(256);
          hh.clearStaticReferences(-1);
          hj.clearStaticReferences(-97);
          ik.clearStaticReferences((byte) -63);
          ac.resetStaticState((byte) 44);
          dn.clearStaticReferences((byte) 16);
          ud.clearStaticReferences((byte) -120);
          rc.clearStaticReferences(param0 + 8253);
          q.a(50);
          mj.clearStaticReferences((byte) 122);
          SocketFactory.clearStaticReferences((byte) -112);
          ProxyAuthenticationRequiredException.clearStaticReferences(-128);
          NanoFrameTimer.resetStaticState((byte) -121);
          ImageProducerRasterBuffer.resetStaticState((byte) 107);
          hg.clearStaticReferences(0);
          ak.clearStaticReferences(param0 - 15701);
          ea.clearStaticReferences(0);
          bf.clearStaticReferences(2107940192);
          MidiNoteMask.a((byte) -52);
          MusicPatch.c(118);
          MusicPatchEnvelope.clearStaticReferences(true);
          j.clearStaticReferences((byte) -120);
          LabeledWidgetContainer.clearStaticReferences(0);
          TextInputField.clearTextInputFieldGlobals(10);
          EditableTextField.resetStaticState(25);
          ContentTransitionDialog.clearDeclaredStaticReferences((byte) -56);
          NameSuggestionsPanel.clearStaticReferences(-125);
          RichTextWidget.clearStaticReferences(true);
          ValidationStatusIcon.j(11460);
          ValidationStatusWidget.clearDeclaredStaticReferences((byte) 78);
          vf.clearDeclaredStaticReferences((byte) -72);
          TextFieldValidator.e(param0 - 4);
          ClientLookupTables.clearStaticReferences(true);
          RegistrationAgreementPane.j(0);
          g.clearDeclaredStaticReferences(-123);
          tb.clearDeclaredStaticReferences((byte) 83);
          SoundFilter.clearStaticReferences();
          tf.clearStaticReferences(16976);
          RichTextLayout.c(param0 + 99);
          DirectByteStorage.c((byte) 70);
          GrowableIntArray.clearStaticReferences(49);
          DraggableWidgetContainer.clearDeclaredStaticReferences((byte) -122);
          DropTargetWidgetContainer.clearDeclaredStaticReferences((byte) -55);
          nd.clearStaticReferences(30401);
          IntrusiveNodeHashTable.clearStaticReferences(-1);
          DualLinkDeque.a(-1667734544);
          lj.f(param0 - 13);
          hb.clearStaticReferences(false);
          ProxySocketFactory.b(true);
          di.a(89);
          NodeHashTableIterator.clearStaticReferences(65);
          SecondaryNodeDequeIterator.clearStaticReferences((byte) -13);
          qb.resetStaticState(false);
          mn.clearStaticReferences((byte) 111);
          cl.clearStaticReferences(-128);
          ke.clearStaticReferences(true);
          ti.a(70);
          sd.b(param0 - 822203963);
          km.clearDeclaredStaticReferences(param0 + 93);
          f.clearStaticReferences((byte) -90);
          AlphaWidgetContainer.k(608);
          ic.c(128);
          jd.resetStaticState(0);
          wi.clearStaticReferences(24074);
          vb.clearStaticReferences(17469);
          qj.clearStaticReferences(-13206);
          gj.clearStaticReferences((byte) -104);
          ri.clearStaticReferences(-1);
          hm.clearStaticReferences(5);
          uj.clearStaticReferences(param0 ^ 29);
          m.clearStaticReferences(false);
          de.a(false);
          ne.clearDeclaredStaticReferences((byte) 86);
          ii.clearStaticReferences(-111);
          ub.clearStaticReferences(90);
          DelayedPacket.clearDelayedPacketGlobals(3);
          fa.resetStaticState(false);
          uh.resetStaticState(64);
          vk.clearStaticReferences(126);
          la.clearStaticReferences((byte) -62);
          hk.clearStaticReferences(-20150);
          AccountRequestState.releaseStatics((byte) -125);
          AccountServiceResult.clearStaticReferences(47);
          DialogMessagePane.clearStaticReferences(66);
          FullscreenNoticeType.clearStaticReferences((byte) -99);
          gm.a(0);
          TextLineMetrics.clearStaticReferences((byte) -12);
          AccountNameAvailabilityValidator.clearStaticReferences((byte) -69);
          PasswordValidator.clearStaticReferences((byte) -87);
          EmailFormatValidator.clearDeclaredStaticReferences(117);
          ConfirmedEmailAvailabilityValidator.f(-1);
          AgeValidator.f(83);
          MatchingFieldValidator.clearStaticReferences((byte) -109);
          je.a(34);
          TextHotspotBounds.clearDeclaredStaticReferences((byte) 10);
          bm.clearStaticReferences(-88);
          DebouncedFieldValidator.clearStaticReferences(125);
          ll.clearStaticReferences(-125);
          this.field_G = null;
          this.field_o = null;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.PA(" + param0 + ')');
        }
    }

    private final void initializeCustomCursorSupport(byte param0) {
        try {
          Class var3 = null;
          Class var2 = java.awt.Toolkit.class;
          try {
            VolumeRampingMidiPcmStream.field_eb = var2.getMethod("createCustomCursor", new Class[]{java.awt.Image.class, java.awt.Point.class, String.class});
            var3 = Class.forName("java.awt.image.BufferedImage");
            DropTargetWidgetContainer.field_F = var3.getConstructor(new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            le.field_eb = var3.getField("TYPE_INT_ARGB").getInt((Object) null);
            aa.field_e = var3.getMethod("setRGB", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE, Integer.TYPE});
          } catch (IllegalAccessException illegalAccessException) {
            VolumeRampingMidiPcmStream.field_eb = null;
            return;
          } catch (ClassNotFoundException classNotFoundException) {
            VolumeRampingMidiPcmStream.field_eb = null;
            return;
          } catch (NoSuchMethodException noSuchMethodException) {
            VolumeRampingMidiPcmStream.field_eb = null;
            return;
          } catch (NoSuchFieldException noSuchFieldException) {
            VolumeRampingMidiPcmStream.field_eb = null;
            return;
          }
          try {
            if (param0 >= -30) {
              field_K = (int[]) null;
            }
          } catch (RuntimeException runtimeException) {
            throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.U(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void loadEnemyAnimationSprites(int param0) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[][] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RgbSprite[][][] var2 = null;
        RuntimeException var2_ref = null;
        RgbSprite[][][] var3 = null;
        RgbSprite[] var3_array = null;
        int var4 = 0;
        RgbSprite[][] var5 = null;
        int var6 = 0;
        var6 = field_I ? 1 : 0;
        try {
          DequeWidgetContainer.field_y = new RgbSprite[7][];
          re.field_D = new RgbSprite[7][];
          ClientLookupTables.field_c = new RgbSprite[7][];
          cb.field_g = new RgbSprite[7][];
          ArchiveIndex.field_f = new RgbSprite[7][];
          Bzip2State.field_y = new RgbSprite[7][];
          lb.field_a = new RgbSprite[7][];
          pa.field_i = new RgbSprite[7][];
          bf.field_f = new RgbSprite[7][];
          kl.field_b = new RgbSprite[7][];
          FullscreenStatusDialog.field_eb = new RgbSprite[7][];
          pa.field_i[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor(param0, 76), "", "spawn_guard_attack");
          pa.field_i[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 92, "", "spawn_guard_death");
          pa.field_i[0] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 122, "", "spawn_guard_idle");
          if (param0 != 39) {
            return;
          }
          pa.field_i[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 + 86, "", "spawn_guard_walk");
          bf.field_f[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 115, "", "spawn_dormant_death");
          bf.field_f[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 124, "", "spawn_dormant_walk");
          bf.field_f[5] = bf.field_f[1];
          bf.field_f[0] = bf.field_f[1];
          bf.field_f[4] = bf.field_f[1];
          re.field_D[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 102, "", "spawn_queen_attack");
          re.field_D[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor(param0, 87), "", "spawn_queen_death");
          re.field_D[0] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 91, "", "spawn_queen_idle");
          re.field_D[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor(param0, 67), "", "spawn_queen_walk");
          kl.field_b[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 102, "", "spawn_runner_attack");
          kl.field_b[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 102, "", "spawn_runner_death");
          kl.field_b[0] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 + 69, "", "spawn_runner_idle");
          kl.field_b[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 125, "", "spawn_runner_walk");
          lb.field_a[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor(param0, 74), "", "spawn_spitter_attack");
          lb.field_a[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 93, "", "spawn_spitter_death");
          lb.field_a[0] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 117, "", "spawn_spitter_idle");
          lb.field_a[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 126, "", "spawn_spitter_walk");
          ArchiveIndex.field_f[4] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 119, "", "spawn_praetorian_attack");
          ArchiveIndex.field_f[5] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, param0 + 74, "", "spawn_praetorian_death");
          ArchiveIndex.field_f[0] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, bm.bitwiseXor(param0, 70), "", "spawn_praetorian_idle");
          ArchiveIndex.field_f[1] = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 93, "", "spawn_praetorian_walk");
          var2 = new RgbSprite[][][]{ClientLookupTables.field_c, pa.field_i, bf.field_f, re.field_D, kl.field_b, lb.field_a, cb.field_g, DequeWidgetContainer.field_y, ArchiveIndex.field_f};
          var3 = var2;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            var5 = var3[var4];
            stackIn_10_0 = var5;
            stackIn_10_1 = 2;
            if (var6 == 0) {
              dupTemp$0 = var5[1];
              var5[3] = dupTemp$0;
              stackIn_10_0[stackIn_10_1] = dupTemp$0;
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = lb.field_a;
            stackIn_10_1 = 0;
          }
          var3_array = new RgbSprite[stackIn_10_0[stackIn_10_1].length + lb.field_a[4].length];
          ArrayBlockSupport.copyObjectRange(lb.field_a[4], 0, var3_array, 0, lb.field_a[4].length);
          ArrayBlockSupport.copyObjectRange(lb.field_a[0], 0, var3_array, lb.field_a[4].length, lb.field_a[0].length);
          lb.field_a[4] = var3_array;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.IA(" + param0 + ')');
        }
    }

    private final void loadOriginalCampaignLevels(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = field_I ? 1 : 0;
        try {
          GridPoint.field_h[0][3] = bi.field_h.getFileByName("level01-new.dat", "", 0);
          GridPoint.field_h[0][4] = bi.field_h.getFileByName("level02-new.dat", "", 0);
          GridPoint.field_h[0][5] = bi.field_h.getFileByName("level03-new.dat", "", param0 + 0);
          GridPoint.field_h[0][6] = bi.field_h.getFileByName("level04-new.dat", "", 0);
          GridPoint.field_h[0][7] = bi.field_h.getFileByName("level05-new.dat", "", 0);
          GridPoint.field_h[0][8] = bi.field_h.getFileByName("level06-new.dat", "", 0);
          GridPoint.field_h[0][9] = bi.field_h.getFileByName("level07-new.dat", "", 0);
          GridPoint.field_h[0][0] = bi.field_h.getFileByName("levelf1-new.dat", "", param0);
          GridPoint.field_h[0][1] = bi.field_h.getFileByName("levelf2-new.dat", "", 0);
          GridPoint.field_h[0][2] = bi.field_h.getFileByName("levelf3-new.dat", "", bm.bitwiseXor(param0, 0));
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 10))) {
            stackIn_12_0 = null;
            if (var3 == 0) {
              if (stackIn_12_0 == GridPoint.field_h[0][var2_int]) {
                System.err.println("Error loading leveldata for kerrus[" + var2_int + "]");
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_12_0 = null;
          }
          bi.field_h = (ResourceArchive) (stackIn_12_0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.AA(" + param0 + ')');
        }
    }

    final void updateGameTick(byte param0) {
        boolean discarded$0 = false;
        boolean stackIn_18_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        m var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        hm var3 = null;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = field_I ? 1 : 0;
        try {
          em.field_c = em.field_c + 1;
          q.b(14470);
          if (null != RichTextLayout.field_s) {
            RichTextLayout.field_s.b(param0 ^ 53);
          }
          if (param0 != -35) {
            this.prepareGameShutdown(-72);
          }
          if (wh.field_f &&
            !ha.field_w.a(ProgressMessageDialog.field_tb, 105)) {
            sj.b(true);
            wh.field_f = false;
          }
          stackIn_18_1 = (null != ImageProducerRasterBuffer.field_q);
          this.serviceFramework(stackIn_18_1, param0 + 9803);
          if (ri.field_m) {
            cf.d(-112);
            ri.field_m = false;
          }
          if (null != ImageProducerRasterBuffer.field_q &&
            ImageProducerRasterBuffer.field_q.focusLost) {
            BufferedSocket.c((byte) 113);
            v.a(-112, ImageProducerRasterBuffer.field_q);
            ImageProducerRasterBuffer.field_q.exitFullscreen(true, gf.field_b);
            ImageProducerRasterBuffer.field_q = null;
            GameAppletShell.field_h.requestFocus();
          }
          if (!cm.b((byte) -97)) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted2 = true;
            if (!ModalDialog.field_N) {
              discarded$0 = this.advanceGameAssetLoading(4);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if ((null != sg.field_j) &&
                (decompiledFrameRemainder0 = !(!sg.field_j.field_l))) {
                var2_int = sg.field_j.field_j.length;
                var3_int = 0;
                scanLoop1: while (true) {
                  if (var2_int > var3_int) {
                    pb.field_Ob[var3_int] = sg.field_j.field_j[var3_int];
                    ArchiveProvider.field_c[var3_int] = ll.bitwiseOr(ArchiveProvider.field_c[var3_int], pb.field_Ob[var3_int]);
                    var3_int++;
                    if (var4 == 0) {
                      continue;
                    }
                  } else {
                    if (!hb.a(18, pb.field_Ob, false)) {
                      break scanLoop1;
                    }
                  }
                  bh.field_g[18] = vg.a(new String[]{il.field_b[18]}, 91, TextInputField.field_Y);
                  break;
                }
                sg.field_j = null;
                MouseWheelInput.b((byte) -43);
                var3 = (hm) (IntrusiveDeque.field_c.beginForward(param0 - 68));
                while (var3 != null) {
                  FullscreenStatusDialog.a(125, 4, var3);
                  var3 = (hm) (IntrusiveDeque.field_c.nextForward(12684));
                  if (var4 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted2) {
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted2)) {
                if (ProxySocketFactory.field_h[0] != null) {
                  this.consumeScoreLookupResult((byte) 113, 0);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (ProxySocketFactory.field_h[1] == null) {
                    if (LabeledWidgetContainer.field_L != null) {
                      if (LabeledWidgetContainer.field_L.field_j) {
                        LabeledWidgetContainer.field_L = null;
                        if (var4 != 0) {
                          this.updateGameOverlays((byte) 76);
                          this.consumeScoreLookupResult((byte) 113, 1);
                        }
                      }
                    } else {
                      this.updateGameOverlays((byte) 76);
                      if (var4 != 0) {
                        this.consumeScoreLookupResult((byte) 113, 1);
                      }
                    }
                  } else {
                    this.consumeScoreLookupResult((byte) 113, 1);
                  }
                }
              }
            }
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (!StandardContentDialog.p(3)) {
              while (true) {
                var2 = (m) (MusicPatchNode.field_o.removeFirst(18120));
                if (null == var2) {
                  break;
                }
                g.a(var2, 6, -7347);
                if (var4 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              while (wd.a(23278, ng.field_l)) {
                this.dispatchCommonPacket((byte) 126);
                if (var4 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                RichTextLayout.d(0, -22370);
              }
            }
            if (!EditableTextField.c(false)) {
              return;
            }
            var2_intLifetime1 = this.attemptReconnect((byte) -75);
            if (var2_intLifetime1 == 0 ||
              var2_intLifetime1 == 1) {
              FullscreenStatusDialog.b(2, -107);
              qj.a((byte) -21, 3);
              vh.a((byte) 113, 4);
              og.a(-22248, 5);
              jd.a(6, 65535);
            }
            if (var2_intLifetime1 == 2) {
              cf.b(true);
            }
            if (var4 == 0) {
              return;
            }
          }
          this.updateLoginFlow(-12752);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.HA(" + param0 + ')');
        }
    }

    final static char decodeCp1252Byte(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        try {
          if (param0 != 3) {
            field_F = false;
          }
          var2_int = 255 & param1;
          if (0 == var2_int) {
            throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
          }
          if (128 <= var2_int &&
            var2_int < 160) {
            var3 = VolumeRampingMidiPcmStream.field_hb[-128 + var2_int];
            if (var3 == 0) {
              var3 = 63;
            }
            var2_int = var3;
          }
          stackIn_18_0 = (char)var2_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2), "HostileSpawn.SA(" + param0 + ',' + param1 + ')');
        }
    }

    public HostileSpawn() {
        this.field_D = 0;
        try {
          ni.field_g = (java.applet.Applet) (this);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.<init>()");
        }
    }

    private final boolean advanceGameAssetLoading(int param0) {
        Throwable decompiledCaughtException = null;
        NullPointerException var2 = null;
        int var2_int = 0;
        PcmResampler var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = field_I ? 1 : 0;
        try {
          sc.a((byte) 118);
          try {
            ml.a((byte) 112, ll.field_c);
          } catch (java.lang.NullPointerException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NullPointerException) (Object) decompiledCaughtException;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted4 = true;
          if (TextHotspotBounds.field_m == null) {
            TextHotspotBounds.field_m = new oj[3000];
            var2_int = 0;
            while (var2_int < 3000) {
              TextHotspotBounds.field_m[var2_int] = new oj();
              var2_int++;
              if (var3 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted4) &&
            (null == re.field_n)) {
            re.field_n = new oj[3000];
            var2_int = 0;
            while (3000 > var2_int) {
              re.field_n[var2_int] = new oj();
              var2_int++;
              if (var3 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (vj.field_w == null)) {
            vj.field_w = new qm[3000];
            var2_int = 0;
            while (3000 > var2_int) {
              vj.field_w[var2_int] = new qm();
              var2_int++;
              if (var3 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (null == AlphaWidgetContainer.field_F)) {
            AlphaWidgetContainer.field_F = new p[8000];
            var2_intLifetime2 = 0;
            while (var2_intLifetime2 < 8000) {
              AlphaWidgetContainer.field_F[var2_intLifetime2] = new p();
              var2_intLifetime2++;
              if (var3 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (wh.field_b == null)) {
            wh.field_b = new p[1000];
            var2_intLifetime1 = 0;
            while (var2_intLifetime1 < 1000) {
              wh.field_b[var2_intLifetime1] = new p();
              var2_intLifetime1++;
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (param0 != 4)) {
            return false;
          }
          if (null == ModalDialog.field_P) {
            if (DequeWidgetContainer.field_C != null) {
              this.loadGameplaySprites((byte) -113);
              return false;
            }
            if (null != he.field_t) {
              this.loadFloorAndBackgroundTextures(-4);
              return false;
            }
            if (null != bi.field_h) {
              this.loadOriginalCampaignLevels(param0 - 4);
              return false;
            }
            if (ResizableModalDialog.field_S > 0 &&
              null != IsaacGenerator.field_h) {
              this.loadVengeanceCampaignLevels(28974);
              return false;
            }
            MatchingFieldValidator.a(50, param0 ^ 3);
            DisplayNameSelectionPanel.a((byte) -17, vg.field_h);
            IntrusiveNode.field_d = this;
            this.configureInterfaceThemeAndCursor(300);
            ClientLookupTables.field_h = new re(true);
            if (!StandardContentDialog.p(3)) {
              sg.field_j = wk.a(4, -2178);
              ClientLookupTables.field_h.f(-121);
            }
            ModalDialog.field_N = true;
            ql.f(8036);
            return true;
          }
          if (ModalDialog.field_P.ensureIndexLoaded(-15879) &&
            ModalDialog.field_P.tryLoadAllGroups(param0 ^ 4)) {
            if (InteractiveWidget.field_F.ensureIndexLoaded(param0 - 15883) &&
              InteractiveWidget.field_F.tryLoadAllGroups(0)) {
              if (ej.field_h.ensureIndexLoaded(-15879) &&
                ej.field_h.tryLoadAllGroups(0)) {
                if (tk.field_a.ensureIndexLoaded(param0 ^ -15875) &&
                  tk.field_a.tryLoadAllGroups(0)) {
                  if (DequeWidgetContainer.field_C.ensureIndexLoaded(-15879) &&
                    DequeWidgetContainer.field_C.tryLoadAllGroups(param0 ^ 4)) {
                    if (bi.field_h.ensureIndexLoaded(param0 ^ -15875) &&
                      bi.field_h.tryLoadAllGroups(param0 ^ 4)) {
                      if (IsaacGenerator.field_h.ensureIndexLoaded(-15879) &&
                        IsaacGenerator.field_h.tryLoadAllGroups(0)) {
                        if (null != wd.field_a && (!wd.field_a.ensureIndexLoaded(param0 ^ -15875) ||
                          !wd.field_a.tryLoadGroupByName(-8088, "basic"))) {
                          gj.a(param0 ^ 16, s.a(wd.field_a, "basic", 47, cl.field_h, lj.field_r), 40.0f);
                          return false;
                        }
                        if (he.field_t.ensureIndexLoaded(-15879) &&
                          he.field_t.tryLoadAllGroups(0)) {
                          if (RegistrationAgreementPane.field_J != null && (!RegistrationAgreementPane.field_J.ensureIndexLoaded(-15879) ||
                            !RegistrationAgreementPane.field_J.tryLoadAllGroups(param0 ^ 4))) {
                            gj.a(param0 ^ 16, DirectByteStorage.a(FrameTimer.field_a, RegistrationAgreementPane.field_J, cf.field_r, (byte) -58), 50.0f);
                            return false;
                          }
                          if (wd.field_a.ensureIndexLoaded(param0 - 15883) &&
                            wd.field_a.tryLoadGroupByName(-8088, "basicfont12")) {
                            if (ResourceArchive.field_a.ensureIndexLoaded(-15879) &&
                              ResourceArchive.field_a.tryLoadGroupByName(param0 ^ -8084, "basicfont12")) {
                              if (wd.field_a.ensureIndexLoaded(-15879) &&
                                wd.field_a.tryLoadGroupByName(param0 - 8092, "kartika13")) {
                                if (ResourceArchive.field_a.ensureIndexLoaded(-15879) &&
                                  ResourceArchive.field_a.tryLoadGroupByName(-8088, "kartika13")) {
                                  MouseWheelInput.b((byte) -43);
                                  u.field_e = u.field_e - MidiPcmStream.field_r;
                                  MidiPcmStream.field_r = 0;
                                  hg.field_e = 0;
                                  var2_ref = this.loadBaseSoundEffects(-96);
                                  this.loadAdditionalSoundEffects(22, var2_ref);
                                  this.loadAndPreloadMusic(111);
                                  return false;
                                }
                                gj.a(param0 + 16, s.a(ResourceArchive.field_a, "kartika13", 84, cf.field_r, FrameTimer.field_a), 17.0f);
                                return false;
                              }
                              gj.a(20, s.a(wd.field_a, "kartika13", 113, cl.field_h, lj.field_r), 11.0f);
                              return false;
                            }
                            gj.a(20, s.a(ResourceArchive.field_a, "basicfont12", 125, cf.field_r, FrameTimer.field_a), 15.0f);
                            return false;
                          }
                          gj.a(20, s.a(wd.field_a, "basicfont12", param0 ^ 57, cl.field_h, lj.field_r), 14.0f);
                          return false;
                        }
                        gj.a(20, s.a(tk.field_a, "", 66, cl.field_h, lj.field_r), 80.0f);
                        return false;
                      }
                      gj.a(20, DirectByteStorage.a(MouseInput.field_f, IsaacGenerator.field_h, ProgressMessageDialog.field_rb, (byte) -82), 35.0f);
                      return false;
                    }
                    gj.a(param0 ^ 16, DirectByteStorage.a(MouseInput.field_f, bi.field_h, ProgressMessageDialog.field_rb, (byte) 68), 30.0f);
                    return false;
                  }
                  gj.a(20, DirectByteStorage.a(lj.field_r, DequeWidgetContainer.field_C, cl.field_h, (byte) -88), 25.0f);
                  return false;
                }
                gj.a(param0 ^ 16, DirectByteStorage.a(GzipDecompressor.field_i, tk.field_a, SoundCache.field_g, (byte) 79), 20.0f);
                return false;
              }
              gj.a(20, DirectByteStorage.a(GzipDecompressor.field_i, ej.field_h, SoundCache.field_g, (byte) 102), 15.0f);
              return false;
            }
            gj.a(param0 ^ 16, DirectByteStorage.a(sd.field_v, InteractiveWidget.field_F, hn.field_c, (byte) 84), 10.0f);
            return false;
          }
          gj.a(20, DirectByteStorage.a(sd.field_v, ModalDialog.field_P, hn.field_c, (byte) -112), 5.0f);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref2), "HostileSpawn.VA(" + param0 + ')');
        }
    }

    private final void consumeScoreLookupResult(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (ProxySocketFactory.field_h[param1].field_j) {
            if (ProxySocketFactory.field_h[param1].field_h[0] > gn.field_k[param1]) {
              gn.field_k[param1] = ProxySocketFactory.field_h[param1].field_h[0];
            }
            ProxySocketFactory.field_h[param1] = null;
          }
          ClientLookupTables.field_h.field_E = null;
          if (param0 != 113) {
            field_C = (RgbSprite) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var3), "HostileSpawn.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawAchievementNotification(int param0) {
        PcmResampler discarded$1 = null;
        AchievementNotification var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = field_I ? 1 : 0;
        try {
          if (param0 >= -113) {
            discarded$1 = this.loadBaseSoundEffects(-36);
          }
          var2 = (AchievementNotification) (ac.field_i.beginForward(-54));
          if (null != var2) {
            var4 = this.field_D;
            if (80 <= var4) {
              if (var4 < 230) {
                var3 = 8;
                if (var5 != 0) {
                  var3 = -(var4 / 2) + 123;
                  var3 = var4 / 2 - 32;
                }
              } else {
                var3 = -(var4 / 2) + 123;
                if (var5 != 0) {
                  var3 = var4 / 2 - 32;
                }
              }
            } else {
              var3 = var4 / 2 - 32;
            }
            fj.field_Kb[var2.field_h].drawQuarterSizeAveraged(8, var3);
            ValidationStatusWidget.field_Z.drawString(il.field_b[var2.field_h], 48, id.field_A.field_y + var3, 65280, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.OA(" + param0 + ')');
        }
    }

    final void renderFrame(byte param0) {
        Object stackIn_5_0 = null;
        boolean stackIn_12_0 = false;
        Object stackIn_12_1 = null;
        boolean stackIn_15_2 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_I ? 1 : 0;
        try {
          if (ImageProducerRasterBuffer.field_q == null) {
            stackIn_5_0 = GameAppletShell.field_h;
          } else {
            stackIn_5_0 = ImageProducerRasterBuffer.field_q;
          }
          var2 = stackIn_5_0;
          if (cm.b((byte) -97)) {
            stackIn_12_0 = false;
            stackIn_12_1 = var2;
            stackIn_15_2 = (ImageProducerRasterBuffer.field_q != null) || (PcmResampler.field_a);
            ResourceArchive.drawLoadingFrame(stackIn_12_0, (java.awt.Canvas) (stackIn_12_1), stackIn_15_2);
            return;
          }
          if (!ModalDialog.field_N) {
            ad.a((java.awt.Canvas) (var2), false);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != DelayedPacket.field_o) {
            SoftwareRasterizer.clearRaster();
            DelayedPacket.field_o.a(104);
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != ClientLookupTables.field_h) {
              ContentTransitionDialog.b(108, 0);
              ClientLookupTables.field_h.h(26);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = (null == this.field_G);
              if (!decompiledSharedTail0) {
                this.field_G.b((byte) -99);
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                var3 = 1;
                if (0 <= ri.field_h) {
                  var3 = 0;
                  if (var4 != 0 &&
                    ByteArrayPoolSupport.field_i >= 0) {
                    var3 = 2;
                  }
                } else {
                  if (ByteArrayPoolSupport.field_i >= 0) {
                    var3 = 2;
                  }
                }
                ContentTransitionDialog.b(105, var3);
                SoundCache.a(false);
              }
            }
          }
          this.drawFrameOverlaysAndPresent((java.awt.Canvas) (var2), 67);
          if (param0 > -34) {
            this.loadFloorAndBackgroundTextures(112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.MA(" + param0 + ')');
        }
    }

    private final void loadFloorAndBackgroundTextures(int param0) {
        RgbSprite[][] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RgbSprite[][] var2Lifetime1;
        int var3Lifetime1;
        var4 = field_I ? 1 : 0;
        try {
          uf.field_i[4] = new RgbSprite(he.field_t.getFileByName("starfield.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h));
          var2 = new RgbSprite[8][];
          var2[0] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_1.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          var2[1] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_2.jpg", "", param0 + 4), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          var2[2] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_3.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          var2[3] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_4.jpg", "", bm.bitwiseXor(param0, param0)), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          var2[5] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_6.jpg", "", param0 + 4), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          var2[6] = gl.a(new RgbSprite(he.field_t.getFileByName("floors_7.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h)), 20, 8);
          pk.field_d = new RgbSprite[1280];
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 8))) {
            stackIn_11_0 = var2;
            if (var4 == 0) {
              if (stackIn_11_0[var3] != null) {
                ArrayBlockSupport.copyObjectRange(var2[var3], 0, pk.field_d, var3 * 160, 160);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = (RgbSprite[][]) null;
          }
          var2Lifetime1 = stackIn_11_0;
          ri.field_p = new RgbSprite(he.field_t.getFileByName("bg.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h));
          hk.field_h = new RgbSprite(he.field_t.getFileByName("hs_logo.jpg", "", 0), (java.awt.Component) ((Object) GameAppletShell.field_h));
          var3Lifetime1 = 0;
          while (hk.field_h.field_D.length > var3Lifetime1) {
            if (var4 != 0) {
              return;
            }
            if ((255 & hk.field_h.field_D[var3Lifetime1] >> 16) < 10) {
              hk.field_h.field_D[var3Lifetime1] = 0;
            }
            var3Lifetime1++;
          }
          o.field_n.setAsRasterTarget((byte) 125);
          he.field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2_ref), "HostileSpawn.V(" + param0 + ')');
        }
    }

    private final void loadVengeanceCampaignLevels(int param0) {
        try {
          GridPoint.field_h[1][0] = IsaacGenerator.field_h.getFileByName("level_01.dat", "", 0);
          GridPoint.field_h[1][1] = IsaacGenerator.field_h.getFileByName("level_02.dat", "", bm.bitwiseXor(param0, 28974));
          GridPoint.field_h[1][2] = IsaacGenerator.field_h.getFileByName("level_03.dat", "", bm.bitwiseXor(param0, 28974));
          GridPoint.field_h[1][3] = IsaacGenerator.field_h.getFileByName("level_04.dat", "", bm.bitwiseXor(param0, param0));
          GridPoint.field_h[1][4] = IsaacGenerator.field_h.getFileByName("level_05.dat", "", param0 - 28974);
          GridPoint.field_h[1][5] = IsaacGenerator.field_h.getFileByName("level_06.dat", "", param0 - 28974);
          GridPoint.field_h[1][6] = IsaacGenerator.field_h.getFileByName("level_07.dat", "", 0);
          GridPoint.field_h[1][7] = IsaacGenerator.field_h.getFileByName("level_08.dat", "", 0);
          GridPoint.field_h[1][8] = IsaacGenerator.field_h.getFileByName("level_09.dat", "", 0);
          GridPoint.field_h[1][9] = IsaacGenerator.field_h.getFileByName("level_10.dat", "", 0);
          IsaacGenerator.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.JA(" + param0 + ')');
        }
    }

    private final void updateGameOverlays(byte param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_27_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        try {
          q.field_n = q.field_n + j.field_c;
          FrameTimer.field_b = FrameTimer.field_b - j.field_c;
          if (EditableTextField.field_L != 0) {
            NanoFrameTimer.field_m = NanoFrameTimer.field_m + 1;
            q.field_n = q.field_n + fa.field_a;
            FrameTimer.field_b = FrameTimer.field_b - pf.field_o * NanoFrameTimer.field_m;
            fa.field_a = fa.field_a - pf.field_o;
          }
          if (m.field_l) {
            ClientLookupTables.field_h.f(param0 ^ -35);
            DefaultTextWidgetRenderer.a(false, (byte) 99);
            m.field_l = false;
          }
          if (jk.a(-23322)) {
            var2_int = lj.d(-83);
            if (var2_int == 2 &&
              ImageProducerRasterBuffer.field_q != null) {
              v.a(15, ImageProducerRasterBuffer.field_q);
              ImageProducerRasterBuffer.field_q.exitFullscreen(true, gf.field_b);
              ImageProducerRasterBuffer.field_q = null;
              GameAppletShell.field_h.requestFocus();
            }
            if (var2_int == 3) {
              LabeledWidgetContainer.a(true, (byte) -90);
            }
            if (var2_int == 4) {
              m.field_l = true;
              DropTargetWidgetContainer.k(0);
            }
            return;
          }
          if (pf.a(param0 - 202)) {
            stackIn_27_1 = (ImageProducerRasterBuffer.field_q != null);
            var2_intLifetime1 = this.pollAccountUiActions(stackIn_27_1, param0 - 77);
            if (var2_intLifetime1 != 1) {
              if (var2_intLifetime1 != 2) {
                return;
              }
              if (ImageProducerRasterBuffer.field_q != null) {
                v.a(15, ImageProducerRasterBuffer.field_q);
                ImageProducerRasterBuffer.field_q.exitFullscreen(true, gf.field_b);
                ImageProducerRasterBuffer.field_q = null;
                GameAppletShell.field_h.requestFocus();
              }
              dc.a(param0 - 1, BufferedRandomAccessFile.c(-1));
              if (!field_I) {
                return;
              }
            }
            if (null != ImageProducerRasterBuffer.field_q) {
              v.a(param0 - 38, ImageProducerRasterBuffer.field_q);
              ImageProducerRasterBuffer.field_q.exitFullscreen(true, gf.field_b);
              ImageProducerRasterBuffer.field_q = null;
              GameAppletShell.field_h.requestFocus();
            }
            return;
          }
          if (null != DelayedPacket.field_o) {
            DelayedPacket.field_o.a((byte) -114);
            if (0 != pf.field_o) {
              DelayedPacket.field_o.d(param0 ^ -816);
            }
            if (DelayedPacket.field_o.b((byte) -66)) {
              DelayedPacket.field_o = null;
            }
            return;
          }
          if (param0 != 76) {
            field_K = (int[]) null;
          }
          if (null != ac.field_i.beginForward(-103)) {
            fieldTemp$0 = this.field_D + 1;
            this.field_D = this.field_D + 1;
            if (fieldTemp$0 == 335) {
              this.field_D = 0;
              ac.field_i.removeFirst(18120);
            }
          }
          ca.field_c = ca.field_c + 10;
          if (0 < this.field_H) {
            this.field_H = this.field_H - 1;
          }
          if (ca.field_c > 512) {
            ca.field_c = 0;
          }
          if (ImageProducerRasterBuffer.field_q != null &&
            ImageProducerRasterBuffer.field_q.focusLost) {
            BufferedSocket.c((byte) 110);
            v.a(29, ImageProducerRasterBuffer.field_q);
            ImageProducerRasterBuffer.field_q.exitFullscreen(true, gf.field_b);
            ImageProducerRasterBuffer.field_q = null;
            GameAppletShell.field_h.requestFocus();
          }
          if (ClientLookupTables.field_h != null) {
            cg.a(-27587);
            RichTextLayout.field_s.b(0, (byte) 95);
            return;
          }
          if (null != this.field_G) {
            this.field_G.b(32);
            return;
          }
          ValidationStatusIcon.a((byte) -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var2), "HostileSpawn.BA(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        VolumeRampingMidiPcmStream var3 = null;
        VolumeRampingMidiPcmStream var4 = null;
        VolumeRampingMidiPcmStream var5 = null;
        CrossfadingMidiPcmStream var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.initializeFramework(9, false, 11, 23, 0, false, 13, 10);
          eh.field_c = new PcmStreamMixer();
          var2 = new MidiPcmStream();
          var2.setChannelProgram(param0 + 4325, 128, 9);
          var3 = new VolumeRampingMidiPcmStream();
          var4 = new VolumeRampingMidiPcmStream(var3);
          var5 = new VolumeRampingMidiPcmStream(var3);
          var6 = new CrossfadingMidiPcmStream(var3, var4, var5);
          RichTextLayout.field_s = new he(var5);
          SpriteBase.initializeAudioOutput(var6, -25127, 22050, (java.awt.Component) ((Object) GameAppletShell.field_h), true, gf.field_b);
          if (param0 != -4323) {
            this.configureInterfaceThemeAndCursor(-15);
          }
          CrossfadingMidiPcmStream.field_v = new ReverbPcmStream(eh.field_c);
          CrossfadingMidiPcmStream.field_v.f(0.5f);
          CrossfadingMidiPcmStream.field_v.b(0.699999988079071f);
          CrossfadingMidiPcmStream.field_v.e(30.0f);
          CrossfadingMidiPcmStream.field_v.setWetGain(0.4000000059604645f);
          CrossfadingMidiPcmStream.field_v.a(0.6000000238418579f);
          CrossfadingMidiPcmStream.field_v.setStereoWidth(0.30000001192092896f);
          eb.field_e.setRootStream(CrossfadingMidiPcmStream.field_v);
          ValidationStatusIcon.field_O = ValidationStatusIcon.field_O / 4;
          uj.field_p = new GridPoint();
          this.a(true, (byte) 44, true, true, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.GA(" + param0 + ')');
        }
    }

    final static void openSubscriptionPage(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          if (param1 > -18) {
            HostileSpawn.decodeCp1252Byte(-115, (byte) 85);
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
            param0.getAppletContext().showDocument(ByteStorage.a(param0, true, var2), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void drawFrameOverlaysAndPresent(java.awt.Canvas param0, int param1) {
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          this.drawAchievementNotification(param1 ^ -59);
          if (!jk.a(param1 - 23389)) {
            if (pf.a(param1 - 178)) {
              stackIn_10_0 = (ImageProducerRasterBuffer.field_q != null);
              TextFieldValidator.a(stackIn_10_0, (byte) 127);
              if (field_I) {
                SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
                var3_int = -8 + (320 - NetworkArchiveRequest.e(0) / 2 - 8);
                var4 = -8 + (240 - ti.a((byte) -1) / 2) - 8;
                var5 = 16 + NetworkArchiveRequest.e(param1 ^ 67) + 16;
                var6 = 16 + (ti.a((byte) -1) + 16);
                SoftwareRasterizer.fillRectangle(var3_int - 8, -8 + var4, var5 + 16, var6 + 16, 0);
                wh.b(param1 + 44);
              }
            }
          } else {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
            var3_int = -8 + (320 - NetworkArchiveRequest.e(0) / 2 - 8);
            var4 = -8 + (240 - ti.a((byte) -1) / 2) - 8;
            var5 = 16 + NetworkArchiveRequest.e(param1 ^ 67) + 16;
            var6 = 16 + (ti.a((byte) -1) + 16);
            SoftwareRasterizer.fillRectangle(var3_int - 8, -8 + var4, var5 + 16, var6 + 16, 0);
            wh.b(param1 + 44);
          }
          if (param1 != 67) {
            this.field_D = 109;
          }
          DualLinkDeque.a(0, param0, (byte) 97, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("HostileSpawn.QA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void loadScenerySprites(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_I ? 1 : 0;
        try {
          CrossfadingMidiPcmStream.field_y = MouseInput.a("", 127, "Scenery_1", DequeWidgetContainer.field_C);
          c.field_f = DelayedPacket.loadNamedRgbSprites(DequeWidgetContainer.field_C, 97, "", "Scenery_2");
          jd.field_h = fg.a("", "Scenery_3", DequeWidgetContainer.field_C, false);
          om.field_c = fg.a("", "Scenery_4", DequeWidgetContainer.field_C, false);
          ih.field_v = fg.a("", "Scenery_5", DequeWidgetContainer.field_C, false);
          ValidationStatusIcon.field_L = fg.a("", "Scenery_6", DequeWidgetContainer.field_C, false);
          GridPoint.field_d = fg.a("", "Scenery_7", DequeWidgetContainer.field_C, false);
          hg.field_a = fg.a("", "Scenery_8", DequeWidgetContainer.field_C, false);
          f.field_b = MouseInput.a("", -76, "Scenery_9", DequeWidgetContainer.field_C);
          og.field_d = fg.a("", "Scenery_10", DequeWidgetContainer.field_C, false);
          r.field_e = fg.a("", "Scenery_11", DequeWidgetContainer.field_C, false);
          r.field_b = fg.a("", "Scenery_12", DequeWidgetContainer.field_C, false);
          NodeHashTableIterator.field_g = MouseInput.a("", -74, "Scenery_13", DequeWidgetContainer.field_C);
          SoundCache.field_a = fg.a("", "Scenery_14", DequeWidgetContainer.field_C, false);
          ng.field_v = fg.a("", "Scenery_15", DequeWidgetContainer.field_C, false);
          re.field_q = fg.a("", "Scenery_16", DequeWidgetContainer.field_C, false);
          ByteArrayPoolSupport.field_b = fg.a("", "Scenery_17", DequeWidgetContainer.field_C, false);
          qj.field_l = fg.a("", "Scenery_18", DequeWidgetContainer.field_C, false);
          DebouncedFieldValidator.field_j = fg.a("", "Scenery_19", DequeWidgetContainer.field_C, false);
          eh.field_b = fg.a("", "Scenery_20", DequeWidgetContainer.field_C, false);
          lc.field_a = fg.a("", "computer_console1_e_tga", DequeWidgetContainer.field_C, false);
          bi.field_b = fg.a("", "computer_console1_n_tga", DequeWidgetContainer.field_C, false);
          cl.field_j = fg.a("", "computer_console1_s_tga", DequeWidgetContainer.field_C, false);
          de.field_o = fg.a("", "computer_console1_w_tga", DequeWidgetContainer.field_C, false);
          an.field_j = fg.a("", "computer_console2_e_tga", DequeWidgetContainer.field_C, false);
          IsaacGenerator.field_f = fg.a("", "computer_console2_n_tga", DequeWidgetContainer.field_C, false);
          an.field_l = fg.a("", "computer_console2_s_tga", DequeWidgetContainer.field_C, false);
          PacketBuffer.field_j = fg.a("", "computer_console2_w_tga", DequeWidgetContainer.field_C, false);
          MouseInput.field_k = fg.a("", "Scenery_21", DequeWidgetContainer.field_C, false);
          lc.field_b = fg.a("", "Scenery_22", DequeWidgetContainer.field_C, false);
          rb.field_y = fg.a("", "Scenery_23", DequeWidgetContainer.field_C, false);
          FullscreenFocusCanvas.field_h = fg.a("", "Scenery_24", DequeWidgetContainer.field_C, false);
          KeyboardInput.field_j = fg.a("", "Scenery_25", DequeWidgetContainer.field_C, false);
          ImageProducerRasterBuffer.field_o = fg.a("", "Scenery_26", DequeWidgetContainer.field_C, false);
          AwtRasterBuffer.field_h = fg.a("", "Scenery_27", DequeWidgetContainer.field_C, false);
          MusicPatchEnvelope.field_j = fg.a("", "Scenery_28", DequeWidgetContainer.field_C, false);
          ProgressDialog.field_hb = fg.a("", "Scenery_29", DequeWidgetContainer.field_C, false);
          CipherPacketBuffer.field_w = fg.a("", "Scenery_30", DequeWidgetContainer.field_C, false);
          e.field_d = fg.a("", "Scenery_31", DequeWidgetContainer.field_C, false);
          EditableTextField.field_S = fg.a("", "Scenery_32", DequeWidgetContainer.field_C, false);
          f.field_d = fg.a("", "Scenery_33", DequeWidgetContainer.field_C, false);
          GameCanvas.field_h = fg.a("", "Scenery_34", DequeWidgetContainer.field_C, false);
          ki.field_b = fg.a("", "Scenery_35", DequeWidgetContainer.field_C, false);
          LabeledWidgetContainer.field_C = fg.a("", "Scenery_36", DequeWidgetContainer.field_C, false);
          ResizableModalDialog.field_W = fg.a("", "explosive_crate_e_tga", DequeWidgetContainer.field_C, false);
          IsaacGenerator.field_c = fg.a("", "explosive_crate_n_tga", DequeWidgetContainer.field_C, false);
          ProxySocketFactory.field_f = fg.a("", "explosive_crate_s_tga", DequeWidgetContainer.field_C, false);
          oa.field_e = fg.a("", "explosive_crate_w_tga", DequeWidgetContainer.field_C, false);
          FullscreenFocusCanvas.field_f = fg.a("", "health_big_tga", DequeWidgetContainer.field_C, false);
          ia.field_e = fg.a("", "health_sm_tga", DequeWidgetContainer.field_C, false);
          SecondaryNodeDequeIterator.field_f = fg.a("", "Scenery_37", DequeWidgetContainer.field_C, false);
          gf.field_a = fg.a("", "Scenery_38", DequeWidgetContainer.field_C, false);
          bl.field_c = fg.a("", "Scenery_39", DequeWidgetContainer.field_C, false);
          u.field_h = fg.a("", "Scenery_40", DequeWidgetContainer.field_C, false);
          vj.field_p = fg.a("", "Scenery_41", DequeWidgetContainer.field_C, false);
          ea.field_e = fg.a("", "Scenery_42", DequeWidgetContainer.field_C, false);
          tc.field_b = fg.a("", "Scenery_43", DequeWidgetContainer.field_C, false);
          NodeHashTableIterator.field_d = fg.a("", "Scenery_44", DequeWidgetContainer.field_C, false);
          km.field_z = fg.a("", "Scenery_45", DequeWidgetContainer.field_C, false);
          ProxyAuthenticationRequiredException.field_a = fg.a("", "Scenery_46", DequeWidgetContainer.field_C, false);
          GameCanvas.field_k = fg.a("", "Scenery_47", DequeWidgetContainer.field_C, false);
          jc.field_a = fg.a("", "Scenery_48", DequeWidgetContainer.field_C, false);
          hm.field_l = fg.a("", "Scenery_49", DequeWidgetContainer.field_C, false);
          q.field_c = fg.a("", "Scenery_50", DequeWidgetContainer.field_C, false);
          GrowableIntArray.field_a = fg.a("", "Scenery_51", DequeWidgetContainer.field_C, false);
          sj.field_g = fg.a("", "Scenery_52", DequeWidgetContainer.field_C, false);
          vf.field_H = fg.a("", "Scenery_53", DequeWidgetContainer.field_C, false);
          nd.field_a = fg.a("", "Scenery_54", DequeWidgetContainer.field_C, false);
          ProxySocketFactory.field_l = fg.a("", "Scenery_55", DequeWidgetContainer.field_C, false);
          lh.field_e = fg.a("", "Scenery_56", DequeWidgetContainer.field_C, false);
          vg.field_d = fg.a("", "Scenery_57", DequeWidgetContainer.field_C, false);
          DualLinkDeque.field_b = fg.a("", "Scenery_58", DequeWidgetContainer.field_C, false);
          EditableTextField.field_R = fg.a("", "Scenery_59", DequeWidgetContainer.field_C, false);
          ic.field_k = fg.a("", "Scenery_60", DequeWidgetContainer.field_C, false);
          eb.field_b = fg.a("", "Scenery_61", DequeWidgetContainer.field_C, false);
          DefaultTextWidgetRenderer.field_h = fg.a("", "Scenery_62", DequeWidgetContainer.field_C, false);
          FullscreenStatusDialog.field_cb = fg.a("", "Scenery_63", DequeWidgetContainer.field_C, false);
          SocketFactory.field_c = fg.a("", "Scenery_64", DequeWidgetContainer.field_C, false);
          qg.field_m = fg.a("", "Scenery_65", DequeWidgetContainer.field_C, false);
          SpriteGeometry.field_B = fg.a("", "Scenery_66", DequeWidgetContainer.field_C, false);
          AgeValidator.field_p = fg.a("", "Scenery_67", DequeWidgetContainer.field_C, false);
          DraggableWidgetContainer.field_N = fg.a("", "Scenery_68", DequeWidgetContainer.field_C, false);
          BufferedSocket.field_f = fg.a("", "Scenery_69", DequeWidgetContainer.field_C, false);
          dd.field_j = fg.a("", "Scenery_70", DequeWidgetContainer.field_C, false);
          Bzip2State.field_C = fg.a("", "Scenery_71", DequeWidgetContainer.field_C, false);
          tb.field_L = fg.a("", "Scenery_72", DequeWidgetContainer.field_C, false);
          wd.field_b = fg.a("", "Scenery_73", DequeWidgetContainer.field_C, false);
          ub.field_c = fg.a("", "Scenery_74", DequeWidgetContainer.field_C, false);
          fa.field_e = fg.a("", "Scenery_75", DequeWidgetContainer.field_C, false);
          ej.field_d = fg.a("", "Scenery_76", DequeWidgetContainer.field_C, false);
          MouseInput.field_l = fg.a("", "Scenery_77", DequeWidgetContainer.field_C, false);
          ng.field_i = fg.a("", "Scenery_78", DequeWidgetContainer.field_C, false);
          mn.field_b = fg.a("", "Scenery_79", DequeWidgetContainer.field_C, false);
          ln.field_c = fg.a("", "Scenery_80", DequeWidgetContainer.field_C, false);
          hh.field_b = fg.a("", "Scenery_81", DequeWidgetContainer.field_C, false);
          bm.field_f = fg.a("", "reactor_tga", DequeWidgetContainer.field_C, false);
          ca.field_b = fg.a("", "reactor_damaged_tga", DequeWidgetContainer.field_C, false);
          PacketBuffer.field_k = fg.a("", "shuttle_tga", DequeWidgetContainer.field_C, false);
          sc.field_a = MouseInput.a("", param0 ^ 13124, "shield_module", DequeWidgetContainer.field_C);
          qm.field_P = fg.a("", "explosive_charge", DequeWidgetContainer.field_C, false);
          MouseInput.a("", -21, "cloak_module", DequeWidgetContainer.field_C);
          e.field_r = MouseInput.a("", -78, "invulnerability_module", DequeWidgetContainer.field_C);
          KeyboardInput.field_h = MouseInput.a("", param0 ^ 13130, "explosive_shells", DequeWidgetContainer.field_C);
          qh.field_l = MouseInput.a("", 120, "fusion_power", DequeWidgetContainer.field_C);
          mg.field_b = MouseInput.a("", -67, "incendiary_rockets", DequeWidgetContainer.field_C);
          BufferedRandomAccessFile.field_l = MouseInput.a("", 111, "plasma_fire", DequeWidgetContainer.field_C);
          if (param0 != 13119) {
            return;
          }
          aa.field_b = MouseInput.a("", -48, "powered_boots", DequeWidgetContainer.field_C);
          KeyboardInput.field_f = fg.a("", "security_pass", DequeWidgetContainer.field_C, false);
          im.field_a = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "doors_hammerhead");
          ak.field_a = MouseInput.a("", -116, "door_twiddles_hammerhead_h", DequeWidgetContainer.field_C);
          an.field_d = MouseInput.a("", 125, "door_twiddles_hammerhead_v", DequeWidgetContainer.field_C);
          jd.field_o = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "doors_planet");
          TextLayout.field_a = MouseInput.a("", 118, "door_twiddles_planet_h", DequeWidgetContainer.field_C);
          r.field_c = MouseInput.a("", 125, "door_twiddles_planet_v", DequeWidgetContainer.field_C);
          th.field_Hb = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "doors_station");
          qa.field_c = MouseInput.a("", param0 - 13003, "door_twiddles_station_h", DequeWidgetContainer.field_C);
          IsaacGenerator.field_d = MouseInput.a("", -86, "door_twiddles_station_v", DequeWidgetContainer.field_C);
          ri.field_k = fg.a("", "Scenery_82", DequeWidgetContainer.field_C, false);
          MouseInput.field_g = fg.a("", "Scenery_83", DequeWidgetContainer.field_C, false);
          ImageProducerRasterBuffer.field_n = fg.a("", "Scenery_84", DequeWidgetContainer.field_C, false);
          mj.field_a = fg.a("", "Scenery_85", DequeWidgetContainer.field_C, false);
          mg.field_f = fg.a("", "Scenery_86", DequeWidgetContainer.field_C, false);
          le.field_xb = fg.a("", "Scenery_87", DequeWidgetContainer.field_C, false);
          DiskArchiveRequest.field_C = fg.a("", "Scenery_88", DequeWidgetContainer.field_C, false);
          DiskArchiveRequest.field_z = fg.a("", "Scenery_89", DequeWidgetContainer.field_C, false);
          FrameTimer.field_d = fg.a("", "Scenery_90", DequeWidgetContainer.field_C, false);
          IsaacGenerator.field_j = MouseInput.a("", param0 ^ -13180, "Scenery_91", DequeWidgetContainer.field_C);
          ln.field_g = MouseInput.a("", -91, "Scenery_92", DequeWidgetContainer.field_C);
          MatchingFieldValidator.field_y = fg.a("", "Scenery_93", DequeWidgetContainer.field_C, false);
          kc.field_d = fg.a("", "Scenery_94", DequeWidgetContainer.field_C, false);
          sj.field_b = fg.a("", "Scenery_95", DequeWidgetContainer.field_C, false);
          AccountNameAvailabilityValidator.field_q = fg.a("", "Scenery_96", DequeWidgetContainer.field_C, false);
          ml.field_a = fg.a("", "Scenery_97", DequeWidgetContainer.field_C, false);
          p.field_d = MouseInput.a("", -33, "Scenery_98", DequeWidgetContainer.field_C);
          wk.field_a = fg.a("", "Scenery_99", DequeWidgetContainer.field_C, false);
          ByteArrayPoolSupport.field_e = fg.a("", "Scenery_100", DequeWidgetContainer.field_C, false);
          ResourceArchive.field_l = MouseInput.a("", 110, "Scenery_101", DequeWidgetContainer.field_C);
          wh.field_e = MouseInput.a("", 120, "bend_a_1", DequeWidgetContainer.field_C);
          wi.field_e = MouseInput.a("", param0 ^ 13138, "bend_b_2", DequeWidgetContainer.field_C);
          MusicPatchPcmStream.field_r = MouseInput.a("", 123, "corner_c_1", DequeWidgetContainer.field_C);
          id.field_w = MouseInput.a("", param0 ^ 13121, "corner_c_2", DequeWidgetContainer.field_C);
          AgeValidator.field_o = MouseInput.a("", param0 ^ -13139, "corner_c_3", DequeWidgetContainer.field_C);
          la.field_e = MouseInput.a("", 24, "corner_d_4", DequeWidgetContainer.field_C);
          bb.field_a = MouseInput.a("", param0 - 13007, "diagonal_d_1", DequeWidgetContainer.field_C);
          qg.field_i = MouseInput.a("", param0 - 13121, "diagonal_d_2", DequeWidgetContainer.field_C);
          oa.field_i = MouseInput.a("", -46, "diagonal_d_3", DequeWidgetContainer.field_C);
          ByteArrayPoolSupport.field_j = MouseInput.a("", -112, "Scenery_103", DequeWidgetContainer.field_C);
          sd.field_t = fg.a("", "Scenery_107", DequeWidgetContainer.field_C, false);
          vb.field_Lb = fg.a("", "Scenery_108", DequeWidgetContainer.field_C, false);
          uh.field_f = fg.a("", "Scenery_109", DequeWidgetContainer.field_C, false);
          qh.field_g = fg.a("", "Scenery_110", DequeWidgetContainer.field_C, false);
          DelayedPacket.field_m = fg.a("", "Scenery_111", DequeWidgetContainer.field_C, false);
          j.field_a = fg.a("", "Scenery_112", DequeWidgetContainer.field_C, false);
          vk.field_p = fg.a("", "Scenery_113", DequeWidgetContainer.field_C, false);
          ArchiveIndex.field_e = fg.a("", "Scenery_114", DequeWidgetContainer.field_C, false);
          DualLinkDeque.field_c = MouseInput.a("", 1, "Scenery_115", DequeWidgetContainer.field_C);
          dn.field_h = fg.a("", "Scenery_116", DequeWidgetContainer.field_C, false);
          hj.field_r = fg.a("", "Scenery_117", DequeWidgetContainer.field_C, false);
          pj.field_l = fg.a("", "Scenery_118", DequeWidgetContainer.field_C, false);
          SpriteGeometry.field_q = fg.a("", "Scenery_119", DequeWidgetContainer.field_C, false);
          field_C = fg.a("", "Scenery_120", DequeWidgetContainer.field_C, false);
          rg.field_a = fg.a("", "Scenery_121", DequeWidgetContainer.field_C, false);
          la.field_h = fg.a("", "Scenery_122", DequeWidgetContainer.field_C, false);
          gf.field_d = fg.a("", "Scenery_123", DequeWidgetContainer.field_C, false);
          IntrusiveNodeHashTable.field_a = fg.a("", "Scenery_124", DequeWidgetContainer.field_C, false);
          GuestPlayConfirmationForm.field_J = fg.a("", "Scenery_125", DequeWidgetContainer.field_C, false);
          AchievementNotification.field_l = fg.a("", "Scenery_126", DequeWidgetContainer.field_C, false);
          uc.field_a = fg.a("", "Scenery_127", DequeWidgetContainer.field_C, false);
          s.field_d = fg.a("", "Scenery_128", DequeWidgetContainer.field_C, false);
          qg.field_g = new RgbSprite[106];
          vb.field_Kb = new RgbSprite[qg.field_g.length];
          var2_int = 0;
          do {
            if (var2_int >= 43) {
              ie.field_b = jd.a((byte) 33, "", DequeWidgetContainer.field_C, "spinning_fans");
              qg.field_g[43] = fg.a("", "tentacles_corner2", DequeWidgetContainer.field_C, false);
              qg.field_g[44] = fg.a("", "tentacles_straight2", DequeWidgetContainer.field_C, false);
              qg.field_g[45] = fg.a("", "tentacles_straight4", DequeWidgetContainer.field_C, false);
              qg.field_g[46] = fg.a("", "tentacles_straight6", DequeWidgetContainer.field_C, false);
              qg.field_g[47] = fg.a("", "tentacles_straight8", DequeWidgetContainer.field_C, false);
              qg.field_g[48] = fg.a("", "tentacles_t_junction2", DequeWidgetContainer.field_C, false);
              qg.field_g[49] = fg.a("", "tentacles_x_junction2", DequeWidgetContainer.field_C, false);
              qg.field_g[50] = fg.a("", "floor_tentacles_fadeleft", DequeWidgetContainer.field_C, false);
              qg.field_g[51] = fg.a("", "floor_tentacles_faderight", DequeWidgetContainer.field_C, false);
              qg.field_g[52] = fg.a("", "floor_tentacles_innercorner3a", DequeWidgetContainer.field_C, false);
              qg.field_g[53] = fg.a("", "floor_tentacles_innercorner5a", DequeWidgetContainer.field_C, false);
              qg.field_g[54] = fg.a("", "floor_tentacles_innerstraight3_2a", DequeWidgetContainer.field_C, false);
              qg.field_g[55] = fg.a("", "floor_tentacles_innerstraight3_3a", DequeWidgetContainer.field_C, false);
              qg.field_g[56] = fg.a("", "floor_tentacles_innerstraight5_3a", DequeWidgetContainer.field_C, false);
              qg.field_g[57] = fg.a("", "floor_tentacles_innerstraight5_4a", DequeWidgetContainer.field_C, false);
              qg.field_g[58] = fg.a("", "floor_tentacles_outercorner3a", DequeWidgetContainer.field_C, false);
              qg.field_g[59] = fg.a("", "floor_tentacles_outercorner5a", DequeWidgetContainer.field_C, false);
              qg.field_g[60] = fg.a("", "floor_tentacles_outerstraight3_2a", DequeWidgetContainer.field_C, false);
              qg.field_g[61] = fg.a("", "floor_tentacles_outerstraight3_3a", DequeWidgetContainer.field_C, false);
              qg.field_g[62] = fg.a("", "floor_tentacles_outerstraight5_3a", DequeWidgetContainer.field_C, false);
              qg.field_g[63] = fg.a("", "floor_tentacles_outerstraight5_4a", DequeWidgetContainer.field_C, false);
              qg.field_g[64] = fg.a("", "floor_tentacles_patch_straight1", DequeWidgetContainer.field_C, false);
              qg.field_g[65] = fg.a("", "floor_tentacles_patch_straight2", DequeWidgetContainer.field_C, false);
              qg.field_g[66] = fg.a("", "floor_tentacles_patch_straight3", DequeWidgetContainer.field_C, false);
              qg.field_g[67] = fg.a("", "floor_tentacles_patch_outercorner1", DequeWidgetContainer.field_C, false);
              qg.field_g[68] = fg.a("", "floor_tentacles_patch_outercorner2", DequeWidgetContainer.field_C, false);
              qg.field_g[69] = fg.a("", "floor_tentacles_patch_innercorner1", DequeWidgetContainer.field_C, false);
              qg.field_g[70] = fg.a("", "floor_tentacles_patch_innercorner2", DequeWidgetContainer.field_C, false);
              qg.field_g[71] = fg.a("", "floor_tentacles_patch_small1", DequeWidgetContainer.field_C, false);
              qg.field_g[72] = fg.a("", "floor_tentacles_patch_small2", DequeWidgetContainer.field_C, false);
              qg.field_g[73] = fg.a("", "floor_tentacles_patch_small3", DequeWidgetContainer.field_C, false);
              qg.field_g[74] = fg.a("", "floor_tentacles_patch_small4", DequeWidgetContainer.field_C, false);
              qg.field_g[75] = fg.a("", "extra_scenery_f5", DequeWidgetContainer.field_C, false);
              qg.field_g[76] = fg.a("", "extra_scenery_f6", DequeWidgetContainer.field_C, false);
              qg.field_g[77] = fg.a("", "scenery_e4", DequeWidgetContainer.field_C, false);
              qg.field_g[78] = fg.a("", "scenery_e5", DequeWidgetContainer.field_C, false);
              qg.field_g[79] = fg.a("", "scenery_e6", DequeWidgetContainer.field_C, false);
              qg.field_g[80] = fg.a("", "scenery_e7", DequeWidgetContainer.field_C, false);
              qg.field_g[81] = fg.a("", "scenery_e8", DequeWidgetContainer.field_C, false);
              qg.field_g[82] = fg.a("", "scenery_e9", DequeWidgetContainer.field_C, false);
              qg.field_g[83] = fg.a("", "scenery_e10", DequeWidgetContainer.field_C, false);
              qg.field_g[84] = fg.a("", "bookshelf1", DequeWidgetContainer.field_C, false);
              qg.field_g[85] = fg.a("", "bookshelf2", DequeWidgetContainer.field_C, false);
              qg.field_g[86] = fg.a("", "bookshelf3", DequeWidgetContainer.field_C, false);
              qg.field_g[87] = fg.a("", "bookshelf4", DequeWidgetContainer.field_C, false);
              qg.field_g[88] = fg.a("", "bookshelf5", DequeWidgetContainer.field_C, false);
              qg.field_g[89] = fg.a("", "bookshelf6", DequeWidgetContainer.field_C, false);
              qg.field_g[90] = fg.a("", "allthatwasleft", DequeWidgetContainer.field_C, false);
              qg.field_g[91] = fg.a("", "bigradialscorch", DequeWidgetContainer.field_C, false);
              qg.field_g[92] = fg.a("", "bloodsplat_green", DequeWidgetContainer.field_C, false);
              qg.field_g[93] = fg.a("", "bloodsplat_red", DequeWidgetContainer.field_C, false);
              qg.field_g[94] = fg.a("", "oilslick1", DequeWidgetContainer.field_C, false);
              qg.field_g[95] = fg.a("", "oilslick2", DequeWidgetContainer.field_C, false);
              qg.field_g[96] = fg.a("", "scorchmark1", DequeWidgetContainer.field_C, false);
              qg.field_g[97] = fg.a("", "skid", DequeWidgetContainer.field_C, false);
              qg.field_g[98] = fg.a("", "smallradialscorch", DequeWidgetContainer.field_C, false);
              qg.field_g[99] = fg.a("", "flightcontrolpanel1", DequeWidgetContainer.field_C, false);
              qg.field_g[100] = fg.a("", "flightcontrolpanel2", DequeWidgetContainer.field_C, false);
              qg.field_g[101] = fg.a("", "flightcontrolpanel3", DequeWidgetContainer.field_C, false);
              qg.field_g[102] = fg.a("", "onebigrock", DequeWidgetContainer.field_C, false);
              qg.field_g[103] = fg.a("", "tinyrocks", DequeWidgetContainer.field_C, false);
              qg.field_g[104] = fg.a("", "tinyrocks2", DequeWidgetContainer.field_C, false);
              qg.field_g[105] = fg.a("", "tinyrocks3", DequeWidgetContainer.field_C, false);
              break;
            }
            qg.field_g[var2_int] = fg.a("", "extra_scenery_" + var2_int, DequeWidgetContainer.field_C, false);
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          while (var2_int < 106) {
            vb.field_Kb[var2_int] = ne.a(qg.field_g[var2_int], (byte) -74);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "HostileSpawn.NA(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        int var1;
        field_K = new int[]{24, 5};
        field_F = false;
        field_E = new int[255];
        for (var0 = 0; 255 > var0; var0++) {
          var1 = (var0 - 128) * 3;
          if (var1 > 255) {
            var1 = 255;
          }
          if (var1 < 0) {
            var1 = 0;
          }
          field_E[var0] = 65792 * var0 + var1;
        }
    }
}
