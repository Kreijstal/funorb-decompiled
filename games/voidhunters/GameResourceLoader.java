/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameResourceLoader implements GameResourceLoaderMarker {
    private ResourceArchive jpegArchive;
    private SoundCache soundCache;
    private ResourceArchive fontMetricsArchive;
    private ResourceArchive graphicsArchive;
    private ResourceArchive patchArchive;
    private ResourceArchive soundEffectArchive;
    private ResourceArchive wordpackArchive;
    private ResourceArchive musicArchive;
    private ResourceArchive quickChatArchive;
    private ResourceArchive textureMetricsArchive;
    private ResourceArchive vorbisArchive;
    private ResourceArchive textureArchive;
    static String defendYourBaseText;

    final void requestResources(byte param0) {
        ComponentCollision.a("Very start of requestdata", (byte) -56);
        if (OpenGlVertexBuffer.field_j != null) {
          AsteroidField.loadLocalizedTextAndKeyBindings((byte) -100, OpenGlVertexBuffer.field_j);
          OpenGlVertexBuffer.field_j = null;
          MidiNote.resetFrameTiming(param0 + 2095);
        }
        AsteroidFieldFactory.field_b = true;
        ComponentCollision.a("common wordpackj", (byte) -102);
        this.wordpackArchive = MissionBuilder.createArchive(param0 + 0, OpenGlGpuRectangleTexture.field_k.field_a);
        ComponentCollision.a("graphicsj", (byte) -103);
        this.graphicsArchive = MissionBuilder.createArchive(param0 + 0, 16);
        ComponentCollision.a("fontmetricsj", (byte) -66);
        this.fontMetricsArchive = MissionBuilder.createArchive(1, 17);
        ComponentCollision.a("jagfxj", (byte) -93);
        this.soundEffectArchive = MissionBuilder.createArchive(param0 + 0, 18);
        ComponentCollision.a("vorbisj", (byte) -64);
        this.vorbisArchive = MissionBuilder.createArchive(1, 19);
        ComponentCollision.a("patchesj", (byte) -106);
        this.patchArchive = MissionBuilder.createArchive(param0 + 0, 20);
        ComponentCollision.a("midij", (byte) -100);
        this.musicArchive = MissionBuilder.createArchive(1, 21);
        ComponentCollision.a("common quickchatj", (byte) -64);
        this.quickChatArchive = MissionBuilder.createArchive(1, GetMachineGunProjectileDamage.field_o.field_a);
        ComponentCollision.a("texturemetricsj", (byte) -108);
        this.textureMetricsArchive = MissionBuilder.createArchive(param0 ^ 0, 24);
        ComponentCollision.a("texturesj", (byte) -91);
        this.textureArchive = MissionBuilder.createArchive(1, 25);
        ComponentCollision.a("jpegj", (byte) -52);
        this.jpegArchive = MissionBuilder.createArchive(param0 ^ 0, 26);
        ResourceArchive var4 = GetMassDriverReload.field_o;
        ResourceArchive var3 = GetShieldsDirectionalArc.field_r;
        ComponentCollision.a("creating request queue", (byte) -84);
        OpenGlGpuTexture3D.field_m = new ArchiveRequestQueue(82);
        ComponentCollision.a("requesting basic common graphics group", (byte) -68);
        OpenGlGpuTexture3D.field_m.enqueueRequest(var4, ConstantMonochromeTextureOperation.field_k, false, "basic", SetTorpedoProjectileOndamageParticles.field_o);
        ComponentCollision.a("requesting common arialish12", (byte) -66);
        OpenGlGpuTexture3D.field_m.enqueueRequest(var4, GetBombletSprayAimarc.field_p, false, "arialish12", TorpedoWeaponDefinition.field_b);
        ComponentCollision.a("requesting common arialish12 fontmetric", (byte) -59);
        OpenGlGpuTexture3D.field_m.enqueueRequest(var3, GetBombletSprayAimarc.field_p, false, "arialish12", TorpedoWeaponDefinition.field_b);
        ComponentCollision.a("requesting common lobbyfont", (byte) -79);
        OpenGlGpuTexture3D.field_m.enqueueRequest(var4, GetBombletSprayAimarc.field_p, false, "lobby", TorpedoWeaponDefinition.field_b);
        ComponentCollision.a("requesting common lobbyfont metric", (byte) -72);
        OpenGlGpuTexture3D.field_m.enqueueRequest(var3, GetBombletSprayAimarc.field_p, false, "lobby", TorpedoWeaponDefinition.field_b);
        ComponentCollision.a("requesting jfx sounds", (byte) -66);
        OpenGlGpuTexture3D.field_m.enqueueRequest(LoadBlackboxRecording.field_r, -1, SetRepairModePower.field_p, this.soundEffectArchive);
        ComponentCollision.a("requesting vorbis sounds", (byte) -53);
        OpenGlGpuTexture3D.field_m.enqueueRequest(LoadBlackboxRecording.field_r, -1, SetRepairModePower.field_p, this.vorbisArchive);
        ComponentCollision.a("requesting patches", (byte) -112);
        OpenGlGpuTexture3D.field_m.enqueueRequest(StripedProgressBar.field_z, param0 ^ -2, GetMissilesCooldown.field_p, this.patchArchive);
        ComponentCollision.a("requesting midis", (byte) -113);
        OpenGlGpuTexture3D.field_m.enqueueRequest(GetBombletSprayProjectiles.field_o, -1, CarouselSlotFactory.field_a, this.musicArchive);
        ComponentCollision.a("requesting basic graphics", (byte) -108);
        if (param0 != 1) {
          this.textureArchive = (ResourceArchive) null;
        }
        OpenGlGpuTexture3D.field_m.enqueueRequest(this.graphicsArchive, ConstantMonochromeTextureOperation.field_k, false, "basic", SetTorpedoProjectileOndamageParticles.field_o);
        ComponentCollision.a("requesting jpeg graphics", (byte) -87);
        OpenGlGpuTexture3D.field_m.enqueueRequest(SetTorpedoProjectileOndamageParticles.field_o, -1, SetTorpedoProjectileOndamageParticles.field_o, this.jpegArchive);
        ComponentCollision.a("requesting font graphics", (byte) -64);
        OpenGlGpuTexture3D.field_m.enqueueRequest(this.fontMetricsArchive, GetBombletSprayAimarc.field_p, false, "basic", TorpedoWeaponDefinition.field_b);
        ComponentCollision.a("requesting textures", (byte) -107);
        OpenGlGpuTexture3D.field_m.enqueueRequest(GetThrusterParticleSpeedDownshift.field_p, -1, RangeTextureOperation.field_k, this.textureArchive);
        ComponentCollision.a("requesting texturemetrics", (byte) -66);
        OpenGlGpuTexture3D.field_m.enqueueRequest(GetThrusterParticleSpeedDownshift.field_p, -1, RangeTextureOperation.field_k, this.textureMetricsArchive);
        ComponentCollision.a("requesting extradata1", (byte) -94);
        OpenGlGpuTexture3D.field_m.enqueueRequest(lwa.field_vb, -1, SetUseLines.field_q, this.wordpackArchive);
        ComponentCollision.a("requesting extradata2", (byte) -77);
        OpenGlGpuTexture3D.field_m.enqueueRequest(lwa.field_vb, -1, SetUseLines.field_q, this.quickChatArchive);
        ComponentCollision.a("end of requestdata", (byte) -98);
    }

    final boolean unpackResources(byte param0) {
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8;
        ResourceArchive var11;
        ResourceArchive var12;
        Object var3;
        ArchiveTextureProvider var4;
        Sprite[][] var9;
        SoftwareIndexedSprite2D[] var10;
        Sprite[][] var14;
        SoftwareIndexedSprite2D[] var15;
        int[] var16;
        int[] var19;
        var8 = VoidHunters.field_G;
        ComponentCollision.a("Inside unpack", (byte) -111);
        AwardVictoryToTeamActionFactory.b((byte) -99);
        var11 = GetMassDriverReload.field_o;
        var12 = GetShieldsDirectionalArc.field_r;
        if (this.soundEffectArchive != null &&
          this.vorbisArchive != null) {
          ComponentCollision.a("Unpacking sounds", (byte) -104);
          GetAllowShipSaving.finishLoadingAnimations(4410);
          IncrementVariableAction.a(OpenGlVertexDeclaration.field_e, param0 ^ -69, 82.0f);
          AppletRasterBuffer.field_a.renderGameFrame(param0 - 187);
          this.soundCache = new SoundCache(this.soundEffectArchive, this.vorbisArchive);
          fa.field_d[0] = this.soundCache.getMusicSampleByName("", "vh_menu_mouseover", (byte) 113);
          fa.field_d[1] = this.soundCache.getMusicSampleByName("", "vh_menu_mouseover", (byte) 72);
          fa.field_d[2] = this.soundCache.getMusicSampleByName("", "vh boosters_loop", (byte) 95);
          fa.field_d[3] = this.soundCache.getMusicSampleByName("", "vh plasma ball launch", (byte) 84);
          fa.field_d[4] = this.soundCache.getMusicSampleByName("", "vh attaching parts", (byte) 83);
          fa.field_d[5] = this.soundCache.getMusicSampleByName("", "vh chat recieved", (byte) 61);
          fa.field_d[6] = this.soundCache.getMusicSampleByName("", "vh click button off", (byte) 69);
          fa.field_d[7] = this.soundCache.getMusicSampleByName("", "vh click button on", (byte) 115);
          fa.field_d[8] = this.soundCache.getMusicSampleByName("", "vh detaching parts", (byte) 96);
          fa.field_d[9] = this.soundCache.getMusicSampleByName("", "vh enemy detected", (byte) 92);
          fa.field_d[10] = this.soundCache.getMusicSampleByName("", "vh energy shutdown", (byte) 127);
          fa.field_d[11] = this.soundCache.getMusicSampleByName("", "vh grapplinghook attach", (byte) 93);
          fa.field_d[12] = this.soundCache.getMusicSampleByName("", "vh grapplinghook deploy", (byte) 79);
          fa.field_d[13] = this.soundCache.getMusicSampleByName("", "vh grapplinghook detach", (byte) 127);
          fa.field_d[14] = this.soundCache.getMusicSampleByName("", "vh grapplinghook reel-in", (byte) 63);
          fa.field_d[15] = this.soundCache.getMusicSampleByName("", "vh health siren_loop", (byte) 93);
          fa.field_d[16] = this.soundCache.getMusicSampleByName("", "vh low energy", (byte) 64);
          fa.field_d[17] = this.soundCache.getMusicSampleByName("", "vh powerplant_loop", (byte) 89);
          fa.field_d[18] = this.soundCache.getMusicSampleByName("", "vh reloaded", (byte) 90);
          fa.field_d[19] = this.soundCache.getMusicSampleByName("", "vh repair spot1", (byte) 57);
          fa.field_d[20] = this.soundCache.getMusicSampleByName("", "vh repair spot2", (byte) 125);
          fa.field_d[21] = this.soundCache.getMusicSampleByName("", "vh repair spot3", (byte) 106);
          fa.field_d[22] = this.soundCache.getMusicSampleByName("", "vh repair spot4", (byte) 69);
          fa.field_d[23] = this.soundCache.getMusicSampleByName("", "vh repair spot5", (byte) 92);
          fa.field_d[24] = this.soundCache.getMusicSampleByName("", "vh repair spot6", (byte) 50);
          LegacyOpenGlMaterialEffectManager.field_j[19] = 6;
          fa.field_d[25] = this.soundCache.getMusicSampleByName("", "vh shields off", (byte) 102);
          fa.field_d[26] = this.soundCache.getMusicSampleByName("", "vh shields on", (byte) 104);
          fa.field_d[27] = this.soundCache.getMusicSampleByName("", "vh bomblet spray1", (byte) 51);
          fa.field_d[28] = this.soundCache.getMusicSampleByName("", "vh bomblet spray2", (byte) 77);
          fa.field_d[29] = this.soundCache.getMusicSampleByName("", "vh bomblet spray3", (byte) 127);
          fa.field_d[30] = this.soundCache.getMusicSampleByName("", "vh bomblet spray4", (byte) 116);
          LegacyOpenGlMaterialEffectManager.field_j[27] = 4;
          fa.field_d[31] = this.soundCache.getMusicSampleByName("", "vh laser beam1", (byte) 81);
          fa.field_d[32] = this.soundCache.getMusicSampleByName("", "vh laser beam2", (byte) 109);
          fa.field_d[33] = this.soundCache.getMusicSampleByName("", "vh laser beam3", (byte) 95);
          fa.field_d[34] = this.soundCache.getMusicSampleByName("", "vh laser beam4", (byte) 111);
          LegacyOpenGlMaterialEffectManager.field_j[31] = 4;
          fa.field_d[35] = this.soundCache.getMusicSampleByName("", "vh mass driver1", (byte) 118);
          fa.field_d[36] = this.soundCache.getMusicSampleByName("", "vh mass driver2", (byte) 62);
          fa.field_d[37] = this.soundCache.getMusicSampleByName("", "vh mass driver3", (byte) 55);
          fa.field_d[38] = this.soundCache.getMusicSampleByName("", "vh mass driver4", (byte) 76);
          LegacyOpenGlMaterialEffectManager.field_j[35] = 4;
          fa.field_d[39] = this.soundCache.getMusicSampleByName("", "vh missile launcher", (byte) 87);
          fa.field_d[40] = this.soundCache.getMusicSampleByName("", "vh plasma ball_loop", (byte) 121);
          fa.field_d[41] = this.soundCache.getMusicSampleByName("", "vh point defence laser loop", (byte) 98);
          fa.field_d[42] = this.soundCache.getMusicSampleByName("", "vh railed sniper cannon1", (byte) 77);
          fa.field_d[43] = this.soundCache.getMusicSampleByName("", "vh railed sniper cannon2", (byte) 79);
          fa.field_d[44] = this.soundCache.getMusicSampleByName("", "vh railed sniper cannon3", (byte) 87);
          fa.field_d[45] = this.soundCache.getMusicSampleByName("", "vh railed sniper cannon4", (byte) 104);
          LegacyOpenGlMaterialEffectManager.field_j[42] = 4;
          fa.field_d[46] = this.soundCache.getMusicSampleByName("", "vh saw damage_loop", (byte) 49);
          fa.field_d[47] = this.soundCache.getMusicSampleByName("", "vh saw idle_loop", (byte) 82);
          fa.field_d[48] = this.soundCache.getMusicSampleByName("", "vh damage collision1", (byte) 50);
          fa.field_d[49] = this.soundCache.getMusicSampleByName("", "vh damage collision2", (byte) 97);
          fa.field_d[50] = this.soundCache.getMusicSampleByName("", "vh damage collision3", (byte) 126);
          LegacyOpenGlMaterialEffectManager.field_j[48] = 3;
          fa.field_d[51] = this.soundCache.getMusicSampleByName("", "vh missile impact", (byte) 79);
          fa.field_d[52] = this.soundCache.getMusicSampleByName("", "vh nodamage collision1", (byte) 126);
          fa.field_d[53] = this.soundCache.getMusicSampleByName("", "vh nodamage collision2", (byte) 114);
          fa.field_d[54] = this.soundCache.getMusicSampleByName("", "vh nodamage collision3", (byte) 102);
          LegacyOpenGlMaterialEffectManager.field_j[52] = 3;
          fa.field_d[55] = this.soundCache.getMusicSampleByName("", "vh powerplant explosion", (byte) 58);
          fa.field_d[56] = this.soundCache.getMusicSampleByName("", "vh projectile impact 1", (byte) 92);
          fa.field_d[57] = this.soundCache.getMusicSampleByName("", "vh projectile impact 2", (byte) 63);
          fa.field_d[58] = this.soundCache.getMusicSampleByName("", "vh projectile impact 3", (byte) 59);
          fa.field_d[59] = this.soundCache.getMusicSampleByName("", "vh projectile impact 4", (byte) 108);
          LegacyOpenGlMaterialEffectManager.field_j[56] = 4;
          fa.field_d[60] = this.soundCache.getMusicSampleByName("", "vh projectile impact nodamage 1", (byte) 49);
          fa.field_d[61] = this.soundCache.getMusicSampleByName("", "vh projectile impact nodamage 2", (byte) 89);
          fa.field_d[62] = this.soundCache.getMusicSampleByName("", "vh projectile impact nodamage 3", (byte) 52);
          fa.field_d[63] = this.soundCache.getMusicSampleByName("", "vh projectile impact nodamage 4", (byte) 58);
          LegacyOpenGlMaterialEffectManager.field_j[60] = 4;
          fa.field_d[64] = this.soundCache.getMusicSampleByName("", "vh shield impact", (byte) 97);
          fa.field_d[65] = this.soundCache.getMusicSampleByName("", "vh ship component explosion1", (byte) 89);
          fa.field_d[66] = this.soundCache.getMusicSampleByName("", "vh ship component explosion2", (byte) 112);
          fa.field_d[67] = this.soundCache.getMusicSampleByName("", "vh ship component explosion3", (byte) 105);
          LegacyOpenGlMaterialEffectManager.field_j[65] = 3;
          fa.field_d[68] = this.soundCache.getMusicSampleByName("", "vh ship final explosion", (byte) 74);
          fa.field_d[69] = this.soundCache.getMusicSampleByName("", "vh thrusters colour_loop", (byte) 82);
          fa.field_d[70] = this.soundCache.getMusicSampleByName("", "vh laser beam impact_loop", (byte) 60);
          fa.field_d[71] = this.soundCache.getMusicSampleByName("", "vh missile scrambler", (byte) 112);
          fa.field_d[72] = this.soundCache.getMusicSampleByName("", "vh repairmodeloop", (byte) 55);
          fa.field_d[73] = this.soundCache.getMusicSampleByName("", "vh repairmodeloopelectrical", (byte) 120);
          fa.field_d[74] = this.soundCache.getMusicSampleByName("", "vh tractor beam_loop", (byte) 102);
          fa.field_d[75] = this.soundCache.getMusicSampleByName("", "vh menu woosh1", (byte) 96);
          fa.field_d[76] = this.soundCache.getMusicSampleByName("", "vh menu woosh2", (byte) 115);
          fa.field_d[77] = this.soundCache.getMusicSampleByName("", "vh projectile impact rock1", (byte) 97);
          fa.field_d[78] = this.soundCache.getMusicSampleByName("", "vh projectile impact rock2", (byte) 85);
          fa.field_d[79] = this.soundCache.getMusicSampleByName("", "vh projectile impact rock3", (byte) 66);
          fa.field_d[80] = this.soundCache.getMusicSampleByName("", "vh projectile impact rock4", (byte) 60);
          LegacyOpenGlMaterialEffectManager.field_j[77] = 4;
          fa.field_d[81] = this.soundCache.getMusicSampleByName("", "vh missile shot down", (byte) 113);
          fa.field_d[82] = this.soundCache.getMusicSampleByName("", "vh countdown beep", (byte) 89);
          fa.field_d[83] = this.soundCache.getMusicSampleByName("", "vh self destruct arm", (byte) 65);
          fa.field_d[84] = this.soundCache.getMusicSampleByName("", "vh self destruct activated", (byte) 50);
          fa.field_d[85] = this.soundCache.getMusicSampleByName("", "vh self destruct countdown", (byte) 61);
          fa.field_d[86] = this.soundCache.getMusicSampleByName("", "vh missile lock_loop", (byte) 126);
          fa.field_d[87] = this.soundCache.getMusicSampleByName("", "vh_fighter_deployed_1", (byte) 108);
          fa.field_d[88] = this.soundCache.getMusicSampleByName("", "vh_fighter_deployed_2", (byte) 98);
          fa.field_d[89] = this.soundCache.getMusicSampleByName("", "vh_fighter_deployed_3", (byte) 109);
          LegacyOpenGlMaterialEffectManager.field_j[87] = 3;
          fa.field_d[90] = this.soundCache.getMusicSampleByName("", "vh_fighter_hit_1", (byte) 81);
          fa.field_d[91] = this.soundCache.getMusicSampleByName("", "vh_fighter_hit_2", (byte) 65);
          fa.field_d[92] = this.soundCache.getMusicSampleByName("", "vh_fighter_hit_3", (byte) 90);
          fa.field_d[93] = this.soundCache.getMusicSampleByName("", "vh_fighter_hit_4", (byte) 96);
          LegacyOpenGlMaterialEffectManager.field_j[90] = 4;
          fa.field_d[94] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_a_01", (byte) 102);
          fa.field_d[95] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_a_02", (byte) 95);
          fa.field_d[96] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_a_03", (byte) 66);
          fa.field_d[97] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_01", (byte) 90);
          fa.field_d[98] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_02", (byte) 95);
          fa.field_d[99] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_03", (byte) 120);
          fa.field_d[100] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_04", (byte) 63);
          fa.field_d[101] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_05", (byte) 112);
          fa.field_d[102] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_06", (byte) 118);
          fa.field_d[103] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_b_07", (byte) 114);
          fa.field_d[104] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_c_01", (byte) 104);
          fa.field_d[105] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_c_02", (byte) 54);
          fa.field_d[106] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_c_03", (byte) 62);
          fa.field_d[107] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_c_04", (byte) 81);
          fa.field_d[108] = this.soundCache.getMusicSampleByName("", "vh_fighter_chatter_c_05", (byte) 101);
          this.vorbisArchive = null;
          this.soundEffectArchive = null;
          LegacyOpenGlMaterialEffectManager.field_j[94] = 15;
          MidiNote.resetFrameTiming(param0 ^ 2164);
          return false;
        }
        if (null != this.musicArchive) {
          ComponentCollision.a("Unpacking music", (byte) -125);
          IncrementVariableAction.a(GetBloomCoefficientPercentage.field_p, -1, 88.0f);
          AppletRasterBuffer.field_a.renderGameFrame(-103);
          pab.field_k = new MusicTrack[4];
          pab.field_k[0] = MusicTrack.load(this.musicArchive, "", "VH_Title_Music");
          pab.field_k[1] = MusicTrack.load(this.musicArchive, "", "VH_Ingame_Music");
          pab.field_k[2] = MusicTrack.load(this.musicArchive, "", "VH_Jingle_Win");
          pab.field_k[3] = MusicTrack.load(this.musicArchive, "", "VH_Jingle_Lose");
          this.musicArchive = null;
          MidiNote.resetFrameTiming(2096);
          return false;
        }
        if (null != this.patchArchive) {
          ComponentCollision.a("Unpacking patches", (byte) -123);
          for (var4_int = 0; var4_int < 4; var4_int++) {
            if (pab.field_k[var4_int] != null &&
              !GetBurstFireMaxEnergy.field_p.firstStream.loadMusicPatches(this.soundCache, -29476, this.patchArchive, 176400, pab.field_k[var4_int])) {
              MidiNote.resetFrameTiming(param0 ^ 2164);
              return false;
            }
          }
          GetBurstFireMaxEnergy.field_p.firstStream.clearPatchSampleIds(false);
          this.patchArchive = null;
          this.soundCache = null;
          MidiNote.resetFrameTiming(2096);
          return false;
        }
        if (param0 != 68) {
          defendYourBaseText = (String) null;
        }
        if (null != this.fontMetricsArchive &&
          this.jpegArchive != null) {
          ComponentCollision.a("Unpacking graphics", (byte) -113);
          IncrementVariableAction.a(SetAutozoomSpeedDivide.field_o, -1, 90.0f);
          AppletRasterBuffer.field_a.renderGameFrame(-112);
          GrapplingHookFactory.field_a = (BitmapFont) ((Object) GraphicsToolkitSelector.loadSoftwareMonochromeFontByName(var12, "", 0, var11, "arialish12"));
          SetMpSandboxEnemySpawnLimit.field_p = GetFighterBayAimspeed.a(0, "basic", this.graphicsArchive, this.fontMetricsArchive, "antigrav_18_graphics1");
          HslAdjustTextureOperation.a(var12, this.fontMetricsArchive, this.graphicsArchive, (byte) 88, var11);
          ModelData.loadGameSprites(this.jpegArchive, param0 ^ 57, this.graphicsArchive);
          ko.field_e = WorldPoint.a("frame", -124, "basic", this.graphicsArchive);
          ScreenSizeController.field_d = WorldPoint.a("frame_filled", 52, "basic", this.graphicsArchive);
          MidiCrossfadeStream.buttonFrameSprites = WorldPoint.a("button_frame", param0 ^ 21, "basic", this.graphicsArchive);
          SetDebrisGroupColour.field_o = WorldPoint.a("button_raised", -95, "basic", this.graphicsArchive);
          WorldPoint.a("button_depressed", 80, "basic", this.graphicsArchive);
          lo.field_c = SetGrapplingHookRopeBreakLength.a(this.graphicsArchive, true, "basic", "achievements_large");
          OpenGlGpuTexture2D.field_j = SetSniperCannonProjectiles.a(var11, "unachieved", "basic", true);
          WaterNoiseGpuMaterialEffect.field_h = SetSniperCannonProjectiles.a(var11, "orbcoin", "basic", true);
          AlternateNumericLoginCredentials.alignSpriteToFourPixels(OpenGlGpuTexture2D.field_j, 121);
          AlternateNumericLoginCredentials.alignSpriteToFourPixels(WaterNoiseGpuMaterialEffect.field_h, 126);
          kua.field_a = new Sprite(32, 32);
          kua.field_a.setRasterTarget();
          WaterNoiseGpuMaterialEffect.field_h.drawDownscaled(0, 0, 32, 32);
          SetClientSideDragging.field_q.bind((byte) -108);
          WaterNoiseGpuMaterialEffect.field_h = null;
          SetTorpedoProjectileDamage.field_p = new Sprite[ei.field_i.length][];
          var9 = new Sprite[ei.field_i.length][];
          var14 = var9;
          for (var5 = 0; var5 < ei.field_i.length; var5++) {
            SetTorpedoProjectileDamage.field_p[var5] = SetGrapplingHookRopeBreakLength.a(this.graphicsArchive, true, "basic", ei.field_i[var5]);
            var9[var5] = SetTorpedoProjectileDamage.field_p[var5];
          }
          OpenGlClientVertexBuffer.a(18090, false);
          SetComponentBreakingExplosionForceMultiplier.a(MonochromeRowCache.field_j, param0 + 29073);
          var10 = GetExplosionProjectileDamage.a(98, "basic", "extra_crowns", this.graphicsArchive);
          var15 = var10;
          var19 = new int[var10.length];
          for (var7 = 0; var19.length > var7; var7++) {
            var19[var7] = 9;
          }
          cma.a(var12, var14, var19, true, (byte) -127, ResourceNode.field_g, GetBombletSprayRandomness.field_q, NetworkGameClient.field_A, GetDebugLineLife.field_o, 8, SetTorpedoProjectileDamage.field_p, var11, 1, this.quickChatArchive, var15, UiComponent.field_o, DebugSendable.field_d);
          kl.field_c = SetSniperCannonProjectiles.a(this.graphicsArchive, "lobby_game_logo", "basic", true);
          EdgeMagnitudeTextureOperation.b(200, -100);
          SetMissilesExplosionPower.a(var11, param0 - 68, var12);
          SetMomentOfInertiaPredivideDownshift.a(AppletRasterBuffer.field_a, 2141, GetShieldsDirectionalArcParticleSpeedDownshift.field_o, 16777215, 0, 0);
          var3 = null;
          this.fontMetricsArchive = null;
          MidiNote.resetFrameTiming(param0 ^ 2164);
          if (ssa.b(2)) {
            DialogMessagePanel.field_C = new CommandConsole(ConsoleCommandRegistry.a(16), GrapplingHookFactory.field_a, SetTorpedoProjectiles.field_o);
          }
          MidiNote.resetFrameTiming(2096);
          return false;
        }
        if (this.wordpackArchive != null) {
          ComponentCollision.a("Loading huffman wordpack", (byte) -123);
          spb.a((byte) -22, new HuffmanCodec(this.wordpackArchive.fetchNamedFile("huffman", true, "")));
          this.wordpackArchive = null;
          MidiNote.resetFrameTiming(2096);
          return false;
        }
        if (null == DateOfBirthInput.field_x) {
          ComponentCollision.a("Creating textureprovider", (byte) -119);
          var4 = new ArchiveTextureProvider(this.textureMetricsArchive, this.textureArchive, this.graphicsArchive);
          ComponentCollision.a("Creating tk manager", (byte) -80);
          var16 = new int[]{GetMassDriverProjectiles.field_q};
          DateOfBirthInput.field_x = new GraphicsToolkitSelector(var4, GetFighterRepairAmount.createBackendOptions(var16, param0 - 66));
          ComponentCollision.a("Finished creating tk manager", (byte) -109);
        }
        if (DateOfBirthInput.field_x.context == null) {
          return false;
        }
        return true;
    }

    public static void clearSharedReferences(int param0) {
        defendYourBaseText = null;
        int var1 = -13 / ((59 - param0) / 48);
    }

    final static void fillRasterRectangle(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param3 >= OpenGlTexture3D.field_j &&
          GetCountermeasureLauncherProjectiles.field_o >= param4 &&
          NebulaField.field_c <= param2 &&
          param1 <= EnvironmentReflectionGpuMaterialEffect.field_i) {
          CarouselPlayerInfoFactory.fillRasterRectangleUnchecked(param3, param4, param2, 112, param0, param1);
        } else {
          MidiChannelLevels.fillRasterRectangleClipped(-3518, param0, param1, param2, param4, param3);
        }
        if (param5 >= -1) {
          defendYourBaseText = (String) null;
        }
    }

    static {
        defendYourBaseText = "Defend your base";
    }
}
